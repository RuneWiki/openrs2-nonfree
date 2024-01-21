import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lclient!wc;")
	public static Class88[] aClass88Array1;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "[Lclient!fc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
	private static int anInt3507;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "[Lclient!vh;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	private static int anInt3509;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	public static int anInt3511;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[B")
	private static byte[] aByteArray42;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "[Lclient!ca;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	public static int anInt3512;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "Z")
	private static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!f;)Z")
	private static boolean method2540(@OriginalArg(0) Class13 arg0) {
		if (!aBoolean237) {
			@Pc(7) byte[] local7 = arg0.method348(0, 0);
			if (local7 == null) {
				return false;
			}
			method2543(local7);
			aBoolean237 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "([B)V")
	private static void method2543(@OriginalArg(0) byte[] arg0) {
		method2550(arg0);
		anInt3511 = 0x1 << method2544(4);
		anInt3512 = 0x1 << method2544(4);
		aFloatArray2 = new float[anInt3512];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3511 : anInt3512;
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
			local191 = Static86.method1510(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static129.method2163(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray6 = local39;
				aFloatArray3 = local84;
				aFloatArray1 = local136;
				anIntArray378 = local185;
			} else {
				aFloatArray5 = local39;
				aFloatArray8 = local84;
				aFloatArray4 = local136;
				anIntArray376 = local185;
			}
		}
		local24 = method2544(8) + 1;
		aClass12Array1 = new Class12[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass12Array1[local28] = new Class12();
		}
		local32 = method2544(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2544(16);
		}
		@Pc(269) int local269 = method2544(6) + 1;
		aClass88Array1 = new Class88[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass88Array1[local41] = new Class88();
		}
		@Pc(290) int local290 = method2544(6) + 1;
		aClass85Array1 = new Class85[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass85Array1[local86] = new Class85();
		}
		@Pc(311) int local311 = method2544(6) + 1;
		aClass23Array1 = new Class23[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass23Array1[local138] = new Class23();
		}
		@Pc(332) int local332 = method2544(6) + 1;
		aBooleanArray16 = new boolean[local332];
		anIntArray377 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray16[local191] = method2548() != 0;
			method2544(16);
			method2544(16);
			anIntArray377[local191] = method2544(8);
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
	public static int method2544(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3509) {
			local8 = 8 - anInt3509;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray42[anInt3507] >> anInt3509 & local14) << local3;
			anInt3509 = 0;
			anInt3507++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray42[anInt3507] >> anInt3509 & local8) << local3;
			anInt3509 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)F")
	public static float method2545(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!f;II)Lclient!ua;")
	public static Class3_Sub23 method2546(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2540(arg0)) {
			@Pc(16) byte[] local16 = arg0.method348(arg1, arg2);
			return local16 == null ? null : new Class3_Sub23(local16);
		} else {
			arg0.method349(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
	public static int method2548() {
		@Pc(7) int local7 = aByteArray42[anInt3507] >> anInt3509 & 0x1;
		anInt3509++;
		anInt3507 += anInt3509 >> 3;
		anInt3509 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
	public static void method2549() {
		aByteArray42 = null;
		aClass12Array1 = null;
		aClass88Array1 = null;
		aClass85Array1 = null;
		aClass23Array1 = null;
		aBooleanArray16 = null;
		anIntArray377 = null;
		aFloatArray2 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray1 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray4 = null;
		anIntArray378 = null;
		anIntArray376 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BI)V")
	public static void method2550(@OriginalArg(0) byte[] arg0) {
		aByteArray42 = arg0;
		anInt3507 = 0;
		anInt3509 = 0;
	}
}
