import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
	public static int anInt4127;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_7 = new Class277(11, 17);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([BI)Lclient!f;")
	public static Class88 method3255(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static104.aClient3);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static104.aClient3);
				@Pc(40) int local40 = local21.getHeight(Static104.aClient3);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(57) int[] local57 = new int[local40 * local36];
					@Pc(69) PixelGrabber local69 = new PixelGrabber(local21, 0, 0, local36, local40, local57, 0, local36);
					local69.grabPixels();
					return Static39.aClass7_2.method7838(local57, local36, local36, local40);
				}
				throw new RuntimeException("");
			} catch (@Pc(81) InterruptedException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!ga;I)V")
	public static void method3256(@OriginalArg(1) Class116 arg0, @OriginalArg(2) int arg1) {
		if (Static486.aBoolean631) {
			arg1 = 0;
			Static486.aBoolean631 = false;
		}
		if (Static251.aClass116_1 != null && Static251.aClass116_1.method2657(arg0)) {
			return;
		}
		Static251.aClass116_1 = arg0;
		Static322.aLong170 = Static112.method2047();
		Static523.anInt9612 = arg1;
		Static480.anInt10344 = arg1;
		if (Static480.anInt10344 == 0) {
			Static149.method2566();
			return;
		}
		Static346.anInt6641 = Static226.anInt4723;
		Static265.aClass112_2 = Static557.aClass112_4;
		Static317.aFloat155 = Static4.aFloat51;
		Static376.aFloat181 = Static61.aFloat48;
		Static450.aFloat190 = Static231.aFloat106;
		Static168.anInt3485 = Static337.anInt6492;
		Static27.aFloat98 = Static145.aFloat72;
		Static44.aFloat46 = Static492.aFloat195;
		Static370.aFloat164 = Static388.aFloat183;
		Static465.anInt8864 = Static489.anInt6943;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)Z")
	public static boolean method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
