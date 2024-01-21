import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIIII[B)V")
	public static void method1441(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIII)V")
	public static void method1442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method1445(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = 256 - arg11;
		@Pc(5) int local5 = arg2;
		for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
			@Pc(15) int local15 = (arg3 >> 16) * arg10;
			for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
				@Pc(27) int local27 = arg1[(arg2 >> 16) + local15];
				if (local27 == 0) {
					arg4++;
				} else {
					@Pc(33) int local33 = arg0[arg4];
					arg0[arg4++] = ((local27 & 0xFF00FF) * arg11 + (local33 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local27 & 0xFF00) * arg11 + (local33 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local5;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIIII)V")
	public static void method1449(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIIIII)V")
	public static void method1452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = 256 - arg8;
		for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
			for (@Pc(10) int local10 = -arg4; local10 < 0; local10++) {
				@Pc(16) int local16 = arg1[arg2++];
				if (local16 == 0) {
					arg3++;
				} else {
					@Pc(22) int local22 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * arg8 + (local22 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local16 & 0xFF00) * arg8 + (local22 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I[IIIIIIIIIII)V")
	public static void method1457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * arg10;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				@Pc(23) int local23 = arg1[(arg2 >> 16) + local11];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local23;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}
