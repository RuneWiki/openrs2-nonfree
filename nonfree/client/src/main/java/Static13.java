import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_1 = new Class213(9, 15);

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_2 = new Class213(5, 2);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIILclient!pe;IIIII)Z")
	public static boolean method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class178 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg7;
		@Pc(23) int local23 = arg2 - 64;
		Static233.anIntArrayArray31[64][64] = 99;
		@Pc(34) int local34 = arg7 - 64;
		Static39.anIntArrayArray5[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static326.anIntArray523[0] = arg2;
		@Pc(51) int local51 = local42 + 1;
		Static313.anIntArray503[0] = arg7;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray34;
		while (local51 != local44) {
			local7 = Static326.anIntArray523[local44];
			local9 = Static313.anIntArray503[local44];
			@Pc(71) int local71 = local9 - local34;
			@Pc(76) int local76 = local7 - arg4.anInt4991;
			@Pc(81) int local81 = local7 - local23;
			@Pc(87) int local87 = local9 - arg4.anInt4995;
			local44 = local44 + 1 & 0xFFF;
			if (arg1 == -4) {
				if (local7 == arg8 && arg5 == local9) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static207.method3777(arg9, arg8, local7, arg5, local9, arg3, 1, 1)) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg4.method4477(arg3, 1, arg6, arg5, local9, arg9, local7, arg8, 1)) {
					Static123.anInt5934 = local9;
					Static15.anInt269 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg4.method4478(local7, arg5, 1, local9, arg6, arg8, arg3, arg9)) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg4.method4474(arg0, local9, arg5, arg1, arg8, 1, local7)) {
					Static15.anInt269 = local7;
					Static123.anInt5934 = local9;
					return true;
				}
			} else if (arg4.method4475(local7, arg5, arg0, arg8, local9, 1, arg1)) {
				Static15.anInt269 = local7;
				Static123.anInt5934 = local9;
				return true;
			}
			@Pc(237) int local237 = Static39.anIntArrayArray5[local81][local71] + 1;
			if (local81 > 0 && Static233.anIntArrayArray31[local81 - 1][local71] == 0 && (local56[local76 - 1][local87] & 0x42240000) == 0) {
				Static326.anIntArray523[local51] = local7 - 1;
				Static313.anIntArray503[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81 - 1][local71] = 2;
				Static39.anIntArrayArray5[local81 - 1][local71] = local237;
			}
			if (local81 < 127 && Static233.anIntArrayArray31[local81 + 1][local71] == 0 && (local56[local76 + 1][local87] & 0x60240000) == 0) {
				Static326.anIntArray523[local51] = local7 + 1;
				Static313.anIntArray503[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81 + 1][local71] = 8;
				Static39.anIntArrayArray5[local81 + 1][local71] = local237;
			}
			if (local71 > 0 && Static233.anIntArrayArray31[local81][local71 - 1] == 0 && (local56[local76][local87 - 1] & 0x40A40000) == 0) {
				Static326.anIntArray523[local51] = local7;
				Static313.anIntArray503[local51] = local9 - 1;
				Static233.anIntArrayArray31[local81][local71 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local81][local71 - 1] = local237;
			}
			if (local71 < 127 && Static233.anIntArrayArray31[local81][local71 + 1] == 0 && (local56[local76][local87 + 1] & 0x48240000) == 0) {
				Static326.anIntArray523[local51] = local7;
				Static313.anIntArray503[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81][local71 + 1] = 4;
				Static39.anIntArrayArray5[local81][local71 + 1] = local237;
			}
			if (local81 > 0 && local71 > 0 && Static233.anIntArrayArray31[local81 - 1][local71 - 1] == 0 && (local56[local76 - 1][local87 - 1] & 0x43A40000) == 0 && (local56[local76 - 1][local87] & 0x42240000) == 0 && (local56[local76][local87 - 1] & 0x40A40000) == 0) {
				Static326.anIntArray523[local51] = local7 - 1;
				Static313.anIntArray503[local51] = local9 - 1;
				Static233.anIntArrayArray31[local81 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local81 - 1][local71 - 1] = local237;
			}
			if (local81 < 127 && local71 > 0 && Static233.anIntArrayArray31[local81 + 1][local71 - 1] == 0 && (local56[local76 + 1][local87 - 1] & 0x60E40000) == 0 && (local56[local76 + 1][local87] & 0x60240000) == 0 && (local56[local76][local87 - 1] & 0x40A40000) == 0) {
				Static326.anIntArray523[local51] = local7 + 1;
				Static313.anIntArray503[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81 + 1][local71 - 1] = 9;
				Static39.anIntArrayArray5[local81 + 1][local71 - 1] = local237;
			}
			if (local81 > 0 && local71 < 127 && Static233.anIntArrayArray31[local81 - 1][local71 + 1] == 0 && (local56[local76 - 1][local87 + 1] & 0x4E240000) == 0 && (local56[local76 - 1][local87] & 0x42240000) == 0 && (local56[local76][local87 + 1] & 0x48240000) == 0) {
				Static326.anIntArray523[local51] = local7 - 1;
				Static313.anIntArray503[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81 - 1][local71 + 1] = 6;
				Static39.anIntArrayArray5[local81 - 1][local71 + 1] = local237;
			}
			if (local81 < 127 && local71 < 127 && Static233.anIntArrayArray31[local81 + 1][local71 + 1] == 0 && (local56[local76 + 1][local87 + 1] & 0x78240000) == 0 && (local56[local76 + 1][local87] & 0x60240000) == 0 && (local56[local76][local87 + 1] & 0x48240000) == 0) {
				Static326.anIntArray523[local51] = local7 + 1;
				Static313.anIntArray503[local51] = local9 + 1;
				Static233.anIntArrayArray31[local81 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static39.anIntArrayArray5[local81 + 1][local71 + 1] = local237;
			}
		}
		Static15.anInt269 = local7;
		Static123.anInt5934 = local9;
		return false;
	}
}
