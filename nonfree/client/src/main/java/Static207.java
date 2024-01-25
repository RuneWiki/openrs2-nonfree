import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array8;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	public static int anInt3986;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public static int anInt3978 = 2;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_105 = new Class87(50);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([BB)Lclient!it;")
	public static Class28 method3585(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static475.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static475.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static475.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static213.aClass133_5.method7261(local55, local38, local34, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(80) InterruptedException local80) {
			}
		}
	}
}
