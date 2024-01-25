import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static458 {

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	public static int anInt7773 = 0;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
	public static int anInt7779 = 0;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)Z")
	public static boolean method6568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static297.method4773(arg0, arg1) || Static135.method2404(arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)I")
	public static int method6570(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(III)Z")
	public static boolean method6571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
