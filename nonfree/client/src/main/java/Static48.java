import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!jb;")
	public static Class28 aClass28_21;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!jb;)[Lclient!pg;")
	public static Class64[] method937(@OriginalArg(2) int arg0, @OriginalArg(3) Class28 arg1) {
		return Static83.method1393(arg0, arg1) ? Static187.method3046() : null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	public static int method938(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
