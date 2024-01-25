import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
	public static int anInt5978;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZJ)V")
	public static void method5403(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static677.method9374(arg0 - 1L);
			Static677.method9374(1L);
		} else {
			Static677.method9374(arg0);
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)I")
	public static int method5405() {
		return Static578.aClass193_1.method4863();
	}
}
