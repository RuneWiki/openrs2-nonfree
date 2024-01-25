import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public static final int anInt599 = -1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method654() {
		if (Static345.aFrame2 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static138.aFrame1 != null) {
			local14 = Static138.aFrame1;
		} else if (Static87.anApplet1 == null) {
			local14 = Static3.anApplet_Sub1_2;
		} else {
			local14 = Static87.anApplet1;
		}
		Static171.anInt3912 = local14.getSize().width;
		Static345.anInt6685 = local14.getSize().height;
		@Pc(41) Insets local41;
		if (local14 == Static138.aFrame1) {
			local41 = Static138.aFrame1.getInsets();
			Static171.anInt3912 -= local41.left + local41.right;
			Static345.anInt6685 -= local41.bottom + local41.top;
		}
		if (Static298.method4852() == 1) {
			Static180.anInt4051 = Static79.anInt9888;
			Static423.anInt7841 = 0;
			Static228.anInt4744 = Static419.anInt7811;
			Static341.anInt6334 = (Static171.anInt3912 - Static419.anInt7811) / 2;
		} else {
			Static320.method5182();
		}
		if (Static230.aClass123_8 != Static186.aClass123_6) {
			@Pc(92) boolean local92;
			if (Static228.anInt4744 < 1024 && Static180.anInt4051 < 768) {
				local92 = true;
			} else {
				local92 = false;
			}
		}
		Static38.aCanvas4.setSize(Static228.anInt4744, Static180.anInt4051);
		if (Static323.aClass9_8 != null) {
			Static323.aClass9_8.method5403(Static38.aCanvas4);
		}
		if (Static138.aFrame1 == local14) {
			local41 = Static138.aFrame1.getInsets();
			Static38.aCanvas4.setLocation(local41.left + Static341.anInt6334, Static423.anInt7841 + local41.top);
		} else {
			Static38.aCanvas4.setLocation(Static341.anInt6334, Static423.anInt7841);
		}
		if (Static6.anInt302 != -1) {
			Static171.method3490(true);
		}
		Static195.method3709();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!jo;)V")
	public static void method657(@OriginalArg(1) Class168 arg0) {
		Static356.aClass168_86 = arg0;
	}
}
