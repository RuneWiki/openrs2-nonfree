import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString174;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt5214 = 127;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray15 = new byte[1000][];

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString175 = "Loaded fonts";

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[B)Lclient!ti;")
	public static Class4_Sub2_Sub9_Sub2 method4178(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class4_Sub2_Sub9_Sub2 local23 = new Class4_Sub2_Sub9_Sub2(arg0, Static149.anIntArray238, Static278.anIntArray422, Static107.anIntArray188, Static246.anIntArray386, Static99.aByteArrayArray8);
			Static184.method2969();
			return local23;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4180(@OriginalArg(1) long arg0) {
		Static173.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static173.aCalendar1.get(7);
		@Pc(22) int local22 = Static173.aCalendar1.get(5);
		@Pc(26) int local26 = Static173.aCalendar1.get(2);
		@Pc(30) int local30 = Static173.aCalendar1.get(1);
		@Pc(34) int local34 = Static173.aCalendar1.get(11);
		@Pc(38) int local38 = Static173.aCalendar1.get(12);
		@Pc(42) int local42 = Static173.aCalendar1.get(13);
		return Static197.aStringArray26[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static205.aStringArray28[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public static void method4184() {
		if (Static144.anInt2849 == 2) {
			if (Static167.anInt3358 == Static49.anInt1112 && Static73.anInt1479 == Static7.anInt136) {
				Static144.anInt2849 = 0;
				if (Static168.aBoolean217 && Static113.aBooleanArray18[81] && Static286.anInt5602 > 2) {
					Static272.method4319(Static286.anInt5602 - 2);
				} else {
					Static272.method4319(Static286.anInt5602 - 1);
				}
			}
		} else if (Static167.anInt3358 == Static72.anInt1466 && Static8.anInt159 == Static73.anInt1479) {
			Static144.anInt2849 = 0;
			if (Static168.aBoolean217 && Static113.aBooleanArray18[81] && Static286.anInt5602 > 2) {
				Static272.method4319(Static286.anInt5602 - 2);
			} else {
				Static272.method4319(Static286.anInt5602 - 1);
			}
		} else {
			Static49.anInt1112 = Static72.anInt1466;
			Static144.anInt2849 = 2;
			Static7.anInt136 = Static8.anInt159;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!lg;)I")
	public static int method4185(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1) {
		if (!Static41.method791(arg1).method2563(arg0) && arg1.anObjectArray6 == null) {
			return -1;
		} else if (arg1.anIntArray258 == null || arg1.anIntArray258.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray258[arg0];
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBI)I")
	public static int method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([[FI[[FIIZIII[[II[[FIII[[ILclient!bl;F)I")
	public static int method4193(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[][] arg14, @OriginalArg(16) Class4_Sub8 arg15, @OriginalArg(17) float arg16) {
		@Pc(12) int local12;
		if (arg13 == 1) {
			local12 = arg4;
			arg4 = arg9;
			arg9 = 128 - local12;
		} else if (arg13 == 2) {
			arg9 = 128 - arg9;
			arg4 = 128 - arg4;
		} else if (arg13 == 3) {
			local12 = arg4;
			arg4 = 128 - arg9;
			arg9 = local12;
		}
		@Pc(78) float local78;
		@Pc(72) float local72;
		@Pc(80) int local80;
		@Pc(66) float local66;
		if (arg4 == 0 && arg9 == 0) {
			local66 = arg10[arg12][arg7];
			local72 = arg2[arg12][arg7];
			local78 = arg0[arg12][arg7];
			local80 = arg3;
		} else if (arg4 == 128 && arg9 == 0) {
			local66 = arg10[arg12 + 1][arg7];
			local72 = arg2[arg12 + 1][arg7];
			local80 = arg6;
			local78 = arg0[arg12 + 1][arg7];
		} else if (arg4 == 128 && arg9 == 128) {
			local66 = arg10[arg12 + 1][arg7 + 1];
			local72 = arg2[arg12 + 1][arg7 + 1];
			local80 = arg1;
			local78 = arg0[arg12 + 1][arg7 + 1];
		} else if (arg4 == 0 && arg9 == 128) {
			local66 = arg10[arg12][arg7 + 1];
			local78 = arg0[arg12][arg7 + 1];
			local72 = arg2[arg12][arg7 + 1];
			local80 = arg11;
		} else {
			local78 = arg0[arg12][arg7];
			local72 = arg2[arg12][arg7];
			@Pc(176) float local176 = (float) arg4 / 128.0F;
			@Pc(184) float local184 = arg10[arg12][arg7 + 1];
			@Pc(199) float local199 = local78 + (arg0[arg12 + 1][arg7] - local78) * local176;
			@Pc(204) float local204 = (float) arg9 / 128.0F;
			@Pc(212) float local212 = arg0[arg12][arg7 + 1];
			local66 = arg10[arg12][arg7];
			@Pc(226) float local226 = arg2[arg12][arg7 + 1];
			@Pc(243) float local243 = local184 + (arg10[arg12 + 1][arg7 + 1] - local184) * local176;
			@Pc(257) float local257 = local66 + (arg10[arg12 + 1][arg7] - local66) * local176;
			@Pc(274) float local274 = local212 + local176 * (arg0[arg12 + 1][arg7 + 1] - local212);
			local66 = local257 + (local243 - local257) * local204;
			@Pc(300) float local300 = local226 + (arg2[arg12 + 1][arg7 + 1] - local226) * local176;
			local78 = local199 + (local274 - local199) * local204;
			@Pc(324) float local324 = local72 + (arg2[arg12 + 1][arg7] - local72) * local176;
			@Pc(330) int local330 = Static309.method1136(arg6, arg3, arg4);
			@Pc(336) int local336 = Static309.method1136(arg1, arg11, arg4);
			local80 = Static309.method1136(local336, local330, arg9);
			local72 = local324 + local204 * (local300 - local324);
		}
		@Pc(390) int local390 = (arg12 << 7) + arg4;
		@Pc(396) int local396 = arg9 + (arg7 << 7);
		@Pc(409) int local409 = Static178.method2929(arg9, arg7, arg4, arg14, arg12);
		return arg15.method571(local390, local409, local396, local66, local78, local72, arg5 ? local80 & 0xFFFFFF00 : local80, arg8 == null ? 0.0F : (float) (local409 - Static178.method2929(arg9, arg7, arg4, arg8, arg12)) / arg16);
	}
}
