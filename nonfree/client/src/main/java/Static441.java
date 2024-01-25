import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_50 = new Class165(20);

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "[F")
	public static final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BILclient!oga;IIIIIIII)Z")
	public static boolean method6270(@OriginalArg(1) int arg0, @OriginalArg(2) Class252 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg3;
		@Pc(7) int local7 = arg4;
		@Pc(16) int local16 = arg3 - 64;
		Static199.anIntArrayArray20[64][64] = 99;
		@Pc(35) int local35 = arg4 - 64;
		Static94.anIntArrayArray13[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static19.anIntArray26[0] = arg3;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static491.anIntArray684[0] = arg4;
		@Pc(57) int[][] local57 = arg1.anIntArrayArray45;
		while (local49 != local52) {
			local5 = Static19.anIntArray26[local49];
			local7 = Static491.anIntArray684[local49];
			@Pc(71) int local71 = local5 - local16;
			local49 = local49 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - arg1.anInt6831;
			@Pc(89) int local89 = local5 - arg1.anInt6837;
			@Pc(94) int local94 = local7 - local35;
			if (arg2 == -4) {
				if (local5 == arg7 && arg5 == local7) {
					Static421.anInt6741 = local5;
					Static561.anInt9113 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static510.method4484(arg9, arg5, arg7, arg0, local5, 1, 1, local7)) {
					Static561.anInt9113 = local7;
					Static421.anInt6741 = local5;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg1.method6162(arg7, local5, 1, arg9, arg5, local7, 1, arg8, arg0)) {
					Static561.anInt9113 = local7;
					Static421.anInt6741 = local5;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg1.method6168(local7, arg9, arg0, arg8, arg7, local5, arg5, 1)) {
					Static421.anInt6741 = local5;
					Static561.anInt9113 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg1.method6163(arg2, arg5, local7, arg7, 1, arg6, local5)) {
					Static421.anInt6741 = local5;
					Static561.anInt9113 = local7;
					return true;
				}
			} else if (arg1.method6171(arg6, arg7, local5, arg2, local7, arg5, 1)) {
				Static421.anInt6741 = local5;
				Static561.anInt9113 = local7;
				return true;
			}
			@Pc(243) int local243 = Static94.anIntArrayArray13[local71][local94] + 1;
			if (local71 > 0 && Static199.anIntArrayArray20[local71 - 1][local94] == 0 && (local57[local89 - 1][local83] & 0x42240000) == 0) {
				Static19.anIntArray26[local52] = local5 - 1;
				Static491.anIntArray684[local52] = local7;
				local52 = local52 + 1 & 0xFFF;
				Static199.anIntArrayArray20[local71 - 1][local94] = 2;
				Static94.anIntArrayArray13[local71 - 1][local94] = local243;
			}
			if (local71 < 127 && Static199.anIntArrayArray20[local71 + 1][local94] == 0 && (local57[local89 + 1][local83] & 0x60240000) == 0) {
				Static19.anIntArray26[local52] = local5 + 1;
				Static491.anIntArray684[local52] = local7;
				Static199.anIntArrayArray20[local71 + 1][local94] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71 + 1][local94] = local243;
			}
			if (local94 > 0 && Static199.anIntArrayArray20[local71][local94 - 1] == 0 && (local57[local89][local83 - 1] & 0x40A40000) == 0) {
				Static19.anIntArray26[local52] = local5;
				Static491.anIntArray684[local52] = local7 - 1;
				Static199.anIntArrayArray20[local71][local94 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71][local94 - 1] = local243;
			}
			if (local94 < 127 && Static199.anIntArrayArray20[local71][local94 + 1] == 0 && (local57[local89][local83 + 1] & 0x48240000) == 0) {
				Static19.anIntArray26[local52] = local5;
				Static491.anIntArray684[local52] = local7 + 1;
				Static199.anIntArrayArray20[local71][local94 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71][local94 + 1] = local243;
			}
			if (local71 > 0 && local94 > 0 && Static199.anIntArrayArray20[local71 - 1][local94 - 1] == 0 && (local57[local89 - 1][local83 - 1] & 0x43A40000) == 0 && (local57[local89 - 1][local83] & 0x42240000) == 0 && (local57[local89][local83 - 1] & 0x40A40000) == 0) {
				Static19.anIntArray26[local52] = local5 - 1;
				Static491.anIntArray684[local52] = local7 - 1;
				Static199.anIntArrayArray20[local71 - 1][local94 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71 - 1][local94 - 1] = local243;
			}
			if (local71 < 127 && local94 > 0 && Static199.anIntArrayArray20[local71 + 1][local94 - 1] == 0 && (local57[local89 + 1][local83 - 1] & 0x60E40000) == 0 && (local57[local89 + 1][local83] & 0x60240000) == 0 && (local57[local89][local83 - 1] & 0x40A40000) == 0) {
				Static19.anIntArray26[local52] = local5 + 1;
				Static491.anIntArray684[local52] = local7 - 1;
				Static199.anIntArrayArray20[local71 + 1][local94 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71 + 1][local94 - 1] = local243;
			}
			if (local71 > 0 && local94 < 127 && Static199.anIntArrayArray20[local71 - 1][local94 + 1] == 0 && (local57[local89 - 1][local83 + 1] & 0x4E240000) == 0 && (local57[local89 - 1][local83] & 0x42240000) == 0 && (local57[local89][local83 + 1] & 0x48240000) == 0) {
				Static19.anIntArray26[local52] = local5 - 1;
				Static491.anIntArray684[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static199.anIntArrayArray20[local71 - 1][local94 + 1] = 6;
				Static94.anIntArrayArray13[local71 - 1][local94 + 1] = local243;
			}
			if (local71 < 127 && local94 < 127 && Static199.anIntArrayArray20[local71 + 1][local94 + 1] == 0 && (local57[local89 + 1][local83 + 1] & 0x78240000) == 0 && (local57[local89 + 1][local83] & 0x60240000) == 0 && (local57[local89][local83 + 1] & 0x48240000) == 0) {
				Static19.anIntArray26[local52] = local5 + 1;
				Static491.anIntArray684[local52] = local7 + 1;
				Static199.anIntArrayArray20[local71 + 1][local94 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local71 + 1][local94 + 1] = local243;
			}
		}
		Static561.anInt9113 = local7;
		Static421.anInt6741 = local5;
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg0 == arg8 && arg1 == arg5 && arg3 == arg7) {
			Static536.method7971(arg6, arg8, arg7, arg1, arg2);
			return;
		}
		@Pc(23) int local23 = arg2;
		@Pc(25) int local25 = arg8;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(59) int local59 = arg1 + local37 - arg2 - local45;
		@Pc(69) int local69 = local41 + arg7 - arg8 - local49;
		@Pc(79) int local79 = local29 + local45 - local37 - local37;
		@Pc(89) int local89 = local33 + local49 - local41 - local41;
		@Pc(94) int local94 = local37 - local29;
		@Pc(98) int local98 = local41 - local33;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(108) int local108 = local100 * local100 >> 12;
			@Pc(114) int local114 = local100 * local108 >> 12;
			@Pc(118) int local118 = local114 * local59;
			@Pc(122) int local122 = local69 * local114;
			@Pc(126) int local126 = local108 * local79;
			@Pc(130) int local130 = local108 * local89;
			@Pc(134) int local134 = local94 * local100;
			@Pc(138) int local138 = local98 * local100;
			@Pc(150) int local150 = arg2 + (local118 + local126 + local134 >> 12);
			@Pc(162) int local162 = (local122 + local130 + local138 >> 12) + arg8;
			Static536.method7971(arg6, local25, local162, local150, local23);
			local23 = local150;
			local25 = local162;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	public static void method6272() {
		@Pc(12) Class214 local12 = null;
		try {
			@Pc(18) Class81 local18 = Static247.aClass291_1.method7130("");
			while (local18.anInt2532 == 0) {
				Static373.method5403(1L);
			}
			if (local18.anInt2532 == 1) {
				local12 = (Class214) local18.anObject4;
				@Pc(42) Class3_Sub25 local42 = Static24.aClass3_Sub22_4.method2839();
				local12.method5378(0, local42.aByteArray106, local42.anInt9765);
			}
		} catch (@Pc(52) Exception local52) {
		}
		try {
			if (local12 != null) {
				local12.method5380();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
	public static void method6274(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static77.method1433(arg0, 0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!kf;Z)V")
	public static void method6275(@OriginalArg(0) Class3_Sub34 arg0) {
		Static443.aClass338_171.method8171(arg0);
		arg0.anInt5095 = arg0.aClass3_Sub25_Sub1_2.anInt9765;
		arg0.aClass3_Sub25_Sub1_2.anInt9765 = 0;
		Static57.anInt1186 += arg0.anInt5095;
	}
}
