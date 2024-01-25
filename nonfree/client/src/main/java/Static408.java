import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!ok;")
	public static Class187 aClass187_5;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_15 = new Class126(8, 5);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method5554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static1.method37(arg0, arg1) & Static72.method1375(arg1, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method5555(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static91.method1562(local13) : local13;
		} else if (arg0 instanceof Class19) {
			@Pc(27) Class19 local27 = (Class19) arg0;
			return local27.method5151();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
