import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "[Lclient!rt;")
	public static Class309[] aClass309Array1;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
	public static int[] anIntArray527;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "[Lclient!wk;")
	public static Class389[] aClass389Array1;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	private static int anInt6044;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
	public static int anInt6046;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
	public static int anInt6048;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "[Lclient!mu;")
	public static Class229[] aClass229Array1;

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "[Lclient!pt;")
	public static Class276[] aClass276Array1;

	@OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
	private static int anInt6051;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "Z")
	private static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()I")
	public static int method5456() {
		@Pc(7) int local7 = aByteArray65[anInt6051] >> anInt6044 & 0x1;
		anInt6044++;
		anInt6051 += anInt6044 >> 3;
		anInt6044 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!aj;I)Lclient!mk;")
	public static Class3_Sub41 method5457(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		if (method5467(arg0)) {
			@Pc(14) byte[] local14 = arg0.method536(arg1);
			return local14 == null ? null : new Class3_Sub41(local14);
		} else {
			arg0.method526(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!aj;II)Lclient!mk;")
	public static Class3_Sub41 method5458(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5467(arg0)) {
			@Pc(16) byte[] local16 = arg0.method517(arg2, arg1);
			return local16 == null ? null : new Class3_Sub41(local16);
		} else {
			arg0.method542(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)F")
	public static float method5461(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I")
	public static int method5464(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6044) {
			local8 = 8 - anInt6044;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray65[anInt6051] >> anInt6044 & local14) << local3;
			anInt6044 = 0;
			anInt6051++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray65[anInt6051] >> anInt6044 & local8) << local3;
			anInt6044 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)V")
	public static void method5465(@OriginalArg(0) byte[] arg0) {
		aByteArray65 = arg0;
		anInt6051 = 0;
		anInt6044 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "([B)V")
	private static void method5466(@OriginalArg(0) byte[] arg0) {
		method5465(arg0);
		anInt6048 = 0x1 << method5464(4);
		anInt6046 = 0x1 << method5464(4);
		aFloatArray32 = new float[anInt6046];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6048 : anInt6046;
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
			local191 = Static673.method9349(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static524.method7317(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray34 = local39;
				aFloatArray38 = local84;
				aFloatArray33 = local136;
				anIntArray527 = local185;
			} else {
				aFloatArray37 = local39;
				aFloatArray31 = local84;
				aFloatArray35 = local136;
				anIntArray528 = local185;
			}
		}
		local24 = method5464(8) + 1;
		aClass389Array1 = new Class389[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass389Array1[local28] = new Class389();
		}
		local32 = method5464(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5464(16);
		}
		@Pc(269) int local269 = method5464(6) + 1;
		aClass229Array1 = new Class229[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass229Array1[local41] = new Class229();
		}
		@Pc(290) int local290 = method5464(6) + 1;
		aClass309Array1 = new Class309[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass309Array1[local86] = new Class309();
		}
		@Pc(311) int local311 = method5464(6) + 1;
		aClass276Array1 = new Class276[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass276Array1[local138] = new Class276();
		}
		@Pc(332) int local332 = method5464(6) + 1;
		aBooleanArray32 = new boolean[local332];
		anIntArray526 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray32[local191] = method5456() != 0;
			method5464(16);
			method5464(16);
			anIntArray526[local191] = method5464(8);
		}
		aBoolean433 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!aj;)Z")
	private static boolean method5467(@OriginalArg(0) Class15 arg0) {
		if (!aBoolean433) {
			@Pc(7) byte[] local7 = arg0.method517(0, 0);
			if (local7 == null) {
				return false;
			}
			method5466(local7);
		}
		return true;
	}
}
