import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
	public static int anInt2253 = 0;

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_22 = new Class200(85, 6);

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method2130(@OriginalArg(1) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static434.method6781(local10.width, local10.height);
		if (Static234.anInt4427 == 1) {
			Static398.aClass5_13.method7520(arg0, Static476.anInt8315, Static430.anInt7728);
		} else {
			Static398.aClass5_13.method7520(arg0, Static245.anInt4546, Static107.anInt2317);
		}
	}
}
