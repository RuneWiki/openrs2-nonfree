import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_111 = new Class15("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BC)C")
	public static char method4887(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4888(@OriginalArg(0) String arg0) {
		Static7.aString2 = arg0;
		if (Static24.aClass196_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static24.aClass196_1.anApplet1.getParameter("cookieprefix");
			@Pc(23) String local23 = Static24.aClass196_1.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local23;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static33.method446(Static266.method3498() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static467.method5999("document.cookie=\"" + local38 + "\"", Static24.aClass196_1.anApplet1);
		} catch (@Pc(87) Throwable local87) {
		}
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)I")
	public static int method4889() {
		return Static258.anInt4313;
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(Z)V")
	public static void method4890() {
		Static75.aClass95_5 = null;
		Static73.aClass95_4 = null;
		Static365.aClass95_19 = null;
		Static8.aClass95_1 = null;
		Static286.aClass95_12 = null;
		Static147.aClass95_6 = null;
		Static301.aClass95_16 = null;
		Static299.aClass95_15 = null;
		Static243.aClass95Array8 = null;
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V")
	public static void method4891() {
		Static147.aFont1 = null;
		Static244.anImage2 = null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ga;IILjava/awt/Canvas;)Lclient!ya;")
	public static Class135 method4893(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class135_Sub1(arg1, arg2, arg0);
	}
}
