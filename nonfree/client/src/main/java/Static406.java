import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "[Lclient!pn;")
	public static Class270[] aClass270Array1;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!pda", name = "m", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "[F")
	public static float[] aFloatArray57;

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
	private static int anInt6663;

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "[Lclient!us;")
	public static Class343[] aClass343Array1;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
	public static int anInt6665;

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!pda", name = "x", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!pda", name = "z", descriptor = "[Lclient!bea;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "[I")
	public static int[] anIntArray426;

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
	private static int anInt6667;

	@OriginalMember(owner = "client!pda", name = "G", descriptor = "[Lclient!ov;")
	public static Class260[] aClass260Array1;

	@OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
	public static int anInt6669;

	@OriginalMember(owner = "client!pda", name = "I", descriptor = "[F")
	public static float[] aFloatArray61;

	@OriginalMember(owner = "client!pda", name = "K", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!pda", name = "O", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "Z")
	private static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)F")
	public static float method5525(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([BI)V")
	public static void method5526(@OriginalArg(0) byte[] arg0) {
		aByteArray62 = arg0;
		anInt6663 = 0;
		anInt6667 = 0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([B)V")
	private static void method5527(@OriginalArg(0) byte[] arg0) {
		method5526(arg0);
		anInt6665 = 0x1 << method5533(4);
		anInt6669 = 0x1 << method5533(4);
		aFloatArray55 = new float[anInt6669];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6665 : anInt6669;
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
			local191 = Static234.method3333(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static112.method1662(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray60 = local39;
				aFloatArray57 = local84;
				aFloatArray61 = local136;
				anIntArray425 = local185;
			} else {
				aFloatArray54 = local39;
				aFloatArray56 = local84;
				aFloatArray58 = local136;
				anIntArray426 = local185;
			}
		}
		local24 = method5533(8) + 1;
		aClass270Array1 = new Class270[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass270Array1[local28] = new Class270();
		}
		local32 = method5533(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5533(16);
		}
		@Pc(269) int local269 = method5533(6) + 1;
		aClass30Array1 = new Class30[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass30Array1[local41] = new Class30();
		}
		@Pc(290) int local290 = method5533(6) + 1;
		aClass260Array1 = new Class260[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass260Array1[local86] = new Class260();
		}
		@Pc(311) int local311 = method5533(6) + 1;
		aClass343Array1 = new Class343[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass343Array1[local138] = new Class343();
		}
		@Pc(332) int local332 = method5533(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray427 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method5528() != 0;
			method5533(16);
			method5533(16);
			anIntArray427[local191] = method5533(8);
		}
		aBoolean533 = true;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "()I")
	public static int method5528() {
		@Pc(7) int local7 = aByteArray62[anInt6663] >> anInt6667 & 0x1;
		anInt6667++;
		anInt6663 += anInt6667 >> 3;
		anInt6667 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!mv;II)Lclient!pda;")
	public static Class2_Sub37 method5531(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5532(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4980(arg1, arg2);
			return local16 == null ? null : new Class2_Sub37(local16);
		} else {
			arg0.method4979(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!mv;)Z")
	private static boolean method5532(@OriginalArg(0) Class229 arg0) {
		if (!aBoolean533) {
			@Pc(7) byte[] local7 = arg0.method4980(0, 0);
			if (local7 == null) {
				return false;
			}
			method5527(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I")
	public static int method5533(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6667) {
			local8 = 8 - anInt6667;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray62[anInt6663] >> anInt6667 & local14) << local3;
			anInt6667 = 0;
			anInt6663++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray62[anInt6663] >> anInt6667 & local8) << local3;
			anInt6667 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!mv;I)Lclient!pda;")
	public static Class2_Sub37 method5536(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1) {
		if (method5532(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4966(arg1);
			return local14 == null ? null : new Class2_Sub37(local14);
		} else {
			arg0.method4954(arg1);
			return null;
		}
	}
}
