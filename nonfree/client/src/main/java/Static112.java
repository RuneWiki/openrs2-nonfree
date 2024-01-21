import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "[Lclient!tc;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "[Lclient!sc;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	public static int anInt2532;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "[Lclient!vg;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	private static int anInt2536;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "[Lclient!o;")
	public static Class59[] aClass59Array1;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
	private static int anInt2538;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Z")
	private static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
	public static int method1768() {
		@Pc(7) int local7 = aByteArray32[anInt2536] >> anInt2538 & 0x1;
		anInt2538++;
		anInt2536 += anInt2538 >> 3;
		anInt2538 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI)V")
	public static void method1770(@OriginalArg(0) byte[] arg0) {
		aByteArray32 = arg0;
		anInt2536 = 0;
		anInt2538 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)F")
	public static float method1771(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "([B)V")
	private static void method1773(@OriginalArg(0) byte[] arg0) {
		method1770(arg0);
		anInt2533 = 0x1 << method1777(4);
		anInt2532 = 0x1 << method1777(4);
		aFloatArray3 = new float[anInt2532];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2533 : anInt2532;
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
			local191 = Static97.method1607(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static144.method2263(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray1 = local39;
				aFloatArray5 = local84;
				aFloatArray8 = local136;
				anIntArray264 = local185;
			} else {
				aFloatArray2 = local39;
				aFloatArray7 = local84;
				aFloatArray6 = local136;
				anIntArray262 = local185;
			}
		}
		local24 = method1777(8) + 1;
		aClass85Array1 = new Class85[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass85Array1[local28] = new Class85();
		}
		local32 = method1777(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1777(16);
		}
		@Pc(269) int local269 = method1777(6) + 1;
		aClass77Array1 = new Class77[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass77Array1[local41] = new Class77();
		}
		@Pc(290) int local290 = method1777(6) + 1;
		aClass73Array1 = new Class73[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass73Array1[local86] = new Class73();
		}
		@Pc(311) int local311 = method1777(6) + 1;
		aClass59Array1 = new Class59[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass59Array1[local138] = new Class59();
		}
		@Pc(332) int local332 = method1777(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray263 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method1768() != 0;
			method1777(16);
			method1777(16);
			anIntArray263[local191] = method1777(8);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public static void method1774() {
		aByteArray32 = null;
		aClass85Array1 = null;
		aClass77Array1 = null;
		aClass73Array1 = null;
		aClass59Array1 = null;
		aBooleanArray12 = null;
		anIntArray263 = null;
		aFloatArray3 = null;
		aFloatArray1 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray2 = null;
		aFloatArray7 = null;
		aFloatArray6 = null;
		anIntArray264 = null;
		anIntArray262 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kh;)Z")
	private static boolean method1776(@OriginalArg(0) Class29 arg0) {
		if (!aBoolean112) {
			@Pc(7) byte[] local7 = arg0.method1030(0, 0);
			if (local7 == null) {
				return false;
			}
			method1773(local7);
			aBoolean112 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)I")
	public static int method1777(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2538) {
			local8 = 8 - anInt2538;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray32[anInt2536] >> anInt2538 & local14) << local3;
			anInt2538 = 0;
			anInt2536++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray32[anInt2536] >> anInt2538 & local8) << local3;
			anInt2538 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kh;II)Lclient!oa;")
	public static Class2_Sub16 method1778(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1776(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1030(arg2, arg1);
			return local16 == null ? null : new Class2_Sub16(local16);
		} else {
			arg0.method1016(arg1, arg2);
			return null;
		}
	}
}
