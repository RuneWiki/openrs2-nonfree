import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "Lclient!ha;")
	public static Class104 aClass104_27;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "Lclient!qca;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_466 = new Class305(13, -2);

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_141 = new Class252(55, 15);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method8243(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static520.method7932(local18) : local18;
		} else if (arg1 instanceof Class231) {
			@Pc(34) Class231 local34 = (Class231) arg1;
			return local34.method6153();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
