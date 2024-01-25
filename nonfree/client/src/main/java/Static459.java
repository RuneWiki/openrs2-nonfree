import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)I")
	public static int method7363(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ha;Lclient!d;I)V")
	public static void method7365(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Interface3 arg1) {
		if (Static331.aClass2_Sub1_Sub9_3 == null) {
			return;
		}
		if (Static95.anInt1689 < 10) {
			if (!Static331.aClass124_124.method3612(Static331.aClass2_Sub1_Sub9_3.aString63)) {
				Static95.anInt1689 = Static480.aClass124_102.method3642(Static331.aClass2_Sub1_Sub9_3.aString63) / 10;
				return;
			}
			Static423.method6955();
			Static95.anInt1689 = 10;
		}
		if (Static95.anInt1689 == 10) {
			Static331.anInt10590 = Static331.aClass2_Sub1_Sub9_3.anInt5166 >> 6 << 6;
			Static331.anInt10589 = Static331.aClass2_Sub1_Sub9_3.anInt5175 >> 6 << 6;
			Static331.anInt10594 = (Static331.aClass2_Sub1_Sub9_3.anInt5168 >> 6 << 6) + 64 - Static331.anInt10590;
			Static331.anInt10587 = (Static331.aClass2_Sub1_Sub9_3.anInt5172 >> 6 << 6) - (Static331.anInt10589 - 64);
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static331.aClass2_Sub1_Sub9_3.method4703(Static490.anInt8763 + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9), Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, local77, (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9) + Static640.anInt11085)) {
				local79 = local77[1] - Static331.anInt10589;
				local81 = local77[2] - Static331.anInt10590;
			}
			if (!Static161.aBoolean258 && local79 >= 0 && Static331.anInt10587 > local79 && local81 >= 0 && local81 < Static331.anInt10594) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static609.anInt10718 = local81;
				Static43.anInt8888 = local79;
			} else if (Static93.anInt10961 == -1 || Static205.anInt4280 == -1) {
				Static331.aClass2_Sub1_Sub9_3.method4706(Static331.aClass2_Sub1_Sub9_3.anInt5174 >> 14 & 0x3FFF, local77, Static331.aClass2_Sub1_Sub9_3.anInt5174 & 0x3FFF);
				Static609.anInt10718 = local77[2] - Static331.anInt10590;
				Static43.anInt8888 = local77[1] - Static331.anInt10589;
			} else {
				Static331.aClass2_Sub1_Sub9_3.method4706(Static93.anInt10961, local77, Static205.anInt4280);
				Static205.anInt4280 = -1;
				Static93.anInt10961 = -1;
				if (local77 != null) {
					Static43.anInt8888 = local77[1] - Static331.anInt10589;
					Static609.anInt10718 = local77[2] - Static331.anInt10590;
				}
				Static161.aBoolean258 = false;
			}
			if (Static331.aClass2_Sub1_Sub9_3.anInt5177 == 37) {
				Static331.aFloat187 = 3.0F;
				Static331.aFloat188 = 3.0F;
			} else if (Static331.aClass2_Sub1_Sub9_3.anInt5177 == 50) {
				Static331.aFloat187 = 4.0F;
				Static331.aFloat188 = 4.0F;
			} else if (Static331.aClass2_Sub1_Sub9_3.anInt5177 == 75) {
				Static331.aFloat187 = 6.0F;
				Static331.aFloat188 = 6.0F;
			} else if (Static331.aClass2_Sub1_Sub9_3.anInt5177 == 100) {
				Static331.aFloat187 = 8.0F;
				Static331.aFloat188 = 8.0F;
			} else if (Static331.aClass2_Sub1_Sub9_3.anInt5177 == 200) {
				Static331.aFloat187 = 16.0F;
				Static331.aFloat188 = 16.0F;
			} else {
				Static331.aFloat187 = 8.0F;
				Static331.aFloat188 = 8.0F;
			}
			Static331.anInt10581 = (int) Static331.aFloat187 >> 1;
			Static331.aByteArrayArrayArray19 = Static349.method6050(Static331.anInt10581);
			Static366.method6212();
			Static331.method9080();
			Class15_Sub3_Sub3_Sub2.lb = new Class271();
			Static331.anInt10582 += (int) (Math.random() * 5.0D) - 2;
			if (Static331.anInt10582 < -8) {
				Static331.anInt10582 = -8;
			}
			if (Static331.anInt10582 > 8) {
				Static331.anInt10582 = 8;
			}
			Static331.anInt10583 += (int) (Math.random() * 5.0D) - 2;
			if (Static331.anInt10583 < -16) {
				Static331.anInt10583 = -16;
			}
			if (Static331.anInt10583 > 16) {
				Static331.anInt10583 = 16;
			}
			Static331.method9079(arg1, Static331.anInt10582 >> 2 << 10, Static331.anInt10583 >> 1);
			Static331.aClass5_4.method96(256, 1024);
			Static331.aClass353_4.method8897(256, 256);
			Static331.aClass328_4.method8255(4096);
			Static395.aClass140_1.method4037(256);
			Static95.anInt1689 = 20;
		} else if (Static95.anInt1689 == 20) {
			Static67.method1234(true);
			Static331.method9061(arg0, Static331.anInt10582, Static331.anInt10583);
			Static95.anInt1689 = 60;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 60) {
			if (Static331.aClass124_124.method3637(Static331.aClass2_Sub1_Sub9_3.aString63 + "_staticelements")) {
				if (!Static331.aClass124_124.method3612(Static331.aClass2_Sub1_Sub9_3.aString63 + "_staticelements")) {
					return;
				}
				Static331.aClass75_2 = Static201.method3844(Static100.aBoolean97, Static331.aClass124_124, Static331.aClass2_Sub1_Sub9_3.aString63 + "_staticelements");
			} else {
				Static331.aClass75_2 = new Class75(0);
			}
			Static331.method9064();
			Static95.anInt1689 = 70;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 70) {
			Static463.aClass144_5 = new Class144(arg0, 11, true, Static641.aCanvas13);
			Static95.anInt1689 = 73;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 73) {
			Static489.aClass144_7 = new Class144(arg0, 12, true, Static641.aCanvas13);
			Static95.anInt1689 = 76;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 76) {
			Static122.aClass144_1 = new Class144(arg0, 14, true, Static641.aCanvas13);
			Static95.anInt1689 = 79;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 79) {
			Static125.aClass144_2 = new Class144(arg0, 17, true, Static641.aCanvas13);
			Static95.anInt1689 = 82;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 82) {
			Static474.aClass144_6 = new Class144(arg0, 19, true, Static641.aCanvas13);
			Static95.anInt1689 = 85;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 85) {
			Static565.aClass144_8 = new Class144(arg0, 22, true, Static641.aCanvas13);
			Static95.anInt1689 = 88;
			Static67.method1234(true);
			Static149.method2585();
		} else if (Static95.anInt1689 == 88) {
			Static391.aClass144_4 = new Class144(arg0, 26, true, Static641.aCanvas13);
			Static95.anInt1689 = 91;
			Static67.method1234(true);
			Static149.method2585();
		} else {
			Static377.aClass144_3 = new Class144(arg0, 30, true, Static641.aCanvas13);
			Static95.anInt1689 = 100;
			Static67.method1234(true);
			Static149.method2585();
			System.gc();
		}
	}
}
