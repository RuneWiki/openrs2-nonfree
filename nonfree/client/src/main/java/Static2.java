import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt15;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	private static int anInt17;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "[Lclient!fe;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "[Lclient!nb;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "[Lclient!ga;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[Lclient!qb;")
	public static Class63[] aClass63Array1;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	private static int anInt23;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
	private static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!jc;)Z")
	private static boolean method14(@OriginalArg(0) Class40 arg0) {
		if (!aBoolean1) {
			@Pc(7) byte[] local7 = arg0.method1771(0, 0);
			if (local7 == null) {
				return false;
			}
			method22(local7);
			aBoolean1 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!jc;II)Lclient!aa;")
	public static Class2_Sub1 method15(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method14(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1771(arg1, arg2);
			return local16 == null ? null : new Class2_Sub1(local16);
		} else {
			arg0.method1783(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([BI)V")
	public static void method16(@OriginalArg(0) byte[] arg0) {
		aByteArray1 = arg0;
		anInt23 = 0;
		anInt17 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
	public static int method17() {
		@Pc(7) int local7 = aByteArray1[anInt23] >> anInt17 & 0x1;
		anInt17++;
		anInt23 += anInt17 >> 3;
		anInt17 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
	public static int method20(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt17) {
			local8 = 8 - anInt17;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray1[anInt23] >> anInt17 & local14) << local3;
			anInt17 = 0;
			anInt23++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray1[anInt23] >> anInt17 & local8) << local3;
			anInt17 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)F")
	public static float method21(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
	private static void method22(@OriginalArg(0) byte[] arg0) {
		method16(arg0);
		anInt15 = 0x1 << method20(4);
		anInt16 = 0x1 << method20(4);
		aFloatArray1 = new float[anInt16];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt15 : anInt16;
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
			local191 = Static42.method743(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static10.method317(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray5 = local84;
				aFloatArray6 = local136;
				anIntArray3 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray8 = local84;
				aFloatArray7 = local136;
				anIntArray2 = local185;
			}
		}
		local24 = method20(8) + 1;
		aClass53Array1 = new Class53[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass53Array1[local28] = new Class53();
		}
		local32 = method20(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method20(16);
		}
		@Pc(269) int local269 = method20(6) + 1;
		aClass23Array1 = new Class23[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass23Array1[local41] = new Class23();
		}
		@Pc(290) int local290 = method20(6) + 1;
		aClass26Array1 = new Class26[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass26Array1[local86] = new Class26();
		}
		@Pc(311) int local311 = method20(6) + 1;
		aClass63Array1 = new Class63[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass63Array1[local138] = new Class63();
		}
		@Pc(332) int local332 = method20(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray1 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method17() != 0;
			method20(16);
			method20(16);
			anIntArray1[local191] = method20(8);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
	public static void method24() {
		aByteArray1 = null;
		aClass53Array1 = null;
		aClass23Array1 = null;
		aClass26Array1 = null;
		aClass63Array1 = null;
		aBooleanArray1 = null;
		anIntArray1 = null;
		aFloatArray1 = null;
		aFloatArray4 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		anIntArray3 = null;
		anIntArray2 = null;
	}
}
