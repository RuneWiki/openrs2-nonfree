import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "Lclient!td;")
	public static Class3_Sub5_Sub18 aClass3_Sub5_Sub18_4;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "Lclient!tca;")
	public static final Class333 aClass333_30 = new Class333(4);

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_10 = new Class343("", 12);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
	public static void method6389() {
		Static399.anInt6574 = -1;
		Static367.anInt10954 = 1;
		if (Static464.aString94 == null) {
			Static302.method4386(35);
		} else {
			@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(Static9.method172(Static550.method7044(Static464.aString94)));
			@Pc(24) long local24 = local20.method7946();
			Static425.aLong191 = local20.method7946();
			Static220.method3264("", Static611.method8283(local24), true);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B[B)Lclient!hh;")
	public static Class6 method6392(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static548.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static548.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static548.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static119.aClass95_4.method7993(local58, local34, local38, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}
}
