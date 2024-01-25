import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!hja;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!lb;")
	public static Class221 aClass221_116;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
	public static int[] anIntArray390;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "[Lclient!dr;")
	public static Class79[] aClass79Array2;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public static int anInt7243 = 0;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public static final int anInt7246 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 == arg2) {
			Static539.method8109(arg1, arg3, arg0, arg4, arg5, arg6);
		} else if (Static85.anInt1313 <= arg5 - arg3 && arg3 + arg5 <= Static316.anInt6313 && arg6 - arg2 >= Static280.anInt5114 && arg6 + arg2 <= Static356.anInt6028) {
			Static349.method5054(arg6, arg2, arg3, arg4, arg5, arg1, arg0);
		} else {
			Static420.method6212(arg2, arg6, arg3, arg1, arg4, arg5, arg0);
		}
	}
}
