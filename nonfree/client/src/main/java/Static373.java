import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "[I")
	public static final int[] anIntArray538 = new int[1];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method4858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg1) {
			Static216.method2862(arg1, arg0, arg3, Static229.anIntArrayArray26[arg2]);
		} else {
			Static216.method2862(arg0, arg1, arg3, Static229.anIntArrayArray26[arg2]);
		}
	}
}
