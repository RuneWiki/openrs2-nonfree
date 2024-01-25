import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_21 = new Class194(19, 2);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
	public static final int[] anIntArray50 = new int[1024];

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
	public static final int[] anIntArray51 = new int[8];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method758(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static641.method8592(arg1, local13);
		} else if (arg0 instanceof Class192) {
			@Pc(25) Class192 local25 = (Class192) arg0;
			return local25.method7231(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
