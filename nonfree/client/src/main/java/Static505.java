import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljava/lang/Class;")
	private static Class aClass20;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLclient!tl;)V")
	public static void method7367(@OriginalArg(1) Class6_Sub50 arg0) {
		if (Static334.aClass243ArrayArrayArray2 == null) {
			return;
		}
		@Pc(9) Interface23 local9 = null;
		if (arg0.anInt9418 == 0) {
			local9 = (Interface23) Static593.method8225(arg0.anInt9417, arg0.anInt9410, arg0.anInt9409);
		}
		if (arg0.anInt9418 == 1) {
			local9 = (Interface23) Static382.method5910(arg0.anInt9417, arg0.anInt9410, arg0.anInt9409);
		}
		if (arg0.anInt9418 == 2) {
			local9 = (Interface23) Static122.method2204(arg0.anInt9417, arg0.anInt9410, arg0.anInt9409, aClass20 == null ? (aClass20 = Class81_Sub2_Sub2.a("rt")) : aClass20);
		}
		if (arg0.anInt9418 == 3) {
			local9 = (Interface23) Static64.method787(arg0.anInt9417, arg0.anInt9410, arg0.anInt9409);
		}
		if (local9 == null) {
			arg0.anInt9414 = 0;
			arg0.anInt9420 = -1;
			arg0.anInt9416 = 0;
		} else {
			arg0.anInt9420 = local9.method7934();
			arg0.anInt9416 = local9.method7929(88);
			arg0.anInt9414 = local9.method7932();
		}
	}
}
