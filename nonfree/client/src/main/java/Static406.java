import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public static int anInt7073;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array10;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public static int anInt7076;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public static void method6232() {
		Static520.aLong275 = 0L;
		Static87.aString114 = "";
		Static561.anInt9080 = -1;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public static void method6233() {
		@Pc(1) Class359 local1 = Static535.aClass359_24;
		synchronized (Static535.aClass359_24) {
			Static535.aClass359_24.method8507();
		}
		local1 = Static296.aClass359_42;
		synchronized (Static296.aClass359_42) {
			Static296.aClass359_42.method8507();
		}
	}
}
