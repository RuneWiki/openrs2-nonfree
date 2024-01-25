import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
	public static final int[] anIntArray182 = new int[4096];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBLjava/lang/Object;I)[B")
	public static byte[] method2285(@OriginalArg(2) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static388.method5097(arg1, local13);
		} else if (arg0 instanceof Class34) {
			@Pc(25) Class34 local25 = (Class34) arg0;
			return local25.method773(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
	public static void method2288() {
		if (Static98.anInt1987 != 3) {
			Static56.anInt1028 = -1;
		}
	}
}
