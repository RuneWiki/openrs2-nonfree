import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public static int anInt590 = -1;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	public static int anInt592 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!l;Lclient!qa;)V")
	public static void method577(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class167 arg1) {
		if (Static211.aClass3_Sub3_Sub13_2 == null) {
			return;
		}
		if (Static264.anInt4384 < 10) {
			if (!Static211.aClass250_8.method5810(Static211.aClass3_Sub3_Sub13_2.aString44)) {
				Static264.anInt4384 = Static171.aClass250_49.method5803(Static211.aClass3_Sub3_Sub13_2.aString44) / 10;
				return;
			}
			Static7.method1785();
			Static264.anInt4384 = 10;
		}
		if (Static264.anInt4384 == 10) {
			Static211.anInt278 = Static211.aClass3_Sub3_Sub13_2.anInt3500 >> 6 << 6;
			Static211.anInt276 = Static211.aClass3_Sub3_Sub13_2.anInt3496 >> 6 << 6;
			Static211.anInt277 = (Static211.aClass3_Sub3_Sub13_2.anInt3503 >> 6 << 6) + 64 - Static211.anInt276;
			Static211.anInt273 = (Static211.aClass3_Sub3_Sub13_2.anInt3494 >> 6 << 6) + 64 - Static211.anInt278;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static211.aClass3_Sub3_Sub13_2.method3004(local75, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101, (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7) + Static49.anInt873, (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7) + Static59.anInt1127)) {
				local77 = local75[1] - Static211.anInt278;
				local79 = local75[2] - Static211.anInt276;
			}
			if (!Static22.aBoolean21 && local77 >= 0 && Static211.anInt273 > local77 && local79 >= 0 && Static211.anInt277 > local79) {
				local79 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static436.anInt7297 = local79;
				Static34.anInt3343 = local77;
			} else if (Static167.anInt3017 == -1 || Static368.anInt6236 == -1) {
				Static211.aClass3_Sub3_Sub13_2.method3008(Static211.aClass3_Sub3_Sub13_2.anInt3497 & 0x3FFF, Static211.aClass3_Sub3_Sub13_2.anInt3497 >> 14 & 0x3FFF, local75);
				Static436.anInt7297 = local75[2] - Static211.anInt276;
				Static34.anInt3343 = local75[1] - Static211.anInt278;
			} else {
				Static211.aClass3_Sub3_Sub13_2.method3008(Static368.anInt6236, Static167.anInt3017, local75);
				Static22.aBoolean21 = false;
				if (local75 != null) {
					Static34.anInt3343 = local75[1] - Static211.anInt278;
					Static436.anInt7297 = local75[2] - Static211.anInt276;
				}
				Static368.anInt6236 = -1;
				Static167.anInt3017 = -1;
			}
			if (Static211.aClass3_Sub3_Sub13_2.anInt3502 == 37) {
				Static211.aFloat3 = 3.0F;
				Static211.aFloat4 = 3.0F;
			} else if (Static211.aClass3_Sub3_Sub13_2.anInt3502 == 50) {
				Static211.aFloat3 = 4.0F;
				Static211.aFloat4 = 4.0F;
			} else if (Static211.aClass3_Sub3_Sub13_2.anInt3502 == 75) {
				Static211.aFloat3 = 6.0F;
				Static211.aFloat4 = 6.0F;
			} else if (Static211.aClass3_Sub3_Sub13_2.anInt3502 == 100) {
				Static211.aFloat3 = 8.0F;
				Static211.aFloat4 = 8.0F;
			} else if (Static211.aClass3_Sub3_Sub13_2.anInt3502 == 200) {
				Static211.aFloat3 = 16.0F;
				Static211.aFloat4 = 16.0F;
			} else {
				Static211.aFloat3 = 8.0F;
				Static211.aFloat4 = 8.0F;
			}
			Static211.anInt266 = (int) Static211.aFloat3 >> 1;
			Static211.aByteArrayArrayArray3 = Static184.method2900(Static211.anInt266);
			Static368.method5132();
			Static211.method311();
			Static107.aClass193_23 = new Class193();
			Static211.anInt264 += (int) (Math.random() * 5.0D) - 2;
			if (Static211.anInt264 < -8) {
				Static211.anInt264 = -8;
			}
			Static211.anInt265 += (int) (Math.random() * 5.0D) - 2;
			if (Static211.anInt264 > 8) {
				Static211.anInt264 = 8;
			}
			if (Static211.anInt265 < -16) {
				Static211.anInt265 = -16;
			}
			if (Static211.anInt265 > 16) {
				Static211.anInt265 = 16;
			}
			Static211.method296(arg0, Static211.anInt264 >> 2 << 10, Static211.anInt265 >> 1);
			Static211.aClass45_2.method1254(1024, 256);
			Static211.aClass182_2.method4367(256, 256);
			Static211.aClass149_3.method3570(4096);
			Static256.aClass112_1.method2858(256);
			Static264.anInt4384 = 20;
		} else if (Static264.anInt4384 == 20) {
			Static412.method5682(true);
			Static211.method312(arg1, Static211.anInt264, Static211.anInt265);
			Static264.anInt4384 = 60;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 60) {
			if (Static211.aClass250_8.method5811(Static211.aClass3_Sub3_Sub13_2.aString44 + "_staticelements")) {
				if (!Static211.aClass250_8.method5810(Static211.aClass3_Sub3_Sub13_2.aString44 + "_staticelements")) {
					return;
				}
				Static211.aClass118_2 = Static32.method582(Static211.aClass250_8, Static182.aBoolean253, Static211.aClass3_Sub3_Sub13_2.aString44 + "_staticelements");
			} else {
				Static211.aClass118_2 = new Class118(0);
			}
			Static211.method291();
			Static264.anInt4384 = 70;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 70) {
			Static59.aClass93_2 = new Class93(arg1, 11, true, Static151.aCanvas2);
			Static264.anInt4384 = 73;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 73) {
			Static251.aClass93_10 = new Class93(arg1, 12, true, Static151.aCanvas2);
			Static264.anInt4384 = 76;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 76) {
			Static358.aClass93_7 = new Class93(arg1, 14, true, Static151.aCanvas2);
			Static264.anInt4384 = 79;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 79) {
			Static359.aClass93_8 = new Class93(arg1, 17, true, Static151.aCanvas2);
			Static264.anInt4384 = 82;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 82) {
			Static160.aClass93_5 = new Class93(arg1, 19, true, Static151.aCanvas2);
			Static264.anInt4384 = 85;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 85) {
			Static376.aClass93_9 = new Class93(arg1, 22, true, Static151.aCanvas2);
			Static264.anInt4384 = 88;
			Static412.method5682(true);
			Static152.method6186();
		} else if (Static264.anInt4384 == 88) {
			Static13.aClass93_1 = new Class93(arg1, 26, true, Static151.aCanvas2);
			Static264.anInt4384 = 91;
			Static412.method5682(true);
			Static152.method6186();
		} else {
			Static308.aClass93_6 = new Class93(arg1, 30, true, Static151.aCanvas2);
			Static264.anInt4384 = 100;
			Static412.method5682(true);
			Static152.method6186();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static56.method1100(0, arg3, arg0, arg4, arg5, arg2, arg1);
	}
}
