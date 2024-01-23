import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "([I[IIIIIIII)V")
	public static void method915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(8) int local8 = local2; local8 < 0; local8++) {
				@Pc(14) int local14 = arg1[arg2--];
				@Pc(18) int local18 = local14 >>> 24;
				if (local18 == 0) {
					arg3++;
				} else {
					@Pc(24) int local24 = 256 - local18;
					@Pc(28) int local28 = arg0[arg3];
					arg0[arg3++] = ((local14 & 0xFF00FF) * local18 + (local28 & 0xFF00FF) * local24 & 0xFF00FF00) + ((local14 & 0xFF00) * local18 + (local28 & 0xFF00) * local24 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "([I[IIIIIIII)V")
	public static void method916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(8) int local8 = local2; local8 < 0; local8++) {
				@Pc(14) int local14 = arg1[arg2++];
				@Pc(18) int local18 = local14 >>> 24;
				if (local18 == 0) {
					arg3++;
				} else {
					@Pc(24) int local24 = 256 - local18;
					@Pc(28) int local28 = arg0[arg3];
					arg0[arg3++] = ((local14 & 0xFF00FF) * local18 + (local28 & 0xFF00FF) * local24 & 0xFF00FF00) + ((local14 & 0xFF00) * local18 + (local28 & 0xFF00) * local24 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method917(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * arg10;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				@Pc(23) int local23 = arg1[(arg2 >> 16) + local11];
				@Pc(27) int local27 = arg0[arg4];
				@Pc(35) int local35 = (local23 >>> 24) * arg11 >> 8;
				@Pc(39) int local39 = 256 - local35;
				arg0[arg4++] = ((local23 & 0xFF00FF) * local35 + (local27 & 0xFF00FF) * local39 & 0xFF00FF00) + ((local23 & 0xFF00) * local35 + (local27 & 0xFF00) * local39 & 0xFF0000) >>> 8;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([I[IIIIIIIIIII)V")
	public static void method918(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * arg10;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				@Pc(23) int local23 = arg1[(arg2 >> 16) + local11];
				@Pc(27) int local27 = local23 >>> 24;
				if (local27 == 0) {
					arg4++;
				} else {
					@Pc(33) int local33 = 256 - local27;
					@Pc(37) int local37 = arg0[arg4];
					arg0[arg4++] = ((local23 & 0xFF00FF) * local27 + (local37 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local23 & 0xFF00) * local27 + (local37 & 0xFF00) * local33 & 0xFF0000) >>> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([I[IIIIIIIII)V")
	public static void method919(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			for (@Pc(6) int local6 = -arg4; local6 < 0; local6++) {
				@Pc(17) int local17 = (arg1[arg2] >>> 24) * arg8 >> 8;
				@Pc(21) int local21 = 256 - local17;
				@Pc(26) int local26 = arg1[arg2++];
				@Pc(30) int local30 = arg0[arg3];
				arg0[arg3++] = ((local26 & 0xFF00FF) * local17 + (local30 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local26 & 0xFF00) * local17 + (local30 & 0xFF00) * local21 & 0xFF0000) >>> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}
}
