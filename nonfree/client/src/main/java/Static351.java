import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rk", name = "Jb", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!rk", name = "Hb", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_210 = new Class214(79, 12);

	@OriginalMember(owner = "client!rk", name = "Kb", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!rk", name = "Lb", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_217 = new Class137(23, 3);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([IIII[I)V")
	public static void method4508(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(20) int local20 = (arg2 + arg1) / 2;
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg0[local20];
		arg0[local20] = arg0[arg1];
		arg0[arg1] = local26;
		@Pc(40) int local40 = arg3[local20];
		arg3[local20] = arg3[arg1];
		arg3[arg1] = local40;
		@Pc(59) int local59 = ~local26 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg1; local61++) {
			if ((local59 & local61) + local26 > arg0[local61]) {
				@Pc(76) int local76 = arg0[local61];
				arg0[local61] = arg0[local22];
				arg0[local22] = local76;
				@Pc(90) int local90 = arg3[local61];
				arg3[local61] = arg3[local22];
				arg3[local22++] = local90;
			}
		}
		arg0[arg1] = arg0[local22];
		arg0[local22] = local26;
		arg3[arg1] = arg3[local22];
		arg3[local22] = local40;
		method4508(arg0, local22 - 1, arg2, arg3);
		method4508(arg0, arg1, local22 + 1, arg3);
	}
}
