import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	public static int anInt3601;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	public static int anInt3599 = 0;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	public static int anInt3600 = 0;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public static int anInt3603 = 0;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
	public static final int[] anIntArray436 = new int[1000];

	@OriginalMember(owner = "client!li", name = "y", descriptor = "I")
	public static int anInt3606 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V")
	public static void method2940(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg1) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) long local30 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(44) Object local44 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local44;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (arg3[local56] < (long) (local56 & 0x1) + local30) {
				@Pc(77) long local77 = arg3[local56];
				arg3[local56] = arg3[local26];
				arg3[local26] = local77;
				@Pc(91) Object local91 = arg0[local56];
				arg0[local56] = arg0[local26];
				arg0[local26++] = local91;
			}
		}
		arg3[arg1] = arg3[local26];
		arg3[local26] = local30;
		arg0[arg1] = arg0[local26];
		arg0[local26] = local44;
		method2940(arg0, local26 - 1, arg2, arg3);
		method2940(arg0, arg1, local26 + 1, arg3);
	}
}
