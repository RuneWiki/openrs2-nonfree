import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_4 = new Class299();

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
	public static final int[] anIntArray469 = new int[32];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method5697() {
		if (Static152.aClass69_1 != null) {
			Static152.aClass69_1.method6840();
		}
		if (Static349.aClass69_2 != null) {
			Static349.aClass69_2.method6840();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5698(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, local9 + arg0.length())) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(arg2.length() + local9);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ml;Z)V")
	public static void method5699(@OriginalArg(0) Class202 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (Static265.aClass202_27 == arg0) {
			local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
			local20 = (local12 >> 4 & 0x7) + client.lb;
			local27 = Static392.anInt7423 + (local12 & 0x7);
			local31 = Static394.aClass12_Sub8_Sub2_2.method5210();
			local35 = Static394.aClass12_Sub8_Sub2_2.method5216();
			local39 = local35 >> 2;
			local43 = local35 & 0x3;
			local47 = Static58.anIntArray137[local39];
			if (Static267.method4549(Static184.anInt4228) || local20 >= 0 && local27 >= 0 && local20 < Static37.anInt7512 && local27 < Static329.anInt6247) {
				Static347.method5469(local39, local47, local20, Static414.anInt7744, local31, local27, local43);
			}
		} else if (Static108.aClass202_12 == arg0) {
			local12 = Static394.aClass12_Sub8_Sub2_2.method5202();
			local20 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static58.anIntArray137[local20];
			local35 = Static394.aClass12_Sub8_Sub2_2.method5184();
			local39 = client.lb + (local35 >> 4 & 0x7);
			local43 = Static392.anInt7423 + (local35 & 0x7);
			if (Static267.method4549(Static184.anInt4228) || local39 >= 0 && local43 >= 0 && local39 < Static37.anInt7512 && local43 < Static329.anInt6247) {
				Static347.method5469(local20, local31, local39, Static414.anInt7744, -1, local43, local27);
			}
		} else if (arg0 == Static237.aClass202_25) {
			local12 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local20 = Static394.aClass12_Sub8_Sub2_2.method5216();
			Static49.aClass155_2.method4063(local12).method6877(local20);
		} else if (Static441.aClass202_47 == arg0) {
			local12 = Static394.aClass12_Sub8_Sub2_2.method5184();
			local20 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static58.anIntArray137[local20];
			local35 = Static394.aClass12_Sub8_Sub2_2.method5202();
			local39 = (local35 >> 4 & 0x7) + client.lb;
			local43 = Static392.anInt7423 + (local35 & 0x7);
			local47 = Static394.aClass12_Sub8_Sub2_2.method5198();
			if (local47 == 65535) {
				local47 = -1;
			}
			Static11.method296(local20, Static414.anInt7744, local27, local39, local43, local47, local31);
		} else if (arg0 == Static22.aClass202_48) {
			Static394.aClass12_Sub8_Sub2_2.method5216();
			local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
			local20 = (local12 >> 4 & 0x7) + client.lb;
			local27 = (local12 & 0x7) + Static392.anInt7423;
			local31 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local35 = Static394.aClass12_Sub8_Sub2_2.method5216();
			local39 = Static394.aClass12_Sub8_Sub2_2.method5195();
			@Pc(265) String local265 = Static394.aClass12_Sub8_Sub2_2.method5206();
			Static239.method4173(local27, local20, local31, local265, local39, local35, Static414.anInt7744);
		} else if (Static108.aClass202_13 == arg0) {
			local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
			local20 = Static392.anInt7423 + (local12 & 0x7);
			local27 = Static203.anInt4534 + local20;
			local31 = (local12 >> 4 & 0x7) + client.lb;
			local35 = local31 + Static61.anInt1459;
			local39 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local43 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local47 = Static394.aClass12_Sub8_Sub2_2.method5199();
			if (Static295.aClass68_45 != null) {
				@Pc(335) Class12_Sub28 local335 = (Class12_Sub28) Static295.aClass68_45.method1917((long) (local35 | Static414.anInt7744 << 28 | local27 << 14));
				if (local335 != null) {
					for (@Pc(343) Class12_Sub46 local343 = (Class12_Sub46) local335.aClass73_42.method2005(); local343 != null; local343 = (Class12_Sub46) local335.aClass73_42.method2009()) {
						if (local343.anInt8179 == (local39 & 0x7FFF) && local343.anInt8181 == local43) {
							local343.method7967();
							local343.anInt8181 = local47;
							Static118.method2462(local35, local27, local343, Static414.anInt7744);
							break;
						}
					}
					if (local31 >= 0 && local20 >= 0 && Static37.anInt7512 > local31 && local20 < Static329.anInt6247) {
						Static534.method7449(Static414.anInt7744, local31, local20);
					}
				}
			}
		} else {
			@Pc(460) int local460;
			@Pc(481) int local481;
			if (Static67.aClass202_5 == arg0) {
				local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local20 = client.lb + (local12 >> 4 & 0x7);
				local27 = Static392.anInt7423 + (local12 & 0x7);
				local31 = Static394.aClass12_Sub8_Sub2_2.method5199();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				local47 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local460 = Static394.aClass12_Sub8_Sub2_2.method5216();
				if (local20 >= 0 && local27 >= 0 && Static37.anInt7512 > local20 && local27 < Static329.anInt6247) {
					local481 = local39 + 1;
					if (local20 - local481 <= Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] && Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] <= local481 + local20 && Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0] >= local27 - local481 && Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0] <= local27 + local481) {
						Static206.method7968(local39 + (Static414.anInt7744 << 24) + (local20 << 16) + (local27 << 8), local460, local43, local47, local31);
					}
				}
			} else if (Static183.aClass202_23 == arg0) {
				local12 = Static394.aClass12_Sub8_Sub2_2.method5202();
				local20 = Static392.anInt7423 + (local12 & 0x7);
				local27 = local20 + Static203.anInt4534;
				local31 = (local12 >> 4 & 0x7) + client.lb;
				local35 = local31 + Static61.anInt1459;
				local39 = Static394.aClass12_Sub8_Sub2_2.method5204();
				local43 = Static394.aClass12_Sub8_Sub2_2.method5210();
				local47 = Static394.aClass12_Sub8_Sub2_2.method5204();
				if (local47 != Static396.anInt7452) {
					@Pc(612) boolean local612 = local31 >= 0 && local20 >= 0 && Static37.anInt7512 > local31 && Static329.anInt6247 > local20;
					if (local612 || Static267.method4549(Static184.anInt4228)) {
						Static118.method2462(local35, local27, new Class12_Sub46(local39, local43), Static414.anInt7744);
						if (local612) {
							Static534.method7449(Static414.anInt7744, local31, local20);
						}
					}
				}
			} else {
				@Pc(689) int local689;
				@Pc(693) int local693;
				@Pc(685) byte local685;
				if (Static90.aClass202_8 == arg0) {
					@Pc(643) byte local643 = Static394.aClass12_Sub8_Sub2_2.method5222();
					local20 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local27 = Static394.aClass12_Sub8_Sub2_2.method5202();
					local31 = (local27 >> 4 & 0x7) + client.lb;
					local35 = (local27 & 0x7) + Static392.anInt7423;
					local39 = Static394.aClass12_Sub8_Sub2_2.method5198();
					local43 = Static394.aClass12_Sub8_Sub2_2.method5177();
					local47 = local43 >> 2;
					local460 = local43 & 0x3;
					local685 = Static394.aClass12_Sub8_Sub2_2.method5222();
					local689 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local693 = Static394.aClass12_Sub8_Sub2_2.method5227();
					@Pc(697) byte local697 = Static394.aClass12_Sub8_Sub2_2.method5168();
					@Pc(701) byte local701 = Static394.aClass12_Sub8_Sub2_2.method5209();
					if (!Static243.aClass42_4.method5843()) {
						Static405.method6341(local643, local689, local701, local39, local20, local47, local697, local31, local693, Static414.anInt7744, local460, local35, local685);
					}
				} else {
					@Pc(800) int local800;
					@Pc(804) int local804;
					@Pc(907) Class30_Sub1_Sub5 local907;
					@Pc(756) boolean local756;
					if (Static393.aClass202_36 == arg0) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local20 = (local12 >> 4 & 0xF) + client.lb * 2;
						local27 = Static392.anInt7423 * 2 + (local12 & 0xF);
						local756 = Static394.aClass12_Sub8_Sub2_2.method5216() != 0;
						local35 = Static394.aClass12_Sub8_Sub2_2.method5173() + local20;
						local39 = Static394.aClass12_Sub8_Sub2_2.method5173() + local27;
						local43 = Static394.aClass12_Sub8_Sub2_2.method5217();
						local47 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local460 = Static394.aClass12_Sub8_Sub2_2.method5216() * 4;
						local481 = Static394.aClass12_Sub8_Sub2_2.method5216() * 4;
						local689 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local693 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local800 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local804 = Static394.aClass12_Sub8_Sub2_2.method5199();
						if (local800 == 255) {
							local800 = -1;
						}
						if (local20 >= 0 && local27 >= 0 && Static37.anInt7512 * 2 > local20 && Static37.anInt7512 * 2 > local27 && local35 >= 0 && local39 >= 0 && local35 < Static329.anInt6247 * 2 && Static329.anInt6247 * 2 > local39 && local47 != 65535) {
							local460 <<= 0x0;
							local35 *= 64;
							local20 *= 64;
							local39 *= 64;
							local481 <<= 0x0;
							local804 <<= 0x0;
							local27 = local27 * 64;
							local907 = new Class30_Sub1_Sub5(local47, Static414.anInt7744, local20, local27, local460, local689 + Static409.anInt7683, Static409.anInt7683 + local693, local800, local804, local43, local481, local756);
							local907.method7190(Static409.anInt7683 + local689, local35, Static443.method6717(local35, local39, Static414.anInt7744) - local481, local39);
							Static475.aClass73_69.method2012(new Class12_Sub4_Sub12(local907));
						}
					} else if (arg0 == Static56.aClass202_4) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local20 = (local12 >> 4 & 0xF) + client.lb * 2;
						local27 = Static392.anInt7423 * 2 + (local12 & 0xF);
						local756 = Static394.aClass12_Sub8_Sub2_2.method5216() != 0;
						local35 = local20 + Static394.aClass12_Sub8_Sub2_2.method5173();
						local39 = Static394.aClass12_Sub8_Sub2_2.method5173() + local27;
						local43 = Static394.aClass12_Sub8_Sub2_2.method5217();
						local47 = Static394.aClass12_Sub8_Sub2_2.method5217();
						local460 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local685 = Static394.aClass12_Sub8_Sub2_2.method5173();
						local689 = Static394.aClass12_Sub8_Sub2_2.method5216() * 4;
						local693 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local800 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local804 = Static394.aClass12_Sub8_Sub2_2.method5216();
						@Pc(1015) int local1015 = Static394.aClass12_Sub8_Sub2_2.method5199();
						if (local804 == 255) {
							local804 = -1;
						}
						if (local20 >= 0 && local27 >= 0 && local20 < Static37.anInt7512 * 2 && local27 < Static37.anInt7512 * 2 && local35 >= 0 && local39 >= 0 && Static329.anInt6247 * 2 > local35 && Static329.anInt6247 * 2 > local39 && local460 != 65535) {
							local481 = local685 << 0;
							local39 = local39 * 64;
							local35 *= 64;
							local27 *= 64;
							local1015 <<= 0x0;
							local689 <<= 0x0;
							local20 *= 64;
							if (local43 != 0) {
								@Pc(1114) Class30_Sub1_Sub1 local1114 = null;
								@Pc(1127) int local1127;
								@Pc(1121) int local1121;
								@Pc(1131) int local1131;
								if (local43 < 0) {
									local1121 = -local43 - 1;
									local1127 = local1121 >> 11 & 0xF;
									local1131 = local1121 & 0x7FF;
									if (local1131 == Static396.anInt7452) {
										local1114 = Static440.aClass30_Sub1_Sub1_Sub1_2;
									} else {
										local1114 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local1131];
									}
								} else {
									local1121 = local43 - 1;
									local1131 = local1121 & 0x7FF;
									local1127 = local1121 >> 11 & 0xF;
									@Pc(1163) Class12_Sub41 local1163 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local1131);
									if (local1163 != null) {
										local1114 = local1163.aClass30_Sub1_Sub1_Sub2_2;
									}
								}
								if (local1114 != null) {
									@Pc(1174) Class166 local1174 = local1114.method3602();
									if (local1174.anIntArrayArray48 != null && local1174.anIntArrayArray48[local1127] != null) {
										local1131 = local1174.anIntArrayArray48[local1127][0];
										@Pc(1196) int local1196 = local1174.anIntArrayArray48[local1127][2];
										@Pc(1201) int local1201 = local1114.aClass221_7.method5389();
										@Pc(1205) int local1205 = Class12_Sub1_Sub36.anIntArray667[local1201];
										@Pc(1209) int local1209 = Class12_Sub1_Sub36.anIntArray668[local1201];
										@Pc(1219) int local1219 = local1205 * local1196 + local1131 * local1209 >> 15;
										@Pc(1230) int local1230 = local1209 * local1196 - local1131 * local1205 >> 15;
										local481 -= local1174.anIntArrayArray48[local1127][1];
										local27 += local1230;
										local20 += local1219;
									}
								}
							}
							@Pc(1270) Class30_Sub1_Sub5 local1270 = new Class30_Sub1_Sub5(local460, Static414.anInt7744, local20, local27, local481, Static409.anInt7683 + local693, local800 - -Static409.anInt7683, local804, local1015, local47, local689, local756);
							local1270.method7190(local693 + Static409.anInt7683, local35, Static443.method6717(local35, local39, Static414.anInt7744) - local689, local39);
							Static475.aClass73_69.method2012(new Class12_Sub4_Sub12(local1270));
						}
					} else if (Static180.aClass202_22 == arg0) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local20 = (local12 >> 4 & 0x7) + client.lb;
						local27 = (local12 & 0x7) + Static392.anInt7423;
						local31 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local35 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local39 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local43 = Static394.aClass12_Sub8_Sub2_2.method5216();
						if (local20 >= 0 && local27 >= 0 && Static37.anInt7512 > local20 && local27 < Static329.anInt6247) {
							local47 = local20 * 128 + 64;
							local460 = local27 * 128 + 64;
							local481 = Static414.anInt7744;
							if (local481 < 3 && Static112.method2322(local27, local20)) {
								local481++;
							}
							@Pc(1401) Class30_Sub1_Sub4 local1401 = new Class30_Sub1_Sub4(local31, local39, Static409.anInt7683, Static414.anInt7744, local481, local47, Static443.method6717(local47, local460, Static414.anInt7744) - local35, local460, local20, local20, local27, local27, local43);
							Static376.aClass73_77.method2012(new Class12_Sub4_Sub15(local1401));
						}
					} else if (Static29.aClass202_2 == arg0) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local20 = Static394.aClass12_Sub8_Sub2_2.method5184();
						local27 = Static392.anInt7423 + (local20 & 0x7);
						local31 = Static203.anInt4534 + local27;
						local35 = (local20 >> 4 & 0x7) + client.lb;
						local39 = local35 + Static61.anInt1459;
						local43 = Static394.aClass12_Sub8_Sub2_2.method5204();
						@Pc(1471) boolean local1471 = local35 >= 0 && local27 >= 0 && Static37.anInt7512 > local35 && Static329.anInt6247 > local27;
						if (local1471 || Static267.method4549(Static184.anInt4228)) {
							Static118.method2462(local39, local31, new Class12_Sub46(local43, local12), Static414.anInt7744);
							if (local1471) {
								Static534.method7449(Static414.anInt7744, local35, local27);
							}
						}
					} else if (Static513.aClass202_46 == arg0) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5216();
						@Pc(1513) boolean local1513 = (local12 & 0x80) != 0;
						local27 = client.lb + (local12 >> 3 & 0x7);
						local31 = (local12 & 0x7) + Static392.anInt7423;
						local35 = local27 + Static394.aClass12_Sub8_Sub2_2.method5173();
						local39 = local31 + Static394.aClass12_Sub8_Sub2_2.method5173();
						local43 = Static394.aClass12_Sub8_Sub2_2.method5217();
						local47 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local460 = Static394.aClass12_Sub8_Sub2_2.method5216() * 4;
						local481 = Static394.aClass12_Sub8_Sub2_2.method5216() * 4;
						local689 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local693 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local800 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local804 = Static394.aClass12_Sub8_Sub2_2.method5199();
						if (local800 == 255) {
							local800 = -1;
						}
						if (local27 >= 0 && local31 >= 0 && local27 < Static37.anInt7512 && local31 < Static329.anInt6247 && local35 >= 0 && local39 >= 0 && local35 < Static37.anInt7512 && local39 < Static329.anInt6247 && local47 != 65535) {
							local804 <<= 0x0;
							local31 = local31 * 128 + 64;
							local460 <<= 0x0;
							local27 = local27 * 128 + 64;
							local481 <<= 0x0;
							local39 = local39 * 128 + 64;
							local35 = local35 * 128 + 64;
							local907 = new Class30_Sub1_Sub5(local47, Static414.anInt7744, local27, local31, local460, Static409.anInt7683 + local689, local693 - -Static409.anInt7683, local800, local804, local43, local481, local1513);
							local907.method7190(local689 + Static409.anInt7683, local35, Static443.method6717(local35, local39, Static414.anInt7744) - local481, local39);
							Static475.aClass73_69.method2012(new Class12_Sub4_Sub12(local907));
						}
					} else if (Static88.aClass202_7 == arg0) {
						local12 = Static394.aClass12_Sub8_Sub2_2.method5198();
						local20 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local27 = Static392.anInt7423 + (local20 & 0x7);
						local31 = Static203.anInt4534 + local27;
						local35 = client.lb + (local20 >> 4 & 0x7);
						local39 = Static61.anInt1459 + local35;
						@Pc(1752) Class12_Sub28 local1752 = (Class12_Sub28) Static295.aClass68_45.method1917((long) (Static414.anInt7744 << 28 | local31 << 14 | local39));
						if (local1752 != null) {
							for (@Pc(1760) Class12_Sub46 local1760 = (Class12_Sub46) local1752.aClass73_42.method2005(); local1760 != null; local1760 = (Class12_Sub46) local1752.aClass73_42.method2009()) {
								if (local1760.anInt8179 == (local12 & 0x7FFF)) {
									local1760.method7967();
									break;
								}
							}
							if (local1752.aClass73_42.method2015()) {
								local1752.method7967();
							}
							if (local35 >= 0 && local27 >= 0 && local35 < Static37.anInt7512 && local27 < Static329.anInt6247) {
								Static534.method7449(Static414.anInt7744, local35, local27);
							}
						}
					} else {
						Static508.method7541(null, "T3 - " + arg0);
						Static10.method291(false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(FIIFI[BLclient!ar;FFIIFI)V")
	public static void method5701(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) Class19 arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static358.method5602(arg2, arg5, arg3, arg0, arg6, arg7, local7, arg1, arg4);
			arg2 += 16384;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILclient!be;ILclient!be;III)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class30_Sub1_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class30_Sub1_Sub1 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method3590();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class84 local20 = (Class84) Static355.aClass125_51.method3446((long) local7);
		if (local20 == null) {
			@Pc(27) Class40[] local27 = Static550.method895(Static440.aClass16_103, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static243.aClass42_4.method5839(local27[0]);
			Static355.aClass125_51.method3437(local20, (long) local7);
		}
		Static361.method5626(arg2.anInt9418, arg1 >> 1, arg2.method3591() * 64, arg2.anInt9416, arg2.aByte99, arg5 >> 1, 0);
		@Pc(76) int local76 = arg3 + Static147.anIntArray243[0] - 18;
		@Pc(91) int local91 = arg0 + Static147.anIntArray243[1] - 54 - 16;
		@Pc(99) int local99 = local76 + arg6 / 4 * 18;
		@Pc(107) int local107 = local91 + arg6 % 4 * 18;
		local20.method7487(local99, local107);
		if (arg2 == arg4) {
			Static243.aClass42_4.method5811(-256, 18, 18, local99 - 1, local107 + -1);
		}
		@Pc(129) Class7_Sub7 local129 = Static434.method6611();
		local129.anInt9250 = local107 + 16;
		local129.anInt9254 = local99 + 16;
		local129.anInt9251 = local107;
		local129.aClass30_Sub1_Sub1_1 = arg4;
		local129.anInt9253 = local99;
		Static526.aClass149_8.method3984(local129);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!tb;")
	public static Class282 method5703(@OriginalArg(1) int arg0) {
		@Pc(10) Class282 local10 = (Class282) Static423.aClass125_3.method3446((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static323.aClass16_81.method408(0, arg0);
		local10 = new Class282();
		if (local20 != null) {
			local10.method6936(new Class12_Sub8(local20));
		}
		local10.method6935();
		Static423.aClass125_3.method3437(local10, (long) arg0);
		return local10;
	}
}
