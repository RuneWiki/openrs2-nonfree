import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[Lclient!qf;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt939;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	public static int anInt940;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public static int anInt941;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	private static int anInt942;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt943;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[Lclient!p;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
	public static boolean aBoolean32;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "[Lclient!qa;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "[B")
	private static byte[] aByteArray21;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "[Lclient!l;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
	private static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	public static int method668() {
		@Pc(7) int local7 = aByteArray21[anInt944] >> anInt942 & 0x1;
		anInt942++;
		anInt944 += anInt942 >> 3;
		anInt942 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)V")
	public static void method669(@OriginalArg(0) byte[] arg0) {
		aByteArray21 = arg0;
		anInt944 = 0;
		anInt942 = 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([B)V")
	private static void method670(@OriginalArg(0) byte[] arg0) {
		method669(arg0);
		anInt939 = 0x1 << method675(4);
		anInt943 = 0x1 << method675(4);
		aFloatArray3 = new float[anInt943];
		aFloatArray2 = new float[anInt943];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt939 : anInt943;
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
			local194 = Static28.method601(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static65.method1180(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray5 = local42;
				aFloatArray8 = local87;
				aFloatArray7 = local139;
				anIntArray163 = local188;
			} else {
				aFloatArray1 = local42;
				aFloatArray4 = local87;
				aFloatArray6 = local139;
				anIntArray161 = local188;
			}
		}
		local27 = method675(8) + 1;
		aClass61Array1 = new Class61[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass61Array1[local31] = new Class61();
		}
		local35 = method675(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method675(16);
		}
		@Pc(272) int local272 = method675(6) + 1;
		aClass44Array1 = new Class44[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass44Array1[local44] = new Class44();
		}
		@Pc(293) int local293 = method675(6) + 1;
		aClass56Array1 = new Class56[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass56Array1[local89] = new Class56();
		}
		@Pc(314) int local314 = method675(6) + 1;
		aClass65Array1 = new Class65[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass65Array1[local141] = new Class65();
		}
		@Pc(335) int local335 = method675(6) + 1;
		aBooleanArray13 = new boolean[local335];
		anIntArray162 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray13[local194] = method668() != 0;
			method675(16);
			method675(16);
			anIntArray162[local194] = method675(8);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)F")
	public static float method671(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!kb;II)Lclient!f;")
	public static Class21 method674(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method677(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1710(arg1, arg2);
			return local16 == null ? null : new Class21(local16);
		} else {
			arg0.method1722(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)I")
	public static int method675(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt942) {
			local8 = 8 - anInt942;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray21[anInt944] >> anInt942 & local14) << local3;
			anInt942 = 0;
			anInt944++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray21[anInt944] >> anInt942 & local8) << local3;
			anInt942 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	public static void method676() {
		aByteArray21 = null;
		aClass61Array1 = null;
		aClass44Array1 = null;
		aClass56Array1 = null;
		aClass65Array1 = null;
		aBooleanArray13 = null;
		anIntArray162 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		aFloatArray1 = null;
		aFloatArray4 = null;
		aFloatArray6 = null;
		anIntArray163 = null;
		anIntArray161 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!kb;)Z")
	private static boolean method677(@OriginalArg(0) Class41 arg0) {
		if (!aBoolean31) {
			@Pc(7) byte[] local7 = arg0.method1710(0, 0);
			if (local7 == null) {
				return false;
			}
			method670(local7);
			aBoolean31 = true;
		}
		return true;
	}
}
