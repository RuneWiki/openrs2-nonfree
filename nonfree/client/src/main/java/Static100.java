import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[Lclient!vf;")
	public static Class95[] aClass95Array1;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "[Lclient!og;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "[Lclient!nc;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "[Lclient!ug;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
	private static int anInt2041;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	private static int anInt2042;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	public static int anInt2045;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "Z")
	private static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ke;II)Lclient!jg;")
	public static Class3_Sub14 method1420(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1426(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1581(arg1, arg2);
			return local16 == null ? null : new Class3_Sub14(local16);
		} else {
			arg0.method1558(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)V")
	public static void method1421(@OriginalArg(0) byte[] arg0) {
		aByteArray15 = arg0;
		anInt2042 = 0;
		anInt2041 = 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()I")
	public static int method1422() {
		@Pc(7) int local7 = aByteArray15[anInt2042] >> anInt2041 & 0x1;
		anInt2041++;
		anInt2042 += anInt2041 >> 3;
		anInt2041 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
	public static int method1425(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2041) {
			local8 = 8 - anInt2041;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray15[anInt2042] >> anInt2041 & local14) << local3;
			anInt2041 = 0;
			anInt2042++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray15[anInt2042] >> anInt2041 & local8) << local3;
			anInt2041 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ke;)Z")
	private static boolean method1426(@OriginalArg(0) Class52 arg0) {
		if (!aBoolean107) {
			@Pc(7) byte[] local7 = arg0.method1581(0, 0);
			if (local7 == null) {
				return false;
			}
			method1427(local7);
			aBoolean107 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([B)V")
	private static void method1427(@OriginalArg(0) byte[] arg0) {
		method1421(arg0);
		anInt2044 = 0x1 << method1425(4);
		anInt2045 = 0x1 << method1425(4);
		aFloatArray7 = new float[anInt2045];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2044 : anInt2045;
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
			local191 = Static135.method1922(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static150.method2200(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray3 = local39;
				aFloatArray2 = local84;
				aFloatArray8 = local136;
				anIntArray115 = local185;
			} else {
				aFloatArray4 = local39;
				aFloatArray6 = local84;
				aFloatArray1 = local136;
				anIntArray114 = local185;
			}
		}
		local24 = method1425(8) + 1;
		aClass65Array1 = new Class65[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass65Array1[local28] = new Class65();
		}
		local32 = method1425(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1425(16);
		}
		@Pc(269) int local269 = method1425(6) + 1;
		aClass91Array1 = new Class91[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass91Array1[local41] = new Class91();
		}
		@Pc(290) int local290 = method1425(6) + 1;
		aClass95Array1 = new Class95[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass95Array1[local86] = new Class95();
		}
		@Pc(311) int local311 = method1425(6) + 1;
		aClass73Array1 = new Class73[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass73Array1[local138] = new Class73();
		}
		@Pc(332) int local332 = method1425(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray113 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method1422() != 0;
			method1425(16);
			method1425(16);
			anIntArray113[local191] = method1425(8);
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)F")
	public static float method1428(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
