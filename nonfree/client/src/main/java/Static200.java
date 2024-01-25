import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!i", name = "j", descriptor = "F")
	public static float aFloat83 = 0.25F;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method3796() {
		for (@Pc(15) Class6_Sub51 local15 = (Class6_Sub51) Static419.aClass275_193.method6366(); local15 != null; local15 = (Class6_Sub51) Static419.aClass275_193.method6364()) {
			if (local15.anInt9529 > 0) {
				local15.anInt9529--;
			}
			if (local15.anInt9529 != 0) {
				if (local15.anInt9526 > 0) {
					local15.anInt9526--;
				}
				if (local15.anInt9526 == 0 && local15.anInt9518 >= 1 && local15.anInt9513 >= 1 && Static301.anInt4912 - 2 >= local15.anInt9518 && Static473.anInt7969 - 2 >= local15.anInt9513 && (local15.anInt9527 < 0 || Static109.method7597(local15.anInt9527, local15.anInt9525))) {
					Static408.method5961(local15.anInt9518, local15.anInt9519, -1, local15.anInt9513, local15.anInt9527, local15.anInt9525, local15.anInt9522, local15.anInt9521);
					local15.anInt9526 = -1;
					if (local15.anInt9523 == local15.anInt9527 && local15.anInt9523 == -1) {
						local15.method7849();
					} else if (local15.anInt9523 == local15.anInt9527 && local15.anInt9522 == local15.anInt9520 && local15.anInt9524 == local15.anInt9525) {
						local15.method7849();
					}
				}
			} else if (local15.anInt9523 < 0 || Static109.method7597(local15.anInt9523, local15.anInt9524)) {
				Static408.method5961(local15.anInt9518, local15.anInt9519, -1, local15.anInt9513, local15.anInt9523, local15.anInt9524, local15.anInt9520, local15.anInt9521);
				local15.method7849();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)I")
	public static int method3797() {
		return Static155.anInt2739;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[Lclient!saa;")
	public static Class287[] method3798() {
		return new Class287[] { Static192.aClass287_3, Static420.aClass287_7, Static257.aClass287_4, Static154.aClass287_2, Static130.aClass287_1, Static351.aClass287_5 };
	}
}
