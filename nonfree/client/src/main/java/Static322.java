import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!ni", name = "pb", descriptor = "I")
	public static int anInt6116;

	@OriginalMember(owner = "client!ni", name = "sb", descriptor = "Lclient!ha;")
	public static Class104 aClass104_22;

	@OriginalMember(owner = "client!ni", name = "qb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!ni", name = "rb", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_94 = new Class45("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ni", name = "tb", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_95 = new Class45("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CB)C")
	public static char method5565(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static325.anInt6148 <= arg4 && arg0 <= Static119.anInt2469 && Static94.anInt2057 <= arg5 && arg6 <= Static187.anInt3872) {
			Static402.method6384(arg0, arg2, arg3, arg4, arg6, arg1, arg5);
		} else {
			Static521.method7941(arg2, arg0, arg6, arg4, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!dn;)V")
	public static void method5567(@OriginalArg(1) Class69 arg0) {
		Static364.aClass69_74 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5569(@OriginalArg(0) String arg0) {
		Static18.aString9 = arg0;
		if (Static473.aClass229_14.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static473.aClass229_14.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static473.aClass229_14.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static459.method7008(Static110.method2222() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static558.method7781(Static473.aClass229_14.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(89) Throwable local89) {
		}
	}
}
