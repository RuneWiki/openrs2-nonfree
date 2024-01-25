import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!pj;")
	public static Class248 aClass248_99;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public static int anInt8755;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_141 = new Class98(92, 5);

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
	public static final int[] anIntArray622 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public static int anInt8751 = 0;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_13 = new Class179(14, 0, 4, 1);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Lclient!uu;")
	public static Class6_Sub5_Sub16 method6958(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub5_Sub16 local10 = (Class6_Sub5_Sub16) Static552.aClass146_3.method3536((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static63.aClass248_10.method5797(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static390.method5686(local20);
			Static552.aClass146_3.method3534((long) arg0, local10);
			return local10;
		}
	}
}
