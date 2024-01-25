import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!jt;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public static int anInt2055;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
	public static int anInt2066;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([IIIIIZILclient!wd;IIZI[III)I")
	public static int method1504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class355 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static233.anIntArrayArray24[local3][local7] = 0;
				Static416.anIntArrayArray47[local3][local7] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg10 == 1) {
			local61 = Static247.method3876(arg1, arg7, arg6, arg3, arg13, arg2, arg9, arg12, arg4, arg8);
		} else if (arg10 == 2) {
			local61 = Static362.method5088(arg9, arg3, arg1, arg2, arg6, arg7, arg8, arg12, arg4, arg13);
		} else {
			local61 = Static489.method6852(arg6, arg12, arg10, arg4, arg3, arg2, arg8, arg13, arg9, arg1, arg7);
		}
		@Pc(101) int local101 = arg2 - 64;
		@Pc(105) int local105 = arg8 - 64;
		@Pc(107) int local107 = Static30.anInt768;
		@Pc(109) int local109 = Static245.anInt4563;
		@Pc(117) int local117;
		@Pc(119) int local119;
		@Pc(126) int local126;
		if (!local61) {
			if (!arg5) {
				return -1;
			}
			local117 = Integer.MAX_VALUE;
			local119 = Integer.MAX_VALUE;
			for (local126 = arg9 - 10; local126 <= arg9 + 10; local126++) {
				for (@Pc(133) int local133 = arg4 - 10; local133 <= arg4 + 10; local133++) {
					@Pc(140) int local140 = local126 - local101;
					@Pc(145) int local145 = local133 - local105;
					if (local140 >= 0 && local145 >= 0 && local140 < 128 && local145 < 128 && Static416.anIntArrayArray47[local140][local145] < 100) {
						@Pc(167) int local167 = 0;
						if (arg9 > local126) {
							local167 = arg9 - local126;
						} else if (arg9 + arg6 - 1 < local126) {
							local167 = local126 + 1 - arg9 - arg6;
						}
						@Pc(199) int local199 = 0;
						if (arg4 > local133) {
							local199 = arg4 - local133;
						} else if (arg1 + arg4 - 1 < local133) {
							local199 = local133 + 1 - arg4 - arg1;
						}
						@Pc(237) int local237 = local199 * local199 + local167 * local167;
						if (local117 > local237 || local237 == local117 && Static416.anIntArrayArray47[local140][local145] < local119) {
							local107 = local126;
							local117 = local237;
							local119 = Static416.anIntArrayArray47[local140][local145];
							local109 = local133;
						}
					}
				}
			}
			if (~local117 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg2 == local107 && arg8 == local109) {
			return 0;
		}
		@Pc(311) byte local311 = 0;
		Static6.anIntArray26[0] = local107;
		local117 = local311 + 1;
		Static255.anIntArray325[0] = local109;
		@Pc(332) int local332;
		local119 = local332 = Static233.anIntArrayArray24[local107 - local101][local109 - local105];
		while (local107 != arg2 || arg8 != local109) {
			if (local119 != local332) {
				Static6.anIntArray26[local117] = local107;
				local332 = local119;
				Static255.anIntArray325[local117++] = local109;
			}
			if ((local119 & 0x1) != 0) {
				local109++;
			} else if ((local119 & 0x4) != 0) {
				local109--;
			}
			if ((local119 & 0x2) != 0) {
				local107++;
			} else if ((local119 & 0x8) != 0) {
				local107--;
			}
			local119 = Static233.anIntArrayArray24[local107 - local101][local109 - local105];
		}
		local126 = 0;
		while (local117-- > 0) {
			arg11[local126] = Static6.anIntArray26[local117];
			arg0[local126++] = Static255.anIntArray325[local117];
			if (arg11.length <= local126) {
				break;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
