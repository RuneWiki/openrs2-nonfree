import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt5833;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Z")
	public static boolean aBoolean523 = false;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "[I")
	public static final int[] anIntArray440 = new int[1000];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V")
	public static void method4700(@OriginalArg(1) int arg0) {
		Static454.anInt7226 = -1;
		Static223.anInt5659 = arg0;
		Static112.anInt1711 = -1;
		Static160.method2120();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
	public static void method4701() {
		Static323.method4228();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBII)V")
	public static void method4702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg2) {
			Static105.method1302(arg0, arg3, arg4, arg2);
		} else if (Static281.anInt4757 <= arg3 - arg2 && arg3 + arg2 <= Static457.anInt7264 && arg0 - arg1 >= Static142.anInt2163 && arg1 + arg0 <= Static182.anInt3402) {
			Static115.method1423(arg0, arg2, arg4, arg3, arg1);
		} else {
			Static431.method5458(arg4, arg1, arg2, arg3, arg0);
		}
	}
}
