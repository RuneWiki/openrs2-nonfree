import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	public static int anInt5784 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(JI)V")
	public static void method4882(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(FFFFFIILclient!wfa;III)[B")
	public static byte[] method4883(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(7) Class100 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static390.method6205(arg2, arg0, arg5, arg1, arg3, 0, local10, arg4);
		return local10;
	}
}
