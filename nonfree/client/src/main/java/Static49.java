import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!id", name = "U", descriptor = "[I")
	public static int[] anIntArray188 = new int[500];

	@OriginalMember(owner = "client!id", name = "X", descriptor = "Lclient!qf;")
	private static Class60 aClass60_689 = Static59.method1195("Loaded title screen");

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_700 = Static59.method1195("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_690 = aClass60_700;

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_691 = Static59.method1195("Jul");

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_692 = Static59.method1195("Dec");

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_693 = Static59.method1195("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_694 = Static59.method1195("Nov");

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_695 = Static59.method1195("Mar");

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "Lclient!qf;")
	private static Class60 aClass60_696 = Static59.method1195("Feb");

	@OriginalMember(owner = "client!id", name = "ob", descriptor = "Lclient!qf;")
	private static Class60 aClass60_701 = Static59.method1195("Jan");

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_697 = Static59.method1195("Apr");

	@OriginalMember(owner = "client!id", name = "tb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_703 = Static59.method1195("May");

	@OriginalMember(owner = "client!id", name = "vb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_705 = Static59.method1195("Jun");

	@OriginalMember(owner = "client!id", name = "ub", descriptor = "Lclient!qf;")
	private static Class60 aClass60_704 = Static59.method1195("Aug");

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_702 = Static59.method1195("Sep");

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_698 = Static59.method1195("Oct");

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array4 = new Class60[] { aClass60_701, aClass60_696, aClass60_695, aClass60_697, aClass60_703, aClass60_705, aClass60_691, aClass60_704, aClass60_702, aClass60_698, aClass60_694, aClass60_692 };

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_699 = aClass60_689;

	@OriginalMember(owner = "client!id", name = "yb", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!id", name = "zb", descriptor = "I")
	public static int anInt1594 = 0;

	@OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
	public static int anInt1598 = 0;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
	public static void method1050() {
		Static100.method1983();
		Static3.aBoolean3 = true;
		Static117.method2131();
		if (Static56.aBoolean56) {
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static120.aClass60_1372, 239, 40, 0, -1);
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1379), Static10.aClass60_138 }), 239, 60, 128, -1);
		} else if (Static103.anInt2994 == 1) {
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static105.aClass60_1269, 239, 40, 0, -1);
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1374), Static10.aClass60_138 }), 239, 60, 128, -1);
		} else if (Static103.anInt2994 == 2) {
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static98.aClass60_1204, 239, 40, 0, -1);
			Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1374), Static10.aClass60_138 }), 239, 60, 128, -1);
		} else {
			@Pc(166) int local166;
			@Pc(168) int local168;
			@Pc(159) Class3_Sub1_Sub2_Sub2 local159;
			if (Static103.anInt2994 == 3) {
				if (Static120.aClass60_1370 != Static120.aClass60_1374) {
					Static42.method965(Static120.aClass60_1374);
					Static120.aClass60_1370 = Static120.aClass60_1374;
				}
				local159 = Static20.aClass3_Sub1_Sub2_Sub2_2;
				Static40.method1891(0, 0, 463, 77);
				for (local166 = 0; local166 < Static15.anInt627; local166++) {
					local168 = local166 * 14 + 18 - Static55.anInt1757;
					if (local168 > 0 && local168 < 110) {
						local159.method842(Static58.aClass60Array7[local166], 239, local168, 0, -1);
					}
				}
				Static40.method1896();
				if (Static15.anInt627 > 5) {
					Static74.method1552(77, 463, Static55.anInt1757, 0, Static15.anInt627 * 14 + 7);
				}
				if (Static120.aClass60_1374.method1836() == 0) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static48.aClass60_665, 239, 40, 255, -1);
				} else if (Static15.anInt627 == 0) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static83.aClass60_1109, 239, 40, 0, -1);
				}
				local159.method842(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1374), Static10.aClass60_138 }), 239, 90, 0, -1);
				Static40.method1885(0, 77, 479, 0);
			} else if (Static103.anInt2994 == 4) {
				Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static120.aClass60_1375, 239, 40, 0, -1);
				Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1374), Static10.aClass60_138 }), 239, 60, 128, -1);
			} else if (Static127.aClass60_1156 == null) {
				@Pc(132) boolean local132;
				if (Static78.anInt2429 != -1) {
					local132 = Static13.method354(2, Static78.anInt2429, 479, 96);
					if (!local132) {
						Static71.aBoolean49 = true;
					}
				} else if (Static129.anInt3460 == -1) {
					local159 = Static20.aClass3_Sub1_Sub2_Sub2_2;
					Static40.method1891(0, 0, 463, 77);
					local166 = 0;
					for (local168 = 0; local168 < 100; local168++) {
						if (Static126.aClass60Array23[local168] != null) {
							@Pc(178) int local178 = Static57.anIntArray384[local168];
							@Pc(187) int local187 = Static55.anInt1760 + 70 - local166 * 14;
							@Pc(191) Class60 local191 = Static99.aClass60Array18[local168];
							@Pc(193) byte local193 = 0;
							if (local191 != null && local191.method1853(Static43.aClass60_624)) {
								local191 = local191.method1829(5);
								local193 = 1;
							}
							if (local191 != null && local191.method1853(Static103.aClass60_1258)) {
								local191 = local191.method1829(5);
								local193 = 2;
							}
							if (local178 == 0) {
								local166++;
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static126.aClass60Array23[local168], 4, local187, 0, -1);
								}
							}
							@Pc(272) int local272;
							if ((local178 == 1 || local178 == 2) && (local178 == 1 || Static27.anInt997 == 0 || Static27.anInt997 == 1 && Static67.method1384(local191))) {
								if (local187 > 0 && local187 < 110) {
									local272 = 4;
									if (local193 == 1) {
										Static98.aClass3_Sub1_Sub2_Sub4Array8[0].method1903(4, local187 - 12);
										local272 += 14;
									}
									if (local193 == 2) {
										Static98.aClass3_Sub1_Sub2_Sub4Array8[1].method1903(local272, local187 - 12);
										local272 += 14;
									}
									local159.method847(Static60.method1211(new Class60[] { local191, Static29.aClass60_389 }), local272, local187, 0, -1);
									local272 += local159.method848(local191) + 8;
									local159.method847(Static126.aClass60Array23[local168], local272, local187, 255, -1);
								}
								local166++;
							}
							if ((local178 == 3 || local178 == 7) && Static36.anInt1216 == 0 && (local178 == 7 || Static57.anInt3392 == 0 || Static57.anInt3392 == 1 && Static67.method1384(local191))) {
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static56.aClass60_789, 4, local187, 0, -1);
									local272 = local159.method848(Static56.aClass60_789) + 4;
									local272 += local159.method850(32);
									if (local193 == 1) {
										Static98.aClass3_Sub1_Sub2_Sub4Array8[0].method1903(local272, local187 - 12);
										local272 += 14;
									}
									if (local193 == 2) {
										Static98.aClass3_Sub1_Sub2_Sub4Array8[1].method1903(local272, local187 - 12);
										local272 += 14;
									}
									local159.method847(Static60.method1211(new Class60[] { local191, Static29.aClass60_389 }), local272, local187, 0, -1);
									local272 += local159.method848(local191) + 8;
									local159.method847(Static126.aClass60Array23[local168], local272, local187, 8388608, -1);
								}
								local166++;
							}
							if (local178 == 4 && (Static61.anInt1942 == 0 || Static61.anInt1942 == 1 && Static67.method1384(local191))) {
								local166++;
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static60.method1211(new Class60[] { local191, Static30.aClass60_408, Static126.aClass60Array23[local168] }), 4, local187, 8388736, -1);
								}
							}
							if (local178 == 5 && Static36.anInt1216 == 0 && Static57.anInt3392 < 2) {
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static126.aClass60Array23[local168], 4, local187, 8388608, -1);
								}
								local166++;
							}
							if (local178 == 6 && Static36.anInt1216 == 0 && Static57.anInt3392 < 2) {
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static60.method1211(new Class60[] { Static128.aClass60_1432, Static30.aClass60_408, local191, Static29.aClass60_389 }), 4, local187, 0, -1);
									local159.method847(Static126.aClass60Array23[local168], local159.method848(Static60.method1211(new Class60[] { Static128.aClass60_1432, Static30.aClass60_408, local191 })) + 12, local187, 8388608, -1);
								}
								local166++;
							}
							if (local178 == 8 && (Static61.anInt1942 == 0 || Static61.anInt1942 == 1 && Static67.method1384(local191))) {
								local166++;
								if (local187 > 0 && local187 < 110) {
									local159.method847(Static60.method1211(new Class60[] { local191, Static30.aClass60_408, Static126.aClass60Array23[local168] }), 4, local187, 8270336, -1);
								}
							}
						}
					}
					Static40.method1896();
					Static104.anInt3010 = local166 * 14 + 7;
					if (Static104.anInt3010 < 78) {
						Static104.anInt3010 = 78;
					}
					Static74.method1552(77, 463, Static104.anInt3010 - Static55.anInt1760 - 77, 0, Static104.anInt3010);
					@Pc(679) Class60 local679;
					if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1 == null || Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245 == null) {
						local679 = Static105.aClass60_1281;
					} else {
						local679 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245;
					}
					local159.method847(Static60.method1211(new Class60[] { local679, Static29.aClass60_389 }), 4, 90, 0, -1);
					local159.method847(Static60.method1211(new Class60[] { Static37.method834(Static120.aClass60_1376), Static10.aClass60_138 }), local159.method848(Static60.method1211(new Class60[] { local679, Static8.aClass60_134 })) + 6, 90, 255, -1);
					Static40.method1885(0, 77, 479, 0);
				} else {
					local132 = Static13.method354(3, Static129.anInt3460, 479, 96);
					if (!local132) {
						Static71.aBoolean49 = true;
					}
				}
			} else {
				Static123.aClass3_Sub1_Sub2_Sub2_4.method836(Static127.aClass60_1156, 10, 20, 459, 40, 0, -1, 1, 1, 0);
				Static123.aClass3_Sub1_Sub2_Sub2_4.method842(Static50.aClass60_726, 239, 80, 128, -1);
			}
		}
		if (Static67.aBoolean69 && Static19.anInt3405 == 2) {
			Static48.method1026();
		}
		Static86.method1066();
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(I)V")
	public static void method1052() {
		aClass60_697 = null;
		aClass60_704 = null;
		aClass60_700 = null;
		anIntArray188 = null;
		aClass60_689 = null;
		aClass60_690 = null;
		aClass60_701 = null;
		aClass60_705 = null;
		aClass60_694 = null;
		aClass60_693 = null;
		aClass60_699 = null;
		aClass60Array4 = null;
		aClass60_695 = null;
		aClass60_691 = null;
		aClass60_703 = null;
		aClass60_702 = null;
		aClass60_696 = null;
		aClass60_692 = null;
		aClass60_698 = null;
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
	public static void method1054() {
		try {
			@Pc(11) Graphics local11 = Static2.aCanvas1.getGraphics();
			Static126.aClass16_76.method1664(0, 4, local11);
			Static74.aClass16_58.method1664(0, 357, local11);
			Static63.aClass16_68.method1664(722, 4, local11);
			Static27.aClass16_25.method1664(743, 205, local11);
			Static3.aClass16_5.method1664(0, 0, local11);
			Static55.aClass16_42.method1664(516, 4, local11);
			Static70.aClass16_53.method1664(516, 205, local11);
			Static61.aClass16_46.method1664(496, 357, local11);
			Static12.aClass16_12.method1664(0, 338, local11);
		} catch (@Pc(67) Exception local67) {
			Static2.aCanvas1.repaint();
		}
	}
}
