import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
	public static final int[] anIntArray586 = new int[13];

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	public static void method7635() {
		if (Static153.aFrame3 != null) {
			return;
		}
		@Pc(14) int local14 = Static225.anInt4116;
		@Pc(16) int local16 = Static40.anInt1166;
		@Pc(24) int local24 = Static83.anInt1901 - local14 - Static654.anInt10064;
		@Pc(31) int local31 = Static597.anInt9407 - Static483.anInt8181 - local16;
		if (local14 <= 0 && local24 <= 0 && local16 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(57) Container local57;
			if (Static90.aFrame2 != null) {
				local57 = Static90.aFrame2;
			} else if (Static287.anApplet2 == null) {
				local57 = Static287.anApplet_Sub1_1;
			} else {
				local57 = Static287.anApplet2;
			}
			@Pc(67) int local67 = 0;
			@Pc(69) int local69 = 0;
			if (Static90.aFrame2 == local57) {
				@Pc(75) Insets local75 = Static90.aFrame2.getInsets();
				local67 = local75.left;
				local69 = local75.top;
			}
			@Pc(84) Graphics local84 = local57.getGraphics();
			local84.setColor(Color.black);
			if (local14 > 0) {
				local84.fillRect(local67, local69, local14, Static597.anInt9407);
			}
			if (local16 > 0) {
				local84.fillRect(local67, local69, Static83.anInt1901, local16);
			}
			if (local24 > 0) {
				local84.fillRect(local67 + Static83.anInt1901 - local24, local69, local24, Static597.anInt9407);
			}
			if (local31 > 0) {
				local84.fillRect(local67, local69 + Static597.anInt9407 - local31, Static83.anInt1901, local31);
				return;
			}
		} catch (@Pc(136) Exception local136) {
			return;
		}
	}
}
