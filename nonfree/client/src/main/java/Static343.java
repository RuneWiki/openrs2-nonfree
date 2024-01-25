import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	public static int anInt5854 = 0;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!dn;")
	public static final Class56 aClass56_7 = new Class56("WTI", 5);

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt5857 = 0;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!di;")
	public static final Class54 aClass54_86 = new Class54(48, 11);

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_48 = new Class171(20);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
	public static boolean method4716(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z[IIILclient!eq;IIIIIIII[II)I")
	public static int method4718(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class70 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static149.anIntArrayArray28[local3][local7] = 0;
				Static142.anIntArrayArray27[local3][local7] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg2 == 1) {
			local56 = Static338.method5040(arg6, arg13, arg8, arg5, arg3, arg7, arg9, arg10, arg11, arg4);
		} else if (arg2 == 2) {
			local56 = Static230.method3601(arg6, arg10, arg4, arg8, arg7, arg5, arg3, arg9, arg13, arg11);
		} else {
			local56 = Static285.method4124(arg10, arg13, arg6, arg3, arg2, arg11, arg7, arg4, arg5, arg8, arg9);
		}
		@Pc(91) int local91 = arg6 - 64;
		@Pc(95) int local95 = arg13 - 64;
		@Pc(97) int local97 = Static275.anInt5052;
		@Pc(99) int local99 = Static333.anInt5769;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local56) {
			if (!arg0) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg11 - 10; local116 <= arg11 + 10; local116++) {
				for (@Pc(122) int local122 = arg8 - 10; local122 <= arg8 + 10; local122++) {
					@Pc(129) int local129 = local116 - local91;
					@Pc(133) int local133 = local122 - local95;
					if (local129 >= 0 && local133 >= 0 && local129 < 128 && local133 < 128 && Static142.anIntArrayArray27[local129][local133] < 100) {
						@Pc(154) int local154 = 0;
						if (local116 < arg11) {
							local154 = arg11 - local116;
						} else if (local116 > arg11 + arg9 - 1) {
							local154 = local116 + 1 - arg11 - arg9;
						}
						@Pc(192) int local192 = 0;
						if (local122 < arg8) {
							local192 = arg8 - local122;
						} else if (arg8 + arg4 - 1 < local122) {
							local192 = local122 + 1 - arg8 - arg4;
						}
						@Pc(228) int local228 = local192 * local192 + local154 * local154;
						if (local228 < local107 || local107 == local228 && local109 > Static142.anIntArrayArray27[local129][local133]) {
							local107 = local228;
							local99 = local122;
							local109 = Static142.anIntArrayArray27[local129][local133];
							local97 = local116;
						}
					}
				}
			}
			if (local107 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg6 == local97 && arg13 == local99) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static432.anIntArray602[0] = local97;
		local107 = local297 + 1;
		Static185.anIntArray318[0] = local99;
		@Pc(319) int local319;
		local109 = local319 = Static149.anIntArrayArray28[local97 - local91][local99 - local95];
		while (local97 != arg6 || arg13 != local99) {
			if (local109 != local319) {
				local319 = local109;
				Static432.anIntArray602[local107] = local97;
				Static185.anIntArray318[local107++] = local99;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			local109 = Static149.anIntArrayArray28[local97 - local91][local99 - local95];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg12[local116] = Static432.anIntArray602[local107];
			arg1[local116++] = Static185.anIntArray318[local107];
			if (arg12.length <= local116) {
				break;
			}
		}
		return local116;
	}
}
