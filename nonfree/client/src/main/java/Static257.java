import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "J")
	public static long aLong135;

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public static int anInt5006 = -1;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
	public static String method4310(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg3 < 0L) {
			local25 = true;
			arg3 = -arg3;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg0 > 0) {
			for (local46 = 0; local46 < arg0; local46++) {
				local51 = (int) arg3;
				arg3 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg3 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg3;
			arg3 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg1) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([BI)Lclient!fd;")
	public static Class103 method4311(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(25) MediaTracker local25 = new MediaTracker(Static554.aClient1);
				local25.addImage(local20, 0);
				local25.waitForAll();
				@Pc(35) int local35 = local20.getWidth(Static554.aClient1);
				@Pc(39) int local39 = local20.getHeight(Static554.aClient1);
				if (!local25.isErrorAny() && local35 >= 0 && local39 >= 0) {
					@Pc(59) int[] local59 = new int[local35 * local39];
					@Pc(71) PixelGrabber local71 = new PixelGrabber(local20, 0, 0, local35, local39, local59, 0, local35);
					local71.grabPixels();
					return Static266.aClass82_8.method6112(local39, local59, local35, local35);
				}
				throw new RuntimeException("");
			} catch (@Pc(84) InterruptedException local84) {
			}
		}
	}
}
