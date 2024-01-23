import java.awt.Component;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int anInt3376;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public static int anInt3372 = 0;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString218 = "Loading - please wait.";

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static int anInt3373 = -1;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public static int anInt3380 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!s;ZILclient!s;II)I")
	public static int method2536(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class115_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class115_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static62.method1197(arg3, arg0, arg1, arg4);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static62.method1197(arg5, arg2, arg1, arg4);
			return arg2 ? -local32 : local32;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ak;B)I")
	public static int method2538(@OriginalArg(0) Class9_Sub1_Sub2 arg0) {
		@Pc(16) Class45 local16 = arg0.aClass45_1;
		if (local16.anIntArray154 != null) {
			local16 = local16.method1460();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local16.anInt2010;
		@Pc(34) Class59 local34 = arg0.method207();
		if (arg0.anInt451 == local34.anInt2744) {
			local30 = local16.anInt2032;
		} else if (local34.anInt2726 == arg0.anInt451 || arg0.anInt451 == local34.anInt2729 || arg0.anInt451 == local34.anInt2725 || arg0.anInt451 == local34.anInt2741) {
			local30 = local16.anInt2008;
		} else if (local34.anInt2758 == arg0.anInt451 || local34.anInt2756 == arg0.anInt451 || arg0.anInt451 == local34.anInt2750 || local34.anInt2739 == arg0.anInt451) {
			local30 = local16.anInt2033;
		}
		return local30;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z")
	public static boolean method2539() {
		@Pc(5) Class147 local5 = Static240.aClass147_1;
		synchronized (Static240.aClass147_1) {
			if (Static33.anInt5180 == Static143.anInt3471) {
				return false;
			} else {
				Static128.anInt3220 = Static255.anIntArray464[Static33.anInt5180];
				Static261.aChar4 = Static193.aCharArray4[Static33.anInt5180];
				Static33.anInt5180 = Static33.anInt5180 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!wb;IB)V")
	public static void method2541(@OriginalArg(0) Class1_Sub30 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object[] local4 = arg0.anObjectArray32;
		@Pc(10) int local10 = (Integer) local4[0];
		@Pc(14) Class1_Sub2_Sub9 local14 = Static2.method27(local10);
		if (local14 == null) {
			return;
		}
		Static120.anInt3098 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(30) int[] local30 = local14.anIntArray194;
		@Pc(32) int local32 = 0;
		@Pc(35) int[] local35 = local14.anIntArray196;
		@Pc(37) byte local37 = -1;
		@Pc(58) int local58;
		@Pc(71) int local71;
		try {
			Static69.aStringArray11 = new String[local14.anInt2663];
			@Pc(43) int local43 = 0;
			Static140.anIntArray255 = new int[local14.anInt2661];
			@Pc(56) int local56 = 0;
			for (local58 = 1; local58 < local4.length; local58++) {
				if (local4[local58] instanceof Integer) {
					local71 = (Integer) local4[local58];
					if (local71 == -2147483647) {
						local71 = arg0.anInt5439;
					}
					if (local71 == -2147483646) {
						local71 = arg0.anInt5445;
					}
					if (local71 == -2147483645) {
						local71 = arg0.aClass122_18 == null ? -1 : arg0.aClass122_18.anInt4686;
					}
					if (local71 == -2147483644) {
						local71 = arg0.anInt5447;
					}
					if (local71 == -2147483643) {
						local71 = arg0.aClass122_18 == null ? -1 : arg0.aClass122_18.anInt4662;
					}
					if (local71 == -2147483642) {
						local71 = arg0.aClass122_19 == null ? -1 : arg0.aClass122_19.anInt4686;
					}
					if (local71 == -2147483641) {
						local71 = arg0.aClass122_19 == null ? -1 : arg0.aClass122_19.anInt4662;
					}
					if (local71 == -2147483640) {
						local71 = arg0.anInt5441;
					}
					if (local71 == -2147483639) {
						local71 = arg0.anInt5448;
					}
					Static140.anIntArray255[local43++] = local71;
				} else if (local4[local58] instanceof String) {
					@Pc(178) String local178 = (String) local4[local58];
					if (local178.equals("event_opbase")) {
						local178 = arg0.aString385;
					}
					Static69.aStringArray11[local56++] = local178;
				}
			}
			local71 = 0;
			label4010: while (true) {
				local71++;
				if (local71 > arg1) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(215) int local215 = local30[local27];
				@Pc(792) int local792;
				@Pc(629) int local629;
				@Pc(654) int local654;
				@Pc(781) int local781;
				@Pc(585) String local585;
				@Pc(627) int[] local627;
				if (local215 < 100) {
					if (local215 == 0) {
						Static82.anIntArray172[local25++] = local35[local27];
						continue;
					}
					@Pc(240) int local240;
					if (local215 == 1) {
						local240 = local35[local27];
						Static82.anIntArray172[local25++] = Static91.anIntArray189[local240];
						continue;
					}
					if (local215 == 2) {
						local240 = local35[local27];
						local25--;
						Static171.method2962(local240, Static82.anIntArray172[local25]);
						continue;
					}
					if (local215 == 3) {
						Static152.aStringArray29[local32++] = local14.aStringArray17[local27];
						continue;
					}
					if (local215 == 6) {
						local27 += local35[local27];
						continue;
					}
					if (local215 == 7) {
						local25 -= 2;
						if (Static82.anIntArray172[local25 + 1] != Static82.anIntArray172[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 8) {
						local25 -= 2;
						if (Static82.anIntArray172[local25] == Static82.anIntArray172[local25 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 9) {
						local25 -= 2;
						if (Static82.anIntArray172[local25 + 1] > Static82.anIntArray172[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 10) {
						local25 -= 2;
						if (Static82.anIntArray172[local25 + 1] < Static82.anIntArray172[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 21) {
						if (Static120.anInt3098 == 0) {
							return;
						}
						@Pc(402) Class69 local402 = Static248.aClass69Array1[--Static120.anInt3098];
						Static140.anIntArray255 = local402.anIntArray218;
						local27 = local402.anInt3021;
						Static69.aStringArray11 = local402.aStringArray21;
						local14 = local402.aClass1_Sub2_Sub9_1;
						local35 = local14.anIntArray196;
						local30 = local14.anIntArray194;
						continue;
					}
					if (local215 == 25) {
						local240 = local35[local27];
						Static82.anIntArray172[local25++] = Static250.method4062(local240);
						continue;
					}
					if (local215 == 27) {
						local240 = local35[local27];
						local25--;
						Static65.method1283(local240, Static82.anIntArray172[local25]);
						continue;
					}
					if (local215 == 31) {
						local25 -= 2;
						if (Static82.anIntArray172[local25] <= Static82.anIntArray172[local25 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 32) {
						local25 -= 2;
						if (Static82.anIntArray172[local25 + 1] <= Static82.anIntArray172[local25]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 33) {
						Static82.anIntArray172[local25++] = Static140.anIntArray255[local35[local27]];
						continue;
					}
					@Pc(531) int local531;
					if (local215 == 34) {
						local531 = local35[local27];
						local25--;
						Static140.anIntArray255[local531] = Static82.anIntArray172[local25];
						continue;
					}
					if (local215 == 35) {
						Static152.aStringArray29[local32++] = Static69.aStringArray11[local35[local27]];
						continue;
					}
					if (local215 == 36) {
						local531 = local35[local27];
						local32--;
						Static69.aStringArray11[local531] = Static152.aStringArray29[local32];
						continue;
					}
					if (local215 == 37) {
						local240 = local35[local27];
						local32 -= local240;
						local585 = Static10.method188(local240, Static152.aStringArray29, local32);
						Static152.aStringArray29[local32++] = local585;
						continue;
					}
					if (local215 == 38) {
						local25--;
						continue;
					}
					if (local215 == 39) {
						local32--;
						continue;
					}
					if (local215 == 40) {
						local240 = local35[local27];
						@Pc(619) Class1_Sub2_Sub9 local619 = Static2.method27(local240);
						@Pc(623) String[] local623 = new String[local619.anInt2663];
						local627 = new int[local619.anInt2661];
						for (local629 = 0; local629 < local619.anInt2664; local629++) {
							local627[local629] = Static82.anIntArray172[local25 + local629 - local619.anInt2664];
						}
						for (local654 = 0; local654 < local619.anInt2662; local654++) {
							local623[local654] = Static152.aStringArray29[local654 + local32 - local619.anInt2662];
						}
						local25 -= local619.anInt2664;
						local32 -= local619.anInt2662;
						@Pc(691) Class69 local691 = new Class69();
						local691.aClass1_Sub2_Sub9_1 = local14;
						local691.anIntArray218 = Static140.anIntArray255;
						local691.aStringArray21 = Static69.aStringArray11;
						local691.anInt3021 = local27;
						if (Static120.anInt3098 >= Static248.aClass69Array1.length) {
							throw new RuntimeException();
						}
						Static248.aClass69Array1[Static120.anInt3098++] = local691;
						local14 = local619;
						local30 = local619.anIntArray194;
						local27 = -1;
						Static140.anIntArray255 = local627;
						Static69.aStringArray11 = local623;
						local35 = local619.anIntArray196;
						continue;
					}
					if (local215 == 42) {
						Static82.anIntArray172[local25++] = Static155.anIntArray274[local35[local27]];
						continue;
					}
					if (local215 == 43) {
						local240 = local35[local27];
						local25--;
						Static155.anIntArray274[local240] = Static82.anIntArray172[local25];
						Static193.method3253(local240);
						continue;
					}
					if (local215 == 44) {
						local781 = local35[local27] & 0xFFFF;
						local240 = local35[local27] >> 16;
						local25--;
						local792 = Static82.anIntArray172[local25];
						if (local792 >= 0 && local792 <= 5000) {
							Static165.anIntArray292[local240] = local792;
							@Pc(809) byte local809 = -1;
							if (local781 == 105) {
								local809 = 0;
							}
							local629 = 0;
							while (true) {
								if (local792 <= local629) {
									continue label4010;
								}
								Static26.anIntArrayArray5[local240][local629] = local809;
								local629++;
							}
						}
						throw new RuntimeException();
					}
					if (local215 == 45) {
						local25--;
						local781 = Static82.anIntArray172[local25];
						local240 = local35[local27];
						if (local781 >= 0 && local781 < Static165.anIntArray292[local240]) {
							Static82.anIntArray172[local25++] = Static26.anIntArrayArray5[local240][local781];
							continue;
						}
						throw new RuntimeException();
					}
					if (local215 == 46) {
						local240 = local35[local27];
						local25 -= 2;
						local781 = Static82.anIntArray172[local25];
						if (local781 >= 0 && Static165.anIntArray292[local240] > local781) {
							Static26.anIntArrayArray5[local240][local781] = Static82.anIntArray172[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local215 == 47) {
						@Pc(916) String local916 = Static84.aStringArray14[local35[local27]];
						if (local916 == null) {
							local916 = "null";
						}
						Static152.aStringArray29[local32++] = local916;
						continue;
					}
					if (local215 == 48) {
						local240 = local35[local27];
						local32--;
						Static84.aStringArray14[local240] = Static152.aStringArray29[local32];
						Static171.method2964(local240);
						continue;
					}
					if (local215 == 51) {
						@Pc(960) Class140 local960 = local14.aClass140Array1[local35[local27]];
						local25--;
						@Pc(970) Class1_Sub24 local970 = (Class1_Sub24) local960.method4014((long) Static82.anIntArray172[local25]);
						if (local970 != null) {
							local27 += local970.anInt4545;
						}
						continue;
					}
				}
				@Pc(988) boolean local988;
				if (local35[local27] == 1) {
					local988 = true;
				} else {
					local988 = false;
				}
				@Pc(1144) Class122 local1144;
				@Pc(1005) int local1005;
				@Pc(1048) int local1048;
				@Pc(1027) Class122 local1027;
				@Pc(1219) Class122 local1219;
				if (local215 < 300) {
					if (local215 == 100) {
						local25 -= 3;
						local1005 = Static82.anIntArray172[local25 + 2];
						local792 = Static82.anIntArray172[local25 + 1];
						local781 = Static82.anIntArray172[local25];
						if (local792 == 0) {
							throw new RuntimeException();
						}
						local1027 = Static206.method3444(local781);
						if (local1027.aClass122Array2 == null) {
							local1027.aClass122Array2 = new Class122[local1005 + 1];
						}
						if (local1005 >= local1027.aClass122Array2.length) {
							@Pc(1046) Class122[] local1046 = new Class122[local1005 + 1];
							for (local1048 = 0; local1048 < local1027.aClass122Array2.length; local1048++) {
								local1046[local1048] = local1027.aClass122Array2[local1048];
							}
							local1027.aClass122Array2 = local1046;
						}
						if (local1005 > 0 && local1027.aClass122Array2[local1005 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1005 - 1));
						}
						@Pc(1099) Class122 local1099 = new Class122();
						local1099.anInt4703 = local1099.anInt4686 = local1027.anInt4686;
						local1099.anInt4656 = local792;
						local1099.aBoolean228 = true;
						local1099.anInt4662 = local1005;
						local1027.aClass122Array2[local1005] = local1099;
						if (local988) {
							Static238.aClass122_17 = local1099;
						} else {
							Static262.aClass122_20 = local1099;
						}
						Static257.method4146(local1027);
						continue;
					}
					@Pc(1165) Class122 local1165;
					if (local215 == 101) {
						local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
						if (local1144.anInt4662 == -1) {
							if (!local988) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1165 = Static206.method3444(local1144.anInt4686);
						local1165.aClass122Array2[local1144.anInt4662] = null;
						Static257.method4146(local1165);
						continue;
					}
					if (local215 == 102) {
						local25--;
						local1144 = Static206.method3444(Static82.anIntArray172[local25]);
						local1144.aClass122Array2 = null;
						Static257.method4146(local1144);
						continue;
					}
					if (local215 == 200) {
						local25 -= 2;
						local781 = Static82.anIntArray172[local25];
						local792 = Static82.anIntArray172[local25 + 1];
						local1219 = Static106.method2192(local792, local781);
						if (local1219 != null && local792 != -1) {
							Static82.anIntArray172[local25++] = 1;
							if (local988) {
								Static238.aClass122_17 = local1219;
							} else {
								Static262.aClass122_20 = local1219;
							}
							continue;
						}
						Static82.anIntArray172[local25++] = 0;
						continue;
					}
					if (local215 == 201) {
						local25--;
						local781 = Static82.anIntArray172[local25];
						local1165 = Static206.method3444(local781);
						if (local1165 == null) {
							Static82.anIntArray172[local25++] = 0;
						} else {
							Static82.anIntArray172[local25++] = 1;
							if (local988) {
								Static238.aClass122_17 = local1165;
							} else {
								Static262.aClass122_20 = local1165;
							}
						}
						continue;
					}
				} else {
					@Pc(1399) boolean local1399;
					if (local215 < 500) {
						if (local215 == 403) {
							local25 -= 2;
							local781 = Static82.anIntArray172[local25];
							local792 = Static82.anIntArray172[local25 + 1];
							for (local1005 = 0; local1005 < Static238.anIntArray449.length; local1005++) {
								if (local781 == Static238.anIntArray449[local1005]) {
									Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2824(local792, local1005);
									continue label4010;
								}
							}
							local629 = 0;
							while (true) {
								if (local629 >= Static211.anIntArray386.length) {
									continue label4010;
								}
								if (local781 == Static211.anIntArray386[local629]) {
									Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2824(local792, local629);
									continue label4010;
								}
								local629++;
							}
						}
						if (local215 == 404) {
							local25 -= 2;
							local781 = Static82.anIntArray172[local25];
							local792 = Static82.anIntArray172[local25 + 1];
							Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2820(local792, local781);
							continue;
						}
						if (local215 == 410) {
							local25--;
							local1399 = Static82.anIntArray172[local25] != 0;
							Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2816(local1399);
							continue;
						}
					} else {
						@Pc(6711) boolean local6711;
						if ((local215 < 1000 || local215 >= 1100) && (local215 < 2000 || local215 >= 2100)) {
							@Pc(1516) String local1516;
							if (local215 >= 1100 && local215 < 1200 || !(local215 < 2100 || local215 >= 2200)) {
								if (local215 >= 2000) {
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									local215 -= 1000;
								} else {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
								}
								if (local215 == 1100) {
									local25 -= 2;
									local1144.anInt4673 = Static82.anIntArray172[local25];
									if (local1144.anInt4725 - local1144.anInt4695 < local1144.anInt4673) {
										local1144.anInt4673 = local1144.anInt4725 - local1144.anInt4695;
									}
									if (local1144.anInt4673 < 0) {
										local1144.anInt4673 = 0;
									}
									local1144.anInt4653 = Static82.anIntArray172[local25 + 1];
									if (local1144.anInt4653 > local1144.anInt4715 - local1144.anInt4726) {
										local1144.anInt4653 = local1144.anInt4715 - local1144.anInt4726;
									}
									if (local1144.anInt4653 < 0) {
										local1144.anInt4653 = 0;
									}
									Static257.method4146(local1144);
									if (local1144.anInt4662 == -1) {
										Static249.method4055(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1101) {
									local25--;
									local1144.anInt4719 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									if (local1144.anInt4662 == -1) {
										Static39.method711(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1102) {
									local25--;
									local1144.aBoolean236 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1103) {
									local25--;
									local1144.anInt4689 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1104) {
									local25--;
									local1144.anInt4718 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1105) {
									local25--;
									local1144.anInt4729 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1106) {
									local25--;
									local1144.anInt4642 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1107) {
									local25--;
									local1144.aBoolean231 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1108) {
									local1144.anInt4651 = 1;
									local25--;
									local1144.anInt4676 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									if (local1144.anInt4662 == -1) {
										Static232.method3871(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1109) {
									local25 -= 6;
									local1144.anInt4684 = Static82.anIntArray172[local25];
									local1144.anInt4657 = Static82.anIntArray172[local25 + 1];
									local1144.anInt4660 = Static82.anIntArray172[local25 + 2];
									local1144.anInt4661 = Static82.anIntArray172[local25 + 3];
									local1144.anInt4700 = Static82.anIntArray172[local25 + 4];
									local1144.anInt4644 = Static82.anIntArray172[local25 + 5];
									Static257.method4146(local1144);
									if (local1144.anInt4662 == -1) {
										Static251.method4072(local1144.anInt4686);
										Static70.method1363(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1110) {
									local25--;
									local792 = Static82.anIntArray172[local25];
									if (local792 != local1144.anInt4680) {
										local1144.anInt4666 = 0;
										local1144.anInt4675 = 0;
										local1144.anInt4647 = 1;
										local1144.anInt4680 = local792;
										Static257.method4146(local1144);
									}
									if (local1144.anInt4662 == -1) {
										Static204.method3424(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1111) {
									local25--;
									local1144.aBoolean244 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1112) {
									local32--;
									local1516 = Static152.aStringArray29[local32];
									if (!local1516.equals(local1144.aString329)) {
										local1144.aString329 = local1516;
										Static257.method4146(local1144);
									}
									if (local1144.anInt4662 == -1) {
										Static196.method786(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1113) {
									local25--;
									local1144.anInt4668 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1114) {
									local25 -= 3;
									local1144.anInt4710 = Static82.anIntArray172[local25];
									local1144.anInt4640 = Static82.anIntArray172[local25 + 1];
									local1144.anInt4702 = Static82.anIntArray172[local25 + 2];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1115) {
									local25--;
									local1144.aBoolean229 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1116) {
									local25--;
									local1144.anInt4677 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1117) {
									local25--;
									local1144.anInt4667 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1118) {
									local25--;
									local1144.aBoolean241 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1119) {
									local25--;
									local1144.aBoolean239 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1120) {
									local25 -= 2;
									local1144.anInt4725 = Static82.anIntArray172[local25];
									local1144.anInt4715 = Static82.anIntArray172[local25 + 1];
									Static257.method4146(local1144);
									if (local1144.anInt4656 == 0) {
										Static147.method2678(false, local1144);
									}
									continue;
								}
								if (local215 == 1121) {
									Static257.method4146(local1144);
									local25 -= 2;
									continue;
								}
								if (local215 == 1122) {
									local25--;
									local1144.aBoolean234 = Static82.anIntArray172[local25] == 1;
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1123) {
									local25--;
									local1144.anInt4644 = Static82.anIntArray172[local25];
									Static257.method4146(local1144);
									if (local1144.anInt4662 == -1) {
										Static251.method4072(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1124) {
									local25--;
									local792 = Static82.anIntArray172[local25];
									local1144.aBoolean242 = local792 == 1;
									Static257.method4146(local1144);
									continue;
								}
							} else if (local215 >= 1200 && local215 < 1300 || local215 >= 2200 && local215 < 2300) {
								if (local215 >= 2000) {
									local215 -= 1000;
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
								} else {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
								}
								Static257.method4146(local1144);
								if (local215 == 1200 || local215 == 1205 || local215 == 1208 || local215 == 1209) {
									local25 -= 2;
									local1005 = Static82.anIntArray172[local25 + 1];
									local792 = Static82.anIntArray172[local25];
									if (local1144.anInt4662 == -1) {
										Static37.method662(local1144.anInt4686);
										Static251.method4072(local1144.anInt4686);
										Static70.method1363(local1144.anInt4686);
									}
									if (local792 == -1) {
										local1144.anInt4676 = -1;
										local1144.anInt4682 = -1;
										local1144.anInt4651 = 1;
										continue;
									}
									local1144.anInt4682 = local792;
									if (local215 == 1208 || local215 == 1209) {
										local1144.aBoolean235 = true;
									} else {
										local1144.aBoolean235 = false;
									}
									local1144.anInt4707 = local1005;
									@Pc(13107) Class89 local13107 = Static93.method2006(local792);
									local1144.anInt4684 = local13107.anInt3666;
									local1144.anInt4644 = local13107.anInt3672;
									local1144.anInt4700 = local13107.anInt3683;
									local1144.anInt4660 = local13107.anInt3667;
									if (local215 == 1205) {
										local1144.aBoolean237 = false;
									} else {
										local1144.aBoolean237 = true;
									}
									local1144.anInt4657 = local13107.anInt3629;
									local1144.anInt4661 = local13107.anInt3638;
									if (local1144.anInt4706 > 0) {
										local1144.anInt4644 = local1144.anInt4644 * 32 / local1144.anInt4706;
									} else if (local1144.anInt4650 > 0) {
										local1144.anInt4644 = local1144.anInt4644 * 32 / local1144.anInt4650;
									}
									continue;
								}
								if (local215 == 1201) {
									local1144.anInt4651 = 2;
									local25--;
									local1144.anInt4676 = Static82.anIntArray172[local25];
									if (local1144.anInt4662 == -1) {
										Static232.method3871(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1202) {
									local1144.anInt4651 = 3;
									local1144.anInt4676 = Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2822();
									if (local1144.anInt4662 == -1) {
										Static232.method3871(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1203) {
									local1144.anInt4651 = 6;
									local25--;
									local1144.anInt4676 = Static82.anIntArray172[local25];
									if (local1144.anInt4662 == -1) {
										Static232.method3871(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1204) {
									local1144.anInt4651 = 5;
									local25--;
									local1144.anInt4676 = Static82.anIntArray172[local25];
									if (local1144.anInt4662 == -1) {
										Static232.method3871(local1144.anInt4686);
									}
									continue;
								}
								if (local215 == 1206) {
									local25 -= 4;
									local1144.anInt4648 = Static82.anIntArray172[local25];
									local1144.anInt4720 = Static82.anIntArray172[local25 + 1];
									local1144.anInt4674 = Static82.anIntArray172[local25 + 2];
									local1144.anInt4663 = Static82.anIntArray172[local25 + 3];
									Static257.method4146(local1144);
									continue;
								}
								if (local215 == 1207) {
									local25 -= 2;
									local1144.anInt4728 = Static82.anIntArray172[local25];
									local1144.anInt4705 = Static82.anIntArray172[local25 + 1];
									Static257.method4146(local1144);
									continue;
								}
							} else if ((local215 < 1300 || local215 >= 1400) && (local215 < 2300 || local215 >= 2400)) {
								@Pc(1511) int[] local1511;
								if (local215 >= 1400 && local215 < 1500 || local215 >= 2400 && local215 < 2500) {
									if (local215 >= 2000) {
										local215 -= 1000;
										local25--;
										local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									} else {
										local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
									}
									local1511 = null;
									local32--;
									local1516 = Static152.aStringArray29[local32];
									if (local1516.length() > 0 && local1516.charAt(local1516.length() - 1) == 'Y') {
										local25--;
										local629 = Static82.anIntArray172[local25];
										if (local629 > 0) {
											local1511 = new int[local629];
											while (local629-- > 0) {
												local25--;
												local1511[local629] = Static82.anIntArray172[local25];
											}
										}
										local1516 = local1516.substring(0, local1516.length() - 1);
									}
									@Pc(1574) Object[] local1574 = new Object[local1516.length() + 1];
									for (local654 = local1574.length - 1; local654 >= 1; local654--) {
										if (local1516.charAt(local654 - 1) == 's') {
											local32--;
											local1574[local654] = Static152.aStringArray29[local32];
										} else {
											local25--;
											local1574[local654] = Integer.valueOf(Static82.anIntArray172[local25]);
										}
									}
									local25--;
									local1048 = Static82.anIntArray172[local25];
									if (local1048 == -1) {
										local1574 = null;
									} else {
										local1574[0] = Integer.valueOf(local1048);
									}
									local1144.aBoolean240 = true;
									if (local215 == 1400) {
										local1144.anObjectArray30 = local1574;
									} else if (local215 == 1401) {
										local1144.anObjectArray2 = local1574;
									} else if (local215 == 1402) {
										local1144.anObjectArray4 = local1574;
									} else if (local215 == 1403) {
										local1144.anObjectArray6 = local1574;
									} else if (local215 == 1404) {
										local1144.anObjectArray14 = local1574;
									} else if (local215 == 1405) {
										local1144.anObjectArray12 = local1574;
									} else if (local215 == 1406) {
										local1144.anObjectArray23 = local1574;
									} else if (local215 == 1407) {
										local1144.anIntArray370 = local1511;
										local1144.anObjectArray28 = local1574;
									} else if (local215 == 1408) {
										local1144.anObjectArray3 = local1574;
									} else if (local215 == 1409) {
										local1144.anObjectArray29 = local1574;
									} else if (local215 == 1410) {
										local1144.anObjectArray24 = local1574;
									} else if (local215 == 1411) {
										local1144.anObjectArray19 = local1574;
									} else if (local215 == 1412) {
										local1144.anObjectArray11 = local1574;
									} else if (local215 == 1414) {
										local1144.anObjectArray7 = local1574;
										local1144.anIntArray369 = local1511;
									} else if (local215 == 1415) {
										local1144.anIntArray364 = local1511;
										local1144.anObjectArray5 = local1574;
									} else if (local215 == 1416) {
										local1144.anObjectArray13 = local1574;
									} else if (local215 == 1417) {
										local1144.anObjectArray15 = local1574;
									} else if (local215 == 1418) {
										local1144.anObjectArray8 = local1574;
									} else if (local215 == 1419) {
										local1144.anObjectArray17 = local1574;
									} else if (local215 == 1420) {
										local1144.anObjectArray27 = local1574;
									} else if (local215 == 1421) {
										local1144.anObjectArray31 = local1574;
									} else if (local215 == 1422) {
										local1144.anObjectArray26 = local1574;
									} else if (local215 == 1423) {
										local1144.anObjectArray20 = local1574;
									} else if (local215 == 1424) {
										local1144.anObjectArray22 = local1574;
									} else if (local215 == 1425) {
										local1144.anObjectArray25 = local1574;
									} else if (local215 == 1426) {
										local1144.anObjectArray21 = local1574;
									} else if (local215 == 1427) {
										local1144.anObjectArray9 = local1574;
									} else if (local215 == 1428) {
										local1144.anObjectArray10 = local1574;
										local1144.anIntArray373 = local1511;
									} else if (local215 == 1429) {
										local1144.anObjectArray16 = local1574;
										local1144.anIntArray363 = local1511;
									}
									continue;
								}
								if (local215 < 1600) {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
									if (local215 == 1500) {
										Static82.anIntArray172[local25++] = local1144.anInt4711;
										continue;
									}
									if (local215 == 1501) {
										Static82.anIntArray172[local25++] = local1144.anInt4691;
										continue;
									}
									if (local215 == 1502) {
										Static82.anIntArray172[local25++] = local1144.anInt4695;
										continue;
									}
									if (local215 == 1503) {
										Static82.anIntArray172[local25++] = local1144.anInt4726;
										continue;
									}
									if (local215 == 1504) {
										Static82.anIntArray172[local25++] = local1144.aBoolean238 ? 1 : 0;
										continue;
									}
									if (local215 == 1505) {
										Static82.anIntArray172[local25++] = local1144.anInt4703;
										continue;
									}
								} else if (local215 < 1700) {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
									if (local215 == 1600) {
										Static82.anIntArray172[local25++] = local1144.anInt4673;
										continue;
									}
									if (local215 == 1601) {
										Static82.anIntArray172[local25++] = local1144.anInt4653;
										continue;
									}
									if (local215 == 1602) {
										Static152.aStringArray29[local32++] = local1144.aString329;
										continue;
									}
									if (local215 == 1603) {
										Static82.anIntArray172[local25++] = local1144.anInt4725;
										continue;
									}
									if (local215 == 1604) {
										Static82.anIntArray172[local25++] = local1144.anInt4715;
										continue;
									}
									if (local215 == 1605) {
										Static82.anIntArray172[local25++] = local1144.anInt4644;
										continue;
									}
									if (local215 == 1606) {
										Static82.anIntArray172[local25++] = local1144.anInt4660;
										continue;
									}
									if (local215 == 1607) {
										Static82.anIntArray172[local25++] = local1144.anInt4700;
										continue;
									}
									if (local215 == 1608) {
										Static82.anIntArray172[local25++] = local1144.anInt4661;
										continue;
									}
									if (local215 == 1609) {
										Static82.anIntArray172[local25++] = local1144.anInt4689;
										continue;
									}
									if (local215 == 1610) {
										Static82.anIntArray172[local25++] = local1144.anInt4684;
										continue;
									}
									if (local215 == 1611) {
										Static82.anIntArray172[local25++] = local1144.anInt4657;
										continue;
									}
									if (local215 == 1612) {
										Static82.anIntArray172[local25++] = local1144.anInt4729;
										continue;
									}
								} else if (local215 < 1800) {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
									if (local215 == 1700) {
										Static82.anIntArray172[local25++] = local1144.anInt4682;
										continue;
									}
									if (local215 == 1701) {
										if (local1144.anInt4682 == -1) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = local1144.anInt4707;
										}
										continue;
									}
									if (local215 == 1702) {
										Static82.anIntArray172[local25++] = local1144.anInt4662;
										continue;
									}
								} else if (local215 < 1900) {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
									if (local215 == 1800) {
										Static82.anIntArray172[local25++] = Static39.method702(local1144).method3657();
										continue;
									}
									if (local215 == 1801) {
										local25--;
										local792 = Static82.anIntArray172[local25];
										local792--;
										if (local1144.aStringArray36 != null && local792 < local1144.aStringArray36.length && local1144.aStringArray36[local792] != null) {
											Static152.aStringArray29[local32++] = local1144.aStringArray36[local792];
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 1802) {
										if (local1144.aString331 == null) {
											Static152.aStringArray29[local32++] = "";
										} else {
											Static152.aStringArray29[local32++] = local1144.aString331;
										}
										continue;
									}
								} else if (local215 < 2600) {
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									if (local215 == 2500) {
										Static82.anIntArray172[local25++] = local1144.anInt4711;
										continue;
									}
									if (local215 == 2501) {
										Static82.anIntArray172[local25++] = local1144.anInt4691;
										continue;
									}
									if (local215 == 2502) {
										Static82.anIntArray172[local25++] = local1144.anInt4695;
										continue;
									}
									if (local215 == 2503) {
										Static82.anIntArray172[local25++] = local1144.anInt4726;
										continue;
									}
									if (local215 == 2504) {
										Static82.anIntArray172[local25++] = local1144.aBoolean238 ? 1 : 0;
										continue;
									}
									if (local215 == 2505) {
										Static82.anIntArray172[local25++] = local1144.anInt4703;
										continue;
									}
								} else if (local215 < 2700) {
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									if (local215 == 2600) {
										Static82.anIntArray172[local25++] = local1144.anInt4673;
										continue;
									}
									if (local215 == 2601) {
										Static82.anIntArray172[local25++] = local1144.anInt4653;
										continue;
									}
									if (local215 == 2602) {
										Static152.aStringArray29[local32++] = local1144.aString329;
										continue;
									}
									if (local215 == 2603) {
										Static82.anIntArray172[local25++] = local1144.anInt4725;
										continue;
									}
									if (local215 == 2604) {
										Static82.anIntArray172[local25++] = local1144.anInt4715;
										continue;
									}
									if (local215 == 2605) {
										Static82.anIntArray172[local25++] = local1144.anInt4644;
										continue;
									}
									if (local215 == 2606) {
										Static82.anIntArray172[local25++] = local1144.anInt4660;
										continue;
									}
									if (local215 == 2607) {
										Static82.anIntArray172[local25++] = local1144.anInt4700;
										continue;
									}
									if (local215 == 2608) {
										Static82.anIntArray172[local25++] = local1144.anInt4661;
										continue;
									}
									if (local215 == 2609) {
										Static82.anIntArray172[local25++] = local1144.anInt4689;
										continue;
									}
									if (local215 == 2610) {
										Static82.anIntArray172[local25++] = local1144.anInt4684;
										continue;
									}
									if (local215 == 2611) {
										Static82.anIntArray172[local25++] = local1144.anInt4657;
										continue;
									}
									if (local215 == 2612) {
										Static82.anIntArray172[local25++] = local1144.anInt4729;
										continue;
									}
								} else if (local215 < 2800) {
									if (local215 == 2700) {
										local25--;
										local1144 = Static206.method3444(Static82.anIntArray172[local25]);
										Static82.anIntArray172[local25++] = local1144.anInt4682;
										continue;
									}
									if (local215 == 2701) {
										local25--;
										local1144 = Static206.method3444(Static82.anIntArray172[local25]);
										if (local1144.anInt4682 == -1) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = local1144.anInt4707;
										}
										continue;
									}
									if (local215 == 2702) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										@Pc(12223) Class1_Sub5 local12223 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local781);
										if (local12223 == null) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = 1;
										}
										continue;
									}
									if (local215 == 2703) {
										local25--;
										local1144 = Static206.method3444(Static82.anIntArray172[local25]);
										if (local1144.aClass122Array2 == null) {
											Static82.anIntArray172[local25++] = 0;
											continue;
										}
										local792 = local1144.aClass122Array2.length;
										for (local1005 = 0; local1005 < local1144.aClass122Array2.length; local1005++) {
											if (local1144.aClass122Array2[local1005] == null) {
												local792 = local1005;
												break;
											}
										}
										Static82.anIntArray172[local25++] = local792;
										continue;
									}
									if (local215 == 2704 || local215 == 2705) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										@Pc(12317) Class1_Sub5 local12317 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local781);
										if (local12317 != null && local792 == local12317.anInt1358) {
											Static82.anIntArray172[local25++] = 1;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
								} else if (local215 < 2900) {
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									if (local215 == 2800) {
										Static82.anIntArray172[local25++] = Static39.method702(local1144).method3657();
										continue;
									}
									if (local215 == 2801) {
										local25--;
										local792 = Static82.anIntArray172[local25];
										local792--;
										if (local1144.aStringArray36 != null && local792 < local1144.aStringArray36.length && local1144.aStringArray36[local792] != null) {
											Static152.aStringArray29[local32++] = local1144.aStringArray36[local792];
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 2802) {
										if (local1144.aString331 == null) {
											Static152.aStringArray29[local32++] = "";
										} else {
											Static152.aStringArray29[local32++] = local1144.aString331;
										}
										continue;
									}
								} else if (local215 < 3200) {
									if (local215 == 3100) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static50.method1013("", local585, 0);
										continue;
									}
									if (local215 == 3101) {
										local25 -= 2;
										Static22.method2189(Static83.aClass9_Sub1_Sub1_1, Static82.anIntArray172[local25 + 1], Static82.anIntArray172[local25]);
										continue;
									}
									if (local215 == 3103) {
										Static138.method2532();
										continue;
									}
									if (local215 == 3104) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										local792 = 0;
										if (Static47.method966(local585)) {
											local792 = Static195.method3280(local585);
										}
										Static171.aClass1_Sub13_Sub1_3.method1825(155);
										Static171.aClass1_Sub13_Sub1_3.method1754(local792);
										continue;
									}
									if (local215 == 3105) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static171.aClass1_Sub13_Sub1_3.method1825(178);
										Static171.aClass1_Sub13_Sub1_3.method1770(Static93.method2008(local585));
										continue;
									}
									if (local215 == 3106) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static171.aClass1_Sub13_Sub1_3.method1825(208);
										Static171.aClass1_Sub13_Sub1_3.method1766(local585.length() + 1);
										Static171.aClass1_Sub13_Sub1_3.method1791(local585);
										continue;
									}
									if (local215 == 3107) {
										local32--;
										local1516 = Static152.aStringArray29[local32];
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static246.method4009(local1516, local781);
										continue;
									}
									if (local215 == 3108) {
										local25 -= 3;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										local1005 = Static82.anIntArray172[local25 + 2];
										local1027 = Static206.method3444(local1005);
										Static82.method1655(local792, local781, local1027);
										continue;
									}
									if (local215 == 3109) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25 + 1];
										local781 = Static82.anIntArray172[local25];
										local1219 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
										Static82.method1655(local792, local781, local1219);
										continue;
									}
									if (local215 == 3110) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static171.aClass1_Sub13_Sub1_3.method1825(85);
										Static171.aClass1_Sub13_Sub1_3.method1789(local781);
										continue;
									}
								} else if (local215 < 3300) {
									if (local215 == 3200) {
										local25 -= 3;
										Static3.method40(Static82.anIntArray172[local25 + 1], Static82.anIntArray172[local25 + 2], Static82.anIntArray172[local25], 255);
										continue;
									}
									if (local215 == 3201) {
										local25--;
										Static21.method412(Static82.anIntArray172[local25], 255);
										continue;
									}
									if (local215 == 3202) {
										local25 -= 2;
										Static248.method4049(Static82.anIntArray172[local25], Static82.anIntArray172[local25 + 1], 255);
										continue;
									}
								} else if (local215 < 3400) {
									if (local215 == 3300) {
										Static82.anIntArray172[local25++] = Static156.anInt3722;
										continue;
									}
									if (local215 == 3301) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static251.method4064(local781, local792);
										continue;
									}
									if (local215 == 3302) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static134.method2494(local792, local781);
										continue;
									}
									if (local215 == 3303) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static134.method2498(local792, local781);
										continue;
									}
									if (local215 == 3304) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static179.method3057(local781).anInt114;
										continue;
									}
									if (local215 == 3305) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static48.anIntArray106[local781];
										continue;
									}
									if (local215 == 3306) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static259.anIntArray466[local781];
										continue;
									}
									if (local215 == 3307) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static195.anIntArray339[local781];
										continue;
									}
									if (local215 == 3308) {
										local781 = Static137.anInt3321;
										local792 = Static64.anInt1786 + (Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7);
										local1005 = (Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7) + Static29.anInt907;
										Static82.anIntArray172[local25++] = (local781 << 28) - (-(local792 << 14) - local1005);
										continue;
									}
									if (local215 == 3309) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = local781 >> 14 & 0x3FFF;
										continue;
									}
									if (local215 == 3310) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = local781 >> 28;
										continue;
									}
									if (local215 == 3311) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = local781 & 0x3FFF;
										continue;
									}
									if (local215 == 3312) {
										Static82.anIntArray172[local25++] = Static48.aBoolean81 ? 1 : 0;
										continue;
									}
									if (local215 == 3313) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25] + 32768;
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static251.method4064(local781, local792);
										continue;
									}
									if (local215 == 3314) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25 + 1];
										local781 = Static82.anIntArray172[local25] + 32768;
										Static82.anIntArray172[local25++] = Static134.method2494(local792, local781);
										continue;
									}
									if (local215 == 3315) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25] + 32768;
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static134.method2498(local792, local781);
										continue;
									}
									if (local215 == 3316) {
										if (Static203.anInt4493 < 2) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = Static203.anInt4493;
										}
										continue;
									}
									if (local215 == 3317) {
										Static82.anIntArray172[local25++] = Static69.anInt1874;
										continue;
									}
									if (local215 == 3318) {
										Static82.anIntArray172[local25++] = anInt3373;
										continue;
									}
									if (local215 == 3321) {
										Static82.anIntArray172[local25++] = Static212.anInt4628;
										continue;
									}
									if (local215 == 3322) {
										Static82.anIntArray172[local25++] = Static198.anInt4582;
										continue;
									}
									if (local215 == 3323) {
										if (Static66.anInt1838 >= 5 && Static66.anInt1838 <= 9) {
											Static82.anIntArray172[local25++] = 1;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3324) {
										if (Static66.anInt1838 >= 5 && Static66.anInt1838 <= 9) {
											Static82.anIntArray172[local25++] = Static66.anInt1838;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3325) {
										Static82.anIntArray172[local25++] = Static115.aBoolean165 ? 1 : 0;
										continue;
									}
									if (local215 == 3326) {
										Static82.anIntArray172[local25++] = Static83.aClass9_Sub1_Sub1_1.anInt356;
										continue;
									}
									if (local215 == 3327) {
										Static82.anIntArray172[local25++] = Static83.aClass9_Sub1_Sub1_1.aClass94_1.aBoolean191 ? 1 : 0;
										continue;
									}
									if (local215 == 3328) {
										Static82.anIntArray172[local25++] = Static123.aBoolean66 && !Static60.aBoolean92 ? 1 : 0;
										continue;
									}
									if (local215 == 3329) {
										Static82.anIntArray172[local25++] = Static148.aBoolean24 ? 1 : 0;
										continue;
									}
									if (local215 == 3330) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static110.method2244(local781);
										continue;
									}
									if (local215 == 3331) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static176.method3016(local781, false, local792);
										continue;
									}
									if (local215 == 3332) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static176.method3016(local781, true, local792);
										continue;
									}
									if (local215 == 3333) {
										Static82.anIntArray172[local25++] = Static86.anInt2433;
										continue;
									}
									if (local215 == 3335) {
										Static82.anIntArray172[local25++] = Static135.anInt3311;
										continue;
									}
									if (local215 == 3336) {
										local25 -= 4;
										local781 = Static82.anIntArray172[local25];
										local1005 = Static82.anIntArray172[local25 + 2];
										local792 = Static82.anIntArray172[local25 + 1];
										local629 = Static82.anIntArray172[local25 + 3];
										local781 += local792 << 14;
										local781 += local1005 << 28;
										local781 += local629;
										Static82.anIntArray172[local25++] = local781;
										continue;
									}
									if (local215 == 3337) {
										Static82.anIntArray172[local25++] = Static145.anInt3517;
										continue;
									}
								} else if (local215 < 3500) {
									@Pc(2273) Class1_Sub2_Sub16 local2273;
									if (local215 == 3400) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										local2273 = Static101.method2100(local781);
										Static152.aStringArray29[local32++] = local2273.method3709(local792);
										continue;
									}
									if (local215 == 3408) {
										local25 -= 4;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										local1005 = Static82.anIntArray172[local25 + 2];
										local629 = Static82.anIntArray172[local25 + 3];
										@Pc(2313) Class1_Sub2_Sub16 local2313 = Static101.method2100(local1005);
										if (local2313.aChar2 == local781 && local792 == local2313.aChar3) {
											if (local792 == 115) {
												Static152.aStringArray29[local32++] = local2313.method3709(local629);
											} else {
												Static82.anIntArray172[local25++] = local2313.method3701(local629);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local215 == 3409) {
										local25 -= 3;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										local1005 = Static82.anIntArray172[local25 + 2];
										if (local792 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(2388) Class1_Sub2_Sub16 local2388 = Static101.method2100(local792);
										if (local781 != local2388.aChar3) {
											throw new RuntimeException("C3409-1");
										}
										Static82.anIntArray172[local25++] = local2388.method3712(local1005) ? 1 : 0;
										continue;
									}
									if (local215 == 3410) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										local32--;
										local1516 = Static152.aStringArray29[local32];
										if (local781 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local2273 = Static101.method2100(local781);
										if (local2273.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static82.anIntArray172[local25++] = local2273.method3700(local1516) ? 1 : 0;
										continue;
									}
									if (local215 == 3411) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										@Pc(2474) Class1_Sub2_Sub16 local2474 = Static101.method2100(local781);
										Static82.anIntArray172[local25++] = local2474.aClass140_16.method4007();
										continue;
									}
								} else if (local215 < 3700) {
									if (local215 == 3600) {
										if (Static149.anInt3577 == 0) {
											Static82.anIntArray172[local25++] = -2;
										} else if (Static149.anInt3577 == 1) {
											Static82.anIntArray172[local25++] = -1;
										} else {
											Static82.anIntArray172[local25++] = Static265.anInt5544;
										}
										continue;
									}
									if (local215 == 3601) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 == 2 && local781 < Static265.anInt5544) {
											Static152.aStringArray29[local32++] = Static48.aStringArray7[local781];
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 3602) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 == 2 && local781 < Static265.anInt5544) {
											Static82.anIntArray172[local25++] = Static206.anIntArray349[local781];
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3603) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 == 2 && local781 < Static265.anInt5544) {
											Static82.anIntArray172[local25++] = Static208.anIntArray353[local781];
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3604) {
										local25--;
										local792 = Static82.anIntArray172[local25];
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static98.method2084(local792, local585);
										continue;
									}
									if (local215 == 3605) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static111.method2254(Static93.method2008(local585));
										continue;
									}
									if (local215 == 3606) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static25.method506(Static93.method2008(local585));
										continue;
									}
									if (local215 == 3607) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static128.method2425(false, Static93.method2008(local585));
										continue;
									}
									if (local215 == 3608) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static24.method479(Static93.method2008(local585));
										continue;
									}
									if (local215 == 3609) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										if (local585.startsWith("<img=0>") || local585.startsWith("<img=1>")) {
											local585 = local585.substring(7);
										}
										Static82.anIntArray172[local25++] = Static88.method1881(local585) ? 1 : 0;
										continue;
									}
									if (local215 == 3610) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 == 2 && Static265.anInt5544 > local781) {
											Static152.aStringArray29[local32++] = Static63.aStringArray10[local781];
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 3611) {
										if (Static202.aString302 == null) {
											Static152.aStringArray29[local32++] = "";
										} else {
											Static152.aStringArray29[local32++] = Static13.method234(Static202.aString302);
										}
										continue;
									}
									if (local215 == 3612) {
										if (Static202.aString302 == null) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = Static131.anInt1067;
										}
										continue;
									}
									if (local215 == 3613) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static202.aString302 != null && Static131.anInt1067 > local781) {
											Static152.aStringArray29[local32++] = Static13.method234(Static138.aClass1_Sub20Array1[local781].aString264);
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 3614) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static202.aString302 != null && Static131.anInt1067 > local781) {
											Static82.anIntArray172[local25++] = Static138.aClass1_Sub20Array1[local781].anInt3978;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3615) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static202.aString302 != null && local781 < Static131.anInt1067) {
											Static82.anIntArray172[local25++] = Static138.aClass1_Sub20Array1[local781].aByte12;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3616) {
										Static82.anIntArray172[local25++] = Static66.aByte5;
										continue;
									}
									if (local215 == 3617) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static187.method3151(local585);
										continue;
									}
									if (local215 == 3618) {
										Static82.anIntArray172[local25++] = Static79.aByte10;
										continue;
									}
									if (local215 == 3619) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static94.method3207(Static93.method2008(local585));
										continue;
									}
									if (local215 == 3620) {
										Static137.method2502();
										continue;
									}
									if (local215 == 3621) {
										if (Static149.anInt3577 == 0) {
											Static82.anIntArray172[local25++] = -1;
										} else {
											Static82.anIntArray172[local25++] = Static167.anInt3911;
										}
										continue;
									}
									if (local215 == 3622) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 != 0 && Static167.anInt3911 > local781) {
											Static152.aStringArray29[local32++] = Static169.method2944(Static150.aLongArray23[local781]);
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 3623) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										if (local585.startsWith("<img=0>") || local585.startsWith("<img=1>")) {
											local585 = local585.substring(7);
										}
										Static82.anIntArray172[local25++] = Static203.method3393(local585) ? 1 : 0;
										continue;
									}
									if (local215 == 3624) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static138.aClass1_Sub20Array1 != null && local781 < Static131.anInt1067 && Static138.aClass1_Sub20Array1[local781].aString264.equalsIgnoreCase(Static83.aClass9_Sub1_Sub1_1.aString12)) {
											Static82.anIntArray172[local25++] = 1;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3625) {
										if (Static93.aString166 == null) {
											Static152.aStringArray29[local32++] = "";
										} else {
											Static152.aStringArray29[local32++] = Static13.method234(Static93.aString166);
										}
										continue;
									}
									if (local215 == 3626) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static202.aString302 != null && Static131.anInt1067 > local781) {
											Static152.aStringArray29[local32++] = Static138.aClass1_Sub20Array1[local781].aString263;
											continue;
										}
										Static152.aStringArray29[local32++] = "";
										continue;
									}
									if (local215 == 3627) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										if (Static149.anInt3577 == 2 && local781 >= 0 && local781 < Static265.anInt5544) {
											Static82.anIntArray172[local25++] = Static168.aBooleanArray15[local781] ? 1 : 0;
											continue;
										}
										Static82.anIntArray172[local25++] = 0;
										continue;
									}
									if (local215 == 3628) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										if (local585.startsWith("<img=0>") || local585.startsWith("<img=1>")) {
											local585 = local585.substring(7);
										}
										Static82.anIntArray172[local25++] = Static151.method2720(local585);
										continue;
									}
									if (local215 == 3629) {
										Static82.anIntArray172[local25++] = Static154.anInt4037;
										continue;
									}
									if (local215 == 3630) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static128.method2425(true, Static93.method2008(local585));
										continue;
									}
									if (local215 == 3631) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static181.aBooleanArray16[local781] ? 1 : 0;
										continue;
									}
								} else if (local215 < 4000) {
									if (local215 == 3903) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].method3134();
										continue;
									}
									if (local215 == 3904) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].anInt4171;
										continue;
									}
									if (local215 == 3905) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].anInt4159;
										continue;
									}
									if (local215 == 3906) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].anInt4163;
										continue;
									}
									if (local215 == 3907) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].anInt4167;
										continue;
									}
									if (local215 == 3908) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static131.aClass105Array2[local781].anInt4164;
										continue;
									}
									if (local215 == 3910) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										local792 = Static131.aClass105Array2[local781].method3125();
										Static82.anIntArray172[local25++] = local792 == 0 ? 1 : 0;
										continue;
									}
									if (local215 == 3911) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										local792 = Static131.aClass105Array2[local781].method3125();
										Static82.anIntArray172[local25++] = local792 == 2 ? 1 : 0;
										continue;
									}
									if (local215 == 3912) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										local792 = Static131.aClass105Array2[local781].method3125();
										Static82.anIntArray172[local25++] = local792 == 5 ? 1 : 0;
										continue;
									}
									if (local215 == 3913) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										local792 = Static131.aClass105Array2[local781].method3125();
										Static82.anIntArray172[local25++] = local792 == 1 ? 1 : 0;
										continue;
									}
								} else if (local215 < 4100) {
									if (local215 == 4000) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25 + 1];
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = local781 + local792;
										continue;
									}
									if (local215 == 4001) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local781 - local792;
										continue;
									}
									if (local215 == 4002) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local781 * local792;
										continue;
									}
									if (local215 == 4003) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local781 / local792;
										continue;
									}
									if (local215 == 4004) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = (int) ((double) local781 * Math.random());
										continue;
									}
									if (local215 == 4005) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = (int) ((double) (local781 + 1) * Math.random());
										continue;
									}
									if (local215 == 4006) {
										local25 -= 5;
										local781 = Static82.anIntArray172[local25];
										local1005 = Static82.anIntArray172[local25 + 2];
										local792 = Static82.anIntArray172[local25 + 1];
										local629 = Static82.anIntArray172[local25 + 3];
										local654 = Static82.anIntArray172[local25 + 4];
										Static82.anIntArray172[local25++] = (local654 - local1005) * (-local781 + local792) / (local629 - local1005) + local781;
										continue;
									}
									@Pc(3501) long local3501;
									@Pc(3506) long local3506;
									if (local215 == 4007) {
										local25 -= 2;
										local3501 = Static82.anIntArray172[local25 + 1];
										local3506 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = (int) (local3501 * local3506 / 100L + local3506);
										continue;
									}
									if (local215 == 4008) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = 0x1 << local792 | local781;
										continue;
									}
									if (local215 == 4009) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25 + 1];
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = -(0x1 << local792) - 1 & local781;
										continue;
									}
									if (local215 == 4010) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = (local781 & 0x1 << local792) == 0 ? 0 : 1;
										continue;
									}
									if (local215 == 4011) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25 + 1];
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = local781 % local792;
										continue;
									}
									if (local215 == 4012) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										if (local781 == 0) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = (int) Math.pow((double) local781, (double) local792);
										}
										continue;
									}
									if (local215 == 4013) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										if (local781 == 0) {
											Static82.anIntArray172[local25++] = 0;
										} else if (local792 == 0) {
											Static82.anIntArray172[local25++] = Integer.MAX_VALUE;
										} else {
											Static82.anIntArray172[local25++] = (int) Math.pow((double) local781, 1.0D / (double) local792);
										}
										continue;
									}
									if (local215 == 4014) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local781 & local792;
										continue;
									}
									if (local215 == 4015) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local781 | local792;
										continue;
									}
									if (local215 == 4016) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local792 <= local781 ? local792 : local781;
										continue;
									}
									if (local215 == 4017) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local792 >= local781 ? local792 : local781;
										continue;
									}
									if (local215 == 4018) {
										local25 -= 3;
										local3506 = Static82.anIntArray172[local25];
										local3501 = Static82.anIntArray172[local25 + 1];
										@Pc(3849) long local3849 = (long) Static82.anIntArray172[local25 + 2];
										Static82.anIntArray172[local25++] = (int) (local3506 * local3849 / local3501);
										continue;
									}
								} else if (local215 < 4200) {
									if (local215 == 4100) {
										local25--;
										local792 = Static82.anIntArray172[local25];
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static152.aStringArray29[local32++] = local585 + local792;
										continue;
									}
									if (local215 == 4101) {
										local32 -= 2;
										local585 = Static152.aStringArray29[local32];
										local1516 = Static152.aStringArray29[local32 + 1];
										Static152.aStringArray29[local32++] = local585 + local1516;
										continue;
									}
									if (local215 == 4102) {
										local25--;
										local792 = Static82.anIntArray172[local25];
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static152.aStringArray29[local32++] = local585 + Static197.method1758(local792);
										continue;
									}
									if (local215 == 4103) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static152.aStringArray29[local32++] = local585.toLowerCase();
										continue;
									}
									if (local215 == 4104) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										@Pc(3988) long local3988 = ((long) local781 + 11745L) * 86400000L;
										Static251.aCalendar2.setTime(new Date(local3988));
										local629 = Static251.aCalendar2.get(5);
										local654 = Static251.aCalendar2.get(2);
										local1048 = Static251.aCalendar2.get(1);
										Static152.aStringArray29[local32++] = local629 + "-" + Static54.aStringArray8[local654] + "-" + local1048;
										continue;
									}
									if (local215 == 4105) {
										local32 -= 2;
										local1516 = Static152.aStringArray29[local32 + 1];
										local585 = Static152.aStringArray29[local32];
										if (Static83.aClass9_Sub1_Sub1_1.aClass94_1 != null && Static83.aClass9_Sub1_Sub1_1.aClass94_1.aBoolean191) {
											Static152.aStringArray29[local32++] = local1516;
											continue;
										}
										Static152.aStringArray29[local32++] = local585;
										continue;
									}
									if (local215 == 4106) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static152.aStringArray29[local32++] = Integer.toString(local781);
										continue;
									}
									if (local215 == 4107) {
										local32 -= 2;
										Static82.anIntArray172[local25++] = Static16.method3753(Static244.method3991(Static152.aStringArray29[local32 + 1], Static135.anInt3311, Static152.aStringArray29[local32]));
										continue;
									}
									if (local215 == 4108) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										local25 -= 2;
										local792 = Static82.anIntArray172[local25];
										local1005 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static122.method2375(local1005).method1928(local585, local792);
										continue;
									}
									if (local215 == 4109) {
										local25 -= 2;
										local792 = Static82.anIntArray172[local25];
										local32--;
										local585 = Static152.aStringArray29[local32];
										local1005 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = Static122.method2375(local1005).method1918(local585, local792);
										continue;
									}
									if (local215 == 4110) {
										local32 -= 2;
										local1516 = Static152.aStringArray29[local32 + 1];
										local585 = Static152.aStringArray29[local32];
										local25--;
										if (Static82.anIntArray172[local25] == 1) {
											Static152.aStringArray29[local32++] = local585;
										} else {
											Static152.aStringArray29[local32++] = local1516;
										}
										continue;
									}
									if (local215 == 4111) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										Static152.aStringArray29[local32++] = Static78.method1939(local585);
										continue;
									}
									if (local215 == 4112) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										local25--;
										local792 = Static82.anIntArray172[local25];
										if (local792 == -1) {
											throw new RuntimeException("null char");
										}
										Static152.aStringArray29[local32++] = local585 + (char) local792;
										continue;
									}
									if (local215 == 4113) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static93.method2007((char) local781) ? 1 : 0;
										continue;
									}
									if (local215 == 4114) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static237.method3930((char) local781) ? 1 : 0;
										continue;
									}
									if (local215 == 4115) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static168.method2919((char) local781) ? 1 : 0;
										continue;
									}
									if (local215 == 4116) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Static236.method3915((char) local781) ? 1 : 0;
										continue;
									}
									if (local215 == 4117) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										if (local585 == null) {
											Static82.anIntArray172[local25++] = 0;
										} else {
											Static82.anIntArray172[local25++] = local585.length();
										}
										continue;
									}
									if (local215 == 4118) {
										local25 -= 2;
										local32--;
										local585 = Static152.aStringArray29[local32];
										local1005 = Static82.anIntArray172[local25 + 1];
										local792 = Static82.anIntArray172[local25];
										Static152.aStringArray29[local32++] = local585.substring(local792, local1005);
										continue;
									}
									if (local215 == 4119) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										@Pc(4423) boolean local4423 = false;
										@Pc(4429) StringBuffer local4429 = new StringBuffer(local585.length());
										for (local629 = 0; local585.length() > local629; local629++) {
											@Pc(4437) char local4437 = local585.charAt(local629);
											if (local4437 == '<') {
												local4423 = true;
											} else if (local4437 == '>') {
												local4423 = false;
											} else if (!local4423) {
												local4429.append(local4437);
											}
										}
										Static152.aStringArray29[local32++] = local4429.toString();
										continue;
									}
									if (local215 == 4120) {
										local32--;
										local585 = Static152.aStringArray29[local32];
										local25 -= 2;
										local792 = Static82.anIntArray172[local25];
										local1005 = Static82.anIntArray172[local25 + 1];
										Static82.anIntArray172[local25++] = local585.indexOf(local792, local1005);
										continue;
									}
									if (local215 == 4121) {
										local25--;
										local1005 = Static82.anIntArray172[local25];
										local32 -= 2;
										local585 = Static152.aStringArray29[local32];
										local1516 = Static152.aStringArray29[local32 + 1];
										Static82.anIntArray172[local25++] = local585.indexOf(local1516, local1005);
										continue;
									}
									if (local215 == 4122) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Character.toLowerCase((char) local781);
										continue;
									}
									if (local215 == 4123) {
										local25--;
										local781 = Static82.anIntArray172[local25];
										Static82.anIntArray172[local25++] = Character.toUpperCase((char) local781);
										continue;
									}
									if (local215 == 4124) {
										local25--;
										local1399 = Static82.anIntArray172[local25] != 0;
										local25--;
										local792 = Static82.anIntArray172[local25];
										Static152.aStringArray29[local32++] = Static69.method1320(Static135.anInt3311, local1399, (long) local792, 0);
										continue;
									}
								} else {
									@Pc(4906) Class1_Sub2_Sub10 local4906;
									if (local215 < 4300) {
										if (local215 == 4200) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											Static152.aStringArray29[local32++] = Static93.method2006(local781).aString235;
											continue;
										}
										@Pc(4652) Class89 local4652;
										if (local215 == 4201) {
											local25 -= 2;
											local781 = Static82.anIntArray172[local25];
											local792 = Static82.anIntArray172[local25 + 1];
											local4652 = Static93.method2006(local781);
											if (local792 >= 1 && local792 <= 5 && local4652.aStringArray28[local792 - 1] != null) {
												Static152.aStringArray29[local32++] = local4652.aStringArray28[local792 - 1];
												continue;
											}
											Static152.aStringArray29[local32++] = "";
											continue;
										}
										if (local215 == 4202) {
											local25 -= 2;
											local792 = Static82.anIntArray172[local25 + 1];
											local781 = Static82.anIntArray172[local25];
											local4652 = Static93.method2006(local781);
											if (local792 >= 1 && local792 <= 5 && local4652.aStringArray30[local792 - 1] != null) {
												Static152.aStringArray29[local32++] = local4652.aStringArray30[local792 - 1];
												continue;
											}
											Static152.aStringArray29[local32++] = "";
											continue;
										}
										if (local215 == 4203) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											Static82.anIntArray172[local25++] = Static93.method2006(local781).anInt3673;
											continue;
										}
										if (local215 == 4204) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											Static82.anIntArray172[local25++] = Static93.method2006(local781).anInt3650 == 1 ? 1 : 0;
											continue;
										}
										@Pc(4799) Class89 local4799;
										if (local215 == 4205) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											local4799 = Static93.method2006(local781);
											if (local4799.anInt3680 == -1 && local4799.anInt3624 >= 0) {
												Static82.anIntArray172[local25++] = local4799.anInt3624;
												continue;
											}
											Static82.anIntArray172[local25++] = local781;
											continue;
										}
										if (local215 == 4206) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											local4799 = Static93.method2006(local781);
											if (local4799.anInt3680 >= 0 && local4799.anInt3624 >= 0) {
												Static82.anIntArray172[local25++] = local4799.anInt3624;
												continue;
											}
											Static82.anIntArray172[local25++] = local781;
											continue;
										}
										if (local215 == 4207) {
											local25--;
											local781 = Static82.anIntArray172[local25];
											Static82.anIntArray172[local25++] = Static93.method2006(local781).aBoolean189 ? 1 : 0;
											continue;
										}
										if (local215 == 4208) {
											local25 -= 2;
											local781 = Static82.anIntArray172[local25];
											local792 = Static82.anIntArray172[local25 + 1];
											local4906 = Static16.method3757(local792);
											if (local4906.method2633()) {
												Static152.aStringArray29[local32++] = Static93.method2006(local781).method2733(local792, local4906.aString227);
											} else {
												Static82.anIntArray172[local25++] = Static93.method2006(local781).method2736(local792, local4906.anInt3511);
											}
											continue;
										}
										if (local215 == 4210) {
											local25--;
											local792 = Static82.anIntArray172[local25];
											local32--;
											local585 = Static152.aStringArray29[local32];
											Static50.method1014(local792 == 1, local585);
											Static82.anIntArray172[local25++] = Static147.anInt3575;
											continue;
										}
										if (local215 == 4211) {
											if (Static82.aShortArray32 != null && Static187.anInt4203 < Static147.anInt3575) {
												Static82.anIntArray172[local25++] = Static82.aShortArray32[Static187.anInt4203++] & 0xFFFF;
												continue;
											}
											Static82.anIntArray172[local25++] = -1;
											continue;
										}
										if (local215 == 4212) {
											Static187.anInt4203 = 0;
											continue;
										}
									} else if (local215 >= 4400) {
										if (local215 < 4500) {
											if (local215 == 4400) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												local4906 = Static16.method3757(local792);
												if (local4906.method2633()) {
													Static152.aStringArray29[local32++] = Static77.method1518(local781).method927(local4906.aString227, local792);
												} else {
													Static82.anIntArray172[local25++] = Static77.method1518(local781).method924(local792, local4906.anInt3511);
												}
												continue;
											}
										} else if (local215 < 4600) {
											if (local215 == 4500) {
												local25 -= 2;
												local792 = Static82.anIntArray172[local25 + 1];
												local781 = Static82.anIntArray172[local25];
												local4906 = Static16.method3757(local792);
												if (local4906.method2633()) {
													Static152.aStringArray29[local32++] = Static35.method622(local781).method4204(local4906.aString227, local792);
												} else {
													Static82.anIntArray172[local25++] = Static35.method622(local781).method4202(local792, local4906.anInt3511);
												}
												continue;
											}
										} else if (local215 < 5100) {
											if (local215 == 5000) {
												Static82.anIntArray172[local25++] = Static13.anInt509;
												continue;
											}
											if (local215 == 5001) {
												local25 -= 3;
												Static13.anInt509 = Static82.anIntArray172[local25];
												Static121.anInt3111 = Static82.anIntArray172[local25 + 1];
												Static56.anInt1547 = Static82.anIntArray172[local25 + 2];
												Static171.aClass1_Sub13_Sub1_3.method1825(75);
												Static171.aClass1_Sub13_Sub1_3.method1766(Static13.anInt509);
												Static171.aClass1_Sub13_Sub1_3.method1766(Static121.anInt3111);
												Static171.aClass1_Sub13_Sub1_3.method1766(Static56.anInt1547);
												continue;
											}
											if (local215 == 5002) {
												local32--;
												local585 = Static152.aStringArray29[local32];
												local25 -= 2;
												local1005 = Static82.anIntArray172[local25 + 1];
												local792 = Static82.anIntArray172[local25];
												Static171.aClass1_Sub13_Sub1_3.method1825(39);
												Static171.aClass1_Sub13_Sub1_3.method1770(Static93.method2008(local585));
												Static171.aClass1_Sub13_Sub1_3.method1766(local792 - 1);
												Static171.aClass1_Sub13_Sub1_3.method1766(local1005);
												continue;
											}
											if (local215 == 5003) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local1516 = null;
												if (local781 < 100) {
													local1516 = Static134.aStringArray27[local781];
												}
												if (local1516 == null) {
													local1516 = "";
												}
												Static152.aStringArray29[local32++] = local1516;
												continue;
											}
											if (local215 == 5004) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local792 = -1;
												if (local781 < 100 && Static134.aStringArray27[local781] != null) {
													local792 = Static96.anIntArray195[local781];
												}
												Static82.anIntArray172[local25++] = local792;
												continue;
											}
											if (local215 == 5005) {
												Static82.anIntArray172[local25++] = Static121.anInt3111;
												continue;
											}
											if (local215 == 5008) {
												local32--;
												local585 = Static152.aStringArray29[local32];
												if (local585.startsWith("::")) {
													Static198.method3474(local585);
													continue;
												}
												if (Static203.anInt4493 == 0 && (Static123.aBoolean66 && !Static60.aBoolean92 || Static148.aBoolean24)) {
													continue;
												}
												@Pc(5341) byte local5341 = 0;
												@Pc(5343) byte local5343 = 0;
												local1516 = local585.toLowerCase();
												if (local1516.startsWith(Static62.aString102)) {
													local5341 = 0;
													local585 = local585.substring(Static62.aString102.length());
												} else if (local1516.startsWith(Static174.aString267)) {
													local5341 = 1;
													local585 = local585.substring(Static174.aString267.length());
												} else if (local1516.startsWith(Static196.aString65)) {
													local5341 = 2;
													local585 = local585.substring(Static196.aString65.length());
												} else if (local1516.startsWith(Static24.aString34)) {
													local585 = local585.substring(Static24.aString34.length());
													local5341 = 3;
												} else if (local1516.startsWith(Static243.aString375)) {
													local5341 = 4;
													local585 = local585.substring(Static243.aString375.length());
												} else if (local1516.startsWith(Static166.aString254)) {
													local585 = local585.substring(Static166.aString254.length());
													local5341 = 5;
												} else if (local1516.startsWith(Static164.aString247)) {
													local585 = local585.substring(Static164.aString247.length());
													local5341 = 6;
												} else if (local1516.startsWith(Static84.aString147)) {
													local5341 = 7;
													local585 = local585.substring(Static84.aString147.length());
												} else if (local1516.startsWith(Static106.aString182)) {
													local585 = local585.substring(Static106.aString182.length());
													local5341 = 8;
												} else if (local1516.startsWith(Static146.aString230)) {
													local585 = local585.substring(Static146.aString230.length());
													local5341 = 9;
												} else if (local1516.startsWith(Static241.aString372)) {
													local585 = local585.substring(Static241.aString372.length());
													local5341 = 10;
												} else if (local1516.startsWith(Static101.aString177)) {
													local5341 = 11;
													local585 = local585.substring(Static101.aString177.length());
												} else if (Static135.anInt3311 != 0) {
													if (local1516.startsWith(Static112.aString189)) {
														local5341 = 0;
														local585 = local585.substring(Static112.aString189.length());
													} else if (local1516.startsWith(Static77.aString129)) {
														local5341 = 1;
														local585 = local585.substring(Static77.aString129.length());
													} else if (local1516.startsWith(Static140.aString219)) {
														local585 = local585.substring(Static140.aString219.length());
														local5341 = 2;
													} else if (local1516.startsWith(Static181.aString279)) {
														local5341 = 3;
														local585 = local585.substring(Static181.aString279.length());
													} else if (local1516.startsWith(Static207.aString312)) {
														local585 = local585.substring(Static207.aString312.length());
														local5341 = 4;
													} else if (local1516.startsWith(Static193.aString290)) {
														local5341 = 5;
														local585 = local585.substring(Static193.aString290.length());
													} else if (local1516.startsWith(Static99.aString174)) {
														local5341 = 6;
														local585 = local585.substring(Static99.aString174.length());
													} else if (local1516.startsWith(Static101.aString175)) {
														local5341 = 7;
														local585 = local585.substring(Static101.aString175.length());
													} else if (local1516.startsWith(Static70.aString116)) {
														local5341 = 8;
														local585 = local585.substring(Static70.aString116.length());
													} else if (local1516.startsWith(Static204.aString307)) {
														local585 = local585.substring(Static204.aString307.length());
														local5341 = 9;
													} else if (local1516.startsWith(Static67.aString110)) {
														local5341 = 10;
														local585 = local585.substring(Static67.aString110.length());
													} else if (local1516.startsWith(Static97.aString231)) {
														local5341 = 11;
														local585 = local585.substring(Static97.aString231.length());
													}
												}
												local1516 = local585.toLowerCase();
												if (local1516.startsWith(Static37.aString50)) {
													local5343 = 1;
													local585 = local585.substring(Static37.aString50.length());
												} else if (local1516.startsWith(Static51.aString82)) {
													local585 = local585.substring(Static51.aString82.length());
													local5343 = 2;
												} else if (local1516.startsWith(Static43.aString72)) {
													local585 = local585.substring(Static43.aString72.length());
													local5343 = 3;
												} else if (local1516.startsWith(Static264.aString392)) {
													local585 = local585.substring(Static264.aString392.length());
													local5343 = 4;
												} else if (local1516.startsWith(Static218.aString338)) {
													local585 = local585.substring(Static218.aString338.length());
													local5343 = 5;
												} else if (Static135.anInt3311 != 0) {
													if (local1516.startsWith(Static191.aString287)) {
														local5343 = 1;
														local585 = local585.substring(Static191.aString287.length());
													} else if (local1516.startsWith(Static186.aString280)) {
														local5343 = 2;
														local585 = local585.substring(Static186.aString280.length());
													} else if (local1516.startsWith(Static125.aString201)) {
														local5343 = 3;
														local585 = local585.substring(Static125.aString201.length());
													} else if (local1516.startsWith(Static222.aString345)) {
														local5343 = 4;
														local585 = local585.substring(Static222.aString345.length());
													} else if (local1516.startsWith(Static111.aString188)) {
														local5343 = 5;
														local585 = local585.substring(Static111.aString188.length());
													}
												}
												Static171.aClass1_Sub13_Sub1_3.method1825(46);
												Static171.aClass1_Sub13_Sub1_3.method1766(0);
												local654 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
												Static171.aClass1_Sub13_Sub1_3.method1766(local5341);
												Static171.aClass1_Sub13_Sub1_3.method1766(local5343);
												Static148.method204(local585, Static171.aClass1_Sub13_Sub1_3);
												Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local654);
												continue;
											}
											if (local215 == 5009) {
												local32 -= 2;
												local585 = Static152.aStringArray29[local32];
												local1516 = Static152.aStringArray29[local32 + 1];
												if (Static203.anInt4493 != 0 || (!Static123.aBoolean66 || Static60.aBoolean92) && !Static148.aBoolean24) {
													Static171.aClass1_Sub13_Sub1_3.method1825(206);
													Static171.aClass1_Sub13_Sub1_3.method1766(0);
													local1005 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
													Static171.aClass1_Sub13_Sub1_3.method1770(Static93.method2008(local585));
													Static148.method204(local1516, Static171.aClass1_Sub13_Sub1_3);
													Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local1005);
												}
												continue;
											}
											if (local215 == 5010) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local1516 = null;
												if (local781 < 100) {
													local1516 = Static22.aStringArray20[local781];
												}
												if (local1516 == null) {
													local1516 = "";
												}
												Static152.aStringArray29[local32++] = local1516;
												continue;
											}
											if (local215 == 5011) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local1516 = null;
												if (local781 < 100) {
													local1516 = Static121.aStringArray23[local781];
												}
												if (local1516 == null) {
													local1516 = "";
												}
												Static152.aStringArray29[local32++] = local1516;
												continue;
											}
											if (local215 == 5012) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local792 = -1;
												if (local781 < 100) {
													local792 = Static66.anIntArray140[local781];
												}
												Static82.anIntArray172[local25++] = local792;
												continue;
											}
											if (local215 == 5015) {
												if (Static83.aClass9_Sub1_Sub1_1 == null || Static83.aClass9_Sub1_Sub1_1.aString12 == null) {
													local585 = Static60.aString96;
												} else {
													local585 = Static83.aClass9_Sub1_Sub1_1.method184();
												}
												Static152.aStringArray29[local32++] = local585;
												continue;
											}
											if (local215 == 5016) {
												Static82.anIntArray172[local25++] = Static56.anInt1547;
												continue;
											}
											if (local215 == 5017) {
												Static82.anIntArray172[local25++] = Static196.anInt1178;
												continue;
											}
											if (local215 == 5050) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												Static152.aStringArray29[local32++] = Static7.method1525(local781).aString284;
												continue;
											}
											@Pc(6053) Class1_Sub2_Sub13 local6053;
											if (local215 == 5051) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local6053 = Static7.method1525(local781);
												if (local6053.anIntArray315 == null) {
													Static82.anIntArray172[local25++] = 0;
												} else {
													Static82.anIntArray172[local25++] = local6053.anIntArray315.length;
												}
												continue;
											}
											if (local215 == 5052) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												@Pc(6092) Class1_Sub2_Sub13 local6092 = Static7.method1525(local781);
												local629 = local6092.anIntArray315[local792];
												Static82.anIntArray172[local25++] = local629;
												continue;
											}
											if (local215 == 5053) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												local6053 = Static7.method1525(local781);
												if (local6053.anIntArray316 == null) {
													Static82.anIntArray172[local25++] = 0;
												} else {
													Static82.anIntArray172[local25++] = local6053.anIntArray316.length;
												}
												continue;
											}
											if (local215 == 5054) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												Static82.anIntArray172[local25++] = Static7.method1525(local781).anIntArray316[local792];
												continue;
											}
											if (local215 == 5055) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												Static152.aStringArray29[local32++] = Static224.method3732(local781).method2902();
												continue;
											}
											if (local215 == 5056) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												@Pc(6196) Class1_Sub2_Sub12 local6196 = Static224.method3732(local781);
												if (local6196.anIntArray294 == null) {
													Static82.anIntArray172[local25++] = 0;
												} else {
													Static82.anIntArray172[local25++] = local6196.anIntArray294.length;
												}
												continue;
											}
											if (local215 == 5057) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												Static82.anIntArray172[local25++] = Static224.method3732(local781).anIntArray294[local792];
												continue;
											}
											if (local215 == 5058) {
												Static148.aClass70_3 = new Class70();
												local25--;
												Static148.aClass70_3.anInt3087 = Static82.anIntArray172[local25];
												Static148.aClass70_3.aClass1_Sub2_Sub12_1 = Static224.method3732(Static148.aClass70_3.anInt3087);
												Static148.aClass70_3.anIntArray223 = new int[Static148.aClass70_3.aClass1_Sub2_Sub12_1.method2909()];
												continue;
											}
											if (local215 == 5059) {
												Static171.aClass1_Sub13_Sub1_3.method1825(83);
												Static171.aClass1_Sub13_Sub1_3.method1766(0);
												local781 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
												Static171.aClass1_Sub13_Sub1_3.method1766(0);
												Static171.aClass1_Sub13_Sub1_3.method1789(Static148.aClass70_3.anInt3087);
												Static148.aClass70_3.aClass1_Sub2_Sub12_1.method2907(Static148.aClass70_3.anIntArray223, Static171.aClass1_Sub13_Sub1_3);
												Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local781);
												continue;
											}
											if (local215 == 5060) {
												local32--;
												local585 = Static152.aStringArray29[local32];
												Static171.aClass1_Sub13_Sub1_3.method1825(150);
												Static171.aClass1_Sub13_Sub1_3.method1766(0);
												local792 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
												Static171.aClass1_Sub13_Sub1_3.method1770(Static93.method2008(local585));
												Static171.aClass1_Sub13_Sub1_3.method1789(Static148.aClass70_3.anInt3087);
												Static148.aClass70_3.aClass1_Sub2_Sub12_1.method2907(Static148.aClass70_3.anIntArray223, Static171.aClass1_Sub13_Sub1_3);
												Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local792);
												continue;
											}
											if (local215 == 5061) {
												Static171.aClass1_Sub13_Sub1_3.method1825(83);
												Static171.aClass1_Sub13_Sub1_3.method1766(0);
												local781 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
												Static171.aClass1_Sub13_Sub1_3.method1766(1);
												Static171.aClass1_Sub13_Sub1_3.method1789(Static148.aClass70_3.anInt3087);
												Static148.aClass70_3.aClass1_Sub2_Sub12_1.method2907(Static148.aClass70_3.anIntArray223, Static171.aClass1_Sub13_Sub1_3);
												Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local781);
												continue;
											}
											if (local215 == 5062) {
												local25 -= 2;
												local792 = Static82.anIntArray172[local25 + 1];
												local781 = Static82.anIntArray172[local25];
												Static82.anIntArray172[local25++] = Static7.method1525(local781).aCharArray2[local792];
												continue;
											}
											if (local215 == 5063) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												Static82.anIntArray172[local25++] = Static7.method1525(local781).aCharArray3[local792];
												continue;
											}
											if (local215 == 5064) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												if (local792 == -1) {
													Static82.anIntArray172[local25++] = -1;
												} else {
													Static82.anIntArray172[local25++] = Static7.method1525(local781).method3176((char) local792);
												}
												continue;
											}
											if (local215 == 5065) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												if (local792 == -1) {
													Static82.anIntArray172[local25++] = -1;
												} else {
													Static82.anIntArray172[local25++] = Static7.method1525(local781).method3177((char) local792);
												}
												continue;
											}
											if (local215 == 5066) {
												local25--;
												local781 = Static82.anIntArray172[local25];
												Static82.anIntArray172[local25++] = Static224.method3732(local781).method2909();
												continue;
											}
											if (local215 == 5067) {
												local25 -= 2;
												local792 = Static82.anIntArray172[local25 + 1];
												local781 = Static82.anIntArray172[local25];
												local1005 = Static224.method3732(local781).method2911(local792);
												Static82.anIntArray172[local25++] = local1005;
												continue;
											}
											if (local215 == 5068) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												Static148.aClass70_3.anIntArray223[local781] = local792;
												continue;
											}
											if (local215 == 5069) {
												local25 -= 2;
												local781 = Static82.anIntArray172[local25];
												local792 = Static82.anIntArray172[local25 + 1];
												Static148.aClass70_3.anIntArray223[local781] = local792;
												continue;
											}
											if (local215 == 5070) {
												local25 -= 3;
												local792 = Static82.anIntArray172[local25 + 1];
												local781 = Static82.anIntArray172[local25];
												local1005 = Static82.anIntArray172[local25 + 2];
												@Pc(6667) Class1_Sub2_Sub12 local6667 = Static224.method3732(local781);
												if (local6667.method2911(local792) != 0) {
													throw new RuntimeException("bad command");
												}
												Static82.anIntArray172[local25++] = local6667.method2904(local792, local1005);
												continue;
											}
											if (local215 == 5071) {
												local32--;
												local585 = Static152.aStringArray29[local32];
												local25--;
												local6711 = Static82.anIntArray172[local25] == 1;
												Static197.method1777(local6711, local585);
												Static82.anIntArray172[local25++] = Static147.anInt3575;
												continue;
											}
											if (local215 == 5072) {
												if (Static82.aShortArray32 != null && Static187.anInt4203 < Static147.anInt3575) {
													Static82.anIntArray172[local25++] = Static82.aShortArray32[Static187.anInt4203++] & 0xFFFF;
													continue;
												}
												Static82.anIntArray172[local25++] = -1;
												continue;
											}
											if (local215 == 5073) {
												Static187.anInt4203 = 0;
												continue;
											}
										} else if (local215 >= 5200) {
											@Pc(7200) boolean local7200;
											if (local215 < 5300) {
												if (local215 == 5200) {
													local25--;
													Static203.method3392(Static82.anIntArray172[local25]);
													continue;
												}
												if (local215 == 5201) {
													Static82.anIntArray172[local25++] = Static242.method3982();
													continue;
												}
												if (local215 == 5202) {
													local25--;
													Static9.method182(Static82.anIntArray172[local25]);
													continue;
												}
												if (local215 == 5203) {
													local32--;
													Static7.method1526(Static152.aStringArray29[local32]);
													continue;
												}
												if (local215 == 5204) {
													Static152.aStringArray29[local32 - 1] = Static12.method227(Static152.aStringArray29[local32 - 1]);
													continue;
												}
												if (local215 == 5205) {
													local25--;
													Static217.method3550(-1, Static82.anIntArray172[local25], -1);
													continue;
												}
												@Pc(6874) Class1_Sub2_Sub11 local6874;
												if (local215 == 5206) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static76.method1503(local781 >> 14 & 0x3FFF, local781 & 0x3FFF);
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = -1;
													} else {
														Static82.anIntArray172[local25++] = local6874.anInt3844;
													}
													continue;
												}
												@Pc(6903) Class1_Sub2_Sub11 local6903;
												if (local215 == 5207) {
													local25--;
													local6903 = Static33.method3953(Static82.anIntArray172[local25]);
													if (local6903 != null && local6903.aString249 != null) {
														Static152.aStringArray29[local32++] = local6903.aString249;
														continue;
													}
													Static152.aStringArray29[local32++] = "";
													continue;
												}
												if (local215 == 5208) {
													Static82.anIntArray172[local25++] = Static239.anInt5156;
													Static82.anIntArray172[local25++] = Static148.anInt478;
													continue;
												}
												if (local215 == 5209) {
													Static82.anIntArray172[local25++] = Static209.anInt4574 + Static39.anInt1086;
													Static82.anIntArray172[local25++] = Static46.anInt1376 + Static174.anInt3997 - Static239.anInt5151 - 1;
													continue;
												}
												if (local215 == 5210) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static33.method3953(local781);
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = 0;
														Static82.anIntArray172[local25++] = 0;
													} else {
														Static82.anIntArray172[local25++] = local6874.anInt3843 >> 14 & 0x3FFF;
														Static82.anIntArray172[local25++] = local6874.anInt3843 & 0x3FFF;
													}
													continue;
												}
												if (local215 == 5211) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static33.method3953(local781);
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = 0;
														Static82.anIntArray172[local25++] = 0;
													} else {
														Static82.anIntArray172[local25++] = local6874.anInt3854 - local6874.anInt3839;
														Static82.anIntArray172[local25++] = local6874.anInt3846 - local6874.anInt3848;
													}
													continue;
												}
												if (local215 == 5212) {
													local781 = Static11.method220();
													local1005 = 0;
													if (local781 == -1) {
														local1516 = "";
													} else {
														local1516 = Static254.aClass151_2.aStringArray39[local781];
														local1005 = Static254.aClass151_2.method4218(local781);
													}
													local1516 = Static48.method983(local1516, " ", "<br>");
													Static152.aStringArray29[local32++] = local1516;
													Static82.anIntArray172[local25++] = local1005;
													continue;
												}
												if (local215 == 5213) {
													local781 = Static214.method3527();
													local1005 = 0;
													if (local781 == -1) {
														local1516 = "";
													} else {
														local1516 = Static254.aClass151_2.aStringArray39[local781];
														local1005 = Static254.aClass151_2.method4218(local781);
													}
													local1516 = Static48.method983(local1516, " ", "<br>");
													Static152.aStringArray29[local32++] = local1516;
													Static82.anIntArray172[local25++] = local1005;
													continue;
												}
												if (local215 == 5214) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static21.method414();
													if (local6874 != null) {
														local1511 = local6874.method2860(local781 >> 28 & 0x3, local781 & 0x3FFF, local781 >> 14 & 0x3FFF);
														if (local1511 != null) {
															Static155.method2758(local1511[1], local1511[2]);
														}
													}
													continue;
												}
												if (local215 == 5215) {
													local7200 = false;
													local25 -= 2;
													local792 = Static82.anIntArray172[local25 + 1];
													local781 = Static82.anIntArray172[local25];
													@Pc(7222) Class99 local7222 = Static4.method78(local781 >> 14 & 0x3FFF, local781 & 0x3FFF);
													for (@Pc(7227) Class1_Sub2_Sub11 local7227 = (Class1_Sub2_Sub11) local7222.method2970(); local7227 != null; local7227 = (Class1_Sub2_Sub11) local7222.method2969()) {
														if (local7227.anInt3844 == local792) {
															local7200 = true;
															break;
														}
													}
													if (local7200) {
														Static82.anIntArray172[local25++] = 1;
													} else {
														Static82.anIntArray172[local25++] = 0;
													}
													continue;
												}
												if (local215 == 5216) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													Static51.method1016(local781);
													continue;
												}
												if (local215 == 5217) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (Static157.method2799(local781)) {
														Static82.anIntArray172[local25++] = 1;
													} else {
														Static82.anIntArray172[local25++] = 0;
													}
													continue;
												}
												if (local215 == 5218) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static33.method3953(local781);
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = -1;
													} else {
														Static82.anIntArray172[local25++] = local6874.anInt3842;
													}
													continue;
												}
												if (local215 == 5219) {
													local32--;
													Static16.method3758(Static152.aStringArray29[local32]);
													continue;
												}
												if (local215 == 5220) {
													Static82.anIntArray172[local25++] = Static265.anInt5546 == 100 ? 1 : 0;
													continue;
												}
												if (local215 == 5221) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													Static155.method2758(local781 >> 14 & 0x3FFF, local781 & 0x3FFF);
													continue;
												}
												if (local215 == 5222) {
													local6903 = Static21.method414();
													if (local6903 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static82.anIntArray172[local25++] = -1;
													} else {
														local627 = local6903.method2856(Static46.anInt1376 + Static174.anInt3997 - Static239.anInt5151 - 1, Static39.anInt1086 - -Static209.anInt4574);
														if (local627 == null) {
															Static82.anIntArray172[local25++] = -1;
															Static82.anIntArray172[local25++] = -1;
														} else {
															Static82.anIntArray172[local25++] = local627[1];
															Static82.anIntArray172[local25++] = local627[2];
														}
													}
													continue;
												}
												if (local215 == 5223) {
													local25 -= 2;
													local781 = Static82.anIntArray172[local25];
													local792 = Static82.anIntArray172[local25 + 1];
													Static217.method3550(local792 & 0x3FFF, local781, local792 >> 14 & 0x3FFF);
													continue;
												}
												if (local215 == 5224) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static21.method414();
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static82.anIntArray172[local25++] = -1;
													} else {
														local1511 = local6874.method2860(local781 >> 28 & 0x3, local781 & 0x3FFF, local781 >> 14 & 0x3FFF);
														if (local1511 == null) {
															Static82.anIntArray172[local25++] = -1;
															Static82.anIntArray172[local25++] = -1;
														} else {
															Static82.anIntArray172[local25++] = local1511[1];
															Static82.anIntArray172[local25++] = local1511[2];
														}
													}
													continue;
												}
												if (local215 == 5225) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6874 = Static21.method414();
													if (local6874 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static82.anIntArray172[local25++] = -1;
													} else {
														local1511 = local6874.method2856(local781 & 0x3FFF, local781 >> 14 & 0x3FFF);
														if (local1511 == null) {
															Static82.anIntArray172[local25++] = -1;
															Static82.anIntArray172[local25++] = -1;
														} else {
															Static82.anIntArray172[local25++] = local1511[1];
															Static82.anIntArray172[local25++] = local1511[2];
														}
													}
													continue;
												}
											} else if (local215 < 5400) {
												if (local215 == 5300) {
													local25 -= 2;
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 5301) {
													continue;
												}
												if (local215 == 5302) {
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 5303) {
													local25--;
													Static82.anIntArray172[local25++] = 0;
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 5305) {
													Static82.anIntArray172[local25++] = -1;
													continue;
												}
												if (local215 == 5306) {
													Static82.anIntArray172[local25++] = Static110.method2246();
													continue;
												}
												if (local215 == 5307) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static48.method981(false, -1, -1, local781);
													continue;
												}
												if (local215 == 5308) {
													Static82.anIntArray172[local25++] = Static57.anInt1587;
													continue;
												}
												if (local215 == 5309) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static57.anInt1587 = local781;
													Static22.method2185(Static38.aClass28_1);
													continue;
												}
											} else if (local215 < 5500) {
												if (local215 == 5400) {
													local32 -= 2;
													local25--;
													local1005 = Static82.anIntArray172[local25];
													local585 = Static152.aStringArray29[local32];
													local1516 = Static152.aStringArray29[local32 + 1];
													Static171.aClass1_Sub13_Sub1_3.method1825(11);
													Static171.aClass1_Sub13_Sub1_3.method1766(Static201.method3338(local585) + Static201.method3338(local1516) + 1);
													Static171.aClass1_Sub13_Sub1_3.method1791(local585);
													Static171.aClass1_Sub13_Sub1_3.method1791(local1516);
													Static171.aClass1_Sub13_Sub1_3.method1766(local1005);
													continue;
												}
												if (local215 == 5401) {
													local25 -= 2;
													Static74.aShortArray28[Static82.anIntArray172[local25]] = (short) Static131.method689(Static82.anIntArray172[local25 + 1]);
													Static249.method4056();
													Static233.method3881();
													Static134.method2493();
													Static139.method4200();
													Static112.method2258();
													continue;
												}
												if (local215 == 5405) {
													local25 -= 2;
													local781 = Static82.anIntArray172[local25];
													local792 = Static82.anIntArray172[local25 + 1];
													if (local781 >= 0 && local781 < 2) {
														Static227.anIntArrayArrayArray11[local781] = new int[local792 << 1][4];
													}
													continue;
												}
												if (local215 == 5406) {
													local25 -= 7;
													local792 = Static82.anIntArray172[local25 + 1] << 1;
													local781 = Static82.anIntArray172[local25];
													local1005 = Static82.anIntArray172[local25 + 2];
													local629 = Static82.anIntArray172[local25 + 3];
													local654 = Static82.anIntArray172[local25 + 4];
													@Pc(7921) int local7921 = Static82.anIntArray172[local25 + 6];
													local1048 = Static82.anIntArray172[local25 + 5];
													if (local781 >= 0 && local781 < 2 && Static227.anIntArrayArrayArray11[local781] != null && local792 >= 0 && local792 < Static227.anIntArrayArrayArray11[local781].length) {
														Static227.anIntArrayArrayArray11[local781][local792] = new int[] { (local1005 >> 14 & 0x3FFF) * 128, local629, (local1005 & 0x3FFF) * 128, local7921 };
														Static227.anIntArrayArrayArray11[local781][local792 + 1] = new int[] { (local654 >> 14 & 0x3FFF) * 128, local1048, (local654 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local215 == 5407) {
													local25--;
													local781 = Static227.anIntArrayArrayArray11[Static82.anIntArray172[local25]].length >> 1;
													Static82.anIntArray172[local25++] = local781;
													continue;
												}
												if (local215 == 5411) {
													if (Static42.aFrame1 == null) {
														Static151.method2719(Static210.method3483(), false);
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local215 == 5419) {
													local585 = "";
													if (Static3.aClass145_1 != null) {
														if (Static3.aClass145_1.anObject7 == null) {
															local585 = Static47.method968(Static3.aClass145_1.anInt5356);
														} else {
															local585 = (String) Static3.aClass145_1.anObject7;
														}
													}
													Static152.aStringArray29[local32++] = local585;
													continue;
												}
												if (local215 == 5420) {
													Static82.anIntArray172[local25++] = Static40.anInt1103 == 3 ? 1 : 0;
													continue;
												}
												if (local215 == 5421) {
													local32--;
													local585 = Static152.aStringArray29[local32];
													local25--;
													local6711 = Static82.anIntArray172[local25] == 1;
													@Pc(8135) String local8135 = Static210.method3483() + local585;
													if (Static42.aFrame1 == null && (!local6711 || Static40.anInt1103 == 3 || !Static40.aString58.startsWith("win") || Static151.aBoolean187)) {
														Static151.method2719(local8135, local6711);
														continue;
													}
													Static263.aBoolean281 = local6711;
													Static59.aString95 = local8135;
													Static99.aClass145_5 = Static38.aClass28_1.method721(local8135);
													continue;
												}
												if (local215 == 5422) {
													local32 -= 2;
													local585 = Static152.aStringArray29[local32];
													local25--;
													local1005 = Static82.anIntArray172[local25];
													local1516 = Static152.aStringArray29[local32 + 1];
													if (local585.length() > 0) {
														if (Static2.aStringArray1 == null) {
															Static2.aStringArray1 = new String[Static197.anIntArray176[Static68.anInt1404]];
														}
														Static2.aStringArray1[local1005] = local585;
													}
													if (local1516.length() > 0) {
														if (Static133.aStringArray26 == null) {
															Static133.aStringArray26 = new String[Static197.anIntArray176[Static68.anInt1404]];
														}
														Static133.aStringArray26[local1005] = local1516;
													}
													continue;
												}
												if (local215 == 5423) {
													local32--;
													System.out.println(Static152.aStringArray29[local32]);
													continue;
												}
												if (local215 == 5424) {
													local25 -= 11;
													Static91.anInt2523 = Static82.anIntArray172[local25];
													Static193.anInt4301 = Static82.anIntArray172[local25 + 1];
													Static112.anInt2953 = Static82.anIntArray172[local25 + 2];
													Static259.anInt5468 = Static82.anIntArray172[local25 + 3];
													Static135.anInt3312 = Static82.anIntArray172[local25 + 4];
													Static239.anInt5148 = Static82.anIntArray172[local25 + 5];
													Static115.anInt3012 = Static82.anIntArray172[local25 + 6];
													Static51.anInt1458 = Static82.anIntArray172[local25 + 7];
													Static87.anInt2470 = Static82.anIntArray172[local25 + 8];
													Static209.anInt4575 = Static82.anIntArray172[local25 + 9];
													Static98.anInt2702 = Static82.anIntArray172[local25 + 10];
													Static24.aClass51_10.method1868(Static135.anInt3312);
													Static24.aClass51_10.method1868(Static239.anInt5148);
													Static24.aClass51_10.method1868(Static115.anInt3012);
													Static24.aClass51_10.method1868(Static51.anInt1458);
													Static24.aClass51_10.method1868(Static87.anInt2470);
													Static4.aBoolean4 = true;
													continue;
												}
												if (local215 == 5425) {
													Static25.method508();
													Static4.aBoolean4 = false;
													continue;
												}
												if (local215 == 5426) {
													local25--;
													Static216.anInt4749 = Static82.anIntArray172[local25];
													continue;
												}
												if (local215 == 5427) {
													local25 -= 2;
													Static255.anInt5424 = Static82.anIntArray172[local25];
													Static202.anInt4460 = Static82.anIntArray172[local25 + 1];
													continue;
												}
												if (local215 == 5428) {
													local25 -= 2;
													local781 = Static82.anIntArray172[local25];
													local792 = Static82.anIntArray172[local25 + 1];
													Static82.anIntArray172[local25++] = Static122.method2379(local781, local792) ? 1 : 0;
													continue;
												}
											} else if (local215 < 5600) {
												if (local215 == 5500) {
													local25 -= 4;
													local629 = Static82.anIntArray172[local25 + 3];
													local1005 = Static82.anIntArray172[local25 + 2];
													local792 = Static82.anIntArray172[local25 + 1];
													local781 = Static82.anIntArray172[local25];
													Static149.method2691(local792, false, local1005, (local781 >> 14 & 0x3FFF) - Static64.anInt1786, -Static29.anInt907 + (local781 & 0x3FFF), local629);
													continue;
												}
												if (local215 == 5501) {
													local25 -= 4;
													local1005 = Static82.anIntArray172[local25 + 2];
													local629 = Static82.anIntArray172[local25 + 3];
													local792 = Static82.anIntArray172[local25 + 1];
													local781 = Static82.anIntArray172[local25];
													Static111.method2252((local781 & 0x3FFF) - Static29.anInt907, local1005, local792, local629, (local781 >> 14 & 0x3FFF) - Static64.anInt1786);
													continue;
												}
												if (local215 == 5502) {
													local25 -= 6;
													local781 = Static82.anIntArray172[local25];
													if (local781 >= 2) {
														throw new RuntimeException();
													}
													Static99.anInt2713 = local781;
													local792 = Static82.anIntArray172[local25 + 1];
													if (Static227.anIntArrayArrayArray11[Static99.anInt2713].length >> 1 <= local792 + 1) {
														throw new RuntimeException();
													}
													Static123.anInt1281 = 0;
													Static223.anInt4896 = local792;
													Static84.anInt2408 = Static82.anIntArray172[local25 + 2];
													Static256.anInt5444 = Static82.anIntArray172[local25 + 3];
													local1005 = Static82.anIntArray172[local25 + 4];
													if (local1005 >= 2) {
														throw new RuntimeException();
													}
													Static187.anInt4200 = local1005;
													local629 = Static82.anIntArray172[local25 + 5];
													if (local629 + 1 >= Static227.anIntArrayArrayArray11[Static187.anInt4200].length >> 1) {
														throw new RuntimeException();
													}
													Static184.anInt4178 = local629;
													Static61.anInt1682 = 3;
													continue;
												}
												if (local215 == 5503) {
													Static236.method3914();
													continue;
												}
												if (local215 == 5504) {
													local25 -= 2;
													Static123.method886(Static82.anIntArray172[local25], Static82.anIntArray172[local25 + 1]);
													continue;
												}
												if (local215 == 5505) {
													Static82.anIntArray172[local25++] = (int) Static158.aFloat32;
													continue;
												}
												if (local215 == 5506) {
													Static82.anIntArray172[local25++] = (int) Static230.aFloat51;
													continue;
												}
												if (local215 == 5507) {
													Static56.method1071();
													continue;
												}
												if (local215 == 5508) {
													Static152.method2735();
													continue;
												}
												if (local215 == 5509) {
													Static146.method2665();
													continue;
												}
												if (local215 == 5510) {
													Static165.method2877();
													continue;
												}
												if (local215 == 5512) {
													Static116.method2307();
													continue;
												}
											} else if (local215 < 5700) {
												if (local215 == 5600) {
													local32 -= 2;
													local585 = Static152.aStringArray29[local32];
													local1516 = Static152.aStringArray29[local32 + 1];
													local25--;
													local1005 = Static82.anIntArray172[local25];
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0 && Static191.anInt4274 == 0) {
														Static65.method1284(local1005, local585, local1516);
													}
													continue;
												}
												if (local215 == 5601) {
													Static4.method74();
													continue;
												}
												if (local215 == 5602) {
													if (Static238.anInt5145 == 0) {
														Static169.anInt3963 = -2;
													}
													continue;
												}
												if (local215 == 5603) {
													local25 -= 4;
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0 && Static191.anInt4274 == 0) {
														Static88.method1882(Static82.anIntArray172[local25 + 3], Static82.anIntArray172[local25], Static82.anIntArray172[local25 + 2], Static82.anIntArray172[local25 + 1]);
													}
													continue;
												}
												if (local215 == 5604) {
													local32--;
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0 && Static191.anInt4274 == 0) {
														Static109.method2231(Static93.method2008(Static152.aStringArray29[local32]));
													}
													continue;
												}
												if (local215 == 5605) {
													local32 -= 3;
													local25 -= 7;
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0 && Static191.anInt4274 == 0) {
														Static28.method575(Static82.anIntArray172[local25 + 1], Static152.aStringArray29[local32 + 2], Static93.method2008(Static152.aStringArray29[local32]), Static82.anIntArray172[local25 + 6] == 1, Static82.anIntArray172[local25 + 5] == 1, Static152.aStringArray29[local32 + 1], Static82.anIntArray172[local25 + 2], Static82.anIntArray172[local25 + 3], Static82.anIntArray172[local25 + 4] == 1, Static82.anIntArray172[local25]);
													}
													continue;
												}
												if (local215 == 5606) {
													if (Static117.anInt3043 == 0) {
														Static243.anInt5242 = -2;
													}
													continue;
												}
												if (local215 == 5607) {
													Static82.anIntArray172[local25++] = Static169.anInt3963;
													continue;
												}
												if (local215 == 5608) {
													Static82.anIntArray172[local25++] = Static176.anInt4046;
													continue;
												}
												if (local215 == 5609) {
													Static82.anIntArray172[local25++] = Static243.anInt5242;
													continue;
												}
												if (local215 == 5610) {
													for (local781 = 0; local781 < 5; local781++) {
														Static152.aStringArray29[local32++] = local781 < Static59.aStringArray9.length ? Static13.method234(Static59.aStringArray9[local781]) : "";
													}
													Static59.aStringArray9 = null;
													continue;
												}
												if (local215 == 5611) {
													Static82.anIntArray172[local25++] = Static145.anInt3518;
													continue;
												}
											} else if (local215 < 6100) {
												if (local215 == 6001) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 1) {
														local781 = 1;
													}
													if (local781 > 4) {
														local781 = 4;
													}
													Static148.anInt398 = local781;
													if (Static148.anInt398 == 1) {
														Static235.method3894(0.9F);
													}
													if (Static148.anInt398 == 2) {
														Static235.method3894(0.8F);
													}
													if (Static148.anInt398 == 3) {
														Static235.method3894(0.7F);
													}
													if (Static148.anInt398 == 4) {
														Static235.method3894(0.6F);
													}
													Static233.method3881();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6002) {
													local25--;
													Static262.method4182(Static82.anIntArray172[local25] == 1);
													Static246.method4008();
													Static175.method3005();
													Static165.method2871();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6003) {
													local25--;
													Static3.aBoolean3 = Static82.anIntArray172[local25] == 1;
													Static165.method2871();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6005) {
													local25--;
													Static249.aBoolean270 = Static82.anIntArray172[local25] == 1;
													Static175.method3005();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6006) {
													local25--;
													Static132.aBoolean175 = Static82.anIntArray172[local25] == 1;
													((Class15_Sub1) Static235.anInterface1_1).method401(!Static132.aBoolean175);
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6007) {
													local25--;
													Static109.aBoolean156 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6008) {
													local25--;
													Static210.aBoolean226 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6009) {
													local25--;
													Static140.aBoolean181 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6010) {
													local25--;
													Static19.aBoolean37 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6011) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static153.anInt3692 = local781;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6012) {
													local25--;
													Static183.aBoolean263 = Static82.anIntArray172[local25] == 1;
													if (Static148.anInt398 == 1) {
														Static235.method3894(0.9F);
													}
													if (Static148.anInt398 == 2) {
														Static235.method3894(0.8F);
													}
													if (Static148.anInt398 == 3) {
														Static235.method3894(0.7F);
													}
													if (Static148.anInt398 == 4) {
														Static235.method3894(0.6F);
													}
													Static175.method3005();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6014) {
													local25--;
													Static63.aBoolean96 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6015) {
													local25--;
													Static174.aBoolean197 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6016) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static44.anInt1342 = local781;
													continue;
												}
												if (local215 == 6017) {
													local25--;
													Static69.aBoolean106 = Static82.anIntArray172[local25] == 1;
													Static64.method1259();
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6018) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 127) {
														local781 = 127;
													}
													Static237.anInt5140 = local781;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6019) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 255) {
														local781 = 255;
													}
													if (local781 != Static106.anInt2847) {
														if (Static106.anInt2847 == 0 && Static30.anInt925 != -1) {
															Static262.method4184(Static258.aClass51_83, Static30.anInt925, local781);
															Static1.aBoolean1 = false;
														} else if (local781 == 0) {
															Static82.method1658();
															Static1.aBoolean1 = false;
														} else {
															Static166.method2881(local781);
														}
														Static106.anInt2847 = local781;
													}
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6020) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 127) {
														local781 = 127;
													}
													Static47.anInt1385 = local781;
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													continue;
												}
												if (local215 == 6021) {
													local25--;
													Static178.aBoolean200 = Static82.anIntArray172[local25] == 1;
													Static165.method2871();
													continue;
												}
												if (local215 == 6023) {
													local6711 = false;
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 2) {
														local781 = 2;
													}
													if (Static169.anInt3959 < 96) {
														local781 = 0;
														local6711 = true;
													}
													Static163.method2836(local781);
													Static22.method2185(Static38.aClass28_1);
													Static2.aBoolean2 = false;
													Static82.anIntArray172[local25++] = local6711 ? 0 : 1;
													continue;
												}
												if (local215 == 6024) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static182.anInt4168 = local781;
													Static22.method2185(Static38.aClass28_1);
													continue;
												}
												if (local215 == 6027) {
													local25--;
													continue;
												}
												if (local215 == 6028) {
													local25--;
													Static188.aBoolean205 = Static82.anIntArray172[local25] != 0;
													Static22.method2185(Static38.aClass28_1);
													continue;
												}
											} else if (local215 < 6200) {
												if (local215 == 6101) {
													Static82.anIntArray172[local25++] = Static148.anInt398;
													continue;
												}
												if (local215 == 6102) {
													Static82.anIntArray172[local25++] = Static25.method507() ? 1 : 0;
													continue;
												}
												if (local215 == 6103) {
													Static82.anIntArray172[local25++] = Static3.aBoolean3 ? 1 : 0;
													continue;
												}
												if (local215 == 6105) {
													Static82.anIntArray172[local25++] = Static249.aBoolean270 ? 1 : 0;
													continue;
												}
												if (local215 == 6106) {
													Static82.anIntArray172[local25++] = Static132.aBoolean175 ? 1 : 0;
													continue;
												}
												if (local215 == 6107) {
													Static82.anIntArray172[local25++] = Static109.aBoolean156 ? 1 : 0;
													continue;
												}
												if (local215 == 6108) {
													Static82.anIntArray172[local25++] = Static210.aBoolean226 ? 1 : 0;
													continue;
												}
												if (local215 == 6109) {
													Static82.anIntArray172[local25++] = Static140.aBoolean181 ? 1 : 0;
													continue;
												}
												if (local215 == 6110) {
													Static82.anIntArray172[local25++] = Static19.aBoolean37 ? 1 : 0;
													continue;
												}
												if (local215 == 6111) {
													Static82.anIntArray172[local25++] = Static153.anInt3692;
													continue;
												}
												if (local215 == 6112) {
													Static82.anIntArray172[local25++] = Static183.aBoolean263 ? 1 : 0;
													continue;
												}
												if (local215 == 6114) {
													Static82.anIntArray172[local25++] = Static63.aBoolean96 ? 1 : 0;
													continue;
												}
												if (local215 == 6115) {
													Static82.anIntArray172[local25++] = Static174.aBoolean197 ? 1 : 0;
													continue;
												}
												if (local215 == 6116) {
													Static82.anIntArray172[local25++] = Static44.anInt1342;
													continue;
												}
												if (local215 == 6117) {
													Static82.anIntArray172[local25++] = Static69.aBoolean106 ? 1 : 0;
													continue;
												}
												if (local215 == 6118) {
													Static82.anIntArray172[local25++] = Static237.anInt5140;
													continue;
												}
												if (local215 == 6119) {
													Static82.anIntArray172[local25++] = Static106.anInt2847;
													continue;
												}
												if (local215 == 6120) {
													Static82.anIntArray172[local25++] = Static47.anInt1385;
													continue;
												}
												if (local215 == 6121) {
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 6123) {
													Static82.anIntArray172[local25++] = Static163.method2834();
													continue;
												}
												if (local215 == 6124) {
													Static82.anIntArray172[local25++] = Static182.anInt4168;
													continue;
												}
												if (local215 == 6126) {
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 6127) {
													Static82.anIntArray172[local25++] = Static25.aBoolean44 ? 1 : 0;
													continue;
												}
												if (local215 == 6128) {
													Static82.anIntArray172[local25++] = Static188.aBoolean205 ? 1 : 0;
													continue;
												}
											} else if (local215 < 6300) {
												if (local215 == 6200) {
													local25 -= 2;
													Static35.aShort9 = (short) Static82.anIntArray172[local25];
													if (Static35.aShort9 <= 0) {
														Static35.aShort9 = 256;
													}
													Static108.aShort17 = (short) Static82.anIntArray172[local25 + 1];
													if (Static108.aShort17 <= 0) {
														Static108.aShort17 = 205;
													}
													continue;
												}
												if (local215 == 6201) {
													local25 -= 2;
													Static83.aShort14 = (short) Static82.anIntArray172[local25];
													if (Static83.aShort14 <= 0) {
														Static83.aShort14 = 256;
													}
													Static242.aShort28 = (short) Static82.anIntArray172[local25 + 1];
													if (Static242.aShort28 <= 0) {
														Static242.aShort28 = 320;
													}
													continue;
												}
												if (local215 == 6202) {
													local25 -= 4;
													Static84.aShort15 = (short) Static82.anIntArray172[local25];
													if (Static84.aShort15 <= 0) {
														Static84.aShort15 = 1;
													}
													Static88.aShort16 = (short) Static82.anIntArray172[local25 + 1];
													if (Static88.aShort16 <= 0) {
														Static88.aShort16 = 32767;
													} else if (Static84.aShort15 > Static88.aShort16) {
														Static88.aShort16 = Static84.aShort15;
													}
													Static66.aShort11 = (short) Static82.anIntArray172[local25 + 2];
													if (Static66.aShort11 <= 0) {
														Static66.aShort11 = 1;
													}
													Static161.aShort18 = (short) Static82.anIntArray172[local25 + 3];
													if (Static161.aShort18 <= 0) {
														Static161.aShort18 = 32767;
													} else if (Static161.aShort18 < Static66.aShort11) {
														Static161.aShort18 = Static66.aShort11;
													}
													continue;
												}
												if (local215 == 6203) {
													Static193.method3249(Static205.aClass122_15.anInt4695, Static205.aClass122_15.anInt4726);
													Static82.anIntArray172[local25++] = Static105.anInt2828;
													Static82.anIntArray172[local25++] = Static151.anInt3623;
													continue;
												}
												if (local215 == 6204) {
													Static82.anIntArray172[local25++] = Static83.aShort14;
													Static82.anIntArray172[local25++] = Static242.aShort28;
													continue;
												}
												if (local215 == 6205) {
													Static82.anIntArray172[local25++] = Static35.aShort9;
													Static82.anIntArray172[local25++] = Static108.aShort17;
													continue;
												}
											} else if (local215 < 6400) {
												if (local215 == 6300) {
													Static82.anIntArray172[local25++] = (int) (Static31.method591() / 60000L);
													continue;
												}
												if (local215 == 6301) {
													Static82.anIntArray172[local25++] = (int) (Static31.method591() / 86400000L) - 11745;
													continue;
												}
												if (local215 == 6302) {
													local25 -= 3;
													local781 = Static82.anIntArray172[local25];
													local1005 = Static82.anIntArray172[local25 + 2];
													local792 = Static82.anIntArray172[local25 + 1];
													Static251.aCalendar2.clear();
													Static251.aCalendar2.set(11, 12);
													Static251.aCalendar2.set(local1005, local792, local781);
													Static82.anIntArray172[local25++] = (int) (Static251.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local215 == 6303) {
													Static251.aCalendar2.clear();
													Static251.aCalendar2.setTime(new Date(Static31.method591()));
													Static82.anIntArray172[local25++] = Static251.aCalendar2.get(1);
													continue;
												}
												if (local215 == 6304) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													local6711 = true;
													if (local781 < 0) {
														local6711 = (local781 + 1) % 4 == 0;
													} else if (local781 < 1582) {
														local6711 = local781 % 4 == 0;
													} else if (local781 % 4 != 0) {
														local6711 = false;
													} else if (local781 % 100 != 0) {
														local6711 = true;
													} else if (local781 % 400 != 0) {
														local6711 = false;
													}
													Static82.anIntArray172[local25++] = local6711 ? 1 : 0;
													continue;
												}
											} else if (local215 < 6500) {
												if (local215 == 6405) {
													Static82.anIntArray172[local25++] = Static138.method2530() ? 1 : 0;
													continue;
												}
												if (local215 == 6406) {
													Static82.anIntArray172[local25++] = Static145.method2632() ? 1 : 0;
													continue;
												}
											} else if (local215 < 6600) {
												if (local215 == 6500) {
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0) {
														Static82.anIntArray172[local25++] = Static34.method619() == -1 ? 0 : 1;
														continue;
													}
													Static82.anIntArray172[local25++] = 1;
													continue;
												}
												@Pc(9897) Class12 local9897;
												@Pc(9873) Class115_Sub1 local9873;
												if (local215 == 6501) {
													local9873 = Static121.method2369();
													if (local9873 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static82.anIntArray172[local25++] = 0;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
													} else {
														Static82.anIntArray172[local25++] = local9873.anInt4598;
														Static82.anIntArray172[local25++] = local9873.anInt4580;
														Static152.aStringArray29[local32++] = local9873.aString324;
														local9897 = local9873.method3479();
														Static82.anIntArray172[local25++] = local9897.anInt506;
														Static152.aStringArray29[local32++] = local9897.aString15;
														Static82.anIntArray172[local25++] = local9873.anInt4591;
													}
													continue;
												}
												if (local215 == 6502) {
													local9873 = Static63.method1235();
													if (local9873 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static82.anIntArray172[local25++] = 0;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
													} else {
														Static82.anIntArray172[local25++] = local9873.anInt4598;
														Static82.anIntArray172[local25++] = local9873.anInt4580;
														Static152.aStringArray29[local32++] = local9873.aString324;
														local9897 = local9873.method3479();
														Static82.anIntArray172[local25++] = local9897.anInt506;
														Static152.aStringArray29[local32++] = local9897.aString15;
														Static82.anIntArray172[local25++] = local9873.anInt4591;
													}
													continue;
												}
												if (local215 == 6503) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													if (Static224.anInt4922 == 10 && Static81.anInt2186 == 0 && Static238.anInt5145 == 0 && Static117.anInt3043 == 0) {
														Static82.anIntArray172[local25++] = Static66.method1298(local781) ? 1 : 0;
														continue;
													}
													Static82.anIntArray172[local25++] = 0;
													continue;
												}
												if (local215 == 6504) {
													local25--;
													Static164.anInt3852 = Static82.anIntArray172[local25];
													Static22.method2185(Static38.aClass28_1);
													continue;
												}
												if (local215 == 6505) {
													Static82.anIntArray172[local25++] = Static164.anInt3852;
													continue;
												}
												if (local215 == 6506) {
													local25--;
													local781 = Static82.anIntArray172[local25];
													@Pc(10119) Class115_Sub1 local10119 = Static87.method1847(local781);
													if (local10119 == null) {
														Static82.anIntArray172[local25++] = -1;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
														Static152.aStringArray29[local32++] = "";
														Static82.anIntArray172[local25++] = 0;
													} else {
														Static82.anIntArray172[local25++] = local10119.anInt4580;
														Static152.aStringArray29[local32++] = local10119.aString324;
														@Pc(10137) Class12 local10137 = local10119.method3479();
														Static82.anIntArray172[local25++] = local10137.anInt506;
														Static152.aStringArray29[local32++] = local10137.aString15;
														Static82.anIntArray172[local25++] = local10119.anInt4591;
													}
													continue;
												}
												if (local215 == 6507) {
													local25 -= 4;
													local6711 = Static82.anIntArray172[local25 + 1] == 1;
													local781 = Static82.anIntArray172[local25];
													local1005 = Static82.anIntArray172[local25 + 2];
													local7200 = Static82.anIntArray172[local25 + 3] == 1;
													Static142.method2576(local6711, local781, local7200, local1005);
													continue;
												}
											} else if (local215 < 6700) {
												if (local215 == 6600) {
													local25--;
													Static138.aBoolean180 = Static82.anIntArray172[local25] == 1;
													Static22.method2185(Static38.aClass28_1);
													continue;
												}
												if (local215 == 6601) {
													Static82.anIntArray172[local25++] = Static138.aBoolean180 ? 1 : 0;
													continue;
												}
											}
										} else {
											if (local215 == 5100) {
												if (Static124.aBooleanArray7[86]) {
													Static82.anIntArray172[local25++] = 1;
												} else {
													Static82.anIntArray172[local25++] = 0;
												}
												continue;
											}
											if (local215 == 5101) {
												if (Static124.aBooleanArray7[82]) {
													Static82.anIntArray172[local25++] = 1;
												} else {
													Static82.anIntArray172[local25++] = 0;
												}
												continue;
											}
											if (local215 == 5102) {
												if (Static124.aBooleanArray7[81]) {
													Static82.anIntArray172[local25++] = 1;
												} else {
													Static82.anIntArray172[local25++] = 0;
												}
												continue;
											}
										}
									} else if (local215 == 4300) {
										local25 -= 2;
										local781 = Static82.anIntArray172[local25];
										local792 = Static82.anIntArray172[local25 + 1];
										local4906 = Static16.method3757(local792);
										if (local4906.method2633()) {
											Static152.aStringArray29[local32++] = Static155.method2756(local781).method1466(local4906.aString227, local792);
										} else {
											Static82.anIntArray172[local25++] = Static155.method2756(local781).method1461(local792, local4906.anInt3511);
										}
										continue;
									}
								}
							} else {
								if (local215 < 2000) {
									local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
								} else {
									local25--;
									local1144 = Static206.method3444(Static82.anIntArray172[local25]);
									local215 -= 1000;
								}
								if (local215 == 1300) {
									local25--;
									local792 = Static82.anIntArray172[local25] - 1;
									if (local792 >= 0 && local792 <= 9) {
										local32--;
										local1144.method3521(Static152.aStringArray29[local32], local792);
										continue;
									}
									local32--;
									continue;
								}
								if (local215 == 1301) {
									local25 -= 2;
									local1005 = Static82.anIntArray172[local25 + 1];
									local792 = Static82.anIntArray172[local25];
									local1144.aClass122_16 = Static106.method2192(local1005, local792);
									continue;
								}
								if (local215 == 1302) {
									local25--;
									local1144.aBoolean232 = Static82.anIntArray172[local25] == 1;
									continue;
								}
								if (local215 == 1303) {
									local25--;
									local1144.anInt4717 = Static82.anIntArray172[local25];
									continue;
								}
								if (local215 == 1304) {
									local25--;
									local1144.anInt4646 = Static82.anIntArray172[local25];
									continue;
								}
								if (local215 == 1305) {
									local32--;
									local1144.aString331 = Static152.aStringArray29[local32];
									continue;
								}
								if (local215 == 1306) {
									local32--;
									local1144.aString334 = Static152.aStringArray29[local32];
									continue;
								}
								if (local215 == 1307) {
									local1144.aStringArray36 = null;
									continue;
								}
								if (local215 == 1308) {
									local25--;
									local1144.anInt4665 = Static82.anIntArray172[local25];
									local25--;
									local1144.anInt4727 = Static82.anIntArray172[local25];
									continue;
								}
								if (local215 == 1309) {
									local25--;
									local792 = Static82.anIntArray172[local25];
									local25--;
									local1005 = Static82.anIntArray172[local25];
									if (local1005 >= 1 && local1005 <= 10) {
										local1144.method3522(local792, local1005 - 1);
									}
									continue;
								}
								if (local215 == 1310) {
									local32--;
									local1144.aString335 = Static152.aStringArray29[local32];
									continue;
								}
							}
						} else {
							if (local215 >= 2000) {
								local215 -= 1000;
								local25--;
								local1144 = Static206.method3444(Static82.anIntArray172[local25]);
							} else {
								local1144 = local988 ? Static238.aClass122_17 : Static262.aClass122_20;
							}
							if (local215 == 1000) {
								local25 -= 4;
								local1144.anInt4649 = Static82.anIntArray172[local25];
								local1144.anInt4678 = Static82.anIntArray172[local25 + 1];
								local792 = Static82.anIntArray172[local25 + 2];
								local1005 = Static82.anIntArray172[local25 + 3];
								if (local1005 < 0) {
									local1005 = 0;
								} else if (local1005 > 5) {
									local1005 = 5;
								}
								if (local792 < 0) {
									local792 = 0;
								} else if (local792 > 5) {
									local792 = 5;
								}
								local1144.aByte17 = (byte) local1005;
								local1144.aByte18 = (byte) local792;
								Static257.method4146(local1144);
								Static239.method3939(local1144);
								if (local1144.anInt4662 == -1) {
									Static181.method3120(local1144.anInt4686);
								}
								continue;
							}
							if (local215 == 1001) {
								local25 -= 4;
								local1144.anInt4650 = Static82.anIntArray172[local25];
								local1144.anInt4683 = Static82.anIntArray172[local25 + 1];
								local1144.anInt4706 = 0;
								local1144.anInt4681 = 0;
								local792 = Static82.anIntArray172[local25 + 2];
								local1005 = Static82.anIntArray172[local25 + 3];
								if (local792 < 0) {
									local792 = 0;
								} else if (local792 > 4) {
									local792 = 4;
								}
								local1144.aByte16 = (byte) local792;
								if (local1005 < 0) {
									local1005 = 0;
								} else if (local1005 > 4) {
									local1005 = 4;
								}
								local1144.aByte15 = (byte) local1005;
								Static257.method4146(local1144);
								Static239.method3939(local1144);
								if (local1144.anInt4656 == 0) {
									Static147.method2678(false, local1144);
								}
								continue;
							}
							if (local215 == 1003) {
								local25--;
								local6711 = Static82.anIntArray172[local25] == 1;
								if (local1144.aBoolean238 != local6711) {
									local1144.aBoolean238 = local6711;
									Static257.method4146(local1144);
								}
								if (local1144.anInt4662 == -1) {
									Static223.method3708(local1144.anInt4686);
								}
								continue;
							}
							if (local215 == 1004) {
								local25 -= 2;
								local1144.anInt4688 = Static82.anIntArray172[local25];
								local1144.anInt4643 = Static82.anIntArray172[local25 + 1];
								Static257.method4146(local1144);
								Static239.method3939(local1144);
								if (local1144.anInt4656 == 0) {
									Static147.method2678(false, local1144);
								}
								continue;
							}
							if (local215 == 1005) {
								local25--;
								local1144.aBoolean243 = Static82.anIntArray172[local25] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14277) Exception local14277) {
			if (local14.aString169 == null) {
				if (Static25.anInt848 != 0) {
					Static50.method1013("", "Clientscript error - check log for details", 0);
				}
				Static57.method1101("CS2 - scr:" + local14.aLong184 + " op:" + local37, local14277);
			} else {
				@Pc(14285) StringBuffer local14285 = new StringBuffer(30);
				local14285.append("%0a - in: ").append(local14.aString169);
				for (local58 = Static120.anInt3098 - 1; local58 >= 0; local58--) {
					local14285.append("%0a - via: ").append(Static248.aClass69Array1[local58].aClass1_Sub2_Sub9_1.aString169);
				}
				if (local37 == 40) {
					local71 = local35[local27];
					local14285.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local71));
				}
				if (Static25.anInt848 != 0) {
					Static50.method1013("", "Clientscript error in: " + local14.aString169, 0);
				}
				Static57.method1101("CS2 - scr:" + local14.aLong184 + " op:" + local37 + local14285.toString(), local14277);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILclient!se;II)V")
	public static void method2543(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2.anInt4726;
		if (arg2.aByte15 == 0) {
			arg2.anInt4726 = arg2.anInt4683;
		} else if (arg2.aByte15 == 1) {
			arg2.anInt4726 = arg3 - arg2.anInt4683;
		} else if (arg2.aByte15 == 2) {
			arg2.anInt4726 = arg3 * arg2.anInt4683 >> 14;
		} else if (arg2.aByte15 == 3) {
			if (arg2.anInt4656 == 2) {
				arg2.anInt4726 = arg2.anInt4722 * (arg2.anInt4683 - 1) + arg2.anInt4683 * 32;
			} else if (arg2.anInt4656 == 7) {
				arg2.anInt4726 = (arg2.anInt4683 - 1) * arg2.anInt4722 + arg2.anInt4683 * 12;
			}
		}
		@Pc(88) int local88 = arg2.anInt4695;
		if (arg2.aByte16 == 0) {
			arg2.anInt4695 = arg2.anInt4650;
		} else if (arg2.aByte16 == 1) {
			arg2.anInt4695 = arg1 - arg2.anInt4650;
		} else if (arg2.aByte16 == 2) {
			arg2.anInt4695 = arg2.anInt4650 * arg1 >> 14;
		} else if (arg2.aByte16 == 3) {
			if (arg2.anInt4656 == 2) {
				arg2.anInt4695 = arg2.anInt4732 * (arg2.anInt4650 - 1) + arg2.anInt4650 * 32;
			} else if (arg2.anInt4656 == 7) {
				arg2.anInt4695 = arg2.anInt4732 * (arg2.anInt4650 - 1) + arg2.anInt4650 * 115;
			}
		}
		if (arg2.aByte16 == 4) {
			arg2.anInt4695 = arg2.anInt4688 * arg2.anInt4726 / arg2.anInt4643;
		}
		if (arg2.aByte15 == 4) {
			arg2.anInt4726 = arg2.anInt4695 * arg2.anInt4643 / arg2.anInt4688;
		}
		if (Static70.aBoolean113 && (Static39.method702(arg2).anInt4836 != 0 || arg2.anInt4656 == 0)) {
			if (arg2.anInt4726 < 5 && arg2.anInt4695 < 5) {
				arg2.anInt4726 = 5;
				arg2.anInt4695 = 5;
			} else {
				if (arg2.anInt4695 <= 0) {
					arg2.anInt4695 = 5;
				}
				if (arg2.anInt4726 <= 0) {
					arg2.anInt4726 = 5;
				}
			}
		}
		if (arg2.anInt4672 == 1337) {
			Static205.aClass122_15 = arg2;
		}
		if (arg0 && arg2.anObjectArray9 != null && (arg2.anInt4695 != local88 || arg2.anInt4726 != local4)) {
			@Pc(295) Class1_Sub30 local295 = new Class1_Sub30();
			local295.aClass122_18 = arg2;
			local295.anObjectArray32 = arg2.anObjectArray9;
			Static29.aClass3_4.method28(local295);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Component;Lclient!d;IIZ)Lclient!hk;")
	public static Class55 method2544(@OriginalArg(0) Component arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static107.anInt2862 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class55 local36 = (Class55) Class.forName("Class55_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray320 = new int[(Static121.aBoolean167 ? 2 : 1) * 256];
			local36.anInt4263 = arg2;
			local36.method3213(arg0);
			local36.anInt4261 = (arg2 & -1024) + 1024;
			if (local36.anInt4261 > 16384) {
				local36.anInt4261 = 16384;
			}
			local36.method3206(local36.anInt4261);
			if (Static231.anInt5057 > 0 && Static164.aClass42_1 == null) {
				Static164.aClass42_1 = new Class42();
				Static164.aClass42_1.aClass28_2 = arg1;
				arg1.method719(Static164.aClass42_1, Static231.anInt5057);
			}
			if (Static164.aClass42_1 != null) {
				if (Static164.aClass42_1.aClass55Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static164.aClass42_1.aClass55Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class55_Sub1 local117 = new Class55_Sub1(arg1, arg3);
				local117.anInt4263 = arg2;
				local117.anIntArray320 = new int[(Static121.aBoolean167 ? 2 : 1) * 256];
				local117.method3213(arg0);
				local117.anInt4261 = 16384;
				local117.method3206(local117.anInt4261);
				if (Static231.anInt5057 > 0 && Static164.aClass42_1 == null) {
					Static164.aClass42_1 = new Class42();
					Static164.aClass42_1.aClass28_2 = arg1;
					arg1.method719(Static164.aClass42_1, Static231.anInt5057);
				}
				if (Static164.aClass42_1 != null) {
					if (Static164.aClass42_1.aClass55Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static164.aClass42_1.aClass55Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(181) Throwable local181) {
				return new Class55();
			}
		}
	}
}
