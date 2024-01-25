import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public static int anInt3672 = -1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([BI)Lclient!hu;")
	public static Class21 method3018(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static227.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static227.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static227.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local38 * local34];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static171.aClass16_5.method6132(local38, local55, local34, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(80) InterruptedException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ig;B)Lclient!qt;")
	public static Class8_Sub2 method3023(@OriginalArg(0) Class8_Sub8 arg0) {
		arg0.method8525();
		@Pc(22) int local22 = arg0.method8525();
		@Pc(26) Class8_Sub2 local26 = Static453.method6876(local22);
		local26.anInt10548 = arg0.method8525();
		@Pc(35) int local35 = arg0.method8525();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(45) int local45 = arg0.method8525();
			local26.method8501(local45, arg0);
		}
		local26.method8508();
		return local26;
	}
}
