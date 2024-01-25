import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
	public static int[] anIntArray567 = new int[2];

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt6501 = 0;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_117 = new Class186(101, 8);

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray9 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method5376() {
		Static398.aClass239Array2 = null;
		Static429.method5846(0, Static235.anInt4053, 0, Static313.anInt5099, 0, Static381.anInt6279, 0, -1);
		if (Static398.aClass239Array2 != null) {
			Static72.method1403(Static381.anInt6279, -1412584499, Static419.aClass239_16.anInt6467, Static122.anInt2157, 0, Static235.anInt4053, Static329.anInt5597, 0, Static398.aClass239Array2);
			Static398.aClass239Array2 = null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIII)V")
	public static void method5377(@OriginalArg(0) boolean arg0) {
		Static203.anInt3580 = 22050;
		Static233.anInt3977 = 2;
		Static24.aBoolean29 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public static void method5378() {
		if (Static93.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static176.aFrame2 == null) {
			local12 = Static165.aClass103_3.anApplet1;
		} else {
			local12 = Static176.aFrame2;
		}
		Static377.anInt6742 = local12.getSize().width;
		Static383.anInt6310 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static176.aFrame2) {
			local31 = Static176.aFrame2.getInsets();
			Static377.anInt6742 -= local31.left + local31.right;
			Static383.anInt6310 -= local31.top + local31.bottom;
		}
		if (Static172.method2743() == 1) {
			Static268.anInt4597 = (Static377.anInt6742 - Static225.anInt3839) / 2;
			Static235.anInt4053 = Static225.anInt3839;
			Static335.anInt5653 = 0;
			Static381.anInt6279 = Static165.anInt2943;
		} else if (Static2.anInt8 < 96 && Static155.anInt2774 == 0) {
			@Pc(79) int local79 = Static377.anInt6742 > 1024 ? 1024 : Static377.anInt6742;
			Static268.anInt4597 = (Static377.anInt6742 - local79) / 2;
			Static235.anInt4053 = local79;
			@Pc(95) int local95 = Static383.anInt6310 <= 768 ? Static383.anInt6310 : 768;
			Static335.anInt5653 = 0;
			Static381.anInt6279 = local95;
		} else {
			Static381.anInt6279 = Static383.anInt6310;
			Static335.anInt5653 = 0;
			Static235.anInt4053 = Static377.anInt6742;
			Static268.anInt4597 = 0;
		}
		if (Static449.aClass207_11 != Static194.aClass207_8) {
			@Pc(126) boolean local126;
			if (Static235.anInt4053 < 1024 && Static381.anInt6279 < 768) {
				local126 = true;
			} else {
				local126 = false;
			}
		}
		Static314.aCanvas8.setSize(Static235.anInt4053, Static381.anInt6279);
		if (Static44.aClass28_14 != null) {
			Static44.aClass28_14.method3489(Static314.aCanvas8);
		}
		if (Static176.aFrame2 == local12) {
			local31 = Static176.aFrame2.getInsets();
			Static314.aCanvas8.setLocation(Static268.anInt4597 + local31.left, local31.top + Static335.anInt5653);
		} else {
			Static314.aCanvas8.setLocation(Static268.anInt4597, Static335.anInt5653);
		}
		if (Static313.anInt5099 != -1) {
			Static219.method3376(true);
		}
		Static240.method3729();
	}
}
