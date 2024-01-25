import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "Z")
	public static boolean aBoolean244;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg6) {
			Static67.method1530(arg2, arg1, arg3, arg4, arg6, arg5);
		} else if (arg1 - arg6 >= Static110.anInt2597 && arg1 + arg6 <= Static459.anInt7524 && Static385.anInt6630 <= arg3 - arg0 && Static69.anInt1918 >= arg3 + arg0) {
			Static119.method2476(arg4, arg1, arg5, arg2, arg0, arg6, arg3);
		} else {
			Static102.method756(arg6, arg2, arg4, arg5, arg0, arg1, arg3);
		}
	}
}
