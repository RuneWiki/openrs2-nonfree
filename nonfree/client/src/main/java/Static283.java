import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	private static int anInt5582;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[Lclient!q;")
	public static Class141[] aClass141Array1;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "[Lclient!wi;")
	public static Class195[] aClass195Array1;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	private static int anInt5583;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "[Lclient!mj;")
	public static Class113[] aClass113Array1;

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "[Lclient!ef;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Z")
	private static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([B)V")
	private static void method4406(@OriginalArg(0) byte[] arg0) {
		method4413(arg0);
		anInt5589 = 0x1 << method4411(4);
		anInt5584 = 0x1 << method4411(4);
		aFloatArray25 = new float[anInt5584];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt5589 : anInt5584;
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
			@Pc(193) int local193 = Static287.method4461(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static33.method649(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray21 = local41;
				aFloatArray22 = local86;
				aFloatArray24 = local138;
				anIntArray531 = local187;
			} else {
				aFloatArray26 = local41;
				aFloatArray23 = local86;
				aFloatArray20 = local138;
				anIntArray532 = local187;
			}
		}
		local17 = method4411(8) + 1;
		aClass195Array1 = new Class195[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass195Array1[local26] = new Class195();
		}
		local26 = method4411(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method4411(16);
		}
		local26 = method4411(6) + 1;
		aClass113Array1 = new Class113[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass113Array1[local30] = new Class113();
		}
		local30 = method4411(6) + 1;
		aClass39Array1 = new Class39[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass39Array1[local34] = new Class39();
		}
		local34 = method4411(6) + 1;
		aClass141Array1 = new Class141[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass141Array1[local38] = new Class141();
		}
		local38 = method4411(6) + 1;
		aBooleanArray21 = new boolean[local38];
		anIntArray533 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray21[local340] = method4407() != 0;
			method4411(16);
			method4411(16);
			anIntArray533[local340] = method4411(8);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
	public static int method4407() {
		@Pc(7) int local7 = aByteArray67[anInt5582] >> anInt5583 & 0x1;
		anInt5583++;
		anInt5582 += anInt5583 >> 3;
		anInt5583 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ek;II)Lclient!uh;")
	public static Class2_Sub28 method4408(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4409(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1256(arg1, arg2);
			return local16 == null ? null : new Class2_Sub28(local16);
		} else {
			arg0.method1273(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ek;)Z")
	private static boolean method4409(@OriginalArg(0) Class42 arg0) {
		if (!aBoolean367) {
			@Pc(7) byte[] local7 = arg0.method1256(0, 0);
			if (local7 == null) {
				return false;
			}
			method4406(local7);
			aBoolean367 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)F")
	public static float method4410(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I")
	public static int method4411(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt5583) {
			local12 = 8 - anInt5583;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray67[anInt5582] >> anInt5583 & local18) << local3;
			anInt5583 = 0;
			anInt5582++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray67[anInt5582] >> anInt5583 & local12) << local3;
			anInt5583 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([BI)V")
	public static void method4413(@OriginalArg(0) byte[] arg0) {
		aByteArray67 = arg0;
		anInt5582 = 0;
		anInt5583 = 0;
	}
}
