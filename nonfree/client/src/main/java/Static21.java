import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!de", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_382 = Static15.method178("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!gd;")
	private static Class23 aClass23_383 = Static15.method178("Enter name of friend to add to list");

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_384 = Static15.method178("0(U");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_385 = Static15.method178("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_386 = Static15.method178(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_387 = aClass23_383;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_388 = Static15.method178("@red@");

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_389 = Static15.method178("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public static void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub1_Sub15 local7 = Static92.method1914(arg0);
		@Pc(10) int local10 = local7.anInt2680;
		@Pc(13) int local13 = local7.anInt2682;
		@Pc(16) int local16 = local7.anInt2683;
		@Pc(22) int local22 = Class1_Sub1_Sub2.anIntArray272[local16 - local13];
		if (arg1 < 0 || arg1 > local22) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static40.anIntArray164[local10] = local22 & arg1 << local13 | Static40.anIntArray164[local10] & ~local22;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
	public static boolean method344() {
		@Pc(5) Class29 local5 = Static113.aClass29_1;
		synchronized (Static113.aClass29_1) {
			if (Static83.anInt2321 == Static57.anInt1780) {
				return false;
			} else {
				Static115.anInt2953 = Static92.anIntArray406[Static57.anInt1780];
				Static15.anInt324 = Static16.anIntArray60[Static57.anInt1780];
				Static57.anInt1780 = Static57.anInt1780 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ)V")
	public static void method346(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static35.anInt1118 >= 100) {
			Static63.method1229(Static104.aClass23_1523, Static45.aClass23_813, 0);
			return;
		}
		@Pc(27) Class23 local27 = Static54.method1049(arg0).method514();
		for (@Pc(29) int local29 = 0; local29 < Static35.anInt1118; local29++) {
			if (arg0 == Static58.aLongArray37[local29]) {
				Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { local27, Static29.aClass23_477 }), 0);
				return;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < Static8.anInt186; local63++) {
			if (arg0 == Static88.aLongArray16[local63]) {
				Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { Static69.aClass23_1167, local27, Static105.aClass23_1536 }), 0);
				return;
			}
		}
		if (!local27.method539(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260)) {
			Static58.aLongArray37[Static35.anInt1118++] = arg0;
			Static34.aBoolean60 = true;
			Static76.aClass1_Sub5_Sub1_2.method731(239);
			Static76.aClass1_Sub5_Sub1_2.method711(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method347() {
		aClass23_388 = null;
		aClass23_386 = null;
		aClass23_387 = null;
		aClass23_385 = null;
		aClass23_389 = null;
		aByteArrayArrayArray2 = null;
		aClass23_384 = null;
		anIntArrayArrayArray1 = null;
		aClass23_383 = null;
		aClass23_382 = null;
		anIntArray93 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)Z")
	public static boolean method348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(12) int local12 = -1;
		@Pc(17) Class1_Sub5 local17 = new Class1_Sub5(arg2);
		label54: while (true) {
			@Pc(21) int local21 = local17.method721();
			if (local21 == 0) {
				return local10;
			}
			@Pc(28) int local28 = 0;
			@Pc(30) boolean local30 = false;
			local12 += local21;
			while (true) {
				@Pc(40) int local40;
				while (!local30) {
					local40 = local17.method721();
					if (local40 == 0) {
						continue label54;
					}
					local28 += local40 - 1;
					@Pc(68) int local68 = local28 >> 6 & 0x3F;
					@Pc(72) int local72 = local28 & 0x3F;
					@Pc(78) int local78 = local17.method716() >> 2;
					@Pc(82) int local82 = local68 + arg1;
					@Pc(87) int local87 = local72 + arg0;
					if (local82 > 0 && local87 > 0 && local82 < 103 && local87 < 103) {
						@Pc(108) Class1_Sub1_Sub4 local108 = Static97.method1645(local12);
						if (local78 != 22 || !Static9.aBoolean7 || local108.anInt298 != 0 || local108.aBoolean18) {
							if (!local108.method171()) {
								local10 = false;
								Static14.anInt274++;
							}
							local30 = true;
						}
					}
				}
				local40 = local17.method721();
				if (local40 == 0) {
					break;
				}
				local17.method716();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method349() {
		Static17.method236();
		if (Static80.anInt2260 == 1) {
			Static71.aClass1_Sub1_Sub6_Sub1Array5[Static76.anInt2078 / 100].method798(Static26.anInt797 - 8 - 4, -8 + -4 + Static29.anInt881);
		}
		if (Static80.anInt2260 == 2) {
			Static71.aClass1_Sub1_Sub6_Sub1Array5[Static76.anInt2078 / 100 + 4].method798(Static26.anInt797 - 4 - 8, Static29.anInt881 + -12);
		}
		if (Static70.anInt1836 != -1) {
			Static37.method746(Static70.anInt1836);
			Static51.method992(334, 4, 512, Static70.anInt1836);
		}
		if (Static109.anInt2824 != -1) {
			Static37.method746(Static109.anInt2824);
			Static51.method992(334, 0, 512, Static109.anInt2824);
		}
		Static66.method1258();
		if (!Static74.aBoolean90) {
			Static95.method1624();
			Static37.method743();
		} else if (Static96.anInt1798 == 0) {
			Static61.method1201();
		}
		if (Static76.anInt2079 == 1) {
			Static36.aClass1_Sub1_Sub6_Sub1_3.method798(472, 296);
		}
		@Pc(137) int local137;
		if (Static102.aBoolean122) {
			@Pc(113) byte local113 = 20;
			Static112.aClass1_Sub1_Sub6_Sub2_14.method831(Static17.method233(new Class23[] { Static97.aClass23_1431, Static19.method274(Static2.anInt2291) }), 20, 16776960);
			local137 = local113 + 15;
			@Pc(139) int local139 = 16776960;
			@Pc(141) Runtime local141 = Runtime.getRuntime();
			@Pc(151) int local151 = (int) ((local141.totalMemory() - local141.freeMemory()) / 1024L);
			if (local151 > 32768 && Static9.aBoolean7) {
				local139 = 16711680;
			}
			if (local151 > 65536 && !Static9.aBoolean7) {
				local139 = 16711680;
			}
			Static112.aClass1_Sub1_Sub6_Sub2_14.method831(Static17.method233(new Class23[] { Static62.aClass23_1065, Static19.method274(local151), Static89.aClass23_1345 }), 35, local139);
			local137 += 15;
			if (Static12.aBoolean113) {
				Static112.aClass1_Sub1_Sub6_Sub2_14.method831(Static87.aClass23_1694, 50, 16711680);
				local137 += 15;
				Static12.aBoolean113 = false;
			}
			if (Static26.aBoolean54) {
				Static112.aClass1_Sub1_Sub6_Sub2_14.method831(Static44.aClass23_788, local137, 16711680);
				local137 += 15;
				Static26.aBoolean54 = false;
			}
			if (Static97.aBoolean120) {
				Static112.aClass1_Sub1_Sub6_Sub2_14.method831(Static54.aClass23_902, local137, 16711680);
				Static97.aBoolean120 = false;
				local137 += 15;
			}
		}
		if (Static66.anInt1971 == 0) {
			return;
		}
		@Pc(230) int local230 = Static66.anInt1971 / 50;
		local137 = local230 / 60;
		@Pc(238) int local238 = local230 % 60;
		if (local238 >= 10) {
			Static112.aClass1_Sub1_Sub6_Sub2_14.method836(Static17.method233(new Class23[] { Static60.aClass23_987, Static19.method274(local137), Static34.aClass23_601, Static19.method274(local238) }), 4, 329, 16776960);
		} else {
			Static112.aClass1_Sub1_Sub6_Sub2_14.method836(Static17.method233(new Class23[] { Static60.aClass23_987, Static19.method274(local137), Static3.aClass23_97, Static19.method274(local238) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!fa;)V")
	public static void method350(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.aBoolean104 = false;
		@Pc(21) Class1_Sub1_Sub8 local21;
		if (arg0.anInt2184 != -1) {
			local21 = Static18.method249(arg0.anInt2184);
			if (local21 == null || local21.anIntArray147 == null) {
				arg0.anInt2184 = -1;
			} else {
				arg0.anInt2212++;
				if (local21.anIntArray147.length > arg0.anInt2200 && local21.anIntArray143[arg0.anInt2200] < arg0.anInt2212) {
					arg0.anInt2212 = 1;
					arg0.anInt2200++;
				}
				if (arg0.anInt2200 >= local21.anIntArray147.length) {
					arg0.anInt2212 = 0;
					arg0.anInt2200 = 0;
				}
			}
		}
		if (arg0.anInt2222 != -1 && arg0.anInt2183 <= Static7.anInt176) {
			if (arg0.anInt2206 < 0) {
				arg0.anInt2206 = 0;
			}
			@Pc(106) int local106 = Static48.method985(arg0.anInt2222).anInt1428;
			if (local106 == -1) {
				arg0.anInt2222 = -1;
			} else {
				@Pc(118) Class1_Sub1_Sub8 local118 = Static18.method249(local106);
				if (local118 == null || local118.anIntArray147 == null) {
					arg0.anInt2222 = -1;
				} else {
					arg0.anInt2226++;
					if (arg0.anInt2206 < local118.anIntArray147.length && local118.anIntArray143[arg0.anInt2206] < arg0.anInt2226) {
						arg0.anInt2226 = 1;
						arg0.anInt2206++;
					}
					if (arg0.anInt2206 >= local118.anIntArray147.length && (arg0.anInt2206 < 0 || arg0.anInt2206 >= local118.anIntArray147.length)) {
						arg0.anInt2222 = -1;
					}
				}
			}
		}
		if (arg0.anInt2213 != -1 && arg0.anInt2205 <= 1) {
			local21 = Static18.method249(arg0.anInt2213);
			if (local21.anInt1068 == 1 && arg0.anInt2177 > 0 && Static7.anInt176 >= arg0.anInt2221 && arg0.anInt2218 < Static7.anInt176) {
				arg0.anInt2205 = 1;
				return;
			}
		}
		if (arg0.anInt2213 != -1 && arg0.anInt2205 == 0) {
			local21 = Static18.method249(arg0.anInt2213);
			if (local21 == null || local21.anIntArray147 == null) {
				arg0.anInt2213 = -1;
			} else {
				arg0.anInt2215++;
				if (local21.anIntArray147.length > arg0.anInt2201 && local21.anIntArray143[arg0.anInt2201] < arg0.anInt2215) {
					arg0.anInt2215 = 1;
					arg0.anInt2201++;
				}
				if (arg0.anInt2201 >= local21.anIntArray147.length) {
					arg0.anInt2219++;
					arg0.anInt2201 -= local21.anInt1074;
					if (arg0.anInt2219 >= local21.anInt1069) {
						arg0.anInt2213 = -1;
					}
					if (arg0.anInt2201 < 0 || arg0.anInt2201 >= local21.anIntArray147.length) {
						arg0.anInt2213 = -1;
					}
				}
				arg0.aBoolean104 = local21.aBoolean61;
			}
		}
		if (arg0.anInt2205 > 0) {
			arg0.anInt2205--;
		}
	}
}
