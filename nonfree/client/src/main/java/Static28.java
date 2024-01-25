import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_4 = new Class222(1, 2, 2, 0);

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_7 = new Class96("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "[I")
	public static final int[] anIntArray29 = new int[6];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public static void method391() {
		if (Static432.aFrame2 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static303.aFrame1 == null) {
			local17 = Static403.aClass42_6.anApplet1;
		} else {
			local17 = Static303.aFrame1;
		}
		Static90.anInt1737 = local17.getSize().width;
		Static356.anInt6526 = local17.getSize().height;
		@Pc(36) Insets local36;
		if (Static303.aFrame1 == local17) {
			local36 = Static303.aFrame1.getInsets();
			Static90.anInt1737 -= local36.right + local36.left;
			Static356.anInt6526 -= local36.bottom + local36.top;
		}
		if (Static174.method2768() == 1) {
			Static128.anInt2407 = (Static90.anInt1737 - Static170.anInt3041) / 2;
			Static403.anInt7142 = Static170.anInt3041;
			Static83.anInt4881 = 0;
			Static324.anInt5725 = Static73.anInt1378;
		} else if (Static188.anInt3481 < 96 && Static146.anInt2664 == 0) {
			@Pc(82) int local82 = Static90.anInt1737 > 1024 ? 1024 : Static90.anInt1737;
			Static403.anInt7142 = local82;
			@Pc(91) int local91 = Static356.anInt6526 <= 768 ? Static356.anInt6526 : 768;
			Static128.anInt2407 = (Static90.anInt1737 - local82) / 2;
			Static83.anInt4881 = 0;
			Static324.anInt5725 = local91;
		} else {
			Static128.anInt2407 = 0;
			Static324.anInt5725 = Static356.anInt6526;
			Static83.anInt4881 = 0;
			Static403.anInt7142 = Static90.anInt1737;
		}
		if (Static191.aClass174_5 != Static153.aClass174_7) {
			@Pc(128) boolean local128;
			if (Static403.anInt7142 < 1024 && Static324.anInt5725 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static159.aCanvas3.setSize(Static403.anInt7142, Static324.anInt5725);
		if (Static447.aClass121_11 != null) {
			Static447.aClass121_11.method4628(Static159.aCanvas3);
		}
		if (local17 == Static303.aFrame1) {
			local36 = Static303.aFrame1.getInsets();
			Static159.aCanvas3.setLocation(local36.left + Static128.anInt2407, Static83.anInt4881 + local36.top);
		} else {
			Static159.aCanvas3.setLocation(Static128.anInt2407, Static83.anInt4881);
		}
		if (Static246.anInt4292 != -1) {
			Static159.method2523(true);
		}
		Static299.method4092();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
	public static boolean method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static111.method1744(arg0, arg1) || Static153.method3783(arg0, arg1);
	}
}
