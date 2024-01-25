import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
	public static final int[] anIntArray32 = new int[32];

	@OriginalMember(owner = "client!at", name = "p", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "[I")
	public static final int[] anIntArray33 = new int[4];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	public static void method482() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static591.aBoolean675) {
			if (Static233.aBoolean332) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static591.aFloat197 < (float) local7) {
			Static591.aFloat197 = (float) local7;
		}
		if (Static591.aFloat197 > (float) local9) {
			Static591.aFloat197 = (float) local9;
		}
		while (Static284.aFloat164 >= 16384.0F) {
			Static284.aFloat164 -= 16384.0F;
		}
		while (Static284.aFloat164 < 0.0F) {
			Static284.aFloat164 += 16384.0F;
		}
		@Pc(57) int local57 = Static96.anInt1900 >> 9;
		@Pc(66) int local66 = Static359.anInt6657 >> 9;
		@Pc(76) int local76 = Static138.method2248(Static96.anInt1900, Static175.anInt3636, Static359.anInt6657);
		@Pc(78) int local78 = 0;
		@Pc(110) int local110;
		if (local57 > 3 && local66 > 3 && local57 < Static442.anInt7975 - 4 && local66 < Static284.anInt7916 - 4) {
			for (local110 = local57 - 4; local110 <= local57 + 4; local110++) {
				for (@Pc(116) int local116 = local66 - 4; local116 <= local66 + 4; local116++) {
					@Pc(120) int local120 = Static175.anInt3636;
					if (local120 < 3 && Static492.method7384(local110, local116)) {
						local120++;
					}
					@Pc(133) int local133 = 0;
					if (Static3.aClass96_Sub1_1.aByteArrayArrayArray15 != null && Static3.aClass96_Sub1_1.aByteArrayArrayArray15[local120] != null) {
						local133 = (Static3.aClass96_Sub1_1.aByteArrayArrayArray15[local120][local110][local116] & 0xFF) * 8 << 2;
					}
					if (Static195.aClass199Array1 != null && Static195.aClass199Array1[local120] != null) {
						@Pc(174) int local174 = local133 + local76 - Static195.aClass199Array1[local120].method8532(local110, local116);
						if (local78 < local174) {
							local78 = local174;
						}
					}
				}
			}
		}
		local110 = (local78 >> 2) * 1536;
		if (local110 > 786432) {
			local110 = 786432;
		}
		if (local110 < 262144) {
			local110 = 262144;
		}
		if (Static211.anInt4157 < local110) {
			Static211.anInt4157 += (local110 - Static211.anInt4157) / 24;
		} else if (local110 < Static211.anInt4157) {
			Static211.anInt4157 += (local110 - Static211.anInt4157) / 80;
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(B)V")
	public static void method485() {
		if (Static476.aFrame6 != null) {
			return;
		}
		@Pc(10) int local10 = Static312.anInt5970;
		@Pc(12) int local12 = Static44.anInt873;
		@Pc(20) int local20 = Static26.anInt535 - Static321.anInt6137 - local10;
		@Pc(32) int local32 = Static539.anInt9304 - local12 - Static356.anInt6630;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static70.aFrame3 != null) {
				local52 = Static70.aFrame3;
			} else if (Static42.anApplet1 == null) {
				local52 = Static4.anApplet_Sub1_5;
			} else {
				local52 = Static42.anApplet1;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (local52 == Static70.aFrame3) {
				@Pc(70) Insets local70 = Static70.aFrame3.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local52.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static539.anInt9304);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static26.anInt535, local12);
			}
			if (local20 > 0) {
				local79.fillRect(Static26.anInt535 + local62 - local20, local64, local20, Static539.anInt9304);
			}
			if (local32 > 0) {
				local79.fillRect(local62, Static539.anInt9304 + local64 - local32, Static26.anInt535, local32);
				return;
			}
		} catch (@Pc(126) Exception local126) {
			return;
		}
	}
}
