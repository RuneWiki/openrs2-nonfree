import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "[Lclient!jh;")
	public static Class181[] aClass181Array1;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[I")
	public static int[] anIntArray583;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
	public static int anInt10146;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "[Lclient!ud;")
	public static Class351[] aClass351Array1;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
	public static int[] anIntArray584;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
	private static int anInt10149;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lclient!vga;")
	public static Class372[] aClass372Array1;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
	public static int anInt10151;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "[I")
	public static int[] anIntArray585;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
	private static int anInt10154;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!vp", name = "N", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!vp", name = "O", descriptor = "[B")
	private static byte[] aByteArray105;

	@OriginalMember(owner = "client!vp", name = "P", descriptor = "[Lclient!dh;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "Z")
	private static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cb;II)Lclient!vp;")
	public static Class5_Sub54 method8453(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method8457(arg0)) {
			@Pc(16) byte[] local16 = arg0.method916(arg2, arg1);
			return local16 == null ? null : new Class5_Sub54(local16);
		} else {
			arg0.method901(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)V")
	public static void method8454(@OriginalArg(0) byte[] arg0) {
		aByteArray105 = arg0;
		anInt10149 = 0;
		anInt10154 = 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()I")
	public static int method8455() {
		@Pc(7) int local7 = aByteArray105[anInt10149] >> anInt10154 & 0x1;
		anInt10154++;
		anInt10149 += anInt10154 >> 3;
		anInt10154 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cb;)Z")
	private static boolean method8457(@OriginalArg(0) Class50 arg0) {
		if (!aBoolean739) {
			@Pc(7) byte[] local7 = arg0.method916(0, 0);
			if (local7 == null) {
				return false;
			}
			method8462(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	public static int method8459(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt10154) {
			local8 = 8 - anInt10154;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray105[anInt10149] >> anInt10154 & local14) << local3;
			anInt10154 = 0;
			anInt10149++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray105[anInt10149] >> anInt10154 & local8) << local3;
			anInt10154 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cb;I)Lclient!vp;")
	public static Class5_Sub54 method8461(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		if (method8457(arg0)) {
			@Pc(14) byte[] local14 = arg0.method915(arg1);
			return local14 == null ? null : new Class5_Sub54(local14);
		} else {
			arg0.method897(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "([B)V")
	private static void method8462(@OriginalArg(0) byte[] arg0) {
		method8454(arg0);
		anInt10146 = 0x1 << method8459(4);
		anInt10151 = 0x1 << method8459(4);
		aFloatArray71 = new float[anInt10151];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt10146 : anInt10151;
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
			local191 = Static187.method2726(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static637.method8448(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray76 = local39;
				aFloatArray74 = local84;
				aFloatArray77 = local136;
				anIntArray584 = local185;
			} else {
				aFloatArray72 = local39;
				aFloatArray70 = local84;
				aFloatArray75 = local136;
				anIntArray585 = local185;
			}
		}
		local24 = method8459(8) + 1;
		aClass372Array1 = new Class372[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass372Array1[local28] = new Class372();
		}
		local32 = method8459(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method8459(16);
		}
		@Pc(269) int local269 = method8459(6) + 1;
		aClass351Array1 = new Class351[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass351Array1[local41] = new Class351();
		}
		@Pc(290) int local290 = method8459(6) + 1;
		aClass78Array1 = new Class78[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass78Array1[local86] = new Class78();
		}
		@Pc(311) int local311 = method8459(6) + 1;
		aClass181Array1 = new Class181[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass181Array1[local138] = new Class181();
		}
		@Pc(332) int local332 = method8459(6) + 1;
		aBooleanArray27 = new boolean[local332];
		anIntArray583 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray27[local191] = method8455() != 0;
			method8459(16);
			method8459(16);
			anIntArray583[local191] = method8459(8);
		}
		aBoolean739 = true;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)F")
	public static float method8464(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
