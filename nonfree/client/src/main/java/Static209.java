import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
	public static final int[] anIntArray407 = new int[14];

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static int anInt4283 = 104;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	public static int anInt4285 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
	public static void method3317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static105.anInt2417 && arg3 <= Static70.anInt1843 && arg4 >= Static362.anInt6654 && Static164.anInt6595 >= arg0) {
			if (arg1 == 1) {
				Static456.method1120(arg2, arg3, arg5, arg0, arg4);
			} else {
				Static384.method5367(arg5, arg2, arg1, arg0, arg4, arg3);
			}
		} else if (arg1 == 1) {
			Static363.method5089(arg5, arg3, arg0, arg4, arg2);
		} else {
			Static345.method4883(arg3, arg1, arg5, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method3318() {
		Static347.method4917(false);
		if (Static402.anInt7265 >= 0 && Static402.anInt7265 != 0) {
			Static197.method3166(Static402.anInt7265);
			Static402.anInt7265 = -1;
		}
	}
}
