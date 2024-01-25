import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!jda;")
	public static final Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "J")
	public static long aLong41 = -1L;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 16);
		local9.method1712();
		local9.anInt1790 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1571(@OriginalArg(1) String arg0) {
		Static605.aString120 = arg0;
		if (Static287.anApplet2 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static287.anApplet2.getParameter("cookieprefix");
			@Pc(22) String local22 = Static287.anApplet2.getParameter("cookiehost");
			@Pc(37) String local37 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local22;
			if (arg0.length() == 0) {
				local37 = local37 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local37 = local37 + "; Expires=" + Static80.method8702(Static131.method2268() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static685.method3972("document.cookie=\"" + local37 + "\"", Static287.anApplet2);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
