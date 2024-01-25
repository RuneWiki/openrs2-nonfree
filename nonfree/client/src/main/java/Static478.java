import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt8342 = -1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!jia;")
	public static Class186 aClass186_144 = new Class186(124, 3);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method6997() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static197.aBooleanArray10[local3] = false;
		}
		Static573.anInt9429 = -1;
		Static283.anInt5140 = -1;
		Static647.anInt10427 = 0;
		Static175.anInt10579 = 5;
		Static246.anInt4582 = Static269.anInt4883;
		Static197.anInt3483 = -1;
		Static202.anInt3525 = Static235.anInt4471;
		Static674.anInt10663 = 0;
		Static153.anInt2819 = -1;
		Static237.anInt11069 = Static703.anInt10997;
		Static407.anInt7264 = Static173.anInt3144;
		Static369.anInt6293 = Static376.anInt6408;
		Static650.anInt10441 = Static228.anInt9136;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB[II[FI[II[FIIII)V")
	public static void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(12) int local12 = arg0 * arg3 + arg9;
		@Pc(19) int local19 = arg11 * arg5 + arg12;
		@Pc(24) int local24 = arg0 - arg7;
		@Pc(29) int local29 = arg11 - arg7;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg6 == null) {
			for (local37 = 0; local37 < arg10; local37++) {
				local44 = arg7 + local12;
				while (local44 > local12) {
					arg4[local19++] = arg8[local12++];
				}
				local19 += local29;
				local12 += local24;
			}
		} else if (arg8 == null) {
			for (local37 = 0; local37 < arg10; local37++) {
				local44 = local12 + arg7;
				while (local12 < local44) {
					arg2[local19++] = arg6[local12++];
				}
				local12 += local24;
				local19 += local29;
			}
		} else {
			for (local37 = 0; local37 < arg10; local37++) {
				local44 = arg7 + local12;
				while (local12 < local44) {
					arg2[local19] = arg6[local12];
					arg4[local19++] = arg8[local12++];
				}
				local12 += local24;
				local19 += local29;
			}
		}
		if (arg1 >= -59) {
			aClass186_144 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
	public static void method7000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888() * arg1 >> 8;
		if (arg2 == -1 && !Static578.aBoolean688) {
			Static525.method7465();
		} else if (arg2 != -1 && (Static491.anInt8476 != arg2 || !Static404.method6048(-97)) && local8 != 0 && !Static578.aBoolean688) {
			Static3.method41(local8, arg2, Static191.aClass221_51, arg0);
			Static203.method3017();
		}
		if (Static491.anInt8476 != arg2) {
			Static235.aClass3_Sub22_Sub5_1 = null;
		}
		Static491.anInt8476 = arg2;
	}
}
