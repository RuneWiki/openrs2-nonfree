import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIBII)V")
	public static void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg2) {
			Static259.method4236(arg0, arg2, arg3, Static618.anIntArrayArray101[arg1]);
		} else {
			Static259.method4236(arg2, arg0, arg3, Static618.anIntArrayArray101[arg1]);
		}
	}
}
