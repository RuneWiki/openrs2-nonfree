import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "[Lclient!jg;")
	public static Class175[] aClass175Array1;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_5 = new Class15("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "[I")
	public static final int[] anIntArray271 = new int[4];

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	public static void method4540() {
		Static409.aClass273_9.method6586();
		Static642.aClass273_47.method6586();
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
	public static void method4542() {
		Static202.method3545();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static322.aClass352Array1[local8].method8347();
		}
		Static347.method5204();
		Static573.method2148();
		Static406.method6286();
		System.gc();
		Static213.aClass133_5.ya();
	}
}
