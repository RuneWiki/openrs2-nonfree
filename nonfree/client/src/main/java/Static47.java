import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_1 = new Class201("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
	public static int anInt794 = 503;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)V")
	public static void method757(@OriginalArg(0) int arg0) {
		Static427.method9314();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static670.aClass88Array1[local8].method1595();
		}
		Static510.method7465();
		if (arg0 != -4377) {
			method757(-54);
		}
		Static234.method3394(arg0 ^ 0x938);
		Static471.method6860();
		System.gc();
		Static457.aClass57_11.ya();
	}
}
