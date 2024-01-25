import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_6 = new Class163(0, 5);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!za;)V")
	public static void method3327(@OriginalArg(1) Class200 arg0) {
		arg0.ba(0, 0, Static178.anInt5792, 350);
		arg0.P(0, 0, Static178.anInt5792, 350, Static241.anInt3924 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static301.anInt4716;
		@Pc(37) int local37;
		if (Static36.anInt723 > 0) {
			local37 = 342 - Static301.anInt4716;
			@Pc(47) int local47 = local31 * local37 / (Static36.anInt723 + local31 - 1);
			@Pc(49) int local49 = 4;
			if (Static36.anInt723 > 1) {
				local49 = (local37 - local47) * (-Static193.anInt3219 + -1 + Static36.anInt723) / (Static36.anInt723 - 1) + 4;
			}
			arg0.P(Static178.anInt5792 - 16, local49, 12, local47, Static241.anInt3924 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static193.anInt3219; local88 < Static193.anInt3219 + local31 && local88 < Static36.anInt723; local88++) {
				@Pc(97) String[] local97 = Static73.method1083('\b', Static286.aStringArray33[local88]);
				@Pc(106) int local106 = (Static178.anInt5792 - 8 - 16) / local97.length;
				for (@Pc(108) int local108 = 0; local108 < local97.length; local108++) {
					@Pc(116) int local116 = local106 * local108 + 8;
					arg0.ba(local116, 0, local116 + local106 - 8, 350);
					Static428.aClass23_4.method5744(-16777216, local97[local108], -1, local116, 350 - Static286.anInt4444 - Static51.aClass14_4.anInt363 - (-Static193.anInt3219 + local88) * Static301.anInt4716 - 2);
				}
			}
		}
		arg0.ba(0, 0, Static178.anInt5792, 350);
		arg0.method5815(-1, 0, Static178.anInt5792, 350 - Static286.anInt4444);
		Static56.aClass23_1.method5744(-16777216, "--> " + Static393.aString47, -1, 10, 350 - Static21.aClass14_1.anInt363 - 1);
		local37 = -1;
		if (Static85.anInt1536 % 30 > 15) {
			local37 = 16777215;
		}
		arg0.method5824(local37, 12, 339 - Static21.aClass14_1.anInt363, Static21.aClass14_1.method286("--> " + Static393.aString47.substring(0, Static191.anInt3184)) + 10);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!za;I)V")
	public static void method3328(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static288.anInt4496 == 0 || Static333.anInt5336 == 0) {
			return;
		}
		arg1.GA(Static243.anInt3935, Static91.anInt1611, Static288.anInt4496, Static333.anInt5336);
		arg1.ba(Static6.anInt107, Static236.anInt3872, Static288.anInt4496, Static333.anInt5336);
		@Pc(44) Class29 local44 = arg1.method5880();
		local44.YA(Static140.anInt2491, Static317.anInt4945, Static410.anInt6845, Static55.anInt1042, Static464.anInt7333, Static153.anInt6266);
		arg1.SA(local44);
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(102) int local102;
		@Pc(117) int[] local117;
		@Pc(148) int local148;
		@Pc(156) int local156;
		if (Static110.aClass125Array1 != null) {
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			local64 = arg1.AA();
			local73 = (arg0 - Static243.anInt3935) * local64 / Static288.anInt4496;
			local82 = local64 * (arg2 - Static91.anInt1611) / Static333.anInt5336;
			local85 = arg1.r();
			local94 = local85 * (arg0 - Static243.anInt3935) / Static288.anInt4496;
			local102 = local85 * (arg2 - Static91.anInt1611) / Static333.anInt5336;
			local117 = new int[] { local73, local82, local64 };
			local44.wa(local117);
			@Pc(135) int[] local135 = new int[] { local94, local102, local85 };
			local44.wa(local135);
			@Pc(140) float local140 = 0.0F;
			local148 = local135[0] - local117[0];
			local156 = local135[1] - local117[1];
			@Pc(164) int local164 = local135[2] - local117[2];
			while (local140 < 1.0F) {
				@Pc(177) int local177 = (int) ((float) local117[0] + (float) local148 * local140);
				@Pc(181) int local181 = local177 >> 7;
				@Pc(192) int local192 = (int) (local140 * (float) local164 + (float) local117[2]);
				@Pc(196) int local196 = local192 >> 7;
				if (local181 > 0 && local196 > 0 && Static433.anInt7210 > local181 && local196 < Static418.anInt6969) {
					@Pc(213) int local213 = Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105;
					if (local213 < 3 && (Static452.aByteArrayArrayArray16[1][local181][local196] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static110.aClass125Array1[local213].ca(local177, local192) < (float) local117[1] + local140 * (float) local156) {
						local59 = (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() - 1 << 6) + local177 >> 7;
						local61 = (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() - 1 << 6) + local192 >> 7;
						break;
					}
				}
				local140 = (float) ((double) local140 + 0.01D);
			}
			if (local59 != -1 && local61 != -1) {
				if (Static423.aBoolean478 && (Static277.anInt4336 & 0x40) != 0) {
					@Pc(340) Class76 local340 = Static371.method4859(Static143.anInt2595, Static127.anInt2221);
					if (local340 == null) {
						Static289.method3586();
					} else {
						Static450.method5939(0L, -1, local59, true, 21, Static240.aString73, Static360.anInt5869, false, local61, " ->");
					}
				} else {
					if (Static217.aClass197_2 == Static369.aClass197_4) {
						Static450.method5939(0L, -1, local59, true, 45, Static129.aClass198_33.method4012(Static38.anInt4834), -1, false, local61, "");
					}
					Static450.method5939(0L, -1, local59, true, 6, Static259.aString48, Static193.anInt3220, false, local61, "");
				}
			}
		}
		@Pc(360) Class107 local360 = Static322.aClass107_10;
		for (@Pc(365) Class88_Sub2 local365 = (Class88_Sub2) local360.method2326(); local365 != null; local365 = (Class88_Sub2) local360.method2327()) {
			if ((Static275.aBoolean286 || local365.anInt2816 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) && local365.method2280(arg0, arg2, arg1)) {
				@Pc(506) int local506;
				@Pc(518) int local518;
				if (local365.aClass2_1 instanceof Class2_Sub1_Sub3_Sub2) {
					@Pc(393) Class2_Sub1_Sub3_Sub2 local393 = (Class2_Sub1_Sub3_Sub2) local365.aClass2_1;
					local73 = local393.method4913();
					if ((local73 & 0x1) == 0 && (local393.anInt7500 & 0x7F) == 0 && (local393.anInt7502 & 0x7F) == 0 || (local73 & 0x1) == 1 && (local393.anInt7500 & 0x7F) == 64 && (local393.anInt7502 & 0x7F) == 64) {
						local82 = local393.anInt7500 - (local393.method4913() - 1 << 6);
						local85 = local393.anInt7502 - (local393.method4913() - 1 << 6);
						for (local94 = 0; local94 < Static424.anInt7114; local94++) {
							@Pc(476) Class5_Sub7 local476 = (Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local94]);
							if (local476 != null) {
								@Pc(481) Class2_Sub1_Sub3_Sub1 local481 = local476.aClass2_Sub1_Sub3_Sub1_1;
								if (Static85.anInt1536 != local481.anInt6136 && local481.aBoolean409) {
									local506 = local481.anInt7500 - (local481.aClass131_1.anInt3463 - 1 << 6);
									local518 = local481.anInt7502 - (local481.aClass131_1.anInt3463 - 1 << 6);
									if (local506 >= local82 && local481.aClass131_1.anInt3463 <= local393.method4913() - (local506 - local82 >> 7) && local518 >= local85 && local481.aClass131_1.anInt3463 <= local393.method4913() - (local518 - local85 >> 7)) {
										Static23.method402(local481, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816);
										local481.anInt6136 = Static85.anInt1536;
									}
								}
							}
						}
						local102 = Static31.anInt622;
						local117 = Static334.anIntArray387;
						for (local506 = 0; local506 < local102; local506++) {
							@Pc(597) Class2_Sub1_Sub3_Sub2 local597 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local117[local506]];
							if (local597 != null && Static85.anInt1536 != local597.anInt6136 && local597 != local393 && local597.aBoolean409) {
								local148 = local597.anInt7500 - (local597.method4913() - 1 << 6);
								local156 = local597.anInt7502 - (local597.method4913() - 1 << 6);
								if (local148 >= local82 && local597.method4913() <= local393.method4913() - (local148 - local82 >> 7) && local85 <= local156 && local597.method4913() <= local393.method4913() - (local156 - local85 >> 7)) {
									Static113.method1562(local597, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816);
									local597.anInt6136 = Static85.anInt1536;
								}
							}
						}
					}
					if (Static85.anInt1536 == local393.anInt6136) {
						continue;
					}
					Static113.method1562(local393, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816);
					local393.anInt6136 = Static85.anInt1536;
				}
				@Pc(845) int local845;
				if (local365.aClass2_1 instanceof Class2_Sub1_Sub3_Sub1) {
					@Pc(725) Class2_Sub1_Sub3_Sub1 local725 = (Class2_Sub1_Sub3_Sub1) local365.aClass2_1;
					if (local725.aClass131_1 != null) {
						if ((local725.aClass131_1.anInt3463 & 0x1) == 0 && (local725.anInt7500 & 0x7F) == 0 && (local725.anInt7502 & 0x7F) == 0 || (local725.aClass131_1.anInt3463 & 0x1) == 1 && (local725.anInt7500 & 0x7F) == 64 && (local725.anInt7502 & 0x7F) == 64) {
							local73 = local725.anInt7500 - (local725.aClass131_1.anInt3463 - 1 << 6);
							local82 = local725.anInt7502 - (local725.aClass131_1.anInt3463 - 1 << 6);
							for (local85 = 0; local85 < Static424.anInt7114; local85++) {
								@Pc(812) Class5_Sub7 local812 = (Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local85]);
								if (local812 != null) {
									@Pc(817) Class2_Sub1_Sub3_Sub1 local817 = local812.aClass2_Sub1_Sub3_Sub1_1;
									if (Static85.anInt1536 != local817.anInt6136 && local817 != local725 && local817.aBoolean409) {
										local845 = local817.anInt7500 - (local817.aClass131_1.anInt3463 - 1 << 6);
										local506 = local817.anInt7502 - (local817.aClass131_1.anInt3463 - 1 << 6);
										if (local845 >= local73 && local817.aClass131_1.anInt3463 <= local725.aClass131_1.anInt3463 - (local845 - local73 >> 7) && local82 <= local506 && local725.aClass131_1.anInt3463 - (local506 - local82 >> 7) >= local817.aClass131_1.anInt3463) {
											Static23.method402(local817, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816);
											local817.anInt6136 = Static85.anInt1536;
										}
									}
								}
							}
							local94 = Static31.anInt622;
							@Pc(926) int[] local926 = Static334.anIntArray387;
							for (local845 = 0; local845 < local94; local845++) {
								@Pc(936) Class2_Sub1_Sub3_Sub2 local936 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local926[local845]];
								if (local936 != null && Static85.anInt1536 != local936.anInt6136 && local936.aBoolean409) {
									local518 = local936.anInt7500 - (local936.method4913() - 1 << 6);
									local148 = local936.anInt7502 - (local936.method4913() - 1 << 6);
									if (local518 >= local73 && local936.method4913() <= local725.aClass131_1.anInt3463 - (local518 - local73 >> 7) && local148 >= local82 && local936.method4913() <= local725.aClass131_1.anInt3463 - (local148 - local82 >> 7)) {
										Static113.method1562(local936, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816);
										local936.anInt6136 = Static85.anInt1536;
									}
								}
							}
						}
						if (local725.anInt6136 == Static85.anInt1536) {
							continue;
						}
						Static23.method402(local725, local365.anInt2816 != Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105);
						local725.anInt6136 = Static85.anInt1536;
					}
				}
				if (local365.aClass2_1 instanceof Class2_Sub5_Sub1) {
					local64 = local365.anInt2813 + Static31.anInt618;
					local73 = local365.anInt2814 + Static226.anInt3768;
					@Pc(1092) Class5_Sub24 local1092 = (Class5_Sub24) Static400.aClass252_38.method5659((long) (local73 << 14 | local365.anInt2816 << 28 | local64));
					if (local1092 != null) {
						for (@Pc(1100) Class5_Sub27 local1100 = (Class5_Sub27) local1092.aClass177_21.method3617(); local1100 != null; local1100 = (Class5_Sub27) local1092.aClass177_21.method3612()) {
							@Pc(1108) Class40 local1108 = Static306.aClass67_3.method1452(local1100.anInt4203);
							if (!Static423.aBoolean478) {
								if (Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 == local365.anInt2816) {
									@Pc(1118) String[] local1118 = local1108.aStringArray5;
									for (local845 = 4; local845 >= 0; local845--) {
										if (local1118 != null && local1118[local845] != null) {
											@Pc(1130) byte local1130 = 0;
											if (local845 == 0) {
												local1130 = 60;
											}
											local518 = Static307.anInt4786;
											if (local845 == 1) {
												local1130 = 4;
											}
											if (local845 == 2) {
												local1130 = 5;
											}
											if (local845 == 3) {
												local1130 = 46;
											}
											if (local845 == local1108.anInt1185) {
												local518 = local1108.anInt1168;
											}
											if (local845 == 4) {
												local1130 = 59;
											}
											if (local1108.anInt1133 == local845) {
												local518 = local1108.anInt1179;
											}
											Static450.method5939((long) local1100.anInt4203, -1, local365.anInt2813, true, local1130, local1118[local845], local518, false, local365.anInt2814, "<col=ff9040>" + local1108.aString5);
										}
									}
								}
								Static450.method5939((long) local1100.anInt4203, -1, local365.anInt2813, true, 1007, Static301.aClass198_83.method4012(Static38.anInt4834), Static407.anInt6817, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816, local365.anInt2814, "<col=ff9040>" + local1108.aString5);
							} else if (local365.anInt2816 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) {
								@Pc(1276) Class166 local1276 = Static154.anInt6464 == -1 ? null : Static1.aClass33_3.method788(Static154.anInt6464);
								if ((Static277.anInt4336 & 0x1) != 0 && (local1276 == null || local1108.method969(Static154.anInt6464, local1276.anInt4273) != local1276.anInt4273)) {
									Static450.method5939((long) local1100.anInt4203, -1, local365.anInt2813, true, 9, Static240.aString73, Static360.anInt5869, false, local365.anInt2814, Static21.aString3 + " -> <col=ff9040>" + local1108.aString5);
								}
							}
						}
					}
				}
				if (local365.aClass2_1 instanceof Interface2) {
					@Pc(1344) Interface2 local1344 = (Interface2) local365.aClass2_1;
					@Pc(1351) Class114 local1351 = Static398.aClass256_4.method5782(local1344.method6037());
					if (local1351.anIntArray170 != null) {
						local1351 = local1351.method2393(Static408.aClass39_1);
					}
					if (local1351 != null) {
						if (!Static423.aBoolean478) {
							if (Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 == local365.anInt2816) {
								@Pc(1371) String[] local1371 = local1351.aStringArray18;
								if (local1371 != null) {
									for (local85 = 4; local85 >= 0; local85--) {
										if (local1371[local85] != null) {
											@Pc(1383) short local1383 = 0;
											if (local85 == 0) {
												local1383 = 30;
											}
											local102 = Static307.anInt4786;
											if (local85 == 1) {
												local1383 = 22;
											}
											if (local85 == 2) {
												local1383 = 20;
											}
											if (local85 == 3) {
												local1383 = 10;
											}
											if (local85 == local1351.anInt2971) {
												local102 = local1351.anInt2996;
											}
											if (local85 == 4) {
												local1383 = 1004;
											}
											if (local1351.anInt2973 == local85) {
												local102 = local1351.anInt2960;
											}
											Static450.method5939(Static108.method1495(local1344, local365.anInt2813, local365.anInt2814), -1, local365.anInt2813, true, local1383, local1371[local85], local102, false, local365.anInt2814, "<col=00ffff>" + local1351.aString34);
										}
									}
								}
							}
							Static450.method5939((long) local1351.anInt2994, -1, local365.anInt2813, true, 1003, Static301.aClass198_83.method4012(Static38.anInt4834), Static407.anInt6817, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local365.anInt2816, local365.anInt2814, "<col=00ffff>" + local1351.aString34);
						} else if (local365.anInt2816 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) {
							@Pc(1528) Class166 local1528 = Static154.anInt6464 == -1 ? null : Static1.aClass33_3.method788(Static154.anInt6464);
							if ((Static277.anInt4336 & 0x4) != 0 && (local1528 == null || local1351.method2405(local1528.anInt4273, Static154.anInt6464) != local1528.anInt4273)) {
								Static450.method5939(Static108.method1495(local1344, local365.anInt2813, local365.anInt2814), -1, local365.anInt2813, true, 49, Static240.aString73, Static360.anInt5869, false, local365.anInt2814, Static21.aString3 + " -> <col=00ffff>" + local1351.aString34);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method3329(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static319.method3934(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)V")
	public static void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static343.anInt5618; local12++) {
			@Pc(18) Rectangle local18 = Class121.aRectangleArray1[local12];
			if (local18.width + local18.x > arg1 && local18.x < arg1 + arg3 && arg2 < local18.y + local18.height && arg0 + arg2 > local18.y) {
				Static99.aBooleanArray5[local12] = true;
			}
		}
	}
}
