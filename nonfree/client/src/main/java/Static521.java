import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "[Lclient!aba;")
	public static Class4_Sub1_Sub1_Sub1[] aClass4_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public static int anInt8974;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_145 = new Class337(78, 11);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public static void method7716() {
		@Pc(7) client local7 = Static475.aClient1;
		synchronized (Static475.aClient1) {
			if (Static323.aFrame2 == null) {
				@Pc(18) Container local18;
				if (Static190.aFrame1 != null) {
					local18 = Static190.aFrame1;
				} else if (Static7.anApplet1 == null) {
					local18 = Static580.anApplet_Sub1_1;
				} else {
					local18 = Static7.anApplet1;
				}
				Static312.anInt10525 = local18.getSize().width;
				Static28.anInt359 = local18.getSize().height;
				@Pc(42) Insets local42;
				if (Static190.aFrame1 == local18) {
					local42 = Static190.aFrame1.getInsets();
					Static28.anInt359 -= local42.top + local42.bottom;
					Static312.anInt10525 -= local42.left + local42.right;
				}
				if (Static138.method2022() == 1) {
					Static408.anInt7118 = Static627.anInt10422;
					Static147.anInt2574 = 0;
					Static246.anInt4491 = (Static312.anInt10525 - Static79.anInt1667) / 2;
					Static345.anInt5827 = Static79.anInt1667;
				} else {
					Static604.method8676();
				}
				if (Static517.aClass15_8 != Static211.aClass15_2) {
					@Pc(95) boolean local95;
					if (Static345.anInt5827 < 1024 && Static408.anInt7118 < 768) {
						local95 = true;
					} else {
						local95 = false;
					}
				}
				Static83.aCanvas14.setSize(Static345.anInt5827, Static408.anInt7118);
				if (Static213.aClass133_5 != null) {
					if (Static428.aBoolean526) {
						Static240.method4003(Static83.aCanvas14);
					} else {
						Static213.aClass133_5.method7276(Static83.aCanvas14, Static345.anInt5827, Static408.anInt7118);
					}
				}
				if (local18 == Static190.aFrame1) {
					local42 = Static190.aFrame1.getInsets();
					Static83.aCanvas14.setLocation(local42.left + Static246.anInt4491, local42.top + Static147.anInt2574);
				} else {
					Static83.aCanvas14.setLocation(Static246.anInt4491, Static147.anInt2574);
				}
				if (Static337.anInt5727 != -1) {
					Static555.method8083(true);
				}
				Static181.method2785();
			}
		}
	}
}
