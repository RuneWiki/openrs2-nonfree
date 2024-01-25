import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
	public static int anInt8959 = 0;

	@OriginalMember(owner = "client!sw", name = "G", descriptor = "[I")
	public static final int[] anIntArray483 = new int[2048];

	@OriginalMember(owner = "client!sw", name = "H", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "([BB)Lclient!f;")
	public static Class78 method7306(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(22) Image local22 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(27) MediaTracker local27 = new MediaTracker(Static430.aClient1);
				local27.addImage(local22, 0);
				local27.waitForAll();
				@Pc(37) int local37 = local22.getWidth(Static430.aClient1);
				@Pc(41) int local41 = local22.getHeight(Static430.aClient1);
				if (!local27.isErrorAny() && local37 >= 0 && local41 >= 0) {
					@Pc(64) int[] local64 = new int[local37 * local41];
					@Pc(76) PixelGrabber local76 = new PixelGrabber(local22, 0, 0, local37, local41, local64, 0, local37);
					local76.grabPixels();
					return Static440.aClass44_12.method4969(local64, local37, local37, local41);
				}
				throw new RuntimeException("");
			} catch (@Pc(88) InterruptedException local88) {
			}
		}
	}
}
