import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public static int anInt2759;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Z")
	public static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public static int anInt2757 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method2665() {
		@Pc(1) Class140 local1 = Static306.aClass140_155;
		synchronized (Static306.aClass140_155) {
			Static306.aClass140_155.method3813();
		}
		local1 = Static95.aClass140_53;
		synchronized (Static95.aClass140_53) {
			Static95.aClass140_53.method3813();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!aa;I)V")
	public static void method2666(@OriginalArg(0) Class2 arg0) {
		if (Static273.aBoolean458) {
			Static245.method4342(arg0);
		} else {
			Static280.method4828(arg0);
		}
	}
}
