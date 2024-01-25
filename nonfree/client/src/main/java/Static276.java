import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static276 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!wn;")
	public static Class269 aClass269_39;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
	public static void method3433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == arg2) {
			Static297.method3689(arg0, arg1, arg2, arg4);
		} else if (Static3.anInt45 <= arg0 - arg2 && Static112.anInt1900 >= arg0 + arg2 && arg1 - arg3 >= Static356.anInt5817 && Static3.anInt46 >= arg1 + arg3) {
			Static135.method1948(arg3, arg1, arg4, arg0, arg2);
		} else {
			Static215.method2843(arg3, arg1, arg0, arg4, arg2);
		}
	}
}
