import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Lclient!ci;")
	public static Class38 aClass38_11;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg3;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 7 + 1 - arg3 - arg1;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public static void method1089(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static87.anInt1986 = arg0;
		Static427.aClass71_Sub6Array1 = new Class71_Sub6[Static129.anIntArray232[Static87.anInt1986] + 1];
		Static461.anInt5493 = 0;
		Static176.anInt3455 = 0;
	}
}
