import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "Fd", descriptor = "I")
	public static int anInt287;

	@OriginalMember(owner = "client!aa", name = "Id", descriptor = "[B")
	public static byte[] aByteArray2;

	@OriginalMember(owner = "client!aa", name = "Wd", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!aa", name = "fe", descriptor = "Lclient!a;")
	private static Class1 aClass1_268 = Static94.method1596("green:");

	@OriginalMember(owner = "client!aa", name = "ud", descriptor = "Lclient!a;")
	public static Class1 aClass1_260 = aClass1_268;

	@OriginalMember(owner = "client!aa", name = "xd", descriptor = "Lclient!a;")
	private static Class1 aClass1_261 = Static94.method1596("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!aa", name = "Cd", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!aa", name = "Hd", descriptor = "Lclient!a;")
	public static Class1 aClass1_262 = Static94.method1596("Mitteilung");

	@OriginalMember(owner = "client!aa", name = "Nd", descriptor = "Lclient!a;")
	public static Class1 aClass1_263 = Static94.method1596("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!aa", name = "Xd", descriptor = "Lclient!a;")
	public static Class1 aClass1_265 = Static94.method1596("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!aa", name = "Yd", descriptor = "Lclient!a;")
	public static Class1 aClass1_266 = aClass1_261;

	@OriginalMember(owner = "client!aa", name = "ae", descriptor = "I")
	public static int anInt299 = 0;

	@OriginalMember(owner = "client!aa", name = "ce", descriptor = "Lclient!a;")
	public static Class1 aClass1_267 = Static94.method1596("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "(I)V")
	public static void method120() {
		try {
			@Pc(6) Graphics local6 = Static103.aCanvas1.getGraphics();
			Static30.aClass4_22.method1525(4, local6, 4);
		} catch (@Pc(14) Exception local14) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Z")
	public static boolean method121(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
	public static void method122() {
		aClass1_263 = null;
		aClass1_262 = null;
		aByteArray2 = null;
		aClass1_265 = null;
		anIntArray23 = null;
		aClass1_261 = null;
		aClass1_268 = null;
		aClass1_266 = null;
		aClass1_267 = null;
		aClass1_260 = null;
	}
}
