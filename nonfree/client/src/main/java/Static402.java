import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject37;

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "[Lclient!ro;")
	public static Class289[] aClass289Array1;

	@OriginalMember(owner = "client!pda", name = "z", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
	public static int anInt7015 = -1;

	@OriginalMember(owner = "client!pda", name = "J", descriptor = "F")
	public static float aFloat205 = 0.0F;

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)V")
	public static void method5872() {
		if (Static94.anInt1996 > 1) {
			Static504.anInt8433 = Static500.anInt8403;
			Static94.anInt1996--;
		}
		if (Static68.aBoolean123) {
			Static68.aBoolean123 = false;
			Static530.method7282();
			return;
		}
		if (!Static167.aBoolean291) {
			Static540.method7371();
		}
		for (@Pc(31) int local31 = 0; local31 < 100 && Static144.method2408(); local31++) {
		}
		if (Static201.anInt3963 != 10) {
			return;
		}
		@Pc(55) Class2_Sub42 local55;
		@Pc(64) int local64;
		while (Static199.method3281()) {
			local55 = Static249.method3910(Static263.aClass286_86, Static400.aClass145_2);
			local55.aClass2_Sub15_Sub2_2.method4333(0);
			local64 = local55.aClass2_Sub15_Sub2_2.anInt5241;
			Static204.method3309(local55.aClass2_Sub15_Sub2_2);
			local55.aClass2_Sub15_Sub2_2.method4311(local55.aClass2_Sub15_Sub2_2.anInt5241 - local64);
			Static531.method7296(local55);
		}
		if (Static36.aClass2_Sub47_1 == null) {
			if (Static548.method7437() >= Static407.aLong197) {
				Static36.aClass2_Sub47_1 = Static12.aClass215_1.method4968(Static176.aClass170_3.aString35);
			}
		} else if (Static36.aClass2_Sub47_1.anInt9226 != -1) {
			local55 = Static249.method3910(Static368.aClass286_115, Static400.aClass145_2);
			local55.aClass2_Sub15_Sub2_2.method4350(Static36.aClass2_Sub47_1.anInt9226);
			Static531.method7296(local55);
			Static36.aClass2_Sub47_1 = null;
			Static407.aLong197 = Static548.method7437() + 30000L;
		}
		@Pc(140) Class2_Sub16 local140 = (Class2_Sub16) Static445.aClass8_54.method210();
		@Pc(153) int local153;
		@Pc(178) int local178;
		@Pc(194) int local194;
		@Pc(242) int local242;
		@Pc(248) int local248;
		@Pc(260) int local260;
		@Pc(151) Class2_Sub42 local151;
		if (local140 != null || Static49.aLong36 < Static548.method7437() - 2000L) {
			local151 = null;
			local153 = 0;
			for (@Pc(158) Class2_Sub16 local158 = (Class2_Sub16) Static113.aClass8_15.method210(); local158 != null && (local151 == null || local151.aClass2_Sub15_Sub2_2.anInt5241 - local153 < 240); local158 = (Class2_Sub16) Static113.aClass8_15.method218()) {
				local158.method7966();
				local178 = local158.method6005();
				if (local178 < -1) {
					local178 = -1;
				} else if (local178 > 65534) {
					local178 = 65534;
				}
				local194 = local158.method6004();
				if (local194 < -1) {
					local194 = -1;
				} else if (local194 > 65534) {
					local194 = 65534;
				}
				if (local194 != Static340.anInt6211 || local178 != Static215.anInt4133) {
					if (local151 == null) {
						local151 = Static249.method3910(Static277.aClass286_92, Static400.aClass145_2);
						local151.aClass2_Sub15_Sub2_2.method4333(0);
						local153 = local151.aClass2_Sub15_Sub2_2.anInt5241;
					}
					local242 = local194 - Static340.anInt6211;
					Static340.anInt6211 = local194;
					local248 = local178 - Static215.anInt4133;
					Static215.anInt4133 = local178;
					local260 = (int) ((local158.method6011() - Static49.aLong36) / 20L);
					if (local260 < 8 && local242 >= -32 && local242 <= 31 && local248 >= -32 && local248 <= 31) {
						local248 += 32;
						local242 += 32;
						local151.aClass2_Sub15_Sub2_2.method4350(local248 + (local242 << 6) + (local260 << 12));
					} else if (local260 < 32 && local242 >= -128 && local242 <= 127 && local248 >= -128 && local248 <= 127) {
						local151.aClass2_Sub15_Sub2_2.method4333(local260 + 128);
						local242 += 128;
						local248 += 128;
						local151.aClass2_Sub15_Sub2_2.method4350((local242 << 8) + local248);
					} else if (local260 >= 32) {
						local151.aClass2_Sub15_Sub2_2.method4350(local260 + 57344);
						if (local194 == 1 || local178 == -1) {
							local151.aClass2_Sub15_Sub2_2.method4288(Integer.MIN_VALUE);
						} else {
							local151.aClass2_Sub15_Sub2_2.method4288(local194 | local178 << 16);
						}
					} else {
						local151.aClass2_Sub15_Sub2_2.method4333(local260 + 192);
						if (local194 == 1 || local178 == -1) {
							local151.aClass2_Sub15_Sub2_2.method4288(Integer.MIN_VALUE);
						} else {
							local151.aClass2_Sub15_Sub2_2.method4288(local194 | local178 << 16);
						}
					}
					Static49.aLong36 = local158.method6011();
				}
			}
			if (local151 != null) {
				local151.aClass2_Sub15_Sub2_2.method4311(local151.aClass2_Sub15_Sub2_2.anInt5241 - local153);
				Static531.method7296(local151);
			}
		}
		@Pc(463) int local463;
		if (local140 != null) {
			@Pc(447) long local447 = (local140.method6011() - Static275.aLong127) / 50L;
			if (local447 > 32767L) {
				local447 = 32767L;
			}
			Static275.aLong127 = local140.method6011();
			local463 = local140.method6005();
			if (local463 < 0) {
				local463 = 0;
			} else if (local463 > 65535) {
				local463 = 65535;
			}
			local178 = local140.method6004();
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 65535) {
				local178 = 65535;
			}
			@Pc(495) byte local495 = 0;
			if (local140.method6008() == 2) {
				local495 = 1;
			}
			local242 = (int) local447;
			@Pc(514) Class2_Sub42 local514 = Static249.method3910(Static107.aClass286_38, Static400.aClass145_2);
			local514.aClass2_Sub15_Sub2_2.method4329(local242 | local495 << 15);
			local514.aClass2_Sub15_Sub2_2.method4326(local463 << 16 | local178);
			Static531.method7296(local514);
		}
		if (Static19.anInt584 > 0) {
			local151 = Static249.method3910(Static93.aClass286_34, Static400.aClass145_2);
			local151.aClass2_Sub15_Sub2_2.method4333(Static19.anInt584 * 3);
			for (local153 = 0; local153 < Static19.anInt584; local153++) {
				@Pc(563) Interface2 local563 = Static245.anInterface2Array1[local153];
				@Pc(573) long local573 = (local563.method5041() - Static431.aLong206) / 50L;
				if (local573 > 65535L) {
					local573 = 65535L;
				}
				Static431.aLong206 = local563.method5041();
				local151.aClass2_Sub15_Sub2_2.method4333(local563.method5040());
				local151.aClass2_Sub15_Sub2_2.method4350((int) local573);
			}
			Static531.method7296(local151);
		}
		if (Static469.anInt8021 > 0) {
			Static469.anInt8021--;
		}
		if (Static341.aBoolean494 && Static469.anInt8021 <= 0) {
			Static341.aBoolean494 = false;
			Static469.anInt8021 = 20;
			local151 = Static249.method3910(Static210.aClass286_66, Static400.aClass145_2);
			local151.aClass2_Sub15_Sub2_2.method4330((int) Static447.aFloat233 >> 3);
			local151.aClass2_Sub15_Sub2_2.method4329((int) Static412.aFloat13 >> 3);
			Static531.method7296(local151);
		}
		if (Static487.aBoolean646 != Static523.aBoolean664) {
			Static487.aBoolean646 = Static523.aBoolean664;
			local151 = Static249.method3910(Static347.aClass286_111, Static400.aClass145_2);
			local151.aClass2_Sub15_Sub2_2.method4333(Static523.aBoolean664 ? 1 : 0);
			Static531.method7296(local151);
		}
		if (!Static335.aBoolean491) {
			local151 = Static249.method3910(Static224.aClass286_70, Static400.aClass145_2);
			local151.aClass2_Sub15_Sub2_2.method4333(0);
			local153 = local151.aClass2_Sub15_Sub2_2.anInt5241;
			@Pc(705) Class2_Sub15 local705 = new Class2_Sub15(Static514.method237());
			Static72.aClass2_Sub12_Sub1_1.method1406(local705);
			local151.aClass2_Sub15_Sub2_2.method4299(local705.anInt5241, local705.aByteArray62);
			local151.aClass2_Sub15_Sub2_2.method4311(local151.aClass2_Sub15_Sub2_2.anInt5241 - local153);
			Static531.method7296(local151);
			Static335.aBoolean491 = true;
		}
		if (Static389.aClass346ArrayArrayArray2 != null) {
			if (Static311.anInt5570 == 2) {
				Static195.method3242();
			} else if (Static311.anInt5570 == 3) {
				Static145.method2415();
			}
		}
		if (Static474.aBoolean641) {
			Static474.aBoolean641 = false;
		} else {
			aFloat205 /= 2.0F;
		}
		if (Static100.aBoolean183) {
			Static100.aBoolean183 = false;
		} else {
			Static11.aFloat8 /= 2.0F;
		}
		Static202.method3296();
		if (Static201.anInt3963 != 10) {
			return;
		}
		Static582.method7908();
		Static77.method7969();
		Static47.method795();
		Static183.anInt3799++;
		if (Static183.anInt3799 > 750) {
			Static530.method7282();
			return;
		}
		Static411.method5994();
		Static348.method5188();
		Static365.method5426();
		for (local64 = Static70.aClass78_1.method1467(true); local64 != -1; local64 = Static70.aClass78_1.method1467(false)) {
			Static293.method4398(local64);
			Static541.anIntArray640[Static202.anInt3969++ & 0x1F] = local64;
		}
		@Pc(874) Class196 local874;
		for (@Pc(838) Class2_Sub3_Sub13 local838 = Static60.method962(); local838 != null; local838 = Static60.method962()) {
			local463 = local838.method6094();
			local178 = local838.method6099();
			if (local463 == 1) {
				Static470.anIntArray532[local178] = local838.anInt7258;
				Static105.aBoolean199 |= Static254.aBooleanArray23[local178];
				Static309.anIntArray410[Static195.anInt3899++ & 0x1F] = local178;
			} else if (local463 == 2) {
				Static67.aStringArray25[local178] = local838.aString64;
				Static292.anIntArray365[Static441.anInt7763++ & 0x1F] = local178;
			} else if (local463 == 3) {
				local874 = Static117.method1748(local178);
				if (!local838.aString64.equals(local874.aString42)) {
					local874.aString42 = local838.aString64;
					Static515.method7134(local874);
				}
			} else if (local463 == 4) {
				local874 = Static117.method1748(local178);
				local242 = local838.anInt7258;
				local248 = local838.anInt7256;
				local260 = local838.anInt7261;
				if (local242 != local874.anInt5085 || local874.anInt5132 != local248 || local260 != local874.anInt5102) {
					local874.anInt5102 = local260;
					local874.anInt5085 = local242;
					local874.anInt5132 = local248;
					Static515.method7134(local874);
				}
			} else if (local463 == 5) {
				local874 = Static117.method1748(local178);
				if (local874.anInt5103 != local838.anInt7258 || local838.anInt7258 == -1) {
					local874.anInt5101 = 0;
					local874.anInt5103 = local838.anInt7258;
					local874.anInt5087 = 0;
					local874.anInt5147 = 1;
					@Pc(1355) Class84 local1355 = local874.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(local874.anInt5103);
					if (local1355 != null) {
						Static58.method951(local1355, local874.anInt5087);
					}
					Static515.method7134(local874);
				}
			} else if (local463 == 6) {
				local194 = local838.anInt7258;
				local242 = local194 >> 10 & 0x1F;
				local248 = local194 >> 5 & 0x1F;
				local260 = local194 & 0x1F;
				@Pc(960) int local960 = (local248 << 11) + (local242 << 19) + (local260 << 3);
				@Pc(964) Class196 local964 = Static117.method1748(local178);
				if (local960 != local964.anInt5083) {
					local964.anInt5083 = local960;
					Static515.method7134(local964);
				}
			} else if (local463 == 7) {
				local874 = Static117.method1748(local178);
				@Pc(1300) boolean local1300 = local838.anInt7258 == 1;
				if (local874.aBoolean416 != local1300) {
					local874.aBoolean416 = local1300;
					Static515.method7134(local874);
				}
			} else if (local463 == 8) {
				local874 = Static117.method1748(local178);
				if (local874.anInt5144 != local838.anInt7258 || local838.anInt7256 != local874.anInt5133 || local874.anInt5162 != local838.anInt7261) {
					local874.anInt5144 = local838.anInt7258;
					local874.anInt5133 = local838.anInt7256;
					local874.anInt5162 = local838.anInt7261;
					if (local874.anInt5152 != -1) {
						if (local874.anInt5084 > 0) {
							local874.anInt5162 = local874.anInt5162 * 32 / local874.anInt5084;
						} else if (local874.anInt5148 > 0) {
							local874.anInt5162 = local874.anInt5162 * 32 / local874.anInt5148;
						}
					}
					Static515.method7134(local874);
				}
			} else if (local463 == 9) {
				local874 = Static117.method1748(local178);
				if (local874.anInt5152 != local838.anInt7258 || local874.anInt5165 != local838.anInt7256) {
					local874.anInt5165 = local838.anInt7256;
					local874.anInt5152 = local838.anInt7258;
					Static515.method7134(local874);
				}
			} else if (local463 == 10) {
				local874 = Static117.method1748(local178);
				if (local838.anInt7258 != local874.anInt5153 || local838.anInt7256 != local874.anInt5149 || local838.anInt7261 != local874.anInt5167) {
					local874.anInt5167 = local838.anInt7261;
					local874.anInt5153 = local838.anInt7258;
					local874.anInt5149 = local838.anInt7256;
					Static515.method7134(local874);
				}
			} else if (local463 == 11) {
				local874 = Static117.method1748(local178);
				local874.aByte74 = 0;
				local874.anInt5095 = local874.anInt5142 = local838.anInt7258;
				local874.anInt5093 = local874.anInt5163 = local838.anInt7256;
				local874.aByte75 = 0;
				Static515.method7134(local874);
			} else if (local463 == 12) {
				local874 = Static117.method1748(local178);
				local242 = local838.anInt7258;
				if (local874 != null && local874.anInt5098 == 0) {
					if (local242 > local874.anInt5164 - local874.anInt5078) {
						local242 = local874.anInt5164 - local874.anInt5078;
					}
					if (local242 < 0) {
						local242 = 0;
					}
					if (local242 != local874.anInt5115) {
						local874.anInt5115 = local242;
						Static515.method7134(local874);
					}
				}
			} else if (local463 == 14) {
				local874 = Static117.method1748(local178);
				local874.anInt5124 = local838.anInt7258;
			} else if (local463 == 15) {
				Static526.anInt8657 = local838.anInt7256;
				Static413.aBoolean554 = true;
				Static29.anInt761 = local838.anInt7258;
			} else if (local463 == 16) {
				local874 = Static117.method1748(local178);
				local874.anInt5119 = local838.anInt7258;
			}
		}
		Static367.anInt6534++;
		if (Static364.anInt6471 != 0) {
			Static516.anInt8581 += 20;
			if (Static516.anInt8581 >= 400) {
				Static364.anInt6471 = 0;
			}
		}
		if (Static573.aClass196_14 != null) {
			Static236.anInt4388++;
			if (Static236.anInt4388 >= 15) {
				Static515.method7134(Static573.aClass196_14);
				Static573.aClass196_14 = null;
			}
		}
		Static43.aBoolean627 = false;
		Static49.aClass196_1 = null;
		Static368.aClass196_6 = null;
		Static578.aBoolean720 = false;
		Static120.method1777(-1, -1, null);
		Static581.method7884(null, -1, -1);
		if (!Static25.aBoolean32) {
			Static78.anInt9033 = -1;
		}
		Static82.method1279();
		Static500.anInt8403++;
		if (Static164.aBoolean287) {
			@Pc(1503) Class2_Sub42 local1503 = Static249.method3910(Static233.aClass286_74, Static400.aClass145_2);
			local1503.aClass2_Sub15_Sub2_2.method4296(Static392.anInt6871 | Static70.anInt1598 << 28 | Static105.anInt2172 << 14);
			Static531.method7296(local1503);
			Static164.aBoolean287 = false;
		}
		while (true) {
			@Pc(1526) Class2_Sub31 local1526;
			@Pc(1531) Class196 local1531;
			do {
				local1526 = (Class2_Sub31) Static24.aClass8_1.method217();
				if (local1526 == null) {
					while (true) {
						do {
							local1526 = (Class2_Sub31) Static50.aClass8_4.method217();
							if (local1526 == null) {
								while (true) {
									do {
										local1526 = (Class2_Sub31) Static516.aClass8_60.method217();
										if (local1526 == null) {
											if (Static368.aClass196_6 == null) {
												Static36.anInt909 = 0;
											}
											if (Static288.aClass196_3 != null) {
												Static425.method4962();
											}
											if (Static210.anInt4045 > 0 && Static529.aClass177_10.method4001(82) && Static529.aClass177_10.method4001(81) && Static148.anInt3056 != 0) {
												local463 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 - Static148.anInt3056;
												if (local463 < 0) {
													local463 = 0;
												} else if (local463 > 3) {
													local463 = 3;
												}
												Static325.method7943(local463, Static130.anInt5246 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0], Static35.anInt906 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0]);
											}
											Static104.method1576();
											for (local463 = 0; local463 < 5; local463++) {
												@Pc(1734) int local1734 = Static182.anIntArray216[local463]++;
											}
											if (Static105.aBoolean199 && Static548.method7437() - 60000L > Static207.aLong106) {
												Static53.method919();
											}
											for (@Pc(1757) Class6_Sub3_Sub2 local1757 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2314(); local1757 != null; local1757 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2312()) {
												if (Static548.method7437() / 1000L - 5L > (long) local1757.anInt7975) {
													if (local1757.aShort87 > 0) {
														Static375.method5567("", local1757.aString83 + Static290.aClass198_21.method4365(Static52.anInt1264), 5, "", 0, "");
													}
													if (local1757.aShort87 == 0) {
														Static375.method5567("", local1757.aString83 + Static290.aClass198_22.method4365(Static52.anInt1264), 5, "", 0, "");
													}
													local1757.method7989();
												}
											}
											Static130.anInt5215++;
											if (Static130.anInt5215 > 500) {
												Static130.anInt5215 = 0;
												local194 = (int) (Math.random() * 8.0D);
												if ((local194 & 0x1) == 1) {
													Static124.anInt2402 += Static64.anInt1478;
												}
												if ((local194 & 0x2) == 2) {
													Static295.anInt8557 += Static281.anInt5039;
												}
												if ((local194 & 0x4) == 4) {
													Static478.anInt8186 += Static153.anInt3071;
												}
											}
											if (Static124.anInt2402 < -50) {
												Static64.anInt1478 = 2;
											}
											if (Static295.anInt8557 < -55) {
												Static281.anInt5039 = 2;
											}
											if (Static124.anInt2402 > 50) {
												Static64.anInt1478 = -2;
											}
											if (Static478.anInt8186 < -40) {
												Static153.anInt3071 = 1;
											}
											if (Static295.anInt8557 > 55) {
												Static281.anInt5039 = -2;
											}
											if (Static478.anInt8186 > 40) {
												Static153.anInt3071 = -1;
											}
											Static467.anInt7991++;
											if (Static467.anInt7991 > 500) {
												Static467.anInt7991 = 0;
												local194 = (int) (Math.random() * 8.0D);
												if ((local194 & 0x1) == 1) {
													Static417.anInt7188 += Static151.anInt3033;
												}
												if ((local194 & 0x2) == 2) {
													Static557.anInt9152 += Static31.anInt817;
												}
											}
											if (Static417.anInt7188 < -60) {
												Static151.anInt3033 = 2;
											}
											if (Static417.anInt7188 > 60) {
												Static151.anInt3033 = -2;
											}
											if (Static557.anInt9152 < -20) {
												Static31.anInt817 = 1;
											}
											Static354.anInt4541++;
											if (Static557.anInt9152 > 10) {
												Static31.anInt817 = -1;
											}
											if (Static354.anInt4541 > 50) {
												@Pc(1997) Class2_Sub42 local1997 = Static249.method3910(Static320.aClass286_104, Static400.aClass145_2);
												Static531.method7296(local1997);
											}
											if (Static142.aBoolean240) {
												Static485.method6810();
												Static142.aBoolean240 = false;
											}
											try {
												Static550.method7463();
												return;
											} catch (@Pc(2010) IOException local2010) {
												Static530.method7282();
												return;
											}
										}
										local1531 = local1526.aClass196_4;
										if (local1531.anInt5154 < 0) {
											break;
										}
										local874 = Static117.method1748(local1531.anInt5089);
									} while (local874 == null || local874.aClass196Array2 == null || local1531.anInt5154 >= local874.aClass196Array2.length || local874.aClass196Array2[local1531.anInt5154] != local1531);
									Static552.method7490(local1526);
								}
							}
							local1531 = local1526.aClass196_4;
							if (local1531.anInt5154 < 0) {
								break;
							}
							local874 = Static117.method1748(local1531.anInt5089);
						} while (local874 == null || local874.aClass196Array2 == null || local1531.anInt5154 >= local874.aClass196Array2.length || local1531 != local874.aClass196Array2[local1531.anInt5154]);
						Static552.method7490(local1526);
					}
				}
				local1531 = local1526.aClass196_4;
				if (local1531.anInt5154 < 0) {
					break;
				}
				local874 = Static117.method1748(local1531.anInt5089);
			} while (local874 == null || local874.aClass196Array2 == null || local1531.anInt5154 >= local874.aClass196Array2.length || local1531 != local874.aClass196Array2[local1531.anInt5154]);
			Static552.method7490(local1526);
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)V")
	public static void method5873(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static206.anInt3999 = arg0;
		Static78.aClass6_Sub8Array5 = new Class6_Sub8[Static180.anIntArray214[Static206.anInt3999] + 1];
		Static568.anInt9291 = 0;
		Static501.anInt8413 = 0;
	}
}
