import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "Lclient!fc;")
	public static Class71 aClass71_29;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIZII)V")
	public static void method2397(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static138.method2407(arg2)) {
			Static214.method3624(Static228.aClass155ArrayArray1[arg2], -1, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method2398(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static92.method1581(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[Lclient!ms;BIIIIIII)V")
	public static void method2400(@OriginalArg(0) int arg0, @OriginalArg(1) Class155[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
		for (@Pc(21) int local21 = 0; local21 < arg1.length; local21++) {
			@Pc(27) Class155 local27 = arg1[local21];
			if (local27 != null && (local27.anInt4144 == arg8 || arg8 == -1412584499 && local27 == Static243.aClass155_26)) {
				@Pc(74) int local74;
				if (arg5 == -1) {
					Class2.aRectangleArray120[Static318.anInt4651].setBounds(local27.anInt4189 + arg4, arg6 + local27.anInt4206, local27.anInt4170, local27.anInt4214);
					local74 = Static318.anInt4651++;
				} else {
					local74 = arg5;
				}
				local27.anInt4215 = local74;
				local27.anInt4183 = Static295.anInt5281;
				if (!Static41.method888(local27)) {
					if (local27.anInt4155 != 0) {
						Static231.method3808(local27);
					}
					@Pc(99) int local99 = local27.anInt4189 + arg4;
					@Pc(104) int local104 = arg6 + local27.anInt4206;
					@Pc(107) int local107 = local27.anInt4187;
					if (Static218.aBoolean304 && (Static41.method878(local27).anInt5883 != 0 || local27.anInt4164 == 0) && local107 > 127) {
						local107 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (local27 == Static243.aClass155_26) {
						if (arg8 != -1412584499 && (Static52.anInt3690 == local27.anInt4211 || Static351.anInt1771 == local27.anInt4211)) {
							Static98.anInt1948 = arg6;
							Static93.aClass155Array1 = arg1;
							Static8.anInt188 = arg4;
							continue;
						}
						if (Static47.aBoolean86 && Static291.aBoolean382) {
							local160 = Static138.aClass78_1.method1804();
							local164 = Static138.aClass78_1.method1808();
							local160 -= Static366.anInt6415;
							local164 -= Static22.anInt540;
							if (Static17.anInt415 > local160) {
								local160 = Static17.anInt415;
							}
							if (local164 < Static33.anInt705) {
								local164 = Static33.anInt705;
							}
							if (Static380.aClass155_38.anInt4170 + Static17.anInt415 < local160 - -local27.anInt4170) {
								local160 = Static380.aClass155_38.anInt4170 + Static17.anInt415 - local27.anInt4170;
							}
							if (Static33.anInt705 + Static380.aClass155_38.anInt4214 < local27.anInt4214 + local164) {
								local164 = Static380.aClass155_38.anInt4214 + Static33.anInt705 - local27.anInt4214;
							}
							local99 = local160;
							local104 = local164;
						}
						if (Static351.anInt1771 == local27.anInt4211) {
							local107 = 128;
						}
					}
					@Pc(238) int local238;
					@Pc(244) int local244;
					@Pc(251) int local251;
					@Pc(256) int local256;
					if (local27.anInt4164 == 2) {
						local238 = arg3;
						local160 = arg7;
						local164 = arg0;
						local244 = arg2;
					} else {
						local251 = local99 + local27.anInt4170;
						local256 = local27.anInt4214 + local104;
						local160 = local99 <= arg7 ? arg7 : local99;
						local164 = arg0 >= local104 ? arg0 : local104;
						if (local27.anInt4164 == 9) {
							local251++;
							local256++;
						}
						local238 = local251 < arg3 ? local251 : arg3;
						local244 = arg2 > local256 ? local256 : arg2;
					}
					if (local160 < local238 && local244 > local164) {
						@Pc(560) int local560;
						@Pc(586) int local586;
						@Pc(588) int local588;
						@Pc(508) int local508;
						@Pc(510) int local510;
						if (local27.anInt4155 != 0) {
							if (local27.anInt4155 == Static369.anInt6456 || local27.anInt4155 == Static143.anInt2604) {
								Static54.method1045(local27.anInt4170, local99, local104, local27.anInt4214, local27.anInt4155 == Static143.anInt2604);
								Static370.aBooleanArray143[local74] = true;
								Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
								continue;
							}
							if (Static252.anInt4528 == local27.anInt4155) {
								if (local27.method3760(Static304.aClass82_4) != null) {
									Static209.method3549();
									Static52.method3365(local99, local104, Static304.aClass82_4, local27);
									Static185.aBooleanArray73[local74] = true;
									Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
								}
								continue;
							}
							if (Static245.anInt4396 == local27.anInt4155) {
								if (local27.method3760(Static304.aClass82_4) != null) {
									Static178.method2898(local27, local99, local104);
									Static185.aBooleanArray73[local74] = true;
									Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
								}
								continue;
							}
							if (local27.anInt4155 == Static136.anInt2538) {
								Static346.method5277(Static356.anInterface1_7, local27.anInt4170, Static304.aClass82_4, local99, local27.anInt4214, local104);
								Static370.aBooleanArray143[local74] = true;
								Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
								continue;
							}
							if (Static209.anInt3864 == local27.anInt4155) {
								Static272.method4278(local104, local99, local27.anInt4170, local27.anInt4214, Static304.aClass82_4);
								Static370.aBooleanArray143[local74] = true;
								Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
								continue;
							}
							if (Static174.anInt6734 == local27.anInt4155) {
								if (!Static340.aBoolean454 && !Static111.aBoolean174) {
									continue;
								}
								local251 = local99 + local27.anInt4170;
								local256 = local104 + 15;
								if (Static340.aBoolean454) {
									Static246.aClass13_4.method5605("Fps:" + Static280.anInt4946, local251, local256, -256);
									local256 += 15;
									@Pc(499) Runtime local499 = Runtime.getRuntime();
									local508 = (int) ((local499.totalMemory() - local499.freeMemory()) / 1024L);
									local510 = -256;
									if (local508 > 65536) {
										local510 = -65536;
									}
									Static246.aClass13_4.method5605("Mem:" + local508 + "k", local251, local256, local510);
									local256 += 15;
									Static246.aClass13_4.method5605("In:" + Static259.anInt4616 + "B/s Out:" + Static291.anInt5149 + "B/s", local251, local256, -256);
									local256 += 15;
									local560 = Static304.aClass82_4.method4478() / 1024;
									Static246.aClass13_4.method5605("Offheap:" + local560 + "k", local251, local256, local560 <= 65536 ? -256 : -65536);
									local256 += 15;
									local586 = 0;
									local588 = 0;
									@Pc(590) int local590 = 0;
									for (@Pc(592) int local592 = 0; local592 < 29; local592++) {
										local586 += Static148.aClass106_Sub1Array2[local592].method3065();
										local588 += Static148.aClass106_Sub1Array2[local592].method3070();
										local590 += Static148.aClass106_Sub1Array2[local592].method3061();
									}
									@Pc(628) int local628 = local590 * 100 / local586;
									@Pc(634) int local634 = local588 * 10000 / local586;
									@Pc(654) String local654 = "Cache:" + method2401((long) local634, 2, true, 0) + "% (" + local628 + "%)";
									Static91.aClass13_2.method5605(local654, local251, local256, -256);
									local256 += 12;
								}
								if (Class12_Sub1_Sub4.lb > 0) {
									Static91.aClass13_2.method5605("Particles: " + Static287.anInt5119 + " / " + Class12_Sub1_Sub4.lb, local251, local256, -256);
								}
								local256 += 12;
								if (Static111.aBoolean174) {
									Static91.aClass13_2.method5605("Polys: " + Static304.aClass82_4.method4490() + " Models: " + Static304.aClass82_4.method4480(), local251, local256, -256);
									local256 += 12;
									Static91.aClass13_2.method5605("Ls: " + Static150.anInt2709 + " La: " + Static385.anInt6688 + " NPC: " + Static298.anInt5294 + " Pl: " + Static54.anInt1109, local251, local256, -256);
									local256 += 12;
									Static35.method772();
								}
								Static370.aBooleanArray143[local74] = true;
								continue;
							}
						}
						if (local27.anInt4164 == 0) {
							if (local27.anInt4155 == Static46.anInt930 && Static304.aClass82_4.method4463()) {
								Static304.aClass82_4.method4474(local99, local104, local27.anInt4170, local27.anInt4214);
							}
							method2400(local164, arg1, local244, local238, local99 - local27.anInt4174, local74, local104 - local27.anInt4207, local160, local27.anInt4166);
							if (local27.aClass155Array2 != null) {
								method2400(local164, local27.aClass155Array2, local244, local238, local99 - local27.anInt4174, local74, local104 - local27.anInt4207, local160, local27.anInt4166);
							}
							@Pc(819) Class2_Sub41 local819 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local27.anInt4166);
							if (local819 != null) {
								Static204.method3414(local238, local244, local160, local164, local74, local99, local819.anInt6411, local104);
							}
							if (local27.anInt4155 == Static46.anInt930 && Static304.aClass82_4.method4463()) {
								Static304.aClass82_4.method4507();
								Static257.aBoolean490 = true;
							}
							Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
						}
						if (Static5.aBooleanArray148[local74] || Static102.anInt2004 > 1) {
							if (local27.anInt4164 == 3) {
								if (local107 == 0) {
									if (local27.aBoolean313) {
										Static304.aClass82_4.method4482(local99, local104, local27.anInt4170, local27.anInt4214, local27.anInt4165, 0);
									} else {
										Static304.aClass82_4.method4552(local99, local104, local27.anInt4170, local27.anInt4214, local27.anInt4165, 0);
									}
								} else if (local27.aBoolean313) {
									Static304.aClass82_4.method4482(local99, local104, local27.anInt4170, local27.anInt4214, 255 - (local107 & 0xFF) << 24 | local27.anInt4165 & 0xFFFFFF, 1);
								} else {
									Static304.aClass82_4.method4552(local99, local104, local27.anInt4170, local27.anInt4214, local27.anInt4165 & 0xFFFFFF | 255 - (local107 & 0xFF) << 24, 1);
								}
							} else if (local27.anInt4164 == 4) {
								@Pc(956) Class13 local956 = local27.method3767(Static304.aClass82_4);
								if (local956 != null) {
									local256 = local27.anInt4165;
									@Pc(971) String local971 = local27.aString37;
									if (local27.anInt4212 != -1) {
										@Pc(981) Class117 local981 = Static106.aClass250_1.method5735(local27.anInt4212);
										local971 = local981.aString27;
										if (local971 == null) {
											local971 = "null";
										}
										if ((local981.anInt2872 == 1 || local27.anInt4204 != 1) && local27.anInt4204 != -1) {
											local971 = "<col=ff9040>" + local971 + "</col> x" + Static186.method5452(local27.anInt4204);
										}
									}
									if (Static307.aClass155_31 == local27) {
										local971 = Static211.aClass221_133.method5229(Static189.anInt5185);
										local256 = local27.anInt4165;
									}
									if (Static375.aBoolean327) {
										Static304.aClass82_4.method4542(local99, local104, local99 + local27.anInt4170, local104 + local27.anInt4214);
									}
									local956.method5611(0, local104, local27.anInt4162, local27.anInt4182, local27.anInt4214, local27.anInt4157, null, local99, local27.aBoolean319 ? 255 - (local107 & 0xFF) << 24 : -1, local971, 0, local27.anInt4170, 255 - (local107 & 0xFF) << 24 | local256, null, Static357.aClass5Array2);
									if (Static375.aBoolean327) {
										Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
									}
								} else if (Static64.aBoolean107) {
									Static295.method4664(local27);
								}
							} else {
								@Pc(1156) int local1156;
								if (local27.anInt4164 == 5) {
									if (local27.anInt4172 < 0) {
										@Pc(1134) Class5 local1134;
										if (local27.anInt4212 == -1) {
											local1134 = local27.method3771(Static304.aClass82_4);
										} else {
											@Pc(1116) Class247 local1116 = local27.aBoolean321 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null;
											local1134 = Static106.aClass250_1.method5737(local27.anInt4204, local27.anInt4142 | 0xFF000000, local27.anInt4145, Static304.aClass82_4, local1116, local27.anInt4148, local27.anInt4212);
										}
										if (local1134 != null) {
											local256 = local1134.method4990();
											local1156 = local1134.method4992();
											if (local27.aBoolean317) {
												Static304.aClass82_4.method4542(local99, local104, local99 + local27.anInt4170, local27.anInt4214 + local104);
												if (local27.anInt4190 != 0) {
													local508 = (local256 + local27.anInt4170 - 1) / local256;
													local510 = (local1156 + local27.anInt4214 - 1) / local1156;
													for (local560 = 0; local560 < local508; local560++) {
														for (local586 = 0; local586 < local510; local586++) {
															local1134.method4993((float) (local256 * local560 + local99) + (float) local256 / 2.0F, (float) local1156 / 2.0F + (float) (local1156 * local586 + local104), 4096, local27.anInt4190);
														}
													}
												} else if (local107 == 0) {
													local1134.method4989(local99, local104, local27.anInt4170, local27.anInt4214, 0, 0);
												} else {
													local1134.method4989(local99, local104, local27.anInt4170, local27.anInt4214, 1, 255 - (local107 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
											} else if (local107 != 0) {
												local508 = 255 - (local107 & 0xFF) << 24 | 0xFFFFFF;
												if (local27.anInt4190 != 0) {
													local1134.method4996((float) local27.anInt4170 / 2.0F + (float) local99, (float) local104 + (float) local27.anInt4214 / 2.0F, local27.anInt4170 * 4096 / local256, local27.anInt4190, local508);
												} else if (local27.anInt4170 == local256 && local27.anInt4214 == local1156) {
													local1134.method5006(local99, local104, 1, local508);
												} else {
													local1134.method5000(local99, local104, local27.anInt4170, local27.anInt4214, 1, local508, 1);
												}
											} else if (local27.anInt4190 != 0) {
												local1134.method4993((float) local99 + (float) local27.anInt4170 / 2.0F, (float) local104 + (float) local27.anInt4214 / 2.0F, local27.anInt4170 * 4096 / local256, local27.anInt4190);
											} else if (local256 == local27.anInt4170 && local1156 == local27.anInt4214) {
												local1134.method5004(local99, local104);
											} else {
												local1134.method4991(local99, local104, local27.anInt4170, local27.anInt4214);
											}
										} else if (Static64.aBoolean107) {
											Static295.method4664(local27);
										}
									} else {
										local27.method3765(Static189.aClass119_3, Static80.aClass171_1).method5714(local27.anInt4214, local104, local27.anInt4152 << 3, local99, local27.anInt4156 << 3, Static304.aClass82_4, 0, local27.anInt4170, 0);
									}
								} else if (local27.anInt4164 == 6) {
									Static370.method5577();
									@Pc(1465) Class3 local1465 = null;
									local256 = 0;
									@Pc(1570) Class189 local1570;
									@Pc(1580) Class247 local1580;
									if (local27.anInt4212 != -1) {
										@Pc(1677) Class117 local1677 = Static106.aClass250_1.method5735(local27.anInt4212);
										if (local1677 != null) {
											local1677 = local1677.method2641(local27.anInt4204);
											local1570 = local27.anInt4178 == -1 ? null : Static351.aClass175_3.method4107(local27.anInt4178);
											local1580 = local27.aBoolean321 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null;
											local1465 = local1677.method2647(local27.anInt4192, 1024, 1, Static304.aClass82_4, local1580, local27.anInt4133, local27.anInt4203, local1570);
											if (local1465 == null) {
												Static295.method4664(local27);
											} else {
												local256 = -local1465.method3459() / 2;
											}
										}
									} else if (local27.anInt4188 == 5) {
										local1156 = local27.anInt4193;
										if (local1156 >= 0 && local1156 < 2048) {
											@Pc(1619) Class12_Sub1_Sub2_Sub2 local1619 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local1156];
											@Pc(1632) Class189 local1632 = local27.anInt4178 == -1 ? null : Static351.aClass175_3.method4107(local27.anInt4178);
											if (local1619 != null && (local1156 == Static194.anInt3441 || Static379.method1117(local1619.aString51) == local27.anInt4140)) {
												local1465 = local1619.aClass247_1.method5695(0, 1024, Static8.aClass40_1, Static274.aClass151_4, Static106.aClass250_1, Static351.aClass175_3, local27.anInt4192, 0, null, local1632, -1, null, Static248.aClass125_1, Static225.aClass47_1, local27.anInt4203, Static304.aClass82_4, local27.anInt4133);
											}
										}
									} else if (local27.anInt4188 == 8 || local27.anInt4188 == 9) {
										@Pc(1557) Class2_Sub16 local1557 = Static108.method2083(false, local27.anInt4193);
										local1570 = local27.anInt4178 == -1 ? null : Static351.aClass175_3.method4107(local27.anInt4178);
										if (local1557 != null) {
											local1580 = local27.aBoolean321 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null;
											local1465 = local1557.method2268(local27.anInt4133, local27.anInt4192, local1570, Static304.aClass82_4, local27.anInt4188 == 9, local27.anInt4203, local27.anInt4140, local1580);
										}
									} else if (local27.anInt4178 == -1) {
										local1465 = local27.method3761(Static274.aClass151_4, -1, -1, 1024, null, Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1, Static351.aClass175_3, Static304.aClass82_4, Static248.aClass125_1, Static8.aClass40_1, Static225.aClass47_1, Static106.aClass250_1, 0);
										if (local1465 == null && Static64.aBoolean107) {
											Static295.method4664(local27);
										}
									} else {
										@Pc(1496) Class189 local1496 = Static351.aClass175_3.method4107(local27.anInt4178);
										local1465 = local27.method3761(Static274.aClass151_4, local27.anInt4192, local27.anInt4203, 1024, local1496, Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1, Static351.aClass175_3, Static304.aClass82_4, Static248.aClass125_1, Static8.aClass40_1, Static225.aClass47_1, Static106.aClass250_1, local27.anInt4133);
										if (local1465 == null && Static64.aBoolean107) {
											Static295.method4664(local27);
										}
									}
									if (local1465 != null) {
										if (local27.anInt4143 <= 0) {
											local1156 = 512;
										} else {
											local1156 = (local27.anInt4170 << 9) / local27.anInt4143;
										}
										if (local27.anInt4173 <= 0) {
											local508 = 512;
										} else {
											local508 = (local27.anInt4214 << 9) / local27.anInt4173;
										}
										local510 = (local1156 * local27.anInt4202 >> 9) + local99 + local27.anInt4170 / 2;
										local560 = (local508 * local27.anInt4139 >> 9) + (local104 + (local27.anInt4214 / 2));
										Static280.aClass54_2.method4785();
										Static304.aClass82_4.method4533(Static280.aClass54_2);
										local586 = local27.anInt4180 * Class104.anIntArray705[local27.anInt4151 << 3] >> 15;
										local588 = Class104.anIntArray706[local27.anInt4151 << 3] * local27.anInt4180 >> 15;
										Static304.aClass82_4.method4506(local510, local560, local1156, local508);
										Static304.aClass82_4.method4516((float) local27.aShort64, local27.aBoolean314 ? (float) local27.aShort65 : (float) local27.aShort65 * 1.5F);
										if (arg8 == -1412584499 || Static257.aBoolean490) {
											Static304.aClass82_4.method4512();
											Static304.aClass82_4.method4458();
											Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
											Static257.aBoolean490 = false;
										}
										if (local27.aBoolean310) {
											Static304.aClass82_4.method4555(false);
										}
										Static246.aClass54_1.method4784(-local27.anInt4199 << 3);
										Static246.aClass54_1.method4793(local27.lb << 3);
										Static246.aClass54_1.method4783(local27.anInt4167, local586 + local256 + local27.anInt4134, local588 + local27.anInt4134);
										Static246.aClass54_1.method4779(local27.anInt4151 << 3);
										if (Static375.aBoolean327) {
											Static304.aClass82_4.method4542(local99, local104, local99 + local27.anInt4170, local104 + local27.anInt4214);
										}
										if (local27.aBoolean314) {
											local1465.method3465(Static246.aClass54_1, null, local27.anInt4180);
										} else {
											local1465.method3443(Static246.aClass54_1, null, 1);
										}
										if (Static375.aBoolean327) {
											Static304.aClass82_4.method4477(arg7, arg0, arg3, arg2);
										}
										if (local27.aBoolean310) {
											Static304.aClass82_4.method4555(true);
										}
									}
								} else if (local27.anInt4164 == 9) {
									if (local27.aBoolean312) {
										local508 = local104;
										local1156 = local99 + local27.anInt4170;
										local256 = local27.anInt4214 + local104;
									} else {
										local508 = local27.anInt4214 + local104;
										local1156 = local99 + local27.anInt4170;
										local256 = local104;
									}
									if (local27.anInt4138 == 1) {
										Static304.aClass82_4.method4539(local99, local256, local1156, local508, local27.anInt4165, 0);
									} else {
										Static304.aClass82_4.method4462(local99, local256, local1156, local508, local27.anInt4165, local27.anInt4138);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method2401(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local25 = true;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg1 > 0) {
			for (local46 = 0; local46 < arg1; local46++) {
				local51 = (int) arg0;
				arg0 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg0 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg0;
			arg0 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg2) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}
}
