import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[S")
	public static short[] aShortArray143 = new short[256];

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)Z")
	public static boolean method5439() {
		try {
			if (Static410.anInt6753 == 2) {
				if (Static48.aClass3_Sub40_1 == null) {
					Static48.aClass3_Sub40_1 = Static463.method4955(Static50.aClass32_21, Static181.anInt3614, Static120.anInt2585);
					if (Static48.aClass3_Sub40_1 == null) {
						return false;
					}
				}
				if (Static36.aClass140_1 == null) {
					Static36.aClass140_1 = new Class140(Static33.aClass32_11, Static377.aClass32_80);
				}
				if (Static452.aClass3_Sub5_Sub4_3.method5133(Static48.aClass3_Sub40_1, Static344.aClass32_75, Static36.aClass140_1)) {
					Static452.aClass3_Sub5_Sub4_3.method5145();
					Static452.aClass3_Sub5_Sub4_3.method5155(Static61.anInt1580);
					Static452.aClass3_Sub5_Sub4_3.method5131(Static193.aBoolean332, Static48.aClass3_Sub40_1);
					Static50.aClass32_21 = null;
					Static36.aClass140_1 = null;
					Static410.anInt6753 = 0;
					Static48.aClass3_Sub40_1 = null;
					return true;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static452.aClass3_Sub5_Sub4_3.method5157();
			Static48.aClass3_Sub40_1 = null;
			Static50.aClass32_21 = null;
			Static410.anInt6753 = 0;
			Static36.aClass140_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLclient!cu;)V")
	public static void method5445(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aByteArray46.length - arg0.anInt3235 < 1) {
			return;
		}
		@Pc(25) int local25 = arg0.method2582();
		if (local25 < 0 || local25 > 1 || arg0.aByteArray46.length - arg0.anInt3235 < 2) {
			return;
		}
		@Pc(50) int local50 = arg0.method2588();
		if (arg0.aByteArray46.length - arg0.anInt3235 != local50 * 6) {
			return;
		}
		while (true) {
			@Pc(66) int local66;
			@Pc(70) int local70;
			do {
				do {
					do {
						if (arg0.aByteArray46.length <= arg0.anInt3235) {
							return;
						}
						local66 = arg0.method2588();
						local70 = arg0.method2589();
					} while (Static407.anIntArray453.length <= local66);
				} while (!Static20.aBooleanArray4[local66]);
			} while (Static369.aClass254_1.method5382(local66).aChar1 == '1' && (local70 < -1 || local70 > 1));
			Static407.anIntArray453[local66] = local70;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZB)V")
	public static void method5446() {
		Static30.method641(Static189.aClass217_70);
		for (@Pc(20) Class3_Sub9 local20 = (Class3_Sub9) Static318.aClass11_42.method313(); local20 != null; local20 = (Class3_Sub9) Static318.aClass11_42.method316()) {
			if (!local20.method5978()) {
				local20 = (Class3_Sub9) Static318.aClass11_42.method313();
				if (local20 == null) {
					break;
				}
			}
			if (local20.anInt1803 == 0) {
				Static434.method5676(true, true, local20);
			}
		}
		if (Static318.aClass156_17 != null) {
			Static386.method5010(Static318.aClass156_17);
			Static318.aClass156_17 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V")
	public static void method5447() {
		Static257.aClass126_29.method3135();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[FIF)V")
	public static void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(7) int local7 = arg1 - arg7;
		@Pc(11) int local11 = arg3 - arg2;
		@Pc(41) float local41 = arg6[2] * (float) local3 + arg6[1] * (float) local7 + arg6[0] * (float) local11;
		@Pc(62) float local62 = arg6[3] * (float) local11 + arg6[4] * (float) local7 + (float) local3 * arg6[5];
		@Pc(83) float local83 = (float) local7 * arg6[7] + arg6[6] * (float) local11 + (float) local3 * arg6[8];
		@Pc(98) float local98 = (float) Math.sqrt((double) (local41 * local41 + local62 * local62 + local83 * local83));
		@Pc(109) float local109 = (float) Math.atan2((double) local41, (double) local83) / 6.2831855F + 0.5F;
		@Pc(122) float local122 = (float) Math.asin((double) (local62 / local98)) / 3.1415927F + arg8 + 0.5F;
		@Pc(127) float local127;
		if (arg0 == 1) {
			local127 = local109;
			local109 = -local122;
			local122 = local127;
		} else if (arg0 == 2) {
			local109 = -local109;
			local122 = -local122;
		} else if (arg0 == 3) {
			local127 = local109;
			local109 = local122;
			local122 = -local127;
		}
		Static344.aFloat66 = local122;
		Static406.aFloat73 = local109;
	}
}
