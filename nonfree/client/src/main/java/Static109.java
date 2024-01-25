import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static109 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!al;")
	public static final Class17 aClass17_2 = new Class17();

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public static int anInt2171 = 1;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_53 = new Class56(71, 2);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)I")
	public static int method1913(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method1915() {
		if (Static56.anInt1176 < 0) {
			Static56.anInt1176 = 0;
			Static406.anInt7005 = -1;
			Static455.anInt7670 = -1;
		}
		if (Static44.anInt9261 < Static56.anInt1176) {
			Static455.anInt7670 = -1;
			Static406.anInt7005 = -1;
			Static56.anInt1176 = Static44.anInt9261;
		}
		if (Static334.anInt5600 < 0) {
			Static334.anInt5600 = 0;
			Static406.anInt7005 = -1;
			Static455.anInt7670 = -1;
		}
		if (Static44.anInt9269 < Static334.anInt5600) {
			Static455.anInt7670 = -1;
			Static406.anInt7005 = -1;
			Static334.anInt5600 = Static44.anInt9269;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method1919() {
		return Static150.aBoolean254 || Static369.aClass3_Sub43_3 == null ? "" : Static369.aClass3_Sub43_3.aString74;
	}
}
