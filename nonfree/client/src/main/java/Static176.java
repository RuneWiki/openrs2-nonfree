import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "[Lclient!gg;")
	public static Class119[] aClass119Array1;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
	private static int anInt3575;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "[Lclient!br;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "[Lclient!di;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[Lclient!tq;")
	public static Class316[] aClass316Array1;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "[B")
	private static byte[] aByteArray52;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
	private static int anInt3579;

	@OriginalMember(owner = "client!gw", name = "K", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!gw", name = "L", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!gw", name = "N", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!gw", name = "O", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!gw", name = "P", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!gw", name = "S", descriptor = "I")
	public static int anInt3582;

	@OriginalMember(owner = "client!gw", name = "M", descriptor = "Z")
	private static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!pe;II)Lclient!gw;")
	public static Class3_Sub16 method3135(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3140(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6401(arg1, arg2);
			return local16 == null ? null : new Class3_Sub16(local16);
		} else {
			arg0.method6398(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([B)V")
	private static void method3136(@OriginalArg(0) byte[] arg0) {
		method3138(arg0);
		anInt3574 = 0x1 << method3137(4);
		anInt3582 = 0x1 << method3137(4);
		aFloatArray21 = new float[anInt3582];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3574 : anInt3582;
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
			local191 = Static373.method6080(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static250.method4493(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray24 = local39;
				aFloatArray27 = local84;
				aFloatArray22 = local136;
				anIntArray234 = local185;
			} else {
				aFloatArray26 = local39;
				aFloatArray28 = local84;
				aFloatArray25 = local136;
				anIntArray235 = local185;
			}
		}
		local24 = method3137(8) + 1;
		aClass316Array1 = new Class316[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass316Array1[local28] = new Class316();
		}
		local32 = method3137(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3137(16);
		}
		@Pc(269) int local269 = method3137(6) + 1;
		aClass119Array1 = new Class119[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass119Array1[local41] = new Class119();
		}
		@Pc(290) int local290 = method3137(6) + 1;
		aClass35Array1 = new Class35[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass35Array1[local86] = new Class35();
		}
		@Pc(311) int local311 = method3137(6) + 1;
		aClass61Array1 = new Class61[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass61Array1[local138] = new Class61();
		}
		@Pc(332) int local332 = method3137(6) + 1;
		aBooleanArray11 = new boolean[local332];
		anIntArray236 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray11[local191] = method3144() != 0;
			method3137(16);
			method3137(16);
			anIntArray236[local191] = method3137(8);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	public static int method3137(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3575) {
			local8 = 8 - anInt3575;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray52[anInt3579] >> anInt3575 & local14) << local3;
			anInt3575 = 0;
			anInt3579++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray52[anInt3579] >> anInt3575 & local8) << local3;
			anInt3575 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BI)V")
	public static void method3138(@OriginalArg(0) byte[] arg0) {
		aByteArray52 = arg0;
		anInt3579 = 0;
		anInt3575 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!pe;)Z")
	private static boolean method3140(@OriginalArg(0) Class254 arg0) {
		if (!aBoolean281) {
			@Pc(7) byte[] local7 = arg0.method6401(0, 0);
			if (local7 == null) {
				return false;
			}
			method3136(local7);
			aBoolean281 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!pe;I)Lclient!gw;")
	public static Class3_Sub16 method3142(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		if (method3140(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6420(arg1);
			return local14 == null ? null : new Class3_Sub16(local14);
		} else {
			arg0.method6417(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()I")
	public static int method3144() {
		@Pc(7) int local7 = aByteArray52[anInt3579] >> anInt3575 & 0x1;
		anInt3575++;
		anInt3579 += anInt3575 >> 3;
		anInt3575 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)F")
	public static float method3145(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
