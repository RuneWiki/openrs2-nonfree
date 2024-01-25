import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
	public static int anInt1957;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
	public static int anInt1948 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!pfa;Z)V")
	public static void method1824(@OriginalArg(0) Class251 arg0) {
		Static11.aClass251_6 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!e;Lclient!oa;I)V")
	public static void method1826(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class14 arg1) {
		if (Static217.aClass6_Sub2_Sub6_2 == null) {
			return;
		}
		if (Static585.anInt9508 < 10) {
			if (!Static217.aClass251_57.method5753(Static217.aClass6_Sub2_Sub6_2.aString18)) {
				Static585.anInt9508 = Static4.aClass251_4.method5756(Static217.aClass6_Sub2_Sub6_2.aString18) / 10;
				return;
			}
			Static345.method5317();
			Static585.anInt9508 = 10;
		}
		if (Static585.anInt9508 == 10) {
			Static217.anInt3841 = Static217.aClass6_Sub2_Sub6_2.anInt2231 >> 6 << 6;
			Static217.anInt3835 = Static217.aClass6_Sub2_Sub6_2.anInt2234 >> 6 << 6;
			Static217.anInt3839 = (Static217.aClass6_Sub2_Sub6_2.anInt2239 >> 6 << 6) + 64 - Static217.anInt3841;
			Static217.anInt3833 = (Static217.aClass6_Sub2_Sub6_2.anInt2229 >> 6 << 6) + 64 - Static217.anInt3835;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static217.aClass6_Sub2_Sub6_2.method2029(Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108, Static138.anInt3088 + (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9), (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9) + Static39.anInt4952, local77)) {
				local79 = local77[1] - Static217.anInt3835;
				local81 = local77[2] - Static217.anInt3841;
			}
			if (!Static240.aBoolean341 && local79 >= 0 && local79 < Static217.anInt3833 && local81 >= 0 && local81 < Static217.anInt3839) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static39.anInt4953 = local79;
				Static538.anInt8915 = local81;
			} else if (Static580.anInt9453 == -1 || Static456.anInt7860 == -1) {
				Static217.aClass6_Sub2_Sub6_2.method2028(Static217.aClass6_Sub2_Sub6_2.anInt2237 >> 14 & 0x3FFF, local77, Static217.aClass6_Sub2_Sub6_2.anInt2237 & 0x3FFF);
				Static538.anInt8915 = local77[2] - Static217.anInt3841;
				Static39.anInt4953 = local77[1] - Static217.anInt3835;
			} else {
				Static217.aClass6_Sub2_Sub6_2.method2028(Static580.anInt9453, local77, Static456.anInt7860);
				Static240.aBoolean341 = false;
				if (local77 != null) {
					Static538.anInt8915 = local77[2] - Static217.anInt3841;
					Static39.anInt4953 = local77[1] - Static217.anInt3835;
				}
				Static456.anInt7860 = -1;
				Static580.anInt9453 = -1;
			}
			if (Static217.aClass6_Sub2_Sub6_2.anInt2233 == 37) {
				Static217.aFloat73 = 3.0F;
				Static217.aFloat72 = 3.0F;
			} else if (Static217.aClass6_Sub2_Sub6_2.anInt2233 == 50) {
				Static217.aFloat73 = 4.0F;
				Static217.aFloat72 = 4.0F;
			} else if (Static217.aClass6_Sub2_Sub6_2.anInt2233 == 75) {
				Static217.aFloat73 = 6.0F;
				Static217.aFloat72 = 6.0F;
			} else if (Static217.aClass6_Sub2_Sub6_2.anInt2233 == 100) {
				Static217.aFloat73 = 8.0F;
				Static217.aFloat72 = 8.0F;
			} else if (Static217.aClass6_Sub2_Sub6_2.anInt2233 == 200) {
				Static217.aFloat73 = 16.0F;
				Static217.aFloat72 = 16.0F;
			} else {
				Static217.aFloat73 = 8.0F;
				Static217.aFloat72 = 8.0F;
			}
			Static217.anInt3828 = (int) Static217.aFloat73 >> 1;
			Static217.aByteArrayArrayArray18 = Static8.method202(Static217.anInt3828);
			Static125.method7473();
			Static217.method3369();
			Static243.aClass361_38 = new Class361();
			Static217.anInt3829 += (int) (Math.random() * 5.0D) - 2;
			if (Static217.anInt3829 < -8) {
				Static217.anInt3829 = -8;
			}
			if (Static217.anInt3829 > 8) {
				Static217.anInt3829 = 8;
			}
			Static217.anInt3827 += (int) (Math.random() * 5.0D) - 2;
			if (Static217.anInt3827 < -16) {
				Static217.anInt3827 = -16;
			}
			if (Static217.anInt3827 > 16) {
				Static217.anInt3827 = 16;
			}
			Static217.method3371(arg0, Static217.anInt3829 >> 2 << 10, Static217.anInt3827 >> 1);
			Static217.aClass213_2.method5128(1024, 256);
			Static217.aClass3_2.method62(256, 256);
			Static217.aClass307_2.method6637(4096);
			Static183.aClass316_1.method6786(256);
			Static585.anInt9508 = 20;
		} else if (Static585.anInt9508 == 20) {
			Static392.method6486(true);
			Static217.method3370(arg1, Static217.anInt3829, Static217.anInt3827);
			Static585.anInt9508 = 60;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 60) {
			if (Static217.aClass251_57.method5774(Static217.aClass6_Sub2_Sub6_2.aString18 + "_staticelements")) {
				if (!Static217.aClass251_57.method5753(Static217.aClass6_Sub2_Sub6_2.aString18 + "_staticelements")) {
					return;
				}
				Static217.aClass303_2 = Static209.method3707(Static217.aClass251_57, Static217.aClass6_Sub2_Sub6_2.aString18 + "_staticelements", Static448.aBoolean544);
			} else {
				Static217.aClass303_2 = new Class303(0);
			}
			Static217.method3366();
			Static585.anInt9508 = 70;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 70) {
			Static180.aClass168_6 = new Class168(arg1, 11, true, Static32.aCanvas3);
			Static585.anInt9508 = 73;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 73) {
			Static479.aClass168_9 = new Class168(arg1, 12, true, Static32.aCanvas3);
			Static585.anInt9508 = 76;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 76) {
			Static413.aClass168_8 = new Class168(arg1, 14, true, Static32.aCanvas3);
			Static585.anInt9508 = 79;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 79) {
			Static387.aClass168_7 = new Class168(arg1, 17, true, Static32.aCanvas3);
			Static585.anInt9508 = 82;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 82) {
			Static173.aClass168_5 = new Class168(arg1, 19, true, Static32.aCanvas3);
			Static585.anInt9508 = 85;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 85) {
			Static68.aClass168_10 = new Class168(arg1, 22, true, Static32.aCanvas3);
			Static585.anInt9508 = 88;
			Static392.method6486(true);
			Static500.method6767();
		} else if (Static585.anInt9508 == 88) {
			Static40.aClass168_1 = new Class168(arg1, 26, true, Static32.aCanvas3);
			Static585.anInt9508 = 91;
			Static392.method6486(true);
			Static500.method6767();
		} else {
			Static121.aClass168_4 = new Class168(arg1, 30, true, Static32.aCanvas3);
			Static585.anInt9508 = 100;
			Static392.method6486(true);
			Static500.method6767();
			System.gc();
		}
	}
}
