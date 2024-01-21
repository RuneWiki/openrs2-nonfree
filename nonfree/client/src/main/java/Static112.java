import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[Lclient!gb;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public static int anInt2588;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "[Lclient!ee;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lclient!f;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private static int anInt2589;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	public static boolean aBoolean109;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	public static int anInt2593;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "[Lclient!n;")
	public static Class52[] aClass52Array1;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	private static int anInt2594;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Z")
	private static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!we;)Z")
	private static boolean method1791(@OriginalArg(0) Class62 arg0) {
		if (!aBoolean110) {
			@Pc(7) byte[] local7 = arg0.method1512(0, 0);
			if (local7 == null) {
				return false;
			}
			method1797(local7);
			aBoolean110 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
	public static int method1793() {
		@Pc(7) int local7 = aByteArray65[anInt2594] >> anInt2589 & 0x1;
		anInt2589++;
		anInt2594 += anInt2589 >> 3;
		anInt2589 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)F")
	public static float method1794(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public static int method1795(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2589) {
			local8 = 8 - anInt2589;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray65[anInt2594] >> anInt2589 & local14) << local3;
			anInt2589 = 0;
			anInt2594++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray65[anInt2594] >> anInt2589 & local8) << local3;
			anInt2589 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!we;I)Lclient!uc;")
	public static Class76 method1796(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		if (method1791(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1509(arg1);
			return local14 == null ? null : new Class76(local14);
		} else {
			arg0.method1505(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([B)V")
	private static void method1797(@OriginalArg(0) byte[] arg0) {
		method1800(arg0);
		anInt2591 = 0x1 << method1795(4);
		anInt2590 = 0x1 << method1795(4);
		aFloatArray4 = new float[anInt2590];
		aFloatArray9 = new float[anInt2590];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2591 : anInt2590;
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
			local194 = Static58.method1065(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static81.method1418(local196, local194);
			}
			if (local20 == 0) {
				aFloatArray7 = local42;
				aFloatArray5 = local87;
				aFloatArray6 = local139;
				anIntArray370 = local188;
			} else {
				aFloatArray8 = local42;
				aFloatArray2 = local87;
				aFloatArray3 = local139;
				anIntArray369 = local188;
			}
		}
		local27 = method1795(8) + 1;
		aClass52Array1 = new Class52[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass52Array1[local31] = new Class52();
		}
		local35 = method1795(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1795(16);
		}
		@Pc(272) int local272 = method1795(6) + 1;
		aClass23Array1 = new Class23[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass23Array1[local44] = new Class23();
		}
		@Pc(293) int local293 = method1795(6) + 1;
		aClass21Array1 = new Class21[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass21Array1[local89] = new Class21();
		}
		@Pc(314) int local314 = method1795(6) + 1;
		aClass26Array1 = new Class26[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass26Array1[local141] = new Class26();
		}
		@Pc(335) int local335 = method1795(6) + 1;
		aBooleanArray16 = new boolean[local335];
		anIntArray368 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray16[local194] = method1793() != 0;
			method1795(16);
			method1795(16);
			anIntArray368[local194] = method1795(8);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	public static void method1799() {
		aByteArray65 = null;
		aClass52Array1 = null;
		aClass23Array1 = null;
		aClass21Array1 = null;
		aClass26Array1 = null;
		aBooleanArray16 = null;
		anIntArray368 = null;
		aFloatArray9 = null;
		aFloatArray4 = null;
		aFloatArray7 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray8 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		anIntArray370 = null;
		anIntArray369 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BI)V")
	public static void method1800(@OriginalArg(0) byte[] arg0) {
		aByteArray65 = arg0;
		anInt2594 = 0;
		anInt2589 = 0;
	}
}
