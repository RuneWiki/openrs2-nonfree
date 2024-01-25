import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "[I")
	public static final int[] anIntArray244 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	public static void method2591() {
		Static319.aClass310_24.method6605();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2592(@OriginalArg(0) String arg0) {
		Static502.aString109 = arg0;
		if (Static533.anApplet4 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static533.anApplet4.getParameter("cookieprefix");
			@Pc(16) String local16 = Static533.anApplet4.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static366.method5459(Static587.method7753() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static605.method6793("document.cookie=\"" + local31 + "\"", Static533.anApplet4);
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
