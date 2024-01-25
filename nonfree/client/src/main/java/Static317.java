import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!se", name = "wb", descriptor = "Lclient!sd;")
	public static Class208 aClass208_165;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "I")
	public static int anInt5793 = 0;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_13 = new Class213(1, 17);

	@OriginalMember(owner = "client!se", name = "rb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_91 = new Class183(47, 3);

	@OriginalMember(owner = "client!se", name = "vb", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_211 = new Class62("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!se", name = "yb", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_166 = new Class208(85, 3);

	@OriginalMember(owner = "client!se", name = "zb", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method5127() {
		for (@Pc(11) int local11 = 0; local11 < Static287.anInt5316; local11++) {
			@Pc(17) int local17 = Static4.anIntArray13[local11];
			@Pc(21) Class1_Sub2_Sub1_Sub2 local21 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local17];
			@Pc(25) int local25 = Static321.aClass2_Sub24_Sub2_34.method5732();
			if ((local25 & 0x10) != 0) {
				local25 += Static321.aClass2_Sub24_Sub2_34.method5732() << 8;
			}
			@Pc(51) int local51;
			if ((local25 & 0x100) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5753();
				local21.anInt5419 = Static321.aClass2_Sub24_Sub2_34.method5733();
				local21.anInt5380 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local21.aBoolean396 = (local51 & 0x8000) != 0;
				local21.anInt5371 = local51 & 0x7FFF;
				local21.anInt5412 = local21.anInt5419 + Static339.anInt6265 + local21.anInt5371;
			}
			if ((local25 & 0x20) != 0) {
				local21.anInt5418 = Static321.aClass2_Sub24_Sub2_34.method5720();
				if (local21.anInt5418 == 65535) {
					local21.anInt5418 = -1;
				}
			}
			@Pc(126) int local126;
			if ((local25 & 0x8) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5720();
				if (local51 == 65535) {
					local51 = -1;
				}
				local126 = Static321.aClass2_Sub24_Sub2_34.method5732();
				Static278.method4617(local51, local21, local126);
			}
			if ((local25 & 0x4) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5722();
				local126 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local21.method4797(local51, local126, Static339.anInt6265);
			}
			if ((local25 & 0x1) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5722();
				local126 = Static321.aClass2_Sub24_Sub2_34.method5733();
				local21.method4797(local51, local126, Static339.anInt6265);
				local21.anInt5385 = Static339.anInt6265 + 300;
				local21.anInt5384 = Static321.aClass2_Sub24_Sub2_34.method5723();
			}
			@Pc(202) int local202;
			if ((local25 & 0x200) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5723();
				@Pc(188) int[] local188 = new int[local51];
				@Pc(191) int[] local191 = new int[local51];
				@Pc(194) int[] local194 = new int[local51];
				for (@Pc(196) int local196 = 0; local196 < local51; local196++) {
					local202 = Static321.aClass2_Sub24_Sub2_34.method5720();
					if (local202 == 65535) {
						local202 = -1;
					}
					local188[local196] = local202;
					local191[local196] = Static321.aClass2_Sub24_Sub2_34.method5733();
					local194[local196] = Static321.aClass2_Sub24_Sub2_34.method5753();
				}
				Static67.method1227(local21, local194, local188, local191);
			}
			if ((local25 & 0x2) != 0) {
				if (local21.aClass197_1.method4839()) {
					Static313.method5078(local21);
				}
				local21.method4807(Static207.aClass32_1.method579(Static321.aClass2_Sub24_Sub2_34.method5720()));
				local21.method4801(local21.aClass197_1.anInt5486);
				local21.anInt5426 = local21.aClass197_1.anInt5488 << 3;
				if (local21.aClass197_1.method4839()) {
					Static168.method2962(0, local21.aByte73, local21.anIntArray465[0], local21, null, null, local21.anIntArray466[0]);
				}
			}
			if ((local25 & 0x40) != 0) {
				local51 = Static321.aClass2_Sub24_Sub2_34.method5719();
				local126 = Static321.aClass2_Sub24_Sub2_34.method5776();
				if (local51 == 65535) {
					local51 = -1;
				}
				@Pc(310) boolean local310 = true;
				@Pc(345) Class102 local345;
				if (local51 != -1 && local21.anInt5396 != -1) {
					@Pc(332) Class182 local332;
					if (local21.anInt5396 == local51) {
						local332 = Static153.aClass116_1.method2791(local51);
						if (local332.aBoolean374 && local332.anInt5101 != -1) {
							local345 = Static333.aClass50_2.method1175(local332.anInt5101);
							local202 = local345.anInt2985;
							if (local202 == 0) {
								local310 = false;
							} else if (local202 == 1) {
								local310 = true;
							} else if (local202 == 2) {
								local21.anInt5414 = 0;
								local310 = false;
							}
						}
					} else {
						local332 = Static153.aClass116_1.method2791(local51);
						@Pc(389) Class182 local389 = Static153.aClass116_1.method2791(local21.anInt5396);
						if (local332.anInt5101 != -1 && local389.anInt5101 != -1) {
							@Pc(405) Class102 local405 = Static333.aClass50_2.method1175(local332.anInt5101);
							@Pc(411) Class102 local411 = Static333.aClass50_2.method1175(local389.anInt5101);
							if (local405.anInt2992 < local411.anInt2992) {
								local310 = false;
							}
						}
					}
				}
				if (local310) {
					local21.anInt5396 = local51;
					local21.anInt5390 = (local126 & 0xFFFF) + Static339.anInt6265;
					local21.anInt5423 = local126 >> 16;
					local21.anInt5404 = 0;
					local21.anInt5364 = 1;
					local21.anInt5391 = 0;
					if (local21.anInt5390 > Static339.anInt6265) {
						local21.anInt5404 = -1;
					}
					if (local21.anInt5396 != -1 && local21.anInt5390 == Static339.anInt6265) {
						@Pc(467) int local467 = Static153.aClass116_1.method2791(local21.anInt5396).anInt5101;
						if (local467 != -1) {
							local345 = Static333.aClass50_2.method1175(local467);
							if (local345 != null && local345.anIntArray231 != null) {
								Static343.method5495(local345, false, local21.anInt6800, 0, local21.anInt6798, local21.aByte73);
							}
						}
					}
				}
			}
			if ((local25 & 0x400) != 0) {
				local21.anInt5441 = Static321.aClass2_Sub24_Sub2_34.method5767();
				local21.anInt5442 = Static321.aClass2_Sub24_Sub2_34.method5720();
			}
			if ((local25 & 0x80) != 0) {
				local21.aString51 = Static321.aClass2_Sub24_Sub2_34.method5744();
				local21.anInt5397 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qe;III)V")
	public static void method5131(@OriginalArg(0) Class189 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static169.aClass189ArrayArray3[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([[[Lclient!qa;B)V")
	public static void method5132(@OriginalArg(0) Class188[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class188[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class188 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass1_Sub1_2 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub1_2).method6030();
						}
						if (local23.aClass1_Sub3_3 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub3_3).method6030();
						}
						if (local23.aClass1_Sub3_2 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub3_2).method6030();
						}
						if (local23.aClass1_Sub5_2 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub5_2).method6030();
						}
						if (local23.aClass1_Sub5_1 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub5_1).method6030();
						}
						for (@Pc(73) Class168 local73 = local23.aClass168_2; local73 != null; local73 = local73.aClass168_1) {
							@Pc(78) Class1_Sub2 local78 = local73.aClass1_Sub2_1;
							if (local78 instanceof Interface8) {
								((Interface8) local78).method6030();
							}
						}
					}
				}
			}
		}
	}
}
