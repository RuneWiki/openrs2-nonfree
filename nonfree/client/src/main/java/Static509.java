import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "[[Lclient!ps;")
	public static Class273[][] aClass273ArrayArray2;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
	public static int anInt8136;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_114 = new Class154(52, -1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([Ljava/lang/Object;B[I)V")
	public static void method6609(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static233.method3327(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([BB)Lclient!f;")
	public static Class38 method6611(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static474.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static474.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static474.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(60) int[] local60 = new int[local36 * local40];
					@Pc(72) PixelGrabber local72 = new PixelGrabber(local21, 0, 0, local36, local40, local60, 0, local36);
					local72.grabPixels();
					return Static417.aClass162_17.method6879(local60, local36, local36, local40);
				}
				throw new RuntimeException("");
			} catch (@Pc(84) InterruptedException local84) {
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void method6612() throws IOException {
		if (Static529.aClass124_2 == null || Static94.anInt1654 <= 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		while (true) {
			@Pc(19) Class2_Sub34 local19 = (Class2_Sub34) Static442.aClass70_45.method1264();
			if (local19 == null) {
				Static3.anInt2071 = 0;
				Static324.anInt5456 += local14;
				break;
			}
			Static529.aClass124_2.method2257(local19.anInt6307, local19.aClass2_Sub7_Sub2_2.aByteArray52);
			local14 += local19.anInt6307;
			Static94.anInt1654 -= local19.anInt6307;
			local19.method7657();
			local19.aClass2_Sub7_Sub2_2.method4499();
			local19.method5266();
		}
	}
}
