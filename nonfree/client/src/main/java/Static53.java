import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public static int anInt1469;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_18 = new Class267("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	public static int anInt1471 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(FIFIF)F")
	public static float method1206(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static74.aFloatArrayArray1[arg1];
		return local7[0] * arg0 + local7[1] * arg3 + arg2 * local7[2];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)I")
	public static int method1207(@OriginalArg(1) int arg0) {
		if (Static177.aClass73_6 != null) {
			Static177.aClass73_6.method1875();
			Static177.aClass73_6 = null;
		}
		Static183.anInt4661++;
		if (Static183.anInt4661 > 4) {
			Static183.anInt4661 = 0;
			Static5.anInt245 = 0;
			return arg0;
		}
		Static5.anInt245 = 0;
		if (Static46.anInt1238 == Static426.anInt7595) {
			Static426.anInt7595 = Static135.anInt2875;
		} else {
			Static426.anInt7595 = Static46.anInt1238;
		}
		return -1;
	}
}
