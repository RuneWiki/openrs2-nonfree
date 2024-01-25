import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array12;

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "[I")
	public static int[] anIntArray579;

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	public static int anInt7223 = 100;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIII)V")
	public static void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static514.anInt8603 <= arg0 && Static487.anInt8320 >= arg3 && Static304.anInt4824 <= arg4 && Static231.anInt3977 >= arg1) {
			if (arg2 == 1) {
				Static183.method2933(arg0, arg5, arg1, arg3, arg4);
			} else {
				Static183.method2936(arg5, arg3, arg1, arg4, arg0, arg2);
			}
		} else if (arg2 == 1) {
			Static370.method5780(arg5, arg0, arg3, arg4, arg1);
		} else {
			Static517.method7431(arg2, arg3, arg0, arg1, arg4, arg5);
		}
	}
}
