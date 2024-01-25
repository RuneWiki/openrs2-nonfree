import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!qo;")
	public static final Class196 aClass196_25 = new Class196(16);

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!bc;")
	public static final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!nq;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString50 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!db;")
	public static Class44 method3736() {
		try {
			return (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
