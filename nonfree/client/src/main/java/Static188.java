import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gu", name = "ib", descriptor = "I")
	public static int anInt4405;

	@OriginalMember(owner = "client!gu", name = "fb", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_24 = new Class43();

	@OriginalMember(owner = "client!gu", name = "rb", descriptor = "I")
	public static int anInt4410 = 100;

	@OriginalMember(owner = "client!gu", name = "Bb", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_8 = new Class316(1, 2, 2, 0);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method3577(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static599.method8250(local11.height, local11.width);
		if (Static105.anInt2774 == 1) {
			Static580.aClass16_10.method6129(arg0, Static100.anInt2662, Static494.anInt8752);
		} else {
			Static580.aClass16_10.method6129(arg0, Static371.anInt7077, Static553.anInt9617);
		}
	}
}
