import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	private static int anInt3483;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "[Lclient!te;")
	public static Class191[] aClass191Array1;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "[Lclient!qi;")
	public static Class168[] aClass168Array1;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "[Lclient!fo;")
	public static Class70[] aClass70Array1;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	public static int anInt3487;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	private static int anInt3488;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "[Lclient!vc;")
	public static Class207[] aClass207Array1;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	public static int anInt3490;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "Z")
	private static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!tj;)Z")
	private static boolean method3178(@OriginalArg(0) Class193 arg0) {
		if (!aBoolean276) {
			@Pc(7) byte[] local7 = arg0.method5047(0, 0);
			if (local7 == null) {
				return false;
			}
			method3182(local7);
			aBoolean276 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	public static int method3179() {
		@Pc(7) int local7 = aByteArray53[anInt3483] >> anInt3488 & 0x1;
		anInt3488++;
		anInt3483 += anInt3488 >> 3;
		anInt3488 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)F")
	public static float method3181(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "([B)V")
	private static void method3182(@OriginalArg(0) byte[] arg0) {
		method3186(arg0);
		anInt3490 = 0x1 << method3185(4);
		anInt3487 = 0x1 << method3185(4);
		aFloatArray21 = new float[anInt3487];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3490 : anInt3487;
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
			local191 = Static238.method4560(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static170.method3294(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray22 = local39;
				aFloatArray17 = local84;
				aFloatArray20 = local136;
				anIntArray304 = local185;
			} else {
				aFloatArray19 = local39;
				aFloatArray23 = local84;
				aFloatArray18 = local136;
				anIntArray305 = local185;
			}
		}
		local24 = method3185(8) + 1;
		aClass207Array1 = new Class207[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass207Array1[local28] = new Class207();
		}
		local32 = method3185(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3185(16);
		}
		@Pc(269) int local269 = method3185(6) + 1;
		aClass70Array1 = new Class70[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass70Array1[local41] = new Class70();
		}
		@Pc(290) int local290 = method3185(6) + 1;
		aClass168Array1 = new Class168[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass168Array1[local86] = new Class168();
		}
		@Pc(311) int local311 = method3185(6) + 1;
		aClass191Array1 = new Class191[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass191Array1[local138] = new Class191();
		}
		@Pc(332) int local332 = method3185(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray303 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method3179() != 0;
			method3185(16);
			method3185(16);
			anIntArray303[local191] = method3185(8);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!tj;II)Lclient!kh;")
	public static Class4_Sub23 method3184(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3178(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5047(arg1, arg2);
			return local16 == null ? null : new Class4_Sub23(local16);
		} else {
			arg0.method5065(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
	public static int method3185(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3488) {
			local8 = 8 - anInt3488;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray53[anInt3483] >> anInt3488 & local14) << local3;
			anInt3488 = 0;
			anInt3483++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray53[anInt3483] >> anInt3488 & local8) << local3;
			anInt3488 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BI)V")
	public static void method3186(@OriginalArg(0) byte[] arg0) {
		aByteArray53 = arg0;
		anInt3483 = 0;
		anInt3488 = 0;
	}
}
