import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString183 = "K";

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "[J")
	public static long[] aLongArray14 = new long[32];

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = null;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString184 = "";

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public static void method4001() {
		aString183 = null;
		aShortArrayArray4 = null;
		aLongArray14 = null;
		aStringArray35 = null;
		aString184 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method4002() {
		Static222.aClass33_33.method838(5);
		Static46.aClass33_8.method838(5);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!cc;IILclient!bi;III)V")
	public static void method4003(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == null) {
			return;
		}
		@Pc(15) int local15 = (int) Static270.aFloat49 + Static113.anInt2470 & 0x7FF;
		@Pc(27) int local27 = Math.max(arg0.anInt546 / 2, arg0.anInt602 / 2) + 10;
		@Pc(36) int local36 = arg1 * arg1 + arg5 * arg5;
		if (local36 > local27 * local27) {
			return;
		}
		@Pc(50) int local50 = Class131.anIntArray355[local15];
		@Pc(58) int local58 = local50 * 256 / (Static44.anInt879 + 256);
		@Pc(62) int local62 = Class131.anIntArray353[local15];
		@Pc(70) int local70 = local62 * 256 / (Static44.anInt879 + 256);
		@Pc(81) int local81 = arg5 * local58 + arg1 * local70 >> 16;
		@Pc(91) int local91 = local70 * arg5 - local58 * arg1 >> 16;
		if (Static178.aBoolean216) {
			((Class4_Sub2_Sub1_Sub2) arg2).method2586(local81 + arg0.anInt546 / 2 + arg4 - arg2.anInt4300 / 2, -local91 + (arg0.anInt602 / 2 + arg3 - arg2.anInt4305 / 2), (Class4_Sub2_Sub1_Sub2) arg0.method461(false));
		} else {
			((Class4_Sub2_Sub1_Sub1) arg2).method3475(arg0.anInt546 / 2 + arg4 + local81 - arg2.anInt4300 / 2, -(arg2.anInt4305 / 2) + -local91 + arg3 - -(arg0.anInt602 / 2), arg0.anIntArray52, arg0.anIntArray60);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class4_Sub32 local10 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg2);
		if (local10 == null) {
			local10 = new Class4_Sub32();
			Static105.aClass97_9.method2364(local10, (long) arg2);
		}
		if (local10.anIntArray480.length <= arg3) {
			@Pc(35) int[] local35 = new int[arg3 + 1];
			@Pc(40) int[] local40 = new int[arg3 + 1];
			@Pc(42) int local42;
			for (local42 = 0; local42 < local10.anIntArray480.length; local42++) {
				local35[local42] = local10.anIntArray480[local42];
				local40[local42] = local10.anIntArray482[local42];
			}
			for (local42 = local10.anIntArray480.length; local42 < arg3; local42++) {
				local35[local42] = -1;
				local40[local42] = 0;
			}
			local10.anIntArray480 = local35;
			local10.anIntArray482 = local40;
		}
		local10.anIntArray480[arg3] = arg1;
		local10.anIntArray482[arg3] = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIII)V")
	public static void method4005(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class181 local13 = local7.aClass181_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt5425;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class147 local58 = local7.aClass147_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt4487;
		@Pc(67) int local67 = local58.anInt4485;
		@Pc(70) int local70 = local58.anInt4486;
		@Pc(73) int local73 = local58.anInt4484;
		@Pc(77) int[] local77 = Static132.anIntArrayArray25[local23];
		@Pc(81) int[] local81 = Static122.anIntArrayArray24[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method4006() {
		Static100.anIntArray223 = null;
		Static274.aByteArrayArray20 = null;
		Static159.anIntArray285 = null;
		Static6.anIntArray14 = null;
		Static262.anIntArray439 = null;
		Static46.anIntArray120 = null;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4007() {
		if (Static81.anInt4026 == 0) {
			return;
		}
		try {
			if (++Static227.anInt3978 > 2000) {
				if (Static259.aClass158_3 != null) {
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
				}
				if (Static101.anInt4751 >= 1) {
					Static171.anInt3391 = -5;
					Static81.anInt4026 = 0;
					return;
				}
				Static101.anInt4751++;
				Static81.anInt4026 = 1;
				Static227.anInt3978 = 0;
				if (Static275.anInt5134 == Static187.anInt3757) {
					Static187.anInt3757 = Static101.anInt4750;
				} else {
					Static187.anInt3757 = Static275.anInt5134;
				}
			}
			if (Static81.anInt4026 == 1) {
				Static86.aClass123_2 = Static87.aClass164_2.method3941(Static28.aString8, Static187.anInt3757);
				Static81.anInt4026 = 2;
			}
			@Pc(128) int local128;
			if (Static81.anInt4026 == 2) {
				if (Static86.aClass123_2.anInt3791 == 2) {
					throw new IOException();
				}
				if (Static86.aClass123_2.anInt3791 != 1) {
					return;
				}
				Static259.aClass158_3 = new Class158((Socket) Static86.aClass123_2.anObject4, Static87.aClass164_2);
				Static86.aClass123_2 = null;
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				local128 = Static259.aClass158_3.method3777();
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				if (local128 != 21) {
					Static81.anInt4026 = 0;
					Static171.anInt3391 = local128;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				}
				Static81.anInt4026 = 3;
			}
			if (Static81.anInt4026 == 3) {
				if (Static259.aClass158_3.method3774() < 1) {
					return;
				}
				Static82.aStringArray11 = new String[Static259.aClass158_3.method3777()];
				Static81.anInt4026 = 4;
			}
			if (Static81.anInt4026 == 4) {
				if (Static259.aClass158_3.method3774() < Static82.aStringArray11.length * 8) {
					return;
				}
				Static101.aClass4_Sub17_Sub1_4.anInt2400 = 0;
				Static259.aClass158_3.method3775(0, Static82.aStringArray11.length * 8, Static101.aClass4_Sub17_Sub1_4.aByteArray30);
				for (local128 = 0; local128 < Static82.aStringArray11.length; local128++) {
					Static82.aStringArray11[local128] = Static141.method2286(Static101.aClass4_Sub17_Sub1_4.method1864());
				}
				Static171.anInt3391 = 21;
				Static81.anInt4026 = 0;
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
				return;
			}
		} catch (@Pc(235) IOException local235) {
			if (Static259.aClass158_3 != null) {
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
			}
			if (Static101.anInt4751 >= 1) {
				Static171.anInt3391 = -4;
				Static81.anInt4026 = 0;
			} else {
				Static81.anInt4026 = 1;
				Static227.anInt3978 = 0;
				Static101.anInt4751++;
				if (Static275.anInt5134 == Static187.anInt3757) {
					Static187.anInt3757 = Static101.anInt4750;
				} else {
					Static187.anInt3757 = Static275.anInt5134;
				}
			}
		}
	}
}
