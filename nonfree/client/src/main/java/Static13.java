import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
	public static int anInt345;

	@OriginalMember(owner = "client!c", name = "mb", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_196 = Static56.method816("Null");

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_197 = Static56.method816("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_198 = Static56.method816("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "Lclient!ic;")
	public static Class34 aClass34_199 = Static56.method816("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "[I")
	public static int[] anIntArray48 = new int[5];

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(B)V")
	public static void method226() {
		Static108.aBoolean98 = true;
		Static98.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!pc;)V")
	public static void method227(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static39.anInt964 != 1) {
			return;
		}
		if (Static3.anInt51 >= 280 && Static3.anInt51 <= 294 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(0, 0);
			return;
		}
		if (Static3.anInt51 >= 295 && Static3.anInt51 <= 360 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(1, 0);
			return;
		}
		if (Static3.anInt51 >= 390 && Static3.anInt51 <= 404 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(0, 1);
			return;
		}
		if (Static3.anInt51 >= 405 && Static3.anInt51 <= 470 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(1, 1);
			return;
		}
		if (Static3.anInt51 >= 500 && Static3.anInt51 <= 514 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(0, 2);
			return;
		}
		if (Static3.anInt51 >= 515 && Static3.anInt51 <= 580 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(1, 2);
			return;
		}
		if (Static3.anInt51 >= 610 && Static3.anInt51 <= 624 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(0, 3);
			return;
		}
		if (Static3.anInt51 >= 625 && Static3.anInt51 <= 690 && Static74.anInt1781 >= 4 && Static74.anInt1781 <= 18) {
			Static4.method33(1, 3);
			return;
		}
		if (Static3.anInt51 >= 708 && Static74.anInt1781 >= 4 && Static3.anInt51 <= 758 && Static74.anInt1781 <= 20) {
			Static115.aBoolean104 = false;
			Static123.aClass8_Sub1_Sub3_Sub3_7.method1584(0, 0);
			Static112.aClass8_Sub1_Sub3_Sub3_4.method1584(382, 0);
			Static77.aClass8_Sub1_Sub3_Sub2_6.method300(382 - Static77.aClass8_Sub1_Sub3_Sub2_6.anInt484 / 2, 18);
			return;
		}
		if (Static44.anInt1073 == -1) {
			return;
		}
		@Pc(267) Class2 local267 = Static91.aClass2Array1[Static44.anInt1073];
		if (local267.aBoolean2 == Static16.aBoolean19) {
			@Pc(287) byte[] local287 = Static44.method669(new Class34[] { local267.aClass34_5, Static45.aClass34_571 }).method836();
			Static82.aString4 = new String(local287, 0, local287.length);
			if (Static88.anInt2341 != 0) {
				Static88.anInt2341 = 0;
				Static54.anInt1372 = 443;
				Static67.anInt1653 = 43594;
				Static64.anInt2037 = 43594;
			}
			Static115.aBoolean104 = false;
			Static9.anInt189 = local267.anInt30;
			Static123.aClass8_Sub1_Sub3_Sub3_7.method1584(0, 0);
			Static112.aClass8_Sub1_Sub3_Sub3_4.method1584(382, 0);
			Static77.aClass8_Sub1_Sub3_Sub2_6.method300(382 - Static77.aClass8_Sub1_Sub3_Sub2_6.anInt484 / 2, 18);
			return;
		}
		@Pc(387) Class34 local387 = Static44.method669(new Class34[] { Static129.aClass34_1403, local267.aClass34_5, Static45.aClass34_571, Static36.aClass34_500, Static82.aClass34_892, Static44.method672(Static108.aBoolean98 ? 1 : 0), Static68.aClass34_778, Static44.method672(Static49.anInt1314), Static108.aClass34_1170, Static44.method672(Static116.anInt2613) });
		try {
			arg0.getAppletContext().showDocument(local387.method832(), "_self");
			return;
		} catch (@Pc(396) Exception local396) {
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V")
	public static void method228() {
		aClass34_199 = null;
		anIntArray48 = null;
		aClass34_197 = null;
		aClass34_198 = null;
		aClass34_196 = null;
		anIntArray47 = null;
	}
}
