import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "[Lclient!ep;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!fc;")
	public static Class73 aClass73_11;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)[Lclient!ud;")
	public static Class225[] method4860() {
		return new Class225[] { Static18.aClass225_1, Static281.aClass225_3, Static391.aClass225_4 };
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
	public static void method4861() {
		Static68.aClass98_1.method4516();
		Static136.aClass91_2.method5218();
		if (Static366.aClass29_1 != null) {
			Static366.aClass29_1.method509(Static343.aCanvas5);
		}
		Static12.aClient1.method774();
		Static343.aCanvas5.setBackground(Color.black);
		Static196.anInt2472 = -1;
		Static68.aClass98_1 = Static178.method3287(Static343.aCanvas5);
		Static136.aClass91_2 = Static104.method1849(Static343.aCanvas5);
		if (Static366.aClass29_1 != null) {
			Static366.aClass29_1.method513(Static343.aCanvas5);
		}
	}
}
