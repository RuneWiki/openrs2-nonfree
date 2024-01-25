import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt3186;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method2581() {
		if (Static300.anInt5112 == 0) {
			return;
		}
		try {
			if (++Static19.anInt321 > 2000) {
				if (Static6.aClass130_1 != null) {
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
				}
				if (Static288.anInt4949 >= 1) {
					Static300.anInt5112 = 0;
					Static324.anInt2339 = -5;
					return;
				}
				Static288.anInt4949++;
				Static300.anInt5112 = 1;
				if (Static91.anInt1662 == Static394.anInt6422) {
					Static394.anInt6422 = Static128.anInt2264;
				} else {
					Static394.anInt6422 = Static91.anInt1662;
				}
				Static19.anInt321 = 0;
			}
			if (Static300.anInt5112 == 1) {
				Static41.aClass112_1 = Static341.aClass162_5.method3289(Static394.anInt6422, Static314.aString60);
				Static300.anInt5112 = 2;
			}
			@Pc(120) int local120;
			if (Static300.anInt5112 == 2) {
				if (Static41.aClass112_1.anInt2969 == 2) {
					throw new IOException();
				}
				if (Static41.aClass112_1.anInt2969 != 1) {
					return;
				}
				Static6.aClass130_1 = new Class130((Socket) Static41.aClass112_1.anObject5, Static341.aClass162_5);
				Static41.aClass112_1 = null;
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				local120 = Static6.aClass130_1.method2672();
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				if (local120 != 21) {
					Static324.anInt2339 = local120;
					Static300.anInt5112 = 0;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					return;
				}
				Static300.anInt5112 = 3;
			}
			if (Static300.anInt5112 == 3) {
				if (Static6.aClass130_1.method2675() < 1) {
					return;
				}
				Static183.aStringArray23 = new String[Static6.aClass130_1.method2672()];
				Static300.anInt5112 = 4;
			}
			if (Static300.anInt5112 == 4 && Static6.aClass130_1.method2675() >= Static183.aStringArray23.length * 8) {
				Static139.aClass1_Sub33_Sub2_1.lb = 0;
				Static6.aClass130_1.method2666(Static183.aStringArray23.length * 8, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
				for (local120 = 0; local120 < Static183.aStringArray23.length; local120++) {
					Static183.aStringArray23[local120] = Static73.method1168(Static139.aClass1_Sub33_Sub2_1.method5178());
				}
				Static324.anInt2339 = 21;
				Static300.anInt5112 = 0;
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
			}
		} catch (@Pc(222) IOException local222) {
			if (Static6.aClass130_1 != null) {
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
			}
			if (Static288.anInt4949 < 1) {
				if (Static91.anInt1662 == Static394.anInt6422) {
					Static394.anInt6422 = Static128.anInt2264;
				} else {
					Static394.anInt6422 = Static91.anInt1662;
				}
				Static19.anInt321 = 0;
				Static300.anInt5112 = 1;
				Static288.anInt4949++;
			} else {
				Static300.anInt5112 = 0;
				Static324.anInt2339 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZBIII)V")
	public static void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static25.aClass132ArrayArrayArray1 == null) {
			Static66.aClass164_2.method5343(arg3, -16777216, arg0, arg4, arg2);
		} else if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >= 0 && Static92.anInt1675 * 128 > Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 && Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >= 0 && Static262.anInt6340 * 128 > Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077) {
			Static32.anInt649++;
			if (Static321.aClass25_Sub1_Sub1_Sub1_2 != null && Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 + 64 - Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 64 >> 7 == Static190.anInt3337 && Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 + 64 - Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 64 >> 7 == Static76.anInt5658) {
				Static76.anInt5658 = -1;
				Static190.anInt3337 = -1;
				Static308.method4585();
			}
			Static247.method3682();
			if (!arg1) {
				Static284.method4332();
			}
			Static188.method2684();
			Static230.method5273(arg4, arg0, arg3, arg2, true);
			@Pc(119) int local119 = Static14.anInt204;
			@Pc(125) int local125 = Static312.anInt5337;
			@Pc(127) int local127 = Static299.anInt5993;
			@Pc(129) int local129 = Static5.anInt65;
			@Pc(137) int local137;
			@Pc(178) int local178;
			if (Static323.anInt5463 == 1) {
				local137 = (int) Static19.aFloat1;
				if (local137 < Static177.anInt1356 >> 8) {
					local137 = Static177.anInt1356 >> 8;
				}
				if (Static50.aBooleanArray4[4] && local137 < Static305.anIntArray613[4] + 128) {
					local137 = Static305.anIntArray613[4] + 128;
				}
				local178 = Static284.anInt4918 + (int) Static386.aFloat82 & 0x3FFF;
				Static281.method4291((local137 >> 3) * 3 + 600, Static305.anInt5159, local178, local137, Static92.anInt1674, local127, Static236.method3260(Static122.anInt2188, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080) - 50);
			} else if (Static323.anInt5463 == 4) {
				local137 = (int) Static19.aFloat1;
				if (local137 < Static177.anInt1356 >> 8) {
					local137 = Static177.anInt1356 >> 8;
				}
				if (Static50.aBooleanArray4[4] && Static305.anIntArray613[4] + 128 > local137) {
					local137 = Static305.anIntArray613[4] + 128;
				}
				local178 = (int) Static386.aFloat82 & 0x3FFF;
				Static281.method4291((local137 >> 3) * 3 + 600, Static305.anInt5159, local178, local137, Static92.anInt1674, local127, Static236.method3260(Static122.anInt2188, Static16.anInt287, Static85.anInt1570) - 50);
			} else if (Static323.anInt5463 == 5) {
				Static170.method2509(local127);
			}
			local137 = Static256.anInt4409;
			local178 = Static337.anInt5598;
			@Pc(280) int local280 = Static133.anInt2471;
			@Pc(282) int local282 = Static311.anInt5293;
			@Pc(284) int local284 = Static155.anInt2834;
			@Pc(328) int local328;
			for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
				if (Static50.aBooleanArray4[local286]) {
					local328 = (int) ((double) -Static348.anIntArray713[local286] + Math.random() * (double) (Static348.anIntArray713[local286] * 2 + 1) + Math.sin((double) Static101.anIntArray230[local286] * ((double) Static102.anIntArray371[local286] / 100.0D)) * (double) Static305.anIntArray613[local286]);
					if (local286 == 2) {
						Static133.anInt2471 += local328;
					}
					if (local286 == 3) {
						Static155.anInt2834 = local328 + Static155.anInt2834 & 0x3FFF;
					}
					if (local286 == 0) {
						Static256.anInt4409 += local328;
					}
					if (local286 == 4) {
						Static311.anInt5293 += local328;
						if (Static311.anInt5293 < 1024) {
							Static311.anInt5293 = 1024;
						} else if (Static311.anInt5293 > 3072) {
							Static311.anInt5293 = 3072;
						}
					}
					if (local286 == 1) {
						Static337.anInt5598 += local328;
					}
				}
			}
			if (Static256.anInt4409 < 0) {
				Static256.anInt4409 = 0;
			}
			if (Static133.anInt2471 < 0) {
				Static133.anInt2471 = 0;
			}
			if (Static256.anInt4409 > (Static19.anInt329 << 7) - 1) {
				Static256.anInt4409 = (Static19.anInt329 << 7) - 1;
			}
			if (Static133.anInt2471 > (Static230.anInt6113 << 7) - 1) {
				Static133.anInt2471 = (Static230.anInt6113 << 7) - 1;
			}
			Static300.method4493();
			Static40.method625();
			Static66.aClass164_2.method5313(local125, local119, local129 + local125, local127 + local119);
			Static66.aClass164_2.method5376();
			local328 = Static196.anInt3485;
			if (Static177.aClass33_3 == null) {
				Static66.aClass164_2.method5402(local328);
			} else {
				Static177.aClass33_3.method562(local125, Static66.aClass164_2, local328, Static155.anInt2834, local119, Static177.anInt1347 << 3, local129, Static311.anInt5293, local127);
			}
			Static44.method683();
			Static112.aClass127_3.method5272(Static256.anInt4409, Static337.anInt5598, Static133.anInt2471, -Static311.anInt5293 & 0x3FFF, -Static155.anInt2834 & 0x3FFF, -Static11.anInt3597 & 0x3FFF);
			Static66.aClass164_2.method5357(Static112.aClass127_3);
			Static66.aClass164_2.method5329(local129 / 2 + local125, local119 + local127 / 2, Static84.anInt1552 << 1, Static84.anInt1552 << 1);
			Static366.method5067(local125 + local129 / 2, Static84.anInt1552 << 1, Static84.anInt1552 << 1, local127 / 2 + local119);
			Static68.method1133(-Static311.anInt5293 & 0x3FFF, Static337.anInt5598, Static133.anInt2471, -Static155.anInt2834 & 0x3FFF, Static256.anInt4409, -Static11.anInt3597 & 0x3FFF);
			@Pc(556) byte local556 = Static188.aClass135_Sub1_1.method2751(Static25.anInt394) == 2 ? (byte) Static32.anInt649 : 1;
			Static390.method5535(Static66.aClass164_2, Static366.anInt5883, Static37.anInt719, Static112.aClass127_3, Static256.anInt4409, Static337.anInt5598, Static133.anInt2471, Static383.aByteArrayArrayArray17, Static223.anIntArray479, Static81.anIntArray196, Static275.anIntArray581, Static371.anIntArray329, Static277.anIntArray586, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 + 1, local556, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7, !Static188.aClass135_Sub1_1.aBoolean322);
			Static44.method683();
			if (Static142.anInt2665 == 30) {
				Static145.method2194(local129, local119, local125, local127);
				Static233.method3207(local119, local129, local127, local125);
				Static153.method2317(local125, local119, local127, local129);
				Static337.method4818(local125, local127, local129, local119);
			}
			Static361.method5010();
			Static337.anInt5598 = local178;
			Static311.anInt5293 = local282;
			Static133.anInt2471 = local280;
			Static155.anInt2834 = local284;
			Static256.anInt4409 = local137;
			if (Static99.aBoolean153 && Static73.aClass92_1.method1781() == 0) {
				Static99.aBoolean153 = false;
			}
			if (Static99.aBoolean153) {
				Static66.aClass164_2.method5343(local127, -16777216, local119, local125, local129);
				Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952), Static334.aClass137_7, false);
			}
		} else {
			Static66.aClass164_2.method5343(arg3, -16777216, arg0, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)I")
	public static int method2585() {
		return Static213.anInt3655;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
	public static void method2587(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static352.anInt5753 != -1) {
				Static147.method2204(Static352.anInt5753);
			}
			for (@Pc(18) Class1_Sub38 local18 = (Class1_Sub38) Static22.aClass77_29.method1359(); local18 != null; local18 = (Class1_Sub38) Static22.aClass77_29.method1360()) {
				if (!local18.method5576()) {
					local18 = (Class1_Sub38) Static22.aClass77_29.method1359();
					if (local18 == null) {
						break;
					}
				}
				Static229.method3190(false, local18, true);
			}
			Static352.anInt5753 = -1;
			Static22.aClass77_29 = new Class77(8);
			Static36.method560();
			Static352.anInt5753 = Static160.anInt2901;
			Static195.method5584(false);
			Static262.method5507();
			Static387.method5494(Static352.anInt5753);
		}
		Static374.method5255();
		Static283.anInt4904 = -1;
		Static310.method4627(Static157.anInt2870);
		Static321.aClass25_Sub1_Sub1_Sub1_2 = new Class25_Sub1_Sub1_Sub1();
		Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 = 6656;
		Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0] = 52;
		Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 = 6656;
		Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0] = 52;
		Static133.anInt2471 = 0;
		Static256.anInt4409 = 0;
		if (Static323.anInt5463 == 2) {
			Static256.anInt4409 = Static17.anInt306 << 7;
			Static133.anInt2471 = Static360.anInt3947 << 7;
		} else {
			Static123.method4613();
		}
		Static146.method2198();
		if (Static256.anInt4409 == 0 || Static133.anInt2471 == 0) {
			Static212.method2974(10);
		} else {
			Static246.method3675();
			Static212.method2974(28);
		}
	}
}
