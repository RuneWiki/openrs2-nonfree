import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1107 = Static72.method1077("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public static int anInt1568 = 2;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt1572 = 0;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public static int anInt1576 = 0;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1108 = Static72.method1077("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "Lclient!u;")
	public static Class74 aClass74_1109 = Static72.method1077("(Y");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method1083() {
		aClass74_1109 = null;
		aClass74_1108 = null;
		aClass74_1107 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ba;B)V")
	public static void method1093(@OriginalArg(0) Class2_Sub2_Sub2_Sub1 arg0) {
		arg0.aBoolean116 = false;
		@Pc(23) Class2_Sub2_Sub11 local23;
		if (arg0.anInt2663 != -1) {
			local23 = Static12.method270(arg0.anInt2663);
			if (local23 == null || local23.anIntArray192 == null) {
				arg0.anInt2663 = -1;
			} else {
				arg0.anInt2718++;
				if (local23.anIntArray192.length > arg0.anInt2666 && local23.anIntArray191[arg0.anInt2666] < arg0.anInt2718) {
					arg0.anInt2718 = 1;
					arg0.anInt2666++;
					Static47.method768(arg0.anInt2672, arg0.anInt2666, local23, arg0.anInt2673);
				}
				if (arg0.anInt2666 >= local23.anIntArray192.length) {
					arg0.anInt2666 = 0;
					arg0.anInt2718 = 0;
					Static47.method768(arg0.anInt2672, arg0.anInt2666, local23, arg0.anInt2673);
				}
			}
		}
		if (arg0.anInt2660 != -1 && arg0.anInt2689 <= Static107.anInt2338) {
			if (arg0.anInt2696 < 0) {
				arg0.anInt2696 = 0;
			}
			@Pc(116) int local116 = Static38.method653(arg0.anInt2660).anInt417;
			if (local116 == -1) {
				arg0.anInt2660 = -1;
			} else {
				@Pc(124) Class2_Sub2_Sub11 local124 = Static12.method270(local116);
				if (local124 == null || local124.anIntArray192 == null) {
					arg0.anInt2660 = -1;
				} else {
					arg0.anInt2715++;
					if (arg0.anInt2696 < local124.anIntArray192.length && local124.anIntArray191[arg0.anInt2696] < arg0.anInt2715) {
						arg0.anInt2715 = 1;
						arg0.anInt2696++;
						Static47.method768(arg0.anInt2672, arg0.anInt2696, local124, arg0.anInt2673);
					}
					if (local124.anIntArray192.length <= arg0.anInt2696 && (arg0.anInt2696 < 0 || arg0.anInt2696 >= local124.anIntArray192.length)) {
						arg0.anInt2660 = -1;
					}
				}
			}
		}
		if (arg0.anInt2670 != -1 && arg0.anInt2675 <= 1) {
			local23 = Static12.method270(arg0.anInt2670);
			if (local23.anInt1524 == 1 && arg0.anInt2684 > 0 && Static107.anInt2338 >= arg0.anInt2701 && arg0.anInt2716 < Static107.anInt2338) {
				arg0.anInt2675 = 1;
				return;
			}
		}
		if (arg0.anInt2670 != -1 && arg0.anInt2675 == 0) {
			local23 = Static12.method270(arg0.anInt2670);
			if (local23 == null || local23.anIntArray192 == null) {
				arg0.anInt2670 = -1;
			} else {
				arg0.anInt2677++;
				if (arg0.anInt2690 < local23.anIntArray192.length && local23.anIntArray191[arg0.anInt2690] < arg0.anInt2677) {
					arg0.anInt2677 = 1;
					arg0.anInt2690++;
					Static47.method768(arg0.anInt2672, arg0.anInt2690, local23, arg0.anInt2673);
				}
				if (local23.anIntArray192.length <= arg0.anInt2690) {
					arg0.anInt2719++;
					arg0.anInt2690 -= local23.anInt1511;
					if (arg0.anInt2719 >= local23.anInt1521) {
						arg0.anInt2670 = -1;
					} else if (arg0.anInt2690 >= 0 && arg0.anInt2690 < local23.anIntArray192.length) {
						Static47.method768(arg0.anInt2672, arg0.anInt2690, local23, arg0.anInt2673);
					} else {
						arg0.anInt2670 = -1;
					}
				}
				arg0.aBoolean116 = local23.aBoolean59;
			}
		}
		if (arg0.anInt2675 > 0) {
			arg0.anInt2675--;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)I")
	public static int method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static17.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static17.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!cc;Lclient!cc;I)V")
	public static void method1097(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub3 arg1) {
		if (Static72.aClass2_Sub2_Sub1_Sub2Array8 == null) {
			Static72.aClass2_Sub2_Sub1_Sub2Array8 = Static25.method497(Static119.aClass74_1592, Static49.aClass74_843, Static50.aClass26_Sub1_35);
		}
		if (Static66.aClass2_Sub2_Sub1_Sub1Array8 == null) {
			Static66.aClass2_Sub2_Sub1_Sub1Array8 = Static25.method494(Static39.aClass74_683, Static50.aClass26_Sub1_35, Static49.aClass74_843);
		}
		if (Static43.aClass2_Sub2_Sub1_Sub1Array4 == null) {
			Static43.aClass2_Sub2_Sub1_Sub1Array4 = Static25.method494(Static93.aClass74_1327, Static50.aClass26_Sub1_35, Static49.aClass74_843);
		}
		if (Static2.aClass2_Sub2_Sub1_Sub1Array1 == null) {
			Static2.aClass2_Sub2_Sub1_Sub1Array1 = Static25.method494(Static24.aClass74_515, Static50.aClass26_Sub1_35, Static49.aClass74_843);
		}
		Static58.method702(0, 23, 765, 480, 0);
		Static58.method707(0, 0, 125, 23, 12425273, 9135624);
		Static58.method707(125, 0, 640, 23, 5197647, 2697513);
		arg0.method314(Static101.aClass74_1460, 62, 15, 0);
		if (Static2.aClass2_Sub2_Sub1_Sub1Array1 != null) {
			Static2.aClass2_Sub2_Sub1_Sub1Array1[1].method97(140, 1);
			arg1.method308(Static21.aClass74_475, 152, 10, 16777215);
			Static2.aClass2_Sub2_Sub1_Sub1Array1[0].method97(140, 12);
			arg1.method308(Static119.aClass74_1595, 152, 21, 16777215);
		}
		if (Static43.aClass2_Sub2_Sub1_Sub1Array4 != null) {
			if (Static101.anIntArray321[0] == 0 && Static35.anIntArray413[0] == 0) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[2].method97(280, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[0].method97(280, 4);
			}
			if (Static101.anIntArray321[0] == 0 && Static35.anIntArray413[0] == 1) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[3].method97(295, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[1].method97(295, 4);
			}
			arg0.method308(Static126.aClass74_1712, 312, 17, 16777215);
			if (Static101.anIntArray321[0] == 1 && Static35.anIntArray413[0] == 0) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[2].method97(390, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[0].method97(390, 4);
			}
			if (Static101.anIntArray321[0] == 1 && Static35.anIntArray413[0] == 1) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[3].method97(405, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[1].method97(405, 4);
			}
			arg0.method308(Static1.aClass74_1398, 422, 17, 16777215);
			if (Static101.anIntArray321[0] == 2 && Static35.anIntArray413[0] == 0) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[2].method97(500, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[0].method97(500, 4);
			}
			if (Static101.anIntArray321[0] == 2 && Static35.anIntArray413[0] == 1) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[3].method97(515, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[1].method97(515, 4);
			}
			arg0.method308(Static3.aClass74_34, 532, 17, 16777215);
			if (Static101.anIntArray321[0] == 3 && Static35.anIntArray413[0] == 0) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[2].method97(610, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[0].method97(610, 4);
			}
			if (Static101.anIntArray321[0] == 3 && Static35.anIntArray413[0] == 1) {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[3].method97(625, 4);
			} else {
				Static43.aClass2_Sub2_Sub1_Sub1Array4[1].method97(625, 4);
			}
			arg0.method308(Static41.aClass74_699, 642, 17, 16777215);
		}
		Static58.method702(708, 4, 50, 16, 0);
		arg1.method314(Static27.aClass74_530, 733, 16, 16777215);
		Static100.anInt2217 = -1;
		if (Static72.aClass2_Sub2_Sub1_Sub2Array8 != null) {
			@Pc(375) int local375 = 8;
			@Pc(383) int local383 = 24;
			@Pc(385) int local385;
			@Pc(387) int local387;
			do {
				local385 = local383;
				local387 = local375;
				if (Static3.anInt41 <= (local375 - 1) * local383) {
					local375--;
				}
				if (local375 * (local383 - 1) >= Static3.anInt41) {
					local383--;
				}
				if (local375 * (local383 - 1) >= Static3.anInt41) {
					local383--;
				}
			} while (local383 != local385 || local375 != local387);
			local387 = (480 - local383 * 19) / (local383 + 1);
			if (local387 > 5) {
				local387 = 5;
			}
			local385 = (765 - local375 * 88) / (local375 + 1);
			if (local385 > 5) {
				local385 = 5;
			}
			@Pc(462) int local462 = 0;
			@Pc(478) int local478 = (765 - local385 * (local375 - 1) - local375 * 88) / 2;
			@Pc(494) int local494 = (480 - local383 * 19 - (local383 + -1) * local387) / 2;
			@Pc(498) int local498 = local494 + 23;
			@Pc(500) int local500 = local478;
			for (@Pc(502) int local502 = 0; local502 < Static3.anInt41; local502++) {
				@Pc(508) Class32 local508 = Static83.aClass32Array1[local502];
				@Pc(510) boolean local510 = true;
				@Pc(515) Class74 local515 = Static56.method940(local508.anInt986);
				if (local508.anInt986 == -1) {
					local515 = Static50.aClass74_863;
					local510 = false;
				} else if (local508.anInt986 > 1980) {
					local515 = Static86.aClass74_1248;
					local510 = false;
				}
				if (Static46.anInt1062 >= local500 && Static62.anInt1414 >= local498 && Static46.anInt1062 < local500 + 88 && Static62.anInt1414 < local498 + 19 && local510) {
					Static100.anInt2217 = local502;
					Static72.aClass2_Sub2_Sub1_Sub2Array8[local508.aBoolean38 ? 1 : 0].method217(local500, local498);
				} else {
					Static72.aClass2_Sub2_Sub1_Sub2Array8[local508.aBoolean38 ? 1 : 0].method207(local500, local498);
				}
				if (Static66.aClass2_Sub2_Sub1_Sub1Array8 != null) {
					Static66.aClass2_Sub2_Sub1_Sub1Array8[(local508.aBoolean38 ? 8 : 0) + local508.anInt985].method97(local500 + 29, local498);
				}
				arg0.method314(Static56.method940(local508.anInt988), local500 + 15, 5 + 9 + local498, 0);
				arg1.method314(local515, local500 + 60, local498 + 14, 268435455);
				local498 += local387 + 19;
				local462++;
				if (local462 >= local383) {
					local498 = local494 + 23;
					local500 += local385 + 88;
					local462 = 0;
				}
			}
		}
		try {
			@Pc(670) Graphics local670 = Static51.aCanvas2.getGraphics();
			Static97.aClass9_58.method1585(0, local670, 0);
		} catch (@Pc(678) Exception local678) {
			Static51.aCanvas2.repaint();
		}
	}
}
