import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "[Lclient!rf;")
	public static Class203[] aClass203Array1;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "[Lclient!lt;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "[Lclient!qu;")
	public static Class201[] aClass201Array1;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "[I")
	public static int[] anIntArray635;

	@OriginalMember(owner = "client!vs", name = "C", descriptor = "[I")
	public static int[] anIntArray636;

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
	public static int anInt7193;

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
	private static int anInt7195;

	@OriginalMember(owner = "client!vs", name = "H", descriptor = "[I")
	public static int[] anIntArray637;

	@OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
	private static int anInt7196;

	@OriginalMember(owner = "client!vs", name = "K", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!vs", name = "L", descriptor = "[Lclient!uh;")
	public static Class241[] aClass241Array1;

	@OriginalMember(owner = "client!vs", name = "O", descriptor = "I")
	public static int anInt7197;

	@OriginalMember(owner = "client!vs", name = "Q", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!vs", name = "R", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "Z")
	private static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([B)V")
	private static void method5545(@OriginalArg(0) byte[] arg0) {
		method5551(arg0);
		anInt7193 = 0x1 << method5548(4);
		anInt7197 = 0x1 << method5548(4);
		aFloatArray28 = new float[anInt7197];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7193 : anInt7197;
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
			local191 = Static51.method1041(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static291.method4051(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray31 = local39;
				aFloatArray29 = local84;
				aFloatArray34 = local136;
				anIntArray636 = local185;
			} else {
				aFloatArray27 = local39;
				aFloatArray32 = local84;
				aFloatArray30 = local136;
				anIntArray635 = local185;
			}
		}
		local24 = method5548(8) + 1;
		aClass201Array1 = new Class201[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass201Array1[local28] = new Class201();
		}
		local32 = method5548(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5548(16);
		}
		@Pc(269) int local269 = method5548(6) + 1;
		aClass151Array1 = new Class151[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass151Array1[local41] = new Class151();
		}
		@Pc(290) int local290 = method5548(6) + 1;
		aClass203Array1 = new Class203[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass203Array1[local86] = new Class203();
		}
		@Pc(311) int local311 = method5548(6) + 1;
		aClass241Array1 = new Class241[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass241Array1[local138] = new Class241();
		}
		@Pc(332) int local332 = method5548(6) + 1;
		aBooleanArray28 = new boolean[local332];
		anIntArray637 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray28[local191] = method5554() != 0;
			method5548(16);
			method5548(16);
			anIntArray637[local191] = method5548(8);
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)F")
	public static float method5547(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
	public static int method5548(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7196) {
			local8 = 8 - anInt7196;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray93[anInt7195] >> anInt7196 & local14) << local3;
			anInt7196 = 0;
			anInt7195++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray93[anInt7195] >> anInt7196 & local8) << local3;
			anInt7196 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ns;II)Lclient!vs;")
	public static Class4_Sub43 method5549(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5552(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3696(arg2, arg1);
			return local16 == null ? null : new Class4_Sub43(local16);
		} else {
			arg0.method3693(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ns;I)Lclient!vs;")
	public static Class4_Sub43 method5550(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1) {
		if (method5552(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3684(arg1);
			return local14 == null ? null : new Class4_Sub43(local14);
		} else {
			arg0.method3670(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BI)V")
	public static void method5551(@OriginalArg(0) byte[] arg0) {
		aByteArray93 = arg0;
		anInt7195 = 0;
		anInt7196 = 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ns;)Z")
	private static boolean method5552(@OriginalArg(0) Class166 arg0) {
		if (!aBoolean482) {
			@Pc(7) byte[] local7 = arg0.method3696(0, 0);
			if (local7 == null) {
				return false;
			}
			method5545(local7);
			aBoolean482 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "()I")
	public static int method5554() {
		@Pc(7) int local7 = aByteArray93[anInt7195] >> anInt7196 & 0x1;
		anInt7196++;
		anInt7195 += anInt7196 >> 3;
		anInt7196 &= 0x7;
		return local7;
	}
}
