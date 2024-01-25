import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public static int anInt5156;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!fs;")
	public static Class76 aClass76_54;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_11 = new Class98(6, 0, 4, 2);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method3938() {
		if (Static320.aFrame3 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static226.aFrame1 == null) {
			local13 = Static206.aClass66_4.anApplet1;
		} else {
			local13 = Static226.aFrame1;
		}
		Static425.anInt7000 = local13.getSize().width;
		Static17.anInt222 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static226.aFrame1 == local13) {
			local31 = Static226.aFrame1.getInsets();
			Static425.anInt7000 -= local31.left + local31.right;
			Static17.anInt222 -= local31.bottom + local31.top;
		}
		if (Static450.method5664() == 1) {
			Static302.anInt5346 = Static157.anInt3148;
			Static141.anInt2881 = Static353.anInt6121;
			Static230.anInt4424 = (Static425.anInt7000 - Static353.anInt6121) / 2;
			Static303.anInt5363 = 0;
		} else if (Static70.anInt1503 < 96 && Static177.anInt2973 == 0) {
			@Pc(100) int local100 = Static425.anInt7000 > 1024 ? 1024 : Static425.anInt7000;
			Static141.anInt2881 = local100;
			@Pc(109) int local109 = Static17.anInt222 <= 768 ? Static17.anInt222 : 768;
			Static230.anInt4424 = (Static425.anInt7000 - local100) / 2;
			Static302.anInt5346 = local109;
			Static303.anInt5363 = 0;
		} else {
			Static302.anInt5346 = Static17.anInt222;
			Static141.anInt2881 = Static425.anInt7000;
			Static303.anInt5363 = 0;
			Static230.anInt4424 = 0;
		}
		if (Static104.aClass219_2 != Static373.aClass219_6) {
			@Pc(132) boolean local132;
			if (Static141.anInt2881 < 1024 && Static302.anInt5346 < 768) {
				local132 = true;
			} else {
				local132 = false;
			}
		}
		Static273.aCanvas5.setSize(Static141.anInt2881, Static302.anInt5346);
		if (Static122.aClass19_16 != null) {
			Static122.aClass19_16.method4272(Static273.aCanvas5);
		}
		if (local13 == Static226.aFrame1) {
			local31 = Static226.aFrame1.getInsets();
			Static273.aCanvas5.setLocation(Static230.anInt4424 + local31.left, local31.top - -Static303.anInt5363);
		} else {
			Static273.aCanvas5.setLocation(Static230.anInt4424, Static303.anInt5363);
		}
		if (Static334.anInt5766 != -1) {
			Static327.method4422(true);
		}
		Static348.method4697();
	}
}
