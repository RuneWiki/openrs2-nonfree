import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_73 = new Class158(48, 12);

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	public static int anInt5695 = 0;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)B")
	public static byte method4783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[FIIIIIFIFI)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg9 - arg7;
		@Pc(18) int local18 = arg0 - arg2;
		@Pc(22) int local22 = arg3 - arg4;
		@Pc(43) float local43 = arg1[2] * (float) local9 + arg1[0] * (float) local18 + (float) local22 * arg1[1];
		@Pc(64) float local64 = (float) local9 * arg1[5] + (float) local18 * arg1[3] + (float) local22 * arg1[4];
		@Pc(85) float local85 = arg1[8] * (float) local9 + arg1[7] * (float) local22 + arg1[6] * (float) local18;
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local96 *= arg8;
		}
		@Pc(110) float local110 = arg6 + local64 + 0.5F;
		@Pc(117) float local117;
		if (arg5 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg5 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg5 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		Static2.aFloat5 = local110;
		Static418.aFloat234 = local96;
	}
}
