import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_228 = new Class363(109, -1);

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	public static void method6574() {
		if (Static125.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static212.anInt4095;
		@Pc(12) int local12 = Static561.anInt9195;
		@Pc(20) int local20 = Static455.anInt7877 - local10 - Static140.anInt2937;
		@Pc(32) int local32 = Static248.anInt4654 - Static120.anInt2371 - local12;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static593.aFrame2 != null) {
				local52 = Static593.aFrame2;
			} else if (Static562.anApplet2 == null) {
				local52 = Static509.anApplet_Sub1_1;
			} else {
				local52 = Static562.anApplet2;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (Static593.aFrame2 == local52) {
				@Pc(70) Insets local70 = Static593.aFrame2.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local52.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static248.anInt4654);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static455.anInt7877, local12);
			}
			if (local20 > 0) {
				local79.fillRect(local62 + Static455.anInt7877 - local20, local64, local20, Static248.anInt4654);
			}
			if (local32 > 0) {
				local79.fillRect(local62, Static248.anInt4654 + local64 - local32, Static455.anInt7877, local32);
				return;
			}
		} catch (@Pc(130) Exception local130) {
			return;
		}
	}
}
