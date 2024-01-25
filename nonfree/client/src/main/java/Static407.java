import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	public static boolean method5833() {
		if (Static144.aBoolean206) {
			try {
				if ((Boolean) Static597.method645(Static433.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZIIII)V")
	public static void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg1) {
			Static81.method1351(arg2, arg1, arg0, arg4, arg6, arg5);
		} else if (Static330.anInt6025 <= arg2 - arg1 && Static194.anInt3788 >= arg1 + arg2 && arg6 - arg3 >= Static120.anInt2491 && arg6 + arg3 <= Static71.anInt1350) {
			Static593.method7905(arg0, arg3, arg4, arg6, arg1, arg2, arg5);
		} else {
			Static321.method4775(arg6, arg2, arg0, arg4, arg1, arg5, arg3);
		}
	}
}
