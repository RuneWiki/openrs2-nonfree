import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!me", name = "D", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[Lclient!na;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "[Lclient!ab;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	private static int anInt1996;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "I")
	private static int anInt1997;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "[Lclient!ec;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "[Lclient!ge;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Z")
	private static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([B)V")
	private static void method1387(@OriginalArg(0) byte[] arg0) {
		method1388(arg0);
		anInt2001 = 0x1 << method1392(4);
		anInt1998 = 0x1 << method1392(4);
		aFloatArray6 = new float[anInt1998];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2001 : anInt1998;
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
			local191 = Static16.method414(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static118.method1952(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray3 = local39;
				aFloatArray8 = local84;
				aFloatArray1 = local136;
				anIntArray317 = local185;
			} else {
				aFloatArray2 = local39;
				aFloatArray5 = local84;
				aFloatArray4 = local136;
				anIntArray318 = local185;
			}
		}
		local24 = method1392(8) + 1;
		aClass2Array1 = new Class2[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass2Array1[local28] = new Class2();
		}
		local32 = method1392(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1392(16);
		}
		@Pc(269) int local269 = method1392(6) + 1;
		aClass47Array1 = new Class47[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass47Array1[local41] = new Class47();
		}
		@Pc(290) int local290 = method1392(6) + 1;
		aClass28Array1 = new Class28[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass28Array1[local86] = new Class28();
		}
		@Pc(311) int local311 = method1392(6) + 1;
		aClass18Array1 = new Class18[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass18Array1[local138] = new Class18();
		}
		@Pc(332) int local332 = method1392(6) + 1;
		aBooleanArray13 = new boolean[local332];
		anIntArray316 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray13[local191] = method1389() != 0;
			method1392(16);
			method1392(16);
			anIntArray316[local191] = method1392(8);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
	public static void method1388(@OriginalArg(0) byte[] arg0) {
		aByteArray18 = arg0;
		anInt1996 = 0;
		anInt1997 = 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
	public static int method1389() {
		@Pc(7) int local7 = aByteArray18[anInt1996] >> anInt1997 & 0x1;
		anInt1997++;
		anInt1996 += anInt1997 >> 3;
		anInt1997 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
	public static void method1391() {
		aByteArray18 = null;
		aClass2Array1 = null;
		aClass47Array1 = null;
		aClass28Array1 = null;
		aClass18Array1 = null;
		aBooleanArray13 = null;
		anIntArray316 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray1 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		anIntArray317 = null;
		anIntArray318 = null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	public static int method1392(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1997) {
			local8 = 8 - anInt1997;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray18[anInt1996] >> anInt1997 & local14) << local3;
			anInt1997 = 0;
			anInt1996++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray18[anInt1996] >> anInt1997 & local8) << local3;
			anInt1997 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sf;II)Lclient!me;")
	public static Class1_Sub16 method1393(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1394(arg0)) {
			@Pc(16) byte[] local16 = arg0.method107(arg2, arg1);
			return local16 == null ? null : new Class1_Sub16(local16);
		} else {
			arg0.method119(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sf;)Z")
	private static boolean method1394(@OriginalArg(0) Class5 arg0) {
		if (!aBoolean77) {
			@Pc(7) byte[] local7 = arg0.method107(0, 0);
			if (local7 == null) {
				return false;
			}
			method1387(local7);
			aBoolean77 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)F")
	public static float method1395(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
