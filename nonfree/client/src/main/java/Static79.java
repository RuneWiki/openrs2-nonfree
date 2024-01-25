import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cja", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(III[BIII[BI)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(26) int local26 = -arg0; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg4++;
				arg3[local34] = (byte) (arg3[local34] - arg6[arg2++]);
				@Pc(47) int local47 = arg4++;
				arg3[local47] = (byte) (arg3[local47] - arg6[arg2++]);
				@Pc(60) int local60 = arg4++;
				arg3[local60] = (byte) (arg3[local60] - arg6[arg2++]);
				@Pc(73) int local73 = arg4++;
				arg3[local73] = (byte) (arg3[local73] - arg6[arg2++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg4++;
				arg3[local34] = (byte) (arg3[local34] - arg6[arg2++]);
			}
			arg2 += arg7;
			arg4 += arg1;
		}
	}
}
