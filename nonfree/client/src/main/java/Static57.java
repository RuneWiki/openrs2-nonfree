import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_35 = new Class319(56, 3);

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z")
	public static boolean method1362() {
		if (Static253.aBoolean365) {
			try {
				if ((Boolean) Static602.method5582(Static412.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}
}
