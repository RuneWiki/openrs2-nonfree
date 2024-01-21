import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[Lclient!oc;")
	public static Class62[] aClass62Array1;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	private static int anInt1172;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "[Lclient!gd;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "[Lclient!qc;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
	public static int anInt1178;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
	public static int anInt1179;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "[B")
	private static byte[] aByteArray12;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private static int anInt1180;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "[Lclient!g;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
	private static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
	public static int method915(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1180) {
			local8 = 8 - anInt1180;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray12[anInt1172] >> anInt1180 & local14) << local3;
			anInt1180 = 0;
			anInt1172++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray12[anInt1172] >> anInt1180 & local8) << local3;
			anInt1180 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public static void method916() {
		aByteArray12 = null;
		aClass33Array1 = null;
		aClass31Array1 = null;
		aClass62Array1 = null;
		aClass69Array1 = null;
		aBooleanArray5 = null;
		anIntArray107 = null;
		aFloatArray1 = null;
		aFloatArray7 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray2 = null;
		anIntArray108 = null;
		anIntArray109 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)V")
	public static void method917(@OriginalArg(0) byte[] arg0) {
		aByteArray12 = arg0;
		anInt1172 = 0;
		anInt1180 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([B)V")
	private static void method919(@OriginalArg(0) byte[] arg0) {
		method917(arg0);
		anInt1179 = 0x1 << method915(4);
		anInt1178 = 0x1 << method915(4);
		aFloatArray1 = new float[anInt1178];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1179 : anInt1178;
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
			local191 = Static54.method941(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static40.method790(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray6 = local84;
				aFloatArray3 = local136;
				anIntArray108 = local185;
			} else {
				aFloatArray5 = local39;
				aFloatArray4 = local84;
				aFloatArray2 = local136;
				anIntArray109 = local185;
			}
		}
		local24 = method915(8) + 1;
		aClass33Array1 = new Class33[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass33Array1[local28] = new Class33();
		}
		local32 = method915(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method915(16);
		}
		@Pc(269) int local269 = method915(6) + 1;
		aClass31Array1 = new Class31[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass31Array1[local41] = new Class31();
		}
		@Pc(290) int local290 = method915(6) + 1;
		aClass62Array1 = new Class62[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass62Array1[local86] = new Class62();
		}
		@Pc(311) int local311 = method915(6) + 1;
		aClass69Array1 = new Class69[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass69Array1[local138] = new Class69();
		}
		@Pc(332) int local332 = method915(6) + 1;
		aBooleanArray5 = new boolean[local332];
		anIntArray107 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray5[local191] = method924() != 0;
			method915(16);
			method915(16);
			anIntArray107[local191] = method915(8);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bg;)Z")
	private static boolean method920(@OriginalArg(0) Class11 arg0) {
		if (!aBoolean44) {
			@Pc(7) byte[] local7 = arg0.method2049(0, 0);
			if (local7 == null) {
				return false;
			}
			method919(local7);
			aBoolean44 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bg;II)Lclient!fe;")
	public static Class2_Sub7 method921(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method920(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2049(arg2, arg1);
			return local16 == null ? null : new Class2_Sub7(local16);
		} else {
			arg0.method2063(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)F")
	public static float method923(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()I")
	public static int method924() {
		@Pc(7) int local7 = aByteArray12[anInt1172] >> anInt1180 & 0x1;
		anInt1180++;
		anInt1172 += anInt1180 >> 3;
		anInt1180 &= 0x7;
		return local7;
	}
}
