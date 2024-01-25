import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	public static int anInt4026;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
	public static int[] anIntArray798;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[Lclient!pl;")
	public static Class192[] aClass192Array1;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "[I")
	public static int[] anIntArray799;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	private static int anInt4028;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "[I")
	public static int[] anIntArray800;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
	private static int anInt4032;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "[Lclient!hc;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "[B")
	private static byte[] aByteArray69;

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "[Lclient!dq;")
	public static Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ng", name = "S", descriptor = "[Lclient!wf;")
	public static Class244[] aClass244Array1;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
	public static int anInt4034;

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "Z")
	private static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
	public static int method3704(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4032) {
			local8 = 8 - anInt4032;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray69[anInt4028] >> anInt4032 & local14) << local3;
			anInt4032 = 0;
			anInt4028++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray69[anInt4028] >> anInt4032 & local8) << local3;
			anInt4032 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([B)V")
	private static void method3705(@OriginalArg(0) byte[] arg0) {
		method3706(arg0);
		anInt4034 = 0x1 << method3704(4);
		anInt4026 = 0x1 << method3704(4);
		aFloatArray24 = new float[anInt4026];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4034 : anInt4026;
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
			local191 = Static195.method3315(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static307.method4498(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray19 = local84;
				aFloatArray25 = local136;
				anIntArray799 = local185;
			} else {
				aFloatArray22 = local39;
				aFloatArray21 = local84;
				aFloatArray20 = local136;
				anIntArray798 = local185;
			}
		}
		local24 = method3704(8) + 1;
		aClass90Array1 = new Class90[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass90Array1[local28] = new Class90();
		}
		local32 = method3704(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3704(16);
		}
		@Pc(269) int local269 = method3704(6) + 1;
		aClass192Array1 = new Class192[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass192Array1[local41] = new Class192();
		}
		@Pc(290) int local290 = method3704(6) + 1;
		aClass244Array1 = new Class244[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass244Array1[local86] = new Class244();
		}
		@Pc(311) int local311 = method3704(6) + 1;
		aClass52Array1 = new Class52[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass52Array1[local138] = new Class52();
		}
		@Pc(332) int local332 = method3704(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray800 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method3710() != 0;
			method3704(16);
			method3704(16);
			anIntArray800[local191] = method3704(8);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([BI)V")
	public static void method3706(@OriginalArg(0) byte[] arg0) {
		aByteArray69 = arg0;
		anInt4028 = 0;
		anInt4032 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!nl;II)Lclient!ng;")
	public static Class2_Sub30 method3708(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3709(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3745(arg1, arg2);
			return local16 == null ? null : new Class2_Sub30(local16);
		} else {
			arg0.method3761(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!nl;)Z")
	private static boolean method3709(@OriginalArg(0) Class171 arg0) {
		if (!aBoolean304) {
			@Pc(7) byte[] local7 = arg0.method3745(0, 0);
			if (local7 == null) {
				return false;
			}
			method3705(local7);
			aBoolean304 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()I")
	public static int method3710() {
		@Pc(7) int local7 = aByteArray69[anInt4028] >> anInt4032 & 0x1;
		anInt4032++;
		anInt4028 += anInt4032 >> 3;
		anInt4032 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)F")
	public static float method3714(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
