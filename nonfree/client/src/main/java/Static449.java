import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_119 = new Class21("M", "M", "M", "M");

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
	public static int anInt7705 = 503;

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public static void method6143() {
		if (Static124.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static331.anInt5897;
		@Pc(10) int local10 = Static464.anInt7952;
		@Pc(23) int local23 = Static448.anInt7687 - local8 - Static374.anInt6595;
		@Pc(31) int local31 = Static4.anInt50 - local10 - Static30.anInt518;
		if (local8 <= 0 && local23 <= 0 && local10 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static97.aFrame1 == null) {
				local43 = Static390.aClass255_5.anApplet1;
			} else {
				local43 = Static97.aFrame1;
			}
			@Pc(50) int local50 = 0;
			@Pc(52) int local52 = 0;
			if (Static97.aFrame1 == local43) {
				@Pc(58) Insets local58 = Static97.aFrame1.getInsets();
				local52 = local58.top;
				local50 = local58.left;
			}
			@Pc(67) Graphics local67 = local43.getGraphics();
			local67.setColor(Color.black);
			if (local8 > 0) {
				local67.fillRect(local50, local52, local8, Static4.anInt50);
			}
			if (local10 > 0) {
				local67.fillRect(local50, local52, Static448.anInt7687, local10);
			}
			if (local23 > 0) {
				local67.fillRect(Static448.anInt7687 + local50 - local23, local52, local23, Static4.anInt50);
			}
			if (local31 > 0) {
				local67.fillRect(local50, Static4.anInt50 + local52 - local31, Static448.anInt7687, local31);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)V")
	public static void method6144() {
		Static196.aClass4_Sub7_Sub2_6.method1400();
		Static236.aClass38_50 = null;
		Static445.anInt7575 = 1;
	}
}
