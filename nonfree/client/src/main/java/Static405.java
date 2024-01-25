import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "[B")
	private static byte[] aByteArray74;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "[Lclient!tm;")
	public static Class315[] aClass315Array1;

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
	public static int anInt6952;

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!pga", name = "y", descriptor = "[Lclient!pq;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!pga", name = "z", descriptor = "I")
	private static int anInt6955;

	@OriginalMember(owner = "client!pga", name = "C", descriptor = "[Lclient!ol;")
	public static Class241[] aClass241Array1;

	@OriginalMember(owner = "client!pga", name = "F", descriptor = "[Lclient!cp;")
	public static Class55[] aClass55Array1;

	@OriginalMember(owner = "client!pga", name = "G", descriptor = "I")
	private static int anInt6959;

	@OriginalMember(owner = "client!pga", name = "H", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!pga", name = "I", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!pga", name = "J", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!pga", name = "M", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!pga", name = "P", descriptor = "I")
	public static int anInt6962;

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "Z")
	private static boolean aBoolean501 = false;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([B)V")
	private static void method5712(@OriginalArg(0) byte[] arg0) {
		method5720(arg0);
		anInt6952 = 0x1 << method5714(4);
		anInt6962 = 0x1 << method5714(4);
		aFloatArray52 = new float[anInt6962];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6952 : anInt6962;
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
			local191 = Static267.method4195(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static68.method1442(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray54 = local39;
				aFloatArray49 = local84;
				aFloatArray53 = local136;
				anIntArray476 = local185;
			} else {
				aFloatArray48 = local39;
				aFloatArray55 = local84;
				aFloatArray51 = local136;
				anIntArray478 = local185;
			}
		}
		local24 = method5714(8) + 1;
		aClass261Array1 = new Class261[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass261Array1[local28] = new Class261();
		}
		local32 = method5714(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5714(16);
		}
		@Pc(269) int local269 = method5714(6) + 1;
		aClass241Array1 = new Class241[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass241Array1[local41] = new Class241();
		}
		@Pc(290) int local290 = method5714(6) + 1;
		aClass315Array1 = new Class315[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass315Array1[local86] = new Class315();
		}
		@Pc(311) int local311 = method5714(6) + 1;
		aClass55Array1 = new Class55[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass55Array1[local138] = new Class55();
		}
		@Pc(332) int local332 = method5714(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray477 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method5722() != 0;
			method5714(16);
			method5714(16);
			anIntArray477[local191] = method5714(8);
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)I")
	public static int method5714(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6959) {
			local8 = 8 - anInt6959;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray74[anInt6955] >> anInt6959 & local14) << local3;
			anInt6959 = 0;
			anInt6955++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray74[anInt6955] >> anInt6959 & local8) << local3;
			anInt6959 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ga;I)Lclient!pga;")
	public static Class1_Sub38 method5716(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1) {
		if (method5718(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2449(arg1);
			return local14 == null ? null : new Class1_Sub38(local14);
		} else {
			arg0.method2434(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)F")
	public static float method5717(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ga;)Z")
	private static boolean method5718(@OriginalArg(0) Class111 arg0) {
		if (!aBoolean501) {
			@Pc(7) byte[] local7 = arg0.method2441(0, 0);
			if (local7 == null) {
				return false;
			}
			method5712(local7);
			aBoolean501 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([BI)V")
	public static void method5720(@OriginalArg(0) byte[] arg0) {
		aByteArray74 = arg0;
		anInt6955 = 0;
		anInt6959 = 0;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "()I")
	public static int method5722() {
		@Pc(7) int local7 = aByteArray74[anInt6955] >> anInt6959 & 0x1;
		anInt6959++;
		anInt6955 += anInt6959 >> 3;
		anInt6959 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ga;II)Lclient!pga;")
	public static Class1_Sub38 method5723(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5718(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2441(arg2, arg1);
			return local16 == null ? null : new Class1_Sub38(local16);
		} else {
			arg0.method2465(arg2, arg1);
			return null;
		}
	}
}
