import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "[Lclient!wc;")
	public static Class82[] aClass82Array1;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "[Lclient!fd;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "[Lclient!va;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
	public static int anInt62;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "[Lclient!ca;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
	private static int anInt63;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	private static int anInt68;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Z")
	private static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)F")
	public static float method30(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
	public static int method31(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt68) {
			local8 = 8 - anInt68;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray3[anInt63] >> anInt68 & local14) << local3;
			anInt68 = 0;
			anInt63++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray3[anInt63] >> anInt68 & local8) << local3;
			anInt68 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ff;)Z")
	private static boolean method34(@OriginalArg(0) Class26 arg0) {
		if (!aBoolean4) {
			@Pc(7) byte[] local7 = arg0.method1038(0, 0);
			if (local7 == null) {
				return false;
			}
			method39(local7);
			aBoolean4 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public static void method35() {
		aByteArray3 = null;
		aClass82Array1 = null;
		aClass11Array1 = null;
		aClass24Array1 = null;
		aClass77Array1 = null;
		aBooleanArray1 = null;
		anIntArray15 = null;
		aFloatArray7 = null;
		aFloatArray4 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		anIntArray14 = null;
		anIntArray16 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI)V")
	public static void method36(@OriginalArg(0) byte[] arg0) {
		aByteArray3 = arg0;
		anInt63 = 0;
		anInt68 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()I")
	public static int method38() {
		@Pc(7) int local7 = aByteArray3[anInt63] >> anInt68 & 0x1;
		anInt68++;
		anInt63 += anInt68 >> 3;
		anInt68 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "([B)V")
	private static void method39(@OriginalArg(0) byte[] arg0) {
		method36(arg0);
		anInt59 = 0x1 << method31(4);
		anInt62 = 0x1 << method31(4);
		aFloatArray7 = new float[anInt62];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt59 : anInt62;
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
			local191 = Static66.method1105(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static8.method163(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray3 = local84;
				aFloatArray8 = local136;
				anIntArray14 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray2 = local84;
				aFloatArray5 = local136;
				anIntArray16 = local185;
			}
		}
		local24 = method31(8) + 1;
		aClass82Array1 = new Class82[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass82Array1[local28] = new Class82();
		}
		local32 = method31(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method31(16);
		}
		@Pc(269) int local269 = method31(6) + 1;
		aClass11Array1 = new Class11[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass11Array1[local41] = new Class11();
		}
		@Pc(290) int local290 = method31(6) + 1;
		aClass24Array1 = new Class24[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass24Array1[local86] = new Class24();
		}
		@Pc(311) int local311 = method31(6) + 1;
		aClass77Array1 = new Class77[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass77Array1[local138] = new Class77();
		}
		@Pc(332) int local332 = method31(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray15 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method38() != 0;
			method31(16);
			method31(16);
			anIntArray15[local191] = method31(8);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ff;II)Lclient!ad;")
	public static Class5_Sub1 method40(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method34(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1038(arg1, arg2);
			return local16 == null ? null : new Class5_Sub1(local16);
		} else {
			arg0.method1041(arg1, arg2);
			return null;
		}
	}
}
