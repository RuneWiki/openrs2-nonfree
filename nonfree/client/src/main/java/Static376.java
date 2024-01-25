import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!os;")
	public static Class118 aClass118_7;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array15;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public static int anInt6265 = -1;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)Z")
	public static boolean method5589() {
		if (Static153.aBoolean211) {
			try {
				if ((Boolean) Static398.method1714(Static61.aClass156_1.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method5590() {
		if (Static22.anInt291 != -1) {
			Static221.method3684(Static22.anInt291, -1, false, -1);
			Static22.anInt291 = -1;
		}
	}
}
