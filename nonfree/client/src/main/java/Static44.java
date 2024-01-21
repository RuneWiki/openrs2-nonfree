import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "[Lclient!ue;")
	public static Class79[] aClass79Array1;

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_493 = Static119.method1462("Type");

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_489 = aClass65_493;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!pe;")
	public static Class65 aClass65_490 = Static119.method1462("null");

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
	public static int anInt1082 = 128;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "[I")
	public static int[] anIntArray124 = new int[4000];

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	public static int anInt1085 = 1;

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_491 = Static119.method1462("Untersuchen");

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "[I")
	public static int[] anIntArray125 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_492 = Static119.method1462("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)I")
	public static int method755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg2 /= 2;
		}
		if (arg0 > 192) {
			arg2 /= 2;
		}
		if (arg0 > 217) {
			arg2 /= 2;
		}
		if (arg0 > 243) {
			arg2 /= 2;
		}
		return (arg1 / 4 << 10) + (arg2 / 32 << 7) + arg0 / 2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIII)V")
	public static void method757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static124.method1897();
		Static118.method2073(arg1, arg2, Static68.aClass2_Sub1_Sub4_Sub2_43.anInt1370 + arg1, Static68.aClass2_Sub1_Sub4_Sub2_43.anInt1367 + arg2);
		if (Static126.anInt2710 == 2 || Static126.anInt2710 == 5) {
			Static118.method2079(arg1 + 25, arg2 + 5, Static19.anIntArray40, Static69.anIntArray195);
		} else {
			@Pc(46) int local46 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32 + 48;
			@Pc(54) int local54 = 464 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
			@Pc(61) int local61 = Static82.anInt2719 + Static117.anInt2576 & 0x7FF;
			Static114.aClass2_Sub1_Sub4_Sub1_5.method451(arg1 + 25, arg2 + 5, 146, 151, local46, local54, local61, Static54.anInt1338 + 256, Static19.anIntArray40, Static69.anIntArray195);
			@Pc(98) int local98;
			@Pc(111) int local111;
			for (@Pc(82) int local82 = 0; local82 < Static6.anInt185; local82++) {
				local98 = Static121.anIntArray342[local82] * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
				local111 = Static3.anIntArray11[local82] * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
				Static104.method2062(arg2, arg1, local98, local111, Static105.aClass2_Sub1_Sub4_Sub1Array10[local82]);
			}
			@Pc(158) int local158;
			@Pc(169) int local169;
			for (local98 = 0; local98 < 104; local98++) {
				for (local111 = 0; local111 < 104; local111++) {
					@Pc(144) Class13 local144 = Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local98][local111];
					if (local144 != null) {
						local158 = local98 * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
						local169 = local111 * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
						Static104.method2062(arg2, arg1, local158, local169, Static34.aClass2_Sub1_Sub4_Sub1Array4[0]);
					}
				}
			}
			@Pc(244) int local244;
			for (local111 = 0; local111 < Static110.anInt2469; local111++) {
				@Pc(196) Class2_Sub1_Sub1_Sub4_Sub2 local196 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local111]];
				if (local196 != null && local196.method1466()) {
					@Pc(205) Class2_Sub1_Sub12 local205 = local196.aClass2_Sub1_Sub12_1;
					if (local205 != null && local205.anIntArray282 != null) {
						local205 = local205.method1557();
					}
					if (local205 != null && local205.aBoolean84 && local205.aBoolean83) {
						local169 = local196.anInt1948 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
						local244 = local196.anInt1958 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
						Static104.method2062(arg2, arg1, local169, local244, Static34.aClass2_Sub1_Sub4_Sub1Array4[1]);
					}
				}
			}
			@Pc(267) Class2_Sub1_Sub1_Sub4_Sub1 local267;
			for (@Pc(259) int local259 = 0; local259 < Static35.anInt795; local259++) {
				local267 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local259]];
				if (local267 != null && local267.method1466()) {
					local169 = local267.anInt1948 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
					local244 = local267.anInt1958 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
					@Pc(297) boolean local297 = false;
					@Pc(302) long local302 = local267.aClass65_457.method1493();
					for (@Pc(304) int local304 = 0; local304 < Static91.anInt2030; local304++) {
						if (local302 == Static93.aLongArray5[local304] && Static61.anIntArray178[local304] != 0) {
							local297 = true;
							break;
						}
					}
					@Pc(329) boolean local329 = false;
					if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1031 != 0 && local267.anInt1031 != 0 && local267.anInt1031 == Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1031) {
						local329 = true;
					}
					if (local297) {
						Static104.method2062(arg2, arg1, local169, local244, Static34.aClass2_Sub1_Sub4_Sub1Array4[3]);
					} else if (local329) {
						Static104.method2062(arg2, arg1, local169, local244, Static34.aClass2_Sub1_Sub4_Sub1Array4[4]);
					} else {
						Static104.method2062(arg2, arg1, local169, local244, Static34.aClass2_Sub1_Sub4_Sub1Array4[2]);
					}
				}
			}
			if (Static26.anInt631 != 0 && Static10.anInt2951 % 20 < 10) {
				if (Static26.anInt631 == 1 && Static105.anInt2363 >= 0 && Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length > Static105.anInt2363) {
					@Pc(409) Class2_Sub1_Sub1_Sub4_Sub2 local409 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static105.anInt2363];
					if (local409 != null) {
						local169 = local409.anInt1948 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
						local244 = local409.anInt1958 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
						Static91.method1514(arg1, arg2, Static16.aClass2_Sub1_Sub4_Sub1Array9[1], local244, local169);
					}
				}
				if (Static26.anInt631 == 2) {
					local158 = (Static76.anInt1703 - Static34.anInt791) * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
					local169 = (Static26.anInt630 + -Static66.anInt1577) * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
					Static91.method1514(arg1, arg2, Static16.aClass2_Sub1_Sub4_Sub1Array9[1], local169, local158);
				}
				if (Static26.anInt631 == 10 && Static16.anInt2224 >= 0 && Static16.anInt2224 < Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length) {
					local267 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static16.anInt2224];
					if (local267 != null) {
						local169 = local267.anInt1948 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
						local244 = local267.anInt1958 / 32 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
						Static91.method1514(arg1, arg2, Static16.aClass2_Sub1_Sub4_Sub1Array9[1], local244, local169);
					}
				}
			}
			if (Static72.anInt1648 != 0) {
				local158 = Static72.anInt1648 * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 / 32;
				local169 = Static120.anInt2599 * 4 + 2 - Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 / 32;
				Static104.method2062(arg2, arg1, local158, local169, Static16.aClass2_Sub1_Sub4_Sub1Array9[0]);
			}
			Static118.method2081(arg1 + 93 + 4, arg2 + -4 - -82, 3, 3, 16777215);
		}
		if (Static126.anInt2710 < 3) {
			Static22.aClass2_Sub1_Sub4_Sub1_2.method451(arg1, arg2, 33, 33, 25, 25, Static82.anInt2719, 256, anIntArray123, Static2.anIntArray8);
		} else {
			Static118.method2079(arg1, arg2, anIntArray123, Static2.anIntArray8);
		}
		if (Static67.aBooleanArray11[arg0]) {
			Static68.aClass2_Sub1_Sub4_Sub2_43.method996(arg1, arg2);
		}
		Static9.aBooleanArray3[arg0] = true;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
	public static void method758() {
		anIntArray126 = null;
		aClass65_493 = null;
		aClass65_491 = null;
		anIntArray123 = null;
		aClass65_492 = null;
		aClass65_489 = null;
		anIntArray125 = null;
		aClass65_490 = null;
		anIntArray124 = null;
		aShortArrayArray2 = null;
		aClass79Array1 = null;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method760() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
	public static void method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static126.anInt2710 != 0 && Static126.anInt2710 != 3 || Static17.anInt390 != 1) {
			return;
		}
		@Pc(27) int local27 = Static96.anInt2190 - arg1 - 25;
		@Pc(34) int local34 = Static100.anInt2282 - arg0 - 5;
		if (local27 < 0 || local34 < 0 || local27 >= 146 || local34 >= 151) {
			return;
		}
		local34 -= 75;
		local27 -= 73;
		@Pc(55) int local55 = Static82.anInt2719 + Static117.anInt2576 & 0x7FF;
		@Pc(59) int local59 = Class2_Sub1_Sub4_Sub4.anIntArray248[local55];
		@Pc(63) int local63 = Class2_Sub1_Sub4_Sub4.anIntArray251[local55];
		@Pc(71) int local71 = (Static54.anInt1338 + 256) * local59 >> 8;
		@Pc(79) int local79 = local63 * (Static54.anInt1338 + 256) >> 8;
		@Pc(90) int local90 = local71 * local34 - local79 * local27 >> 11;
		@Pc(100) int local100 = local34 * local79 + local27 * local71 >> 11;
		@Pc(107) int local107 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 - local90 >> 7;
		@Pc(114) int local114 = local100 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7;
		@Pc(134) boolean local134 = Static70.method1234(local107, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 1, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local114, true);
		if (!local134) {
			return;
		}
		Static49.aClass2_Sub4_Sub1_1.method926(local27);
		Static49.aClass2_Sub4_Sub1_1.method926(local34);
		Static49.aClass2_Sub4_Sub1_1.method925(Static82.anInt2719);
		Static49.aClass2_Sub4_Sub1_1.method926(57);
		Static49.aClass2_Sub4_Sub1_1.method926(Static117.anInt2576);
		Static49.aClass2_Sub4_Sub1_1.method926(Static54.anInt1338);
		Static49.aClass2_Sub4_Sub1_1.method926(89);
		Static49.aClass2_Sub4_Sub1_1.method925(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948);
		Static49.aClass2_Sub4_Sub1_1.method925(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958);
		Static49.aClass2_Sub4_Sub1_1.method926(Static59.anInt1471);
		Static49.aClass2_Sub4_Sub1_1.method926(63);
		return;
	}
}
