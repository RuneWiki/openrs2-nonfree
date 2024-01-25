import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
	public static int anInt2729;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)V")
	public static void method2583(@OriginalArg(0) int arg0) {
		Static294.anInt5413 = -1;
		if (arg0 == 37) {
			Static201.aFloat6 = 3.0F;
		} else if (arg0 == 50) {
			Static201.aFloat6 = 4.0F;
		} else if (arg0 == 75) {
			Static201.aFloat6 = 6.0F;
		} else if (arg0 == 100) {
			Static201.aFloat6 = 8.0F;
		} else if (arg0 == 200) {
			Static201.aFloat6 = 16.0F;
		}
		Static294.anInt5413 = -1;
	}
}
