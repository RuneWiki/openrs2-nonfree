import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "F")
	public static float aFloat293;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!ts;")
	public static Class5_Sub46 aClass5_Sub46_1;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!qa;IILclient!oh;)V")
	public static void method5526(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class220 arg3) {
		@Pc(10) Class87 local10 = arg3.method5482(arg0);
		if (local10 == null) {
			return;
		}
		arg0.N(arg1, arg2, arg1 + arg3.anInt6627, arg3.anInt6681 + arg2);
		if (Static219.anInt4147 == 2 || Static219.anInt4147 == 5 || Static112.aClass25_5 == null) {
			arg0.G(-16777216, local10, arg1, arg2);
			return;
		}
		@Pc(58) int local58;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(60) int local60;
		if (Static166.anInt3343 == 4) {
			local50 = Static433.anInt7633;
			local56 = (int) -Static476.aFloat339 & 0x3FFF;
			local58 = Static409.anInt7303;
			local60 = 4096;
		} else {
			local60 = 4096 - Static145.anInt3048 * 16;
			local50 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493;
			local58 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
			local56 = Static352.anInt6565 + (int) -Static476.aFloat339 & 0x3FFF;
		}
		@Pc(96) int local96 = local58 / 32 + 48 - (Static460.anInt7894 - 104) * 2;
		@Pc(113) int local113 = Static235.anInt4493 * 4 + 208 + 48 - Static235.anInt4493 * 2 - local50 / 32;
		Static112.aClass25_5.method6959((float) arg1 + (float) arg3.anInt6627 / 2.0F, (float) arg2 + (float) arg3.anInt6681 / 2.0F, (float) local96, (float) local113, local60, local56 << 2, local10, arg1, arg2);
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(147) Class5_Sub27 local147 = (Class5_Sub27) Static370.aClass99_70.method2526(); local147 != null; local147 = (Class5_Sub27) Static370.aClass99_70.method2519()) {
			@Pc(152) int local152 = local147.anInt4812;
			local164 = (Static259.aClass197_2.anIntArray418[local152] >> 14 & 0x3FFF) - Static515.anInt3214;
			local174 = (Static259.aClass197_2.anIntArray418[local152] & 0x3FFF) - Static338.anInt6353;
			local185 = local164 * 4 + 2 - local58 / 32;
			local196 = local174 * 4 + 2 - local50 / 32;
			Static438.method6226(arg3, local196, local185, arg1, Static259.aClass197_2.anIntArray417[local152], arg2, arg0, local10);
		}
		for (local164 = 0; local164 < Static106.anInt2330; local164++) {
			local174 = Static449.anIntArray591[local164] * 4 + 2 - local58 / 32;
			local185 = Static474.anIntArray242[local164] * 4 + 2 - local50 / 32;
			@Pc(252) Class283 local252 = Static453.aClass88_3.method2294(Static428.anIntArray574[local164]);
			if (local252.anIntArray632 != null) {
				local252 = local252.method6604(Static540.aClass242_1);
				if (local252 == null || local252.anInt8188 == -1) {
					continue;
				}
			}
			Static438.method6226(arg3, local185, local174, arg1, local252.anInt8188, arg2, arg0, local10);
		}
		@Pc(330) int local330;
		@Pc(341) int local341;
		for (@Pc(289) Class5_Sub7 local289 = (Class5_Sub7) Static181.aClass42_11.method1103(); local289 != null; local289 = (Class5_Sub7) Static181.aClass42_11.method1105()) {
			local185 = (int) (local289.aLong253 >> 28 & 0x3L);
			if (Static193.anInt3734 == local185) {
				local196 = (int) (local289.aLong253 & 0x3FFFL) - Static515.anInt3214;
				@Pc(320) int local320 = (int) (local289.aLong253 >> 14 & 0x3FFFL) - Static338.anInt6353;
				local330 = local196 * 4 + 2 - local58 / 32;
				local341 = local320 * 4 + 2 - local50 / 32;
				Static295.method4921(local330, arg3, local341, local10, Static279.aClass25Array11[0], arg1, arg2);
			}
		}
		@Pc(431) int local431;
		for (local185 = 0; local185 < Static438.anInt7689; local185++) {
			@Pc(372) Class5_Sub51 local372 = (Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local185]);
			if (local372 != null) {
				@Pc(377) Class15_Sub2_Sub1_Sub2 local377 = local372.aClass15_Sub2_Sub1_Sub2_2;
				if (local377.method4052() && Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local377.aByte91) {
					@Pc(393) Class305 local393 = local377.aClass305_1;
					if (local393 != null && local393.anIntArray679 != null) {
						local393 = local393.method7150(Static540.aClass242_1);
					}
					if (local393 != null && local393.aBoolean637 && local393.lb) {
						local341 = local377.anInt8492 / 32 - local58 / 32;
						local431 = local377.anInt8493 / 32 - local50 / 32;
						if (local393.anInt8796 == -1) {
							Static295.method4921(local341, arg3, local431, local10, Static279.aClass25Array11[1], arg1, arg2);
						} else {
							Static438.method6226(arg3, local431, local341, arg1, local393.anInt8796, arg2, arg0, local10);
						}
					}
				}
			}
		}
		local196 = Static103.anInt992;
		@Pc(472) int[] local472 = Static523.anIntArray682;
		@Pc(516) int local516;
		@Pc(520) int local520;
		@Pc(545) int local545;
		for (local330 = 0; local330 < local196; local330++) {
			@Pc(482) Class15_Sub2_Sub1_Sub1 local482 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local472[local330]];
			if (local482 != null && local482.method797() && Static35.aClass15_Sub2_Sub1_Sub1_1 != local482 && Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local482.aByte91) {
				local431 = local482.anInt8492 / 32 - local58 / 32;
				local516 = local482.anInt8493 / 32 - local50 / 32;
				@Pc(518) boolean local518 = false;
				for (local520 = 0; local520 < Static59.anInt1208; local520++) {
					if (local482.aString18.equals(Static23.aStringArray7[local520]) && Static361.anIntArray507[local520] != 0) {
						local518 = true;
						break;
					}
				}
				@Pc(543) boolean local543 = false;
				for (local545 = 0; local545 < Static280.anInt5465; local545++) {
					if (local482.aString18.equals(Static482.aClass163Array1[local545].aString49)) {
						local543 = true;
						break;
					}
				}
				@Pc(569) boolean local569 = false;
				if (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt829 != 0 && local482.anInt829 != 0 && local482.anInt829 == Static35.aClass15_Sub2_Sub1_Sub1_1.anInt829) {
					local569 = true;
				}
				if (local482.aBoolean33) {
					Static295.method4921(local431, arg3, local516, local10, Static279.aClass25Array11[6], arg1, arg2);
				} else if (local518) {
					Static295.method4921(local431, arg3, local516, local10, Static279.aClass25Array11[3], arg1, arg2);
				} else if (local543) {
					Static295.method4921(local431, arg3, local516, local10, Static279.aClass25Array11[5], arg1, arg2);
				} else if (local569) {
					Static295.method4921(local431, arg3, local516, local10, Static279.aClass25Array11[4], arg1, arg2);
				} else {
					Static295.method4921(local431, arg3, local516, local10, Static279.aClass25Array11[2], arg1, arg2);
				}
			}
		}
		@Pc(667) Class34[] local667 = Static531.aClass34Array1;
		@Pc(748) int local748;
		for (local431 = 0; local431 < local667.length; local431++) {
			@Pc(675) Class34 local675 = local667[local431];
			if (local675 != null && local675.anInt976 != 0 && Static481.anInt8318 % 20 < 10) {
				@Pc(711) int local711;
				if (local675.anInt976 == 1) {
					@Pc(697) Class5_Sub51 local697 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local675.anInt973);
					if (local697 != null) {
						@Pc(702) Class15_Sub2_Sub1_Sub2 local702 = local697.aClass15_Sub2_Sub1_Sub2_2;
						local711 = local702.anInt8492 / 32 - local58 / 32;
						local545 = local702.anInt8493 / 32 - local50 / 32;
						Static187.method3152(arg1, arg2, local675.anInt975, arg3, 360000L, local10, local545, local711);
					}
				}
				if (local675.anInt976 == 2) {
					local748 = local675.anInt978 / 32 - local58 / 32;
					local520 = local675.anInt972 / 32 - local50 / 32;
					@Pc(764) long local764 = (long) (local675.anInt980 << 5);
					@Pc(768) long local768 = local764 * local764;
					Static187.method3152(arg1, arg2, local675.anInt975, arg3, local768, local10, local520, local748);
				}
				if (local675.anInt976 == 10 && local675.anInt973 >= 0 && local675.anInt973 < Static10.aClass15_Sub2_Sub1_Sub1Array1.length) {
					@Pc(800) Class15_Sub2_Sub1_Sub1 local800 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local675.anInt973];
					if (local800 != null) {
						local520 = local800.anInt8492 / 32 - local58 / 32;
						local711 = local800.anInt8493 / 32 - local50 / 32;
						Static187.method3152(arg1, arg2, local675.anInt975, arg3, 360000L, local10, local711, local520);
					}
				}
			}
		}
		if (Static166.anInt3343 == 4) {
			return;
		}
		if (Static384.anInt7374 != 0) {
			local516 = Static384.anInt7374 * 4 + Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() * 2 + 2 - local58 / 32 - 2;
			local748 = Static40.anInt919 * 4 + Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() * 2 + 2 - local50 / 32 - 2;
			Static295.method4921(local516, arg3, local748, local10, Static147.aClass25Array6[Static415.aBoolean523 ? 1 : 0], arg1, arg2);
		}
		arg0.method7040(-1, 3, arg2 + arg3.anInt6681 / 2 - 1, arg3.anInt6627 / 2 + arg1 + -1, 3);
		return;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5527(@OriginalArg(1) String arg0) {
		if (Static193.aStringArray19 == null) {
			Static438.method6229();
		}
		@Pc(14) String[] local14 = Static514.method7107('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static532.anInt8981; local25 > 0; local25--) {
				Static193.aStringArray19[local25] = Static193.aStringArray19[local25 - 1];
			}
			Static193.aStringArray19[0] = local14[local21];
			if (Static193.aStringArray19.length - 1 > Static532.anInt8981) {
				if (Static488.anInt6246 > 0) {
					Static488.anInt6246++;
				}
				Static532.anInt8981++;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
	public static boolean method5529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
