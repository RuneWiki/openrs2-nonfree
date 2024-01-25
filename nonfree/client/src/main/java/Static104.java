import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "Lclient!gj;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
	public static int anInt2176;

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(B)Z")
	public static boolean method1840() {
		if (Static116.aBoolean192) {
			try {
				if ((Boolean) Static682.method5126("showingVideoAd", Static645.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}
}
