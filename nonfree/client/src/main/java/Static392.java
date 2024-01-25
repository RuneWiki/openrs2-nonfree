import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!pe;")
	public static Class258 aClass258_4;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public static int anInt7445;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!rl;IIII[IIIIIIZ[II)I")
	public static int method6267(@OriginalArg(1) Class291 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static97.anIntArrayArray23[local7][local11] = 0;
				Static634.anIntArrayArray103[local7][local11] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg4 == 1) {
			local56 = Static460.method6913(arg1, arg9, arg7, arg8, arg10, arg2, arg6, arg13, arg3, arg0);
		} else if (arg4 == 2) {
			local56 = Static438.method6665(arg10, arg6, arg7, arg2, arg8, arg1, arg9, arg3, arg0, arg13);
		} else {
			local56 = Static623.method8481(arg1, arg6, arg8, arg4, arg10, arg7, arg0, arg9, arg2, arg13, arg3);
		}
		@Pc(93) int local93 = arg2 - 64;
		@Pc(97) int local97 = arg6 - 64;
		@Pc(99) int local99 = Static390.anInt7402;
		@Pc(106) int local106 = Static243.anInt5476;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local56) {
			if (!arg11) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg9 - 10; local121 <= arg9 + 10; local121++) {
				for (@Pc(128) int local128 = arg7 - 10; local128 <= arg7 + 10; local128++) {
					@Pc(135) int local135 = local121 - local93;
					@Pc(140) int local140 = local128 - local97;
					if (local135 >= 0 && local140 >= 0 && local135 < 128 && local140 < 128 && Static634.anIntArrayArray103[local135][local140] < 100) {
						@Pc(163) int local163 = 0;
						if (arg9 > local121) {
							local163 = arg9 - local121;
						} else if (local121 > arg1 + arg9 - 1) {
							local163 = local121 + 1 - arg9 - arg1;
						}
						@Pc(200) int local200 = 0;
						if (arg7 > local128) {
							local200 = arg7 - local128;
						} else if (arg7 + arg3 - 1 < local128) {
							local200 = local128 + 1 - arg3 - arg7;
						}
						@Pc(245) int local245 = local163 * local163 + local200 * local200;
						if (local245 < local112 || local112 == local245 && Static634.anIntArrayArray103[local135][local140] < local114) {
							local114 = Static634.anIntArrayArray103[local135][local140];
							local112 = local245;
							local106 = local128;
							local99 = local121;
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg2 == local99 && arg6 == local106) {
			return 0;
		}
		@Pc(310) byte local310 = 0;
		Static478.anIntArray606[0] = local99;
		local112 = local310 + 1;
		Static273.anIntArray338[0] = local106;
		@Pc(332) int local332;
		local114 = local332 = Static97.anIntArrayArray23[local99 - local93][local106 - local97];
		while (arg2 != local99 || local106 != arg6) {
			if (local114 != local332) {
				Static478.anIntArray606[local112] = local99;
				local332 = local114;
				Static273.anIntArray338[local112++] = local106;
			}
			if ((local114 & 0x1) != 0) {
				local106++;
			} else if ((local114 & 0x4) != 0) {
				local106--;
			}
			if ((local114 & 0x2) != 0) {
				local99++;
			} else if ((local114 & 0x8) != 0) {
				local99--;
			}
			local114 = Static97.anIntArrayArray23[local99 - local93][local106 - local97];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg12[local121] = Static478.anIntArray606[local112];
			arg5[local121++] = Static273.anIntArray338[local112];
			if (local121 >= arg12.length) {
				break;
			}
		}
		return local121;
	}
}
