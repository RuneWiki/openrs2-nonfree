import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[J")
	public static long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public static int anInt556 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method499(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!nk;BI)Z")
	public static boolean method501(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3139(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static266.method4190(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ro;IIIZI)V")
	public static void method503(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static295.anInt5297 >= 50 || (arg0 == null || arg0.anIntArrayArray37 == null || arg1 >= arg0.anIntArrayArray37.length || arg0.anIntArrayArray37[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray37[arg1][0];
		@Pc(42) int local42 = local36 >> 5 & 0x7;
		@Pc(46) int local46 = local36 & 0x1F;
		@Pc(50) int local50 = local36 >> 8;
		@Pc(68) int local68;
		if (arg0.anIntArrayArray37[arg1].length > 1) {
			local68 = (int) ((double) arg0.anIntArrayArray37[arg1].length * Math.random());
			if (local68 > 0) {
				local50 = arg0.anIntArrayArray37[arg1][local68];
			}
		}
		if (local46 == 0) {
			if (arg3) {
				Static100.method1818(local42, local50, 0, 255);
			}
		} else if (Static294.anInt5275 != 0) {
			Static179.anIntArray290[Static295.anInt5297] = local50;
			Static302.anIntArray470[Static295.anInt5297] = local42;
			Static69.anIntArray452[Static295.anInt5297] = 0;
			Static240.aClass169Array1[Static295.anInt5297] = null;
			local68 = (arg4 - 64) / 128;
			@Pc(129) int local129 = (arg2 - 64) / 128;
			Static152.anIntArray42[Static295.anInt5297] = 255;
			Static142.anIntArray240[Static295.anInt5297] = (local129 << 8) + ((local68 << 16) + local46);
			Static295.anInt5297++;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hi;I)Ljava/lang/String;")
	public static String method504(@OriginalArg(0) Class66 arg0) {
		if (Static37.method679(arg0).method3059() == 0) {
			return null;
		} else if (arg0.aString124 == null || arg0.aString124.trim().length() == 0) {
			return Static95.aBoolean103 ? "Hidden-use" : null;
		} else {
			return arg0.aString124;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBI)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static77.method1513(arg1);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(17) int local17 = arg1 - arg0;
		@Pc(20) int local20 = -arg1;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(36) int local36 = -local17;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static183.anIntArrayArray26[arg2];
		@Pc(44) int local44 = -1;
		@Pc(46) int local46 = local17;
		@Pc(51) int local51 = arg3 + local17;
		@Pc(55) int local55 = arg3 - local17;
		Static273.method4257(arg3 - arg1, local42, arg5, local55);
		Static273.method4257(local55, local42, arg4, local51);
		Static273.method4257(local51, local42, arg5, arg1 + arg3);
		while (local12 > local10) {
			local38 += 2;
			local36 += local38;
			if (local36 >= 0 && local46 >= 1) {
				Static56.anIntArray65[local46] = local10;
				local46--;
				local36 -= local46 << 1;
			}
			local10++;
			local44 += 2;
			local20 += local44;
			@Pc(144) int[] local144;
			@Pc(151) int[] local151;
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(199) int local199;
			@Pc(204) int local204;
			@Pc(209) int local209;
			if (local20 >= 0) {
				local12--;
				local20 -= local12 << 1;
				if (local17 <= local12) {
					local144 = Static183.anIntArrayArray26[local12 + arg2];
					local151 = Static183.anIntArrayArray26[arg2 - local12];
					local155 = arg3 + local10;
					local160 = arg3 - local10;
					Static273.method4257(local160, local144, arg5, local155);
					Static273.method4257(local160, local151, arg5, local155);
				} else {
					local144 = Static183.anIntArrayArray26[arg2 + local12];
					local151 = Static183.anIntArrayArray26[arg2 - local12];
					local155 = Static56.anIntArray65[local12];
					local160 = local10 + arg3;
					local199 = arg3 - local10;
					local204 = arg3 + local155;
					local209 = arg3 - local155;
					Static273.method4257(local199, local144, arg5, local209);
					Static273.method4257(local209, local144, arg4, local204);
					Static273.method4257(local204, local144, arg5, local160);
					Static273.method4257(local199, local151, arg5, local209);
					Static273.method4257(local209, local151, arg4, local204);
					Static273.method4257(local204, local151, arg5, local160);
				}
			}
			local144 = Static183.anIntArrayArray26[local10 + arg2];
			local151 = Static183.anIntArrayArray26[arg2 - local10];
			local155 = local12 + arg3;
			local160 = arg3 - local12;
			if (local17 <= local10) {
				Static273.method4257(local160, local144, arg5, local155);
				Static273.method4257(local160, local151, arg5, local155);
			} else {
				local199 = local46 >= local10 ? local46 : Static56.anIntArray65[local10];
				local209 = arg3 - local199;
				Static273.method4257(local160, local144, arg5, local209);
				local204 = local199 + arg3;
				Static273.method4257(local209, local144, arg4, local204);
				Static273.method4257(local204, local144, arg5, local155);
				Static273.method4257(local160, local151, arg5, local209);
				Static273.method4257(local209, local151, arg4, local204);
				Static273.method4257(local204, local151, arg5, local155);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	public static void method506() {
		Static247.aClass187_126.method4534(5);
		Static16.aClass187_158.method4534(5);
	}
}
