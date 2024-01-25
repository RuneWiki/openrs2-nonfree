import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!wl;")
	public static Class265 aClass265_32 = new Class265();

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_102 = new Class81(4, 1);

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method3418() {
		if (Static89.anInt2016 != 0) {
			Static22.anInt467 -= Static89.anInt2016 * 5;
			if (Static22.anInt467 >= Static372.anInt6682) {
				Static22.anInt467 = Static372.anInt6682 - 1;
			}
			Static89.anInt2016 = 0;
			if (Static22.anInt467 < 0) {
				Static22.anInt467 = 0;
			}
		}
		if (Static308.anInt5417 < 102) {
			Static308.anInt5417 += 6;
		}
		for (@Pc(41) int local41 = 0; local41 < Static357.anInt3690; local41++) {
			@Pc(49) int local49 = Static347.aClass42Array1[local41].method1202();
			@Pc(55) char local55 = Static347.aClass42Array1[local41].method1201();
			if (local49 == 84) {
				Static375.method5255();
			} else if (Static428.aClass52_1.method1347(82) && local49 == 66) {
				if (Static85.aClipboard4 != null) {
					@Pc(345) String local345 = "";
					for (@Pc(350) int local350 = Static359.aStringArray25.length - 1; local350 >= 0; local350--) {
						if (Static359.aStringArray25[local350] != null && Static359.aStringArray25[local350].length() > 0) {
							local345 = local345 + Static359.aStringArray25[local350] + '\n';
						}
					}
					Static85.aClipboard4.setContents(new StringSelection(local345), null);
				}
			} else if (Static428.aClass52_1.method1347(82) && local49 == 67) {
				if (Static85.aClipboard4 != null) {
					@Pc(293) Transferable local293 = Static85.aClipboard4.getContents(null);
					if (local293 != null) {
						try {
							@Pc(300) String local300 = (String) local293.getTransferData(DataFlavor.stringFlavor);
							if (local300 != null) {
								@Pc(307) String[] local307 = Static40.method745(local300, '\n');
								if (local307.length <= 1) {
									Static224.aString38 = Static224.aString38 + local300;
								} else {
									for (@Pc(324) int local324 = 0; local324 < local307.length; local324++) {
										Static224.aString38 = local307[local324];
										Static375.method5255();
									}
								}
							}
						} catch (@Pc(339) Exception local339) {
						}
					}
				}
			} else if (local49 == 85 && Static126.anInt2500 > 0) {
				Static224.aString38 = Static224.aString38.substring(0, Static126.anInt2500 - 1) + Static224.aString38.substring(Static126.anInt2500);
				Static126.anInt2500--;
			} else if (local49 == 101 && Static126.anInt2500 < Static224.aString38.length()) {
				Static224.aString38 = Static224.aString38.substring(0, Static126.anInt2500) + Static224.aString38.substring(Static126.anInt2500 + 1);
			} else if (local49 == 96 && Static126.anInt2500 > 0) {
				Static126.anInt2500--;
			} else if (local49 == 97 && Static126.anInt2500 < Static224.aString38.length()) {
				Static126.anInt2500++;
			} else if (local49 == 102) {
				Static126.anInt2500 = 0;
			} else if (local49 == 103) {
				Static126.anInt2500 = Static224.aString38.length();
			} else if (local49 == 104 && Static359.aStringArray25.length > Static226.anInt4327) {
				Static226.anInt4327++;
				Static402.method5472();
				Static126.anInt2500 = Static224.aString38.length();
			} else if (local49 == 105 && Static226.anInt4327 > 0) {
				Static226.anInt4327--;
				Static402.method5472();
				Static126.anInt2500 = Static224.aString38.length();
			} else if (Static40.method737(local55) || local55 == ':' || local55 == ',' || local55 == ' ' || local55 == '_' || local55 == '-' || local55 == '+' || local55 == '[' || local55 == ']') {
				Static224.aString38 = Static224.aString38.substring(0, Static126.anInt2500) + Static347.aClass42Array1[local41].method1201() + Static224.aString38.substring(Static126.anInt2500);
				Static126.anInt2500++;
			}
		}
		Static357.anInt3690 = 0;
		Static8.method183();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILclient!qa;I)V")
	public static void method3419(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static284.anInt5178 == 0 || Static11.anInt305 == 0) {
			return;
		}
		arg1.GA(Static6.anInt201, Static147.anInt4429, Static284.anInt5178, Static11.anInt305);
		arg1.pa(Static141.anInt2705, Static296.anInt5334, Static284.anInt5178, Static11.anInt305);
		@Pc(35) Class102 local35 = arg1.method2286();
		local35.Q(Static445.anInt7762, Static422.anInt7371, Static97.anInt2179, Static448.anInt7802, Static375.anInt6696, Static63.anInt1754);
		arg1.m(local35);
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(108) int[] local108;
		@Pc(140) int local140;
		@Pc(149) int local149;
		if (Static72.aClass106Array4 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(55) int local55 = arg1.d();
			local64 = (arg0 - Static6.anInt201) * local55 / Static284.anInt5178;
			local73 = local55 * (arg2 - Static147.anInt4429) / Static11.anInt305;
			local76 = arg1.W();
			local84 = (arg0 - Static6.anInt201) * local76 / Static284.anInt5178;
			local93 = (arg2 - Static147.anInt4429) * local76 / Static11.anInt305;
			local108 = new int[] { local64, local73, local55 };
			local35.X(local108);
			@Pc(126) int[] local126 = new int[] { local84, local93, local76 };
			local35.X(local126);
			@Pc(131) float local131 = 0.0F;
			local140 = local126[0] - local108[0];
			local149 = local126[1] - local108[1];
			@Pc(158) int local158 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				@Pc(171) int local171 = (int) ((float) local140 * local131 + (float) local108[0]);
				@Pc(175) int local175 = local171 >> 7;
				@Pc(186) int local186 = (int) ((float) local108[2] + (float) local158 * local131);
				@Pc(190) int local190 = local186 >> 7;
				if (local175 > 0 && local190 > 0 && Static81.anInt1950 > local175 && local190 < Static171.anInt3288) {
					@Pc(203) int local203 = Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92;
					if (local203 < 3 && (Static367.aByteArrayArrayArray16[1][local175][local190] & 0x2) != 0) {
						local203++;
					}
					if ((float) Static72.aClass106Array4[local203].va(local171, local186) < local131 * (float) local149 + (float) local108[1]) {
						local50 = (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1 << 6) + local171 >> 7;
						local52 = (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1 << 6) + local186 >> 7;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static428.aBoolean637 && (Static248.anInt4731 & 0x40) != 0) {
					@Pc(291) Class41 local291 = Static85.method2627(Static255.anInt4805, Static443.anInt7737);
					if (local291 == null) {
						Static342.method4802();
					} else {
						Static333.method4738(-1, " ->", true, local52, 30, Static174.aString23, Static445.anInt7767, 0L, local50, false);
					}
				} else {
					if (Static389.aClass209_2 == Static107.aClass209_1) {
						Static333.method4738(-1, "", true, local52, 9, Static250.aClass256_71.method5720(Static272.anInt7537), -1, 0L, local50, false);
					}
					Static333.method4738(-1, "", true, local52, 6, Static52.aString69, Static22.anInt468, 0L, local50, false);
				}
			}
		}
		@Pc(353) Class184 local353 = Static346.aClass184_6;
		for (@Pc(358) Class38_Sub3 local358 = (Class38_Sub3) local353.method4212(); local358 != null; local358 = (Class38_Sub3) local353.method4215()) {
			if (local358.anInt2378 == Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 && local358.method1740(arg0, arg1, arg2)) {
				@Pc(476) int local476;
				if (local358.aClass4_1 instanceof Class4_Sub2_Sub2_Sub1) {
					@Pc(380) Class4_Sub2_Sub2_Sub1 local380 = (Class4_Sub2_Sub2_Sub1) local358.aClass4_1;
					local64 = local380.method5118();
					if ((local64 & 0x1) == 0 && (local380.anInt7117 & 0x7F) == 0 && (local380.anInt7111 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local380.anInt7117 & 0x7F) == 64 && (local380.anInt7111 & 0x7F) == 64) {
						local73 = local380.anInt7117 - (local380.method5118() - 1 << 6);
						local76 = local380.anInt7111 - (local380.method5118() - 1 << 6);
						@Pc(487) int local487;
						for (local84 = 0; local84 < Static391.anInt6867; local84++) {
							@Pc(453) Class4_Sub2_Sub2_Sub2 local453 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local84]];
							if (local453 != null && Static164.anInt3206 != local453.anInt6512 && local453.aBoolean559) {
								local476 = local453.anInt7117 - (local453.aClass215_1.anInt5998 - 1 << 6);
								local487 = local453.anInt7111 - (local453.aClass215_1.anInt5998 - 1 << 6);
								if (local73 <= local476 && local453.aClass215_1.anInt5998 <= local380.method5118() - (local476 - local73 >> 7) && local487 >= local76 && local453.aClass215_1.anInt5998 <= local380.method5118() - (local487 - local76 >> 7)) {
									Static185.method2943(local453, local358.anInt2378 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92);
									local453.anInt6512 = Static164.anInt3206;
								}
							}
						}
						local93 = Static348.anInt6137;
						local108 = Static348.anIntArray412;
						for (local487 = 0; local487 < local93; local487++) {
							@Pc(566) Class4_Sub2_Sub2_Sub1 local566 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local108[local487]];
							if (local566 != null && Static164.anInt3206 != local566.anInt6512 && local380 != local566 && local566.aBoolean559) {
								local140 = local566.anInt7117 - (local566.method5118() - 1 << 6);
								local149 = local566.anInt7111 - (local566.method5118() - 1 << 6);
								if (local140 >= local73 && local566.method5118() <= local380.method5118() - (local140 - local73 >> 7) && local149 >= local76 && local566.method5118() <= local380.method5118() - (local149 - local76 >> 7)) {
									Static51.method1003(Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 != local358.anInt2378, local566);
									local566.anInt6512 = Static164.anInt3206;
								}
							}
						}
					}
					if (local380.anInt6512 == Static164.anInt3206) {
						continue;
					}
					Static51.method1003(Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 != local358.anInt2378, local380);
					local380.anInt6512 = Static164.anInt3206;
				}
				if (local358.aClass4_1 instanceof Class4_Sub2_Sub2_Sub2) {
					@Pc(706) Class4_Sub2_Sub2_Sub2 local706 = (Class4_Sub2_Sub2_Sub2) local358.aClass4_1;
					if (local706.aClass215_1 != null) {
						if ((local706.aClass215_1.anInt5998 & 0x1) == 0 && (local706.anInt7117 & 0x7F) == 0 && (local706.anInt7111 & 0x7F) == 0 || (local706.aClass215_1.anInt5998 & 0x1) == 1 && (local706.anInt7117 & 0x7F) == 64 && (local706.anInt7111 & 0x7F) == 64) {
							local64 = local706.anInt7117 - (local706.aClass215_1.anInt5998 - 1 << 6);
							local73 = local706.anInt7111 - (local706.aClass215_1.anInt5998 - 1 << 6);
							for (local76 = 0; local76 < Static391.anInt6867; local76++) {
								@Pc(782) Class4_Sub2_Sub2_Sub2 local782 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local76]];
								if (local782 != null && Static164.anInt3206 != local782.anInt6512 && local706 != local782 && local782.aBoolean559) {
									local93 = local782.anInt7117 - (local782.aClass215_1.anInt5998 - 1 << 6);
									local476 = local782.anInt7111 - (local782.aClass215_1.anInt5998 - 1 << 6);
									if (local93 >= local64 && local782.aClass215_1.anInt5998 <= local706.aClass215_1.anInt5998 - (local93 - local64 >> 7) && local476 >= local73 && local706.aClass215_1.anInt5998 - (local476 - local73 >> 7) >= local782.aClass215_1.anInt5998) {
										Static185.method2943(local782, local358.anInt2378 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92);
										local782.anInt6512 = Static164.anInt3206;
									}
								}
							}
							local84 = Static348.anInt6137;
							@Pc(889) int[] local889 = Static348.anIntArray412;
							for (local476 = 0; local476 < local84; local476++) {
								@Pc(899) Class4_Sub2_Sub2_Sub1 local899 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local889[local476]];
								if (local899 != null && local899.anInt6512 != Static164.anInt3206 && local899.aBoolean559) {
									@Pc(925) int local925 = local899.anInt7117 - (local899.method5118() - 1 << 6);
									local140 = local899.anInt7111 - (local899.method5118() - 1 << 6);
									if (local925 >= local64 && local899.method5118() <= local706.aClass215_1.anInt5998 - (local925 - local64 >> 7) && local73 <= local140 && local899.method5118() <= local706.aClass215_1.anInt5998 - (local140 - local73 >> 7)) {
										Static51.method1003(local358.anInt2378 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92, local899);
										local899.anInt6512 = Static164.anInt3206;
									}
								}
							}
						}
						if (Static164.anInt3206 == local706.anInt6512) {
							continue;
						}
						Static185.method2943(local706, local358.anInt2378 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92);
						local706.anInt6512 = Static164.anInt3206;
					}
				}
				if (local358.aClass4_1 instanceof Class4_Sub5_Sub1) {
					@Pc(1052) Class2_Sub21 local1052 = (Class2_Sub21) Static383.aClass240_34.method5439((long) (local358.anInt2375 << 14 | local358.anInt2378 << 28 | local358.anInt2376));
					if (local1052 != null) {
						for (@Pc(1062) Class2_Sub45 local1062 = (Class2_Sub45) local1052.aClass265_28.method6006(); local1062 != null; local1062 = (Class2_Sub45) local1052.aClass265_28.method5993()) {
							@Pc(1070) Class30 local1070 = Static350.aClass149_2.method3483(local1062.anInt7831);
							if (!Static428.aBoolean637) {
								if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local358.anInt2378) {
									@Pc(1084) String[] local1084 = local1070.aStringArray2;
									for (local84 = 4; local84 >= 0; local84--) {
										if (local1084 != null && local1084[local84] != null) {
											@Pc(1096) byte local1096 = 0;
											if (local84 == 0) {
												local1096 = 16;
											}
											local476 = Static340.anInt5988;
											if (local84 == 1) {
												local1096 = 10;
											}
											if (local84 == 2) {
												local1096 = 20;
											}
											if (local84 == 3) {
												local1096 = 22;
											}
											if (local84 == local1070.anInt1012) {
												local476 = local1070.anInt1003;
											}
											if (local84 == 4) {
												local1096 = 2;
											}
											if (local84 == local1070.anInt1010) {
												local476 = local1070.anInt1061;
											}
											Static333.method4738(-1, "<col=ff9040>" + local1070.aString5, true, local358.anInt2375, local1096, local1084[local84], local476, (long) local1062.anInt7831, local358.anInt2376, false);
										}
									}
								}
								Static333.method4738(-1, "<col=ff9040>" + local1070.aString5, true, local358.anInt2375, 1009, Static313.aClass256_113.method5720(Static272.anInt7537), Static408.anInt7081, (long) local1062.anInt7831, local358.anInt2376, local358.anInt2378 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92);
							} else if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local358.anInt2378) {
								@Pc(1237) Class47 local1237 = Static21.anInt432 == -1 ? null : Static150.aClass43_1.method1210(Static21.anInt432);
								if ((Static248.anInt4731 & 0x1) != 0 && (local1237 == null || local1070.method736(Static21.anInt432, local1237.anInt1781) != local1237.anInt1781)) {
									Static333.method4738(-1, Static179.aString56 + " -> <col=ff9040>" + local1070.aString5, true, local358.anInt2375, 51, Static174.aString23, Static445.anInt7767, (long) local1062.anInt7831, local358.anInt2376, false);
								}
							}
						}
					}
				}
				if (local358.aClass4_1 instanceof Interface9) {
					@Pc(1304) Interface9 local1304 = (Interface9) local358.aClass4_1;
					@Pc(1311) Class250 local1311 = Static406.aClass150_3.method3508(local1304.method5901());
					if (local1311.anIntArray479 != null) {
						local1311 = local1311.method5591(Static215.aClass225_1);
					}
					if (local1311 != null) {
						if (!Static428.aBoolean637) {
							if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local358.anInt2378) {
								@Pc(1401) String[] local1401 = local1311.aStringArray41;
								if (local1401 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1401[local76] != null) {
											@Pc(1413) short local1413 = 0;
											local93 = Static340.anInt5988;
											if (local76 == 0) {
												local1413 = 50;
											}
											if (local76 == 1) {
												local1413 = 47;
											}
											if (local76 == 2) {
												local1413 = 59;
											}
											if (local76 == 3) {
												local1413 = 25;
											}
											if (local76 == 4) {
												local1413 = 1003;
											}
											if (local76 == local1311.anInt7179) {
												local93 = local1311.anInt7189;
											}
											if (local76 == local1311.anInt7154) {
												local93 = local1311.anInt7191;
											}
											Static333.method4738(-1, "<col=00ffff>" + local1311.aString62, true, local358.anInt2375, local1413, local1401[local76], local93, Static383.method5327(local358.anInt2376, local1304, local358.anInt2375), local358.anInt2376, false);
										}
									}
								}
							}
							Static333.method4738(-1, "<col=00ffff>" + local1311.aString62, true, local358.anInt2375, 1012, Static313.aClass256_113.method5720(Static272.anInt7537), Static408.anInt7081, (long) local1311.anInt7160, local358.anInt2376, Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 != local358.anInt2378);
						} else if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local358.anInt2378) {
							@Pc(1338) Class47 local1338 = Static21.anInt432 == -1 ? null : Static150.aClass43_1.method1210(Static21.anInt432);
							if ((Static248.anInt4731 & 0x4) != 0 && (local1338 == null || local1311.method5590(Static21.anInt432, local1338.anInt1781) != local1338.anInt1781)) {
								Static333.method4738(-1, Static179.aString56 + " -> <col=00ffff>" + local1311.aString62, true, local358.anInt2375, 49, Static174.aString23, Static445.anInt7767, Static383.method5327(local358.anInt2376, local1304, local358.anInt2375), local358.anInt2376, false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
	public static int method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static280.aByteArrayArray15 == null ? 0 : (Static280.aByteArrayArray15[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z")
	public static boolean method3422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static233.method3560(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static250.anInt4056;
		@Pc(14) int local14 = arg2 << Static250.anInt4056;
		@Pc(23) int local23 = Static372.aClass106Array11[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static250.anInt4056 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static250.anInt4056 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static250.anInt4056 - 7);
		if (arg3 == 1) {
			if (local10 > Static305.anInt1349) {
				if (!Static379.method5283(local10, local23, local14)) {
					return false;
				}
				if (!Static379.method5283(local10, local23, local14 + Static176.anInt3421)) {
					return false;
				}
				if (!Static379.method5283(local10, local23, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static379.method5283(local10, local31, local14)) {
					return false;
				}
				if (!Static379.method5283(local10, local31, local14 + Static176.anInt3421)) {
					return false;
				}
				if (!Static379.method5283(local10, local31, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (!Static379.method5283(local10, local39, local14)) {
				return false;
			} else if (Static379.method5283(local10, local39, local14 + Static176.anInt3421)) {
				return Static379.method5283(local10, local39, local14 + Static284.anInt5177);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static49.anInt1358) {
				if (!Static379.method5283(local10, local23, local14 + Static284.anInt5177)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static176.anInt3421, local23, local14 + Static284.anInt5177)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local23, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static379.method5283(local10, local31, local14 + Static284.anInt5177)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static176.anInt3421, local31, local14 + Static284.anInt5177)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local31, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (!Static379.method5283(local10, local39, local14 + Static284.anInt5177)) {
				return false;
			} else if (Static379.method5283(local10 + Static176.anInt3421, local39, local14 + Static284.anInt5177)) {
				return Static379.method5283(local10 + Static284.anInt5177, local39, local14 + Static284.anInt5177);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static305.anInt1349) {
				if (!Static379.method5283(local10 + Static284.anInt5177, local23, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local23, local14 + Static176.anInt3421)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local23, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static379.method5283(local10 + Static284.anInt5177, local31, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local31, local14 + Static176.anInt3421)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local31, local14 + Static284.anInt5177)) {
					return false;
				}
			}
			if (!Static379.method5283(local10 + Static284.anInt5177, local39, local14)) {
				return false;
			} else if (Static379.method5283(local10 + Static284.anInt5177, local39, local14 + Static176.anInt3421)) {
				return Static379.method5283(local10 + Static284.anInt5177, local39, local14 + Static284.anInt5177);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static49.anInt1358) {
				if (!Static379.method5283(local10, local23, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static176.anInt3421, local23, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static379.method5283(local10, local31, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static176.anInt3421, local31, local14)) {
					return false;
				}
				if (!Static379.method5283(local10 + Static284.anInt5177, local31, local14)) {
					return false;
				}
			}
			if (!Static379.method5283(local10, local39, local14)) {
				return false;
			} else if (Static379.method5283(local10 + Static176.anInt3421, local39, local14)) {
				return Static379.method5283(local10 + Static284.anInt5177, local39, local14);
			} else {
				return false;
			}
		} else if (!Static379.method5283(local10 + Static176.anInt3421, local47, local14 + Static176.anInt3421)) {
			return false;
		} else if (arg3 == 16) {
			return Static379.method5283(local10, local39, local14 + Static284.anInt5177);
		} else if (arg3 == 32) {
			return Static379.method5283(local10 + Static284.anInt5177, local39, local14 + Static284.anInt5177);
		} else if (arg3 == 64) {
			return Static379.method5283(local10 + Static284.anInt5177, local39, local14);
		} else if (arg3 == 128) {
			return Static379.method5283(local10, local39, local14);
		} else {
			return true;
		}
	}
}
