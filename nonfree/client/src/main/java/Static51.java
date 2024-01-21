import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!cb;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[[Lclient!va;")
	public static Class2_Sub1_Sub17[][] aClass2_Sub1_Sub17ArrayArray1;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public static int anInt1545;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_553 = Static2.method59("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_554 = Static2.method59("(U2");

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!wd;")
	private static Class80 aClass80_555 = Static2.method59("Examine");

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_556 = Static2.method59("blinken2:");

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public static int anInt1544 = 0;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_557 = Static2.method59("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_558 = aClass80_555;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Z")
	public static boolean method892(@OriginalArg(1) int arg0) {
		if (!Static122.method1969(arg0)) {
			return false;
		}
		@Pc(15) boolean local15 = false;
		@Pc(19) Class2_Sub1_Sub17[] local19 = aClass2_Sub1_Sub17ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local19.length; local26++) {
			@Pc(32) Class2_Sub1_Sub17 local32 = local19[local26];
			if (local32 != null && local32.anInt3038 == 6) {
				@Pc(57) int local57;
				if (local32.anInt3013 != -1 || local32.anInt3060 != -1) {
					@Pc(52) boolean local52 = Static100.method1602(local32);
					if (local52) {
						local57 = local32.anInt3060;
					} else {
						local57 = local32.anInt3013;
					}
					if (local57 != -1) {
						@Pc(69) Class2_Sub1_Sub8 local69 = Static93.method1443(local57);
						local32.anInt3026 += Static106.anInt2840;
						label52: while (true) {
							do {
								do {
									if (local69.anIntArray174[local32.anInt3068] >= local32.anInt3026) {
										break label52;
									}
									local15 = true;
									local32.anInt3026 -= local69.anIntArray174[local32.anInt3068];
									local32.anInt3068++;
								} while (local69.anIntArray176.length > local32.anInt3068);
								local32.anInt3068 -= local69.anInt1352;
							} while (local32.anInt3068 >= 0 && local32.anInt3068 < local69.anIntArray176.length);
							local32.anInt3068 = 0;
						}
					}
				}
				if (local32.anInt3011 != 0 && !local32.aBoolean232) {
					local15 = true;
					@Pc(159) int local159 = local32.anInt3011 >> 16;
					@Pc(163) int local163 = local159 * Static106.anInt2840;
					local32.anInt3046 = local163 + local32.anInt3046 & 0x7FF;
					local57 = local32.anInt3011 << 16 >> 16;
					local57 *= Static106.anInt2840;
					local32.anInt3062 = local32.anInt3062 + local57 & 0x7FF;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method893() {
		if (Static82.aBoolean236) {
			Static38.method657();
			Static82.aBoolean236 = false;
			Static124.method1980();
			Static57.aBoolean119 = true;
			Static15.aBoolean35 = true;
			Static70.aBoolean131 = true;
			Static37.aBoolean77 = true;
		}
		Static44.method734();
		if (Static122.aBoolean241 && Static11.anInt315 == 1) {
			Static70.aBoolean131 = true;
		}
		@Pc(39) boolean local39;
		if (Static97.anInt2559 != -1) {
			local39 = method892(Static97.anInt2559);
			if (local39) {
				Static70.aBoolean131 = true;
			}
		}
		if (Static86.anInt2114 == 2) {
			Static70.aBoolean131 = true;
		}
		if (Static95.anInt2434 == 2) {
			Static70.aBoolean131 = true;
		}
		if (Static70.aBoolean131) {
			Static70.aBoolean131 = false;
			Static31.method580();
		}
		@Pc(108) int local108;
		if (Static57.anInt1737 == -1) {
			Static119.aClass2_Sub1_Sub17_4.anInt3015 = Static123.anInt3114 - Static84.anInt2049 - 77;
			if (Static93.anInt2398 > 17 && Static93.anInt2398 < 560 && Static95.anInt2430 > 332) {
				Static74.method1167(0, -1, Static93.anInt2398 - 17, 77, Static95.anInt2430 - 357, Static119.aClass2_Sub1_Sub17_4, 463, Static123.anInt3114);
			}
			local108 = Static123.anInt3114 - Static119.aClass2_Sub1_Sub17_4.anInt3015 - 77;
			if (local108 < 0) {
				local108 = 0;
			}
			if (local108 > Static123.anInt3114 - 77) {
				local108 = Static123.anInt3114 - 77;
			}
			if (Static84.anInt2049 != local108) {
				Static84.anInt2049 = local108;
				Static37.aBoolean77 = true;
			}
		}
		if (Static57.anInt1737 == -1 && Static42.anInt1258 == 3) {
			Static119.aClass2_Sub1_Sub17_4.anInt3015 = Static98.anInt2618;
			local108 = Static19.anInt800 * 14 + 7;
			if (Static93.anInt2398 > 17 && Static93.anInt2398 < 560 && Static95.anInt2430 > 332) {
				Static74.method1167(0, -1, Static93.anInt2398 - 17, 77, Static95.anInt2430 - 357, Static119.aClass2_Sub1_Sub17_4, 463, local108);
			}
			@Pc(174) int local174 = Static119.aClass2_Sub1_Sub17_4.anInt3015;
			if (local174 < 0) {
				local174 = 0;
			}
			if (local174 > local108 - 77) {
				local174 = local108 - 77;
			}
			if (local174 != Static98.anInt2618) {
				Static37.aBoolean77 = true;
				Static98.anInt2618 = local174;
			}
		}
		if (Static57.anInt1737 != -1) {
			local39 = method892(Static57.anInt1737);
			if (local39) {
				Static37.aBoolean77 = true;
			}
		}
		if (Static86.anInt2114 == 3) {
			Static37.aBoolean77 = true;
		}
		if (Static95.anInt2434 == 3) {
			Static37.aBoolean77 = true;
		}
		if (Static95.aClass80_947 != null) {
			Static37.aBoolean77 = true;
		}
		if (Static122.aBoolean241 && Static11.anInt315 == 2) {
			Static37.aBoolean77 = true;
		}
		if (Static37.aBoolean77) {
			Static37.aBoolean77 = false;
			Static111.method1937();
		}
		Static73.method1163();
		if (Static110.anInt2904 != -1) {
			Static57.aBoolean119 = true;
		}
		if (Static57.aBoolean119) {
			if (Static110.anInt2904 != -1 && Static23.anInt875 == Static110.anInt2904) {
				Static110.anInt2904 = -1;
				Static120.aClass2_Sub17_Sub1_3.method1799(248);
				Static120.aClass2_Sub17_Sub1_3.method1769(Static23.anInt875);
			}
			Static57.aBoolean119 = false;
			Static17.aBoolean44 = true;
			Static79.method1232(Static10.anInt300 % 20 >= 10 ? Static110.anInt2904 : -1, Static23.anInt875, Static97.anInt2559 == -1, Static39.anIntArray89);
		}
		if (Static15.aBoolean35) {
			Static15.aBoolean35 = false;
			Static17.aBoolean44 = true;
			Static36.method631(Static111.anInt2993, Static112.anInt2924, Static6.anInt172, Static21.aClass2_Sub1_Sub9_Sub4_12);
		}
		Static22.method509(Static16.anInt444, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370, Static106.anInt2840);
		Static106.anInt2840 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method894(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static127.method2005(local13) : local13;
		} else if (arg1 instanceof Class37) {
			@Pc(27) Class37 local27 = (Class37) arg1;
			return local27.method1001();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method895() {
		aClass80_554 = null;
		aClass80_558 = null;
		anIntArrayArray20 = null;
		aClass80_557 = null;
		aClass80_555 = null;
		aClass10_3 = null;
		aClass80_553 = null;
		aClass80_556 = null;
		aClass2_Sub1_Sub17ArrayArray1 = null;
	}
}
