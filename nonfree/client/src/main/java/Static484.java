import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "F")
	public static float aFloat252;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
	public static final int[] anIntArray585 = new int[256];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6805(@OriginalArg(1) String arg0) {
		if (Class2_Sub2_Sub12.aString23.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class2_Sub2_Sub12.aString23.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class2_Sub2_Sub12.aString23.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
