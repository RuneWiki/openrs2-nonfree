import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!fs;")
	public static Class76 aClass76_83;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!gd;")
	public static final Class4_Sub20 aClass4_Sub20_1 = new Class4_Sub20(0, 0);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method4930(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static249.method3624(local13) : local13;
		} else if (arg1 instanceof Class34) {
			@Pc(27) Class34 local27 = (Class34) arg1;
			return local27.method774();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
