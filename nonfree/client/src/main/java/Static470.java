import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!fc;")
	public static Class100 aClass100_14;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt9222;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt9219 = 0;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_100 = new Class46(5, 4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!cd;)V")
	public static void method7958(@OriginalArg(1) int arg0, @OriginalArg(2) Class48 arg1) {
		if (Static221.aBoolean307) {
			arg0 = 0;
			Static221.aBoolean307 = false;
		}
		if (Static615.aClass48_2 != null && Static615.aClass48_2.method1047(arg1)) {
			return;
		}
		Static615.aClass48_2 = arg1;
		Static405.aLong176 = Static95.method1587();
		Static61.anInt9887 = arg0;
		Static371.anInt6181 = arg0;
		if (Static371.anInt6181 != 0) {
			Static127.anInt2303 = Static257.anInt4680;
			Static101.anInt1980 = Static463.anInt7780;
			Static148.aFloat35 = Static55.aFloat9;
			Static31.aFloat6 = Static418.aFloat135;
			Static445.aFloat140 = Static72.aFloat18;
			Static550.aFloat174 = Static266.aFloat92;
			Static280.aFloat93 = Static471.aFloat143;
			Static14.aFloat2 = Static556.aFloat178;
			Static17.aClass130_1 = Static625.aClass130_4;
			Static86.anInt1720 = Static16.anInt250;
			return;
		}
		Static89.method1509();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIZIII[Lclient!raa;II)V")
	public static void method7959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class295[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
		for (@Pc(18) int local18 = 0; local18 < arg7.length; local18++) {
			@Pc(24) Class295 local24 = arg7[local18];
			if (local24 != null && (local24.anInt7944 == arg9 || arg9 == -1412584499 && Static443.aClass295_14 == local24)) {
				@Pc(43) int local43 = local24.anInt8030 + arg4;
				@Pc(48) int local48 = arg5 + local24.anInt7996;
				@Pc(55) int local55 = local24.anInt7957 + local43 + 1;
				@Pc(62) int local62 = local24.anInt7985 + local48 + 1;
				@Pc(67) int local67;
				if (arg0 == -1) {
					Class4_Sub2_Sub3.aRectangleArray4[Static463.anInt7779].setBounds(local24.anInt8030 + arg4, local24.anInt7996 + arg5, local24.anInt7957, local24.anInt7985);
					local67 = Static463.anInt7779++;
				} else {
					local67 = arg0;
				}
				local24.anInt8038 = local67;
				local24.anInt7961 = Static631.anInt10493;
				if (!Static75.method1289(local24)) {
					if (local24.anInt7960 != 0) {
						Static51.method900(local24);
					}
					@Pc(114) int local114 = local24.anInt8030 + arg4;
					@Pc(120) int local120 = local24.anInt7996 + arg5;
					@Pc(122) int local122 = 0;
					@Pc(124) int local124 = 0;
					if (Static428.aBoolean526) {
						local122 = Static584.method8436();
						local124 = Static88.method1487();
					}
					@Pc(135) int local135 = local24.anInt7995;
					if (Static132.aBoolean513 && (Static75.method1286(local24).anInt7590 != 0 || local24.anInt8001 == 0) && local135 > 127) {
						local135 = 127;
					}
					@Pc(187) int local187;
					@Pc(193) int local193;
					if (Static443.aClass295_14 == local24) {
						if (arg9 != -1412584499 && (Static151.anInt2618 == local24.anInt7980 || Static95.anInt1924 == local24.anInt7980)) {
							Static162.anInt2730 = arg4;
							Static468.aClass295Array1 = arg7;
							Static237.anInt4362 = arg5;
							continue;
						}
						if (Static328.aBoolean404 && Static553.aBoolean673) {
							local187 = local122 + Static3.aClass3_3.method8875();
							local193 = local124 + Static3.aClass3_3.method8879();
							local193 -= Static380.anInt6270;
							local187 -= Static246.anInt4495;
							if (Static384.anInt6352 > local187) {
								local187 = Static384.anInt6352;
							}
							if (local187 + local24.anInt7957 > Static384.anInt6352 + Static106.aClass295_6.anInt7957) {
								local187 = Static106.aClass295_6.anInt7957 + Static384.anInt6352 - local24.anInt7957;
							}
							if (local193 < Static274.anInt4912) {
								local193 = Static274.anInt4912;
							}
							local114 = local187;
							if (local193 + local24.anInt7985 > Static274.anInt4912 - -Static106.aClass295_6.anInt7985) {
								local193 = Static106.aClass295_6.anInt7985 + Static274.anInt4912 - local24.anInt7985;
							}
							local120 = local193;
						}
						if (Static95.anInt1924 == local24.anInt7980) {
							local135 = 128;
						}
					}
					@Pc(321) int local321;
					@Pc(310) int local310;
					@Pc(270) int local270;
					@Pc(275) int local275;
					if (local24.anInt8001 == 2) {
						local193 = arg2;
						local321 = arg6;
						local310 = arg8;
						local187 = arg1;
					} else {
						local270 = local24.anInt7957 + local114;
						local275 = local24.anInt7985 + local120;
						if (local24.anInt8001 == 9) {
							local275++;
							local270++;
						}
						local193 = local120 > arg2 ? local120 : arg2;
						local187 = arg1 >= local114 ? arg1 : local114;
						local310 = local275 >= arg8 ? arg8 : local275;
						local321 = local270 >= arg6 ? arg6 : local270;
					}
					if (local187 < local321 && local193 < local310) {
						@Pc(622) int local622;
						@Pc(633) int local633;
						@Pc(727) int local727;
						@Pc(586) int local586;
						@Pc(620) int local620;
						if (local24.anInt7960 != 0) {
							if (Static27.anInt354 == local24.anInt7960 || local24.anInt7960 == Static621.anInt10358) {
								Static377.method5548(local24, local114, local120);
								if (!Static428.aBoolean526) {
									Static476.method7025(local120, local24.anInt7957, local114, Static621.anInt10358 == local24.anInt7960, local24.anInt7985);
									Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
								}
								Static264.aBooleanArray16[local67] = true;
								continue;
							}
							if (local24.anInt7960 == Static7.anInt153) {
								if (local24.method6998(Static213.aClass133_5) != null) {
									Static229.method3856();
									Static598.method8592(Static213.aClass133_5, local114, local120, local24);
									Static27.aBooleanArray2[local67] = true;
									Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
									if (Static428.aBoolean526) {
										if (arg3) {
											Static562.method5062(local48, local62, local55, local43);
										} else {
											Static646.method9057(local43, local48, local55, local62);
										}
									}
								}
								continue;
							}
							if (local24.anInt7960 == Static341.anInt5765) {
								if (local24.method6998(Static213.aClass133_5) != null) {
									Static643.method9017(local120, local24, local114);
									Static27.aBooleanArray2[local67] = true;
									Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
									if (Static428.aBoolean526) {
										if (arg3) {
											Static562.method5062(local48, local62, local55, local43);
										} else {
											Static646.method9057(local43, local48, local55, local62);
										}
									}
								}
								continue;
							}
							if (local24.anInt7960 == Static605.anInt10103) {
								Static112.method1734(Static31.anInterface3_1, local114, Static213.aClass133_5, local24.anInt7957, local24.anInt7985, local120);
								Static264.aBooleanArray16[local67] = true;
								Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
								continue;
							}
							if (Static588.anInt9884 == local24.anInt7960) {
								Static67.method1111(local24.anInt7957, local24.anInt7985, local120, local114, Static213.aClass133_5);
								Static264.aBooleanArray16[local67] = true;
								Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
								continue;
							}
							if (local24.anInt7960 == Static146.anInt2545) {
								if (!Static471.aBoolean564 && !Static183.aBoolean229) {
									continue;
								}
								local270 = local114 + local24.anInt7957;
								if (Static428.aBoolean526) {
									if (arg3) {
										Static562.method5062(local48, local62, local55, local43);
									} else {
										Static646.method9057(local43, local48, local55, local62);
									}
								}
								local275 = local120 + 15;
								if (Static471.aBoolean564) {
									local586 = -256;
									if (Static263.anInt4785 < 20) {
										local586 = -65536;
									}
									Static281.aClass55_8.method6022("Fps:" + Static263.anInt4785, -1, local270, local586, local275);
									local275 += 15;
									@Pc(610) Runtime local610 = Runtime.getRuntime();
									local620 = (int) ((local610.totalMemory() - local610.freeMemory()) / 1024L);
									local622 = -256;
									if (local620 > 98304) {
										local622 = -65536;
										if (Static141.aBoolean189) {
											Static59.method978();
											for (local633 = 0; local633 < 10; local633++) {
												System.gc();
											}
											local620 = (int) ((local610.totalMemory() - local610.freeMemory()) / 1024L);
											if (local620 > 65536) {
												Static141.method2041("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static281.aClass55_8.method6022("Mem:" + local620 + "k", -1, local270, local622, local275);
									local275 += 15;
									Static281.aClass55_8.method6022("In:" + Static190.anInt3315 + "B/s Out:" + Static427.anInt7396 + "B/s", -1, local270, -256, local275);
									local275 += 15;
									local633 = Static213.aClass133_5.E() / 1024;
									Static281.aClass55_8.method6022("Offheap:" + local633 + "k", -1, local270, local633 > 65536 ? -65536 : -256, local275);
									local275 += 15;
									local727 = 0;
									@Pc(729) int local729 = 0;
									@Pc(731) int local731 = 0;
									for (@Pc(733) int local733 = 0; local733 < 37; local733++) {
										if (Static72.aClass229_Sub1Array1[local733] != null) {
											local727 += Static72.aClass229_Sub1Array1[local733].method5074();
											local729 += Static72.aClass229_Sub1Array1[local733].method5070();
											local731 += Static72.aClass229_Sub1Array1[local733].method5068();
										}
									}
									@Pc(775) int local775 = local731 * 100 / local727;
									@Pc(781) int local781 = local729 * 10000 / local727;
									@Pc(801) String local801 = "Cache:" + Static433.method6630(2, 0, true, (long) local781) + "% (" + local775 + "%)";
									Static602.aClass55_16.method6022(local801, -1, local270, -256, local275);
									local275 += 12;
								}
								if (Static556.anInt9402 > 0) {
									Static602.aClass55_16.method6022("Particles: " + Static566.anInt9571 + " / " + Static556.anInt9402, -1, local270, -256, local275);
								}
								local275 += 12;
								if (Static183.aBoolean229) {
									Static602.aClass55_16.method6022("Polys: " + Static213.aClass133_5.I() + " Models: " + Static213.aClass133_5.M(), -1, local270, -256, local275);
									local275 += 12;
									Static602.aClass55_16.method6022("Ls: " + Static270.anInt4865 + " La: " + Static522.anInt8988 + " NPC: " + Static339.anInt5748 + " Pl: " + Static252.anInt4597, -1, local270, -256, local275);
									local275 += 12;
									Static601.method8614();
								}
								Static264.aBooleanArray16[local67] = true;
								continue;
							}
						}
						if (local24.anInt8001 == 0) {
							if (local24.anInt7960 == Static163.anInt10225 && Static213.aClass133_5.method7319()) {
								Static213.aClass133_5.method7284(local114, local120, local24.anInt7957, local24.anInt7985);
							}
							method7959(local67, local187, local193, arg3, local114 - local24.anInt7988, local120 - local24.anInt7997, local321, arg7, local310, local24.anInt8022);
							if (local24.aClass295Array2 != null) {
								method7959(local67, local187, local193, arg3, local114 - local24.anInt7988, local120 - local24.anInt7997, local321, local24.aClass295Array2, local310, local24.anInt8022);
							}
							@Pc(962) Class5_Sub27 local962 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local24.anInt8022);
							if (local962 != null) {
								Static633.method8960(local120, local114, local67, local187, local310, local962.anInt4270, local321, local193);
							}
							if (Static163.anInt10225 == local24.anInt7960 && Static213.aClass133_5.method7319()) {
								Static213.aClass133_5.method7305();
							}
							Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
						}
						if (Static273.aBooleanArray17[local67] || anInt9219 > 1) {
							if (local24.anInt8001 == 3) {
								if (local135 == 0) {
									if (local24.aBoolean578) {
										Static213.aClass133_5.aa(local114, local120, local24.anInt7957, local24.anInt7985, local24.anInt7983, 0);
									} else {
										Static213.aClass133_5.method7279(local114, local120, local24.anInt7957, local24.anInt7985, local24.anInt7983, 0);
									}
								} else if (local24.aBoolean578) {
									Static213.aClass133_5.aa(local114, local120, local24.anInt7957, local24.anInt7985, 255 - (local135 & 0xFF) << 24 | local24.anInt7983 & 0xFFFFFF, 1);
								} else {
									Static213.aClass133_5.method7279(local114, local120, local24.anInt7957, local24.anInt7985, 255 - (local135 & 0xFF) << 24 | local24.anInt7983 & 0xFFFFFF, 1);
								}
								if (Static428.aBoolean526) {
									if (arg3) {
										Static562.method5062(local48, local62, local55, local43);
									} else {
										Static646.method9057(local43, local48, local55, local62);
									}
								}
							} else if (local24.anInt8001 == 4) {
								@Pc(1114) Class55 local1114 = local24.method6985(Static213.aClass133_5);
								if (local1114 != null) {
									local275 = local24.anInt7983;
									@Pc(1129) String local1129 = local24.aString90;
									if (local24.anInt8010 != -1) {
										@Pc(1140) Class255 local1140 = Static643.aClass275_2.method6641(local24.anInt8010);
										local1129 = local1140.aString73;
										if (local1129 == null) {
											local1129 = "null";
										}
										if ((local1140.anInt6567 == 1 || local24.anInt8036 != 1) && local24.anInt8036 != -1) {
											local1129 = "<col=ff9040>" + local1129 + "</col> x" + Static311.method4808(local24.anInt8036);
										}
									}
									if (local24.anInt8009 != -1) {
										local1129 = Static231.method3867(local24.anInt8009);
										if (local1129 == null) {
											local1129 = "";
										}
									}
									if (local24 == Static69.aClass295_5) {
										local1129 = Static174.aClass120_31.method2690(Static266.anInt4796);
										local275 = local24.anInt7983;
									}
									if (Static531.aBoolean662) {
										Static213.aClass133_5.T(local114, local120, local114 + local24.anInt7957, local120 + local24.anInt7985);
									}
									local1114.method6020(local24.anInt7957, local114, local24.aBoolean575 ? 255 - (local135 & 0xFF) << 24 : -1, local24.anInt7989, null, local24.anInt7981, local24.anInt8016, null, Static562.aClass28Array15, local275 | 255 - (local135 & 0xFF) << 24, 0, local24.anInt7985, local1129, local24.anInt7948, 0, local120);
									if (Static531.aBoolean662) {
										Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
									}
									if (local1129.trim().length() > 0) {
										if (!Static531.aBoolean662) {
											@Pc(1306) Class272 local1306 = Static567.method8236(Static213.aClass133_5, local24.anInt7970);
											local620 = local1306.method6566(local1129, local24.anInt7957, Static562.aClass28Array15);
											local622 = local1306.method6572(local24.anInt7989, Static562.aClass28Array15, local1129, local24.anInt7957);
											if (Static428.aBoolean526) {
												if (arg3) {
													Static562.method5062(local120, local622 + local120, local620 + local114, local114);
												} else {
													Static646.method9057(local114, local120, local620 + local114, local120 + local622);
												}
											}
										} else if (Static428.aBoolean526) {
											if (arg3) {
												Static562.method5062(local48, local62, local55, local43);
											} else {
												Static646.method9057(local43, local48, local55, local62);
											}
										}
									}
								} else if (Static168.aBoolean215) {
									Static465.method6901(local24);
								}
							} else {
								@Pc(1465) int local1465;
								if (local24.anInt8001 == 5) {
									if (local24.anInt8014 >= 0) {
										local24.method6993(Static55.aClass191_1, Static513.aClass260_2).method1361(local120, local114, 0, local24.anInt7957, Static213.aClass133_5, local24.anInt7985, local24.anInt7943 << 3, 0, local24.anInt7967 << 3);
									} else {
										@Pc(1403) Class28 local1403;
										if (local24.anInt8010 != -1) {
											@Pc(1420) Class248 local1420 = local24.aBoolean579 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null;
											local1403 = Static643.aClass275_2.method6644(local24.anInt8006 | 0xFF000000, local24.anInt8032, local24.anInt8010, local1420, local24.anInt8036, Static213.aClass133_5, local24.anInt7958);
										} else if (local24.anInt8009 == -1) {
											local1403 = local24.method6999(Static213.aClass133_5);
										} else {
											local1403 = Static508.method7615(local24.anInt8009, Static213.aClass133_5);
										}
										if (local1403 != null) {
											local275 = local1403.method4035();
											local586 = local1403.method4042();
											local1465 = (local24.anInt7983 == 0 ? 16777215 : local24.anInt7983 & 0xFFFFFF) | 255 - (local135 & 0xFF) << 24;
											if (local24.aBoolean574) {
												Static213.aClass133_5.T(local114, local120, local24.anInt7957 + local114, local120 - -local24.anInt7985);
												if (local24.anInt7953 != 0) {
													local620 = (local24.anInt7957 + local275 - 1) / local275;
													local622 = (local586 + local24.anInt7985 - 1) / local586;
													for (local633 = 0; local633 < local620; local633++) {
														for (local727 = 0; local727 < local622; local727++) {
															if (local24.anInt7983 == 0) {
																local1403.method4033((float) (local114 + local633 * local275) + (float) local275 / 2.0F, (float) local586 / 2.0F + (float) (local120 + local727 * local586), 4096, local24.anInt7953);
															} else {
																local1403.method4048((float) local275 / 2.0F + (float) (local275 * local633 + local114), (float) local586 / 2.0F + (float) (local120 + local586 * local727), 4096, local24.anInt7953, local1465);
															}
														}
													}
												} else if (local24.anInt7983 == 0 && local135 == 0) {
													local1403.method4047(local114, local120, local24.anInt7957, local24.anInt7985);
												} else {
													local1403.method4039(local114, local120, local24.anInt7957, local24.anInt7985, 0, local1465, 1);
												}
												Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
											} else if (local24.anInt7983 == 0 && local135 == 0) {
												if (local24.anInt7953 != 0) {
													local1403.method4033((float) local114 + (float) local24.anInt7957 / 2.0F, (float) local24.anInt7985 / 2.0F + (float) local120, local24.anInt7957 * 4096 / local275, local24.anInt7953);
												} else if (local24.anInt7957 == local275 && local24.anInt7985 == local586) {
													local1403.method4040(local114, local120);
												} else {
													local1403.method4046(local114, local120, local24.anInt7957, local24.anInt7985);
												}
											} else if (local24.anInt7953 != 0) {
												local1403.method4048((float) local114 + (float) local24.anInt7957 / 2.0F, (float) local24.anInt7985 / 2.0F + (float) local120, local24.anInt7957 * 4096 / local275, local24.anInt7953, local1465);
											} else if (local275 == local24.anInt7957 && local24.anInt7985 == local586) {
												local1403.method4034(local114, local120, 0, local1465, 1);
											} else {
												local1403.method4051(local114, local120, local24.anInt7957, local24.anInt7985, 0, local1465, 1);
											}
										} else if (Static168.aBoolean215) {
											Static465.method6901(local24);
										}
									}
									if (Static428.aBoolean526) {
										if (arg3) {
											Static562.method5062(local48, local62, local55, local43);
										} else {
											Static646.method9057(local43, local48, local55, local62);
										}
									}
								} else if (local24.anInt8001 == 6) {
									Static180.method2781();
									@Pc(1799) Class187 local1799 = null;
									local275 = 0;
									@Pc(1906) Class362 local1906;
									@Pc(1916) Class248 local1916;
									if (local24.anInt8010 != -1) {
										@Pc(2014) Class255 local2014 = Static643.aClass275_2.method6641(local24.anInt8010);
										if (local2014 != null) {
											local2014 = local2014.method5856(local24.anInt8036);
											local1906 = local24.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(local24.anInt7992);
											local1916 = local24.aBoolean579 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null;
											local1799 = local2014.method5852(2048, local1906, local1916, 1, local24.anInt7964, Static213.aClass133_5, local24.anInt7975, local24.anInt7966);
											if (local1799 == null) {
												Static465.method6901(local24);
											} else {
												local275 = -local1799.fa() >> 1;
											}
										}
									} else if (local24.anInt7969 == 5) {
										local586 = local24.anInt7982;
										if (local586 >= 0 && local586 < 2048) {
											@Pc(1954) Class4_Sub2_Sub1_Sub1_Sub1 local1954 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local586];
											@Pc(1967) Class362 local1967 = local24.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(local24.anInt7992);
											if (local1954 != null && (local586 == Static337.anInt5722 || Static108.method1679(local1954.aString17) == local24.anInt8034)) {
												local1799 = local1954.aClass248_1.method5538(null, Static213.aClass133_5, Static387.aClass252_2, 0, Static301.aClass59_1, 2048, -1, Static439.aClass92_2, local24.anInt7966, null, 0, Static435.aClass298_1, Static643.aClass275_2, 0, null, local1967, local24.anInt7975, local24.anInt7964, Static147.aClass238_1);
											}
										}
									} else if (local24.anInt7969 == 8 || local24.anInt7969 == 9) {
										@Pc(1893) Class5_Sub38 local1893 = Static478.method7058(local24.anInt7982, false);
										local1906 = local24.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(local24.anInt7992);
										if (local1893 != null) {
											local1916 = local24.aBoolean579 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null;
											local1799 = local1893.method5820(local24.anInt7975, local1916, local24.anInt8034, local24.anInt7966, local24.anInt7964, local24.anInt7969 == 9, local1906, Static213.aClass133_5);
										}
									} else if (local24.anInt7992 == -1) {
										local1799 = local24.method6988(0, -1, Static147.aClass238_1, Static301.aClass59_1, Static435.aClass298_1, Static643.aClass275_2, 2048, Static387.aClass252_2, Static439.aClass92_2, Static213.aClass133_5, null, -1, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1);
										if (local1799 == null && Static168.aBoolean215) {
											Static465.method6901(local24);
										}
									} else {
										@Pc(1832) Class362 local1832 = Static435.aClass298_1.method7034(local24.anInt7992);
										local1799 = local24.method6988(local24.anInt7975, local24.anInt7966, Static147.aClass238_1, Static301.aClass59_1, Static435.aClass298_1, Static643.aClass275_2, 2048, Static387.aClass252_2, Static439.aClass92_2, Static213.aClass133_5, local1832, local24.anInt7964, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1);
										if (local1799 == null && Static168.aBoolean215) {
											Static465.method6901(local24);
										}
									}
									if (local1799 != null) {
										if (local24.anInt8008 <= 0) {
											local586 = 512;
										} else {
											local586 = (local24.anInt7957 << 9) / local24.anInt8008;
										}
										if (local24.anInt8028 <= 0) {
											local1465 = 512;
										} else {
											local1465 = (local24.anInt7985 << 9) / local24.anInt8028;
										}
										local620 = local24.anInt7957 / 2 + local114;
										local622 = local120 + local24.anInt7985 / 2;
										if (!local24.aBoolean573) {
											local622 += local24.anInt7993 * local1465 >> 9;
											local620 += local24.anInt8012 * local586 >> 9;
										}
										Static16.aClass113_2.method8460();
										Static213.aClass133_5.method7269(Static16.aClass113_2);
										Static213.aClass133_5.DA(local620, local622, local586, local1465);
										Static213.aClass133_5.ya();
										if (local24.aBoolean565) {
											Static213.aClass133_5.C(false);
										}
										if (local24.aBoolean573) {
											Static318.aClass113_4.method8457(local24.anInt7999);
											Static318.aClass113_4.method8461(local24.anInt8037);
											Static318.aClass113_4.method8450(local24.anInt7976);
											Static318.aClass113_4.method8454(local24.anInt8012, local24.anInt7993, local24.anInt8019);
										} else {
											local633 = (local24.anInt7971 << 2) * Class377.anIntArray600[local24.anInt7999 << 3] >> 14;
											local727 = Class377.anIntArray601[local24.anInt7999 << 3] * (local24.anInt7971 << 2) >> 14;
											Static318.aClass113_4.method8453(-local24.anInt7976 << 3);
											Static318.aClass113_4.method8461(local24.anInt8037 << 3);
											Static318.aClass113_4.method8454(local24.anInt7965 << 2, (local24.anInt7955 << 2) + local633 + local275, local727 - -(local24.anInt7955 << 2));
											Static318.aClass113_4.method8455(local24.anInt7999 << 3);
										}
										local24.method6987(Static318.aClass113_4, Static213.aClass133_5, Static631.anInt10493, local1799);
										if (Static531.aBoolean662) {
											Static213.aClass133_5.T(local114, local120, local114 + local24.anInt7957, local24.anInt7985 + local120);
										}
										if (local24.aBoolean573) {
											if (local24.aBoolean571) {
												local1799.method8654(Static318.aClass113_4, null, local24.anInt7971, 1);
											} else {
												local1799.method8645(Static318.aClass113_4, null, 1);
												if (local24.aClass4_Sub4_7 != null) {
													Static213.aClass133_5.method7308(local24.aClass4_Sub4_7.method1951());
												}
											}
										} else if (local24.aBoolean571) {
											local1799.method8654(Static318.aClass113_4, null, local24.anInt7971 << 2, 1);
										} else {
											local1799.method8645(Static318.aClass113_4, null, 1);
											if (local24.aClass4_Sub4_7 != null) {
												Static213.aClass133_5.method7308(local24.aClass4_Sub4_7.method1951());
											}
										}
										if (Static531.aBoolean662) {
											Static213.aClass133_5.KA(arg1, arg2, arg6, arg8);
										}
										if (local24.aBoolean565) {
											Static213.aClass133_5.C(true);
										}
									}
									if (Static428.aBoolean526) {
										if (arg3) {
											Static562.method5062(local48, local62, local55, local43);
										} else {
											Static646.method9057(local43, local48, local55, local62);
										}
									}
								} else if (local24.anInt8001 == 9) {
									if (local24.aBoolean576) {
										local275 = local120 + local24.anInt7985;
										local586 = local114 + local24.anInt7957;
										local1465 = local120;
									} else {
										local275 = local120;
										local586 = local24.anInt7957 + local114;
										local1465 = local24.anInt7985 + local120;
									}
									if (local24.anInt7994 == 1) {
										Static213.aClass133_5.method7304(local114, local275, local586, local1465, local24.anInt7983, 0);
									} else {
										Static213.aClass133_5.method7272(local114, local275, local586, local1465, local24.anInt7983, local24.anInt7994);
									}
									if (Static428.aBoolean526) {
										if (arg3) {
											Static562.method5062(local48, local62, local55, local43);
										} else {
											Static646.method9057(local43, local48, local55, local62);
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
