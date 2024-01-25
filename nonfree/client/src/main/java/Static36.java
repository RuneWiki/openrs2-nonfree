import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bfa", name = "B", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_17 = new Class47(20, -1);

	@OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!bfa", name = "J", descriptor = "I")
	public static int anInt955 = 2;

	@OriginalMember(owner = "client!bfa", name = "K", descriptor = "I")
	public static int anInt956 = -1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method965(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static155.method2928(local13) : local13;
		} else if (arg0 instanceof Class41) {
			@Pc(31) Class41 local31 = (Class41) arg0;
			return local31.method1150();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
