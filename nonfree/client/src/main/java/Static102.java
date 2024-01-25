import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!d;")
	public static Interface8 anInterface8_2;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!hda;")
	public static Class136 aClass136_43;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method1480() {
		if (Static270.anApplet5 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static270.anApplet5.getParameter("cookiehost");
			@Pc(23) int local23 = (int) (Static205.method3179() / 86400000L) - 11745;
			@Pc(35) String local35 = "usrdob=" + local23 + "; version=1; path=/; domain=" + local15;
			Static652.method1917(Static270.anApplet5, "document.cookie=\"" + local35 + "\"");
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
