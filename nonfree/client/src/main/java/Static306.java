import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!nd;")
	public static Class238 aClass238_142;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "[B")
	public static final byte[] aByteArray45 = new byte[2048];

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method4781() {
		Static310.method4830();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static520.aClass175Array1[local6].method4286();
		}
		Static191.method3265();
		Static116.method2086();
		Static160.method2773();
		System.gc();
		Static141.aClass13_27.ya();
	}
}
