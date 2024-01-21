import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "[Lclient!vf;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "[Lclient!hg;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "[Lclient!mb;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private static int anInt3054;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	public static int anInt3056;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "[Lclient!tf;")
	public static Class81[] aClass81Array1;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "[I")
	public static int[] anIntArray409;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	public static int anInt3058;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
	private static int anInt3059;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Z")
	private static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ga;)Z")
	private static boolean method2066(@OriginalArg(0) Class30 arg0) {
		if (!aBoolean158) {
			@Pc(7) byte[] local7 = arg0.method1301(0, 0);
			if (local7 == null) {
				return false;
			}
			method2071(local7);
			aBoolean158 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	public static int method2068(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3054) {
			local8 = 8 - anInt3054;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray28[anInt3059] >> anInt3054 & local14) << local3;
			anInt3054 = 0;
			anInt3059++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray28[anInt3059] >> anInt3054 & local8) << local3;
			anInt3054 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)F")
	public static float method2069(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BI)V")
	public static void method2070(@OriginalArg(0) byte[] arg0) {
		aByteArray28 = arg0;
		anInt3059 = 0;
		anInt3054 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([B)V")
	private static void method2071(@OriginalArg(0) byte[] arg0) {
		method2070(arg0);
		anInt3058 = 0x1 << method2068(4);
		anInt3056 = 0x1 << method2068(4);
		aFloatArray1 = new float[anInt3056];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3058 : anInt3056;
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
			local191 = Static81.method881(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static13.method254(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray6 = local84;
				aFloatArray5 = local136;
				anIntArray409 = local185;
			} else {
				aFloatArray4 = local39;
				aFloatArray2 = local84;
				aFloatArray7 = local136;
				anIntArray408 = local185;
			}
		}
		local24 = method2068(8) + 1;
		aClass54Array1 = new Class54[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass54Array1[local28] = new Class54();
		}
		local32 = method2068(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2068(16);
		}
		@Pc(269) int local269 = method2068(6) + 1;
		aClass86Array1 = new Class86[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass86Array1[local41] = new Class86();
		}
		@Pc(290) int local290 = method2068(6) + 1;
		aClass39Array1 = new Class39[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass39Array1[local86] = new Class39();
		}
		@Pc(311) int local311 = method2068(6) + 1;
		aClass81Array1 = new Class81[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass81Array1[local138] = new Class81();
		}
		@Pc(332) int local332 = method2068(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray407 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method2074() != 0;
			method2068(16);
			method2068(16);
			anIntArray407[local191] = method2068(8);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ga;II)Lclient!oc;")
	public static Class1_Sub15 method2072(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2066(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1301(arg1, arg2);
			return local16 == null ? null : new Class1_Sub15(local16);
		} else {
			arg0.method1284(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	public static int method2074() {
		@Pc(7) int local7 = aByteArray28[anInt3059] >> anInt3054 & 0x1;
		anInt3054++;
		anInt3059 += anInt3054 >> 3;
		anInt3054 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()V")
	public static void method2075() {
		aByteArray28 = null;
		aClass54Array1 = null;
		aClass86Array1 = null;
		aClass39Array1 = null;
		aClass81Array1 = null;
		aBooleanArray17 = null;
		anIntArray407 = null;
		aFloatArray1 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray2 = null;
		aFloatArray7 = null;
		anIntArray409 = null;
		anIntArray408 = null;
	}
}
