import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	public static boolean aBoolean391;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt4426 = 0;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt4429 = -2;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static99.anInt915 <= arg5 && Static38.anInt784 >= arg2 && Static223.anInt4869 <= arg3 && arg1 <= Static47.anInt1057) {
			Static227.method3687(arg5, arg2, arg6, arg1, arg0, arg4, arg3);
		} else {
			Static174.method2776(arg0, arg4, arg6, arg1, arg3, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZZ)I")
	public static int method3290() {
		return Static79.anInt1742 + Static76.anInt1703;
	}
}
