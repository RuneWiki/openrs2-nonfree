import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public static final int anInt2472 = 1401;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "J")
	public static long aLong81 = -1L;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZI)V")
	public static void method2110(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static455.anInt7604++;
			Static154.method2169();
		}
		if (arg0) {
			Static251.anInt4335++;
			Static346.method5046();
		}
	}
}
