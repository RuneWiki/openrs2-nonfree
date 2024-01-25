import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	private static int anInt3588;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[Lclient!cb;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[Lclient!fq;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "[Lclient!oh;")
	public static Class153[] aClass153Array1;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	public static int anInt3593;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "[B")
	private static byte[] aByteArray57;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "[Lclient!kd;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	public static int anInt3595;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	private static int anInt3596;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Z")
	private static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	public static int method3548() {
		@Pc(7) int local7 = aByteArray57[anInt3588] >> anInt3596 & 0x1;
		anInt3596++;
		anInt3588 += anInt3596 >> 3;
		anInt3596 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)F")
	public static float method3550(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!dp;II)Lclient!md;")
	public static Class6_Sub25 method3551(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3552(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1033(arg2, arg1);
			return local16 == null ? null : new Class6_Sub25(local16);
		} else {
			arg0.method1036(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!dp;)Z")
	private static boolean method3552(@OriginalArg(0) Class53 arg0) {
		if (!aBoolean270) {
			@Pc(7) byte[] local7 = arg0.method1033(0, 0);
			if (local7 == null) {
				return false;
			}
			method3554(local7);
			aBoolean270 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)V")
	public static void method3553(@OriginalArg(0) byte[] arg0) {
		aByteArray57 = arg0;
		anInt3588 = 0;
		anInt3596 = 0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "([B)V")
	private static void method3554(@OriginalArg(0) byte[] arg0) {
		method3553(arg0);
		anInt3595 = 0x1 << method3555(4);
		anInt3593 = 0x1 << method3555(4);
		aFloatArray18 = new float[anInt3593];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3595 : anInt3593;
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
			local191 = Static151.method3068(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static184.method3480(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray12 = local39;
				aFloatArray14 = local84;
				aFloatArray16 = local136;
				anIntArray423 = local185;
			} else {
				aFloatArray13 = local39;
				aFloatArray15 = local84;
				aFloatArray19 = local136;
				anIntArray424 = local185;
			}
		}
		local24 = method3555(8) + 1;
		aClass75Array1 = new Class75[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass75Array1[local28] = new Class75();
		}
		local32 = method3555(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3555(16);
		}
		@Pc(269) int local269 = method3555(6) + 1;
		aClass29Array1 = new Class29[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass29Array1[local41] = new Class29();
		}
		@Pc(290) int local290 = method3555(6) + 1;
		aClass115Array1 = new Class115[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass115Array1[local86] = new Class115();
		}
		@Pc(311) int local311 = method3555(6) + 1;
		aClass153Array1 = new Class153[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass153Array1[local138] = new Class153();
		}
		@Pc(332) int local332 = method3555(6) + 1;
		aBooleanArray24 = new boolean[local332];
		anIntArray425 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray24[local191] = method3548() != 0;
			method3555(16);
			method3555(16);
			anIntArray425[local191] = method3555(8);
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I")
	public static int method3555(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3596) {
			local8 = 8 - anInt3596;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray57[anInt3588] >> anInt3596 & local14) << local3;
			anInt3596 = 0;
			anInt3588++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray57[anInt3588] >> anInt3596 & local8) << local3;
			anInt3596 += arg0;
		}
		return local1;
	}
}
