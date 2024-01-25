import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	public static void method6782() {
		if (Static311.aFrame2 != null) {
			return;
		}
		@Pc(14) int local14 = Static26.anInt8939;
		@Pc(16) int local16 = Static212.anInt4225;
		@Pc(23) int local23 = Static56.anInt1315 - Static318.anInt5754 - local14;
		@Pc(31) int local31 = Static224.anInt4385 - local16 - Static447.anInt7372;
		if (local14 <= 0 && local23 <= 0 && local16 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static92.aFrame1 != null) {
				local54 = Static92.aFrame1;
			} else if (Static533.anApplet4 == null) {
				local54 = Static498.anApplet_Sub1_1;
			} else {
				local54 = Static533.anApplet4;
			}
			@Pc(64) int local64 = 0;
			@Pc(66) int local66 = 0;
			if (local54 == Static92.aFrame1) {
				@Pc(72) Insets local72 = Static92.aFrame1.getInsets();
				local64 = local72.left;
				local66 = local72.top;
			}
			@Pc(81) Graphics local81 = local54.getGraphics();
			local81.setColor(Color.black);
			if (local14 > 0) {
				local81.fillRect(local64, local66, local14, Static224.anInt4385);
			}
			if (local16 > 0) {
				local81.fillRect(local64, local66, Static56.anInt1315, local16);
			}
			if (local23 > 0) {
				local81.fillRect(Static56.anInt1315 + local64 - local23, local66, local23, Static224.anInt4385);
			}
			if (local31 > 0) {
				local81.fillRect(local64, Static224.anInt4385 + local66 - local31, Static56.anInt1315, local31);
				return;
			}
		} catch (@Pc(136) Exception local136) {
			return;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public static void method6785(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static363.method5457(arg0, 1);
		local15.method845();
	}
}
