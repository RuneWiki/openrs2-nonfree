import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!us", name = "B", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array20;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "Lclient!bga;")
	public static final Class34 aClass34_6 = new Class34();

	@OriginalMember(owner = "client!us", name = "z", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_143 = new Class71(104, 7);

	@OriginalMember(owner = "client!us", name = "A", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_63 = new Class43();

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
	public static byte[] method8132(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static331.method8641(local18, arg0);
		} else if (arg1 instanceof Class329) {
			@Pc(30) Class329 local30 = (Class329) arg1;
			return local30.method7729(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
