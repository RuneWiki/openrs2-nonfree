import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "Lclient!pe;")
	public static Class254 aClass254_4;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "Lclient!wba;")
	public static final Class3_Sub50 aClass3_Sub50_1 = new Class3_Sub50(0, 0);

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([BB)Lclient!xa;")
	public static Class37 method364(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static173.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static173.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static173.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static546.aClass15_16.method5324(local58, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}
}
