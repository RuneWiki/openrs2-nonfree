import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt3675;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[Lclient!hi;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	private static int anInt3676;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "[Lclient!sm;")
	public static Class185[] aClass185Array1;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "[Lclient!in;")
	public static Class105[] aClass105Array1;

	@OriginalMember(owner = "client!la", name = "D", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	private static int anInt3683;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	public static int anInt3684;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "[Lclient!bq;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
	private static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!rk;)Z")
	private static boolean method3319(@OriginalArg(0) Class180 arg0) {
		if (!aBoolean278) {
			@Pc(7) byte[] local7 = arg0.method4560(0, 0);
			if (local7 == null) {
				return false;
			}
			method3328(local7);
			aBoolean278 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
	public static int method3320() {
		@Pc(7) int local7 = aByteArray53[anInt3683] >> anInt3676 & 0x1;
		anInt3676++;
		anInt3683 += anInt3676 >> 3;
		anInt3676 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V")
	public static void method3322(@OriginalArg(0) byte[] arg0) {
		aByteArray53 = arg0;
		anInt3683 = 0;
		anInt3676 = 0;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)F")
	public static float method3324(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I")
	public static int method3325(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3676) {
			local8 = 8 - anInt3676;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray53[anInt3683] >> anInt3676 & local14) << local3;
			anInt3676 = 0;
			anInt3683++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray53[anInt3683] >> anInt3676 & local8) << local3;
			anInt3676 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!rk;II)Lclient!la;")
	public static Class7_Sub22 method3326(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3319(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4560(arg2, arg1);
			return local16 == null ? null : new Class7_Sub22(local16);
		} else {
			arg0.method4555(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "([B)V")
	private static void method3328(@OriginalArg(0) byte[] arg0) {
		method3322(arg0);
		anInt3684 = 0x1 << method3325(4);
		anInt3675 = 0x1 << method3325(4);
		aFloatArray19 = new float[anInt3675];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3684 : anInt3675;
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
			local191 = Static296.method5035(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static338.method5382(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray20 = local84;
				aFloatArray17 = local136;
				anIntArray498 = local185;
			} else {
				aFloatArray21 = local39;
				aFloatArray22 = local84;
				aFloatArray24 = local136;
				anIntArray499 = local185;
			}
		}
		local24 = method3325(8) + 1;
		aClass91Array1 = new Class91[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass91Array1[local28] = new Class91();
		}
		local32 = method3325(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3325(16);
		}
		@Pc(269) int local269 = method3325(6) + 1;
		aClass105Array1 = new Class105[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass105Array1[local41] = new Class105();
		}
		@Pc(290) int local290 = method3325(6) + 1;
		aClass32Array1 = new Class32[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass32Array1[local86] = new Class32();
		}
		@Pc(311) int local311 = method3325(6) + 1;
		aClass185Array1 = new Class185[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass185Array1[local138] = new Class185();
		}
		@Pc(332) int local332 = method3325(6) + 1;
		aBooleanArray19 = new boolean[local332];
		anIntArray500 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray19[local191] = method3320() != 0;
			method3325(16);
			method3325(16);
			anIntArray500[local191] = method3325(8);
		}
	}
}
