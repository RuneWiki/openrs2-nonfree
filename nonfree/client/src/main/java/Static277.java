import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!al;")
	public static final Class15 aClass15_8 = new Class15();

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_10 = new Class178(15, 0, 1, 0);

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_7 = new Class379("", 19);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4540(@OriginalArg(1) String arg0) {
		Static587.aString90 = arg0;
		if (Static303.anApplet3 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static303.anApplet3.getParameter("cookieprefix");
			@Pc(16) String local16 = Static303.anApplet3.getParameter("cookiehost");
			@Pc(39) String local39 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static164.method2797(Static191.method3071() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static652.method1817("document.cookie=\"" + local39 + "\"", Static303.anApplet3);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
