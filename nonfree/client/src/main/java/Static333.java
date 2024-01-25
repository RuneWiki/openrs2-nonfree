import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "[Lclient!so;")
	public static Class272[] aClass272Array1;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "[Lclient!pw;")
	public static Class240[] aClass240Array1;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
	private static int anInt6304;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "[Lclient!qm;")
	public static Class247[] aClass247Array1;

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lclient!mt;")
	public static Class203[] aClass203Array1;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
	public static int anInt6307;

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "[F")
	public static float[] aFloatArray59;

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "[B")
	private static byte[] aByteArray83;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
	public static int anInt6310;

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
	private static int anInt6311;

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "Z")
	private static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gp;I)Lclient!nl;")
	public static Class5_Sub33 method5229(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1) {
		if (method5235(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2964(arg1);
			return local14 == null ? null : new Class5_Sub33(local14);
		} else {
			arg0.method2973(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)F")
	public static float method5233(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "()I")
	public static int method5234() {
		@Pc(7) int local7 = aByteArray83[anInt6311] >> anInt6304 & 0x1;
		anInt6304++;
		anInt6311 += anInt6304 >> 3;
		anInt6304 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gp;)Z")
	private static boolean method5235(@OriginalArg(0) Class117 arg0) {
		if (!aBoolean433) {
			@Pc(7) byte[] local7 = arg0.method2962(0, 0);
			if (local7 == null) {
				return false;
			}
			method5239(local7);
			aBoolean433 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
	public static int method5237(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6304) {
			local8 = 8 - anInt6304;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray83[anInt6311] >> anInt6304 & local14) << local3;
			anInt6304 = 0;
			anInt6311++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray83[anInt6311] >> anInt6304 & local8) << local3;
			anInt6304 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BI)V")
	public static void method5238(@OriginalArg(0) byte[] arg0) {
		aByteArray83 = arg0;
		anInt6311 = 0;
		anInt6304 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "([B)V")
	private static void method5239(@OriginalArg(0) byte[] arg0) {
		method5238(arg0);
		anInt6307 = 0x1 << method5237(4);
		anInt6310 = 0x1 << method5237(4);
		aFloatArray55 = new float[anInt6310];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6307 : anInt6310;
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
			local191 = Static344.method5361(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static185.method3135(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray53 = local39;
				aFloatArray60 = local84;
				aFloatArray58 = local136;
				anIntArray471 = local185;
			} else {
				aFloatArray54 = local39;
				aFloatArray56 = local84;
				aFloatArray59 = local136;
				anIntArray469 = local185;
			}
		}
		local24 = method5237(8) + 1;
		aClass272Array1 = new Class272[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass272Array1[local28] = new Class272();
		}
		local32 = method5237(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5237(16);
		}
		@Pc(269) int local269 = method5237(6) + 1;
		aClass203Array1 = new Class203[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass203Array1[local41] = new Class203();
		}
		@Pc(290) int local290 = method5237(6) + 1;
		aClass240Array1 = new Class240[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass240Array1[local86] = new Class240();
		}
		@Pc(311) int local311 = method5237(6) + 1;
		aClass247Array1 = new Class247[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass247Array1[local138] = new Class247();
		}
		@Pc(332) int local332 = method5237(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray470 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method5234() != 0;
			method5237(16);
			method5237(16);
			anIntArray470[local191] = method5237(8);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gp;II)Lclient!nl;")
	public static Class5_Sub33 method5240(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5235(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2962(arg2, arg1);
			return local16 == null ? null : new Class5_Sub33(local16);
		} else {
			arg0.method2974(arg2, arg1);
			return null;
		}
	}
}
