import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "Lclient!bca;")
	public static final Class27 aClass27_8 = new Class27();

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "Z")
	public static boolean aBoolean768 = false;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I[B)Lclient!hu;")
	public static Class44 method8146(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(31) MediaTracker local31 = new MediaTracker(Static108.aClient1);
				local31.addImage(local26, 0);
				local31.waitForAll();
				@Pc(41) int local41 = local26.getWidth(Static108.aClient1);
				@Pc(45) int local45 = local26.getHeight(Static108.aClient1);
				if (!local31.isErrorAny() && local41 >= 0 && local45 >= 0) {
					@Pc(68) int[] local68 = new int[local41 * local45];
					@Pc(80) PixelGrabber local80 = new PixelGrabber(local26, 0, 0, local41, local45, local68, 0, local41);
					local80.grabPixels();
					return Static485.aClass126_17.method7017(local45, local41, local68, local41);
				}
				throw new RuntimeException("");
			} catch (@Pc(93) InterruptedException local93) {
			}
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)I")
	public static int method8147() {
		return Static453.anInt7627 == 1 ? Static463.anInt7854 : 0;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(BIIIIII)Lclient!tea;")
	public static Class91 method8148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg4 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg2 * 475427L ^ (long) arg5 * 67481L ^ (long) arg0 * 97549L ^ (long) arg3 * 76724863L;
		@Pc(44) Class91 local44 = (Class91) Static322.aClass293_39.method6921(local38);
		if (local44 == null) {
			local44 = Static540.aClass126_21.method7039(arg5, arg0, arg2, arg1, arg4, arg3);
			Static322.aClass293_39.method6925(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}
}
