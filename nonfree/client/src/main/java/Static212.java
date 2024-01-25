import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Z")
	public static boolean aBoolean354;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	public static int anInt3652;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZII)V")
	public static void method2970(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static66.aClass164_2 = Static347.method5335(arg1, Static341.aClass162_5, Static16.anInterface2_1, Static177.aCanvas3, Static188.aClass135_Sub1_1.anInt3372 * 2);
		} else {
			if (arg0) {
				Static66.aClass164_2 = Static347.method5335(0, Static341.aClass162_5, Static16.anInterface2_1, Static177.aCanvas3, 0);
				Static66.aClass164_2.method5402(0);
				@Pc(37) Class110 local37 = Static286.method4348(Static27.aClass230_8, Static160.anInt2900);
				@Pc(46) Class137 local46 = Static66.aClass164_2.method5352(local37, Static397.method1432(Static145.aClass230_41, Static160.anInt2900));
				Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952), local46, true);
				Static66.aClass164_2.method5404();
				Static191.method2738();
				Static66.aClass164_2.method5320();
			}
			try {
				Static66.aClass164_2 = Static347.method5335(arg1, Static341.aClass162_5, Static16.anInterface2_1, Static177.aCanvas3, Static188.aClass135_Sub1_1.anInt3372 * 2);
			} catch (@Pc(74) Throwable local74) {
				arg1 = 0;
				Static66.aClass164_2 = Static347.method5335(0, Static341.aClass162_5, Static16.anInterface2_1, Static177.aCanvas3, 0);
			}
		}
		if (Static66.aClass164_2.method5336()) {
			@Pc(92) Class1_Sub23 local92 = Static66.aClass164_2.method5318();
			Static66.aClass164_2.method5374(local92);
		}
		Static25.anInt394 = arg1;
		Static118.method1734();
		if (!Static66.aClass164_2.method5389()) {
			Static37.anInt719 = 1;
		}
		Static66.aClass164_2.method5366(Static37.anInt719);
		Static66.aClass164_2.method5377(0);
		Static112.aClass127_3 = Static66.aClass164_2.method5393();
		Static43.aClass127_2 = Static66.aClass164_2.method5393();
		@Pc(122) int local122 = (int) ((double) Static92.anInt1675 * 34.46D);
		if (Static66.aClass164_2.method5309()) {
			local122 += 128;
		}
		Static66.aClass164_2.method5390(50, local122);
		Static66.aClass164_2.method5340(!Static188.aClass135_Sub1_1.aBoolean328);
		if (Static66.aClass164_2.method5341()) {
			Static233.method3208(Static188.aClass135_Sub1_1.aBoolean316);
		}
		Static173.method2546(Static92.anInt1675 >> 3, Static66.aClass164_2, Static262.anInt6340 >> 3);
		Static146.method2198();
		Static247.aBoolean423 = false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZILclient!je;I)V")
	public static void method2972(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt3074;
		@Pc(11) int local11 = arg2.anInt3071;
		if (arg2.aByte42 == 0) {
			arg2.anInt3074 = arg2.anInt3100;
		} else if (arg2.aByte42 == 1) {
			arg2.anInt3074 = arg3 - arg2.anInt3100;
		} else if (arg2.aByte42 == 2) {
			arg2.anInt3074 = arg3 * arg2.anInt3100 >> 14;
		}
		if (arg2.aByte39 == 0) {
			arg2.anInt3071 = arg2.anInt3079;
		} else if (arg2.aByte39 == 1) {
			arg2.anInt3071 = arg1 - arg2.anInt3079;
		} else if (arg2.aByte39 == 2) {
			arg2.anInt3071 = arg1 * arg2.anInt3079 >> 14;
		}
		if (arg2.aByte42 == 4) {
			arg2.anInt3074 = arg2.anInt3071 * arg2.anInt3039 / arg2.anInt3081;
		}
		if (arg2.aByte39 == 4) {
			arg2.anInt3071 = arg2.anInt3081 * arg2.anInt3074 / arg2.anInt3039;
		}
		if (Static274.aBoolean463 && (Static50.method810(arg2).anInt3451 != 0 || arg2.anInt3108 == 0)) {
			if (arg2.anInt3071 < 5 && arg2.anInt3074 < 5) {
				arg2.anInt3074 = 5;
				arg2.anInt3071 = 5;
			} else {
				if (arg2.anInt3071 <= 0) {
					arg2.anInt3071 = 5;
				}
				if (arg2.anInt3074 <= 0) {
					arg2.anInt3074 = 5;
				}
			}
		}
		if (Static313.anInt5341 == arg2.anInt3064) {
			Static238.aClass117_11 = arg2;
		}
		if (arg0 && arg2.anObjectArray11 != null && (local8 != arg2.anInt3074 || arg2.anInt3071 != local11)) {
			@Pc(207) Class1_Sub39 local207 = new Class1_Sub39();
			local207.aClass117_16 = arg2;
			local207.anObjectArray34 = arg2.anObjectArray11;
			Static140.aClass17_67.method199(local207);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static248.anIntArrayArrayArray12[arg0][local16][local20] == -Static252.anInt4374) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static365.anInt5876) + 1;
			@Pc(142) int local142 = (arg3 << Static365.anInt5876) + 2;
			@Pc(151) int local151 = Static229.aClass42Array3[arg0].method3060(arg1, arg3) + arg5;
			if (!Static251.method3878(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static365.anInt5876) - 1;
			if (!Static251.method3878(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static365.anInt5876) - 1;
			if (!Static251.method3878(local20, local151, local177)) {
				return false;
			} else if (Static251.method3878(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static83.method1224(arg0, arg1, arg3)) {
			local16 = arg1 << Static365.anInt5876;
			local20 = arg3 << Static365.anInt5876;
			return Static251.method3878(local16 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg3) + arg5, local20 + 1) && Static251.method3878(local16 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg3) + arg5, local20 + 1) && Static251.method3878(local16 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg3 + 1) + arg5, local20 + Static53.anInt1116 - 1) && Static251.method3878(local16 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg3 + 1) + arg5, local20 + Static53.anInt1116 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
	public static void method2974(@OriginalArg(1) int arg0) {
		if (arg0 == Static142.anInt2665) {
			return;
		}
		if (Static142.anInt2665 == 0) {
			Static328.method4760();
		}
		if (arg0 == 40) {
			Static240.method3327();
		}
		if (arg0 != 40 && Static151.aClass130_4 != null) {
			Static151.aClass130_4.method2668();
			Static151.aClass130_4 = null;
		}
		if (Static142.anInt2665 == 25 || Static142.anInt2665 == 28) {
			Static307.aClass230_79.anInt5779 = 2;
			Static94.aClass230_31.anInt5779 = 2;
			Static226.aClass230_58.anInt5779 = 2;
			Static22.aClass230_59.anInt5779 = 2;
			Static358.aClass230_80.anInt5779 = 2;
			Static185.aClass230_49.anInt5779 = 2;
			Static55.aClass230_19.anInt5779 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static330.anInt5518 = 0;
			Static222.anInt4506 = 1;
			Static164.anInt2966 = 0;
			Static134.anInt2506 = 1;
			Static334.anInt5568 = 0;
			Static32.method500(true);
			Static307.aClass230_79.anInt5779 = 1;
			Static94.aClass230_31.anInt5779 = 1;
			Static226.aClass230_58.anInt5779 = 1;
			Static22.aClass230_59.anInt5779 = 1;
			Static358.aClass230_80.anInt5779 = 1;
			Static185.aClass230_49.anInt5779 = 1;
			Static55.aClass230_19.anInt5779 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static180.method2596();
		}
		if (arg0 == 5) {
			Static211.method2969(Static145.aClass230_41, Static66.aClass164_2);
		} else {
			Static70.method1140();
		}
		@Pc(150) boolean local150 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(167) boolean local167 = Static142.anInt2665 == 5 || Static142.anInt2665 == 10 || Static142.anInt2665 == 28;
		if (local150 != local167) {
			if (local150) {
				Static91.anInt1663 = Static352.anInt5761;
				if (Static188.aClass135_Sub1_1.anInt3379 == 0) {
					Static301.method4496();
				} else {
					Static296.method4459(Static188.aClass135_Sub1_1.anInt3379, Static156.aClass230_44, Static352.anInt5761);
				}
				Static73.aClass92_1.method1782(false);
			} else {
				Static301.method4496();
				Static73.aClass92_1.method1782(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static66.aClass164_2.method5303();
		}
		Static142.anInt2665 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII)V")
	public static void method2975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static209.aClass1_Sub33_Sub2_2.lb = 0;
		Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_6.anInt1518);
		Static209.aClass1_Sub33_Sub2_2.method5165(arg2);
		Static209.aClass1_Sub33_Sub2_2.method5165(arg0);
		Static209.aClass1_Sub33_Sub2_2.method5138(arg1);
		Static209.aClass1_Sub33_Sub2_2.method5138(arg3);
		Static288.anInt4949 = 0;
		Static300.anInt5112 = 1;
		Static324.anInt2339 = -3;
		Static19.anInt321 = 0;
	}
}
