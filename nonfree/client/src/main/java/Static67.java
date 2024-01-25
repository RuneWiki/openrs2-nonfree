import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "Z")
	public static boolean aBoolean86;

	@OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
	public static int anInt1336;

	@OriginalMember(owner = "client!cfa", name = "n", descriptor = "Lclient!st;")
	public static final Class314 aClass314_27 = new Class314(16, 16);

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIBI)V")
	public static void method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static182.method2982(arg3, arg4, arg0, arg2);
		} else if (Static474.anInt8118 <= arg3 - arg4 && arg3 + arg4 <= Static576.anInt9425 && arg0 - arg1 >= Static298.anInt5919 && Static596.anInt9703 >= arg0 + arg1) {
			Static318.method5300(arg1, arg0, arg4, arg3, arg2);
		} else {
			Static73.method1256(arg3, arg2, arg4, arg1, arg0);
		}
	}
}
