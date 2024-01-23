import java.awt.Container;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!il", name = "N", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "I")
	public static int anInt2828 = 0;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	public static void method2177(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static247.anInt5285 += arg0 * 128;
		@Pc(39) int local39;
		if (Static50.anIntArray110.length < Static247.anInt5285) {
			Static247.anInt5285 -= Static50.anIntArray110.length;
			local39 = (int) (Math.random() * 12.0D);
			Static16.method3752(Static199.aClass7_Sub1Array1[local39]);
		}
		local39 = 0;
		@Pc(53) int local53 = (256 - arg0) * 128;
		@Pc(57) int local57 = arg0 * 128;
		@Pc(84) int local84;
		for (@Pc(59) int local59 = 0; local59 < local53; local59++) {
			local84 = Static63.anIntArray137[local39 + local57] - Static50.anIntArray110[local39 + Static247.anInt5285 & Static50.anIntArray110.length + -1] * arg0 / 6;
			if (local84 < 0) {
				local84 = 0;
			}
			Static63.anIntArray137[local39++] = local84;
		}
		@Pc(115) int local115;
		@Pc(117) int local117;
		@Pc(124) int local124;
		for (local84 = 256 - arg0; local84 < 256; local84++) {
			local115 = local84 * 128;
			for (local117 = 0; local117 < 128; local117++) {
				local124 = (int) (Math.random() * 100.0D);
				if (local124 < 50 && local117 > 10 && local117 < 118) {
					Static63.anIntArray137[local115 + local117] = 255;
				} else {
					Static63.anIntArray137[local115 + local117] = 0;
				}
			}
		}
		for (local115 = 0; local115 < 256 - arg0; local115++) {
			Static205.anIntArray348[local115] = Static205.anIntArray348[arg0 + local115];
		}
		for (local117 = 256 - arg0; local117 < 256; local117++) {
			Static205.anIntArray348[local117] = (int) (Math.sin((double) Static45.anInt1359 / 14.0D) * 16.0D + Math.sin((double) Static45.anInt1359 / 15.0D) * 14.0D + Math.sin((double) Static45.anInt1359 / 16.0D) * 12.0D);
			Static45.anInt1359++;
		}
		Static152.anInt3643 += arg0;
		local124 = ((Static156.anInt3722 & 0x1) + arg0) / 2;
		if (local124 <= 0) {
			return;
		}
		@Pc(248) int local248;
		@Pc(255) int local255;
		for (@Pc(239) int local239 = 0; local239 < Static152.anInt3643; local239++) {
			local248 = (int) (Math.random() * 124.0D) + 2;
			local255 = (int) (Math.random() * 128.0D) + 128;
			Static63.anIntArray137[local248 + (local255 << 7)] = 192;
		}
		Static152.anInt3643 = 0;
		@Pc(279) int local279;
		@Pc(282) int local282;
		for (local248 = 0; local248 < 256; local248++) {
			local255 = 0;
			local279 = local248 * 128;
			for (local282 = -local124; local282 < 128; local282++) {
				if (local282 + local124 < 128) {
					local255 += Static63.anIntArray137[local282 + local279 + local124];
				}
				if (local282 - local124 - 1 >= 0) {
					local255 -= Static63.anIntArray137[local282 + local279 - local124 - 1];
				}
				if (local282 >= 0) {
					Static178.anIntArray307[local282 + local279] = local255 / (local124 * 2 + 1);
				}
			}
		}
		for (local255 = 0; local255 < 128; local255++) {
			local279 = 0;
			for (local282 = -local124; local282 < 256; local282++) {
				@Pc(367) int local367 = local282 * 128;
				if (local282 + local124 < 256) {
					local279 += Static178.anIntArray307[local255 + local367 + local124 * 128];
				}
				if (local282 - local124 - 1 >= 0) {
					local279 -= Static178.anIntArray307[local255 + local367 - (local124 - -1) * 128];
				}
				if (local282 >= 0) {
					Static63.anIntArray137[local255 + local367] = local279 / (local124 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V")
	public static void method2179() {
		@Pc(9) Container local9;
		if (Static88.aFrame2 != null) {
			local9 = Static88.aFrame2;
		} else if (Static42.aFrame1 == null) {
			local9 = Static38.aClass28_1.anApplet1;
		} else {
			local9 = Static42.aFrame1;
		}
		Static101.anInt2760 = local9.getSize().width;
		Static39.anInt1098 = local9.getSize().height;
		@Pc(34) Insets local34;
		if (Static42.aFrame1 == local9) {
			local34 = Static42.aFrame1.getInsets();
			Static39.anInt1098 -= local34.top + local34.bottom;
			Static101.anInt2760 -= local34.right + local34.left;
		}
		if (Static110.method2246() < 2) {
			Static200.anInt4411 = 765;
			Static58.anInt1620 = (Static101.anInt2760 - 765) / 2;
			Static123.anInt1284 = 0;
			Static251.anInt5352 = 503;
		} else {
			Static58.anInt1620 = 0;
			Static200.anInt4411 = Static101.anInt2760;
			Static123.anInt1284 = 0;
			Static251.anInt5352 = Static39.anInt1098;
		}
		Static98.aCanvas1.setSize(Static200.anInt4411, Static251.anInt5352);
		if (Static42.aFrame1 == local9) {
			local34 = Static42.aFrame1.getInsets();
			Static98.aCanvas1.setLocation(local34.left + Static58.anInt1620, local34.top - -Static123.anInt1284);
		} else {
			Static98.aCanvas1.setLocation(Static58.anInt1620, Static123.anInt1284);
		}
		if (Static140.anInt3388 != -1) {
			Static249.method4058(true);
		}
		Static139.method4195();
	}
}
