import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_17 = new Class28(0, 2, 2, 1);

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray119 = new String[5];

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_7 = new Class269("", 10);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z")
	public static boolean method5499(@OriginalArg(0) int arg0) {
		if (arg0 == 25 || arg0 == 11 || arg0 == 6 || arg0 == 46 || arg0 == 16) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg6) {
			Static126.method4753(arg5, arg6, arg0, arg2, arg4, arg3);
		} else if (arg4 - arg6 >= Static553.anInt9074 && Static249.anInt4668 >= arg6 + arg4 && arg0 - arg1 >= Static326.anInt6028 && arg0 + arg1 <= Static80.anInt1738) {
			Static116.method1743(arg4, arg6, arg2, arg1, arg5, arg0, arg3);
		} else {
			Static140.method2380(arg0, arg1, arg6, arg5, arg4, arg2, arg3);
		}
	}
}
