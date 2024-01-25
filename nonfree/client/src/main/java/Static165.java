import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt3157;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public static int anInt3159;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public static int anInt3162;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public static int anInt3164;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public static int anInt3165 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ac;I)Lclient!pp;")
	public static Class273 method2701(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method7940();
		return new Class273(local7);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!nn;IIIIIIII)Z")
	public static boolean method2702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg5 - 64;
		Static69.anIntArrayArray6[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static581.anIntArrayArray56[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static379.anIntArray393[0] = arg5;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local37 + 1;
		Static181.anIntArray160[0] = arg0;
		@Pc(58) int[][] local58 = arg2.anIntArrayArray34;
		while (local50 != local53) {
			local7 = Static379.anIntArray393[local50];
			local9 = Static181.anIntArray160[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(78) int local78 = local9 - local29;
			@Pc(82) int local82 = local7 - local18;
			@Pc(87) int local87 = local9 - arg2.anInt6475;
			@Pc(93) int local93 = local7 - arg2.anInt6474;
			if (arg1 == -4) {
				if (arg4 == local7 && local9 == arg7) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static371.method5426(local7, 1, arg4, 1, arg6, arg9, local9, arg7)) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg2.method5251(arg4, arg9, local7, local9, arg6, arg8, 1, 1, arg7)) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg2.method5263(arg8, local9, arg7, arg9, arg6, local7, 1, arg4)) {
					Static427.anInt7668 = local9;
					Static146.anInt2805 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg2.method5249(local7, arg3, arg1, arg4, arg7, local9, 1)) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg2.method5262(1, local9, arg3, arg4, arg1, arg7, local7)) {
				Static427.anInt7668 = local9;
				Static146.anInt2805 = local7;
				return true;
			}
			@Pc(244) int local244 = Static581.anIntArrayArray56[local82][local78] + 1;
			if (local82 > 0 && Static69.anIntArrayArray6[local82 - 1][local78] == 0 && (local58[local93 - 1][local87] & 0x42240000) == 0) {
				Static379.anIntArray393[local53] = local7 - 1;
				Static181.anIntArray160[local53] = local9;
				Static69.anIntArrayArray6[local82 - 1][local78] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local82 - 1][local78] = local244;
			}
			if (local82 < 127 && Static69.anIntArrayArray6[local82 + 1][local78] == 0 && (local58[local93 + 1][local87] & 0x60240000) == 0) {
				Static379.anIntArray393[local53] = local7 + 1;
				Static181.anIntArray160[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local82 + 1][local78] = 8;
				Static581.anIntArrayArray56[local82 + 1][local78] = local244;
			}
			if (local78 > 0 && Static69.anIntArrayArray6[local82][local78 - 1] == 0 && (local58[local93][local87 - 1] & 0x40A40000) == 0) {
				Static379.anIntArray393[local53] = local7;
				Static181.anIntArray160[local53] = local9 - 1;
				Static69.anIntArrayArray6[local82][local78 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local82][local78 - 1] = local244;
			}
			if (local78 < 127 && Static69.anIntArrayArray6[local82][local78 + 1] == 0 && (local58[local93][local87 + 1] & 0x48240000) == 0) {
				Static379.anIntArray393[local53] = local7;
				Static181.anIntArray160[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local82][local78 + 1] = 4;
				Static581.anIntArrayArray56[local82][local78 + 1] = local244;
			}
			if (local82 > 0 && local78 > 0 && Static69.anIntArrayArray6[local82 - 1][local78 - 1] == 0 && (local58[local93 - 1][local87 - 1] & 0x43A40000) == 0 && (local58[local93 - 1][local87] & 0x42240000) == 0 && (local58[local93][local87 - 1] & 0x40A40000) == 0) {
				Static379.anIntArray393[local53] = local7 - 1;
				Static181.anIntArray160[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local82 - 1][local78 - 1] = 3;
				Static581.anIntArrayArray56[local82 - 1][local78 - 1] = local244;
			}
			if (local82 < 127 && local78 > 0 && Static69.anIntArrayArray6[local82 + 1][local78 - 1] == 0 && (local58[local93 + 1][local87 - 1] & 0x60E40000) == 0 && (local58[local93 + 1][local87] & 0x60240000) == 0 && (local58[local93][local87 - 1] & 0x40A40000) == 0) {
				Static379.anIntArray393[local53] = local7 + 1;
				Static181.anIntArray160[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local82 + 1][local78 - 1] = 9;
				Static581.anIntArrayArray56[local82 + 1][local78 - 1] = local244;
			}
			if (local82 > 0 && local78 < 127 && Static69.anIntArrayArray6[local82 - 1][local78 + 1] == 0 && (local58[local93 - 1][local87 + 1] & 0x4E240000) == 0 && (local58[local93 - 1][local87] & 0x42240000) == 0 && (local58[local93][local87 + 1] & 0x48240000) == 0) {
				Static379.anIntArray393[local53] = local7 - 1;
				Static181.anIntArray160[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local82 - 1][local78 + 1] = 6;
				Static581.anIntArrayArray56[local82 - 1][local78 + 1] = local244;
			}
			if (local82 < 127 && local78 < 127 && Static69.anIntArrayArray6[local82 + 1][local78 + 1] == 0 && (local58[local93 + 1][local87 + 1] & 0x78240000) == 0 && (local58[local93 + 1][local87] & 0x60240000) == 0 && (local58[local93][local87 + 1] & 0x48240000) == 0) {
				Static379.anIntArray393[local53] = local7 + 1;
				Static181.anIntArray160[local53] = local9 + 1;
				Static69.anIntArrayArray6[local82 + 1][local78 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local82 + 1][local78 + 1] = local244;
			}
		}
		Static427.anInt7668 = local9;
		Static146.anInt2805 = local7;
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CZ)B")
	public static byte method2703(@OriginalArg(0) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Z")
	public static boolean method2704(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static31.aClass78_18.method6802();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static31.aClass78_18.method6813();
		} else if (!Static31.aClass78_18.method6854()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static86.aClass1_Sub30_Sub1_1.aBoolean474 = arg0;
			Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
			return true;
		}
	}
}
