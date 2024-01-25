import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
	public static final int[] anIntArray109 = new int[1];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method1340() {
		Static56.method1016();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static174.aClass237Array1[local8].method5911();
		}
		Static218.method3802();
		Static393.method7906();
		Static540.method7787();
		System.gc();
		Static266.aClass82_8.ya();
	}
}
