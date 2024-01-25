import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "Lclient!wp;")
	public static Class270 aClass270_1;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!ud;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_35 = new Class182(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
	public static void method650() {
		if (Static95.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static451.aFrame2 == null) {
			local12 = Static171.aClass159_1.anApplet1;
		} else {
			local12 = Static451.aFrame2;
		}
		Static370.anInt6388 = local12.getSize().width;
		Static299.anInt4635 = local12.getSize().height;
		@Pc(36) Insets local36;
		if (Static451.aFrame2 == local12) {
			local36 = Static451.aFrame2.getInsets();
			Static299.anInt4635 -= local36.top + local36.bottom;
			Static370.anInt6388 -= local36.right + local36.left;
		}
		if (Static211.method3254() == 1) {
			Static340.anInt5756 = Static348.anInt5939;
			Static350.anInt5988 = 0;
			Static399.anInt6748 = (Static370.anInt6388 - Static29.anInt504) / 2;
			Static90.anInt1891 = Static29.anInt504;
		} else if (Static108.anInt2167 < 96 && Static423.anInt7114 == 0) {
			@Pc(73) int local73 = Static370.anInt6388 > 1024 ? 1024 : Static370.anInt6388;
			@Pc(80) int local80 = Static299.anInt4635 <= 768 ? Static299.anInt4635 : 768;
			Static90.anInt1891 = local73;
			Static399.anInt6748 = (Static370.anInt6388 - local73) / 2;
			Static350.anInt5988 = 0;
			Static340.anInt5756 = local80;
		} else {
			Static399.anInt6748 = 0;
			Static350.anInt5988 = 0;
			Static340.anInt5756 = Static299.anInt4635;
			Static90.anInt1891 = Static370.anInt6388;
		}
		if (Static284.aClass151_8 != Static110.aClass151_5) {
			@Pc(128) boolean local128;
			if (Static90.anInt1891 < 1024 && Static340.anInt5756 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static412.aCanvas7.setSize(Static90.anInt1891, Static340.anInt5756);
		if (Static412.aClass50_8 != null) {
			Static412.aClass50_8.method5825(Static412.aCanvas7);
		}
		if (local12 == Static451.aFrame2) {
			local36 = Static451.aFrame2.getInsets();
			Static412.aCanvas7.setLocation(local36.left + Static399.anInt6748, Static350.anInt5988 + local36.top);
		} else {
			Static412.aCanvas7.setLocation(Static399.anInt6748, Static350.anInt5988);
		}
		if (Static189.anInt3826 != -1) {
			Static241.method3528(true);
		}
		Static130.method2274();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z")
	public static boolean method653(@OriginalArg(0) int arg0) {
		Static216.aBoolean280 = true;
		Static90.anInt1893 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
