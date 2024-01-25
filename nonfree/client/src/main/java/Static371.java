import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIII[BII)Z")
	public static boolean method5517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(18) int local18;
		if (local3 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local3;
		}
		@Pc(30) int local30 = -((arg0 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg1 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(48) int local48 = local39; local48 < 0; local48++) {
				if (arg3[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local18;
			if (arg3[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI[BIIIBII)V")
	public static void method5521(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(26) int local26;
			for (local19 = local4; local19 < 0; local19++) {
				local26 = arg6++;
				arg2[local26] = (byte) (arg2[local26] - arg0[arg4++]);
				@Pc(39) int local39 = arg6++;
				arg2[local39] = (byte) (arg2[local39] - arg0[arg4++]);
				@Pc(52) int local52 = arg6++;
				arg2[local52] = (byte) (arg2[local52] - arg0[arg4++]);
				@Pc(65) int local65 = arg6++;
				arg2[local65] = (byte) (arg2[local65] - arg0[arg4++]);
			}
			for (local19 = local9; local19 < 0; local19++) {
				local26 = arg6++;
				arg2[local26] = (byte) (arg2[local26] - arg0[arg4++]);
			}
			arg4 += arg1;
			arg6 += arg7;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BII[BIII)V")
	public static void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(16) int local16 = -arg3; local16 < 0; local16++) {
			@Pc(20) int local20;
			@Pc(27) int local27;
			for (local20 = local4; local20 < 0; local20++) {
				local27 = arg0++;
				arg5[local27] += arg2[arg1++];
				@Pc(39) int local39 = arg0++;
				arg5[local39] += arg2[arg1++];
				@Pc(51) int local51 = arg0++;
				arg5[local51] += arg2[arg1++];
				@Pc(63) int local63 = arg0++;
				arg5[local63] += arg2[arg1++];
			}
			for (local20 = local9; local20 < 0; local20++) {
				local27 = arg0++;
				arg5[local27] += arg2[arg1++];
			}
			arg1 += arg7;
			arg0 += arg4;
		}
	}
}
