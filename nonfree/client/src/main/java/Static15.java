import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
	public static int anInt272;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
	public static void method247(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg0, 7);
		local8.method3048();
	}
}
