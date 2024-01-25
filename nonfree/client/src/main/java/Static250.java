import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!jp", name = "S", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "Lclient!em;")
	public static final Class83 aClass83_95 = new Class83(110, 8);

	@OriginalMember(owner = "client!jp", name = "Q", descriptor = "Lclient!em;")
	public static final Class83 aClass83_96 = new Class83(81, 8);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method3664(@OriginalArg(1) File arg0) {
		return Static502.method6056(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)V")
	public static void method3667() {
		Static319.aClass16_3.method475();
	}
}
