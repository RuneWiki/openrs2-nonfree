import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII)V")
	public static void method5363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static216.method3997(Static419.aClass252_108);
		}
		if (arg1 == 1) {
			Static216.method3997(Static520.aClass252_135);
		}
		Static259.aClass1_Sub17_Sub2_1.method4473(Static538.anInt9485 + arg0);
		Static259.aClass1_Sub17_Sub2_1.method4473(Static282.anInt5380 + arg2);
		Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
		Static52.anInt4659 = arg0;
		Static50.aBoolean106 = false;
		Static259.anInt5037 = arg2;
		Static327.method5596();
	}
}
