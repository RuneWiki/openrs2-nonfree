import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	private static int anInt2251;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[Lclient!tg;")
	public static Class153[] aClass153Array1;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "[Lclient!ob;")
	public static Class111[] aClass111Array1;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "[Lclient!qi;")
	public static Class132[] aClass132Array1;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	private static int anInt2254;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "[B")
	private static byte[] aByteArray26;

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
	public static int anInt2258;

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!hi", name = "V", descriptor = "[Lclient!pj;")
	public static Class123[] aClass123Array1;

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "Z")
	private static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([B)V")
	private static void method1699(@OriginalArg(0) byte[] arg0) {
		method1702(arg0);
		anInt2258 = 0x1 << method1706(4);
		anInt2253 = 0x1 << method1706(4);
		aFloatArray7 = new float[anInt2253];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt2258 : anInt2253;
			local30 = local26 >> 1;
			local34 = local26 >> 2;
			local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static145.method2766(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static153.method2855(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray8 = local41;
				aFloatArray10 = local86;
				aFloatArray11 = local138;
				anIntArray229 = local187;
			} else {
				aFloatArray12 = local41;
				aFloatArray6 = local86;
				aFloatArray13 = local138;
				anIntArray228 = local187;
			}
		}
		local17 = method1706(8) + 1;
		aClass123Array1 = new Class123[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass123Array1[local26] = new Class123();
		}
		local26 = method1706(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method1706(16);
		}
		local26 = method1706(6) + 1;
		aClass111Array1 = new Class111[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass111Array1[local30] = new Class111();
		}
		local30 = method1706(6) + 1;
		aClass153Array1 = new Class153[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass153Array1[local34] = new Class153();
		}
		local34 = method1706(6) + 1;
		aClass132Array1 = new Class132[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass132Array1[local38] = new Class132();
		}
		local38 = method1706(6) + 1;
		aBooleanArray11 = new boolean[local38];
		anIntArray227 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray11[local340] = method1705() != 0;
			method1706(16);
			method1706(16);
			anIntArray227[local340] = method1706(8);
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)F")
	public static float method1700(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([BI)V")
	public static void method1702(@OriginalArg(0) byte[] arg0) {
		aByteArray26 = arg0;
		anInt2251 = 0;
		anInt2254 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!kb;II)Lclient!hi;")
	public static Class1_Sub13 method1703(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1709(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2306(arg1, arg2);
			return local16 == null ? null : new Class1_Sub13(local16);
		} else {
			arg0.method2299(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
	public static int method1705() {
		@Pc(7) int local7 = aByteArray26[anInt2251] >> anInt2254 & 0x1;
		anInt2254++;
		anInt2251 += anInt2254 >> 3;
		anInt2254 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
	public static int method1706(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt2254) {
			local12 = 8 - anInt2254;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray26[anInt2251] >> anInt2254 & local18) << local3;
			anInt2254 = 0;
			anInt2251++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray26[anInt2251] >> anInt2254 & local12) << local3;
			anInt2254 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!kb;)Z")
	private static boolean method1709(@OriginalArg(0) Class83 arg0) {
		if (!aBoolean122) {
			@Pc(7) byte[] local7 = arg0.method2306(0, 0);
			if (local7 == null) {
				return false;
			}
			method1699(local7);
			aBoolean122 = true;
		}
		return true;
	}
}
