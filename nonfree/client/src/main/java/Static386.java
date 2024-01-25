import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "[Lclient!fq;")
	public static Class2_Sub17_Sub1[] aClass2_Sub17_Sub1Array3;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_44 = new Class30();

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_139 = new Class205(53, 7);

	@OriginalMember(owner = "client!wn", name = "K", descriptor = "S")
	public static short aShort98 = 205;

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "Z")
	public static final boolean aBoolean469 = false;

	@OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
	public static int anInt6583 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5633(@OriginalArg(0) String arg0) {
		Static9.aString6 = arg0;
		if (Static359.aClass111_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static359.aClass111_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static359.aClass111_5.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static233.method3792(Static39.method699() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static403.method4139(Static359.aClass111_5.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(90) Throwable local90) {
		}
	}
}
