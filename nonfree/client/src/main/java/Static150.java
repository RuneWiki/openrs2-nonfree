import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!s;")
	public static final Class217 aClass217_68 = new Class217(87, -2);

	@OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
	public static final int[] anIntArray296 = new int[500];

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V")
	public static void method2585(@OriginalArg(0) int arg0) {
		if (Static156.anInt3163 == 1) {
			Static289.anInt5058 = arg0;
		} else if (Static156.anInt3163 == 2 || Static156.anInt3163 == 3) {
			Static217.anInt4145 = arg0;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Z")
	public static boolean method2587(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!mo;B)V")
	public static void method2588(@OriginalArg(0) Class168 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg0 == Static410.aClass168_35) {
			local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local20 = Static242.anInt5737 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static343.anInt5854;
			local30 = Static203.aClass10_Sub8_Sub2_1.method2485();
			local34 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local38 = Static203.aClass10_Sub8_Sub2_1.method2485();
			local42 = Static203.aClass10_Sub8_Sub2_1.method2502();
			if (local20 >= 0 && local26 >= 0 && Static2.anInt7 > local20 && Static17.anInt315 > local26) {
				local61 = local20 * 128 + 64;
				local67 = local26 * 128 + 64;
				local69 = Static296.anInt5132;
				if (local69 < 3 && Static178.method2948(local26, local20)) {
					local69++;
				}
				@Pc(104) Class24_Sub3_Sub1 local104 = new Class24_Sub3_Sub1(local30, local38, Static400.anInt6752, Static296.anInt5132, local69, local61, Static326.method4459(Static296.anInt5132, local61, local67) - local34, local67, local20, local20, local26, local26, local42);
				Static91.aClass163_16.method3613(new Class10_Sub1_Sub6(local104));
			}
		} else if (Static124.aClass168_9 == arg0) {
			local12 = Static203.aClass10_Sub8_Sub2_1.method2485();
			local20 = Static203.aClass10_Sub8_Sub2_1.method2486();
			local26 = Static343.anInt5854 + (local20 & 0x7);
			local30 = Static72.anInt1488 + local26;
			local34 = Static242.anInt5737 + (local20 >> 4 & 0x7);
			local38 = Static168.anInt3353 + local34;
			local42 = Static203.aClass10_Sub8_Sub2_1.method2520();
			local61 = Static203.aClass10_Sub8_Sub2_1.method2520();
			if (Static245.anInt4435 != local42) {
				@Pc(177) boolean local177 = local34 >= 0 && local26 >= 0 && Static2.anInt7 > local34 && local26 < Static17.anInt315;
				if (local177 || Static427.method5671(Static273.anInt4772)) {
					Static292.method4103(local30, Static296.anInt5132, new Class10_Sub31(local61, local12), local38);
					if (local177) {
						Static179.method2955(Static296.anInt5132, local26, local34);
					}
				}
			}
		} else if (Static168.aClass168_14 == arg0) {
			local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local20 = (local12 & 0x7) + Static343.anInt5854;
			local26 = Static72.anInt1488 + local20;
			local30 = (local12 >> 4 & 0x7) + Static242.anInt5737;
			local34 = local30 + Static168.anInt3353;
			local38 = Static203.aClass10_Sub8_Sub2_1.method2485();
			@Pc(256) Class10_Sub14 local256 = (Class10_Sub14) Static293.aClass167_21.method3709((long) (Static296.anInt5132 << 28 | local26 << 14 | local34));
			if (local256 != null) {
				for (@Pc(264) Class10_Sub31 local264 = (Class10_Sub31) local256.aClass163_17.method3620(); local264 != null; local264 = (Class10_Sub31) local256.aClass163_17.method3621()) {
					if (local264.anInt4768 == (local38 & 0x7FFF)) {
						local264.method6033();
						break;
					}
				}
				if (local256.aClass163_17.method3617()) {
					local256.method6033();
				}
				if (local30 >= 0 && local20 >= 0 && Static2.anInt7 > local30 && Static17.anInt315 > local20) {
					Static179.method2955(Static296.anInt5132, local20, local30);
				}
			}
		} else if (arg0 == Static247.aClass168_23) {
			Static203.aClass10_Sub8_Sub2_1.method2502();
			local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local20 = Static242.anInt5737 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static343.anInt5854;
			local30 = Static203.aClass10_Sub8_Sub2_1.method2485();
			local34 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local38 = Static203.aClass10_Sub8_Sub2_1.method2507();
			@Pc(362) String local362 = Static203.aClass10_Sub8_Sub2_1.method2478();
			Static243.method3553(local362, local26, local30, local20, local38, Static296.anInt5132, local34);
		} else {
			@Pc(440) int local440;
			@Pc(444) int local444;
			@Pc(448) int local448;
			@Pc(452) int local452;
			@Pc(543) Class24_Sub3_Sub5 local543;
			if (Static437.aClass168_39 == arg0) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
				@Pc(390) boolean local390 = (local12 & 0x80) != 0;
				local26 = (local12 >> 3 & 0x7) + Static242.anInt5737;
				local30 = Static343.anInt5854 + (local12 & 0x7);
				local34 = Static203.aClass10_Sub8_Sub2_1.method2460() + local26;
				local38 = Static203.aClass10_Sub8_Sub2_1.method2460() + local30;
				local42 = Static203.aClass10_Sub8_Sub2_1.method2492();
				local61 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local67 = Static203.aClass10_Sub8_Sub2_1.method2502() * 4;
				local69 = Static203.aClass10_Sub8_Sub2_1.method2502() * 4;
				local440 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local444 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local448 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local452 = Static203.aClass10_Sub8_Sub2_1.method2502();
				if (local448 == 255) {
					local448 = -1;
				}
				if (local26 >= 0 && local30 >= 0 && Static2.anInt7 > local26 && Static17.anInt315 > local30 && local34 >= 0 && local38 >= 0 && local34 < Static2.anInt7 && local38 < Static17.anInt315 && local61 != 65535) {
					local34 = local34 * 128 + 64;
					local26 = local26 * 128 + 64;
					local30 = local30 * 128 + 64;
					local67 <<= 0x0;
					local69 <<= 0x0;
					local38 = local38 * 128 + 64;
					local543 = new Class24_Sub3_Sub5(local61, Static296.anInt5132, local26, local30, local67, local440 + Static400.anInt6752, local444 + Static400.anInt6752, local448, local452, local42, local69, local390);
					local543.method5509(local34, local38, Static326.method4459(Static296.anInt5132, local34, local38) - local69, Static400.anInt6752 + local440);
					Static12.aClass163_2.method3613(new Class10_Sub1_Sub15(local543));
				}
			} else if (arg0 == Static90.aClass168_8) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2486();
				local20 = (local12 & 0x7) + Static343.anInt5854;
				local26 = Static72.anInt1488 + local20;
				local30 = (local12 >> 4 & 0x7) + Static242.anInt5737;
				local34 = Static168.anInt3353 + local30;
				local38 = Static203.aClass10_Sub8_Sub2_1.method2498();
				local42 = Static203.aClass10_Sub8_Sub2_1.method2520();
				@Pc(622) boolean local622 = local30 >= 0 && local20 >= 0 && Static2.anInt7 > local30 && local20 < Static17.anInt315;
				if (local622 || Static427.method5671(Static273.anInt4772)) {
					Static292.method4103(local26, Static296.anInt5132, new Class10_Sub31(local38, local42), local34);
					if (local622) {
						Static179.method2955(Static296.anInt5132, local20, local30);
					}
				}
			} else if (arg0 == Static230.aClass168_19) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local20 = Static242.anInt5737 + (local12 >> 4 & 0x7);
				local26 = Static343.anInt5854 + (local12 & 0x7);
				local30 = Static203.aClass10_Sub8_Sub2_1.method2486();
				local34 = local30 >> 2;
				local38 = local30 & 0x3;
				local42 = Static164.anIntArray417[local34];
				if (Static427.method5671(Static273.anInt4772) || local20 >= 0 && local26 >= 0 && local20 < Static2.anInt7 && Static17.anInt315 > local26) {
					Static247.method3609(local42, local34, local26, -1, local38, Static296.anInt5132, local20);
				}
			} else if (Static61.aClass168_7 == arg0) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local20 = Static343.anInt5854 + (local12 & 0x7);
				local26 = local20 + Static72.anInt1488;
				local30 = Static242.anInt5737 + (local12 >> 4 & 0x7);
				local34 = local30 + Static168.anInt3353;
				local38 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local42 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local61 = Static203.aClass10_Sub8_Sub2_1.method2485();
				if (Static293.aClass167_21 != null) {
					@Pc(781) Class10_Sub14 local781 = (Class10_Sub14) Static293.aClass167_21.method3709((long) (local34 | Static296.anInt5132 << 28 | local26 << 14));
					if (local781 != null) {
						for (@Pc(789) Class10_Sub31 local789 = (Class10_Sub31) local781.aClass163_17.method3620(); local789 != null; local789 = (Class10_Sub31) local781.aClass163_17.method3621()) {
							if ((local38 & 0x7FFF) == local789.anInt4768 && local789.anInt4767 == local42) {
								local789.method6033();
								local789.anInt4767 = local61;
								Static292.method4103(local26, Static296.anInt5132, local789, local34);
								break;
							}
						}
						if (local30 >= 0 && local20 >= 0 && local30 < Static2.anInt7 && Static17.anInt315 > local20) {
							Static179.method2955(Static296.anInt5132, local20, local30);
						}
					}
				}
			} else if (arg0 == Static233.aClass168_20) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2485();
				local20 = Static203.aClass10_Sub8_Sub2_1.method2502();
				Static342.aClass237_4.method5212(local12).method3017(local20);
			} else if (arg0 == Static366.aClass168_32) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local20 = Static242.anInt5737 + (local12 >> 4 & 0x7);
				local26 = Static343.anInt5854 + (local12 & 0x7);
				local30 = Static203.aClass10_Sub8_Sub2_1.method2485();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local61 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local67 = Static203.aClass10_Sub8_Sub2_1.method2502();
				if (local20 >= 0 && local26 >= 0 && local20 < Static2.anInt7 && local26 < Static17.anInt315) {
					local69 = local38 + 1;
					if (Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] >= local20 - local69 && Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] <= local20 + local69 && Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0] >= local26 - local69 && local69 + local26 >= Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0]) {
						Static299.method3747(local67, local61, local30, local42, (Static296.anInt5132 << 24) + ((local20 << 16) + (local26 << 8)) + local38);
					}
				}
			} else if (arg0 == Static379.aClass168_6) {
				local12 = Static203.aClass10_Sub8_Sub2_1.method2477();
				@Pc(1014) byte local1014 = Static203.aClass10_Sub8_Sub2_1.method2481();
				@Pc(1018) byte local1018 = Static203.aClass10_Sub8_Sub2_1.method2475();
				local30 = Static203.aClass10_Sub8_Sub2_1.method2471();
				local34 = Static203.aClass10_Sub8_Sub2_1.method2498();
				@Pc(1030) byte local1030 = Static203.aClass10_Sub8_Sub2_1.method2476();
				local42 = Static203.aClass10_Sub8_Sub2_1.method2520();
				local61 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local67 = Static242.anInt5737 + (local61 >> 4 & 0x7);
				local69 = (local61 & 0x7) + Static343.anInt5854;
				@Pc(1056) byte local1056 = Static203.aClass10_Sub8_Sub2_1.method2475();
				local444 = Static203.aClass10_Sub8_Sub2_1.method2502();
				local448 = local444 >> 2;
				local452 = local444 & 0x3;
				if (!Static412.aClass50_8.method5830()) {
					Static121.method2094(local1030, local12, Static296.anInt5132, local69, local1014, local30, local67, local42, local1018, local34, local448, local452, local1056);
				}
			} else {
				@Pc(1124) boolean local1124;
				if (Static326.aClass168_27 == arg0) {
					local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
					local20 = (local12 >> 4 & 0xF) + Static242.anInt5737 * 2;
					local26 = Static343.anInt5854 * 2 + (local12 & 0xF);
					local1124 = Static203.aClass10_Sub8_Sub2_1.method2502() != 0;
					local34 = Static203.aClass10_Sub8_Sub2_1.method2460() + local20;
					local38 = local26 + Static203.aClass10_Sub8_Sub2_1.method2460();
					local42 = Static203.aClass10_Sub8_Sub2_1.method2492();
					local61 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local67 = Static203.aClass10_Sub8_Sub2_1.method2502() * 4;
					local69 = Static203.aClass10_Sub8_Sub2_1.method2502() * 4;
					local440 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local444 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local448 = Static203.aClass10_Sub8_Sub2_1.method2502();
					local452 = Static203.aClass10_Sub8_Sub2_1.method2502();
					if (local448 == 255) {
						local448 = -1;
					}
					if (local20 >= 0 && local26 >= 0 && Static2.anInt7 * 2 > local20 && local26 < Static2.anInt7 * 2 && local34 >= 0 && local38 >= 0 && local34 < Static17.anInt315 * 2 && Static17.anInt315 * 2 > local38 && local61 != 65535) {
						local38 *= 64;
						local20 = local20 * 64;
						local26 *= 64;
						local34 *= 64;
						local69 <<= 0x0;
						local67 <<= 0x0;
						local543 = new Class24_Sub3_Sub5(local61, Static296.anInt5132, local20, local26, local67, local440 + Static400.anInt6752, Static400.anInt6752 + local444, local448, local452, local42, local69, local1124);
						local543.method5509(local34, local38, Static326.method4459(Static296.anInt5132, local34, local38) - local69, local440 - -Static400.anInt6752);
						Static12.aClass163_2.method3613(new Class10_Sub1_Sub15(local543));
					}
				} else if (Static277.aClass168_25 == arg0) {
					local12 = Static203.aClass10_Sub8_Sub2_1.method2502();
					local20 = Static242.anInt5737 * 2 + (local12 >> 4 & 0xF);
					local26 = (local12 & 0xF) + Static343.anInt5854 * 2;
					local1124 = Static203.aClass10_Sub8_Sub2_1.method2502() != 0;
					local34 = Static203.aClass10_Sub8_Sub2_1.method2460() + local20;
					local38 = local26 + Static203.aClass10_Sub8_Sub2_1.method2460();
					local42 = Static203.aClass10_Sub8_Sub2_1.method2492();
					local61 = Static203.aClass10_Sub8_Sub2_1.method2492();
					local67 = Static203.aClass10_Sub8_Sub2_1.method2485();
					@Pc(1349) byte local1349 = Static203.aClass10_Sub8_Sub2_1.method2460();
					local440 = Static203.aClass10_Sub8_Sub2_1.method2502() * 4;
					local444 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local448 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local452 = Static203.aClass10_Sub8_Sub2_1.method2502();
					@Pc(1371) int local1371 = Static203.aClass10_Sub8_Sub2_1.method2502();
					if (local452 == 255) {
						local452 = -1;
					}
					if (local20 >= 0 && local26 >= 0 && local20 < Static2.anInt7 * 2 && local26 < Static2.anInt7 * 2 && local34 >= 0 && local38 >= 0 && Static17.anInt315 * 2 > local34 && Static17.anInt315 * 2 > local38 && local67 != 65535) {
						local440 <<= 0x0;
						local69 = local1349 << 0;
						local34 = local34 * 64;
						local26 *= 64;
						local38 = local38 * 64;
						local20 = local20 * 64;
						if (local42 != 0) {
							@Pc(1454) Class24_Sub3_Sub2 local1454 = null;
							@Pc(1469) int local1469;
							@Pc(1463) int local1463;
							@Pc(1473) int local1473;
							if (local42 >= 0) {
								local1463 = local42 - 1;
								local1469 = local1463 >> 11 & 0xF;
								local1473 = local1463 & 0x7FF;
								@Pc(1480) Class10_Sub26 local1480 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local1473);
								if (local1480 != null) {
									local1454 = local1480.aClass24_Sub3_Sub2_Sub1_2;
								}
							} else {
								local1463 = -local42 - 1;
								local1469 = local1463 >> 11 & 0xF;
								local1473 = local1463 & 0x7FF;
								if (Static245.anInt4435 == local1473) {
									local1454 = Static263.aClass24_Sub3_Sub2_Sub2_4;
								} else {
									local1454 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local1473];
								}
							}
							if (local1454 != null) {
								@Pc(1517) Class6 local1517 = local1454.method4923();
								if (local1517.anIntArrayArray1 != null && local1517.anIntArrayArray1[local1469] != null) {
									local1473 = local1517.anIntArrayArray1[local1469][0];
									@Pc(1539) int local1539 = local1517.anIntArrayArray1[local1469][2];
									@Pc(1544) int local1544 = local1454.aClass145_7.method3304();
									@Pc(1548) int local1548 = Class250.anIntArray675[local1544];
									@Pc(1552) int local1552 = Class250.anIntArray674[local1544];
									@Pc(1563) int local1563 = local1539 * local1548 + local1552 * local1473 >> 15;
									@Pc(1573) int local1573 = local1539 * local1552 - local1548 * local1473 >> 15;
									local20 += local1563;
									local26 += local1573;
									local69 -= local1517.anIntArrayArray1[local1469][1];
								}
							}
						}
						@Pc(1614) Class24_Sub3_Sub5 local1614 = new Class24_Sub3_Sub5(local67, Static296.anInt5132, local20, local26, local69, local444 + Static400.anInt6752, local448 - -Static400.anInt6752, local452, local1371, local61, local440, local1124);
						local1614.method5509(local34, local38, Static326.method4459(Static296.anInt5132, local34, local38) - local440, Static400.anInt6752 + local444);
						Static12.aClass163_2.method3613(new Class10_Sub1_Sub15(local1614));
					}
				} else if (arg0 == Static191.aClass168_17) {
					local12 = Static203.aClass10_Sub8_Sub2_1.method2486();
					local20 = (local12 >> 4 & 0x7) + Static242.anInt5737;
					local26 = (local12 & 0x7) + Static343.anInt5854;
					local30 = Static203.aClass10_Sub8_Sub2_1.method2483();
					local34 = local30 >> 2;
					local38 = local30 & 0x3;
					local42 = Static164.anIntArray417[local34];
					local61 = Static203.aClass10_Sub8_Sub2_1.method2485();
					if (local61 == 65535) {
						local61 = -1;
					}
					Static104.method1824(local34, local42, local20, Static296.anInt5132, local26, local61, local38);
				} else if (arg0 == Static367.aClass168_33) {
					local12 = Static203.aClass10_Sub8_Sub2_1.method2503();
					local20 = Static242.anInt5737 + (local12 >> 4 & 0x7);
					local26 = Static343.anInt5854 + (local12 & 0x7);
					local30 = Static203.aClass10_Sub8_Sub2_1.method2485();
					local34 = Static203.aClass10_Sub8_Sub2_1.method2486();
					local38 = local34 >> 2;
					local42 = local34 & 0x3;
					local61 = Static164.anIntArray417[local38];
					if (Static427.method5671(Static273.anInt4772) || local20 >= 0 && local26 >= 0 && local20 < Static2.anInt7 && local26 < Static17.anInt315) {
						Static247.method3609(local61, local38, local26, local30, local42, Static296.anInt5132, local20);
					}
				} else {
					Static432.method5720("T3 - " + arg0, null);
					Static172.method2923(false);
				}
			}
		}
	}
}
