import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
	public static int anInt4660;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_62 = new Class98(91, 4);

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	public static void method3964() {
		@Pc(5) Class330 local5 = Static180.aClass330_22;
		synchronized (Static180.aClass330_22) {
			Static180.aClass330_22.method7680(5);
		}
		local5 = Static395.aClass330_46;
		synchronized (Static395.aClass330_46) {
			Static395.aClass330_46.method7680(5);
		}
	}
}
