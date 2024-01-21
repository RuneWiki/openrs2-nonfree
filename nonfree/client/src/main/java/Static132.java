import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_82;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!wc;")
	public static Class81 aClass81_15;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_15;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public static int anInt3135;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public static volatile int anInt3125 = 0;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_962 = Static60.method1113("hel");

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!wd;")
	public static Class82 aClass82_14 = new Class82();

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_963 = Static60.method1113("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!ec;")
	private static Class22 aClass22_964 = Static60.method1113("Loading wordpack )2 ");

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_965 = aClass22_964;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "[I")
	public static int[] anIntArray343 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method2019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class82 local7 = Static19.aClass82ArrayArrayArray1[Static37.anInt895][arg1][arg0];
		if (local7 == null) {
			Static134.aClass77_1.method1930(Static37.anInt895, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub1_Sub3_Sub1 local23 = null;
		@Pc(28) Class4_Sub1_Sub3_Sub1 local28;
		for (local28 = (Class4_Sub1_Sub3_Sub1) local7.method2025(); local28 != null; local28 = (Class4_Sub1_Sub3_Sub1) local7.method2023()) {
			@Pc(36) Class4_Sub1_Sub8 local36 = Static123.method2000(local28.anInt361);
			@Pc(39) int local39 = local36.anInt1437;
			if (local36.anInt1465 == 1) {
				local39 *= local28.anInt363 + 1;
			}
			if (local39 > local21) {
				local23 = local28;
				local21 = local39;
			}
		}
		if (local23 == null) {
			Static134.aClass77_1.method1930(Static37.anInt895, arg1, arg0);
			return;
		}
		local7.method2021(local23);
		@Pc(88) Class4_Sub1_Sub3_Sub1 local88 = null;
		local28 = (Class4_Sub1_Sub3_Sub1) local7.method2025();
		@Pc(97) Class4_Sub1_Sub3_Sub1 local97 = null;
		while (local28 != null) {
			if (local23.anInt361 != local28.anInt361) {
				if (local88 == null) {
					local88 = local28;
				}
				if (local28.anInt361 != local88.anInt361 && local97 == null) {
					local97 = local28;
				}
			}
			local28 = (Class4_Sub1_Sub3_Sub1) local7.method2023();
		}
		@Pc(133) int local133 = arg1 + (arg0 << 7) + 1610612736;
		Static134.aClass77_1.method1969(Static37.anInt895, arg1, arg0, Static69.method1173(Static37.anInt895, arg1 * 128 + 64, arg0 * 128 + 64), local23, local133, local88, local97);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
	public static boolean method2024(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z")
	public static boolean method2026(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2027() {
		@Pc(5) int local5 = Static69.anInt1879 * 128 + 64;
		@Pc(11) int local11 = Static88.anInt2362 * 128 + 64;
		@Pc(24) int local24 = Static69.method1173(Static37.anInt895, local5, local11) - Static119.anInt2901;
		if (Static87.anInt2318 < local5) {
			Static87.anInt2318 += Static66.anInt1851 + Static74.anInt1969 * (local5 - Static87.anInt2318) / 1000;
			if (local5 < Static87.anInt2318) {
				Static87.anInt2318 = local5;
			}
		}
		if (local24 > Static60.anInt1788) {
			Static60.anInt1788 += (local24 - Static60.anInt1788) * Static74.anInt1969 / 1000 + Static66.anInt1851;
			if (Static60.anInt1788 > local24) {
				Static60.anInt1788 = local24;
			}
		}
		if (local24 < Static60.anInt1788) {
			Static60.anInt1788 -= (Static60.anInt1788 - local24) * Static74.anInt1969 / 1000 + Static66.anInt1851;
			if (local24 > Static60.anInt1788) {
				Static60.anInt1788 = local24;
			}
		}
		if (Static42.anInt885 < local11) {
			Static42.anInt885 += Static66.anInt1851 + (local11 - Static42.anInt885) * Static74.anInt1969 / 1000;
			if (local11 < Static42.anInt885) {
				Static42.anInt885 = local11;
			}
		}
		if (local5 < Static87.anInt2318) {
			Static87.anInt2318 -= Static66.anInt1851 + (Static87.anInt2318 - local5) * Static74.anInt1969 / 1000;
			if (Static87.anInt2318 < local5) {
				Static87.anInt2318 = local5;
			}
		}
		local5 = Static72.anInt1923 * 128 + 64;
		if (Static42.anInt885 > local11) {
			Static42.anInt885 -= Static74.anInt1969 * (Static42.anInt885 - local11) / 1000 + Static66.anInt1851;
			if (local11 > Static42.anInt885) {
				Static42.anInt885 = local11;
			}
		}
		local11 = Static32.anInt825 * 128 + 64;
		local24 = Static69.method1173(Static37.anInt895, local5, local11) - Static50.anInt1411;
		@Pc(202) int local202 = local11 - Static42.anInt885;
		@Pc(207) int local207 = local5 - Static87.anInt2318;
		@Pc(212) int local212 = local24 - Static60.anInt1788;
		@Pc(224) int local224 = (int) Math.sqrt((double) (local207 * local207 + local202 * local202));
		@Pc(235) int local235 = (int) (Math.atan2((double) local212, (double) local224) * 325.949D) & 0x7FF;
		@Pc(246) int local246 = (int) (Math.atan2((double) local207, (double) local202) * -325.949D) & 0x7FF;
		@Pc(251) int local251 = local246 - Static96.anInt2480;
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local235 < 128) {
			local235 = 128;
		}
		if (local235 > 383) {
			local235 = 383;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (Static39.anInt957 < local235) {
			Static39.anInt957 += Static78.anInt2051 + Static65.anInt1844 * (local235 - Static39.anInt957) / 1000;
			if (Static39.anInt957 > local235) {
				Static39.anInt957 = local235;
			}
		}
		if (local251 > 0) {
			Static96.anInt2480 += Static65.anInt1844 * local251 / 1000 + Static78.anInt2051;
			Static96.anInt2480 &= 0x7FF;
		}
		if (local251 < 0) {
			Static96.anInt2480 -= Static78.anInt2051 + -local251 * Static65.anInt1844 / 1000;
			Static96.anInt2480 &= 0x7FF;
		}
		if (local235 < Static39.anInt957) {
			Static39.anInt957 -= Static65.anInt1844 * (Static39.anInt957 - local235) / 1000 + Static78.anInt2051;
			if (Static39.anInt957 < local235) {
				Static39.anInt957 = local235;
			}
		}
		@Pc(359) int local359 = local246 - Static96.anInt2480;
		if (local359 > 1024) {
			local359 -= 2048;
		}
		if (local359 < -1024) {
			local359 += 2048;
		}
		if (local359 < 0 && local251 > 0 || local359 > 0 && local251 < 0) {
			Static96.anInt2480 = local246;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	public static void method2031() {
		aClass22_963 = null;
		aClass4_Sub7_15 = null;
		aClass20_Sub1_82 = null;
		aClass81_15 = null;
		aClass22_962 = null;
		aClass22_965 = null;
		anIntArray343 = null;
		aClass82_14 = null;
		aClass22_964 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!f;I)I")
	public static int method2032(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray6 == null || arg1 >= arg0.anIntArrayArray6.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg0.anIntArrayArray6[arg1];
			@Pc(31) byte local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local35++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local33;
				}
				if (local40 == 1) {
					local42 = Static115.anIntArray308[local29[local35++]];
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 2) {
					local42 = Static43.anIntArray130[local29[local35++]];
				}
				if (local40 == 3) {
					local42 = Static14.anIntArray39[local29[local35++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(116) int local116;
				@Pc(127) Class4_Sub7 local127;
				@Pc(132) int local132;
				@Pc(145) int local145;
				if (local40 == 4) {
					local116 = local29[local35++] << 16;
					@Pc(123) int local123 = local116 + local29[local35++];
					local127 = Static106.method1749(local123);
					local132 = local29[local35++];
					if (local132 != -1 && (!Static123.method2000(local132).aBoolean140 || Static123.aBoolean277)) {
						for (local145 = 0; local145 < local127.anIntArray89.length; local145++) {
							if (local127.anIntArray89[local145] == local132 + 1) {
								local42 += local127.anIntArray83[local145];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static23.anIntArray61[local29[local35++]];
				}
				if (local40 == 6) {
					local42 = Class72.anIntArray307[Static43.anIntArray130[local29[local35++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static23.anIntArray61[local29[local35++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1732;
				}
				if (local40 == 9) {
					for (local116 = 0; local116 < 25; local116++) {
						if (Static39.aBooleanArray4[local116]) {
							local42 += Static43.anIntArray130[local116];
						}
					}
				}
				if (local40 == 10) {
					local116 = local29[local35++] << 16;
					local116 += local29[local35++];
					local127 = Static106.method1749(local116);
					local132 = local29[local35++];
					if (local132 != -1 && (!Static123.method2000(local132).aBoolean140 || Static123.aBoolean277)) {
						for (local145 = 0; local145 < local127.anIntArray89.length; local145++) {
							if (local132 + 1 == local127.anIntArray89[local145]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static114.anInt2819;
				}
				if (local40 == 12) {
					local42 = Static3.anInt27;
				}
				if (local40 == 13) {
					local116 = Static23.anIntArray61[local29[local35++]];
					@Pc(328) int local328 = local29[local35++];
					local42 = (0x1 << local328 & local116) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local116 = local29[local35++];
					local42 = Static57.method1093(local116);
				}
				if (local40 == 18) {
					local42 = Static59.anInt1769 + (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7);
				}
				if (local40 == 19) {
					local42 = Static98.anInt2584 + (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7);
				}
				if (local40 == 20) {
					local42 = local29[local35++];
				}
				if (local44 == 0) {
					if (local31 == 0) {
						local33 += local42;
					}
					if (local31 == 1) {
						local33 -= local42;
					}
					if (local31 == 2 && local42 != 0) {
						local33 /= local42;
					}
					if (local31 == 3) {
						local33 *= local42;
					}
					local31 = 0;
				} else {
					local31 = local44;
				}
			}
		} catch (@Pc(437) Exception local437) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public static void method2033() {
		Static2.aClass33_1.method1003();
	}
}
