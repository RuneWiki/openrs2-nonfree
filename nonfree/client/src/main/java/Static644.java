import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	public static int anInt10376;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "[I")
	public static final int[] anIntArray697 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "Z")
	public static boolean aBoolean749 = false;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	public static void method8648() {
		Static575.aClass32_82.method632();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(CB)Z")
	public static boolean method8649(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!paa;BIILclient!ha;)V")
	public static void method8650(@OriginalArg(0) Class261 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3) {
		@Pc(10) Class1 local10 = arg0.method5621(arg3);
		if (local10 == null) {
			return;
		}
		arg3.KA(arg2, arg1, arg2 + arg0.anInt6595, arg0.anInt6622 + arg1);
		if (Static502.anInt2999 == 2 || Static502.anInt2999 == 5 || Static533.aClass61_29 == null) {
			arg3.A(-16777216, local10, arg2, arg1);
			return;
		}
		@Pc(76) int local76;
		@Pc(73) int local73;
		@Pc(63) int local63;
		@Pc(70) int local70;
		if (Static445.anInt7122 == 4) {
			local70 = 4096;
			local76 = Static319.anInt5080;
			local73 = Static418.anInt6556;
			local63 = (int) -Static440.aFloat144 & 0x3FFF;
		} else {
			local63 = (int) -Static440.aFloat144 + Static99.anInt7118 & 0x3FFF;
			local70 = 4096 - Static407.anInt9051 * 16;
			local73 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
			local76 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
		}
		@Pc(103) int local103 = local76 / 128 + 48 - (Static228.anInt3704 - 104) * 2;
		@Pc(119) int local119 = Static162.anInt2911 * 4 + 208 + 48 - Static162.anInt2911 * 2 - local73 / 128;
		Static533.aClass61_29.method6432((float) arg2 + (float) arg0.anInt6595 / 2.0F, (float) arg0.anInt6622 / 2.0F + (float) arg1, (float) local103, (float) local119, local70, local63 << 2, local10, arg2, arg1);
		@Pc(169) int local169;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(200) int local200;
		for (@Pc(153) Class2_Sub30 local153 = (Class2_Sub30) Static465.aClass109_48.method2325(); local153 != null; local153 = (Class2_Sub30) Static465.aClass109_48.method2318()) {
			@Pc(158) int local158 = local153.anInt5508;
			local169 = (Static146.aClass84_3.anIntArray156[local158] >> 14 & 0x3FFF) - Static132.anInt2246;
			local178 = (Static146.aClass84_3.anIntArray156[local158] & 0x3FFF) - Static123.anInt2176;
			local189 = local169 * 4 + 2 - local76 / 128;
			local200 = local178 * 4 + 2 - local73 / 128;
			Static553.method7594(local200, arg0, arg1, Static146.aClass84_3.anIntArray157[local158], local10, arg2, arg3, local189);
		}
		for (local169 = 0; local169 < Static633.anInt10151; local169++) {
			local178 = Static160.anIntArray193[local169] * 4 + 2 - local76 / 128;
			local189 = Static447.anIntArray591[local169] * 4 + 2 - local73 / 128;
			@Pc(257) Class191 local257 = Static319.aClass141_4.method2971(Static387.anIntArray446[local169]);
			if (local257.anIntArray323 != null) {
				local257 = local257.method4057(Static431.aClass205_1);
				if (local257 == null || local257.anInt4777 == -1) {
					continue;
				}
			}
			Static553.method7594(local189, arg0, arg1, local257.anInt4777, local10, arg2, arg3, local178);
		}
		@Pc(340) int local340;
		@Pc(351) int local351;
		for (@Pc(297) Class2_Sub11 local297 = (Class2_Sub11) Static41.aClass118_6.method2596(); local297 != null; local297 = (Class2_Sub11) Static41.aClass118_6.method2597()) {
			local189 = (int) (local297.aLong280 >> 28 & 0x3L);
			if (Static349.anInt5482 == local189) {
				local200 = (int) (local297.aLong280 & 0x3FFFL) - Static132.anInt2246;
				@Pc(329) int local329 = (int) (local297.aLong280 >> 14 & 0x3FFFL) - Static123.anInt2176;
				local340 = local200 * 4 + 2 - local76 / 128;
				local351 = local329 * 4 + 2 - local73 / 128;
				Static626.method8387(Static401.aClass61Array12[0], local340, arg2, local351, local10, arg1, arg0);
			}
		}
		@Pc(436) int local436;
		for (local189 = 0; local189 < Static639.anInt10306; local189++) {
			@Pc(382) Class2_Sub43 local382 = (Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local189]);
			if (local382 != null) {
				@Pc(387) Class13_Sub1_Sub1_Sub1_Sub1 local387 = local382.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				if (local387.method401() && local387.aByte127 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127) {
					@Pc(399) Class150 local399 = local387.aClass150_1;
					if (local399 != null && local399.anIntArray262 != null) {
						local399 = local399.method3196(Static431.aClass205_1);
					}
					if (local399 != null && local399.aBoolean267 && local399.aBoolean272) {
						local351 = local387.anInt10090 / 128 - local76 / 128;
						local436 = local387.anInt10089 / 128 - local73 / 128;
						if (local399.anInt3798 == -1) {
							Static626.method8387(Static401.aClass61Array12[1], local351, arg2, local436, local10, arg1, arg0);
						} else {
							Static553.method7594(local436, arg0, arg1, local399.anInt3798, local10, arg2, arg3, local351);
						}
					}
				}
			}
		}
		local200 = Static580.anInt9430;
		@Pc(472) int[] local472 = Static6.anIntArray9;
		@Pc(518) int local518;
		@Pc(522) int local522;
		@Pc(550) int local550;
		for (local340 = 0; local340 < local200; local340++) {
			@Pc(482) Class13_Sub1_Sub1_Sub1_Sub2 local482 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local472[local340]];
			if (local482 != null && local482.method3969() && !local482.aBoolean322 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 != local482 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local482.aByte127) {
				local436 = local482.anInt10090 / 128 - local76 / 128;
				local518 = local482.anInt10089 / 128 - local73 / 128;
				@Pc(520) boolean local520 = false;
				for (local522 = 0; local522 < Static352.anInt5497; local522++) {
					if (local482.aString50.equals(Static213.aStringArray13[local522]) && Static320.anIntArray351[local522] != 0) {
						local520 = true;
						break;
					}
				}
				@Pc(548) boolean local548 = false;
				for (local550 = 0; local550 < Static159.anInt2843; local550++) {
					if (local482.aString50.equals(Static619.aClass211Array1[local550].aString61)) {
						local548 = true;
						break;
					}
				}
				@Pc(574) boolean local574 = false;
				if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4665 != 0 && local482.anInt4665 != 0 && local482.anInt4665 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4665) {
					local574 = true;
				}
				if (local482.aBoolean323) {
					Static626.method8387(Static401.aClass61Array12[6], local436, arg2, local518, local10, arg1, arg0);
				} else if (local520) {
					Static626.method8387(Static401.aClass61Array12[3], local436, arg2, local518, local10, arg1, arg0);
				} else if (local548) {
					Static626.method8387(Static401.aClass61Array12[5], local436, arg2, local518, local10, arg1, arg0);
				} else if (local574) {
					Static626.method8387(Static401.aClass61Array12[4], local436, arg2, local518, local10, arg1, arg0);
				} else {
					Static626.method8387(Static401.aClass61Array12[2], local436, arg2, local518, local10, arg1, arg0);
				}
			}
		}
		@Pc(676) Class372[] local676 = Static341.aClass372Array1;
		@Pc(761) int local761;
		for (local436 = 0; local436 < local676.length; local436++) {
			@Pc(684) Class372 local684 = local676[local436];
			if (local684 != null && local684.anInt9971 != 0 && Static262.anInt5597 % 20 < 10) {
				@Pc(726) int local726;
				if (local684.anInt9971 == 1) {
					@Pc(711) Class2_Sub43 local711 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local684.anInt9978);
					if (local711 != null) {
						@Pc(716) Class13_Sub1_Sub1_Sub1_Sub1 local716 = local711.aClass13_Sub1_Sub1_Sub1_Sub1_2;
						local726 = local716.anInt10090 / 128 - local76 / 128;
						local550 = local716.anInt10089 / 128 - local73 / 128;
						Static413.method5532(360000L, arg0, arg1, local684.anInt9970, local550, local726, arg2, local10);
					}
				}
				if (local684.anInt9971 == 2) {
					local761 = local684.anInt9972 / 128 - local76 / 128;
					local522 = local684.anInt9975 / 128 - local73 / 128;
					@Pc(776) long local776 = (long) (local684.anInt9967 << 7);
					@Pc(780) long local780 = local776 * local776;
					Static413.method5532(local780, arg0, arg1, local684.anInt9970, local522, local761, arg2, local10);
				}
				if (local684.anInt9971 == 10 && local684.anInt9978 >= 0 && Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1.length > local684.anInt9978) {
					@Pc(811) Class13_Sub1_Sub1_Sub1_Sub2 local811 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local684.anInt9978];
					if (local811 != null) {
						local522 = local811.anInt10090 / 128 - local76 / 128;
						local726 = local811.anInt10089 / 128 - local73 / 128;
						Static413.method5532(360000L, arg0, arg1, local684.anInt9970, local726, local522, arg2, local10);
					}
				}
			}
		}
		if (Static445.anInt7122 == 4) {
			return;
		}
		if (Static621.anInt9980 != 0) {
			local518 = Static621.anInt9980 * 4 + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() + -1) * 2 + 2 - local76 / 128;
			local761 = Static507.anInt8466 * 4 + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() - 1) * 2 + 2 - local73 / 128;
			Static626.method8387(Static206.aClass61Array7[Static643.aBoolean747 ? 1 : 0], local518, arg2, local761, local10, arg1, arg0);
		}
		if (!Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aBoolean322) {
			arg3.method6936(3, 3, arg2 + arg0.anInt6595 / 2 - 1, -1, arg0.anInt6622 / 2 + arg1 - 1);
			return;
		}
	}
}
