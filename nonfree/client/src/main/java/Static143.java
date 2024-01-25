import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[B")
	private static byte[] aByteArray26;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[Lclient!cm;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public static int anInt2828;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[Lclient!eh;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	private static int anInt2834;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "[Lclient!vo;")
	public static Class212[] aClass212Array1;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "[Lclient!l;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
	private static int anInt2837;

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
	private static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)V")
	public static void method2662(@OriginalArg(0) byte[] arg0) {
		aByteArray26 = arg0;
		anInt2837 = 0;
		anInt2834 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ra;)Z")
	private static boolean method2663(@OriginalArg(0) Class170 arg0) {
		if (!aBoolean190) {
			@Pc(7) byte[] local7 = arg0.method4584(0, 0);
			if (local7 == null) {
				return false;
			}
			method2669(local7);
			aBoolean190 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)F")
	public static float method2664(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
	public static int method2666(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2834) {
			local8 = 8 - anInt2834;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray26[anInt2837] >> anInt2834 & local14) << local3;
			anInt2834 = 0;
			anInt2837++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray26[anInt2837] >> anInt2834 & local8) << local3;
			anInt2834 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ra;II)Lclient!jd;")
	public static Class5_Sub24 method2667(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2663(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4584(arg1, arg2);
			return local16 == null ? null : new Class5_Sub24(local16);
		} else {
			arg0.method4578(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
	public static int method2668() {
		@Pc(7) int local7 = aByteArray26[anInt2837] >> anInt2834 & 0x1;
		anInt2834++;
		anInt2837 += anInt2834 >> 3;
		anInt2834 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([B)V")
	private static void method2669(@OriginalArg(0) byte[] arg0) {
		method2662(arg0);
		anInt2828 = 0x1 << method2666(4);
		anInt2832 = 0x1 << method2666(4);
		aFloatArray10 = new float[anInt2832];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2828 : anInt2832;
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
			local191 = Static81.method1791(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static39.method883(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray11 = local39;
				aFloatArray12 = local84;
				aFloatArray6 = local136;
				anIntArray176 = local185;
			} else {
				aFloatArray7 = local39;
				aFloatArray9 = local84;
				aFloatArray8 = local136;
				anIntArray177 = local185;
			}
		}
		local24 = method2666(8) + 1;
		aClass212Array1 = new Class212[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass212Array1[local28] = new Class212();
		}
		local32 = method2666(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2666(16);
		}
		@Pc(269) int local269 = method2666(6) + 1;
		aClass56Array1 = new Class56[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass56Array1[local41] = new Class56();
		}
		@Pc(290) int local290 = method2666(6) + 1;
		aClass115Array1 = new Class115[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass115Array1[local86] = new Class115();
		}
		@Pc(311) int local311 = method2666(6) + 1;
		aClass38Array1 = new Class38[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass38Array1[local138] = new Class38();
		}
		@Pc(332) int local332 = method2666(6) + 1;
		aBooleanArray11 = new boolean[local332];
		anIntArray178 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray11[local191] = method2668() != 0;
			method2666(16);
			method2666(16);
			anIntArray178[local191] = method2666(8);
		}
	}
}
