import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array17 = new Class28[100];

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lclient!wf;")
	public static Class87 aClass87_9 = new Class87(4096);

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_888 = Static170.method3101("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_886 = aClass28_888;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_887 = Static170.method3101("mn");

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_889 = null;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "[I")
	public static int[] anIntArray486 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method2171() {
		Static131.aClass63_22.method2344();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method2172(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static109.aBoolean138) {
			Static90.method2049(arg0);
			return;
		}
		if (Static87.anInt2539 == 1 && Static2.anInt80 >= 715 && Static160.anInt3914 >= 453) {
			Static157.aBoolean181 = !Static157.aBoolean181;
			if (Static157.aBoolean181) {
				Static166.method3062();
			} else {
				Static98.method2674(Static140.aClass28_1184, Static164.aClass7_Sub1_17, Static19.aClass28_215);
			}
		}
		if (Static137.anInt3514 == 5) {
			return;
		}
		Static72.anInt2142++;
		if (Static137.anInt3514 != 10) {
			return;
		}
		if (Static140.anInt3584 != 2 && Static114.anInt2922 == 0) {
			if (Static87.anInt2539 == 1 && Static2.anInt80 >= 5 && Static2.anInt80 <= 105 && Static160.anInt3914 >= 463 && Static160.anInt3914 <= 498) {
				Static154.method2919();
				return;
			}
			if (Static140.aClass82_1 != null) {
				Static154.method2919();
			}
		}
		@Pc(118) int local118 = Static87.anInt2539;
		@Pc(120) int local120 = Static2.anInt80;
		@Pc(122) int local122 = Static160.anInt3914;
		if (Static82.anInt2394 == 0) {
			if (local118 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 271 && local122 <= 311) {
				Static82.anInt2394 = 3;
				Static122.anInt3160 = 0;
			}
			@Pc(168) boolean local168 = false;
			if (Static81.anInt2377 != 0) {
				while (Static46.method1098()) {
					if (Static11.anInt409 == 84) {
						local168 = true;
						break;
					}
				}
			}
			if (local168 || local118 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 271 && local122 <= 311) {
				Static140.aClass28_1180 = Static174.aClass28_1462;
				Static82.anInt2394 = 2;
				Static122.anInt3160 = 0;
				Static140.aClass28_1190 = Static161.aClass28_1340;
				Static140.aClass28_1191 = Static161.aClass28_1330;
			}
		} else if (Static82.anInt2394 == 2) {
			@Pc(232) short local232 = 231;
			@Pc(233) int local233 = local232 + 30;
			if (local118 == 1 && local122 >= 246 && local122 < 261) {
				Static122.anInt3160 = 0;
			}
			local233 += 15;
			if (local118 == 1 && local122 >= 261 && local122 < 276) {
				Static122.anInt3160 = 1;
			}
			local233 += 15;
			if (local118 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 301 && local122 <= 341) {
				Static140.aClass28_1189 = Static140.aClass28_1189.method920().method912();
				if (Static140.aClass28_1189.method901() == 0) {
					Static42.method1010(Static113.aClass28_937, Static161.aClass28_1345, Static161.aClass28_1355);
				} else if (Static140.aClass28_1183.method901() == 0) {
					Static42.method1010(Static146.aClass28_1230, Static161.aClass28_1333, Static161.aClass28_1350);
				} else {
					Static42.method1010(Static82.aClass28_755, Static161.aClass28_1335, Static161.aClass28_1352);
					Static173.method3141(20);
				}
			} else {
				if (local118 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 301 && local122 <= 341) {
					Static82.anInt2394 = 0;
					Static140.aClass28_1189 = Static140.aClass28_1184;
					Static140.aClass28_1183 = Static140.aClass28_1184;
				}
				while (true) {
					while (Static46.method1098()) {
						@Pc(409) boolean local409 = false;
						for (@Pc(411) int local411 = 0; local411 < Static156.aClass28_1303.method901(); local411++) {
							if (Static169.anInt674 == Static156.aClass28_1303.method917(local411)) {
								local409 = true;
								break;
							}
						}
						if (Static122.anInt3160 == 0) {
							if (Static11.anInt409 == 85 && Static140.aClass28_1189.method901() > 0) {
								Static140.aClass28_1189 = Static140.aClass28_1189.method926(Static140.aClass28_1189.method901() - 1, 0);
							}
							if (Static11.anInt409 == 84 || Static11.anInt409 == 80) {
								Static122.anInt3160 = 1;
							}
							if (local409 && Static140.aClass28_1189.method901() < 12) {
								Static140.aClass28_1189 = Static140.aClass28_1189.method937(Static169.anInt674);
							}
						} else if (Static122.anInt3160 == 1) {
							if (Static11.anInt409 == 85 && Static140.aClass28_1183.method901() > 0) {
								Static140.aClass28_1183 = Static140.aClass28_1183.method926(Static140.aClass28_1183.method901() - 1, 0);
							}
							if (Static11.anInt409 == 84 || Static11.anInt409 == 80) {
								Static122.anInt3160 = 0;
							}
							if (Static81.anInt2377 != 0 && Static11.anInt409 == 84) {
								Static140.aClass28_1189 = Static140.aClass28_1189.method920().method912();
								if (Static140.aClass28_1189.method901() == 0) {
									Static42.method1010(Static113.aClass28_937, Static161.aClass28_1345, Static161.aClass28_1355);
									return;
								}
								if (Static140.aClass28_1183.method901() == 0) {
									Static42.method1010(Static146.aClass28_1230, Static161.aClass28_1333, Static161.aClass28_1350);
									return;
								}
								Static42.method1010(Static82.aClass28_755, Static161.aClass28_1335, Static161.aClass28_1352);
								Static173.method3141(20);
								return;
							}
							if (local409 && Static140.aClass28_1183.method901() < 20) {
								Static140.aClass28_1183 = Static140.aClass28_1183.method937(Static169.anInt674);
							}
						}
					}
					return;
				}
			}
		} else if (Static82.anInt2394 == 3 && local118 == 1 && local120 >= 307 && local120 <= 457 && local122 >= 301 && local122 <= 341) {
			Static82.anInt2394 = 0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public static void method2173() {
		aClass28_888 = null;
		aClass28_889 = null;
		aClass28_886 = null;
		anIntArray486 = null;
		aClass28Array17 = null;
		aClass87_9 = null;
		aClass28_887 = null;
		aClass3_Sub2_Sub2_Sub4Array2 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method2175() {
		for (@Pc(1) int local1 = 0; local1 < Static11.anInt411; local1++) {
			@Pc(6) Class32 local6 = Static90.aClass32Array1[local1];
			Static86.method1990(local6);
			Static90.aClass32Array1[local1] = null;
		}
		Static11.anInt411 = 0;
	}
}
