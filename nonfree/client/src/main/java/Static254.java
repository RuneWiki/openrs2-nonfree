import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!mb;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
	public static int[] anIntArray445;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method4595() {
		Static329.aClass87_59.method2477();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI[J[Ljava/lang/Object;)V")
	public static void method4596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg0) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) long local25 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg0; local51++) {
			if ((long) (local51 & 0x1) + local25 > arg2[local51]) {
				@Pc(68) long local68 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local68;
				@Pc(82) Object local82 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local82;
			}
		}
		arg2[arg0] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg0] = arg3[local21];
		arg3[local21] = local39;
		method4596(local21 - 1, arg1, arg2, arg3);
		method4596(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBII)V")
	public static void method4598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg3; local7++) {
			Static39.method919(arg0, Static344.anIntArrayArray65[local7], arg2, arg4);
		}
	}
}
