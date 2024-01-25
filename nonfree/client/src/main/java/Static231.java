import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_106 = new Class85("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	public static final int[] anIntArray425 = new int[100];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
	public static int method4151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static310.anIntArray625[arg1 & 0x3] : Static308.anIntArray588[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!lb;III[Z)Z")
	public static boolean method4152(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static8.aClass51Array1 != Static219.aClass51Array3) {
			@Pc(11) int local11 = Static56.aClass51Array2[arg1].method1844(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class51 local18 = Static56.aClass51Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method1844(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method1852(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method1851(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4153(@OriginalArg(0) String arg0) {
		Static96.aString10 = arg0;
		if (Static182.aClass139_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static182.aClass139_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static182.aClass139_5.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static351.method5975(Static340.method5863() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static370.method5990("document.cookie=\"" + local34 + "\"", Static182.aClass139_5.anApplet1);
		} catch (@Pc(89) Throwable local89) {
		}
	}
}
