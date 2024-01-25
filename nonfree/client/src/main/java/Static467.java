import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
	public static int anInt8408;

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
	public static int anInt8412 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII[FFFIII)V")
	public static void method7029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg3 - arg8;
		@Pc(13) int local13 = arg2 - arg4;
		@Pc(17) int local17 = arg0 - arg1;
		@Pc(38) float local38 = (float) local17 * arg5[1] + arg5[0] * (float) local9 + arg5[2] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg5[5] + arg5[4] * (float) local17 + (float) local9 * arg5[3];
		@Pc(80) float local80 = arg5[8] * (float) local13 + arg5[6] * (float) local9 + (float) local17 * arg5[7];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(110) float local110 = local59 + arg7 + 0.5F;
		@Pc(123) float local123;
		if (arg9 == 1) {
			local123 = local91;
			local91 = -local110;
			local110 = local123;
		} else if (arg9 == 2) {
			local91 = -local91;
			local110 = -local110;
		} else if (arg9 == 3) {
			local123 = local91;
			local91 = local110;
			local110 = -local123;
		}
		Static245.aFloat78 = local110;
		Static54.aFloat20 = local91;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7030(@OriginalArg(1) String arg0) {
		return Static257.method4024(arg0, cn.class);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JI)V")
	public static void method7032(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static4.anInt115;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static31.anInt5633) {
			local19 = local7 - Static31.anInt5633;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static31.anInt5633 += local27;
		}
		@Pc(62) int local62 = Static365.anInt6883;
		if (!Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static265.aFloat182 += (float) arg0 * Static291.aFloat102 / 40.0F * 8.0F;
			Static161.aFloat56 += Static232.aFloat73 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local62 != Static169.anInt3089) {
			local19 = local62 - Static169.anInt3089;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static169.anInt3089 += local27;
		}
		Static74.method1489();
	}
}
