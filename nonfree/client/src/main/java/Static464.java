import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_10 = new Class37(8, 0, 4, 1);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IILclient!za;Lclient!gi;I)V")
	public static void method2324(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Class93 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class102 local10 = arg2.method2124(arg1);
		if (local10 == null) {
			return;
		}
		arg1.ba(arg0, arg3, arg0 + arg2.anInt2436, arg2.anInt2495 + arg3);
		if (Static433.anInt7312 == 2 || Static433.anInt7312 == 5 || Static214.aClass41_10 == null) {
			arg1.ra(-16777216, local10, arg0, arg3);
			return;
		}
		@Pc(66) int local66;
		@Pc(63) int local63;
		@Pc(74) int local74;
		@Pc(60) int local60;
		if (Static25.anInt7273 == 4) {
			local74 = (int) -Static37.aFloat9 & 0x3FFF;
			local66 = Static188.anInt6693;
			local60 = 4096;
			local63 = Static235.anInt3979;
		} else {
			local60 = 4096 - Static148.anInt2711 * 16;
			local63 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622;
			local66 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
			local74 = Static149.anInt7397 + (int) -Static37.aFloat9 & 0x3FFF;
		}
		@Pc(100) int local100 = local66 / 32 + 48 - (Static234.anInt3949 + -104) * 2;
		@Pc(117) int local117 = Static371.anInt6492 * 4 + 48 - local63 / 32 - (Static371.anInt6492 + -104) * 2;
		Static214.aClass41_10.method6086((float) arg0 + (float) arg2.anInt2436 / 2.0F, (float) arg3 + (float) arg2.anInt2495 / 2.0F, (float) local100, (float) local117, local60, local74 << 2, local10, arg0, arg3);
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(197) int local197;
		for (@Pc(151) Class2_Sub5 local151 = (Class2_Sub5) Static459.aClass181_51.method3972(); local151 != null; local151 = (Class2_Sub5) Static459.aClass181_51.method3975()) {
			@Pc(156) int local156 = local151.anInt603;
			local167 = (Static115.aClass176_2.anIntArray400[local156] >> 14 & 0x3FFF) - Static386.anInt7205;
			local176 = (Static115.aClass176_2.anIntArray400[local156] & 0x3FFF) - Static153.anInt2798;
			local186 = local167 * 4 + 2 - local66 / 32;
			local197 = local176 * 4 + 2 - local63 / 32;
			Static374.method5207(local10, arg1, local197, Static115.aClass176_2.anIntArray399[local156], local186, arg0, arg2, arg3);
		}
		for (local167 = 0; local167 < Static37.anInt614; local167++) {
			local176 = Static238.anIntArray357[local167] * 4 + 2 - local66 / 32;
			local186 = Static431.anIntArray597[local167] * 4 + 2 - local63 / 32;
			@Pc(256) Class192 local256 = Static249.aClass39_2.method748(Static216.anIntArray629[local167]);
			if (local256.anIntArray462 != null) {
				local256 = local256.method4323(Static63.aClass120_2);
				if (local256 == null || local256.anInt5448 == -1) {
					continue;
				}
			}
			Static374.method5207(local10, arg1, local186, local256.anInt5448, local176, arg0, arg2, arg3);
		}
		@Pc(340) int local340;
		@Pc(351) int local351;
		for (@Pc(293) Class2_Sub43 local293 = (Class2_Sub43) Static293.aClass220_27.method5096(); local293 != null; local293 = (Class2_Sub43) Static293.aClass220_27.method5098()) {
			local186 = (int) (local293.aLong401 >> 28 & 0x3L);
			if (local186 == Static80.anInt6192) {
				local197 = (int) (local293.aLong401 & 0x3FFFL) - Static386.anInt7205;
				@Pc(329) int local329 = (int) (local293.aLong401 >> 14 & 0x3FFFL) - Static153.anInt2798;
				local340 = local197 * 4 + 2 - local66 / 32;
				local351 = local329 * 4 + 2 - local63 / 32;
				Static228.method4887(arg3, Static440.aClass41Array15[0], local340, arg2, arg0, local351, local10);
			}
		}
		@Pc(440) int local440;
		for (local186 = 0; local186 < Static458.anInt7721; local186++) {
			@Pc(382) Class2_Sub34 local382 = (Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local186]);
			if (local382 != null) {
				@Pc(387) Class11_Sub5_Sub2_Sub2 local387 = local382.aClass11_Sub5_Sub2_Sub2_2;
				if (local387.method6236() && Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local387.aByte101) {
					@Pc(403) Class82 local403 = local387.aClass82_1;
					if (local403 != null && local403.anIntArray149 != null) {
						local403 = local403.method1888(Static63.aClass120_2);
					}
					if (local403 != null && local403.aBoolean114 && local403.aBoolean115) {
						local351 = local387.anInt7626 / 32 - local66 / 32;
						local440 = local387.anInt7622 / 32 - local63 / 32;
						if (local403.anInt1967 == -1) {
							Static228.method4887(arg3, Static440.aClass41Array15[1], local351, arg2, arg0, local440, local10);
						} else {
							Static374.method5207(local10, arg1, local440, local403.anInt1967, local351, arg0, arg2, arg3);
						}
					}
				}
			}
		}
		local197 = Static121.anInt2062;
		@Pc(480) int[] local480 = Static311.anIntArray474;
		@Pc(524) int local524;
		@Pc(528) int local528;
		@Pc(557) int local557;
		for (local340 = 0; local340 < local197; local340++) {
			@Pc(490) Class11_Sub5_Sub2_Sub1 local490 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local480[local340]];
			if (local490 != null && local490.method2104() && Static127.aClass11_Sub5_Sub2_Sub1_2 != local490 && Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local490.aByte101) {
				local440 = local490.anInt7626 / 32 - local66 / 32;
				local524 = local490.anInt7622 / 32 - local63 / 32;
				@Pc(526) boolean local526 = false;
				for (local528 = 0; local528 < Static259.anInt4591; local528++) {
					if (local490.aString20.equals(Static449.aStringArray67[local528]) && Static110.anIntArray137[local528] != 0) {
						local526 = true;
						break;
					}
				}
				@Pc(555) boolean local555 = false;
				for (local557 = 0; local557 < Static6.anInt110; local557++) {
					if (local490.aString20.equals(Static57.aClass29Array1[local557].aString4)) {
						local555 = true;
						break;
					}
				}
				@Pc(577) boolean local577 = false;
				if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2413 != 0 && local490.anInt2413 != 0 && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2413 == local490.anInt2413) {
					local577 = true;
				}
				if (local490.aBoolean144) {
					Static228.method4887(arg3, Static440.aClass41Array15[6], local440, arg2, arg0, local524, local10);
				} else if (local526) {
					Static228.method4887(arg3, Static440.aClass41Array15[3], local440, arg2, arg0, local524, local10);
				} else if (local555) {
					Static228.method4887(arg3, Static440.aClass41Array15[5], local440, arg2, arg0, local524, local10);
				} else if (local577) {
					Static228.method4887(arg3, Static440.aClass41Array15[4], local440, arg2, arg0, local524, local10);
				} else {
					Static228.method4887(arg3, Static440.aClass41Array15[2], local440, arg2, arg0, local524, local10);
				}
			}
		}
		@Pc(677) Class166[] local677 = Static223.aClass166Array1;
		@Pc(759) int local759;
		for (local440 = 0; local440 < local677.length; local440++) {
			@Pc(685) Class166 local685 = local677[local440];
			if (local685 != null && local685.anInt4251 != 0 && Static277.anInt5022 % 20 < 10) {
				@Pc(725) int local725;
				if (local685.anInt4251 == 1) {
					@Pc(711) Class2_Sub34 local711 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local685.anInt4246);
					if (local711 != null) {
						@Pc(716) Class11_Sub5_Sub2_Sub2 local716 = local711.aClass11_Sub5_Sub2_Sub2_2;
						local725 = local716.anInt7626 / 32 - local66 / 32;
						local557 = local716.anInt7622 / 32 - local63 / 32;
						Static463.method6279(local10, local685.anInt4242, arg3, local557, 360000L, local725, arg0, arg2);
					}
				}
				if (local685.anInt4251 == 2) {
					local759 = local685.anInt4243 / 32 - local66 / 32;
					local528 = local685.anInt4239 / 32 - local63 / 32;
					@Pc(775) long local775 = (long) (local685.anInt4248 << 5);
					@Pc(779) long local779 = local775 * local775;
					Static463.method6279(local10, local685.anInt4242, arg3, local528, local779, local759, arg0, arg2);
				}
				if (local685.anInt4251 == 10 && local685.anInt4246 >= 0 && Static435.aClass11_Sub5_Sub2_Sub1Array1.length > local685.anInt4246) {
					@Pc(816) Class11_Sub5_Sub2_Sub1 local816 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local685.anInt4246];
					if (local816 != null) {
						local528 = local816.anInt7626 / 32 - local66 / 32;
						local725 = local816.anInt7622 / 32 - local63 / 32;
						Static463.method6279(local10, local685.anInt4242, arg3, local725, 360000L, local528, arg0, arg2);
					}
				}
			}
		}
		if (Static25.anInt7273 == 4) {
			return;
		}
		if (Static249.anInt4279 != 0) {
			local524 = Static249.anInt4279 * 4 + Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() * 2 + 2 - local66 / 32 - 2;
			local759 = Static331.anInt5943 * 4 + Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() * 2 + 2 - local63 / 32 - 2;
			Static228.method4887(arg3, Static321.aClass41Array10[Static68.aBoolean65 ? 1 : 0], local524, arg2, arg0, local759, local10);
		}
		arg1.method5996(3, arg2.anInt2495 / 2 + arg3 - 1, -1, arg2.anInt2436 / 2 + arg0 - 1, 3);
	}
}
