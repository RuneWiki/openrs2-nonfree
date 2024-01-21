import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "[Lclient!le;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	private static int anInt1480;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[Lclient!ta;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "[Lclient!ic;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1483;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	private static int anInt1484;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public static int anInt1489;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "[B")
	private static byte[] aByteArray22;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
	private static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ff;I)Lclient!hd;")
	public static Class30 method857(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		if (method862(arg0)) {
			@Pc(14) byte[] local14 = arg0.method372(arg1);
			return local14 == null ? null : new Class30(local14);
		} else {
			arg0.method394(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()I")
	public static int method858() {
		@Pc(7) int local7 = aByteArray22[anInt1480] >> anInt1484 & 0x1;
		anInt1484++;
		anInt1480 += anInt1484 >> 3;
		anInt1484 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([B)V")
	private static void method859(@OriginalArg(0) byte[] arg0) {
		method860(arg0);
		anInt1483 = 0x1 << method864(4);
		anInt1481 = 0x1 << method864(4);
		aFloatArray6 = new float[anInt1481];
		aFloatArray5 = new float[anInt1481];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt1483 : anInt1481;
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
			local194 = Static59.method1046(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static64.method1079(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray3 = local42;
				aFloatArray7 = local87;
				aFloatArray1 = local139;
				anIntArray189 = local188;
			} else {
				aFloatArray2 = local42;
				aFloatArray4 = local87;
				aFloatArray8 = local139;
				anIntArray187 = local188;
			}
		}
		local27 = method864(8) + 1;
		aClass67Array1 = new Class67[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass67Array1[local31] = new Class67();
		}
		local35 = method864(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method864(16);
		}
		@Pc(272) int local272 = method864(6) + 1;
		aClass46Array1 = new Class46[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass46Array1[local44] = new Class46();
		}
		@Pc(293) int local293 = method864(6) + 1;
		aClass35Array1 = new Class35[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass35Array1[local89] = new Class35();
		}
		@Pc(314) int local314 = method864(6) + 1;
		aClass5Array1 = new Class5[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass5Array1[local141] = new Class5();
		}
		@Pc(335) int local335 = method864(6) + 1;
		aBooleanArray12 = new boolean[local335];
		anIntArray188 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray12[local194] = method858() != 0;
			method864(16);
			method864(16);
			anIntArray188[local194] = method864(8);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)V")
	public static void method860(@OriginalArg(0) byte[] arg0) {
		aByteArray22 = arg0;
		anInt1480 = 0;
		anInt1484 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ff;)Z")
	private static boolean method862(@OriginalArg(0) Class11 arg0) {
		if (!aBoolean96) {
			@Pc(7) byte[] local7 = arg0.method383(0, 0);
			if (local7 == null) {
				return false;
			}
			method859(local7);
			aBoolean96 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public static int method864(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1484) {
			local8 = 8 - anInt1484;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray22[anInt1480] >> anInt1484 & local14) << local3;
			anInt1484 = 0;
			anInt1480++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray22[anInt1480] >> anInt1484 & local8) << local3;
			anInt1484 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)F")
	public static float method865(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
	public static void method866() {
		aByteArray22 = null;
		aClass67Array1 = null;
		aClass46Array1 = null;
		aClass35Array1 = null;
		aClass5Array1 = null;
		aBooleanArray12 = null;
		anIntArray188 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray7 = null;
		aFloatArray1 = null;
		aFloatArray2 = null;
		aFloatArray4 = null;
		aFloatArray8 = null;
		anIntArray189 = null;
		anIntArray187 = null;
	}
}
