import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt7599;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "J")
	public static long aLong234 = 0L;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!pga;")
	public static Class289 method6776(@OriginalArg(0) Class145 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class173 local19 = Static338.method4701(arg0, true, arg1, true);
		return local19 == null ? null : local19.aClass289_7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)Lclient!ug;")
	public static Class43 method6777(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(25) MediaTracker local25 = new MediaTracker(Static255.aClient1);
				local25.addImage(local20, 0);
				local25.waitForAll();
				@Pc(35) int local35 = local20.getWidth(Static255.aClient1);
				@Pc(39) int local39 = local20.getHeight(Static255.aClient1);
				if (!local25.isErrorAny() && local35 >= 0 && local39 >= 0) {
					@Pc(64) int[] local64 = new int[local39 * local35];
					@Pc(76) PixelGrabber local76 = new PixelGrabber(local20, 0, 0, local35, local39, local64, 0, local35);
					local76.grabPixels();
					return Static396.aClass145_6.method9711(local35, local35, local39, local64);
				}
				throw new RuntimeException("");
			} catch (@Pc(89) InterruptedException local89) {
			}
		}
	}
}
