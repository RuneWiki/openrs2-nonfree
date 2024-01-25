import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
	public static int method3279() {
		@Pc(15) int local15 = Static523.aClass94_24.method2182();
		if (local15 < Static73.aClass94Array1.length - 1) {
			Static523.aClass94_24 = Static73.aClass94Array1[local15 + 1];
		}
		return 100;
	}
}
