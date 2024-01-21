import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private static int anInt553;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "[Lclient!db;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "[Lclient!of;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "[Lclient!na;")
	public static Class62[] aClass62Array1;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "[Lclient!t;")
	public static Class93[] aClass93Array1;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	public static int anInt559;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private static int anInt560;

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Z")
	private static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!eh;)Z")
	private static boolean method396(@OriginalArg(0) Class28 arg0) {
		if (!aBoolean31) {
			@Pc(7) byte[] local7 = arg0.method852(0, 0);
			if (local7 == null) {
				return false;
			}
			method397(local7);
			aBoolean31 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([B)V")
	private static void method397(@OriginalArg(0) byte[] arg0) {
		method398(arg0);
		anInt558 = 0x1 << method401(4);
		anInt559 = 0x1 << method401(4);
		aFloatArray6 = new float[anInt559];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt558 : anInt559;
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
			local191 = Static27.method1106(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static112.method1582(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray8 = local84;
				aFloatArray2 = local136;
				anIntArray33 = local185;
			} else {
				aFloatArray1 = local39;
				aFloatArray3 = local84;
				aFloatArray7 = local136;
				anIntArray32 = local185;
			}
		}
		local24 = method401(8) + 1;
		aClass18Array1 = new Class18[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass18Array1[local28] = new Class18();
		}
		local32 = method401(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method401(16);
		}
		@Pc(269) int local269 = method401(6) + 1;
		aClass93Array1 = new Class93[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass93Array1[local41] = new Class93();
		}
		@Pc(290) int local290 = method401(6) + 1;
		aClass72Array1 = new Class72[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass72Array1[local86] = new Class72();
		}
		@Pc(311) int local311 = method401(6) + 1;
		aClass62Array1 = new Class62[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass62Array1[local138] = new Class62();
		}
		@Pc(332) int local332 = method401(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray31 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method403() != 0;
			method401(16);
			method401(16);
			anIntArray31[local191] = method401(8);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI)V")
	public static void method398(@OriginalArg(0) byte[] arg0) {
		aByteArray3 = arg0;
		anInt553 = 0;
		anInt560 = 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!eh;II)Lclient!bi;")
	public static Class2_Sub5 method399(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method396(arg0)) {
			@Pc(16) byte[] local16 = arg0.method852(arg2, arg1);
			return local16 == null ? null : new Class2_Sub5(local16);
		} else {
			arg0.method872(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
	public static int method401(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt560) {
			local8 = 8 - anInt560;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray3[anInt553] >> anInt560 & local14) << local3;
			anInt560 = 0;
			anInt553++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray3[anInt553] >> anInt560 & local8) << local3;
			anInt560 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
	public static int method403() {
		@Pc(7) int local7 = aByteArray3[anInt553] >> anInt560 & 0x1;
		anInt560++;
		anInt553 += anInt560 >> 3;
		anInt560 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)F")
	public static float method405(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
