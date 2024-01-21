import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_9;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	public static int anInt176 = 0;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "Lclient!gd;")
	private static Class23 aClass23_140 = Static15.method178("Click to continue");

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_135 = aClass23_140;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_136 = Static15.method178("::fpsoff");

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_137 = Static15.method178("This computers address has been blocked");

	@OriginalMember(owner = "client!b", name = "db", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array3 = new Class23[100];

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_138 = aClass23_137;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_139 = Static15.method178("(U1");

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
	public static int anInt178 = 0;

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
	public static int anInt179 = 1;

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_141 = Static15.method178(",Zffentlicher Chat");

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_145 = Static15.method178("Connection lost");

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_142 = aClass23_145;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_143 = Static15.method178(": ");

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "[I")
	public static int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "Lclient!de;")
	public static Class14 aClass14_2 = new Class14(32);

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_144 = Static15.method178("M");

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_146 = Static15.method178(" x");

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_147 = Static15.method178("@gr2@");

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_148 = Static15.method178("No reply from loginserver)3");

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_149 = aClass23_148;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V")
	public static void method92(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub5 local8 = new Class1_Sub5(arg0);
		local8.anInt1266 = arg0.length - 2;
		Static25.anInt766 = local8.method715();
		Static102.anIntArray355 = new int[Static25.anInt766];
		Static105.aByteArrayArray7 = new byte[Static25.anInt766][];
		Static26.anIntArray119 = new int[Static25.anInt766];
		Static113.anIntArray410 = new int[Static25.anInt766];
		Static100.anIntArray348 = new int[Static25.anInt766];
		local8.anInt1266 = arg0.length - Static25.anInt766 * 8 - 7;
		Static13.anInt236 = local8.method715();
		Static79.anInt2132 = local8.method715();
		@Pc(61) int local61 = (local8.method716() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static25.anInt766; local63++) {
			Static102.anIntArray355[local63] = local8.method715();
		}
		for (@Pc(78) int local78 = 0; local78 < Static25.anInt766; local78++) {
			Static100.anIntArray348[local78] = local8.method715();
		}
		for (@Pc(95) int local95 = 0; local95 < Static25.anInt766; local95++) {
			Static113.anIntArray410[local95] = local8.method715();
		}
		for (@Pc(108) int local108 = 0; local108 < Static25.anInt766; local108++) {
			Static26.anIntArray119[local108] = local8.method715();
		}
		local8.anInt1266 = arg0.length - Static25.anInt766 * 8 - (local61 - 1) * 3 - 7;
		Static80.anIntArray268 = new int[local61];
		for (@Pc(148) int local148 = 1; local148 < local61; local148++) {
			Static80.anIntArray268[local148] = local8.method688();
			if (Static80.anIntArray268[local148] == 0) {
				Static80.anIntArray268[local148] = 1;
			}
		}
		local8.anInt1266 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static25.anInt766; local179++) {
			@Pc(184) int local184 = Static113.anIntArray410[local179];
			@Pc(188) int local188 = Static26.anIntArray119[local179];
			@Pc(192) int local192 = local188 * local184;
			@Pc(195) byte[] local195 = new byte[local192];
			Static105.aByteArrayArray7[local179] = local195;
			@Pc(203) int local203 = local8.method716();
			@Pc(210) int local210;
			if (local203 == 0) {
				for (local210 = 0; local210 < local192; local210++) {
					local195[local210] = local8.method699();
				}
			} else if (local203 == 1) {
				for (local210 = 0; local210 < local184; local210++) {
					for (@Pc(213) int local213 = 0; local213 < local188; local213++) {
						local195[local213 * local184 + local210] = local8.method699();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method93() {
		aClass23_147 = null;
		aClass34_9 = null;
		aClass23_139 = null;
		aClass23_148 = null;
		aClass23_144 = null;
		aClass14_2 = null;
		aClass34_8 = null;
		aClass23_140 = null;
		aClass23_138 = null;
		aClass23_136 = null;
		aClass23_145 = null;
		aClass1_Sub1_Sub6_Sub1Array1 = null;
		aClass23_149 = null;
		aClass23_143 = null;
		aClass23_141 = null;
		aClass23_142 = null;
		aClass23_137 = null;
		aClass23_135 = null;
		aClass23Array3 = null;
		anIntArray36 = null;
		aClass23_146 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public static void method94(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static18.anIntArray66[arg0];
		@Pc(16) int local16 = Static90.anIntArray327[arg0];
		@Pc(20) int local20 = Static34.anIntArray142[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(30) int local30 = Static14.anIntArray48[arg0];
		if (Static44.anInt1485 != 0 && local20 != 1004) {
			Static102.aBoolean123 = true;
			Static44.anInt1485 = 0;
		}
		if (local20 == 47 && Static47.anInt1599 == -1) {
			Static40.method869(local12, 0);
			Static47.anInt1599 = local12;
		}
		if (local20 == 18) {
			Static42.method906();
		}
		if (local20 == 24) {
			Static76.aClass1_Sub5_Sub1_2.method731(177);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method719(local16);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			Static100.anInt2594 = local12;
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			Static71.anInt2008 = 0;
			if (local12 >> 16 == Static92.anInt2913) {
				Static29.anInt880 = 3;
			}
		}
		@Pc(148) boolean local148;
		if (local20 == 37) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static76.anInt2078 = 0;
			Static29.anInt881 = Static74.anInt1803;
			Static80.anInt2260 = 2;
			Static26.anInt797 = Static111.anInt2890;
			Static76.aClass1_Sub5_Sub1_2.method731(74);
			Static76.aClass1_Sub5_Sub1_2.method689(local16 + Static104.anInt2684);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method700(Static106.anInt2713);
			Static76.aClass1_Sub5_Sub1_2.method686(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method689(Static48.anInt1609);
		}
		if (local20 == 2) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static80.anInt2260 = 2;
			Static29.anInt881 = Static74.anInt1803;
			Static26.anInt797 = Static111.anInt2890;
			Static76.anInt2078 = 0;
			Static76.aClass1_Sub5_Sub1_2.method731(83);
			Static76.aClass1_Sub5_Sub1_2.method686(local30);
			Static76.aClass1_Sub5_Sub1_2.method689(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method689(Static104.anInt2684 + local16);
		}
		@Pc(294) Class1_Sub1_Sub2_Sub1_Sub2 local294;
		if (local20 == 56) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static29.anInt881 = Static74.anInt1803;
				Static26.anInt797 = Static111.anInt2890;
				Static76.anInt2078 = 0;
				Static80.anInt2260 = 2;
				Static76.aClass1_Sub5_Sub1_2.method731(219);
				Static76.aClass1_Sub5_Sub1_2.method689(local30);
			}
		}
		@Pc(383) int local383;
		@Pc(363) Class1_Sub1_Sub7 local363;
		if (local20 == 34) {
			Static76.aClass1_Sub5_Sub1_2.method731(103);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			local363 = Static15.method174(local12);
			if (local363.anIntArrayArray18 != null && local363.anIntArrayArray18[0][0] == 5) {
				local383 = local363.anIntArrayArray18[0][1];
				if (local363.anIntArray114[0] != Static40.anIntArray164[local383]) {
					Static40.anIntArray164[local383] = local363.anIntArray114[0];
					Static18.method248(local383);
					Static34.aBoolean60 = true;
				}
			}
		}
		if (local20 == 42) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static80.anInt2260 = 2;
				Static29.anInt881 = Static74.anInt1803;
				Static76.aClass1_Sub5_Sub1_2.method731(41);
				Static76.aClass1_Sub5_Sub1_2.method679(Static26.anInt845);
				Static76.aClass1_Sub5_Sub1_2.method689(local30);
				Static76.aClass1_Sub5_Sub1_2.method694(Static2.anInt2293);
				Static76.aClass1_Sub5_Sub1_2.method686(Static90.anInt2420);
			}
		}
		if (local20 == 13) {
			local363 = Static15.method174(local12);
			Static75.method1323();
			Static90.anInt2427 = local363.anInt828;
			Static106.anInt2713 = local12;
			Static34.aBoolean60 = true;
			Static94.anInt2487 = 1;
			Static115.anInt2955 = 0;
			Static48.anInt1609 = -1;
			Static3.aClass23_96 = local363.aClass23_463;
			Static1.aClass23_53 = Static17.method233(new Class23[] { Static55.aClass23_928, local363.aClass23_460, Static95.aClass23_1406 });
			if (Static90.anInt2427 == 16) {
				Static106.anInt2723 = 3;
				Static64.aBoolean98 = true;
				Static34.aBoolean60 = true;
			}
			return;
		}
		if (local20 == 8) {
			Static76.aClass1_Sub5_Sub1_2.method731(28);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static76.aClass1_Sub5_Sub1_2.method719(local30);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			Static29.anInt880 = 2;
			Static100.anInt2594 = local12;
			Static71.anInt2008 = 0;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (local12 >> 16 == Static92.anInt2913) {
				Static29.anInt880 = 3;
			}
			Static8.anInt187 = local16;
		}
		if (local20 == 7) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static76.anInt2078 = 0;
			Static26.anInt797 = Static111.anInt2890;
			Static29.anInt881 = Static74.anInt1803;
			Static80.anInt2260 = 2;
			Static76.aClass1_Sub5_Sub1_2.method731(169);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method694(Static90.anInt2420);
			Static76.aClass1_Sub5_Sub1_2.method686(local12 + Static107.anInt2745);
			Static76.aClass1_Sub5_Sub1_2.method700(Static26.anInt845);
			Static76.aClass1_Sub5_Sub1_2.method689(local16 + Static104.anInt2684);
			Static76.aClass1_Sub5_Sub1_2.method686(Static2.anInt2293);
		}
		@Pc(718) long local718;
		@Pc(697) Class23 local697;
		if (local20 == 27 || local20 == 9 || local20 == 14 || local20 == 10) {
			local697 = Static109.aClass23Array18[arg0];
			local383 = local697.method528(Static95.aClass23_1406);
			if (local383 != -1) {
				local718 = local697.method510(local383 + 5).method529().method516();
				if (local20 == 27) {
					Static66.method1261(local718);
				}
				if (local20 == 9) {
					Static21.method346(local718);
				}
				if (local20 == 14) {
					Static61.method1203(local718);
				}
				if (local20 == 10) {
					Static20.method337(local718);
				}
			}
		}
		if (local20 == 30) {
			Static76.aClass1_Sub5_Sub1_2.method731(229);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method695(local12);
			Static76.aClass1_Sub5_Sub1_2.method689(local16);
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			Static100.anInt2594 = local12;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			if (local12 >> 16 == Static92.anInt2913) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 15) {
			Static113.method1922(local16, local12, local30);
			Static76.aClass1_Sub5_Sub1_2.method731(39);
			Static76.aClass1_Sub5_Sub1_2.method719(local30 >> 14 & 0x7FFF);
			Static76.aClass1_Sub5_Sub1_2.method686(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method694(Static104.anInt2684 + local16);
		}
		@Pc(843) Class1_Sub1_Sub2_Sub1_Sub1 local843;
		if (local20 == 49) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static76.anInt2078 = 0;
				Static80.anInt2260 = 2;
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static76.aClass1_Sub5_Sub1_2.method731(97);
				Static76.aClass1_Sub5_Sub1_2.method689(local30);
			}
		}
		if (local20 == 52) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static76.anInt2078 = 0;
			Static80.anInt2260 = 2;
			Static29.anInt881 = Static74.anInt1803;
			Static26.anInt797 = Static111.anInt2890;
			Static76.aClass1_Sub5_Sub1_2.method731(208);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method719(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method689(local16 + Static104.anInt2684);
		}
		if (local20 == 53) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static80.anInt2260 = 2;
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static76.anInt2078 = 0;
				Static76.aClass1_Sub5_Sub1_2.method731(71);
				Static76.aClass1_Sub5_Sub1_2.method686(Static2.anInt2293);
				Static76.aClass1_Sub5_Sub1_2.method686(Static90.anInt2420);
				Static76.aClass1_Sub5_Sub1_2.method700(Static26.anInt845);
				Static76.aClass1_Sub5_Sub1_2.method719(local30);
			}
		}
		if (local20 == 11) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static80.anInt2260 = 2;
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static76.aClass1_Sub5_Sub1_2.method731(98);
				Static76.aClass1_Sub5_Sub1_2.method689(local30);
			}
		}
		if (local20 == 1) {
			Static76.aClass1_Sub5_Sub1_2.method731(103);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			local363 = Static15.method174(local12);
			if (local363.anIntArrayArray18 != null && local363.anIntArrayArray18[0][0] == 5) {
				local383 = local363.anIntArrayArray18[0][1];
				Static40.anIntArray164[local383] = 1 - Static40.anIntArray164[local383];
				Static18.method248(local383);
				Static34.aBoolean60 = true;
			}
		}
		if (local20 == 32) {
			Static76.aClass1_Sub5_Sub1_2.method731(222);
			Static76.aClass1_Sub5_Sub1_2.method694(Static48.anInt1609);
			Static76.aClass1_Sub5_Sub1_2.method686(local16);
			Static76.aClass1_Sub5_Sub1_2.method695(local12);
			Static76.aClass1_Sub5_Sub1_2.method700(Static106.anInt2713);
		}
		if (local20 == 19) {
			Static76.aClass1_Sub5_Sub1_2.method731(162);
			Static76.aClass1_Sub5_Sub1_2.method686(local30);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			Static100.anInt2594 = local12;
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 48) {
			Static113.method1922(local16, local12, local30);
			Static76.aClass1_Sub5_Sub1_2.method731(112);
			Static76.aClass1_Sub5_Sub1_2.method719(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method719(local30 >> 14 & 0x7FFF);
			Static76.aClass1_Sub5_Sub1_2.method686(Static104.anInt2684 + local16);
		}
		if (local20 == 1003) {
			Static80.anInt2260 = 2;
			Static29.anInt881 = Static74.anInt1803;
			Static76.anInt2078 = 0;
			Static26.anInt797 = Static111.anInt2890;
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				@Pc(1289) Class1_Sub1_Sub16 local1289 = local843.aClass1_Sub1_Sub16_1;
				if (local1289.anIntArray381 != null) {
					local1289 = local1289.method1816();
				}
				if (local1289 != null) {
					Static76.aClass1_Sub5_Sub1_2.method731(190);
					Static76.aClass1_Sub5_Sub1_2.method686(local1289.anInt2748);
				}
			}
		}
		if (local20 == 26) {
			Static76.aClass1_Sub5_Sub1_2.method731(24);
			Static76.aClass1_Sub5_Sub1_2.method700(local12);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method686(local16);
			Static71.anInt2008 = 0;
			Static100.anInt2594 = local12;
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (local12 >> 16 == Static92.anInt2913) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 1006) {
			local363 = Static15.method174(local12);
			if (local363 == null || local363.anIntArray117[local16] < 100000) {
				Static76.aClass1_Sub5_Sub1_2.method731(95);
				Static76.aClass1_Sub5_Sub1_2.method719(local30);
			} else {
				Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { Static19.method274(local363.anIntArray117[local16]), Static43.aClass23_775, Static111.method1907(local30).aClass23_58 }), 0);
			}
			Static100.anInt2594 = local12;
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 21) {
			local363 = Static15.method174(local12);
			@Pc(1458) boolean local1458 = true;
			if (local363.anInt839 > 0) {
				local1458 = Static62.method1205(local363);
			}
			if (local1458) {
				Static76.aClass1_Sub5_Sub1_2.method731(103);
				Static76.aClass1_Sub5_Sub1_2.method679(local12);
			}
		}
		if (local20 == 33) {
			Static76.aClass1_Sub5_Sub1_2.method731(234);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static76.aClass1_Sub5_Sub1_2.method695(local12);
			Static29.anInt880 = 2;
			Static8.anInt187 = local16;
			Static100.anInt2594 = local12;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			if (local12 >> 16 == Static92.anInt2913) {
				Static29.anInt880 = 3;
			}
			Static71.anInt2008 = 0;
		}
		if (local20 == 36) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static80.anInt2260 = 2;
				Static76.anInt2078 = 0;
				Static76.aClass1_Sub5_Sub1_2.method731(134);
				Static76.aClass1_Sub5_Sub1_2.method686(local30);
			}
		}
		if (local20 == 5) {
			Static76.aClass1_Sub5_Sub1_2.method731(48);
			Static76.aClass1_Sub5_Sub1_2.method719(local30);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static76.aClass1_Sub5_Sub1_2.method708(local12);
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			Static8.anInt187 = local16;
			Static100.anInt2594 = local12;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 58) {
			local697 = Static109.aClass23Array18[arg0];
			local383 = local697.method528(Static95.aClass23_1406);
			if (local383 != -1) {
				if (Static109.anInt2824 == -1) {
					Static42.method906();
					if (Static114.anInt2951 != -1) {
						Static104.aClass23_1520 = local697.method510(local383 + 5).method529();
						Static32.aBoolean58 = false;
						Static57.anInt1779 = Static109.anInt2824 = Static114.anInt2951;
					}
				} else {
					Static63.method1229(Static104.aClass23_1523, Static58.aClass23_1678, 0);
				}
			}
		}
		if (local20 == 38 && Static113.method1922(local16, local12, local30)) {
			Static76.aClass1_Sub5_Sub1_2.method731(22);
			Static76.aClass1_Sub5_Sub1_2.method694(local16 + Static104.anInt2684);
			Static76.aClass1_Sub5_Sub1_2.method694(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method719(Static90.anInt2420);
			Static76.aClass1_Sub5_Sub1_2.method686(local30 >> 14 & 0x7FFF);
			Static76.aClass1_Sub5_Sub1_2.method700(Static26.anInt845);
			Static76.aClass1_Sub5_Sub1_2.method694(Static2.anInt2293);
		}
		if (local20 == 28) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static80.anInt2260 = 2;
			Static26.anInt797 = Static111.anInt2890;
			Static29.anInt881 = Static74.anInt1803;
			Static76.anInt2078 = 0;
			Static76.aClass1_Sub5_Sub1_2.method731(179);
			Static76.aClass1_Sub5_Sub1_2.method689(local30);
			Static76.aClass1_Sub5_Sub1_2.method686(Static104.anInt2684 + local16);
			Static76.aClass1_Sub5_Sub1_2.method694(Static107.anInt2745 + local12);
		}
		if (local20 == 45) {
			if (Static74.aBoolean90) {
				Static19.aClass65_1.method1721(local16 - 4, local12 + -4);
			} else {
				Static19.aClass65_1.method1721(Static111.anInt2890 - 4, Static74.anInt1803 + -4);
			}
		}
		if (local20 == 1005) {
			Static26.anInt797 = Static111.anInt2890;
			Static76.anInt2078 = 0;
			Static29.anInt881 = Static74.anInt1803;
			Static80.anInt2260 = 2;
			Static76.aClass1_Sub5_Sub1_2.method731(165);
			Static76.aClass1_Sub5_Sub1_2.method694(local30 >> 14 & 0x7FFF);
		}
		@Pc(1915) int local1915;
		if (local20 == 44 || local20 == 23) {
			local697 = Static109.aClass23Array18[arg0];
			local383 = local697.method528(Static95.aClass23_1406);
			if (local383 != -1) {
				local697 = local697.method510(local383 + 5).method529();
				@Pc(1911) Class23 local1911 = local697.method532().method514();
				@Pc(1913) boolean local1913 = false;
				for (local1915 = 0; local1915 < Static2.anInt2290; local1915++) {
					@Pc(1923) Class1_Sub1_Sub2_Sub1_Sub2 local1923 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static63.anIntArray226[local1915]];
					if (local1923 != null && local1923.aClass23_1260 != null && local1923.aClass23_1260.method530(local1911)) {
						Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local1923.anIntArray264[0], local1923.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
						local1913 = true;
						if (local20 == 44) {
							Static76.aClass1_Sub5_Sub1_2.method731(219);
							Static76.aClass1_Sub5_Sub1_2.method689(Static63.anIntArray226[local1915]);
						}
						if (local20 == 23) {
							Static76.aClass1_Sub5_Sub1_2.method731(134);
							Static76.aClass1_Sub5_Sub1_2.method686(Static63.anIntArray226[local1915]);
						}
						break;
					}
				}
				if (!local1913) {
					Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { Static16.aClass23_239, local1911 }), 0);
				}
			}
		}
		if (local20 == 6) {
			Static76.aClass1_Sub5_Sub1_2.method731(168);
			Static76.aClass1_Sub5_Sub1_2.method719(Static90.anInt2420);
			Static76.aClass1_Sub5_Sub1_2.method719(local30);
			Static76.aClass1_Sub5_Sub1_2.method694(Static2.anInt2293);
			Static76.aClass1_Sub5_Sub1_2.method700(local12);
			Static76.aClass1_Sub5_Sub1_2.method689(local16);
			Static76.aClass1_Sub5_Sub1_2.method700(Static26.anInt845);
			Static8.anInt187 = local16;
			Static71.anInt2008 = 0;
			Static100.anInt2594 = local12;
			Static29.anInt880 = 2;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 40) {
			Static76.aClass1_Sub5_Sub1_2.method731(73);
			Static76.aClass1_Sub5_Sub1_2.method686(local16);
			Static76.aClass1_Sub5_Sub1_2.method695(Static106.anInt2713);
			Static76.aClass1_Sub5_Sub1_2.method694(Static48.anInt1609);
			Static76.aClass1_Sub5_Sub1_2.method695(local12);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			Static8.anInt187 = local16;
			Static100.anInt2594 = local12;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 1002) {
			Static29.anInt881 = Static74.anInt1803;
			Static26.anInt797 = Static111.anInt2890;
			Static76.anInt2078 = 0;
			Static80.anInt2260 = 2;
			Static76.aClass1_Sub5_Sub1_2.method731(95);
			Static76.aClass1_Sub5_Sub1_2.method719(local30);
		}
		if (local20 == 25) {
			Static75.method1323();
			Static26.anInt845 = local12;
			Static90.anInt2420 = local30;
			Static2.anInt2293 = local16;
			Static115.anInt2955 = 1;
			Static34.aBoolean60 = true;
			Static87.aClass23_1690 = Static17.method233(new Class23[] { Static64.aClass23_1109, Static111.method1907(local30).aClass23_58, Static95.aClass23_1406 });
			if (Static87.aClass23_1690 == null) {
				Static87.aClass23_1690 = Static52.aClass23_870;
			}
			return;
		}
		if (local20 == 17) {
			Static76.aClass1_Sub5_Sub1_2.method731(157);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static76.aClass1_Sub5_Sub1_2.method708(local12);
			Static76.aClass1_Sub5_Sub1_2.method689(local30);
			Static100.anInt2594 = local12;
			Static71.anInt2008 = 0;
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
		}
		if (local20 == 22) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static29.anInt881 = Static74.anInt1803;
				Static80.anInt2260 = 2;
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static76.aClass1_Sub5_Sub1_2.method731(217);
				Static76.aClass1_Sub5_Sub1_2.method719(local30);
			}
		}
		if (local20 == 43) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static80.anInt2260 = 2;
				Static76.aClass1_Sub5_Sub1_2.method731(120);
				Static76.aClass1_Sub5_Sub1_2.method694(local30);
			}
		}
		if (local20 == 31) {
			Static57.method1099(local30, local16, local12);
		}
		if (local20 == 41) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static26.anInt797 = Static111.anInt2890;
				Static76.anInt2078 = 0;
				Static29.anInt881 = Static74.anInt1803;
				Static80.anInt2260 = 2;
				Static76.aClass1_Sub5_Sub1_2.method731(108);
				Static76.aClass1_Sub5_Sub1_2.method686(local30);
			}
		}
		if (local20 == 51 && Static113.method1922(local16, local12, local30)) {
			Static76.aClass1_Sub5_Sub1_2.method731(238);
			Static76.aClass1_Sub5_Sub1_2.method689(local30 >> 14 & 0x7FFF);
			Static76.aClass1_Sub5_Sub1_2.method719(Static104.anInt2684 + local16);
			Static76.aClass1_Sub5_Sub1_2.method679(Static106.anInt2713);
			Static76.aClass1_Sub5_Sub1_2.method694(Static107.anInt2745 + local12);
			Static76.aClass1_Sub5_Sub1_2.method694(Static48.anInt1609);
		}
		if (local20 == 1001) {
			Static113.method1922(local16, local12, local30);
			Static76.aClass1_Sub5_Sub1_2.method731(89);
			Static76.aClass1_Sub5_Sub1_2.method689(local12 + Static107.anInt2745);
			Static76.aClass1_Sub5_Sub1_2.method686(Static104.anInt2684 + local16);
			Static76.aClass1_Sub5_Sub1_2.method686(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 54) {
			Static76.aClass1_Sub5_Sub1_2.method731(124);
			Static76.aClass1_Sub5_Sub1_2.method686(local16);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			Static76.aClass1_Sub5_Sub1_2.method689(local30);
			Static29.anInt880 = 2;
			Static71.anInt2008 = 0;
			if (local12 >> 16 == Static109.anInt2824) {
				Static29.anInt880 = 1;
			}
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
			Static100.anInt2594 = local12;
			Static8.anInt187 = local16;
		}
		if (local20 == 55) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static29.anInt881 = Static74.anInt1803;
				Static76.anInt2078 = 0;
				Static80.anInt2260 = 2;
				Static26.anInt797 = Static111.anInt2890;
				Static76.aClass1_Sub5_Sub1_2.method731(3);
				Static76.aClass1_Sub5_Sub1_2.method719(Static48.anInt1609);
				Static76.aClass1_Sub5_Sub1_2.method694(local30);
				Static76.aClass1_Sub5_Sub1_2.method679(Static106.anInt2713);
			}
		}
		if (local20 == 50) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static29.anInt881 = Static74.anInt1803;
				Static80.anInt2260 = 2;
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static76.aClass1_Sub5_Sub1_2.method731(246);
				Static76.aClass1_Sub5_Sub1_2.method719(local30);
			}
		}
		if (local20 == 46) {
			Static108.method1842(Static56.anInt1733);
			Static102.aBoolean123 = true;
			Static56.anInt1733 = -1;
		}
		if (local20 == 12) {
			local843 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local30];
			if (local843 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local843.anIntArray264[0], local843.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static80.anInt2260 = 2;
				Static29.anInt881 = Static74.anInt1803;
				Static76.aClass1_Sub5_Sub1_2.method731(175);
				Static76.aClass1_Sub5_Sub1_2.method689(Static48.anInt1609);
				Static76.aClass1_Sub5_Sub1_2.method694(local30);
				Static76.aClass1_Sub5_Sub1_2.method695(Static106.anInt2713);
			}
		}
		if (local20 == 57) {
			Static113.method1922(local16, local12, local30);
			Static76.aClass1_Sub5_Sub1_2.method731(88);
			Static76.aClass1_Sub5_Sub1_2.method694(Static104.anInt2684 + local16);
			Static76.aClass1_Sub5_Sub1_2.method719(local30 >> 14 & 0x7FFF);
			Static76.aClass1_Sub5_Sub1_2.method719(local12 + Static107.anInt2745);
		}
		if (local20 == 3) {
			Static113.method1922(local16, local12, local30);
			Static76.aClass1_Sub5_Sub1_2.method731(147);
			Static76.aClass1_Sub5_Sub1_2.method694(local12 + Static107.anInt2745);
			Static76.aClass1_Sub5_Sub1_2.method686(local16 + Static104.anInt2684);
			Static76.aClass1_Sub5_Sub1_2.method719(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 29) {
			local697 = Static109.aClass23Array18[arg0];
			local383 = local697.method528(Static95.aClass23_1406);
			if (local383 != -1) {
				local718 = local697.method510(local383 + 5).method529().method516();
				local1915 = -1;
				for (@Pc(2901) int local2901 = 0; local2901 < Static8.anInt186; local2901++) {
					if (Static88.aLongArray16[local2901] == local718) {
						local1915 = local2901;
						break;
					}
				}
				if (local1915 != -1 && Static63.anIntArray223[local1915] > 0) {
					Static102.aBoolean123 = true;
					Static44.anInt1485 = 0;
					Static104.aClass23_1525 = Static104.aClass23_1523;
					Static17.anInt429 = 3;
					Static68.aBoolean27 = true;
					Static67.aLong51 = Static88.aLongArray16[local1915];
					Static104.aClass23_1527 = Static17.method233(new Class23[] { Static106.aClass23_1553, Static8.aClass23Array4[local1915] });
				}
			}
		}
		if (local20 == 39) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static80.anInt2260 = 2;
			Static76.anInt2078 = 0;
			Static26.anInt797 = Static111.anInt2890;
			Static29.anInt881 = Static74.anInt1803;
			Static76.aClass1_Sub5_Sub1_2.method731(19);
			Static76.aClass1_Sub5_Sub1_2.method689(local30);
			Static76.aClass1_Sub5_Sub1_2.method694(Static104.anInt2684 + local16);
			Static76.aClass1_Sub5_Sub1_2.method694(local12 + Static107.anInt2745);
		}
		if (local20 == 16) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static80.anInt2260 = 2;
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static76.aClass1_Sub5_Sub1_2.method731(193);
				Static76.aClass1_Sub5_Sub1_2.method689(local30);
			}
		}
		if (local20 == 20) {
			Static76.aClass1_Sub5_Sub1_2.method731(139);
			Static76.aClass1_Sub5_Sub1_2.method679(local12);
			Static76.aClass1_Sub5_Sub1_2.method694(local16);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
			Static8.anInt187 = local16;
			Static29.anInt880 = 2;
			if (Static109.anInt2824 == local12 >> 16) {
				Static29.anInt880 = 1;
			}
			Static71.anInt2008 = 0;
			if (Static92.anInt2913 == local12 >> 16) {
				Static29.anInt880 = 3;
			}
			Static100.anInt2594 = local12;
		}
		if (local20 == 35) {
			local294 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local30];
			if (local294 != null) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local294.anIntArray264[0], local294.anIntArray266[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
				Static29.anInt881 = Static74.anInt1803;
				Static76.anInt2078 = 0;
				Static26.anInt797 = Static111.anInt2890;
				Static80.anInt2260 = 2;
				Static76.aClass1_Sub5_Sub1_2.method731(227);
				Static76.aClass1_Sub5_Sub1_2.method719(local30);
			}
		}
		if (local20 == 4) {
			local148 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 0, 0, 0, 2, 0);
			if (!local148) {
				Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local16, local12, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], false, 1, 0, 1, 2, 0);
			}
			Static80.anInt2260 = 2;
			Static76.anInt2078 = 0;
			Static26.anInt797 = Static111.anInt2890;
			Static29.anInt881 = Static74.anInt1803;
			Static76.aClass1_Sub5_Sub1_2.method731(61);
			Static76.aClass1_Sub5_Sub1_2.method689(local16 + Static104.anInt2684);
			Static76.aClass1_Sub5_Sub1_2.method694(local12 + Static107.anInt2745);
			Static76.aClass1_Sub5_Sub1_2.method694(local30);
		}
		if (Static115.anInt2955 != 0) {
			Static34.aBoolean60 = true;
			Static115.anInt2955 = 0;
		}
		if (Static94.anInt2487 != 0) {
			Static75.method1323();
			Static34.aBoolean60 = true;
		}
		if (local20 != 31) {
			return;
		}
		@Pc(3305) int local3305 = local16;
		@Pc(3309) Class1_Sub1_Sub7 local3309 = Static15.method174(local12);
		if (local3309 != null && local3309.aClass1_Sub1_Sub7Array1 != null && local16 != -1 && local3309.aClass1_Sub1_Sub7Array1.length > local16) {
			local3309 = local3309.aClass1_Sub1_Sub7Array1[local16];
			local3305 = -1;
		}
		if (local3309 != null && local3309.anObjectArray11 != null && local3305 == -1) {
			Static34.method585(local3309.anObjectArray11, 0, 0, local3309, local30);
			return;
		}
	}
}
