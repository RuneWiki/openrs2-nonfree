import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt6246 = -1;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	public static final int[] anIntArray341 = new int[13];

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public static int anInt6253 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZBLclient!ak;)V")
	public static void method5521(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class14_Sub3 arg1) {
		if (arg1.aBoolean18) {
			if (arg1.anInt223 < 0 || Static574.method8190(arg1.anInt223, arg1.anInt228)) {
				if (arg0) {
					Static396.method6070(arg1.anInt233, (Class328) null, arg1.anInt224, arg1.anInt227, arg1.anInt231);
				} else {
					Static19.method296(arg1.anInt224, arg1.anInt228, arg1.anInt223, arg1.anInt227, arg1.anInt229, -1, arg1.anInt233, arg1.anInt231);
				}
				arg1.method9513();
			}
		} else if (arg1.aBoolean19 && arg1.anInt233 >= 1 && arg1.anInt224 >= 1 && arg1.anInt233 <= Static380.anInt6689 - 2 && arg1.anInt224 <= Static542.anInt9214 - 2) {
			if (arg1.anInt225 >= 0 && !Static574.method8190(arg1.anInt225, arg1.anInt230)) {
				return;
			}
			if (arg0) {
				Static396.method6070(arg1.anInt233, arg1.aClass328_1, arg1.anInt224, arg1.anInt227, arg1.anInt231);
			} else {
				Static19.method296(arg1.anInt224, arg1.anInt230, arg1.anInt225, arg1.anInt227, arg1.anInt232, -1, arg1.anInt233, arg1.anInt231);
			}
			arg1.aBoolean19 = false;
			if (!arg0 && arg1.anInt225 == arg1.anInt223 && arg1.anInt223 == -1) {
				arg1.method9513();
				return;
			}
			if (!arg0 && arg1.anInt223 == arg1.anInt225 && arg1.anInt229 == arg1.anInt232 && arg1.anInt230 == arg1.anInt228) {
				arg1.method9513();
				return;
			}
		}
	}
}
