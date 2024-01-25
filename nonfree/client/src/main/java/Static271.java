import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!le", name = "P", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
	public static int method4462(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!fd;IIIIIIIIII)Z")
	public static boolean method4463(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg8 - 64;
		Static160.anIntArrayArray35[64][64] = 99;
		Static186.anIntArrayArray38[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(44) int local44 = 0;
		Static398.anIntArray690[0] = arg6;
		@Pc(51) int local51 = local37 + 1;
		Static368.anIntArray663[0] = arg8;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray30;
		while (local44 != local51) {
			local7 = Static398.anIntArray690[local44];
			local9 = Static368.anIntArray663[local44];
			@Pc(72) int local72 = local7 - arg0.anInt2571;
			local44 = local44 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - local18;
			@Pc(88) int local88 = local9 - local23;
			@Pc(94) int local94 = local9 - arg0.anInt2587;
			if (arg5 == -4) {
				if (local7 == arg7 && local9 == arg4) {
					Static316.anInt5813 = local7;
					Static296.anInt4450 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static205.method3534(1, local9, 1, arg4, arg7, arg3, arg1, local7)) {
					Static316.anInt5813 = local7;
					Static296.anInt4450 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg0.method2181(local9, arg7, arg1, arg3, 1, 1, arg4, arg2, local7)) {
					Static296.anInt4450 = local9;
					Static316.anInt5813 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg0.method2179(arg3, arg2, local7, arg4, arg1, local9, arg7, 1)) {
					Static316.anInt5813 = local7;
					Static296.anInt4450 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg0.method2170(1, arg9, local7, local9, arg7, arg5, arg4)) {
					Static316.anInt5813 = local7;
					Static296.anInt4450 = local9;
					return true;
				}
			} else if (arg0.method2167(arg9, local9, local7, 1, arg5, arg7, arg4)) {
				Static316.anInt5813 = local7;
				Static296.anInt4450 = local9;
				return true;
			}
			@Pc(243) int local243 = Static186.anIntArrayArray38[local83][local88] + 1;
			if (local83 > 0 && Static160.anIntArrayArray35[local83 - 1][local88] == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0) {
				Static398.anIntArray690[local51] = local7 - 1;
				Static368.anIntArray663[local51] = local9;
				Static160.anIntArrayArray35[local83 - 1][local88] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local83 - 1][local88] = local243;
			}
			if (local83 < 127 && Static160.anIntArrayArray35[local83 + 1][local88] == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0) {
				Static398.anIntArray690[local51] = local7 + 1;
				Static368.anIntArray663[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local83 + 1][local88] = 8;
				Static186.anIntArrayArray38[local83 + 1][local88] = local243;
			}
			if (local88 > 0 && Static160.anIntArrayArray35[local83][local88 - 1] == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static398.anIntArray690[local51] = local7;
				Static368.anIntArray663[local51] = local9 - 1;
				Static160.anIntArrayArray35[local83][local88 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local83][local88 - 1] = local243;
			}
			if (local88 < 127 && Static160.anIntArrayArray35[local83][local88 + 1] == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static398.anIntArray690[local51] = local7;
				Static368.anIntArray663[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local83][local88 + 1] = 4;
				Static186.anIntArrayArray38[local83][local88 + 1] = local243;
			}
			if (local83 > 0 && local88 > 0 && Static160.anIntArrayArray35[local83 - 1][local88 - 1] == 0 && (local56[local72 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static398.anIntArray690[local51] = local7 - 1;
				Static368.anIntArray663[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local83 - 1][local88 - 1] = 3;
				Static186.anIntArrayArray38[local83 - 1][local88 - 1] = local243;
			}
			if (local83 < 127 && local88 > 0 && Static160.anIntArrayArray35[local83 + 1][local88 - 1] == 0 && (local56[local72 + 1][local94 - 1] & 0x60E40000) == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static398.anIntArray690[local51] = local7 + 1;
				Static368.anIntArray663[local51] = local9 - 1;
				Static160.anIntArrayArray35[local83 + 1][local88 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local83 + 1][local88 - 1] = local243;
			}
			if (local83 > 0 && local88 < 127 && Static160.anIntArrayArray35[local83 - 1][local88 + 1] == 0 && (local56[local72 - 1][local94 + 1] & 0x4E240000) == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static398.anIntArray690[local51] = local7 - 1;
				Static368.anIntArray663[local51] = local9 + 1;
				Static160.anIntArrayArray35[local83 - 1][local88 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local83 - 1][local88 + 1] = local243;
			}
			if (local83 < 127 && local88 < 127 && Static160.anIntArrayArray35[local83 + 1][local88 + 1] == 0 && (local56[local72 + 1][local94 + 1] & 0x78240000) == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static398.anIntArray690[local51] = local7 + 1;
				Static368.anIntArray663[local51] = local9 + 1;
				Static160.anIntArrayArray35[local83 + 1][local88 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local83 + 1][local88 + 1] = local243;
			}
		}
		Static316.anInt5813 = local7;
		Static296.anInt4450 = local9;
		return false;
	}
}
