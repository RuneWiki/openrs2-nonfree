import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_200 = new Class136(114, 8);

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
	public static void method8757() {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt730; local3++) {
			@Pc(9) Class59 local9 = Static113.aClass59Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(144) int local144;
			if (local9.aClass5_Sub16_Sub2_1 == null) {
				local9.anInt1287--;
				if (local9.anInt1287 < (local9.method1242() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte19 == 1 && local9.aClass322_1 == null) {
						local9.aClass322_1 = Static657.method7709(Static61.aClass384_23, local9.anInt1290, 0);
						if (local9.aClass322_1 == null) {
							continue;
						}
						local9.anInt1287 += local9.aClass322_1.method7711();
					} else if (local9.method1242() && (local9.aClass5_Sub38_1 == null || local9.aClass5_Sub11_Sub1_1 == null)) {
						if (local9.aClass5_Sub38_1 == null) {
							local9.aClass5_Sub38_1 = Static412.method6277(Static340.aClass384_85, local9.anInt1290);
						}
						if (local9.aClass5_Sub38_1 == null) {
							continue;
						}
						if (local9.aClass5_Sub11_Sub1_1 == null) {
							local9.aClass5_Sub11_Sub1_1 = local9.aClass5_Sub38_1.method6282(new int[] { 22050 });
							if (local9.aClass5_Sub11_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt1287 < 0) {
						@Pc(119) int local119 = 8192;
						if (local9.anInt1291 == 0) {
							local144 = local9.anInt1281 * (local9.aByte19 == 3 ? Static627.aClass5_Sub46_31.aClass11_Sub17_3.method5908() : Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908()) >> 2;
						} else {
							@Pc(153) int local153 = local9.anInt1291 >> 24 & 0x3;
							if (local153 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) {
								@Pc(168) int local168 = (local9.anInt1291 & 0xFF) << 9;
								@Pc(174) int local174 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() << 8;
								@Pc(181) int local181 = local9.anInt1291 >> 16 & 0xFF;
								@Pc(193) int local193 = (local181 << 9) + local174 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
								@Pc(200) int local200 = local9.anInt1291 >> 8 & 0xFF;
								@Pc(211) int local211 = (local200 << 9) + local174 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
								@Pc(219) int local219 = Math.abs(local193) + Math.abs(local211) - 512;
								if (local168 < local219) {
									local9.anInt1287 = -99999;
									continue;
								}
								if (local219 < 0) {
									local219 = 0;
								}
								local144 = Static627.aClass5_Sub46_31.aClass11_Sub17_1.method5908() * (local168 - local219) * local9.anInt1281 / local168 >> 2;
								if (local9.aClass14_Sub1_5 != null && local9.aClass14_Sub1_5 instanceof Class14_Sub1_Sub1) {
									@Pc(262) Class14_Sub1_Sub1 local262 = (Class14_Sub1_Sub1) local9.aClass14_Sub1_5;
									@Pc(265) short local265 = local262.aShort71;
									@Pc(268) short local268 = local262.aShort74;
								}
								if (local193 != 0 || local211 != 0) {
									@Pc(294) int local294 = -Static608.anInt9971 - (int) (Math.atan2((double) local193, (double) local211) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local294 > 8192) {
										local294 = 16384 - local294;
									}
									@Pc(318) int local318;
									if (local219 <= 0) {
										local318 = 8192;
									} else if (local219 < 4096) {
										local318 = (8192 - local219) / 4096 + 8192;
									} else {
										local318 = 16384;
									}
									local119 = local318 * local294 / 8192 + (16384 - local318 >> 1);
								}
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(350) Class5_Sub11_Sub1 local350 = null;
							if (local9.aByte19 == 1) {
								local350 = local9.aClass322_1.method7710().method1276(Static156.aClass325_1);
							} else if (local9.method1242()) {
								local350 = local9.aClass5_Sub11_Sub1_1;
							}
							@Pc(378) Class5_Sub16_Sub2 local378 = local9.aClass5_Sub16_Sub2_1 = Static653.method3341(local350, local9.anInt1288, local144, local119);
							local378.method3352(local9.anInt1286 - 1);
							Static287.aClass5_Sub16_Sub3_1.method6140(local378);
						}
					}
				}
			} else if (!local9.aClass5_Sub16_Sub2_1.method8913()) {
				local11 = true;
			}
			if (local11) {
				Static44.anInt730--;
				for (local144 = local3; local144 < Static44.anInt730; local144++) {
					Static113.aClass59Array1[local144] = Static113.aClass59Array1[local144 + 1];
				}
				local3--;
			}
		}
		if (Static309.aBoolean451 && !Static533.method386()) {
			if (Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908() != 0 && Static68.anInt1096 != -1) {
				if (Static476.aClass5_Sub16_Sub1_4 == null) {
					Static228.method3581(Static68.anInt1096, Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908(), Static7.aClass384_3);
				} else {
					Static207.method3195(Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908(), Static476.aClass5_Sub16_Sub1_4, Static7.aClass384_3, Static68.anInt1096);
				}
			}
			Static476.aClass5_Sub16_Sub1_4 = null;
			Static309.aBoolean451 = false;
		} else if (Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908() != 0 && Static68.anInt1096 != -1 && !Static533.method386()) {
			@Pc(487) Class5_Sub40 local487 = Static25.method507(Static98.aClass208_2, Static335.aClass181_46);
			local487.aClass5_Sub12_Sub2_2.method8622(Static68.anInt1096);
			Static612.method8496(local487);
			Static68.anInt1096 = -1;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!aha;B[[B)V")
	public static void method8759(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt347; local14++) {
			Static439.method6528();
			for (local20 = 0; local20 < Static111.anInt1752 >> 3; local20++) {
				for (local24 = 0; local24 < Static279.anInt4567 >> 3; local24++) {
					local34 = Static414.anIntArrayArrayArray10[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean31 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(77) int local77 = (local61 / 8 << 8) + local67 / 8;
							for (@Pc(79) int local79 = 0; local79 < Static594.anIntArray784.length; local79++) {
								if (local77 == Static594.anIntArray784[local79] && arg1[local79] != null) {
									@Pc(97) Class5_Sub12 local97 = new Class5_Sub12(arg1[local79]);
									arg0.method385(local61, local24 * 8, local55, local44, Static308.aClass182Array1, local97, local14, local67, local20 * 8);
									arg0.method401(local67, local61, local44, local24 * 8, local20 * 8, local97, local55, Static485.aClass126_17, local12[0] == -1 ? local12 : null, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt347; local20++) {
			Static439.method6528();
			for (local24 = 0; local24 < Static111.anInt1752 >> 3; local24++) {
				for (local34 = 0; local34 < Static279.anInt4567 >> 3; local34++) {
					local44 = Static414.anIntArrayArrayArray10[local20][local24][local34];
					if (local44 == -1) {
						arg0.method383(8, 8, local20, local24 * 8, local34 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static374.aClass218_1 = Static499.aClass121_1.method2668(local12[2], local12[0], local12[1], local12[3], Static629.aClass20_1);
			Static202.anInt3588 = local12[4];
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBI)I")
	public static int method8760(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return local45 + (arg0 & 0xFF80);
		}
	}
}
