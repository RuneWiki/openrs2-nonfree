import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_124 = new Class160(39, -1);

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[I")
	public static int[] anIntArray230 = new int[2];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3970(@OriginalArg(0) String arg0) {
		Static130.aString30 = arg0;
		if (Static531.anApplet2 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static531.anApplet2.getParameter("cookieprefix");
			@Pc(21) String local21 = Static531.anApplet2.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static387.method7862(Static26.method382() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static698.method8236("document.cookie=\"" + local40 + "\"", Static531.anApplet2);
		} catch (@Pc(95) Throwable local95) {
		}
	}
}
