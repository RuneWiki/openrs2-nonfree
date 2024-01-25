import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!vi;")
	public static Class256 aClass256_6;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "[Lclient!ya;")
	public static Class96[] aClass96Array3;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_17 = new Class203();

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_70 = new Class263(87, -1);

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt2805 = -1;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!ps;")
	public static final Class1_Sub36 aClass1_Sub36_3 = new Class1_Sub36(0, 0);

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method2062() {
		if (Static93.aFrame2 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static416.aFrame3 == null) {
			local13 = Static150.aClass183_3.anApplet1;
		} else {
			local13 = Static416.aFrame3;
		}
		Static134.anInt2979 = local13.getSize().width;
		Static270.anInt5255 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static416.aFrame3 == local13) {
			local31 = Static416.aFrame3.getInsets();
			Static134.anInt2979 -= local31.right + local31.left;
			Static270.anInt5255 -= local31.bottom + local31.top;
		}
		if (Static86.method1531() == 1) {
			Static152.anInt3234 = Static431.anInt7617;
			Static342.anInt6292 = Static190.anInt3989;
			Static8.anInt96 = (Static134.anInt2979 - Static431.anInt7617) / 2;
			Static299.anInt1304 = 0;
		} else if (Static155.anInt3339 < 96 && anInt2805 == 0) {
			@Pc(90) int local90 = Static134.anInt2979 <= 1024 ? Static134.anInt2979 : 1024;
			Static8.anInt96 = (Static134.anInt2979 - local90) / 2;
			Static152.anInt3234 = local90;
			@Pc(108) int local108 = Static270.anInt5255 <= 768 ? Static270.anInt5255 : 768;
			Static299.anInt1304 = 0;
			Static342.anInt6292 = local108;
		} else {
			Static342.anInt6292 = Static270.anInt5255;
			Static8.anInt96 = 0;
			Static152.anInt3234 = Static134.anInt2979;
			Static299.anInt1304 = 0;
		}
		if (Static314.aClass248_7 != Static59.aClass248_1) {
			@Pc(124) boolean local124;
			if (Static152.anInt3234 < 1024 && Static342.anInt6292 < 768) {
				local124 = true;
			} else {
				local124 = false;
			}
		}
		Static443.aCanvas33.setSize(Static152.anInt3234, Static342.anInt6292);
		if (Static30.aClass106_3 != null) {
			Static30.aClass106_3.method5934(Static443.aCanvas33);
		}
		if (local13 == Static416.aFrame3) {
			local31 = Static416.aFrame3.getInsets();
			Static443.aCanvas33.setLocation(Static8.anInt96 + local31.left, Static299.anInt1304 + local31.top);
		} else {
			Static443.aCanvas33.setLocation(Static8.anInt96, Static299.anInt1304);
		}
		if (Static456.anInt1594 != -1) {
			Static191.method3101(true);
		}
		Static57.method1073();
	}
}
