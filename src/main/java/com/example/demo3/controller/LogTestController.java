package com.example.demo3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // IoC 대상 + 싱글톤 패턴으로 관리 됨
public class LogTestController {

    // 이 클래스 이름으로 로거를 만듦
    // 로그에는 어느 클래스에서 출력이 되었는가 함께 찍혀 나옴
    private static final Logger log = LoggerFactory.getLogger(LogTestController.class);

    // GET http://localhost:8080/log-test
    @GetMapping("/log-test")
    public String logTest() {
        log.trace("TRACE 레벨 - 가장 자세한 추적");
        log.debug("DEBUG 레벨 - 개발 중 확인용");
        log.info("INFO 레벨 - 일반 실행 정보");
        log.warn("WARN 레벨 - 주의가 필요함");
        log.error("ERROR 레벨 - 오류 발생");
//        System.out.println(""); // 스프링부트에선 sout 권장 *x
        return "서버 컴퓨터의 콘솔을 확인하세요";
    }
}
