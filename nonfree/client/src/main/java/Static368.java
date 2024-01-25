import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!b;")
	public static Class20 aClass20_95;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public static int anInt6172 = 0;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public static int anInt6173 = 64;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method5519() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static393.anInt6478 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method5521() {
		Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
		Static359.aClass234_123 = null;
		Static139.anInt2636 = 0;
		Static222.aClass234_79 = null;
		Static12.aClass234_6 = null;
		Static152.anInt2774 = 0;
		Static203.anInt3616 = 0;
		Static296.aClass234_104 = null;
		Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
		Static27.method329();
		Static354.method5307();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static308.aClass28_Sub1_Sub1_Sub2Array1[local31] = null;
		}
		Static226.aClass28_Sub1_Sub1_Sub2_2 = null;
		for (@Pc(45) int local45 = 0; local45 < Static166.aClass28_Sub1_Sub1_Sub1Array41.length; local45++) {
			@Pc(51) Class28_Sub1_Sub1_Sub1 local51 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local45];
			if (local51 != null) {
				local51.anInt4347 = -1;
			}
		}
		Static239.method5189();
		Static88.anInt1815 = 1;
		Static310.method4763(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static109.aBooleanArray45[local74] = true;
		}
		Static273.method4274();
		Static369.aLong219 = 0L;
		Static127.aClass3_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static278.aByteArrayArray17 == null ? 0 : (Static278.aByteArrayArray17[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII[Lclient!dt;III)V")
	public static void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class62[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(19) Class62 local19 = arg5[local13];
			if (local19 != null && (arg0 == local19.anInt1506 || arg0 == -1412584499 && Static313.aClass62_18 == local19)) {
				@Pc(38) int local38;
				if (arg1 == -1) {
					Class3_Sub1_Sub15.aRectangleArray4[Static298.anInt5150].setBounds(local19.anInt1523 + arg3, arg7 + local19.anInt1559, local19.anInt1546, local19.anInt1551);
					local38 = Static298.anInt5150++;
				} else {
					local38 = arg1;
				}
				local19.anInt1528 = local38;
				local19.anInt1522 = Static76.anInt1617;
				if (!Static48.method918(local19)) {
					if (local19.anInt1572 != 0) {
						Static17.method207(local19);
					}
					@Pc(82) int local82 = arg3 + local19.anInt1523;
					@Pc(87) int local87 = arg7 + local19.anInt1559;
					@Pc(90) int local90 = local19.anInt1495;
					if (Static75.aBoolean129 && (Static48.method915(local19).anInt6291 != 0 || local19.anInt1575 == 0) && local90 > 127) {
						local90 = 127;
					}
					@Pc(145) int local145;
					@Pc(151) int local151;
					if (local19 == Static313.aClass62_18) {
						if (arg0 != -1412584499 && (Static247.anInt4441 == local19.anInt1534 || Static364.anInt6112 == local19.anInt1534)) {
							Static201.aClass62Array2 = arg5;
							Static365.anInt6146 = arg7;
							Static384.anInt6418 = arg3;
							continue;
						}
						if (Static314.aBoolean421 && Static206.aBoolean264) {
							local145 = Static200.aClass10_1.method5242();
							local151 = Static200.aClass10_1.method5240();
							local145 -= Static320.anInt5451;
							local151 -= Static48.anInt1064;
							if (Static294.anInt5084 > local145) {
								local145 = Static294.anInt5084;
							}
							if (Static294.anInt5084 + Static363.aClass62_19.anInt1546 < local19.anInt1546 + local145) {
								local145 = Static363.aClass62_19.anInt1546 + Static294.anInt5084 - local19.anInt1546;
							}
							if (local151 < Static234.anInt4190) {
								local151 = Static234.anInt4190;
							}
							if (local19.anInt1551 + local151 > Static363.aClass62_19.anInt1551 + Static234.anInt4190) {
								local151 = Static234.anInt4190 + Static363.aClass62_19.anInt1551 - local19.anInt1551;
							}
							local82 = local145;
							local87 = local151;
						}
						if (local19.anInt1534 == Static364.anInt6112) {
							local90 = 128;
						}
					}
					@Pc(277) int local277;
					@Pc(288) int local288;
					@Pc(234) int local234;
					@Pc(240) int local240;
					if (local19.anInt1575 == 2) {
						local288 = arg8;
						local151 = arg2;
						local277 = arg4;
						local145 = arg6;
					} else {
						local234 = local19.anInt1546 + local82;
						local240 = local87 + local19.anInt1551;
						local145 = local82 <= arg6 ? arg6 : local82;
						local151 = arg2 < local87 ? local87 : arg2;
						if (local19.anInt1575 == 9) {
							local234++;
							local240++;
						}
						local277 = local234 >= arg4 ? arg4 : local234;
						local288 = local240 < arg8 ? local240 : arg8;
					}
					if (local145 < local277 && local151 < local288) {
						@Pc(560) int local560;
						@Pc(586) int local586;
						@Pc(588) int local588;
						@Pc(506) int local506;
						@Pc(508) int local508;
						if (local19.anInt1572 != 0) {
							if (Static109.anInt2148 == local19.anInt1572 || local19.anInt1572 == Static366.anInt4868) {
								Static199.method3130(local87, local82, local19.anInt1572 == Static366.anInt4868, local19.anInt1551, local19.anInt1546);
								Static109.aBooleanArray45[local38] = true;
								Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
								continue;
							}
							if (local19.anInt1572 == Static2.anInt67) {
								if (local19.method1292(Static347.aClass155_9) != null) {
									Static381.method5665();
									Static348.method4045(local87, local82, Static347.aClass155_9, local19);
									Static160.aBooleanArray129[local38] = true;
									Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
								}
								continue;
							}
							if (local19.anInt1572 == Static391.anInt2192) {
								if (local19.method1292(Static347.aClass155_9) != null) {
									Static250.method4654(local82, local87, local19);
									Static160.aBooleanArray129[local38] = true;
									Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
								}
								continue;
							}
							if (local19.anInt1572 == Static344.anInt5803) {
								Static147.method2300(Static12.anInterface10_1, Static347.aClass155_9, local19.anInt1551, local87, local82, local19.anInt1546);
								Static109.aBooleanArray45[local38] = true;
								Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
								continue;
							}
							if (Static142.anInt2708 == local19.anInt1572) {
								Static365.method5443(local87, local19.anInt1546, local82, local19.anInt1551, Static347.aClass155_9);
								Static109.aBooleanArray45[local38] = true;
								Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
								continue;
							}
							if (Static311.anInt5382 == local19.anInt1572) {
								if (!Static383.aBoolean500 && !Static169.aBoolean232) {
									continue;
								}
								local234 = local82 + local19.anInt1546;
								local240 = local87 + 15;
								if (Static383.aBoolean500) {
									Static140.aClass150_3.method5725(local234, local240, -256, "Fps:" + Static296.anInt5115);
									local240 += 15;
									@Pc(496) Runtime local496 = Runtime.getRuntime();
									local506 = (int) ((local496.totalMemory() - local496.freeMemory()) / 1024L);
									local508 = -256;
									if (local506 > 65536) {
										local508 = -65536;
									}
									Static140.aClass150_3.method5725(local234, local240, local508, "Mem:" + local506 + "k");
									local240 += 15;
									Static140.aClass150_3.method5725(local234, local240, -256, "In:" + Static216.anInt6070 + "B/s Out:" + Static225.anInt3986 + "B/s");
									local240 += 15;
									local560 = Static347.aClass155_9.method4906() / 1024;
									Static140.aClass150_3.method5725(local234, local240, local560 > 65536 ? -65536 : -256, "Offheap:" + local560 + "k");
									local240 += 15;
									local586 = 0;
									local588 = 0;
									@Pc(590) int local590 = 0;
									for (@Pc(592) int local592 = 0; local592 < 29; local592++) {
										local586 += Static95.aClass135_Sub1Array4[local592].method2995();
										local588 += Static95.aClass135_Sub1Array4[local592].method2994();
										local590 += Static95.aClass135_Sub1Array4[local592].method2986();
									}
									@Pc(630) int local630 = local590 * 100 / local586;
									@Pc(636) int local636 = local588 * 10000 / local586;
									@Pc(656) String local656 = "Cache:" + Static146.method2297((long) local636, 2, 0, true) + "% (" + local630 + "%)";
									Static71.aClass150_1.method5725(local234, local240, -256, local656);
									local240 += 12;
								}
								if (Static203.anInt3620 > 0) {
									Static71.aClass150_1.method5725(local234, local240, -256, "Particles: " + Static43.anInt779 + " / " + Static203.anInt3620);
								}
								local240 += 12;
								if (Static169.aBoolean232) {
									Static71.aClass150_1.method5725(local234, local240, -256, "Polys: " + Static347.aClass155_9.method4870() + " Models: " + Static347.aClass155_9.method4876());
									local240 += 12;
									Static71.aClass150_1.method5725(local234, local240, -256, "Ls: " + Static210.anInt3710 + " La: " + Static365.anInt6147 + " NPC: " + Static34.anInt590 + " Pl: " + Static383.anInt6416);
									Static166.method5549();
									local240 += 12;
								}
								Static109.aBooleanArray45[local38] = true;
								continue;
							}
						}
						if (local19.anInt1575 == 0) {
							if (Static161.anInt2837 == local19.anInt1572 && Static347.aClass155_9.method4898()) {
								Static347.aClass155_9.method4944(local82, local87, local19.anInt1546, local19.anInt1551);
							}
							method5523(local19.anInt1500, local38, local151, local82 - local19.anInt1574, local277, arg5, local145, local87 - local19.anInt1504, local288);
							if (local19.aClass62Array1 != null) {
								method5523(local19.anInt1500, local38, local151, local82 - local19.anInt1574, local277, local19.aClass62Array1, local145, local87 - local19.anInt1504, local288);
							}
							@Pc(821) Class3_Sub22 local821 = (Class3_Sub22) Static29.aClass44_26.method942((long) local19.anInt1500);
							if (local821 != null) {
								Static75.method1308(local82, local87, local145, local38, local277, local151, local821.anInt3029, local288);
							}
							if (local19.anInt1572 == Static161.anInt2837 && Static347.aClass155_9.method4898()) {
								Static347.aClass155_9.method4884();
								Static301.aBoolean408 = true;
							}
							Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
						}
						if (Static245.aBooleanArray106[local38] || Static247.anInt4443 > 1) {
							if (local19.anInt1575 == 3) {
								if (local90 == 0) {
									if (local19.aBoolean111) {
										Static347.aClass155_9.method4896(local82, local87, local19.anInt1546, local19.anInt1551, local19.anInt1542, 0);
									} else {
										Static347.aClass155_9.method4855(local82, local87, local19.anInt1546, local19.anInt1551, local19.anInt1542, 0);
									}
								} else if (local19.aBoolean111) {
									Static347.aClass155_9.method4896(local82, local87, local19.anInt1546, local19.anInt1551, local19.anInt1542 & 0xFFFFFF | 255 - (local90 & 0xFF) << 24, 1);
								} else {
									Static347.aClass155_9.method4855(local82, local87, local19.anInt1546, local19.anInt1551, local19.anInt1542 & 0xFFFFFF | 255 - (local90 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt1575 == 4) {
								@Pc(956) Class150 local956 = local19.method1291(Static347.aClass155_9);
								if (local956 != null) {
									local240 = local19.anInt1542;
									@Pc(971) String local971 = local19.aString21;
									if (local19.anInt1549 != -1) {
										@Pc(982) Class51 local982 = Static176.aClass78_3.method1641(local19.anInt1549);
										local971 = local982.aString13;
										if (local971 == null) {
											local971 = "null";
										}
										if ((local982.anInt1175 == 1 || local19.anInt1507 != 1) && local19.anInt1507 != -1) {
											local971 = "<col=ff9040>" + local971 + "</col> x" + Static178.method2810(local19.anInt1507);
										}
									}
									if (local19 == Static53.aClass62_2) {
										local971 = Static279.aClass57_89.method1122(Static66.anInt1307);
										local240 = local19.anInt1542;
									}
									if (Static363.aBoolean484) {
										Static347.aClass155_9.method4922(local82, local87, local19.anInt1546 + local82, local87 + local19.anInt1551);
									}
									local956.method5730(local87, null, local19.anInt1536, local19.anInt1509, local19.anInt1533, local19.aBoolean113 ? 255 - (local90 & 0xFF) << 24 : -1, 0, 255 - (local90 & 0xFF) << 24 | local240, null, local19.anInt1551, local82, local19.anInt1546, local971, 0, Static110.aClass110Array4);
									if (Static363.aBoolean484) {
										Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
									}
								} else if (Static156.aBoolean213) {
									Static158.method2441(local19);
								}
							} else {
								@Pc(1150) int local1150;
								if (local19.anInt1575 == 5) {
									if (local19.anInt1505 < 0) {
										@Pc(1114) Class110 local1114;
										if (local19.anInt1549 == -1) {
											local1114 = local19.method1289(Static347.aClass155_9);
										} else {
											@Pc(1124) Class49 local1124 = local19.aBoolean117 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null;
											local1114 = Static176.aClass78_3.method1646(Static347.aClass155_9, local19.anInt1507, local19.anInt1511, local1124, local19.anInt1508, local19.anInt1577 | 0xFF000000, local19.anInt1549);
										}
										if (local1114 != null) {
											local240 = local1114.method5101();
											local1150 = local1114.method5097();
											if (local19.aBoolean121) {
												Static347.aClass155_9.method4922(local82, local87, local19.anInt1546 + local82, local19.anInt1551 + local87);
												if (local19.anInt1530 != 0) {
													local506 = (local19.anInt1546 + local240 - 1) / local240;
													local508 = (local1150 + local19.anInt1551 - 1) / local1150;
													for (local560 = 0; local560 < local506; local560++) {
														for (local586 = 0; local586 < local508; local586++) {
															local1114.method5092((float) (local82 + local240 * local560) + (float) local240 / 2.0F, (float) (local87 + local586 * local1150) + (float) local1150 / 2.0F, 4096, local19.anInt1530);
														}
													}
												} else if (local90 == 0) {
													local1114.method5093(local82, local87, local19.anInt1546, local19.anInt1551, 0, 0);
												} else {
													local1114.method5093(local82, local87, local19.anInt1546, local19.anInt1551, 1, 255 - (local90 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
											} else if (local90 != 0) {
												local506 = 255 - (local90 & 0xFF) << 24 | 0xFFFFFF;
												if (local19.anInt1530 != 0) {
													local1114.method5100((float) local19.anInt1546 / 2.0F + (float) local82, (float) local87 + (float) local19.anInt1551 / 2.0F, local19.anInt1546 * 4096 / local240, local19.anInt1530, local506);
												} else if (local240 == local19.anInt1546 && local1150 == local19.anInt1551) {
													local1114.method5085(local82, local87, 1, local506);
												} else {
													local1114.method5103(local82, local87, local19.anInt1546, local19.anInt1551, 1, local506, 1);
												}
											} else if (local19.anInt1530 != 0) {
												local1114.method5092((float) local19.anInt1546 / 2.0F + (float) local82, (float) local87 + (float) local19.anInt1551 / 2.0F, local19.anInt1546 * 4096 / local240, local19.anInt1530);
											} else if (local19.anInt1546 == local240 && local19.anInt1551 == local1150) {
												local1114.method5094(local82, local87);
											} else {
												local1114.method5102(local82, local87, local19.anInt1546, local19.anInt1551);
											}
										} else if (Static156.aBoolean213) {
											Static158.method2441(local19);
										}
									} else {
										local19.method1290(Static253.aClass218_1, Static66.aClass182_1).method2069(local19.anInt1516 << 3, local19.anInt1551, Static347.aClass155_9, local82, local87, 0, local19.anInt1546, local19.anInt1564 << 3, 0);
									}
								} else if (local19.anInt1575 == 6) {
									Static79.method1316();
									@Pc(1462) Class75 local1462 = null;
									local240 = 0;
									@Pc(1496) Class177 local1496;
									@Pc(1504) Class49 local1504;
									if (local19.anInt1549 != -1) {
										@Pc(1475) Class51 local1475 = Static176.aClass78_3.method1641(local19.anInt1549);
										if (local1475 != null) {
											local1475 = local1475.method1028(local19.anInt1507);
											local1496 = local19.anInt1520 == -1 ? null : Static176.aClass43_2.method930(local19.anInt1520);
											local1504 = local19.aBoolean117 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null;
											local1462 = local1475.method1015(local1504, local19.anInt1547, 1, local19.anInt1566, Static347.aClass155_9, 1024, local1496, local19.anInt1535);
											if (local1462 == null) {
												Static158.method2441(local19);
											} else {
												local240 = -local1462.method5476() / 2;
											}
										}
									} else if (local19.anInt1571 == 5) {
										local1150 = local19.anInt1515;
										if (local1150 >= 0 && local1150 < 2048) {
											@Pc(1553) Class28_Sub1_Sub1_Sub2 local1553 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local1150];
											@Pc(1565) Class177 local1565 = local19.anInt1520 == -1 ? null : Static176.aClass43_2.method930(local19.anInt1520);
											if (local1553 != null && (local1150 == Static376.anInt6265 || Static276.method4311(local1553.aString51) == local19.anInt1548)) {
												local1462 = local1553.aClass49_1.method998(local19.anInt1535, -1, Static79.aClass124_1, local19.anInt1566, null, Static331.aClass115_1, 0, Static102.aClass223_1, null, Static176.aClass78_3, Static90.aClass83_2, local1565, 1024, 0, Static347.aClass155_9, local19.anInt1547, Static176.aClass43_2);
											}
										}
									} else if (local19.anInt1571 == 8 || local19.anInt1571 == 9) {
										@Pc(1689) Class3_Sub18 local1689 = Static214.method3324(local19.anInt1515, false);
										local1496 = local19.anInt1520 == -1 ? null : Static176.aClass43_2.method930(local19.anInt1520);
										if (local1689 != null) {
											local1504 = local19.aBoolean117 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null;
											local1462 = local1689.method1918(Static347.aClass155_9, local19.anInt1548, local19.anInt1547, local1504, local19.anInt1535, local1496, local19.anInt1566, local19.anInt1571 == 9);
										}
									} else if (local19.anInt1520 == -1) {
										local1462 = local19.method1282(Static79.aClass124_1, 0, 1024, Static102.aClass223_1, null, Static90.aClass83_2, Static176.aClass43_2, Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1, -1, Static347.aClass155_9, Static176.aClass78_3, Static331.aClass115_1, -1);
										if (local1462 == null && Static156.aBoolean213) {
											Static158.method2441(local19);
										}
									} else {
										@Pc(1628) Class177 local1628 = Static176.aClass43_2.method930(local19.anInt1520);
										local1462 = local19.method1282(Static79.aClass124_1, local19.anInt1535, 1024, Static102.aClass223_1, local1628, Static90.aClass83_2, Static176.aClass43_2, Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1, local19.anInt1566, Static347.aClass155_9, Static176.aClass78_3, Static331.aClass115_1, local19.anInt1547);
										if (local1462 == null && Static156.aBoolean213) {
											Static158.method2441(local19);
										}
									}
									if (local1462 != null) {
										if (local19.anInt1531 > 0) {
											local1150 = (local19.anInt1546 << 9) / local19.anInt1531;
										} else {
											local1150 = 512;
										}
										if (local19.anInt1569 <= 0) {
											local506 = 512;
										} else {
											local506 = (local19.anInt1551 << 9) / local19.anInt1569;
										}
										local508 = (local19.anInt1556 * local1150 >> 9) + local82 + local19.anInt1546 / 2;
										local560 = local87 + local19.anInt1551 / 2 + (local506 * local19.anInt1563 >> 9);
										Static19.aClass118_1.method2665();
										Static347.aClass155_9.method4904(Static19.aClass118_1);
										local586 = Class226.anIntArray614[local19.anInt1567 << 3] * local19.anInt1550 >> 15;
										local588 = Class226.anIntArray613[local19.anInt1567 << 3] * local19.anInt1550 >> 15;
										Static347.aClass155_9.method4880(local508, local560, local1150, local506);
										Static347.aClass155_9.method4856((float) local19.aShort23, local19.aBoolean120 ? (float) local19.aShort22 : (float) local19.aShort22 * 1.5F);
										if (arg0 == -1412584499 || Static301.aBoolean408) {
											Static347.aClass155_9.method4902();
											Static347.aClass155_9.method4877();
											Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
											Static301.aBoolean408 = false;
										}
										if (local19.aBoolean112) {
											Static347.aClass155_9.method4923(false);
										}
										Static259.aClass118_4.method2669(-local19.anInt1513 << 3);
										Static259.aClass118_4.method2670(local19.anInt1538 << 3);
										Static259.aClass118_4.method2658(local19.anInt1553, local19.anInt1527 + local240 + local586, local19.anInt1527 + local588);
										Static259.aClass118_4.method2666(local19.anInt1567 << 3);
										if (Static363.aBoolean484) {
											Static347.aClass155_9.method4922(local82, local87, local19.anInt1546 + local82, local87 - -local19.anInt1551);
										}
										if (local19.aBoolean120) {
											local1462.method5456(Static259.aClass118_4, null, local19.anInt1550);
										} else {
											local1462.method5469(Static259.aClass118_4, null, 1);
										}
										if (Static363.aBoolean484) {
											Static347.aClass155_9.method4867(arg6, arg2, arg4, arg8);
										}
										if (local19.aBoolean112) {
											Static347.aClass155_9.method4923(true);
										}
									}
								} else if (local19.anInt1575 == 9) {
									if (local19.aBoolean124) {
										local506 = local87;
										local1150 = local82 + local19.anInt1546;
										local240 = local87 + local19.anInt1551;
									} else {
										local506 = local87 + local19.anInt1551;
										local1150 = local19.anInt1546 + local82;
										local240 = local87;
									}
									if (local19.anInt1498 == 1) {
										Static347.aClass155_9.method4911(local82, local240, local1150, local506, local19.anInt1542, 0);
									} else {
										Static347.aClass155_9.method4936(local82, local240, local1150, local506, local19.anInt1542, local19.anInt1498);
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
