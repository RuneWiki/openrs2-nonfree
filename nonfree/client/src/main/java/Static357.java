import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([BIIII[BIII)V")
	public static void method1285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = -(arg7 >> 2);
		@Pc(22) int local22 = -(arg7 & 0x3);
		for (@Pc(25) int local25 = -arg6; local25 < 0; local25++) {
			@Pc(29) int local29;
			@Pc(36) int local36;
			for (local29 = local17; local29 < 0; local29++) {
				local36 = arg5++;
				arg4[local36] = (byte) (arg4[local36] - arg0[arg1++]);
				@Pc(49) int local49 = arg5++;
				arg4[local49] = (byte) (arg4[local49] - arg0[arg1++]);
				@Pc(62) int local62 = arg5++;
				arg4[local62] = (byte) (arg4[local62] - arg0[arg1++]);
				@Pc(75) int local75 = arg5++;
				arg4[local75] = (byte) (arg4[local75] - arg0[arg1++]);
			}
			for (local29 = local22; local29 < 0; local29++) {
				local36 = arg5++;
				arg4[local36] = (byte) (arg4[local36] - arg0[arg1++]);
			}
			arg5 += arg2;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method1289(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = 8 - local3;
		}
		@Pc(21) int local21 = -((arg4 + 8 - 1) / 8);
		@Pc(30) int local30 = -((arg2 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local21; local40 < 0; local40++) {
			for (@Pc(47) int local47 = local30; local47 < 0; local47++) {
				if (arg1[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local9;
			if (arg1[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[B[BIIIII)V")
	public static void method1292(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg4; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(23) int local23;
			for (local16 = local4; local16 < 0; local16++) {
				local23 = arg7++;
				arg2[local23] += arg1[arg0++];
				@Pc(35) int local35 = arg7++;
				arg2[local35] += arg1[arg0++];
				@Pc(47) int local47 = arg7++;
				arg2[local47] += arg1[arg0++];
				@Pc(59) int local59 = arg7++;
				arg2[local59] += arg1[arg0++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local23 = arg7++;
				arg2[local23] += arg1[arg0++];
			}
			arg0 += arg3;
			arg7 += arg6;
		}
	}
}
