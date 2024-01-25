import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public static void method5389() {
		for (@Pc(10) Class2_Sub7_Sub1 local10 = (Class2_Sub7_Sub1) Static329.aClass114_28.method2772(); local10 != null; local10 = (Class2_Sub7_Sub1) Static329.aClass114_28.method2762()) {
			@Pc(15) Class16_Sub1_Sub1_Sub2 local15 = local10.aClass16_Sub1_Sub1_Sub2_1;
			if (local15.aBoolean54) {
				local10.method8920();
				local15.method605();
			} else if (Static389.anInt6694 >= local15.anInt504) {
				local15.method602(Static190.anInt3789);
				if (local15.aBoolean54) {
					local10.method8920();
				} else {
					Static196.method3387(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(FFZF)F")
	public static float method5390(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * (arg0 - arg1) + arg1;
	}
}
