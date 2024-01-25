import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jha", name = "I", descriptor = "Lclient!ls;")
	public static final Class222 aClass222_6 = new Class222("WIP", 2);

	@OriginalMember(owner = "client!jha", name = "Q", descriptor = "[I")
	public static final int[] anIntArray389 = new int[16];

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II[B)[B")
	public static byte[] method4019(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static681.method2476(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IJ)V")
	public static void method4020(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
