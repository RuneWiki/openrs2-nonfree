import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!dc", name = "Ab", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!dc", name = "Cb", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
	public static int anInt761 = 0;

	@OriginalMember(owner = "client!dc", name = "qb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][105][105];

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_248 = Static56.method1206("wave2:");

	@OriginalMember(owner = "client!dc", name = "tb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_30 = new Class17(64);

	@OriginalMember(owner = "client!dc", name = "vb", descriptor = "[I")
	public static int[] anIntArray94 = new int[128];

	@OriginalMember(owner = "client!dc", name = "xb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_249 = Static56.method1206("Loading fonts )2 ");

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!dc", name = "Db", descriptor = "Lclient!lc;")
	public static Class31 aClass31_250 = Static56.method1206("::fpsoff");

	@OriginalMember(owner = "client!dc", name = "Fb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_251 = Static56.method1206("Private chat");

	@OriginalMember(owner = "client!dc", name = "Ib", descriptor = "I")
	public static int anInt773 = -1;

	@OriginalMember(owner = "client!dc", name = "Jb", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)I")
	public static int method510() {
		return 5;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(Z)V")
	public static void method512() {
		Static31.method853(false, null, 0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method513() {
		for (@Pc(3) int local3 = 0; local3 < Static100.anInt2712; local3++) {
			@Pc(9) int local9 = Static78.anIntArray321[local3]--;
			if (Static78.anIntArray321[local3] >= -10) {
				@Pc(68) Class10 local68 = Static34.aClass10Array1[local3];
				if (local68 == null) {
					local68 = Static108.method235(Static55.aClass11_Sub1_12, Static39.anIntArray232[local3]);
					if (local68 == null) {
						continue;
					}
					Static78.anIntArray321[local3] += local68.method232();
					Static34.aClass10Array1[local3] = local68;
				}
				if (Static78.anIntArray321[local3] < 0) {
					@Pc(104) Class2_Sub9_Sub1 local104 = local68.method234().method823(Static43.aClass44_1);
					@Pc(109) Class2_Sub8_Sub2 local109 = Static115.method1678(local104, Static86.anInt2325);
					local109.method1675(Static59.anIntArray287[local3] - 1);
					Static46.aClass2_Sub8_Sub1_1.method746(local109);
					Static78.anIntArray321[local3] = -100;
				}
			} else {
				Static100.anInt2712--;
				for (@Pc(23) int local23 = local3; local23 < Static100.anInt2712; local23++) {
					Static39.anIntArray232[local23] = Static39.anIntArray232[local23 + 1];
					Static34.aClass10Array1[local23] = Static34.aClass10Array1[local23 + 1];
					Static59.anIntArray287[local23] = Static59.anIntArray287[local23 + 1];
					Static78.anIntArray321[local23] = Static78.anIntArray321[local23 + 1];
				}
				local3--;
			}
		}
		if (Static20.anInt1975 <= 0) {
			return;
		}
		Static20.anInt1975 -= 20;
		if (Static20.anInt1975 < 0) {
			Static20.anInt1975 = 0;
		}
		if (Static20.anInt1975 == 0 && Static88.anInt2370 != 0 && Static74.anInt2232 != -1) {
			Static79.method1438(0, Static74.anInt2232, Static21.aClass11_Sub1_7, Static88.anInt2370);
		}
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
	public static void method514() {
		anIntArray94 = null;
		aClass31_251 = null;
		aClass31_249 = null;
		aLongArray2 = null;
		aClass31_250 = null;
		anIntArrayArrayArray1 = null;
		aClass31_248 = null;
		aClass17_30 = null;
		aClass2_Sub1_Sub3_Sub1_5 = null;
		aClass2_Sub1_Sub3_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!bb;)I")
	public static int method515(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		if (arg1.anIntArrayArray9 == null || arg1.anIntArrayArray9.length <= arg0) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray9[arg0];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(36) byte local36 = 0;
			while (true) {
				@Pc(41) int local41 = local24[local26++];
				@Pc(43) int local43 = 0;
				@Pc(45) byte local45 = 0;
				if (local41 == 0) {
					return local28;
				}
				if (local41 == 1) {
					local43 = Static85.anIntArray357[local24[local26++]];
				}
				if (local41 == 2) {
					local43 = Static48.anIntArray257[local24[local26++]];
				}
				if (local41 == 15) {
					local45 = 1;
				}
				if (local41 == 3) {
					local43 = Static91.anIntArray349[local24[local26++]];
				}
				@Pc(101) int local101;
				@Pc(112) Class2_Sub1_Sub2 local112;
				@Pc(117) int local117;
				@Pc(130) int local130;
				if (local41 == 4) {
					local101 = local24[local26++] << 16;
					@Pc(108) int local108 = local101 + local24[local26++];
					local112 = Static7.method187(local108);
					local117 = local24[local26++];
					if (local117 != -1 && (!Static7.method178(local117).aBoolean126 || Static62.aBoolean108)) {
						for (local130 = 0; local130 < local112.anIntArray40.length; local130++) {
							if (local112.anIntArray40[local130] == local117 + 1) {
								local43 += local112.anIntArray43[local130];
							}
						}
					}
				}
				if (local41 == 16) {
					local45 = 2;
				}
				if (local41 == 17) {
					local45 = 3;
				}
				if (local41 == 5) {
					local43 = Static8.anIntArray46[local24[local26++]];
				}
				if (local41 == 6) {
					local43 = Class1_Sub2.anIntArray243[Static48.anIntArray257[local24[local26++]] - 1];
				}
				if (local41 == 7) {
					local43 = Static8.anIntArray46[local24[local26++]] * 100 / 46875;
				}
				if (local41 == 8) {
					local43 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1732;
				}
				if (local41 == 9) {
					for (local101 = 0; local101 < 25; local101++) {
						if (Static53.aBooleanArray43[local101]) {
							local43 += Static48.anIntArray257[local101];
						}
					}
				}
				if (local41 == 10) {
					local101 = local24[local26++] << 16;
					local101 += local24[local26++];
					local112 = Static7.method187(local101);
					local117 = local24[local26++];
					if (local117 != -1 && (!Static7.method178(local117).aBoolean126 || Static62.aBoolean108)) {
						for (local130 = 0; local130 < local112.anIntArray40.length; local130++) {
							if (local117 + 1 == local112.anIntArray40[local130]) {
								local43 = 999999999;
								break;
							}
						}
					}
				}
				if (local41 == 11) {
					local43 = Static103.anInt2769;
				}
				if (local41 == 12) {
					local43 = Static75.anInt2247;
				}
				if (local41 == 13) {
					local101 = Static8.anIntArray46[local24[local26++]];
					@Pc(332) int local332 = local24[local26++];
					local43 = (local101 & 0x1 << local332) == 0 ? 0 : 1;
				}
				if (local41 == 14) {
					local101 = local24[local26++];
					local43 = Static68.method1373(local101);
				}
				if (local41 == 18) {
					local43 = (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7) + Static25.anInt1103;
				}
				if (local41 == 19) {
					local43 = (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 >> 7) + Static47.anInt1730;
				}
				if (local41 == 20) {
					local43 = local24[local26++];
				}
				if (local45 == 0) {
					if (local36 == 0) {
						local28 += local43;
					}
					if (local36 == 1) {
						local28 -= local43;
					}
					if (local36 == 2 && local43 != 0) {
						local28 /= local43;
					}
					if (local36 == 3) {
						local28 *= local43;
					}
					local36 = 0;
				} else {
					local36 = local45;
				}
			}
		} catch (@Pc(433) Exception local433) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	public static int method516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}
}
