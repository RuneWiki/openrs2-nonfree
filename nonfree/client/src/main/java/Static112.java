import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Lclient!ra;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public static int anInt2265 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public static void method1906() {
		if (Static193.aFrame8 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static224.aFrame6 == null) {
			local12 = Static466.aClass102_4.anApplet1;
		} else {
			local12 = Static224.aFrame6;
		}
		Static399.anInt7190 = local12.getSize().width;
		Static128.anInt1835 = local12.getSize().height;
		@Pc(37) Insets local37;
		if (Static224.aFrame6 == local12) {
			local37 = Static224.aFrame6.getInsets();
			Static399.anInt7190 -= local37.left + local37.right;
			Static128.anInt1835 -= local37.bottom + local37.top;
		}
		if (Static306.method4842() == 1) {
			Static81.anInt1466 = (Static399.anInt7190 - Static397.anInt7131) / 2;
			Static376.anInt6875 = 0;
			Static350.anInt6255 = Static134.anInt2646;
			Static83.anInt1567 = Static397.anInt7131;
		} else if (Static17.anInt454 < 96 && Static374.anInt6861 == 0) {
			@Pc(97) int local97 = Static399.anInt7190 > 1024 ? 1024 : Static399.anInt7190;
			@Pc(106) int local106 = Static128.anInt1835 > 768 ? 768 : Static128.anInt1835;
			Static81.anInt1466 = (Static399.anInt7190 - local97) / 2;
			Static83.anInt1567 = local97;
			Static350.anInt6255 = local106;
			Static376.anInt6875 = 0;
		} else {
			Static83.anInt1567 = Static399.anInt7190;
			Static350.anInt6255 = Static128.anInt1835;
			Static376.anInt6875 = 0;
			Static81.anInt1466 = 0;
		}
		if (Static145.aClass21_4 != Static71.aClass21_1) {
			@Pc(128) boolean local128;
			if (Static83.anInt1567 < 1024 && Static350.anInt6255 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static105.aCanvas3.setSize(Static83.anInt1567, Static350.anInt6255);
		if (Static513.aClass122_10 != null) {
			Static513.aClass122_10.method7278(Static105.aCanvas3);
		}
		if (local12 == Static224.aFrame6) {
			local37 = Static224.aFrame6.getInsets();
			Static105.aCanvas3.setLocation(Static81.anInt1466 + local37.left, local37.top + Static376.anInt6875);
		} else {
			Static105.aCanvas3.setLocation(Static81.anInt1466, Static376.anInt6875);
		}
		if (Static170.anInt3050 != -1) {
			Static465.method6533(true);
		}
		Static97.method1657();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!jq;B)Ljava/lang/String;")
	public static String method1909(@OriginalArg(0) Class156 arg0) {
		if (Static67.method1228(arg0).method2103() == 0) {
			return null;
		} else if (arg0.aString43 == null || arg0.aString43.trim().length() == 0) {
			return Static54.aBoolean69 ? "Hidden-use" : null;
		} else {
			return arg0.aString43;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public static void method1910(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub11 local15 = Static541.method7520(12, arg0);
		local15.method4945();
	}
}
