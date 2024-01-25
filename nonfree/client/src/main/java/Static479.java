import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public static int anInt8091;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIILclient!cp;II)Z")
	public static boolean method6515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class59 arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg9;
		@Pc(22) int local22 = arg4 - 64;
		@Pc(27) int local27 = arg9 - 64;
		Static546.anIntArrayArray195[64][64] = 99;
		Static485.anIntArrayArray180[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static145.anIntArray230[0] = arg4;
		@Pc(50) int local50 = local41 + 1;
		Static286.anIntArray636[0] = arg9;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray34;
		while (local50 != local43) {
			local7 = Static145.anIntArray230[local43];
			local9 = Static286.anIntArray636[local43];
			@Pc(71) int local71 = local7 - arg8.anInt1345;
			@Pc(77) int local77 = local9 - arg8.anInt1342;
			@Pc(82) int local82 = local7 - local22;
			local43 = local43 + 1 & 0xFFF;
			@Pc(93) int local93 = local9 - local27;
			if (arg3 == -4) {
				if (local7 == arg6 && arg1 == local9) {
					Static115.anInt2240 = local7;
					Static215.anInt4124 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static113.method1786(arg2, arg0, 1, local7, local9, arg6, 1, arg1)) {
					Static115.anInt2240 = local7;
					Static215.anInt4124 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg8.method1193(1, arg0, arg6, local9, arg1, arg7, local7, 1, arg2)) {
					Static115.anInt2240 = local7;
					Static215.anInt4124 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg8.method1195(arg1, arg0, arg2, arg6, local9, local7, arg7, 1)) {
					Static115.anInt2240 = local7;
					Static215.anInt4124 = local9;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg8.method1181(local7, arg3, arg5, arg6, local9, 1, arg1)) {
					Static115.anInt2240 = local7;
					Static215.anInt4124 = local9;
					return true;
				}
			} else if (arg8.method1186(1, arg3, local9, arg6, arg1, arg5, local7)) {
				Static115.anInt2240 = local7;
				Static215.anInt4124 = local9;
				return true;
			}
			@Pc(244) int local244 = Static485.anIntArrayArray180[local82][local93] + 1;
			if (local82 > 0 && Static546.anIntArrayArray195[local82 - 1][local93] == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0) {
				Static145.anIntArray230[local50] = local7 - 1;
				Static286.anIntArray636[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 - 1][local93] = 2;
				Static485.anIntArrayArray180[local82 - 1][local93] = local244;
			}
			if (local82 < 127 && Static546.anIntArrayArray195[local82 + 1][local93] == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0) {
				Static145.anIntArray230[local50] = local7 + 1;
				Static286.anIntArray636[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 + 1][local93] = 8;
				Static485.anIntArrayArray180[local82 + 1][local93] = local244;
			}
			if (local93 > 0 && Static546.anIntArrayArray195[local82][local93 - 1] == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static145.anIntArray230[local50] = local7;
				Static286.anIntArray636[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82][local93 - 1] = 1;
				Static485.anIntArrayArray180[local82][local93 - 1] = local244;
			}
			if (local93 < 127 && Static546.anIntArrayArray195[local82][local93 + 1] == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static145.anIntArray230[local50] = local7;
				Static286.anIntArray636[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82][local93 + 1] = 4;
				Static485.anIntArrayArray180[local82][local93 + 1] = local244;
			}
			if (local82 > 0 && local93 > 0 && Static546.anIntArrayArray195[local82 - 1][local93 - 1] == 0 && (local55[local71 - 1][local77 - 1] & 0x43A40000) == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static145.anIntArray230[local50] = local7 - 1;
				Static286.anIntArray636[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 - 1][local93 - 1] = 3;
				Static485.anIntArrayArray180[local82 - 1][local93 - 1] = local244;
			}
			if (local82 < 127 && local93 > 0 && Static546.anIntArrayArray195[local82 + 1][local93 - 1] == 0 && (local55[local71 + 1][local77 - 1] & 0x60E40000) == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static145.anIntArray230[local50] = local7 + 1;
				Static286.anIntArray636[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 + 1][local93 - 1] = 9;
				Static485.anIntArrayArray180[local82 + 1][local93 - 1] = local244;
			}
			if (local82 > 0 && local93 < 127 && Static546.anIntArrayArray195[local82 - 1][local93 + 1] == 0 && (local55[local71 - 1][local77 + 1] & 0x4E240000) == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static145.anIntArray230[local50] = local7 - 1;
				Static286.anIntArray636[local50] = local9 + 1;
				Static546.anIntArrayArray195[local82 - 1][local93 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static485.anIntArrayArray180[local82 - 1][local93 + 1] = local244;
			}
			if (local82 < 127 && local93 < 127 && Static546.anIntArrayArray195[local82 + 1][local93 + 1] == 0 && (local55[local71 + 1][local77 + 1] & 0x78240000) == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static145.anIntArray230[local50] = local7 + 1;
				Static286.anIntArray636[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 + 1][local93 + 1] = 12;
				Static485.anIntArrayArray180[local82 + 1][local93 + 1] = local244;
			}
		}
		Static115.anInt2240 = local7;
		Static215.anInt4124 = local9;
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
	public static boolean method6516(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 21 || arg0 == 1010 || arg0 == 23 || arg0 == 50;
	}
}
