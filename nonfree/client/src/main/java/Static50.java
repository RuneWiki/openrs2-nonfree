import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!k", name = "S", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 aClass3_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "Lclient!v;")
	private static Class62 aClass62_1273 = Static45.method753("Click to continue");

	@OriginalMember(owner = "client!k", name = "V", descriptor = "Lclient!v;")
	public static Class62 aClass62_1274 = aClass62_1273;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_1275 = Static45.method753("Empf\u001c1nger:");

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "[I")
	public static int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_34 = new Class34(64);

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1277 = Static45.method753("On");

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1276 = aClass62_1277;

	@OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
	public static int anInt2800 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
	public static boolean method1841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static39.anInt1162) {
			return true;
		} else if (arg0 == 1 && arg1 == Static51.anInt2323) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static92.anInt2449 == arg1;
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
	public static void method1844() {
		aClass62_1273 = null;
		aClass62_1274 = null;
		aClass3_Sub1_Sub1_Sub3_12 = null;
		aClass62_1275 = null;
		anIntArray311 = null;
		aClass34_34 = null;
		anIntArray310 = null;
		aClass62_1276 = null;
		aClass62_1277 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!rc;Lclient!rc;)V")
	public static void method1845(@OriginalArg(1) Class3_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub3 arg1) {
		Static85.aClass9_44.method682();
		if (Static35.anInt1104 == 0 || Static35.anInt1104 == 5) {
			arg0.method1486(Static63.aClass62_1081, 180, 54, 16777215);
			Static97.method1732(28, 62, 304, 34, 9179409);
			Static97.method1732(29, 63, 302, 32, 0);
			Static97.method1733(30, 64, Static94.anInt2490 * 3, 30, 9179409);
			Static97.method1733(Static94.anInt2490 * 3 + 30, 64, 300 - Static94.anInt2490 * 3, 30, 0);
			arg0.method1486(Static74.aClass62_876, 180, 85, 16777215);
		}
		@Pc(87) byte local87;
		@Pc(95) int local95;
		if (Static35.anInt1104 == 20) {
			Static2.aClass3_Sub1_Sub1_Sub1_2.method145(0, 0);
			local87 = 40;
			arg0.method1489(Static74.aClass62_869, 180, 40, 16776960, true);
			local95 = local87 + 15;
			arg0.method1489(Static74.aClass62_870, 180, 55, 16776960, true);
			@Pc(103) int local103 = local95 + 15;
			arg0.method1489(Static74.aClass62_872, 180, 70, 16776960, true);
			@Pc(111) int local111 = local103 + 15;
			@Pc(112) int local112 = local111 + 10;
			arg0.method1477(Static49.method782(new Class62[] { Static54.aClass62_1247, Static74.aClass62_875 }), 90, 95, 16777215, true);
			@Pc(131) int local131 = local112 + 15;
			arg0.method1477(Static49.method782(new Class62[] { Static93.aClass62_1131, Static74.aClass62_867.method1696() }), 92, 110, 16777215, true);
			@Pc(154) int local154 = local131 + 15;
		}
		if (Static35.anInt1104 == 10) {
			Static2.aClass3_Sub1_Sub1_Sub1_2.method145(0, 0);
			if (Static19.anInt2835 == 0) {
				local87 = 80;
				arg0.method1489(Static40.aClass62_500, 180, 80, 16776960, true);
				Static64.aClass3_Sub1_Sub1_Sub1_17.method145(27, 100);
				arg0.method1490(Static98.aClass62_1191, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static64.aClass3_Sub1_Sub1_Sub1_17.method145(187, 100);
				arg0.method1490(Static37.aClass62_484, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
				local95 = local87 + 30;
			} else if (Static19.anInt2835 == 2) {
				local87 = 40;
				arg0.method1489(Static74.aClass62_869, 180, 40, 16776960, true);
				local95 = local87 + 15;
				arg0.method1489(Static74.aClass62_870, 180, 55, 16776960, true);
				local95 += 15;
				arg0.method1489(Static74.aClass62_872, 180, 70, 16776960, true);
				local95 += 15;
				local95 += 10;
				arg0.method1477(Static49.method782(new Class62[] { Static54.aClass62_1247, Static74.aClass62_875, Static106.anInt2802 == 0 & Static12.anInt451 % 40 < 20 ? Static39.aClass62_495 : Static74.aClass62_874 }), 90, 95, 16777215, true);
				local95 += 15;
				arg0.method1477(Static49.method782(new Class62[] { Static93.aClass62_1131, Static74.aClass62_867.method1696(), Static12.anInt451 % 40 < 20 & Static106.anInt2802 == 1 ? Static39.aClass62_495 : Static74.aClass62_874 }), 92, 110, 16777215, true);
				Static64.aClass3_Sub1_Sub1_Sub1_17.method145(27, 130);
				arg0.method1489(Static30.aClass62_413, 100, 155, 16777215, true);
				local95 += 15;
				Static64.aClass3_Sub1_Sub1_Sub1_17.method145(187, 130);
				arg0.method1489(Static45.aClass62_569, 260, 155, 16777215, true);
			} else if (Static19.anInt2835 == 3) {
				arg0.method1489(Static8.aClass62_114, 180, 40, 16776960, true);
				local87 = 65;
				arg0.method1489(Static71.aClass62_848, 180, 65, 16777215, true);
				local95 = local87 + 15;
				arg0.method1489(Static100.aClass62_1113, 180, 80, 16777215, true);
				local95 += 15;
				arg0.method1489(Static7.aClass62_90, 180, 95, 16777215, true);
				local95 += 15;
				arg0.method1489(Static24.aClass62_318, 180, 110, 16777215, true);
				local95 += 15;
				Static64.aClass3_Sub1_Sub1_Sub1_17.method145(107, 130);
				arg0.method1489(Static45.aClass62_569, 180, 155, 16777215, true);
			}
		}
		Static26.method515();
		try {
			@Pc(466) Graphics local466 = Static44.aCanvas1.getGraphics();
			Static85.aClass9_44.method686(local466, 202, 171);
			Static46.aClass9_26.method686(local466, 0, 0);
			Static2.aClass9_1.method686(local466, 637, 0);
			if (Static69.aBoolean112) {
				Static69.aBoolean112 = false;
				Static21.aClass9_12.method686(local466, 128, 0);
				Static96.aClass9_50.method686(local466, 202, 371);
				Static38.aClass9_21.method686(local466, 0, 265);
				Static106.aClass9_54.method686(local466, 562, 265);
				Static16.aClass9_10.method686(local466, 128, 171);
				Static55.aClass9_29.method686(local466, 562, 171);
			}
		} catch (@Pc(540) Exception local540) {
			Static44.aCanvas1.repaint();
		}
	}
}
