import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!ui;")
	public static Class230 aClass230_76;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZJ)V")
	public static void method4841(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
