import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	public static void method7587() {
		if (Static7.anApplet1 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static7.anApplet1.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static95.method1587() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static653.method5176(Static7.anApplet1, "document.cookie=\"" + local30 + "\"");
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
