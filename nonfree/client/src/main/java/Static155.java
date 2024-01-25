import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method2874(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static593.method8367(arg0, local13);
		} else if (arg1 instanceof Class25) {
			@Pc(25) Class25 local25 = (Class25) arg1;
			return local25.method353(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!n;I)I")
	public static int method2875(@OriginalArg(0) int arg0, @OriginalArg(1) Class225 arg1) {
		if (!Static69.method1180(arg1).method128(arg0) && arg1.anObjectArray7 == null) {
			return -1;
		} else if (arg1.anIntArray328 == null || arg1.anIntArray328.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray328[arg0];
		}
	}
}
