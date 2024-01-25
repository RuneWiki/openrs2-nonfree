import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!sca", name = "K", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_208 = new Class359(4, 4);

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "(I)Z")
	public static boolean method7493() {
		if (Static361.aBoolean581) {
			try {
				if ((Boolean) Static682.method3657("showingVideoAd", Static639.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}
}
