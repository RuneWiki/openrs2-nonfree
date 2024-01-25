import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_98 = new Class337(100, 3);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZJ)V")
	public static void method4821(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static297.method4648(arg0 - 1L);
			Static297.method4648(1L);
		} else {
			Static297.method4648(arg0);
		}
	}
}
