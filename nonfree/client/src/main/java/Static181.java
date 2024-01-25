import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ir", name = "Xc", descriptor = "Lclient!ri;")
	public static Class1_Sub9_Sub3 aClass1_Sub9_Sub3_2;

	@OriginalMember(owner = "client!ir", name = "hd", descriptor = "Lclient!s;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!ir", name = "qd", descriptor = "Lclient!dv;")
	public static final Class63 aClass63_2 = new Class63();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2648(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = Static284.method3785(Static114.method1409(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}
}
