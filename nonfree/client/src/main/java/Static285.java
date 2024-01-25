import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBII[B[BIII)V")
	public static void method4857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(20) int local20 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg1; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg3[local31] += arg4[arg0++];
				@Pc(43) int local43 = arg6++;
				arg3[local43] += arg4[arg0++];
				@Pc(55) int local55 = arg6++;
				arg3[local55] += arg4[arg0++];
				@Pc(67) int local67 = arg6++;
				arg3[local67] += arg4[arg0++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg6++;
				arg3[local31] += arg4[arg0++];
			}
			arg0 += arg7;
			arg6 += arg5;
		}
	}
}
