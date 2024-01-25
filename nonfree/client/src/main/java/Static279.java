import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "[B")
	private static byte[] aByteArray41;

	@OriginalMember(owner = "client!kda", name = "r", descriptor = "[Lclient!hm;")
	public static Class148[] aClass148Array1;

	@OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
	private static int anInt4944;

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
	public static int anInt4945;

	@OriginalMember(owner = "client!kda", name = "w", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!kda", name = "x", descriptor = "[Lclient!cha;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
	private static int anInt4946;

	@OriginalMember(owner = "client!kda", name = "B", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!kda", name = "C", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!kda", name = "D", descriptor = "[Lclient!pf;")
	public static Class268[] aClass268Array1;

	@OriginalMember(owner = "client!kda", name = "F", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!kda", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!kda", name = "H", descriptor = "[Lclient!bv;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!kda", name = "I", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!kda", name = "K", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!kda", name = "N", descriptor = "[F")
	public static float[] aFloatArray39;

	@OriginalMember(owner = "client!kda", name = "R", descriptor = "[F")
	public static float[] aFloatArray40;

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "Z")
	private static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "()I")
	public static int method4448() {
		@Pc(7) int local7 = aByteArray41[anInt4946] >> anInt4944 & 0x1;
		anInt4944++;
		anInt4946 += anInt4944 >> 3;
		anInt4944 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)F")
	public static float method4450(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([B)V")
	private static void method4451(@OriginalArg(0) byte[] arg0) {
		method4453(arg0);
		anInt4945 = 0x1 << method4458(4);
		anInt4940 = 0x1 << method4458(4);
		aFloatArray38 = new float[anInt4940];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4945 : anInt4940;
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
			local191 = Static172.method2668(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static367.method5443(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray37 = local39;
				aFloatArray40 = local84;
				aFloatArray35 = local136;
				anIntArray265 = local185;
			} else {
				aFloatArray39 = local39;
				aFloatArray36 = local84;
				aFloatArray33 = local136;
				anIntArray267 = local185;
			}
		}
		local24 = method4458(8) + 1;
		aClass148Array1 = new Class148[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass148Array1[local28] = new Class148();
		}
		local32 = method4458(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4458(16);
		}
		@Pc(269) int local269 = method4458(6) + 1;
		aClass268Array1 = new Class268[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass268Array1[local41] = new Class268();
		}
		@Pc(290) int local290 = method4458(6) + 1;
		aClass54Array1 = new Class54[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass54Array1[local86] = new Class54();
		}
		@Pc(311) int local311 = method4458(6) + 1;
		aClass44Array1 = new Class44[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass44Array1[local138] = new Class44();
		}
		@Pc(332) int local332 = method4458(6) + 1;
		aBooleanArray18 = new boolean[local332];
		anIntArray266 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray18[local191] = method4448() != 0;
			method4458(16);
			method4458(16);
			anIntArray266[local191] = method4458(8);
		}
		aBoolean372 = true;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BI)V")
	public static void method4453(@OriginalArg(0) byte[] arg0) {
		aByteArray41 = arg0;
		anInt4946 = 0;
		anInt4944 = 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!la;)Z")
	private static boolean method4454(@OriginalArg(0) Class207 arg0) {
		if (!aBoolean372) {
			@Pc(7) byte[] local7 = arg0.method4681(0, 0);
			if (local7 == null) {
				return false;
			}
			method4451(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!la;II)Lclient!kda;")
	public static Class5_Sub29 method4457(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4454(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4681(arg1, arg2);
			return local16 == null ? null : new Class5_Sub29(local16);
		} else {
			arg0.method4697(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
	public static int method4458(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4944) {
			local8 = 8 - anInt4944;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray41[anInt4946] >> anInt4944 & local14) << local3;
			anInt4944 = 0;
			anInt4946++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray41[anInt4946] >> anInt4944 & local8) << local3;
			anInt4944 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!la;I)Lclient!kda;")
	public static Class5_Sub29 method4459(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1) {
		if (method4454(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4690(arg1);
			return local14 == null ? null : new Class5_Sub29(local14);
		} else {
			arg0.method4678(arg1);
			return null;
		}
	}
}
