import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "[I")
	public static final int[] anIntArray279 = new int[2];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)V")
	public static void method4648(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
