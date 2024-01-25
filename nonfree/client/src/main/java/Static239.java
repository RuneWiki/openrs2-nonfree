import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[Lclient!eo;")
	public static Class84[] aClass84Array1;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	private static int anInt4791;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	private static int anInt4792;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "[B")
	private static byte[] aByteArray70;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "[Lclient!hm;")
	public static Class124[] aClass124Array1;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[Lclient!nr;")
	public static Class209[] aClass209Array1;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
	public static int anInt4797;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public static int anInt4798;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "[Lclient!us;")
	public static Class295[] aClass295Array1;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Z")
	private static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kr;)Z")
	private static boolean method4137(@OriginalArg(0) Class171 arg0) {
		if (!aBoolean339) {
			@Pc(7) byte[] local7 = arg0.method4339(0, 0);
			if (local7 == null) {
				return false;
			}
			method4145(local7);
			aBoolean339 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)F")
	public static float method4138(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kr;II)Lclient!ka;")
	public static Class1_Sub27 method4139(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4137(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4339(arg1, arg2);
			return local16 == null ? null : new Class1_Sub27(local16);
		} else {
			arg0.method4336(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kr;I)Lclient!ka;")
	public static Class1_Sub27 method4141(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		if (method4137(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4361(arg1);
			return local14 == null ? null : new Class1_Sub27(local14);
		} else {
			arg0.method4327(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
	public static int method4142(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4791) {
			local8 = 8 - anInt4791;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray70[anInt4792] >> anInt4791 & local14) << local3;
			anInt4791 = 0;
			anInt4792++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray70[anInt4792] >> anInt4791 & local8) << local3;
			anInt4791 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)V")
	public static void method4144(@OriginalArg(0) byte[] arg0) {
		aByteArray70 = arg0;
		anInt4792 = 0;
		anInt4791 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
	private static void method4145(@OriginalArg(0) byte[] arg0) {
		method4144(arg0);
		anInt4797 = 0x1 << method4142(4);
		anInt4798 = 0x1 << method4142(4);
		aFloatArray32 = new float[anInt4798];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4797 : anInt4798;
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
			local191 = Static515.method7051(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static282.method6469(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray30 = local39;
				aFloatArray27 = local84;
				aFloatArray34 = local136;
				anIntArray462 = local185;
			} else {
				aFloatArray29 = local39;
				aFloatArray31 = local84;
				aFloatArray33 = local136;
				anIntArray463 = local185;
			}
		}
		local24 = method4142(8) + 1;
		aClass124Array1 = new Class124[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass124Array1[local28] = new Class124();
		}
		local32 = method4142(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4142(16);
		}
		@Pc(269) int local269 = method4142(6) + 1;
		aClass84Array1 = new Class84[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass84Array1[local41] = new Class84();
		}
		@Pc(290) int local290 = method4142(6) + 1;
		aClass295Array1 = new Class295[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass295Array1[local86] = new Class295();
		}
		@Pc(311) int local311 = method4142(6) + 1;
		aClass209Array1 = new Class209[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass209Array1[local138] = new Class209();
		}
		@Pc(332) int local332 = method4142(6) + 1;
		aBooleanArray30 = new boolean[local332];
		anIntArray461 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray30[local191] = method4146() != 0;
			method4142(16);
			method4142(16);
			anIntArray461[local191] = method4142(8);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()I")
	public static int method4146() {
		@Pc(7) int local7 = aByteArray70[anInt4792] >> anInt4791 & 0x1;
		anInt4791++;
		anInt4792 += anInt4791 >> 3;
		anInt4791 &= 0x7;
		return local7;
	}
}
