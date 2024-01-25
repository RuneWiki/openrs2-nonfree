import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_47 = new Class380(32);

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_61 = new Class94(64);

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_13 = new Class122("", 10);

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public static int anInt9806 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)I")
	public static int method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(34) double local34 = local17 + Math.random() * (local10 - local17);
		return (int) (Math.pow(2.0D, local34) + 0.5D);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8007(@OriginalArg(1) String arg0) {
		Static162.aString39 = arg0;
		if (Static635.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static635.anApplet2.getParameter("cookieprefix");
			@Pc(16) String local16 = Static635.anApplet2.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static457.method6895(Static582.method8056() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static651.method5915(Static635.anApplet2, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(89) Throwable local89) {
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	public static void method8008() {
		Static412.aClass94_39.method2952();
	}
}
