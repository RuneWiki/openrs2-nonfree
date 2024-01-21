import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	private static int anInt307;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "[Lclient!fa;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "[Lclient!ke;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	private static int anInt309;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[Lclient!ua;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "[Lclient!jd;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public static int anInt316;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
	private static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	public static int method201(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt309) {
			local8 = 8 - anInt309;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray1[anInt307] >> anInt309 & local14) << local3;
			anInt309 = 0;
			anInt307++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray1[anInt307] >> anInt309 & local8) << local3;
			anInt309 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	public static int method202() {
		@Pc(7) int local7 = aByteArray1[anInt307] >> anInt309 & 0x1;
		anInt309++;
		anInt307 += anInt309 >> 3;
		anInt309 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
	public static void method203() {
		aByteArray1 = null;
		aClass43Array1 = null;
		aClass22Array1 = null;
		aClass39Array1 = null;
		aClass76Array1 = null;
		aBooleanArray1 = null;
		anIntArray42 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray3 = null;
		aFloatArray1 = null;
		aFloatArray7 = null;
		aFloatArray8 = null;
		anIntArray43 = null;
		anIntArray41 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
	private static void method204(@OriginalArg(0) byte[] arg0) {
		method210(arg0);
		anInt316 = 0x1 << method201(4);
		anInt313 = 0x1 << method201(4);
		aFloatArray2 = new float[anInt313];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt316 : anInt313;
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
			local191 = Static132.method1840(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static126.method1486(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray4 = local84;
				aFloatArray3 = local136;
				anIntArray43 = local185;
			} else {
				aFloatArray1 = local39;
				aFloatArray7 = local84;
				aFloatArray8 = local136;
				anIntArray41 = local185;
			}
		}
		local24 = method201(8) + 1;
		aClass43Array1 = new Class43[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass43Array1[local28] = new Class43();
		}
		local32 = method201(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method201(16);
		}
		@Pc(269) int local269 = method201(6) + 1;
		aClass22Array1 = new Class22[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass22Array1[local41] = new Class22();
		}
		@Pc(290) int local290 = method201(6) + 1;
		aClass39Array1 = new Class39[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass39Array1[local86] = new Class39();
		}
		@Pc(311) int local311 = method201(6) + 1;
		aClass76Array1 = new Class76[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass76Array1[local138] = new Class76();
		}
		@Pc(332) int local332 = method201(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray42 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method202() != 0;
			method201(16);
			method201(16);
			anIntArray42[local191] = method201(8);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dd;)Z")
	private static boolean method208(@OriginalArg(0) Class14 arg0) {
		if (!aBoolean16) {
			@Pc(7) byte[] local7 = arg0.method1156(0, 0);
			if (local7 == null) {
				return false;
			}
			method204(local7);
			aBoolean16 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dd;II)Lclient!bf;")
	public static Class8_Sub3 method209(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method208(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1156(arg2, arg1);
			return local16 == null ? null : new Class8_Sub3(local16);
		} else {
			arg0.method1145(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)V")
	public static void method210(@OriginalArg(0) byte[] arg0) {
		aByteArray1 = arg0;
		anInt307 = 0;
		anInt309 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)F")
	public static float method211(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
