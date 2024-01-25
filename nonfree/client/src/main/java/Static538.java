import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "[F")
	public static float[] aFloatArray67;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "[F")
	public static float[] aFloatArray68;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "[Lclient!pj;")
	public static Class263[] aClass263Array1;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "[Lclient!lc;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "[F")
	public static float[] aFloatArray69;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
	public static int anInt9265;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
	public static int anInt9269;

	@OriginalMember(owner = "client!tea", name = "C", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!tea", name = "D", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!tea", name = "G", descriptor = "[Lclient!mv;")
	public static Class221[] aClass221Array1;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!tea", name = "I", descriptor = "I")
	private static int anInt9271;

	@OriginalMember(owner = "client!tea", name = "K", descriptor = "[Lclient!lq;")
	public static Class207[] aClass207Array1;

	@OriginalMember(owner = "client!tea", name = "N", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "I")
	private static int anInt9272;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "Z")
	private static boolean aBoolean781 = false;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([B)V")
	private static void method7643(@OriginalArg(0) byte[] arg0) {
		method7645(arg0);
		anInt9265 = 0x1 << method7652(4);
		anInt9269 = 0x1 << method7652(4);
		aFloatArray74 = new float[anInt9269];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9265 : anInt9269;
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
			local191 = Static539.method7665(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static499.method7290(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray69 = local39;
				aFloatArray70 = local84;
				aFloatArray67 = local136;
				anIntArray575 = local185;
			} else {
				aFloatArray68 = local39;
				aFloatArray72 = local84;
				aFloatArray71 = local136;
				anIntArray573 = local185;
			}
		}
		local24 = method7652(8) + 1;
		aClass221Array1 = new Class221[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass221Array1[local28] = new Class221();
		}
		local32 = method7652(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7652(16);
		}
		@Pc(269) int local269 = method7652(6) + 1;
		aClass263Array1 = new Class263[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass263Array1[local41] = new Class263();
		}
		@Pc(290) int local290 = method7652(6) + 1;
		aClass196Array1 = new Class196[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass196Array1[local86] = new Class196();
		}
		@Pc(311) int local311 = method7652(6) + 1;
		aClass207Array1 = new Class207[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass207Array1[local138] = new Class207();
		}
		@Pc(332) int local332 = method7652(6) + 1;
		aBooleanArray26 = new boolean[local332];
		anIntArray574 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray26[local191] = method7646() != 0;
			method7652(16);
			method7652(16);
			anIntArray574[local191] = method7652(8);
		}
		aBoolean781 = true;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!kha;II)Lclient!tea;")
	public static Class3_Sub47 method7644(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7649(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5023(arg1, arg2);
			return local16 == null ? null : new Class3_Sub47(local16);
		} else {
			arg0.method5024(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([BI)V")
	public static void method7645(@OriginalArg(0) byte[] arg0) {
		aByteArray93 = arg0;
		anInt9271 = 0;
		anInt9272 = 0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "()I")
	public static int method7646() {
		@Pc(7) int local7 = aByteArray93[anInt9271] >> anInt9272 & 0x1;
		anInt9272++;
		anInt9271 += anInt9272 >> 3;
		anInt9272 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!kha;)Z")
	private static boolean method7649(@OriginalArg(0) Class181 arg0) {
		if (!aBoolean781) {
			@Pc(7) byte[] local7 = arg0.method5023(0, 0);
			if (local7 == null) {
				return false;
			}
			method7643(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)F")
	public static float method7650(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)I")
	public static int method7652(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9272) {
			local8 = 8 - anInt9272;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray93[anInt9271] >> anInt9272 & local14) << local3;
			anInt9272 = 0;
			anInt9271++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray93[anInt9271] >> anInt9272 & local8) << local3;
			anInt9272 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!kha;I)Lclient!tea;")
	public static Class3_Sub47 method7653(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		if (method7649(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5049(arg1);
			return local14 == null ? null : new Class3_Sub47(local14);
		} else {
			arg0.method5040(arg1);
			return null;
		}
	}
}
