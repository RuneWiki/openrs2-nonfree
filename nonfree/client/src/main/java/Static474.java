import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_129 = new Class349(65, 6);

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public static int anInt7611 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method6142(@OriginalArg(1) File arg0) {
		return Static182.method2317(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6143(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
