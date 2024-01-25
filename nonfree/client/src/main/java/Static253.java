import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	public static int anInt4485;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([BI)Lclient!jd;")
	public static Class20 method3715(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(28) MediaTracker local28 = new MediaTracker(Static243.aClient1);
				local28.addImage(local23, 0);
				local28.waitForAll();
				@Pc(38) int local38 = local23.getWidth(Static243.aClient1);
				@Pc(42) int local42 = local23.getHeight(Static243.aClient1);
				if (!local28.isErrorAny() && local38 >= 0 && local42 >= 0) {
					@Pc(65) int[] local65 = new int[local42 * local38];
					@Pc(77) PixelGrabber local77 = new PixelGrabber(local23, 0, 0, local38, local42, local65, 0, local38);
					local77.grabPixels();
					return Static677.aClass137_47.method7885(local42, local38, local65, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(90) InterruptedException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!nq;II)J")
	public static long method3717(@OriginalArg(0) int arg0, @OriginalArg(1) Interface19 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = 4194304L;
		@Pc(16) long local16 = Long.MIN_VALUE;
		@Pc(25) Class203 local25 = Static511.aClass13_2.method86(arg1.method9171());
		@Pc(46) long local46 = (long) (arg1.method9175() << 14 | arg0 | arg2 << 7 | arg1.method9174() << 20 | 0x40000000);
		if (local25.anInt6045 == 0) {
			local46 |= local16;
		}
		if (local25.anInt6007 == 1) {
			local46 |= local14;
		}
		return local46 | (long) arg1.method9171() << 32;
	}
}
