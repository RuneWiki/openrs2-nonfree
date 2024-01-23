import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1836(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1837(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V")
	public static void method1838(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12) {
		@Pc(3) int local3 = arg2 - Static29.anInt552;
		@Pc(7) int local7 = arg3 - Static29.anInt548;
		for (@Pc(9) int local9 = local7; local9 < local7 + arg5; local9++) {
			@Pc(14) int local14 = arg11[local9];
			@Pc(18) int local18 = arg12[local9];
			@Pc(20) int local20 = arg4;
			@Pc(27) int local27;
			if (local3 > local14) {
				local27 = local3 - local14;
				if (local27 >= local18) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				local18 -= local27;
			} else {
				local27 = local14 - local3;
				if (local27 >= arg4) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				arg7 += local27;
				local20 = arg4 - local27;
				arg8 += local27;
			}
			local27 = 0;
			if (local20 < local18) {
				local18 = local20;
			} else {
				local27 = local20 - local18;
			}
			for (@Pc(95) int local95 = -local18; local95 < 0; local95++) {
				if (arg1[arg7++] == 0) {
					arg8++;
				} else {
					Static29.anIntArray59[arg8++] = arg6;
				}
			}
			arg7 += local27 + arg10;
			arg8 += local27 + arg9;
		}
	}
}
