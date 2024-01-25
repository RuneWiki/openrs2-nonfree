import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!tda;")
	public static Class346 aClass346_11;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "Lclient!hd;")
	public static final Class146 aClass146_5 = new Class146();

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
	public static int anInt7799 = 0;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	public static int anInt7800 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6771(@OriginalArg(1) String arg0) {
		Static565.aString101 = arg0;
		if (Static265.anApplet2 == null) {
			return;
		}
		try {
			@Pc(22) String local22 = Static265.anApplet2.getParameter("cookieprefix");
			@Pc(28) String local28 = Static265.anApplet2.getParameter("cookiehost");
			@Pc(47) String local47 = local22 + "settings=" + arg0 + "; version=1; path=/; domain=" + local28;
			if (arg0.length() == 0) {
				local47 = local47 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local47 = local47 + "; Expires=" + Static125.method1872(Static480.method6763() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static684.method783("document.cookie=\"" + local47 + "\"", Static265.anApplet2);
		} catch (@Pc(107) Throwable local107) {
		}
	}
}
