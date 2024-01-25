import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!js", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString118 = "";

	@OriginalMember(owner = "client!js", name = "L", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIZILclient!ao;II)Z")
	public static boolean method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class13 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(22) int local22 = arg5 - 64;
		Static177.anIntArrayArray24[64][64] = 99;
		Static238.anIntArrayArray42[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static238.anIntArray380[0] = arg9;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static227.anIntArray376[0] = arg5;
		@Pc(58) int[][] local58 = arg7.anIntArrayArray1;
		while (local50 != local53) {
			local9 = Static227.anIntArray376[local50];
			local7 = Static238.anIntArray380[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(79) int local79 = local9 - local22;
			@Pc(83) int local83 = local7 - local18;
			@Pc(89) int local89 = local7 - arg7.anInt340;
			@Pc(94) int local94 = local9 - arg7.anInt336;
			if (arg0 == -4) {
				if (local7 == arg3 && arg1 == local9) {
					Static45.anInt929 = local9;
					Static132.anInt2759 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static90.method1438(arg8, 2, arg1, local7, 2, arg3, arg4, local9)) {
					Static132.anInt2759 = local7;
					Static45.anInt929 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg7.method244(arg8, local7, arg6, 2, local9, arg4, arg3, 2, arg1)) {
					Static45.anInt929 = local9;
					Static132.anInt2759 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg7.method232(2, arg4, local9, local7, arg8, arg3, arg6, arg1)) {
					Static132.anInt2759 = local7;
					Static45.anInt929 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg7.method243(arg1, local7, local9, arg2, 2, arg0, arg3)) {
					Static132.anInt2759 = local7;
					Static45.anInt929 = local9;
					return true;
				}
			} else if (arg7.method237(arg3, local9, 2, local7, arg0, arg1, arg2)) {
				Static132.anInt2759 = local7;
				Static45.anInt929 = local9;
				return true;
			}
			@Pc(246) int local246 = Static238.anIntArrayArray42[local83][local79] + 1;
			if (local83 > 0 && Static177.anIntArrayArray24[local83 - 1][local79] == 0 && (local58[local89 - 1][local94] & 0x43A40000) == 0 && (local58[local89 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static238.anIntArray380[local53] = local7 - 1;
				Static227.anIntArray376[local53] = local9;
				Static177.anIntArrayArray24[local83 - 1][local79] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83 - 1][local79] = local246;
			}
			if (local83 < 126 && Static177.anIntArrayArray24[local83 + 1][local79] == 0 && (local58[local89 + 2][local94] & 0x60E40000) == 0 && (local58[local89 + 2][local94 + 1] & 0x78240000) == 0) {
				Static238.anIntArray380[local53] = local7 + 1;
				Static227.anIntArray376[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local83 + 1][local79] = 8;
				Static238.anIntArrayArray42[local83 + 1][local79] = local246;
			}
			if (local79 > 0 && Static177.anIntArrayArray24[local83][local79 - 1] == 0 && (local58[local89][local94 - 1] & 0x43A40000) == 0 && (local58[local89 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static238.anIntArray380[local53] = local7;
				Static227.anIntArray376[local53] = local9 - 1;
				Static177.anIntArrayArray24[local83][local79 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83][local79 - 1] = local246;
			}
			if (local79 < 126 && Static177.anIntArrayArray24[local83][local79 + 1] == 0 && (local58[local89][local94 + 2] & 0x4E240000) == 0 && (local58[local89 + 1][local94 + 2] & 0x78240000) == 0) {
				Static238.anIntArray380[local53] = local7;
				Static227.anIntArray376[local53] = local9 + 1;
				Static177.anIntArrayArray24[local83][local79 + 1] = 4;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83][local79 + 1] = local246;
			}
			if (local83 > 0 && local79 > 0 && Static177.anIntArrayArray24[local83 - 1][local79 - 1] == 0 && (local58[local89 - 1][local94] & 0x4FA40000) == 0 && (local58[local89 - 1][local94 - 1] & 0x43A40000) == 0 && (local58[local89][local94 - 1] & 0x63E40000) == 0) {
				Static238.anIntArray380[local53] = local7 - 1;
				Static227.anIntArray376[local53] = local9 - 1;
				Static177.anIntArrayArray24[local83 - 1][local79 - 1] = 3;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83 - 1][local79 - 1] = local246;
			}
			if (local83 < 126 && local79 > 0 && Static177.anIntArrayArray24[local83 + 1][local79 - 1] == 0 && (local58[local89 + 1][local94 - 1] & 0x63E40000) == 0 && (local58[local89 + 2][local94 - 1] & 0x60E40000) == 0 && (local58[local89 + 2][local94] & 0x78E40000) == 0) {
				Static238.anIntArray380[local53] = local7 + 1;
				Static227.anIntArray376[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static177.anIntArrayArray24[local83 + 1][local79 - 1] = 9;
				Static238.anIntArrayArray42[local83 + 1][local79 - 1] = local246;
			}
			if (local83 > 0 && local79 < 126 && Static177.anIntArrayArray24[local83 - 1][local79 + 1] == 0 && (local58[local89 - 1][local94 + 1] & 0x4FA40000) == 0 && (local58[local89 - 1][local94 + 2] & 0x4E240000) == 0 && (local58[local89][local94 + 2] & 0x7E240000) == 0) {
				Static238.anIntArray380[local53] = local7 - 1;
				Static227.anIntArray376[local53] = local9 + 1;
				Static177.anIntArrayArray24[local83 - 1][local79 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83 - 1][local79 + 1] = local246;
			}
			if (local83 < 126 && local79 < 126 && Static177.anIntArrayArray24[local83 + 1][local79 + 1] == 0 && (local58[local89 + 1][local94 + 2] & 0x7E240000) == 0 && (local58[local89 + 2][local94 + 2] & 0x78240000) == 0 && (local58[local89 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static238.anIntArray380[local53] = local7 + 1;
				Static227.anIntArray376[local53] = local9 + 1;
				Static177.anIntArrayArray24[local83 + 1][local79 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local83 + 1][local79 + 1] = local246;
			}
		}
		Static45.anInt929 = local9;
		Static132.anInt2759 = local7;
		return false;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
	public static void method2523() {
		if (Static308.aClass156_1 != null) {
			@Pc(3) Class156 local3 = Static308.aClass156_1;
			synchronized (Static308.aClass156_1) {
				Static308.aClass156_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2528(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static71.method4509(arg1, arg0);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1.charAt(local30) != arg0; local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}
}
