import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!la;")
	public static Class207 aClass207_24;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_57 = new Class87(20);

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public static int anInt1994 = -1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ei;I)I")
	public static int method1640(@OriginalArg(0) Class5_Sub5_Sub4 arg0) {
		@Pc(14) String local14 = Static162.method2340(arg0);
		return Static485.aClass272_16.method6568(Static236.aClass28Array10, local14);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Z")
	public static boolean method1642(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
