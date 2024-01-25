import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Lclient!ct;")
	public static Class30 aClass30_96;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "Lclient!ct;")
	public static Class30 aClass30_97;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "Lclient!bt;")
	public static Class21 aClass21_169 = new Class21(64);

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	public static int anInt6389 = -1;

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "[Lclient!pl;")
	public static final Class162[] aClass162Array1 = new Class162[29];

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
	public static void method5655(@OriginalArg(1) int arg0) {
		Static66.anInt1561 = arg0;
		@Pc(7) Class21 local7 = Static161.aClass21_91;
		synchronized (Static161.aClass21_91) {
			Static161.aClass21_91.method857();
		}
		local7 = Static168.aClass21_97;
		synchronized (Static168.aClass21_97) {
			Static168.aClass21_97.method857();
		}
		@Pc(41) Class21 local41 = Static300.aClass21_152;
		synchronized (Static300.aClass21_152) {
			Static300.aClass21_152.method857();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)I")
	public static int method5657(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(DB)V")
	public static void method5658(@OriginalArg(0) double arg0) {
		if (Static152.aDouble1 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static62.anIntArray123[local16] = local28 <= 255 ? local28 : 255;
		}
		Static152.aDouble1 = arg0;
	}
}
