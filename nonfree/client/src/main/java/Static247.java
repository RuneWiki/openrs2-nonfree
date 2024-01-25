import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	public static int anInt5073;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "[[Lclient!fc;")
	public static Class54[][] aClass54ArrayArray1;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!ct;")
	public static Class30 aClass30_75;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_166 = new Class217(74, 10);

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_29 = new Class38(16);

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([JI[III)V")
	public static void method4691(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg1; local42++) {
			if (local16 + (long) (local42 & 0x1) > arg0[local42]) {
				@Pc(63) long local63 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local63;
				@Pc(77) int local77 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local77;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method4691(arg0, local12 - 1, arg2, arg3);
		method4691(arg0, arg1, arg2, local12 + 1);
	}
}
