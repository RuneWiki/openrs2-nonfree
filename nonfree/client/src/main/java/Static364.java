import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method3317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg1 >> 2);
		@Pc(9) int local9 = -(arg1 & 0x3);
		for (@Pc(12) int local12 = -arg7; local12 < 0; local12++) {
			@Pc(27) int local27;
			@Pc(34) int local34;
			for (local27 = local4; local27 < 0; local27++) {
				local34 = arg6++;
				arg5[local34] += arg3[arg0++];
				@Pc(46) int local46 = arg6++;
				arg5[local46] += arg3[arg0++];
				@Pc(58) int local58 = arg6++;
				arg5[local58] += arg3[arg0++];
				@Pc(70) int local70 = arg6++;
				arg5[local70] += arg3[arg0++];
			}
			for (local27 = local9; local27 < 0; local27++) {
				local34 = arg6++;
				arg5[local34] += arg3[arg0++];
			}
			arg6 += arg4;
			arg0 += arg2;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[BII[BIB)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(27) int local27 = -arg7; local27 < 0; local27++) {
			@Pc(31) int local31;
			@Pc(38) int local38;
			for (local31 = local4; local31 < 0; local31++) {
				local38 = arg4++;
				arg6[local38] = (byte) (arg6[local38] - arg3[arg0++]);
				@Pc(51) int local51 = arg4++;
				arg6[local51] = (byte) (arg6[local51] - arg3[arg0++]);
				@Pc(64) int local64 = arg4++;
				arg6[local64] = (byte) (arg6[local64] - arg3[arg0++]);
				@Pc(77) int local77 = arg4++;
				arg6[local77] = (byte) (arg6[local77] - arg3[arg0++]);
			}
			for (local31 = local9; local31 < 0; local31++) {
				local38 = arg4++;
				arg6[local38] = (byte) (arg6[local38] - arg3[arg0++]);
			}
			arg0 += arg1;
			arg4 += arg2;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method3322(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg1 % 8;
		@Pc(10) int local10;
		if (local3 == 0) {
			local10 = 0;
		} else {
			local10 = 8 - local3;
		}
		@Pc(27) int local27 = -((arg2 + 8 - 1) / 8);
		@Pc(36) int local36 = -((arg1 + 8 - 1) / 8);
		for (@Pc(38) int local38 = local27; local38 < 0; local38++) {
			for (@Pc(45) int local45 = local36; local45 < 0; local45++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local10;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}
}
