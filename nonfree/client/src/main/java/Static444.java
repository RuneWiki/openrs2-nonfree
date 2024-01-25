import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt7351;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
	public static int anInt7359;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
	public static int anInt7360;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_120 = new Class194(50, 8);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7355 = 0;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_49 = new Class177();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method5894() {
		for (@Pc(14) Class5_Sub2_Sub13 local14 = (Class5_Sub2_Sub13) Static64.aClass177_3.method3618(); local14 != null; local14 = (Class5_Sub2_Sub13) Static64.aClass177_3.method3619()) {
			@Pc(19) Class2_Sub1_Sub1 local19 = local14.aClass2_Sub1_Sub1_1;
			if (Static85.anInt1536 > local19.anInt2614) {
				local14.method6003();
				local19.method2118();
			} else if (Static85.anInt1536 >= local19.anInt2618) {
				if (local19.anInt2621 > 0) {
					@Pc(40) Class5_Sub7 local40 = (Class5_Sub7) Static380.aClass252_36.method5659((long) (local19.anInt2621 - 1));
					if (local40 != null) {
						@Pc(45) Class2_Sub1_Sub3_Sub1 local45 = local40.aClass2_Sub1_Sub3_Sub1_1;
						if (local45.anInt7500 >= 0 && local45.anInt7500 < Static433.anInt7210 * 128 && local45.anInt7502 >= 0 && local45.anInt7502 < Static418.anInt6969 * 128) {
							local19.method2119(Static192.method2572(local45.anInt7502, local45.anInt7500, local19.aByte105) - local19.anInt2619, Static85.anInt1536, local45.anInt7502, local45.anInt7500);
						}
					}
				}
				if (local19.anInt2621 < 0) {
					@Pc(98) int local98 = -local19.anInt2621 - 1;
					@Pc(103) Class2_Sub1_Sub3_Sub2 local103;
					if (Static43.anInt5302 == local98) {
						local103 = Static220.aClass2_Sub1_Sub3_Sub2_1;
					} else {
						local103 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local98];
					}
					if (local103 != null && local103.anInt7500 >= 0 && Static433.anInt7210 * 128 > local103.anInt7500 && local103.anInt7502 >= 0 && Static418.anInt6969 * 128 > local103.anInt7502) {
						local19.method2119(Static192.method2572(local103.anInt7502, local103.anInt7500, local19.aByte105) - local19.anInt2619, Static85.anInt1536, local103.anInt7502, local103.anInt7500);
					}
				}
				local19.method2117(Static173.anInt2946);
				Static462.method6056(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIII)V")
	private static void method5895(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(11) Class5_Sub3 local11 = null;
		for (@Pc(16) Class5_Sub3 local16 = (Class5_Sub3) Static242.aClass177_24.method3618(); local16 != null; local16 = (Class5_Sub3) Static242.aClass177_24.method3619()) {
			if (arg5 == local16.anInt330 && local16.anInt338 == arg1 && local16.anInt336 == arg0 && arg4 == local16.anInt332) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class5_Sub3();
			local11.anInt332 = arg4;
			local11.anInt330 = arg5;
			local11.anInt338 = arg1;
			local11.anInt336 = arg0;
			if (arg1 >= 0 && arg0 >= 0 && arg1 < Static433.anInt7210 && arg0 < Static418.anInt6969) {
				Static327.method862(local11);
			}
			Static242.aClass177_24.method3615(local11);
		}
		local11.anInt328 = arg3;
		local11.anInt335 = -1;
		local11.anInt337 = 0;
		local11.anInt326 = arg6;
		local11.anInt334 = arg2;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method5898() {
		if (Static376.anInt6324 == 8) {
			Static407.method5394(4);
		} else if (Static376.anInt6324 == 4 || Static376.anInt6324 == 5) {
			Static407.method5394(2);
		} else if (Static376.anInt6324 == 11) {
			Static407.method5394(2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method5901() {
		for (@Pc(10) Class5_Sub3 local10 = (Class5_Sub3) Static242.aClass177_24.method3618(); local10 != null; local10 = (Class5_Sub3) Static242.aClass177_24.method3619()) {
			if (local10.anInt335 > 0) {
				local10.anInt335--;
			}
			if (local10.anInt335 != 0) {
				if (local10.anInt337 > 0) {
					local10.anInt337--;
				}
				if (local10.anInt337 == 0 && local10.anInt338 >= 1 && local10.anInt336 >= 1 && Static433.anInt7210 - 2 >= local10.anInt338 && Static418.anInt6969 - 2 >= local10.anInt336 && (local10.anInt334 < 0 || Static295.method3674(local10.anInt326, local10.anInt334))) {
					Static16.method270(local10.anInt326, local10.anInt334, local10.anInt330, -1, local10.anInt336, local10.anInt328, local10.anInt332, local10.anInt338);
					local10.anInt337 = -1;
					if (local10.anInt331 == local10.anInt334 && local10.anInt331 == -1) {
						local10.method6003();
					} else if (local10.anInt334 == local10.anInt331 && local10.anInt329 == local10.anInt328 && local10.anInt326 == local10.anInt333) {
						local10.method6003();
					}
				}
			} else if (local10.anInt331 < 0 || Static295.method3674(local10.anInt333, local10.anInt331)) {
				Static16.method270(local10.anInt333, local10.anInt331, local10.anInt330, -1, local10.anInt336, local10.anInt329, local10.anInt332, local10.anInt338);
				local10.method6003();
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!mo;)V")
	public static void method5902(@OriginalArg(1) Class163 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(31) int local31;
		@Pc(45) int local45;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(39) boolean local39;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(194) Class2_Sub1_Sub1 local194;
		if (Static223.aClass163_4 == arg0) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local22 = Static367.anInt5964 * 2 + (local12 >> 4 & 0xF);
			local31 = Static45.anInt39 * 2 + (local12 & 0xF);
			local39 = Static76.aClass5_Sub15_Sub2_1.method5539() != 0;
			local45 = Static76.aClass5_Sub15_Sub2_1.method5600() + local22;
			local51 = Static76.aClass5_Sub15_Sub2_1.method5600() + local31;
			local55 = Static76.aClass5_Sub15_Sub2_1.method5586();
			local59 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local65 = Static76.aClass5_Sub15_Sub2_1.method5539() * 4;
			local71 = Static76.aClass5_Sub15_Sub2_1.method5539() * 4;
			local75 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local79 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local83 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local87 = Static76.aClass5_Sub15_Sub2_1.method5598();
			if (local83 == 255) {
				local83 = -1;
			}
			if (local22 >= 0 && local31 >= 0 && local22 < Static433.anInt7210 * 2 && local31 < Static433.anInt7210 * 2 && local45 >= 0 && local51 >= 0 && local45 < Static418.anInt6969 * 2 && Static418.anInt6969 * 2 > local51 && local59 != 65535) {
				local22 = local22 * 64;
				local51 *= 64;
				local45 *= 64;
				local65 <<= 0x0;
				local71 <<= 0x0;
				local87 <<= 0x0;
				local31 *= 64;
				local194 = new Class2_Sub1_Sub1(local59, anInt7351, local22, local31, local65, Static85.anInt1536 + local75, local79 + Static85.anInt1536, local83, local87, local55, local71, local39);
				local194.method2119(Static192.method2572(local51, local45, anInt7351) - local71, Static85.anInt1536 + local75, local51, local45);
				Static64.aClass177_3.method3615(new Class5_Sub2_Sub13(local194));
			}
			return;
		}
		@Pc(243) int local243;
		if (Static280.aClass163_7 == arg0) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local22 = (local12 >> 4 & 0x7) + Static367.anInt5964;
			local31 = (local12 & 0x7) + Static45.anInt39;
			local243 = Static76.aClass5_Sub15_Sub2_1.method5598();
			if (local243 == 65535) {
				local243 = -1;
			}
			local45 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local51 = local45 >> 4 & 0xF;
			local55 = local45 & 0x7;
			local59 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local65 = Static76.aClass5_Sub15_Sub2_1.method5539();
			if (local22 >= 0 && local31 >= 0 && local22 < Static433.anInt7210 && Static418.anInt6969 > local31) {
				local71 = local51 + 1;
				if (local22 - local71 <= Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] && Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] <= local71 + local22 && Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] >= local31 - local71 && Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] <= local71 + local31) {
					Static329.method4009(local65, local243, local51 + (anInt7351 << 24) + (local22 << 16) + (local31 << 8), local55, local59);
				}
			}
		} else if (Static5.aClass163_1 == arg0) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
			@Pc(369) boolean local369 = (local12 & 0x80) != 0;
			local31 = Static367.anInt5964 + (local12 >> 3 & 0x7);
			local243 = Static45.anInt39 + (local12 & 0x7);
			local45 = local31 + Static76.aClass5_Sub15_Sub2_1.method5600();
			local51 = local243 + Static76.aClass5_Sub15_Sub2_1.method5600();
			local55 = Static76.aClass5_Sub15_Sub2_1.method5586();
			local59 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local65 = Static76.aClass5_Sub15_Sub2_1.method5539() * 4;
			local71 = Static76.aClass5_Sub15_Sub2_1.method5539() * 4;
			local75 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local79 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local83 = Static76.aClass5_Sub15_Sub2_1.method5539();
			if (local83 == 255) {
				local83 = -1;
			}
			local87 = Static76.aClass5_Sub15_Sub2_1.method5598();
			if (local31 >= 0 && local243 >= 0 && Static433.anInt7210 > local31 && local243 < Static418.anInt6969 && local45 >= 0 && local51 >= 0 && Static433.anInt7210 > local45 && local51 < Static418.anInt6969 && local59 != 65535) {
				local65 <<= 0x0;
				local87 <<= 0x0;
				local71 <<= 0x0;
				local243 = local243 * 128 + 64;
				local45 = local45 * 128 + 64;
				local31 = local31 * 128 + 64;
				local51 = local51 * 128 + 64;
				local194 = new Class2_Sub1_Sub1(local59, anInt7351, local31, local243, local65, local75 + Static85.anInt1536, Static85.anInt1536 + local79, local83, local87, local55, local71, local369);
				local194.method2119(Static192.method2572(local51, local45, anInt7351) - local71, Static85.anInt1536 + local75, local51, local45);
				Static64.aClass177_3.method3615(new Class5_Sub2_Sub13(local194));
			}
		} else if (arg0 == Static366.aClass163_11) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5585();
			local22 = Static45.anInt39 + (local12 & 0x7);
			local31 = local22 + Static226.anInt3768;
			local243 = (local12 >> 4 & 0x7) + Static367.anInt5964;
			local45 = local243 + Static31.anInt618;
			local51 = Static76.aClass5_Sub15_Sub2_1.method5598();
			@Pc(602) Class5_Sub24 local602 = (Class5_Sub24) Static400.aClass252_38.method5659((long) (local45 | local31 << 14 | anInt7351 << 28));
			if (local602 != null) {
				for (@Pc(610) Class5_Sub27 local610 = (Class5_Sub27) local602.aClass177_21.method3618(); local610 != null; local610 = (Class5_Sub27) local602.aClass177_21.method3619()) {
					if (local610.anInt4203 == (local51 & 0x7FFF)) {
						local610.method6003();
						break;
					}
				}
				if (local602.aClass177_21.method3616()) {
					local602.method6003();
				}
				if (local243 >= 0 && local22 >= 0 && local243 < Static433.anInt7210 && local22 < Static418.anInt6969) {
					Static235.method3042(local22, anInt7351, local243);
				}
			}
		} else if (arg0 == Static226.aClass163_5) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5578();
			local22 = Static367.anInt5964 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static45.anInt39;
			local243 = Static76.aClass5_Sub15_Sub2_1.method5594();
			local45 = local243 >> 2;
			local51 = local243 & 0x3;
			local55 = Static30.anIntArray25[local45];
			local59 = Static76.aClass5_Sub15_Sub2_1.method5598();
			if (local59 == 65535) {
				local59 = -1;
			}
			Static2.method6033(local45, local59, local22, local51, anInt7351, local55, local31);
		} else if (arg0 == Static453.aClass163_12) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local22 = (local12 >> 4 & 0x7) + Static367.anInt5964;
			local31 = (local12 & 0x7) + Static45.anInt39;
			local243 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local45 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local51 = Static76.aClass5_Sub15_Sub2_1.method5598();
			local55 = Static76.aClass5_Sub15_Sub2_1.method5539();
			if (local22 >= 0 && local31 >= 0 && local22 < Static433.anInt7210 && Static418.anInt6969 > local31) {
				local59 = local22 * 128 + 64;
				local65 = local31 * 128 + 64;
				local71 = anInt7351;
				if (local71 < 3 && Static118.method1679(local31, local22)) {
					local71++;
				}
				@Pc(820) Class2_Sub1_Sub2 local820 = new Class2_Sub1_Sub2(local243, local51, Static85.anInt1536, anInt7351, local71, local59, Static192.method2572(local65, local59, anInt7351) - local45, local65, local22, local22, local31, local31, local55);
				Static311.aClass177_31.method3615(new Class5_Sub2_Sub7(local820));
			}
		} else if (arg0 == Static97.aClass163_2) {
			local12 = Static76.aClass5_Sub15_Sub2_1.method5585();
			local22 = Static367.anInt5964 + (local12 >> 4 & 0x7);
			local31 = Static45.anInt39 + (local12 & 0x7);
			local243 = Static76.aClass5_Sub15_Sub2_1.method5539();
			local45 = local243 >> 2;
			local51 = local243 & 0x3;
			local55 = Static30.anIntArray25[local45];
			if (Static152.method2172(Static148.anInt2668) || local22 >= 0 && local31 >= 0 && Static433.anInt7210 > local22 && Static418.anInt6969 > local31) {
				method5895(local31, local22, -1, local51, local55, anInt7351, local45);
			}
		} else {
			@Pc(939) byte local939;
			if (Static180.aClass163_3 == arg0) {
				@Pc(903) byte local903 = Static76.aClass5_Sub15_Sub2_1.method5600();
				local22 = Static76.aClass5_Sub15_Sub2_1.method5593();
				local31 = Static76.aClass5_Sub15_Sub2_1.method5578();
				local243 = local31 >> 2;
				local45 = local31 & 0x3;
				local51 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local55 = Static76.aClass5_Sub15_Sub2_1.method5598();
				@Pc(931) byte local931 = Static76.aClass5_Sub15_Sub2_1.method5548();
				local65 = Static76.aClass5_Sub15_Sub2_1.method5573();
				local939 = Static76.aClass5_Sub15_Sub2_1.method5600();
				local75 = Static76.aClass5_Sub15_Sub2_1.method5578();
				local79 = (local75 >> 4 & 0x7) + Static367.anInt5964;
				local83 = Static45.anInt39 + (local75 & 0x7);
				@Pc(962) byte local962 = Static76.aClass5_Sub15_Sub2_1.method5582();
				if (!Static407.aClass200_9.method5832()) {
					Static392.method5126(local22, local79, local939, local83, local903, local243, local45, local55, local51, local962, local931, local65, anInt7351);
				}
			} else if (arg0 == Static439.aClass163_17) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local22 = (local12 & 0x7) + Static45.anInt39;
				local31 = local22 + Static226.anInt3768;
				local243 = (local12 >> 4 & 0x7) + Static367.anInt5964;
				local45 = Static31.anInt618 + local243;
				local51 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local55 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local59 = Static76.aClass5_Sub15_Sub2_1.method5598();
				if (Static400.aClass252_38 != null) {
					@Pc(1040) Class5_Sub24 local1040 = (Class5_Sub24) Static400.aClass252_38.method5659((long) (local45 | anInt7351 << 28 | local31 << 14));
					if (local1040 != null) {
						for (@Pc(1048) Class5_Sub27 local1048 = (Class5_Sub27) local1040.aClass177_21.method3618(); local1048 != null; local1048 = (Class5_Sub27) local1040.aClass177_21.method3619()) {
							if ((local51 & 0x7FFF) == local1048.anInt4203 && local55 == local1048.anInt4204) {
								local1048.method6003();
								local1048.anInt4204 = local59;
								Static199.method2657(local31, anInt7351, local1048, local45);
								break;
							}
						}
						if (local243 >= 0 && local22 >= 0 && Static433.anInt7210 > local243 && Static418.anInt6969 > local22) {
							Static235.method3042(local22, anInt7351, local243);
						}
					}
				}
			} else if (Static377.aClass163_13 == arg0) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5585();
				local22 = local12 >> 2;
				local31 = local12 & 0x3;
				local243 = Static30.anIntArray25[local22];
				local45 = Static76.aClass5_Sub15_Sub2_1.method5591();
				local51 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local55 = Static367.anInt5964 + (local51 >> 4 & 0x7);
				local59 = (local51 & 0x7) + Static45.anInt39;
				if (Static152.method2172(Static148.anInt2668) || local55 >= 0 && local59 >= 0 && local55 < Static433.anInt7210 && Static418.anInt6969 > local59) {
					method5895(local59, local55, local45, local31, local243, anInt7351, local22);
				}
			} else if (Static258.aClass163_6 == arg0) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local22 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local31 = Static76.aClass5_Sub15_Sub2_1.method5578();
				local243 = Static45.anInt39 + (local31 & 0x7);
				local45 = Static226.anInt3768 + local243;
				local51 = Static367.anInt5964 + (local31 >> 4 & 0x7);
				local55 = local51 + Static31.anInt618;
				@Pc(1241) boolean local1241 = local51 >= 0 && local243 >= 0 && Static433.anInt7210 > local51 && local243 < Static418.anInt6969;
				if (local1241 || Static152.method2172(Static148.anInt2668)) {
					Static199.method2657(local45, anInt7351, new Class5_Sub27(local12, local22), local55);
					if (local1241) {
						Static235.method3042(local243, anInt7351, local51);
					}
				}
			} else if (Static426.aClass163_16 == arg0) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local22 = (local12 >> 4 & 0xF) + Static367.anInt5964 * 2;
				local31 = (local12 & 0xF) + Static45.anInt39 * 2;
				local39 = Static76.aClass5_Sub15_Sub2_1.method5539() != 0;
				local45 = Static76.aClass5_Sub15_Sub2_1.method5600() + local22;
				local51 = local31 + Static76.aClass5_Sub15_Sub2_1.method5600();
				local55 = Static76.aClass5_Sub15_Sub2_1.method5586();
				local59 = Static76.aClass5_Sub15_Sub2_1.method5586();
				local65 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local939 = Static76.aClass5_Sub15_Sub2_1.method5600();
				local75 = Static76.aClass5_Sub15_Sub2_1.method5539() * 4;
				local79 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local83 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local87 = Static76.aClass5_Sub15_Sub2_1.method5539();
				@Pc(1351) int local1351 = Static76.aClass5_Sub15_Sub2_1.method5598();
				if (local87 == 255) {
					local87 = -1;
				}
				if (local22 >= 0 && local31 >= 0 && Static433.anInt7210 * 2 > local22 && Static433.anInt7210 * 2 > local31 && local45 >= 0 && local51 >= 0 && Static418.anInt6969 * 2 > local45 && Static418.anInt6969 * 2 > local51 && local65 != 65535) {
					local45 *= 64;
					local22 *= 64;
					local75 <<= 0x0;
					local1351 <<= 0x0;
					local71 = local939 << 0;
					local51 = local51 * 64;
					local31 = local31 * 64;
					if (local55 != 0) {
						@Pc(1440) Class2_Sub1_Sub3 local1440 = null;
						@Pc(1452) int local1452;
						@Pc(1446) int local1446;
						@Pc(1456) int local1456;
						if (local55 >= 0) {
							local1446 = local55 - 1;
							local1452 = local1446 >> 11 & 0xF;
							local1456 = local1446 & 0x7FF;
							@Pc(1463) Class5_Sub7 local1463 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local1456);
							if (local1463 != null) {
								local1440 = local1463.aClass2_Sub1_Sub3_Sub1_1;
							}
						} else {
							local1446 = -local55 - 1;
							local1452 = local1446 >> 11 & 0xF;
							local1456 = local1446 & 0x7FF;
							if (local1456 == Static43.anInt5302) {
								local1440 = Static220.aClass2_Sub1_Sub3_Sub2_1;
							} else {
								local1440 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local1456];
							}
						}
						if (local1440 != null) {
							@Pc(1504) Class133 local1504 = local1440.method4910();
							if (local1504.anIntArrayArray25 != null && local1504.anIntArrayArray25[local1452] != null) {
								local1456 = local1504.anIntArrayArray25[local1452][0];
								@Pc(1526) int local1526 = local1504.anIntArrayArray25[local1452][2];
								@Pc(1531) int local1531 = local1440.aClass110_7.method2353();
								@Pc(1535) int local1535 = Class30.anIntArray38[local1531];
								@Pc(1539) int local1539 = Class30.anIntArray37[local1531];
								@Pc(1549) int local1549 = local1456 * local1539 + local1535 * local1526 >> 15;
								@Pc(1559) int local1559 = local1526 * local1539 - local1456 * local1535 >> 15;
								local22 += local1549;
								local31 += local1559;
								local71 -= local1504.anIntArrayArray25[local1452][1];
							}
						}
					}
					@Pc(1600) Class2_Sub1_Sub1 local1600 = new Class2_Sub1_Sub1(local65, anInt7351, local22, local31, local71, local79 + Static85.anInt1536, local83 - -Static85.anInt1536, local87, local1351, local59, local75, local39);
					local1600.method2119(Static192.method2572(local51, local45, anInt7351) - local75, local79 - -Static85.anInt1536, local51, local45);
					Static64.aClass177_3.method3615(new Class5_Sub2_Sub13(local1600));
				}
			} else if (arg0 == Static425.aClass163_15) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5593();
				local22 = Static76.aClass5_Sub15_Sub2_1.method5593();
				local31 = Static76.aClass5_Sub15_Sub2_1.method5591();
				local243 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local45 = (local243 & 0x7) + Static45.anInt39;
				local51 = Static226.anInt3768 + local45;
				local55 = (local243 >> 4 & 0x7) + Static367.anInt5964;
				local59 = Static31.anInt618 + local55;
				if (Static43.anInt5302 != local12) {
					@Pc(1694) boolean local1694 = local55 >= 0 && local45 >= 0 && local55 < Static433.anInt7210 && local45 < Static418.anInt6969;
					if (local1694 || Static152.method2172(Static148.anInt2668)) {
						Static199.method2657(local51, anInt7351, new Class5_Sub27(local22, local31), local59);
						if (local1694) {
							Static235.method3042(local45, anInt7351, local55);
						}
					}
				}
			} else if (arg0 == Static287.aClass163_8) {
				Static76.aClass5_Sub15_Sub2_1.method5539();
				local12 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local22 = (local12 >> 4 & 0x7) + Static367.anInt5964;
				local31 = (local12 & 0x7) + Static45.anInt39;
				local243 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local45 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local51 = Static76.aClass5_Sub15_Sub2_1.method5541();
				@Pc(1759) String local1759 = Static76.aClass5_Sub15_Sub2_1.method5549();
				Static46.method1522(local22, local45, anInt7351, local243, local51, local31, local1759);
			} else if (Static406.aClass163_14 == arg0) {
				local12 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local22 = Static76.aClass5_Sub15_Sub2_1.method5539();
				Static398.aClass256_4.method5782(local12).method2400(local22);
			} else {
				Static206.method2769("T3 - " + arg0, null);
				Static165.method2317(false);
			}
		}
	}
}
