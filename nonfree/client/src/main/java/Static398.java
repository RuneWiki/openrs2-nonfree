import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tq", name = "Gb", descriptor = "I")
	public static int anInt6955;

	@OriginalMember(owner = "client!tq", name = "Kb", descriptor = "I")
	public static int anInt6959;

	@OriginalMember(owner = "client!tq", name = "Mb", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_95 = new Class208(62, 3);

	@OriginalMember(owner = "client!tq", name = "Nb", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5580(@OriginalArg(0) String arg0) {
		Static222.aString34 = arg0;
		if (Static138.aClass194_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static138.aClass194_2.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static138.aClass194_2.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static353.method4958(Static432.method5870() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static471.method4357("document.cookie=\"" + local34 + "\"", Static138.aClass194_2.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
