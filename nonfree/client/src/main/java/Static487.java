import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!su", name = "D", descriptor = "I")
	public static int anInt8209;

	@OriginalMember(owner = "client!su", name = "y", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_86 = new Class70(62, 8);

	@OriginalMember(owner = "client!su", name = "A", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_87 = new Class70(14, 7);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIILclient!cp;III)Z")
	public static boolean method6596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class59 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg8;
		@Pc(14) int local14 = arg4;
		@Pc(23) int local23 = arg8 - 64;
		@Pc(28) int local28 = arg4 - 64;
		Static546.anIntArrayArray195[64][64] = 99;
		Static485.anIntArrayArray180[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static145.anIntArray230[0] = arg8;
		@Pc(51) int local51 = local42 + 1;
		Static286.anIntArray636[0] = arg4;
		@Pc(56) int[][] local56 = arg6.anIntArrayArray34;
		while (local44 != local51) {
			local12 = Static145.anIntArray230[local44];
			local14 = Static286.anIntArray636[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(77) int local77 = local14 - local28;
			@Pc(82) int local82 = local12 - local23;
			@Pc(88) int local88 = local12 - arg6.anInt1345;
			@Pc(93) int local93 = local14 - arg6.anInt1342;
			if (arg1 == -4) {
				if (arg3 == local12 && arg9 == local14) {
					Static215.anInt4124 = local14;
					Static115.anInt2240 = local12;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static113.method1786(arg2, arg7, 2, local12, local14, arg3, 2, arg9)) {
					Static215.anInt4124 = local14;
					Static115.anInt2240 = local12;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg6.method1193(2, arg7, arg3, local14, arg9, arg0, local12, 2, arg2)) {
					Static215.anInt4124 = local14;
					Static115.anInt2240 = local12;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg6.method1195(arg9, arg7, arg2, arg3, local14, local12, arg0, 2)) {
					Static215.anInt4124 = local14;
					Static115.anInt2240 = local12;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg6.method1181(local12, arg1, arg5, arg3, local14, 2, arg9)) {
					Static215.anInt4124 = local14;
					Static115.anInt2240 = local12;
					return true;
				}
			} else if (arg6.method1186(2, arg1, local14, arg3, arg9, arg5, local12)) {
				Static215.anInt4124 = local14;
				Static115.anInt2240 = local12;
				return true;
			}
			@Pc(239) int local239 = Static485.anIntArrayArray180[local82][local77] + 1;
			if (local82 > 0 && Static546.anIntArrayArray195[local82 - 1][local77] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static145.anIntArray230[local51] = local12 - 1;
				Static286.anIntArray636[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 - 1][local77] = 2;
				Static485.anIntArrayArray180[local82 - 1][local77] = local239;
			}
			if (local82 < 126 && Static546.anIntArrayArray195[local82 + 1][local77] == 0 && (local56[local88 + 2][local93] & 0x60E40000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static145.anIntArray230[local51] = local12 + 1;
				Static286.anIntArray636[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 + 1][local77] = 8;
				Static485.anIntArrayArray180[local82 + 1][local77] = local239;
			}
			if (local77 > 0 && Static546.anIntArrayArray195[local82][local77 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static145.anIntArray230[local51] = local12;
				Static286.anIntArray636[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82][local77 - 1] = 1;
				Static485.anIntArrayArray180[local82][local77 - 1] = local239;
			}
			if (local77 < 126 && Static546.anIntArrayArray195[local82][local77 + 1] == 0 && (local56[local88][local93 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static145.anIntArray230[local51] = local12;
				Static286.anIntArray636[local51] = local14 + 1;
				Static546.anIntArrayArray195[local82][local77 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static485.anIntArrayArray180[local82][local77 + 1] = local239;
			}
			if (local82 > 0 && local77 > 0 && Static546.anIntArrayArray195[local82 - 1][local77 - 1] == 0 && (local56[local88 - 1][local93] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local88][local93 - 1] & 0x63E40000) == 0) {
				Static145.anIntArray230[local51] = local12 - 1;
				Static286.anIntArray636[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 - 1][local77 - 1] = 3;
				Static485.anIntArrayArray180[local82 - 1][local77 - 1] = local239;
			}
			if (local82 < 126 && local77 > 0 && Static546.anIntArrayArray195[local82 + 1][local77 - 1] == 0 && (local56[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local93] & 0x78E40000) == 0) {
				Static145.anIntArray230[local51] = local12 + 1;
				Static286.anIntArray636[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 + 1][local77 - 1] = 9;
				Static485.anIntArrayArray180[local82 + 1][local77 - 1] = local239;
			}
			if (local82 > 0 && local77 < 126 && Static546.anIntArrayArray195[local82 - 1][local77 + 1] == 0 && (local56[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local88][local93 + 2] & 0x7E240000) == 0) {
				Static145.anIntArray230[local51] = local12 - 1;
				Static286.anIntArray636[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static546.anIntArrayArray195[local82 - 1][local77 + 1] = 6;
				Static485.anIntArrayArray180[local82 - 1][local77 + 1] = local239;
			}
			if (local82 < 126 && local77 < 126 && Static546.anIntArrayArray195[local82 + 1][local77 + 1] == 0 && (local56[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static145.anIntArray230[local51] = local12 + 1;
				Static286.anIntArray636[local51] = local14 + 1;
				Static546.anIntArrayArray195[local82 + 1][local77 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static485.anIntArrayArray180[local82 + 1][local77 + 1] = local239;
			}
		}
		Static115.anInt2240 = local12;
		Static215.anInt4124 = local14;
		return false;
	}
}
