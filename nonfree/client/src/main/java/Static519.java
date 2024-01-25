import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public static int anInt8647;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Z")
	public static boolean aBoolean610 = true;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method7337(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static557.method7880(local13) : local13;
		} else if (arg0 instanceof Class258) {
			@Pc(35) Class258 local35 = (Class258) arg0;
			return local35.method6312();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!sha;I)V")
	public static void method7338(@OriginalArg(0) Class321 arg0) {
		if (arg0.anInt9105 == 5 && arg0.anInt9048 != -1) {
			Static538.method1729(arg0, Static546.aClass132_13);
		}
	}
}
