import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Lclient!uc;")
	public static Class347 aClass347_1;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
	public static int anInt1002;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_8 = new Class114();

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
	public static int anInt1003 = 0;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_9 = new Class114();

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Lclient!tn;")
	public static final Class339 aClass339_4 = new Class339(1);

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "[I")
	public static final int[] anIntArray49 = new int[1];

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([BI)Lclient!pu;")
	public static Class50 method916(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(18) Image local18 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(23) MediaTracker local23 = new MediaTracker(Static209.aClient2);
				local23.addImage(local18, 0);
				local23.waitForAll();
				@Pc(33) int local33 = local18.getWidth(Static209.aClient2);
				@Pc(37) int local37 = local18.getHeight(Static209.aClient2);
				if (!local23.isErrorAny() && local33 >= 0 && local37 >= 0) {
					@Pc(57) int[] local57 = new int[local37 * local33];
					@Pc(69) PixelGrabber local69 = new PixelGrabber(local18, 0, 0, local33, local37, local57, 0, local33);
					local69.grabPixels();
					return Static208.aClass65_7.method6952(local37, local33, local57, local33);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)I")
	public static int method917(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
