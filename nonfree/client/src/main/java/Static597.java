import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_104 = new Class286(86, 1);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "[I")
	public static final int[] anIntArray538 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8211(@OriginalArg(1) String arg0) {
		Static236.aString77 = arg0;
		if (Static395.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static395.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static395.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static591.method8104(Static626.method8479() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static733.method8726(Static395.anApplet1, "document.cookie=\"" + local40 + "\"");
		} catch (@Pc(97) Throwable local97) {
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IBI)Z")
	public static boolean method8214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
