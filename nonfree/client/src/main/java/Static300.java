import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public static int anInt6047;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "[Lclient!dc;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public static int anInt6048;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "[Lclient!pk;")
	public static Class157[] aClass157Array1;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	private static int anInt6051;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[Lclient!ci;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "[Lclient!jl;")
	public static Class104[] aClass104Array1;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	private static int anInt6053;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "[B")
	private static byte[] aByteArray87;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Z")
	private static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!am;)Z")
	private static boolean method5077(@OriginalArg(0) Class11 arg0) {
		if (!aBoolean530) {
			@Pc(7) byte[] local7 = arg0.method288(0, 0);
			if (local7 == null) {
				return false;
			}
			method5086(local7);
			aBoolean530 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!am;II)Lclient!tb;")
	public static Class4_Sub38 method5078(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5077(arg0)) {
			@Pc(16) byte[] local16 = arg0.method288(arg2, arg1);
			return local16 == null ? null : new Class4_Sub38(local16);
		} else {
			arg0.method276(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)F")
	public static float method5081(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)I")
	public static int method5083(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6053) {
			local8 = 8 - anInt6053;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray87[anInt6051] >> anInt6053 & local14) << local3;
			anInt6053 = 0;
			anInt6051++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray87[anInt6051] >> anInt6053 & local8) << local3;
			anInt6053 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
	public static int method5084() {
		@Pc(7) int local7 = aByteArray87[anInt6051] >> anInt6053 & 0x1;
		anInt6053++;
		anInt6051 += anInt6053 >> 3;
		anInt6053 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)V")
	public static void method5085(@OriginalArg(0) byte[] arg0) {
		aByteArray87 = arg0;
		anInt6051 = 0;
		anInt6053 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([B)V")
	private static void method5086(@OriginalArg(0) byte[] arg0) {
		method5085(arg0);
		anInt6047 = 0x1 << method5083(4);
		anInt6048 = 0x1 << method5083(4);
		aFloatArray26 = new float[anInt6048];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6047 : anInt6048;
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
			local191 = Static244.method4232(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static338.method4471(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray21 = local84;
				aFloatArray24 = local136;
				anIntArray494 = local185;
			} else {
				aFloatArray22 = local39;
				aFloatArray20 = local84;
				aFloatArray25 = local136;
				anIntArray495 = local185;
			}
		}
		local24 = method5083(8) + 1;
		aClass44Array1 = new Class44[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass44Array1[local28] = new Class44();
		}
		local32 = method5083(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5083(16);
		}
		@Pc(269) int local269 = method5083(6) + 1;
		aClass37Array1 = new Class37[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass37Array1[local41] = new Class37();
		}
		@Pc(290) int local290 = method5083(6) + 1;
		aClass104Array1 = new Class104[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass104Array1[local86] = new Class104();
		}
		@Pc(311) int local311 = method5083(6) + 1;
		aClass157Array1 = new Class157[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass157Array1[local138] = new Class157();
		}
		@Pc(332) int local332 = method5083(6) + 1;
		aBooleanArray29 = new boolean[local332];
		anIntArray496 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray29[local191] = method5084() != 0;
			method5083(16);
			method5083(16);
			anIntArray496[local191] = method5083(8);
		}
	}
}
