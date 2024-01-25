import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
	public static boolean aBoolean216;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "[[[Lclient!dn;")
	public static Class51[][][] aClass51ArrayArrayArray2;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public static int anInt2999 = -1;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILclient!mg;II)V")
	public static void method2738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub27 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt3737 == -1 && arg3.anIntArray277 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3.anInt3738 < arg4) {
			local15 = arg4 - arg3.anInt3738;
		} else if (arg4 < arg3.anInt3735) {
			local15 = arg3.anInt3735 - arg4;
		}
		@Pc(52) int local52 = Static123.anInt2600 * arg3.anInt3732 >> 8;
		if (arg2 > arg3.anInt3731) {
			local15 += arg2 - arg3.anInt3731;
		} else if (arg2 < arg3.anInt3730) {
			local15 += arg3.anInt3730 - arg2;
		}
		if (arg3.anInt3733 == 0 || local15 - 64 > arg3.anInt3733 || Static123.anInt2600 == 0 || arg3.anInt3746 != arg0) {
			if (arg3.aClass5_Sub17_Sub1_1 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(arg3.aClass5_Sub17_Sub1_1);
				arg3.aClass5_Sub17_Sub1_1 = null;
			}
			if (arg3.aClass5_Sub17_Sub1_2 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(arg3.aClass5_Sub17_Sub1_2);
				arg3.aClass5_Sub17_Sub1_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(149) int local149 = local52 * (arg3.anInt3733 - local15) / arg3.anInt3733;
		if (arg3.aClass5_Sub17_Sub1_1 != null) {
			arg3.aClass5_Sub17_Sub1_1.method2130(local149);
		} else if (arg3.anInt3737 >= 0) {
			@Pc(167) Class196 local167 = Static368.method5324(Static101.aClass170_44, arg3.anInt3737, 0);
			if (local167 != null) {
				@Pc(174) Class5_Sub15_Sub1 local174 = local167.method5322().method1982(Static195.aClass186_1);
				@Pc(179) Class5_Sub17_Sub1 local179 = Static361.method2115(local174, local149);
				local179.method2121(-1);
				Static5.aClass5_Sub17_Sub3_1.method3547(local179);
				arg3.aClass5_Sub17_Sub1_1 = local179;
			}
		}
		if (arg3.aClass5_Sub17_Sub1_2 != null) {
			arg3.aClass5_Sub17_Sub1_2.method2130(local149);
			if (arg3.aClass5_Sub17_Sub1_2.method5802()) {
				return;
			}
			arg3.aClass5_Sub17_Sub1_2 = null;
		} else if (arg3.anIntArray277 != null && (arg3.anInt3734 -= arg1) <= 0) {
			@Pc(213) int local213 = (int) (Math.random() * (double) arg3.anIntArray277.length);
			@Pc(221) Class196 local221 = Static368.method5324(Static101.aClass170_44, arg3.anIntArray277[local213], 0);
			if (local221 != null) {
				@Pc(228) Class5_Sub15_Sub1 local228 = local221.method5322().method1982(Static195.aClass186_1);
				@Pc(233) Class5_Sub17_Sub1 local233 = Static361.method2115(local228, local149);
				local233.method2121(0);
				Static5.aClass5_Sub17_Sub3_1.method3547(local233);
				arg3.aClass5_Sub17_Sub1_2 = local233;
				arg3.anInt3734 = arg3.anInt3745 + (int) (Math.random() * (double) (arg3.anInt3740 - arg3.anInt3745));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 >= Static184.anInt6250 && Static80.anInt4809 >= arg6 && arg2 >= Static314.anInt6018 && arg5 <= Static334.anInt6315) {
			Static30.method749(arg0, arg3, arg4, arg5, arg6, arg1, arg2);
		} else {
			Static250.method4373(arg5, arg2, arg6, arg0, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public static void method2740() {
		@Pc(1) Class66 local1 = Static177.aClass66_38;
		synchronized (Static177.aClass66_38) {
			Static177.aClass66_38.method1944(5);
		}
		local1 = Static162.aClass66_58;
		synchronized (Static162.aClass66_58) {
			Static162.aClass66_58.method1944(5);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!bk;)V")
	public static void method2741(@OriginalArg(1) Class5_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static191.anInt5852; local7++) {
			@Pc(15) int local15 = arg0.method1866();
			@Pc(21) int local21 = arg0.method1845();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static158.aClass47_Sub1Array2[local15] != null) {
				Static158.aClass47_Sub1Array2[local15].anInt1359 = local21;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jf;IZII)V")
	public static void method2743(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6 = arg0.anInt2943;
		@Pc(9) int local9 = arg0.anInt2916;
		if (arg0.aByte32 == 0) {
			arg0.anInt2943 = arg0.anInt2901;
		} else if (arg0.aByte32 == 1) {
			arg0.anInt2943 = arg3 - arg0.anInt2901;
		} else if (arg0.aByte32 == 2) {
			arg0.anInt2943 = arg3 * arg0.anInt2901 >> 14;
		} else if (arg0.aByte32 == 3) {
			if (arg0.anInt2933 == 2) {
				arg0.anInt2943 = arg0.anInt2901 * 32 + arg0.anInt2890 * (arg0.anInt2901 - 1);
			} else if (arg0.anInt2933 == 7) {
				arg0.anInt2943 = arg0.anInt2890 * (arg0.anInt2901 - 1) + arg0.anInt2901 * 115;
			}
		}
		if (arg0.aByte34 == 0) {
			arg0.anInt2916 = arg0.anInt2900;
		} else if (arg0.aByte34 == 1) {
			arg0.anInt2916 = arg1 - arg0.anInt2900;
		} else if (arg0.aByte34 == 2) {
			arg0.anInt2916 = arg1 * arg0.anInt2900 >> 14;
		} else if (arg0.aByte34 == 3) {
			if (arg0.anInt2933 == 2) {
				arg0.anInt2916 = arg0.anInt2900 * 32 + arg0.anInt2875 * (arg0.anInt2900 - 1);
			} else if (arg0.anInt2933 == 7) {
				arg0.anInt2916 = (arg0.anInt2900 - 1) * arg0.anInt2875 + arg0.anInt2900 * 12;
			}
		}
		if (arg0.aByte32 == 4) {
			arg0.anInt2943 = arg0.anInt2897 * arg0.anInt2916 / arg0.anInt2896;
		}
		if (arg0.aByte34 == 4) {
			arg0.anInt2916 = arg0.anInt2943 * arg0.anInt2896 / arg0.anInt2897;
		}
		if (Static213.aBoolean311 && (Static43.method975(arg0).anInt1281 != 0 || arg0.anInt2933 == 0)) {
			if (arg0.anInt2916 < 5 && arg0.anInt2943 < 5) {
				arg0.anInt2916 = 5;
				arg0.anInt2943 = 5;
			} else {
				if (arg0.anInt2916 <= 0) {
					arg0.anInt2916 = 5;
				}
				if (arg0.anInt2943 <= 0) {
					arg0.anInt2943 = 5;
				}
			}
		}
		if (arg0.anInt2935 == 1337) {
			Static70.aClass96_5 = arg0;
		}
		if (arg2 && arg0.anObjectArray4 != null && (local6 != arg0.anInt2943 || local9 != arg0.anInt2916)) {
			@Pc(272) Class5_Sub12 local272 = new Class5_Sub12();
			local272.anObjectArray3 = arg0.anObjectArray4;
			local272.aClass96_4 = arg0;
			Static145.aClass211_39.method5609(local272);
		}
	}
}
