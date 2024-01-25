import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!wu;")
	public static final Class365 aClass365_1 = new Class365();

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)I")
	public static int method3877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	public static void method3878() {
		Static14.anInt285 = 0;
		@Pc(13) int local13 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9) + Static335.anInt5608;
		@Pc(20) int local20 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9) + Static246.anInt4344;
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static14.anInt285 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static14.anInt285 = 1;
		}
		if (Static14.anInt285 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static14.anInt285 = 0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[B)Lclient!f;")
	public static Class14 method3879(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static308.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static308.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static308.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(61) int[] local61 = new int[local38 * local34];
					@Pc(73) PixelGrabber local73 = new PixelGrabber(local19, 0, 0, local34, local38, local61, 0, local34);
					local73.grabPixels();
					return Static505.aClass45_11.method7395(local61, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(85) InterruptedException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
	public static void method3881(@OriginalArg(0) boolean arg0) {
		if (Static143.aClass275_1 == null) {
			Static474.method6522();
		}
		if (arg0) {
			Static143.aClass275_1.method6093();
		}
	}
}
