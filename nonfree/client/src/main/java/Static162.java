import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "Lclient!nk;")
	public static Class2_Sub3_Sub5 aClass2_Sub3_Sub5_2;

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "[I")
	public static int[] anIntArray257 = new int[2];

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
	public static int anInt3417 = 0;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Loaded input handler";

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
	public static void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class50 local13 = local7.aClass50_1;
		if (local13 != null) {
			local13.anInt1321 = local13.anInt1321 * arg3 / 16;
			local13.anInt1318 = local13.anInt1318 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public static void method2815() {
		if (Static197.aClass2_Sub3_Sub18_2 == null) {
			return;
		}
		if (Static20.anInt1234 < 10) {
			if (!Static214.aClass84_96.method2117(Static197.aClass2_Sub3_Sub18_2.aString183)) {
				Static20.anInt1234 = Static164.aClass84_65.method2135(Static197.aClass2_Sub3_Sub18_2.aString183) / 10;
				return;
			}
			Static144.method2548();
			Static20.anInt1234 = 10;
		}
		if (Static20.anInt1234 == 10) {
			Static239.anInt4870 = Static197.aClass2_Sub3_Sub18_2.anInt3696 >> 6 << 6;
			Static115.anInt2461 = Static197.aClass2_Sub3_Sub18_2.anInt3691 >> 6 << 6;
			Static52.anInt1205 = (Static197.aClass2_Sub3_Sub18_2.anInt3695 >> 6 << 6) + 64 - Static239.anInt4870;
			Static142.anInt3081 = (Static197.aClass2_Sub3_Sub18_2.anInt3693 >> 6 << 6) + 64 - Static115.anInt2461;
			@Pc(94) int[] local94 = Static197.aClass2_Sub3_Sub18_2.method2981(Static125.anInt5772 + (Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7), Static208.anInt4335, Static203.anInt4236 + (Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7));
			@Pc(96) int local96 = -1;
			@Pc(98) int local98 = -1;
			if (local94 != null) {
				local96 = local94[1] - Static115.anInt2461;
				local98 = Static239.anInt4870 + Static52.anInt1205 - local94[2] - 1;
			}
			if (local96 >= 0 && local96 < Static142.anInt3081 && local98 >= 0 && Static52.anInt1205 > local98) {
				local98 += (int) (Math.random() * 10.0D) - 5;
				local96 += (int) (Math.random() * 10.0D) - 5;
				Static61.anInt2999 = local98;
				Static219.anInt4587 = local96;
			} else {
				@Pc(173) int[] local173;
				if (Static41.anInt1020 == -1 || Static61.anInt2996 == -1) {
					local173 = Static197.aClass2_Sub3_Sub18_2.method2977(Static197.aClass2_Sub3_Sub18_2.anInt3687 & 0x3FFF, Static197.aClass2_Sub3_Sub18_2.anInt3687 >> 14 & 0x3FFF);
					Static219.anInt4587 = local173[1] - Static115.anInt2461;
					Static61.anInt2999 = Static239.anInt4870 + Static52.anInt1205 - local173[2] - 1;
				} else {
					local173 = Static197.aClass2_Sub3_Sub18_2.method2977(Static61.anInt2996, Static41.anInt1020);
					Static61.anInt2996 = -1;
					Static41.anInt1020 = -1;
					if (local173 != null) {
						Static219.anInt4587 = local173[1] - Static115.anInt2461;
						Static61.anInt2999 = Static239.anInt4870 + Static52.anInt1205 - local173[2] - 1;
					}
				}
			}
			if (Static197.aClass2_Sub3_Sub18_2.anInt3692 == 37) {
				Static280.aFloat55 = 3.0F;
				Static92.aFloat22 = 3.0F;
			} else if (Static197.aClass2_Sub3_Sub18_2.anInt3692 == 50) {
				Static280.aFloat55 = 4.0F;
				Static92.aFloat22 = 4.0F;
			} else if (Static197.aClass2_Sub3_Sub18_2.anInt3692 == 75) {
				Static280.aFloat55 = 6.0F;
				Static92.aFloat22 = 6.0F;
			} else if (Static197.aClass2_Sub3_Sub18_2.anInt3692 == 100) {
				Static280.aFloat55 = 8.0F;
				Static92.aFloat22 = 8.0F;
			} else if (Static197.aClass2_Sub3_Sub18_2.anInt3692 == 200) {
				Static280.aFloat55 = 16.0F;
				Static92.aFloat22 = 16.0F;
			} else {
				Static280.aFloat55 = 8.0F;
				Static92.aFloat22 = 8.0F;
			}
			Static133.method2322();
			@Pc(295) int local295 = Static142.anInt3081 >> 6;
			@Pc(299) int local299 = Static171.anInt3656 >> 1;
			@Pc(303) int local303 = Static52.anInt1205 >> 6;
			Static119.aByteArrayArrayArray8 = new byte[local295][local303][];
			Static57.anIntArrayArrayArray2 = new int[local295][local303][];
			Static19.aByteArrayArrayArray1 = new byte[local295][local303][];
			Static36.anIntArray56 = new int[Static89.anInt1993 + 1];
			Static59.aByteArrayArrayArray4 = new byte[local295][local303][];
			Static294.aByteArrayArrayArray16 = new byte[local295][local303][];
			Static202.anIntArrayArrayArray10 = new int[local295][local303][];
			Static278.anIntArrayArrayArray15 = new int[local295][local303][];
			Static279.aByteArrayArrayArray15 = new byte[local295][local303][];
			@Pc(346) int local346 = Static161.anInt3401 >> 2 << 10;
			Static125.method4628(local346, local299);
			Static20.anInt1234 = 20;
		} else if (Static20.anInt1234 == 20) {
			Static192.method3214(new Class2_Sub26(Static214.aClass84_96.method2142(Static197.aClass2_Sub3_Sub18_2.aString183, "underlay")));
			Static20.anInt1234 = 30;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 30) {
			Static218.method3693(new Class2_Sub26(Static214.aClass84_96.method2142(Static197.aClass2_Sub3_Sub18_2.aString183, "overlay")));
			Static20.anInt1234 = 40;
			Static192.method3212();
		} else if (Static20.anInt1234 == 40) {
			Static120.method2210(new Class2_Sub26(Static214.aClass84_96.method2142(Static197.aClass2_Sub3_Sub18_2.aString183, "overlay2")));
			Static20.anInt1234 = 50;
			Static192.method3212();
		} else if (Static20.anInt1234 == 50) {
			Static21.method456(new Class2_Sub26(Static214.aClass84_96.method2142(Static197.aClass2_Sub3_Sub18_2.aString183, "loc")));
			Static20.anInt1234 = 60;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 60) {
			if (Static214.aClass84_96.method2143(Static197.aClass2_Sub3_Sub18_2.aString183 + "_labels")) {
				if (!Static214.aClass84_96.method2117(Static197.aClass2_Sub3_Sub18_2.aString183 + "_labels")) {
					return;
				}
				Static37.aClass113_1 = Static266.method4445(Static214.aClass84_96, Static197.aClass2_Sub3_Sub18_2.aString183 + "_labels");
			} else {
				Static37.aClass113_1 = new Class113(0);
			}
			Static20.anInt1234 = 70;
			Static192.method3212();
		} else if (Static20.anInt1234 == 70) {
			Static1.aClass61_1 = new Class61(11, true, Static105.aCanvas1);
			Static20.anInt1234 = 73;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 73) {
			Static187.aClass61_6 = new Class61(12, true, Static105.aCanvas1);
			Static20.anInt1234 = 76;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 76) {
			Static101.aClass61_12 = new Class61(14, true, Static105.aCanvas1);
			Static20.anInt1234 = 79;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 79) {
			Static7.aClass61_2 = new Class61(17, true, Static105.aCanvas1);
			Static20.anInt1234 = 82;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 82) {
			Static214.aClass61_7 = new Class61(19, true, Static105.aCanvas1);
			Static20.anInt1234 = 85;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 85) {
			Static152.aClass61_5 = new Class61(22, true, Static105.aCanvas1);
			Static20.anInt1234 = 88;
			Static201.method3398(true);
			Static192.method3212();
		} else if (Static20.anInt1234 == 88) {
			Static56.aClass61_3 = new Class61(26, true, Static105.aCanvas1);
			Static20.anInt1234 = 91;
			Static201.method3398(true);
			Static192.method3212();
		} else {
			Static234.aClass61_8 = new Class61(30, true, Static105.aCanvas1);
			Static20.anInt1234 = 100;
			Static201.method3398(true);
			Static192.method3212();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[B")
	public static byte[] method2816(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub3_Sub6 local17 = (Class2_Sub3_Sub6) Static266.aClass53_12.method1254((long) arg0);
		if (local17 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			@Pc(31) int local31;
			for (local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (local31 = 0; local31 < 255; local31++) {
				@Pc(56) int local56 = 255 - local31;
				@Pc(61) int local61 = Static21.method459(local56, local29);
				@Pc(65) byte local65 = local23[local61];
				local23[local61] = local23[local56];
				local23[local56] = local23[511 - local31] = local65;
			}
			local17 = new Class2_Sub3_Sub6(local23);
			Static266.aClass53_12.method1258((long) arg0, local17);
		}
		return local17.aByteArray14;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
	public static int method2817(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
