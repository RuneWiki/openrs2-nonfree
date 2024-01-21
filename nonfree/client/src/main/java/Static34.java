import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lclient!j;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!sa;")
	public static Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lclient!oc;")
	public static Class70 aClass70_346 = null;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_347 = Static193.method3027("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)V")
	public static void method599() {
		for (@Pc(6) Class3_Sub22 local6 = (Class3_Sub22) Static95.aClass10_53.method267(); local6 != null; local6 = (Class3_Sub22) Static95.aClass10_53.method268()) {
			if (local6.anInt3550 > 0) {
				local6.anInt3550--;
			}
			if (local6.anInt3550 != 0) {
				if (local6.anInt3535 > 0) {
					local6.anInt3535--;
				}
				if (local6.anInt3535 == 0 && local6.anInt3540 >= 1 && local6.anInt3542 >= 1 && local6.anInt3540 <= 102 && local6.anInt3542 <= 102 && (local6.anInt3543 < 0 || Static144.method2088(local6.anInt3543, local6.anInt3537))) {
					Static6.method101(local6.anInt3537, local6.anInt3542, local6.anInt3540, local6.anInt3543, local6.anInt3545, local6.anInt3549, local6.anInt3546);
					local6.anInt3535 = -1;
					if (local6.anInt3544 == local6.anInt3543 && local6.anInt3544 == -1) {
						local6.method3320();
					} else if (local6.anInt3543 == local6.anInt3544 && local6.anInt3546 == local6.anInt3541 && local6.anInt3537 == local6.anInt3548) {
						local6.method3320();
					}
				}
			} else if (local6.anInt3544 < 0 || Static144.method2088(local6.anInt3544, local6.anInt3548)) {
				Static6.method101(local6.anInt3548, local6.anInt3542, local6.anInt3540, local6.anInt3544, local6.anInt3545, local6.anInt3549, local6.anInt3541);
				local6.method3320();
			}
		}
	}
}
