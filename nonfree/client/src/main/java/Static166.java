import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lclient!th;")
	public static Class168 aClass168_124;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Lclient!jl;")
	public static Class89 aClass89_23 = new Class89(64);

	@OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
	public static int anInt3743 = 3;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "[I")
	public static int[] anIntArray336 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Lclient!ki;")
	public static Class14 method2721() {
		try {
			return new Class14_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class14) Class.forName("Class14_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class14_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method2722(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(36) int local36 = arg1[arg0 + local20] & 0xFF;
			if (local36 != 0) {
				if (local36 >= 128 && local36 < 160) {
					@Pc(55) char local55 = Static149.aCharArray4[local36 - 128];
					if (local55 == '\u0000') {
						local55 = '?';
					}
					local36 = local55;
				}
				local8[local10++] = (char) local36;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIIIII)V")
	public static void method2724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static293.anInt5867 = 0;
		@Pc(17) int local17;
		@Pc(101) int local101;
		@Pc(225) Class1_Sub3_Sub13[] local225;
		@Pc(292) int local292;
		@Pc(348) int local348;
		@Pc(266) int local266;
		@Pc(280) int local280;
		for (local17 = -1; local17 < Static147.anInt3287 + Static16.anInt461; local17++) {
			@Pc(24) Class145 local24 = null;
			@Pc(31) Class2_Sub4 local31;
			if (local17 < 0) {
				local31 = Static56.aClass2_Sub4_Sub2_1;
			} else if (local17 < Static16.anInt461) {
				local31 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local17]];
			} else {
				local31 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local17 - Static16.anInt461]];
				local24 = ((Class2_Sub4_Sub1) local31).aClass145_1;
				if (local24.anIntArray455 != null) {
					local24 = local24.method3711();
					if (local24 == null) {
						continue;
					}
				}
			}
			if (local31.method2100()) {
				Static170.method2763(local31.method2098(), arg3 >> 1, arg0 >> 1, local31, arg1, arg4);
				if (Static18.anInt482 >= 0) {
					if (!local31.aBoolean180) {
						local101 = arg2 + Static264.anInt5305;
						@Pc(182) Class1_Sub3_Sub13 local182;
						if (local17 < Static16.anInt461) {
							@Pc(111) Class2_Sub4_Sub2 local111 = (Class2_Sub4_Sub2) local31;
							if (local111.anInt2865 != -1 || local111.anInt2858 != -1) {
								if (local111.anInt2865 != -1) {
									local101 -= 25;
									Static198.aClass1_Sub3_Sub13Array10[local111.anInt2865].method4204(arg5 + Static18.anInt482 - 12, local101);
									local101 -= 2;
								}
								if (local111.anInt2858 != -1) {
									local101 -= 25;
									Static302.aClass1_Sub3_Sub13Array12[local111.anInt2858].method4204(arg5 + Static18.anInt482 - 12, local101);
									local101 -= 2;
								}
							}
						} else if (local24.anInt4934 >= 0 && Static302.aClass1_Sub3_Sub13Array12.length > local24.anInt4934) {
							local182 = Static302.aClass1_Sub3_Sub13Array12[local24.anInt4934];
							local101 -= 25;
							local182.method4204(Static18.anInt482 + arg5 - (local182.anInt5571 >> 1), local101);
							local101 -= 2;
						}
						if (local31.anInt2769 > Static133.anInt3061) {
							local182 = Static23.aClass1_Sub3_Sub13Array3[0];
							@Pc(209) Class1_Sub3_Sub13 local209 = Static23.aClass1_Sub3_Sub13Array3[1];
							if (local31 instanceof Class2_Sub4_Sub1) {
								@Pc(215) Class2_Sub4_Sub1 local215 = (Class2_Sub4_Sub1) local31;
								local225 = (Class1_Sub3_Sub13[]) Static46.aClass89_7.method2268((long) local215.aClass145_1.anInt4917);
								if (local225 == null) {
									local225 = Static83.method1431(local215.aClass145_1.anInt4917, Static277.aClass168_188);
									if (local225 != null) {
										Static46.aClass89_7.method2272((long) local215.aClass145_1.anInt4917, local225);
									}
								}
								if (local225 != null && local225.length == 2) {
									local182 = local225[0];
									local209 = local225[1];
								}
							}
							local266 = local182.anInt5573;
							local101 -= local266;
							local280 = arg5 + Static18.anInt482 - (local182.anInt5571 >> 1);
							local182.method4204(local280, local101);
							local292 = local31.anInt2807 * local182.anInt5571 / 255;
							if (Static294.aBoolean367) {
								Static156.method2534(local280, local101, local280 + local292, local266 + local101);
							} else {
								Static231.method3629(local280, local101, local280 + local292, local266 + local101);
							}
							local209.method4204(local280, local101);
							if (Static294.aBoolean367) {
								Static156.method2546(arg5, arg2, arg5 + arg0, arg3 + arg2);
							} else {
								Static231.method3634(arg5, arg2, arg0 + arg5, arg2 + arg3);
							}
							local101 -= 2;
						}
						@Pc(350) Class64[] local350;
						@Pc(364) Class64 local364;
						@Pc(386) Class1_Sub3_Sub13 local386;
						if (!(local31 instanceof Class2_Sub4_Sub2)) {
							local348 = 0;
							local350 = Static170.aClass64Array1;
							for (local266 = 0; local266 < local350.length; local266++) {
								local364 = local350[local266];
								if (local364 != null && local364.anInt2092 == 1 && local364.anInt2090 == Static100.anIntArray224[local17 - Static16.anInt461]) {
									local386 = Static82.aClass1_Sub3_Sub13Array5[local364.anInt2094];
									if (local386.anInt5573 > local348) {
										local348 = local386.anInt5573;
									}
									if (Static133.anInt3061 % 20 < 10) {
										local386.method4204(Static18.anInt482 + arg5 - 12, local101 - local386.anInt5573);
									}
								}
							}
							if (local348 > 0) {
								local101 -= local348 + 2;
							}
						} else if (local17 >= 0) {
							local348 = 0;
							local266 = 0;
							local350 = Static170.aClass64Array1;
							while (local266 < local350.length) {
								local364 = local350[local266];
								if (local364 != null && local364.anInt2092 == 10 && Static304.anIntArray533[local17] == local364.anInt2090) {
									local386 = Static82.aClass1_Sub3_Sub13Array5[local364.anInt2094];
									if (local348 < local386.anInt5573) {
										local348 = local386.anInt5573;
									}
									local386.method4204(Static18.anInt482 + arg5 - 12, -local386.anInt5573 + local101);
								}
								local266++;
							}
							if (local348 > 0) {
								local101 -= local348 + 2;
							}
						}
						if (!local31.aBoolean175 && local31.aString177 != null && (Static16.anInt461 <= local17 || Static248.anInt5062 == 0 || Static248.anInt5062 == 3 || Static248.anInt5062 == 1 && Static168.method2742(((Class2_Sub4_Sub2) local31).aString182)) && Static172.anInt3879 > Static293.anInt5867) {
							Static172.anIntArray349[Static293.anInt5867] = Static176.aClass1_Sub3_Sub5_2.method3510(local31.aString177) / 2;
							Static172.anIntArray347[Static293.anInt5867] = Static176.aClass1_Sub3_Sub5_2.anInt4730;
							local101 -= Static172.anIntArray347[Static293.anInt5867];
							Static172.anIntArray345[Static293.anInt5867] = Static18.anInt482;
							Static172.anIntArray348[Static293.anInt5867] = local101;
							local101 -= 2;
							Static172.anIntArray351[Static293.anInt5867] = local31.anInt2801;
							Static172.anIntArray346[Static293.anInt5867] = local31.anInt2771;
							Static172.anIntArray350[Static293.anInt5867] = local31.anInt2836;
							Static172.aStringArray33[Static293.anInt5867] = local31.aString177;
							Static293.anInt5867++;
						}
						local31.anInt2779 = local101;
					}
					for (local101 = 0; local101 < 4; local101++) {
						if (local31.anIntArray284[local101] > Static133.anInt3061) {
							local348 = local31.method2098() / 2;
							Static170.method2763(local348, arg3 >> 1, arg0 >> 1, local31, arg1, arg4);
							if (Static18.anInt482 > -1) {
								if (local101 == 1) {
									Static264.anInt5305 -= 20;
								}
								if (local101 == 2) {
									Static18.anInt482 -= 15;
									Static264.anInt5305 -= 10;
								}
								if (local101 == 3) {
									Static264.anInt5305 -= 10;
									Static18.anInt482 += 15;
								}
								Static117.aClass1_Sub3_Sub13Array11[local31.anIntArray282[local101]].method4204(arg5 + Static18.anInt482 - 12, arg2 - (-Static264.anInt5305 - -12));
								Static160.aClass1_Sub3_Sub5_1.method3499(Integer.toString(local31.anIntArray285[local101]), arg5 + Static18.anInt482 - 1, Static264.anInt5305 + arg2 + 3, 16777215, 0);
							}
						}
					}
				}
			}
		}
		@Pc(828) int local828;
		@Pc(719) int local719;
		for (local17 = 0; local17 < Static205.anInt4443; local17++) {
			local719 = Static27.anIntArray393[local17];
			@Pc(728) Class2_Sub4 local728;
			if (local719 < 2048) {
				local728 = Static155.aClass2_Sub4_Sub2Array1[local719];
			} else {
				local719 -= 2048;
				local728 = Static105.aClass2_Sub4_Sub1Array1[local719];
			}
			local101 = Static260.anIntArray478[local17];
			@Pc(748) Class2_Sub4 local748;
			if (local101 < 2048) {
				local748 = Static155.aClass2_Sub4_Sub2Array1[local101];
			} else {
				local101 -= 2048;
				local748 = Static105.aClass2_Sub4_Sub1Array1[local101];
			}
			@Pc(759) int local759 = local748.method2102();
			if (local759 != -1) {
				@Pc(772) Class1_Sub3_Sub13 local772 = (Class1_Sub3_Sub13) Static203.aClass89_45.method2268((long) local759);
				if (local772 == null) {
					local225 = Static83.method1431(local759, Static277.aClass168_188);
					if (local225 != null) {
						local772 = local225[0];
						Static203.aClass89_45.method2272((long) local759, local772);
					}
				}
				if (local772 != null) {
					local280 = local728.anInt2835++;
					Static21.method455(local728.anInt2794, arg3 >> 1, local728.anInt2846, local728.method2088() * 64, 0, arg4, arg0 >> 1, arg1);
					local828 = Static264.anInt5305 - 70;
					@Pc(836) int local836 = local828 + local280 % 4 * 18;
					local292 = Static18.anInt482 + arg5 - 18;
					local292 += local280 / 4 * 18;
					local772.method4204(local292, local836);
					if (local728 == local748) {
						if (Static294.aBoolean367) {
							Static156.method2540(local292 - 1, local836 + -1, 18, 18, 16776960);
						} else {
							Static231.method3626(local292 - 1, local836 - 1, 18, 18, 16776960);
						}
					}
					if (Static57.anInt6304 >= local292 && Static57.anInt6304 < local772.anInt5571 + local292 && Static107.anInt1674 >= local836 && local772.anInt5573 + local836 > Static107.anInt1674) {
						if (local748 instanceof Class2_Sub4_Sub2) {
							Static95.aLongArray4[0] = (long) local101 << 32;
						} else {
							Static95.aLongArray4[0] = Static223.method3538(536870912L, (long) local101 << 32);
						}
						Static88.aBoolean140 = false;
						Static38.anInt947 = 1;
					}
				}
			}
			if (local748.aString177 != null && (local748 instanceof Class2_Sub4_Sub1 || Static248.anInt5062 == 0 || Static248.anInt5062 == 3 || Static248.anInt5062 == 1 && Static168.method2742(((Class2_Sub4_Sub2) local748).aString182)) && Static172.anInt3879 > Static293.anInt5867) {
				Static170.method2763(0, arg3 >> 1, arg0 >> 1, local728, arg1, arg4);
				local266 = local728.anInt2779;
				Static172.anIntArray349[Static293.anInt5867] = Static176.aClass1_Sub3_Sub5_2.method3510(local748.aString177) / 2;
				Static172.anIntArray347[Static293.anInt5867] = Static176.aClass1_Sub3_Sub5_2.anInt4730;
				local266 -= Static172.anIntArray347[Static293.anInt5867];
				Static172.anIntArray345[Static293.anInt5867] = Static18.anInt482;
				Static172.anIntArray348[Static293.anInt5867] = local266;
				Static172.anIntArray351[Static293.anInt5867] = local748.anInt2801;
				local266 -= 2;
				Static172.anIntArray346[Static293.anInt5867] = local748.anInt2771;
				Static172.anIntArray350[Static293.anInt5867] = local748.anInt2836;
				Static172.aStringArray33[Static293.anInt5867] = local748.aString177;
				Static293.anInt5867++;
			}
		}
		for (local17 = 0; local17 < Static293.anInt5867; local17++) {
			@Pc(1046) int local1046 = Static172.anIntArray348[local17];
			local719 = Static172.anIntArray345[local17];
			@Pc(1052) boolean local1052 = true;
			local348 = Static172.anIntArray347[local17];
			local101 = Static172.anIntArray349[local17];
			while (local1052) {
				local1052 = false;
				for (local266 = 0; local266 < local17; local266++) {
					if (Static172.anIntArray348[local266] - Static172.anIntArray347[local266] < local1046 + 2 && local1046 - local348 < Static172.anIntArray348[local266] - -2 && Static172.anIntArray345[local266] + Static172.anIntArray349[local266] > local719 - local101 && Static172.anIntArray345[local266] - Static172.anIntArray349[local266] < local719 + local101 && Static172.anIntArray348[local266] - Static172.anIntArray347[local266] < local1046) {
						local1052 = true;
						local1046 = Static172.anIntArray348[local266] - Static172.anIntArray347[local266];
					}
				}
			}
			Static18.anInt482 = Static172.anIntArray345[local17];
			Static264.anInt5305 = Static172.anIntArray348[local17] = local1046;
			@Pc(1169) String local1169 = Static172.aStringArray33[local17];
			if (Static111.anInt2434 == 0) {
				local280 = 16776960;
				if (Static172.anIntArray351[local17] < 6) {
					local280 = Static49.anIntArray147[Static172.anIntArray351[local17]];
				}
				if (Static172.anIntArray351[local17] == 6) {
					local280 = Static207.anInt4467 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static172.anIntArray351[local17] == 7) {
					local280 = Static207.anInt4467 % 20 < 10 ? 255 : 65535;
				}
				if (Static172.anIntArray351[local17] == 8) {
					local280 = Static207.anInt4467 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static172.anIntArray351[local17] == 9) {
					local292 = 150 - Static172.anIntArray350[local17];
					if (local292 < 50) {
						local280 = local292 * 1280 + 16711680;
					} else if (local292 < 100) {
						local280 = 16776960 + 16384000 - local292 * 327680;
					} else if (local292 < 150) {
						local280 = (local292 - 100) * 5 + 65280;
					}
				}
				if (Static172.anIntArray351[local17] == 10) {
					local292 = 150 - Static172.anIntArray350[local17];
					if (local292 < 50) {
						local280 = local292 * 5 + 16711680;
					} else if (local292 < 100) {
						local280 = 16711935 - (local292 - 50) * 327680;
					} else if (local292 < 150) {
						local280 = (local292 - 100) * 327680 + 255 - (local292 + -100) * 5;
					}
				}
				if (Static172.anIntArray351[local17] == 11) {
					local292 = 150 - Static172.anIntArray350[local17];
					if (local292 < 50) {
						local280 = 16777215 - local292 * 327685;
					} else if (local292 < 100) {
						local280 = (local292 - 50) * 327685 + 65280;
					} else if (local292 < 150) {
						local280 = 49545215 - local292 * 327680;
					}
				}
				if (Static172.anIntArray346[local17] == 0) {
					Static176.aClass1_Sub3_Sub5_2.method3499(local1169, arg5 + Static18.anInt482, arg2 + Static264.anInt5305, local280, 0);
				}
				if (Static172.anIntArray346[local17] == 1) {
					Static176.aClass1_Sub3_Sub5_2.method3518(local1169, Static18.anInt482 + arg5, Static264.anInt5305 + arg2, local280, Static207.anInt4467);
				}
				if (Static172.anIntArray346[local17] == 2) {
					Static176.aClass1_Sub3_Sub5_2.method3500(local1169, Static18.anInt482 + arg5, arg2 + Static264.anInt5305, local280, Static207.anInt4467);
				}
				if (Static172.anIntArray346[local17] == 3) {
					Static176.aClass1_Sub3_Sub5_2.method3513(local1169, Static18.anInt482 + arg5, Static264.anInt5305 + arg2, local280, Static207.anInt4467, 150 - Static172.anIntArray350[local17]);
				}
				if (Static172.anIntArray346[local17] == 4) {
					local292 = (150 - Static172.anIntArray350[local17]) * (Static176.aClass1_Sub3_Sub5_2.method3510(local1169) + 100) / 150;
					if (Static294.aBoolean367) {
						Static156.method2534(Static18.anInt482 + arg5 - 50, arg2, arg5 + Static18.anInt482 + 50, arg2 + arg3);
					} else {
						Static231.method3629(arg5 + Static18.anInt482 - 50, arg2, Static18.anInt482 + arg5 + 50, arg3 + arg2);
					}
					Static176.aClass1_Sub3_Sub5_2.method3503(local1169, Static18.anInt482 + arg5 + 50 - local292, arg2 + Static264.anInt5305, local280, 0);
					if (Static294.aBoolean367) {
						Static156.method2546(arg5, arg2, arg5 + arg0, arg3 + arg2);
					} else {
						Static231.method3634(arg5, arg2, arg5 + arg0, arg3 + arg2);
					}
				}
				if (Static172.anIntArray346[local17] == 5) {
					local292 = 150 - Static172.anIntArray350[local17];
					if (Static294.aBoolean367) {
						Static156.method2534(arg5, Static264.anInt5305 + arg2 - Static176.aClass1_Sub3_Sub5_2.anInt4730 - 1, arg0 + arg5, Static264.anInt5305 + arg2 + 5);
					} else {
						Static231.method3629(arg5, arg2 + Static264.anInt5305 - Static176.aClass1_Sub3_Sub5_2.anInt4730 - 1, arg0 + arg5, arg2 + Static264.anInt5305 + 5);
					}
					local828 = 0;
					if (local292 < 25) {
						local828 = local292 - 25;
					} else if (local292 > 125) {
						local828 = local292 - 125;
					}
					Static176.aClass1_Sub3_Sub5_2.method3499(local1169, Static18.anInt482 + arg5, Static264.anInt5305 + arg2 + local828, local280, 0);
					if (Static294.aBoolean367) {
						Static156.method2546(arg5, arg2, arg0 + arg5, arg2 + arg3);
					} else {
						Static231.method3634(arg5, arg2, arg5 + arg0, arg2 - -arg3);
					}
				}
			} else {
				Static176.aClass1_Sub3_Sub5_2.method3499(local1169, Static18.anInt482 + arg5, Static264.anInt5305 + arg2, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)Lclient!kc;")
	public static Class92 method2725(@OriginalArg(1) int arg0) {
		@Pc(10) Class92 local10 = (Class92) Static313.aClass89_52.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static87.aClass168_67.method4058(Static265.method4020(arg0), Static107.method1256(arg0));
		local10 = new Class92();
		local10.anInt3230 = arg0;
		if (local25 != null) {
			local10.method2328(new Class1_Sub14(local25));
		}
		local10.method2332();
		if (!Static121.aBoolean159 && local10.aBoolean201) {
			local10.aStringArray28 = null;
		}
		if (local10.aBoolean202) {
			local10.anInt3202 = 0;
			local10.aBoolean210 = false;
		}
		Static313.aClass89_52.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)Z")
	public static boolean method2727() {
		try {
			if (Static9.anInt285 == 2) {
				if (Static222.aClass1_Sub26_2 == null) {
					Static222.aClass1_Sub26_2 = Static323.method3869(Static254.aClass168_172, Static203.anInt5699, Static295.anInt5889);
					if (Static222.aClass1_Sub26_2 == null) {
						return false;
					}
				}
				if (Static168.aClass90_1 == null) {
					Static168.aClass90_1 = new Class90(Static188.aClass168_140, Static176.aClass168_129);
				}
				if (Static2.aClass1_Sub10_Sub3_1.method3163(Static222.aClass1_Sub26_2, Static168.aClass90_1, Static157.aClass168_116)) {
					Static2.aClass1_Sub10_Sub3_1.method3157();
					Static2.aClass1_Sub10_Sub3_1.method3179(Static296.anInt5906);
					Static2.aClass1_Sub10_Sub3_1.method3158(Static190.aBoolean261, Static222.aClass1_Sub26_2);
					Static222.aClass1_Sub26_2 = null;
					Static254.aClass168_172 = null;
					Static168.aClass90_1 = null;
					Static9.anInt285 = 0;
					return true;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static2.aClass1_Sub10_Sub3_1.method3175();
			Static168.aClass90_1 = null;
			Static222.aClass1_Sub26_2 = null;
			Static9.anInt285 = 0;
			Static254.aClass168_172 = null;
		}
		return false;
	}
}
