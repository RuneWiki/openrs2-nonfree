import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!je;")
	public static Class147 aClass147_2;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!h;")
	public static final Class114 aClass114_64 = new Class114("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean207 = true;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BD)V")
	public static void method2993(@OriginalArg(1) double arg0) {
		if (arg0 == Static497.aDouble9) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static94.anIntArray186[local7] = local19 <= 255 ? local19 : 255;
		}
		Static497.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2994(@OriginalArg(0) String arg0) {
		Static120.aString18 = arg0;
		if (Static91.aClass182_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(20) String local20 = Static91.aClass182_2.anApplet1.getParameter("cookieprefix");
			@Pc(25) String local25 = Static91.aClass182_2.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local20 + "settings=" + arg0 + "; version=1; path=/; domain=" + local25;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static368.method5686(Static93.method2172() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static554.method4840("document.cookie=\"" + local40 + "\"", Static91.aClass182_2.anApplet1);
		} catch (@Pc(90) Throwable local90) {
		}
	}
}
