import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public static int anInt6247;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_165 = new Class140(64);

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_166 = new Class140(4);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method5479() {
		if (Static239.anInt4649 == 10) {
			Static72.method1427(28);
		}
		if (Static239.anInt4649 == 30) {
			Static72.method1427(25);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method5481() {
		@Pc(5) Class140 local5 = Static69.aClass140_39;
		synchronized (Static69.aClass140_39) {
			Static69.aClass140_39.method3824(5);
		}
		local5 = Static102.aClass140_59;
		synchronized (Static102.aClass140_59) {
			Static102.aClass140_59.method3824(5);
		}
	}
}
