import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "[Lclient!pc;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "[B")
	private static byte[] aByteArray22;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "[Lclient!fc;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "[Lclient!qm;")
	public static Class138[] aClass138Array1;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "[Lclient!lf;")
	public static Class101[] aClass101Array1;

	@OriginalMember(owner = "client!km", name = "M", descriptor = "I")
	private static int anInt2825;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!km", name = "O", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!km", name = "P", descriptor = "I")
	public static int anInt2826;

	@OriginalMember(owner = "client!km", name = "R", descriptor = "I")
	private static int anInt2828;

	@OriginalMember(owner = "client!km", name = "U", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
	private static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!pk;II)Lclient!km;")
	public static Class8_Sub19 method2249(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2257(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3194(arg1, arg2);
			return local16 == null ? null : new Class8_Sub19(local16);
		} else {
			arg0.method3180(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()I")
	public static int method2250() {
		@Pc(7) int local7 = aByteArray22[anInt2825] >> anInt2828 & 0x1;
		anInt2828++;
		anInt2825 += anInt2828 >> 3;
		anInt2828 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BI)V")
	public static void method2252(@OriginalArg(0) byte[] arg0) {
		aByteArray22 = arg0;
		anInt2825 = 0;
		anInt2828 = 0;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	public static int method2253(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt2828) {
			local12 = 8 - anInt2828;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray22[anInt2825] >> anInt2828 & local18) << local3;
			anInt2828 = 0;
			anInt2825++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray22[anInt2825] >> anInt2828 & local12) << local3;
			anInt2828 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "([B)V")
	private static void method2256(@OriginalArg(0) byte[] arg0) {
		method2252(arg0);
		anInt2826 = 0x1 << method2253(4);
		anInt2830 = 0x1 << method2253(4);
		aFloatArray7 = new float[anInt2830];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt2826 : anInt2830;
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
			@Pc(193) int local193 = Static151.method3103(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static69.method1134(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray11 = local41;
				aFloatArray12 = local86;
				aFloatArray10 = local138;
				anIntArray228 = local187;
			} else {
				aFloatArray13 = local41;
				aFloatArray8 = local86;
				aFloatArray14 = local138;
				anIntArray227 = local187;
			}
		}
		local17 = method2253(8) + 1;
		aClass53Array1 = new Class53[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass53Array1[local26] = new Class53();
		}
		local26 = method2253(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method2253(16);
		}
		local26 = method2253(6) + 1;
		aClass128Array1 = new Class128[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass128Array1[local30] = new Class128();
		}
		local30 = method2253(6) + 1;
		aClass101Array1 = new Class101[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass101Array1[local34] = new Class101();
		}
		local34 = method2253(6) + 1;
		aClass138Array1 = new Class138[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass138Array1[local38] = new Class138();
		}
		local38 = method2253(6) + 1;
		aBooleanArray12 = new boolean[local38];
		anIntArray229 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray12[local340] = method2250() != 0;
			method2253(16);
			method2253(16);
			anIntArray229[local340] = method2253(8);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!pk;)Z")
	private static boolean method2257(@OriginalArg(0) Class132 arg0) {
		if (!aBoolean234) {
			@Pc(7) byte[] local7 = arg0.method3194(0, 0);
			if (local7 == null) {
				return false;
			}
			method2256(local7);
			aBoolean234 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)F")
	public static float method2258(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
