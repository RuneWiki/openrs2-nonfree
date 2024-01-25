import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!pj;")
	public static Class257 aClass257_140;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray189;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_281 = new Class363(93, 6);

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)[I")
	public static int[] method7967() {
		return new int[] { Static377.anInt6694, Static230.anInt4311, Static295.anInt8551 };
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
	public static void method7969() {
		for (@Pc(15) Class2_Sub36 local15 = (Class2_Sub36) Static524.aClass8_62.method210(); local15 != null; local15 = (Class2_Sub36) Static524.aClass8_62.method218()) {
			if (local15.anInt6567 > 0) {
				local15.anInt6567--;
			}
			if (local15.anInt6567 != 0) {
				if (local15.anInt6572 > 0) {
					local15.anInt6572--;
				}
				if (local15.anInt6572 == 0 && local15.anInt6574 >= 1 && local15.anInt6564 >= 1 && Static188.anInt3850 - 2 >= local15.anInt6574 && Static49.anInt1174 - 2 >= local15.anInt6564 && (local15.anInt6566 < 0 || Static428.method6153(local15.anInt6565, local15.anInt6566))) {
					Static356.method5275(local15.anInt6568, -1, local15.anInt6575, local15.anInt6574, local15.anInt6564, local15.anInt6565, local15.anInt6573, local15.anInt6566);
					local15.anInt6572 = -1;
					if (local15.anInt6566 == local15.anInt6569 && local15.anInt6569 == -1) {
						local15.method7966();
					} else if (local15.anInt6569 == local15.anInt6566 && local15.anInt6575 == local15.anInt6570 && local15.anInt6571 == local15.anInt6565) {
						local15.method7966();
					}
				}
			} else if (local15.anInt6569 < 0 || Static428.method6153(local15.anInt6571, local15.anInt6569)) {
				Static356.method5275(local15.anInt6568, -1, local15.anInt6570, local15.anInt6574, local15.anInt6564, local15.anInt6571, local15.anInt6573, local15.anInt6569);
				local15.method7966();
			}
		}
	}
}
