import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	public static int anInt9319 = 0;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	public static int anInt9320 = 0;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!af;")
	public static final Class10 aClass10_53 = new Class10(64);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)Z")
	public static boolean method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method7865(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static630.method5247(local6.height, local6.width);
		if (Static353.anInt6019 == 1) {
			Static367.aClass132_7.method7510(arg0, Static457.anInt7638, Static554.anInt9288);
		} else {
			Static367.aClass132_7.method7510(arg0, Static424.anInt7323, Static308.anInt5228);
		}
	}
}
