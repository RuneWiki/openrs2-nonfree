import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
	public static void method2812() throws IOException {
		if (Static413.aClass230_1 == null || Static629.anInt10094 <= 0) {
			return;
		}
		@Pc(7) int local7 = 0;
		while (true) {
			@Pc(12) Class3_Sub14 local12 = (Class3_Sub14) Static265.aClass223_21.method5874();
			if (local12 == null) {
				Static482.anInt8389 += local7;
				Static556.anInt9294 = 0;
				break;
			}
			Static413.aClass230_1.method6030(local12.aClass3_Sub3_Sub2_2.aByteArray54, local12.anInt2268);
			Static629.anInt10094 -= local12.anInt2268;
			local7 += local12.anInt2268;
			local12.method8769();
			local12.aClass3_Sub3_Sub2_2.method4229();
			local12.method2137();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZB)V")
	public static void method2818() {
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub8_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub8_2);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub27_2);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub27_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub22_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub3_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub21_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub7_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub19_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub5_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub9_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub12_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub15_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub20_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub26_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub26_2);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub25_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub4_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub29_1);
		Static294.method4657();
		Static262.aClass3_Sub27_12.method3234(2, Static262.aClass3_Sub27_12.aClass21_Sub17_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub6_1);
		Static128.method2511();
		Static175.method3056();
		Static314.aBoolean418 = true;
	}
}
