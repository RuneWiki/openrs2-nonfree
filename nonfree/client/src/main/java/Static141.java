import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!g;")
	public static Class83 aClass83_59;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_40 = new Class183(79, 4);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method2425() {
		if (Static33.aFrame2 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static115.aFrame3 == null) {
			local12 = Static154.aClass123_2.anApplet1;
		} else {
			local12 = Static115.aFrame3;
		}
		Static316.anInt5775 = local12.getSize().width;
		Static72.anInt1616 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static115.aFrame3 == local12) {
			local31 = Static115.aFrame3.getInsets();
			Static316.anInt5775 -= local31.right + local31.left;
			Static72.anInt1616 -= local31.bottom + local31.top;
		}
		if (Static195.method3553() == 1) {
			Static7.anInt157 = Static26.anInt374;
			Static275.anInt6176 = 0;
			Static336.anInt6217 = Static125.anInt2718;
			Static324.anInt5937 = (Static316.anInt5775 - Static26.anInt374) / 2;
		} else if (Static199.anInt4131 < 96 && Static36.anInt2910 == 0) {
			@Pc(83) int local83 = Static316.anInt5775 > 1024 ? 1024 : Static316.anInt5775;
			Static324.anInt5937 = (Static316.anInt5775 - local83) / 2;
			Static7.anInt157 = local83;
			@Pc(101) int local101 = Static72.anInt1616 > 768 ? 768 : Static72.anInt1616;
			Static336.anInt6217 = local101;
			Static275.anInt6176 = 0;
		} else {
			Static324.anInt5937 = 0;
			Static275.anInt6176 = 0;
			Static336.anInt6217 = Static72.anInt1616;
			Static7.anInt157 = Static316.anInt5775;
		}
		if (Static158.aClass49_3 != Static306.aClass49_7) {
			@Pc(125) boolean local125;
			if (Static7.anInt157 < 1024 && Static336.anInt6217 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static343.aCanvas5.setSize(Static7.anInt157, Static336.anInt6217);
		if (Static383.aClass48_9 != null) {
			Static383.aClass48_9.method2471();
		}
		if (Static115.aFrame3 == local12) {
			local31 = Static115.aFrame3.getInsets();
			Static343.aCanvas5.setLocation(local31.left + Static324.anInt5937, Static275.anInt6176 + local31.top);
		} else {
			Static343.aCanvas5.setLocation(Static324.anInt5937, Static275.anInt6176);
		}
		if (Static388.anInt7080 != -1) {
			Static357.method5625(true);
		}
		Static215.method3857();
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	public static void method2427() {
		@Pc(3) Class199[] local3 = Class250.aClass199Array1;
		synchronized (Class250.aClass199Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class250.aClass199Array1.length; local13++) {
				Class250.aClass199Array1[local13] = new Class199();
				Static75.anIntArray125[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method2428(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(12, arg0);
		local8.method1197();
	}
}
