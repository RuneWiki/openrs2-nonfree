import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public static int anInt7664;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "[I")
	public static final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_97 = new Class44(15, -1);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static29.method411(arg4)) {
			if (Static117.aClass41ArrayArray1[arg4] == null) {
				Static79.method1388(arg2, arg3, arg7, -1, arg5, arg0, arg6, arg1, Static450.aClass41ArrayArray2[arg4]);
			} else {
				Static79.method1388(arg2, arg3, arg7, -1, arg5, arg0, arg6, arg1, Static117.aClass41ArrayArray1[arg4]);
			}
		} else if (arg1 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static10.aBooleanArray5[local15] = true;
			}
		} else {
			Static10.aBooleanArray5[arg1] = true;
		}
	}
}
