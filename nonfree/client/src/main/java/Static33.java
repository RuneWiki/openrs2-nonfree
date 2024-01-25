import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_9 = new Class305(35, 4);

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
	public static int anInt545 = -1;

	@OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!ha;ILclient!uaa;B)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class345 arg3) {
		@Pc(15) Class1 local15 = arg3.method8063(arg1);
		if (local15 == null) {
			return;
		}
		arg1.KA(arg2, arg0, arg2 + arg3.anInt9649, arg3.anInt9606 + arg0);
		if (Static595.anInt9783 == 2 || Static595.anInt9783 == 5 || Static359.aClass50_26 == null) {
			arg1.A(-16777216, local15, arg2, arg0);
			return;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(65) int local65;
		@Pc(57) int local57;
		if (Static660.anInt10605 == 4) {
			local57 = 4096;
			local59 = Static251.anInt4573;
			local65 = (int) -Static157.aFloat83 & 0x3FFF;
			local67 = Static599.anInt9833;
		} else {
			local67 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
			local57 = 4096 - Static569.anInt9215 * 16;
			local59 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
			local65 = (int) -Static157.aFloat83 + Static213.anInt9568 & 0x3FFF;
		}
		@Pc(105) int local105 = local59 / 128 + 48 - (Static201.anInt3834 - 104) * 2;
		@Pc(123) int local123 = Static626.anInt10238 * 4 + 48 + 208 - local67 / 128 - Static626.anInt10238 * 2;
		Static359.aClass50_26.method6009((float) arg3.anInt9649 / 2.0F + (float) arg2, (float) arg3.anInt9606 / 2.0F + (float) arg0, (float) local105, (float) local123, local57, local65 << 2, local15, arg2, arg0);
		@Pc(174) int local174;
		@Pc(184) int local184;
		@Pc(195) int local195;
		@Pc(206) int local206;
		for (@Pc(157) Class5_Sub47 local157 = (Class5_Sub47) Static285.aClass114_38.method2805(); local157 != null; local157 = (Class5_Sub47) Static285.aClass114_38.method2814()) {
			@Pc(162) int local162 = local157.anInt8308;
			local174 = (Static404.aClass116_3.anIntArray154[local162] >> 14 & 0x3FFF) - Static153.anInt3147;
			local184 = (Static404.aClass116_3.anIntArray154[local162] & 0x3FFF) - Static201.anInt3839;
			local195 = local174 * 4 + 2 - local59 / 128;
			local206 = local184 * 4 + 2 - local67 / 128;
			Static532.method7468(arg3, local15, local195, local206, arg0, arg1, Static404.aClass116_3.anIntArray153[local162], arg2);
		}
		for (local174 = 0; local174 < Static345.anInt6329; local174++) {
			local184 = Static265.anIntArray262[local174] * 4 + 2 - local59 / 128;
			local195 = Static297.anIntArray321[local174] * 4 + 2 - local67 / 128;
			@Pc(263) Class164 local263 = Static568.aClass315_5.method7511(Static278.anIntArray296[local174]);
			if (local263.anIntArray247 != null) {
				local263 = local263.method3908(Static161.aClass237_3);
				if (local263 == null || local263.anInt4620 == -1) {
					continue;
				}
			}
			Static532.method7468(arg3, local15, local184, local195, arg0, arg1, local263.anInt4620, arg2);
		}
		@Pc(350) int local350;
		@Pc(361) int local361;
		for (@Pc(303) Class5_Sub31 local303 = (Class5_Sub31) Static548.aClass300_41.method7182(); local303 != null; local303 = (Class5_Sub31) Static548.aClass300_41.method7192()) {
			local195 = (int) (local303.aLong307 >> 28 & 0x3L);
			if (local195 == Static290.anInt5662) {
				local206 = (int) (local303.aLong307 & 0x3FFFL) - Static153.anInt3147;
				@Pc(339) int local339 = (int) (local303.aLong307 >> 14 & 0x3FFFL) - Static201.anInt3839;
				local350 = local206 * 4 + 2 - local59 / 128;
				local361 = local339 * 4 + 2 - local67 / 128;
				Static78.method1014(local15, arg3, Static16.aClass50Array1[0], arg2, local350, local361, arg0);
			}
		}
		@Pc(451) int local451;
		for (local195 = 0; local195 < Static36.anInt607; local195++) {
			@Pc(392) Class5_Sub25 local392 = (Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local195]);
			if (local392 != null) {
				@Pc(397) Class28_Sub1_Sub4_Sub2_Sub1 local397 = local392.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				if (local397.method3066() && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local397.aByte145) {
					@Pc(413) Class134 local413 = local397.aClass134_1;
					if (local413 != null && local413.anIntArray191 != null) {
						local413 = local413.method3276(Static161.aClass237_3);
					}
					if (local413 != null && local413.aBoolean303 && local413.aBoolean302) {
						local361 = local397.anInt10781 / 128 - local59 / 128;
						local451 = local397.anInt10784 / 128 - local67 / 128;
						if (local413.anInt3840 == -1) {
							Static78.method1014(local15, arg3, Static16.aClass50Array1[1], arg2, local361, local451, arg0);
						} else {
							Static532.method7468(arg3, local15, local361, local451, arg0, arg1, local413.anInt3840, arg2);
						}
					}
				}
			}
		}
		local206 = Static105.anInt2258;
		@Pc(492) int[] local492 = Static321.anIntArray339;
		@Pc(538) int local538;
		@Pc(542) int local542;
		@Pc(571) int local571;
		for (local350 = 0; local350 < local206; local350++) {
			@Pc(502) Class28_Sub1_Sub4_Sub2_Sub2 local502 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local492[local350]];
			if (local502 != null && local502.method4608() && !local502.aBoolean478 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 != local502 && local502.aByte145 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145) {
				local451 = local502.anInt10781 / 128 - local59 / 128;
				local538 = local502.anInt10784 / 128 - local67 / 128;
				@Pc(540) boolean local540 = false;
				for (local542 = 0; local542 < Static253.anInt4604; local542++) {
					if (local502.aString45.equals(Static326.aStringArray31[local542]) && Static592.anIntArray538[local542] != 0) {
						local540 = true;
						break;
					}
				}
				@Pc(569) boolean local569 = false;
				for (local571 = 0; local571 < Static552.anInt9015; local571++) {
					if (local502.aString45.equals(Static243.aClass375Array1[local571].aString113)) {
						local569 = true;
						break;
					}
				}
				@Pc(591) boolean local591 = false;
				if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5535 != 0 && local502.anInt5535 != 0 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5535 == local502.anInt5535) {
					local591 = true;
				}
				if (local502.aBoolean475) {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[6], arg2, local451, local538, arg0);
				} else if (local591) {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[4], arg2, local451, local538, arg0);
				} else if (local502.aBoolean476) {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[7], arg2, local451, local538, arg0);
				} else if (local540) {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[3], arg2, local451, local538, arg0);
				} else if (local569) {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[5], arg2, local451, local538, arg0);
				} else {
					Static78.method1014(local15, arg3, Static16.aClass50Array1[2], arg2, local451, local538, arg0);
				}
			}
		}
		@Pc(705) Class371[] local705 = Static564.aClass371Array6;
		@Pc(787) int local787;
		for (local451 = 0; local451 < local705.length; local451++) {
			@Pc(713) Class371 local713 = local705[local451];
			if (local713 != null && local713.anInt10324 != 0 && Static26.anInt350 % 20 < 10) {
				@Pc(752) int local752;
				if (local713.anInt10324 == 1) {
					@Pc(737) Class5_Sub25 local737 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local713.anInt10325);
					if (local737 != null) {
						@Pc(742) Class28_Sub1_Sub4_Sub2_Sub1 local742 = local737.aClass28_Sub1_Sub4_Sub2_Sub1_1;
						local752 = local742.anInt10781 / 128 - local59 / 128;
						local571 = local742.anInt10784 / 128 - local67 / 128;
						Static351.method4748(local752, local571, arg3, arg0, local15, arg2, 360000L, local713.anInt10318);
					}
				}
				if (local713.anInt10324 == 2) {
					local787 = local713.anInt10316 / 128 - local59 / 128;
					local542 = local713.anInt10323 / 128 - local67 / 128;
					@Pc(803) long local803 = (long) (local713.anInt10317 << 7);
					@Pc(807) long local807 = local803 * local803;
					Static351.method4748(local787, local542, arg3, arg0, local15, arg2, local807, local713.anInt10318);
				}
				if (local713.anInt10324 == 10 && local713.anInt10325 >= 0 && local713.anInt10325 < Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2.length) {
					@Pc(841) Class28_Sub1_Sub4_Sub2_Sub2 local841 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local713.anInt10325];
					if (local841 != null) {
						local542 = local841.anInt10781 / 128 - local59 / 128;
						local752 = local841.anInt10784 / 128 - local67 / 128;
						Static351.method4748(local542, local752, arg3, arg0, local15, arg2, 360000L, local713.anInt10318);
					}
				}
			}
		}
		if (Static660.anInt10605 == 4) {
			return;
		}
		if (Static680.anInt10897 != 0) {
			local538 = Static680.anInt10897 * 4 + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() - 1) * 2 + 2 - local59 / 128;
			local787 = Static54.anInt802 * 4 + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() - 1) * 2 + 2 - local67 / 128;
			Static78.method1014(local15, arg3, Static61.aClass50Array2[Static209.aBoolean723 ? 1 : 0], arg2, local538, local787, arg0);
		}
		if (!Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aBoolean478) {
			arg1.method6900(arg2 + arg3.anInt9649 / 2 - 1, arg3.anInt9606 / 2 + (arg0 - 1), 3, -1, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static81.method1222(local7.aClass28_Sub1_Sub5_2);
		Static81.method1222(local7.aClass28_Sub1_Sub5_1);
		if (local7.aClass28_Sub1_Sub5_2 != null) {
			local7.aClass28_Sub1_Sub5_2 = null;
		}
		if (local7.aClass28_Sub1_Sub5_1 != null) {
			local7.aClass28_Sub1_Sub5_1 = null;
		}
	}
}
