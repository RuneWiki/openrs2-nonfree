import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lclient!ln;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
	public static int anInt4916;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "[Lclient!ma;")
	public static Class108[] aClass108Array1;

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
	public static int anInt4917;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "[Lclient!te;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
	private static int anInt4919;

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray116;

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
	private static int anInt4923;

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "[Lclient!gh;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "Z")
	private static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public static int method4100(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt4919) {
			local12 = 8 - anInt4919;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray67[anInt4923] >> anInt4919 & local18) << local3;
			anInt4919 = 0;
			anInt4923++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray67[anInt4923] >> anInt4919 & local12) << local3;
			anInt4919 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)F")
	public static float method4102(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()I")
	public static int method4103() {
		@Pc(7) int local7 = aByteArray67[anInt4923] >> anInt4919 & 0x1;
		anInt4919++;
		anInt4923 += anInt4919 >> 3;
		anInt4919 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "([B)V")
	private static void method4104(@OriginalArg(0) byte[] arg0) {
		method4108(arg0);
		anInt4916 = 0x1 << method4100(4);
		anInt4917 = 0x1 << method4100(4);
		aFloatArray24 = new float[anInt4917];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt4916 : anInt4917;
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
			@Pc(193) int local193 = Static291.method4775(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static84.method1284(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray23 = local41;
				aFloatArray27 = local86;
				aFloatArray22 = local138;
				anIntArray533 = local187;
			} else {
				aFloatArray26 = local41;
				aFloatArray20 = local86;
				aFloatArray21 = local138;
				anIntArray532 = local187;
			}
		}
		local17 = method4100(8) + 1;
		aClass108Array1 = new Class108[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass108Array1[local26] = new Class108();
		}
		local26 = method4100(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method4100(16);
		}
		local26 = method4100(6) + 1;
		aClass106Array1 = new Class106[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass106Array1[local30] = new Class106();
		}
		local30 = method4100(6) + 1;
		aClass65Array1 = new Class65[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass65Array1[local34] = new Class65();
		}
		local34 = method4100(6) + 1;
		aClass169Array1 = new Class169[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass169Array1[local38] = new Class169();
		}
		local38 = method4100(6) + 1;
		aBooleanArray116 = new boolean[local38];
		anIntArray531 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray116[local340] = method4103() != 0;
			method4100(16);
			method4100(16);
			anIntArray531[local340] = method4100(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!rn;II)Lclient!rl;")
	public static Class3_Sub27 method4107(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4109(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4121(arg1, arg2);
			return local16 == null ? null : new Class3_Sub27(local16);
		} else {
			arg0.method4144(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI)V")
	public static void method4108(@OriginalArg(0) byte[] arg0) {
		aByteArray67 = arg0;
		anInt4923 = 0;
		anInt4919 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!rn;)Z")
	private static boolean method4109(@OriginalArg(0) Class155 arg0) {
		if (!aBoolean344) {
			@Pc(7) byte[] local7 = arg0.method4121(0, 0);
			if (local7 == null) {
				return false;
			}
			method4104(local7);
			aBoolean344 = true;
		}
		return true;
	}
}
