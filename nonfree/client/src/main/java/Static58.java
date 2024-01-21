import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "Lclient!jd;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!lc", name = "Lb", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lclient!kc;")
	private static Class36 aClass36_733 = Static14.method2017("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!kc;")
	public static Class36 aClass36_732 = aClass36_733;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	public static int anInt1526 = -1;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_734 = Static14.method2017("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!lc", name = "lb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_735 = Static14.method2017("");

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_736 = Static14.method2017("Login");

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_737 = aClass36_736;

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "Lclient!kc;")
	public static Class36 aClass36_739 = Static14.method2017("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!lc", name = "Kb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_740 = Static14.method2017("invback");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	public static void method1073() {
		if (Static95.anInt2522 != 1) {
			return;
		}
		if (Static59.anInt1578 >= 6 && Static59.anInt1578 <= 106 && Static90.anInt2349 >= 467 && Static90.anInt2349 <= 499) {
			Static15.anInt316 = (Static15.anInt316 + 1) % 4;
			Static115.aBoolean77 = true;
			Static46.aBoolean63 = true;
			Static42.aClass2_Sub12_Sub1_1.method1422(194);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static15.anInt316);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static3.anInt1302);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static45.anInt1225);
		}
		if (Static59.anInt1578 >= 135 && Static59.anInt1578 <= 235 && Static90.anInt2349 >= 467 && Static90.anInt2349 <= 499) {
			Static3.anInt1302 = (Static3.anInt1302 + 1) % 3;
			Static46.aBoolean63 = true;
			Static115.aBoolean77 = true;
			Static42.aClass2_Sub12_Sub1_1.method1422(194);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static15.anInt316);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static3.anInt1302);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static45.anInt1225);
		}
		if (Static59.anInt1578 >= 273 && Static59.anInt1578 <= 373 && Static90.anInt2349 >= 467 && Static90.anInt2349 <= 499) {
			Static115.aBoolean77 = true;
			Static45.anInt1225 = (Static45.anInt1225 + 1) % 3;
			Static46.aBoolean63 = true;
			Static42.aClass2_Sub12_Sub1_1.method1422(194);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static15.anInt316);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static3.anInt1302);
			Static42.aClass2_Sub12_Sub1_1.method1409(Static45.anInt1225);
		}
		if (Static59.anInt1578 < 412 || Static59.anInt1578 > 512 || Static90.anInt2349 < 467 || Static90.anInt2349 > 499) {
			return;
		}
		if (Static78.anInt2037 != -1) {
			Static40.method1546(Static53.aClass36_700, 0, Static105.aClass36_1352);
			return;
		}
		Static11.method220();
		if (Static41.anInt1077 != -1) {
			Static66.aBoolean75 = false;
			Static15.anInt319 = Static78.anInt2037 = Static41.anInt1077;
			Static105.aClass36_1348 = Static105.aClass36_1352;
		}
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "(I)V")
	public static void method1077() {
		if (Static45.anInt1227 != 0 || Static95.anInt2522 != 1) {
			return;
		}
		@Pc(20) int local20 = Static59.anInt1578 - 25 - 550;
		@Pc(24) int local24 = Static90.anInt2349 - 9;
		if (local20 < 0 || local24 < 0 || local20 >= 146 || local24 >= 151) {
			return;
		}
		local20 -= 73;
		@Pc(48) int local48 = Static14.anInt2903 + Static65.anInt1672 & 0x7FF;
		@Pc(52) int local52 = Class2_Sub1_Sub1_Sub4.anIntArray265[local48];
		@Pc(60) int local60 = local52 * (Static7.anInt194 + 256) >> 8;
		@Pc(64) int local64 = Class2_Sub1_Sub1_Sub4.anIntArray261[local48];
		local24 -= 75;
		@Pc(73) int local73 = (Static7.anInt194 + 256) * local64 >> 8;
		@Pc(84) int local84 = local24 * local73 - local60 * local20 >> 11;
		@Pc(94) int local94 = local60 * local24 + local20 * local73 >> 11;
		@Pc(102) int local102 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 + local94 >> 7;
		@Pc(110) int local110 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 - local84 >> 7;
		@Pc(130) boolean local130 = Static29.method623(0, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local102, 1, local110, 0, true, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
		if (!local130) {
			return;
		}
		Static42.aClass2_Sub12_Sub1_1.method1409(local20);
		Static42.aClass2_Sub12_Sub1_1.method1409(local24);
		Static42.aClass2_Sub12_Sub1_1.method1373(Static14.anInt2903);
		Static42.aClass2_Sub12_Sub1_1.method1409(57);
		Static42.aClass2_Sub12_Sub1_1.method1409(Static65.anInt1672);
		Static42.aClass2_Sub12_Sub1_1.method1409(Static7.anInt194);
		Static42.aClass2_Sub12_Sub1_1.method1409(89);
		Static42.aClass2_Sub12_Sub1_1.method1373(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204);
		Static42.aClass2_Sub12_Sub1_1.method1373(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149);
		Static42.aClass2_Sub12_Sub1_1.method1409(Static17.anInt442);
		Static42.aClass2_Sub12_Sub1_1.method1409(63);
		return;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ed;I)Lclient!kc;")
	public static Class36 method1078(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		if (Static89.method1638(Static67.method1163(arg0)) == 0) {
			return null;
		} else if (arg0.aClass36_373 == null || arg0.aClass36_373.method1014().method1028() == 0) {
			return Static117.aBoolean84 ? Static45.aClass36_612 : null;
		} else {
			return arg0.aClass36_373;
		}
	}

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "(I)V")
	public static void method1079() {
		if (Static40.anInt2199 == 0) {
			return;
		}
		@Pc(8) int local8 = 0;
		if (Static10.anInt243 != 0) {
			local8 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static99.aClass36Array35[local21] != null) {
				@Pc(30) Class36 local30 = Static8.aClass36Array5[local21];
				@Pc(34) int local34 = Static88.anIntArray270[local21];
				if (local30 != null && local30.method1042(Static95.aClass36_1209)) {
					local30 = local30.method1020(5);
				}
				if (local30 != null && local30.method1042(Static29.aClass36_421)) {
					local30 = local30.method1020(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static3.anInt1302 == 0 || Static3.anInt1302 == 1 && Static26.method549(local30))) {
					@Pc(92) int local92 = 329 - local8 * 13;
					local8++;
					if (Static115.anInt1789 > 4 && local92 - 10 < Static64.anInt1640 + -4 && local92 + 3 >= Static64.anInt1640 + -4) {
						@Pc(143) int local143 = Static11.aClass2_Sub1_Sub1_Sub2_1.method458(Static49.method949(new Class36[] { Static63.aClass36_787, Static83.aClass36_990, local30, Static99.aClass36Array35[local21] })) + 25;
						if (local143 > 450) {
							local143 = 450;
						}
						if (local143 + 4 > Static115.anInt1789) {
							if (Static79.anInt2052 >= 1) {
								Static34.method717(2021, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, local30 }), 0, Static20.aClass36_268);
							}
							Static34.method717(2003, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, local30 }), 0, Static85.aClass36_1030);
							Static34.method717(2011, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, local30 }), 0, Static4.aClass36_74);
						}
					}
					if (local8 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static3.anInt1302 < 2) {
					local8++;
					if (local8 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method1082() {
		aClass34_4 = null;
		anIntArray194 = null;
		aClass36_735 = null;
		aClass36_732 = null;
		aClass36_734 = null;
		aClass36_740 = null;
		aClass36_733 = null;
		aClass36_737 = null;
		aClass36_736 = null;
		aClass36_739 = null;
	}
}
