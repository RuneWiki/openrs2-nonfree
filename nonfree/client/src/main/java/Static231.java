import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public static int anInt4414;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "[F")
	public static float[] aFloatArray45;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "[Lclient!sf;")
	public static Class158[] aClass158Array1;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "[B")
	private static byte[] aByteArray59;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "[F")
	public static float[] aFloatArray46;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	public static int anInt4416;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[F")
	public static float[] aFloatArray50;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "[Lclient!rd;")
	public static Class152[] aClass152Array1;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
	private static int anInt4419;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	private static int anInt4422;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "[Lclient!bf;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "[Lclient!pd;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
	private static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;)Z")
	private static boolean method3665(@OriginalArg(0) Class58 arg0) {
		if (!aBoolean309) {
			@Pc(7) byte[] local7 = arg0.method1372(0, 0);
			if (local7 == null) {
				return false;
			}
			method3667(local7);
			aBoolean309 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([BI)V")
	public static void method3666(@OriginalArg(0) byte[] arg0) {
		aByteArray59 = arg0;
		anInt4419 = 0;
		anInt4422 = 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([B)V")
	private static void method3667(@OriginalArg(0) byte[] arg0) {
		method3666(arg0);
		anInt4414 = 0x1 << method3674(4);
		anInt4416 = 0x1 << method3674(4);
		aFloatArray50 = new float[anInt4416];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt4414 : anInt4416;
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
			@Pc(193) int local193 = Static170.method2713(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static152.method2433(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray46 = local41;
				aFloatArray49 = local86;
				aFloatArray47 = local138;
				anIntArray469 = local187;
			} else {
				aFloatArray48 = local41;
				aFloatArray51 = local86;
				aFloatArray45 = local138;
				anIntArray470 = local187;
			}
		}
		local17 = method3674(8) + 1;
		aClass134Array1 = new Class134[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass134Array1[local26] = new Class134();
		}
		local26 = method3674(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method3674(16);
		}
		local26 = method3674(6) + 1;
		aClass18Array1 = new Class18[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass18Array1[local30] = new Class18();
		}
		local30 = method3674(6) + 1;
		aClass158Array1 = new Class158[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass158Array1[local34] = new Class158();
		}
		local34 = method3674(6) + 1;
		aClass152Array1 = new Class152[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass152Array1[local38] = new Class152();
		}
		local38 = method3674(6) + 1;
		aBooleanArray23 = new boolean[local38];
		anIntArray468 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray23[local340] = method3669() != 0;
			method3674(16);
			method3674(16);
			anIntArray468[local340] = method3674(8);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()I")
	public static int method3669() {
		@Pc(7) int local7 = aByteArray59[anInt4419] >> anInt4422 & 0x1;
		anInt4422++;
		anInt4419 += anInt4422 >> 3;
		anInt4422 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)F")
	public static float method3671(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;II)Lclient!qn;")
	public static Class4_Sub24 method3673(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3665(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1372(arg1, arg2);
			return local16 == null ? null : new Class4_Sub24(local16);
		} else {
			arg0.method1370(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I")
	public static int method3674(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt4422) {
			local12 = 8 - anInt4422;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray59[anInt4419] >> anInt4422 & local18) << local3;
			anInt4422 = 0;
			anInt4419++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray59[anInt4419] >> anInt4422 & local12) << local3;
			anInt4422 += arg0;
		}
		return local1;
	}
}
