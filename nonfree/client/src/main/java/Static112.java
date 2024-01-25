import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "[Lclient!kg;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	private static int anInt2255;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "[Lclient!eu;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "[B")
	private static byte[] aByteArray21;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "[Lclient!ho;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	public static int anInt2256;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	private static int anInt2257;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	public static int anInt2260;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "[Lclient!ld;")
	public static Class152[] aClass152Array1;

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Z")
	private static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ph;I)Lclient!fh;")
	public static Class10_Sub17 method1959(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1) {
		if (method1962(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4303(arg1);
			return local14 == null ? null : new Class10_Sub17(local14);
		} else {
			arg0.method4282(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([B)V")
	private static void method1961(@OriginalArg(0) byte[] arg0) {
		method1964(arg0);
		anInt2260 = 0x1 << method1970(4);
		anInt2256 = 0x1 << method1970(4);
		aFloatArray19 = new float[anInt2256];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2260 : anInt2256;
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
			local191 = Static365.method2559(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static171.method2920(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray17 = local39;
				aFloatArray15 = local84;
				aFloatArray18 = local136;
				anIntArray201 = local185;
			} else {
				aFloatArray20 = local39;
				aFloatArray14 = local84;
				aFloatArray16 = local136;
				anIntArray200 = local185;
			}
		}
		local24 = method1970(8) + 1;
		aClass110Array1 = new Class110[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass110Array1[local28] = new Class110();
		}
		local32 = method1970(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1970(16);
		}
		@Pc(269) int local269 = method1970(6) + 1;
		aClass72Array1 = new Class72[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass72Array1[local41] = new Class72();
		}
		@Pc(290) int local290 = method1970(6) + 1;
		aClass152Array1 = new Class152[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass152Array1[local86] = new Class152();
		}
		@Pc(311) int local311 = method1970(6) + 1;
		aClass140Array1 = new Class140[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass140Array1[local138] = new Class140();
		}
		@Pc(332) int local332 = method1970(6) + 1;
		aBooleanArray4 = new boolean[local332];
		anIntArray202 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray4[local191] = method1965() != 0;
			method1970(16);
			method1970(16);
			anIntArray202[local191] = method1970(8);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ph;)Z")
	private static boolean method1962(@OriginalArg(0) Class187 arg0) {
		if (!aBoolean139) {
			@Pc(7) byte[] local7 = arg0.method4300(0, 0);
			if (local7 == null) {
				return false;
			}
			method1961(local7);
			aBoolean139 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([BI)V")
	public static void method1964(@OriginalArg(0) byte[] arg0) {
		aByteArray21 = arg0;
		anInt2257 = 0;
		anInt2255 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()I")
	public static int method1965() {
		@Pc(7) int local7 = aByteArray21[anInt2257] >> anInt2255 & 0x1;
		anInt2255++;
		anInt2257 += anInt2255 >> 3;
		anInt2255 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)F")
	public static float method1967(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ph;II)Lclient!fh;")
	public static Class10_Sub17 method1969(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1962(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4300(arg1, arg2);
			return local16 == null ? null : new Class10_Sub17(local16);
		} else {
			arg0.method4284(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I")
	public static int method1970(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2255) {
			local8 = 8 - anInt2255;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray21[anInt2257] >> anInt2255 & local14) << local3;
			anInt2255 = 0;
			anInt2257++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray21[anInt2257] >> anInt2255 & local8) << local3;
			anInt2255 += arg0;
		}
		return local1;
	}
}
