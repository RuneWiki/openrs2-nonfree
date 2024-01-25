import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
	public static final int[] anIntArray380 = new int[8];

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt5067 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZJ)V")
	public static void method4407(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
