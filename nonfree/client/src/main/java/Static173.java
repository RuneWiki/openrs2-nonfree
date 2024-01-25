import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "Lclient!u;")
	public static Class366 aClass366_2;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZI[IIIIIIZII[IILclient!fe;I)I")
	public static int method8685(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class109 arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(9) int local9 = 0; local9 < 128; local9++) {
				Static716.anIntArrayArray69[local3][local9] = 0;
				Static296.anIntArrayArray20[local3][local9] = 99999999;
			}
		}
		@Pc(72) boolean local72;
		if (arg6 == 1) {
			local72 = Static194.method3006(arg11, arg3, arg13, arg4, arg7, arg1, arg5, arg9, arg8, arg12);
		} else if (arg6 == 2) {
			local72 = Static325.method4737(arg8, arg3, arg4, arg11, arg13, arg12, arg5, arg9, arg7, arg1);
		} else {
			local72 = Static475.method6474(arg6, arg12, arg8, arg9, arg11, arg7, arg13, arg1, arg4, arg5, arg3);
		}
		@Pc(107) int local107 = arg8 - 64;
		@Pc(133) int local133 = arg5 - 64;
		@Pc(135) int local135 = Static286.anInt4374;
		@Pc(137) int local137 = Static290.anInt4444;
		@Pc(145) int local145;
		@Pc(147) int local147;
		@Pc(154) int local154;
		if (!local72) {
			if (!arg0) {
				return -1;
			}
			local145 = Integer.MAX_VALUE;
			local147 = Integer.MAX_VALUE;
			for (local154 = arg1 - 10; local154 <= arg1 + 10; local154++) {
				for (@Pc(163) int local163 = arg9 - 10; local163 <= arg9 + 10; local163++) {
					@Pc(169) int local169 = local154 - local107;
					@Pc(173) int local173 = local163 - local133;
					if (local169 >= 0 && local173 >= 0 && local169 < 128 && local173 < 128 && Static296.anIntArrayArray20[local169][local173] < 100) {
						@Pc(207) int local207 = 0;
						if (local154 < arg1) {
							local207 = arg1 - local154;
						} else if (local154 > arg11 + arg1 - 1) {
							local207 = local154 + 1 - arg1 - arg11;
						}
						@Pc(241) int local241 = 0;
						if (arg9 > local163) {
							local241 = arg9 - local163;
						} else if (local163 > arg9 + arg13 - 1) {
							local241 = local163 + 1 - arg13 - arg9;
						}
						@Pc(285) int local285 = local241 * local241 + local207 * local207;
						if (local145 > local285 || local145 == local285 && Static296.anIntArrayArray20[local169][local173] < local147) {
							local137 = local163;
							local135 = local154;
							local145 = local285;
							local147 = Static296.anIntArrayArray20[local169][local173];
						}
					}
				}
			}
			if (local145 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local135 == arg8 && local137 == arg5) {
			return 0;
		}
		@Pc(365) byte local365 = 0;
		Static386.anIntArray438[0] = local135;
		local145 = local365 + 1;
		Static267.anIntArray327[0] = local137;
		@Pc(386) int local386;
		local147 = local386 = Static716.anIntArrayArray69[local135 - local107][local137 - local133];
		while (arg8 != local135 || arg5 != local137) {
			if (local147 != local386) {
				local386 = local147;
				Static386.anIntArray438[local145] = local135;
				Static267.anIntArray327[local145++] = local137;
			}
			if ((local147 & 0x2) != 0) {
				local135++;
			} else if ((local147 & 0x8) != 0) {
				local135--;
			}
			if ((local147 & 0x1) != 0) {
				local137++;
			} else if ((local147 & 0x4) != 0) {
				local137--;
			}
			local147 = Static716.anIntArrayArray69[local135 - local107][local137 - local133];
		}
		local154 = 0;
		while (local145-- > 0) {
			arg10[local154] = Static386.anIntArray438[local145];
			arg2[local154++] = Static267.anIntArray327[local145];
			if (arg10.length <= local154) {
				break;
			}
		}
		return local154;
	}
}
