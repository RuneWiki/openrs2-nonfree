import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!uu", name = "V", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_184 = new Class129(70, -2);

	@OriginalMember(owner = "client!uu", name = "Kb", descriptor = "I")
	public static int anInt7074 = 10;

	@OriginalMember(owner = "client!uu", name = "Sb", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_115 = new Class198("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!uu", name = "Tb", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ew;B)V")
	public static void method5607(@OriginalArg(0) Class71 arg0) {
		Static330.aClass71_1 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "(Z)V")
	public static void method5609() {
		Static457.method5989();
		Static371.aClass24_4 = null;
		Static300.aClass24_2 = null;
		Static277.aClass196ArrayArray1 = null;
		Static348.aClass200_7 = null;
		Static191.aClass24_1 = null;
	}

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "(I)V")
	public static void method5616() {
		if (Static317.aFrame2 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static34.aFrame1 == null) {
			local13 = Static7.aClass93_1.anApplet1;
		} else {
			local13 = Static34.aFrame1;
		}
		Static236.anInt3873 = local13.getSize().width;
		Static273.anInt4301 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (local13 == Static34.aFrame1) {
			local31 = Static34.aFrame1.getInsets();
			Static236.anInt3873 -= local31.right + local31.left;
			Static273.anInt4301 -= local31.top + local31.bottom;
		}
		if (Static213.method2819() == 1) {
			Static433.anInt7213 = (Static236.anInt3873 - Static36.anInt724) / 2;
			Static178.anInt5792 = Static36.anInt724;
			Static102.anInt1723 = Static243.anInt3934;
			Static59.anInt1109 = 0;
		} else if (Static102.anInt1724 < 96 && Static146.anInt2644 == 0) {
			@Pc(82) int local82 = Static236.anInt3873 <= 1024 ? Static236.anInt3873 : 1024;
			Static433.anInt7213 = (Static236.anInt3873 - local82) / 2;
			Static178.anInt5792 = local82;
			@Pc(98) int local98 = Static273.anInt4301 > 768 ? 768 : Static273.anInt4301;
			Static102.anInt1723 = local98;
			Static59.anInt1109 = 0;
		} else {
			Static433.anInt7213 = 0;
			Static178.anInt5792 = Static236.anInt3873;
			Static102.anInt1723 = Static273.anInt4301;
			Static59.anInt1109 = 0;
		}
		if (Static350.aClass170_10 != Static289.aClass170_8) {
			@Pc(122) boolean local122;
			if (Static178.anInt5792 < 1024 && Static102.anInt1723 < 768) {
				local122 = true;
			} else {
				local122 = false;
			}
		}
		Static246.aCanvas2.setSize(Static178.anInt5792, Static102.anInt1723);
		if (Static407.aClass200_9 != null) {
			Static407.aClass200_9.method5831(Static246.aCanvas2);
		}
		if (local13 == Static34.aFrame1) {
			local31 = Static34.aFrame1.getInsets();
			Static246.aCanvas2.setLocation(Static433.anInt7213 + local31.left, local31.top - -Static59.anInt1109);
		} else {
			Static246.aCanvas2.setLocation(Static433.anInt7213, Static59.anInt1109);
		}
		if (Static199.anInt3319 != -1) {
			Static330.method4011(true);
		}
		Static260.method3340();
	}
}
