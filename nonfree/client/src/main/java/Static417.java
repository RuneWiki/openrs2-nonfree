import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Lclient!pu;")
	public static Class50 aClass50_28;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
	public static final int[] anIntArray420 = new int[4];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method6202() {
		if (Static471.aClass352_41 != null) {
			Static471.aClass352_41.method8260();
		}
		if (Static430.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static430.aThread2.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z")
	public static boolean method6204(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
