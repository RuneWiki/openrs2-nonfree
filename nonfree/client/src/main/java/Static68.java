import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_14 = new Class163();

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method2013(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg3) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local28;
		@Pc(42) Object local42 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg3; local61 < arg2; local61++) {
			if (arg0[local61] < (local59 & local61) + local28) {
				@Pc(76) int local76 = arg0[local61];
				arg0[local61] = arg0[local24];
				arg0[local24] = local76;
				@Pc(90) Object local90 = arg1[local61];
				arg1[local61] = arg1[local24];
				arg1[local24++] = local90;
			}
		}
		arg0[arg2] = arg0[local24];
		arg0[local24] = local28;
		arg1[arg2] = arg1[local24];
		arg1[local24] = local42;
		method2013(arg0, arg1, local24 - 1, arg3);
		method2013(arg0, arg1, arg2, local24 + 1);
	}
}
