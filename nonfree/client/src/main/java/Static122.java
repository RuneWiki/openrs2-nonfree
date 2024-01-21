import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
	public static boolean aBoolean183;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	private static int anInt3294;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt3295;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[Lclient!lf;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[Lclient!hf;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public static int anInt3297;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "[Lclient!ka;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[B")
	private static byte[] aByteArray36;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private static int anInt3302;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[Lclient!me;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Z")
	private static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ge;I)Lclient!wc;")
	public static Class76 method2153(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		if (method2155(arg0)) {
			@Pc(14) byte[] local14 = arg0.method117(arg1);
			return local14 == null ? null : new Class76(local14);
		} else {
			arg0.method115(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
	private static void method2154(@OriginalArg(0) byte[] arg0) {
		method2156(arg0);
		anInt3300 = 0x1 << method2159(4);
		anInt3297 = 0x1 << method2159(4);
		aFloatArray3 = new float[anInt3297];
		aFloatArray6 = new float[anInt3297];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt3300 : anInt3297;
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
			local194 = Static54.method1096(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static109.method2032(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray5 = local42;
				aFloatArray4 = local87;
				aFloatArray2 = local139;
				anIntArray369 = local188;
			} else {
				aFloatArray8 = local42;
				aFloatArray7 = local87;
				aFloatArray9 = local139;
				anIntArray368 = local188;
			}
		}
		local27 = method2159(8) + 1;
		aClass32Array1 = new Class32[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass32Array1[local31] = new Class32();
		}
		local35 = method2159(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method2159(16);
		}
		@Pc(272) int local272 = method2159(6) + 1;
		aClass40Array1 = new Class40[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass40Array1[local44] = new Class40();
		}
		@Pc(293) int local293 = method2159(6) + 1;
		aClass46Array1 = new Class46[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass46Array1[local89] = new Class46();
		}
		@Pc(314) int local314 = method2159(6) + 1;
		aClass51Array1 = new Class51[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass51Array1[local141] = new Class51();
		}
		@Pc(335) int local335 = method2159(6) + 1;
		aBooleanArray15 = new boolean[local335];
		anIntArray370 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray15[local194] = method2160() != 0;
			method2159(16);
			method2159(16);
			anIntArray370[local194] = method2159(8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ge;)Z")
	private static boolean method2155(@OriginalArg(0) Class7 arg0) {
		if (!aBoolean185) {
			@Pc(7) byte[] local7 = arg0.method110(0, 0);
			if (local7 == null) {
				return false;
			}
			method2154(local7);
			aBoolean185 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI)V")
	public static void method2156(@OriginalArg(0) byte[] arg0) {
		aByteArray36 = arg0;
		anInt3294 = 0;
		anInt3302 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public static void method2157() {
		aByteArray36 = null;
		aClass32Array1 = null;
		aClass40Array1 = null;
		aClass46Array1 = null;
		aClass51Array1 = null;
		aBooleanArray15 = null;
		anIntArray370 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray2 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		aFloatArray9 = null;
		anIntArray369 = null;
		anIntArray368 = null;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public static int method2159(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3302) {
			local8 = 8 - anInt3302;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray36[anInt3294] >> anInt3302 & local14) << local3;
			anInt3302 = 0;
			anInt3294++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray36[anInt3294] >> anInt3302 & local8) << local3;
			anInt3302 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
	public static int method2160() {
		@Pc(7) int local7 = aByteArray36[anInt3294] >> anInt3302 & 0x1;
		anInt3302++;
		anInt3294 += anInt3302 >> 3;
		anInt3302 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)F")
	public static float method2162(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
