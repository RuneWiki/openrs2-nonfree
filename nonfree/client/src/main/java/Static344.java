import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	public static int anInt6358 = -1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method5288() {
		Static124.method2122(false);
		if (Static317.anInt2329 >= 0 && Static317.anInt2329 != 0) {
			Static436.method6326(Static317.anInt2329);
			Static317.anInt2329 = -1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
	public static void method5291() {
		if (Static264.aFrame2 != null) {
			return;
		}
		@Pc(13) int local13 = Static221.anInt4007;
		@Pc(15) int local15 = Static217.anInt3944;
		@Pc(23) int local23 = Static142.anInt2934 - local13 - Static348.anInt6272;
		@Pc(30) int local30 = Static212.anInt3904 - Static199.anInt3767 - local15;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static133.aFrame3 == null) {
				local52 = Static45.aClass209_127.anApplet1;
			} else {
				local52 = Static133.aFrame3;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local52 == Static133.aFrame3) {
				@Pc(66) Insets local66 = Static133.aFrame3.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local52.getGraphics();
			local75.setColor(Color.black);
			if (local13 > 0) {
				local75.fillRect(local58, local60, local13, Static212.anInt3904);
			}
			if (local15 > 0) {
				local75.fillRect(local58, local60, Static142.anInt2934, local15);
			}
			if (local23 > 0) {
				local75.fillRect(local58 + Static142.anInt2934 - local23, local60, local23, Static212.anInt3904);
			}
			if (local30 > 0) {
				local75.fillRect(local58, local60 + Static212.anInt3904 - local30, Static142.anInt2934, local30);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V")
	public static void method5292() {
		if (Static159.anIntArray388 != null && Static227.anIntArray295 != null) {
			return;
		}
		Static159.anIntArray388 = new int[256];
		Static227.anIntArray295 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static159.anIntArray388[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static227.anIntArray295[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
