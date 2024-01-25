import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!tb;")
	public static Class49 aClass49_24;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public static final int[] anIntArray284 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	public static int anInt5183 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)Lclient!tb;")
	public static Class49 method4754(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static635.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static635.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static635.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(65) int[] local65 = new int[local40 * local36];
					@Pc(77) PixelGrabber local77 = new PixelGrabber(local21, 0, 0, local36, local40, local65, 0, local36);
					local77.grabPixels();
					return Static202.aClass75_5.method6692(local40, local36, local65, local36);
				}
				throw new RuntimeException("");
			} catch (@Pc(90) InterruptedException local90) {
			}
		}
	}
}
