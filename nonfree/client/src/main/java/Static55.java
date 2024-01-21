import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "Lclient!oa;")
	public static Class9 aClass9_15;

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_12;

	@OriginalMember(owner = "client!lb", name = "xb", descriptor = "J")
	public static long aLong51;

	@OriginalMember(owner = "client!lb", name = "Lb", descriptor = "Lclient!la;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!lb", name = "Pb", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_70 = new Class17(30);

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_661 = Static56.method1206("New User");

	@OriginalMember(owner = "client!lb", name = "Eb", descriptor = "[I")
	public static int[] anIntArray274 = new int[500];

	@OriginalMember(owner = "client!lb", name = "Mb", descriptor = "Lclient!eb;")
	public static Class2_Sub6_Sub1 aClass2_Sub6_Sub1_10 = new Class2_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!lb", name = "Nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_663 = Static56.method1206("Cancel");

	@OriginalMember(owner = "client!lb", name = "Ob", descriptor = "Lclient!nb;")
	public static Class36 aClass36_4 = new Class36();

	@OriginalMember(owner = "client!lb", name = "Qb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_664 = Static56.method1206(" x ");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1184() {
		if (Static100.anInt2732 == 0) {
			return;
		}
		@Pc(18) Class2_Sub1_Sub3_Sub3 local18 = Static98.aClass2_Sub1_Sub3_Sub3_4;
		@Pc(20) int local20 = 0;
		if (Static19.anInt851 != 0) {
			local20 = 1;
		}
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			if (Static28.aClass31Array6[local29] != null) {
				@Pc(37) byte local37 = 0;
				@Pc(41) Class31 local41 = Static8.aClass31Array5[local29];
				@Pc(45) int local45 = Static59.anIntArray286[local29];
				if (local41 != null && local41.method1226(Static38.aClass31_518)) {
					local41 = local41.method1222(5);
					local37 = 1;
				}
				if (local41 != null && local41.method1226(Static7.aClass31_102)) {
					local41 = local41.method1222(5);
					local37 = 2;
				}
				@Pc(104) int local104;
				if ((local45 == 3 || local45 == 7) && (local45 == 7 || Static12.anInt527 == 0 || Static12.anInt527 == 1 && Static59.method1282(local41))) {
					local104 = 329 - local20 * 13;
					local20++;
					local18.method954(Static79.aClass31_792, 4, local104, 0);
					local18.method954(Static79.aClass31_792, 4, local104 - 1, 65535);
					@Pc(125) int local125 = local18.method961(Static99.aClass31_920) + 4;
					if (local37 == 1) {
						Static56.aClass2_Sub1_Sub3_Sub1Array3[0].method291(local125, local104 - 12);
						local125 += 14;
					}
					if (local37 == 2) {
						Static56.aClass2_Sub1_Sub3_Sub1Array3[1].method291(local125, local104 - 12);
						local125 += 14;
					}
					local18.method954(Static37.method974(new Class31[] { local41, Static70.aClass31_776, Static28.aClass31Array6[local29] }), local125, local104, 0);
					local18.method954(Static37.method974(new Class31[] { local41, Static70.aClass31_776, Static28.aClass31Array6[local29] }), local125, local104 - 1, 65535);
					if (local20 >= 5) {
						return;
					}
				}
				if (local45 == 5 && Static12.anInt527 < 2) {
					local104 = 329 - local20 * 13;
					local18.method954(Static28.aClass31Array6[local29], 4, local104, 0);
					local18.method954(Static28.aClass31Array6[local29], 4, local104 - 1, 65535);
					local20++;
					if (local20 >= 5) {
						return;
					}
				}
				if (local45 == 6 && Static12.anInt527 < 2) {
					local104 = 329 - local20 * 13;
					local20++;
					local18.method954(Static37.method974(new Class31[] { Static90.aClass31_841, local41, Static70.aClass31_776, Static28.aClass31Array6[local29] }), 4, local104, 0);
					local18.method954(Static37.method974(new Class31[] { Static90.aClass31_841, local41, Static70.aClass31_776, Static28.aClass31Array6[local29] }), 4, local104 - 1, 65535);
					if (local20 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public static void method1187() {
		Static78.anInt2278++;
		Static54.method1168(true);
		Static24.method722(true);
		Static54.method1168(false);
		Static24.method722(false);
		Static44.method1062();
		Static31.method850();
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (!Static95.aBoolean133) {
			local33 = Static101.anInt2751;
			if (local33 < Static89.anInt2387 / 256) {
				local33 = Static89.anInt2387 / 256;
			}
			local52 = Static16.anInt761 + Static12.anInt542 & 0x7FF;
			if (Static44.aBooleanArray39[4] && Static77.anIntArray319[4] + 128 > local33) {
				local33 = Static77.anIntArray319[4] + 128;
			}
			Static102.method472(Static75.anInt2248, local33 * 3 + 600, local33, local52, Static42.method1057(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011, Static58.anInt1945) - 50, Static62.anInt2114);
		}
		if (Static95.aBoolean133) {
			local33 = Static103.method1738();
		} else {
			local33 = Static40.method1273();
		}
		@Pc(101) int local101 = Static57.anInt2682;
		@Pc(103) int local103 = Static91.anInt2484;
		@Pc(105) int local105 = Static72.anInt1289;
		local52 = Static44.anInt1595;
		@Pc(109) int local109 = Static18.anInt805;
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			if (Static44.aBooleanArray39[local111]) {
				@Pc(153) int local153 = (int) ((double) -Static24.anIntArray116[local111] + (double) (Static24.anIntArray116[local111] * 2 + 1) * Math.random() + Math.sin((double) Static72.anIntArray168[local111] / 100.0D * (double) Static85.anIntArray356[local111]) * (double) Static77.anIntArray319[local111]);
				if (local111 == 0) {
					Static44.anInt1595 += local153;
				}
				if (local111 == 1) {
					Static57.anInt2682 += local153;
				}
				if (local111 == 4) {
					Static72.anInt1289 += local153;
					if (Static72.anInt1289 < 128) {
						Static72.anInt1289 = 128;
					}
					if (Static72.anInt1289 > 383) {
						Static72.anInt1289 = 383;
					}
				}
				if (local111 == 2) {
					Static91.anInt2484 += local153;
				}
				if (local111 == 3) {
					Static18.anInt805 = local153 + Static18.anInt805 & 0x7FF;
				}
			}
		}
		Static63.method1319();
		Static35.anInt1359 = Static85.anInt2508 - 4;
		Static35.anInt1363 = 0;
		Static35.aBoolean75 = true;
		Static35.anInt1358 = Static61.anInt2102 - 4;
		Static81.method1647();
		Static99.aClass64_1.method1793(Static44.anInt1595, Static57.anInt2682, Static91.anInt2484, Static72.anInt1289, Static18.anInt805, local33);
		Static99.aClass64_1.method1783();
		Static17.method528();
		Static88.method1490();
		((Class45) Static97.anInterface1_1).method1422(Static56.anInt1911);
		Static69.method1379();
		if (Static42.aBoolean84 && aClass30_2.method1163() == 0) {
			Static42.aBoolean84 = false;
		}
		if (Static42.aBoolean84) {
			Static63.method1319();
			Static81.method1647();
			Static59.method1283(false, Static40.aClass31_712, null);
		}
		Static86.method1483(Static18.aGraphics1);
		Static91.anInt2484 = local103;
		Static57.anInt2682 = local101;
		Static44.anInt1595 = local52;
		Static18.anInt805 = local109;
		Static72.anInt1289 = local105;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method1188() {
		aClass2_Sub6_Sub1_10 = null;
		aClass11_Sub1_12 = null;
		aClass17_70 = null;
		aClass31_664 = null;
		aClass30_2 = null;
		aClass9_15 = null;
		aClass31_661 = null;
		aClass31_663 = null;
		aClass36_4 = null;
		anIntArray275 = null;
		anIntArray274 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIZ)Lclient!cc;")
	public static Class11_Sub1 method1190(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class25 local5 = null;
		if (Static88.aClass61_4 != null) {
			local5 = new Class25(arg1, Static88.aClass61_4, Static28.aClass61Array1[arg1], 1000000);
		}
		return new Class11_Sub1(aClass30_2, local5, arg1, arg0, arg2);
	}
}
