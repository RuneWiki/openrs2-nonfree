import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[128][128];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!nt;)I")
	public static int method4906(@OriginalArg(2) Class177 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(23) int local23 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg1; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg5++;
				arg3[local34] += arg7[arg0++];
				@Pc(46) int local46 = arg5++;
				arg3[local46] += arg7[arg0++];
				@Pc(58) int local58 = arg5++;
				arg3[local58] += arg7[arg0++];
				@Pc(70) int local70 = arg5++;
				arg3[local70] += arg7[arg0++];
			}
			for (@Pc(85) int local85 = local23; local85 < 0; local85++) {
				local34 = arg5++;
				arg3[local34] += arg7[arg0++];
			}
			arg0 += arg6;
			arg5 += arg4;
		}
	}
}
