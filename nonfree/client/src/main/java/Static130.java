import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!em", name = "s", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ej;Lclient!ku;I)Lclient!wm;")
	public static Class2_Sub52 method3019(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class183 arg1) {
		@Pc(8) Class2_Sub52 local8 = Static630.method9132();
		local8.anInt11008 = arg0.anInt3262;
		local8.aClass94_107 = arg0;
		if (local8.anInt11008 == -1) {
			local8.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(260);
		} else if (local8.anInt11008 == -2) {
			local8.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(10000);
		} else if (local8.anInt11008 <= 18) {
			local8.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(20);
		} else if (local8.anInt11008 <= 98) {
			local8.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(100);
		} else {
			local8.aClass2_Sub11_Sub2_7 = new Class2_Sub11_Sub2(260);
		}
		local8.aClass2_Sub11_Sub2_7.method8406(arg1);
		local8.aClass2_Sub11_Sub2_7.method8398(local8.aClass94_107.method3004());
		local8.anInt11005 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZLclient!ff;)V")
	public static void method3021(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub3_Sub1 arg1) {
		if (Static298.anInt6262 >= 400) {
			return;
		}
		@Pc(14) Class27 local14 = arg1.aClass27_1;
		if (local14.anIntArray43 != null) {
			local14 = local14.method727(Static286.aClass263_3);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean55) {
			return;
		}
		@Pc(32) String local32 = local14.aString8;
		if (local14.anInt646 != 0) {
			@Pc(51) String local51 = Static557.aClass316_6 == Static423.aClass316_4 ? Static588.aClass351_32.method8691(Static476.anInt8915) : Static588.aClass351_30.method8691(Static476.anInt8915);
			local32 = local32 + Static557.method8308(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106, local14.anInt646) + " (" + local51 + local14.anInt646 + ")";
		}
		if (Static475.aBoolean695 && !arg0) {
			@Pc(88) Class335 local88 = Static58.anInt10722 == -1 ? null : Static229.aClass70_1.method2496(Static58.anInt10722);
			if ((Static237.anInt5148 & 0x2) != 0 && (local88 == null || local14.method738(local88.anInt10093, Static58.anInt10722) != local88.anInt10093)) {
				Static202.method4065(false, Static225.aString47 + " -> <col=ffff00>" + local32, 0, false, 0, -1, true, 30, (long) arg1.anInt6083, Static225.aString48, (long) arg1.anInt6083, Static183.anInt4410);
			}
		}
		if (!arg0) {
			@Pc(139) String[] local139 = local14.aStringArray3;
			if (Static84.aBoolean217) {
				local139 = Static164.method3546(local139);
			}
			@Pc(149) int local149;
			if (local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && (local14.aByte17 == 0 || !local139[local149].equalsIgnoreCase(Static588.aClass351_25.method8691(Static476.anInt8915)))) {
						@Pc(172) byte local172 = 0;
						if (local149 == 0) {
							local172 = 25;
						}
						@Pc(178) int local178 = Static237.anInt5154;
						if (local149 == 1) {
							local172 = 20;
						}
						if (local149 == 2) {
							local172 = 44;
						}
						if (local149 == 3) {
							local172 = 46;
						}
						if (local14.anInt631 == local149) {
							local178 = local14.anInt651;
						}
						if (local149 == 4) {
							local172 = 60;
						}
						if (local149 == local14.anInt658) {
							local178 = local14.anInt634;
						}
						Static202.method4065(false, "<col=ffff00>" + local32, 0, false, 0, -1, true, local172, (long) arg1.anInt6083, local139[local149], (long) arg1.anInt6083, local139[local149].equalsIgnoreCase(Static588.aClass351_25.method8691(Static476.anInt8915)) ? local14.anInt668 : local178);
					}
				}
			}
			if (local14.aByte17 == 1 && local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && local139[local149].equalsIgnoreCase(Static588.aClass351_25.method8691(Static476.anInt8915))) {
						@Pc(290) short local290 = 0;
						if (local14.anInt646 > Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106) {
							local290 = 2000;
						}
						@Pc(303) short local303 = 0;
						if (local149 == 0) {
							local303 = 25;
						}
						if (local149 == 1) {
							local303 = 20;
						}
						if (local149 == 2) {
							local303 = 44;
						}
						if (local149 == 3) {
							local303 = 46;
						}
						if (local149 == 4) {
							local303 = 60;
						}
						if (local303 != 0) {
							local303 += local290;
						}
						Static202.method4065(false, "<col=ffff00>" + local32, 0, false, 0, -1, true, local303, (long) arg1.anInt6083, local139[local149], (long) arg1.anInt6083, local14.anInt668);
					}
				}
			}
		}
		Static202.method4065(arg0, "<col=ffff00>" + local32, 0, false, 0, -1, true, 1008, (long) arg1.anInt6083, Static588.aClass351_24.method8691(Static476.anInt8915), (long) arg1.anInt6083, Static585.anInt10366);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	public static void method3023() {
		for (@Pc(3) int local3 = 0; local3 < Static288.anInt6150; local3++) {
			Static320.aClass82Array2[local3] = null;
		}
		Static288.anInt6150 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static462.anInt8470; local25++) {
			for (local29 = 0; local29 < Static477.anInt8929; local29++) {
				for (local33 = 0; local33 < Static562.anInt10128; local33++) {
					@Pc(43) Class100 local43 = Static395.aClass100ArrayArrayArray3[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort30 > 0) {
							local43.aShort30 = (short) (local43.aShort30 * -1);
						}
						if (local43.aShort32 > 0) {
							local43.aShort32 = (short) (local43.aShort32 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static462.anInt8470; local29++) {
			for (local33 = 0; local33 < Static477.anInt8929; local33++) {
				for (@Pc(99) int local99 = 0; local99 < Static562.anInt10128; local99++) {
					@Pc(109) Class100 local109 = Static395.aClass100ArrayArrayArray3[local29][local99][local33];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static395.aClass100ArrayArrayArray3[0][local99][local33] != null && Static395.aClass100ArrayArrayArray3[0][local99][local33].aClass100_1 != null;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(156) Class100 local156;
						@Pc(164) int local164;
						@Pc(319) int local319;
						@Pc(333) int local333;
						@Pc(340) int local340;
						@Pc(356) int local356;
						@Pc(364) int local364;
						@Pc(368) int local368;
						@Pc(372) int local372;
						@Pc(378) int local378;
						@Pc(416) int local416;
						@Pc(420) int local420;
						if (local109.aShort32 < 0) {
							local140 = local33;
							local142 = local33;
							local156 = Static395.aClass100ArrayArrayArray3[local29][local99][local33 - 1];
							local164 = Static40.aClass65Array2[local29].method7995(local33, local99);
							while (local140 > 0 && local156 != null && local156.aShort32 < 0 && local109.aShort32 == local156.aShort32 && local109.aShort31 == local156.aShort31 && local164 == Static40.aClass65Array2[local29].method7995(local140 - 1, local99) && (local140 - 1 <= 0 || local164 == Static40.aClass65Array2[local29].method7995(local140 - 2, local99))) {
								local140--;
								local156 = Static395.aClass100ArrayArrayArray3[local29][local99][local140 - 1];
							}
							for (local156 = Static395.aClass100ArrayArrayArray3[local29][local99][local33 + 1]; local142 < Static562.anInt10128 && local156 != null && local156.aShort32 < 0 && local109.aShort32 == local156.aShort32 && local109.aShort31 == local156.aShort31 && Static40.aClass65Array2[local29].method7995(local142 + 1, local99) == local164 && (local142 + 1 >= Static562.anInt10128 || local164 == Static40.aClass65Array2[local29].method7995(local142 + 2, local99)); local156 = Static395.aClass100ArrayArrayArray3[local29][local99][local142 + 1]) {
								local142++;
							}
							local319 = local29 + 1 - local29;
							local333 = Static40.aClass65Array2[local132 ? local29 + 1 : local29].method7995(local140, local99);
							local340 = local109.aShort32 * local319 + local333;
							local356 = Static40.aClass65Array2[local132 ? local29 + 1 : local29].method7995(local142 + 1, local99);
							local364 = local356 + local319 * local109.aShort32;
							local368 = local99 << Static151.anInt3896;
							local372 = local140 << Static151.anInt3896;
							local378 = Static582.anInt10356 + (local142 << Static151.anInt3896);
							Static320.aClass82Array2[Static288.anInt6150++] = new Class82(1, local29, local109.aShort31 + local368, local109.aShort31 + local368, local109.aShort31 + local368, local109.aShort31 + local368, local333, local356, local364, local340, local372, local378, local378, local372);
							for (local416 = local29; local416 <= local29; local416++) {
								for (local420 = local140; local420 <= local142; local420++) {
									Static395.aClass100ArrayArrayArray3[local416][local99][local420].aShort32 = (short) (Static395.aClass100ArrayArrayArray3[local416][local99][local420].aShort32 * -1);
								}
							}
						}
						if (local109.aShort30 < 0) {
							local140 = local99;
							local142 = local99;
							local156 = Static395.aClass100ArrayArrayArray3[local29][local99 - 1][local33];
							local164 = Static40.aClass65Array2[local29].method7995(local33, local99);
							while (local140 > 0 && local156 != null && local156.aShort30 < 0 && local156.aShort30 == local109.aShort30 && local109.aShort29 == local156.aShort29 && Static40.aClass65Array2[local29].method7995(local33, local140 - 1) == local164 && (local140 - 1 <= 0 || Static40.aClass65Array2[local29].method7995(local33, local140 - 2) == local164)) {
								local140--;
								local156 = Static395.aClass100ArrayArrayArray3[local29][local140 - 1][local33];
							}
							for (local156 = Static395.aClass100ArrayArrayArray3[local29][local99 + 1][local33]; local142 < Static477.anInt8929 && local156 != null && local156.aShort30 < 0 && local156.aShort30 == local109.aShort30 && local156.aShort29 == local109.aShort29 && Static40.aClass65Array2[local29].method7995(local33, local142 + 1) == local164 && (Static477.anInt8929 <= local142 + 1 || Static40.aClass65Array2[local29].method7995(local33, local142 + 2) == local164); local156 = Static395.aClass100ArrayArrayArray3[local29][local142 + 1][local33]) {
								local142++;
							}
							local319 = local29 + 1 - local29;
							local333 = Static40.aClass65Array2[local132 ? local29 + 1 : local29].method7995(local33, local140);
							local340 = local333 + local319 * local109.aShort30;
							local356 = Static40.aClass65Array2[local132 ? local29 + 1 : local29].method7995(local33, local142 + 1);
							local364 = local109.aShort30 * local319 + local356;
							local368 = local140 << Static151.anInt3896;
							local372 = (local142 << Static151.anInt3896) + Static582.anInt10356;
							local378 = local33 << Static151.anInt3896;
							Static320.aClass82Array2[Static288.anInt6150++] = new Class82(2, local29, local368, local372, local372, local368, local333, local356, local364, local340, local378 + local109.aShort29, local378 + local109.aShort29, local109.aShort29 + local378, local378 - -local109.aShort29);
							for (local416 = local29; local416 <= local29; local416++) {
								for (local420 = local140; local420 <= local142; local420++) {
									Static395.aClass100ArrayArrayArray3[local416][local420][local33].aShort30 = (short) (Static395.aClass100ArrayArrayArray3[local416][local420][local33].aShort30 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static172.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V")
	public static void method3024() {
		if (!Static414.aBoolean558) {
			Static414.aBoolean558 = true;
			Static485.aFloat196 += (24.0F - Static485.aFloat196) / 2.0F;
			Static166.aBoolean304 = true;
		}
	}
}
