import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public static int anInt3842;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!ss;")
	public static Class219 aClass219_11 = null;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZIIII)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static237.anInt4246 = arg5;
		Static309.anInt2245 = arg2;
		Static167.anInt3121 = arg1;
		Static45.anInt842 = arg0;
		Static204.anInt3742 = arg4;
		Static404.anInt6988 = arg3;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)Z")
	public static boolean method3187() {
		if (Static45.aBoolean36) {
			try {
				Static456.method694(Static119.aClass138_7.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}
}
