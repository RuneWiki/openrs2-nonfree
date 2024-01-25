import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static337 {

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public static int anInt6959;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public static int anInt6958 = 0;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_15 = new Class219(14, 0, 4, 1);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZIII)V")
	public static void method5790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static535.anInt9696 <= arg3 - arg2 && arg2 + arg3 <= Static35.anInt993 && Static55.anInt1303 <= arg1 - arg2 && Static208.anInt4309 >= arg1 + arg2) {
			Static1.method122(arg1, arg0, arg2, arg3);
		} else {
			Static133.method2778(arg0, arg1, arg2, arg3);
		}
	}
}
