import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_176 = new Class263(6, 3);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1; local16++) {
				if (arg4 == Static65.anIntArrayArray18[local12][local16] && Static163.anIntArrayArray33[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z")
	public static boolean method6001() throws IOException {
		if (Static388.aClass236_13 == null) {
			return false;
		}
		@Pc(13) int local13 = Static388.aClass236_13.method5235();
		if (local13 == 0) {
			return false;
		}
		@Pc(72) int local72;
		if (Static102.aClass263_56 == null) {
			if (Static295.aBoolean343) {
				Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 1);
				local13--;
				Static295.aBoolean343 = false;
				Static56.anInt1515++;
			}
			Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
			if (Static5.aClass1_Sub3_Sub1_1.method317()) {
				if (local13 == 0) {
					return false;
				}
				Static388.aClass236_13.method5226(1, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 1);
				local13--;
				Static56.anInt1515++;
			}
			Static295.aBoolean343 = true;
			@Pc(68) Class263[] local68 = Static417.method5675();
			local72 = Static5.aClass1_Sub3_Sub1_1.method319();
			if (local72 < 0 || local72 >= local68.length) {
				throw new IOException("invo:" + local72 + " ip:" + Static5.aClass1_Sub3_Sub1_1.anInt1710);
			}
			Static102.aClass263_56 = local68[local72];
			Static350.anInt6510 = Static102.aClass263_56.anInt7741;
		}
		if (Static350.anInt6510 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 1);
			Static350.anInt6510 = Static5.aClass1_Sub3_Sub1_1.aByteArray14[0] & 0xFF;
			local13--;
			Static56.anInt1515++;
		}
		if (Static350.anInt6510 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 2);
			Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
			Static350.anInt6510 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local13 -= 2;
			Static56.anInt1515 += 2;
		}
		if (Static350.anInt6510 > local13) {
			return false;
		}
		Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
		Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, Static350.anInt6510);
		Static56.anInt1515 += Static350.anInt6510;
		Static132.anInt2937 = 0;
		Static280.aClass263_128 = Static340.aClass263_146;
		Static340.aClass263_146 = Static104.aClass263_58;
		Static104.aClass263_58 = Static102.aClass263_56;
		@Pc(198) int local198;
		if (Static102.aClass263_56 == Static103.aClass263_57) {
			local198 = Static5.aClass1_Sub3_Sub1_1.method1171();
			if (Static5.aClass1_Sub3_Sub1_1.method1171() == 0) {
				Static450.aClass67Array1[local198] = new Class67();
			} else {
				Static5.aClass1_Sub3_Sub1_1.anInt1710--;
				Static450.aClass67Array1[local198] = new Class67(Static5.aClass1_Sub3_Sub1_1);
			}
			Static102.aClass263_56 = null;
			Static342.anInt6271 = Static175.anInt3842;
			return true;
		}
		@Pc(247) int local247;
		if (Static93.aClass263_155 == Static102.aClass263_56) {
			local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local72 = Static5.aClass1_Sub3_Sub1_1.method1187();
			local247 = Static5.aClass1_Sub3_Sub1_1.method1217();
			if (local247 == 65535) {
				local247 = -1;
			}
			if (Static368.method5124(local198)) {
				Static80.method6096(local247, -1, local72, 1);
			}
			Static102.aClass263_56 = null;
			return true;
		} else if (Static102.aClass263_56 == Static241.aClass263_106) {
			local198 = Static5.aClass1_Sub3_Sub1_1.method1171();
			local72 = Static5.aClass1_Sub3_Sub1_1.method1217();
			Static366.aClass190_1.method4304(local72, local198);
			Static102.aClass263_56 = null;
			return true;
		} else {
			@Pc(307) int local307;
			if (Static102.aClass263_56 == Static356.aClass263_167) {
				local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
				local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
				local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
				local307 = Static5.aClass1_Sub3_Sub1_1.method1217();
				if (Static368.method5124(local198)) {
					Static152.method2400(local247, (local72 << 16) + local307);
				}
				Static102.aClass263_56 = null;
				return true;
			} else if (Static237.aClass263_104 == Static102.aClass263_56) {
				Static336.method4734(true);
				Static102.aClass263_56 = null;
				return true;
			} else if (Static102.aClass263_56 == Static430.aClass263_169) {
				if (Static91.method1566(Static170.anInt3494)) {
					Static162.anInt3420 = (int) ((float) Static5.aClass1_Sub3_Sub1_1.method1177() * 2.5F);
				} else {
					Static162.anInt3420 = Static5.aClass1_Sub3_Sub1_1.method1177() * 30;
				}
				Static102.aClass263_56 = null;
				Static111.anInt4635 = Static175.anInt3842;
				return true;
			} else if (Static102.aClass263_56 == Static259.aClass263_116) {
				Static28.method563(Static408.aClass126_15);
				Static102.aClass263_56 = null;
				return true;
			} else if (Static268.aClass263_123 == Static102.aClass263_56) {
				local198 = Static5.aClass1_Sub3_Sub1_1.method1210();
				local72 = Static5.aClass1_Sub3_Sub1_1.method1210();
				if (local72 == 255) {
					local72 = -1;
					local198 = -1;
				}
				Static51.method957(local72, local198);
				Static102.aClass263_56 = null;
				return true;
			} else if (Static3.aClass263_1 == Static102.aClass263_56) {
				@Pc(412) byte local412 = Static5.aClass1_Sub3_Sub1_1.method1220();
				local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
				local247 = Static5.aClass1_Sub3_Sub1_1.method1217();
				if (Static368.method5124(local247)) {
					Static190.method3096(local72, local412);
				}
				Static102.aClass263_56 = null;
				return true;
			} else if (Static102.aClass263_56 == Static226.aClass263_98) {
				Static102.aClass263_56 = null;
				Static290.anInt5510 = Static175.anInt3842;
				Static169.anInt3490 = 1;
				return true;
			} else {
				@Pc(456) String local456;
				if (Static102.aClass263_56 == Static3.aClass263_2) {
					local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
					local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
					local247 = Static5.aClass1_Sub3_Sub1_1.method1207();
					if (Static368.method5124(local198)) {
						Static366.method5108(local247, local456);
					}
					Static102.aClass263_56 = null;
					return true;
				}
				@Pc(486) boolean local486;
				@Pc(492) String local492;
				@Pc(536) String local536;
				if (Static460.aClass263_138 == Static102.aClass263_56) {
					local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
					local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
					local492 = local456;
					if (local486) {
						local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
					}
					local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
					@Pc(504) boolean local504 = false;
					if (local307 <= 1) {
						if (Static400.aBoolean463 && !Static223.aBoolean279 || Static11.aBoolean7) {
							local504 = true;
						} else if (local307 <= 1 && Static64.method1237(local492)) {
							local504 = true;
						}
					}
					if (!local504 && Static362.anInt6659 == 0) {
						local536 = Static116.method1885(Static220.method3425(Static5.aClass1_Sub3_Sub1_1));
						if (local307 == 2) {
							Static118.method2011(null, 0, local536, "<img=1>" + local492, 24, -1, "<img=1>" + local456);
						} else if (local307 == 1) {
							Static118.method2011(null, 0, local536, "<img=0>" + local492, 24, -1, "<img=0>" + local456);
						} else {
							Static118.method2011(null, 0, local536, local492, 24, -1, local456);
						}
					}
					Static102.aClass263_56 = null;
					return true;
				}
				@Pc(626) int local626;
				if (Static200.aClass263_89 == Static102.aClass263_56) {
					local198 = Static5.aClass1_Sub3_Sub1_1.method1217();
					local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
					local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
					local307 = Static5.aClass1_Sub3_Sub1_1.method1186();
					local626 = Static5.aClass1_Sub3_Sub1_1.method1225();
					if (Static368.method5124(local626)) {
						Static413.method5604(local307, local72, local247, local198);
					}
					Static102.aClass263_56 = null;
					return true;
				} else if (Static54.aClass263_26 == Static102.aClass263_56) {
					Static28.method563(Static180.aClass126_5);
					Static102.aClass263_56 = null;
					return true;
				} else if (Static45.aClass263_24 == Static102.aClass263_56) {
					Static28.method563(Static190.aClass126_6);
					Static102.aClass263_56 = null;
					return true;
				} else if (Static274.aClass263_127 == Static102.aClass263_56) {
					Static162.method2668(false);
					Static102.aClass263_56 = null;
					return false;
				} else if (Static102.aClass263_56 == Static429.aClass263_173) {
					local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
					local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
					@Pc(691) Object[] local691 = new Object[local456.length() + 1];
					for (local307 = local456.length() - 1; local307 >= 0; local307--) {
						if (local456.charAt(local307) == 's') {
							local691[local307 + 1] = Static5.aClass1_Sub3_Sub1_1.method1201();
						} else {
							local691[local307 + 1] = Integer.valueOf(Static5.aClass1_Sub3_Sub1_1.method1188());
						}
					}
					local691[0] = Integer.valueOf(Static5.aClass1_Sub3_Sub1_1.method1188());
					if (Static368.method5124(local198)) {
						@Pc(744) Class1_Sub10 local744 = new Class1_Sub10();
						local744.anObjectArray2 = local691;
						Static178.method3000(local744);
					}
					Static102.aClass263_56 = null;
					return true;
				} else {
					@Pc(772) String local772;
					@Pc(770) String local770;
					if (Static19.aClass263_14 == Static102.aClass263_56) {
						local198 = Static5.aClass1_Sub3_Sub1_1.method1168();
						local72 = Static5.aClass1_Sub3_Sub1_1.method1188();
						local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
						local770 = "";
						local772 = local770;
						if ((local247 & 0x1) != 0) {
							local770 = Static5.aClass1_Sub3_Sub1_1.method1201();
							if ((local247 & 0x2) == 0) {
								local772 = local770;
							} else {
								local772 = Static5.aClass1_Sub3_Sub1_1.method1201();
							}
						}
						local536 = Static5.aClass1_Sub3_Sub1_1.method1201();
						if (local198 == 99) {
							Static336.method4727(local536);
						} else if (local772.equals("") || !Static64.method1237(local772)) {
							Static227.method3471(local772, local72, local536, local198, local770);
						} else {
							Static102.aClass263_56 = null;
							return true;
						}
						Static102.aClass263_56 = null;
						return true;
					} else if (Static102.aClass263_56 == Static435.aClass263_174) {
						local198 = Static5.aClass1_Sub3_Sub1_1.method1188();
						Static228.aClass157_3 = Static150.aClass183_3.method4153(local198);
						Static102.aClass263_56 = null;
						return true;
					} else if (Static102.aClass263_56 == Static168.aClass263_33) {
						Static425.anInt3428 = Static5.aClass1_Sub3_Sub1_1.method1170();
						Static420.anInt4325 = Static5.aClass1_Sub3_Sub1_1.method1218();
						Static102.aClass263_56 = null;
						return true;
					} else if (Static87.aClass263_49 == Static102.aClass263_56) {
						Static28.method563(Static398.aClass126_13);
						Static102.aClass263_56 = null;
						return true;
					} else {
						@Pc(910) Class1_Sub39 local910;
						if (Static290.aClass263_132 == Static102.aClass263_56) {
							local198 = Static5.aClass1_Sub3_Sub1_1.method1172();
							local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
							local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
							if (Static368.method5124(local72)) {
								@Pc(903) Class1_Sub39 local903 = (Class1_Sub39) Static177.aClass38_18.method765((long) local198);
								local910 = (Class1_Sub39) Static177.aClass38_18.method765((long) local247);
								if (local910 != null) {
									Static285.method4176(local910, false, local903 == null || local903.anInt6172 != local910.anInt6172);
								}
								if (local903 != null) {
									local903.method6178();
									Static177.aClass38_18.method766(local903, (long) local247);
								}
								@Pc(941) Class68 local941 = Static300.method4351(local198);
								if (local941 != null) {
									Static446.method6042(local941);
								}
								local941 = Static300.method4351(local247);
								if (local941 != null) {
									Static446.method6042(local941);
									Static238.method3609(local941, true);
								}
								if (Static456.anInt1594 != -1) {
									Static434.method5793(Static456.anInt1594, 1);
								}
							}
							Static102.aClass263_56 = null;
							return true;
						}
						@Pc(1014) int local1014;
						@Pc(1020) int local1020;
						@Pc(998) long local998;
						@Pc(1010) long local1010;
						@Pc(1005) long local1005;
						if (Static102.aClass263_56 == Static394.aClass263_162) {
							local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
							local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
							local492 = local456;
							if (local486) {
								local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
							}
							local998 = Static5.aClass1_Sub3_Sub1_1.method1162();
							local1005 = Static5.aClass1_Sub3_Sub1_1.method1177();
							local1010 = Static5.aClass1_Sub3_Sub1_1.method1226();
							local1014 = Static5.aClass1_Sub3_Sub1_1.method1171();
							local1020 = Static5.aClass1_Sub3_Sub1_1.method1177();
							@Pc(1026) long local1026 = (local1005 << 32) + local1010;
							@Pc(1028) boolean local1028 = false;
							@Pc(1030) int local1030 = 0;
							while (true) {
								if (local1030 >= 100) {
									if (local1014 <= 1 && Static64.method1237(local492)) {
										local1028 = true;
									}
									break;
								}
								if (local1026 == Static36.aLongArray7[local1030]) {
									local1028 = true;
									break;
								}
								local1030++;
							}
							if (!local1028 && Static362.anInt6659 == 0) {
								Static36.aLongArray7[Static397.anInt7182] = local1026;
								Static397.anInt7182 = (Static397.anInt7182 + 1) % 100;
								@Pc(1081) String local1081 = Static439.aClass127_2.method3086(local1020).method4838(Static5.aClass1_Sub3_Sub1_1);
								if (local1014 == 2) {
									Static118.method2011(Static127.method2083(local998), 0, local1081, "<img=1>" + local492, 20, local1020, "<img=1>" + local456);
								} else if (local1014 == 1) {
									Static118.method2011(Static127.method2083(local998), 0, local1081, "<img=0>" + local492, 20, local1020, "<img=0>" + local456);
								} else {
									Static118.method2011(Static127.method2083(local998), 0, local1081, local492, 20, local1020, local456);
								}
							}
							Static102.aClass263_56 = null;
							return true;
						} else if (Static102.aClass263_56 == Static89.aClass263_180) {
							Static28.method563(Static405.aClass126_14);
							Static102.aClass263_56 = null;
							return true;
						} else if (Static102.aClass263_56 == Static116.aClass263_65) {
							Static5.aClass1_Sub3_Sub1_1.anInt1710 += 28;
							if (Static5.aClass1_Sub3_Sub1_1.method1176()) {
								Static318.method4537(Static5.aClass1_Sub3_Sub1_1, Static5.aClass1_Sub3_Sub1_1.anInt1710 - 28);
							}
							Static102.aClass263_56 = null;
							return true;
						} else {
							@Pc(1210) boolean local1210;
							if (Static89.aClass263_181 == Static102.aClass263_56) {
								local198 = Static5.aClass1_Sub3_Sub1_1.method1218();
								local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
								local1210 = (local198 & 0x1) == 1;
								Static121.method5867(local1210, local72);
								Static383.anIntArray660[Static271.anInt5263++ & 0x1F] = local72;
								Static102.aClass263_56 = null;
								return true;
							} else if (Static102.aClass263_56 == Static216.aClass263_94) {
								local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
								local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
								local247 = Static5.aClass1_Sub3_Sub1_1.method1170();
								local307 = Static5.aClass1_Sub3_Sub1_1.method1188();
								if (Static368.method5124(local198)) {
									local910 = (Class1_Sub39) Static177.aClass38_18.method765((long) local307);
									if (local910 != null) {
										Static285.method4176(local910, false, local910.anInt6172 != local72);
									}
									Static195.method3156(local247, local307, false, local72);
								}
								Static102.aClass263_56 = null;
								return true;
							} else if (Static118.aClass263_69 == Static102.aClass263_56) {
								Static28.method563(Static412.aClass126_16);
								Static102.aClass263_56 = null;
								return true;
							} else if (Static102.aClass263_56 == Static215.aClass263_93) {
								Static392.aClass37_4 = Static200.method3203(Static5.aClass1_Sub3_Sub1_1.method1171());
								Static102.aClass263_56 = null;
								return true;
							} else {
								@Pc(1350) int local1350;
								if (Static145.aClass263_79 == Static102.aClass263_56) {
									local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
									local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
									local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
									local307 = Static5.aClass1_Sub3_Sub1_1.method1177();
									if (Static368.method5124(local198) && Static293.aClass68ArrayArray4[local72] != null) {
										for (local626 = local247; local626 < local307; local626++) {
											local1350 = Static5.aClass1_Sub3_Sub1_1.method1226();
											if (local626 < Static293.aClass68ArrayArray4[local72].length && Static293.aClass68ArrayArray4[local72][local626] != null) {
												Static293.aClass68ArrayArray4[local72][local626].anInt2103 = local1350;
											}
										}
									}
									Static102.aClass263_56 = null;
									return true;
								} else if (Static186.aClass263_115 == Static102.aClass263_56) {
									local198 = Static5.aClass1_Sub3_Sub1_1.method1187();
									local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
									Static366.aClass190_1.method4304(local72, local198);
									Static102.aClass263_56 = null;
									return true;
								} else if (Static102.aClass263_56 == Static59.aClass263_29) {
									local198 = Static5.aClass1_Sub3_Sub1_1.method1210();
									local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
									if (Static368.method5124(local72)) {
										Static90.anInt2087 = local198;
									}
									Static102.aClass263_56 = null;
									return true;
								} else if (Static255.aClass263_114 == Static102.aClass263_56) {
									local198 = Static5.aClass1_Sub3_Sub1_1.method1217();
									local72 = Static5.aClass1_Sub3_Sub1_1.method1187();
									if (Static368.method5124(local198)) {
										Static80.method6096(Static32.anInt894, 0, local72, 5);
									}
									Static102.aClass263_56 = null;
									return true;
								} else if (Static102.aClass263_56 == Static451.aClass263_179) {
									local198 = Static5.aClass1_Sub3_Sub1_1.method1186();
									local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
									local247 = Static5.aClass1_Sub3_Sub1_1.method1170();
									if (Static368.method5124(local72)) {
										Static335.method3418(local247, local198);
									}
									Static102.aClass263_56 = null;
									return true;
								} else if (Static364.aClass263_157 == Static102.aClass263_56) {
									Static28.method563(Static89.aClass126_18);
									Static102.aClass263_56 = null;
									return true;
								} else {
									@Pc(1535) int local1535;
									@Pc(1527) int local1527;
									@Pc(1531) int local1531;
									if (Static102.aClass263_56 == Static341.aClass263_148) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1187();
										local72 = local198 >> 28 & 0x3;
										local247 = local198 >> 14 & 0x3FFF;
										local307 = local198 & 0x3FFF;
										local626 = Static5.aClass1_Sub3_Sub1_1.method1210();
										local1350 = local626 >> 2;
										local1527 = local626 & 0x3;
										local1531 = Static461.anIntArray727[local1350];
										local1535 = Static5.aClass1_Sub3_Sub1_1.method1177();
										if (local1535 == 65535) {
											local1535 = -1;
										}
										local247 -= Static278.anInt5374;
										local307 -= Static380.anInt6896;
										Static145.method2319(local247, local1350, local72, local1527, local1535, local307, local1531);
										Static102.aClass263_56 = null;
										return true;
									} else if (Static451.aClass263_178 == Static102.aClass263_56) {
										Static336.anInt6157 = Static5.aClass1_Sub3_Sub1_1.method1171();
										Static102.aClass263_56 = null;
										return true;
									} else if (Static279.aClass263_131 == Static102.aClass263_56) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1186();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
										if (Static368.method5124(local72)) {
											Static80.method6096(-1, -1, local198, 3);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static102.aClass263_56 == Static266.aClass263_120) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1218();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1225();
										@Pc(1623) Class1_Sub27 local1623 = (Class1_Sub27) Static24.aClass38_3.method765((long) local247);
										if (local1623 != null) {
											Static122.method1980(local72, local1623.aClass30_Sub1_Sub1_Sub1_2, local198);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static239.aClass263_105 == Static102.aClass263_56) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1186();
										local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
										if (Static368.method5124(local198)) {
											Static131.method2158(local492, local72);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static102.aClass263_56 == Static170.aClass263_83) {
										Static366.aClass190_1.method4307();
										Static342.anInt6266 += 32;
										Static102.aClass263_56 = null;
										return true;
									} else if (Static102.aClass263_56 == Static225.aClass263_96) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1207();
										if (Static368.method5124(local247)) {
											Static156.method2624(local72, local198);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static102.aClass263_56 == Static65.aClass263_37) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
										local307 = Static5.aClass1_Sub3_Sub1_1.method1177() << 0;
										local626 = Static5.aClass1_Sub3_Sub1_1.method1171();
										local1350 = Static5.aClass1_Sub3_Sub1_1.method1171();
										if (Static368.method5124(local198)) {
											Static368.method5128(local1350, local626, local307, local72, local247);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static263.aClass263_118 == Static102.aClass263_56) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
										if (local198 == 65535) {
											local198 = -1;
										}
										local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
										local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
										Static298.method4341(local198, local307, local72, local247);
										Static102.aClass263_56 = null;
										return true;
									} else if (Static341.aClass263_149 == Static102.aClass263_56) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1187();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1187();
										local307 = Static5.aClass1_Sub3_Sub1_1.method1207();
										if (Static368.method5124(local307)) {
											Static80.method6096(local198, local72, local247, 5);
										}
										Static102.aClass263_56 = null;
										return true;
									} else if (Static266.aClass263_121 == Static102.aClass263_56) {
										Static18.method372();
										Static102.aClass263_56 = null;
										return true;
									} else if (Static102.aClass263_56 == Static31.aClass263_46) {
										local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
										local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
										local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
										if (Static368.method5124(local72)) {
											Static264.method3910(local198, local247);
										}
										Static102.aClass263_56 = null;
										return true;
									} else {
										@Pc(1916) Class186 local1916;
										@Pc(1901) boolean local1901;
										@Pc(1912) String local1912;
										@Pc(1870) String local1870;
										if (Static92.aClass263_51 == Static102.aClass263_56) {
											local1870 = Static5.aClass1_Sub3_Sub1_1.method1201();
											local1210 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
											if (local1210) {
												local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
											} else {
												local456 = local1870;
											}
											local307 = Static5.aClass1_Sub3_Sub1_1.method1177();
											@Pc(1899) byte local1899 = Static5.aClass1_Sub3_Sub1_1.method1212();
											local1901 = false;
											if (local1899 == -128) {
												local1901 = true;
											}
											if (local1901) {
												if (Static84.anInt2030 == 0) {
													Static102.aClass263_56 = null;
													return true;
												}
												for (local1527 = 0; local1527 < Static84.anInt2030 && (!Static216.aClass186Array1[local1527].aString46.equals(local456) || local307 != Static216.aClass186Array1[local1527].anInt5502); local1527++) {
												}
												if (local1527 < Static84.anInt2030) {
													while (Static84.anInt2030 - 1 > local1527) {
														Static216.aClass186Array1[local1527] = Static216.aClass186Array1[local1527 + 1];
														local1527++;
													}
													Static84.anInt2030--;
													Static216.aClass186Array1[Static84.anInt2030] = null;
												}
											} else {
												local1912 = Static5.aClass1_Sub3_Sub1_1.method1201();
												local1916 = new Class186();
												local1916.aString47 = local1870;
												local1916.aString46 = local456;
												local1916.aString48 = Static311.method4474(local1916.aString46);
												local1916.aString49 = local1912;
												local1916.anInt5502 = local307;
												local1916.aByte71 = local1899;
												for (local1535 = Static84.anInt2030 - 1; local1535 >= 0; local1535--) {
													local1014 = Static216.aClass186Array1[local1535].aString48.compareTo(local1916.aString48);
													if (local1014 == 0) {
														Static216.aClass186Array1[local1535].anInt5502 = local307;
														Static216.aClass186Array1[local1535].aByte71 = local1899;
														Static216.aClass186Array1[local1535].aString49 = local1912;
														if (local456.equals(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9)) {
															Static60.aByte36 = local1899;
														}
														Static126.anInt2792 = Static175.anInt3842;
														Static102.aClass263_56 = null;
														return true;
													}
													if (local1014 < 0) {
														break;
													}
												}
												if (Static216.aClass186Array1.length <= Static84.anInt2030) {
													Static102.aClass263_56 = null;
													return true;
												}
												for (local1014 = Static84.anInt2030 - 1; local1014 > local1535; local1014--) {
													Static216.aClass186Array1[local1014 + 1] = Static216.aClass186Array1[local1014];
												}
												if (Static84.anInt2030 == 0) {
													Static216.aClass186Array1 = new Class186[100];
												}
												Static216.aClass186Array1[local1535 + 1] = local1916;
												Static84.anInt2030++;
												if (local456.equals(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9)) {
													Static60.aByte36 = local1899;
												}
											}
											Static126.anInt2792 = Static175.anInt3842;
											Static102.aClass263_56 = null;
											return true;
										} else if (Static267.aClass263_122 == Static102.aClass263_56) {
											local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
											if (local198 == 65535) {
												local198 = -1;
											}
											local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
											local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
											local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
											Static131.method2159(local72, local307, local247, local198);
											Static102.aClass263_56 = null;
											return true;
										} else {
											@Pc(2189) boolean local2189;
											@Pc(2247) boolean local2247;
											if (Static341.aClass263_147 == Static102.aClass263_56) {
												while (Static350.anInt6510 > Static5.aClass1_Sub3_Sub1_1.anInt1710) {
													local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
													local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
													local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
													local307 = Static5.aClass1_Sub3_Sub1_1.method1177();
													local626 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local536 = "";
													local2189 = false;
													if (local307 > 0) {
														local536 = Static5.aClass1_Sub3_Sub1_1.method1201();
														local2189 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
													}
													for (local1531 = 0; local1531 < Static323.anInt5975; local1531++) {
														if (local486) {
															if (local492.equals(Static169.aStringArray24[local1531])) {
																Static169.aStringArray24[local1531] = local456;
																Static318.aStringArray37[local1531] = local492;
																local456 = null;
																break;
															}
														} else if (local456.equals(Static169.aStringArray24[local1531])) {
															if (Static30.anIntArray50[local1531] != local307) {
																local2247 = true;
																for (@Pc(2254) Class41_Sub3_Sub1 local2254 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2967(); local2254 != null; local2254 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2970()) {
																	if (local2254.aString25.equals(local456)) {
																		if (local307 != 0 && local2254.aShort51 == 0) {
																			local2254.method5447();
																			local2247 = false;
																		} else if (local307 == 0 && local2254.aShort51 != 0) {
																			local2247 = false;
																			local2254.method5447();
																		}
																	}
																}
																if (local2247) {
																	Static212.aClass117_5.method2961(new Class41_Sub3_Sub1(local456, local307));
																}
																Static30.anIntArray50[local1531] = local307;
															}
															Static318.aStringArray37[local1531] = local492;
															Static416.aStringArray44[local1531] = local536;
															Static152.anIntArray332[local1531] = local626;
															Static258.aBooleanArray18[local1531] = local2189;
															local456 = null;
															break;
														}
													}
													if (local456 != null && Static323.anInt5975 < 200) {
														Static169.aStringArray24[Static323.anInt5975] = local456;
														Static318.aStringArray37[Static323.anInt5975] = local492;
														Static30.anIntArray50[Static323.anInt5975] = local307;
														Static416.aStringArray44[Static323.anInt5975] = local536;
														Static152.anIntArray332[Static323.anInt5975] = local626;
														Static258.aBooleanArray18[Static323.anInt5975] = local2189;
														Static323.anInt5975++;
													}
												}
												Static169.anInt3490 = 2;
												Static290.anInt5510 = Static175.anInt3842;
												local72 = Static323.anInt5975;
												while (local72 > 0) {
													local486 = true;
													local72--;
													for (local247 = 0; local247 < local72; local247++) {
														if (Static30.anIntArray50[local247] != Static156.aClass35_9.anInt1006 && Static30.anIntArray50[local247 + 1] == Static156.aClass35_9.anInt1006 || Static30.anIntArray50[local247] == 0 && Static30.anIntArray50[local247 + 1] != 0) {
															local307 = Static30.anIntArray50[local247];
															Static30.anIntArray50[local247] = Static30.anIntArray50[local247 + 1];
															Static30.anIntArray50[local247 + 1] = local307;
															local772 = Static416.aStringArray44[local247];
															Static416.aStringArray44[local247] = Static416.aStringArray44[local247 + 1];
															Static416.aStringArray44[local247 + 1] = local772;
															local536 = Static169.aStringArray24[local247];
															Static169.aStringArray24[local247] = Static169.aStringArray24[local247 + 1];
															Static169.aStringArray24[local247 + 1] = local536;
															local1912 = Static318.aStringArray37[local247];
															Static318.aStringArray37[local247] = Static318.aStringArray37[local247 + 1];
															Static318.aStringArray37[local247 + 1] = local1912;
															local1531 = Static152.anIntArray332[local247];
															Static152.anIntArray332[local247] = Static152.anIntArray332[local247 + 1];
															Static152.anIntArray332[local247 + 1] = local1531;
															local2247 = Static258.aBooleanArray18[local247];
															Static258.aBooleanArray18[local247] = Static258.aBooleanArray18[local247 + 1];
															Static258.aBooleanArray18[local247 + 1] = local2247;
															local486 = false;
														}
													}
													if (local486) {
														break;
													}
												}
												Static102.aClass263_56 = null;
												return true;
											} else if (Static102.aClass263_56 == Static121.aClass263_175) {
												Static28.method563(Static199.aClass126_7);
												Static102.aClass263_56 = null;
												return true;
											} else if (Static102.aClass263_56 == Static262.aClass263_70) {
												Static233.method3561(Static5.aClass1_Sub3_Sub1_1.method1201());
												Static102.aClass263_56 = null;
												return true;
											} else if (Static195.aClass263_88 == Static102.aClass263_56) {
												local1870 = Static5.aClass1_Sub3_Sub1_1.method1201();
												local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
												local492 = Static439.aClass127_2.method3086(local72).method4838(Static5.aClass1_Sub3_Sub1_1);
												Static118.method2011(null, 0, local492, local1870, 19, local72, local1870);
												Static102.aClass263_56 = null;
												return true;
											} else if (Static345.aClass263_151 == Static102.aClass263_56) {
												local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
												local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
												local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
												local307 = Static5.aClass1_Sub3_Sub1_1.method1177() << 0;
												local626 = Static5.aClass1_Sub3_Sub1_1.method1171();
												local1350 = Static5.aClass1_Sub3_Sub1_1.method1171();
												if (Static368.method5124(local198)) {
													Static6.method68(local626, local247, local307, true, local72, local1350);
												}
												Static102.aClass263_56 = null;
												return true;
											} else if (Static346.aClass263_152 == Static102.aClass263_56) {
												local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
												local72 = Static5.aClass1_Sub3_Sub1_1.method1202();
												local247 = Static5.aClass1_Sub3_Sub1_1.method1187();
												local307 = Static5.aClass1_Sub3_Sub1_1.method1191();
												if (Static368.method5124(local198)) {
													Static256.method1624(local307, local247, local72);
												}
												Static102.aClass263_56 = null;
												return true;
											} else if (Static102.aClass263_56 == Static184.aClass263_86) {
												Static28.method563(Static203.aClass126_8);
												Static102.aClass263_56 = null;
												return true;
											} else if (Static225.aClass263_97 == Static102.aClass263_56) {
												local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
												if (local198 == 65535) {
													local198 = -1;
												}
												local72 = Static5.aClass1_Sub3_Sub1_1.method1188();
												local247 = Static5.aClass1_Sub3_Sub1_1.method1225();
												local307 = Static5.aClass1_Sub3_Sub1_1.method1186();
												if (Static368.method5124(local247)) {
													Static220.method3423(local307, local198, local72);
													@Pc(2738) Class168 local2738 = Static43.aClass57_1.method1414(local198);
													Static413.method5604(local72, local2738.anInt4877, local2738.anInt4855, local2738.anInt4870);
													Static54.method998(local72, local2738.anInt4830, local2738.anInt4860, local2738.anInt4849);
												}
												Static102.aClass263_56 = null;
												return true;
											} else if (Static424.aClass263_170 == Static102.aClass263_56) {
												local198 = Static5.aClass1_Sub3_Sub1_1.method1217();
												@Pc(2773) byte local2773 = Static5.aClass1_Sub3_Sub1_1.method1189();
												Static366.aClass190_1.method4308(local198, local2773);
												Static102.aClass263_56 = null;
												return true;
											} else if (Static102.aClass263_56 == Static188.aClass263_87) {
												local198 = Static5.aClass1_Sub3_Sub1_1.method1218();
												local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
												if (local72 == 65535) {
													local72 = -1;
												}
												local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
												local307 = Static5.aClass1_Sub3_Sub1_1.method1170();
												if (local198 >= 1 && local198 <= 8) {
													if (local492.equalsIgnoreCase("null")) {
														local492 = null;
													}
													Static264.aStringArray35[local198 - 1] = local492;
													Static359.anIntArray613[local198 - 1] = local72;
													Static155.aBooleanArray15[local198 - 1] = local307 == 0;
												}
												Static102.aClass263_56 = null;
												return true;
											} else if (Static88.aClass263_50 == Static102.aClass263_56) {
												Static125.anInt2786 = Static5.aClass1_Sub3_Sub1_1.method1203();
												Static400.aBoolean463 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
												Static102.aClass263_56 = null;
												return true;
											} else {
												@Pc(2932) int local2932;
												if (Static102.aClass263_56 == Static6.aClass263_3) {
													local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
													local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
													local492 = local456;
													if (local486) {
														local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
													}
													local998 = Static5.aClass1_Sub3_Sub1_1.method1177();
													local1005 = Static5.aClass1_Sub3_Sub1_1.method1226();
													local1531 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local1535 = Static5.aClass1_Sub3_Sub1_1.method1177();
													@Pc(2928) long local2928 = local1005 + (local998 << 32);
													@Pc(2930) boolean local2930 = false;
													local2932 = 0;
													while (true) {
														if (local2932 >= 100) {
															if (local1531 <= 1 && Static64.method1237(local492)) {
																local2930 = true;
															}
															break;
														}
														if (local2928 == Static36.aLongArray7[local2932]) {
															local2930 = true;
															break;
														}
														local2932++;
													}
													if (!local2930 && Static362.anInt6659 == 0) {
														Static36.aLongArray7[Static397.anInt7182] = local2928;
														Static397.anInt7182 = (Static397.anInt7182 + 1) % 100;
														@Pc(2984) String local2984 = Static439.aClass127_2.method3086(local1535).method4838(Static5.aClass1_Sub3_Sub1_1);
														if (local1531 == 2) {
															Static118.method2011(null, 0, local2984, "<img=1>" + local492, 18, local1535, "<img=1>" + local456);
														} else if (local1531 == 1) {
															Static118.method2011(null, 0, local2984, "<img=0>" + local492, 18, local1535, "<img=0>" + local456);
														} else {
															Static118.method2011(null, 0, local2984, local492, 18, local1535, local456);
														}
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static102.aClass263_56 == Static31.aClass263_47) {
													if (Static456.anInt1594 != -1) {
														Static434.method5793(Static456.anInt1594, 0);
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static296.aClass263_133 == Static102.aClass263_56) {
													local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
													local72 = Static5.aClass1_Sub3_Sub1_1.method1187();
													local247 = Static5.aClass1_Sub3_Sub1_1.method1217();
													if (Static368.method5124(local247)) {
														Static148.method4197(local198, local72);
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static322.aClass263_142 == Static102.aClass263_56) {
													for (local198 = 0; local198 < Static135.aClass30_Sub1_Sub1_Sub2Array1.length; local198++) {
														if (Static135.aClass30_Sub1_Sub1_Sub2Array1[local198] != null) {
															Static135.aClass30_Sub1_Sub1_Sub2Array1[local198].anInt1303 = -1;
														}
													}
													for (local72 = 0; local72 < Static127.anInt2832; local72++) {
														Static324.aClass1_Sub27Array2[local72].aClass30_Sub1_Sub1_Sub1_2.anInt1303 = -1;
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static307.aClass263_137 == Static102.aClass263_56) {
													Static162.method2668(Static429.aBoolean496);
													Static102.aClass263_56 = null;
													return false;
												} else if (Static102.aClass263_56 == Static168.aClass263_34) {
													local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
													local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local626 = Static5.aClass1_Sub3_Sub1_1.method1171();
													local1350 = Static5.aClass1_Sub3_Sub1_1.method1177();
													if (Static368.method5124(local198)) {
														Static194.aBooleanArray16[local72] = true;
														Static35.anIntArray71[local72] = local247;
														Static23.anIntArray41[local72] = local307;
														Static169.anIntArray354[local72] = local626;
														Static275.anIntArray501[local72] = local1350;
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static165.aClass263_82 == Static102.aClass263_56) {
													Static336.method4734(false);
													Static102.aClass263_56 = null;
													return true;
												} else if (Static102.aClass263_56 == Static87.aClass263_48) {
													local1870 = Static5.aClass1_Sub3_Sub1_1.method1201();
													local456 = Static116.method1885(Static220.method3425(Static5.aClass1_Sub3_Sub1_1));
													Static227.method3471(local1870, 0, local456, 6, local1870);
													Static102.aClass263_56 = null;
													return true;
												} else if (Static273.aClass263_125 == Static102.aClass263_56) {
													Static54.anInt1412 = Static5.aClass1_Sub3_Sub1_1.method1171();
													Static102.aClass263_56 = null;
													Static111.anInt4635 = Static175.anInt3842;
													return true;
												} else if (Static102.aClass263_56 == Static312.aClass263_140) {
													local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
													local72 = Static5.aClass1_Sub3_Sub1_1.method1217();
													local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
													if (Static368.method5124(local198)) {
														if (local247 == 2) {
															Static378.method5232();
														}
														Static456.anInt1594 = local72;
														Static96.method1654(local72);
														Static191.method3101(false);
														Static178.method2998(Static456.anInt1594);
														for (local307 = 0; local307 < 100; local307++) {
															Static58.aBooleanArray8[local307] = true;
														}
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static102.aClass263_56 == Static265.aClass263_119) {
													local198 = Static5.aClass1_Sub3_Sub1_1.method1172();
													local72 = Static5.aClass1_Sub3_Sub1_1.method1177();
													local247 = Static5.aClass1_Sub3_Sub1_1.method1207();
													if (Static368.method5124(local72)) {
														Static461.method5937(local247, local198);
													}
													Static102.aClass263_56 = null;
													return true;
												} else if (Static102.aClass263_56 == Static120.aClass263_67) {
													local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
													@Pc(3347) byte[] local3347 = new byte[Static350.anInt6510 - 1];
													Static5.aClass1_Sub3_Sub1_1.method1173(local3347, Static350.anInt6510 - 1);
													Static39.method741(local486, local3347);
													Static102.aClass263_56 = null;
													return true;
												} else if (Static102.aClass263_56 == Static80.aClass263_177) {
													Static359.method5066();
													Static102.aClass263_56 = null;
													return false;
												} else {
													@Pc(3422) int local3422;
													if (Static72.aClass263_42 == Static102.aClass263_56) {
														local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
														local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
														local492 = local456;
														if (local486) {
															local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
														}
														local998 = Static5.aClass1_Sub3_Sub1_1.method1177();
														local1005 = Static5.aClass1_Sub3_Sub1_1.method1226();
														local1531 = Static5.aClass1_Sub3_Sub1_1.method1171();
														@Pc(3418) long local3418 = local1005 + (local998 << 32);
														@Pc(3420) boolean local3420 = false;
														local3422 = 0;
														while (true) {
															if (local3422 >= 100) {
																if (local1531 <= 1) {
																	if (Static400.aBoolean463 && !Static223.aBoolean279 || Static11.aBoolean7) {
																		local3420 = true;
																	} else if (Static64.method1237(local492)) {
																		local3420 = true;
																	}
																}
																break;
															}
															if (Static36.aLongArray7[local3422] == local3418) {
																local3420 = true;
																break;
															}
															local3422++;
														}
														if (!local3420 && Static362.anInt6659 == 0) {
															Static36.aLongArray7[Static397.anInt7182] = local3418;
															Static397.anInt7182 = (Static397.anInt7182 + 1) % 100;
															@Pc(3485) String local3485 = Static116.method1885(Static220.method3425(Static5.aClass1_Sub3_Sub1_1));
															if (local1531 == 2) {
																Static118.method2011(null, 0, local3485, "<img=1>" + local492, 7, -1, "<img=1>" + local456);
															} else if (local1531 == 1) {
																Static118.method2011(null, 0, local3485, "<img=0>" + local492, 7, -1, "<img=0>" + local456);
															} else {
																Static118.method2011(null, 0, local3485, local492, 3, -1, local456);
															}
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static82.aClass263_45) {
														local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
														local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
														local492 = local456;
														if (local486) {
															local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
														}
														local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
														local626 = Static5.aClass1_Sub3_Sub1_1.method1177();
														local1901 = false;
														if (local307 <= 1 && Static64.method1237(local492)) {
															local1901 = true;
														}
														if (!local1901 && Static362.anInt6659 == 0) {
															local1912 = Static439.aClass127_2.method3086(local626).method4838(Static5.aClass1_Sub3_Sub1_1);
															if (local307 == 2) {
																Static118.method2011(null, 0, local1912, "<img=1>" + local492, 25, local626, "<img=1>" + local456);
															} else if (local307 == 1) {
																Static118.method2011(null, 0, local1912, "<img=0>" + local492, 25, local626, "<img=0>" + local456);
															} else {
																Static118.method2011(null, 0, local1912, local492, 25, local626, local456);
															}
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static428.aClass263_172 == Static102.aClass263_56) {
														Static219.aString36 = Static350.anInt6510 <= 2 ? Static130.aClass158_76.method3594(Static365.anInt6682) : Static5.aClass1_Sub3_Sub1_1.method1201();
														Static198.anInt7952 = Static350.anInt6510 > 0 ? Static5.aClass1_Sub3_Sub1_1.method1177() : -1;
														if (Static198.anInt7952 == 65535) {
															Static198.anInt7952 = -1;
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static316.aClass263_141 == Static102.aClass263_56) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
														local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
														local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
														local307 = Static5.aClass1_Sub3_Sub1_1.method1177();
														local626 = Static5.aClass1_Sub3_Sub1_1.method1188();
														if (Static368.method5124(local72)) {
															Static80.method6096(local198 << 16 | local247, local307, local626, 7);
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static176.aClass263_84) {
														Static28.method563(Static452.aClass126_17);
														Static102.aClass263_56 = null;
														return true;
													} else if (Static251.aClass263_111 == Static102.aClass263_56) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1210();
														local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
														if (local72 == 65535) {
															local72 = -1;
														}
														local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
														Static356.method5670(local247, local72, local198);
														Static102.aClass263_56 = null;
														return true;
													} else if (Static204.aClass263_91 == Static102.aClass263_56) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
														if (local198 == 65535) {
															local198 = -1;
														}
														local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
														local247 = Static5.aClass1_Sub3_Sub1_1.method1166();
														Static231.method3515(local72, local247, local198);
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static379.aClass263_160) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
														local72 = Static5.aClass1_Sub3_Sub1_1.method1221();
														local247 = Static5.aClass1_Sub3_Sub1_1.method1172();
														if (Static368.method5124(local198)) {
															Static286.method4188(local247, local72);
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static62.aClass263_32 == Static102.aClass263_56) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1171();
														local72 = local198 >> 5;
														local247 = local198 & 0x1F;
														if (local247 == 0) {
															Static393.aClass178Array1[local72] = null;
															Static102.aClass263_56 = null;
															return true;
														}
														@Pc(3880) Class178 local3880 = new Class178();
														local3880.anInt5270 = local247;
														local3880.anInt5268 = Static5.aClass1_Sub3_Sub1_1.method1171();
														if (local3880.anInt5268 >= 0 && local3880.anInt5268 < Static3.aClass137Array1.length) {
															if (local3880.anInt5270 == 1 || local3880.anInt5270 == 10) {
																local3880.anInt5275 = Static5.aClass1_Sub3_Sub1_1.method1177();
																Static5.aClass1_Sub3_Sub1_1.anInt1710 += 6;
															} else if (local3880.anInt5270 >= 2 && local3880.anInt5270 <= 6) {
																if (local3880.anInt5270 == 2) {
																	local3880.anInt5272 = 64;
																	local3880.anInt5273 = 64;
																}
																if (local3880.anInt5270 == 3) {
																	local3880.anInt5272 = 0;
																	local3880.anInt5273 = 64;
																}
																if (local3880.anInt5270 == 4) {
																	local3880.anInt5273 = 64;
																	local3880.anInt5272 = 128;
																}
																if (local3880.anInt5270 == 5) {
																	local3880.anInt5272 = 64;
																	local3880.anInt5273 = 0;
																}
																if (local3880.anInt5270 == 6) {
																	local3880.anInt5272 = 64;
																	local3880.anInt5273 = 128;
																}
																local3880.anInt5270 = 2;
																local3880.anInt5277 = Static5.aClass1_Sub3_Sub1_1.method1171();
																local3880.anInt5272 += Static5.aClass1_Sub3_Sub1_1.method1177() - Static278.anInt5374 << 7;
																local3880.anInt5273 += Static5.aClass1_Sub3_Sub1_1.method1177() - Static380.anInt6896 << 7;
																local3880.anInt5265 = Static5.aClass1_Sub3_Sub1_1.method1171() << 0;
																local3880.anInt5267 = Static5.aClass1_Sub3_Sub1_1.method1177();
															}
															local3880.anInt5264 = Static5.aClass1_Sub3_Sub1_1.method1177();
															if (local3880.anInt5264 == 65535) {
																local3880.anInt5264 = -1;
															}
															Static393.aClass178Array1[local72] = local3880;
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static302.aClass263_134) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
														local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
														local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
														if (Static368.method5124(local72)) {
															Static190.method3096(local198, local247);
														}
														Static102.aClass263_56 = null;
														return true;
													} else if (Static340.aClass263_145 == Static102.aClass263_56) {
														local198 = Static5.aClass1_Sub3_Sub1_1.method1171();
														@Pc(4093) boolean local4093 = (local198 & 0x1) == 1;
														local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
														local770 = Static5.aClass1_Sub3_Sub1_1.method1201();
														if (local770.equals("")) {
															local770 = local492;
														}
														local772 = Static5.aClass1_Sub3_Sub1_1.method1201();
														local536 = Static5.aClass1_Sub3_Sub1_1.method1201();
														if (local536.equals("")) {
															local536 = local772;
														}
														if (local4093) {
															for (local1527 = 0; local1527 < Static223.anInt4457; local1527++) {
																if (Static325.aStringArray38[local1527].equals(local536)) {
																	Static406.aStringArray30[local1527] = local492;
																	Static325.aStringArray38[local1527] = local770;
																	Static244.aStringArray31[local1527] = local772;
																	Static210.aStringArray28[local1527] = local536;
																	break;
																}
															}
														} else {
															Static406.aStringArray30[Static223.anInt4457] = local492;
															Static325.aStringArray38[Static223.anInt4457] = local770;
															Static244.aStringArray31[Static223.anInt4457] = local772;
															Static210.aStringArray28[Static223.anInt4457] = local536;
															Static340.aBooleanArray21[Static223.anInt4457] = (local198 & 0x2) == 2;
															Static223.anInt4457++;
														}
														Static102.aClass263_56 = null;
														Static290.anInt5510 = Static175.anInt3842;
														return true;
													} else if (Static102.aClass263_56 == Static427.aClass263_171) {
														Static201.method3240(Static5.aClass1_Sub3_Sub1_1, Static150.aClass183_3, Static350.anInt6510);
														Static102.aClass263_56 = null;
														return true;
													} else if (Static460.aClass263_139 == Static102.aClass263_56) {
														Static223.anInt4457 = Static5.aClass1_Sub3_Sub1_1.method1171();
														for (local198 = 0; local198 < Static223.anInt4457; local198++) {
															Static406.aStringArray30[local198] = Static5.aClass1_Sub3_Sub1_1.method1201();
															Static325.aStringArray38[local198] = Static5.aClass1_Sub3_Sub1_1.method1201();
															if (Static325.aStringArray38[local198].equals("")) {
																Static325.aStringArray38[local198] = Static406.aStringArray30[local198];
															}
															Static244.aStringArray31[local198] = Static5.aClass1_Sub3_Sub1_1.method1201();
															Static210.aStringArray28[local198] = Static5.aClass1_Sub3_Sub1_1.method1201();
															if (Static210.aStringArray28[local198].equals("")) {
																Static210.aStringArray28[local198] = Static244.aStringArray31[local198];
															}
															Static340.aBooleanArray21[local198] = false;
														}
														Static290.anInt5510 = Static175.anInt3842;
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static135.aClass263_77) {
														Static28.method563(Static223.aClass126_9);
														Static102.aClass263_56 = null;
														return true;
													} else if (aClass263_176 == Static102.aClass263_56) {
														Static216.anInt4345 = Static5.aClass1_Sub3_Sub1_1.method1189() << 3;
														Static180.anInt3909 = Static5.aClass1_Sub3_Sub1_1.method1218();
														Static182.anInt3941 = Static5.aClass1_Sub3_Sub1_1.method1193() << 3;
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static376.aClass263_159) {
														if (Static93.aFrame2 != null) {
															Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
														}
														@Pc(4333) byte[] local4333 = new byte[Static350.anInt6510];
														Static5.aClass1_Sub3_Sub1_1.method316(local4333, Static350.anInt6510);
														local456 = Static289.method4251(Static350.anInt6510, 0, local4333);
														Static284.method2365(Static262.anInt2805 == 1, local456, Static150.aClass183_3, true);
														Static102.aClass263_56 = null;
														return true;
													} else if (Static102.aClass263_56 == Static418.aClass263_168) {
														Static28.method563(Static245.aClass126_10);
														Static102.aClass263_56 = null;
														return true;
													} else {
														@Pc(4423) long local4423;
														@Pc(4441) Class1_Sub29 local4441;
														@Pc(4429) Class1_Sub29 local4429;
														if (Static200.aClass263_90 == Static102.aClass263_56) {
															local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
															local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
															local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
															local307 = Static5.aClass1_Sub3_Sub1_1.method1217();
															if (local307 == 65535) {
																local307 = -1;
															}
															local626 = Static5.aClass1_Sub3_Sub1_1.method1225();
															if (local626 == 65535) {
																local626 = -1;
															}
															if (Static368.method5124(local72)) {
																for (local1350 = local626; local1350 <= local307; local1350++) {
																	local4423 = ((long) local247 << 32) + (long) local1350;
																	local4429 = (Class1_Sub29) Static227.aClass38_19.method765(local4423);
																	if (local4429 != null) {
																		local4441 = new Class1_Sub29(local4429.anInt5243, local198);
																		local4429.method6178();
																	} else if (local1350 == -1) {
																		local4441 = new Class1_Sub29(Static300.method4351(local247).aClass1_Sub29_1.anInt5243, local198);
																	} else {
																		local4441 = new Class1_Sub29(0, local198);
																	}
																	Static227.aClass38_19.method766(local4441, local4423);
																}
															}
															Static102.aClass263_56 = null;
															return true;
														} else if (Static102.aClass263_56 == Static119.aClass263_66) {
															local198 = Static5.aClass1_Sub3_Sub1_1.method1217();
															if (local198 == 65535) {
																local198 = -1;
															}
															local72 = Static5.aClass1_Sub3_Sub1_1.method1172();
															local247 = Static5.aClass1_Sub3_Sub1_1.method1177();
															if (Static368.method5124(local247)) {
																Static158.method2632(local72, local198);
															}
															Static102.aClass263_56 = null;
															return true;
														} else {
															@Pc(4570) int local4570;
															if (Static154.aClass263_81 == Static102.aClass263_56) {
																local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
																local456 = Static5.aClass1_Sub3_Sub1_1.method1201();
																local492 = local456;
																if (local486) {
																	local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
																}
																local998 = Static5.aClass1_Sub3_Sub1_1.method1162();
																local1005 = Static5.aClass1_Sub3_Sub1_1.method1177();
																local1010 = Static5.aClass1_Sub3_Sub1_1.method1226();
																local1014 = Static5.aClass1_Sub3_Sub1_1.method1171();
																@Pc(4566) long local4566 = local1010 + (local1005 << 32);
																@Pc(4568) boolean local4568 = false;
																local4570 = 0;
																while (true) {
																	if (local4570 >= 100) {
																		if (local1014 <= 1) {
																			if (Static400.aBoolean463 && !Static223.aBoolean279 || Static11.aBoolean7) {
																				local4568 = true;
																			} else if (Static64.method1237(local492)) {
																				local4568 = true;
																			}
																		}
																		break;
																	}
																	if (Static36.aLongArray7[local4570] == local4566) {
																		local4568 = true;
																		break;
																	}
																	local4570++;
																}
																if (!local4568 && Static362.anInt6659 == 0) {
																	Static36.aLongArray7[Static397.anInt7182] = local4566;
																	Static397.anInt7182 = (Static397.anInt7182 + 1) % 100;
																	@Pc(4632) String local4632 = Static116.method1885(Static220.method3425(Static5.aClass1_Sub3_Sub1_1));
																	if (local1014 == 2 || local1014 == 3) {
																		Static118.method2011(Static127.method2083(local998), 0, local4632, "<img=1>" + local492, 9, -1, "<img=1>" + local456);
																	} else if (local1014 == 1) {
																		Static118.method2011(Static127.method2083(local998), 0, local4632, "<img=0>" + local492, 9, -1, "<img=0>" + local456);
																	} else {
																		Static118.method2011(Static127.method2083(local998), 0, local4632, local492, 9, -1, local456);
																	}
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static232.aClass263_102) {
																Static457.method6171(Static350.anInt6510, Static5.aClass1_Sub3_Sub1_1);
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static285.aClass263_129) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																if (Static368.method5124(local198)) {
																	Static214.method5444();
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static133.aClass263_72 == Static102.aClass263_56) {
																Static180.anInt3909 = Static5.aClass1_Sub3_Sub1_1.method1218();
																Static216.anInt4345 = Static5.aClass1_Sub3_Sub1_1.method1189() << 3;
																Static182.anInt3941 = Static5.aClass1_Sub3_Sub1_1.method1212() << 3;
																for (@Pc(4770) Class1_Sub14 local4770 = (Class1_Sub14) Static156.aClass38_16.method767(); local4770 != null; local4770 = (Class1_Sub14) Static156.aClass38_16.method773()) {
																	local72 = (int) (local4770.aLong228 >> 28 & 0x3L);
																	local247 = (int) (local4770.aLong228 & 0x3FFFL);
																	local307 = local247 - Static278.anInt5374;
																	local626 = (int) (local4770.aLong228 >> 14 & 0x3FFFL);
																	local1350 = local626 - Static380.anInt6896;
																	if (Static180.anInt3909 == local72 && local307 >= Static216.anInt4345 && local307 < Static216.anInt4345 + 8 && Static182.anInt3941 <= local1350 && Static182.anInt3941 + 8 > local1350) {
																		local4770.method6178();
																		if (local307 >= 0 && local1350 >= 0 && local307 < Static209.anInt4283 && local1350 < Static211.anInt4295) {
																			Static54.method1000(local307, local1350, Static180.anInt3909);
																		}
																	}
																}
																for (@Pc(4874) Class1_Sub40 local4874 = (Class1_Sub40) Static239.aClass203_37.method4548(); local4874 != null; local4874 = (Class1_Sub40) Static239.aClass203_37.method4545()) {
																	if (local4874.anInt6621 >= Static216.anInt4345 && Static216.anInt4345 + 8 > local4874.anInt6621 && Static182.anInt3941 <= local4874.anInt6627 && Static182.anInt3941 + 8 > local4874.anInt6627 && local4874.anInt6626 == Static180.anInt3909) {
																		local4874.anInt6628 = 0;
																	}
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static184.aClass263_85 == Static102.aClass263_56) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1172();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1217();
																local247 = Static5.aClass1_Sub3_Sub1_1.method1171();
																local307 = Static5.aClass1_Sub3_Sub1_1.method1217();
																local626 = Static5.aClass1_Sub3_Sub1_1.method1177();
																local1901 = (local247 & 0x80) != 0;
																if (local198 >> 30 == 0) {
																	@Pc(5182) Class235 local5182;
																	@Pc(5117) Class223 local5117;
																	@Pc(5131) Class235 local5131;
																	if (local198 >> 29 != 0) {
																		local1527 = local198 & 0xFFFF;
																		@Pc(5076) Class1_Sub27 local5076 = (Class1_Sub27) Static24.aClass38_3.method765((long) local1527);
																		if (local5076 != null) {
																			@Pc(5081) Class30_Sub1_Sub1_Sub1 local5081 = local5076.aClass30_Sub1_Sub1_Sub1_2;
																			if (local307 == 65535) {
																				local307 = -1;
																			}
																			@Pc(5090) boolean local5090 = true;
																			local1020 = local1901 ? local5081.anInt1249 : local5081.anInt1279;
																			if (local307 != -1 && local1020 != -1) {
																				if (local307 == local1020) {
																					local5117 = Static145.aClass63_1.method1524(local307);
																					if (local5117.aBoolean420 && local5117.anInt6642 != -1) {
																						local5131 = Static107.aClass239_1.method5420(local5117.anInt6642);
																						local4570 = local5131.anInt6852;
																						if (local4570 == 0 || local4570 == 2) {
																							local5090 = false;
																						} else if (local4570 == 1) {
																							local5090 = true;
																						}
																					}
																				} else {
																					local5117 = Static145.aClass63_1.method1524(local307);
																					@Pc(5165) Class223 local5165 = Static145.aClass63_1.method1524(local1020);
																					if (local5117.anInt6642 != -1 && local5165.anInt6642 != -1) {
																						local5182 = Static107.aClass239_1.method5420(local5117.anInt6642);
																						@Pc(5190) Class235 local5190 = Static107.aClass239_1.method5420(local5165.anInt6642);
																						if (local5190.anInt6856 > local5182.anInt6856) {
																							local5090 = false;
																						}
																					}
																				}
																			}
																			if (local5090) {
																				if (local1901) {
																					local5081.anInt1252 = 0;
																					local5081.anInt1289 = 0;
																					local5081.anInt1270 = 1;
																					local5081.anInt1275 = local247 & 0x7;
																					local5081.anInt1287 = local72;
																					local5081.anInt1295 = Static187.anInt3975 + local626;
																					local5081.anInt1249 = local307;
																					if (Static187.anInt3975 < local5081.anInt1295) {
																						local5081.anInt1252 = -1;
																					}
																					if (local5081.anInt1249 != -1 && local5081.anInt1295 == Static187.anInt3975) {
																						local3422 = Static145.aClass63_1.method1524(local5081.anInt1249).anInt6642;
																						if (local3422 != -1) {
																							local5131 = Static107.aClass239_1.method5420(local3422);
																							if (local5131 != null && local5131.anIntArray633 != null) {
																								Static290.method4258(local5081.anInt7488, 0, local5081.aByte102, local5081.anInt7490, false, local5131);
																							}
																						}
																					}
																				} else {
																					local5081.anInt1296 = local72;
																					local5081.anInt1261 = 0;
																					local5081.anInt1264 = 0;
																					local5081.anInt1279 = local307;
																					local5081.anInt1308 = local247 & 0x7;
																					local5081.anInt1284 = 1;
																					local5081.anInt1256 = local626 + Static187.anInt3975;
																					if (Static187.anInt3975 < local5081.anInt1256) {
																						local5081.anInt1261 = -1;
																					}
																					if (local5081.anInt1279 != -1 && Static187.anInt3975 == local5081.anInt1256) {
																						local3422 = Static145.aClass63_1.method1524(local5081.anInt1279).anInt6642;
																						if (local3422 != -1) {
																							local5131 = Static107.aClass239_1.method5420(local3422);
																							if (local5131 != null && local5131.anIntArray633 != null) {
																								Static290.method4258(local5081.anInt7488, 0, local5081.aByte102, local5081.anInt7490, false, local5131);
																							}
																						}
																					}
																				}
																			}
																		}
																	} else if (local198 >> 28 != 0) {
																		local1527 = local198 & 0xFFFF;
																		@Pc(5384) Class30_Sub1_Sub1_Sub2 local5384;
																		if (local1527 == Static32.anInt894) {
																			local5384 = Static429.aClass30_Sub1_Sub1_Sub2_2;
																		} else {
																			local5384 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local1527];
																		}
																		if (local5384 != null) {
																			if (local307 == 65535) {
																				local307 = -1;
																			}
																			local2247 = true;
																			local1014 = local1901 ? local5384.anInt1249 : local5384.anInt1279;
																			@Pc(5439) Class235 local5439;
																			if (local307 != -1 && local1014 != -1) {
																				@Pc(5426) Class223 local5426;
																				if (local307 == local1014) {
																					local5426 = Static145.aClass63_1.method1524(local307);
																					if (local5426.aBoolean420 && local5426.anInt6642 != -1) {
																						local5439 = Static107.aClass239_1.method5420(local5426.anInt6642);
																						local2932 = local5439.anInt6852;
																						if (local2932 == 0 || local2932 == 2) {
																							local2247 = false;
																						} else if (local2932 == 1) {
																							local2247 = true;
																						}
																					}
																				} else {
																					local5426 = Static145.aClass63_1.method1524(local307);
																					local5117 = Static145.aClass63_1.method1524(local1014);
																					if (local5426.anInt6642 != -1 && local5117.anInt6642 != -1) {
																						local5131 = Static107.aClass239_1.method5420(local5426.anInt6642);
																						local5182 = Static107.aClass239_1.method5420(local5117.anInt6642);
																						if (local5182.anInt6856 > local5131.anInt6856) {
																							local2247 = false;
																						}
																					}
																				}
																			}
																			if (local2247) {
																				if (local1901) {
																					local5384.anInt1249 = local307;
																					local5384.anInt1270 = 1;
																					local5384.anInt1275 = local247 & 0x7;
																					local5384.anInt1295 = local626 + Static187.anInt3975;
																					local5384.anInt1252 = 0;
																					local5384.anInt1289 = 0;
																					local5384.anInt1287 = local72;
																					if (local5384.anInt1249 == 65535) {
																						local5384.anInt1249 = -1;
																					}
																					if (Static187.anInt3975 < local5384.anInt1295) {
																						local5384.anInt1252 = -1;
																					}
																					if (local5384.anInt1249 != -1 && Static187.anInt3975 == local5384.anInt1295) {
																						local1020 = Static145.aClass63_1.method1524(local5384.anInt1249).anInt6642;
																						if (local1020 != -1) {
																							local5439 = Static107.aClass239_1.method5420(local1020);
																							if (local5439 != null && local5439.anIntArray633 != null) {
																								Static290.method4258(local5384.anInt7488, 0, local5384.aByte102, local5384.anInt7490, local5384 == Static429.aClass30_Sub1_Sub1_Sub2_2, local5439);
																							}
																						}
																					}
																				} else {
																					local5384.anInt1308 = local247 & 0x7;
																					local5384.anInt1256 = Static187.anInt3975 + local626;
																					local5384.anInt1279 = local307;
																					local5384.anInt1284 = 1;
																					local5384.anInt1264 = 0;
																					local5384.anInt1261 = 0;
																					local5384.anInt1296 = local72;
																					if (local5384.anInt1256 > Static187.anInt3975) {
																						local5384.anInt1261 = -1;
																					}
																					if (local5384.anInt1279 == 65535) {
																						local5384.anInt1279 = -1;
																					}
																					if (local5384.anInt1279 != -1 && local5384.anInt1256 == Static187.anInt3975) {
																						local1020 = Static145.aClass63_1.method1524(local5384.anInt1279).anInt6642;
																						if (local1020 != -1) {
																							local5439 = Static107.aClass239_1.method5420(local1020);
																							if (local5439 != null && local5439.anIntArray633 != null) {
																								Static290.method4258(local5384.anInt7488, 0, local5384.aByte102, local5384.anInt7490, local5384 == Static429.aClass30_Sub1_Sub1_Sub2_2, local5439);
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																} else {
																	local1527 = local198 >> 28 & 0x3;
																	local1531 = (local198 >> 14 & 0x3FFF) - Static278.anInt5374;
																	local1535 = (local198 & 0x3FFF) - Static380.anInt6896;
																	if (local1531 >= 0 && local1535 >= 0 && Static209.anInt4283 > local1531 && local1535 < Static211.anInt4295) {
																		local1014 = local1531 * 128 + 64;
																		local1020 = local1535 * 128 + 64;
																		local3422 = local1527;
																		if (local1527 < 3 && Static457.method6172(local1535, local1531)) {
																			local3422 = local1527 + 1;
																		}
																		@Pc(5050) Class30_Sub1_Sub3 local5050 = new Class30_Sub1_Sub3(local307, 0, Static187.anInt3975, local1527, local3422, local1014, Static227.method3475(local1014, local1020, local1527) - local72, local1020, local1531, local1531, local1535, local1535, local247);
																		Static184.aClass203_32.method4551(new Class1_Sub1_Sub1(local5050));
																	}
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static70.aClass263_40) {
																Static28.method563(Static57.aClass126_3);
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static274.aClass263_126) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1188();
																if (Static368.method5124(local198)) {
																	@Pc(5730) Class1_Sub39 local5730 = (Class1_Sub39) Static177.aClass38_18.method765((long) local72);
																	if (local5730 != null) {
																		Static285.method4176(local5730, false, true);
																	}
																	if (Static18.aClass68_1 != null) {
																		Static446.method6042(Static18.aClass68_1);
																		Static18.aClass68_1 = null;
																	}
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static61.aClass263_30) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1225();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1187();
																Static366.aClass190_1.method4308(local198, local72);
																Static102.aClass263_56 = null;
																return true;
															} else if (Static137.aClass263_78 == Static102.aClass263_56) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1218();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1188();
																local247 = Static5.aClass1_Sub3_Sub1_1.method1170();
																Static2.anIntArray5[local247] = local72;
																Static365.anIntArray617[local247] = local198;
																Static240.anIntArray442[local247] = 1;
																local307 = Static25.anIntArray45[local247] - 1;
																for (local626 = 0; local626 < local307; local626++) {
																	if (local72 >= Class1_Sub8_Sub1.anIntArray116[local626]) {
																		Static240.anIntArray442[local247] = local626 + 2;
																	}
																}
																Static333.anIntArray575[Static217.anInt4357++ & 0x1F] = local247;
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Class257.lb) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
																local1210 = (local72 & 0x1) == 1;
																while (Static5.aClass1_Sub3_Sub1_1.anInt1710 < Static350.anInt6510) {
																	local307 = Static5.aClass1_Sub3_Sub1_1.method1168();
																	local626 = Static5.aClass1_Sub3_Sub1_1.method1177();
																	local1350 = 0;
																	if (local626 != 0) {
																		local1350 = Static5.aClass1_Sub3_Sub1_1.method1171();
																		if (local1350 == 255) {
																			local1350 = Static5.aClass1_Sub3_Sub1_1.method1188();
																		}
																	}
																	Static92.method1567(local1210, local307, local198, local1350, local626 - 1);
																}
																Static383.anIntArray660[Static271.anInt5263++ & 0x1F] = local198;
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static247.aClass263_108) {
																Static28.method563(Static292.aClass126_11);
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static21.aClass263_158) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1171();
																local1210 = (local72 & 0x1) == 1;
																Static364.method5097(local1210, local198);
																local307 = Static5.aClass1_Sub3_Sub1_1.method1177();
																for (local626 = 0; local626 < local307; local626++) {
																	local1350 = Static5.aClass1_Sub3_Sub1_1.method1171();
																	if (local1350 == 255) {
																		local1350 = Static5.aClass1_Sub3_Sub1_1.method1172();
																	}
																	local1527 = Static5.aClass1_Sub3_Sub1_1.method1225();
																	Static92.method1567(local1210, local626, local198, local1350, local1527 - 1);
																}
																Static383.anIntArray660[Static271.anInt5263++ & 0x1F] = local198;
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static62.aClass263_31) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																if (local198 == 65535) {
																	local198 = -1;
																}
																local72 = Static5.aClass1_Sub3_Sub1_1.method1188();
																local247 = Static5.aClass1_Sub3_Sub1_1.method1188();
																local307 = Static5.aClass1_Sub3_Sub1_1.method1217();
																if (local307 == 65535) {
																	local307 = -1;
																}
																local626 = Static5.aClass1_Sub3_Sub1_1.method1225();
																if (Static368.method5124(local626)) {
																	for (local1350 = local307; local1350 <= local198; local1350++) {
																		local4423 = (long) local1350 + ((long) local247 << 32);
																		local4429 = (Class1_Sub29) Static227.aClass38_19.method765(local4423);
																		if (local4429 != null) {
																			local4441 = new Class1_Sub29(local72, local4429.anInt5254);
																			local4429.method6178();
																		} else if (local1350 == -1) {
																			local4441 = new Class1_Sub29(local72, Static300.method4351(local247).aClass1_Sub29_1.anInt5254);
																		} else {
																			local4441 = new Class1_Sub29(local72, -1);
																		}
																		Static227.aClass38_19.method766(local4441, local4423);
																	}
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static110.aClass263_166 == Static102.aClass263_56) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1207();
																local72 = Static5.aClass1_Sub3_Sub1_1.method1225();
																local492 = Static5.aClass1_Sub3_Sub1_1.method1201();
																if (Static368.method5124(local198)) {
																	Static366.method5108(local72, local492);
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static426.aClass263_28) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1177();
																if (Static368.method5124(local198)) {
																	Static55.method1062();
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static304.aClass263_136) {
																local198 = Static5.aClass1_Sub3_Sub1_1.method1217();
																if (local198 == 65535) {
																	local198 = -1;
																}
																local72 = Static5.aClass1_Sub3_Sub1_1.method1207();
																local247 = Static5.aClass1_Sub3_Sub1_1.method1187();
																if (Static368.method5124(local72)) {
																	Static80.method6096(local198, -1, local247, 2);
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static102.aClass263_56 == Static303.aClass263_135) {
																Static365.anInt6681 = Static5.aClass1_Sub3_Sub1_1.method1215();
																Static111.anInt4635 = Static175.anInt3842;
																Static102.aClass263_56 = null;
																return true;
															} else if (Static227.aClass263_99 == Static102.aClass263_56) {
																Static64.method1238();
																Static102.aClass263_56 = null;
																return false;
															} else if (Static243.aClass263_107 == Static102.aClass263_56) {
																Static126.anInt2792 = Static175.anInt3842;
																if (Static350.anInt6510 == 0) {
																	Static364.aString59 = null;
																	Static306.aString52 = null;
																	Static84.anInt2030 = 0;
																	Static102.aClass263_56 = null;
																	Static216.aClass186Array1 = null;
																	return true;
																}
																Static306.aString52 = Static5.aClass1_Sub3_Sub1_1.method1201();
																local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
																if (local486) {
																	Static5.aClass1_Sub3_Sub1_1.method1201();
																}
																@Pc(6268) long local6268 = Static5.aClass1_Sub3_Sub1_1.method1162();
																Static364.aString59 = Static434.method5788(local6268);
																Static122.aByte46 = Static5.aClass1_Sub3_Sub1_1.method1212();
																local307 = Static5.aClass1_Sub3_Sub1_1.method1171();
																if (local307 == 255) {
																	Static102.aClass263_56 = null;
																	return true;
																}
																Static84.anInt2030 = local307;
																@Pc(6292) Class186[] local6292 = new Class186[100];
																for (local1350 = 0; local1350 < Static84.anInt2030; local1350++) {
																	local6292[local1350] = new Class186();
																	local6292[local1350].aString47 = Static5.aClass1_Sub3_Sub1_1.method1201();
																	local486 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
																	if (local486) {
																		local6292[local1350].aString46 = Static5.aClass1_Sub3_Sub1_1.method1201();
																	} else {
																		local6292[local1350].aString46 = local6292[local1350].aString47;
																	}
																	local6292[local1350].aString48 = Static311.method4474(local6292[local1350].aString46);
																	local6292[local1350].anInt5502 = Static5.aClass1_Sub3_Sub1_1.method1177();
																	local6292[local1350].aByte71 = Static5.aClass1_Sub3_Sub1_1.method1212();
																	local6292[local1350].aString49 = Static5.aClass1_Sub3_Sub1_1.method1201();
																	if (local6292[local1350].aString46.equals(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9)) {
																		Static60.aByte36 = local6292[local1350].aByte71;
																	}
																}
																local1535 = Static84.anInt2030;
																while (local1535 > 0) {
																	local1535--;
																	local2189 = true;
																	for (local1014 = 0; local1014 < local1535; local1014++) {
																		if (local6292[local1014].aString48.compareTo(local6292[local1014 + 1].aString48) > 0) {
																			local1916 = local6292[local1014];
																			local6292[local1014] = local6292[local1014 + 1];
																			local2189 = false;
																			local6292[local1014 + 1] = local1916;
																		}
																	}
																	if (local2189) {
																		break;
																	}
																}
																Static216.aClass186Array1 = local6292;
																Static102.aClass263_56 = null;
																return true;
															} else if (Static343.aClass263_150 == Static102.aClass263_56) {
																Static182.anInt3941 = Static5.aClass1_Sub3_Sub1_1.method1220() << 3;
																Static180.anInt3909 = Static5.aClass1_Sub3_Sub1_1.method1210();
																Static216.anInt4345 = Static5.aClass1_Sub3_Sub1_1.method1220() << 3;
																while (Static5.aClass1_Sub3_Sub1_1.anInt1710 < Static350.anInt6510) {
																	@Pc(6491) Class126 local6491 = Static171.method2739()[Static5.aClass1_Sub3_Sub1_1.method1171()];
																	Static28.method563(local6491);
																}
																Static102.aClass263_56 = null;
																return true;
															} else if (Static70.aClass263_41 == Static102.aClass263_56) {
																Static28.method563(Static393.aClass126_12);
																Static102.aClass263_56 = null;
																return true;
															} else {
																Static247.method3669("T1 - " + (Static102.aClass263_56 == null ? -1 : Static102.aClass263_56.method5904()) + "," + (Static340.aClass263_146 == null ? -1 : Static340.aClass263_146.method5904()) + "," + (Static280.aClass263_128 == null ? -1 : Static280.aClass263_128.method5904()) + " - " + Static350.anInt6510, null);
																Static162.method2668(false);
																return true;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static396.aClass96Array5 == null) {
			return;
		}
		@Pc(8) Class30_Sub1_Sub1 local8 = null;
		@Pc(14) int local14;
		if (arg0 >= 0) {
			local14 = arg0 - 1;
			@Pc(21) Class1_Sub27 local21 = (Class1_Sub27) Static24.aClass38_3.method765((long) local14);
			if (local21 != null) {
				local8 = local21.aClass30_Sub1_Sub1_Sub1_2;
			}
		} else {
			local14 = -arg0 - 1;
			if (Static32.anInt894 == local14) {
				local8 = Static429.aClass30_Sub1_Sub1_Sub2_2;
			} else {
				local8 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(54) Class192 local54 = Static455.aClass161_4.method3628(arg6);
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg5 == 1 || arg5 == 3) {
			local65 = local54.anInt5679;
			local68 = local54.anInt5661;
		} else {
			local65 = local54.anInt5661;
			local68 = local54.anInt5679;
		}
		@Pc(82) int local82 = (local65 >> 1) + arg10;
		@Pc(90) int local90 = arg10 + (local65 + 1 >> 1);
		@Pc(96) int local96 = (local68 >> 1) + arg1;
		@Pc(104) int local104 = (local68 + 1 >> 1) + arg1;
		@Pc(108) Class96 local108 = Static396.aClass96Array5[arg3];
		@Pc(132) int local132 = local108.ua(local82, local96) + local108.ua(local90, local96) + local108.ua(local82, local104) + local108.ua(local90, local104) >> 2;
		@Pc(136) Class1_Sub31 local136 = new Class1_Sub31();
		local136.anInt5435 = arg5;
		local136.anInt5434 = arg8;
		@Pc(151) int local151;
		if (arg12 < arg11) {
			local151 = arg11;
			arg11 = arg12;
			arg12 = local151;
		}
		local136.anInt5423 = Static187.anInt3975 + arg9;
		local136.anInt5433 = arg1;
		local136.anInt5419 = arg10;
		local136.anInt5428 = arg6;
		local136.anInt5424 = local8.aByte102;
		local136.anInt5420 = arg4 + Static187.anInt3975;
		if (arg7 > arg2) {
			local151 = arg7;
			arg7 = arg2;
			arg2 = local151;
		}
		local136.anInt5427 = arg10 + arg12;
		local136.anInt5417 = arg10 + arg11;
		local136.anInt5430 = arg2 + arg1;
		local136.anInt5432 = (local68 << 6) + (local136.anInt5433 << 7);
		local136.anInt5426 = arg7 + arg1;
		local136.anInt5431 = (local136.anInt5419 << 7) + (local65 << 6);
		local136.anInt5421 = local132;
		Static112.aClass203_13.method4551(local136);
		local8.aClass1_Sub31_3 = local136;
	}
}
