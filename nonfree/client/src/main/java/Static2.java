import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "[Lclient!cda;")
	public static Class51[] aClass51Array1 = new Class51[50];

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public static void method24() {
		@Pc(7) client local7 = Static548.aClient1;
		synchronized (Static548.aClient1) {
			if (Static438.aFrame1 == null) {
				@Pc(20) Container local20;
				if (Static572.aFrame2 != null) {
					local20 = Static572.aFrame2;
				} else if (Static339.anApplet2 == null) {
					local20 = Static353.anApplet_Sub1_1;
				} else {
					local20 = Static339.anApplet2;
				}
				Static190.anInt3438 = local20.getSize().width;
				Static674.anInt10898 = local20.getSize().height;
				@Pc(42) Insets local42;
				if (Static572.aFrame2 == local20) {
					local42 = Static572.aFrame2.getInsets();
					Static190.anInt3438 -= local42.left + local42.right;
					Static674.anInt10898 -= local42.bottom + local42.top;
				}
				if (Static241.method3664() == 1) {
					Static531.anInt8327 = Static95.anInt9415;
					Static13.anInt306 = Static195.anInt3525;
					Static640.anInt10686 = 0;
					Static462.anInt7379 = (Static190.anInt3438 - Static95.anInt9415) / 2;
				} else {
					Static39.method753();
				}
				if (Static256.aClass135_4 != Static228.aClass135_3) {
					@Pc(93) boolean local93;
					if (Static531.anInt8327 < 1024 && Static13.anInt306 < 768) {
						local93 = true;
					} else {
						local93 = false;
					}
				}
				Static330.aCanvas5.setSize(Static531.anInt8327, Static13.anInt306);
				if (Static119.aClass95_4 != null) {
					if (Static498.aBoolean757) {
						Static22.method527(Static330.aCanvas5);
					} else {
						Static119.aClass95_4.method8067(Static330.aCanvas5, Static531.anInt8327, Static13.anInt306);
					}
				}
				if (Static572.aFrame2 == local20) {
					local42 = Static572.aFrame2.getInsets();
					Static330.aCanvas5.setLocation(Static462.anInt7379 + local42.left, local42.top + Static640.anInt10686);
				} else {
					Static330.aCanvas5.setLocation(Static462.anInt7379, Static640.anInt10686);
				}
				if (Static187.anInt3418 != -1) {
					Static630.method8507(true);
				}
				Static242.method5991();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
	public static void method25() {
		if (Static81.anInt10273 < 0) {
			Static81.anInt10273 = 0;
			Static146.anInt2698 = -1;
			Static426.anInt6954 = -1;
		}
		if (Static81.anInt10273 > Static671.anInt9356) {
			Static426.anInt6954 = -1;
			Static81.anInt10273 = Static671.anInt9356;
			Static146.anInt2698 = -1;
		}
		if (Static594.anInt9606 < 0) {
			Static594.anInt9606 = 0;
			Static146.anInt2698 = -1;
			Static426.anInt6954 = -1;
		}
		if (Static671.anInt9360 < Static594.anInt9606) {
			Static426.anInt6954 = -1;
			Static146.anInt2698 = -1;
			Static594.anInt9606 = Static671.anInt9360;
		}
	}
}
