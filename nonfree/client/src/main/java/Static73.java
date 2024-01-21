import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt1525;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lclient!gd;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lclient!k;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private static int anInt1527;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public static int anInt1528;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private static int anInt1529;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
	public static boolean aBoolean58;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[Lclient!ce;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[Lclient!vb;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "[B")
	private static byte[] aByteArray19;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt1533;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Z")
	private static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BI)V")
	public static void method1202(@OriginalArg(0) byte[] arg0) {
		aByteArray19 = arg0;
		anInt1527 = 0;
		anInt1529 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
	private static void method1203(@OriginalArg(0) byte[] arg0) {
		method1202(arg0);
		anInt1528 = 0x1 << method1211(4);
		anInt1533 = 0x1 << method1211(4);
		aFloatArray8 = new float[anInt1533];
		aFloatArray7 = new float[anInt1533];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt1528 : anInt1533;
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
			local194 = Static16.method383(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static114.method1832(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray9 = local42;
				aFloatArray5 = local87;
				aFloatArray3 = local139;
				anIntArray287 = local188;
			} else {
				aFloatArray2 = local42;
				aFloatArray6 = local87;
				aFloatArray4 = local139;
				anIntArray286 = local188;
			}
		}
		local27 = method1211(8) + 1;
		aClass44Array1 = new Class44[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass44Array1[local31] = new Class44();
		}
		local35 = method1211(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1211(16);
		}
		@Pc(272) int local272 = method1211(6) + 1;
		aClass28Array1 = new Class28[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass28Array1[local44] = new Class28();
		}
		@Pc(293) int local293 = method1211(6) + 1;
		aClass78Array1 = new Class78[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass78Array1[local89] = new Class78();
		}
		@Pc(314) int local314 = method1211(6) + 1;
		aClass15Array1 = new Class15[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass15Array1[local141] = new Class15();
		}
		@Pc(335) int local335 = method1211(6) + 1;
		aBooleanArray5 = new boolean[local335];
		anIntArray288 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray5[local194] = method1209() != 0;
			method1211(16);
			method1211(16);
			anIntArray288[local194] = method1211(8);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!oc;)Z")
	private static boolean method1205(@OriginalArg(0) Class56 arg0) {
		if (!aBoolean57) {
			@Pc(7) byte[] local7 = arg0.method1269(0, 0);
			if (local7 == null) {
				return false;
			}
			method1203(local7);
			aBoolean57 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!oc;II)Lclient!mb;")
	public static Class52 method1206(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1205(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1269(arg1, arg2);
			return local16 == null ? null : new Class52(local16);
		} else {
			arg0.method1265(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public static void method1207() {
		aByteArray19 = null;
		aClass44Array1 = null;
		aClass28Array1 = null;
		aClass78Array1 = null;
		aClass15Array1 = null;
		aBooleanArray5 = null;
		anIntArray288 = null;
		aFloatArray7 = null;
		aFloatArray8 = null;
		aFloatArray9 = null;
		aFloatArray5 = null;
		aFloatArray3 = null;
		aFloatArray2 = null;
		aFloatArray6 = null;
		aFloatArray4 = null;
		anIntArray287 = null;
		anIntArray286 = null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public static int method1209() {
		@Pc(7) int local7 = aByteArray19[anInt1527] >> anInt1529 & 0x1;
		anInt1529++;
		anInt1527 += anInt1529 >> 3;
		anInt1529 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	public static int method1211(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1529) {
			local8 = 8 - anInt1529;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray19[anInt1527] >> anInt1529 & local14) << local3;
			anInt1529 = 0;
			anInt1527++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray19[anInt1527] >> anInt1529 & local8) << local3;
			anInt1529 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)F")
	public static float method1212(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
