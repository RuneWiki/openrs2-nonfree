import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	public static int anInt2465;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "[Lclient!wf;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "[B")
	private static byte[] aByteArray40;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "[Lclient!jd;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	private static int anInt2466;

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "[Lclient!cd;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "[Lclient!l;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	private static int anInt2468;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Z")
	private static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	public static int method1720() {
		@Pc(7) int local7 = aByteArray40[anInt2466] >> anInt2468 & 0x1;
		anInt2468++;
		anInt2466 += anInt2468 >> 3;
		anInt2468 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
	public static void method1721() {
		aByteArray40 = null;
		aClass44Array1 = null;
		aClass83Array1 = null;
		aClass13Array1 = null;
		aClass39Array1 = null;
		aBooleanArray14 = null;
		anIntArray318 = null;
		aFloatArray8 = null;
		aFloatArray4 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray1 = null;
		aFloatArray2 = null;
		anIntArray320 = null;
		anIntArray319 = null;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)F")
	public static float method1722(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
	private static void method1723(@OriginalArg(0) byte[] arg0) {
		method1724(arg0);
		anInt2471 = 0x1 << method1728(4);
		anInt2465 = 0x1 << method1728(4);
		aFloatArray8 = new float[anInt2465];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2471 : anInt2465;
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
			local191 = Static56.method887(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static91.method1474(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray5 = local84;
				aFloatArray6 = local136;
				anIntArray320 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray1 = local84;
				aFloatArray2 = local136;
				anIntArray319 = local185;
			}
		}
		local24 = method1728(8) + 1;
		aClass44Array1 = new Class44[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass44Array1[local28] = new Class44();
		}
		local32 = method1728(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1728(16);
		}
		@Pc(269) int local269 = method1728(6) + 1;
		aClass83Array1 = new Class83[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass83Array1[local41] = new Class83();
		}
		@Pc(290) int local290 = method1728(6) + 1;
		aClass13Array1 = new Class13[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass13Array1[local86] = new Class13();
		}
		@Pc(311) int local311 = method1728(6) + 1;
		aClass39Array1 = new Class39[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass39Array1[local138] = new Class39();
		}
		@Pc(332) int local332 = method1728(6) + 1;
		aBooleanArray14 = new boolean[local332];
		anIntArray318 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray14[local191] = method1720() != 0;
			method1728(16);
			method1728(16);
			anIntArray318[local191] = method1728(8);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
	public static void method1724(@OriginalArg(0) byte[] arg0) {
		aByteArray40 = arg0;
		anInt2466 = 0;
		anInt2468 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!c;)Z")
	private static boolean method1725(@OriginalArg(0) Class10 arg0) {
		if (!aBoolean102) {
			@Pc(7) byte[] local7 = arg0.method1774(0, 0);
			if (local7 == null) {
				return false;
			}
			method1723(local7);
			aBoolean102 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!c;II)Lclient!sc;")
	public static Class4_Sub16 method1726(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1725(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1774(arg1, arg2);
			return local16 == null ? null : new Class4_Sub16(local16);
		} else {
			arg0.method1778(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	public static int method1728(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2468) {
			local8 = 8 - anInt2468;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray40[anInt2466] >> anInt2468 & local14) << local3;
			anInt2468 = 0;
			anInt2466++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray40[anInt2466] >> anInt2468 & local8) << local3;
			anInt2468 += arg0;
		}
		return local1;
	}
}
