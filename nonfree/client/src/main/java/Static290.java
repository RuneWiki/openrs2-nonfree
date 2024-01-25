import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!ks;")
	public static Class200 aClass200_6;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public static int anInt4888 = 0;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
	public static boolean method4090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static572.aBoolean774) {
			return false;
		}
		@Pc(22) int local22 = arg0 >> 16;
		@Pc(26) int local26 = arg0 & 0xFFFF;
		if (Static509.aClass273ArrayArray2[local22] == null || Static509.aClass273ArrayArray2[local22][local26] == null) {
			return false;
		}
		@Pc(44) Class273 local44 = Static509.aClass273ArrayArray2[local22][local26];
		@Pc(55) Class2_Sub27 local55;
		if (arg1 == -1 && local44.anInt6868 == 0) {
			for (local55 = (Class2_Sub27) Static411.aClass70_43.method1264(); local55 != null; local55 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
				if (local55.anInt4323 == 46 || local55.anInt4323 == 1008 || local55.anInt4323 == 2 || local55.anInt4323 == 15 || local55.anInt4323 == 23) {
					for (@Pc(143) Class273 local143 = Static594.method7731(local55.anInt4324); local143 != null; local143 = Static561.method7333(local143)) {
						if (local143.anInt6810 == local44.anInt6810) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class2_Sub27) Static411.aClass70_43.method1264(); local55 != null; local55 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
				if (local55.anInt4327 == arg1 && local55.anInt4324 == local44.anInt6810 && (local55.anInt4323 == 46 || local55.anInt4323 == 1008 || local55.anInt4323 == 2 || local55.anInt4323 == 15 || local55.anInt4323 == 23)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIII)I")
	public static int method4092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg2) {
			return arg1 > arg0 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ps;IIILclient!r;)V")
	public static void method4093(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class162 arg3) {
		@Pc(18) Class84 local18 = arg0.method5632(arg3);
		if (local18 == null) {
			return;
		}
		arg3.da(arg2, arg1, arg2 + arg0.anInt6883, arg1 - -arg0.anInt6814);
		if (Static449.anInt7189 == 2 || Static449.anInt7189 == 5 || Static64.aClass38_7 == null) {
			arg3.FA(-16777216, local18, arg2, arg1);
			return;
		}
		@Pc(64) int local64;
		@Pc(67) int local67;
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (Static489.anInt7763 == 4) {
			local64 = Static504.anInt8012;
			local61 = 4096;
			local67 = Static520.anInt8309;
			local54 = (int) -Static313.aFloat157 & 0x3FFF;
		} else {
			local54 = (int) -Static313.aFloat157 + Static525.anInt8446 & 0x3FFF;
			local61 = 4096 - Static434.anInt6973 * 16;
			local64 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
			local67 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
		}
		@Pc(95) int local95 = local64 / 128 + 48 - (Static281.anInt4822 - 104) * 2;
		@Pc(113) int local113 = Static29.anInt491 * 4 + 208 + 48 - Static29.anInt491 * 2 - local67 / 128;
		Static64.aClass38_7.method7458((float) arg0.anInt6883 / 2.0F + (float) arg2, (float) arg1 + (float) arg0.anInt6814 / 2.0F, (float) local95, (float) local113, local61, local54 << 2, local18, arg2, arg1);
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(147) Class2_Sub44 local147 = (Class2_Sub44) Static232.aClass70_24.method1264(); local147 != null; local147 = (Class2_Sub44) Static232.aClass70_24.method1261()) {
			@Pc(152) int local152 = local147.anInt7748;
			local164 = (Static170.aClass214_1.anIntArray357[local152] >> 14 & 0x3FFF) - Static485.anInt7725;
			local174 = (Static170.aClass214_1.anIntArray357[local152] & 0x3FFF) - Static310.anInt5129;
			local185 = local164 * 4 + 2 - local64 / 128;
			local196 = local174 * 4 + 2 - local67 / 128;
			Static467.method6018(local18, arg3, local196, arg2, arg1, Static170.aClass214_1.anIntArray356[local152], arg0, local185);
		}
		for (local164 = 0; local164 < Static314.anInt7787; local164++) {
			local174 = Static237.anIntArray289[local164] * 4 + 2 - local64 / 128;
			local185 = Static108.anIntArray163[local164] * 4 + 2 - local67 / 128;
			@Pc(252) Class216 local252 = Static362.aClass290_2.method5799(Static459.anIntArray494[local164]);
			if (local252.anIntArray362 != null) {
				local252 = local252.method4560(Static426.aClass160_1);
				if (local252 == null || local252.anInt5284 == -1) {
					continue;
				}
			}
			Static467.method6018(local18, arg3, local185, arg2, arg1, local252.anInt5284, arg0, local174);
		}
		@Pc(335) int local335;
		@Pc(346) int local346;
		for (@Pc(288) Class2_Sub6 local288 = (Class2_Sub6) Static531.aClass90_39.method1676(); local288 != null; local288 = (Class2_Sub6) Static531.aClass90_39.method1680()) {
			local185 = (int) (local288.aLong268 >> 28 & 0x3L);
			if (Static180.anInt2677 == local185) {
				local196 = (int) (local288.aLong268 & 0x3FFFL) - Static485.anInt7725;
				@Pc(324) int local324 = (int) (local288.aLong268 >> 14 & 0x3FFFL) - Static310.anInt5129;
				local335 = local196 * 4 + 2 - local64 / 128;
				local346 = local324 * 4 + 2 - local67 / 128;
				Static460.method5970(Static210.aClass38Array12[0], local335, local346, arg1, arg0, local18, arg2);
			}
		}
		@Pc(436) int local436;
		for (local185 = 0; local185 < Static365.anInt6148; local185++) {
			@Pc(377) Class2_Sub5 local377 = (Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local185]);
			if (local377 != null) {
				@Pc(382) Class12_Sub2_Sub1_Sub4_Sub2 local382 = local377.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				if (local382.method6789() && local382.aByte128 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) {
					@Pc(398) Class295 local398 = local382.aClass295_1;
					if (local398 != null && local398.anIntArray493 != null) {
						local398 = local398.method5942(Static426.aClass160_1);
					}
					if (local398 != null && local398.aBoolean612 && local398.aBoolean609) {
						local346 = local382.anInt9374 / 128 - local64 / 128;
						local436 = local382.anInt9375 / 128 - local67 / 128;
						if (local398.anInt7348 == -1) {
							Static460.method5970(Static210.aClass38Array12[1], local346, local436, arg1, arg0, local18, arg2);
						} else {
							Static467.method6018(local18, arg3, local436, arg2, arg1, local398.anInt7348, arg0, local346);
						}
					}
				}
			}
		}
		local196 = Static84.anInt9548;
		@Pc(477) int[] local477 = Static520.anIntArray555;
		@Pc(527) int local527;
		@Pc(531) int local531;
		@Pc(556) int local556;
		for (local335 = 0; local335 < local196; local335++) {
			@Pc(487) Class12_Sub2_Sub1_Sub4_Sub1 local487 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local477[local335]];
			if (local487 != null && local487.method4905() && !local487.aBoolean461 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 != local487 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 == local487.aByte128) {
				local436 = local487.anInt9374 / 128 - local64 / 128;
				local527 = local487.anInt9375 / 128 - local67 / 128;
				@Pc(529) boolean local529 = false;
				for (local531 = 0; local531 < Static107.anInt1861; local531++) {
					if (local487.aString75.equals(Static394.aStringArray33[local531]) && Static166.anIntArray213[local531] != 0) {
						local529 = true;
						break;
					}
				}
				@Pc(554) boolean local554 = false;
				for (local556 = 0; local556 < Static399.anInt6590; local556++) {
					if (local487.aString75.equals(Static502.aClass53Array1[local556].aString13)) {
						local554 = true;
						break;
					}
				}
				@Pc(580) boolean local580 = false;
				if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5806 != 0 && local487.anInt5806 != 0 && local487.anInt5806 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5806) {
					local580 = true;
				}
				if (local487.aBoolean462) {
					Static460.method5970(Static210.aClass38Array12[6], local436, local527, arg1, arg0, local18, arg2);
				} else if (local529) {
					Static460.method5970(Static210.aClass38Array12[3], local436, local527, arg1, arg0, local18, arg2);
				} else if (local554) {
					Static460.method5970(Static210.aClass38Array12[5], local436, local527, arg1, arg0, local18, arg2);
				} else if (local580) {
					Static460.method5970(Static210.aClass38Array12[4], local436, local527, arg1, arg0, local18, arg2);
				} else {
					Static460.method5970(Static210.aClass38Array12[2], local436, local527, arg1, arg0, local18, arg2);
				}
			}
		}
		@Pc(678) Class80[] local678 = Static271.aClass80Array1;
		@Pc(764) int local764;
		for (local436 = 0; local436 < local678.length; local436++) {
			@Pc(686) Class80 local686 = local678[local436];
			if (local686 != null && local686.anInt1806 != 0 && Static532.anInt8757 % 20 < 10) {
				@Pc(727) int local727;
				if (local686.anInt1806 == 1) {
					@Pc(712) Class2_Sub5 local712 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local686.anInt1798);
					if (local712 != null) {
						@Pc(717) Class12_Sub2_Sub1_Sub4_Sub2 local717 = local712.aClass12_Sub2_Sub1_Sub4_Sub2_1;
						local727 = local717.anInt9374 / 128 - local64 / 128;
						local556 = local717.anInt9375 / 128 - local67 / 128;
						Static275.method3999(arg1, local686.anInt1801, local727, local556, arg2, local18, arg0, 360000L);
					}
				}
				if (local686.anInt1806 == 2) {
					local764 = local686.anInt1809 / 128 - local64 / 128;
					local531 = local686.anInt1802 / 128 - local67 / 128;
					@Pc(780) long local780 = (long) (local686.anInt1800 << 7);
					@Pc(784) long local784 = local780 * local780;
					Static275.method3999(arg1, local686.anInt1801, local764, local531, arg2, local18, arg0, local784);
				}
				if (local686.anInt1806 == 10 && local686.anInt1798 >= 0 && local686.anInt1798 < Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1.length) {
					@Pc(814) Class12_Sub2_Sub1_Sub4_Sub1 local814 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local686.anInt1798];
					if (local814 != null) {
						local531 = local814.anInt9374 / 128 - local64 / 128;
						local727 = local814.anInt9375 / 128 - local67 / 128;
						Static275.method3999(arg1, local686.anInt1801, local531, local727, arg2, local18, arg0, 360000L);
					}
				}
			}
		}
		if (Static489.anInt7763 == 4) {
			return;
		}
		if (Static484.anInt7716 != 0) {
			local527 = Static484.anInt7716 * 4 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() + -1) * 2 + 2 - local64 / 128;
			local764 = Static143.anInt7433 * 4 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() + -1) * 2 + 2 - local67 / 128;
			Static460.method5970(Static226.aClass38Array13[Static143.aBoolean620 ? 1 : 0], local527, local764, arg1, arg0, local18, arg2);
		}
		if (!Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aBoolean461) {
			arg3.method6885(arg1 + arg0.anInt6814 / 2 - 1, -1, 3, arg0.anInt6883 / 2 + arg2 - 1, 3);
			return;
		}
	}
}
