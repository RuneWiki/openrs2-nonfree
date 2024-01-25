import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!di", name = "o", descriptor = "[Lclient!ih;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	private static int anInt1831;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "[Lclient!pb;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "[Lclient!lg;")
	public static Class147[] aClass147Array1;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	private static int anInt1834;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	public static int anInt1835;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "[B")
	private static byte[] aByteArray45;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "[Lclient!er;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Z")
	private static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pc;II)Lclient!di;")
	public static Class2_Sub13 method1318(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1320(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4283(arg1, arg2);
			return local16 == null ? null : new Class2_Sub13(local16);
		} else {
			arg0.method4298(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
	public static void method1319(@OriginalArg(0) byte[] arg0) {
		aByteArray45 = arg0;
		anInt1834 = 0;
		anInt1831 = 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pc;)Z")
	private static boolean method1320(@OriginalArg(0) Class188 arg0) {
		if (!aBoolean165) {
			@Pc(7) byte[] local7 = arg0.method4283(0, 0);
			if (local7 == null) {
				return false;
			}
			method1323(local7);
			aBoolean165 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pc;I)Lclient!di;")
	public static Class2_Sub13 method1321(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1) {
		if (method1320(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4282(arg1);
			return local14 == null ? null : new Class2_Sub13(local14);
		} else {
			arg0.method4296(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V")
	private static void method1323(@OriginalArg(0) byte[] arg0) {
		method1319(arg0);
		anInt1835 = 0x1 << method1326(4);
		anInt1832 = 0x1 << method1326(4);
		aFloatArray9 = new float[anInt1832];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1835 : anInt1832;
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
			local191 = Static184.method2920(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static432.method5827(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray13 = local39;
				aFloatArray12 = local84;
				aFloatArray8 = local136;
				anIntArray97 = local185;
			} else {
				aFloatArray10 = local39;
				aFloatArray6 = local84;
				aFloatArray11 = local136;
				anIntArray95 = local185;
			}
		}
		local24 = method1326(8) + 1;
		aClass147Array1 = new Class147[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass147Array1[local28] = new Class147();
		}
		local32 = method1326(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1326(16);
		}
		@Pc(269) int local269 = method1326(6) + 1;
		aClass71Array1 = new Class71[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass71Array1[local41] = new Class71();
		}
		@Pc(290) int local290 = method1326(6) + 1;
		aClass187Array1 = new Class187[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass187Array1[local86] = new Class187();
		}
		@Pc(311) int local311 = method1326(6) + 1;
		aClass118Array1 = new Class118[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass118Array1[local138] = new Class118();
		}
		@Pc(332) int local332 = method1326(6) + 1;
		aBooleanArray9 = new boolean[local332];
		anIntArray96 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray9[local191] = method1327() != 0;
			method1326(16);
			method1326(16);
			anIntArray96[local191] = method1326(8);
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)F")
	public static float method1324(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)I")
	public static int method1326(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1831) {
			local8 = 8 - anInt1831;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray45[anInt1834] >> anInt1831 & local14) << local3;
			anInt1831 = 0;
			anInt1834++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray45[anInt1834] >> anInt1831 & local8) << local3;
			anInt1831 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()I")
	public static int method1327() {
		@Pc(7) int local7 = aByteArray45[anInt1834] >> anInt1831 & 0x1;
		anInt1831++;
		anInt1834 += anInt1831 >> 3;
		anInt1831 &= 0x7;
		return local7;
	}
}
