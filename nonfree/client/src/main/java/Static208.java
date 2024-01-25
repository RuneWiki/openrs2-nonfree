import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIB)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg4) {
			Static103.method1933(arg3, arg4, arg2, arg1);
		} else if (Static7.anInt8119 <= arg3 - arg4 && Static34.anInt603 >= arg3 + arg4 && Static328.anInt6154 <= arg1 - arg0 && arg0 + arg1 <= Static394.anInt7462) {
			Static246.method3898(arg0, arg2, arg1, arg4, arg3);
		} else {
			Static151.method2613(arg4, arg2, arg0, arg3, arg1);
		}
	}
}
