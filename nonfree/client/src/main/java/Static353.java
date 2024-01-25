import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static353 {

	@OriginalMember(owner = "client!ro", name = "Y", descriptor = "Lclient!rb;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_13 = new Class95(0, 4);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
	public static void method4696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg0) {
			Static369.method4840(arg2, arg1, arg4, arg3);
		} else if (Static452.anInt7626 <= arg1 - arg3 && arg1 + arg3 <= Static82.anInt3956 && arg2 - arg0 >= Static341.anInt5789 && Static309.anInt5495 >= arg2 + arg0) {
			Static415.method5325(arg1, arg0, arg2, arg4, arg3);
		} else {
			Static246.method3708(arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
	public static boolean method4698(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z")
	public static boolean method4700(@OriginalArg(1) int arg0) {
		if (arg0 == 48 || arg0 == 44 || arg0 == 3 || arg0 == 23 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1010;
		}
	}
}
