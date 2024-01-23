import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "[Lclient!kn;")
	public static Class94[] aClass94Array1;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt530;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
	public static int[] anIntArray69;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "[B")
	private static byte[] aByteArray9;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
	public static int anInt533;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "[Lclient!ec;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
	private static int anInt534;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "[Lclient!fm;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	private static int anInt535;

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "[Lclient!md;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
	private static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!cg;)Z")
	private static boolean method535(@OriginalArg(0) Class22 arg0) {
		if (!aBoolean39) {
			@Pc(7) byte[] local7 = arg0.method665(0, 0);
			if (local7 == null) {
				return false;
			}
			method536(local7);
			aBoolean39 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
	private static void method536(@OriginalArg(0) byte[] arg0) {
		method542(arg0);
		anInt530 = 0x1 << method544(4);
		anInt533 = 0x1 << method544(4);
		aFloatArray1 = new float[anInt533];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt530 : anInt533;
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
			@Pc(193) int local193 = Static48.method945(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static184.method2972(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray2 = local41;
				aFloatArray8 = local86;
				aFloatArray7 = local138;
				anIntArray68 = local187;
			} else {
				aFloatArray3 = local41;
				aFloatArray6 = local86;
				aFloatArray5 = local138;
				anIntArray67 = local187;
			}
		}
		local17 = method544(8) + 1;
		aClass38Array1 = new Class38[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass38Array1[local26] = new Class38();
		}
		local26 = method544(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method544(16);
		}
		local26 = method544(6) + 1;
		aClass53Array1 = new Class53[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass53Array1[local30] = new Class53();
		}
		local30 = method544(6) + 1;
		aClass106Array1 = new Class106[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass106Array1[local34] = new Class106();
		}
		local34 = method544(6) + 1;
		aClass94Array1 = new Class94[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass94Array1[local38] = new Class94();
		}
		local38 = method544(6) + 1;
		aBooleanArray9 = new boolean[local38];
		anIntArray69 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray9[local340] = method540() != 0;
			method544(16);
			method544(16);
			anIntArray69[local340] = method544(8);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!cg;II)Lclient!bj;")
	public static Class4_Sub7 method537(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method535(arg0)) {
			@Pc(16) byte[] local16 = arg0.method665(arg1, arg2);
			return local16 == null ? null : new Class4_Sub7(local16);
		} else {
			arg0.method653(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)F")
	public static float method538(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
	public static int method540() {
		@Pc(7) int local7 = aByteArray9[anInt535] >> anInt534 & 0x1;
		anInt534++;
		anInt535 += anInt534 >> 3;
		anInt534 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
	public static void method542(@OriginalArg(0) byte[] arg0) {
		aByteArray9 = arg0;
		anInt535 = 0;
		anInt534 = 0;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public static int method544(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt534) {
			local12 = 8 - anInt534;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray9[anInt535] >> anInt534 & local18) << local3;
			anInt534 = 0;
			anInt535++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray9[anInt535] >> anInt534 & local12) << local3;
			anInt534 += arg0;
		}
		return local1;
	}
}
