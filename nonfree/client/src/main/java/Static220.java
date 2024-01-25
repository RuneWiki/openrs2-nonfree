import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method3487() {
		if (Static125.aFrame1 != null) {
			return;
		}
		@Pc(22) Container local22;
		if (Static593.aFrame2 != null) {
			local22 = Static593.aFrame2;
		} else if (Static562.anApplet2 == null) {
			local22 = Static509.anApplet_Sub1_1;
		} else {
			local22 = Static562.anApplet2;
		}
		Static455.anInt7877 = local22.getSize().width;
		Static248.anInt4654 = local22.getSize().height;
		@Pc(44) Insets local44;
		if (Static593.aFrame2 == local22) {
			local44 = Static593.aFrame2.getInsets();
			Static455.anInt7877 -= local44.right + local44.left;
			Static248.anInt4654 -= local44.top + local44.bottom;
		}
		if (Static212.method3434() == 1) {
			Static140.anInt2937 = Static26.anInt651;
			Static120.anInt2371 = Static554.anInt9119;
			Static212.anInt4095 = (Static455.anInt7877 - Static26.anInt651) / 2;
			Static561.anInt9195 = 0;
		} else {
			Static306.method4565();
		}
		if (Static375.aClass258_6 != Static207.aClass258_3) {
			@Pc(98) boolean local98;
			if (Static140.anInt2937 < 1024 && Static120.anInt2371 < 768) {
				local98 = true;
			} else {
				local98 = false;
			}
		}
		Static471.aCanvas12.setSize(Static140.anInt2937, Static120.anInt2371);
		if (Static307.aClass100_6 != null) {
			Static307.aClass100_6.method6207(Static471.aCanvas12);
		}
		if (local22 == Static593.aFrame2) {
			local44 = Static593.aFrame2.getInsets();
			Static471.aCanvas12.setLocation(Static212.anInt4095 + local44.left, local44.top - -Static561.anInt9195);
		} else {
			Static471.aCanvas12.setLocation(Static212.anInt4095, Static561.anInt9195);
		}
		if (Static554.anInt9121 != -1) {
			Static75.method1189(true);
		}
		Static468.method6574();
	}
}
