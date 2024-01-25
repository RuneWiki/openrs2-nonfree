import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!ks;")
	public static Class200 aClass200_1;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_15 = new Class154(77, -1);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public static void method1207() {
		@Pc(1) Class21 local1 = Static31.aClass21_9;
		synchronized (Static31.aClass21_9) {
			Static31.aClass21_9.method313();
		}
		local1 = Static547.aClass21_88;
		synchronized (Static547.aClass21_88) {
			Static547.aClass21_88.method313();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z")
	public static boolean method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
