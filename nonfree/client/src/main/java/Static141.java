import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_42 = new Class186(73, 6);

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
	public static int anInt2657 = 0;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
	public static int anInt2658 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[B)Lclient!bka;")
	public static Class9 method2358(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(22) Image local22 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(27) MediaTracker local27 = new MediaTracker(Static556.aClient1);
				local27.addImage(local22, 0);
				local27.waitForAll();
				@Pc(37) int local37 = local22.getWidth(Static556.aClient1);
				@Pc(41) int local41 = local22.getHeight(Static556.aClient1);
				if (!local27.isErrorAny() && local37 >= 0 && local41 >= 0) {
					@Pc(66) int[] local66 = new int[local37 * local41];
					@Pc(78) PixelGrabber local78 = new PixelGrabber(local22, 0, 0, local37, local41, local66, 0, local37);
					local78.grabPixels();
					return Static488.aClass67_12.method7688(local66, local37, local37, local41);
				}
				throw new RuntimeException("");
			} catch (@Pc(91) InterruptedException local91) {
			}
		}
	}
}
