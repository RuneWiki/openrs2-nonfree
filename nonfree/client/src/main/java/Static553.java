import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static553 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt9240 = 0;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt9241 = -1;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V")
	public static void method7781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static85.anInt1313 && arg2 <= Static316.anInt6313 && arg3 >= Static280.anInt5114 && arg4 <= Static356.anInt6028) {
			if (arg5 == 1) {
				Static670.method8880(arg3, arg4, arg1, arg2, arg0);
			} else {
				Static688.method331(arg5, arg0, arg2, arg3, arg1, arg4);
			}
		} else if (arg5 == 1) {
			Static102.method1354(arg0, arg1, arg4, arg3, arg2);
		} else {
			Static577.method7992(arg0, arg1, arg2, arg4, arg5, arg3);
		}
	}
}
