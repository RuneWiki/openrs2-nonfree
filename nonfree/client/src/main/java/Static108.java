import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!maa;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static int anInt1853;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Lclient!av;")
	public static final Class27 aClass27_3 = new Class27(2, 5);

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt1852 = -1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V")
	public static void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static468.anInt7895 <= arg1 - arg3 && arg1 + arg3 <= Static382.anInt6719 && arg2 - arg3 >= Static410.anInt7068 && arg3 + arg2 <= Static281.anInt5188) {
			Static652.method9129(arg1, arg3, arg5, arg2, arg4, arg0);
		} else {
			Static352.method8326(arg5, arg1, arg4, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	public static void method1771(@OriginalArg(1) int arg0) {
		if (!Static351.method9355()) {
			return;
		}
		if (arg0 != Static325.anInt5631) {
			Static423.aString83 = "";
		}
		Static325.anInt5631 = arg0;
		Static277.aClass347_1.method8306();
		Static160.method2323(5);
	}
}
