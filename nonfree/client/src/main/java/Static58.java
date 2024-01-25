import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public static int anInt859;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public static void method750(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}
}
