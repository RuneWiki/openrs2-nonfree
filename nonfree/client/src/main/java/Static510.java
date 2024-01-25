import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static510 {

	@OriginalMember(owner = "client!sba", name = "y", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!da;)V")
	public static void method7617(@OriginalArg(0) Class62 arg0) {
		Static553.aClass62_11 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)V")
	public static void method7624() {
		Static191.aBoolean236 = false;
		Static40.method1343();
	}
}
