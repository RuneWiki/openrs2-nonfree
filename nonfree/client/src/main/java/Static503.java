import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
	public static boolean method7334() {
		if (Static193.aBoolean378) {
			try {
				if ((Boolean) Static653.method5390("showingVideoAd", Static632.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return true;
	}
}
