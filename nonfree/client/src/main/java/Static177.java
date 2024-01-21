import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private static int anInt3723;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	private static int anInt3725;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[B")
	private static byte[] aByteArray39;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "[Lclient!na;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	public static int anInt3728;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "[Lclient!vd;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "[Lclient!bh;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "[Lclient!qb;")
	public static Class81[] aClass81Array1;

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Z")
	private static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
	public static void method2559(@OriginalArg(0) byte[] arg0) {
		aByteArray39 = arg0;
		anInt3725 = 0;
		anInt3723 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	public static int method2560(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3723) {
			local8 = 8 - anInt3723;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray39[anInt3725] >> anInt3723 & local14) << local3;
			anInt3723 = 0;
			anInt3725++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray39[anInt3725] >> anInt3723 & local8) << local3;
			anInt3723 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)F")
	public static float method2561(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!pb;II)Lclient!sc;")
	public static Class2_Sub21 method2566(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2567(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2130(arg1, arg2);
			return local16 == null ? null : new Class2_Sub21(local16);
		} else {
			arg0.method2143(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!pb;)Z")
	private static boolean method2567(@OriginalArg(0) Class71 arg0) {
		if (!aBoolean163) {
			@Pc(7) byte[] local7 = arg0.method2130(0, 0);
			if (local7 == null) {
				return false;
			}
			method2568(local7);
			aBoolean163 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([B)V")
	private static void method2568(@OriginalArg(0) byte[] arg0) {
		method2559(arg0);
		anInt3730 = 0x1 << method2560(4);
		anInt3728 = 0x1 << method2560(4);
		aFloatArray7 = new float[anInt3728];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3730 : anInt3728;
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
			local191 = Static122.method1924(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static113.method1737(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray4 = local84;
				aFloatArray1 = local136;
				anIntArray324 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray2 = local84;
				aFloatArray8 = local136;
				anIntArray326 = local185;
			}
		}
		local24 = method2560(8) + 1;
		aClass14Array1 = new Class14[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass14Array1[local28] = new Class14();
		}
		local32 = method2560(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2560(16);
		}
		@Pc(269) int local269 = method2560(6) + 1;
		aClass103Array1 = new Class103[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass103Array1[local41] = new Class103();
		}
		@Pc(290) int local290 = method2560(6) + 1;
		aClass81Array1 = new Class81[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass81Array1[local86] = new Class81();
		}
		@Pc(311) int local311 = method2560(6) + 1;
		aClass65Array1 = new Class65[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass65Array1[local138] = new Class65();
		}
		@Pc(332) int local332 = method2560(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray325 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method2569() != 0;
			method2560(16);
			method2560(16);
			anIntArray325[local191] = method2560(8);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()I")
	public static int method2569() {
		@Pc(7) int local7 = aByteArray39[anInt3725] >> anInt3723 & 0x1;
		anInt3723++;
		anInt3725 += anInt3723 >> 3;
		anInt3723 &= 0x7;
		return local7;
	}
}
