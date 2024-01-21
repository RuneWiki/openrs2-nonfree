import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!pb;")
	public static Class40 aClass40_20;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_6;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt1352 = 0;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_526 = Static34.method846("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_527 = Static34.method846("m");

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt1358 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_528 = aClass55_526;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_529 = Static34.method846("cross");

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_530 = Static34.method846("Name eingeben:");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
	public static synchronized void method875() {
		if (Static63.aClass6_Sub3_1 != null) {
			Static63.aClass6_Sub3_1.method1973(256);
		}
		Static26.method1447(256);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!c;I)V")
	public static synchronized void method876(@OriginalArg(0) Class6_Sub3 arg0) {
		Static63.aClass6_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method878() {
		Static86.anInt2443++;
		Static83.method1594(true);
		Static3.method27(true);
		Static83.method1594(false);
		Static3.method27(false);
		Static89.method1699();
		Static93.method1770();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static97.aBoolean129) {
			local33 = Static64.anInt1910 + Static14.anInt811 & 0x7FF;
			local35 = Static26.anInt2144;
			if (Static54.anInt1685 / 256 > local35) {
				local35 = Static54.anInt1685 / 256;
			}
			if (Static91.aBooleanArray10[4] && local35 < Static94.anIntArray249[4] + 128) {
				local35 = Static94.anIntArray249[4] + 128;
			}
			Static63.method1324(Static97.anInt2828, local35 * 3 + 600, local35, Static112.method2073(Static56.anInt1718, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744) - 50, Static65.anInt1948, local33);
		}
		if (Static97.aBoolean129) {
			local35 = Static93.method1773();
		} else {
			local35 = Static77.method1535();
		}
		local33 = Static94.anInt2650;
		@Pc(100) int local100 = Static7.anInt291;
		@Pc(102) int local102 = Static61.anInt1876;
		@Pc(104) int local104 = Static81.anInt2299;
		@Pc(106) int local106 = Static3.anInt27;
		for (@Pc(108) int local108 = 0; local108 < 5; local108++) {
			if (Static91.aBooleanArray10[local108]) {
				@Pc(150) int local150 = (int) ((double) -Static63.anIntArray184[local108] + Math.random() * (double) (Static63.anIntArray184[local108] * 2 + 1) + Math.sin((double) Static98.anIntArray266[local108] / 100.0D * (double) Static85.anIntArray236[local108]) * (double) Static94.anIntArray249[local108]);
				if (local108 == 2) {
					Static61.anInt1876 += local150;
				}
				if (local108 == 4) {
					Static81.anInt2299 += local150;
					if (Static81.anInt2299 < 128) {
						Static81.anInt2299 = 128;
					}
					if (Static81.anInt2299 > 383) {
						Static81.anInt2299 = 383;
					}
				}
				if (local108 == 3) {
					Static3.anInt27 = Static3.anInt27 + local150 & 0x7FF;
				}
				if (local108 == 0) {
					Static94.anInt2650 += local150;
				}
				if (local108 == 1) {
					Static7.anInt291 += local150;
				}
			}
		}
		Static28.method738();
		Static42.anInt1454 = Static58.anInt1741 - 4;
		Static42.anInt1455 = anInt1358 - 4;
		Static42.aBoolean67 = true;
		Static42.anInt1453 = 0;
		Static53.method1279();
		Static109.aClass34_1.method1053(Static94.anInt2650, Static7.anInt291, Static61.anInt1876, Static81.anInt2299, Static3.anInt27, local35);
		Static109.aClass34_1.method1040();
		Static77.method1528();
		Static5.method1478();
		((Class18) Static30.anInterface4_1).method671(Static45.anInt1477);
		Static85.method1636();
		if (Static7.aBoolean18 && Static22.method659() == 0) {
			Static7.aBoolean18 = false;
		}
		if (Static7.aBoolean18) {
			Static28.method738();
			Static53.method1279();
			Static108.method2013(null, false, Static72.aClass55_861);
		}
		Static66.method1359();
		Static61.anInt1876 = local102;
		Static3.anInt27 = local106;
		Static94.anInt2650 = local33;
		Static81.anInt2299 = local104;
		Static7.anInt291 = local100;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method879() {
		aClass55_530 = null;
		aClass55_526 = null;
		aClass55_527 = null;
		aClass6_Sub2_Sub2_Sub2_6 = null;
		aClass55_529 = null;
		aClass55_528 = null;
		aClass40_20 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([II)V")
	public static synchronized void method880(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static63.aClass6_Sub3_1 != null) {
			Static63.aClass6_Sub3_1.method1972(arg0, 0, local2);
		}
		Static26.method1447(local2);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!me;ZLclient!pb;ILclient!pb;)V")
	public static void method881(@OriginalArg(0) Class6_Sub2_Sub2_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(4) Class40 arg3) {
		Static38.aClass40_21 = arg2;
		Static61.aBoolean88 = arg1;
		Static92.aClass40_33 = arg3;
		Static74.anInt1806 = Static92.aClass40_33.method1224(10);
		Static71.aClass6_Sub2_Sub2_Sub4_3 = arg0;
	}
}
