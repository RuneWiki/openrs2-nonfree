import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_86 = new Class145(11, 8);

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	public static int anInt5207 = -1;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_111 = new Class200(80, 10);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4558(@OriginalArg(0) String arg0) {
		Static112.aString22 = arg0;
		if (Static107.anApplet1 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static107.anApplet1.getParameter("cookieprefix");
			@Pc(20) String local20 = Static107.anApplet1.getParameter("cookiehost");
			@Pc(35) String local35 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static61.method1408(Static48.method1203() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static655.method4699("document.cookie=\"" + local35 + "\"", Static107.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
