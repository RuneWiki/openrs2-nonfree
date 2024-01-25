import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
	public static final int[] anIntArray498 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method6647() {
		@Pc(1) Class211 local1 = Static419.aClass211_51;
		synchronized (Static419.aClass211_51) {
			Static419.aClass211_51.method5537();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
	public static int method6649() {
		@Pc(10) Class211 local10 = Static232.aClass211_34;
		synchronized (Static232.aClass211_34) {
			return Static232.aClass211_34.method5532();
		}
	}
}
