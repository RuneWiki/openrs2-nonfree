import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "[Lclient!eba;")
	public static Class68_Sub1[] aClass68_Sub1Array1;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "Lclient!kea;")
	public static Class161 aClass161_55;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIILclient!vi;IIIII)Z")
	public static boolean method4257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class306 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg7 - 64;
		Static474.anIntArrayArray80[64][64] = 99;
		@Pc(28) int local28 = arg2 - 64;
		Static290.anIntArrayArray56[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static135.anIntArray273[0] = arg7;
		@Pc(45) int local45 = local36 + 1;
		Static142.anIntArray282[0] = arg2;
		@Pc(50) int[][] local50 = arg4.anIntArrayArray85;
		while (local38 != local45) {
			local9 = Static142.anIntArray282[local38];
			local7 = Static135.anIntArray273[local38];
			local38 = local38 + 1 & 0xFFF;
			@Pc(70) int local70 = local7 - local17;
			@Pc(75) int local75 = local9 - local28;
			@Pc(81) int local81 = local7 - arg4.anInt8975;
			@Pc(87) int local87 = local9 - arg4.anInt8969;
			if (arg8 == -4) {
				if (arg3 == local7 && arg5 == local9) {
					Static335.anInt3038 = local7;
					Static23.anInt6895 = local9;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static467.method6978(arg3, 2, local9, arg0, arg5, local7, arg6, 2)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg4.method7355(local7, 2, arg6, arg9, arg5, arg3, local9, arg0, 2)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg4.method7356(arg0, local9, arg6, arg5, arg3, local7, arg9, 2)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg4.method7369(arg8, arg1, arg3, arg5, local9, local7, 2)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg4.method7368(arg3, local9, local7, arg8, 2, arg5, arg1)) {
				Static335.anInt3038 = local7;
				Static23.anInt6895 = local9;
				return true;
			}
			@Pc(243) int local243 = Static290.anIntArrayArray56[local70][local75] + 1;
			if (local70 > 0 && Static474.anIntArrayArray80[local70 - 1][local75] == 0 && (local50[local81 - 1][local87] & 0x43A40000) == 0 && (local50[local81 - 1][local87 + 1] & 0x4E240000) == 0) {
				Static135.anIntArray273[local45] = local7 - 1;
				Static142.anIntArray282[local45] = local9;
				Static474.anIntArrayArray80[local70 - 1][local75] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local70 - 1][local75] = local243;
			}
			if (local70 < 126 && Static474.anIntArrayArray80[local70 + 1][local75] == 0 && (local50[local81 + 2][local87] & 0x60E40000) == 0 && (local50[local81 + 2][local87 + 1] & 0x78240000) == 0) {
				Static135.anIntArray273[local45] = local7 + 1;
				Static142.anIntArray282[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local70 + 1][local75] = 8;
				Static290.anIntArrayArray56[local70 + 1][local75] = local243;
			}
			if (local75 > 0 && Static474.anIntArrayArray80[local70][local75 - 1] == 0 && (local50[local81][local87 - 1] & 0x43A40000) == 0 && (local50[local81 + 1][local87 - 1] & 0x60E40000) == 0) {
				Static135.anIntArray273[local45] = local7;
				Static142.anIntArray282[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local70][local75 - 1] = 1;
				Static290.anIntArrayArray56[local70][local75 - 1] = local243;
			}
			if (local75 < 126 && Static474.anIntArrayArray80[local70][local75 + 1] == 0 && (local50[local81][local87 + 2] & 0x4E240000) == 0 && (local50[local81 + 1][local87 + 2] & 0x78240000) == 0) {
				Static135.anIntArray273[local45] = local7;
				Static142.anIntArray282[local45] = local9 + 1;
				Static474.anIntArrayArray80[local70][local75 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local70][local75 + 1] = local243;
			}
			if (local70 > 0 && local75 > 0 && Static474.anIntArrayArray80[local70 - 1][local75 - 1] == 0 && (local50[local81 - 1][local87] & 0x4FA40000) == 0 && (local50[local81 - 1][local87 - 1] & 0x43A40000) == 0 && (local50[local81][local87 - 1] & 0x63E40000) == 0) {
				Static135.anIntArray273[local45] = local7 - 1;
				Static142.anIntArray282[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local70 - 1][local75 - 1] = 3;
				Static290.anIntArrayArray56[local70 - 1][local75 - 1] = local243;
			}
			if (local70 < 126 && local75 > 0 && Static474.anIntArrayArray80[local70 + 1][local75 - 1] == 0 && (local50[local81 + 1][local87 - 1] & 0x63E40000) == 0 && (local50[local81 + 2][local87 - 1] & 0x60E40000) == 0 && (local50[local81 + 2][local87] & 0x78E40000) == 0) {
				Static135.anIntArray273[local45] = local7 + 1;
				Static142.anIntArray282[local45] = local9 - 1;
				Static474.anIntArrayArray80[local70 + 1][local75 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local70 + 1][local75 - 1] = local243;
			}
			if (local70 > 0 && local75 < 126 && Static474.anIntArrayArray80[local70 - 1][local75 + 1] == 0 && (local50[local81 - 1][local87 + 1] & 0x4FA40000) == 0 && (local50[local81 - 1][local87 + 2] & 0x4E240000) == 0 && (local50[local81][local87 + 2] & 0x7E240000) == 0) {
				Static135.anIntArray273[local45] = local7 - 1;
				Static142.anIntArray282[local45] = local9 + 1;
				Static474.anIntArrayArray80[local70 - 1][local75 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local70 - 1][local75 + 1] = local243;
			}
			if (local70 < 126 && local75 < 126 && Static474.anIntArrayArray80[local70 + 1][local75 + 1] == 0 && (local50[local81 + 1][local87 + 2] & 0x7E240000) == 0 && (local50[local81 + 2][local87 + 2] & 0x78240000) == 0 && (local50[local81 + 2][local87 + 1] & 0x78E40000) == 0) {
				Static135.anIntArray273[local45] = local7 + 1;
				Static142.anIntArray282[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local70 + 1][local75 + 1] = 12;
				Static290.anIntArrayArray56[local70 + 1][local75 + 1] = local243;
			}
		}
		Static23.anInt6895 = local9;
		Static335.anInt3038 = local7;
		return false;
	}
}
