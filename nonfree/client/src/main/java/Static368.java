import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III[BBII)Z")
	public static boolean method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg3 % 8;
		@Pc(10) int local10;
		if (local3 == 0) {
			local10 = 0;
		} else {
			local10 = 8 - local3;
		}
		@Pc(27) int local27 = -((arg1 + 8 - 1) / 8);
		@Pc(36) int local36 = -((arg3 + 8 - 1) / 8);
		for (@Pc(38) int local38 = local27; local38 < 0; local38++) {
			for (@Pc(45) int local45 = local36; local45 < 0; local45++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local10;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(12) int local12 = -arg0; local12 < 0; local12++) {
			@Pc(27) int local27;
			@Pc(34) int local34;
			for (local27 = local4; local27 < 0; local27++) {
				local34 = arg7++;
				arg5[local34] += arg4[arg1++];
				@Pc(46) int local46 = arg7++;
				arg5[local46] += arg4[arg1++];
				@Pc(58) int local58 = arg7++;
				arg5[local58] += arg4[arg1++];
				@Pc(70) int local70 = arg7++;
				arg5[local70] += arg4[arg1++];
			}
			for (local27 = local9; local27 < 0; local27++) {
				local34 = arg7++;
				arg5[local34] += arg4[arg1++];
			}
			arg1 += arg3;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BIII[BIIII)V")
	public static void method4024(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(16) int local16 = -arg6; local16 < 0; local16++) {
			@Pc(23) int local23;
			@Pc(30) int local30;
			for (local23 = local4; local23 < 0; local23++) {
				local30 = arg3++;
				arg4[local30] = (byte) (arg4[local30] - arg0[arg1++]);
				@Pc(43) int local43 = arg3++;
				arg4[local43] = (byte) (arg4[local43] - arg0[arg1++]);
				@Pc(56) int local56 = arg3++;
				arg4[local56] = (byte) (arg4[local56] - arg0[arg1++]);
				@Pc(69) int local69 = arg3++;
				arg4[local69] = (byte) (arg4[local69] - arg0[arg1++]);
			}
			for (local23 = local9; local23 < 0; local23++) {
				local30 = arg3++;
				arg4[local30] = (byte) (arg4[local30] - arg0[arg1++]);
			}
			arg1 += arg7;
			arg3 += arg2;
		}
	}
}
