import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
	public static int anInt642;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "Lclient!av;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)Lclient!sc;")
	public static Class295 method437(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static192.aClass295Array2[arg0] : null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([BI)Lclient!f;")
	public static Class39 method438(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static413.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static413.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static413.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static307.aClass100_6.method6226(local55, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(79) InterruptedException local79) {
			}
		}
	}
}
