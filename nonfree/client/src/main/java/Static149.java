import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fs", name = "T", descriptor = "I")
	public static int anInt2647;

	@OriginalMember(owner = "client!fs", name = "vb", descriptor = "[Lclient!ku;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
	public static boolean method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public static void method2202() {
		if (Static147.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static411.anInt7204;
		@Pc(12) int local12 = Static141.anInt2538;
		@Pc(20) int local20 = Static544.anInt9196 - local10 - Static502.anInt8364;
		@Pc(27) int local27 = Static371.anInt6408 - Static476.anInt8045 - local12;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local27 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static183.aFrame2 != null) {
				local45 = Static183.aFrame2;
			} else if (Static189.anApplet4 == null) {
				local45 = Static2.anApplet_Sub1_1;
			} else {
				local45 = Static189.anApplet4;
			}
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			if (Static183.aFrame2 == local45) {
				@Pc(65) Insets local65 = Static183.aFrame2.getInsets();
				local57 = local65.left;
				local59 = local65.top;
			}
			@Pc(74) Graphics local74 = local45.getGraphics();
			local74.setColor(Color.black);
			if (local10 > 0) {
				local74.fillRect(local57, local59, local10, Static371.anInt6408);
			}
			if (local12 > 0) {
				local74.fillRect(local57, local59, Static544.anInt9196, local12);
			}
			if (local20 > 0) {
				local74.fillRect(Static544.anInt9196 + local57 - local20, local59, local20, Static371.anInt6408);
			}
			if (local27 > 0) {
				local74.fillRect(local57, local59 + Static371.anInt6408 - local27, Static544.anInt9196, local27);
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IJ)V")
	public static void method2211(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static369.method5424(arg0 - 1L);
			Static369.method5424(1L);
		} else {
			Static369.method5424(arg0);
		}
	}
}
