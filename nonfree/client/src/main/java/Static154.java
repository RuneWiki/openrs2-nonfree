import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!ho;")
	public static Class9 aClass9_17;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method2169() {
		if (Static310.anIntArray309 != null) {
			return;
		}
		Static310.anIntArray309 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(84) float local84 = (1.0F - local45) * local54;
				@Pc(92) float local92 = local54 * (1.0F - local77 * local45);
				@Pc(103) float local103 = local54 * (1.0F - (1.0F - local77) * local45);
				if (local71 == 0) {
					local60 = local84;
					local56 = local54;
					local58 = local103;
				} else if (local71 == 1) {
					local58 = local54;
					local60 = local84;
					local56 = local92;
				} else if (local71 == 2) {
					local58 = local54;
					local56 = local84;
					local60 = local103;
				} else if (local71 == 3) {
					local56 = local84;
					local58 = local92;
					local60 = local54;
				} else if (local71 == 4) {
					local58 = local84;
					local56 = local103;
					local60 = local54;
				} else if (local71 == 5) {
					local56 = local54;
					local60 = local92;
					local58 = local84;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(199) int local199 = (int) (local56 * 256.0F);
				@Pc(204) int local204 = (int) (local58 * 256.0F);
				@Pc(209) int local209 = (int) (local60 * 256.0F);
				@Pc(222) int local222 = local209 + (local199 << 16) + (local204 << 8) - 16777216;
				Static310.anIntArray309[local21++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method2170() {
		Static83.aClass132_3.L(Static355.anInt6039, Static96.aClass6_Sub22_7.aClass29_Sub15_1.method5422() == 1 ? Static450.anInt10323 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public static void method2171() {
		if (Static546.aClass132_13.method7487()) {
			Static546.aClass132_13.method7460(Static140.aCanvas1);
			Static210.method3098();
			if (Static594.aBoolean693) {
				Static382.method5424(Static140.aCanvas1);
			} else {
				@Pc(23) Dimension local23 = Static140.aCanvas1.getSize();
				Static546.aClass132_13.method7494(Static140.aCanvas1, local23.width, local23.height);
			}
			Static546.aClass132_13.method7505(Static140.aCanvas1);
		} else {
			Static646.method8805(Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742(), false);
		}
		Static509.method7248();
		Static119.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method2174() {
		Static426.anInt7557 = 0;
		Static566.anInt9418 = -1;
		Static508.anInt9992 = -1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)I")
	public static int method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 < arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)I")
	public static int method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg1;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
