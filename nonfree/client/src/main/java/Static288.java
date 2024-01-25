import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "[F")
	public static float[] aFloatArray46;

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!kba", name = "p", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
	private static int anInt5496;

	@OriginalMember(owner = "client!kba", name = "r", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!kba", name = "t", descriptor = "[Lclient!waa;")
	public static Class367[] aClass367Array1;

	@OriginalMember(owner = "client!kba", name = "v", descriptor = "[F")
	public static float[] aFloatArray50;

	@OriginalMember(owner = "client!kba", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kba", name = "x", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!kba", name = "y", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!kba", name = "z", descriptor = "I")
	public static int anInt5497;

	@OriginalMember(owner = "client!kba", name = "B", descriptor = "I")
	public static int anInt5499;

	@OriginalMember(owner = "client!kba", name = "C", descriptor = "[Lclient!naa;")
	public static Class230[] aClass230Array1;

	@OriginalMember(owner = "client!kba", name = "E", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!kba", name = "F", descriptor = "[Lclient!dba;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!kba", name = "G", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!kba", name = "J", descriptor = "[Lclient!bfa;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!kba", name = "K", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!kba", name = "L", descriptor = "[B")
	private static byte[] aByteArray45;

	@OriginalMember(owner = "client!kba", name = "N", descriptor = "I")
	private static int anInt5502;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Z")
	private static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!uu;II)Lclient!kba;")
	public static Class3_Sub28 method4661(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4668(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8132(arg1, arg2);
			return local16 == null ? null : new Class3_Sub28(local16);
		} else {
			arg0.method8130(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!uu;I)Lclient!kba;")
	public static Class3_Sub28 method4662(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		if (method4668(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8143(arg1);
			return local14 == null ? null : new Class3_Sub28(local14);
		} else {
			arg0.method8138(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)F")
	public static float method4664(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "()I")
	public static int method4666() {
		@Pc(7) int local7 = aByteArray45[anInt5502] >> anInt5496 & 0x1;
		anInt5496++;
		anInt5502 += anInt5496 >> 3;
		anInt5496 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!uu;)Z")
	private static boolean method4668(@OriginalArg(0) Class343 arg0) {
		if (!aBoolean396) {
			@Pc(7) byte[] local7 = arg0.method8132(0, 0);
			if (local7 == null) {
				return false;
			}
			method4669(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "([B)V")
	private static void method4669(@OriginalArg(0) byte[] arg0) {
		method4670(arg0);
		anInt5499 = 0x1 << method4671(4);
		anInt5497 = 0x1 << method4671(4);
		aFloatArray46 = new float[anInt5497];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5499 : anInt5497;
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
			local191 = Static613.method8376(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static255.method4283(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray52 = local39;
				aFloatArray48 = local84;
				aFloatArray50 = local136;
				anIntArray299 = local185;
			} else {
				aFloatArray51 = local39;
				aFloatArray53 = local84;
				aFloatArray47 = local136;
				anIntArray300 = local185;
			}
		}
		local24 = method4671(8) + 1;
		aClass367Array1 = new Class367[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass367Array1[local28] = new Class367();
		}
		local32 = method4671(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4671(16);
		}
		@Pc(269) int local269 = method4671(6) + 1;
		aClass230Array1 = new Class230[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass230Array1[local41] = new Class230();
		}
		@Pc(290) int local290 = method4671(6) + 1;
		aClass65Array1 = new Class65[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass65Array1[local86] = new Class65();
		}
		@Pc(311) int local311 = method4671(6) + 1;
		aClass30Array1 = new Class30[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass30Array1[local138] = new Class30();
		}
		@Pc(332) int local332 = method4671(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray301 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method4666() != 0;
			method4671(16);
			method4671(16);
			anIntArray301[local191] = method4671(8);
		}
		aBoolean396 = true;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "([BI)V")
	public static void method4670(@OriginalArg(0) byte[] arg0) {
		aByteArray45 = arg0;
		anInt5502 = 0;
		anInt5496 = 0;
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)I")
	public static int method4671(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5496) {
			local8 = 8 - anInt5496;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray45[anInt5502] >> anInt5496 & local14) << local3;
			anInt5496 = 0;
			anInt5502++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray45[anInt5502] >> anInt5496 & local8) << local3;
			anInt5496 += arg0;
		}
		return local1;
	}
}
