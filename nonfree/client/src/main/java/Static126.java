import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	public static int anInt2930;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Lclient!eb;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1413 = Static78.method1313("(Z");

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
	public static int[] anIntArray498 = new int[4000];

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public static int anInt2933 = -1;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1414 = Static78.method1313("Loaded textures");

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1415 = aClass25_1414;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1416 = Static78.method1313("::gc");

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1417 = Static78.method1313("Mem:");

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1418 = Static78.method1313("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1419 = Static78.method1313("Handel)4Duell");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	public static void method2034() {
		if (Static52.anInt1267 != 0 || Static87.aClass1_Sub2_Sub14_3 != null) {
			return;
		}
		@Pc(21) int local21 = Static11.anInt277;
		if (Static84.aBoolean83 && Static30.anInt815 >= 516 && Static23.anInt675 >= 160 && Static30.anInt815 <= 765 && Static23.anInt675 <= 205) {
			local21 = 0;
		}
		@Pc(61) int local61;
		@Pc(117) int local117;
		@Pc(123) int local123;
		if (!Static82.aBoolean77) {
			if (local21 == 1 && Static108.anInt2503 > 0) {
				local61 = Static94.anIntArray381[Static108.anInt2503 - 1];
				if (local61 == 18 || local61 == 47 || local61 == 38 || local61 == 40 || local61 == 44 || local61 == 51 || local61 == 41 || local61 == 22 || local61 == 25 || local61 == 42 || local61 == 32 || local61 == 1006) {
					local117 = Static86.anIntArray347[Static108.anInt2503 - 1];
					local123 = Static46.anIntArray239[Static108.anInt2503 - 1];
					@Pc(129) Class1_Sub2_Sub14 local129 = Static46.method968(local123);
					if (Static3.method41(Static77.method1300(local129)) || Static42.method938(Static77.method1300(local129))) {
						Static30.aBoolean28 = false;
						Static115.anInt2667 = local117;
						Static3.anInt52 = 0;
						Static52.anInt1267 = 2;
						if (Static108.anInt2497 == local123 >> 16) {
							Static52.anInt1267 = 1;
						}
						if (local123 >> 16 == Static33.anInt916) {
							Static52.anInt1267 = 3;
						}
						Static10.anInt269 = Static30.anInt815;
						Static92.anInt2072 = local123;
						Static103.anInt2773 = Static23.anInt675;
						return;
					}
				}
			}
			if (local21 == 1 && (Static78.anInt1705 == 1 || Static88.method1445(Static108.anInt2503 - 1)) && Static108.anInt2503 > 2) {
				local21 = 2;
			}
			if (local21 == 1 && Static108.anInt2503 > 0) {
				Static78.method1316(Static108.anInt2503 - 1);
			}
			if (local21 == 2 && Static108.anInt2503 > 0) {
				Static60.method1071();
				return;
			}
			return;
		}
		if (local21 != 1) {
			local117 = Static111.anInt2597;
			local61 = Static10.anInt264;
			if (Static42.anInt1133 == 0) {
				local117 -= 4;
				local61 -= 4;
			}
			if (Static42.anInt1133 == 1) {
				local117 -= 205;
				local61 -= 553;
			}
			if (Static42.anInt1133 == 2) {
				local117 -= 357;
				local61 -= 17;
			}
			if (Static39.anInt1094 - 10 > local61 || Static39.anInt1094 + Static123.anInt2888 + 10 < local61 || local117 < Static81.anInt1798 - 10 || Static101.anInt2344 + Static81.anInt1798 + 10 < local117) {
				if (Static42.anInt1133 == 1) {
					Static90.aBoolean98 = true;
				}
				Static82.aBoolean77 = false;
				if (Static42.anInt1133 == 2) {
					Static110.aBoolean113 = true;
				}
			}
		}
		if (local21 != 1) {
			return;
		}
		local61 = Static39.anInt1094;
		local117 = Static81.anInt1798;
		local123 = Static123.anInt2888;
		@Pc(306) int local306 = Static23.anInt675;
		@Pc(308) int local308 = -1;
		@Pc(310) int local310 = Static30.anInt815;
		if (Static42.anInt1133 == 0) {
			local310 -= 4;
			local306 -= 4;
		}
		if (Static42.anInt1133 == 1) {
			local310 -= 553;
			local306 -= 205;
		}
		if (Static42.anInt1133 == 2) {
			local306 -= 357;
			local310 -= 17;
		}
		for (@Pc(328) int local328 = 0; local328 < Static108.anInt2503; local328++) {
			@Pc(342) int local342 = local117 + (Static108.anInt2503 + -1 - local328) * 15 + 31;
			if (local61 < local310 && local310 < local61 + local123 && local306 > local342 - 13 && local306 < local342 + 3) {
				local308 = local328;
			}
		}
		if (local308 != -1) {
			Static78.method1316(local308);
		}
		if (Static42.anInt1133 == 2) {
			Static110.aBoolean113 = true;
		}
		if (Static42.anInt1133 == 1) {
			Static90.aBoolean98 = true;
		}
		Static82.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
	public static void method2035() {
		aClass25_1419 = null;
		aClass25_1413 = null;
		aClass25_1415 = null;
		anIntArray498 = null;
		aClass25_1418 = null;
		aClass22_1 = null;
		aClass25_1414 = null;
		aClass25_1417 = null;
		aClass25_1416 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!q;)V")
	public static void method2037(@OriginalArg(1) Class1_Sub2_Sub3_Sub4 arg0) {
		if (arg0.anInt2803 == Static60.anInt1366 || arg0.anInt2810 == -1 || arg0.anInt2829 != 0 || arg0.anInt2807 + 1 > Static34.method755(arg0.anInt2810).anIntArray406[arg0.anInt2808]) {
			@Pc(35) int local35 = arg0.anInt2803 - arg0.anInt2822;
			@Pc(45) int local45 = arg0.anInt2800 * 128 + arg0.anInt2834 * 64;
			@Pc(51) int local51 = Static60.anInt1366 - arg0.anInt2822;
			@Pc(61) int local61 = arg0.anInt2816 * 128 + arg0.anInt2834 * 64;
			@Pc(71) int local71 = arg0.anInt2834 * 64 + arg0.anInt2789 * 128;
			@Pc(82) int local82 = arg0.anInt2828 * 128 + arg0.anInt2834 * 64;
			arg0.anInt2832 = ((local35 - local51) * local45 + local51 * local61) / local35;
			arg0.anInt2827 = (local51 * local82 + (local35 - local51) * local71) / local35;
		}
		arg0.anInt2798 = 0;
		if (arg0.anInt2837 == 0) {
			arg0.anInt2809 = 1024;
		}
		if (arg0.anInt2837 == 1) {
			arg0.anInt2809 = 1536;
		}
		if (arg0.anInt2837 == 2) {
			arg0.anInt2809 = 0;
		}
		if (arg0.anInt2837 == 3) {
			arg0.anInt2809 = 512;
		}
		arg0.anInt2819 = arg0.anInt2809;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	public static void method2038(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static60.aClass1_Sub2_Sub2_Sub1_6.anIntArray40;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local41 = (103 - local25) * 512 * 4 + 24628;
			for (local43 = 1; local43 < 103; local43++) {
				if ((Static116.aByteArrayArrayArray7[arg0][local43][local25] & 0x18) == 0) {
					Static118.aClass4_1.method84(local4, local41, arg0, local43, local25);
				}
				if (arg0 < 3 && (Static116.aByteArrayArrayArray7[arg0 + 1][local43][local25] & 0x8) != 0) {
					Static118.aClass4_1.method84(local4, local41, arg0 + 1, local43, local25);
				}
				local41 += 4;
			}
		}
		Static60.aClass1_Sub2_Sub2_Sub1_6.method198();
		local41 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
		local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
			for (local155 = 1; local155 < 103; local155++) {
				if ((Static116.aByteArrayArrayArray7[arg0][local155][local151] & 0x18) == 0) {
					Static46.method967(local41, local151, local155, local43, arg0);
				}
				if (arg0 < 3 && (Static116.aByteArrayArrayArray7[arg0 + 1][local155][local151] & 0x8) != 0) {
					Static46.method967(local41, local151, local155, local43, arg0 + 1);
				}
			}
		}
		Static24.anInt692 = 0;
		for (local155 = 0; local155 < 104; local155++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static118.aClass4_1.method90(Static21.anInt596, local155, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(250) int local250 = Static78.method1315(local232).anInt843;
					if (local250 >= 0) {
						@Pc(257) int local257 = local155;
						@Pc(259) int local259 = local224;
						if (local250 != 22 && local250 != 29 && local250 != 34 && local250 != 36 && local250 != 46 && local250 != 47 && local250 != 48) {
							@Pc(289) int[][] local289 = Static102.aClass62Array1[Static21.anInt596].anIntArrayArray22;
							for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
								@Pc(298) int local298 = (int) (Math.random() * 4.0D);
								if (local298 == 0 && local257 > 0 && local155 - 3 < local257 && (local289[local257 - 1][local259] & 0x12C0108) == 0) {
									local257--;
								}
								if (local298 == 1 && local257 < 103 && local155 + 3 > local257 && (local289[local257 + 1][local259] & 0x12C0180) == 0) {
									local257++;
								}
								if (local298 == 2 && local259 > 0 && local224 - 3 < local259 && (local289[local257][local259 - 1] & 0x12C0102) == 0) {
									local259--;
								}
								if (local298 == 3 && local259 < 103 && local224 + 3 > local259 && (local289[local257][local259 + 1] & 0x12C0120) == 0) {
									local259++;
								}
							}
						}
						Static9.aClass1_Sub2_Sub2_Sub1Array1[Static24.anInt692] = Static21.aClass1_Sub2_Sub2_Sub1Array2[local250];
						Static9.anIntArray45[Static24.anInt692] = local257;
						Static105.anIntArray414[Static24.anInt692] = local259;
						Static24.anInt692++;
					}
				}
			}
		}
	}
}
