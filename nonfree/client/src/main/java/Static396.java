import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIBI)V")
	public static void method6272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static568.anInt9975 == 1) {
			Static156.aClass78Array7[Static225.anInt4138 / 100].method8185(Static152.anInt3145 - 8, Static23.anInt3730 + -8);
		}
		if (Static568.anInt9975 == 2) {
			Static156.aClass78Array7[Static225.anInt4138 / 100 + 4].method8185(Static152.anInt3145 - 8, Static23.anInt3730 + -8);
		}
		Static292.method6464();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIII)V")
	public static void method6273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static486.anInt8866 <= arg1 - arg0 && Static214.anInt3975 >= arg0 + arg1 && arg3 - arg0 >= Static290.anInt5903 && Static530.anInt9437 >= arg3 + arg0) {
			Static355.method5747(arg1, arg0, arg2, arg3);
		} else {
			Static515.method7517(arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIII)I")
	public static int method6276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(21) int local21 = arg5;
			arg5 = arg3;
			arg3 = local21;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 8 - arg4 - arg5;
		} else {
			return 1 + 7 - arg3 - arg0;
		}
	}
}
