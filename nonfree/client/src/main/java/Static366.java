import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Lclient!he;")
	public static Class126 aClass126_2;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
	public static final int[] anIntArray76 = new int[2];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B[B)Lclient!ac;")
	public static Class5 method1891(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static321.aClient2);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static321.aClient2);
				@Pc(38) int local38 = local19.getHeight(Static321.aClient2);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static47.aClass33_3.method6204(local38, local34, local58, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}
}
