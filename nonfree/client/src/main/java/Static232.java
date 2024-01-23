import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([I[IIIIIIII)V")
	public static void method2282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(8) int local8 = local2; local8 < 0; local8++) {
				@Pc(15) int local15 = arg1[arg2] >>> 24;
				@Pc(19) int local19 = 256 - local15;
				@Pc(24) int local24 = arg1[arg2++];
				@Pc(28) int local28 = arg0[arg3];
				arg0[arg3++] = ((local24 & 0xFF00FF) * local15 + (local28 & 0xFF00FF) * local19 & 0xFF00FF00) + ((local24 & 0xFF00) * local15 + (local28 & 0xFF00) * local19 & 0xFF0000) >> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([I[IIIIIII)V")
	public static void method2283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			@Pc(7) int local7 = arg3 + arg4;
			while (arg3 < local7) {
				@Pc(14) int local14 = arg1[arg2] >>> 24;
				@Pc(18) int local18 = 256 - local14;
				@Pc(23) int local23 = arg1[arg2++];
				@Pc(27) int local27 = arg0[arg3];
				arg0[arg3++] = ((local23 & 0xFF00FF) * local14 + (local27 & 0xFF00FF) * local18 & 0xFF00FF00) + ((local23 & 0xFF00) * local14 + (local27 & 0xFF00) * local18 & 0xFF0000) >> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([I[IIIIIIIII)V")
	public static void method2284(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			for (@Pc(6) int local6 = -arg4; local6 < 0; local6++) {
				@Pc(17) int local17 = (arg1[arg2] >>> 24) - (255 - arg8);
				if (local17 < 0) {
					local17 = 0;
				}
				@Pc(25) int local25 = 256 - local17;
				@Pc(30) int local30 = arg1[arg2++];
				@Pc(34) int local34 = arg0[arg3];
				arg0[arg3++] = ((local30 & 0xFF00FF) * local17 + (local34 & 0xFF00FF) * local25 & 0xFF00FF00) + ((local30 & 0xFF00) * local17 + (local34 & 0xFF00) * local25 & 0xFF0000) >> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method2285(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * arg10;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				@Pc(23) int local23 = arg1[(arg2 >> 16) + local11];
				@Pc(27) int local27 = arg0[arg4];
				@Pc(35) int local35 = (local23 >>> 24) - (255 - arg11);
				if (local35 < 0) {
					local35 = 0;
				}
				@Pc(43) int local43 = 256 - local35;
				arg0[arg4++] = ((local23 & 0xFF00FF) * local35 + (local27 & 0xFF00FF) * local43 & 0xFF00FF00) + ((local23 & 0xFF00) * local35 + (local27 & 0xFF00) * local43 & 0xFF0000) >> 8;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}
