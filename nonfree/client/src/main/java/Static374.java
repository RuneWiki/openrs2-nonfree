import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(19) int local19 = -(arg0 >> 2);
		@Pc(24) int local24 = -(arg0 & 0x3);
		for (@Pc(27) int local27 = -arg5; local27 < 0; local27++) {
			@Pc(32) int local32;
			@Pc(39) int local39;
			for (local32 = local19; local32 < 0; local32++) {
				local39 = arg6++;
				arg7[local39] += arg3[arg4++];
				@Pc(51) int local51 = arg6++;
				arg7[local51] += arg3[arg4++];
				@Pc(63) int local63 = arg6++;
				arg7[local63] += arg3[arg4++];
				@Pc(75) int local75 = arg6++;
				arg7[local75] += arg3[arg4++];
			}
			for (local32 = local24; local32 < 0; local32++) {
				local39 = arg6++;
				arg7[local39] += arg3[arg4++];
			}
			arg4 += arg1;
			arg6 += arg2;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI[BII)Z")
	public static boolean method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg0 % 8;
		@Pc(15) int local15;
		if (local3 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local3;
		}
		@Pc(30) int local30 = -((arg3 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg0 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local30; local42 < 0; local42++) {
			for (@Pc(47) int local47 = local40; local47 < 0; local47++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local15;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method4411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg3 >> 2);
		@Pc(9) int local9 = -(arg3 & 0x3);
		for (@Pc(16) int local16 = -arg4; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(26) int local26;
			for (local21 = local4; local21 < 0; local21++) {
				local26 = arg1++;
				arg5[local26] = (byte) (arg5[local26] - arg2[arg7++]);
				@Pc(39) int local39 = arg1++;
				arg5[local39] = (byte) (arg5[local39] - arg2[arg7++]);
				@Pc(52) int local52 = arg1++;
				arg5[local52] = (byte) (arg5[local52] - arg2[arg7++]);
				@Pc(65) int local65 = arg1++;
				arg5[local65] = (byte) (arg5[local65] - arg2[arg7++]);
			}
			for (local21 = local9; local21 < 0; local21++) {
				local26 = arg1++;
				arg5[local26] = (byte) (arg5[local26] - arg2[arg7++]);
			}
			arg7 += arg0;
			arg1 += arg6;
		}
	}
}
