import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!es", name = "q", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array4;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_98 = new Class123(93, 12);

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Z")
	public static boolean method2603() {
		@Pc(7) Class3 local7 = Static260.aClass244_40.aClass3_189.aClass3_286;
		if (local7 == null || local7 == Static260.aClass244_40.aClass3_189) {
			return false;
		}
		@Pc(18) Class3_Sub13 local18 = (Class3_Sub13) local7;
		if (local18.anInt2364 >= 2000) {
			local18.anInt2364 -= 2000;
		}
		return local18.anInt2364 == 1006;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2604(@OriginalArg(1) String arg0) {
		Static44.aString268 = arg0;
		if (Static304.anApplet1 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static304.anApplet1.getParameter("cookieprefix");
			@Pc(16) String local16 = Static304.anApplet1.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static584.method7948(Static96.method2000() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static600.method2904("document.cookie=\"" + local31 + "\"", Static304.anApplet1);
		} catch (@Pc(84) Throwable local84) {
		}
	}
}
