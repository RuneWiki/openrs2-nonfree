import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
	public static int[] anIntArray737;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
	public static final int[] anIntArray736 = new int[8];

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	public static final int[] anIntArray738 = new int[6];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)V")
	public static void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg4; local7++) {
			Static227.method7421(arg0, arg3, arg1, Static81.anIntArrayArray25[local7]);
		}
	}
}
