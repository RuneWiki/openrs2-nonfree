import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)Z")
	public static boolean method8527() {
		if (Static543.aBoolean676) {
			try {
				Static652.method1818("showVideoAd", Static303.anApplet3);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
