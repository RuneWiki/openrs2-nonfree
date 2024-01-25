import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5890(@OriginalArg(0) String arg0) {
		Static397.aString62 = arg0;
		if (Static562.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static562.anApplet2.getParameter("cookieprefix");
			@Pc(21) String local21 = Static562.anApplet2.getParameter("cookiehost");
			@Pc(36) String local36 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static129.method2161(Static548.method7437() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static602.method6575("document.cookie=\"" + local36 + "\"", Static562.anApplet2);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
