import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!lg", name = "vb", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString53 = "K";

	@OriginalMember(owner = "client!lg", name = "ic", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)J")
	public static long method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass101_1 == null ? 0L : local7.aClass101_1.aLong131;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)I")
	public static int method1230() {
		return Static99.anInt2208;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1233(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 = Static105.method4744(arg0.charAt(local17)) + (local12 << 5) - local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)Lclient!mh;")
	public static Class101 method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass101_1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([BI)[B")
	public static byte[] method1242(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(12) int local12 = local8.method2655();
		@Pc(16) int local16 = local8.method2610();
		if (local16 < 0 || Static266.anInt5788 != 0 && local16 > Static266.anInt5788) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(93) byte[] local93 = new byte[local16];
			local8.method2665(local93, local16);
			return local93;
		} else {
			@Pc(47) int local47 = local8.method2610();
			if (local47 < 0 || Static266.anInt5788 != 0 && local47 > Static266.anInt5788) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local47];
			if (local12 == 1) {
				Static72.method1334(local69, local47, arg0, local16);
			} else {
				Static174.aClass21_1.method391(local8, local69);
			}
			return local69;
		}
	}
}
