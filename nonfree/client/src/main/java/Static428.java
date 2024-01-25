import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
	public static int anInt6973;

	@OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
	public static int anInt7012;

	@OriginalMember(owner = "client!vj", name = "Bd", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "(I)V")
	public static void method5557() {
		if (Static438.aFrame2 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static10.aFrame1 == null) {
			local18 = Static66.aClass143_2.anApplet1;
		} else {
			local18 = Static10.aFrame1;
		}
		Static301.anInt2468 = local18.getSize().width;
		Static348.anInt5912 = local18.getSize().height;
		@Pc(36) Insets local36;
		if (Static10.aFrame1 == local18) {
			local36 = Static10.aFrame1.getInsets();
			Static301.anInt2468 -= local36.right + local36.left;
			Static348.anInt5912 -= local36.top + local36.bottom;
		}
		if (Static391.method5269() == 1) {
			Static123.anInt2625 = Static213.anInt4087;
			Static64.anInt1683 = 0;
			Static163.anInt6305 = (Static301.anInt2468 - Static349.anInt5940) / 2;
			Static333.anInt5712 = Static349.anInt5940;
		} else if (Static286.anInt1448 < 96 && Static105.anInt2382 == 0) {
			@Pc(98) int local98 = Static301.anInt2468 > 1024 ? 1024 : Static301.anInt2468;
			@Pc(105) int local105 = Static348.anInt5912 <= 768 ? Static348.anInt5912 : 768;
			Static163.anInt6305 = (Static301.anInt2468 - local98) / 2;
			Static333.anInt5712 = local98;
			Static64.anInt1683 = 0;
			Static123.anInt2625 = local105;
		} else {
			Static123.anInt2625 = Static348.anInt5912;
			Static333.anInt5712 = Static301.anInt2468;
			Static64.anInt1683 = 0;
			Static163.anInt6305 = 0;
		}
		if (Static191.aClass182_6 != Static10.aClass182_1) {
			@Pc(130) boolean local130;
			if (Static333.anInt5712 < 1024 && Static123.anInt2625 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static392.aCanvas6.setSize(Static333.anInt5712, Static123.anInt2625);
		if (Static121.aClass172_3 != null) {
			Static121.aClass172_3.method5514(Static392.aCanvas6);
		}
		if (local18 == Static10.aFrame1) {
			local36 = Static10.aFrame1.getInsets();
			Static392.aCanvas6.setLocation(Static163.anInt6305 + local36.left, Static64.anInt1683 + local36.top);
		} else {
			Static392.aCanvas6.setLocation(Static163.anInt6305, Static64.anInt1683);
		}
		if (Static226.anInt4225 != -1) {
			Static430.method2668(true);
		}
		Static134.method2068();
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)V")
	public static void method5582() {
		Static166.aClass172_6.ua(Static317.aFloat61 * ((float) Static374.aClass20_Sub1_1.anInt2346 * 0.1F + 0.7F));
		Static166.aClass172_6.XA(Static77.anInt1942, Static396.aFloat71, Static329.aFloat64, (float) (Static453.anInt7635 << 0), (float) (Static103.anInt2330 << 0), (float) (Static149.anInt3020 << 0));
		Static166.aClass172_6.method5530(Static347.aClass23_6);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!bu;Lclient!bu;I)I")
	public static int method5590(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method800(Static367.anInt6181)) {
			local5++;
		}
		if (arg1.method800(Static387.anInt6464)) {
			local5++;
		}
		if (arg1.method800(Static230.anInt4275)) {
			local5++;
		}
		if (arg0.method800(Static367.anInt6181)) {
			local5++;
		}
		if (arg0.method800(Static387.anInt6464)) {
			local5++;
		}
		if (arg0.method800(Static230.anInt4275)) {
			local5++;
		}
		return local5;
	}
}
