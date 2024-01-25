import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[B")
	private static byte[] aByteArray118;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "[I")
	public static int[] anIntArray681;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	private static int anInt9035;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "[Lclient!tj;")
	public static Class304[] aClass304Array1;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[Lclient!qq;")
	public static Class264[] aClass264Array1;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "[F")
	public static float[] aFloatArray64;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
	public static int[] anIntArray682;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray47;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[Lclient!ip;")
	public static Class149[] aClass149Array1;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "[F")
	public static float[] aFloatArray68;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
	public static int[] anIntArray683;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "[F")
	public static float[] aFloatArray69;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "[Lclient!sc;")
	public static Class289[] aClass289Array1;

	@OriginalMember(owner = "client!va", name = "H", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	public static int anInt9040;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	public static int anInt9043;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
	private static int anInt9044;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
	private static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!pq;I)Lclient!va;")
	public static Class6_Sub50 method7391(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1) {
		if (method7400(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5855(arg1);
			return local14 == null ? null : new Class6_Sub50(local14);
		} else {
			arg0.method5859(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
	public static int method7392(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9044) {
			local8 = 8 - anInt9044;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray118[anInt9035] >> anInt9044 & local14) << local3;
			anInt9044 = 0;
			anInt9035++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray118[anInt9035] >> anInt9044 & local8) << local3;
			anInt9044 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([B)V")
	private static void method7393(@OriginalArg(0) byte[] arg0) {
		method7401(arg0);
		anInt9043 = 0x1 << method7392(4);
		anInt9040 = 0x1 << method7392(4);
		aFloatArray71 = new float[anInt9040];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9043 : anInt9040;
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
			local191 = Static154.method2268(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static264.method3733(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray70 = local39;
				aFloatArray66 = local84;
				aFloatArray65 = local136;
				anIntArray683 = local185;
			} else {
				aFloatArray64 = local39;
				aFloatArray69 = local84;
				aFloatArray68 = local136;
				anIntArray681 = local185;
			}
		}
		local24 = method7392(8) + 1;
		aClass149Array1 = new Class149[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass149Array1[local28] = new Class149();
		}
		local32 = method7392(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7392(16);
		}
		@Pc(269) int local269 = method7392(6) + 1;
		aClass264Array1 = new Class264[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass264Array1[local41] = new Class264();
		}
		@Pc(290) int local290 = method7392(6) + 1;
		aClass304Array1 = new Class304[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass304Array1[local86] = new Class304();
		}
		@Pc(311) int local311 = method7392(6) + 1;
		aClass289Array1 = new Class289[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass289Array1[local138] = new Class289();
		}
		@Pc(332) int local332 = method7392(6) + 1;
		aBooleanArray47 = new boolean[local332];
		anIntArray682 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray47[local191] = method7397() != 0;
			method7392(16);
			method7392(16);
			anIntArray682[local191] = method7392(8);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!pq;II)Lclient!va;")
	public static Class6_Sub50 method7395(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7400(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5860(arg1, arg2);
			return local16 == null ? null : new Class6_Sub50(local16);
		} else {
			arg0.method5854(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
	public static int method7397() {
		@Pc(7) int local7 = aByteArray118[anInt9035] >> anInt9044 & 0x1;
		anInt9044++;
		anInt9035 += anInt9044 >> 3;
		anInt9044 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)F")
	public static float method7399(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!pq;)Z")
	private static boolean method7400(@OriginalArg(0) Class251 arg0) {
		if (!aBoolean637) {
			@Pc(7) byte[] local7 = arg0.method5860(0, 0);
			if (local7 == null) {
				return false;
			}
			method7393(local7);
			aBoolean637 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)V")
	public static void method7401(@OriginalArg(0) byte[] arg0) {
		aByteArray118 = arg0;
		anInt9035 = 0;
		anInt9044 = 0;
	}
}
