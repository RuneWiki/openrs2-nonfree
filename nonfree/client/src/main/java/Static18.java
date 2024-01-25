import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!lj;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public static void method246() {
		if (Static376.aFrame4 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static203.aFrame3 != null) {
			local14 = Static203.aFrame3;
		} else if (Static31.anApplet1 == null) {
			local14 = Static150.anApplet_Sub1_1;
		} else {
			local14 = Static31.anApplet1;
		}
		Static308.anInt5172 = local14.getSize().width;
		Static570.anInt9271 = local14.getSize().height;
		@Pc(41) Insets local41;
		if (Static203.aFrame3 == local14) {
			local41 = Static203.aFrame3.getInsets();
			Static308.anInt5172 -= local41.right + local41.left;
			Static570.anInt9271 -= local41.bottom + local41.top;
		}
		if (Static38.method626() == 1) {
			Static322.anInt5444 = (Static308.anInt5172 - Static245.anInt4333) / 2;
			Static40.anInt758 = Static245.anInt4333;
			Static308.anInt5171 = Static66.anInt1531;
			Static486.anInt7950 = 0;
		} else {
			Static222.method3506();
		}
		if (Static478.aClass272_10 != Static516.aClass272_11) {
			@Pc(89) boolean local89;
			if (Static40.anInt758 < 1024 && Static308.anInt5171 < 768) {
				local89 = true;
			} else {
				local89 = false;
			}
		}
		Static387.aCanvas9.setSize(Static40.anInt758, Static308.anInt5171);
		if (Static505.aClass45_11 != null) {
			Static505.aClass45_11.method7403(Static387.aCanvas9);
		}
		if (Static203.aFrame3 == local14) {
			local41 = Static203.aFrame3.getInsets();
			Static387.aCanvas9.setLocation(Static322.anInt5444 + local41.left, local41.top + Static486.anInt7950);
		} else {
			Static387.aCanvas9.setLocation(Static322.anInt5444, Static486.anInt7950);
		}
		if (Static353.anInt6188 != -1) {
			Static101.method1867(true);
		}
		Static189.method3211();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method248(@OriginalArg(0) int arg0) {
		if (Static293.method3974(arg0)) {
			Static413.method5923(-1, Static380.aClass361ArrayArray2[arg0]);
		}
	}
}
