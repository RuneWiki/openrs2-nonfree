import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
	public static boolean aBoolean167;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lclient!ac;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public static int anInt2004;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[Lclient!fd;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[Lclient!t;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	private static int anInt2005;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int anInt2006;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[Lclient!kf;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
	public static int anInt2007;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	private static int anInt2008;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
	public static int anInt2010;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Z")
	private static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public static int method1399(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2008) {
			local8 = 8 - anInt2008;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray64[anInt2005] >> anInt2008 & local14) << local3;
			anInt2008 = 0;
			anInt2005++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray64[anInt2005] >> anInt2008 & local8) << local3;
			anInt2008 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
	private static void method1400(@OriginalArg(0) byte[] arg0) {
		method1406(arg0);
		anInt2007 = 0x1 << method1399(4);
		anInt2006 = 0x1 << method1399(4);
		aFloatArray8 = new float[anInt2006];
		aFloatArray3 = new float[anInt2006];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2007 : anInt2006;
			local31 = local27 >> 1;
			local35 = local27 >> 2;
			local39 = local27 >> 3;
			@Pc(42) float[] local42 = new float[local31];
			for (local44 = 0; local44 < local35; local44++) {
				local42[local44 * 2] = (float) Math.cos((double) (local44 * 4) * 3.141592653589793D / (double) local27);
				local42[local44 * 2 + 1] = -((float) Math.sin((double) (local44 * 4) * 3.141592653589793D / (double) local27));
			}
			@Pc(87) float[] local87 = new float[local31];
			for (local89 = 0; local89 < local35; local89++) {
				local87[local89 * 2] = (float) Math.cos((double) (local89 * 2 + 1) * 3.141592653589793D / (double) (local27 * 2));
				local87[local89 * 2 + 1] = (float) Math.sin((double) (local89 * 2 + 1) * 3.141592653589793D / (double) (local27 * 2));
			}
			@Pc(139) float[] local139 = new float[local35];
			for (local141 = 0; local141 < local39; local141++) {
				local139[local141 * 2] = (float) Math.cos((double) (local141 * 4 + 2) * 3.141592653589793D / (double) local27);
				local139[local141 * 2 + 1] = -((float) Math.sin((double) (local141 * 4 + 2) * 3.141592653589793D / (double) local27));
			}
			@Pc(188) int[] local188 = new int[local39];
			local194 = Static47.method828(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static35.method645(local196, local194);
			}
			if (local20 == 0) {
				aFloatArray5 = local42;
				aFloatArray7 = local87;
				aFloatArray6 = local139;
				anIntArray312 = local188;
			} else {
				aFloatArray1 = local42;
				aFloatArray4 = local87;
				aFloatArray2 = local139;
				anIntArray311 = local188;
			}
		}
		local27 = method1399(8) + 1;
		aClass41Array1 = new Class41[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass41Array1[local31] = new Class41();
		}
		local35 = method1399(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1399(16);
		}
		@Pc(272) int local272 = method1399(6) + 1;
		aClass69Array1 = new Class69[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass69Array1[local44] = new Class69();
		}
		@Pc(293) int local293 = method1399(6) + 1;
		aClass20Array1 = new Class20[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass20Array1[local89] = new Class20();
		}
		@Pc(314) int local314 = method1399(6) + 1;
		aClass2Array1 = new Class2[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass2Array1[local141] = new Class2();
		}
		@Pc(335) int local335 = method1399(6) + 1;
		aBooleanArray11 = new boolean[local335];
		anIntArray310 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray11[local194] = method1404() != 0;
			method1399(16);
			method1399(16);
			anIntArray310[local194] = method1399(8);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method1401() {
		aByteArray64 = null;
		aClass41Array1 = null;
		aClass69Array1 = null;
		aClass20Array1 = null;
		aClass2Array1 = null;
		aBooleanArray11 = null;
		anIntArray310 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray5 = null;
		aFloatArray7 = null;
		aFloatArray6 = null;
		aFloatArray1 = null;
		aFloatArray4 = null;
		aFloatArray2 = null;
		anIntArray312 = null;
		anIntArray311 = null;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
	public static int method1404() {
		@Pc(7) int local7 = aByteArray64[anInt2005] >> anInt2008 & 0x1;
		anInt2008++;
		anInt2005 += anInt2008 >> 3;
		anInt2008 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!q;)Z")
	private static boolean method1405(@OriginalArg(0) Class62 arg0) {
		if (!aBoolean169) {
			@Pc(7) byte[] local7 = arg0.method2008(0, 0);
			if (local7 == null) {
				return false;
			}
			method1400(local7);
			aBoolean169 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
	public static void method1406(@OriginalArg(0) byte[] arg0) {
		aByteArray64 = arg0;
		anInt2005 = 0;
		anInt2008 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)F")
	public static float method1407(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!q;II)Lclient!ne;")
	public static Class52 method1408(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1405(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2008(arg2, arg1);
			return local16 == null ? null : new Class52(local16);
		} else {
			arg0.method2019(arg1, arg2);
			return null;
		}
	}
}
