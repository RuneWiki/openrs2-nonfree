import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "[Lclient!ub;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	private static int anInt4629;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "[Lclient!bh;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public static int anInt4631;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "[Lclient!ql;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "[Lclient!cg;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
	private static int anInt4636;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "[B")
	private static byte[] aByteArray50;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Z")
	private static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I")
	public static int method3731(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt4636) {
			local12 = 8 - anInt4636;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray50[anInt4629] >> anInt4636 & local18) << local3;
			anInt4636 = 0;
			anInt4629++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray50[anInt4629] >> anInt4636 & local12) << local3;
			anInt4636 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V")
	public static void method3732(@OriginalArg(0) byte[] arg0) {
		aByteArray50 = arg0;
		anInt4629 = 0;
		anInt4636 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)F")
	public static float method3734(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!jd;)Z")
	private static boolean method3735(@OriginalArg(0) Class84 arg0) {
		if (!aBoolean387) {
			@Pc(7) byte[] local7 = arg0.method2127(0, 0);
			if (local7 == null) {
				return false;
			}
			method3736(local7);
			aBoolean387 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
	private static void method3736(@OriginalArg(0) byte[] arg0) {
		method3732(arg0);
		anInt4631 = 0x1 << method3731(4);
		anInt4637 = 0x1 << method3731(4);
		aFloatArray22 = new float[anInt4637];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt4631 : anInt4637;
			local30 = local26 >> 1;
			local34 = local26 >> 2;
			local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static137.method2423(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static219.method3697(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray23 = local41;
				aFloatArray25 = local86;
				aFloatArray27 = local138;
				anIntArray387 = local187;
			} else {
				aFloatArray26 = local41;
				aFloatArray28 = local86;
				aFloatArray24 = local138;
				anIntArray388 = local187;
			}
		}
		local17 = method3731(8) + 1;
		aClass18Array1 = new Class18[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass18Array1[local26] = new Class18();
		}
		local26 = method3731(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method3731(16);
		}
		local26 = method3731(6) + 1;
		aClass146Array1 = new Class146[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass146Array1[local30] = new Class146();
		}
		local30 = method3731(6) + 1;
		aClass27Array1 = new Class27[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass27Array1[local34] = new Class27();
		}
		local34 = method3731(6) + 1;
		aClass169Array1 = new Class169[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass169Array1[local38] = new Class169();
		}
		local38 = method3731(6) + 1;
		aBooleanArray22 = new boolean[local38];
		anIntArray389 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray22[local340] = method3738() != 0;
			method3731(16);
			method3731(16);
			anIntArray389[local340] = method3731(8);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()I")
	public static int method3738() {
		@Pc(7) int local7 = aByteArray50[anInt4629] >> anInt4636 & 0x1;
		anInt4636++;
		anInt4629 += anInt4636 >> 3;
		anInt4636 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!jd;II)Lclient!rb;")
	public static Class2_Sub22 method3739(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3735(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2127(arg2, arg1);
			return local16 == null ? null : new Class2_Sub22(local16);
		} else {
			arg0.method2147(arg2, arg1);
			return null;
		}
	}
}
