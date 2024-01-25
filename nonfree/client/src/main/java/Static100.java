import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "F")
	public static float aFloat225;

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
	public static int anInt9658;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "Lclient!fa;")
	public static Interface4 anInterface4_13;

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "Z")
	public static boolean aBoolean637;

	@OriginalMember(owner = "client!dm", name = "N", descriptor = "[Lclient!ob;")
	public static Class236[] aClass236Array5;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
	public static void method7582() {
		if (Static178.aFrame3 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static302.aFrame2 != null) {
			local14 = Static302.aFrame2;
		} else if (Static304.anApplet1 == null) {
			local14 = Static350.anApplet_Sub1_1;
		} else {
			local14 = Static304.anApplet1;
		}
		Static483.anInt8361 = local14.getSize().width;
		Static429.anInt7984 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (Static302.aFrame2 == local14) {
			local36 = Static302.aFrame2.getInsets();
			Static483.anInt8361 -= local36.right + local36.left;
			Static429.anInt7984 -= local36.bottom + local36.top;
		}
		if (Static534.method7318() == 1) {
			Static490.anInt8427 = 0;
			Static537.anInt9359 = (Static483.anInt8361 - Static333.anInt6024) / 2;
			Static492.anInt8445 = Static473.anInt8221;
			Static34.anInt3201 = Static333.anInt6024;
		} else {
			Static338.method4925();
		}
		if (Static332.aClass5_3 != Static412.aClass5_7) {
			@Pc(85) boolean local85;
			if (Static34.anInt3201 < 1024 && Static492.anInt8445 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static129.aCanvas6.setSize(Static34.anInt3201, Static492.anInt8445);
		if (Static319.aClass31_11 != null) {
			Static319.aClass31_11.method8049(Static129.aCanvas6);
		}
		if (Static302.aFrame2 == local14) {
			local36 = Static302.aFrame2.getInsets();
			Static129.aCanvas6.setLocation(Static537.anInt9359 + local36.left, Static490.anInt8427 + local36.top);
		} else {
			Static129.aCanvas6.setLocation(Static537.anInt9359, Static490.anInt8427);
		}
		if (Static79.anInt2118 != -1) {
			Static542.method7422(true);
		}
		Static239.method3812();
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)Lclient!qk;")
	public static Class3_Sub16_Sub3 method7583() {
		return Static548.aClass3_Sub16_Sub3_4;
	}
}
