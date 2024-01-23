import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[Lclient!ci;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "[Lclient!kl;")
	public static Class95[] aClass95Array1;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[B")
	private static byte[] aByteArray68;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public static int anInt4842;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	private static int anInt4845;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "[Lclient!qh;")
	public static Class147[] aClass147Array1;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "[I")
	public static int[] anIntArray429;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	private static int anInt4849;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "[Lclient!qe;")
	public static Class144[] aClass144Array1;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Z")
	private static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)V")
	public static void method4170(@OriginalArg(0) byte[] arg0) {
		aByteArray68 = arg0;
		anInt4849 = 0;
		anInt4845 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
	public static int method4171(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt4845) {
			local12 = 8 - anInt4845;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray68[anInt4849] >> anInt4845 & local18) << local3;
			anInt4845 = 0;
			anInt4849++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray68[anInt4849] >> anInt4845 & local12) << local3;
			anInt4845 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!nk;)Z")
	private static boolean method4172(@OriginalArg(0) Class121 arg0) {
		if (!aBoolean333) {
			@Pc(7) byte[] local7 = arg0.method3115(0, 0);
			if (local7 == null) {
				return false;
			}
			method4174(local7);
			aBoolean333 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
	public static int method4173() {
		@Pc(7) int local7 = aByteArray68[anInt4849] >> anInt4845 & 0x1;
		anInt4845++;
		anInt4849 += anInt4845 >> 3;
		anInt4845 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([B)V")
	private static void method4174(@OriginalArg(0) byte[] arg0) {
		method4170(arg0);
		anInt4842 = 0x1 << method4171(4);
		anInt4846 = 0x1 << method4171(4);
		aFloatArray21 = new float[anInt4846];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt4842 : anInt4846;
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
			@Pc(193) int local193 = Static63.method2810(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static239.method3683(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray17 = local41;
				aFloatArray20 = local86;
				aFloatArray18 = local138;
				anIntArray428 = local187;
			} else {
				aFloatArray16 = local41;
				aFloatArray22 = local86;
				aFloatArray19 = local138;
				anIntArray427 = local187;
			}
		}
		local17 = method4171(8) + 1;
		aClass147Array1 = new Class147[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass147Array1[local26] = new Class147();
		}
		local26 = method4171(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method4171(16);
		}
		local26 = method4171(6) + 1;
		aClass95Array1 = new Class95[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass95Array1[local30] = new Class95();
		}
		local30 = method4171(6) + 1;
		aClass25Array1 = new Class25[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass25Array1[local34] = new Class25();
		}
		local34 = method4171(6) + 1;
		aClass144Array1 = new Class144[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass144Array1[local38] = new Class144();
		}
		local38 = method4171(6) + 1;
		aBooleanArray21 = new boolean[local38];
		anIntArray429 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray21[local340] = method4173() != 0;
			method4171(16);
			method4171(16);
			anIntArray429[local340] = method4171(8);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!nk;II)Lclient!ta;")
	public static Class1_Sub28 method4176(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4172(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3115(arg1, arg2);
			return local16 == null ? null : new Class1_Sub28(local16);
		} else {
			arg0.method3110(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)F")
	public static float method4178(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
