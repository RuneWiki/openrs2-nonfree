import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	public static int anInt4438;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_55 = new Class46(73, 6);

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[2];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method4003(@OriginalArg(0) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static137.method2017(local10.width, local10.height);
		if (Static483.anInt8236 == 1) {
			Static9.aClass133_1.method7276(arg0, Static404.anInt6761, Static447.anInt7618);
		} else {
			Static9.aClass133_1.method7276(arg0, Static111.anInt2087, Static517.anInt8880);
		}
	}
}
