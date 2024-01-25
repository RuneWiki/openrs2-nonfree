import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!b;")
	public static Class20 aClass20_98;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public static int anInt6446;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
	public static boolean aBoolean501 = false;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Lclient!ba;")
	public static final Class21 aClass21_5 = new Class21(64);

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[128][128];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method5695() {
		if (Static225.aFrame2 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static34.aFrame1 == null) {
			local12 = Static61.aClass156_1.anApplet1;
		} else {
			local12 = Static34.aFrame1;
		}
		Static276.anInt4800 = local12.getSize().width;
		Static177.anInt3088 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static34.aFrame1 == local12) {
			local31 = Static34.aFrame1.getInsets();
			Static276.anInt4800 -= local31.right + local31.left;
			Static177.anInt3088 -= local31.top + local31.bottom;
		}
		if (Static200.method3135() == 1) {
			Static92.anInt1900 = 0;
			Static207.anInt2251 = Static174.anInt3036;
			Static199.anInt3567 = Static196.anInt5198;
			Static125.anInt2386 = (Static276.anInt4800 - Static196.anInt5198) / 2;
		} else if (Static368.anInt6173 < 96 && Static2.anInt68 == 0) {
			@Pc(81) int local81 = Static276.anInt4800 <= 1024 ? Static276.anInt4800 : 1024;
			Static199.anInt3567 = local81;
			@Pc(92) int local92 = Static177.anInt3088 <= 768 ? Static177.anInt3088 : 768;
			Static125.anInt2386 = (Static276.anInt4800 - local81) / 2;
			Static92.anInt1900 = 0;
			Static207.anInt2251 = local92;
		} else {
			Static92.anInt1900 = 0;
			Static199.anInt3567 = Static276.anInt4800;
			Static207.anInt2251 = Static177.anInt3088;
			Static125.anInt2386 = 0;
		}
		if (Static238.aClass171_4 != Static291.aClass171_5) {
			@Pc(125) boolean local125;
			if (Static199.anInt3567 < 1024 && Static207.anInt2251 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static173.aCanvas2.setSize(Static199.anInt3567, Static207.anInt2251);
		if (Static347.aClass155_9 != null) {
			Static347.aClass155_9.method4909();
		}
		if (local12 == Static34.aFrame1) {
			local31 = Static34.aFrame1.getInsets();
			Static173.aCanvas2.setLocation(local31.left + Static125.anInt2386, local31.top + Static92.anInt1900);
		} else {
			Static173.aCanvas2.setLocation(Static125.anInt2386, Static92.anInt1900);
		}
		if (Static68.anInt1346 != -1) {
			Static45.method706(true);
		}
		Static122.method1947();
	}
}
