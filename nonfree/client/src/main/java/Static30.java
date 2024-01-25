import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "Lclient!ui;")
	public static Class89 aClass89_2;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
	public static int anInt9642 = 0;

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
	public static int anInt9643 = 0;

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
	public static int anInt9645 = -1;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static251.anInt5168 <= arg2 && arg2 <= Static341.anInt6481 && arg4 >= Static251.anInt5168 && arg4 <= Static341.anInt6481 && arg6 >= Static251.anInt5168 && Static341.anInt6481 >= arg6 && arg5 >= Static251.anInt5168 && arg5 <= Static341.anInt6481 && arg0 >= Static507.anInt9124 && Static234.anInt4897 >= arg0 && arg7 >= Static507.anInt9124 && arg7 <= Static234.anInt4897 && arg8 >= Static507.anInt9124 && arg8 <= Static234.anInt4897 && Static507.anInt9124 <= arg3 && Static234.anInt4897 >= arg3) {
			Static538.method7925(arg4, arg2, arg0, arg7, arg6, arg5, arg3, arg1, arg8);
		} else {
			Static198.method3765(arg7, arg0, arg3, arg6, arg4, arg2, arg5, arg1, arg8);
		}
	}
}
