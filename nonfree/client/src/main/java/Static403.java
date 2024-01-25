import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public static int anInt4197;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_89 = new Class253(32, 2);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)I")
	public static int method3325(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(23) int local23 = (arg0 & 0x7F) * 96 >> 7;
		if (local23 < 2) {
			local23 = 2;
		} else if (local23 > 126) {
			local23 = 126;
		}
		return (arg0 & 0xFF80) + local23;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Lclient!hr;")
	public static Class111 method3326() {
		try {
			return (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
