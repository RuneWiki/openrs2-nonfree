import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	private static int anInt2287;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
	public static int anInt2290;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "[Lclient!wq;")
	public static Class265[] aClass265Array1;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
	public static int anInt2291;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
	private static int anInt2293;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "[Lclient!nl;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!gh", name = "P", descriptor = "[B")
	private static byte[] aByteArray20;

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "[Lclient!hv;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "[Lclient!gd;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
	private static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ic;)Z")
	private static boolean method1803(@OriginalArg(0) Class113 arg0) {
		if (!aBoolean166) {
			@Pc(7) byte[] local7 = arg0.method2274(0, 0);
			if (local7 == null) {
				return false;
			}
			method1807(local7);
			aBoolean166 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BI)V")
	public static void method1805(@OriginalArg(0) byte[] arg0) {
		aByteArray20 = arg0;
		anInt2287 = 0;
		anInt2293 = 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)F")
	public static float method1806(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([B)V")
	private static void method1807(@OriginalArg(0) byte[] arg0) {
		method1805(arg0);
		anInt2290 = 0x1 << method1810(4);
		anInt2291 = 0x1 << method1810(4);
		aFloatArray9 = new float[anInt2291];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2290 : anInt2291;
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
			local191 = Static66.method998(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static402.method5018(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray14 = local39;
				aFloatArray11 = local84;
				aFloatArray12 = local136;
				anIntArray111 = local185;
			} else {
				aFloatArray10 = local39;
				aFloatArray8 = local84;
				aFloatArray7 = local136;
				anIntArray110 = local185;
			}
		}
		local24 = method1810(8) + 1;
		aClass170Array1 = new Class170[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass170Array1[local28] = new Class170();
		}
		local32 = method1810(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1810(16);
		}
		@Pc(269) int local269 = method1810(6) + 1;
		aClass265Array1 = new Class265[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass265Array1[local41] = new Class265();
		}
		@Pc(290) int local290 = method1810(6) + 1;
		aClass90Array1 = new Class90[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass90Array1[local86] = new Class90();
		}
		@Pc(311) int local311 = method1810(6) + 1;
		aClass110Array1 = new Class110[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass110Array1[local138] = new Class110();
		}
		@Pc(332) int local332 = method1810(6) + 1;
		aBooleanArray13 = new boolean[local332];
		anIntArray109 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray13[local191] = method1809() != 0;
			method1810(16);
			method1810(16);
			anIntArray109[local191] = method1810(8);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
	public static int method1809() {
		@Pc(7) int local7 = aByteArray20[anInt2287] >> anInt2293 & 0x1;
		anInt2293++;
		anInt2287 += anInt2293 >> 3;
		anInt2293 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
	public static int method1810(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2293) {
			local8 = 8 - anInt2293;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray20[anInt2287] >> anInt2293 & local14) << local3;
			anInt2293 = 0;
			anInt2287++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray20[anInt2287] >> anInt2293 & local8) << local3;
			anInt2293 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ic;I)Lclient!gh;")
	public static Class1_Sub16 method1811(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1) {
		if (method1803(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2273(arg1);
			return local14 == null ? null : new Class1_Sub16(local14);
		} else {
			arg0.method2253(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ic;II)Lclient!gh;")
	public static Class1_Sub16 method1814(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1803(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2274(arg1, arg2);
			return local16 == null ? null : new Class1_Sub16(local16);
		} else {
			arg0.method2251(arg2, arg1);
			return null;
		}
	}
}
