import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	public static int[] anIntArray641;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_261 = new Class272(6, -1);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public static int anInt8541 = 0;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_169 = new Class298(18, 4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!fa;ILclient!om;Ljava/awt/Canvas;)Lclient!r;")
	public static synchronized Class43 method7138(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class246 arg3, @OriginalArg(5) Canvas arg4) {
		if (arg2 == 0) {
			return Static305.method4805(arg1, arg4);
		} else if (arg2 == 2) {
			return Static140.method6726(arg4, arg1);
		} else if (arg2 == 1) {
			return Static29.method543(arg4, arg1, arg0);
		} else if (arg2 == 5) {
			return Static79.method1730(arg1, arg0, arg4, arg3);
		} else if (arg2 == 3) {
			return Static599.method2160(arg4, arg0, arg1, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	public static boolean method7188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)Z")
	public static boolean method7196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public static void method7212(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static69.anInt1918 = arg1;
		Static110.anInt2597 = 0;
		Static385.anInt6630 = 0;
		Static459.anInt7524 = arg0;
	}
}
