import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "[Lclient!vn;")
	public static Class374[] aClass374Array1;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "[Lclient!ufa;")
	public static Class351[] aClass351Array1;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
	public static int[] anIntArray625;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "[I")
	public static int[] anIntArray626;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public static int anInt10832;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
	public static int anInt10833;

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
	private static int anInt10837;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "[Lclient!ta;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "[I")
	public static int[] anIntArray627;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "[Lclient!ei;")
	public static Class101[] aClass101Array1;

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
	private static int anInt10839;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "[B")
	private static byte[] aByteArray107;

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "Z")
	private static boolean aBoolean750 = false;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!uq;II)Lclient!wm;")
	public static Class3_Sub54 method8925(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method8930(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8368(arg1, arg2);
			return local16 == null ? null : new Class3_Sub54(local16);
		} else {
			arg0.method8354(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BI)V")
	public static void method8926(@OriginalArg(0) byte[] arg0) {
		aByteArray107 = arg0;
		anInt10839 = 0;
		anInt10837 = 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)F")
	public static float method8928(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()I")
	public static int method8929() {
		@Pc(7) int local7 = aByteArray107[anInt10839] >> anInt10837 & 0x1;
		anInt10837++;
		anInt10839 += anInt10837 >> 3;
		anInt10837 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!uq;)Z")
	private static boolean method8930(@OriginalArg(0) Class362 arg0) {
		if (!aBoolean750) {
			@Pc(7) byte[] local7 = arg0.method8368(0, 0);
			if (local7 == null) {
				return false;
			}
			method8932(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([B)V")
	private static void method8932(@OriginalArg(0) byte[] arg0) {
		method8926(arg0);
		anInt10832 = 0x1 << method8936(4);
		anInt10833 = 0x1 << method8936(4);
		aFloatArray72 = new float[anInt10833];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt10832 : anInt10833;
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
			local191 = Static407.method5605(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static337.method8459(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray73 = local39;
				aFloatArray76 = local84;
				aFloatArray75 = local136;
				anIntArray625 = local185;
			} else {
				aFloatArray74 = local39;
				aFloatArray77 = local84;
				aFloatArray71 = local136;
				anIntArray627 = local185;
			}
		}
		local24 = method8936(8) + 1;
		aClass351Array1 = new Class351[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass351Array1[local28] = new Class351();
		}
		local32 = method8936(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method8936(16);
		}
		@Pc(269) int local269 = method8936(6) + 1;
		aClass374Array1 = new Class374[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass374Array1[local41] = new Class374();
		}
		@Pc(290) int local290 = method8936(6) + 1;
		aClass101Array1 = new Class101[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass101Array1[local86] = new Class101();
		}
		@Pc(311) int local311 = method8936(6) + 1;
		aClass331Array1 = new Class331[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass331Array1[local138] = new Class331();
		}
		@Pc(332) int local332 = method8936(6) + 1;
		aBooleanArray31 = new boolean[local332];
		anIntArray626 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray31[local191] = method8929() != 0;
			method8936(16);
			method8936(16);
			anIntArray626[local191] = method8936(8);
		}
		aBoolean750 = true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!uq;I)Lclient!wm;")
	public static Class3_Sub54 method8933(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1) {
		if (method8930(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8356(arg1);
			return local14 == null ? null : new Class3_Sub54(local14);
		} else {
			arg0.method8365(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
	public static int method8936(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt10837) {
			local8 = 8 - anInt10837;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray107[anInt10839] >> anInt10837 & local14) << local3;
			anInt10837 = 0;
			anInt10839++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray107[anInt10839] >> anInt10837 & local8) << local3;
			anInt10837 += arg0;
		}
		return local1;
	}
}
