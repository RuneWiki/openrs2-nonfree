import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "[Lclient!cq;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
	public static final int[] anIntArray52 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B[B)Lclient!qda;")
	public static Class59 method625(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(22) Image local22 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(27) MediaTracker local27 = new MediaTracker(Static437.aClient1);
				local27.addImage(local22, 0);
				local27.waitForAll();
				@Pc(37) int local37 = local22.getWidth(Static437.aClient1);
				@Pc(41) int local41 = local22.getHeight(Static437.aClient1);
				if (!local27.isErrorAny() && local37 >= 0 && local41 >= 0) {
					@Pc(58) int[] local58 = new int[local37 * local41];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local22, 0, 0, local37, local41, local58, 0, local37);
					local70.grabPixels();
					return Static563.aClass143_13.method6241(local41, local37, local37, local58);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBII)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class378 local14 = Static322.aClass378ArrayArray1[arg2][arg1];
		Static139.method2064(local14 == null ? Static477.aClass378_4 : local14, arg0);
	}
}
