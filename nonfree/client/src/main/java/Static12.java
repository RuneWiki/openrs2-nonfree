import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_25;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_1447 = Static45.method1937("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_1448 = Static45.method1937("sl_arrows");

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!af;")
	private static Class5 aClass5_1450 = Static45.method1937(" has logged out)3");

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_1449 = aClass5_1450;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public static int anInt3240 = 10;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!gd;")
	public static Class28 aClass28_87 = new Class28(50);

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1451 = Static45.method1937("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt3243 = 0;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_1452 = Static45.method1937("(U2");

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!af;")
	private static Class5 aClass5_1453 = Static45.method1937("Loading )2 please wait)3");

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public static int anInt3244 = -1;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_1454 = aClass5_1453;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!af;)I")
	public static int method2241(@OriginalArg(1) Class5 arg0) {
		if (Static131.anInt3269 == 1) {
			return 7;
		} else if (arg0.method217(Static74.aClass5_853)) {
			return 1;
		} else if (arg0.method217(Static89.aClass5_1370)) {
			return 1;
		} else if (arg0.method217(Static45.aClass5_1280)) {
			return 2;
		} else if (arg0.method217(Static99.aClass5_1168)) {
			return 2;
		} else if (arg0.method217(Static84.aClass5_1047)) {
			return 3;
		} else if (arg0.method217(Static22.aClass5_335)) {
			return 4;
		} else if (arg0.method217(Static73.aClass5_837)) {
			return 4;
		} else if (arg0.method217(Static116.aClass5_1327)) {
			return 5;
		} else if (arg0.method217(Static27.aClass5_390)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method2243() {
		aClass5_1451 = null;
		aClass5_1448 = null;
		aClass5_1447 = null;
		aClass5_1449 = null;
		anIntArray462 = null;
		aClass5_1452 = null;
		aClass28_87 = null;
		aCanvas3 = null;
		aClass41_Sub1_25 = null;
		aClass5_1454 = null;
		aClass5_1453 = null;
		anIntArray461 = null;
		aClass5_1450 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method2244() {
		Static44.aClass1_Sub20_Sub1_1.method2108(47);
		Static44.aClass1_Sub20_Sub1_1.method2078((long) 0);
	}
}
