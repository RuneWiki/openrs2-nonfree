import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "Lclient!ag;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	public static int anInt602;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_18 = new Class83("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
	public static final int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!lh;)I")
	public static int method631(@OriginalArg(1) Class16_Sub1_Sub5_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt4333;
		@Pc(18) Class151 local18 = arg0.method4757();
		if (arg0.aBoolean562) {
			local14 = arg0.anInt4313;
		} else if (local18.anInt4669 == arg0.anInt6076 || arg0.anInt6076 == local18.anInt4656 || local18.anInt4665 == arg0.anInt6076 || local18.anInt4686 == arg0.anInt6076) {
			local14 = arg0.anInt4322;
		} else if (arg0.anInt6076 == local18.anInt4667 || local18.anInt4681 == arg0.anInt6076 || arg0.anInt6076 == local18.anInt4688 || arg0.anInt6076 == local18.anInt4675) {
			local14 = arg0.anInt4319;
		}
		return local14;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!rs;)V")
	public static void method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16_Sub1_Sub5_Sub2 arg2) {
		if (arg0 == arg2.anInt6021 && arg0 != -1) {
			@Pc(25) Class138 local25 = Static182.aClass55_1.method1397(arg0);
			@Pc(28) int local28 = local25.anInt4406;
			if (local28 == 1) {
				arg2.anInt6046 = arg1;
				arg2.anInt6060 = 0;
				arg2.anInt6058 = 1;
				arg2.anInt6012 = 0;
				arg2.anInt6073 = 0;
				Static15.method156(arg2.anInt6893, arg2.anInt6060, arg2.aByte82, arg2.anInt6892, local25, false);
			}
			if (local28 == 2) {
				arg2.anInt6012 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt6021 == -1 || Static182.aClass55_1.method1397(arg0).anInt4413 >= Static182.aClass55_1.method1397(arg2.anInt6021).anInt4413) {
			arg2.anInt6012 = 0;
			arg2.anInt6058 = 1;
			arg2.anInt6073 = 0;
			arg2.anInt6087 = arg2.anInt6086;
			arg2.anInt6046 = arg1;
			arg2.anInt6021 = arg0;
			arg2.anInt6060 = 0;
			if (arg2.anInt6021 == -1) {
				return;
			}
			Static15.method156(arg2.anInt6893, arg2.anInt6060, arg2.aByte82, arg2.anInt6892, Static182.aClass55_1.method1397(arg2.anInt6021), false);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
	public static void method633(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static148.aClass4_Sub1_Sub5_3 != null) {
			Static195.anInt3719 = Static148.aClass4_Sub1_Sub5_3.anInt1012;
		} else {
			Static195.anInt3719 = -1;
		}
		Static69.anInt3429 = 0;
		Static148.aClass4_Sub1_Sub5_3 = null;
		Static81.aClass247_2 = null;
		Static378.aClass183_29 = null;
		Static148.method4510();
		Static148.aClass183_41.method4138();
		Static262.aClass212_7 = null;
		Static373.aClass212_8 = null;
		Static71.anInt6920 = -1;
		Static58.aClass212_1 = null;
		Static258.aClass212_6 = null;
		Static239.aClass212_5 = null;
		Static108.aClass212_3 = null;
		Static148.aClass195_3 = null;
		Static229.aClass57_18 = null;
		Static127.anInt2674 = -1;
		Static81.aClass212_2 = null;
		Static117.aClass212_4 = null;
		Static148.aClass182_3.method4127();
		Static148.aClass265_4.method5591(64, 64);
		Static148.aClass182_3.method4131(64, 128);
		Static148.aClass262_3.method5565(64);
		Static26.aClass26_1.method646(64);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BILclient!sd;IIIIIIII)Z")
	public static boolean method634(@OriginalArg(1) int arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg7;
		@Pc(23) int local23 = arg5 - 64;
		Static159.anIntArrayArray30[64][64] = 99;
		@Pc(33) int local33 = arg7 - 64;
		Static14.anIntArrayArray1[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static129.anIntArray182[0] = arg5;
		@Pc(50) int local50 = local41 + 1;
		Static416.anIntArray526[0] = arg7;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray48;
		while (local50 != local43) {
			local7 = Static129.anIntArray182[local43];
			local9 = Static416.anIntArray526[local43];
			@Pc(70) int local70 = local9 - local33;
			local43 = local43 + 1 & 0xFFF;
			@Pc(81) int local81 = local7 - local23;
			@Pc(87) int local87 = local7 - arg1.anInt6230;
			@Pc(92) int local92 = local9 - arg1.anInt6235;
			if (arg0 == -4) {
				if (local7 == arg8 && local9 == arg6) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static455.method4305(2, arg6, 2, arg4, arg3, local9, local7, arg8)) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg1.method4844(arg8, 2, arg4, local7, arg2, arg6, local9, arg3, 2)) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg1.method4840(arg3, 2, arg8, arg2, arg4, arg6, local7, local9)) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg1.method4842(local9, arg9, arg6, 2, local7, arg8, arg0)) {
					Static389.anInt6521 = local7;
					Static102.anInt2045 = local9;
					return true;
				}
			} else if (arg1.method4849(arg9, local7, arg0, arg8, local9, arg6, 2)) {
				Static389.anInt6521 = local7;
				Static102.anInt2045 = local9;
				return true;
			}
			@Pc(251) int local251 = Static14.anIntArrayArray1[local81][local70] + 1;
			if (local81 > 0 && Static159.anIntArrayArray30[local81 - 1][local70] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static129.anIntArray182[local50] = local7 - 1;
				Static416.anIntArray526[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local81 - 1][local70] = 2;
				Static14.anIntArrayArray1[local81 - 1][local70] = local251;
			}
			if (local81 < 126 && Static159.anIntArrayArray30[local81 + 1][local70] == 0 && (local55[local87 + 2][local92] & 0x60E40000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static129.anIntArray182[local50] = local7 + 1;
				Static416.anIntArray526[local50] = local9;
				Static159.anIntArrayArray30[local81 + 1][local70] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local81 + 1][local70] = local251;
			}
			if (local70 > 0 && Static159.anIntArrayArray30[local81][local70 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static129.anIntArray182[local50] = local7;
				Static416.anIntArray526[local50] = local9 - 1;
				Static159.anIntArrayArray30[local81][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local81][local70 - 1] = local251;
			}
			if (local70 < 126 && Static159.anIntArrayArray30[local81][local70 + 1] == 0 && (local55[local87][local92 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static129.anIntArray182[local50] = local7;
				Static416.anIntArray526[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local81][local70 + 1] = 4;
				Static14.anIntArrayArray1[local81][local70 + 1] = local251;
			}
			if (local81 > 0 && local70 > 0 && Static159.anIntArrayArray30[local81 - 1][local70 - 1] == 0 && (local55[local87 - 1][local92] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local87][local92 - 1] & 0x63E40000) == 0) {
				Static129.anIntArray182[local50] = local7 - 1;
				Static416.anIntArray526[local50] = local9 - 1;
				Static159.anIntArrayArray30[local81 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local81 - 1][local70 - 1] = local251;
			}
			if (local81 < 126 && local70 > 0 && Static159.anIntArrayArray30[local81 + 1][local70 - 1] == 0 && (local55[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local92] & 0x78E40000) == 0) {
				Static129.anIntArray182[local50] = local7 + 1;
				Static416.anIntArray526[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local81 + 1][local70 - 1] = 9;
				Static14.anIntArrayArray1[local81 + 1][local70 - 1] = local251;
			}
			if (local81 > 0 && local70 < 126 && Static159.anIntArrayArray30[local81 - 1][local70 + 1] == 0 && (local55[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local87][local92 + 2] & 0x7E240000) == 0) {
				Static129.anIntArray182[local50] = local7 - 1;
				Static416.anIntArray526[local50] = local9 + 1;
				Static159.anIntArrayArray30[local81 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local81 - 1][local70 + 1] = local251;
			}
			if (local81 < 126 && local70 < 126 && Static159.anIntArrayArray30[local81 + 1][local70 + 1] == 0 && (local55[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static129.anIntArray182[local50] = local7 + 1;
				Static416.anIntArray526[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local81 + 1][local70 + 1] = 12;
				Static14.anIntArrayArray1[local81 + 1][local70 + 1] = local251;
			}
		}
		Static102.anInt2045 = local9;
		Static389.anInt6521 = local7;
		return false;
	}
}
