import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	private static int anInt2078;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lclient!k;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	private static int anInt2080;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public static int anInt2084;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[Lclient!mf;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	public static int anInt2085;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lclient!fd;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "[Lclient!vd;")
	public static Class79[] aClass79Array1;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
	private static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
	public static void method1374(@OriginalArg(0) byte[] arg0) {
		aByteArray28 = arg0;
		anInt2078 = 0;
		anInt2080 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public static void method1375() {
		aByteArray28 = null;
		aClass79Array1 = null;
		aClass51Array1 = null;
		aClass26Array1 = null;
		aClass40Array1 = null;
		aBooleanArray10 = null;
		anIntArray183 = null;
		aFloatArray7 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray9 = null;
		aFloatArray2 = null;
		aFloatArray6 = null;
		aFloatArray8 = null;
		anIntArray184 = null;
		anIntArray182 = null;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public static int method1376() {
		@Pc(7) int local7 = aByteArray28[anInt2078] >> anInt2080 & 0x1;
		anInt2080++;
		anInt2078 += anInt2080 >> 3;
		anInt2080 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tb;)Z")
	private static boolean method1377(@OriginalArg(0) Class44 arg0) {
		if (!aBoolean93) {
			@Pc(7) byte[] local7 = arg0.method1146(0, 0);
			if (local7 == null) {
				return false;
			}
			method1383(local7);
			aBoolean93 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)F")
	public static float method1378(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public static int method1379(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2080) {
			local8 = 8 - anInt2080;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray28[anInt2078] >> anInt2080 & local14) << local3;
			anInt2080 = 0;
			anInt2078++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray28[anInt2078] >> anInt2080 & local8) << local3;
			anInt2080 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tb;I)Lclient!ne;")
	public static Class55 method1381(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		if (method1377(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1155(arg1);
			return local14 == null ? null : new Class55(local14);
		} else {
			arg0.method1160(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "([B)V")
	private static void method1383(@OriginalArg(0) byte[] arg0) {
		method1374(arg0);
		anInt2083 = 0x1 << method1379(4);
		anInt2084 = 0x1 << method1379(4);
		aFloatArray3 = new float[anInt2084];
		aFloatArray7 = new float[anInt2084];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2083 : anInt2084;
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
			local194 = Static108.method1820(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static86.method1597(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray5 = local42;
				aFloatArray4 = local87;
				aFloatArray9 = local139;
				anIntArray184 = local188;
			} else {
				aFloatArray2 = local42;
				aFloatArray6 = local87;
				aFloatArray8 = local139;
				anIntArray182 = local188;
			}
		}
		local27 = method1379(8) + 1;
		aClass79Array1 = new Class79[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass79Array1[local31] = new Class79();
		}
		local35 = method1379(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1379(16);
		}
		@Pc(272) int local272 = method1379(6) + 1;
		aClass51Array1 = new Class51[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass51Array1[local44] = new Class51();
		}
		@Pc(293) int local293 = method1379(6) + 1;
		aClass26Array1 = new Class26[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass26Array1[local89] = new Class26();
		}
		@Pc(314) int local314 = method1379(6) + 1;
		aClass40Array1 = new Class40[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass40Array1[local141] = new Class40();
		}
		@Pc(335) int local335 = method1379(6) + 1;
		aBooleanArray10 = new boolean[local335];
		anIntArray183 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray10[local194] = method1376() != 0;
			method1379(16);
			method1379(16);
			anIntArray183[local194] = method1379(8);
		}
	}
}
