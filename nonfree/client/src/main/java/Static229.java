import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!rj;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "[I")
	public static final int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public static void method1640() {
		Static130.aClass26_17.method876();
		Static148.aClass4_8.method179();
		Static165.aClass4_4.method179();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
	public static void method1642() {
		@Pc(1) Class140 local1 = Static50.aClass140_29;
		synchronized (Static50.aClass140_29) {
			Static50.aClass140_29.method3824(5);
		}
		local1 = Static234.aClass140_121;
		synchronized (Static234.aClass140_121) {
			Static234.aClass140_121.method3824(5);
		}
	}
}
