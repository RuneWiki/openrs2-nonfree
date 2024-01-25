import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
	public static int anInt6918 = -1;

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
	public static final int anInt6920 = 328;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
	public static void method5781() {
		if (Static528.aFrame1 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static537.aFrame2 != null) {
			local14 = Static537.aFrame2;
		} else if (Static55.anApplet1 == null) {
			local14 = Static31.anApplet_Sub1_1;
		} else {
			local14 = Static55.anApplet1;
		}
		Static376.anInt6720 = local14.getSize().width;
		Static86.anInt2256 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (local14 == Static537.aFrame2) {
			local36 = Static537.aFrame2.getInsets();
			Static86.anInt2256 -= local36.top + local36.bottom;
			Static376.anInt6720 -= local36.right + local36.left;
		}
		if (Static420.method6044() == 1) {
			Static191.anInt5908 = (Static376.anInt6720 - Static9.anInt8933) / 2;
			Static249.anInt4946 = 0;
			Static19.anInt390 = Static576.anInt9547;
			Static2.anInt29 = Static9.anInt8933;
		} else {
			Static165.method3184();
		}
		if (Static327.aClass315_8 != Static106.aClass315_4) {
			@Pc(85) boolean local85;
			if (Static2.anInt29 < 1024 && Static19.anInt390 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static379.aCanvas13.setSize(Static2.anInt29, Static19.anInt390);
		if (Static185.aClass66_14 != null) {
			Static185.aClass66_14.method6815(Static379.aCanvas13);
		}
		if (Static537.aFrame2 == local14) {
			local36 = Static537.aFrame2.getInsets();
			Static379.aCanvas13.setLocation(Static191.anInt5908 + local36.left, local36.top - -Static249.anInt4946);
		} else {
			Static379.aCanvas13.setLocation(Static191.anInt5908, Static249.anInt4946);
		}
		if (Static249.anInt4945 != -1) {
			Static435.method6179(true);
		}
		Static485.method6744();
	}
}
