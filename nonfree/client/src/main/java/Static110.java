import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!sd", name = "Cb", descriptor = "Lclient!oc;")
	public static Class56 aClass56_77;

	@OriginalMember(owner = "client!sd", name = "Hb", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_17;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1230 = Static78.method1313("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1231 = Static78.method1313("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!sd", name = "yb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1232 = Static78.method1313("Create a free account");

	@OriginalMember(owner = "client!sd", name = "Ab", descriptor = "I")
	public static int anInt2552 = 0;

	@OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!sd", name = "Lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1233 = Static78.method1313("backright1");

	@OriginalMember(owner = "client!sd", name = "Sb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1234 = aClass25_1232;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V")
	public static void method1769() {
		aClass25_1232 = null;
		aClass56_77 = null;
		aClass25_1230 = null;
		aClass25_1231 = null;
		aClass25_1233 = null;
		aClass56_Sub1_17 = null;
		aClass25_1234 = null;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V")
	public static void method1770() {
		Static24.method571(Static67.anInt1470);
		if (Static93.anInt2098 != -1) {
			Static24.method571(Static93.anInt2098);
		}
		Static18.anInt522 = 0;
		Static15.aClass7_4.method1096();
		Static36.method841();
		Static128.method1943();
		Static25.method589(Static67.anInt1470, 503, 0, 765);
		if (Static93.anInt2098 != -1) {
			Static25.method589(Static93.anInt2098, 503, 0, 765);
		}
		if (Static82.aBoolean77) {
			Static27.method601();
		} else {
			method1776();
			Static15.method360();
		}
		try {
			@Pc(62) Graphics local62 = Static119.aCanvas1.getGraphics();
			Static15.aClass7_4.method1095(local62, 0, 0);
		} catch (@Pc(70) Exception local70) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	public static void method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub2_Sub14 local13 = Static62.method1091(arg0, arg2);
		if (local13 != null && local13.anObjectArray11 != null) {
			Static27.method600(local13, local13.anObjectArray11, null, 0, 0, 0);
		}
		Static47.anInt1217 = arg2;
		Static94.anInt2162 = arg1;
		Static84.aBoolean83 = true;
		Static56.anInt1325 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ob;)Lclient!fc;")
	public static Class25 method1774(@OriginalArg(1) Class1_Sub2_Sub14 arg0) {
		if (Static58.method1057(Static77.method1300(arg0)) == 0) {
			return null;
		} else if (arg0.aClass25_935 == null || arg0.aClass25_935.method773().method762() == 0) {
			return Static34.aBoolean37 ? Static35.aClass25_408 : null;
		} else {
			return arg0.aClass25_935;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)V")
	public static void method1775(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method1776() {
		if (Static52.anInt1267 != 0) {
			return;
		}
		Static94.anIntArray381[0] = 1003;
		Static108.anInt2503 = 1;
		Static84.aClass25Array14[0] = Static38.aClass25_453;
		if (Static67.anInt1470 != -1) {
			Static87.anInt1631 = -1;
			Static1.anInt21 = -1;
			Static21.method490(0, Static10.anInt264, 503, 0, 0, Static111.anInt2597, Static67.anInt1470, 765);
			Static49.anInt1232 = Static87.anInt1631;
			Static28.anInt746 = Static1.anInt21;
			return;
		}
		Static116.method1861();
		Static1.anInt21 = -1;
		Static87.anInt1631 = -1;
		if (Static10.anInt264 > 4 && Static111.anInt2597 > 4 && Static10.anInt264 < 516 && Static111.anInt2597 < 338) {
			if (Static108.anInt2497 == -1) {
				Static61.method1084();
			} else {
				Static21.method490(4, Static10.anInt264, 338, 4, 0, Static111.anInt2597, Static108.anInt2497, 516);
			}
		}
		Static28.anInt746 = Static1.anInt21;
		Static1.anInt21 = -1;
		Static49.anInt1232 = Static87.anInt1631;
		@Pc(94) boolean local94 = false;
		Static87.anInt1631 = -1;
		if (Static10.anInt264 > 553 && Static111.anInt2597 > 205 && Static10.anInt264 < 743 && Static111.anInt2597 < 466) {
			if (Static33.anInt922 != -1) {
				Static21.method490(205, Static10.anInt264, 466, 553, 1, Static111.anInt2597, Static33.anInt922, 743);
			} else if (Static22.anIntArray162[Static90.anInt2027] != -1) {
				Static21.method490(205, Static10.anInt264, 466, 553, 1, Static111.anInt2597, Static22.anIntArray162[Static90.anInt2027], 743);
			}
		}
		if (Static8.anInt228 != Static87.anInt1631) {
			Static8.anInt228 = Static87.anInt1631;
			Static90.aBoolean98 = true;
		}
		if (Static126.anInt2933 != Static1.anInt21) {
			Static90.aBoolean98 = true;
			Static126.anInt2933 = Static1.anInt21;
		}
		Static87.anInt1631 = -1;
		Static1.anInt21 = -1;
		if (Static10.anInt264 > 17 && Static111.anInt2597 > 357 && Static10.anInt264 < 496 && Static111.anInt2597 < 453) {
			if (Static33.anInt916 != -1) {
				Static21.method490(357, Static10.anInt264, 453, 17, 2, Static111.anInt2597, Static33.anInt916, 496);
			} else if (Static108.anInt2502 != -1) {
				Static21.method490(357, Static10.anInt264, 453, 17, 3, Static111.anInt2597, Static108.anInt2502, 496);
			} else if (Static111.anInt2597 < 434 && Static10.anInt264 < 426) {
				Static127.method2044(Static10.anInt264 - 17, Static111.anInt2597 + -357);
			}
		}
		if ((Static33.anInt916 != -1 || Static108.anInt2502 != -1) && Static54.anInt1294 != Static87.anInt1631) {
			Static54.anInt1294 = Static87.anInt1631;
			aBoolean113 = true;
		}
		if ((Static33.anInt916 != -1 || Static108.anInt2502 != -1) && Static1.anInt21 != Static99.anInt2315) {
			aBoolean113 = true;
			Static99.anInt2315 = Static1.anInt21;
		}
		while (!local94) {
			local94 = true;
			for (@Pc(265) int local265 = 0; local265 < Static108.anInt2503 - 1; local265++) {
				if (Static94.anIntArray381[local265] < 1000 && Static94.anIntArray381[local265 + 1] > 1000) {
					local94 = false;
					@Pc(287) Class25 local287 = Static84.aClass25Array14[local265];
					Static84.aClass25Array14[local265] = Static84.aClass25Array14[local265 + 1];
					Static84.aClass25Array14[local265 + 1] = local287;
					@Pc(305) int local305 = Static94.anIntArray381[local265];
					Static94.anIntArray381[local265] = Static94.anIntArray381[local265 + 1];
					Static94.anIntArray381[local265 + 1] = local305;
					@Pc(323) int local323 = Static86.anIntArray347[local265];
					Static86.anIntArray347[local265] = Static86.anIntArray347[local265 + 1];
					Static86.anIntArray347[local265 + 1] = local323;
					@Pc(341) int local341 = Static46.anIntArray239[local265];
					Static46.anIntArray239[local265] = Static46.anIntArray239[local265 + 1];
					Static46.anIntArray239[local265 + 1] = local341;
					@Pc(359) int local359 = Static102.anIntArray413[local265];
					Static102.anIntArray413[local265] = Static102.anIntArray413[local265 + 1];
					Static102.anIntArray413[local265 + 1] = local359;
				}
			}
		}
	}
}
