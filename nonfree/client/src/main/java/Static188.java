import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_72 = new Class253(67, -1);

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method2743() {
		Static261.method3517();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static179.aClass70Array3[local8].method1703();
		}
		Static140.method793();
		Static69.method1173();
		System.gc();
	}
}
