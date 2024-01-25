import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static final int anInt3517 = 1338;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	public static void method2774() {
		if (Static514.aFrame2 != null) {
			return;
		}
		@Pc(19) Container local19;
		if (Static402.aFrame3 != null) {
			local19 = Static402.aFrame3;
		} else if (Static589.anApplet2 == null) {
			local19 = Static220.anApplet_Sub1_2;
		} else {
			local19 = Static589.anApplet2;
		}
		Static308.anInt6203 = local19.getSize().width;
		Static507.anInt9504 = local19.getSize().height;
		@Pc(41) Insets local41;
		if (local19 == Static402.aFrame3) {
			local41 = Static402.aFrame3.getInsets();
			Static507.anInt9504 -= local41.top + local41.bottom;
			Static308.anInt6203 -= local41.right + local41.left;
		}
		if (Static578.method8122() == 1) {
			Static71.anInt1872 = Static324.anInt6378;
			Static123.anInt9150 = Static370.anInt7124;
			Static7.anInt723 = (Static308.anInt6203 - Static370.anInt7124) / 2;
			Static347.anInt6686 = 0;
		} else {
			Static319.method4996();
		}
		if (Static342.aClass326_6 != Static383.aClass326_7) {
			@Pc(95) boolean local95;
			if (Static123.anInt9150 < 1024 && Static71.anInt1872 < 768) {
				local95 = true;
			} else {
				local95 = false;
			}
		}
		Static201.aCanvas7.setSize(Static123.anInt9150, Static71.anInt1872);
		if (Static39.aClass7_2 != null) {
			Static39.aClass7_2.method7840(Static201.aCanvas7);
		}
		if (local19 == Static402.aFrame3) {
			local41 = Static402.aFrame3.getInsets();
			Static201.aCanvas7.setLocation(local41.left + Static7.anInt723, local41.top + Static347.anInt6686);
		} else {
			Static201.aCanvas7.setLocation(Static7.anInt723, Static347.anInt6686);
		}
		if (Static446.anInt8493 != -1) {
			Static284.method4495(true);
		}
		Static452.method6641();
	}
}
