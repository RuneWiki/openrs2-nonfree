import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "D")
	public static double aDouble56;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
	public static final int[] anIntArray696 = new int[13];

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "[I")
	public static final int[] anIntArray697 = new int[5];

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_126 = new Class241(79, -1);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method8971(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static340.method5225(local6.width, local6.height);
		if (Static290.anInt10204 == 1) {
			Static409.aClass75_13.method6652(arg0, Static367.anInt6186, Static294.anInt5224);
		} else {
			Static409.aClass75_13.method6652(arg0, Static334.anInt5734, Static159.anInt3316);
		}
	}
}
