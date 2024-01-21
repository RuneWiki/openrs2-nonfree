import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[Lclient!sc;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[Lclient!re;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	private static int anInt2602;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lclient!pa;")
	public static Class60[] aClass60Array1;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static int anInt2606;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	public static int anInt2609;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	private static int anInt2610;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "[Lclient!hf;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
	private static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	public static int method1876() {
		@Pc(7) int local7 = aByteArray32[anInt2602] >> anInt2610 & 0x1;
		anInt2610++;
		anInt2602 += anInt2610 >> 3;
		anInt2610 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pd;)Z")
	private static boolean method1877(@OriginalArg(0) Class20 arg0) {
		if (!aBoolean130) {
			@Pc(7) byte[] local7 = arg0.method474(0, 0);
			if (local7 == null) {
				return false;
			}
			method1880(local7);
			aBoolean130 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	public static void method1879() {
		aByteArray32 = null;
		aClass68Array1 = null;
		aClass60Array1 = null;
		aClass36Array1 = null;
		aClass71Array1 = null;
		aBooleanArray14 = null;
		anIntArray292 = null;
		aFloatArray9 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray7 = null;
		aFloatArray2 = null;
		anIntArray294 = null;
		anIntArray293 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([B)V")
	private static void method1880(@OriginalArg(0) byte[] arg0) {
		method1886(arg0);
		anInt2609 = 0x1 << method1884(4);
		anInt2604 = 0x1 << method1884(4);
		aFloatArray6 = new float[anInt2604];
		aFloatArray9 = new float[anInt2604];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2609 : anInt2604;
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
			local194 = Static53.method928(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static92.method476(local196, local194);
			}
			if (local20 == 0) {
				aFloatArray3 = local42;
				aFloatArray8 = local87;
				aFloatArray5 = local139;
				anIntArray294 = local188;
			} else {
				aFloatArray4 = local42;
				aFloatArray7 = local87;
				aFloatArray2 = local139;
				anIntArray293 = local188;
			}
		}
		local27 = method1884(8) + 1;
		aClass68Array1 = new Class68[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass68Array1[local31] = new Class68();
		}
		local35 = method1884(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1884(16);
		}
		@Pc(272) int local272 = method1884(6) + 1;
		aClass60Array1 = new Class60[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass60Array1[local44] = new Class60();
		}
		@Pc(293) int local293 = method1884(6) + 1;
		aClass36Array1 = new Class36[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass36Array1[local89] = new Class36();
		}
		@Pc(314) int local314 = method1884(6) + 1;
		aClass71Array1 = new Class71[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass71Array1[local141] = new Class71();
		}
		@Pc(335) int local335 = method1884(6) + 1;
		aBooleanArray14 = new boolean[local335];
		anIntArray292 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray14[local194] = method1876() != 0;
			method1884(16);
			method1884(16);
			anIntArray292[local194] = method1884(8);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pd;II)Lclient!sd;")
	public static Class72 method1882(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1877(arg0)) {
			@Pc(16) byte[] local16 = arg0.method474(arg1, arg2);
			return local16 == null ? null : new Class72(local16);
		} else {
			arg0.method491(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	public static int method1884(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2610) {
			local8 = 8 - anInt2610;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray32[anInt2602] >> anInt2610 & local14) << local3;
			anInt2610 = 0;
			anInt2602++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray32[anInt2602] >> anInt2610 & local8) << local3;
			anInt2610 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)F")
	public static float method1885(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
	public static void method1886(@OriginalArg(0) byte[] arg0) {
		aByteArray32 = arg0;
		anInt2602 = 0;
		anInt2610 = 0;
	}
}
