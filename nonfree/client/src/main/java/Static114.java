import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIII)V", line = 67)
	public static void method1617(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			@Pc(9) int local9 = arg3 + arg4 - 3;
			while (arg3 < local9) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			local9 += 3;
			while (arg3 < local9) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII[B)V", line = 478)
	public static void method1625(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(21) int local21;
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
			}
			for (@Pc(93) int local93 = local9; local93 < 0; local93++) {
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIIII)V", line = 542)
	public static void method1626(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
			for (@Pc(10) int local10 = -arg4; local10 < 0; local10++) {
				@Pc(16) int local16 = arg1[arg2++];
				if (local16 == 0) {
					arg3++;
				} else {
					@Pc(22) int local22 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * 128 + (local22 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local16 & 0xFF00) * 128 + (local22 & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII)V", line = 577)
	public static void method1627(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(21) int local21;
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
			}
			for (@Pc(77) int local77 = local9; local77 < 0; local77++) {
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}
}
