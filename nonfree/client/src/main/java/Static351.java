import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public static int anInt5981;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)Z")
	public static boolean method5072() {
		if (Static215.aBoolean348) {
			try {
				if ((Boolean) Static733.method8728(Static395.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return true;
	}
}
