import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
	public static int anInt1536;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIILclient!fp;I)V")
	public static void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class11_Sub1_Sub1 arg3) {
		Static167.method3393(arg2, arg3.aByte77, arg3.anInt7347, arg3.anInt7351, arg0, 0, arg1);
	}
}
