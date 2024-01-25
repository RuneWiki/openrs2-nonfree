import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Lclient!o;")
	public static Class49 aClass49_5;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_3 = new Class177();

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_25 = new Class129(110, 3);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III[FIFIIIFI)V")
	public static void method997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg7;
		@Pc(13) int local13 = arg6 - arg0;
		@Pc(17) int local17 = arg9 - arg2;
		@Pc(38) float local38 = (float) local5 * arg3[2] + arg3[0] * (float) local17 + (float) local13 * arg3[1];
		@Pc(59) float local59 = arg3[5] * (float) local5 + (float) local13 * arg3[4] + (float) local17 * arg3[3];
		@Pc(80) float local80 = arg3[6] * (float) local17 + arg3[7] * (float) local13 + arg3[8] * (float) local5;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local91 *= arg5;
		}
		@Pc(105) float local105 = local59 + arg8 + 0.5F;
		@Pc(137) float local137;
		if (arg1 == 1) {
			local137 = local91;
			local91 = -local105;
			local105 = local137;
		} else if (arg1 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg1 == 3) {
			local137 = local91;
			local91 = local105;
			local105 = -local137;
		}
		Static244.aFloat94 = local105;
		Static139.aFloat63 = local91;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public static void method998() {
		if (Static407.aClass200_9.method5886()) {
			Static407.aClass200_9.method5868(Static246.aCanvas2);
			Static378.method4942();
			Static407.aClass200_9.method5840(Static246.aCanvas2);
			Static407.aClass200_9.method5878(Static246.aCanvas2);
		} else {
			Static243.method3143(Static146.anInt2644);
		}
		Static251.method3223();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIBI)V")
	public static void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static216.aClass1_Sub1_1.anInt4512 != 0 && arg0 != 0 && Static344.anInt5625 < 50 && arg2 != -1) {
			Static113.aClass75Array1[Static344.anInt5625++] = new Class75((byte) 1, arg2, arg0, arg1, arg3, 0);
		}
	}
}
