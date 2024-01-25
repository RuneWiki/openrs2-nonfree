import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!ufa", name = "I", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array19;

	@OriginalMember(owner = "client!ufa", name = "A", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_65 = new Class85(3000000, 200);

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "(I)V")
	public static void method8704() {
		if (!Static581.aBoolean787) {
			return;
		}
		@Pc(12) Class273 local12 = Static147.method2144(Static203.anInt3318, Static166.anInt2883);
		if (local12 != null && local12.anObjectArray6 != null) {
			@Pc(23) Class2_Sub36 local23 = new Class2_Sub36();
			local23.anObjectArray2 = local12.anObjectArray6;
			local23.aClass273_6 = local12;
			Static484.method6919(local23);
		}
		Static359.anInt5735 = -1;
		Static85.anInt1436 = -1;
		Static581.aBoolean787 = false;
		if (local12 != null) {
			Static371.method5299(local12);
		}
	}
}
