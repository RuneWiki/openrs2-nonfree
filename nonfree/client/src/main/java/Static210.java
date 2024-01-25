import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
	public static int anInt4587;

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
	public static int anInt4592;

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "Lclient!iq;")
	public static Class104 aClass104_117;

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "J")
	public static long aLong138 = 0L;

	@OriginalMember(owner = "client!ms", name = "fb", descriptor = "I")
	public static int anInt4603 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
	public static void method3963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 >= Static108.anInt2266 && Static205.anInt4504 >= arg5 && arg0 >= Static197.anInt4298 && arg3 <= Static38.anInt553) {
			if (arg4 == 1) {
				Static317.method5264(arg3, arg0, arg5, arg1, arg2);
			} else {
				Static144.method2759(arg1, arg5, arg4, arg2, arg0, arg3);
			}
		} else if (arg4 == 1) {
			Static321.method1016(arg0, arg5, arg2, arg3, arg1);
		} else {
			Static48.method3550(arg0, arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	public static void method3968() {
		Static224.method5495(25);
		Static123.method2390();
		System.gc();
	}
}
