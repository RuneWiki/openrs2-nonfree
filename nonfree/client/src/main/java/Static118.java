import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
	public static final boolean aBoolean169 = true;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public static void method1851() {
		if (Static264.aFrame2 != null) {
			return;
		}
		@Pc(20) Container local20;
		if (Static142.aFrame1 != null) {
			local20 = Static142.aFrame1;
		} else if (Static590.anApplet2 == null) {
			local20 = Static170.anApplet_Sub1_1;
		} else {
			local20 = Static590.anApplet2;
		}
		Static493.anInt8493 = local20.getSize().width;
		Static38.anInt603 = local20.getSize().height;
		@Pc(44) Insets local44;
		if (local20 == Static142.aFrame1) {
			local44 = Static142.aFrame1.getInsets();
			Static38.anInt603 -= local44.bottom + local44.top;
			Static493.anInt8493 -= local44.right + local44.left;
		}
		if (Static195.method2980() == 1) {
			Static272.anInt4785 = 0;
			Static130.anInt2566 = Static573.anInt9475;
			Static281.anInt4923 = (Static493.anInt8493 - Static573.anInt9475) / 2;
			Static499.anInt4149 = Static103.anInt2084;
		} else {
			Static309.method4298();
		}
		if (Static357.aClass308_6 != Static199.aClass308_3) {
			@Pc(91) boolean local91;
			if (Static130.anInt2566 < 1024 && Static499.anInt4149 < 768) {
				local91 = true;
			} else {
				local91 = false;
			}
		}
		Static499.aCanvas9.setSize(Static130.anInt2566, Static499.anInt4149);
		if (Static16.aClass134_1 != null) {
			Static16.aClass134_1.method6909(Static499.aCanvas9);
		}
		if (local20 == Static142.aFrame1) {
			local44 = Static142.aFrame1.getInsets();
			Static499.aCanvas9.setLocation(Static281.anInt4923 + local44.left, Static272.anInt4785 + local44.top);
		} else {
			Static499.aCanvas9.setLocation(Static281.anInt4923, Static272.anInt4785);
		}
		if (Static422.anInt7311 != -1) {
			Static482.method6526(true);
		}
		Static190.method2922();
	}
}
