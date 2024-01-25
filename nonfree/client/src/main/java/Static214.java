import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public static int anInt4979;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
	public static final int[] anIntArray272 = new int[1000];

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt4980 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IJ)V")
	public static void method4061(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static20.method849(arg0 - 1L);
			Static20.method849(1L);
		} else {
			Static20.method849(arg0);
		}
	}
}
