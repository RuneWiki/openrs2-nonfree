import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_70;

	@OriginalMember(owner = "client!uc", name = "Sb", descriptor = "I")
	public static int anInt2940;

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1587 = Static33.method650("as it was used to break our rules)3");

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1586 = aClass56_1587;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
	public static int anInt2914 = 1;

	@OriginalMember(owner = "client!uc", name = "bb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1588 = Static33.method650("Hidden)2");

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "[Lclient!wc;")
	public static Class81[] aClass81Array1 = new Class81[4];

	@OriginalMember(owner = "client!uc", name = "Gb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1593 = Static33.method650("Prepared sound engine");

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1590 = aClass56_1593;

	@OriginalMember(owner = "client!uc", name = "tb", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!uc", name = "zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1591 = Static33.method650("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!uc", name = "Db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1592 = Static33.method650("sl_stars");

	@OriginalMember(owner = "client!uc", name = "Nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1594 = Static33.method650("Texturen geladen)3");

	@OriginalMember(owner = "client!uc", name = "Xb", descriptor = "[I")
	public static int[] anIntArray292 = new int[2000];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method1895() {
		if (Static52.anInt1510 == 0) {
			return;
		}
		@Pc(18) Class3_Sub1_Sub1_Sub1 local18 = Static80.aClass3_Sub1_Sub1_Sub1_4;
		@Pc(20) int local20 = 0;
		if (Static106.anInt2633 != 0) {
			local20 = 1;
		}
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			if (Static119.aClass56Array19[local29] != null) {
				@Pc(39) int local39 = Static125.anIntArray337[local29];
				@Pc(41) byte local41 = 0;
				@Pc(45) Class56 local45 = Static54.aClass56Array5[local29];
				if (local45 != null && local45.method1428(Static41.aClass56_654)) {
					local41 = 1;
					local45 = local45.method1417(5);
				}
				if (local45 != null && local45.method1428(Static44.aClass56_694)) {
					local41 = 2;
					local45 = local45.method1417(5);
				}
				@Pc(102) int local102;
				if ((local39 == 3 || local39 == 7) && (local39 == 7 || Static46.anInt2266 == 0 || Static46.anInt2266 == 1 && Static108.method1824(local45))) {
					local102 = 329 - local20 * 13;
					local18.method738(Static94.aClass56_1336, 4, local102, 0);
					local18.method738(Static94.aClass56_1336, 4, local102 - 1, 65535);
					local20++;
					@Pc(123) int local123 = local18.method745(Static94.aClass56_1336) + 4;
					local123 += local18.method743(32);
					if (local41 == 1) {
						Static72.aClass3_Sub1_Sub1_Sub4Array27[0].method1504(local123, local102 - 12);
						local123 += 14;
					}
					if (local41 == 2) {
						Static72.aClass3_Sub1_Sub1_Sub4Array27[1].method1504(local123, local102 - 12);
						local123 += 14;
					}
					local18.method738(Static84.method1524(new Class56[] { local45, Static3.aClass56_1722, Static119.aClass56Array19[local29] }), local123, local102, 0);
					local18.method738(Static84.method1524(new Class56[] { local45, Static3.aClass56_1722, Static119.aClass56Array19[local29] }), local123, local102 - 1, 65535);
					if (local20 >= 5) {
						return;
					}
				}
				if (local39 == 5 && Static46.anInt2266 < 2) {
					local102 = 329 - local20 * 13;
					local20++;
					local18.method738(Static119.aClass56Array19[local29], 4, local102, 0);
					local18.method738(Static119.aClass56Array19[local29], 4, local102 - 1, 65535);
					if (local20 >= 5) {
						return;
					}
				}
				if (local39 == 6 && Static46.anInt2266 < 2) {
					local102 = 329 - local20 * 13;
					local18.method738(Static84.method1524(new Class56[] { Static59.aClass56_925, Static31.aClass56_507, local45, Static3.aClass56_1722, Static119.aClass56Array19[local29] }), 4, local102, 0);
					local20++;
					local18.method738(Static84.method1524(new Class56[] { Static59.aClass56_925, Static31.aClass56_507, local45, Static3.aClass56_1722, Static119.aClass56Array19[local29] }), 4, local102 - 1, 65535);
					if (local20 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public static void method1896(@OriginalArg(1) boolean arg0) {
		if (Static8.aClass43_1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && Static8.aClass43_1.anEventQueue1.peekEvent() != null; local15++) {
			Static68.method1266(1L);
		}
		if (arg0) {
			Static8.aClass43_1.anEventQueue1.postEvent(new ActionEvent(Static59.aCanvas1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)V")
	public static void method1898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			if (Static119.aClass56Array19[local14] != null) {
				@Pc(24) int local24 = Static125.anIntArray337[local14];
				@Pc(36) int local36 = Static38.anInt1024 + 70 + 4 - local3 * 14;
				if (local36 < -20) {
					break;
				}
				@Pc(45) Class56 local45 = Static54.aClass56Array5[local14];
				if (local24 == 0) {
					local3++;
				}
				if (local45 != null && local45.method1428(Static41.aClass56_654)) {
					local45 = local45.method1417(5);
				}
				if (local45 != null && local45.method1428(Static44.aClass56_694)) {
					local45 = local45.method1417(5);
				}
				if ((local24 == 1 || local24 == 2) && (local24 == 1 || Static66.anInt541 == 0 || Static66.anInt541 == 1 && Static108.method1824(local45))) {
					if (arg0 > local36 - 14 && arg0 <= local36 && !local45.method1437(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764)) {
						if (Static29.anInt868 >= 1) {
							Static97.method1702(0, Static61.aClass56_954, 4, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
						}
						Static97.method1702(0, Static86.aClass56_1242, 57, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
						Static97.method1702(0, Static76.aClass56_1107, 18, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
					}
					local3++;
				}
				if ((local24 == 3 || local24 == 7) && Static52.anInt1510 == 0 && (local24 == 7 || Static46.anInt2266 == 0 || Static46.anInt2266 == 1 && Static108.method1824(local45))) {
					if (local36 - 14 < arg0 && arg0 <= local36) {
						if (Static29.anInt868 >= 1) {
							Static97.method1702(0, Static61.aClass56_954, 4, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
						}
						Static97.method1702(0, Static86.aClass56_1242, 57, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
						Static97.method1702(0, Static76.aClass56_1107, 18, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
					}
					local3++;
				}
				if (local24 == 4 && (Static56.anInt1592 == 0 || Static56.anInt1592 == 1 && Static108.method1824(local45))) {
					if (arg0 > local36 - 14 && local36 >= arg0) {
						Static97.method1702(0, Static66.aClass56_269, 7, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
					}
					local3++;
				}
				if ((local24 == 5 || local24 == 6) && Static52.anInt1510 == 0 && Static46.anInt2266 < 2) {
					local3++;
				}
				if (local24 == 8 && (Static56.anInt1592 == 0 || Static56.anInt1592 == 1 && Static108.method1824(local45))) {
					local3++;
					if (local36 - 14 < arg0 && arg0 <= local36) {
						Static97.method1702(0, Static122.aClass56_1635, 40, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local45 }), 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gb;ZLclient!gb;)V")
	public static void method1900(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub1 arg1) {
		if (Static19.aClass3_Sub1_Sub1_Sub2Array14 == null) {
			Static19.aClass3_Sub1_Sub1_Sub2Array14 = Static127.method2037(Static66.aClass56_266, Static12.aClass56_175, Static114.aClass44_Sub1_75);
		}
		if (Static124.aClass3_Sub1_Sub1_Sub4Array64 == null) {
			Static124.aClass3_Sub1_Sub1_Sub4Array64 = Static124.method1994(Static114.aClass44_Sub1_75, Static66.aClass56_266, Static21.aClass56_297);
		}
		if (Static5.aClass3_Sub1_Sub1_Sub4Array3 == null) {
			Static5.aClass3_Sub1_Sub1_Sub4Array3 = Static124.method1994(Static114.aClass44_Sub1_75, Static66.aClass56_266, Static127.aClass56_1733);
		}
		if (Static102.aClass3_Sub1_Sub1_Sub4Array66 == null) {
			Static102.aClass3_Sub1_Sub1_Sub4Array66 = Static124.method1994(Static114.aClass44_Sub1_75, Static66.aClass56_266, aClass56_1592);
		}
		Static6.method1487(0, 23, 765, 480, 0);
		Static6.method1491(0, 0, 125, 23, 12425273, 9135624);
		Static6.method1491(125, 0, 640, 23, 5197647, 2697513);
		arg1.method735(Static108.aClass56_1498, 62, 15, 0);
		if (Static102.aClass3_Sub1_Sub1_Sub4Array66 != null) {
			Static102.aClass3_Sub1_Sub1_Sub4Array66[1].method1504(140, 1);
			arg0.method738(Static22.aClass56_333, 152, 10, 16777215);
			Static102.aClass3_Sub1_Sub1_Sub4Array66[0].method1504(140, 12);
			arg0.method738(Static118.aClass56_1623, 152, 21, 16777215);
		}
		if (Static5.aClass3_Sub1_Sub1_Sub4Array3 != null) {
			if (Static83.anIntArray191[0] == 0 && Static84.anIntArray193[0] == 0) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[2].method1504(280, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[0].method1504(280, 4);
			}
			if (Static83.anIntArray191[0] == 0 && Static84.anIntArray193[0] == 1) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[3].method1504(295, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[1].method1504(295, 4);
			}
			arg1.method738(Static59.aClass56_920, 312, 17, 16777215);
			if (Static83.anIntArray191[0] == 1 && Static84.anIntArray193[0] == 0) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[2].method1504(390, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[0].method1504(390, 4);
			}
			if (Static83.anIntArray191[0] == 1 && Static84.anIntArray193[0] == 1) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[3].method1504(405, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[1].method1504(405, 4);
			}
			arg1.method738(Static7.aClass56_207, 422, 17, 16777215);
			if (Static83.anIntArray191[0] == 2 && Static84.anIntArray193[0] == 0) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[2].method1504(500, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[0].method1504(500, 4);
			}
			if (Static83.anIntArray191[0] == 2 && Static84.anIntArray193[0] == 1) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[3].method1504(515, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[1].method1504(515, 4);
			}
			arg1.method738(Static61.aClass56_959, 532, 17, 16777215);
			if (Static83.anIntArray191[0] == 3 && Static84.anIntArray193[0] == 0) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[2].method1504(610, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[0].method1504(610, 4);
			}
			if (Static83.anIntArray191[0] == 3 && Static84.anIntArray193[0] == 1) {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[3].method1504(625, 4);
			} else {
				Static5.aClass3_Sub1_Sub1_Sub4Array3[1].method1504(625, 4);
			}
			arg1.method738(Static65.aClass56_982, 642, 17, 16777215);
		}
		Static6.method1487(708, 4, 50, 16, 0);
		arg0.method735(Static21.aClass56_299, 733, 16, 16777215);
		Static21.anInt652 = -1;
		if (Static19.aClass3_Sub1_Sub1_Sub2Array14 != null) {
			@Pc(388) int local388 = 24;
			@Pc(394) int local394 = 8;
			@Pc(396) int local396;
			@Pc(398) int local398;
			do {
				local396 = local388;
				local398 = local394;
				if (local388 * (local394 - 1) >= Static124.anInt3085) {
					local394--;
				}
				if ((local388 - 1) * local394 >= Static124.anInt3085) {
					local388--;
				}
				if (local394 * (local388 - 1) >= Static124.anInt3085) {
					local388--;
				}
			} while (local388 != local396 || local398 != local394);
			local396 = (765 - local394 * 88) / (local394 + 1);
			if (local396 > 5) {
				local396 = 5;
			}
			local398 = (480 - local388 * 19) / (local388 + 1);
			if (local398 > 5) {
				local398 = 5;
			}
			@Pc(487) int local487 = (765 - (local394 - 1) * local396 - local394 * 88) / 2;
			@Pc(502) int local502 = (480 - local388 * 19 - (local388 - 1) * local398) / 2;
			@Pc(504) int local504 = local487;
			@Pc(508) int local508 = local502 + 23;
			@Pc(510) int local510 = 0;
			for (@Pc(512) int local512 = 0; local512 < Static124.anInt3085; local512++) {
				@Pc(518) Class75 local518 = Static16.aClass75Array1[local512];
				@Pc(523) Class56 local523 = Static111.method1851(local518.anInt2975);
				@Pc(525) boolean local525 = true;
				if (local518.anInt2975 == -1) {
					local525 = false;
					local523 = Static49.aClass56_833;
				} else if (local518.anInt2975 > 1980) {
					local525 = false;
					local523 = Static86.aClass56_1246;
				}
				if (local504 <= Static36.anInt1021 && Static102.anInt3222 >= local508 && Static36.anInt1021 < local504 + 88 && Static102.anInt3222 < local508 + 19 && local525) {
					Static21.anInt652 = local512;
					Static19.aClass3_Sub1_Sub1_Sub2Array14[local518.aBoolean161 ? 1 : 0].method959(local504, local508);
				} else {
					Static19.aClass3_Sub1_Sub1_Sub2Array14[local518.aBoolean161 ? 1 : 0].method958(local504, local508);
				}
				if (Static124.aClass3_Sub1_Sub1_Sub4Array64 != null) {
					Static124.aClass3_Sub1_Sub1_Sub4Array64[local518.anInt2970 + (local518.aBoolean161 ? 8 : 0)].method1504(local504 + 29, local508);
				}
				arg1.method735(Static111.method1851(local518.anInt2973), local504 + 15, local508 - -9 - -5, 0);
				arg0.method735(local523, local504 + 60, local508 + 5 + 9, 268435455);
				local508 += local398 + 19;
				@Pc(668) int local668 = ~local388;
				local510++;
				if (local668 >= ~local510) {
					local510 = 0;
					local508 = local502 + 23;
					local504 += local396 + 88;
				}
			}
		}
		try {
			@Pc(696) Graphics local696 = Static59.aCanvas1.getGraphics();
			Static50.aClass30_8.method811(0, 0, local696);
		} catch (@Pc(704) Exception local704) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
	public static void method1905() {
		Static19.aClass52_12.method1346();
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
	public static void method1906() {
		aClass81Array1 = null;
		aClass56_1591 = null;
		aClass56_1592 = null;
		aClass56_1586 = null;
		aClass56_1594 = null;
		aClass56_1590 = null;
		aClass56_1593 = null;
		anIntArray292 = null;
		aClass56_1588 = null;
		aClass56_1587 = null;
		aClass3_Sub1_Sub1_Sub4_70 = null;
	}
}
