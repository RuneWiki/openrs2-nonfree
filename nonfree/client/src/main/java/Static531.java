import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!rda;I)V")
	public static void method7704(@OriginalArg(0) Class1_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(15) Class4_Sub36 local15 = (Class4_Sub36) Static583.aClass350_42.method8207((long) arg0.anInt8435);
		if (local15 == null) {
			Static57.method963(arg0.anIntArray463[0], 0, null, arg0.aByte126, arg0.anIntArray462[0], null, arg0);
		} else {
			local15.method6756();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7705(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method7706() {
		if (Static13.aFrame1 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static475.aFrame3 != null) {
			local14 = Static475.aFrame3;
		} else if (Static110.anApplet1 == null) {
			local14 = Static162.anApplet_Sub1_1;
		} else {
			local14 = Static110.anApplet1;
		}
		Static286.anInt5862 = local14.getSize().width;
		Static238.anInt4332 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (local14 == Static475.aFrame3) {
			local36 = Static475.aFrame3.getInsets();
			Static238.anInt4332 -= local36.top + local36.bottom;
			Static286.anInt5862 -= local36.left + local36.right;
		}
		if (Static4.method130() == 1) {
			Static554.anInt9828 = Static501.anInt6750;
			Static375.anInt7256 = Static212.anInt3952;
			Static179.anInt3617 = 0;
			Static580.anInt2905 = (Static286.anInt5862 - Static501.anInt6750) / 2;
		} else {
			Static557.method1156();
		}
		if (Static296.aClass145_5 != Static565.aClass145_11) {
			@Pc(85) boolean local85;
			if (Static554.anInt9828 < 1024 && Static375.anInt7256 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static475.aCanvas12.setSize(Static554.anInt9828, Static375.anInt7256);
		if (Static440.aClass44_12 != null) {
			Static440.aClass44_12.method4968(Static475.aCanvas12);
		}
		if (Static475.aFrame3 == local14) {
			local36 = Static475.aFrame3.getInsets();
			Static475.aCanvas12.setLocation(Static580.anInt2905 + local36.left, Static179.anInt3617 + local36.top);
		} else {
			Static475.aCanvas12.setLocation(Static580.anInt2905, Static179.anInt3617);
		}
		if (Static332.anInt6370 != -1) {
			Static487.method7235(true);
		}
		Static479.method7194();
	}
}
