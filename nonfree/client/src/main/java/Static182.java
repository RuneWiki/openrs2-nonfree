import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "[Lclient!al;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
	public static int anInt3801;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	private static int anInt3804;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "[Lclient!ol;")
	public static Class124[] aClass124Array1;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "[Lclient!s;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "[B")
	private static byte[] aByteArray51;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
	public static int anInt3806;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "[Lclient!md;")
	public static Class102[] aClass102Array1;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
	private static int anInt3807;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
	private static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!km;II)Lclient!nm;")
	public static Class1_Sub24 method3050(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3058(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2495(arg1, arg2);
			return local16 == null ? null : new Class1_Sub24(local16);
		} else {
			arg0.method2515(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)F")
	public static float method3051(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()I")
	public static int method3053() {
		@Pc(7) int local7 = aByteArray51[anInt3804] >> anInt3807 & 0x1;
		anInt3807++;
		anInt3804 += anInt3807 >> 3;
		anInt3807 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I")
	public static int method3055(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt3807) {
			local12 = 8 - anInt3807;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray51[anInt3804] >> anInt3807 & local18) << local3;
			anInt3807 = 0;
			anInt3804++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray51[anInt3804] >> anInt3807 & local12) << local3;
			anInt3807 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)V")
	public static void method3056(@OriginalArg(0) byte[] arg0) {
		aByteArray51 = arg0;
		anInt3804 = 0;
		anInt3807 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!km;)Z")
	private static boolean method3058(@OriginalArg(0) Class91 arg0) {
		if (!aBoolean288) {
			@Pc(7) byte[] local7 = arg0.method2495(0, 0);
			if (local7 == null) {
				return false;
			}
			method3059(local7);
			aBoolean288 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "([B)V")
	private static void method3059(@OriginalArg(0) byte[] arg0) {
		method3056(arg0);
		anInt3806 = 0x1 << method3055(4);
		anInt3801 = 0x1 << method3055(4);
		aFloatArray12 = new float[anInt3801];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt3806 : anInt3801;
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
			@Pc(193) int local193 = Static52.method1026(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static104.method1939(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray11 = local41;
				aFloatArray18 = local86;
				aFloatArray17 = local138;
				anIntArray342 = local187;
			} else {
				aFloatArray16 = local41;
				aFloatArray15 = local86;
				aFloatArray13 = local138;
				anIntArray341 = local187;
			}
		}
		local17 = method3055(8) + 1;
		aClass102Array1 = new Class102[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass102Array1[local26] = new Class102();
		}
		local26 = method3055(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method3055(16);
		}
		local26 = method3055(6) + 1;
		aClass8Array1 = new Class8[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass8Array1[local30] = new Class8();
		}
		local30 = method3055(6) + 1;
		aClass124Array1 = new Class124[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass124Array1[local34] = new Class124();
		}
		local34 = method3055(6) + 1;
		aClass150Array1 = new Class150[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass150Array1[local38] = new Class150();
		}
		local38 = method3055(6) + 1;
		aBooleanArray36 = new boolean[local38];
		anIntArray343 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray36[local340] = method3053() != 0;
			method3055(16);
			method3055(16);
			anIntArray343[local340] = method3055(8);
		}
	}
}
