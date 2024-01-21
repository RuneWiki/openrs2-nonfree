import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!b;")
	public static Class6_Sub1 aClass6_Sub1_5 = new Class6_Sub1(8);

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!rc;")
	private static Class55 aClass55_961 = Static34.method846("Friends");

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_950 = aClass55_961;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!rc;")
	private static Class55 aClass55_951 = Static34.method846("Connection lost");

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!rc;")
	private static Class55 aClass55_952 = Static34.method846("Choose Option");

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!rc;")
	public static Class55 aClass55_953 = Static34.method846("::fpsoff");

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!rc;")
	private static Class55 aClass55_954 = Static34.method846(" million");

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Lclient!rc;")
	private static Class55 aClass55_960 = Static34.method846("Enter your username (V password)3");

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_955 = aClass55_960;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!rc;")
	public static Class55 aClass55_956 = aClass55_952;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!rc;")
	public static Class55 aClass55_957 = Static34.method846("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Lclient!rc;")
	public static Class55 aClass55_958 = aClass55_954;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!rc;")
	public static Class55 aClass55_959 = Static34.method846("scrollen:");

	@OriginalMember(owner = "client!r", name = "G", descriptor = "Lclient!rc;")
	public static Class55 aClass55_962 = aClass55_951;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jd;B)V")
	public static void method1590(@OriginalArg(0) Class6_Sub2_Sub3_Sub1 arg0) {
		if (arg0.anInt2754 == Static85.anInt2389 || arg0.anInt2717 == -1 || arg0.anInt2711 != 0 || arg0.anInt2721 + 1 > Static4.method1608(arg0.anInt2717).anIntArray261[arg0.anInt2734]) {
			@Pc(38) int local38 = arg0.anInt2754 - arg0.anInt2742;
			@Pc(44) int local44 = Static85.anInt2389 - arg0.anInt2742;
			@Pc(54) int local54 = arg0.anInt2708 * 64 + arg0.anInt2730 * 128;
			@Pc(64) int local64 = arg0.anInt2753 * 128 + arg0.anInt2708 * 64;
			@Pc(74) int local74 = arg0.anInt2708 * 64 + arg0.anInt2696 * 128;
			arg0.anInt2710 = (local54 * (local38 - local44) + local44 * local74) / local38;
			@Pc(97) int local97 = arg0.anInt2708 * 64 + arg0.anInt2724 * 128;
			arg0.anInt2744 = (local64 * (local38 - local44) + local44 * local97) / local38;
		}
		arg0.anInt2720 = 0;
		if (arg0.anInt2702 == 0) {
			arg0.anInt2727 = 1024;
		}
		if (arg0.anInt2702 == 1) {
			arg0.anInt2727 = 1536;
		}
		if (arg0.anInt2702 == 2) {
			arg0.anInt2727 = 0;
		}
		if (arg0.anInt2702 == 3) {
			arg0.anInt2727 = 512;
		}
		arg0.anInt2707 = arg0.anInt2727;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
	public static void method1591(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static67.aClass6_Sub2_Sub2_Sub2_12.anIntArray62;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(46) int local46;
		@Pc(48) int local48;
		for (@Pc(33) int local33 = 1; local33 < 103; local33++) {
			local46 = (103 - local33) * 4 * 512 + 24628;
			for (local48 = 1; local48 < 103; local48++) {
				if ((Static43.aByteArrayArrayArray8[arg0][local48][local33] & 0x18) == 0) {
					Static109.aClass34_1.method1061(local8, local46, arg0, local48, local33);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray8[arg0 + 1][local48][local33] & 0x8) != 0) {
					Static109.aClass34_1.method1061(local8, local46, arg0 + 1, local48, local33);
				}
				local46 += 4;
			}
		}
		Static67.aClass6_Sub2_Sub2_Sub2_12.method629();
		local46 = (int) (Math.random() * 20.0D) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		local48 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(160) int local160;
		for (@Pc(156) int local156 = 1; local156 < 103; local156++) {
			for (local160 = 1; local160 < 103; local160++) {
				if ((Static43.aByteArrayArrayArray8[arg0][local160][local156] & 0x18) == 0) {
					Static106.method1601(arg0, local156, local48, local46, local160);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray8[arg0 + 1][local160][local156] & 0x8) != 0) {
					Static106.method1601(arg0 + 1, local156, local48, local46, local160);
				}
			}
		}
		Static6.anInt270 = 0;
		for (local160 = 0; local160 < 104; local160++) {
			for (@Pc(232) int local232 = 0; local232 < 104; local232++) {
				@Pc(240) int local240 = Static109.aClass34_1.method1031(Static56.anInt1718, local160, local232);
				if (local240 != 0) {
					local240 = local240 >> 14 & 0x7FFF;
					@Pc(256) int local256 = Static8.method333(local240).anInt3012;
					if (local256 >= 0) {
						@Pc(263) int local263 = local232;
						@Pc(265) int local265 = local160;
						if (local256 != 22 && local256 != 29 && local256 != 34 && local256 != 36 && local256 != 46 && local256 != 47 && local256 != 48) {
							@Pc(295) int[][] local295 = Static96.aClass57Array1[Static56.anInt1718].anIntArrayArray20;
							for (@Pc(297) int local297 = 0; local297 < 10; local297++) {
								@Pc(304) int local304 = (int) (Math.random() * 4.0D);
								if (local304 == 0 && local265 > 0 && local265 > local160 - 3 && (local295[local265 - 1][local263] & 0x1280108) == 0) {
									local265--;
								}
								if (local304 == 1 && local265 < 103 && local160 + 3 > local265 && (local295[local265 + 1][local263] & 0x1280180) == 0) {
									local265++;
								}
								if (local304 == 2 && local263 > 0 && local232 - 3 < local263 && (local295[local265][local263 - 1] & 0x1280102) == 0) {
									local263--;
								}
								if (local304 == 3 && local263 < 103 && local263 < local232 + 3 && (local295[local265][local263 + 1] & 0x1280120) == 0) {
									local263++;
								}
							}
						}
						Static67.aClass6_Sub2_Sub2_Sub2Array11[Static6.anInt270] = Static56.aClass6_Sub2_Sub2_Sub2Array9[local256];
						Static65.anIntArray186[Static6.anInt270] = local265;
						Static41.anIntArray96[Static6.anInt270] = local263;
						Static6.anInt270++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1592() {
		aClass55_961 = null;
		aClass55_954 = null;
		aClass55_956 = null;
		aClass55_951 = null;
		Class54.anIntArray233 = null;
		aClass55_952 = null;
		aClass55_959 = null;
		aClass55_962 = null;
		aClass55_953 = null;
		aClass6_Sub1_5 = null;
		aClass55_958 = null;
		aClass55_950 = null;
		aClass55_957 = null;
		aClass55_960 = null;
		aClass55_955 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 method1593() {
		@Pc(18) Class6_Sub2_Sub2_Sub4 local18 = new Class6_Sub2_Sub2_Sub4(Static94.anIntArray248, Static72.anIntArray195, Static38.anIntArray95, Static44.anIntArray257, Static67.aByteArrayArray6);
		Static6.method238();
		return local18;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V")
	public static void method1594(@OriginalArg(1) boolean arg0) {
		if (Static8.anInt378 == Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 >> 7 && Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 >> 7 == Static41.anInt1398) {
			Static8.anInt378 = 0;
		}
		@Pc(21) int local21 = Static78.anInt2246;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(39) Class6_Sub2_Sub3_Sub1_Sub1 local39;
			@Pc(45) int local45;
			if (arg0) {
				local39 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1;
				local45 = 33538048;
			} else {
				local39 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local27]];
				local45 = Static101.anIntArray283[local27] << 14;
			}
			if (local39 != null && local39.method1826()) {
				local39.aBoolean28 = false;
				@Pc(65) int local65 = local39.anInt2710 >> 7;
				if ((Static90.aBoolean119 && Static78.anInt2246 > 50 || Static78.anInt2246 > 200) && !arg0 && local39.anInt2741 == local39.anInt2756) {
					local39.aBoolean28 = true;
				}
				@Pc(94) int local94 = local39.anInt2744 >> 7;
				if (local65 >= 0 && local65 < 104 && local94 >= 0 && local94 < 104) {
					if (local39.aClass6_Sub2_Sub3_Sub3_1 == null || Static85.anInt2389 < local39.anInt678 || local39.anInt671 <= Static85.anInt2389) {
						if ((local39.anInt2710 & 0x7F) == 64 && (local39.anInt2744 & 0x7F) == 64) {
							if (Static34.anIntArrayArray4[local65][local94] == Static86.anInt2443) {
								continue;
							}
							Static34.anIntArrayArray4[local65][local94] = Static86.anInt2443;
						}
						local39.anInt684 = Static112.method2073(Static56.anInt1718, local39.anInt2710, local39.anInt2744);
						Static109.aClass34_1.method1037(Static56.anInt1718, local39.anInt2710, local39.anInt2744, local39.anInt684, 60, local39, local39.anInt2707, local45, local39.aBoolean126);
					} else {
						local39.aBoolean28 = false;
						local39.anInt684 = Static112.method2073(Static56.anInt1718, local39.anInt2710, local39.anInt2744);
						Static109.aClass34_1.method1028(Static56.anInt1718, local39.anInt2710, local39.anInt2744, local39.anInt684, local39, local39.anInt2707, local45, local39.anInt674, local39.anInt676, local39.anInt689, local39.anInt688);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method1595() {
		Static91.anInt2553 = 0;
		@Pc(13) int local13 = (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 >> 7) + Static18.anInt938;
		@Pc(20) int local20 = Static88.anInt3276 + (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static91.anInt2553 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static91.anInt2553 = 1;
		}
		if (Static91.anInt2553 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static91.anInt2553 = 0;
		}
	}
}
