import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!cw;")
	public static final Class63 aClass63_16 = new Class63("stellardawn", 1);

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "Z")
	public static boolean aBoolean633 = true;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method7141() {
		if (Static275.aFrame2 != null) {
			return;
		}
		@Pc(12) int local12 = Static480.anInt8253;
		@Pc(14) int local14 = Static386.anInt6957;
		@Pc(22) int local22 = Static519.anInt8672 - local12 - Static571.anInt9399;
		@Pc(30) int local30 = Static547.anInt9285 - local14 - Static585.anInt9606;
		if (local12 <= 0 && local22 <= 0 && local14 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static503.aFrame3 != null) {
				local47 = Static503.aFrame3;
			} else if (Static234.anApplet2 == null) {
				local47 = Static493.anApplet_Sub1_1;
			} else {
				local47 = Static234.anApplet2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (local47 == Static503.aFrame3) {
				@Pc(63) Insets local63 = Static503.aFrame3.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local47.getGraphics();
			local72.setColor(Color.black);
			if (local12 > 0) {
				local72.fillRect(local55, local57, local12, Static547.anInt9285);
			}
			if (local14 > 0) {
				local72.fillRect(local55, local57, Static519.anInt8672, local14);
			}
			if (local22 > 0) {
				local72.fillRect(local55 + Static519.anInt8672 - local22, local57, local22, Static547.anInt9285);
			}
			if (local30 > 0) {
				local72.fillRect(local55, Static547.anInt9285 + local57 - local30, Static519.anInt8672, local30);
				return;
			}
		} catch (@Pc(119) Exception local119) {
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
	public static int method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static150.aByteArrayArray6 == null ? 0 : Static150.aByteArrayArray6[arg0][arg1] & 0xFF;
	}
}
