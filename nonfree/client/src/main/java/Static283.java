import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_425 = new Class123(90, 12);

	@OriginalMember(owner = "client!og", name = "f", descriptor = "S")
	public static short aShort104 = 1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6587(@OriginalArg(1) String arg0) {
		Static65.aString14 = arg0;
		if (Static45.aClass209_127.anApplet1 == null) {
			return;
		}
		try {
			@Pc(22) String local22 = Static45.aClass209_127.anApplet1.getParameter("cookieprefix");
			@Pc(27) String local27 = Static45.aClass209_127.anApplet1.getParameter("cookiehost");
			@Pc(42) String local42 = local22 + "settings=" + arg0 + "; version=1; path=/; domain=" + local27;
			if (arg0.length() == 0) {
				local42 = local42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local42 = local42 + "; Expires=" + Static129.method2310(Static449.method6552() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static456.method3805("document.cookie=\"" + local42 + "\"", Static45.aClass209_127.anApplet1);
		} catch (@Pc(94) Throwable local94) {
		}
	}
}
