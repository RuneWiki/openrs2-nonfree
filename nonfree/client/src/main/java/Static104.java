import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "S")
	public static short aShort27 = 1;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)[Lclient!ib;")
	public static Class140[] method1889() {
		return new Class140[] { Static364.aClass140_5, Static271.aClass140_14, Static72.aClass140_10, Static351.aClass140_16, Static337.aClass140_15, Static578.aClass140_18, Static41.aClass140_6, Static79.aClass140_17, Static27.aClass140_12, Static242.aClass140_13 };
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZLclient!wp;)V")
	public static void method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class361 arg2) {
		if (Static369.aBoolean463) {
			@Pc(18) Class10 local18 = Static176.anInt3442 == -1 ? null : Static137.aClass124_1.method3255(Static176.anInt3442);
			if (Static71.method1520(arg2).method5124() && (Static215.anInt3875 & 0x20) != 0 && (local18 == null || arg2.method7896(Static176.anInt3442, local18.anInt193) != local18.anInt193)) {
				Static137.method2680(arg2.anInt9645, arg2.anInt9594, Static585.aString93 + " -> " + arg2.aString99, 0L, true, 3, Static16.aString4, false, Static288.anInt4931, arg2.anInt9608);
			}
		}
		@Pc(80) String local80;
		for (@Pc(73) int local73 = 9; local73 >= 5; local73--) {
			local80 = Static548.method7287(arg2, local73);
			if (local80 != null) {
				Static137.method2680(arg2.anInt9645, arg2.anInt9594, arg2.aString99, (long) (local73 + 1), true, 1007, local80, false, Static111.method7201(local73, arg2), arg2.anInt9608);
			}
		}
		local80 = Static10.method154(arg2);
		if (local80 != null) {
			Static137.method2680(arg2.anInt9645, arg2.anInt9594, arg2.aString99, 0L, true, 8, local80, false, arg2.anInt9589, arg2.anInt9608);
		}
		for (@Pc(149) int local149 = 4; local149 >= 0; local149--) {
			@Pc(156) String local156 = Static548.method7287(arg2, local149);
			if (local156 != null) {
				Static137.method2680(arg2.anInt9645, arg2.anInt9594, arg2.aString99, (long) (local149 + 1), true, 10, local156, false, Static111.method7201(local149, arg2), arg2.anInt9608);
			}
		}
		if (!Static71.method1520(arg2).method5123()) {
			return;
		}
		if (arg2.aString101 == null) {
			Static137.method2680(arg2.anInt9645, arg2.anInt9594, "", 0L, true, 59, Static544.aClass343_13.method7222(Static256.anInt4535), false, -1, arg2.anInt9608);
		} else {
			Static137.method2680(arg2.anInt9645, arg2.anInt9594, "", 0L, true, 59, arg2.aString101, false, -1, arg2.anInt9608);
		}
	}
}
