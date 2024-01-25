import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!or", name = "W", descriptor = "I")
	public static int anInt4650;

	@OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
	public static int anInt4653;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	public static int anInt4640 = 0;

	@OriginalMember(owner = "client!or", name = "N", descriptor = "Z")
	public static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_70 = new Class57("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!or", name = "V", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_71 = new Class57("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!or", name = "X", descriptor = "I")
	public static final int anInt4651 = anInt4653;

	@OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
	public static final int anInt4652 = anInt4653 >> 2;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4173(@OriginalArg(1) String arg0) {
		Static368.aString57 = arg0;
		if (Static61.aClass156_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static61.aClass156_1.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static61.aClass156_1.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static271.method5652(Static288.method4512() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static398.method1713("document.cookie=\"" + local38 + "\"", Static61.aClass156_1.anApplet1);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
