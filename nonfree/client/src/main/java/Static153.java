import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "Lclient!tca;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
	public static int anInt2818;

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_19 = new Class163();

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII)V")
	public static void method2631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static472.anInt7503 && Static257.anInt4172 >= arg1 && arg2 >= Static73.anInt1542 && arg0 <= Static527.anInt8177) {
			if (arg4 == 1) {
				Static632.method8451(arg0, arg1, arg3, arg2, arg5);
			} else {
				Static452.method6344(arg2, arg1, arg0, arg3, arg4, arg5);
			}
		} else if (arg4 == 1) {
			Static543.method7259(arg3, arg2, arg1, arg5, arg0);
		} else {
			Static9.method8773(arg2, arg0, arg1, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Z")
	public static boolean method2633(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
