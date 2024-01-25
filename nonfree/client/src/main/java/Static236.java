import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method3643() {
		if (Static625.aFrame3 != null) {
			return;
		}
		@Pc(12) int local12 = Static67.anInt1003;
		@Pc(14) int local14 = Static47.anInt693;
		@Pc(21) int local21 = Static255.anInt4665 - Static32.anInt510 - local12;
		@Pc(29) int local29 = Static89.anInt2047 - local14 - Static79.anInt1140;
		if (local12 <= 0 && local21 <= 0 && local14 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static147.aFrame1 != null) {
				local52 = Static147.aFrame1;
			} else if (Static639.anApplet2 == null) {
				local52 = Static556.anApplet_Sub1_1;
			} else {
				local52 = Static639.anApplet2;
			}
			@Pc(60) int local60 = 0;
			@Pc(62) int local62 = 0;
			if (local52 == Static147.aFrame1) {
				@Pc(68) Insets local68 = Static147.aFrame1.getInsets();
				local60 = local68.left;
				local62 = local68.top;
			}
			@Pc(77) Graphics local77 = local52.getGraphics();
			local77.setColor(Color.black);
			if (local12 > 0) {
				local77.fillRect(local60, local62, local12, Static89.anInt2047);
			}
			if (local14 > 0) {
				local77.fillRect(local60, local62, Static255.anInt4665, local14);
			}
			if (local21 > 0) {
				local77.fillRect(Static255.anInt4665 + local60 - local21, local62, local21, Static89.anInt2047);
			}
			if (local29 > 0) {
				local77.fillRect(local60, Static89.anInt2047 + local62 - local29, Static255.anInt4665, local29);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method3644() {
		Static255.aClass88Array1 = null;
	}
}
