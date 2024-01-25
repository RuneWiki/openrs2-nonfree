import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIBIIII)Z")
	public static boolean method4490(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg4 % 8;
		@Pc(7) int local7;
		if (local3 == 0) {
			local7 = 0;
		} else {
			local7 = 8 - local3;
		}
		@Pc(22) int local22 = -((arg1 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg4 + 7) / 8);
		for (@Pc(41) int local41 = local22; local41 < 0; local41++) {
			for (@Pc(48) int local48 = local39; local48 < 0; local48++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local7;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(27) int local27 = -arg0; local27 < 0; local27++) {
			@Pc(34) int local34;
			@Pc(38) int local38;
			for (local34 = local4; local34 < 0; local34++) {
				local38 = arg1++;
				arg6[local38] += arg2[arg4++];
				@Pc(50) int local50 = arg1++;
				arg6[local50] += arg2[arg4++];
				@Pc(62) int local62 = arg1++;
				arg6[local62] += arg2[arg4++];
				@Pc(74) int local74 = arg1++;
				arg6[local74] += arg2[arg4++];
			}
			for (local34 = local9; local34 < 0; local34++) {
				local38 = arg1++;
				arg6[local38] += arg2[arg4++];
			}
			arg1 += arg3;
			arg4 += arg7;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BII[BIII)V")
	public static void method4496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(27) int local27 = -arg3; local27 < 0; local27++) {
			@Pc(34) int local34;
			@Pc(38) int local38;
			for (local34 = local4; local34 < 0; local34++) {
				local38 = arg0++;
				arg2[local38] = (byte) (arg2[local38] - arg5[arg1++]);
				@Pc(51) int local51 = arg0++;
				arg2[local51] = (byte) (arg2[local51] - arg5[arg1++]);
				@Pc(64) int local64 = arg0++;
				arg2[local64] = (byte) (arg2[local64] - arg5[arg1++]);
				@Pc(77) int local77 = arg0++;
				arg2[local77] = (byte) (arg2[local77] - arg5[arg1++]);
			}
			for (local34 = local9; local34 < 0; local34++) {
				local38 = arg0++;
				arg2[local38] = (byte) (arg2[local38] - arg5[arg1++]);
			}
			arg0 += arg7;
			arg1 += arg4;
		}
	}
}
