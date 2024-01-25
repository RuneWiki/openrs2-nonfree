import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIBI[B[BIII)V")
	public static void method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(13) int local13 = -(arg6 & 0x3);
		for (@Pc(16) int local16 = -arg2; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			for (local21 = local4; local21 < 0; local21++) {
				local25 = arg7++;
				arg4[local25] += arg3[arg1++];
				@Pc(37) int local37 = arg7++;
				arg4[local37] += arg3[arg1++];
				@Pc(49) int local49 = arg7++;
				arg4[local49] += arg3[arg1++];
				@Pc(61) int local61 = arg7++;
				arg4[local61] += arg3[arg1++];
			}
			for (local21 = local13; local21 < 0; local21++) {
				local25 = arg7++;
				arg4[local25] += arg3[arg1++];
			}
			arg7 += arg5;
			arg1 += arg0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method3341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(12) int local12;
		if (local3 == 0) {
			local12 = 0;
		} else {
			local12 = 8 - local3;
		}
		@Pc(27) int local27 = -((arg3 + 7) / 8);
		@Pc(37) int local37 = -((arg1 + 8 - 1) / 8);
		for (@Pc(39) int local39 = local27; local39 < 0; local39++) {
			for (@Pc(43) int local43 = local37; local43 < 0; local43++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local12;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([BII[BIIIIB)V")
	public static void method3342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg2 >> 2);
		@Pc(9) int local9 = -(arg2 & 0x3);
		for (@Pc(27) int local27 = -arg7; local27 < 0; local27++) {
			@Pc(34) int local34;
			@Pc(41) int local41;
			for (local34 = local4; local34 < 0; local34++) {
				local41 = arg4++;
				arg0[local41] = (byte) (arg0[local41] - arg3[arg1++]);
				@Pc(54) int local54 = arg4++;
				arg0[local54] = (byte) (arg0[local54] - arg3[arg1++]);
				@Pc(67) int local67 = arg4++;
				arg0[local67] = (byte) (arg0[local67] - arg3[arg1++]);
				@Pc(80) int local80 = arg4++;
				arg0[local80] = (byte) (arg0[local80] - arg3[arg1++]);
			}
			for (local34 = local9; local34 < 0; local34++) {
				local41 = arg4++;
				arg0[local41] = (byte) (arg0[local41] - arg3[arg1++]);
			}
			arg4 += arg5;
			arg1 += arg6;
		}
	}
}
