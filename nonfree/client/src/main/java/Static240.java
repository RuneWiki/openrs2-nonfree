import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "[Lclient!kj;")
	public static Class164[] aClass164Array1;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	public static int anInt4649;

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
	private static int anInt4650;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "[Lclient!ki;")
	public static Class163[] aClass163Array1;

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "[F")
	public static float[] aFloatArray39;

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "[F")
	public static float[] aFloatArray40;

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "[F")
	public static float[] aFloatArray41;

	@OriginalMember(owner = "client!jw", name = "D", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!jw", name = "E", descriptor = "[Lclient!nt;")
	public static Class209[] aClass209Array1;

	@OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
	private static int anInt4655;

	@OriginalMember(owner = "client!jw", name = "I", descriptor = "I")
	public static int anInt4657;

	@OriginalMember(owner = "client!jw", name = "J", descriptor = "[F")
	public static float[] aFloatArray42;

	@OriginalMember(owner = "client!jw", name = "L", descriptor = "[Lclient!dt;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!jw", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!jw", name = "N", descriptor = "[F")
	public static float[] aFloatArray44;

	@OriginalMember(owner = "client!jw", name = "A", descriptor = "Z")
	private static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([B)V")
	private static void method4066(@OriginalArg(0) byte[] arg0) {
		method4074(arg0);
		anInt4649 = 0x1 << method4069(4);
		anInt4657 = 0x1 << method4069(4);
		aFloatArray37 = new float[anInt4657];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4649 : anInt4657;
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
			local191 = Static124.method4359(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static381.method7907(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray42 = local39;
				aFloatArray38 = local84;
				aFloatArray40 = local136;
				anIntArray340 = local185;
			} else {
				aFloatArray44 = local39;
				aFloatArray41 = local84;
				aFloatArray39 = local136;
				anIntArray339 = local185;
			}
		}
		local24 = method4069(8) + 1;
		aClass163Array1 = new Class163[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass163Array1[local28] = new Class163();
		}
		local32 = method4069(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4069(16);
		}
		@Pc(269) int local269 = method4069(6) + 1;
		aClass209Array1 = new Class209[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass209Array1[local41] = new Class209();
		}
		@Pc(290) int local290 = method4069(6) + 1;
		aClass66Array1 = new Class66[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass66Array1[local86] = new Class66();
		}
		@Pc(311) int local311 = method4069(6) + 1;
		aClass164Array1 = new Class164[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass164Array1[local138] = new Class164();
		}
		@Pc(332) int local332 = method4069(6) + 1;
		aBooleanArray19 = new boolean[local332];
		anIntArray341 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray19[local191] = method4067() != 0;
			method4069(16);
			method4069(16);
			anIntArray341[local191] = method4069(8);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "()I")
	public static int method4067() {
		@Pc(7) int local7 = aByteArray66[anInt4655] >> anInt4650 & 0x1;
		anInt4650++;
		anInt4655 += anInt4650 >> 3;
		anInt4650 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	public static int method4069(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4650) {
			local8 = 8 - anInt4650;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray66[anInt4655] >> anInt4650 & local14) << local3;
			anInt4650 = 0;
			anInt4655++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray66[anInt4655] >> anInt4650 & local8) << local3;
			anInt4650 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!kda;)Z")
	private static boolean method4071(@OriginalArg(0) Class160 arg0) {
		if (!aBoolean284) {
			@Pc(7) byte[] local7 = arg0.method4198(0, 0);
			if (local7 == null) {
				return false;
			}
			method4066(local7);
			aBoolean284 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!kda;I)Lclient!jw;")
	public static Class1_Sub26 method4072(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1) {
		if (method4071(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4216(arg1);
			return local14 == null ? null : new Class1_Sub26(local14);
		} else {
			arg0.method4213(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([BI)V")
	public static void method4074(@OriginalArg(0) byte[] arg0) {
		aByteArray66 = arg0;
		anInt4655 = 0;
		anInt4650 = 0;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)F")
	public static float method4075(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!kda;II)Lclient!jw;")
	public static Class1_Sub26 method4077(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4071(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4198(arg2, arg1);
			return local16 == null ? null : new Class1_Sub26(local16);
		} else {
			arg0.method4212(arg2, arg1);
			return null;
		}
	}
}
