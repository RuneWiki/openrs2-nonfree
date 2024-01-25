import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "Lclient!uc;")
	public static final Class240 aClass240_1 = new Class240(16);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	public static void method860(@OriginalArg(0) int arg0) {
		if (Static266.method2725(arg0)) {
			Static118.method1611(Static369.aClass250ArrayArray5[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static271.anInt4271 && Static13.anInt263 >= arg1 && Static74.anInt1413 <= arg4 && Static149.anInt7384 >= arg3) {
			Static386.method4927(arg1, arg3, arg0, arg6, arg2, arg5, arg4);
		} else {
			Static102.method1463(arg6, arg5, arg0, arg1, arg2, arg3, arg4);
		}
	}
}
