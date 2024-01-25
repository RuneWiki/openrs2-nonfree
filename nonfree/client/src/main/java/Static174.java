import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!mc;")
	public static Class49 aClass49_3;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!ea;")
	public static final Class4_Sub7_Sub1 aClass4_Sub7_Sub1_1 = new Class4_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "F")
	public static float aFloat39 = 1024.0F;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public static void method3269() {
		@Pc(1) Class154 local1 = Static238.aClass154_76;
		synchronized (Static238.aClass154_76) {
			Static238.aClass154_76.method4220(5);
		}
		@Pc(27) Class154 local27 = Static181.aClass154_64;
		synchronized (Static181.aClass154_64) {
			Static181.aClass154_64.method4220(5);
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I")
	public static int method3271(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
