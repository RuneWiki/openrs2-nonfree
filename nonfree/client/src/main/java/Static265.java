import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!pk;")
	public static Class132 aClass132_89;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	public static void method4000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static253.anInt4996 && arg0 + arg2 <= Static52.anInt1146 && arg3 - arg0 >= Static228.anInt4643 && arg3 + arg0 <= Static244.anInt4872) {
			Static153.method2450(arg1, arg2, arg0, arg3);
		} else {
			Static292.method4264(arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void method4002(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static20.method361();
		} else if (arg0 == 2) {
			Static64.method989();
		} else if (arg0 == 3) {
			Static46.method741();
		} else {
			throw new RuntimeException();
		}
	}
}
