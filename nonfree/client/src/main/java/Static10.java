import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_184 = Static23.method501("Loading game screen )2 ");

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!mc;")
	public static Class42 aClass42_180 = aClass42_184;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "Lclient!mc;")
	private static Class42 aClass42_181 = Static23.method501("Friends");

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_182 = Static23.method501("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_183 = aClass42_181;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_185 = Static23.method501(" )2> @whi@");

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][105][105];

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_189 = Static23.method501("Hide");

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_186 = aClass42_189;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_188 = Static23.method501("Loading friend list");

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lclient!mc;")
	public static Class42 aClass42_187 = aClass42_188;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "[I")
	public static int[] anIntArray33 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
	public static void method248(@OriginalArg(0) int arg0) {
		Static64.anInt1567 += arg0;
		while (Static7.anInt234 <= Static64.anInt1567) {
			Static64.anInt1567 -= Static7.anInt234;
			Static38.anInt947 -= Static38.anInt947 >> 2;
		}
		Static38.anInt947 -= arg0 * 1000;
		if (Static38.anInt947 < 0) {
			Static38.anInt947 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLclient!ib;)V")
	public static void method251(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub8_Sub1 arg1) {
		if (arg1.anInt2576 < 128 || arg1.anInt2583 < 128 || arg1.anInt2576 >= 13184 || arg1.anInt2583 >= 13184) {
			arg1.anInt2560 = -1;
			arg1.anInt2588 = 0;
			arg1.anInt2549 = 0;
			arg1.anInt2601 = -1;
			arg1.anInt2576 = arg1.anIntArray395[0] * 128 + arg1.anInt2599 * 64;
			arg1.anInt2583 = arg1.anIntArray393[0] * 128 + arg1.anInt2599 * 64;
			arg1.method1761();
		}
		if (arg1 == Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1 && (arg1.anInt2576 < 1536 || arg1.anInt2583 < 1536 || arg1.anInt2576 >= 11776 || arg1.anInt2583 >= 11776)) {
			arg1.anInt2601 = -1;
			arg1.anInt2549 = 0;
			arg1.anInt2560 = -1;
			arg1.anInt2588 = 0;
			arg1.anInt2576 = arg1.anIntArray395[0] * 128 + arg1.anInt2599 * 64;
			arg1.anInt2583 = arg1.anIntArray393[0] * 128 + arg1.anInt2599 * 64;
			arg1.method1761();
		}
		if (Static27.anInt768 < arg1.anInt2549) {
			Static48.method859(arg1);
		} else if (Static27.anInt768 > arg1.anInt2588) {
			Static38.method641(arg1);
		} else {
			Static27.method552(arg1);
		}
		Static12.method271(arg1);
		Static61.method1021(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
	public static int method252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) (arg0 + (arg1 << 16));
		return Static5.aClass1_Sub1_Sub13_1 != null && Static5.aClass1_Sub1_Sub13_1.aLong83 == local14 ? Static90.aClass1_Sub8_5.anInt1692 * 99 / (Static90.aClass1_Sub8_5.aByteArray24.length - Static5.aClass1_Sub1_Sub13_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public static void method253() {
		if (Static43.aClass10_1 == null) {
			return;
		}
		@Pc(8) long local8 = System.currentTimeMillis();
		if (Static24.aLong18 >= local8) {
			return;
		}
		Static43.aClass10_1.method1559(local8);
		@Pc(22) int local22 = (int) (local8 - Static24.aLong18);
		Static24.aLong18 = local8;
		@Pc(33) Class local33 = ga.class;
		synchronized (ga.class) {
			Static38.anInt947 += Static7.anInt234 * local22;
			@Pc(50) int local50 = (Static38.anInt947 - Static7.anInt234 * 2000) / 1000;
			if (local50 > 0) {
				if (Static53.aClass1_Sub12_9 != null) {
					Static53.aClass1_Sub12_9.method1785(local50);
				}
				Static38.anInt947 -= local50 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method256() {
		Static93.anInt2455++;
		Static70.method1259(true);
		Static15.method393(true);
		Static70.method1259(false);
		Static15.method393(false);
		Static87.method1578();
		Static6.method113();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static107.aBoolean147) {
			local33 = Static36.anInt897 + Static68.anInt1662 & 0x7FF;
			local35 = Static62.anInt1467;
			if (Static45.anInt1864 / 256 > local35) {
				local35 = Static45.anInt1864 / 256;
			}
			if (Static33.aBooleanArray7[4] && Static49.anIntArray192[4] + 128 > local35) {
				local35 = Static49.anIntArray192[4] + 128;
			}
			Static74.method1340(local35, Static107.anInt2711, Static104.anInt2684, local33, local35 * 3 + 600, Static104.method1821(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583, Static82.anInt2165, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576) + -50);
		}
		if (Static107.aBoolean147) {
			local35 = Static95.method1689();
		} else {
			local35 = Static29.method567();
		}
		local33 = Static68.anInt1671;
		@Pc(100) int local100 = Static37.anInt917;
		@Pc(102) int local102 = Static8.anInt243;
		@Pc(104) int local104 = Static30.anInt830;
		@Pc(106) int local106 = Static92.anInt2431;
		for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
			if (Static33.aBooleanArray7[local116]) {
				@Pc(158) int local158 = (int) ((double) -Static45.anIntArray262[local116] + (double) (Static45.anIntArray262[local116] * 2 + 1) * Math.random() + Math.sin((double) Static53.anIntArray403[local116] * ((double) Static35.anIntArray119[local116] / 100.0D)) * (double) Static49.anIntArray192[local116]);
				if (local116 == 2) {
					Static37.anInt917 += local158;
				}
				if (local116 == 3) {
					Static92.anInt2431 = local158 + Static92.anInt2431 & 0x7FF;
				}
				if (local116 == 1) {
					Static8.anInt243 += local158;
				}
				if (local116 == 4) {
					Static30.anInt830 += local158;
					if (Static30.anInt830 < 128) {
						Static30.anInt830 = 128;
					}
					if (Static30.anInt830 > 383) {
						Static30.anInt830 = 383;
					}
				}
				if (local116 == 0) {
					Static68.anInt1671 += local158;
				}
			}
		}
		Static6.method120();
		Static76.aBoolean109 = true;
		Static76.anInt1946 = Static38.anInt948 - 4;
		Static76.anInt1947 = Static73.anInt1884 - 4;
		Static76.anInt1950 = 0;
		Static55.method1135();
		Static88.aClass20_1.method449(Static68.anInt1671, Static8.anInt243, Static37.anInt917, Static30.anInt830, Static92.anInt2431, local35);
		Static88.aClass20_1.method464();
		Static43.method772();
		Static73.method1326();
		((Class11) Static41.anInterface4_1).method267(Static59.anInt1992);
		Static3.method100();
		if (Static34.aBoolean43 && Static58.method1007() == 0) {
			Static34.aBoolean43 = false;
		}
		if (Static34.aBoolean43) {
			Static6.method120();
			Static55.method1135();
			Static19.method440(false, null, Static5.aClass42_92);
		}
		Static69.method1233();
		Static68.anInt1671 = local33;
		Static92.anInt2431 = local106;
		Static37.anInt917 = local100;
		Static8.anInt243 = local102;
		Static30.anInt830 = local104;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	public static void method257() {
		anIntArray32 = null;
		aClass42_187 = null;
		aClass42_186 = null;
		anIntArrayArrayArray1 = null;
		aClass42_183 = null;
		aClass42_188 = null;
		aClass42_182 = null;
		anIntArray33 = null;
		aClass42_185 = null;
		aClass42_181 = null;
		aClass42_189 = null;
		aClass42_184 = null;
		aClass42_180 = null;
	}
}
