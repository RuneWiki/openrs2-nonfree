import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt7669;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lclient!to;")
	public static Class325[] aClass325Array1;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt7670;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "[F")
	public static float[] aFloatArray62;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[F")
	public static float[] aFloatArray63;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "[B")
	private static byte[] aByteArray81;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[Lclient!gh;")
	public static Class126[] aClass126Array1;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "[F")
	public static float[] aFloatArray64;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "[Lclient!kc;")
	public static Class181[] aClass181Array1;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[Lclient!lga;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	private static int anInt7673;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "[F")
	public static float[] aFloatArray67;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
	private static int anInt7678;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "Z")
	private static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
	public static void method6648(@OriginalArg(0) byte[] arg0) {
		aByteArray81 = arg0;
		anInt7673 = 0;
		anInt7678 = 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!la;)Z")
	private static boolean method6649(@OriginalArg(0) Class196 arg0) {
		if (!aBoolean539) {
			@Pc(7) byte[] local7 = arg0.method5102(0, 0);
			if (local7 == null) {
				return false;
			}
			method6652(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	public static int method6651(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7678) {
			local8 = 8 - anInt7678;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray81[anInt7673] >> anInt7678 & local14) << local3;
			anInt7678 = 0;
			anInt7673++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray81[anInt7673] >> anInt7678 & local8) << local3;
			anInt7678 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V")
	private static void method6652(@OriginalArg(0) byte[] arg0) {
		method6648(arg0);
		anInt7669 = 0x1 << method6651(4);
		anInt7670 = 0x1 << method6651(4);
		aFloatArray67 = new float[anInt7670];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7669 : anInt7670;
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
			local191 = Static636.method8709(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static305.method4860(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray63 = local39;
				aFloatArray65 = local84;
				aFloatArray66 = local136;
				anIntArray469 = local185;
			} else {
				aFloatArray62 = local39;
				aFloatArray64 = local84;
				aFloatArray60 = local136;
				anIntArray470 = local185;
			}
		}
		local24 = method6651(8) + 1;
		aClass204Array1 = new Class204[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass204Array1[local28] = new Class204();
		}
		local32 = method6651(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method6651(16);
		}
		@Pc(269) int local269 = method6651(6) + 1;
		aClass325Array1 = new Class325[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass325Array1[local41] = new Class325();
		}
		@Pc(290) int local290 = method6651(6) + 1;
		aClass126Array1 = new Class126[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass126Array1[local86] = new Class126();
		}
		@Pc(311) int local311 = method6651(6) + 1;
		aClass181Array1 = new Class181[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass181Array1[local138] = new Class181();
		}
		@Pc(332) int local332 = method6651(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray468 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method6653() != 0;
			method6651(16);
			method6651(16);
			anIntArray468[local191] = method6651(8);
		}
		aBoolean539 = true;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	public static int method6653() {
		@Pc(7) int local7 = aByteArray81[anInt7673] >> anInt7678 & 0x1;
		anInt7678++;
		anInt7673 += anInt7678 >> 3;
		anInt7678 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!la;I)Lclient!pd;")
	public static Class3_Sub43 method6656(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		if (method6649(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5113(arg1);
			return local14 == null ? null : new Class3_Sub43(local14);
		} else {
			arg0.method5111(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!la;II)Lclient!pd;")
	public static Class3_Sub43 method6657(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method6649(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5102(arg1, arg2);
			return local16 == null ? null : new Class3_Sub43(local16);
		} else {
			arg0.method5115(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)F")
	public static float method6659(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
