import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!os", name = "K", descriptor = "Lclient!uq;")
	public static Class362 aClass362_97;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_75 = new Class240(54, -1);

	@OriginalMember(owner = "client!os", name = "O", descriptor = "[I")
	public static final int[] anIntArray393 = new int[6];

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
	public static void method6035() {
		if (Static119.aClass95_4.method8033()) {
			Static119.aClass95_4.method8065(Static330.aCanvas5);
			Static26.method594();
			if (Static498.aBoolean757) {
				Static16.method8267(Static330.aCanvas5);
			} else {
				@Pc(23) Dimension local23 = Static330.aCanvas5.getSize();
				Static119.aClass95_4.method8028(Static330.aCanvas5, local23.width, local23.height);
			}
			Static119.aClass95_4.method8073(Static330.aCanvas5);
		} else {
			Static168.method2665(false, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899());
		}
		Static184.method2885();
		Static182.aBoolean246 = true;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)V")
	public static void method6036() {
		if (!Static24.method565()) {
			return;
		}
		if (Static239.aStringArray27 == null) {
			Static539.method6914();
		}
		Static137.anInt2624 = 0;
		Static451.aBoolean520 = true;
	}
}
