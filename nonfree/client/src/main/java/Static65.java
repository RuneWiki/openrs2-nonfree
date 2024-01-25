import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
	public static int anInt11081;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Z")
	public static boolean aBoolean754 = false;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Lclient!sd;")
	public static final Class309 aClass309_14 = new Class309();

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
	public static int anInt11083 = 0;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)[I")
	public static int[] method9240() {
		return new int[] { Static265.anInt5654, Static208.anInt4697, Static615.anInt10774 };
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I")
	public static int method9241(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIILclient!fe;IIII)Z")
	public static boolean method9243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class104 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg9 - 64;
		Static475.anIntArrayArray57[64][64] = 99;
		@Pc(29) int local29 = arg2 - 64;
		Static5.anIntArrayArray1[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static407.anIntArray495[0] = arg9;
		@Pc(46) int local46 = local37 + 1;
		Static485.anIntArray581[0] = arg2;
		@Pc(51) int[][] local51 = arg6.anIntArrayArray17;
		while (local46 != local39) {
			local9 = Static485.anIntArray581[local39];
			local7 = Static407.anIntArray495[local39];
			@Pc(67) int local67 = local9 - arg6.anInt3573;
			@Pc(72) int local72 = local7 - local18;
			@Pc(76) int local76 = local9 - local29;
			@Pc(82) int local82 = local7 - arg6.anInt3585;
			local39 = local39 + 1 & 0xFFF;
			if (arg7 == -4) {
				if (local7 == arg0 && arg1 == local9) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static164.method3541(arg5, arg1, 1, local7, local9, arg0, 1, arg8)) {
					Static359.anInt7117 = local9;
					Static604.anInt10625 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg6.method3252(arg0, arg4, 1, arg8, local7, 1, local9, arg1, arg5)) {
					Static359.anInt7117 = local9;
					Static604.anInt10625 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg6.method3258(local7, arg1, 1, arg8, arg5, arg4, local9, arg0)) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg6.method3250(arg0, local9, 1, arg3, local7, arg1, arg7)) {
					Static359.anInt7117 = local9;
					Static604.anInt10625 = local7;
					return true;
				}
			} else if (arg6.method3259(arg1, local9, arg0, local7, arg7, arg3, 1)) {
				Static604.anInt10625 = local7;
				Static359.anInt7117 = local9;
				return true;
			}
			@Pc(238) int local238 = Static5.anIntArrayArray1[local72][local76] + 1;
			if (local72 > 0 && Static475.anIntArrayArray57[local72 - 1][local76] == 0 && (local51[local82 - 1][local67] & 0x42240000) == 0) {
				Static407.anIntArray495[local46] = local7 - 1;
				Static485.anIntArray581[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local72 - 1][local76] = 2;
				Static5.anIntArrayArray1[local72 - 1][local76] = local238;
			}
			if (local72 < 127 && Static475.anIntArrayArray57[local72 + 1][local76] == 0 && (local51[local82 + 1][local67] & 0x60240000) == 0) {
				Static407.anIntArray495[local46] = local7 + 1;
				Static485.anIntArray581[local46] = local9;
				Static475.anIntArrayArray57[local72 + 1][local76] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local72 + 1][local76] = local238;
			}
			if (local76 > 0 && Static475.anIntArrayArray57[local72][local76 - 1] == 0 && (local51[local82][local67 - 1] & 0x40A40000) == 0) {
				Static407.anIntArray495[local46] = local7;
				Static485.anIntArray581[local46] = local9 - 1;
				Static475.anIntArrayArray57[local72][local76 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local72][local76 - 1] = local238;
			}
			if (local76 < 127 && Static475.anIntArrayArray57[local72][local76 + 1] == 0 && (local51[local82][local67 + 1] & 0x48240000) == 0) {
				Static407.anIntArray495[local46] = local7;
				Static485.anIntArray581[local46] = local9 + 1;
				Static475.anIntArrayArray57[local72][local76 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local72][local76 + 1] = local238;
			}
			if (local72 > 0 && local76 > 0 && Static475.anIntArrayArray57[local72 - 1][local76 - 1] == 0 && (local51[local82 - 1][local67 - 1] & 0x43A40000) == 0 && (local51[local82 - 1][local67] & 0x42240000) == 0 && (local51[local82][local67 - 1] & 0x40A40000) == 0) {
				Static407.anIntArray495[local46] = local7 - 1;
				Static485.anIntArray581[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local72 - 1][local76 - 1] = 3;
				Static5.anIntArrayArray1[local72 - 1][local76 - 1] = local238;
			}
			if (local72 < 127 && local76 > 0 && Static475.anIntArrayArray57[local72 + 1][local76 - 1] == 0 && (local51[local82 + 1][local67 - 1] & 0x60E40000) == 0 && (local51[local82 + 1][local67] & 0x60240000) == 0 && (local51[local82][local67 - 1] & 0x40A40000) == 0) {
				Static407.anIntArray495[local46] = local7 + 1;
				Static485.anIntArray581[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local72 + 1][local76 - 1] = 9;
				Static5.anIntArrayArray1[local72 + 1][local76 - 1] = local238;
			}
			if (local72 > 0 && local76 < 127 && Static475.anIntArrayArray57[local72 - 1][local76 + 1] == 0 && (local51[local82 - 1][local67 + 1] & 0x4E240000) == 0 && (local51[local82 - 1][local67] & 0x42240000) == 0 && (local51[local82][local67 + 1] & 0x48240000) == 0) {
				Static407.anIntArray495[local46] = local7 - 1;
				Static485.anIntArray581[local46] = local9 + 1;
				Static475.anIntArrayArray57[local72 - 1][local76 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local72 - 1][local76 + 1] = local238;
			}
			if (local72 < 127 && local76 < 127 && Static475.anIntArrayArray57[local72 + 1][local76 + 1] == 0 && (local51[local82 + 1][local67 + 1] & 0x78240000) == 0 && (local51[local82 + 1][local67] & 0x60240000) == 0 && (local51[local82][local67 + 1] & 0x48240000) == 0) {
				Static407.anIntArray495[local46] = local7 + 1;
				Static485.anIntArray581[local46] = local9 + 1;
				Static475.anIntArrayArray57[local72 + 1][local76 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local72 + 1][local76 + 1] = local238;
			}
		}
		Static604.anInt10625 = local7;
		Static359.anInt7117 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)[Lclient!hv;")
	public static Class141[] method9244() {
		return new Class141[] { Static444.aClass141_1, Static444.aClass141_2, Static444.aClass141_3, Static444.aClass141_4, Static444.aClass141_5, Static444.aClass141_6, Static444.aClass141_7, Static444.aClass141_8, Static444.aClass141_9, Static444.aClass141_10, Static444.aClass141_11, Static444.aClass141_12, Static444.aClass141_13, Static444.aClass141_14 };
	}
}
