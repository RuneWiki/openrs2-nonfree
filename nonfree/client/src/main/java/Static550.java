import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method7314() {
		Static61.aBoolean86 = false;
		Static34.method8332();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
	public static void method7315() {
		for (@Pc(15) Class4_Sub5_Sub8 local15 = (Class4_Sub5_Sub8) Static473.aClass163_57.method3639(); local15 != null; local15 = (Class4_Sub5_Sub8) Static473.aClass163_57.method3640()) {
			@Pc(20) Class3_Sub1_Sub2_Sub1 local20 = local15.aClass3_Sub1_Sub2_Sub1_1;
			if (local20.anInt762 < Static177.anInt3088) {
				local15.method9000();
				local20.method712();
			} else if (Static177.anInt3088 >= local20.anInt738) {
				local20.method707();
				if (local20.anInt755 > 0) {
					@Pc(58) Class4_Sub45 local58 = (Class4_Sub45) Static597.aClass66_41.method1994((long) (local20.anInt755 - 1));
					if (local58 != null) {
						@Pc(63) Class3_Sub1_Sub2_Sub2_Sub2 local63 = local58.aClass3_Sub1_Sub2_Sub2_Sub2_2;
						if (local63.anInt9925 >= 0 && Static224.anInt3557 * 512 > local63.anInt9925 && local63.anInt9917 >= 0 && Static267.anInt4309 * 512 > local63.anInt9917) {
							local20.method705(Static177.anInt3088, local63.anInt9917, Static674.method8951(local20.aByte141, local63.anInt9917, local63.anInt9925) - local20.anInt760, local63.anInt9925);
						}
					}
				}
				if (local20.anInt755 < 0) {
					@Pc(118) int local118 = -local20.anInt755 - 1;
					@Pc(127) Class3_Sub1_Sub2_Sub2_Sub1 local127;
					if (Static184.anInt3149 == local118) {
						local127 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4;
					} else {
						local127 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local118];
					}
					if (local127 != null && local127.anInt9925 >= 0 && Static224.anInt3557 * 512 > local127.anInt9925 && local127.anInt9917 >= 0 && Static267.anInt4309 * 512 > local127.anInt9917) {
						local20.method705(Static177.anInt3088, local127.anInt9917, Static674.method8951(local20.aByte141, local127.anInt9917, local127.anInt9925) - local20.anInt760, local127.anInt9925);
					}
				}
				local20.method711(Static88.anInt1794);
				Static573.method7594(local20, true);
			}
		}
	}
}
