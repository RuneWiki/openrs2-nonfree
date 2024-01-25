import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method2894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static395.aClass82Array3[Static145.anInt3525++] = new Class82(4, arg5, arg6, arg0, arg0, arg6, arg3, arg1, arg1, arg3, arg2, arg2, arg4, arg4);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
	public static void method2896() {
		Static645.method9254(Static462.anInt8470);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)Lclient!mi;")
	public static Class46 method2897(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static30.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static30.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static30.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static186.aClass20_4.method7265(local34, local58, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}
}
