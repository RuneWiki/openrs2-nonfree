import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wk", name = "sb", descriptor = "I")
	public static int anInt7246;

	@OriginalMember(owner = "client!wk", name = "Lc", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array14;

	@OriginalMember(owner = "client!wk", name = "ed", descriptor = "I")
	public static int anInt7330;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "(I)V")
	public static void method6311() {
		@Pc(7) client local7 = Static437.aClient1;
		synchronized (Static437.aClient1) {
			if (Static518.aFrame4 == null) {
				@Pc(26) Container local26;
				if (Static634.aFrame5 != null) {
					local26 = Static634.aFrame5;
				} else if (Static285.anApplet5 == null) {
					local26 = Static279.anApplet_Sub1_1;
				} else {
					local26 = Static285.anApplet5;
				}
				Static197.anInt3210 = local26.getSize().width;
				Static267.anInt4239 = local26.getSize().height;
				@Pc(48) Insets local48;
				if (local26 == Static634.aFrame5) {
					local48 = Static634.aFrame5.getInsets();
					Static267.anInt4239 -= local48.bottom + local48.top;
					Static197.anInt3210 -= local48.right + local48.left;
				}
				if (Static581.method7952() == 1) {
					Static415.anInt7087 = 0;
					Static563.anInt9176 = Static345.anInt6198;
					Static10.anInt176 = (Static197.anInt3210 - Static345.anInt6198) / 2;
					Static316.anInt8165 = Static427.anInt10577;
				} else {
					Static420.method6184();
				}
				if (Static99.aClass267_3 != Static71.aClass267_2) {
					@Pc(101) boolean local101;
					if (Static563.anInt9176 < 1024 && Static316.anInt8165 < 768) {
						local101 = true;
					} else {
						local101 = false;
					}
				}
				Static105.aCanvas2.setSize(Static563.anInt9176, Static316.anInt8165);
				if (Static563.aClass143_13 != null) {
					if (Static305.aBoolean315) {
						Static535.method8693(Static105.aCanvas2);
					} else {
						Static563.aClass143_13.method6266(Static105.aCanvas2, Static563.anInt9176, Static316.anInt8165);
					}
				}
				if (Static634.aFrame5 == local26) {
					local48 = Static634.aFrame5.getInsets();
					Static105.aCanvas2.setLocation(Static10.anInt176 + local48.left, local48.top + Static415.anInt7087);
				} else {
					Static105.aCanvas2.setLocation(Static10.anInt176, Static415.anInt7087);
				}
				if (Static131.anInt2222 != -1) {
					Static469.method6939(true);
				}
				Static587.method8002();
			}
		}
	}
}
