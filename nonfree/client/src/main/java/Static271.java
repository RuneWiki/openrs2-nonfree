import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!iea", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_74 = new Class397(136, 17);

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_5 = new Class344(11, 4);

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZI[B)[B")
	public static byte[] method3835(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(12) byte[] local12 = new byte[arg0];
		Static732.method6320(arg1, 0, local12, 0, arg0);
		return local12;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "([BZ)Lclient!kw;")
	public static Class178 method3836(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static459.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static459.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static459.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(65) int[] local65 = new int[local36 * local40];
					@Pc(77) PixelGrabber local77 = new PixelGrabber(local21, 0, 0, local36, local40, local65, 0, local36);
					local77.grabPixels();
					return Static153.aClass22_4.method9367(local65, local36, local40, local36);
				}
				throw new RuntimeException("");
			} catch (@Pc(90) InterruptedException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V")
	public static void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub7_Sub21 local15 = Static136.method2378((long) arg1, 6);
		local15.method9256();
		local15.anInt10899 = arg0;
	}
}
