import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sk", name = "B", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	public static void method7515() {
		if (!Static423.aBoolean549) {
			Static530.aBoolean634 = Static304.anInt4739 != -1 && Static223.anInt3566 >= Static304.anInt4739 || (Static530.aBoolean635 ? 26 : 22) + Static223.anInt3566 * 16 > Static316.anInt8165;
		}
		Static148.aClass124_23.method2567();
		Static566.aClass124_94.method2567();
		@Pc(45) int local45;
		for (@Pc(40) Class5_Sub2_Sub13 local40 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local40 != null; local40 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
			local45 = local40.anInt6711;
			if (local45 < 1000) {
				local40.method8829();
				if (local45 == 12 || local45 == 25 || local45 == 23 || local45 == 3 || local45 == 45 || local45 == 13 || local45 == 57) {
					Static566.aClass124_94.method2574(local40);
				} else {
					Static148.aClass124_23.method2574(local40);
				}
			}
		}
		Static148.aClass124_23.method2575(Static153.aClass124_24);
		Static566.aClass124_94.method2575(Static153.aClass124_24);
		if (Static223.anInt3566 > 1) {
			if (Static464.aBoolean585 && Static176.aClass157_1.method3300(81) && Static223.anInt3566 > 2) {
				Static529.aClass5_Sub2_Sub13_5 = (Class5_Sub2_Sub13) Static153.aClass124_24.aClass5_123.aClass5_338.aClass5_338;
			} else {
				Static529.aClass5_Sub2_Sub13_5 = (Class5_Sub2_Sub13) Static153.aClass124_24.aClass5_123.aClass5_338;
			}
			Static480.aClass5_Sub2_Sub13_4 = (Class5_Sub2_Sub13) Static153.aClass124_24.aClass5_123.aClass5_338;
		} else {
			Static480.aClass5_Sub2_Sub13_4 = null;
			Static529.aClass5_Sub2_Sub13_5 = null;
		}
		local45 = -1;
		@Pc(162) Class5_Sub25 local162 = (Class5_Sub25) Static598.aClass124_96.method2572();
		if (local162 != null) {
			local45 = local162.method3318();
		}
		if (!Static423.aBoolean549) {
			if (local45 == 0 && (Static171.anInt2827 == 1 && Static223.anInt3566 > 2 || Static360.method5299())) {
				local45 = 2;
			}
			if (local45 == 2 && Static223.anInt3566 > 0 && local162 != null) {
				if (Static610.aClass394_12 == null && Static429.anInt7587 == 0) {
					Static206.method2873(local162.method3315(), local162.method3313());
				} else {
					Static240.anInt3903 = 2;
				}
			}
			if (local45 == 0) {
				if (Static529.aClass5_Sub2_Sub13_5 != null) {
					Static537.method8646();
				} else if (Static386.aBoolean482) {
					Static355.method5247();
				}
			}
			if (Static610.aClass394_12 != null || Static429.anInt7587 != 0) {
				return;
			}
			Static105.aClass5_Sub2_Sub13_1 = null;
			Static240.anInt3903 = 0;
			return;
		}
		@Pc(177) int local177;
		@Pc(181) int local181;
		@Pc(251) int local251;
		@Pc(253) int local253;
		if (local45 == -1) {
			local177 = Static178.aClass111_1.method8703();
			local181 = Static178.aClass111_1.method8696();
			@Pc(183) boolean local183 = false;
			if (Static303.aClass5_Sub2_Sub5_1 != null) {
				if (Static501.anInt8524 - 10 <= local177 && local177 <= Static501.anInt8524 + Static469.anInt8171 + 10 && Static212.anInt3404 - 10 <= local181 && local181 <= Static212.anInt3404 + Static360.anInt6296 + 10) {
					local183 = true;
				} else {
					Static450.method6682();
				}
			}
			if (!local183) {
				if (Static73.anInt1175 - 10 > local177 || Static73.anInt1175 + Static342.anInt6177 + 10 < local177 || Static676.anInt9309 - 10 > local181 || local181 > Static676.anInt9309 + Static575.anInt9376 + 10) {
					Static74.method1092();
				} else if (Static530.aBoolean634) {
					local251 = -1;
					local253 = -1;
					@Pc(268) int local268;
					for (@Pc(255) int local255 = 0; local255 < Static150.anInt2471; local255++) {
						if (Static530.aBoolean635) {
							local268 = Static676.anInt9309 + local255 * 16 + 33;
							if (local181 > local268 - 13 && local268 + 4 > local181) {
								local251 = local255;
								local253 = local268 - 13;
								break;
							}
						} else {
							local268 = Static676.anInt9309 + local255 * 16 + 31;
							if (local181 > local268 - 13 && local181 < local268 + 3) {
								local251 = local255;
								local253 = local268 - 13;
								break;
							}
						}
					}
					if (local251 != -1) {
						local268 = 0;
						@Pc(343) Class277 local343 = new Class277(Static600.aClass150_16);
						for (@Pc(348) Class5_Sub2_Sub5 local348 = (Class5_Sub2_Sub5) local343.method6753(); local348 != null; local348 = (Class5_Sub2_Sub5) local343.method6752()) {
							if (local251 == local268) {
								if (local348.anInt2821 > 1) {
									Static251.method3317(local253, local181, local348);
								}
								break;
							}
							local268++;
						}
					}
				}
			}
		}
		if (local45 != 0) {
			return;
		}
		local177 = local162.method3315();
		local181 = local162.method3313();
		@Pc(407) int local407;
		@Pc(480) Class277 local480;
		@Pc(485) Class5_Sub2_Sub13 local485;
		if (Static303.aClass5_Sub2_Sub5_1 != null && local177 >= Static501.anInt8524 && Static501.anInt8524 + Static469.anInt8171 >= local177 && Static212.anInt3404 <= local181 && local181 <= Static360.anInt6296 + Static212.anInt3404) {
			local407 = -1;
			for (local251 = 0; local251 < Static303.aClass5_Sub2_Sub5_1.anInt2821; local251++) {
				if (Static530.aBoolean635) {
					local253 = Static212.anInt3404 + local251 * 16 + 33;
					if (local253 - 13 < local181 && local181 < local253 + 4) {
						local407 = local251;
					}
				} else {
					local253 = Static212.anInt3404 + local251 * 16 + 31;
					if (local181 > local253 - 13 && local253 + 3 > local181) {
						local407 = local251;
					}
				}
			}
			if (local407 != -1) {
				local253 = 0;
				local480 = new Class277(Static303.aClass5_Sub2_Sub5_1.aClass150_3);
				for (local485 = (Class5_Sub2_Sub13) local480.method6753(); local485 != null; local485 = (Class5_Sub2_Sub13) local480.method6752()) {
					if (local407 == local253) {
						Static265.method3769(local177, local181, local485);
						break;
					}
					local253++;
				}
			}
			Static74.method1092();
			return;
		}
		if (local177 < Static73.anInt1175 || Static342.anInt6177 + Static73.anInt1175 < local177 || local181 < Static676.anInt9309 || Static575.anInt9376 + Static676.anInt9309 < local181) {
			return;
		}
		if (!Static530.aBoolean634) {
			local407 = -1;
			for (local251 = 0; local251 < Static223.anInt3566; local251++) {
				if (Static530.aBoolean635) {
					local253 = (Static223.anInt3566 - local251 - 1) * 16 + Static676.anInt9309 + 33;
					if (local181 > local253 - 13 && local253 + 4 > local181) {
						local407 = local251;
					}
				} else {
					local253 = Static676.anInt9309 + (Static223.anInt3566 - local251 + -1) * 16 + 31;
					if (local181 > local253 - 13 && local253 + 3 > local181) {
						local407 = local251;
					}
				}
			}
			if (local407 != -1) {
				local253 = 0;
				@Pc(600) Class328 local600 = new Class328(Static153.aClass124_24);
				for (local485 = (Class5_Sub2_Sub13) local600.method7633(); local485 != null; local485 = (Class5_Sub2_Sub13) local600.method7631()) {
					if (local407 == local253) {
						Static265.method3769(local177, local181, local485);
						break;
					}
					local253++;
				}
			}
			Static74.method1092();
			return;
		}
		local407 = -1;
		for (local251 = 0; local251 < Static150.anInt2471; local251++) {
			if (Static530.aBoolean635) {
				local253 = local251 * 16 + Static676.anInt9309 + 33;
				if (local181 > local253 - 13 && local253 + 4 > local181) {
					local407 = local251;
					break;
				}
			} else {
				local253 = local251 * 16 + Static676.anInt9309 + 31;
				if (local181 > local253 - 13 && local181 < local253 + 3) {
					local407 = local251;
					break;
				}
			}
		}
		if (local407 == -1) {
			return;
		}
		local253 = 0;
		local480 = new Class277(Static600.aClass150_16);
		for (@Pc(714) Class5_Sub2_Sub5 local714 = (Class5_Sub2_Sub5) local480.method6753(); local714 != null; local714 = (Class5_Sub2_Sub5) local480.method6752()) {
			if (local253 == local407) {
				Static265.method3769(local177, local181, (Class5_Sub2_Sub13) local714.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67);
				Static74.method1092();
				return;
			}
			local253++;
		}
		return;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
	public static void method7516(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub2_Sub4 local12 = Static257.method3597(16, (long) arg0);
		local12.method2440();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!mja;IIIIIIIII)Z")
	public static boolean method7517(@OriginalArg(0) int arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg8;
		@Pc(16) int local16 = arg4 - 64;
		@Pc(26) int local26 = arg8 - 64;
		Static435.anIntArrayArray55[64][64] = 99;
		Static507.anIntArrayArray69[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static3.anIntArray1[0] = arg4;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static110.anIntArray104[0] = arg8;
		@Pc(54) int[][] local54 = arg1.anIntArrayArray50;
		while (local49 != local46) {
			local5 = Static3.anIntArray1[local46];
			local7 = Static110.anIntArray104[local46];
			@Pc(68) int local68 = local7 - local26;
			@Pc(73) int local73 = local5 - local16;
			local46 = local46 + 1 & 0xFFF;
			@Pc(84) int local84 = local5 - arg1.anInt6497;
			@Pc(89) int local89 = local7 - arg1.anInt6490;
			if (arg3 == -4) {
				if (local5 == arg7 && local7 == arg9) {
					Static498.anInt8492 = local7;
					Static29.anInt404 = local5;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static329.method5103(2, 2, arg6, local7, arg0, arg7, arg9, local5)) {
					Static498.anInt8492 = local7;
					Static29.anInt404 = local5;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg1.method5442(arg7, arg6, 2, local5, arg0, arg9, 2, arg2, local7)) {
					Static29.anInt404 = local5;
					Static498.anInt8492 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg1.method5457(arg9, arg6, local7, 2, arg2, arg0, arg7, local5)) {
					Static498.anInt8492 = local7;
					Static29.anInt404 = local5;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg1.method5455(2, arg3, arg5, local5, local7, arg7, arg9)) {
					Static498.anInt8492 = local7;
					Static29.anInt404 = local5;
					return true;
				}
			} else if (arg1.method5446(arg5, arg3, arg9, arg7, 2, local5, local7)) {
				Static29.anInt404 = local5;
				Static498.anInt8492 = local7;
				return true;
			}
			@Pc(248) int local248 = Static507.anIntArrayArray69[local73][local68] + 1;
			if (local73 > 0 && Static435.anIntArrayArray55[local73 - 1][local68] == 0 && (local54[local84 - 1][local89] & 0x43A40000) == 0 && (local54[local84 - 1][local89 + 1] & 0x4E240000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7;
				Static435.anIntArrayArray55[local73 - 1][local68] = 2;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local73 - 1][local68] = local248;
			}
			if (local73 < 126 && Static435.anIntArrayArray55[local73 + 1][local68] == 0 && (local54[local84 + 2][local89] & 0x60E40000) == 0 && (local54[local84 + 2][local89 + 1] & 0x78240000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local73 + 1][local68] = 8;
				Static507.anIntArrayArray69[local73 + 1][local68] = local248;
			}
			if (local68 > 0 && Static435.anIntArrayArray55[local73][local68 - 1] == 0 && (local54[local84][local89 - 1] & 0x43A40000) == 0 && (local54[local84 + 1][local89 - 1] & 0x60E40000) == 0) {
				Static3.anIntArray1[local49] = local5;
				Static110.anIntArray104[local49] = local7 - 1;
				Static435.anIntArrayArray55[local73][local68 - 1] = 1;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local73][local68 - 1] = local248;
			}
			if (local68 < 126 && Static435.anIntArrayArray55[local73][local68 + 1] == 0 && (local54[local84][local89 + 2] & 0x4E240000) == 0 && (local54[local84 + 1][local89 + 2] & 0x78240000) == 0) {
				Static3.anIntArray1[local49] = local5;
				Static110.anIntArray104[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local73][local68 + 1] = 4;
				Static507.anIntArrayArray69[local73][local68 + 1] = local248;
			}
			if (local73 > 0 && local68 > 0 && Static435.anIntArrayArray55[local73 - 1][local68 - 1] == 0 && (local54[local84 - 1][local89] & 0x4FA40000) == 0 && (local54[local84 - 1][local89 - 1] & 0x43A40000) == 0 && (local54[local84][local89 - 1] & 0x63E40000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7 - 1;
				Static435.anIntArrayArray55[local73 - 1][local68 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local73 - 1][local68 - 1] = local248;
			}
			if (local73 < 126 && local68 > 0 && Static435.anIntArrayArray55[local73 + 1][local68 - 1] == 0 && (local54[local84 + 1][local89 - 1] & 0x63E40000) == 0 && (local54[local84 + 2][local89 - 1] & 0x60E40000) == 0 && (local54[local84 + 2][local89] & 0x78E40000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7 - 1;
				Static435.anIntArrayArray55[local73 + 1][local68 - 1] = 9;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local73 + 1][local68 - 1] = local248;
			}
			if (local73 > 0 && local68 < 126 && Static435.anIntArrayArray55[local73 - 1][local68 + 1] == 0 && (local54[local84 - 1][local89 + 1] & 0x4FA40000) == 0 && (local54[local84 - 1][local89 + 2] & 0x4E240000) == 0 && (local54[local84][local89 + 2] & 0x7E240000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local73 - 1][local68 + 1] = 6;
				Static507.anIntArrayArray69[local73 - 1][local68 + 1] = local248;
			}
			if (local73 < 126 && local68 < 126 && Static435.anIntArrayArray55[local73 + 1][local68 + 1] == 0 && (local54[local84 + 1][local89 + 2] & 0x7E240000) == 0 && (local54[local84 + 2][local89 + 2] & 0x78240000) == 0 && (local54[local84 + 2][local89 + 1] & 0x78E40000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7 + 1;
				Static435.anIntArrayArray55[local73 + 1][local68 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local73 + 1][local68 + 1] = local248;
			}
		}
		Static29.anInt404 = local5;
		Static498.anInt8492 = local7;
		return false;
	}
}
