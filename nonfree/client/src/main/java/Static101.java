import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Z")
	public static boolean aBoolean179;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "J")
	public static long aLong143;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt2401 = 0;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
	public static int[] anIntArray519 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_692 = Static13.method257("@gr3@");

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public static int anInt2410 = 0;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "Lclient!o;")
	public static Class40 aClass40_693 = Static13.method257("*6n*6nIf you do not remember making this request*6ncancel it immediately)1 and change your password)3");

	@OriginalMember(owner = "client!va", name = "W", descriptor = "Lclient!o;")
	public static Class40 aClass40_694 = Static13.method257("*6n*6nYou have @gre@");

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_695 = Static13.method257("Enter name:");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!fc;Ljava/awt/Graphics;ILclient!fc;)V")
	public static void method1589(@OriginalArg(0) Class2_Sub2_Sub2_Sub2 arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) Class2_Sub2_Sub2_Sub2 arg2) {
		Static107.aClass45_31.method1476();
		if (Static44.anInt1075 == 0 || Static44.anInt1075 == 5) {
			arg2.method566(Static104.aClass40_724, 180, 54, 16777215);
			Static26.method1607(28, 62, 304, 34, 9179409);
			Static26.method1607(29, 63, 302, 32, 0);
			Static26.method1612(30, 64, Static94.anInt2194 * 3, 30, 9179409);
			Static26.method1612(Static94.anInt2194 * 3 + 30, 64, 300 - Static94.anInt2194 * 3, 30, 0);
			arg2.method566(Static98.aClass40_680, 180, 85, 16777215);
			Static107.aClass45_31.method1474(arg1, 202, 171);
		}
		@Pc(106) byte local106;
		@Pc(130) int local130;
		if (Static44.anInt1075 == 20) {
			Static97.aClass2_Sub2_Sub2_Sub3_21.method1320(0, 0);
			local106 = 60;
			if (Static86.aClass40_592.method1169() > 0) {
				arg2.method578(Static86.aClass40_592, 180, 45, 16776960, true);
				arg2.method578(Static86.aClass40_589, 180, 60, 16776960, true);
				local130 = local106 + 30;
			} else {
				arg2.method578(Static86.aClass40_589, 180, 53, 16776960, true);
				local130 = local106 + 30;
			}
			arg2.method574(Static80.method1334(new Class40[] { Static67.aClass40_482, Static86.aClass40_591 }), 90, 90, 16777215, true);
			local130 += 15;
			arg2.method574(Static80.method1334(new Class40[] { Static17.aClass40_118, Static86.aClass40_587.method1177() }), 92, 105, 16777215, true);
			local130 += 15;
		}
		if (Static44.anInt1075 == 10) {
			Static97.aClass2_Sub2_Sub2_Sub3_21.method1320(0, 0);
			if (Static91.anInt2143 == 0) {
				local106 = 80;
				arg2.method578(Static44.aClass40_331, 180, 80, 16776960, true);
				Static32.aClass2_Sub2_Sub2_Sub3_8.method1320(27, 100);
				arg2.method578(Static72.aClass40_508, 100, 125, 16777215, true);
				local130 = local106 + 30;
				Static32.aClass2_Sub2_Sub2_Sub3_8.method1320(187, 100);
				arg2.method578(Static68.aClass40_103, 260, 125, 16777215, true);
			} else if (Static91.anInt2143 == 2) {
				local106 = 60;
				if (Static86.aClass40_592.method1169() <= 0) {
					arg2.method578(Static86.aClass40_589, 180, 53, 16776960, true);
					local130 = local106 + 30;
				} else {
					arg2.method578(Static86.aClass40_592, 180, 45, 16776960, true);
					arg2.method578(Static86.aClass40_589, 180, 60, 16776960, true);
					local130 = local106 + 30;
				}
				arg2.method574(Static80.method1334(new Class40[] { Static67.aClass40_482, Static86.aClass40_591, Static107.anInt2511 % 40 < 20 & Static99.anInt91 == 0 ? Static45.aClass40_339 : Static86.aClass40_593 }), 90, 90, 16777215, true);
				local130 += 15;
				arg2.method574(Static80.method1334(new Class40[] { Static17.aClass40_118, Static86.aClass40_587.method1177(), Static99.anInt91 == 1 & Static107.anInt2511 % 40 < 20 ? Static45.aClass40_339 : Static86.aClass40_593 }), 92, 105, 16777215, true);
				Static32.aClass2_Sub2_Sub2_Sub3_8.method1320(27, 130);
				arg2.method578(Static15.aClass40_536, 100, 155, 16777215, true);
				Static32.aClass2_Sub2_Sub2_Sub3_8.method1320(187, 130);
				arg2.method578(Static99.aClass40_27, 260, 155, 16777215, true);
				local130 += 15;
			} else if (Static91.anInt2143 == 3) {
				arg2.method578(Static38.aClass40_294, 180, 40, 16776960, true);
				local106 = 65;
				arg2.method578(Static11.aClass40_71, 180, 65, 16777215, true);
				local130 = local106 + 15;
				arg2.method578(Static36.aClass40_258, 180, 80, 16777215, true);
				local130 += 15;
				arg2.method578(Static46.aClass40_706, 180, 95, 16777215, true);
				local130 += 15;
				arg2.method578(Static15.aClass40_539, 180, 110, 16777215, true);
				local130 += 15;
				Static32.aClass2_Sub2_Sub2_Sub3_8.method1320(107, 130);
				arg2.method578(Static99.aClass40_27, 180, 155, 16777215, true);
			}
		}
		Static107.aClass45_31.method1474(arg1, 202, 171);
		Static105.method1673();
		Static61.aClass45_24.method1474(arg1, 0, 0);
		Static98.aClass45_30.method1474(arg1, 637, 0);
		if (!Static1.aBoolean1) {
			return;
		}
		Static1.aBoolean1 = false;
		Static61.aClass45_22.method1474(arg1, 128, 0);
		Static35.aClass45_16.method1474(arg1, 202, 371);
		Static21.aClass45_11.method1474(arg1, 0, 265);
		Static80.aClass45_27.method1474(arg1, 562, 265);
		Static67.aClass45_26.method1474(arg1, 128, 171);
		Static2.aClass45_3.method1474(arg1, 562, 171);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (Static63.aClass40Array30[local17] != null) {
				@Pc(27) int local27 = Static76.anIntArray469[local17];
				@Pc(38) int local38 = Static34.anInt799 + 4 + 70 - local3 * 14;
				if (local38 < -20) {
					break;
				}
				if (local27 == 0) {
					local3++;
				}
				@Pc(48) Class40 local48 = Static106.aClass40Array40[local17];
				if (local48 != null && local48.method1168(Static42.aClass40_323)) {
					local48 = local48.method1185(5);
				}
				if (local48 != null && local48.method1168(Static92.aClass40_622)) {
					local48 = local48.method1185(5);
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static23.anInt583 == 0 || Static23.anInt583 == 1 && Static38.method729(local48))) {
					if (local38 - 14 < arg0 && arg0 <= local38 && !local48.method1184(Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395)) {
						if (Static61.anInt1550 >= 1) {
							Static21.method402(Static80.method1334(new Class40[] { Static16.aClass40_111, local48 }), 42, 0, 0, 0);
						}
						Static21.method402(Static80.method1334(new Class40[] { Static88.aClass40_604, local48 }), 12, 0, 0, 0);
						Static21.method402(Static80.method1334(new Class40[] { Static15.aClass40_535, local48 }), 51, 0, 0, 0);
					}
					local3++;
				}
				if ((local27 == 3 || local27 == 7) && Static102.anInt2473 == 0 && (local27 == 7 || Static104.anInt2515 == 0 || Static104.anInt2515 == 1 && Static38.method729(local48))) {
					local3++;
					if (local38 - 14 < arg0 && local38 >= arg0) {
						if (Static61.anInt1550 >= 1) {
							Static21.method402(Static80.method1334(new Class40[] { Static16.aClass40_111, local48 }), 42, 0, 0, 0);
						}
						Static21.method402(Static80.method1334(new Class40[] { Static88.aClass40_604, local48 }), 12, 0, 0, 0);
						Static21.method402(Static80.method1334(new Class40[] { Static15.aClass40_535, local48 }), 51, 0, 0, 0);
					}
				}
				if (local27 == 4 && (Static103.anInt2491 == 0 || Static103.anInt2491 == 1 && Static38.method729(local48))) {
					local3++;
					if (local38 - 14 < arg0 && arg0 <= local38) {
						Static21.method402(Static80.method1334(new Class40[] { Static99.aClass40_28, local48 }), 29, 0, 0, 0);
					}
				}
				if ((local27 == 5 || local27 == 6) && Static102.anInt2473 == 0 && Static104.anInt2515 < 2) {
					local3++;
				}
				if (local27 == 8 && (Static103.anInt2491 == 0 || Static103.anInt2491 == 1 && Static38.method729(local48))) {
					if (arg0 > local38 - 14 && arg0 <= local38) {
						Static21.method402(Static80.method1334(new Class40[] { Static72.aClass40_510, local48 }), 37, 0, 0, 0);
					}
					local3++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1591() {
		anIntArray519 = null;
		aClass40_693 = null;
		Class61.anIntArray518 = null;
		aClass40_694 = null;
		aClass40_695 = null;
		aClass2_Sub2_Sub2_Sub4Array10 = null;
		aClass40_692 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ud;Lclient!ud;)I")
	public static int method1592(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method73(Static86.aClass40_593, Static63.aClass40_463)) {
			local5++;
		}
		if (arg0.method73(Static86.aClass40_593, Static73.aClass40_521)) {
			local5++;
		}
		if (arg0.method73(Static86.aClass40_593, Static3.aClass40_16)) {
			local5++;
		}
		if (arg0.method73(Static86.aClass40_593, Static96.aClass40_661)) {
			local5++;
		}
		if (arg0.method73(Static86.aClass40_593, Static82.aClass40_563)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method1593() {
		Static56.aClass2_Sub3_Sub1_5.method1737();
		@Pc(11) int local11 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static56.aClass2_Sub3_Sub1_5.method1743(2);
		if (local19 == 0) {
			Static98.anIntArray504[Static53.anInt1190++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local19 == 1) {
			local41 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
			Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1547(local41, false);
			local51 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
			if (local51 == 1) {
				Static98.anIntArray504[Static53.anInt1190++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local19 == 2) {
			local41 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
			Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1547(local41, true);
			local51 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
			Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1547(local51, true);
			local93 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
			if (local93 == 1) {
				Static98.anIntArray504[Static53.anInt1190++] = 2047;
			}
		} else if (local19 == 3) {
			local41 = Static56.aClass2_Sub3_Sub1_5.method1743(7);
			Static1.anInt8 = Static56.aClass2_Sub3_Sub1_5.method1743(2);
			local51 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
			if (local51 == 1) {
				Static98.anIntArray504[Static53.anInt1190++] = 2047;
			}
			local93 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
			@Pc(149) int local149 = Static56.aClass2_Sub3_Sub1_5.method1743(7);
			Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1545(local93 == 1, local41, local149);
		}
	}
}
