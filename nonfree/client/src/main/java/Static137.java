import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method2769() {
		if (Static170.anIntArray264 != null) {
			return;
		}
		Static170.anIntArray264 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(90) float local90 = local61 * (1.0F - local52);
				@Pc(98) float local98 = local61 * (1.0F - local52 * local83);
				@Pc(109) float local109 = local61 * (1.0F - local52 * (1.0F - local83));
				if (local78 == 0) {
					local63 = local61;
					local65 = local109;
					local67 = local90;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local90;
					local63 = local98;
				} else if (local78 == 2) {
					local67 = local109;
					local63 = local90;
					local65 = local61;
				} else if (local78 == 3) {
					local67 = local61;
					local63 = local90;
					local65 = local98;
				} else if (local78 == 4) {
					local63 = local109;
					local67 = local61;
					local65 = local90;
				} else if (local78 == 5) {
					local63 = local61;
					local67 = local98;
					local65 = local90;
				}
				local63 = (float) Math.pow((double) local63, local20);
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				@Pc(199) int local199 = (int) (local63 * 256.0F);
				@Pc(204) int local204 = (int) (local65 * 256.0F);
				@Pc(209) int local209 = (int) (local67 * 256.0F);
				@Pc(222) int local222 = (local204 << 8) + (local199 << 16) + local209 - 16777216;
				Static170.anIntArray264[local27++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method2771() {
		for (@Pc(7) int local7 = 0; local7 < Static116.anInt2537; local7++) {
			@Pc(13) int local13 = Static38.anIntArray61[local7]--;
			if (Static38.anIntArray61[local7] >= -10) {
				@Pc(88) Class65 local88 = Static83.aClass65Array1[local7];
				if (local88 == null) {
					local88 = Static371.method2048(Static265.aClass30_78, Static189.anIntArray288[local7], 0);
					if (local88 == null) {
						continue;
					}
					Static38.anIntArray61[local7] += local88.method2045();
					Static83.aClass65Array1[local7] = local88;
				}
				if (Static38.anIntArray61[local7] < 0) {
					@Pc(132) int local132;
					if (Static155.anIntArray232[local7] == 0) {
						local132 = Static81.anIntArray144[local7] * Static124.anInt2721 >> 8;
					} else {
						@Pc(142) int local142 = Static155.anIntArray232[local7] >> 24 & 0x3;
						if (local142 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
							@Pc(158) int local158 = (Static155.anIntArray232[local7] & 0xFF) * 128;
							@Pc(166) int local166 = Static155.anIntArray232[local7] >> 16 & 0xFF;
							@Pc(176) int local176 = local166 * 128 + 64 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729;
							if (local176 < 0) {
								local176 = -local176;
							}
							@Pc(189) int local189 = Static155.anIntArray232[local7] >> 8 & 0xFF;
							@Pc(199) int local199 = local189 * 128 + 64 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726;
							if (local199 < 0) {
								local199 = -local199;
							}
							@Pc(213) int local213 = local199 + local176 - 128;
							if (local213 > local158) {
								Static38.anIntArray61[local7] = -100;
								continue;
							}
							if (local213 < 0) {
								local213 = 0;
							}
							local132 = Static105.anInt2415 * (local158 - local213) * Static81.anIntArray144[local7] / local158 >> 8;
						} else {
							local132 = 0;
						}
					}
					if (local132 > 0) {
						@Pc(248) Class1_Sub39_Sub1 local248 = local88.method2046().method5474(Static42.aClass70_1);
						@Pc(253) Class1_Sub6_Sub2 local253 = Static372.method2525(local248, local132);
						local253.method2529(Static123.anIntArray198[local7] - 1);
						Static324.aClass1_Sub6_Sub3_2.method3785(local253);
					}
					Static38.anIntArray61[local7] = -100;
				}
			} else {
				Static116.anInt2537--;
				for (@Pc(27) int local27 = local7; local27 < Static116.anInt2537; local27++) {
					Static189.anIntArray288[local27] = Static189.anIntArray288[local27 + 1];
					Static83.aClass65Array1[local27] = Static83.aClass65Array1[local27 + 1];
					Static123.anIntArray198[local27] = Static123.anIntArray198[local27 + 1];
					Static38.anIntArray61[local27] = Static38.anIntArray61[local27 + 1];
					Static155.anIntArray232[local27] = Static155.anIntArray232[local27 + 1];
					Static81.anIntArray144[local27] = Static81.anIntArray144[local27 + 1];
				}
				local7--;
			}
		}
		if (Static298.aBoolean482 && !Static212.method3950()) {
			if (Static219.anInt4418 != 0 && Static185.anInt1932 != -1) {
				Static134.method2732(Static219.anInt4418, Static330.aClass30_93, Static185.anInt1932);
			}
			Static298.aBoolean482 = false;
		} else if (Static219.anInt4418 != 0 && Static185.anInt1932 != -1 && !Static212.method3950()) {
			Static280.method5009(Static330.aClass18_210);
			Static339.aClass1_Sub7_Sub2_4.method2115(Static185.anInt1932);
			Static185.anInt1932 = -1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)Z")
	public static boolean method2772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static264.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
	public static void method2773() {
		Static280.method5009(Static288.aClass18_187);
		Static339.aClass1_Sub7_Sub2_4.method2144(Static235.anInt4759);
	}
}
