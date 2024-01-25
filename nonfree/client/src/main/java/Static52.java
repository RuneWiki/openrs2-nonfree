import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!d;")
	public static Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "[I")
	public static final int[] anIntArray65 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BJ)V")
	public static void method810(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
