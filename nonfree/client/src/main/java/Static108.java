import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIB)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg1) {
			Static228.method3480(arg1, arg3, Static60.anIntArrayArray14[arg0], arg2);
		} else {
			Static228.method3480(arg2, arg3, Static60.anIntArrayArray14[arg0], arg1);
		}
	}
}
