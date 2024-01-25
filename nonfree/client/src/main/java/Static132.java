import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eia", name = "n", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!eia", name = "Q", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!eia", name = "M", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!eia", name = "G", descriptor = "[Lclient!sp;")
	public static Class333[] aClass333Array1;

	@OriginalMember(owner = "client!eia", name = "u", descriptor = "I")
	private static int anInt2610;

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
	public static int anInt2614;

	@OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
	private static int anInt2616;

	@OriginalMember(owner = "client!eia", name = "j", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!eia", name = "D", descriptor = "[B")
	private static byte[] aByteArray16;

	@OriginalMember(owner = "client!eia", name = "q", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!eia", name = "L", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!eia", name = "N", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!eia", name = "y", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!eia", name = "H", descriptor = "[Lclient!nk;")
	public static Class254[] aClass254Array1;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!eia", name = "t", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!eia", name = "x", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!eia", name = "w", descriptor = "[Lclient!kea;")
	public static Class206[] aClass206Array1;

	@OriginalMember(owner = "client!eia", name = "E", descriptor = "[Lclient!nf;")
	public static Class248[] aClass248Array1;

	@OriginalMember(owner = "client!eia", name = "B", descriptor = "Z")
	private static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(I)F")
	public static float method2549(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!lga;)Z")
	private static boolean method2550(@OriginalArg(0) Class223 arg0) {
		if (!aBoolean205) {
			@Pc(7) byte[] local7 = arg0.method5267(0, 0);
			if (local7 == null) {
				return false;
			}
			method2554(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([BI)V")
	public static void method2551(@OriginalArg(0) byte[] arg0) {
		aByteArray16 = arg0;
		anInt2616 = 0;
		anInt2610 = 0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "()I")
	public static int method2552() {
		@Pc(7) int local7 = aByteArray16[anInt2616] >> anInt2610 & 0x1;
		anInt2610++;
		anInt2616 += anInt2610 >> 3;
		anInt2610 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "([B)V")
	private static void method2554(@OriginalArg(0) byte[] arg0) {
		method2551(arg0);
		anInt2612 = 0x1 << method2558(4);
		anInt2614 = 0x1 << method2558(4);
		aFloatArray33 = new float[anInt2614];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2612 : anInt2614;
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
			local191 = Static23.method257(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static354.method5414(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray34 = local39;
				aFloatArray36 = local84;
				aFloatArray35 = local136;
				anIntArray135 = local185;
			} else {
				aFloatArray29 = local39;
				aFloatArray30 = local84;
				aFloatArray32 = local136;
				anIntArray136 = local185;
			}
		}
		local24 = method2558(8) + 1;
		aClass333Array1 = new Class333[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass333Array1[local28] = new Class333();
		}
		local32 = method2558(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2558(16);
		}
		@Pc(269) int local269 = method2558(6) + 1;
		aClass206Array1 = new Class206[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass206Array1[local41] = new Class206();
		}
		@Pc(290) int local290 = method2558(6) + 1;
		aClass248Array1 = new Class248[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass248Array1[local86] = new Class248();
		}
		@Pc(311) int local311 = method2558(6) + 1;
		aClass254Array1 = new Class254[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass254Array1[local138] = new Class254();
		}
		@Pc(332) int local332 = method2558(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray134 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method2552() != 0;
			method2558(16);
			method2558(16);
			anIntArray134[local191] = method2558(8);
		}
		aBoolean205 = true;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!lga;II)Lclient!eia;")
	public static Class6_Sub16 method2556(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2550(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5267(arg2, arg1);
			return local16 == null ? null : new Class6_Sub16(local16);
		} else {
			arg0.method5261(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!lga;I)Lclient!eia;")
	public static Class6_Sub16 method2557(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (method2550(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5275(arg1);
			return local14 == null ? null : new Class6_Sub16(local14);
		} else {
			arg0.method5285(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)I")
	public static int method2558(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2610) {
			local8 = 8 - anInt2610;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray16[anInt2616] >> anInt2610 & local14) << local3;
			anInt2610 = 0;
			anInt2616++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray16[anInt2616] >> anInt2610 & local8) << local3;
			anInt2610 += arg0;
		}
		return local1;
	}
}
