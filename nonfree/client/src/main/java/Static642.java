import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static642 {

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
	public static int anInt10271;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Lclient!av;")
	public static Class26 aClass26_39;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "[I")
	public static int[] anIntArray742;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
	public static boolean aBoolean757 = false;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_98 = new Class269(18, 3);

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "Z")
	public static boolean aBoolean759 = false;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!ti;)I")
	public static int method8578(@OriginalArg(1) Class324 arg0) {
		if (Static545.aClass324_9 == arg0) {
			return 5120;
		} else if (Static545.aClass324_10 == arg0) {
			return 5122;
		} else if (arg0 == Static545.aClass324_11) {
			return 5124;
		} else if (Static545.aClass324_12 == arg0) {
			return 5121;
		} else if (Static545.aClass324_13 == arg0) {
			return 5123;
		} else if (Static545.aClass324_14 == arg0) {
			return 5125;
		} else if (arg0 == Static545.aClass324_15) {
			return 5131;
		} else if (arg0 == Static545.aClass324_16) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Lclient!ae;")
	public static Class2_Sub2_Sub1 method8580() {
		return Static489.aClass2_Sub2_Sub1_4;
	}
}
