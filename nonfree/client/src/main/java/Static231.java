import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qm", name = "Kc", descriptor = "[Lclient!mo;")
	public static Class103[] aClass103Array4;

	@OriginalMember(owner = "client!qm", name = "Xc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
	public static void method3665() {
		@Pc(11) int local11 = Static109.anInt2179;
		@Pc(17) int local17 = Static60.anInt1203;
		@Pc(24) int local24 = Static21.anInt417 - local11 - Static159.anInt3348;
		@Pc(31) int local31 = Static302.anInt5720 - Static136.anInt2696 - local17;
		if (local11 <= 0 && local24 <= 0 && local17 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static75.aFrame1 != null) {
				local48 = Static75.aFrame1;
			} else if (Static78.aFrame2 == null) {
				local48 = Static117.aClass117_3.anApplet1;
			} else {
				local48 = Static78.aFrame2;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (local48 == Static78.aFrame2) {
				@Pc(71) Insets local71 = Static78.aFrame2.getInsets();
				local62 = local71.left;
				local64 = local71.top;
			}
			@Pc(80) Graphics local80 = local48.getGraphics();
			local80.setColor(Color.black);
			if (local11 > 0) {
				local80.fillRect(local62, local64, local11, Static302.anInt5720);
			}
			if (local17 > 0) {
				local80.fillRect(local62, local64, Static21.anInt417, local17);
			}
			if (local24 > 0) {
				local80.fillRect(Static21.anInt417 + local62 - local24, local64, local24, Static302.anInt5720);
			}
			if (local31 > 0) {
				local80.fillRect(local62, Static302.anInt5720 + local64 - local31, Static21.anInt417, local31);
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
