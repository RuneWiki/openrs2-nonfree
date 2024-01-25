import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!qda;")
	public static Class59 aClass59_38;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "[Lclient!re;")
	public static Class301[] aClass301Array3;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "S")
	public static short aShort113 = 320;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
	public static void method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static244.anInt3950;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static85.anInt1443 = arg3;
			Static677.anInt10679 = arg1;
			Static160.anInt2709 = arg0;
			Static244.anInt3950 = 2;
			Static623.anInt10008 = arg2;
		} else if (local5 == 2) {
			if (Static677.anInt10679 > arg1) {
				Static677.anInt10679 = arg1;
			}
			if (arg2 > Static623.anInt10008) {
				Static623.anInt10008 = arg2;
			}
			if (arg3 > Static85.anInt1443) {
				Static85.anInt1443 = arg3;
			}
			if (Static160.anInt2709 > arg0) {
				Static160.anInt2709 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ha;ILclient!wq;I)V")
	public static void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class394 arg3) {
		@Pc(15) Class1 local15 = arg3.method8731(arg1);
		if (local15 == null) {
			return;
		}
		arg1.KA(arg2, arg0, arg2 + arg3.anInt10536, arg0 - -arg3.anInt10532);
		if (Static514.anInt8684 == 2 || Static514.anInt8684 == 5 || aClass59_38 == null) {
			arg1.A(-16777216, local15, arg2, arg0);
			return;
		}
		@Pc(57) int local57;
		@Pc(55) int local55;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (Static133.anInt2254 == 4) {
			local51 = (int) -Static495.aFloat161 & 0x3FFF;
			local53 = 4096;
			local55 = Static170.anInt2808;
			local57 = Static476.anInt8263;
		} else {
			local53 = 4096 - Static342.anInt6178 * 16;
			local55 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
			local57 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
			local51 = (int) -Static495.aFloat161 + Static538.anInt8846 & 0x3FFF;
		}
		@Pc(91) int local91 = local57 / 128 + 48 - (Static124.anInt2150 - 104) * 2;
		@Pc(108) int local108 = Static64.anInt1015 * 4 + 208 + 48 - Static64.anInt1015 * 2 - local55 / 128;
		aClass59_38.method8073((float) arg2 + (float) arg3.anInt10536 / 2.0F, (float) arg3.anInt10532 / 2.0F + (float) arg0, (float) local91, (float) local108, local53, local51 << 2, local15, arg2, arg0);
		@Pc(158) int local158;
		@Pc(168) int local168;
		@Pc(179) int local179;
		@Pc(189) int local189;
		for (@Pc(142) Class5_Sub43 local142 = (Class5_Sub43) Static635.aClass124_103.method2572(); local142 != null; local142 = (Class5_Sub43) Static635.aClass124_103.method2569()) {
			@Pc(146) int local146 = local142.anInt7821;
			local158 = (Static652.aClass79_3.anIntArray94[local146] >> 14 & 0x3FFF) - Static454.anInt7910;
			local168 = (Static652.aClass79_3.anIntArray94[local146] & 0x3FFF) - Static48.anInt750;
			local179 = local158 * 4 + 2 - local57 / 128;
			local189 = local168 * 4 + 2 - local55 / 128;
			Static287.method3966(local189, arg2, arg3, arg0, arg1, local15, local179, Static652.aClass79_3.anIntArray95[local146]);
		}
		for (local158 = 0; local158 < Static518.anInt9184; local158++) {
			local168 = Static552.anIntArray594[local158] * 4 + 2 - local57 / 128;
			local179 = Static153.anIntArray129[local158] * 4 + 2 - local55 / 128;
			@Pc(248) Class81 local248 = Static400.aClass140_4.method2839(Static359.anIntArray277[local158]);
			if (local248.anIntArray100 != null) {
				local248 = local248.method1760(Static413.aClass63_1);
				if (local248 == null || local248.anInt1914 == -1) {
					continue;
				}
			}
			Static287.method3966(local179, arg2, arg3, arg0, arg1, local15, local168, local248.anInt1914);
		}
		@Pc(329) int local329;
		@Pc(340) int local340;
		for (@Pc(286) Class5_Sub24 local286 = (Class5_Sub24) Static109.aClass335_12.method7768(); local286 != null; local286 = (Class5_Sub24) Static109.aClass335_12.method7777()) {
			local179 = (int) (local286.aLong329 >> 28 & 0x3L);
			if (Static32.anInt444 == local179) {
				local189 = (int) (local286.aLong329 & 0x3FFFL) - Static454.anInt7910;
				@Pc(318) int local318 = (int) (local286.aLong329 >> 14 & 0x3FFFL) - Static48.anInt750;
				local329 = local189 * 4 + 2 - local57 / 128;
				local340 = local318 * 4 + 2 - local55 / 128;
				Static28.method380(local15, local340, arg0, Static665.aClass59Array14[0], local329, arg2, arg3);
			}
		}
		@Pc(431) int local431;
		for (local179 = 0; local179 < Static386.anInt6720; local179++) {
			@Pc(372) Class5_Sub34 local372 = (Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local179]);
			if (local372 != null) {
				@Pc(377) Class41_Sub1_Sub1_Sub3_Sub1 local377 = local372.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				if (local377.method4718() && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local377.aByte149) {
					@Pc(393) Class311 local393 = local377.aClass311_1;
					if (local393 != null && local393.anIntArray476 != null) {
						local393 = local393.method7325(Static413.aClass63_1);
					}
					if (local393 != null && local393.aBoolean628 && local393.aBoolean624) {
						local340 = local377.anInt10366 / 128 - local57 / 128;
						local431 = local377.anInt10367 / 128 - local55 / 128;
						if (local393.anInt8646 == -1) {
							Static28.method380(local15, local431, arg0, Static665.aClass59Array14[1], local340, arg2, arg3);
						} else {
							Static287.method3966(local431, arg2, arg3, arg0, arg1, local15, local340, local393.anInt8646);
						}
					}
				}
			}
		}
		local189 = Static72.anInt9084;
		@Pc(471) int[] local471 = Static388.anIntArray381;
		@Pc(517) int local517;
		@Pc(521) int local521;
		@Pc(547) int local547;
		for (local329 = 0; local329 < local189; local329++) {
			@Pc(480) Class41_Sub1_Sub1_Sub3_Sub2 local480 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local471[local329]];
			if (local480 != null && local480.method7937() && !local480.aBoolean696 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 != local480 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local480.aByte149) {
				local431 = local480.anInt10366 / 128 - local57 / 128;
				local517 = local480.anInt10367 / 128 - local55 / 128;
				@Pc(519) boolean local519 = false;
				for (local521 = 0; local521 < Static529.anInt8750; local521++) {
					if (local480.aString100.equals(Static562.aStringArray36[local521]) && Static640.anIntArray587[local521] != 0) {
						local519 = true;
						break;
					}
				}
				@Pc(545) boolean local545 = false;
				for (local547 = 0; local547 < Static476.anInt8265; local547++) {
					if (local480.aString100.equals(Static151.aClass273Array5[local547].aString80)) {
						local545 = true;
						break;
					}
				}
				@Pc(565) boolean local565 = false;
				if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9540 != 0 && local480.anInt9540 != 0 && local480.anInt9540 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9540) {
					local565 = true;
				}
				if (local480.aBoolean698) {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[6], local431, arg2, arg3);
				} else if (local565) {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[4], local431, arg2, arg3);
				} else if (local480.aBoolean697) {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[7], local431, arg2, arg3);
				} else if (local519) {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[3], local431, arg2, arg3);
				} else if (local545) {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[5], local431, arg2, arg3);
				} else {
					Static28.method380(local15, local517, arg0, Static665.aClass59Array14[2], local431, arg2, arg3);
				}
			}
		}
		@Pc(678) Class358[] local678 = Static217.aClass358Array1;
		@Pc(758) int local758;
		for (local431 = 0; local431 < local678.length; local431++) {
			@Pc(685) Class358 local685 = local678[local431];
			if (local685 != null && local685.anInt9736 != 0 && Static421.anInt7434 % 20 < 10) {
				@Pc(723) int local723;
				if (local685.anInt9736 == 1) {
					@Pc(709) Class5_Sub34 local709 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local685.anInt9743);
					if (local709 != null) {
						@Pc(714) Class41_Sub1_Sub1_Sub3_Sub1 local714 = local709.aClass41_Sub1_Sub1_Sub3_Sub1_1;
						local723 = local714.anInt10366 / 128 - local57 / 128;
						local547 = local714.anInt10367 / 128 - local55 / 128;
						Static654.method8346(local723, local685.anInt9738, arg3, arg0, local15, local547, 360000L, arg2);
					}
				}
				if (local685.anInt9736 == 2) {
					local758 = local685.anInt9737 / 128 - local57 / 128;
					local521 = local685.anInt9742 / 128 - local55 / 128;
					@Pc(773) long local773 = (long) (local685.anInt9744 << 7);
					@Pc(777) long local777 = local773 * local773;
					Static654.method8346(local758, local685.anInt9738, arg3, arg0, local15, local521, local777, arg2);
				}
				if (local685.anInt9736 == 10 && local685.anInt9743 >= 0 && local685.anInt9743 < Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2.length) {
					@Pc(809) Class41_Sub1_Sub1_Sub3_Sub2 local809 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local685.anInt9743];
					if (local809 != null) {
						local521 = local809.anInt10366 / 128 - local57 / 128;
						local723 = local809.anInt10367 / 128 - local55 / 128;
						Static654.method8346(local521, local685.anInt9738, arg3, arg0, local15, local723, 360000L, arg2);
					}
				}
			}
		}
		if (Static133.anInt2254 == 4) {
			return;
		}
		if (Static443.anInt7790 != 0) {
			local517 = Static443.anInt7790 * 4 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() * 2 + 2 - local57 / 128 - 2;
			local758 = Static154.anInt2536 * 4 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() * 2 + 2 - local55 / 128 - 2;
			Static28.method380(local15, local758, arg0, Static326.aClass59Array13[Static390.aBoolean744 ? 1 : 0], local517, arg2, arg3);
		}
		if (!Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aBoolean696) {
			arg1.method6252(arg3.anInt10532 / 2 + arg0 - 1, arg2 + -1 + arg3.anInt10536 / 2, -1, 3, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	public static void method8205() {
		Static214.anInt3451 = 0;
		@Pc(18) int local18 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9) + Static454.anInt7910;
		@Pc(25) int local25 = Static48.anInt750 + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static214.anInt3451 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static214.anInt3451 = 1;
		}
		if (Static214.anInt3451 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static214.anInt3451 = 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method8206(@OriginalArg(1) int arg0) {
		Static420.aLong221 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
	public static void method8207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class5_Sub2_Sub4 local20 = Static257.method3597(19, (long) arg0 << 32 | (long) arg1);
		local20.method2440();
	}
}
