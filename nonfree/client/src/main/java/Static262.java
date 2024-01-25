import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!na", name = "i", descriptor = "[B")
	private static byte[] aByteArray49;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int anInt4285;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[Lclient!jr;")
	public static Class130[] aClass130Array1;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[Lclient!wa;")
	public static Class262[] aClass262Array1;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public static int anInt4288;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "I")
	private static int anInt4289;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[Lclient!bt;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[Lclient!fo;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	private static int anInt4292;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
	private static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BI)V")
	public static void method3509(@OriginalArg(0) byte[] arg0) {
		aByteArray49 = arg0;
		anInt4292 = 0;
		anInt4289 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dk;)Z")
	private static boolean method3510(@OriginalArg(0) Class54 arg0) {
		if (!aBoolean309) {
			@Pc(7) byte[] local7 = arg0.method1126(0, 0);
			if (local7 == null) {
				return false;
			}
			method3515(local7);
			aBoolean309 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "([B)V")
	private static void method3515(@OriginalArg(0) byte[] arg0) {
		method3509(arg0);
		anInt4288 = 0x1 << method3516(4);
		anInt4285 = 0x1 << method3516(4);
		aFloatArray22 = new float[anInt4285];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4288 : anInt4285;
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
			local191 = Static43.method647(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static61.method904(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray20 = local39;
				aFloatArray21 = local84;
				aFloatArray23 = local136;
				anIntArray367 = local185;
			} else {
				aFloatArray17 = local39;
				aFloatArray18 = local84;
				aFloatArray19 = local136;
				anIntArray365 = local185;
			}
		}
		local24 = method3516(8) + 1;
		aClass80Array1 = new Class80[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass80Array1[local28] = new Class80();
		}
		local32 = method3516(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3516(16);
		}
		@Pc(269) int local269 = method3516(6) + 1;
		aClass130Array1 = new Class130[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass130Array1[local41] = new Class130();
		}
		@Pc(290) int local290 = method3516(6) + 1;
		aClass28Array1 = new Class28[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass28Array1[local86] = new Class28();
		}
		@Pc(311) int local311 = method3516(6) + 1;
		aClass262Array1 = new Class262[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass262Array1[local138] = new Class262();
		}
		@Pc(332) int local332 = method3516(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray366 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method3517() != 0;
			method3516(16);
			method3516(16);
			anIntArray366[local191] = method3516(8);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
	public static int method3516(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4289) {
			local8 = 8 - anInt4289;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray49[anInt4292] >> anInt4289 & local14) << local3;
			anInt4289 = 0;
			anInt4292++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray49[anInt4292] >> anInt4289 & local8) << local3;
			anInt4289 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	public static int method3517() {
		@Pc(7) int local7 = aByteArray49[anInt4292] >> anInt4289 & 0x1;
		anInt4289++;
		anInt4292 += anInt4289 >> 3;
		anInt4289 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dk;I)Lclient!na;")
	public static Class2_Sub31 method3518(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1) {
		if (method3510(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1110(arg1);
			return local14 == null ? null : new Class2_Sub31(local14);
		} else {
			arg0.method1131(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dk;II)Lclient!na;")
	public static Class2_Sub31 method3519(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3510(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1126(arg1, arg2);
			return local16 == null ? null : new Class2_Sub31(local16);
		} else {
			arg0.method1112(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)F")
	public static float method3520(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
