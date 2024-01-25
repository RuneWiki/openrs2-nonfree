import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
	public static int anInt2323;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "[B")
	private static byte[] aByteArray34;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "[Lclient!nf;")
	public static Class165[] aClass165Array1;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "[Lclient!fo;")
	public static Class88[] aClass88Array1;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
	private static int anInt2327;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "[Lclient!tq;")
	public static Class230[] aClass230Array1;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
	private static int anInt2330;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "[Lclient!vl;")
	public static Class253[] aClass253Array1;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Z")
	private static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
	public static int method1937() {
		@Pc(7) int local7 = aByteArray34[anInt2327] >> anInt2330 & 0x1;
		anInt2330++;
		anInt2327 += anInt2330 >> 3;
		anInt2330 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!vh;)Z")
	private static boolean method1941(@OriginalArg(0) Class250 arg0) {
		if (!aBoolean125) {
			@Pc(7) byte[] local7 = arg0.method5667(0, 0);
			if (local7 == null) {
				return false;
			}
			method1947(local7);
			aBoolean125 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)F")
	public static float method1942(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!vh;II)Lclient!gq;")
	public static Class1_Sub15 method1943(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1941(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5667(arg2, arg1);
			return local16 == null ? null : new Class1_Sub15(local16);
		} else {
			arg0.method5660(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)I")
	public static int method1944(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2330) {
			local8 = 8 - anInt2330;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray34[anInt2327] >> anInt2330 & local14) << local3;
			anInt2330 = 0;
			anInt2327++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray34[anInt2327] >> anInt2330 & local8) << local3;
			anInt2330 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([BI)V")
	public static void method1946(@OriginalArg(0) byte[] arg0) {
		aByteArray34 = arg0;
		anInt2327 = 0;
		anInt2330 = 0;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "([B)V")
	private static void method1947(@OriginalArg(0) byte[] arg0) {
		method1946(arg0);
		anInt2323 = 0x1 << method1944(4);
		anInt2328 = 0x1 << method1944(4);
		aFloatArray11 = new float[anInt2328];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2323 : anInt2328;
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
			local191 = Static159.method2403(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static407.method5503(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray13 = local84;
				aFloatArray14 = local136;
				anIntArray218 = local185;
			} else {
				aFloatArray15 = local39;
				aFloatArray12 = local84;
				aFloatArray9 = local136;
				anIntArray217 = local185;
			}
		}
		local24 = method1944(8) + 1;
		aClass88Array1 = new Class88[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass88Array1[local28] = new Class88();
		}
		local32 = method1944(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1944(16);
		}
		@Pc(269) int local269 = method1944(6) + 1;
		aClass253Array1 = new Class253[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass253Array1[local41] = new Class253();
		}
		@Pc(290) int local290 = method1944(6) + 1;
		aClass165Array1 = new Class165[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass165Array1[local86] = new Class165();
		}
		@Pc(311) int local311 = method1944(6) + 1;
		aClass230Array1 = new Class230[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass230Array1[local138] = new Class230();
		}
		@Pc(332) int local332 = method1944(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray219 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method1937() != 0;
			method1944(16);
			method1944(16);
			anIntArray219[local191] = method1944(8);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!vh;I)Lclient!gq;")
	public static Class1_Sub15 method1948(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		if (method1941(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5644(arg1);
			return local14 == null ? null : new Class1_Sub15(local14);
		} else {
			arg0.method5668(arg1);
			return null;
		}
	}
}
