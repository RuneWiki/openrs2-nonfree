import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "[F")
	public static float[] aFloatArray61;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "[B")
	private static byte[] aByteArray102;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	private static int anInt9369;

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "[F")
	public static float[] aFloatArray62;

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "[Lclient!gm;")
	public static Class121[] aClass121Array1;

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "[F")
	public static float[] aFloatArray63;

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "[Lclient!wk;")
	public static Class359[] aClass359Array1;

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "[F")
	public static float[] aFloatArray64;

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
	public static int anInt9370;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
	public static int anInt9372;

	@OriginalMember(owner = "client!uca", name = "A", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!uca", name = "E", descriptor = "[F")
	public static float[] aFloatArray67;

	@OriginalMember(owner = "client!uca", name = "G", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!uca", name = "I", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!uca", name = "J", descriptor = "[Lclient!nb;")
	public static Class226[] aClass226Array1;

	@OriginalMember(owner = "client!uca", name = "K", descriptor = "[Lclient!pb;")
	public static Class256[] aClass256Array1;

	@OriginalMember(owner = "client!uca", name = "L", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
	private static int anInt9376;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "Z")
	private static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I")
	public static int method7630(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9369) {
			local8 = 8 - anInt9369;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray102[anInt9376] >> anInt9369 & local14) << local3;
			anInt9369 = 0;
			anInt9376++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray102[anInt9376] >> anInt9369 & local8) << local3;
			anInt9369 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!jn;I)Lclient!uca;")
	public static Class4_Sub47 method7632(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1) {
		if (method7633(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4005(arg1);
			return local14 == null ? null : new Class4_Sub47(local14);
		} else {
			arg0.method3996(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!jn;)Z")
	private static boolean method7633(@OriginalArg(0) Class176 arg0) {
		if (!aBoolean654) {
			@Pc(7) byte[] local7 = arg0.method3994(0, 0);
			if (local7 == null) {
				return false;
			}
			method7639(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)F")
	public static float method7636(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "()I")
	public static int method7637() {
		@Pc(7) int local7 = aByteArray102[anInt9376] >> anInt9369 & 0x1;
		anInt9369++;
		anInt9376 += anInt9369 >> 3;
		anInt9369 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "([B)V")
	private static void method7639(@OriginalArg(0) byte[] arg0) {
		method7641(arg0);
		anInt9372 = 0x1 << method7630(4);
		anInt9370 = 0x1 << method7630(4);
		aFloatArray62 = new float[anInt9370];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9372 : anInt9370;
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
			local191 = Static244.method3930(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static220.method3593(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray64 = local39;
				aFloatArray66 = local84;
				aFloatArray61 = local136;
				anIntArray506 = local185;
			} else {
				aFloatArray67 = local39;
				aFloatArray65 = local84;
				aFloatArray63 = local136;
				anIntArray505 = local185;
			}
		}
		local24 = method7630(8) + 1;
		aClass359Array1 = new Class359[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass359Array1[local28] = new Class359();
		}
		local32 = method7630(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7630(16);
		}
		@Pc(269) int local269 = method7630(6) + 1;
		aClass121Array1 = new Class121[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass121Array1[local41] = new Class121();
		}
		@Pc(290) int local290 = method7630(6) + 1;
		aClass226Array1 = new Class226[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass226Array1[local86] = new Class226();
		}
		@Pc(311) int local311 = method7630(6) + 1;
		aClass256Array1 = new Class256[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass256Array1[local138] = new Class256();
		}
		@Pc(332) int local332 = method7630(6) + 1;
		aBooleanArray26 = new boolean[local332];
		anIntArray504 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray26[local191] = method7637() != 0;
			method7630(16);
			method7630(16);
			anIntArray504[local191] = method7630(8);
		}
		aBoolean654 = true;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!jn;II)Lclient!uca;")
	public static Class4_Sub47 method7640(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7633(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3994(arg2, arg1);
			return local16 == null ? null : new Class4_Sub47(local16);
		} else {
			arg0.method3977(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([BI)V")
	public static void method7641(@OriginalArg(0) byte[] arg0) {
		aByteArray102 = arg0;
		anInt9376 = 0;
		anInt9369 = 0;
	}
}
