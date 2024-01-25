import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method3614(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg2 >> 2);
		@Pc(9) int local9 = -(arg2 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg0++;
				arg4[local20] += arg1[arg5++];
				@Pc(32) int local32 = arg0++;
				arg4[local32] += arg1[arg5++];
				@Pc(44) int local44 = arg0++;
				arg4[local44] += arg1[arg5++];
				@Pc(56) int local56 = arg0++;
				arg4[local56] += arg1[arg5++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg0++;
				arg4[local20] += arg1[arg5++];
			}
			arg5 += arg7;
			arg0 += arg3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI[BIIIZ)V")
	public static void method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(12) int local12 = -arg7; local12 < 0; local12++) {
			@Pc(30) int local30;
			@Pc(37) int local37;
			for (local30 = local4; local30 < 0; local30++) {
				local37 = arg6++;
				arg2[local37] = (byte) (arg2[local37] - arg4[arg5++]);
				@Pc(50) int local50 = arg6++;
				arg2[local50] = (byte) (arg2[local50] - arg4[arg5++]);
				@Pc(63) int local63 = arg6++;
				arg2[local63] = (byte) (arg2[local63] - arg4[arg5++]);
				@Pc(76) int local76 = arg6++;
				arg2[local76] = (byte) (arg2[local76] - arg4[arg5++]);
			}
			for (local30 = local9; local30 < 0; local30++) {
				local37 = arg6++;
				arg2[local37] = (byte) (arg2[local37] - arg4[arg5++]);
			}
			arg5 += arg3;
			arg6 += arg0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZ[BII)Z")
	public static boolean method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg4 % 8;
		@Pc(18) int local18;
		if (local3 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local3;
		}
		@Pc(30) int local30 = -((arg0 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg4 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(45) int local45 = local39; local45 < 0; local45++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local18;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}
}
