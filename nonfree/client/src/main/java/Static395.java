import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static395 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!uv;")
	public static Class335 aClass335_1;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!pu;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public static boolean method5608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static26.method714(arg0, arg1) | Static541.method7812(arg0, arg1) | Static213.method3549(arg1, arg0)) & Static492.method6897(arg1, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!sk;)I")
	public static int method5609(@OriginalArg(1) Class297 arg0) {
		if (Static514.aClass297_13 == arg0) {
			return 6407;
		} else if (Static253.aClass297_5 == arg0) {
			return 6408;
		} else if (arg0 == Static257.aClass297_6) {
			return 6406;
		} else if (arg0 == Static66.aClass297_2) {
			return 6409;
		} else if (Static275.aClass297_8 == arg0) {
			return 6410;
		} else if (Static1.aClass297_1 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
