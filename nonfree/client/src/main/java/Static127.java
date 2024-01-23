import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt2542;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static int anInt2543 = 0;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "[Lclient!vk;")
	public static Class1_Sub1_Sub24[] aClass1_Sub1_Sub24Array2 = new Class1_Sub1_Sub24[14];

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public static int anInt2547 = -1;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString89 = "flash3:";

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method2016() {
		if (Static59.anInt1177 == -1 || Static218.anInt4282 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static206.anInt4066 * (Static119.anInt5874 - Static148.anInt2977) >> 16) + Static148.anInt2977;
		Static206.anInt4066 += local25;
		if (Static206.anInt4066 >= 65535) {
			if (Static216.aBoolean290) {
				Static33.aBoolean45 = false;
			} else {
				Static33.aBoolean45 = true;
			}
			Static216.aBoolean290 = true;
			Static206.anInt4066 = 65535;
		} else {
			Static33.aBoolean45 = false;
			Static216.aBoolean290 = false;
		}
		@Pc(56) int local56 = Static286.anInt5443 * 2;
		@Pc(61) float local61 = (float) Static206.anInt4066 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(79) int local79;
		@Pc(91) int local91;
		@Pc(132) int local132;
		@Pc(99) int local99;
		@Pc(137) int local137;
		@Pc(146) int local146;
		@Pc(165) int local165;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			local79 = Static162.anIntArrayArrayArray10[Static59.anInt1177][local56][local66] * 3;
			local91 = Static162.anIntArrayArrayArray10[Static59.anInt1177][local56 + 1][local66] * 3;
			local99 = Static162.anIntArrayArrayArray10[Static59.anInt1177][local56][local66];
			local132 = (Static162.anIntArrayArrayArray10[Static59.anInt1177][local56 + 2][local66] + Static162.anIntArrayArrayArray10[Static59.anInt1177][local56 + 2][local66] - Static162.anIntArrayArrayArray10[Static59.anInt1177][local56 + 3][local66]) * 3;
			local137 = local91 - local79;
			local146 = local132 + local79 - local91 * 2;
			local165 = Static162.anIntArrayArrayArray10[Static59.anInt1177][local56 + 2][local66] + local91 - local132 - local99;
			local64[local66] = (float) local99 + (local61 * ((float) local146 + (float) local165 * local61) + (float) local137) * local61;
		}
		Static243.anInt5653 = (int) local64[0] - Static290.anInt5497 * 128;
		Static141.anInt2760 = (int) local64[1] * -1;
		Static105.anInt2016 = (int) local64[2] - Static118.anInt2409 * 128;
		@Pc(217) float[] local217 = new float[3];
		local79 = Static132.anInt2670 * 2;
		for (local91 = 0; local91 < 3; local91++) {
			local132 = Static162.anIntArrayArrayArray10[Static218.anInt4282][local79][local91] * 3;
			local99 = Static162.anIntArrayArrayArray10[Static218.anInt4282][local79 + 1][local91] * 3;
			local137 = (Static162.anIntArrayArrayArray10[Static218.anInt4282][local79 + 2][local91] + Static162.anIntArrayArrayArray10[Static218.anInt4282][local79 + 2][local91] - Static162.anIntArrayArrayArray10[Static218.anInt4282][local79 + 3][local91]) * 3;
			local146 = Static162.anIntArrayArrayArray10[Static218.anInt4282][local79][local91];
			@Pc(308) int local308 = Static162.anIntArrayArrayArray10[Static218.anInt4282][local79 - -2][local91] + local99 - local137 - local146;
			@Pc(317) int local317 = local137 + local132 - local99 * 2;
			local165 = local99 - local132;
			local217[local91] = local61 * (((float) local317 + local61 * (float) local308) * local61 + (float) local165) + (float) local146;
		}
		@Pc(354) float local354 = local217[0] - local64[0];
		@Pc(363) float local363 = local217[2] - local64[2];
		@Pc(381) float local381 = (local217[1] - local64[1]) * -1.0F;
		@Pc(391) double local391 = Math.sqrt((double) (local363 * local363 + local354 * local354));
		Static61.aFloat11 = (float) Math.atan2((double) local381, local391);
		Static123.aFloat28 = -((float) Math.atan2((double) local354, (double) local363));
		Static140.anInt2757 = (int) ((double) Static61.aFloat11 * 325.949D) & 0x7FF;
		Static262.anInt2349 = (int) ((double) Static123.aFloat28 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)Lclient!qk;")
	public static Class148 method2017(@OriginalArg(0) int arg0) {
		@Pc(10) Class148 local10 = (Class148) Static272.aClass169_143.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static137.aClass138_44.method3346(0, arg0);
		local10 = new Class148();
		if (local20 != null) {
			local10.method3596(new Class1_Sub14(local20));
		}
		local10.method3599();
		Static272.aClass169_143.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
	public static int method2018(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILclient!qf;I)V")
	public static void method2019(@OriginalArg(1) int arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte21 == 0) {
			arg1.anInt4385 = arg1.anInt4382;
		} else if (arg1.aByte21 == 1) {
			arg1.anInt4385 = (arg2 - arg1.anInt4371) / 2 + arg1.anInt4382;
		} else if (arg1.aByte21 == 2) {
			arg1.anInt4385 = arg2 - arg1.anInt4371 - arg1.anInt4382;
		} else if (arg1.aByte21 == 3) {
			arg1.anInt4385 = arg1.anInt4382 * arg2 >> 14;
		} else if (arg1.aByte21 == 4) {
			arg1.anInt4385 = (arg2 - arg1.anInt4371) / 2 + (arg2 * arg1.anInt4382 >> 14);
		} else {
			arg1.anInt4385 = arg2 - (arg2 * arg1.anInt4382 >> 14) - arg1.anInt4371;
		}
		if (arg1.aByte23 == 0) {
			arg1.anInt4340 = arg1.anInt4413;
		} else if (arg1.aByte23 == 1) {
			arg1.anInt4340 = (arg0 - arg1.anInt4345) / 2 + arg1.anInt4413;
		} else if (arg1.aByte23 == 2) {
			arg1.anInt4340 = arg0 - arg1.anInt4413 - arg1.anInt4345;
		} else if (arg1.aByte23 == 3) {
			arg1.anInt4340 = arg0 * arg1.anInt4413 >> 14;
		} else if (arg1.aByte23 == 4) {
			arg1.anInt4340 = (arg0 * arg1.anInt4413 >> 14) + (arg0 - arg1.anInt4345) / 2;
		} else {
			arg1.anInt4340 = arg0 - arg1.anInt4345 - (arg0 * arg1.anInt4413 >> 14);
		}
		if (!Static250.aBoolean231 || Static36.method643(arg1).anInt4031 == 0 && arg1.anInt4370 != 0) {
			return;
		}
		if (arg1.anInt4340 < 0) {
			arg1.anInt4340 = 0;
		} else if (arg1.anInt4345 + arg1.anInt4340 > arg0) {
			arg1.anInt4340 = arg0 - arg1.anInt4345;
		}
		if (arg1.anInt4385 < 0) {
			arg1.anInt4385 = 0;
		} else if (arg1.anInt4371 + arg1.anInt4385 > arg2) {
			arg1.anInt4385 = arg2 - arg1.anInt4371;
		}
	}
}
