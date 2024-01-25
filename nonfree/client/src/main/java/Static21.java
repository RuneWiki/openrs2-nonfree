import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!jq;Lclient!qa;II)V")
	public static void method522(@OriginalArg(1) Class156 arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class40 local14 = arg0.method4057(arg1);
		if (local14 == null) {
			return;
		}
		arg1.N(arg2, arg3, arg2 + arg0.anInt4732, arg0.anInt4673 + arg3);
		if (Static329.anInt5977 == 2 || Static329.anInt5977 == 5 || Static177.aClass2_25 == null) {
			arg1.G(-16777216, local14, arg2, arg3);
			return;
		}
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(60) int local60;
		@Pc(70) int local70;
		if (Static448.anInt7701 == 4) {
			local60 = (int) -Static404.aFloat156 & 0x3FFF;
			local52 = Static308.anInt5706;
			local63 = Static88.anInt1782;
			local70 = 4096;
		} else {
			local52 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
			local60 = Static265.anInt5084 + (int) -Static404.aFloat156 & 0x3FFF;
			local63 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141;
			local70 = 4096 - Static316.anInt5814 * 16;
		}
		@Pc(97) int local97 = local52 / 128 + 48 - (Static459.anInt7799 - 104) * 2;
		@Pc(114) int local114 = Static482.anInt7990 * 4 + 48 - local63 / 128 - (Static482.anInt7990 + -104) * 2;
		Static177.aClass2_25.method7361((float) arg0.anInt4732 / 2.0F + (float) arg2, (float) arg0.anInt4673 / 2.0F + (float) arg3, (float) local97, (float) local114, local70, local60 << 2, local14, arg2, arg3);
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(148) Class1_Sub9 local148 = (Class1_Sub9) Static521.aClass37_103.method977(); local148 != null; local148 = (Class1_Sub9) Static521.aClass37_103.method971()) {
			@Pc(153) int local153 = local148.anInt1173;
			local165 = (Static111.aClass53_3.anIntArray154[local153] >> 14 & 0x3FFF) - Static470.anInt7897;
			local175 = (Static111.aClass53_3.anIntArray154[local153] & 0x3FFF) - Static534.anInt9007;
			local185 = local165 * 4 + 2 - local52 / 128;
			local196 = local175 * 4 + 2 - local63 / 128;
			Static4.method237(Static111.aClass53_3.anIntArray153[local153], arg0, local185, local14, arg1, arg3, arg2, local196);
		}
		for (local165 = 0; local165 < Static382.anInt6967; local165++) {
			local175 = Static7.anIntArray21[local165] * 4 + 2 - local52 / 128;
			local185 = Static306.anIntArray565[local165] * 4 + 2 - local63 / 128;
			@Pc(252) Class36 local252 = Static308.aClass96_4.method2274(Static242.anIntArray466[local165]);
			if (local252.anIntArray127 != null) {
				local252 = local252.method954(Static251.aClass119_1);
				if (local252 == null || local252.anInt963 == -1) {
					continue;
				}
			}
			Static4.method237(local252.anInt963, arg0, local175, local14, arg1, arg3, arg2, local185);
		}
		@Pc(335) int local335;
		@Pc(346) int local346;
		for (@Pc(288) Class1_Sub26 local288 = (Class1_Sub26) Static255.aClass17_20.method735(); local288 != null; local288 = (Class1_Sub26) Static255.aClass17_20.method740()) {
			local185 = (int) (local288.aLong392 >> 28 & 0x3L);
			if (local185 == Static474.anInt7955) {
				local196 = (int) (local288.aLong392 & 0x3FFFL) - Static470.anInt7897;
				@Pc(324) int local324 = (int) (local288.aLong392 >> 14 & 0x3FFFL) - Static534.anInt9007;
				local335 = local196 * 4 + 2 - local52 / 128;
				local346 = local324 * 4 + 2 - local63 / 128;
				Static530.method7335(arg3, local335, local346, local14, arg2, Static169.aClass2Array5[0], arg0);
			}
		}
		@Pc(432) int local432;
		for (local185 = 0; local185 < Static157.anInt4503; local185++) {
			@Pc(377) Class1_Sub17 local377 = (Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local185]);
			if (local377 != null) {
				@Pc(382) Class49_Sub2_Sub2_Sub2 local382 = local377.aClass49_Sub2_Sub2_Sub2_2;
				if (local382.method3803() && Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 == local382.aByte98) {
					@Pc(394) Class196 local394 = local382.aClass196_1;
					if (local394 != null && local394.anIntArray570 != null) {
						local394 = local394.method4855(Static251.aClass119_1);
					}
					if (local394 != null && local394.aBoolean411 && local394.aBoolean410) {
						local346 = local382.anInt7137 / 128 - local52 / 128;
						local432 = local382.anInt7141 / 128 - local63 / 128;
						if (local394.anInt5696 == -1) {
							Static530.method7335(arg3, local346, local432, local14, arg2, Static169.aClass2Array5[1], arg0);
						} else {
							Static4.method237(local394.anInt5696, arg0, local346, local14, arg1, arg3, arg2, local432);
						}
					}
				}
			}
		}
		local196 = Static190.anInt3385;
		@Pc(473) int[] local473 = Static502.anIntArray771;
		@Pc(520) int local520;
		@Pc(524) int local524;
		@Pc(556) int local556;
		for (local335 = 0; local335 < local196; local335++) {
			@Pc(483) Class49_Sub2_Sub2_Sub1 local483 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local473[local335]];
			if (local483 != null && local483.method1537() && Static63.aClass49_Sub2_Sub2_Sub1_1 != local483 && local483.aByte98 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98) {
				local432 = local483.anInt7137 / 128 - local52 / 128;
				local520 = local483.anInt7141 / 128 - local63 / 128;
				@Pc(522) boolean local522 = false;
				for (local524 = 0; local524 < Static234.anInt4709; local524++) {
					if (local483.aString16.equals(Static528.aStringArray43[local524]) && Static122.anIntArray240[local524] != 0) {
						local522 = true;
						break;
					}
				}
				@Pc(554) boolean local554 = false;
				for (local556 = 0; local556 < Static218.anInt7241; local556++) {
					if (local483.aString16.equals(Static419.aClass249Array1[local556].aString65)) {
						local554 = true;
						break;
					}
				}
				@Pc(580) boolean local580 = false;
				if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1752 != 0 && local483.anInt1752 != 0 && Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1752 == local483.anInt1752) {
					local580 = true;
				}
				if (local483.aBoolean111) {
					Static530.method7335(arg3, local432, local520, local14, arg2, Static169.aClass2Array5[6], arg0);
				} else if (local522) {
					Static530.method7335(arg3, local432, local520, local14, arg2, Static169.aClass2Array5[3], arg0);
				} else if (local554) {
					Static530.method7335(arg3, local432, local520, local14, arg2, Static169.aClass2Array5[5], arg0);
				} else if (local580) {
					Static530.method7335(arg3, local432, local520, local14, arg2, Static169.aClass2Array5[4], arg0);
				} else {
					Static530.method7335(arg3, local432, local520, local14, arg2, Static169.aClass2Array5[2], arg0);
				}
			}
		}
		@Pc(681) Class268[] local681 = Static384.aClass268Array1;
		@Pc(763) int local763;
		for (local432 = 0; local432 < local681.length; local432++) {
			@Pc(689) Class268 local689 = local681[local432];
			if (local689 != null && local689.anInt7597 != 0 && Static436.anInt6850 % 20 < 10) {
				@Pc(729) int local729;
				if (local689.anInt7597 == 1) {
					@Pc(714) Class1_Sub17 local714 = (Class1_Sub17) Static380.aClass17_29.method738((long) local689.anInt7595);
					if (local714 != null) {
						@Pc(719) Class49_Sub2_Sub2_Sub2 local719 = local714.aClass49_Sub2_Sub2_Sub2_2;
						local729 = local719.anInt7137 / 128 - local52 / 128;
						local556 = local719.anInt7141 / 128 - local63 / 128;
						Static448.method6405(local729, arg3, arg0, local14, local689.anInt7594, local556, 360000L, arg2);
					}
				}
				if (local689.anInt7597 == 2) {
					local763 = local689.anInt7591 / 128 - local52 / 128;
					local524 = local689.anInt7596 / 128 - local63 / 128;
					@Pc(779) long local779 = (long) (local689.anInt7590 << 7);
					@Pc(783) long local783 = local779 * local779;
					Static448.method6405(local763, arg3, arg0, local14, local689.anInt7594, local524, local783, arg2);
				}
				if (local689.anInt7597 == 10 && local689.anInt7595 >= 0 && local689.anInt7595 < Static349.aClass49_Sub2_Sub2_Sub1Array1.length) {
					@Pc(814) Class49_Sub2_Sub2_Sub1 local814 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local689.anInt7595];
					if (local814 != null) {
						local524 = local814.anInt7137 / 128 - local52 / 128;
						local729 = local814.anInt7141 / 128 - local63 / 128;
						Static448.method6405(local524, arg3, arg0, local14, local689.anInt7594, local729, 360000L, arg2);
					}
				}
			}
		}
		if (Static448.anInt7701 == 4) {
			return;
		}
		if (Static364.anInt6445 != 0) {
			local520 = Static364.anInt6445 * 4 + (Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() - 1) * 2 + 2 - local52 / 128;
			local763 = Static377.anInt6886 * 4 + (Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() + -1) * 2 + 2 - local63 / 128;
			Static530.method7335(arg3, local520, local763, local14, arg2, Static22.aClass2Array7[Static426.aBoolean535 ? 1 : 0], arg0);
		}
		arg1.method7265(-1, 3, arg2 + arg0.anInt4732 / 2 - 1, 3, arg3 + arg0.anInt4673 / 2 - 1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IC)Z")
	public static boolean method523(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Lclient!vk;")
	public static Class302 method524(@OriginalArg(1) int arg0) {
		@Pc(15) Class302[] local15 = Static109.method3481();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class302 local23 = local15[local17];
			if (local23.anInt8653 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!jc;B)V")
	public static void method526(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class49_Sub2_Sub2_Sub2 arg1) {
		if (Static16.anInt415 >= 400) {
			return;
		}
		@Pc(12) Class196 local12 = arg1.aClass196_1;
		if (local12.anIntArray570 != null) {
			local12 = local12.method4855(Static251.aClass119_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean410) {
			return;
		}
		@Pc(39) String local39 = local12.aString53;
		if (local12.anInt5704 != 0) {
			@Pc(58) String local58 = Static304.aClass101_1 == Static542.aClass101_4 ? Static243.aClass306_57.method7165(Static179.anInt3168) : Static374.aClass306_90.method7165(Static179.anInt3168);
			local39 = local39 + Static458.method6482(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754, local12.anInt5704) + " (" + local58 + local12.anInt5704 + ")";
		}
		if (Static431.aBoolean542 && !arg0) {
			@Pc(97) Class71 local97 = Static146.anInt2743 == -1 ? null : Static452.aClass317_2.method7539(Static146.anInt2743);
			if ((Static276.anInt9030 & 0x2) != 0 && (local97 == null || local12.method4865(Static146.anInt2743, local97.anInt1963) != local97.anInt1963)) {
				Static13.method390((long) arg1.anInt4295, 0, Static170.aString32 + " -> <col=ffff00>" + local39, 0, 8, Static238.aString58, -1, true, false, Static222.anInt4414);
			}
		}
		if (!arg0) {
			@Pc(149) String[] local149 = local12.aStringArray30;
			if (Static289.aBoolean402) {
				local149 = Static126.method2138(local149);
			}
			@Pc(161) int local161;
			if (local149 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local149[local161] != null && (local12.aByte70 == 0 || !local149[local161].equalsIgnoreCase(Static230.aClass306_17.method7165(Static179.anInt3168)))) {
						@Pc(184) byte local184 = 0;
						if (local161 == 0) {
							local184 = 20;
						}
						@Pc(190) int local190 = Class145_Sub2.lb;
						if (local161 == 1) {
							local184 = 9;
						}
						if (local161 == 2) {
							local184 = 16;
						}
						if (local161 == 3) {
							local184 = 21;
						}
						if (local161 == local12.anInt5693) {
							local190 = local12.anInt5703;
						}
						if (local161 == 4) {
							local184 = 6;
						}
						if (local12.anInt5700 == local161) {
							local190 = local12.anInt5711;
						}
						Static13.method390((long) arg1.anInt4295, 0, "<col=ffff00>" + local39, 0, local184, local149[local161], -1, true, false, local149[local161].equalsIgnoreCase(Static230.aClass306_17.method7165(Static179.anInt3168)) ? local12.anInt5719 : local190);
					}
				}
			}
			if (local12.aByte70 == 1 && local149 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local149[local161] != null && local149[local161].equalsIgnoreCase(Static230.aClass306_17.method7165(Static179.anInt3168))) {
						@Pc(297) short local297 = 0;
						if (local12.anInt5704 > Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754) {
							local297 = 2000;
						}
						@Pc(306) short local306 = 0;
						if (local161 == 0) {
							local306 = 20;
						}
						if (local161 == 1) {
							local306 = 9;
						}
						if (local161 == 2) {
							local306 = 16;
						}
						if (local161 == 3) {
							local306 = 21;
						}
						if (local161 == 4) {
							local306 = 6;
						}
						if (local306 != 0) {
							local306 += local297;
						}
						Static13.method390((long) arg1.anInt4295, 0, "<col=ffff00>" + local39, 0, local306, local149[local161], -1, true, false, local12.anInt5719);
					}
				}
			}
		}
		Static13.method390((long) arg1.anInt4295, 0, "<col=ffff00>" + local39, 0, 1006, Static395.aClass306_98.method7165(Static179.anInt3168), -1, true, arg0, Static221.anInt4390);
	}
}
