import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public static int anInt9848;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public static int anInt9853 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method8098(@OriginalArg(0) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static207.method4083(local10.width, local10.height);
		if (Static178.anInt4220 == 1) {
			Static67.aClass33_5.method6227(arg0, Static273.anInt5828, Static211.anInt4905);
		} else {
			Static67.aClass33_5.method6227(arg0, Static448.anInt8136, Static33.anInt611);
		}
	}
}
