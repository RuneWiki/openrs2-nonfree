import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!va", name = "ic", descriptor = "I")
	public static int anInt8992;

	@OriginalMember(owner = "client!va", name = "Fb", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_144 = new Class98(77, 7);

	@OriginalMember(owner = "client!va", name = "Sb", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(DI)V")
	public static void method7128(@OriginalArg(0) double arg0) {
		if (Static34.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static248.anIntArray375[local7] = local19 > 255 ? 255 : local19;
		}
		Static34.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
	public static void method7136() {
		if (Static85.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static201.anInt3846;
		@Pc(12) int local12 = Static223.anInt4111;
		@Pc(25) int local25 = Static258.anInt4672 - local10 - Static367.anInt6719;
		@Pc(32) int local32 = Static460.anInt8100 - Static154.anInt2867 - local12;
		if (local10 <= 0 && local25 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static435.aFrame2 != null) {
				local50 = Static435.aFrame2;
			} else if (Static198.anApplet1 == null) {
				local50 = Static576.anApplet_Sub1_1;
			} else {
				local50 = Static198.anApplet1;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (local50 == Static435.aFrame2) {
				@Pc(70) Insets local70 = Static435.aFrame2.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local50.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static460.anInt8100);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static258.anInt4672, local12);
			}
			if (local25 > 0) {
				local79.fillRect(local62 + Static258.anInt4672 - local25, local64, local25, Static460.anInt8100);
			}
			if (local32 > 0) {
				local79.fillRect(local62, local64 + Static460.anInt8100 - local32, Static258.anInt4672, local32);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}
}
