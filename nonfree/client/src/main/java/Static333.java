import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "[B")
	private static byte[] aByteArray83;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "[Lclient!we;")
	public static Class268[] aClass268Array1;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "[Lclient!lp;")
	public static Class148[] aClass148Array1;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	private static int anInt5930;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray118;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
	private static int anInt5932;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "[Lclient!ps;")
	public static Class200[] aClass200Array1;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
	public static int anInt5934;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "[Lclient!ae;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	public static int anInt5939;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Z")
	private static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
	public static int method4913(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5932) {
			local8 = 8 - anInt5932;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray83[anInt5930] >> anInt5932 & local14) << local3;
			anInt5932 = 0;
			anInt5930++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray83[anInt5930] >> anInt5932 & local8) << local3;
			anInt5932 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([B)V")
	private static void method4914(@OriginalArg(0) byte[] arg0) {
		method4916(arg0);
		anInt5939 = 0x1 << method4913(4);
		anInt5934 = 0x1 << method4913(4);
		aFloatArray35 = new float[anInt5934];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5939 : anInt5934;
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
			local191 = Static58.method1271(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static324.method4834(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray34 = local39;
				aFloatArray28 = local84;
				aFloatArray32 = local136;
				anIntArray483 = local185;
			} else {
				aFloatArray30 = local39;
				aFloatArray33 = local84;
				aFloatArray29 = local136;
				anIntArray481 = local185;
			}
		}
		local24 = method4913(8) + 1;
		aClass148Array1 = new Class148[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass148Array1[local28] = new Class148();
		}
		local32 = method4913(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4913(16);
		}
		@Pc(269) int local269 = method4913(6) + 1;
		aClass200Array1 = new Class200[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass200Array1[local41] = new Class200();
		}
		@Pc(290) int local290 = method4913(6) + 1;
		aClass6Array1 = new Class6[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass6Array1[local86] = new Class6();
		}
		@Pc(311) int local311 = method4913(6) + 1;
		aClass268Array1 = new Class268[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass268Array1[local138] = new Class268();
		}
		@Pc(332) int local332 = method4913(6) + 1;
		aBooleanArray118 = new boolean[local332];
		anIntArray482 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray118[local191] = method4922() != 0;
			method4913(16);
			method4913(16);
			anIntArray482[local191] = method4913(8);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)F")
	public static float method4915(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([BI)V")
	public static void method4916(@OriginalArg(0) byte[] arg0) {
		aByteArray83 = arg0;
		anInt5930 = 0;
		anInt5932 = 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ci;I)Lclient!ql;")
	public static Class4_Sub34 method4920(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1) {
		if (method4921(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1031(arg1);
			return local14 == null ? null : new Class4_Sub34(local14);
		} else {
			arg0.method1037(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ci;)Z")
	private static boolean method4921(@OriginalArg(0) Class38 arg0) {
		if (!aBoolean443) {
			@Pc(7) byte[] local7 = arg0.method1039(0, 0);
			if (local7 == null) {
				return false;
			}
			method4914(local7);
			aBoolean443 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
	public static int method4922() {
		@Pc(7) int local7 = aByteArray83[anInt5930] >> anInt5932 & 0x1;
		anInt5932++;
		anInt5930 += anInt5932 >> 3;
		anInt5932 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ci;II)Lclient!ql;")
	public static Class4_Sub34 method4923(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4921(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1039(arg2, arg1);
			return local16 == null ? null : new Class4_Sub34(local16);
		} else {
			arg0.method1021(arg1, arg2);
			return null;
		}
	}
}
