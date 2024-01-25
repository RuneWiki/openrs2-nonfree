import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I")
	public static int method3137() {
		return Static295.method5067(false);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public static void method3138() {
		if (Static385.aFrame149 != null) {
			return;
		}
		@Pc(10) int local10 = Static342.anInt6741;
		@Pc(16) int local16 = Static159.anInt3855;
		@Pc(23) int local23 = Static354.anInt6929 - Static114.anInt2970 - local10;
		@Pc(31) int local31 = Static396.anInt7575 - local16 - Static256.anInt5669;
		if (local10 <= 0 && local23 <= 0 && local16 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static599.aFrame141 != null) {
				local51 = Static599.aFrame141;
			} else if (Static632.anApplet2 == null) {
				local51 = Static36.anApplet_Sub1_1;
			} else {
				local51 = Static632.anApplet2;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (local51 == Static599.aFrame141) {
				@Pc(69) Insets local69 = Static599.aFrame141.getInsets();
				local61 = local69.left;
				local63 = local69.top;
			}
			@Pc(78) Graphics local78 = local51.getGraphics();
			local78.setColor(Color.black);
			if (local10 > 0) {
				local78.fillRect(local61, local63, local10, Static396.anInt7575);
			}
			if (local16 > 0) {
				local78.fillRect(local61, local63, Static354.anInt6929, local16);
			}
			if (local23 > 0) {
				local78.fillRect(local61 + Static354.anInt6929 - local23, local63, local23, Static396.anInt7575);
			}
			if (local31 > 0) {
				local78.fillRect(local61, Static396.anInt7575 + local63 - local31, Static354.anInt6929, local31);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)Z")
	public static boolean method3139(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
