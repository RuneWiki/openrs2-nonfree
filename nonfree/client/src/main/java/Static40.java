import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!ui;")
	public static Class2_Sub22 aClass2_Sub22_1;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_293 = Static158.method3034("white:");

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_289 = aClass60_293;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_290 = Static158.method3034("<col=ffffff>");

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_291 = Static158.method3034("rect_debug=");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_292 = Static158.method3034(" ");

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static int anInt1296 = 0;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_294 = Static158.method3034("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Lclient!ob;")
	public static Class60 aClass60_295 = aClass60_293;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "[S")
	public static final short[] aShortArray25 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method903() {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(30) int local30;
		if (Static62.anInt1922 == 232) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method201();
			local24 = (local16 >> 4 & 0x7) + Static103.anInt2977;
			local30 = (local16 & 0x7) + Static134.anInt3571;
			local34 = Static139.aClass2_Sub3_Sub1_32.method229();
			local38 = local34 >> 2;
			local42 = local34 & 0x3;
			local46 = Static94.anIntArray322[local38];
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
				Static175.method3274(local38, local24, -1, local42, local46, 0, local30, Static62.anInt1923, -1);
			}
			return;
		}
		@Pc(116) int local116;
		if (Static62.anInt1922 == 247) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method194();
			local30 = Static134.anInt3571 + (local16 & 0x7);
			local24 = (local16 >> 4 & 0x7) + Static103.anInt2977;
			local34 = Static139.aClass2_Sub3_Sub1_32.method242();
			local38 = Static139.aClass2_Sub3_Sub1_32.method229();
			local46 = local38 & 0x3;
			local42 = local38 >> 2;
			local116 = Static94.anIntArray322[local42];
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
				Static175.method3274(local42, local24, -1, local46, local116, 0, local30, Static62.anInt1923, local34);
			}
			return;
		}
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(205) int local205;
		@Pc(209) int local209;
		if (Static62.anInt1922 == 149) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			local30 = (local16 & 0x7) + Static134.anInt3571;
			local24 = Static103.anInt2977 + (local16 >> 4 & 0x7);
			local34 = Static139.aClass2_Sub3_Sub1_32.method227() + local24;
			local38 = Static139.aClass2_Sub3_Sub1_32.method227() + local30;
			local42 = Static139.aClass2_Sub3_Sub1_32.method219();
			local46 = Static139.aClass2_Sub3_Sub1_32.method234();
			local116 = Static139.aClass2_Sub3_Sub1_32.method218() * 4;
			local205 = Static139.aClass2_Sub3_Sub1_32.method218() * 4;
			local209 = Static139.aClass2_Sub3_Sub1_32.method234();
			local213 = Static139.aClass2_Sub3_Sub1_32.method234();
			local217 = Static139.aClass2_Sub3_Sub1_32.method218();
			local221 = Static139.aClass2_Sub3_Sub1_32.method218();
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local46 != 65535) {
				local24 = local24 * 128 + 64;
				local34 = local34 * 128 + 64;
				local30 = local30 * 128 + 64;
				local38 = local38 * 128 + 64;
				@Pc(306) Class2_Sub1_Sub1_Sub2 local306 = new Class2_Sub1_Sub1_Sub2(local46, Static62.anInt1923, local24, local30, Static182.method3393(Static62.anInt1923, local24, local30) - local116, local209 + Static20.anInt580, local213 + Static20.anInt580, local217, local221, local42, local205);
				local306.method820(local209 + Static20.anInt580, local38, Static182.method3393(Static62.anInt1923, local34, local38) - local205, local34);
				Static30.aClass67_1.method2843(local306);
			}
			return;
		}
		if (Static62.anInt1922 == 142) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method242();
			local24 = Static139.aClass2_Sub3_Sub1_32.method192();
			@Pc(346) byte local346 = Static139.aClass2_Sub3_Sub1_32.method227();
			local34 = Static139.aClass2_Sub3_Sub1_32.method242();
			local38 = Static139.aClass2_Sub3_Sub1_32.method218();
			local42 = (local38 >> 4 & 0x7) + Static103.anInt2977;
			local46 = (local38 & 0x7) + Static134.anInt3571;
			@Pc(372) byte local372 = Static139.aClass2_Sub3_Sub1_32.method227();
			@Pc(376) byte local376 = Static139.aClass2_Sub3_Sub1_32.method241();
			@Pc(380) byte local380 = Static139.aClass2_Sub3_Sub1_32.method198();
			local213 = Static139.aClass2_Sub3_Sub1_32.method229();
			local221 = local213 & 0x3;
			local217 = local213 >> 2;
			@Pc(396) int local396 = Static94.anIntArray322[local217];
			@Pc(400) int local400 = Static139.aClass2_Sub3_Sub1_32.method234();
			@Pc(405) Class2_Sub1_Sub1_Sub3_Sub1 local405;
			if (local400 == Static89.anInt2601) {
				local405 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local405 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local400];
			}
			if (local405 != null) {
				@Pc(417) Class2_Sub1_Sub9 local417 = Static158.method3037(local24);
				@Pc(426) int local426;
				@Pc(429) int local429;
				if (local221 == 1 || local221 == 3) {
					local426 = local417.anInt1683;
					local429 = local417.anInt1688;
				} else {
					local426 = local417.anInt1688;
					local429 = local417.anInt1683;
				}
				@Pc(443) int local443 = (local426 >> 1) + local42;
				@Pc(450) int local450 = local46 + (local429 >> 1);
				@Pc(458) int local458 = (local426 + 1 >> 1) + local42;
				@Pc(466) int local466 = local46 + (local429 + 1 >> 1);
				@Pc(470) int[][] local470 = Static32.anIntArrayArrayArray4[Static62.anInt1923];
				@Pc(478) int local478 = (local426 << 6) + (local42 << 7);
				@Pc(505) int local505 = local470[local443][local450] + local470[local458][local450] + local470[local443][local466] + local470[local458][local466] >> 2;
				@Pc(513) int local513 = (local46 << 7) + (local429 << 6);
				@Pc(524) Class2_Sub1_Sub16 local524 = local417.method1261(local478, local217, false, local221, local505, local513, local470);
				if (local524 != null) {
					Static175.method3274(0, local42, local34 + 1, 0, local396, local16 + 1, local46, Static62.anInt1923, -1);
					local405.anInt1273 = local505;
					local405.anInt1275 = local16 + Static20.anInt580;
					local405.aClass2_Sub1_Sub1_Sub4_1 = (Class2_Sub1_Sub1_Sub4) local524.aClass2_Sub1_Sub1_8;
					local405.anInt1281 = local42 * 128 + local426 * 64;
					local405.anInt1282 = local429 * 64 + local46 * 128;
					@Pc(582) byte local582;
					if (local380 < local346) {
						local582 = local346;
						local346 = local380;
						local380 = local582;
					}
					if (local372 > local376) {
						local582 = local372;
						local372 = local376;
						local376 = local582;
					}
					local405.anInt1286 = local46 + local372;
					local405.anInt1269 = local34 + Static20.anInt580;
					local405.anInt1288 = local346 + local42;
					local405.anInt1277 = local380 + local42;
					local405.anInt1280 = local46 + local376;
				}
			}
		}
		if (Static62.anInt1922 == 221) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			local30 = (local16 & 0x7) + Static134.anInt3571;
			local24 = Static103.anInt2977 + (local16 >> 4 & 0x7);
			local34 = Static139.aClass2_Sub3_Sub1_32.method234();
			if (local34 == 65535) {
				local34 = -1;
			}
			local38 = Static139.aClass2_Sub3_Sub1_32.method218();
			local116 = Static139.aClass2_Sub3_Sub1_32.method218();
			local42 = local38 >> 4 & 0xF;
			local46 = local38 & 0x7;
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
				local205 = local42 + 1;
				if (local24 - local205 <= Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0] && local205 + local24 >= Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0] && Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0] >= local30 - local205 && Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0] <= local205 + local30 && Static148.anInt3846 != 0 && local46 > 0 && anInt1296 < 50 && local34 != -1) {
					Static161.anIntArray443[anInt1296] = local34;
					Static81.anIntArray268[anInt1296] = local46;
					Static49.anIntArray144[anInt1296] = local116;
					Static94.aClass23Array1[anInt1296] = null;
					Static96.anIntArray355[anInt1296] = local42 + (local24 << 16) + (local30 << 8);
					anInt1296++;
				}
			}
		}
		@Pc(832) Class2_Sub1_Sub1_Sub7 local832;
		if (Static62.anInt1922 == 52) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method209();
			local24 = Static139.aClass2_Sub3_Sub1_32.method242();
			local30 = Static139.aClass2_Sub3_Sub1_32.method194();
			local34 = Static103.anInt2977 + (local30 >> 4 & 0x7);
			local38 = Static134.anInt3571 + (local30 & 0x7);
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
				local832 = new Class2_Sub1_Sub1_Sub7();
				local832.anInt4187 = local16;
				local832.anInt4182 = local24;
				if (Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38] == null) {
					Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38] = new Class67();
				}
				Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38].method2843(local832);
				Static171.method3180(local38, local34);
			}
		} else if (Static62.anInt1922 == 85) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method209();
			local24 = Static139.aClass2_Sub3_Sub1_32.method192();
			local30 = Static139.aClass2_Sub3_Sub1_32.method218();
			local34 = (local30 >> 4 & 0x7) + Static103.anInt2977;
			local38 = (local30 & 0x7) + Static134.anInt3571;
			local42 = Static139.aClass2_Sub3_Sub1_32.method192();
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && Static89.anInt2601 != local24) {
				@Pc(932) Class2_Sub1_Sub1_Sub7 local932 = new Class2_Sub1_Sub1_Sub7();
				local932.anInt4182 = local16;
				local932.anInt4187 = local42;
				if (Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38] == null) {
					Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38] = new Class67();
				}
				Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local34][local38].method2843(local932);
				Static171.method3180(local38, local34);
			}
		} else if (Static62.anInt1922 == 172) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method209();
			local24 = Static139.aClass2_Sub3_Sub1_32.method201();
			local30 = Static103.anInt2977 + (local24 >> 4 & 0x7);
			local34 = (local24 & 0x7) + Static134.anInt3571;
			if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
				@Pc(1019) Class67 local1019 = Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local30][local34];
				if (local1019 != null) {
					for (local832 = (Class2_Sub1_Sub1_Sub7) local1019.method2848(); local832 != null; local832 = (Class2_Sub1_Sub1_Sub7) local1019.method2851()) {
						if (local832.anInt4182 == (local16 & 0x7FFF)) {
							local832.method3556();
							break;
						}
					}
					if (local1019.method2848() == null) {
						Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local30][local34] = null;
					}
					Static171.method3180(local34, local30);
				}
			}
		} else if (Static62.anInt1922 == 183) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			local30 = Static134.anInt3571 + (local16 & 0x7);
			local24 = Static103.anInt2977 + (local16 >> 4 & 0x7);
			local34 = Static139.aClass2_Sub3_Sub1_32.method234();
			local38 = Static139.aClass2_Sub3_Sub1_32.method218();
			local42 = Static139.aClass2_Sub3_Sub1_32.method234();
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
				local24 = local24 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(1144) Class2_Sub1_Sub1_Sub6 local1144 = new Class2_Sub1_Sub1_Sub6(local34, Static62.anInt1923, local24, local30, Static182.method3393(Static62.anInt1923, local24, local30) - local38, local42, Static20.anInt580);
				Static122.aClass67_7.method2843(local1144);
			}
		} else if (Static62.anInt1922 == 48) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method229();
			local30 = local16 & 0x3;
			local24 = local16 >> 2;
			local34 = Static94.anIntArray322[local24];
			local38 = Static139.aClass2_Sub3_Sub1_32.method218();
			local42 = Static103.anInt2977 + (local38 >> 4 & 0x7);
			local46 = (local38 & 0x7) + Static134.anInt3571;
			local116 = Static139.aClass2_Sub3_Sub1_32.method209();
			if (local116 == 65535) {
				local116 = -1;
			}
			if (local42 >= 0 && local46 >= 0 && local42 < 103 && local46 < 103) {
				if (local34 == 0) {
					@Pc(1233) Class74 local1233 = Static183.method3422(Static62.anInt1923, local42, local46);
					if (local1233 != null) {
						local209 = (int) (local1233.aLong127 >>> 32) & Integer.MAX_VALUE;
						if (local24 == 2) {
							local1233.aClass2_Sub1_Sub1_10 = new Class2_Sub1_Sub1_Sub5(local209, 2, local30 + 4, Static62.anInt1923, local42, local46, local116, false, local1233.aClass2_Sub1_Sub1_10);
							local1233.aClass2_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub5(local209, 2, local30 + 1 & 0x3, Static62.anInt1923, local42, local46, local116, false, local1233.aClass2_Sub1_Sub1_9);
						} else {
							local1233.aClass2_Sub1_Sub1_10 = new Class2_Sub1_Sub1_Sub5(local209, local24, local30, Static62.anInt1923, local42, local46, local116, false, local1233.aClass2_Sub1_Sub1_10);
						}
					}
				}
				if (local34 == 1) {
					@Pc(1310) Class26 local1310 = Static167.method3114(Static62.anInt1923, local42, local46);
					if (local1310 != null) {
						local209 = Integer.MAX_VALUE & (int) (local1310.aLong49 >>> 32);
						if (local24 == 4 || local24 == 5) {
							local1310.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub5(local209, 4, local30, Static62.anInt1923, local42, local46, local116, false, local1310.aClass2_Sub1_Sub1_5);
						} else if (local24 == 6) {
							local1310.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub5(local209, 4, local30 + 4, Static62.anInt1923, local42, local46, local116, false, local1310.aClass2_Sub1_Sub1_5);
						} else if (local24 == 7) {
							local1310.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub5(local209, 4, (local30 + 2 & 0x3) + 4, Static62.anInt1923, local42, local46, local116, false, local1310.aClass2_Sub1_Sub1_5);
						} else if (local24 == 8) {
							local1310.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub5(local209, 4, local30 + 4, Static62.anInt1923, local42, local46, local116, false, local1310.aClass2_Sub1_Sub1_5);
							local1310.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub5(local209, 4, (local30 + 2 & 0x3) + 4, Static62.anInt1923, local42, local46, local116, false, local1310.aClass2_Sub1_Sub1_6);
						}
					}
				}
				if (local34 == 2) {
					@Pc(1450) Class6 local1450 = Static125.method2639(Static62.anInt1923, local42, local46);
					if (local24 == 11) {
						local24 = 10;
					}
					if (local1450 != null) {
						local1450.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub5((int) (local1450.aLong8 >>> 32) & Integer.MAX_VALUE, local24, local30, Static62.anInt1923, local42, local46, local116, false, local1450.aClass2_Sub1_Sub1_1);
					}
				}
				if (local34 == 3) {
					@Pc(1486) Class52 local1486 = Static187.method3555(Static62.anInt1923, local42, local46);
					if (local1486 != null) {
						local1486.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub5(Integer.MAX_VALUE & (int) (local1486.aLong105 >>> 32), 22, local30, Static62.anInt1923, local42, local46, local116, false, local1486.aClass2_Sub1_Sub1_7);
					}
				}
			}
		} else if (Static62.anInt1922 == 240) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			local24 = (local16 >> 4 & 0x7) + Static103.anInt2977;
			local30 = Static134.anInt3571 + (local16 & 0x7);
			local34 = Static139.aClass2_Sub3_Sub1_32.method234();
			local38 = Static139.aClass2_Sub3_Sub1_32.method234();
			local42 = Static139.aClass2_Sub3_Sub1_32.method234();
			if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104) {
				@Pc(1573) Class67 local1573 = Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local24][local30];
				if (local1573 != null) {
					for (@Pc(1580) Class2_Sub1_Sub1_Sub7 local1580 = (Class2_Sub1_Sub1_Sub7) local1573.method2848(); local1580 != null; local1580 = (Class2_Sub1_Sub1_Sub7) local1573.method2851()) {
						if ((local34 & 0x7FFF) == local1580.anInt4182 && local38 == local1580.anInt4187) {
							local1580.anInt4187 = local42;
							break;
						}
					}
					Static171.method3180(local30, local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
	public static boolean method905(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method906() {
		@Pc(13) Object local13 = Static111.anObject4;
		synchronized (Static111.anObject4) {
			if (Static141.anInt3696 != 0) {
				Static141.anInt3696 = 1;
				try {
					Static111.anObject4.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIIIIILclient!ra;)V")
	public static void method907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class72 arg5) {
		@Pc(17) int local17 = Math.min(arg5.anInt3878 / 2, arg5.anInt3871 / 2);
		@Pc(25) int local25 = arg4 * arg4 + arg2 * arg2;
		if (local17 * local17 >= local25 || local25 >= 90000) {
			Static4.method70(Static185.aClass2_Sub1_Sub7_Sub4Array12[arg1], arg0, arg4, arg5, arg3, arg2);
			return;
		}
		local17 -= 10;
		@Pc(44) int local44 = Static88.anInt2591 + Static188.anInt4484 & 0x7FF;
		@Pc(48) int local48 = Class2_Sub1_Sub7_Sub1.anIntArray129[local44];
		@Pc(52) int local52 = Class2_Sub1_Sub7_Sub1.anIntArray133[local44];
		@Pc(60) int local60 = local48 * 256 / (Static105.anInt3614 + 256);
		@Pc(68) int local68 = local52 * 256 / (Static105.anInt3614 + 256);
		@Pc(79) int local79 = arg4 * local68 + arg2 * local60 >> 16;
		@Pc(90) int local90 = arg4 * local60 - arg2 * local68 >> 16;
		@Pc(96) double local96 = Math.atan2((double) local79, (double) local90);
		@Pc(103) int local103 = (int) (Math.sin(local96) * (double) local17);
		@Pc(110) int local110 = (int) (Math.cos(local96) * (double) local17);
		Static182.aClass2_Sub1_Sub7_Sub4Array11[arg1].method2135(arg0 + arg5.anInt3878 / 2 + local103 - 10, arg3 - (-(arg5.anInt3871 / 2) + (local110 - -10)), local96);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
	public static int method908(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!ca;Lclient!qe;Z)V")
	public static void method909(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) Class69 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class67 local5 = Static99.aClass67_5;
		synchronized (Static99.aClass67_5) {
			for (@Pc(20) Class2_Sub18 local20 = (Class2_Sub18) Static99.aClass67_5.method2848(); local20 != null; local20 = (Class2_Sub18) Static99.aClass67_5.method2851()) {
				if (local20.aLong151 == (long) arg0 && local20.aClass69_4 == arg2 && local20.anInt3789 == 0) {
					local3 = local20.aByteArray43;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(75) byte[] local75 = arg2.method2946(arg0);
			arg1.method541(arg0, local75, true, arg2);
		} else {
			arg1.method541(arg0, local3, true, arg2);
		}
	}
}
