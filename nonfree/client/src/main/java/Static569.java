import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static569 {

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIII)V")
	public static void method3888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static68.anInt1306 <= arg3 - arg5 && arg3 + arg5 <= Static589.anInt9684 && arg4 - arg5 >= Static252.anInt4971 && arg4 + arg5 <= Static359.anInt6232) {
			Static177.method3347(arg4, arg2, arg5, arg1, arg0, arg3);
		} else {
			Static218.method3777(arg5, arg4, arg0, arg2, arg3, arg1);
		}
	}
}
