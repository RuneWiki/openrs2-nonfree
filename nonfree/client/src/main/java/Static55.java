import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "[Lclient!vd;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[Lclient!eb;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt1313;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[Lclient!ra;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	private static int anInt1319;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "[Lclient!cg;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	private static int anInt1321;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "[B")
	private static byte[] aByteArray5;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "Z")
	private static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public static int method976(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1319) {
			local8 = 8 - anInt1319;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray5[anInt1321] >> anInt1319 & local14) << local3;
			anInt1319 = 0;
			anInt1321++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray5[anInt1321] >> anInt1319 & local8) << local3;
			anInt1319 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!vb;)Z")
	private static boolean method979(@OriginalArg(0) Class82 arg0) {
		if (!aBoolean56) {
			@Pc(7) byte[] local7 = arg0.method2942(0, 0);
			if (local7 == null) {
				return false;
			}
			method983(local7);
			aBoolean56 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public static void method980() {
		aByteArray5 = null;
		aClass10Array1 = null;
		aClass17Array1 = null;
		aClass74Array1 = null;
		aClass86Array1 = null;
		aBooleanArray6 = null;
		anIntArray112 = null;
		aFloatArray9 = null;
		aFloatArray7 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray3 = null;
		aFloatArray2 = null;
		aFloatArray4 = null;
		anIntArray113 = null;
		anIntArray111 = null;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)F")
	public static float method981(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!vb;II)Lclient!ga;")
	public static Class1_Sub14 method982(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method979(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2942(arg2, arg1);
			return local16 == null ? null : new Class1_Sub14(local16);
		} else {
			arg0.method2944(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([B)V")
	private static void method983(@OriginalArg(0) byte[] arg0) {
		method985(arg0);
		anInt1313 = 0x1 << method976(4);
		anInt1317 = 0x1 << method976(4);
		aFloatArray9 = new float[anInt1317];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1313 : anInt1317;
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
			local191 = Static136.method2283(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static177.method3060(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray5 = local84;
				aFloatArray8 = local136;
				anIntArray113 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray2 = local84;
				aFloatArray4 = local136;
				anIntArray111 = local185;
			}
		}
		local24 = method976(8) + 1;
		aClass10Array1 = new Class10[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass10Array1[local28] = new Class10();
		}
		local32 = method976(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method976(16);
		}
		@Pc(269) int local269 = method976(6) + 1;
		aClass17Array1 = new Class17[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass17Array1[local41] = new Class17();
		}
		@Pc(290) int local290 = method976(6) + 1;
		aClass74Array1 = new Class74[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass74Array1[local86] = new Class74();
		}
		@Pc(311) int local311 = method976(6) + 1;
		aClass86Array1 = new Class86[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass86Array1[local138] = new Class86();
		}
		@Pc(332) int local332 = method976(6) + 1;
		aBooleanArray6 = new boolean[local332];
		anIntArray112 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray6[local191] = method986() != 0;
			method976(16);
			method976(16);
			anIntArray112[local191] = method976(8);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V")
	public static void method985(@OriginalArg(0) byte[] arg0) {
		aByteArray5 = arg0;
		anInt1321 = 0;
		anInt1319 = 0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()I")
	public static int method986() {
		@Pc(7) int local7 = aByteArray5[anInt1321] >> anInt1319 & 0x1;
		anInt1319++;
		anInt1321 += anInt1319 >> 3;
		anInt1319 &= 0x7;
		return local7;
	}
}
