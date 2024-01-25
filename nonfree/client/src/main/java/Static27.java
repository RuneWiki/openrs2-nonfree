import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!du;I)V")
	public static void method390(@OriginalArg(0) Class62 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(51) int local51;
		if (arg0 == Static209.aClass62_24) {
			local12 = Static413.aClass1_Sub19_Sub2_1.method2884();
			local20 = (local12 >> 4 & 0x7) + Static31.anInt477;
			local26 = (local12 & 0x7) + Static455.anInt7235;
			local30 = Static413.aClass1_Sub19_Sub2_1.method2882();
			if (local30 == 65535) {
				local30 = -1;
			}
			local39 = Static413.aClass1_Sub19_Sub2_1.method2928();
			local43 = local39 >> 2;
			local47 = local39 & 0x3;
			local51 = Static17.anIntArray311[local43];
			Static345.method4493(local20, local47, local26, local43, Static356.anInt5795, local30, local51);
		} else if (arg0 == Static109.aClass62_12) {
			local12 = Static413.aClass1_Sub19_Sub2_1.method2896();
			local20 = Static413.aClass1_Sub19_Sub2_1.method2915();
			Static86.aClass248_7.method5246(local12).method1574(local20);
		} else if (arg0 == Static201.aClass62_22) {
			local12 = Static413.aClass1_Sub19_Sub2_1.method2884();
			local20 = Static31.anInt477 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static455.anInt7235;
			local30 = Static413.aClass1_Sub19_Sub2_1.method2928();
			local39 = local30 >> 2;
			local43 = local30 & 0x3;
			local47 = Static17.anIntArray311[local39];
			local51 = Static413.aClass1_Sub19_Sub2_1.method2882();
			if (Static98.method1148(Static70.anInt4903) || local20 >= 0 && local26 >= 0 && local20 < Static147.anInt2300 && Static293.anInt4886 > local26) {
				Static431.method5461(Static356.anInt5795, local43, local39, local26, local51, local20, local47);
			}
		} else if (arg0 == Static208.aClass62_23) {
			local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
			local20 = Static455.anInt7235 + (local12 & 0x7);
			local26 = local20 + Static47.anInt676;
			local30 = Static31.anInt477 + (local12 >> 4 & 0x7);
			local39 = local30 + Static315.anInt5207;
			local43 = Static413.aClass1_Sub19_Sub2_1.method2896();
			local47 = Static413.aClass1_Sub19_Sub2_1.method2896();
			local51 = Static413.aClass1_Sub19_Sub2_1.method2896();
			if (Static402.aClass208_37 != null) {
				@Pc(221) Class1_Sub32 local221 = (Class1_Sub32) Static402.aClass208_37.method4405((long) (Static356.anInt5795 << 28 | local26 << 14 | local39));
				if (local221 != null) {
					for (@Pc(229) Class1_Sub39 local229 = (Class1_Sub39) local221.aClass14_26.method203(); local229 != null; local229 = (Class1_Sub39) local221.aClass14_26.method208()) {
						if (local229.anInt5803 == (local43 & 0x7FFF) && local229.anInt5805 == local47) {
							local229.method5953();
							local229.anInt5805 = local51;
							Static302.method4040(local39, local229, local26, Static356.anInt5795);
							break;
						}
					}
					if (local30 >= 0 && local20 >= 0 && local30 < Static147.anInt2300 && local20 < Static293.anInt4886) {
						Static370.method4827(local30, Static356.anInt5795, local20);
					}
				}
			}
		} else if (Static443.aClass62_39 == arg0) {
			local12 = Static413.aClass1_Sub19_Sub2_1.method2882();
			local20 = Static413.aClass1_Sub19_Sub2_1.method2928();
			local26 = Static455.anInt7235 + (local20 & 0x7);
			local30 = Static47.anInt676 + local26;
			local39 = Static31.anInt477 + (local20 >> 4 & 0x7);
			local43 = local39 + Static315.anInt5207;
			@Pc(347) Class1_Sub32 local347 = (Class1_Sub32) Static402.aClass208_37.method4405((long) (local30 << 14 | Static356.anInt5795 << 28 | local43));
			if (local347 != null) {
				for (@Pc(355) Class1_Sub39 local355 = (Class1_Sub39) local347.aClass14_26.method203(); local355 != null; local355 = (Class1_Sub39) local347.aClass14_26.method208()) {
					if (local355.anInt5803 == (local12 & 0x7FFF)) {
						local355.method5953();
						break;
					}
				}
				if (local347.aClass14_26.method209()) {
					local347.method5953();
				}
				if (local39 >= 0 && local26 >= 0 && local39 < Static147.anInt2300 && local26 < Static293.anInt4886) {
					Static370.method4827(local39, Static356.anInt5795, local26);
				}
			}
		} else {
			@Pc(473) int local473;
			@Pc(479) int local479;
			@Pc(483) int local483;
			@Pc(487) int local487;
			@Pc(491) int local491;
			@Pc(495) int local495;
			@Pc(593) Class11_Sub1_Sub5 local593;
			@Pc(446) boolean local446;
			if (Static145.aClass62_16 == arg0) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local20 = (local12 >> 4 & 0xF) + Static31.anInt477 * 2;
				local26 = (local12 & 0xF) + Static455.anInt7235 * 2;
				local446 = Static413.aClass1_Sub19_Sub2_1.method2915() != 0;
				local39 = Static413.aClass1_Sub19_Sub2_1.method2917() + local20;
				local43 = local26 + Static413.aClass1_Sub19_Sub2_1.method2917();
				local47 = Static413.aClass1_Sub19_Sub2_1.method2929();
				local51 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local473 = Static413.aClass1_Sub19_Sub2_1.method2915() * 4;
				local479 = Static413.aClass1_Sub19_Sub2_1.method2915() * 4;
				local483 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local487 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local491 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local495 = Static413.aClass1_Sub19_Sub2_1.method2896();
				if (local491 == 255) {
					local491 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && Static147.anInt2300 * 2 > local20 && Static147.anInt2300 * 2 > local26 && local39 >= 0 && local43 >= 0 && local39 < Static293.anInt4886 * 2 && Static293.anInt4886 * 2 > local43 && local51 != 65535) {
					local495 <<= 0x0;
					local20 = local20 * 64;
					local43 *= 64;
					local473 <<= 0x0;
					local39 = local39 * 64;
					local26 = local26 * 64;
					local479 <<= 0x0;
					local593 = new Class11_Sub1_Sub5(local51, Static356.anInt5795, local20, local26, local473, local483 + Static98.anInt1304, Static98.anInt1304 + local487, local491, local495, local47, local479, local446);
					local593.method4959(Static98.anInt1304 + local483, -local479 + Static135.method1732(local39, local43, Static356.anInt5795), local39, local43);
					Static454.aClass14_52.method205(new Class1_Sub3_Sub8(local593));
				}
			} else if (arg0 == Static452.aClass62_40) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2938();
				local20 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local26 = Static455.anInt7235 + (local20 & 0x7);
				local30 = local26 + Static47.anInt676;
				local39 = (local20 >> 4 & 0x7) + Static31.anInt477;
				local43 = local39 + Static315.anInt5207;
				local47 = Static413.aClass1_Sub19_Sub2_1.method2896();
				@Pc(677) boolean local677 = local39 >= 0 && local26 >= 0 && local39 < Static147.anInt2300 && Static293.anInt4886 > local26;
				if (local677 || Static98.method1148(Static70.anInt4903)) {
					Static302.method4040(local43, new Class1_Sub39(local47, local12), local30, Static356.anInt5795);
					if (local677) {
						Static370.method4827(local39, Static356.anInt5795, local26);
					}
				}
			} else if (arg0 == Static246.aClass62_29) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2892();
				local20 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local26 = Static413.aClass1_Sub19_Sub2_1.method2928();
				local30 = Static455.anInt7235 + (local26 & 0x7);
				local39 = Static47.anInt676 + local30;
				local43 = (local26 >> 4 & 0x7) + Static31.anInt477;
				local47 = local43 + Static315.anInt5207;
				local51 = Static413.aClass1_Sub19_Sub2_1.method2892();
				if (local20 != Static220.anInt4038) {
					@Pc(760) boolean local760 = local43 >= 0 && local30 >= 0 && local43 < Static147.anInt2300 && Static293.anInt4886 > local30;
					if (local760 || Static98.method1148(Static70.anInt4903)) {
						Static302.method4040(local47, new Class1_Sub39(local51, local12), local39, Static356.anInt5795);
						if (local760) {
							Static370.method4827(local43, Static356.anInt5795, local30);
						}
					}
				}
			} else if (arg0 == Static233.aClass62_28) {
				Static413.aClass1_Sub19_Sub2_1.method2915();
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local20 = (local12 >> 4 & 0x7) + Static31.anInt477;
				local26 = (local12 & 0x7) + Static455.anInt7235;
				local30 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local39 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local43 = Static413.aClass1_Sub19_Sub2_1.method2881();
				@Pc(825) String local825 = Static413.aClass1_Sub19_Sub2_1.method2914();
				Static109.method1375(Static356.anInt5795, local20, local30, local43, local825, local39, local26);
			} else if (Static345.aClass62_33 == arg0) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2938();
				local20 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local26 = Static31.anInt477 + (local20 >> 4 & 0x7);
				local30 = (local20 & 0x7) + Static455.anInt7235;
				@Pc(865) byte local865 = Static413.aClass1_Sub19_Sub2_1.method2910();
				@Pc(869) byte local869 = Static413.aClass1_Sub19_Sub2_1.method2910();
				local47 = Static413.aClass1_Sub19_Sub2_1.method2928();
				local51 = local47 >> 2;
				local473 = local47 & 0x3;
				local479 = Static413.aClass1_Sub19_Sub2_1.method2882();
				local483 = Static413.aClass1_Sub19_Sub2_1.method2901();
				@Pc(893) byte local893 = Static413.aClass1_Sub19_Sub2_1.method2923();
				local491 = Static413.aClass1_Sub19_Sub2_1.method2892();
				@Pc(901) byte local901 = Static413.aClass1_Sub19_Sub2_1.method2923();
				if (!Static186.aClass117_3.method5689()) {
					Static293.method3905(local30, local483, local491, local12, local869, local893, local473, Static356.anInt5795, local51, local901, local26, local479, local865);
				}
			} else if (Static169.aClass62_32 == arg0) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local20 = Static31.anInt477 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static455.anInt7235;
				local30 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local39 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local43 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local47 = Static413.aClass1_Sub19_Sub2_1.method2915();
				if (local20 >= 0 && local26 >= 0 && Static147.anInt2300 > local20 && Static293.anInt4886 > local26) {
					local51 = local20 * 128 + 64;
					local473 = local26 * 128 + 64;
					local479 = Static356.anInt5795;
					if (local479 < 3 && Static141.method4892(local26, local20)) {
						local479++;
					}
					@Pc(1020) Class11_Sub1_Sub6 local1020 = new Class11_Sub1_Sub6(local30, local43, Static98.anInt1304, Static356.anInt5795, local479, local51, Static135.method1732(local51, local473, Static356.anInt5795) - local39, local473, local20, local20, local26, local26, local47);
					Static170.aClass14_9.method205(new Class1_Sub3_Sub13(local1020));
				}
			} else if (arg0 == Static229.aClass62_27) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local20 = Static31.anInt477 * 2 + (local12 >> 4 & 0xF);
				local26 = (local12 & 0xF) + Static455.anInt7235 * 2;
				local446 = Static413.aClass1_Sub19_Sub2_1.method2915() != 0;
				local39 = local20 + Static413.aClass1_Sub19_Sub2_1.method2917();
				local43 = local26 + Static413.aClass1_Sub19_Sub2_1.method2917();
				local47 = Static413.aClass1_Sub19_Sub2_1.method2929();
				local51 = Static413.aClass1_Sub19_Sub2_1.method2929();
				local473 = Static413.aClass1_Sub19_Sub2_1.method2896();
				@Pc(1092) byte local1092 = Static413.aClass1_Sub19_Sub2_1.method2917();
				local483 = Static413.aClass1_Sub19_Sub2_1.method2915() * 4;
				local487 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local491 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local495 = Static413.aClass1_Sub19_Sub2_1.method2915();
				@Pc(1114) int local1114 = Static413.aClass1_Sub19_Sub2_1.method2896();
				if (local495 == 255) {
					local495 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && local20 < Static147.anInt2300 * 2 && local26 < Static147.anInt2300 * 2 && local39 >= 0 && local43 >= 0 && local39 < Static293.anInt4886 * 2 && local43 < Static293.anInt4886 * 2 && local473 != 65535) {
					local43 = local43 * 64;
					local1114 <<= 0x0;
					local20 = local20 * 64;
					local39 *= 64;
					local483 <<= 0x0;
					local26 = local26 * 64;
					local479 = local1092 << 0;
					if (local47 != 0) {
						@Pc(1196) Class11_Sub1_Sub3 local1196 = null;
						@Pc(1216) int local1216;
						@Pc(1206) int local1206;
						@Pc(1210) int local1210;
						if (local47 < 0) {
							local1206 = -local47 - 1;
							local1210 = local1206 & 0x7FF;
							local1216 = local1206 >> 11 & 0xF;
							if (Static220.anInt4038 == local1210) {
								local1196 = Static94.aClass11_Sub1_Sub3_Sub2_1;
							} else {
								local1196 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local1210];
							}
						} else {
							local1206 = local47 - 1;
							local1216 = local1206 >> 11 & 0xF;
							local1210 = local1206 & 0x7FF;
							@Pc(1252) Class1_Sub44 local1252 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local1210);
							if (local1252 != null) {
								local1196 = local1252.aClass11_Sub1_Sub3_Sub1_2;
							}
						}
						if (local1196 != null) {
							@Pc(1263) Class164 local1263 = local1196.method2640();
							if (local1263.anIntArrayArray41 != null && local1263.anIntArrayArray41[local1216] != null) {
								local1210 = local1263.anIntArrayArray41[local1216][0];
								@Pc(1285) int local1285 = local1263.anIntArrayArray41[local1216][2];
								@Pc(1290) int local1290 = local1196.aClass41_7.method704();
								@Pc(1294) int local1294 = Class1_Sub29.anIntArray537[local1290];
								@Pc(1298) int local1298 = Class1_Sub29.anIntArray536[local1290];
								@Pc(1308) int local1308 = local1210 * local1298 + local1294 * local1285 >> 15;
								@Pc(1319) int local1319 = local1285 * local1298 - local1294 * local1210 >> 15;
								local479 -= local1263.anIntArrayArray41[local1216][1];
								local20 += local1308;
								local26 += local1319;
							}
						}
					}
					@Pc(1358) Class11_Sub1_Sub5 local1358 = new Class11_Sub1_Sub5(local473, Static356.anInt5795, local20, local26, local479, Static98.anInt1304 + local487, Static98.anInt1304 + local491, local495, local1114, local51, local483, local446);
					local1358.method4959(local487 + Static98.anInt1304, -local483 + Static135.method1732(local39, local43, Static356.anInt5795), local39, local43);
					Static454.aClass14_52.method205(new Class1_Sub3_Sub8(local1358));
				}
			} else if (arg0 == Static132.aClass62_37) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2928();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static17.anIntArray311[local20];
				local39 = Static413.aClass1_Sub19_Sub2_1.method2884();
				local43 = Static31.anInt477 + (local39 >> 4 & 0x7);
				local47 = Static455.anInt7235 + (local39 & 0x7);
				if (Static98.method1148(Static70.anInt4903) || local43 >= 0 && local47 >= 0 && Static147.anInt2300 > local43 && local47 < Static293.anInt4886) {
					Static431.method5461(Static356.anInt5795, local26, local20, local47, -1, local43, local30);
				}
			} else if (arg0 == Static308.aClass62_31) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local20 = Static31.anInt477 + (local12 >> 4 & 0x7);
				local26 = Static455.anInt7235 + (local12 & 0x7);
				local30 = Static413.aClass1_Sub19_Sub2_1.method2896();
				if (local30 == 65535) {
					local30 = -1;
				}
				local39 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local43 = local39 >> 4 & 0xF;
				local47 = local39 & 0x7;
				local51 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local473 = Static413.aClass1_Sub19_Sub2_1.method2915();
				if (local20 >= 0 && local26 >= 0 && Static147.anInt2300 > local20 && local26 < Static293.anInt4886) {
					local479 = local43 + 1;
					if (local20 - local479 <= Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] && local20 + local479 >= Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] && local26 - local479 <= Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] && local26 + local479 >= Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0]) {
						Static363.method4774(local47, local473, local30, (Static356.anInt5795 << 24) + local43 - (-(local20 << 16) - (local26 << 8)), local51);
					}
				}
			} else if (Static427.aClass62_38 == arg0) {
				local12 = Static413.aClass1_Sub19_Sub2_1.method2915();
				@Pc(1616) boolean local1616 = (local12 & 0x80) != 0;
				local26 = (local12 >> 3 & 0x7) + Static31.anInt477;
				local30 = Static455.anInt7235 + (local12 & 0x7);
				local39 = local26 + Static413.aClass1_Sub19_Sub2_1.method2917();
				local43 = Static413.aClass1_Sub19_Sub2_1.method2917() + local30;
				local47 = Static413.aClass1_Sub19_Sub2_1.method2929();
				local51 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local473 = Static413.aClass1_Sub19_Sub2_1.method2915() * 4;
				local479 = Static413.aClass1_Sub19_Sub2_1.method2915() * 4;
				local483 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local487 = Static413.aClass1_Sub19_Sub2_1.method2896();
				local491 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local495 = Static413.aClass1_Sub19_Sub2_1.method2896();
				if (local491 == 255) {
					local491 = -1;
				}
				if (local26 >= 0 && local30 >= 0 && Static147.anInt2300 > local26 && local30 < Static293.anInt4886 && local39 >= 0 && local43 >= 0 && Static147.anInt2300 > local39 && Static293.anInt4886 > local43 && local51 != 65535) {
					local26 = local26 * 128 + 64;
					local495 <<= 0x0;
					local479 <<= 0x0;
					local30 = local30 * 128 + 64;
					local39 = local39 * 128 + 64;
					local473 <<= 0x0;
					local43 = local43 * 128 + 64;
					local593 = new Class11_Sub1_Sub5(local51, Static356.anInt5795, local26, local30, local473, Static98.anInt1304 + local483, local487 - -Static98.anInt1304, local491, local495, local47, local479, local1616);
					local593.method4959(Static98.anInt1304 + local483, Static135.method1732(local39, local43, Static356.anInt5795) - local479, local39, local43);
					Static454.aClass14_52.method205(new Class1_Sub3_Sub8(local593));
				}
			} else {
				Static338.method4409(null, "T3 - " + arg0);
				Static124.method1519(false);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!za;)V")
	public static void method391(@OriginalArg(0) Class117 arg0) {
		for (@Pc(1) int local1 = Static193.anInt3335; local1 < Static112.anInt1710; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static174.anInt2873; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static325.anInt5351; local7++) {
					@Pc(16) Class216 local16 = Static259.aClass216ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub3 local21 = local16.aClass11_Sub3_3;
						@Pc(24) Class11_Sub3 local24 = local16.aClass11_Sub3_2;
						if (local21 != null && local21.method5183()) {
							Static114.method1411(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5183()) {
								Static114.method1411(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5179(arg0, 0, local21, 0, false, 0);
								local24.method5177();
							}
							local21.method5177();
						}
						for (@Pc(70) Class259 local70 = local16.aClass259_1; local70 != null; local70 = local70.aClass259_4) {
							@Pc(74) Class11_Sub1 local74 = local70.aClass11_Sub1_2;
							if (local74 != null && local74.method5183()) {
								Static114.method1411(arg0, local74, local1, local4, local7, local74.aShort100 + 1 - local74.aShort103, local74.aShort102 - local74.aShort101 + 1);
								local74.method5177();
							}
						}
						@Pc(111) Class11_Sub2 local111 = local16.aClass11_Sub2_2;
						if (local111 != null && local111.method5183()) {
							Static236.method3368(arg0, local111, local1, local4, local7);
							local111.method5177();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!oi;Lclient!za;I)V")
	public static void method392(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(10) Class52[] local10 = Static467.method894(arg0, Static408.anInt4867);
		Static311.aClass85Array11 = new Class85[local10.length];
		for (@Pc(20) int local20 = 0; local20 < local10.length; local20++) {
			Static311.aClass85Array11[local20] = arg1.method5707(local10[local20]);
		}
		local10 = Static467.method894(arg0, Static294.anInt4896);
		Static398.aClass85Array13 = new Class85[local10.length];
		for (@Pc(51) int local51 = 0; local51 < local10.length; local51++) {
			Static398.aClass85Array13[local51] = arg1.method5707(local10[local51]);
		}
		local10 = Static467.method894(arg0, Static393.anInt6332);
		Static40.aClass85Array2 = new Class85[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static40.aClass85Array2[local78] = arg1.method5707(local10[local78]);
		}
		local10 = Static467.method894(arg0, Static144.anInt7178);
		Static299.aClass85Array10 = new Class85[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static299.aClass85Array10[local105] = arg1.method5707(local10[local105]);
		}
		local10 = Static467.method894(arg0, Static308.anInt5112);
		Static90.aClass85Array4 = new Class85[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static90.aClass85Array4[local132] = arg1.method5707(local10[local132]);
		}
		local10 = Static467.method894(arg0, Static276.anInt4735);
		Static277.aClass85Array9 = new Class85[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static277.aClass85Array9[local163] = arg1.method5707(local10[local163]);
		}
		local10 = Static467.method894(arg0, Static199.anInt3657);
		Static377.aClass85Array12 = new Class85[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static377.aClass85Array12[local190] = arg1.method5707(local10[local190]);
		}
		local10 = Static467.method894(arg0, Static442.anInt6948);
		Static97.aClass85Array6 = new Class85[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static97.aClass85Array6[local221] = arg1.method5707(local10[local221]);
		}
		local10 = Static467.method894(arg0, Static333.anInt5458);
		Static273.aClass85Array8 = new Class85[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static273.aClass85Array8[local252] = arg1.method5707(local10[local252]);
		}
		local10 = Static467.method894(arg0, Static62.anInt965);
		Static20.aClass85Array1 = new Class85[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static20.aClass85Array1[local279] = arg1.method5707(local10[local279]);
		}
		local10 = Static467.method894(arg0, Static372.anInt6000);
		Static458.aClass85Array15 = new Class85[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static458.aClass85Array15[local306] = arg1.method5707(local10[local306]);
		}
		local10 = Static467.method894(arg0, Static356.anInt5793);
		Static251.aClass85Array7 = new Class85[local10.length];
		for (@Pc(333) int local333 = 0; local333 < local10.length; local333++) {
			Static251.aClass85Array7[local333] = arg1.method5707(local10[local333]);
		}
		Static366.aClass85_19 = arg1.method5707(Static467.method891(arg0, Static336.anInt5487, 0));
		Static51.aClass85_6 = arg1.method5707(Static467.method891(arg0, Static100.anInt1338, 0));
		local10 = Static467.method894(arg0, Static45.anInt666);
		Static63.aClass85Array3 = new Class85[local10.length];
		for (@Pc(376) int local376 = 0; local376 < local10.length; local376++) {
			Static63.aClass85Array3[local376] = arg1.method5707(local10[local376]);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[FIIIII)V")
	public static void method393(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static375.method4864(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static375.method4864(arg0)) {
			@Pc(31) int local31 = Static14.method271(6408);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg4 >= arg0 ? arg0 : arg4;
			@Pc(44) int local44 = arg4 >> 1;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(50) float[] local50 = arg1;
			@Pc(57) float[] local57 = new float[local48 * local44 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg4, arg0, 0, 6408, 5126, local50, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(79) int local79 = local31 * arg4;
				for (@Pc(81) int local81 = 0; local81 < local31; local81++) {
					@Pc(85) int local85 = local81;
					@Pc(87) int local87 = local81;
					@Pc(92) int local92 = local81 + local79;
					for (@Pc(94) int local94 = 0; local94 < local48; local94++) {
						for (@Pc(98) int local98 = 0; local98 < local44; local98++) {
							@Pc(104) float local104 = local50[local87];
							local87 += local31;
							@Pc(114) float local114 = local104 + local50[local87];
							@Pc(120) float local120 = local114 + local50[local92];
							local87 += local31;
							local92 += local31;
							@Pc(134) float local134 = local120 + local50[local92];
							local57[local85] = local134 * 0.25F;
							local92 += local31;
							local85 += local31;
						}
						local92 += local79;
						local87 += local79;
					}
				}
				@Pc(178) float[] local178 = local57;
				local57 = local50;
				arg0 = local48;
				arg4 = local44;
				local50 = local178;
				local48 >>= 0x1;
				local40 >>= 0x1;
				local44 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = Static126.aClass19_Sub1_1.anInt4225 * arg1 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static175.method2512(local10, Static153.aClass185_42, arg0);
			Static461.aBoolean648 = true;
		}
	}
}
