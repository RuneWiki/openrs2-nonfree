import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII[BII[BI)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(23) int local23 = -(arg0 & 0x3);
		for (@Pc(26) int local26 = -arg7; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg5++;
				arg6[local34] = (byte) (arg6[local34] - arg3[arg4++]);
				@Pc(47) int local47 = arg5++;
				arg6[local47] = (byte) (arg6[local47] - arg3[arg4++]);
				@Pc(60) int local60 = arg5++;
				arg6[local60] = (byte) (arg6[local60] - arg3[arg4++]);
				@Pc(73) int local73 = arg5++;
				arg6[local73] = (byte) (arg6[local73] - arg3[arg4++]);
			}
			for (@Pc(92) int local92 = local23; local92 < 0; local92++) {
				local34 = arg5++;
				arg6[local34] = (byte) (arg6[local34] - arg3[arg4++]);
			}
			arg5 += arg1;
			arg4 += arg2;
		}
	}
}
