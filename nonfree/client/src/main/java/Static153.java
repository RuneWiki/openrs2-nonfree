import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
	public static final int[] anIntArray130 = new int[14];

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public static int anInt2549 = 2;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "F")
	public static float aFloat36 = 1.0F;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method2152(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static256.method3267(local18) : local18;
		} else if (arg1 instanceof Class83) {
			@Pc(32) Class83 local32 = (Class83) arg1;
			return local32.method3902();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
