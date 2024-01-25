import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	private static int anInt5106;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	public static int anInt5108;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "[Lclient!g;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	private static int anInt5110;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "[Lclient!pn;")
	public static Class199[] aClass199Array1;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "[Lclient!b;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "[I")
	public static int[] anIntArray413;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "[Lclient!bp;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
	public static int anInt5114;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!pu", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!pu", name = "L", descriptor = "Z")
	private static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!qn;II)Lclient!pu;")
	public static Class4_Sub35 method4091(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4094(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4377(arg1, arg2);
			return local16 == null ? null : new Class4_Sub35(local16);
		} else {
			arg0.method4367(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!qn;I)Lclient!pu;")
	public static Class4_Sub35 method4092(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1) {
		if (method4094(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4353(arg1);
			return local14 == null ? null : new Class4_Sub35(local14);
		} else {
			arg0.method4382(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([BI)V")
	public static void method4093(@OriginalArg(0) byte[] arg0) {
		aByteArray66 = arg0;
		anInt5106 = 0;
		anInt5110 = 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!qn;)Z")
	private static boolean method4094(@OriginalArg(0) Class211 arg0) {
		if (!aBoolean368) {
			@Pc(7) byte[] local7 = arg0.method4377(0, 0);
			if (local7 == null) {
				return false;
			}
			method4099(local7);
			aBoolean368 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "()I")
	public static int method4097() {
		@Pc(7) int local7 = aByteArray66[anInt5106] >> anInt5110 & 0x1;
		anInt5110++;
		anInt5106 += anInt5110 >> 3;
		anInt5110 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)F")
	public static float method4098(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([B)V")
	private static void method4099(@OriginalArg(0) byte[] arg0) {
		method4093(arg0);
		anInt5114 = 0x1 << method4101(4);
		anInt5108 = 0x1 << method4101(4);
		aFloatArray16 = new float[anInt5108];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5114 : anInt5108;
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
			local191 = Static281.method3698(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static412.method5609(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray17 = local39;
				aFloatArray20 = local84;
				aFloatArray22 = local136;
				anIntArray412 = local185;
			} else {
				aFloatArray23 = local39;
				aFloatArray18 = local84;
				aFloatArray19 = local136;
				anIntArray413 = local185;
			}
		}
		local24 = method4101(8) + 1;
		aClass199Array1 = new Class199[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass199Array1[local28] = new Class199();
		}
		local32 = method4101(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4101(16);
		}
		@Pc(269) int local269 = method4101(6) + 1;
		aClass91Array1 = new Class91[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass91Array1[local41] = new Class91();
		}
		@Pc(290) int local290 = method4101(6) + 1;
		aClass29Array1 = new Class29[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass29Array1[local86] = new Class29();
		}
		@Pc(311) int local311 = method4101(6) + 1;
		aClass18Array1 = new Class18[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass18Array1[local138] = new Class18();
		}
		@Pc(332) int local332 = method4101(6) + 1;
		aBooleanArray25 = new boolean[local332];
		anIntArray414 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray25[local191] = method4097() != 0;
			method4101(16);
			method4101(16);
			anIntArray414[local191] = method4101(8);
		}
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)I")
	public static int method4101(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5110) {
			local8 = 8 - anInt5110;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray66[anInt5106] >> anInt5110 & local14) << local3;
			anInt5110 = 0;
			anInt5106++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray66[anInt5106] >> anInt5110 & local8) << local3;
			anInt5110 += arg0;
		}
		return local1;
	}
}
