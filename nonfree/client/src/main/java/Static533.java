import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[Lclient!vb;")
	public static Class26_Sub1_Sub1_Sub1[] aClass26_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!kca;")
	public static Class189 aClass189_9;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_122 = new Class61(39, 2);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IC)Z")
	public static boolean method7416(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[B)Lclient!xa;")
	public static Class13 method7418(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static81.aClient7);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static81.aClient7);
				@Pc(38) int local38 = local19.getHeight(Static81.aClient7);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static185.aClass66_14.method6843(local55, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(79) InterruptedException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBILclient!gba;)V")
	public static void method7420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray27 != null) {
			@Pc(13) Class4_Sub12 local13 = new Class4_Sub12();
			local13.aClass115_5 = arg2;
			local13.anObjectArray3 = arg2.anObjectArray27;
			Static205.method3636(local13);
		}
		Static466.anInt7871 = arg1;
		Static524.aBoolean617 = true;
		Static178.anInt3780 = arg2.anInt3527;
		Static485.anInt8162 = arg2.anInt3438;
		Static209.anInt9662 = arg2.anInt3510;
		Static143.anInt3245 = arg2.anInt3517;
		Static539.anInt9099 = arg2.anInt3464;
		Static360.anInt6361 = arg0;
		Static330.method4950(arg2);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!bi;BI)Lclient!kga;")
	public static Class196 method7421(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method661(arg1);
		return local13 == null ? null : new Class196(local13);
	}
}
