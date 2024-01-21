import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[Lclient!qa;")
	public static Class63[] aClass63Array1;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public static int anInt2530;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[B")
	private static byte[] aByteArray39;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lclient!je;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt2532;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[Lclient!wb;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	public static int anInt2534;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private static int anInt2535;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	public static boolean aBoolean109;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[Lclient!ue;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	public static int anInt2537;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	private static int anInt2539;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Z")
	private static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!g;II)Lclient!ub;")
	public static Class75 method1746(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1755(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1358(arg2, arg1);
			return local16 == null ? null : new Class75(local16);
		} else {
			arg0.method1375(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public static int method1747(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2539) {
			local8 = 8 - anInt2539;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray39[anInt2535] >> anInt2539 & local14) << local3;
			anInt2539 = 0;
			anInt2535++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray39[anInt2535] >> anInt2539 & local8) << local3;
			anInt2539 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
	public static void method1751() {
		aByteArray39 = null;
		aClass38Array1 = null;
		aClass63Array1 = null;
		aClass78Array1 = null;
		aClass80Array1 = null;
		aBooleanArray13 = null;
		anIntArray366 = null;
		aFloatArray9 = null;
		aFloatArray3 = null;
		aFloatArray7 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray2 = null;
		anIntArray364 = null;
		anIntArray365 = null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)F")
	public static float method1752(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
	public static void method1753(@OriginalArg(0) byte[] arg0) {
		aByteArray39 = arg0;
		anInt2535 = 0;
		anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "([B)V")
	private static void method1754(@OriginalArg(0) byte[] arg0) {
		method1753(arg0);
		anInt2532 = 0x1 << method1747(4);
		anInt2530 = 0x1 << method1747(4);
		aFloatArray3 = new float[anInt2530];
		aFloatArray9 = new float[anInt2530];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2532 : anInt2530;
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
			local194 = Static124.method1871(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static63.method1001(local196, local194);
			}
			if (local20 == 0) {
				aFloatArray7 = local42;
				aFloatArray5 = local87;
				aFloatArray4 = local139;
				anIntArray364 = local188;
			} else {
				aFloatArray8 = local42;
				aFloatArray6 = local87;
				aFloatArray2 = local139;
				anIntArray365 = local188;
			}
		}
		local27 = method1747(8) + 1;
		aClass38Array1 = new Class38[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass38Array1[local31] = new Class38();
		}
		local35 = method1747(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1747(16);
		}
		@Pc(272) int local272 = method1747(6) + 1;
		aClass63Array1 = new Class63[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass63Array1[local44] = new Class63();
		}
		@Pc(293) int local293 = method1747(6) + 1;
		aClass78Array1 = new Class78[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass78Array1[local89] = new Class78();
		}
		@Pc(314) int local314 = method1747(6) + 1;
		aClass80Array1 = new Class80[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass80Array1[local141] = new Class80();
		}
		@Pc(335) int local335 = method1747(6) + 1;
		aBooleanArray13 = new boolean[local335];
		anIntArray366 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray13[local194] = method1756() != 0;
			method1747(16);
			method1747(16);
			anIntArray366[local194] = method1747(8);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!g;)Z")
	private static boolean method1755(@OriginalArg(0) Class26 arg0) {
		if (!aBoolean108) {
			@Pc(7) byte[] local7 = arg0.method1358(0, 0);
			if (local7 == null) {
				return false;
			}
			method1754(local7);
			aBoolean108 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
	public static int method1756() {
		@Pc(7) int local7 = aByteArray39[anInt2535] >> anInt2539 & 0x1;
		anInt2539++;
		anInt2535 += anInt2539 >> 3;
		anInt2539 &= 0x7;
		return local7;
	}
}
