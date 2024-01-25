import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static245 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static final int anInt5351 = -1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Z")
	public static boolean method4395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method4396() {
		if (Static282.aClass114_2 != null) {
			Static282.aClass114_2.method4234();
		}
		if (Static57.aClass114_1 != null) {
			Static57.aClass114_1.method4234();
		}
	}
}
