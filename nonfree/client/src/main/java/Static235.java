import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ifa", name = "D", descriptor = "[Lclient!oia;")
	public static Class251[] aClass251Array1;

	@OriginalMember(owner = "client!ifa", name = "E", descriptor = "Lclient!uu;")
	public static Class343 aClass343_118;

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
	public static int anInt4693 = 0;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BIILclient!uv;)V")
	public static void method4015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class344 arg2) {
		if (Static425.aBoolean536) {
			@Pc(14) Class108 local14 = Static632.anInt10065 == -1 ? null : Static220.aClass214_2.method5419(Static632.anInt10065);
			if (Static76.method1311(arg2).method8087() && (Static95.anInt1910 & 0x20) != 0 && (local14 == null || arg2.method8165(local14.anInt3158, Static632.anInt10065) != local14.anInt3158)) {
				Static139.method2380(true, Static551.anInt9151, false, arg2.anInt9567, Static372.aString48 + " -> " + arg2.aString93, (long) (arg2.anInt9586 << 0 | arg2.anInt9571), false, arg2.anInt9571, 0L, arg2.anInt9586, 5, Static323.aString46);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static448.method5065(arg2, local78);
			if (local85 != null) {
				Static139.method2380(true, Static513.method7472(local78, arg2), false, arg2.anInt9567, arg2.aString93, (long) (arg2.anInt9571 | arg2.anInt9586 << 0), false, arg2.anInt9571, (long) (local78 + 1), arg2.anInt9586, 1002, local85);
			}
		}
		local85 = Static374.method5191(arg2);
		if (local85 != null) {
			Static139.method2380(true, arg2.anInt9564, false, arg2.anInt9567, arg2.aString93, (long) (arg2.anInt9586 << 0 | arg2.anInt9571), false, arg2.anInt9571, 0L, arg2.anInt9586, 21, local85);
		}
		for (@Pc(174) int local174 = 4; local174 >= 0; local174--) {
			@Pc(181) String local181 = Static448.method5065(arg2, local174);
			if (local181 != null) {
				Static139.method2380(true, Static513.method7472(local174, arg2), false, arg2.anInt9567, arg2.aString93, (long) (arg2.anInt9571 | arg2.anInt9586 << 0), false, arg2.anInt9571, (long) (local174 + 1), arg2.anInt9586, 44, local181);
			}
		}
		if (!Static76.method1311(arg2).method8095()) {
			return;
		}
		if (arg2.aString91 == null) {
			Static139.method2380(true, -1, false, arg2.anInt9567, "", (long) (arg2.anInt9586 << 0 | arg2.anInt9571), false, arg2.anInt9571, 0L, arg2.anInt9586, 2, Static369.aClass235_12.method5893(Static455.anInt7738));
		} else {
			Static139.method2380(true, -1, false, arg2.anInt9567, "", (long) (arg2.anInt9586 << 0 | arg2.anInt9571), false, arg2.anInt9571, 0L, arg2.anInt9586, 2, arg2.aString91);
		}
	}
}
