import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	public static void method6867() {
		Static442.method6915();
		for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
			Static403.aClass350Array1[local10].method8207();
		}
		Static23.method7146();
		Static247.method4472();
		System.gc();
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IZ)I")
	public static int method6868(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
