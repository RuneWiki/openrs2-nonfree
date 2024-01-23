import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!tk;")
	public static Class164 aClass164_4;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static int anInt3156;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	public static int method2485() {
		return Static263.anInt908 == 0 ? 0 : Static240.anInterface3Array6[Static263.anInt908].method3963();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method2486() {
		Static233.aClass10_48 = new Class10();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Lclient!tb;")
	public static Class59_Sub2 method2487() {
		@Pc(27) Class59_Sub2 local27 = new Class59_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], Static274.aByteArrayArray20[0], Static6.anIntArray14);
		Static268.method4006();
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method2488() {
		@Pc(3) int local3 = Static35.anInt709;
		@Pc(15) int local15 = Static179.anInt3545 - local3 - Static111.anInt2450;
		@Pc(21) int local21 = Static122.anInt2660;
		@Pc(29) int local29 = Static210.anInt4102 - local21 - Static216.anInt4287;
		if (local3 <= 0 && local15 <= 0 && local21 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static55.aFrame2 != null) {
				local48 = Static55.aFrame2;
			} else if (Static27.aFrame3 == null) {
				local48 = Static87.aClass164_2.anApplet1;
			} else {
				local48 = Static27.aFrame3;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (Static27.aFrame3 == local48) {
				@Pc(70) Insets local70 = Static27.aFrame3.getInsets();
				local62 = local70.top;
				local64 = local70.left;
			}
			@Pc(79) Graphics local79 = local48.getGraphics();
			local79.setColor(Color.black);
			if (local3 > 0) {
				local79.fillRect(local64, local62, local3, Static210.anInt4102);
			}
			if (local21 > 0) {
				local79.fillRect(local64, local62, Static179.anInt3545, local21);
			}
			if (local15 > 0) {
				local79.fillRect(local64 + Static179.anInt3545 - local15, local62, local15, Static210.anInt4102);
			}
			if (local29 > 0) {
				local79.fillRect(local64, local62 + Static210.anInt4102 - local29, Static179.anInt3545, local29);
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
	public static void method2489() {
		aClass164_4 = null;
	}
}
