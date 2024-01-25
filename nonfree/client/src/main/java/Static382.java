import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt6400;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_242 = new Class179(25, 6);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method5424(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static630.method5247(local6.height, local6.width);
		if (Static353.anInt6019 == 1) {
			Static367.aClass132_7.method7494(arg0, Static457.anInt7638, Static554.anInt9288);
		} else {
			Static367.aClass132_7.method7494(arg0, Static424.anInt7323, Static308.anInt5228);
		}
	}
}
