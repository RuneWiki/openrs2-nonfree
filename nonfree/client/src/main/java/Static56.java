import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bw", name = "Q", descriptor = "I")
	public static int anInt1870;

	@OriginalMember(owner = "client!bw", name = "D", descriptor = "[Lclient!jha;")
	public static Class67_Sub1[] aClass67_Sub1Array1 = new Class67_Sub1[0];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
	public static byte[] method1712(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static459.method6909(local13) : local13;
		} else if (arg0 instanceof Class324) {
			@Pc(27) Class324 local27 = (Class324) arg0;
			return local27.method8090();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
