import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt3975;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!je;")
	public static Class1_Sub2_Sub3_Sub1 aClass1_Sub2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_129 = new Class221(44, 6);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public static final int anInt3980 = 50;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
	public static final int[] anIntArray298 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static final int[] anIntArray299 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[I")
	public static final int[] anIntArray300 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public static int anInt3977 = 0;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[anInt3980];

	@OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
	public static final int[] anIntArray301 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
	public static final int[] anIntArray302 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
	public static final int[] anIntArray303 = new int[anInt3980];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	public static int method3423() {
		if (Static135.aBoolean276) {
			return 0;
		} else if (Static230.method4872()) {
			return Static346.aBoolean526 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!je;ILclient!fq;IIBLclient!wn;)V")
	public static void method3424(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class74 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1_Sub2_Sub3_Sub2 arg6) {
		@Pc(7) Class2_Sub37 local7 = new Class2_Sub37();
		local7.anInt5748 = arg5 * 128;
		local7.anInt5751 = arg4 * 128;
		local7.anInt5749 = arg2;
		if (arg3 != null) {
			local7.aClass74_1 = arg3;
			@Pc(36) int local36 = arg3.anInt2094;
			@Pc(39) int local39 = arg3.anInt2048;
			if (arg0 == 1 || arg0 == 3) {
				local36 = arg3.anInt2048;
				local39 = arg3.anInt2094;
			}
			local7.anIntArray451 = arg3.anIntArray165;
			local7.anInt5752 = (arg4 + local39) * 128;
			local7.anInt5746 = arg3.anInt2075;
			local7.anInt5740 = arg3.anInt2088;
			local7.anInt5742 = arg3.anInt2087;
			local7.anInt5743 = arg3.anInt2081 * 128;
			local7.anInt5745 = arg3.anInt2093;
			local7.anInt5741 = (local36 + arg5) * 128;
			if (arg3.anIntArray161 != null) {
				local7.aBoolean510 = true;
				local7.method4838();
			}
			if (local7.anIntArray451 != null) {
				local7.anInt5747 = (int) (Math.random() * (double) (local7.anInt5740 - local7.anInt5745)) + local7.anInt5745;
			}
			Static309.aClass180_41.method4909(local7);
		} else if (arg6 != null) {
			local7.aClass1_Sub2_Sub3_Sub2_1 = arg6;
			@Pc(134) Class139 local134 = arg6.aClass139_1;
			if (local134.anIntArray350 != null) {
				local7.aBoolean510 = true;
				local134 = local134.method4120();
			}
			if (local134 != null) {
				local7.anInt5741 = (local134.anInt4778 + arg5) * 128;
				local7.anInt5752 = (local134.anInt4778 + arg4) * 128;
				local7.anInt5746 = Static57.method1228(arg6);
				local7.anInt5742 = local134.anInt4788;
				local7.anInt5743 = local134.anInt4782 * 128;
			}
			Static120.aClass180_2.method4909(local7);
		} else if (arg1 != null) {
			local7.aClass1_Sub2_Sub3_Sub1_2 = arg1;
			local7.anInt5741 = (arg1.method5787() + arg5) * 128;
			local7.anInt5752 = (arg1.method5787() + arg4) * 128;
			local7.anInt5746 = Static1.method4431(arg1);
			local7.anInt5742 = arg1.anInt3390;
			local7.anInt5743 = arg1.anInt3414 * 128;
			Static13.aClass41_1.method901(local7, (long) arg1.anInt6896);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method3425(@OriginalArg(1) Class104 arg0) {
		Static149.aClass104_88 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg3;
		@Pc(21) int local21 = arg2 - arg3;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(50) int local50 = local25 << 1;
		@Pc(54) int local54 = local37 << 1;
		@Pc(58) int local58 = local33 << 1;
		@Pc(62) int local62 = arg2 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = (1 - local62) * local25 + local41;
		@Pc(84) int local84 = local29 - (local62 - 1) * local50;
		@Pc(93) int local93 = local33 * (1 - local66) + local54;
		@Pc(102) int local102 = local37 - (local66 - 1) * local58;
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg2 - 1);
		@Pc(148) int local148 = local118;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(195) int local195;
		if (arg5 >= Static197.anInt4298 && Static38.anInt553 >= arg5) {
			@Pc(162) int[] local162 = Static364.anIntArrayArray57[arg5];
			local171 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - arg4);
			local179 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg4 + arg1);
			local187 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local16);
			local195 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local16 + arg1);
			Static115.method2278(local162, local187, arg0, local171);
			Static115.method2278(local162, local195, arg6, local187);
			Static115.method2278(local162, local179, arg0, local195);
		}
		@Pc(221) int local221 = (local21 - 1) * local114;
		while (local9 > 0) {
			@Pc(234) boolean local234 = local21 >= local9;
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local122;
					local84 += local140;
					local7++;
					local122 += local110;
					local140 += local110;
				}
			}
			if (local234) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local148 += local118;
						local132 += local118;
						local11++;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local11++;
					local148 += local118;
					local132 += local118;
				}
				local102 += -local138;
				local93 += -local221;
				local138 -= local114;
				local221 -= local114;
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local122 += local110;
				local7++;
				local140 += local110;
			}
			local75 += -local146;
			local84 += -local128;
			local9--;
			local128 -= local106;
			local146 -= local106;
			local171 = arg5 - local9;
			local179 = local9 + arg5;
			if (local179 >= Static197.anInt4298 && local171 <= Static38.anInt553) {
				local187 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local7 + arg1);
				local195 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local7);
				if (local234) {
					@Pc(407) int local407 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 + local11);
					@Pc(416) int local416 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local11);
					@Pc(427) int[] local427;
					if (Static197.anInt4298 <= local171) {
						local427 = Static364.anIntArrayArray57[local171];
						Static115.method2278(local427, local416, arg0, local195);
						Static115.method2278(local427, local407, arg6, local416);
						Static115.method2278(local427, local187, arg0, local407);
					}
					if (local179 <= Static38.anInt553) {
						local427 = Static364.anIntArrayArray57[local179];
						Static115.method2278(local427, local416, arg0, local195);
						Static115.method2278(local427, local407, arg6, local416);
						Static115.method2278(local427, local187, arg0, local407);
					}
				} else {
					if (local171 >= Static197.anInt4298) {
						Static115.method2278(Static364.anIntArrayArray57[local171], local187, arg0, local195);
					}
					if (Static38.anInt553 >= local179) {
						Static115.method2278(Static364.anIntArrayArray57[local179], local187, arg0, local195);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 < 1 || arg1 < 1 || arg5 > Static66.anInt1177 - 2 || Static12.anInt213 - 2 < arg1) {
			return;
		}
		if (!Static230.method4872() && !Static32.method438(arg5, arg1, Static30.anInt483, arg4)) {
			return;
		}
		if (Static196.aClass51ArrayArrayArray3 == null) {
			return;
		}
		@Pc(51) int local51 = arg4;
		if (arg4 < 3 && Static283.method4811(arg5, arg1)) {
			local51 = arg4 + 1;
		}
		Static186.method3501(Static182.aClass61Array2[arg4], Static51.aClass37_1, arg5, local51, arg0, arg4, arg1);
		if (arg7 < 0) {
			return;
		}
		@Pc(77) boolean local77 = Static146.aBoolean287;
		Static146.aBoolean287 = true;
		Static118.method2301(false, arg6, Static51.aClass37_1, Static182.aClass61Array2[arg4], arg1, arg7, false, local51, arg2, arg5, arg4, arg3);
		Static146.aBoolean287 = local77;
		return;
	}
}
