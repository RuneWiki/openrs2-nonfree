import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "Lclient!raa;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_72 = new Class286(8, 3);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method6212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		@Pc(21) int local21 = arg0 - arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(86) int local86 = local29 - (local57 - 1) * local45;
		@Pc(95) int local95 = (1 - local61) * local33 + local49;
		@Pc(104) int local104 = local37 - (local61 - 1) * local53;
		@Pc(108) int local108 = local25 << 2;
		@Pc(112) int local112 = local29 << 2;
		@Pc(116) int local116 = local33 << 2;
		@Pc(120) int local120 = local37 << 2;
		@Pc(124) int local124 = local41 * 3;
		@Pc(130) int local130 = local45 * (local57 - 3);
		@Pc(134) int local134 = local49 * 3;
		@Pc(140) int local140 = (local61 - 3) * local53;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg0 - 1);
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = (local21 - 1) * local116;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		@Pc(209) int local209;
		if (arg1 >= Static280.anInt5114 && arg1 <= Static356.anInt6028) {
			@Pc(176) int[] local176 = Static384.anIntArrayArray38[arg1];
			local184 = Static27.method393(arg5 - arg2, Static85.anInt1313, Static316.anInt6313);
			local193 = Static27.method393(arg5 + arg2, Static85.anInt1313, Static316.anInt6313);
			local201 = Static27.method393(arg5 - local16, Static85.anInt1313, Static316.anInt6313);
			local209 = Static27.method393(local16 + arg5, Static85.anInt1313, Static316.anInt6313);
			Static482.method7040(arg6, local184, local176, local201);
			Static482.method7040(arg3, local201, local176, local209);
			Static482.method7040(arg6, local209, local176, local193);
		}
		while (local9 > 0) {
			@Pc(238) boolean local238 = local21 >= local9;
			if (local238) {
				if (local95 < 0) {
					while (local95 < 0) {
						local95 += local134;
						local104 += local150;
						local11++;
						local150 += local120;
						local134 += local120;
					}
				}
				if (local104 < 0) {
					local95 += local134;
					local104 += local150;
					local150 += local120;
					local11++;
					local134 += local120;
				}
				local104 += -local140;
				local95 += -local156;
				local140 -= local116;
				local156 -= local116;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local124;
					local86 += local142;
					local7++;
					local142 += local112;
					local124 += local112;
				}
			}
			if (local86 < 0) {
				local70 += local124;
				local86 += local142;
				local124 += local112;
				local142 += local112;
				local7++;
			}
			local86 += -local130;
			local70 += -local148;
			local148 -= local108;
			local130 -= local108;
			local9--;
			local184 = arg1 - local9;
			local193 = local9 + arg1;
			if (Static280.anInt5114 <= local193 && Static356.anInt6028 >= local184) {
				local201 = Static27.method393(arg5 + local7, Static85.anInt1313, Static316.anInt6313);
				local209 = Static27.method393(arg5 - local7, Static85.anInt1313, Static316.anInt6313);
				if (local238) {
					@Pc(433) int local433 = Static27.method393(local11 + arg5, Static85.anInt1313, Static316.anInt6313);
					@Pc(442) int local442 = Static27.method393(arg5 - local11, Static85.anInt1313, Static316.anInt6313);
					@Pc(449) int[] local449;
					if (Static280.anInt5114 <= local184) {
						local449 = Static384.anIntArrayArray38[local184];
						Static482.method7040(arg6, local209, local449, local442);
						Static482.method7040(arg3, local442, local449, local433);
						Static482.method7040(arg6, local433, local449, local201);
					}
					if (local193 <= Static356.anInt6028) {
						local449 = Static384.anIntArrayArray38[local193];
						Static482.method7040(arg6, local209, local449, local442);
						Static482.method7040(arg3, local442, local449, local433);
						Static482.method7040(arg6, local433, local449, local201);
					}
				} else {
					if (Static280.anInt5114 <= local184) {
						Static482.method7040(arg6, local209, Static384.anIntArrayArray38[local184], local201);
					}
					if (local193 <= Static356.anInt6028) {
						Static482.method7040(arg6, local209, Static384.anIntArrayArray38[local193], local201);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;IILclient!av;I)V")
	public static void method6214(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class331 local10 = arg2.method473(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(17) Class1 local17 = local10.aClass1_1;
		arg0.KA(arg3, arg1, arg2.anInt509 + arg3, arg1 + arg2.anInt569);
		if (Static412.anInt7313 == 2 || Static412.anInt7313 == 5 || Static538.aClass9_20 == null) {
			arg0.A(-16777216, local17, arg3, arg1);
			return;
		}
		@Pc(64) int local64;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Static175.anInt10579 == 4) {
			local62 = Static46.anInt795;
			local64 = Static599.anInt9774;
			local66 = 4096;
			local72 = (int) -Static658.aFloat196 & 0x3FFF;
		} else {
			local72 = (int) -Static658.aFloat196 + Static543.anInt9108 & 0x3FFF;
			local62 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
			local66 = 4096 - Static61.anInt953 * 16;
			local64 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
		}
		@Pc(106) int local106 = local64 / 128 + 48 + 208 - Static362.anInt8653 * 2;
		@Pc(124) int local124 = Static206.anInt11291 * 4 + 208 + 48 - Static206.anInt11291 * 2 - local62 / 128;
		Static538.aClass9_20.method8622((float) arg3 + (float) arg2.anInt509 / 2.0F, (float) arg1 + (float) arg2.anInt569 / 2.0F, (float) local106, (float) local124, local66, local72 << 2, local17, arg3, arg1);
		@Pc(177) int local177;
		@Pc(187) int local187;
		@Pc(197) int local197;
		@Pc(207) int local207;
		for (@Pc(158) Class3_Sub42 local158 = (Class3_Sub42) Static229.aClass357_21.method8391(); local158 != null; local158 = (Class3_Sub42) Static229.aClass357_21.method8392()) {
			@Pc(165) int local165 = local158.anInt8429;
			local177 = (Static254.aClass108_1.anIntArray156[local165] >> 14 & 0x3FFF) - Static714.anInt11156;
			local187 = (Static254.aClass108_1.anIntArray156[local165] & 0x3FFF) - Static339.anInt5859;
			local197 = local177 * 4 + 2 - local64 / 128;
			local207 = local187 * 4 + 2 - local62 / 128;
			Static29.method399(arg1, local17, Static254.aClass108_1.anIntArray155[local165], local207, arg2, arg0, local197, arg3);
		}
		for (local177 = 0; local177 < Static339.anInt5860; local177++) {
			local187 = Static104.anIntArray96[local177] * 4 + 2 - local64 / 128;
			local197 = Static70.anIntArray80[local177] * 4 + 2 - local62 / 128;
			@Pc(268) Class144 local268 = Static70.aClass323_1.method7792(Static340.anIntArray334[local177]);
			if (local268.anIntArray239 != null) {
				local268 = local268.method3629(Static577.aClass362_1);
				if (local268 == null || local268.anInt4393 == -1) {
					continue;
				}
			}
			Static29.method399(arg1, local17, local268.anInt4393, local197, arg2, arg0, local187, arg3);
		}
		@Pc(358) int local358;
		@Pc(369) int local369;
		for (@Pc(315) Class3_Sub20 local315 = (Class3_Sub20) Static46.aClass136_5.method3509(); local315 != null; local315 = (Class3_Sub20) Static46.aClass136_5.method3506()) {
			local197 = (int) (local315.aLong382 >> 28 & 0x3L);
			if (local197 == Static106.anInt1679) {
				local207 = (int) (local315.aLong382 & 0x3FFFL) - Static714.anInt11156;
				@Pc(348) int local348 = (int) (local315.aLong382 >> 14 & 0x3FFFL) - Static339.anInt5859;
				local358 = local207 * 4 + 2 - local64 / 128;
				local369 = local348 * 4 + 2 - local62 / 128;
				Static38.method564(local358, arg2, arg3, local17, Static314.aClass9Array22[0], arg1, local369);
			}
		}
		@Pc(465) int local465;
		for (local197 = 0; local197 < Static337.anInt5854; local197++) {
			@Pc(402) Class3_Sub13 local402 = (Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local197]);
			if (local402 != null) {
				@Pc(407) Class19_Sub1_Sub3_Sub2_Sub1 local407 = local402.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				if (local407.method3437() && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 == local407.aByte146) {
					@Pc(421) Class18 local421 = local407.aClass18_1;
					if (local421 != null && local421.anIntArray23 != null) {
						local421 = local421.method407(Static577.aClass362_1);
					}
					if (local421 != null && local421.aBoolean22 && local421.aBoolean17) {
						local369 = local407.anInt11204 / 128 - local64 / 128;
						local465 = local407.anInt11211 / 128 - local62 / 128;
						if (local421.anInt451 == -1) {
							Static38.method564(local369, arg2, arg3, local17, Static314.aClass9Array22[1], arg1, local465);
						} else {
							Static29.method399(arg1, local17, local421.anInt451, local465, arg2, arg0, local369, arg3);
						}
					}
				}
			}
		}
		local207 = Static558.anInt9284;
		@Pc(509) int[] local509 = Static408.anIntArray393;
		@Pc(568) int local568;
		@Pc(572) int local572;
		@Pc(605) int local605;
		for (local358 = 0; local358 < local207; local358++) {
			@Pc(519) Class19_Sub1_Sub3_Sub2_Sub2 local519 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local509[local358]];
			if (local519 != null && local519.method6612() && !local519.aBoolean602 && local519 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 && local519.aByte146 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
				local465 = local519.anInt11204 / 128 - local64 / 128;
				local568 = local519.anInt11211 / 128 - local62 / 128;
				@Pc(570) boolean local570 = false;
				for (local572 = 0; local572 < Static22.anInt373; local572++) {
					if (local519.aString109.equals(Static432.aStringArray29[local572]) && Static161.anIntArray145[local572] != 0) {
						local570 = true;
						break;
					}
				}
				@Pc(603) boolean local603 = false;
				for (local605 = 0; local605 < Static621.anInt10020; local605++) {
					if (local519.aString109.equals(Static303.aClass101Array1[local605].aString55)) {
						local603 = true;
						break;
					}
				}
				@Pc(635) boolean local635 = false;
				if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7836 != 0 && local519.anInt7836 != 0 && local519.anInt7836 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7836) {
					local635 = true;
				}
				if (local519.aBoolean600) {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[6], arg1, local568);
				} else if (local635) {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[4], arg1, local568);
				} else if (local519.aBoolean599) {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[7], arg1, local568);
				} else if (local570) {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[3], arg1, local568);
				} else if (local603) {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[5], arg1, local568);
				} else {
					Static38.method564(local465, arg2, arg3, local17, Static314.aClass9Array22[2], arg1, local568);
				}
			}
		}
		@Pc(776) Class387[] local776 = Static672.aClass387Array1;
		@Pc(865) int local865;
		for (local465 = 0; local465 < local776.length; local465++) {
			@Pc(784) Class387 local784 = local776[local465];
			if (local784 != null && local784.anInt10809 != 0 && Static269.anInt4883 % 20 < 10) {
				@Pc(831) int local831;
				if (local784.anInt10809 == 1) {
					@Pc(816) Class3_Sub13 local816 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local784.anInt10811);
					if (local816 != null) {
						@Pc(821) Class19_Sub1_Sub3_Sub2_Sub1 local821 = local816.aClass19_Sub1_Sub3_Sub2_Sub1_2;
						local831 = local821.anInt11204 / 128 - local64 / 128;
						local605 = local821.anInt11211 / 128 - local62 / 128;
						Static163.method2625(arg1, local784.anInt10810, local605, arg2, 360000L, local831, arg3, local17);
					}
				}
				if (local784.anInt10809 == 2) {
					local865 = local784.anInt10805 / 128 - local64 / 128;
					local572 = local784.anInt10808 / 128 - local62 / 128;
					@Pc(881) long local881 = (long) (local784.anInt10807 << 7);
					@Pc(885) long local885 = local881 * local881;
					Static163.method2625(arg1, local784.anInt10810, local572, arg2, local885, local865, arg3, local17);
				}
				if (local784.anInt10809 == 10 && local784.anInt10811 >= 0 && local784.anInt10811 < Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1.length) {
					@Pc(921) Class19_Sub1_Sub3_Sub2_Sub2 local921 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local784.anInt10811];
					if (local921 != null) {
						local572 = local921.anInt11204 / 128 - local64 / 128;
						local831 = local921.anInt11211 / 128 - local62 / 128;
						Static163.method2625(arg1, local784.anInt10810, local831, arg2, 360000L, local572, arg3, local17);
					}
				}
			}
		}
		if (Static175.anInt10579 == 4) {
			return;
		}
		if (Static482.anInt8391 != 0) {
			local568 = Static482.anInt8391 * 4 + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() - 1) * 2 + 2 - local64 / 128;
			local865 = Static493.anInt8491 * 4 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() * 2 + 2 - local62 / 128 - 2;
			Static38.method564(local568, arg2, arg3, local17, Static361.aClass9Array23[Static352.aBoolean479 ? 1 : 0], arg1, local865);
		}
		if (!Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aBoolean602) {
			arg0.method7696(arg3 + arg2.anInt509 / 2 - 1, 3, 3, arg2.anInt569 / 2 + arg1 - 1, -1);
		}
	}
}
