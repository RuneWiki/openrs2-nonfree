import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	private static int anInt1913;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[Lclient!db;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private static int anInt1915;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[Lclient!ke;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
	public static boolean aBoolean77;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[B")
	private static byte[] aByteArray79;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[Lclient!w;")
	public static Class79[] aClass79Array1;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int anInt1917;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	public static int anInt1919;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	public static int anInt1921;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "[Lclient!i;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Z")
	private static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!lc;)Z")
	private static boolean method1424(@OriginalArg(0) Class40 arg0) {
		if (!aBoolean79) {
			@Pc(7) byte[] local7 = arg0.method1110(0, 0);
			if (local7 == null) {
				return false;
			}
			method1426(local7);
			aBoolean79 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()I")
	public static int method1425() {
		@Pc(7) int local7 = aByteArray79[anInt1913] >> anInt1915 & 0x1;
		anInt1915++;
		anInt1913 += anInt1915 >> 3;
		anInt1915 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
	private static void method1426(@OriginalArg(0) byte[] arg0) {
		method1432(arg0);
		anInt1918 = 0x1 << method1430(4);
		anInt1917 = 0x1 << method1430(4);
		aFloatArray3 = new float[anInt1917];
		aFloatArray8 = new float[anInt1917];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt1918 : anInt1917;
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
			local194 = Static3.method11(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static70.method1352(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray5 = local42;
				aFloatArray7 = local87;
				aFloatArray9 = local139;
				anIntArray196 = local188;
			} else {
				aFloatArray4 = local42;
				aFloatArray6 = local87;
				aFloatArray2 = local139;
				anIntArray195 = local188;
			}
		}
		local27 = method1430(8) + 1;
		aClass79Array1 = new Class79[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass79Array1[local31] = new Class79();
		}
		local35 = method1430(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1430(16);
		}
		@Pc(272) int local272 = method1430(6) + 1;
		aClass15Array1 = new Class15[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass15Array1[local44] = new Class15();
		}
		@Pc(293) int local293 = method1430(6) + 1;
		aClass41Array1 = new Class41[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass41Array1[local89] = new Class41();
		}
		@Pc(314) int local314 = method1430(6) + 1;
		aClass31Array1 = new Class31[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass31Array1[local141] = new Class31();
		}
		@Pc(335) int local335 = method1430(6) + 1;
		aBooleanArray10 = new boolean[local335];
		anIntArray197 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray10[local194] = method1425() != 0;
			method1430(16);
			method1430(16);
			anIntArray197[local194] = method1430(8);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!lc;II)Lclient!ne;")
	public static Class52 method1428(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1424(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1110(arg2, arg1);
			return local16 == null ? null : new Class52(local16);
		} else {
			arg0.method1120(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)F")
	public static float method1429(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public static int method1430(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1915) {
			local8 = 8 - anInt1915;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray79[anInt1913] >> anInt1915 & local14) << local3;
			anInt1915 = 0;
			anInt1913++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray79[anInt1913] >> anInt1915 & local8) << local3;
			anInt1915 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
	public static void method1432(@OriginalArg(0) byte[] arg0) {
		aByteArray79 = arg0;
		anInt1913 = 0;
		anInt1915 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	public static void method1433() {
		aByteArray79 = null;
		aClass79Array1 = null;
		aClass15Array1 = null;
		aClass41Array1 = null;
		aClass31Array1 = null;
		aBooleanArray10 = null;
		anIntArray197 = null;
		aFloatArray8 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray7 = null;
		aFloatArray9 = null;
		aFloatArray4 = null;
		aFloatArray6 = null;
		aFloatArray2 = null;
		anIntArray196 = null;
		anIntArray195 = null;
	}
}
