import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_1 = new Class343("", 10);

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)V")
	public static void method85() {
		@Pc(7) Class312 local7 = null;
		try {
			local7 = Static126.method1878("2");
			@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(Static245.anInt4344 * 6 + 3);
			local29.method7948(1);
			local29.method7956(Static245.anInt4344);
			for (@Pc(39) int local39 = 0; local39 < Static484.anIntArray417.length; local39++) {
				if (Static373.aBooleanArray21[local39]) {
					local29.method7956(local39);
					local29.method7909(Static484.anIntArray417[local39]);
				}
			}
			local7.method6840(local29.anInt9739, 0, local29.aByteArray90);
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method6838();
			}
		} catch (@Pc(81) Exception local81) {
		}
		Static643.aLong291 = Static15.method380();
		Static24.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IFII[FII[FIII)V")
	public static void method86(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(13) int local13 = arg0 - arg5;
		@Pc(17) int local17 = arg9 - arg6;
		@Pc(38) float local38 = arg7[2] * (float) local9 + arg7[0] * (float) local17 + (float) local13 * arg7[1];
		@Pc(59) float local59 = (float) local13 * arg7[4] + arg7[3] * (float) local17 + (float) local9 * arg7[5];
		@Pc(80) float local80 = arg7[6] * (float) local17 + (float) local13 * arg7[7] + arg7[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg1 + 0.5F;
		@Pc(124) float local124;
		if (arg8 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg8 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg8 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		arg4[1] = local119;
		arg4[0] = local106;
	}
}
