import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg0 % 8;
		@Pc(13) int local13;
		if (local3 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local3;
		}
		@Pc(25) int local25 = -((arg4 + 8 - 1) / 8);
		@Pc(35) int local35 = -((arg0 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local25; local42 < 0; local42++) {
			for (@Pc(49) int local49 = local35; local49 < 0; local49++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local13;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(12) int local12 = -arg7; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(21) int local21;
			for (local16 = local4; local16 < 0; local16++) {
				local21 = arg2++;
				arg4[local21] += arg5[arg0++];
				@Pc(33) int local33 = arg2++;
				arg4[local33] += arg5[arg0++];
				@Pc(45) int local45 = arg2++;
				arg4[local45] += arg5[arg0++];
				@Pc(57) int local57 = arg2++;
				arg4[local57] += arg5[arg0++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local21 = arg2++;
				arg4[local21] += arg5[arg0++];
			}
			arg2 += arg1;
			arg0 += arg6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIB[BIIIII)V")
	public static void method1279(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(12) int local12 = -arg3; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(26) int local26;
			for (local19 = local4; local19 < 0; local19++) {
				local26 = arg7++;
				arg2[local26] = (byte) (arg2[local26] - arg0[arg4++]);
				@Pc(39) int local39 = arg7++;
				arg2[local39] = (byte) (arg2[local39] - arg0[arg4++]);
				@Pc(52) int local52 = arg7++;
				arg2[local52] = (byte) (arg2[local52] - arg0[arg4++]);
				@Pc(65) int local65 = arg7++;
				arg2[local65] = (byte) (arg2[local65] - arg0[arg4++]);
			}
			for (local19 = local9; local19 < 0; local19++) {
				local26 = arg7++;
				arg2[local26] = (byte) (arg2[local26] - arg0[arg4++]);
			}
			arg4 += arg5;
			arg7 += arg1;
		}
	}
}
