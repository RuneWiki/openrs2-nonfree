import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!pga;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
	public static int anInt1942 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([FIIIFIIIFII)V")
	public static void method1612(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg9 - arg8;
		@Pc(13) int local13 = arg1 - arg5;
		@Pc(17) int local17 = arg6 - arg2;
		@Pc(38) float local38 = (float) local17 * arg0[0] + (float) local13 * arg0[1] + (float) local9 * arg0[2];
		@Pc(59) float local59 = arg0[3] * (float) local17 + (float) local13 * arg0[4] + (float) local9 * arg0[5];
		@Pc(80) float local80 = (float) local13 * arg0[7] + (float) local17 * arg0[6] + arg0[8] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local91 *= arg3;
		}
		@Pc(109) float local109 = local59 + arg7 + 0.5F;
		@Pc(114) float local114;
		if (arg4 == 1) {
			local114 = local91;
			local91 = -local109;
			local109 = local114;
		} else if (arg4 == 2) {
			local109 = -local109;
			local91 = -local91;
		} else if (arg4 == 3) {
			local114 = local91;
			local91 = local109;
			local109 = -local114;
		}
		Static254.aFloat80 = local91;
		Static434.aFloat196 = local109;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Lclient!ba;")
	public static Class1_Sub9 method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class1_Sub9 local20 = null;
		if (arg1 == 0) {
			local20 = Static123.method2194(Static469.aClass235_2, Static486.aClass208_100);
		}
		if (arg1 == 1) {
			local20 = Static123.method2194(Static469.aClass235_2, Static5.aClass208_2);
		}
		local20.aClass1_Sub3_Sub1_1.method7912(arg2 + Static539.anInt9045);
		local20.aClass1_Sub3_Sub1_1.method7912(Static311.anInt5708 + arg0);
		local20.aClass1_Sub3_Sub1_1.method7917(Static326.aClass97_3.method2365(82) ? 1 : 0);
		Static258.anInt4724 = arg2;
		Static395.aBoolean537 = false;
		Static345.anInt9498 = arg0;
		Static62.method1010();
		return local20;
	}
}
