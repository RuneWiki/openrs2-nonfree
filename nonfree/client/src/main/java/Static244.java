import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([I[B[IIIIIIII)V")
	public static void method3019(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(21) byte local21;
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
			}
			for (@Pc(93) int local93 = local9; local93 < 0; local93++) {
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
	public static void method3025(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(1) int local1 = arg3;
		for (@Pc(4) int local4 = -arg8; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg4 >> 16) * arg11;
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				@Pc(23) byte local23 = arg1[(arg3 >> 16) + local11];
				if (local23 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[local23 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "([I[B[IIIIIIII)V")
	public static void method3026(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = 256 - arg9;
		for (@Pc(6) int local6 = -arg6; local6 < 0; local6++) {
			for (@Pc(10) int local10 = -arg5; local10 < 0; local10++) {
				@Pc(16) byte local16 = arg1[arg3++];
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(24) int local24 = arg2[local16 & 0xFF];
					@Pc(28) int local28 = arg0[arg4];
					arg0[arg4++] = ((local24 & 0xFF00FF) * arg9 + (local28 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local24 & 0xFF00) * arg9 + (local28 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
