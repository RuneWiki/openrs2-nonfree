import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
	public static int anInt9177;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
	public static int anInt9170 = 0;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_127 = new Class71(17, 4);

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static void method7501() {
		if (Static491.anIntArray491 != null) {
			return;
		}
		Static491.anIntArray491 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
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
				@Pc(90) float local90 = (1.0F - local52) * local61;
				@Pc(99) float local99 = (1.0F - local83 * local52) * local61;
				@Pc(111) float local111 = (1.0F - local52 * (1.0F - local83)) * local61;
				if (local78 == 0) {
					local67 = local90;
					local63 = local61;
					local65 = local111;
				} else if (local78 == 1) {
					local63 = local99;
					local67 = local90;
					local65 = local61;
				} else if (local78 == 2) {
					local63 = local90;
					local67 = local111;
					local65 = local61;
				} else if (local78 == 3) {
					local67 = local61;
					local65 = local99;
					local63 = local90;
				} else if (local78 == 4) {
					local65 = local90;
					local63 = local111;
					local67 = local61;
				} else if (local78 == 5) {
					local63 = local61;
					local65 = local90;
					local67 = local99;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(204) int local204 = (int) (local63 * 256.0F);
				@Pc(209) int local209 = (int) (local65 * 256.0F);
				@Pc(214) int local214 = (int) (local67 * 256.0F);
				@Pc(226) int local226 = local214 + (local204 << 16) + (local209 << 8) - 16777216;
				Static491.anIntArray491[local27++] = local226;
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B[[BLclient!fca;)V")
	public static void method7505(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt3635; local14++) {
			Static92.method2160();
			for (local20 = 0; local20 < Static372.anInt7082 >> 3; local20++) {
				for (local24 = 0; local24 < Static218.anInt5023 >> 3; local24++) {
					local34 = Static346.anIntArrayArrayArray10[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean269 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = (local63 / 8 << 8) + local69 / 8;
							for (@Pc(81) int local81 = 0; local81 < Static170.anIntArray225.length; local81++) {
								if (Static170.anIntArray225[local81] == local79 && arg0[local81] != null) {
									@Pc(103) Class8_Sub8 local103 = new Class8_Sub8(arg0[local81]);
									arg1.method2994(local14, Static204.aClass48Array1, local57, local20 * 8, local103, local24 * 8, local43, local63, local69);
									arg1.method3003(local69, local24 * 8, Static171.aClass16_5, local63, local14, local20 * 8, local103, local12[0] == -1 ? local12 : null, local57, local43);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt3635; local20++) {
			Static92.method2160();
			for (local24 = 0; local24 < Static372.anInt7082 >> 3; local24++) {
				for (local34 = 0; local34 < Static218.anInt5023 >> 3; local34++) {
					local43 = Static346.anIntArrayArrayArray10[local20][local24][local34];
					if (local43 == -1) {
						arg1.method2996(local20, 8, local34 * 8, local24 * 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static328.aClass203_5 = Static527.aClass321_1.method7503(local12[2], local12[3], Static274.aClass270_1, local12[0], local12[1]);
			Static83.anInt2471 = local12[4];
		}
	}
}
