import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public static int anInt7540;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	public static void method6644() {
		if (Static124.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static124.anApplet1.getParameter("cookiehost");
			@Pc(23) int local23 = (int) (Static524.method7320() / 86400000L) - 11745;
			@Pc(35) String local35 = "usrdob=" + local23 + "; version=1; path=/; domain=" + local15;
			Static686.method8107("document.cookie=\"" + local35 + "\"", Static124.anApplet1);
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
