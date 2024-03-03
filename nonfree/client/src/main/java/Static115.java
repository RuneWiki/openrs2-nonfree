import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 28)
	public static void method2400() {
		Static187.method3646(Class243.aClass161_14);
		Static121.anInt2455++;
		if (Class2_Sub3_Sub30.aBoolean403 && Class2_Sub3_Sub26.aBoolean377) {
			@Pc(26) int local26 = Static210.aClass119_1.method3305();
			@Pc(30) int local30 = Static210.aClass119_1.method3314();
			local26 -= Class15_Sub1.anInt530;
			local30 -= Class251.anInt7215;
			if (local26 < Class3_Sub1.anInt88) {
				local26 = Class3_Sub1.anInt88;
			}
			if (local30 < Class2_Sub13.anInt2108) {
				local30 = Class2_Sub13.anInt2108;
			}
			if (Class243.aClass161_14.anInt4242 + local26 > Class2_Sub3_Sub30.aClass161_13.anInt4242 + Class3_Sub1.anInt88) {
				local26 = Class2_Sub3_Sub30.aClass161_13.anInt4242 + Class3_Sub1.anInt88 - Class243.aClass161_14.anInt4242;
			}
			if (local30 + Class243.aClass161_14.anInt4255 > Class2_Sub13.anInt2108 + Class2_Sub3_Sub30.aClass161_13.anInt4255) {
				local30 = Class2_Sub3_Sub30.aClass161_13.anInt4255 + Class2_Sub13.anInt2108 - Class243.aClass161_14.anInt4255;
			}
			@Pc(105) int local105 = local26 + Class2_Sub3_Sub30.aClass161_13.anInt4252 - Class3_Sub1.anInt88;
			@Pc(113) int local113 = local30 + Class2_Sub3_Sub30.aClass161_13.anInt4253 - Class2_Sub13.anInt2108;
			@Pc(128) Class2_Sub13 local128;
			if (Static210.aClass119_1.method3306()) {
				if (Class243.aClass161_14.anInt4264 < Static121.anInt2455) {
					@Pc(205) int local205 = local26 - Class2_Sub3.anInt7235;
					@Pc(210) int local210 = local30 - Class2_Sub2_Sub1.anInt61;
					if (Class243.aClass161_14.anInt4233 < local205 || -Class243.aClass161_14.anInt4233 > local205 || local210 > Class243.aClass161_14.anInt4233 || local210 < -Class243.aClass161_14.anInt4233) {
						Class45.aBoolean124 = true;
					}
				}
				if (Class243.aClass161_14.anObjectArray31 != null && Class45.aBoolean124) {
					local128 = new Class2_Sub13();
					local128.anInt2114 = local113;
					local128.aClass161_3 = Class243.aClass161_14;
					local128.anObjectArray4 = Class243.aClass161_14.anObjectArray31;
					local128.anInt2113 = local105;
					Static185.method3592(local128);
				}
			} else {
				if (Class45.aBoolean124) {
					Static193.method3700();
					if (Class243.aClass161_14.anObjectArray8 != null) {
						local128 = new Class2_Sub13();
						local128.anInt2113 = local105;
						local128.aClass161_4 = Class127.aClass161_7;
						local128.aClass161_3 = Class243.aClass161_14;
						local128.anObjectArray4 = Class243.aClass161_14.anObjectArray8;
						local128.anInt2114 = local113;
						Static185.method3592(local128);
					}
					if (Class127.aClass161_7 != null && Static42.method1415(Class243.aClass161_14) != null) {
						Static272.method5097(Class127.aClass161_7, Class243.aClass161_14);
					}
				} else if ((Class160.anInt4082 == 1 || Static194.method3711()) && Class2_Sub3_Sub24.anInt4949 > 2) {
					Static134.method2681(Class251.anInt7215 + Class2_Sub2_Sub1.anInt61, Class2_Sub3.anInt7235 + Class15_Sub1.anInt530);
				} else if (Static248.method4556()) {
					Static134.method2681(Class251.anInt7215 + Class2_Sub2_Sub1.anInt61, Class2_Sub3.anInt7235 + Class15_Sub1.anInt530);
				}
				Class243.aClass161_14 = null;
			}
		} else if (Static121.anInt2455 > 1) {
			Class243.aClass161_14 = null;
		}
	}
}
