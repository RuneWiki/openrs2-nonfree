import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "Lclient!vn;")
	public static Class101 aClass101_2;

	@OriginalMember(owner = "client!wn", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray148;

	@OriginalMember(owner = "client!wn", name = "Y", descriptor = "Lclient!nt;")
	public static Class177 aClass177_5;

	@OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
	public static int anInt7264 = 100;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!mk;IIIIIIIZII)Z")
	public static boolean method5883(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(28) int local28 = arg8 - 64;
		Static410.anIntArrayArray48[64][64] = 99;
		Static381.anIntArrayArray47[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static99.anIntArray134[0] = arg9;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static89.anIntArray129[0] = arg8;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray39;
		while (local51 != local48) {
			local7 = Static99.anIntArray134[local48];
			local9 = Static89.anIntArray129[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local28;
			@Pc(88) int local88 = local7 - arg0.anInt4542;
			@Pc(94) int local94 = local9 - arg0.anInt4550;
			if (arg3 == -4) {
				if (local7 == arg7 && arg1 == local9) {
					Static103.anInt6432 = local7;
					Static44.anInt641 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static132.method5178(arg6, 2, arg1, local7, arg7, arg4, 2, local9)) {
					Static103.anInt6432 = local7;
					Static44.anInt641 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg0.method3625(local7, 2, arg7, arg1, arg4, local9, 2, arg6, arg5)) {
					Static103.anInt6432 = local7;
					Static44.anInt641 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg0.method3618(arg4, 2, arg7, arg1, local9, arg5, local7, arg6)) {
					Static44.anInt641 = local9;
					Static103.anInt6432 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg0.method3613(local9, 2, arg3, arg2, arg1, arg7, local7)) {
					Static44.anInt641 = local9;
					Static103.anInt6432 = local7;
					return true;
				}
			} else if (arg0.method3615(arg2, arg1, arg7, arg3, 2, local7, local9)) {
				Static103.anInt6432 = local7;
				Static44.anInt641 = local9;
				return true;
			}
			@Pc(248) int local248 = Static381.anIntArrayArray47[local77][local82] + 1;
			if (local77 > 0 && Static410.anIntArrayArray48[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local77 - 1][local82] = 2;
				Static381.anIntArrayArray47[local77 - 1][local82] = local248;
			}
			if (local77 < 126 && Static410.anIntArrayArray48[local77 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local77 + 1][local82] = 8;
				Static381.anIntArrayArray47[local77 + 1][local82] = local248;
			}
			if (local82 > 0 && Static410.anIntArrayArray48[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static99.anIntArray134[local51] = local7;
				Static89.anIntArray129[local51] = local9 - 1;
				Static410.anIntArrayArray48[local77][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local77][local82 - 1] = local248;
			}
			if (local82 < 126 && Static410.anIntArrayArray48[local77][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static99.anIntArray134[local51] = local7;
				Static89.anIntArray129[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local77][local82 + 1] = 4;
				Static381.anIntArrayArray47[local77][local82 + 1] = local248;
			}
			if (local77 > 0 && local82 > 0 && Static410.anIntArrayArray48[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9 - 1;
				Static410.anIntArrayArray48[local77 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local77 - 1][local82 - 1] = local248;
			}
			if (local77 < 126 && local82 > 0 && Static410.anIntArrayArray48[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local77 + 1][local82 - 1] = 9;
				Static381.anIntArrayArray47[local77 + 1][local82 - 1] = local248;
			}
			if (local77 > 0 && local82 < 126 && Static410.anIntArrayArray48[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9 + 1;
				Static410.anIntArrayArray48[local77 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local77 - 1][local82 + 1] = local248;
			}
			if (local77 < 126 && local82 < 126 && Static410.anIntArrayArray48[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9 + 1;
				Static410.anIntArrayArray48[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local77 + 1][local82 + 1] = local248;
			}
		}
		Static103.anInt6432 = local7;
		Static44.anInt641 = local9;
		return false;
	}
}
