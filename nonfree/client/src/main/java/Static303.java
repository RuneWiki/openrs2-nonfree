import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public static int anInt5290 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
	public static boolean method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
	public static void method4735(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0 && arg3 == Static613.anInt10268 && arg2 == Static233.anInt4295 && (Static173.anInt3110 == Static636.anInt10567 || Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 1)) {
			return;
		}
		Static233.anInt4295 = arg2;
		Static613.anInt10268 = arg3;
		Static173.anInt3110 = Static636.anInt10567;
		if (Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 1) {
			Static173.anInt3110 = 0;
		}
		Static358.method5312(arg1);
		Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796), Static213.aClass133_5, Static281.aClass55_8, true);
		@Pc(68) int local68 = Static565.anInt9560;
		@Pc(70) int local70 = Static567.anInt9589;
		Static565.anInt9560 = (Static613.anInt10268 - (Static326.anInt5541 >> 4)) * 8;
		Static567.anInt9589 = (Static233.anInt4295 - (Static448.anInt7637 >> 4)) * 8;
		Static519.aClass5_Sub5_Sub16_3 = Static620.method7118(Static613.anInt10268 * 8, Static233.anInt4295 * 8);
		Static646.aClass378_6 = null;
		@Pc(103) int local103 = Static565.anInt9560 - local68;
		@Pc(107) int local107 = Static567.anInt9589 - local70;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(182) int local182;
		@Pc(291) int local291;
		if (arg1 == 11) {
			for (local291 = 0; local291 < Static235.anInt4322; local291++) {
				@Pc(297) Class5_Sub3 local297 = Static467.aClass5_Sub3Array1[local291];
				if (local297 != null) {
					@Pc(302) Class4_Sub2_Sub1_Sub1_Sub2 local302 = local297.aClass4_Sub2_Sub1_Sub1_Sub2_1;
					for (local130 = 0; local130 < 10; local130++) {
						local302.anIntArray94[local130] -= local103;
						local302.anIntArray95[local130] -= local107;
					}
					local302.anInt10231 -= local103 * 512;
					local302.anInt10229 -= local107 * 512;
				}
			}
		} else {
			@Pc(114) boolean local114 = false;
			Static280.anInt4989 = 0;
			@Pc(122) int local122 = Static326.anInt5541 * 512 - 512;
			local128 = Static448.anInt7637 * 512 - 512;
			for (local130 = 0; local130 < Static235.anInt4322; local130++) {
				@Pc(136) Class5_Sub3 local136 = Static467.aClass5_Sub3Array1[local130];
				if (local136 != null) {
					@Pc(141) Class4_Sub2_Sub1_Sub1_Sub2 local141 = local136.aClass4_Sub2_Sub1_Sub1_Sub2_1;
					local141.anInt10231 -= local103 * 512;
					local141.anInt10229 -= local107 * 512;
					if (local141.anInt10231 >= 0 && local122 >= local141.anInt10231 && local141.anInt10229 >= 0 && local128 >= local141.anInt10229) {
						@Pc(180) boolean local180 = true;
						for (local182 = 0; local182 < 10; local182++) {
							local141.anIntArray94[local182] -= local103;
							local141.anIntArray95[local182] -= local107;
							if (local141.anIntArray94[local182] < 0 || local141.anIntArray94[local182] >= Static326.anInt5541 || local141.anIntArray95[local182] < 0 || local141.anIntArray95[local182] >= Static448.anInt7637) {
								local180 = false;
							}
						}
						if (local180) {
							Static209.anIntArray198[Static280.anInt4989++] = local141.anInt1225;
						} else {
							local141.method1045(null);
							local136.method9047();
							local114 = true;
						}
					} else {
						local141.method1045(null);
						local114 = true;
						local136.method9047();
					}
				}
			}
			if (local114) {
				Static235.anInt4322 = Static445.aClass273_29.method6580();
				Static445.aClass273_29.method6584(Static467.aClass5_Sub3Array1);
			}
		}
		for (local291 = 0; local291 < 2048; local291++) {
			@Pc(354) Class4_Sub2_Sub1_Sub1_Sub1 local354 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local291];
			if (local354 != null) {
				for (local128 = 0; local128 < 10; local128++) {
					local354.anIntArray94[local128] -= local103;
					local354.anIntArray95[local128] -= local107;
				}
				local354.anInt10229 -= local107 * 512;
				local354.anInt10231 -= local103 * 512;
			}
		}
		@Pc(406) Class154[] local406 = Static82.aClass154Array1;
		for (local128 = 0; local128 < local406.length; local128++) {
			@Pc(414) Class154 local414 = local406[local128];
			if (local414 != null) {
				local414.anInt4135 -= local107 * 512;
				local414.anInt4139 -= local103 * 512;
			}
		}
		for (@Pc(442) Class5_Sub44 local442 = (Class5_Sub44) Static174.aClass330_14.method7908(); local442 != null; local442 = (Class5_Sub44) Static174.aClass330_14.method7914()) {
			local442.anInt8645 -= local103;
			local442.anInt8639 -= local107;
			if (Static412.anInt7175 != 4 && (local442.anInt8645 < 0 || local442.anInt8639 < 0 || Static326.anInt5541 <= local442.anInt8645 || local442.anInt8639 >= Static448.anInt7637)) {
				local442.method9047();
			}
		}
		if (Static412.anInt7175 != 4) {
			for (@Pc(498) Class5_Sub18 local498 = (Class5_Sub18) Static440.aClass273_28.method6577(); local498 != null; local498 = (Class5_Sub18) Static440.aClass273_28.method6589()) {
				@Pc(506) int local506 = (int) (local498.aLong278 & 0x3FFFL);
				@Pc(511) int local511 = local506 - Static565.anInt9560;
				local182 = (int) (local498.aLong278 >> 14 & 0x3FFFL);
				@Pc(523) int local523 = local182 - Static567.anInt9589;
				if (local511 < 0 || local523 < 0 || local511 >= Static326.anInt5541 || local523 >= Static448.anInt7637) {
					local498.method9047();
				}
			}
		}
		if (Static511.anInt8845 != 0) {
			Static16.anInt249 -= local107;
			Static511.anInt8845 -= local103;
		}
		Static105.method1666();
		if (arg1 != 11) {
			Static19.anInt277 -= local103 * 512;
			Static447.anInt7620 -= local103;
			Static378.anInt6261 -= local107;
			Static578.anInt4590 -= local103;
			Static43.anInt935 -= local107;
			Static117.anInt2170 -= local107 * 512;
			if (Math.abs(local103) > Static326.anInt5541 || Math.abs(local107) > Static448.anInt7637) {
				Static507.method7588();
			}
		} else if (Static254.anInt4612 == 4) {
			Static536.anInt9158 -= local103 * 512;
			Static57.anInt1135 -= local107 * 512;
			Static325.anInt5511 -= local107 * 512;
			Static343.anInt5775 -= local103 * 512;
		} else {
			Static254.anInt4612 = 1;
			Static396.anInt6606 = -1;
			Static304.anInt5319 = -1;
		}
		Static390.method5794();
		Static347.method5204();
		Static14.aClass330_4.method7910();
		Static202.aClass330_21.method7910();
		Static452.aClass99_9.method2042();
		Static634.method8964();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII[II)Z")
	public static boolean method4736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 > Static140.anInt2441) {
			arg1 = Static140.anInt2441;
		}
		if (arg0 >= arg1) {
			return true;
		}
		arg2 += arg0 - 1;
		@Pc(44) int local44 = arg1 - arg0 >> 2;
		arg3 += arg5 * arg0;
		@Pc(61) int local61;
		@Pc(73) int local73;
		if (Static169.anInt2875 == 1) {
			Static192.anInt3358 += local44;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg1 - arg0 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg2++;
						if (arg4[arg2] > arg3) {
							arg4[arg2] = arg3;
						}
						arg3 += arg5;
					}
				}
				local61 = arg2 + 1;
				if (arg4[local61] > arg3) {
					arg4[local61] = arg3;
				}
				local73 = arg3 + arg5;
				local61++;
				if (local73 < arg4[local61]) {
					arg4[local61] = local73;
				}
				local73 += arg5;
				local61++;
				if (arg4[local61] > local73) {
					arg4[local61] = local73;
				}
				local73 += arg5;
				arg2 = local61 + 1;
				if (local73 < arg4[arg2]) {
					arg4[arg2] = local73;
				}
				arg3 = local73 + arg5;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg1 - arg0 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg2++;
						if (arg4[arg2] > arg3) {
							return false;
						}
						arg3 += arg5;
					}
				}
				local61 = arg2 + 1;
				if (arg4[local61] > arg3) {
					return false;
				}
				local73 = arg3 + arg5;
				local61++;
				if (arg4[local61] > local73) {
					return false;
				}
				local73 += arg5;
				local61++;
				if (arg4[local61] > local73) {
					return false;
				}
				local73 += arg5;
				@Pc(209) int local209 = ~local73;
				arg2 = local61 + 1;
				if (local209 > ~arg4[arg2]) {
					return false;
				}
				arg3 = local73 + arg5;
			}
		}
	}
}
