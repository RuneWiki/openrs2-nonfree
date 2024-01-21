import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static65 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt1768;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[[Lclient!fe;")
	public static Class3_Sub1_Sub6[][] aClass3_Sub1_Sub6ArrayArray1;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!v;")
	private static Class62 aClass62_776 = Static45.method753("No reply from loginserver)3");

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!v;")
	private static Class62 aClass62_780 = Static45.method753("wave:");

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_777 = aClass62_780;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_778 = aClass62_776;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_779 = Static45.method753("Ihre Freunde)2Liste ist voll(Q Mitglieder k\u001c1nnen 200 Freunde hinzuf\u001c1gen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "J")
	public static long aLong52 = 0L;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_781 = Static45.method753("welle:");

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_782 = Static45.method753("scrollen:");

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_783 = Static45.method753("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_784 = Static45.method753("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1088() {
		aClass62_776 = null;
		aClass62_777 = null;
		aClass62_782 = null;
		aClass62_783 = null;
		anIntArray184 = null;
		aClass62_781 = null;
		aClass62_780 = null;
		aClass3_Sub1_Sub6ArrayArray1 = null;
		aClass62_778 = null;
		aClass62_779 = null;
		aClass62_784 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public static void method1089(@OriginalArg(0) int arg0) {
		if (Static35.anInt1104 == arg0) {
			return;
		}
		if (Static35.anInt1104 == 0) {
			Static26.method517();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static86.anInt2307 = 0;
			Static27.anInt822 = 0;
			Static56.anInt1563 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static69.aClass41_3 != null) {
			Static69.aClass41_3.method1025();
		}
		if (Static35.anInt1104 == 25 || Static35.anInt1104 == 40) {
			Static102.method1706();
			Static97.method1734();
		}
		if (Static35.anInt1104 == 25) {
			Static6.anInt210 = 0;
			Static40.anInt1176 = 1;
			Static15.anInt566 = 0;
			Static14.anInt553 = 0;
			Static21.anInt731 = 1;
		}
		if (arg0 == 35) {
			Static59.method979();
			Static63.method1515();
			if (Static38.aClass9_22 == null) {
				Static38.aClass9_22 = Static63.method1509(Static44.aCanvas1, 503, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static38.aClass9_22 = null;
			Static59.method979();
			Static62.method1045(Static12.aClass42_Sub1_10, Static44.aCanvas1, Static59.aClass42_Sub1_35);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static38.aClass9_22 = null;
			Static63.method1515();
			Static46.method761(Static12.aClass42_Sub1_10, Static44.aCanvas1);
		}
		Static69.aBoolean112 = true;
		Static35.anInt1104 = arg0;
	}
}
