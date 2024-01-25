import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public static int anInt4313;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "[Lclient!qj;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	private static int anInt4315;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	private static int anInt4316;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "[Lclient!ei;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "[Lclient!am;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "[I")
	public static int[] anIntArray396;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "[B")
	private static byte[] aByteArray70;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "[Lclient!dn;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
	private static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)F")
	public static float method3854(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "([B)V")
	private static void method3855(@OriginalArg(0) byte[] arg0) {
		method3859(arg0);
		anInt4317 = 0x1 << method3860(4);
		anInt4313 = 0x1 << method3860(4);
		aFloatArray22 = new float[anInt4313];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4317 : anInt4313;
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
			local191 = Static329.method5340(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static135.method2756(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray27 = local39;
				aFloatArray21 = local84;
				aFloatArray25 = local136;
				anIntArray394 = local185;
			} else {
				aFloatArray20 = local39;
				aFloatArray24 = local84;
				aFloatArray26 = local136;
				anIntArray395 = local185;
			}
		}
		local24 = method3860(8) + 1;
		aClass44Array1 = new Class44[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass44Array1[local28] = new Class44();
		}
		local32 = method3860(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3860(16);
		}
		@Pc(269) int local269 = method3860(6) + 1;
		aClass10Array1 = new Class10[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass10Array1[local41] = new Class10();
		}
		@Pc(290) int local290 = method3860(6) + 1;
		aClass56Array1 = new Class56[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass56Array1[local86] = new Class56();
		}
		@Pc(311) int local311 = method3860(6) + 1;
		aClass170Array1 = new Class170[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass170Array1[local138] = new Class170();
		}
		@Pc(332) int local332 = method3860(6) + 1;
		aBooleanArray21 = new boolean[local332];
		anIntArray396 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray21[local191] = method3858() != 0;
			method3860(16);
			method3860(16);
			anIntArray396[local191] = method3860(8);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!wo;)Z")
	private static boolean method3857(@OriginalArg(0) Class216 arg0) {
		if (!aBoolean411) {
			@Pc(7) byte[] local7 = arg0.method5648(0, 0);
			if (local7 == null) {
				return false;
			}
			method3855(local7);
			aBoolean411 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
	public static int method3858() {
		@Pc(7) int local7 = aByteArray70[anInt4315] >> anInt4316 & 0x1;
		anInt4316++;
		anInt4315 += anInt4316 >> 3;
		anInt4316 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
	public static void method3859(@OriginalArg(0) byte[] arg0) {
		aByteArray70 = arg0;
		anInt4315 = 0;
		anInt4316 = 0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)I")
	public static int method3860(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4316) {
			local8 = 8 - anInt4316;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray70[anInt4315] >> anInt4316 & local14) << local3;
			anInt4316 = 0;
			anInt4315++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray70[anInt4315] >> anInt4316 & local8) << local3;
			anInt4316 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!wo;II)Lclient!nf;")
	public static Class1_Sub26 method3863(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3857(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5648(arg1, arg2);
			return local16 == null ? null : new Class1_Sub26(local16);
		} else {
			arg0.method5657(arg2, arg1);
			return null;
		}
	}
}
