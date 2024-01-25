import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!di", name = "l", descriptor = "[Lclient!li;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	private static int anInt1460;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	private static int anInt1461;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "[Lclient!fu;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	public static int anInt1466;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "[Lclient!vc;")
	public static Class250[] aClass250Array1;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "[Lclient!qs;")
	public static Class198[] aClass198Array1;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
	private static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)I")
	public static int method1314(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1460) {
			local8 = 8 - anInt1460;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray15[anInt1461] >> anInt1460 & local14) << local3;
			anInt1460 = 0;
			anInt1461++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray15[anInt1461] >> anInt1460 & local8) << local3;
			anInt1460 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
	public static void method1315(@OriginalArg(0) byte[] arg0) {
		aByteArray15 = arg0;
		anInt1461 = 0;
		anInt1460 = 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!fs;I)Lclient!di;")
	public static Class4_Sub13 method1316(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		if (method1320(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2122(arg1);
			return local14 == null ? null : new Class4_Sub13(local14);
		} else {
			arg0.method2125(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()I")
	public static int method1317() {
		@Pc(7) int local7 = aByteArray15[anInt1461] >> anInt1460 & 0x1;
		anInt1460++;
		anInt1461 += anInt1460 >> 3;
		anInt1460 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!fs;II)Lclient!di;")
	public static Class4_Sub13 method1318(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1320(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2104(arg2, arg1);
			return local16 == null ? null : new Class4_Sub13(local16);
		} else {
			arg0.method2098(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V")
	private static void method1319(@OriginalArg(0) byte[] arg0) {
		method1315(arg0);
		anInt1466 = 0x1 << method1314(4);
		anInt1458 = 0x1 << method1314(4);
		aFloatArray8 = new float[anInt1458];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1466 : anInt1458;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static329.method4426(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static86.method1546(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray10 = local84;
				aFloatArray6 = local136;
				anIntArray109 = local185;
			} else {
				aFloatArray11 = local39;
				aFloatArray7 = local84;
				aFloatArray12 = local136;
				anIntArray110 = local185;
			}
		}
		local24 = method1314(8) + 1;
		aClass134Array1 = new Class134[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass134Array1[local28] = new Class134();
		}
		local32 = method1314(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1314(16);
		}
		@Pc(269) int local269 = method1314(6) + 1;
		aClass250Array1 = new Class250[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass250Array1[local41] = new Class250();
		}
		@Pc(290) int local290 = method1314(6) + 1;
		aClass198Array1 = new Class198[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass198Array1[local86] = new Class198();
		}
		@Pc(311) int local311 = method1314(6) + 1;
		aClass77Array1 = new Class77[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass77Array1[local138] = new Class77();
		}
		@Pc(332) int local332 = method1314(6) + 1;
		aBooleanArray10 = new boolean[local332];
		anIntArray111 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray10[local191] = method1317() != 0;
			method1314(16);
			method1314(16);
			anIntArray111[local191] = method1314(8);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!fs;)Z")
	private static boolean method1320(@OriginalArg(0) Class76 arg0) {
		if (!aBoolean124) {
			@Pc(7) byte[] local7 = arg0.method2104(0, 0);
			if (local7 == null) {
				return false;
			}
			method1319(local7);
			aBoolean124 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)F")
	public static float method1323(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
