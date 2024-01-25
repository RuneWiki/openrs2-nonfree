import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!bp", name = "Q", descriptor = "Lclient!vh;")
	public static Class250 aClass250_9;

	@OriginalMember(owner = "client!bp", name = "K", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bp", name = "P", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)V")
	public static void method646() {
		@Pc(5) Class83 local5 = Static92.aClass83_14;
		synchronized (Static92.aClass83_14) {
			Static92.aClass83_14.method1667();
		}
		local5 = Static193.aClass83_8;
		synchronized (Static193.aClass83_8) {
			Static193.aClass83_8.method1667();
		}
	}
}
