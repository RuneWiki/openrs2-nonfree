import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!tr", name = "Q", descriptor = "[Lclient!dh;")
	public static Class33[] aClass33Array3;

	@OriginalMember(owner = "client!tr", name = "R", descriptor = "Lclient!fc;")
	public static Class71 aClass71_85;

	@OriginalMember(owner = "client!tr", name = "T", descriptor = "Lclient!wc;")
	public static Class2_Sub10 aClass2_Sub10_1;

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
	public static int anInt6083;

	@OriginalMember(owner = "client!tr", name = "X", descriptor = "[I")
	public static int[] anIntArray727;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	public static int anInt6062 = -1;

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_216 = new Class221("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!tr", name = "S", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_217 = new Class221("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!tr", name = "W", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_182 = new Class41(65, 4);

	@OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
	public static int anInt6084 = 100;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
	public static void method5251(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static85.aClass2_Sub13_Sub2_11.method4263(Static327.anInt5773) >= 15) {
				@Pc(20) int local20 = Static85.aClass2_Sub13_Sub2_11.method4257(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static107.aClass12_Sub1_Sub2_Sub1Array1[local20] == null) {
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local20] = new Class12_Sub1_Sub2_Sub1();
						local27 = true;
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local20].anInt5365 = local20;
					}
					@Pc(48) Class12_Sub1_Sub2_Sub1 local48 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local20];
					Static346.anIntArray730[Static199.anInt3672++] = local20;
					local48.anInt5340 = Static295.anInt5281;
					if (local48.aClass240_1 != null && local48.aClass240_1.method5576()) {
						Static327.method5051(local48);
					}
					@Pc(77) int local77 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
					if (local77 == 1) {
						Static330.anIntArray704[Static56.anInt1149++] = local20;
					}
					local48.method3260(Static274.aClass151_4.method3705(Static85.aClass2_Sub13_Sub2_11.method4257(14)));
					@Pc(105) int local105 = Static85.aClass2_Sub13_Sub2_11.method4257(2);
					@Pc(112) int local112;
					if (arg0) {
						local112 = Static85.aClass2_Sub13_Sub2_11.method4257(8);
						if (local112 > 127) {
							local112 -= 256;
						}
					} else {
						local112 = Static85.aClass2_Sub13_Sub2_11.method4257(5);
						if (local112 > 15) {
							local112 -= 32;
						}
					}
					@Pc(134) int local134;
					if (arg0) {
						local134 = Static85.aClass2_Sub13_Sub2_11.method4257(8);
						if (local134 > 127) {
							local134 -= 256;
						}
					} else {
						local134 = Static85.aClass2_Sub13_Sub2_11.method4257(5);
						if (local134 > 15) {
							local134 -= 32;
						}
					}
					@Pc(164) int local164 = (Static85.aClass2_Sub13_Sub2_11.method4257(3) + 4 & 0xC8E00007) << 11;
					@Pc(169) int local169 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
					local48.method4698(local48.aClass240_1.anInt6483);
					local48.anInt5317 = local48.aClass240_1.anInt6497 << 3;
					if (local48.anInt5317 == 0) {
						local48.method4703(0);
					} else if (local27) {
						local48.method4703(local164);
					}
					local48.method3263(local48.method4706(), local134 + Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local105, local169 == 1, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] + local112);
					if (local48.aClass240_1.method5576()) {
						Static52.method3357(null, local48, local48.aByte74, local48.anIntArray659[0], 0, null, local48.anIntArray658[0]);
					}
					continue;
				}
			}
			Static85.aClass2_Sub13_Sub2_11.method4262();
			return;
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
	public static void method5252() {
		if (Static69.anIntArray170 != null) {
			return;
		}
		Static69.anIntArray170 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(42) double local42 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(82) double local82;
				if (local60 < 0.5D) {
					local82 = local60 * (local53 + 1.0D);
				} else {
					local82 = local53 + local60 - local53 * local60;
				}
				@Pc(96) double local96 = local60 * 2.0D - local82;
				@Pc(100) double local100 = local42 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local42 - 0.3333333333333333D;
				if (local42 * 6.0D < 1.0D) {
					local64 = (local82 - local96) * 6.0D * local42 + local96;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local82;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local42) * 6.0D * (local82 - local96) + local96;
				} else {
					local64 = local96;
				}
				if (local100 * 6.0D < 1.0D) {
					local62 = local96 + (local82 - local96) * 6.0D * local100;
				} else if (local100 * 2.0D < 1.0D) {
					local62 = local82;
				} else if (local100 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local100) * (-local96 + local82) * 6.0D + local96;
				} else {
					local62 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local114 * 6.0D < 1.0D) {
					local66 = local114 * 6.0D * (local82 - local96) + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local66 = local82;
				} else if (local114 * 3.0D < 2.0D) {
					local66 = local96 + (local82 - local96) * 6.0D * (0.6666666666666666D - local114);
				} else {
					local66 = local96;
				}
			}
			local62 = Math.pow(local62, local19);
			local64 = Math.pow(local64, local19);
			local66 = Math.pow(local66, local19);
			@Pc(295) int local295 = (int) (local62 * 256.0D);
			@Pc(300) int local300 = (int) (local64 * 256.0D);
			@Pc(305) int local305 = (int) (local66 * 256.0D);
			@Pc(315) int local315 = local305 + (local295 << 16) + (local300 << 8);
			Static69.anIntArray170[local29] = local315;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public static void method5253(@OriginalArg(0) int arg0) {
		if (Static344.anInt6327 == arg0) {
			return;
		}
		if (Static344.anInt6327 == 0) {
			Static317.method4928();
		}
		if (arg0 == 40) {
			Static359.method5438();
		}
		if (arg0 != 40 && Static33.aClass124_2 != null) {
			Static33.aClass124_2.method2714();
			Static33.aClass124_2 = null;
		}
		if (Static344.anInt6327 == 25 || Static344.anInt6327 == 28) {
			Static262.aClass71_41.anInt1745 = 2;
			Static38.aClass71_11.anInt1745 = 2;
			Static330.aClass71_79.anInt1745 = 2;
			Static187.aClass71_45.anInt1745 = 2;
			Static193.aClass71_90.anInt1745 = 2;
			Static136.aClass71_28.anInt1745 = 2;
			Static143.aClass71_32.anInt1745 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static272.anInt4881 = 1;
			Static235.anInt4313 = 0;
			Static297.anInt5974 = 0;
			Static171.anInt3057 = 0;
			Static251.anInt4519 = 1;
			Static140.method5082(true);
			Static262.aClass71_41.anInt1745 = 1;
			Static38.aClass71_11.anInt1745 = 1;
			Static330.aClass71_79.anInt1745 = 1;
			Static187.aClass71_45.anInt1745 = 1;
			Static193.aClass71_90.anInt1745 = 1;
			Static136.aClass71_28.anInt1745 = 1;
			Static143.aClass71_32.anInt1745 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static235.method3841();
		}
		if (arg0 == 5) {
			Static314.method4885(Static119.aClass71_25, Static304.aClass82_4);
		} else {
			Static216.method3640();
		}
		@Pc(137) boolean local137 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(160) boolean local160 = Static344.anInt6327 == 5 || Static344.anInt6327 == 10 || Static344.anInt6327 == 28;
		if (local160 != local137) {
			if (local137) {
				Static4.anInt147 = Static166.anInt2973;
				if (Static193.anInt6666 == 0) {
					Static90.method1536();
				} else {
					Static206.method3522(255, Static161.aClass71_37, Static166.anInt2973);
				}
				Static93.aClass23_1.method638(false);
			} else {
				Static90.method1536();
				Static93.aClass23_1.method638(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static304.aClass82_4.method4460();
		}
		Static344.anInt6327 = arg0;
	}
}
