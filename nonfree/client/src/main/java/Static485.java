import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!hd;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!kr;")
	public static Class196 aClass196_8;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!km;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Lclient!sea;")
	public static Class308 aClass308_165;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)I")
	public static int method6695(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIILclient!nn;IIIIIII)Z")
	public static boolean method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg8 - 64;
		Static69.anIntArrayArray6[64][64] = 99;
		Static581.anIntArrayArray56[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static379.anIntArray393[0] = arg6;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static181.anIntArray160[0] = arg8;
		@Pc(51) int[][] local51 = arg3.anIntArrayArray34;
		while (local43 != local46) {
			local7 = Static379.anIntArray393[local43];
			local9 = Static181.anIntArray160[local43];
			@Pc(71) int local71 = local9 - local23;
			@Pc(75) int local75 = local7 - local18;
			local43 = local43 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg3.anInt6474;
			@Pc(93) int local93 = local9 - arg3.anInt6475;
			if (arg2 == -4) {
				if (arg0 == local7 && arg1 == local9) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static371.method5426(local7, 2, arg0, 2, arg4, arg9, local9, arg1)) {
					Static427.anInt7668 = local9;
					Static146.anInt2805 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg3.method5251(arg0, arg9, local7, local9, arg4, arg5, 2, 2, arg1)) {
					Static427.anInt7668 = local9;
					Static146.anInt2805 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg3.method5263(arg5, local9, arg1, arg9, arg4, local7, 2, arg0)) {
					Static427.anInt7668 = local9;
					Static146.anInt2805 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg3.method5249(local7, arg7, arg2, arg0, arg1, local9, 2)) {
					Static146.anInt2805 = local7;
					Static427.anInt7668 = local9;
					return true;
				}
			} else if (arg3.method5262(2, local9, arg7, arg0, arg2, arg1, local7)) {
				Static146.anInt2805 = local7;
				Static427.anInt7668 = local9;
				return true;
			}
			@Pc(245) int local245 = Static581.anIntArrayArray56[local75][local71] + 1;
			if (local75 > 0 && Static69.anIntArrayArray6[local75 - 1][local71] == 0 && (local51[local87 - 1][local93] & 0x43A40000) == 0 && (local51[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static379.anIntArray393[local46] = local7 - 1;
				Static181.anIntArray160[local46] = local9;
				Static69.anIntArrayArray6[local75 - 1][local71] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local75 - 1][local71] = local245;
			}
			if (local75 < 126 && Static69.anIntArrayArray6[local75 + 1][local71] == 0 && (local51[local87 + 2][local93] & 0x60E40000) == 0 && (local51[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static379.anIntArray393[local46] = local7 + 1;
				Static181.anIntArray160[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local75 + 1][local71] = 8;
				Static581.anIntArrayArray56[local75 + 1][local71] = local245;
			}
			if (local71 > 0 && Static69.anIntArrayArray6[local75][local71 - 1] == 0 && (local51[local87][local93 - 1] & 0x43A40000) == 0 && (local51[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static379.anIntArray393[local46] = local7;
				Static181.anIntArray160[local46] = local9 - 1;
				Static69.anIntArrayArray6[local75][local71 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local75][local71 - 1] = local245;
			}
			if (local71 < 126 && Static69.anIntArrayArray6[local75][local71 + 1] == 0 && (local51[local87][local93 + 2] & 0x4E240000) == 0 && (local51[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static379.anIntArray393[local46] = local7;
				Static181.anIntArray160[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local75][local71 + 1] = 4;
				Static581.anIntArrayArray56[local75][local71 + 1] = local245;
			}
			if (local75 > 0 && local71 > 0 && Static69.anIntArrayArray6[local75 - 1][local71 - 1] == 0 && (local51[local87 - 1][local93] & 0x4FA40000) == 0 && (local51[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local51[local87][local93 - 1] & 0x63E40000) == 0) {
				Static379.anIntArray393[local46] = local7 - 1;
				Static181.anIntArray160[local46] = local9 - 1;
				Static69.anIntArrayArray6[local75 - 1][local71 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local75 - 1][local71 - 1] = local245;
			}
			if (local75 < 126 && local71 > 0 && Static69.anIntArrayArray6[local75 + 1][local71 - 1] == 0 && (local51[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local51[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local51[local87 + 2][local93] & 0x78E40000) == 0) {
				Static379.anIntArray393[local46] = local7 + 1;
				Static181.anIntArray160[local46] = local9 - 1;
				Static69.anIntArrayArray6[local75 + 1][local71 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local75 + 1][local71 - 1] = local245;
			}
			if (local75 > 0 && local71 < 126 && Static69.anIntArrayArray6[local75 - 1][local71 + 1] == 0 && (local51[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local51[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local51[local87][local93 + 2] & 0x7E240000) == 0) {
				Static379.anIntArray393[local46] = local7 - 1;
				Static181.anIntArray160[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local75 - 1][local71 + 1] = 6;
				Static581.anIntArrayArray56[local75 - 1][local71 + 1] = local245;
			}
			if (local75 < 126 && local71 < 126 && Static69.anIntArrayArray6[local75 + 1][local71 + 1] == 0 && (local51[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local51[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local51[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static379.anIntArray393[local46] = local7 + 1;
				Static181.anIntArray160[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static69.anIntArrayArray6[local75 + 1][local71 + 1] = 12;
				Static581.anIntArrayArray56[local75 + 1][local71 + 1] = local245;
			}
		}
		Static146.anInt2805 = local7;
		Static427.anInt7668 = local9;
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZII)V")
	public static void method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static86.aClass1_Sub30_Sub1_1.anInt6185 != 0 && arg2 != 0 && Static439.anInt8379 < 50 && arg4 != -1) {
			Static73.aClass239Array1[Static439.anInt8379++] = new Class239((byte) 1, arg4, arg2, arg0, arg1, 0, arg3, null);
		}
	}
}
