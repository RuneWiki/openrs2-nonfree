import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt5529;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "S")
	public static short aShort82 = 256;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt5528 = -1;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_68 = new Class61(50, 0);

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_69 = new Class61(27, 7);

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	public static void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static526.anInt8940 == 1) {
			Static145.method2994(arg1, arg0, Static22.aClass4_Sub18_1);
		} else if (Static526.anInt8940 == 2) {
			Static73.method1302(arg0, arg1);
		}
		Static22.aClass4_Sub18_1 = null;
		Static526.anInt8940 = 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIFFI[FBIII)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg1 - arg7;
		@Pc(9) int local9 = arg2 - arg8;
		@Pc(17) int local17 = arg5 - arg0;
		@Pc(42) float local42 = arg6[2] * (float) local9 + (float) local17 * arg6[0] + arg6[1] * (float) local5;
		@Pc(63) float local63 = arg6[4] * (float) local5 + arg6[3] * (float) local17 + arg6[5] * (float) local9;
		@Pc(84) float local84 = (float) local9 * arg6[8] + arg6[7] * (float) local5 + arg6[6] * (float) local17;
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local95 *= arg4;
		}
		@Pc(109) float local109 = arg3 + local63 + 0.5F;
		@Pc(116) float local116;
		if (arg9 == 1) {
			local116 = local95;
			local95 = -local109;
			local109 = local116;
		} else if (arg9 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg9 == 3) {
			local116 = local95;
			local95 = local109;
			local109 = -local116;
		}
		Static278.aFloat97 = local109;
		Static228.aFloat92 = local95;
	}
}
