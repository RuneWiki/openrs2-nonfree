import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)Lclient!mq;")
	public static Class71 method1304(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static493.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static493.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static493.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(61) int[] local61 = new int[local34 * local38];
					@Pc(73) PixelGrabber local73 = new PixelGrabber(local19, 0, 0, local34, local38, local61, 0, local34);
					local73.grabPixels();
					return Static607.aClass101_15.method8111(local34, local61, local38, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(86) InterruptedException local86) {
			}
		}
	}
}
