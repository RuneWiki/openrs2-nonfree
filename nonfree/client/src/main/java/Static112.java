import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dka", name = "y", descriptor = "Lclient!ff;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!dka", name = "n", descriptor = "Lclient!sja;")
	public static Class321 aClass321_1;

	@OriginalMember(owner = "client!dka", name = "z", descriptor = "Lclient!el;")
	public static final Class109 aClass109_47 = new Class109(70, 8);

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "(B)V")
	public static void method1624() {
		if (Static492.anApplet2 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static492.anApplet2.getParameter("cookiehost");
			@Pc(21) int local21 = (int) (Static515.method7499(78) / 86400000L) - 11745;
			@Pc(37) String local37 = "usrdob=" + local21 + "; version=1; path=/; domain=" + local13;
			Static681.method741("document.cookie=\"" + local37 + "\"", Static492.anApplet2);
		} catch (@Pc(53) Throwable local53) {
		}
	}
}
