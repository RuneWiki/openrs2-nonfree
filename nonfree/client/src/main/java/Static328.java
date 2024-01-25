import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!mq;")
	public static Class71 aClass71_12;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean442 = true;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBII)Z")
	public static boolean method5423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static351.aBoolean516 || !Static175.aBoolean283) {
			return false;
		} else if (Static22.anInt390 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static414.anIntArrayArrayArray13[arg2][arg1][arg0];
			if (-Static314.anInt5668 == local22) {
				return false;
			} else if (local22 == Static314.anInt5668) {
				return true;
			} else if (Static93.aClass18Array33 == Static245.aClass18Array14) {
				return false;
			} else {
				@Pc(47) int local47 = arg1 << Static170.anInt3602;
				@Pc(51) int local51 = arg0 << Static170.anInt3602;
				if (Static630.method7146(Static536.anInt4502 + local51 - 1, Static245.aClass18Array14[arg2].method8537(arg0, arg1), local47 + 1, Static245.aClass18Array14[arg2].method8537(arg0 + 1, arg1), local47 + 1, Static536.anInt4502 + local51 + -1, local51 + 1, Static245.aClass18Array14[arg2].method8537(arg0 - -1, arg1 + 1), Static536.anInt4502 + local47 - 1) && Static630.method7146(local51 + 1, Static245.aClass18Array14[arg2].method8537(arg0, arg1), local47 + Static536.anInt4502 - 1, Static245.aClass18Array14[arg2].method8537(arg0 + 1, arg1 + 1), local47 + 1, local51 - -Static536.anInt4502 + -1, local51 + 1, Static245.aClass18Array14[arg2].method8537(arg0, arg1 + 1), local47 + Static536.anInt4502 - 1)) {
					Static20.anInt361++;
					Static414.anIntArrayArrayArray13[arg2][arg1][arg0] = Static314.anInt5668;
					return true;
				} else {
					Static414.anIntArrayArrayArray13[arg2][arg1][arg0] = -Static314.anInt5668;
					return false;
				}
			}
		}
	}
}
