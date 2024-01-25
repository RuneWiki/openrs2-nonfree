import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZLclient!tl;)V")
	public static void method6530(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub50 arg1) {
		if (arg1.aBoolean702) {
			if (arg1.anInt9420 < 0 || Static216.method3955(arg1.anInt9420, arg1.anInt9416)) {
				if (arg0) {
					Static57.method680(arg1.anInt9417, arg1.anInt9410, (Class22) null, arg1.anInt9418, arg1.anInt9409);
				} else {
					Static171.method3328(arg1.anInt9414, arg1.anInt9420, -1, arg1.anInt9416, arg1.anInt9418, arg1.anInt9410, arg1.anInt9409, arg1.anInt9417);
				}
				arg1.method9051();
			}
		} else if (arg1.aBoolean701 && arg1.anInt9410 >= 1 && arg1.anInt9409 >= 1 && arg1.anInt9410 <= Static29.anInt380 - 2 && arg1.anInt9409 <= Static327.anInt5650 - 2) {
			if (arg1.anInt9408 >= 0 && !Static216.method3955(arg1.anInt9408, arg1.anInt9411)) {
				return;
			}
			if (arg0) {
				Static57.method680(arg1.anInt9417, arg1.anInt9410, arg1.aClass22_2, arg1.anInt9418, arg1.anInt9409);
			} else {
				Static171.method3328(arg1.anInt9412, arg1.anInt9408, -1, arg1.anInt9411, arg1.anInt9418, arg1.anInt9410, arg1.anInt9409, arg1.anInt9417);
			}
			arg1.aBoolean701 = false;
			if (!arg0 && arg1.anInt9408 == arg1.anInt9420 && arg1.anInt9420 == -1) {
				arg1.method9051();
				return;
			}
			if (!arg0 && arg1.anInt9420 == arg1.anInt9408 && arg1.anInt9412 == arg1.anInt9414 && arg1.anInt9416 == arg1.anInt9411) {
				arg1.method9051();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)I")
	public static int method6531() {
		return Static229.anInt4454++;
	}
}
