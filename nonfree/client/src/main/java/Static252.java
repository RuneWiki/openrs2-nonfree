import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mn", name = "bb", descriptor = "Lclient!gp;")
	public static Class1_Sub19 aClass1_Sub19_2;

	@OriginalMember(owner = "client!mn", name = "db", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_124 = new Class12(0, 5);

	@OriginalMember(owner = "client!mn", name = "eb", descriptor = "Lclient!wc;")
	public static final Class262 aClass262_10 = new Class262();

	@OriginalMember(owner = "client!mn", name = "fb", descriptor = "F")
	public static float aFloat61 = 0.0F;

	@OriginalMember(owner = "client!mn", name = "gb", descriptor = "I")
	public static int anInt4573 = 503;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII[FFIFIII)V")
	public static void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2 - arg9;
		@Pc(9) int local9 = arg8 - arg0;
		@Pc(21) int local21 = arg6 - arg1;
		@Pc(42) float local42 = (float) local5 * arg4[1] + arg4[0] * (float) local9 + (float) local21 * arg4[2];
		@Pc(63) float local63 = arg4[5] * (float) local21 + (float) local9 * arg4[3] + (float) local5 * arg4[4];
		@Pc(84) float local84 = arg4[6] * (float) local9 + arg4[7] * (float) local5 + arg4[8] * (float) local21;
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local95 *= arg7;
		}
		@Pc(109) float local109 = local63 + arg5 + 0.5F;
		@Pc(130) float local130;
		if (arg3 == 1) {
			local130 = local95;
			local95 = -local109;
			local109 = local130;
		} else if (arg3 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg3 == 3) {
			local130 = local95;
			local95 = local109;
			local109 = -local130;
		}
		Static165.aFloat31 = local95;
		Static258.aFloat103 = local109;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	public static void method3610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 13);
		local8.method2661();
		local8.anInt3213 = arg1;
	}
}
