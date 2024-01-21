import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!oa;")
	public static Class9 aClass9_19;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_12;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_5;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt2221;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lclient!w;")
	public static Class61[] aClass61Array2 = new Class61[5];

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt2217 = 0;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!me;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_770 = Static56.method1206("@bla@ from: @red@");

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_771 = Static56.method1206("");

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt2220 = 0;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_772 = Static56.method1206("@gr3@");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1377() {
		if (Static89.aClass35_4 != null) {
			Static89.aClass35_4.method1349();
		}
		Static89.aClass35_4 = null;
		Static51.method1131();
		Static99.aClass64_1.method1782();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static77.aClass60Array1[local23].method1722();
		}
		System.gc();
		Static79.method1445();
		Static74.anInt2232 = -1;
		Static20.anInt1975 = 0;
		Static75.method1404(10);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
	public static void method1378() {
		aClass61Array2 = null;
		aClass2_Sub1_Sub3_Sub1_12 = null;
		aClass31_772 = null;
		aClass31_770 = null;
		aClass9_19 = null;
		aClass2_Sub1_Sub3_Sub2_6 = null;
		aClass31_771 = null;
		aClass2_Sub1_Sub3_Sub3_5 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1379() {
		Static55.method1184();
		if (Static17.anInt796 == 1) {
			Static8.aClass2_Sub1_Sub3_Sub2Array1[Static12.anInt526 / 100].method469(Static70.anInt2224 - 8 - 4, Static44.anInt1596 + -8 + -4);
		}
		if (Static17.anInt796 == 2) {
			Static8.aClass2_Sub1_Sub3_Sub2Array1[Static12.anInt526 / 100 + 4].method469(Static70.anInt2224 - 4 - 8, Static44.anInt1596 + -8 + -4);
		}
		if (Static45.anInt1603 != -1) {
			Static18.method533(Static45.anInt1603);
			Static4.method91(4, 0, -1, 512, 0, Static45.anInt1603, 334, 0);
		}
		if (Static42.anInt1586 != -1) {
			Static18.method533(Static42.anInt1586);
			Static4.method91(0, 0, -1, 512, 0, Static42.anInt1586, 334, 0);
		}
		Static25.method754();
		if (!Static105.aBoolean154) {
			Static48.method1113();
			Static95.method1599();
		} else if (Static64.anInt601 == 0) {
			Static17.method530();
		}
		if (Static27.anInt1161 == 1) {
			Static39.aClass2_Sub1_Sub3_Sub2_5.method469(472, 296);
		}
		@Pc(190) int local190;
		if (Static13.aBoolean39) {
			@Pc(120) byte local120 = 20;
			@Pc(124) int local124 = 16776960;
			if (Static39.anInt1459 < 30 && Static10.aBoolean28) {
				local124 = 16711680;
			}
			if (Static39.anInt1459 < 20 && !Static10.aBoolean28) {
				local124 = 16711680;
			}
			Static98.aClass2_Sub1_Sub3_Sub3_4.method952(Static37.method974(new Class31[] { Static11.aClass31_163, Static89.method1499(Static39.anInt1459) }), 20, local124);
			@Pc(163) Runtime local163 = Runtime.getRuntime();
			local124 = 16776960;
			@Pc(175) int local175 = (int) ((local163.totalMemory() - local163.freeMemory()) / 1024L);
			if (local175 > 32768 && Static10.aBoolean28) {
				local124 = 16711680;
			}
			if (local175 > 65536 && !Static10.aBoolean28) {
				local124 = 16711680;
			}
			local190 = local120 + 15;
			Static98.aClass2_Sub1_Sub3_Sub3_4.method952(Static37.method974(new Class31[] { Static88.aClass31_821, Static89.method1499(local175), Static4.aClass31_58 }), 35, local124);
			local190 += 15;
			if (Static75.aBoolean117) {
				Static98.aClass2_Sub1_Sub3_Sub3_4.method952(Static86.aClass31_809, 50, 16711680);
				local190 += 15;
				Static75.aBoolean117 = false;
			}
			if (Static85.aBoolean130) {
				Static98.aClass2_Sub1_Sub3_Sub3_4.method952(Static101.aClass31_944, local190, 16711680);
				local190 += 15;
				Static85.aBoolean130 = false;
			}
			if (Static89.aBoolean122) {
				Static98.aClass2_Sub1_Sub3_Sub3_4.method952(Static66.aClass31_762, local190, 16711680);
				local190 += 15;
				Static89.aBoolean122 = false;
			}
		}
		if (Static19.anInt851 == 0) {
			return;
		}
		@Pc(256) int local256 = Static19.anInt851 / 50;
		local190 = local256 / 60;
		@Pc(264) int local264 = local256 % 60;
		if (local264 < 10) {
			Static98.aClass2_Sub1_Sub3_Sub3_4.method954(Static37.method974(new Class31[] { Static27.aClass31_382, Static89.method1499(local190), Static83.aClass31_805, Static89.method1499(local264) }), 4, 329, 16776960);
		} else {
			Static98.aClass2_Sub1_Sub3_Sub3_4.method954(Static37.method974(new Class31[] { Static27.aClass31_382, Static89.method1499(local190), Static7.aClass31_95, Static89.method1499(local264) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method1380() {
		if (Static3.aClass6_1 == null) {
			return;
		}
		@Pc(8) long local8 = System.currentTimeMillis();
		if (local8 <= Static55.aLong51) {
			return;
		}
		Static3.aClass6_1.method1562(local8);
		@Pc(31) int local31 = (int) (local8 - Static55.aLong51);
		Static55.aLong51 = local8;
		@Pc(42) Class local42 = ra.class;
		synchronized (ra.class) {
			Static21.anInt996 += local31 * Static27.anInt1162;
			@Pc(59) int local59 = (Static21.anInt996 - Static27.anInt1162 * 2000) / 1000;
			if (local59 > 0) {
				if (Static62.aClass2_Sub8_1 != null) {
					Static62.aClass2_Sub8_1.method1671(local59);
				}
				Static21.anInt996 -= local59 * 1000;
			}
		}
	}
}
