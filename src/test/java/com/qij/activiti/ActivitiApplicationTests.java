package com.qij.activiti;

import org.activiti.engine.ProcessEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivitiApplicationTests {
    @Autowired
    private ProcessEngine processEngine;

    @Test
    void contextLoads() {
    }

}
