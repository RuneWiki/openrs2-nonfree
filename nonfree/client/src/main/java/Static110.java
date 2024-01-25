import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array6;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_47 = new Class136(77, -1);

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	public static void method1619() {
		@Pc(7) client local7 = Static108.aClient1;
		synchronized (Static108.aClient1) {
			if (Static630.aFrame3 == null) {
				@Pc(18) Container local18;
				if (Static510.aFrame2 != null) {
					local18 = Static510.aFrame2;
				} else if (Static270.anApplet5 == null) {
					local18 = Static3.anApplet_Sub1_1;
				} else {
					local18 = Static270.anApplet5;
				}
				Static489.anInt8353 = local18.getSize().width;
				Static374.anInt6594 = local18.getSize().height;
				@Pc(42) Insets local42;
				if (local18 == Static510.aFrame2) {
					local42 = Static510.aFrame2.getInsets();
					Static489.anInt8353 -= local42.left + local42.right;
					Static374.anInt6594 -= local42.top + local42.bottom;
				}
				if (Static259.method1979() == 1) {
					Static552.anInt9135 = (Static489.anInt8353 - Static519.anInt7022) / 2;
					Static649.anInt10495 = 0;
					Static438.anInt7403 = Static363.anInt6413;
					Static254.anInt4283 = Static519.anInt7022;
				} else {
					Static64.method1080();
				}
				if (Static34.aClass346_2 != Static363.aClass346_4) {
					@Pc(92) boolean local92;
					if (Static254.anInt4283 < 1024 && Static438.anInt7403 < 768) {
						local92 = true;
					} else {
						local92 = false;
					}
				}
				Static181.aCanvas3.setSize(Static254.anInt4283, Static438.anInt7403);
				if (Static485.aClass126_17 != null) {
					if (Static144.aBoolean196) {
						Static249.method3873(Static181.aCanvas3);
					} else {
						Static485.aClass126_17.method7042(Static181.aCanvas3, Static254.anInt4283, Static438.anInt7403);
					}
				}
				if (Static510.aFrame2 == local18) {
					local42 = Static510.aFrame2.getInsets();
					Static181.aCanvas3.setLocation(local42.left + Static552.anInt9135, Static649.anInt10495 + local42.top);
				} else {
					Static181.aCanvas3.setLocation(Static552.anInt9135, Static649.anInt10495);
				}
				if (Static302.anInt4813 != -1) {
					Static627.method8697(true);
				}
				Static639.method8796();
			}
		}
	}
}
