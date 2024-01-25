import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static628 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
	public static int[] anIntArray700;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!kw;")
	public static Class178 aClass178_28;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public static final int anInt9691 = 1407;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method8260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static221.method3276(arg1)) {
			return;
		}
		if (Static158.aClass270ArrayArray1[arg1] == null) {
			Static85.method1869(Static172.aClass270ArrayArray2[arg1], -1, arg10, arg9, arg4, arg2, arg6, arg7, arg5, arg3, arg8, arg0);
		} else {
			Static85.method1869(Static158.aClass270ArrayArray1[arg1], -1, arg10, arg9, arg4, arg2, arg6, arg7, arg5, arg3, arg8, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method8262() {
		if (Static334.anInt5383 != -1) {
			Static76.method1623(-1, -1, false, Static334.anInt5383);
			Static334.anInt5383 = -1;
		}
	}
}
