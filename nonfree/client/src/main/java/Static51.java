import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_2 = new Class337(11, 7);

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
	public static int anInt1427 = 0;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	public static int anInt1431 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1471(@OriginalArg(0) String arg0) {
		Static330.aString66 = arg0;
		if (Static504.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static504.anApplet2.getParameter("cookieprefix");
			@Pc(16) String local16 = Static504.anApplet2.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static75.method1771(Static374.method6036() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static646.method3053(Static504.anApplet2, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(80) Throwable local80) {
		}
	}
}
