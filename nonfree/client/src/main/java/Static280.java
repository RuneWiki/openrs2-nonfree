import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "[I")
	public static final int[] anIntArray424 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_106 = new Class253(87, -2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public static void method3716() {
		@Pc(13) Class126 local13 = Static124.aClass126_19;
		synchronized (Static124.aClass126_19) {
			Static124.aClass126_19.method2821();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	public static void method3718() {
		Static57.anInt986 = 0;
		Static89.anInt1837 = -1;
		Static153.anInt5631 = -1;
	}
}
