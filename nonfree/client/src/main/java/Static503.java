import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)Lclient!f;")
	public static Class10 method6986(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static550.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static550.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static550.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static136.aClass12_8.method6429(local55, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(79) InterruptedException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!kba;B)V")
	public static void method6987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20_Sub2_Sub4_Sub1_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray437[0];
		@Pc(15) int local15 = arg2.anIntArray436[0];
		if (local10 < 0 || Static500.anInt6888 <= local10 || local15 < 0 || local15 >= Static573.anInt9325 || (arg1 < 0 || Static500.anInt6888 <= arg1 || arg0 < 0 || Static573.anInt9325 <= arg0)) {
			return;
		}
		@Pc(70) int local70 = Static264.method4168(local10, -4, Static28.aClass94Array2[arg2.aByte116], 0, arg1, 0, 0, Static328.anIntArray379, local15, arg0, true, 0, arg2.method5349(), Static519.anIntArray588);
		if (local70 >= 1 && local70 <= 3) {
			for (@Pc(82) int local82 = 0; local82 < local70 - 1; local82++) {
				arg2.method4148((byte) 2, Static328.anIntArray379[local82], Static519.anIntArray588[local82]);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method6989() {
		Static20.method543();
		Static99.method1834();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public static void method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg2 <= arg1) {
			for (local6 = arg2; local6 < arg1; local6++) {
				Static478.anIntArrayArray51[local6][arg0] = arg3;
			}
		} else {
			for (local6 = arg1; local6 < arg2; local6++) {
				Static478.anIntArrayArray51[local6][arg0] = arg3;
			}
		}
	}
}
