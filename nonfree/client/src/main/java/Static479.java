import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public static int anInt8118;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B[B)Lclient!nf;")
	public static Class102 method6832(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static487.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static487.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static487.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(61) int[] local61 = new int[local38 * local34];
					@Pc(73) PixelGrabber local73 = new PixelGrabber(local19, 0, 0, local34, local38, local61, 0, local34);
					local73.grabPixels();
					return Static582.aClass16_12.method8131(local34, local61, local38, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(86) InterruptedException local86) {
			}
		}
	}
}
