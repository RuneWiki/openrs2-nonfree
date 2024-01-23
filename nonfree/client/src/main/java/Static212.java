import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3485(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(21) int local21 = Static248.aClass3_Sub4_Sub2_11.method3688(arg0, 250);
		@Pc(28) int local28 = Static248.aClass3_Sub4_Sub2_11.method3696(arg0, 250) * 13;
		if (Static283.aBoolean393) {
			Static234.method3973(6, 6, local21 + 4 + 4, local28 + 4 + 4, 0);
			Static234.method3979(6, 6, local21 + 8, local28 + 4 - -4, 16777215);
		} else {
			Static143.method2462(6, 6, local21 + 4 + 4, local28 + 8, 0);
			Static143.method2455(6, 6, local21 + 4 + 4, local28 - -4 + 4, 16777215);
		}
		Static248.aClass3_Sub4_Sub2_11.method3694(arg0, 10, 10, local21, local28, 16777215, -1, 1, 1, 0);
		Static35.method534(local28 + 8, local21 - -4 + 4, 6, 6);
		if (!arg1) {
			Static210.method3473(local21, 10, 10, local28);
		} else if (Static283.aBoolean393) {
			Static283.method4637();
		} else {
			try {
				@Pc(168) Graphics local168 = Static224.aCanvas12.getGraphics();
				Static94.aClass128_1.method4291(local168);
			} catch (@Pc(176) Exception local176) {
				Static224.aCanvas12.repaint();
			}
		}
	}
}
