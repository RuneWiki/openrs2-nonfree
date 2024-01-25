import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public static int anInt7301 = -1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
	public static boolean method6109() {
		if (Static488.aBoolean570) {
			try {
				if ((Boolean) Static557.method5219("showingVideoAd", Static466.aClass102_4.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
