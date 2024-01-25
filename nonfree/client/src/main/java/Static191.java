import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public static int anInt3959;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[Lclient!nq;")
	public static Class226[] aClass226Array1;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	private static int anInt3960;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[B")
	private static byte[] aByteArray35;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	private static int anInt3963;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "[Lclient!ne;")
	public static Class217[] aClass217Array1;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
	public static int anInt3965;

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "[Lclient!cj;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "[Lclient!we;")
	public static Class351[] aClass351Array1;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Z")
	private static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([B)V")
	private static void method3457(@OriginalArg(0) byte[] arg0) {
		method3468(arg0);
		anInt3959 = 0x1 << method3462(4);
		anInt3965 = 0x1 << method3462(4);
		aFloatArray36 = new float[anInt3965];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3959 : anInt3965;
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
			local191 = Static564.method7583(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static283.method4642(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray30 = local39;
				aFloatArray34 = local84;
				aFloatArray37 = local136;
				anIntArray246 = local185;
			} else {
				aFloatArray31 = local39;
				aFloatArray35 = local84;
				aFloatArray32 = local136;
				anIntArray247 = local185;
			}
		}
		local24 = method3462(8) + 1;
		aClass351Array1 = new Class351[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass351Array1[local28] = new Class351();
		}
		local32 = method3462(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3462(16);
		}
		@Pc(269) int local269 = method3462(6) + 1;
		aClass48Array1 = new Class48[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass48Array1[local41] = new Class48();
		}
		@Pc(290) int local290 = method3462(6) + 1;
		aClass226Array1 = new Class226[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass226Array1[local86] = new Class226();
		}
		@Pc(311) int local311 = method3462(6) + 1;
		aClass217Array1 = new Class217[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass217Array1[local138] = new Class217();
		}
		@Pc(332) int local332 = method3462(6) + 1;
		aBooleanArray16 = new boolean[local332];
		anIntArray245 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray16[local191] = method3463() != 0;
			method3462(16);
			method3462(16);
			anIntArray245[local191] = method3462(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pfa;II)Lclient!hl;")
	public static Class6_Sub22 method3461(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3465(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5772(arg2, arg1);
			return local16 == null ? null : new Class6_Sub22(local16);
		} else {
			arg0.method5780(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
	public static int method3462(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3963) {
			local8 = 8 - anInt3963;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray35[anInt3960] >> anInt3963 & local14) << local3;
			anInt3963 = 0;
			anInt3960++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray35[anInt3960] >> anInt3963 & local8) << local3;
			anInt3963 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()I")
	public static int method3463() {
		@Pc(7) int local7 = aByteArray35[anInt3960] >> anInt3963 & 0x1;
		anInt3963++;
		anInt3960 += anInt3963 >> 3;
		anInt3963 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pfa;)Z")
	private static boolean method3465(@OriginalArg(0) Class251 arg0) {
		if (!aBoolean271) {
			@Pc(7) byte[] local7 = arg0.method5772(0, 0);
			if (local7 == null) {
				return false;
			}
			method3457(local7);
			aBoolean271 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pfa;I)Lclient!hl;")
	public static Class6_Sub22 method3466(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1) {
		if (method3465(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5761(arg1);
			return local14 == null ? null : new Class6_Sub22(local14);
		} else {
			arg0.method5782(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)F")
	public static float method3467(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BI)V")
	public static void method3468(@OriginalArg(0) byte[] arg0) {
		aByteArray35 = arg0;
		anInt3960 = 0;
		anInt3963 = 0;
	}
}
