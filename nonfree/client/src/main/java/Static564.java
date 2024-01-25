import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "[Lclient!co;")
	public static final Class65[] aClass65Array2 = new Class65[14];

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Z")
	public static boolean method7728() {
		if (Static394.aBoolean491) {
			try {
				Static680.method2300("showVideoAd", Static285.anApplet5);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}
