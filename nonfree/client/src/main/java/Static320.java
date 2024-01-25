import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public static int anInt8925;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_195 = new Class151(31, 0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!jv;ZI)V")
	public static void method7631(@OriginalArg(0) Class4_Sub27 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean348) {
			if (arg0.anInt4658 < 0 || Static519.method7016(arg0.anInt4658, arg0.anInt4657)) {
				if (arg1) {
					Static650.method8681(arg0.anInt4666, (Class141) null, arg0.anInt4668, arg0.anInt4662, arg0.anInt4663);
				} else {
					Static565.method7486(arg0.anInt4664, arg0.anInt4658, arg0.anInt4663, arg0.anInt4666, -1, arg0.anInt4662, arg0.anInt4657, arg0.anInt4668);
				}
				arg0.method9000();
			}
		} else if (arg0.aBoolean347 && arg0.anInt4663 >= 1 && arg0.anInt4666 >= 1 && Static224.anInt3557 - 2 >= arg0.anInt4663 && arg0.anInt4666 <= Static267.anInt4309 - 2 && (arg0.anInt4665 < 0 || Static519.method7016(arg0.anInt4665, arg0.anInt4659))) {
			if (arg1) {
				Static650.method8681(arg0.anInt4666, arg0.aClass141_1, arg0.anInt4668, arg0.anInt4662, arg0.anInt4663);
			} else {
				Static565.method7486(arg0.anInt4660, arg0.anInt4665, arg0.anInt4663, arg0.anInt4666, -1, arg0.anInt4662, arg0.anInt4659, arg0.anInt4668);
			}
			arg0.aBoolean347 = false;
			if (!arg1 && arg0.anInt4658 == arg0.anInt4665 && arg0.anInt4658 == -1) {
				arg0.method9000();
			} else if (!arg1 && arg0.anInt4665 == arg0.anInt4658 && arg0.anInt4664 == arg0.anInt4660 && arg0.anInt4657 == arg0.anInt4659) {
				arg0.method9000();
			}
		}
	}
}
