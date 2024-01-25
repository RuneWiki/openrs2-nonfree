import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([BIIIIIB[BI)V")
	public static void method1873(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(17) int local17 = -(arg5 & 0x3);
		for (@Pc(20) int local20 = -arg2; local20 < 0; local20++) {
			@Pc(27) int local27;
			@Pc(32) int local32;
			for (local27 = local4; local27 < 0; local27++) {
				local32 = arg7++;
				arg0[local32] += arg6[arg4++];
				@Pc(44) int local44 = arg7++;
				arg0[local44] += arg6[arg4++];
				@Pc(56) int local56 = arg7++;
				arg0[local56] += arg6[arg4++];
				@Pc(68) int local68 = arg7++;
				arg0[local68] += arg6[arg4++];
			}
			for (local27 = local17; local27 < 0; local27++) {
				local32 = arg7++;
				arg0[local32] += arg6[arg4++];
			}
			arg4 += arg1;
			arg7 += arg3;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[BIIB[BII)V")
	public static void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = -(arg3 >> 2);
		@Pc(17) int local17 = -(arg3 & 0x3);
		for (@Pc(20) int local20 = -arg7; local20 < 0; local20++) {
			@Pc(24) int local24;
			@Pc(28) int local28;
			for (local24 = local12; local24 < 0; local24++) {
				local28 = arg6++;
				arg2[local28] = (byte) (arg2[local28] - arg5[arg4++]);
				@Pc(41) int local41 = arg6++;
				arg2[local41] = (byte) (arg2[local41] - arg5[arg4++]);
				@Pc(54) int local54 = arg6++;
				arg2[local54] = (byte) (arg2[local54] - arg5[arg4++]);
				@Pc(67) int local67 = arg6++;
				arg2[local67] = (byte) (arg2[local67] - arg5[arg4++]);
			}
			for (local24 = local17; local24 < 0; local24++) {
				local28 = arg6++;
				arg2[local28] = (byte) (arg2[local28] - arg5[arg4++]);
			}
			arg4 += arg1;
			arg6 += arg0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method1879(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg3 % 8;
		@Pc(8) int local8;
		if (local3 == 0) {
			local8 = 0;
		} else {
			local8 = 8 - local3;
		}
		@Pc(24) int local24 = -((arg2 + 7) / 8);
		@Pc(33) int local33 = -((arg3 + 7) / 8);
		for (@Pc(35) int local35 = local24; local35 < 0; local35++) {
			for (@Pc(40) int local40 = local33; local40 < 0; local40++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local8;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
