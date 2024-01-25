import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!f;")
	public static Class14 aClass14_19;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt6474;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lclient!wg;")
	public static Class231 method5531() {
		try {
			return (Class231) Class.forName("Class231_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class231_Sub2();
		}
	}
}
