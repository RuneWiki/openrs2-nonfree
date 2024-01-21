import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!ff;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt304;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public static int anInt305;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_140 = Static2.method59("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_141 = Static2.method59("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_142 = Static2.method59("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_143 = Static2.method59("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_144 = Static2.method59("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method178() {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas2.getGraphics();
			Static61.aClass22_13.method1065(local2, 4, 4);
		} catch (@Pc(10) Exception local10) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method179() {
		Static45.aClass22_15.method1068();
		Static85.aClass2_Sub1_Sub9_Sub3_53.method1494(0, 0);
		Static52.method929();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method180() {
		aClass80_142 = null;
		aClass80_144 = null;
		aClass80_143 = null;
		aClass11_5 = null;
		aClass80_140 = null;
		aClass80_141 = null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method181() {
		@Pc(7) int local7 = -1;
		if (Static107.anInt2862 == 0 && !Static76.aBoolean141) {
			Static59.method1043(0, 55, Static63.aClass80_666, Static93.anInt2398, Static40.aClass80_446, Static95.anInt2430);
		}
		for (@Pc(25) int local25 = 0; local25 < Static12.anInt358; local25++) {
			@Pc(31) int local31 = Static12.anIntArray53[local25];
			@Pc(37) int local37 = local31 >> 29 & 0x3;
			@Pc(41) int local41 = local31 & 0x7F;
			@Pc(47) int local47 = local31 >> 7 & 0x7F;
			@Pc(53) int local53 = local31 >> 14 & 0x7FFF;
			if (local7 != local31) {
				local7 = local31;
				@Pc(107) int local107;
				if (local37 == 2 && Static93.aClass64_1.method1622(Static16.anInt444, local41, local47, local31) >= 0) {
					@Pc(74) Class2_Sub1_Sub10 local74 = Static18.method404(local53);
					if (local74.anIntArray207 != null) {
						local74 = local74.method965();
					}
					if (local74 == null) {
						continue;
					}
					if (Static107.anInt2862 == 1) {
						Static59.method1043(local31, 5, Static8.aClass80_109, local41, Static93.method1444(new Class80[] { Static67.aClass80_712, Static61.aClass80_640, local74.aClass80_580 }), local47);
					} else if (!Static76.aBoolean141) {
						@Pc(97) Class80[] local97 = local74.aClass80Array9;
						if (Static24.aBoolean64) {
							local97 = Static33.method603(local97);
						}
						if (local97 != null) {
							for (local107 = 4; local107 >= 0; local107--) {
								if (local97[local107] != null) {
									@Pc(115) short local115 = 0;
									if (local107 == 0) {
										local115 = 24;
									}
									if (local107 == 1) {
										local115 = 40;
									}
									if (local107 == 2) {
										local115 = 11;
									}
									if (local107 == 3) {
										local115 = 19;
									}
									if (local107 == 4) {
										local115 = 1003;
									}
									Static59.method1043(local31, local115, local97[local107], local41, Static93.method1444(new Class80[] { Static93.aClass80_927, local74.aClass80_580 }), local47);
								}
							}
						}
						Static59.method1043(local74.anInt1638 << 14, 1004, Static51.aClass80_558, local41, Static93.method1444(new Class80[] { Static93.aClass80_927, local74.aClass80_580 }), local47);
					} else if ((Static50.anInt1524 & 0x4) == 4) {
						Static59.method1043(local31, 43, Static68.aClass80_721, local41, Static93.method1444(new Class80[] { Static59.aClass80_631, Static61.aClass80_640, local74.aClass80_580 }), local47);
					}
				}
				@Pc(296) int local296;
				@Pc(304) Class2_Sub1_Sub1_Sub4_Sub1 local304;
				@Pc(351) Class2_Sub1_Sub1_Sub4_Sub2 local351;
				if (local37 == 1) {
					@Pc(275) Class2_Sub1_Sub1_Sub4_Sub1 local275 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local53];
					if (local275.aClass2_Sub1_Sub13_1.anInt2573 == 1 && (local275.anInt2370 & 0x7F) == 64 && (local275.anInt2324 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static110.anInt2908; local296++) {
							local304 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static85.anIntArray277[local296]];
							if (local304 != null && local304 != local275 && local304.aClass2_Sub1_Sub13_1.anInt2573 == 1 && local275.anInt2370 == local304.anInt2370 && local304.anInt2324 == local275.anInt2324) {
								Static89.method1328(local41, local47, Static85.anIntArray277[local296], local304.aClass2_Sub1_Sub13_1);
							}
						}
						for (local107 = 0; local107 < Static92.anInt2273; local107++) {
							local351 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local107]];
							if (local351 != null && local275.anInt2370 == local351.anInt2370 && local351.anInt2324 == local275.anInt2324) {
								Static123.method1972(Static53.anIntArray208[local107], local41, local351, local47);
							}
						}
					}
					Static89.method1328(local41, local47, local53, local275.aClass2_Sub1_Sub13_1);
				}
				if (local37 == 0) {
					@Pc(396) Class2_Sub1_Sub1_Sub4_Sub2 local396 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local53];
					if ((local396.anInt2370 & 0x7F) == 64 && (local396.anInt2324 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static110.anInt2908; local296++) {
							local304 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static85.anIntArray277[local296]];
							if (local304 != null && local304.aClass2_Sub1_Sub13_1.anInt2573 == 1 && local304.anInt2370 == local396.anInt2370 && local396.anInt2324 == local304.anInt2324) {
								Static89.method1328(local41, local47, Static85.anIntArray277[local296], local304.aClass2_Sub1_Sub13_1);
							}
						}
						for (local107 = 0; local107 < Static92.anInt2273; local107++) {
							local351 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local107]];
							if (local351 != null && local351 != local396 && local396.anInt2370 == local351.anInt2370 && local396.anInt2324 == local351.anInt2324) {
								Static123.method1972(Static53.anIntArray208[local107], local41, local351, local47);
							}
						}
					}
					Static123.method1972(local53, local41, local396, local47);
				}
				if (local37 == 3) {
					@Pc(512) Class58 local512 = Static45.aClass58ArrayArrayArray3[Static16.anInt444][local41][local47];
					if (local512 != null) {
						for (@Pc(519) Class2_Sub1_Sub1_Sub5 local519 = (Class2_Sub1_Sub1_Sub5) local512.method1293(); local519 != null; local519 = (Class2_Sub1_Sub1_Sub5) local512.method1288()) {
							@Pc(526) Class2_Sub1_Sub5 local526 = Static4.method95(local519.anInt960);
							if (Static107.anInt2862 == 1) {
								Static59.method1043(local519.anInt960, 35, Static8.aClass80_109, local41, Static93.method1444(new Class80[] { Static67.aClass80_712, Static53.aClass80_571, local526.aClass80_271 }), local47);
							} else if (!Static76.aBoolean141) {
								@Pc(578) Class80[] local578 = local526.aClass80Array3;
								if (Static24.aBoolean64) {
									local578 = Static33.method603(local578);
								}
								for (@Pc(586) int local586 = 4; local586 >= 0; local586--) {
									if (local578 != null && local578[local586] != null) {
										@Pc(600) byte local600 = 0;
										if (local586 == 0) {
											local600 = 8;
										}
										if (local586 == 1) {
											local600 = 30;
										}
										if (local586 == 2) {
											local600 = 41;
										}
										if (local586 == 3) {
											local600 = 2;
										}
										if (local586 == 4) {
											local600 = 12;
										}
										Static59.method1043(local519.anInt960, local600, local578[local586], local41, Static93.method1444(new Class80[] { Static50.aClass80_551, local526.aClass80_271 }), local47);
									} else if (local586 == 2) {
										Static59.method1043(local519.anInt960, 41, Static87.aClass80_894, local41, Static93.method1444(new Class80[] { Static50.aClass80_551, local526.aClass80_271 }), local47);
									}
								}
								Static59.method1043(local519.anInt960, 1006, Static51.aClass80_558, local41, Static93.method1444(new Class80[] { Static50.aClass80_551, local526.aClass80_271 }), local47);
							} else if ((Static50.anInt1524 & 0x1) == 1) {
								Static59.method1043(local519.anInt960, 13, Static68.aClass80_721, local41, Static93.method1444(new Class80[] { Static59.aClass80_631, Static53.aClass80_571, local526.aClass80_271 }), local47);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	public static int method182(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}
}
