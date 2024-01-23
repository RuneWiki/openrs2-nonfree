import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "F")
	public static float aFloat50 = 0.0F;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method3846(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg0;
			return arg1 ? Static158.method1925(local22) : local22;
		} else if (arg0 instanceof Class52) {
			@Pc(36) Class52 local36 = (Class52) arg0;
			return local36.method1279();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
