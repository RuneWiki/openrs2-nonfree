import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString43 = "";

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method4199() {
		if (Static335.aFrame1 != null) {
			return;
		}
		@Pc(16) Container local16;
		if (Static348.aFrame2 == null) {
			local16 = Static177.aClass168_2.anApplet1;
		} else {
			local16 = Static348.aFrame2;
		}
		Static33.anInt591 = local16.getSize().width;
		Static1.anInt16 = local16.getSize().height;
		@Pc(35) Insets local35;
		if (Static348.aFrame2 == local16) {
			local35 = Static348.aFrame2.getInsets();
			Static33.anInt591 -= local35.left + local35.right;
			Static1.anInt16 -= local35.top + local35.bottom;
		}
		if (Static129.method2627() == 1) {
			Static136.anInt2829 = 765;
			Static197.anInt3869 = (Static33.anInt591 - 765) / 2;
			Static198.anInt3876 = 503;
			Static168.anInt3423 = 0;
		} else if (Static339.anInt6736 < 96 && Static129.anInt2728 == 0) {
			@Pc(96) int local96 = Static33.anInt591 <= 1024 ? Static33.anInt591 : 1024;
			@Pc(105) int local105 = Static1.anInt16 > 768 ? 768 : Static1.anInt16;
			Static136.anInt2829 = local96;
			Static197.anInt3869 = (Static33.anInt591 - local96) / 2;
			Static198.anInt3876 = local105;
			Static168.anInt3423 = 0;
		} else {
			Static136.anInt2829 = Static33.anInt591;
			Static198.anInt3876 = Static1.anInt16;
			Static197.anInt3869 = 0;
			Static168.anInt3423 = 0;
		}
		if (Static183.anInt3622 != 0) {
			@Pc(130) boolean local130;
			if (Static136.anInt2829 < 1024 && Static198.anInt3876 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static240.aCanvas4.setSize(Static136.anInt2829, Static198.anInt3876);
		if (Static147.aClass4_2 != null) {
			Static147.aClass4_2.method4208();
		}
		if (Static348.aFrame2 == local16) {
			local35 = Static348.aFrame2.getInsets();
			Static240.aCanvas4.setLocation(Static197.anInt3869 + local35.left, local35.top + Static168.anInt3423);
		} else {
			Static240.aCanvas4.setLocation(Static197.anInt3869, Static168.anInt3423);
		}
		if (Static111.anInt2471 != -1) {
			Static121.method2514(true);
		}
		Static183.method3318();
	}
}
