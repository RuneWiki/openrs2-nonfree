import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_30;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_169 = new Class73(118, 1);

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_46 = new Class380(16);

	@OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
	public static int anInt9728 = 0;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
	public static void method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg2) {
			Static379.method6002(arg0, arg2, arg1, arg4);
		} else if (Static309.anInt6227 <= arg1 - arg2 && arg1 + arg2 <= Static7.anInt464 && arg0 - arg3 >= Static633.anInt10644 && Static389.anInt7300 >= arg0 + arg3) {
			Static500.method7620(arg0, arg2, arg4, arg1, arg3);
		} else {
			Static80.method2194(arg3, arg1, arg2, arg0, arg4);
		}
	}
}
