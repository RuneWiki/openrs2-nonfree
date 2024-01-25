import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
	public static final int[] anIntArray44 = new int[2048];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIIILclient!uh;)Z")
	public static boolean method822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class240 arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg1;
		@Pc(23) int local23 = arg8 - 64;
		Static73.anIntArrayArray6[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static93.anIntArrayArray9[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static37.anIntArray34[0] = arg8;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static168.anIntArray365[0] = arg1;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray60;
		while (local48 != local51) {
			local9 = Static168.anIntArray365[local48];
			local7 = Static37.anIntArray34[local48];
			@Pc(71) int local71 = local9 - local34;
			local48 = local48 + 1 & 0xFFF;
			@Pc(81) int local81 = local7 - local23;
			@Pc(86) int local86 = local7 - arg9.anInt6848;
			@Pc(91) int local91 = local9 - arg9.anInt6844;
			if (arg0 == -4) {
				if (local7 == arg6 && arg4 == local9) {
					Static116.anInt1976 = local9;
					Static134.anInt2388 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static246.method3174(local7, 2, arg6, arg4, local9, arg3, arg5, 2)) {
					Static116.anInt1976 = local9;
					Static134.anInt2388 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg9.method5418(local9, 2, arg5, arg6, 2, local7, arg4, arg2, arg3)) {
					Static134.anInt2388 = local7;
					Static116.anInt1976 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg9.method5421(arg2, local9, 2, arg5, arg3, arg4, arg6, local7)) {
					Static134.anInt2388 = local7;
					Static116.anInt1976 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg9.method5420(local7, arg0, local9, arg7, 2, arg4, arg6)) {
					Static134.anInt2388 = local7;
					Static116.anInt1976 = local9;
					return true;
				}
			} else if (arg9.method5410(arg0, local9, arg4, arg7, arg6, 2, local7)) {
				Static134.anInt2388 = local7;
				Static116.anInt1976 = local9;
				return true;
			}
			@Pc(234) int local234 = Static93.anIntArrayArray9[local81][local71] + 1;
			if (local81 > 0 && Static73.anIntArrayArray6[local81 - 1][local71] == 0 && (local56[local86 - 1][local91] & 0x43A40000) == 0 && (local56[local86 - 1][local91 + 1] & 0x4E240000) == 0) {
				Static37.anIntArray34[local51] = local7 - 1;
				Static168.anIntArray365[local51] = local9;
				Static73.anIntArrayArray6[local81 - 1][local71] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local81 - 1][local71] = local234;
			}
			if (local81 < 126 && Static73.anIntArrayArray6[local81 + 1][local71] == 0 && (local56[local86 + 2][local91] & 0x60E40000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78240000) == 0) {
				Static37.anIntArray34[local51] = local7 + 1;
				Static168.anIntArray365[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local81 + 1][local71] = 8;
				Static93.anIntArrayArray9[local81 + 1][local71] = local234;
			}
			if (local71 > 0 && Static73.anIntArrayArray6[local81][local71 - 1] == 0 && (local56[local86][local91 - 1] & 0x43A40000) == 0 && (local56[local86 + 1][local91 - 1] & 0x60E40000) == 0) {
				Static37.anIntArray34[local51] = local7;
				Static168.anIntArray365[local51] = local9 - 1;
				Static73.anIntArrayArray6[local81][local71 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local81][local71 - 1] = local234;
			}
			if (local71 < 126 && Static73.anIntArrayArray6[local81][local71 + 1] == 0 && (local56[local86][local91 + 2] & 0x4E240000) == 0 && (local56[local86 + 1][local91 + 2] & 0x78240000) == 0) {
				Static37.anIntArray34[local51] = local7;
				Static168.anIntArray365[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local81][local71 + 1] = 4;
				Static93.anIntArrayArray9[local81][local71 + 1] = local234;
			}
			if (local81 > 0 && local71 > 0 && Static73.anIntArrayArray6[local81 - 1][local71 - 1] == 0 && (local56[local86 - 1][local91] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local56[local86][local91 - 1] & 0x63E40000) == 0) {
				Static37.anIntArray34[local51] = local7 - 1;
				Static168.anIntArray365[local51] = local9 - 1;
				Static73.anIntArrayArray6[local81 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local81 - 1][local71 - 1] = local234;
			}
			if (local81 < 126 && local71 > 0 && Static73.anIntArrayArray6[local81 + 1][local71 - 1] == 0 && (local56[local86 + 1][local91 - 1] & 0x63E40000) == 0 && (local56[local86 + 2][local91 - 1] & 0x60E40000) == 0 && (local56[local86 + 2][local91] & 0x78E40000) == 0) {
				Static37.anIntArray34[local51] = local7 + 1;
				Static168.anIntArray365[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local81 + 1][local71 - 1] = 9;
				Static93.anIntArrayArray9[local81 + 1][local71 - 1] = local234;
			}
			if (local81 > 0 && local71 < 126 && Static73.anIntArrayArray6[local81 - 1][local71 + 1] == 0 && (local56[local86 - 1][local91 + 1] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 + 2] & 0x4E240000) == 0 && (local56[local86][local91 + 2] & 0x7E240000) == 0) {
				Static37.anIntArray34[local51] = local7 - 1;
				Static168.anIntArray365[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local81 - 1][local71 + 1] = 6;
				Static93.anIntArrayArray9[local81 - 1][local71 + 1] = local234;
			}
			if (local81 < 126 && local71 < 126 && Static73.anIntArrayArray6[local81 + 1][local71 + 1] == 0 && (local56[local86 + 1][local91 + 2] & 0x7E240000) == 0 && (local56[local86 + 2][local91 + 2] & 0x78240000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78E40000) == 0) {
				Static37.anIntArray34[local51] = local7 + 1;
				Static168.anIntArray365[local51] = local9 + 1;
				Static73.anIntArrayArray6[local81 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local81 + 1][local71 + 1] = local234;
			}
		}
		Static116.anInt1976 = local9;
		Static134.anInt2388 = local7;
		return false;
	}
}
