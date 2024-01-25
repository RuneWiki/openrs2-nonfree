import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "Lclient!iba;")
	public static Class140 aClass140_3;

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "Lclient!ub;")
	public static Class327 aClass327_12;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "Lclient!gi;")
	public static Class112 aClass112_2;

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
	public static int anInt8951 = 0;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
	public static int anInt8952 = -1;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!ki;)Z")
	public static boolean method7354(@OriginalArg(1) Class176 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean356) {
			return false;
		} else if (!arg0.method4379(Static217.anInterface2_2)) {
			return false;
		} else if (Static378.aClass128_30.method3263((long) arg0.anInt5084) == null) {
			return Static103.aClass128_6.method3263((long) arg0.anInt5064) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V")
	public static void method7355() {
		Static381.method5628(Static240.aClass14_7, (long) Static312.anInt5688);
		if (Static468.anInt8036 != -1) {
			Static441.method6275(Static468.anInt8036);
		}
		for (@Pc(19) int local19 = 0; local19 < Static414.anInt7237; local19++) {
			if (Static31.aBooleanArray17[local19]) {
				Static143.aBooleanArray15[local19] = true;
			}
			Static528.aBooleanArray37[local19] = Static31.aBooleanArray17[local19];
			Static31.aBooleanArray17[local19] = false;
		}
		Static38.anInt984 = Static312.anInt5688;
		if (Static240.aClass14_7.method6876()) {
			Static299.aBoolean389 = true;
		}
		if (Static468.anInt8036 != -1) {
			Static414.anInt7237 = 0;
			Static214.method3753();
		}
		Static240.aClass14_7.F();
		Static121.method2519(Static240.aClass14_7);
		@Pc(69) int local69 = Static13.method6290();
		if (local69 == -1) {
			local69 = Static245.anInt4901;
		}
		if (local69 == -1) {
			local69 = Static375.anInt6611;
		}
		Static57.method1223(local69);
		Static54.anInt1208 = 0;
	}
}
