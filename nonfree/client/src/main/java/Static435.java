import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[J")
	public static long[] aLongArray9;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_38 = new Class220(1, 2, 2, 0);

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	public static int anInt7311 = 0;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Z")
	public static boolean aBoolean799 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method5717() {
		@Pc(10) Class102 local10 = Static218.aClass102_26;
		synchronized (Static218.aClass102_26) {
			Static218.aClass102_26.method2271();
		}
		local10 = Static311.aClass102_42;
		synchronized (Static311.aClass102_42) {
			Static311.aClass102_42.method2271();
		}
	}
}
