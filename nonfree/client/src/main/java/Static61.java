import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZBIII)V")
	public static void method7220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static74.aClass2_Sub13_5.aClass14_Sub6_1.method3223() : Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223()) != 0 && arg0 != 0 && Static395.anInt7569 < 50 && arg5 != -1) {
			Static443.aClass125Array1[Static395.anInt7569++] = new Class125((byte) (arg2 ? 3 : 2), arg5, arg0, arg4, arg3, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
	public static void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local28;
		@Pc(42) Object local42 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg0; local61++) {
			if (arg2[local61] < (local59 & local61) + local28) {
				@Pc(76) int local76 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24] = local76;
				@Pc(90) Object local90 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24++] = local90;
			}
		}
		arg2[arg0] = arg2[local24];
		arg2[local24] = local28;
		arg3[arg0] = arg3[local24];
		arg3[local24] = local42;
		method7222(local24 - 1, arg1, arg2, arg3);
		method7222(arg0, local24 + 1, arg2, arg3);
	}
}
