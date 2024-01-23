import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!sn", name = "L", descriptor = "Lclient!se;")
	public static Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!sn", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString283 = "slide:";

	@OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V")
	public static void method4140() {
		Static183.aClass187_94.method4530();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4142(@OriginalArg(0) String arg0) {
		Static37.aString43 = arg0;
		if (Static26.aClass154_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(21) String local21 = Static26.aClass154_1.anApplet1.getParameter("cookieprefix");
			@Pc(26) String local26 = Static26.aClass154_1.anApplet1.getParameter("cookiehost");
			@Pc(41) String local41 = local21 + "settings=" + arg0 + "; version=1; path=/; domain=" + local26;
			if (arg0.length() == 0) {
				local41 = local41 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local41 = local41 + "; Expires=" + Static274.method4262(Static298.method4535() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static321.method2505(Static26.aClass154_1.anApplet1, "document.cookie=\"" + local41 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}
}
