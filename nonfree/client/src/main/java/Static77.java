import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[Lclient!l;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "[Lclient!tf;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	private static int anInt2038;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "[Lclient!wb;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public static int anInt2040;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "[Lclient!ef;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	public static int anInt2042;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "[B")
	private static byte[] aByteArray26;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
	private static int anInt2044;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Z")
	private static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "([B)V")
	private static void method1287(@OriginalArg(0) byte[] arg0) {
		method1293(arg0);
		anInt2042 = 0x1 << method1296(4);
		anInt2040 = 0x1 << method1296(4);
		aFloatArray4 = new float[anInt2040];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2042 : anInt2040;
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
			local191 = Static124.method1889(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static19.method376(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray5 = local84;
				aFloatArray8 = local136;
				anIntArray203 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray9 = local84;
				aFloatArray7 = local136;
				anIntArray202 = local185;
			}
		}
		local24 = method1296(8) + 1;
		aClass24Array1 = new Class24[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass24Array1[local28] = new Class24();
		}
		local32 = method1296(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1296(16);
		}
		@Pc(269) int local269 = method1296(6) + 1;
		aClass41Array1 = new Class41[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass41Array1[local41] = new Class41();
		}
		@Pc(290) int local290 = method1296(6) + 1;
		aClass74Array1 = new Class74[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass74Array1[local86] = new Class74();
		}
		@Pc(311) int local311 = method1296(6) + 1;
		aClass80Array1 = new Class80[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass80Array1[local138] = new Class80();
		}
		@Pc(332) int local332 = method1296(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray204 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method1289() != 0;
			method1296(16);
			method1296(16);
			anIntArray204[local191] = method1296(8);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
	public static int method1289() {
		@Pc(7) int local7 = aByteArray26[anInt2038] >> anInt2044 & 0x1;
		anInt2044++;
		anInt2038 += anInt2044 >> 3;
		anInt2044 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
	public static void method1291() {
		aByteArray26 = null;
		aClass24Array1 = null;
		aClass41Array1 = null;
		aClass74Array1 = null;
		aClass80Array1 = null;
		aBooleanArray15 = null;
		anIntArray204 = null;
		aFloatArray4 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray9 = null;
		aFloatArray7 = null;
		anIntArray203 = null;
		anIntArray202 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ea;)Z")
	private static boolean method1292(@OriginalArg(0) Class20 arg0) {
		if (!aBoolean178) {
			@Pc(7) byte[] local7 = arg0.method597(0, 0);
			if (local7 == null) {
				return false;
			}
			method1287(local7);
			aBoolean178 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BI)V")
	public static void method1293(@OriginalArg(0) byte[] arg0) {
		aByteArray26 = arg0;
		anInt2038 = 0;
		anInt2044 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ea;II)Lclient!nc;")
	public static Class4_Sub17 method1294(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1292(arg0)) {
			@Pc(16) byte[] local16 = arg0.method597(arg1, arg2);
			return local16 == null ? null : new Class4_Sub17(local16);
		} else {
			arg0.method604(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)F")
	public static float method1295(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
	public static int method1296(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2044) {
			local8 = 8 - anInt2044;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray26[anInt2038] >> anInt2044 & local14) << local3;
			anInt2044 = 0;
			anInt2038++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray26[anInt2038] >> anInt2044 & local8) << local3;
			anInt2044 += arg0;
		}
		return local1;
	}
}
