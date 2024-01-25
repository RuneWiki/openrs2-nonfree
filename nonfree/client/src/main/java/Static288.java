import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public static int anInt4858 = 0;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method4154() {
		if (Static621.aClass135_12 != Static228.aClass135_3) {
			try {
				Static680.method795(Static548.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
