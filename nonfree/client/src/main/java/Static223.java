import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[S")
	public static short[] aShortArray58;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public static int anInt4665 = 0;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_55 = new Class181(49, 8);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!ep;")
	public static Class93 method4011(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static336.aClass93ArrayArray2[local7] == null || Static336.aClass93ArrayArray2[local7][local11] == null) {
			@Pc(27) boolean local27 = Static457.method7117(local7);
			if (!local27) {
				return null;
			}
		}
		return Static336.aClass93ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[B)Lclient!xa;")
	public static Class66 method4015(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(12) Image local12 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(17) MediaTracker local17 = new MediaTracker(Static363.aClient1);
			local17.addImage(local12, 0);
			local17.waitForAll();
			@Pc(27) int local27 = local12.getWidth(Static363.aClient1);
			@Pc(31) int local31 = local12.getHeight(Static363.aClient1);
			@Pc(36) int[] local36 = new int[local27 * local31];
			@Pc(48) PixelGrabber local48 = new PixelGrabber(local12, 0, 0, local27, local31, local36, 0, local27);
			local48.grabPixels();
			return Static323.aClass9_8.method5423(local36, local27, local27, local31);
		} catch (@Pc(60) InterruptedException local60) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ok;B)V")
	public static void method4017(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.aClass11_1 = null;
		@Pc(12) int local12 = arg0.aClass5_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass5_Sub4Array1[local14].aBoolean456 = false;
		}
		@Pc(32) Class267[] local32 = Class105.aClass267Array1;
		synchronized (Class105.aClass267Array1) {
			if (local12 < Class105.aClass267Array1.length && Static284.anIntArray404[local12] < 200) {
				Class105.aClass267Array1[local12].method6538(arg0);
				@Pc(62) int local62 = Static284.anIntArray404[local12]++;
			}
		}
	}
}
