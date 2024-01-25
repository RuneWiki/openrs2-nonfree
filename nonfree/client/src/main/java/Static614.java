import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!us", name = "c", descriptor = "I")
	public static int anInt9937 = 2;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!ii;IIIIIIIII)Z")
	public static boolean method8443(@OriginalArg(0) int arg0, @OriginalArg(1) Class169 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(41) int local41 = arg4 - 64;
		Static238.anIntArrayArray33[64][64] = 99;
		Static617.anIntArrayArray59[64][64] = 0;
		@Pc(55) byte local55 = 0;
		@Pc(57) int local57 = 0;
		Static272.anIntArray266[0] = arg5;
		@Pc(64) int local64 = local55 + 1;
		Static403.anIntArray393[0] = arg4;
		@Pc(69) int[][] local69 = arg1.anIntArrayArray34;
		while (local57 != local64) {
			local7 = Static272.anIntArray266[local57];
			local9 = Static403.anIntArray393[local57];
			local57 = local57 + 1 & 0xFFF;
			@Pc(89) int local89 = local7 - local18;
			@Pc(94) int local94 = local9 - local41;
			@Pc(100) int local100 = local7 - arg1.anInt4219;
			@Pc(106) int local106 = local9 - arg1.anInt4229;
			if (arg2 == -4) {
				if (local7 == arg0 && local9 == arg6) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static570.method7683(local7, arg9, 2, 2, local9, arg6, arg0, arg8)) {
					Static458.anInt7397 = local7;
					Static388.anInt6572 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg1.method3866(arg8, arg7, local7, 2, local9, arg0, arg9, 2, arg6)) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg1.method3868(arg8, arg9, local7, local9, arg6, arg7, arg0, 2)) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg1.method3873(arg0, arg6, arg2, arg3, local7, 2, local9)) {
					Static458.anInt7397 = local7;
					Static388.anInt6572 = local9;
					return true;
				}
			} else if (arg1.method3863(arg0, local7, arg3, arg6, arg2, 2, local9)) {
				Static388.anInt6572 = local9;
				Static458.anInt7397 = local7;
				return true;
			}
			@Pc(278) int local278 = Static617.anIntArrayArray59[local89][local94] + 1;
			if (local89 > 0 && Static238.anIntArrayArray33[local89 - 1][local94] == 0 && (local69[local100 - 1][local106] & 0x43A40000) == 0 && (local69[local100 - 1][local106 + 1] & 0x4E240000) == 0) {
				Static272.anIntArray266[local64] = local7 - 1;
				Static403.anIntArray393[local64] = local9;
				Static238.anIntArrayArray33[local89 - 1][local94] = 2;
				local64 = local64 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local89 - 1][local94] = local278;
			}
			if (local89 < 126 && Static238.anIntArrayArray33[local89 + 1][local94] == 0 && (local69[local100 + 2][local106] & 0x60E40000) == 0 && (local69[local100 + 2][local106 + 1] & 0x78240000) == 0) {
				Static272.anIntArray266[local64] = local7 + 1;
				Static403.anIntArray393[local64] = local9;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89 + 1][local94] = 8;
				Static617.anIntArrayArray59[local89 + 1][local94] = local278;
			}
			if (local94 > 0 && Static238.anIntArrayArray33[local89][local94 - 1] == 0 && (local69[local100][local106 - 1] & 0x43A40000) == 0 && (local69[local100 + 1][local106 - 1] & 0x60E40000) == 0) {
				Static272.anIntArray266[local64] = local7;
				Static403.anIntArray393[local64] = local9 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89][local94 - 1] = 1;
				Static617.anIntArrayArray59[local89][local94 - 1] = local278;
			}
			if (local94 < 126 && Static238.anIntArrayArray33[local89][local94 + 1] == 0 && (local69[local100][local106 + 2] & 0x4E240000) == 0 && (local69[local100 + 1][local106 + 2] & 0x78240000) == 0) {
				Static272.anIntArray266[local64] = local7;
				Static403.anIntArray393[local64] = local9 + 1;
				Static238.anIntArrayArray33[local89][local94 + 1] = 4;
				local64 = local64 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local89][local94 + 1] = local278;
			}
			if (local89 > 0 && local94 > 0 && Static238.anIntArrayArray33[local89 - 1][local94 - 1] == 0 && (local69[local100 - 1][local106] & 0x4FA40000) == 0 && (local69[local100 - 1][local106 - 1] & 0x43A40000) == 0 && (local69[local100][local106 - 1] & 0x63E40000) == 0) {
				Static272.anIntArray266[local64] = local7 - 1;
				Static403.anIntArray393[local64] = local9 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89 - 1][local94 - 1] = 3;
				Static617.anIntArrayArray59[local89 - 1][local94 - 1] = local278;
			}
			if (local89 < 126 && local94 > 0 && Static238.anIntArrayArray33[local89 + 1][local94 - 1] == 0 && (local69[local100 + 1][local106 - 1] & 0x63E40000) == 0 && (local69[local100 + 2][local106 - 1] & 0x60E40000) == 0 && (local69[local100 + 2][local106] & 0x78E40000) == 0) {
				Static272.anIntArray266[local64] = local7 + 1;
				Static403.anIntArray393[local64] = local9 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89 + 1][local94 - 1] = 9;
				Static617.anIntArrayArray59[local89 + 1][local94 - 1] = local278;
			}
			if (local89 > 0 && local94 < 126 && Static238.anIntArrayArray33[local89 - 1][local94 + 1] == 0 && (local69[local100 - 1][local106 + 1] & 0x4FA40000) == 0 && (local69[local100 - 1][local106 + 2] & 0x4E240000) == 0 && (local69[local100][local106 + 2] & 0x7E240000) == 0) {
				Static272.anIntArray266[local64] = local7 - 1;
				Static403.anIntArray393[local64] = local9 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89 - 1][local94 + 1] = 6;
				Static617.anIntArrayArray59[local89 - 1][local94 + 1] = local278;
			}
			if (local89 < 126 && local94 < 126 && Static238.anIntArrayArray33[local89 + 1][local94 + 1] == 0 && (local69[local100 + 1][local106 + 2] & 0x7E240000) == 0 && (local69[local100 + 2][local106 + 2] & 0x78240000) == 0 && (local69[local100 + 2][local106 + 1] & 0x78E40000) == 0) {
				Static272.anIntArray266[local64] = local7 + 1;
				Static403.anIntArray393[local64] = local9 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local89 + 1][local94 + 1] = 12;
				Static617.anIntArrayArray59[local89 + 1][local94 + 1] = local278;
			}
		}
		Static458.anInt7397 = local7;
		Static388.anInt6572 = local9;
		return false;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	public static void method8444() throws Exception_Sub1 {
		if (Static181.anInt3401 == 1) {
			Static548.aClass100_13.method8582(Static208.anInt3698, Static251.anInt4580);
		} else {
			Static548.aClass100_13.method8582(0, 0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!pj;I[[B)V")
	public static void method8445(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt7399; local14++) {
			Static455.method6423();
			for (local20 = 0; local20 < Static271.anInt4910 >> 3; local20++) {
				for (local24 = 0; local24 < Static613.anInt9909 >> 3; local24++) {
					local34 = Static653.anIntArrayArrayArray20[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean505 || local44 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static75.anIntArray68.length; local81++) {
								if (Static75.anIntArray68[local81] == local79 && arg2[local81] != null) {
									@Pc(103) Class5_Sub36 local103 = new Class5_Sub36(arg2[local81]);
									arg0.method6459(local24 * 8, local57, local69, local103, local20 * 8, local44, local63, local14, Static553.aClass169Array1);
									arg0.method6462(local63, local57, local44, local69, local20 * 8, local103, local12[0] == -1 ? local12 : null, local14, local24 * 8, Static273.aClass100_6);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt7399; local20++) {
			Static455.method6423();
			for (local24 = 0; local24 < Static271.anInt4910 >> 3; local24++) {
				for (local34 = 0; local34 < Static613.anInt9909 >> 3; local34++) {
					local44 = Static653.anIntArrayArrayArray20[local20][local24][local34];
					if (local44 == -1) {
						arg0.method6453(local24 * 8, local34 * 8, local20, 8, 8);
					}
				}
			}
		}
		if (arg1 <= 50) {
			anInt9937 = 105;
		}
		if (local12[0] != -1) {
			Static572.aClass173_1 = Static635.aClass356_1.method8133(local12[0], Static332.aClass161_1, local12[1], local12[2], local12[3]);
			Static443.anInt7298 = local12[4];
		}
	}
}
