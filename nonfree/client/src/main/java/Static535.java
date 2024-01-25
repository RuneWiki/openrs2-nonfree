import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "Lclient!pj;")
	public static Class248 aClass248_105;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Lclient!uj;")
	public static final Class321 aClass321_7 = new Class321();

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString84 = "";

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!mh;III)V")
	public static void method7283(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static511.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt3807 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub25Array4[arg0.anInt3807++] = Static111.aClass255Array1[local21 - 1].aClass6_Sub25_3;
			local9 += 16L;
		}
		for (local21 = arg0.anInt3807; local21 < 4; local21++) {
			arg0.aClass6_Sub25Array4[local21] = null;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([BZ)Lclient!xa;")
	public static Class71 method7285(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Image local7 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(12) MediaTracker local12 = new MediaTracker(Static536.aClient1);
			local12.addImage(local7, 0);
			local12.waitForAll();
			@Pc(22) int local22 = local7.getWidth(Static536.aClient1);
			@Pc(26) int local26 = local7.getHeight(Static536.aClient1);
			@Pc(31) int[] local31 = new int[local22 * local26];
			@Pc(48) PixelGrabber local48 = new PixelGrabber(local7, 0, 0, local22, local26, local31, 0, local22);
			local48.grabPixels();
			return Static554.aClass90_12.method7471(local31, local22, local22, local26);
		} catch (@Pc(60) InterruptedException local60) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)I")
	public static int method7286(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLclient!faa;I)I")
	public static int method7287(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1) {
		if (!Static74.method1044(arg0).method5833(arg1) && arg0.anObjectArray2 == null) {
			return -1;
		} else if (arg0.anIntArray272 == null || arg1 >= arg0.anIntArray272.length) {
			return -1;
		} else {
			return arg0.anIntArray272[arg1];
		}
	}
}
