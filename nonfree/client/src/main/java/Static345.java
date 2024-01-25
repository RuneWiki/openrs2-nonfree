import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray91 = new boolean[8];

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[B)Lclient!cw;")
	public static Class61 method4632(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static78.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static78.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static78.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local38 * local34];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static192.aClass95_4.method6953(local55, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(80) InterruptedException local80) {
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIZZ)I")
	public static int method4634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class2_Sub8 local18 = Static384.method5147(arg0, false);
		if (local18 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local18.anIntArray123.length; local26++) {
			if (local18.anIntArray123[local26] >= 0 && local18.anIntArray123[local26] < Static72.aClass225_2.anInt5618) {
				@Pc(48) Class34 local48 = Static72.aClass225_2.method4789(local18.anIntArray123[local26]);
				@Pc(58) int local58 = local48.method688(Static339.aClass66_1.method1439(arg1).anInt6043, arg1);
				if (arg2) {
					local24 += local58 * local18.anIntArray122[local26];
				} else {
					local24 += local58;
				}
			}
		}
		return local24;
	}
}
