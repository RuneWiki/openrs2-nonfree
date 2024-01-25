import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "Lclient!im;")
	public static Class147 aClass147_2;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_107 = new Class40(14, 1);

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	public static int anInt4465 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method3828() {
		if (Static454.anInterface14Array1 == null) {
			return;
		}
		@Pc(17) Interface14[] local17 = Static454.anInterface14Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface14 local25 = local17[local19];
			local25.method5118();
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method3832(@OriginalArg(1) String arg0) {
		Static492.aString102 = arg0;
		if (Static189.anApplet4 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static189.anApplet4.getParameter("cookieprefix");
			@Pc(16) String local16 = Static189.anApplet4.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static402.method5895(Static137.method2058() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static587.method3348("document.cookie=\"" + local31 + "\"", Static189.anApplet4);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
