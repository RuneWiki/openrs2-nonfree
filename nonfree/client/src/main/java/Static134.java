import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array71;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	public static int anInt2950;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1756 = Static106.method1849("slide:");

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1757 = Static106.method1849("green:");

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1763 = Static106.method1849(" from your friend list first)3");

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1758 = aClass66_1763;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1759 = Static106.method1849("null");

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1760 = Static106.method1849("<col=ffffff>");

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "[I")
	public static int[] anIntArray503 = new int[5];

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1761 = aClass66_1756;

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	public static int anInt2955 = 0;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1762 = aClass66_1756;

	@OriginalMember(owner = "client!wf", name = "W", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1764 = Static106.method1849("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
	public static volatile int anInt2956 = 0;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1765 = aClass66_1757;

	@OriginalMember(owner = "client!wf", name = "Z", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1766 = aClass66_1757;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIIII[Lclient!he;II)V")
	public static void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub10[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static115.method1659(arg7, arg0, arg4, arg2);
		Static91.method1689();
		for (@Pc(18) int local18 = 0; local18 < arg6.length; local18++) {
			@Pc(24) Class1_Sub10 local24 = arg6[local18];
			if (local24 != null && (local24.anInt1375 == arg3 || arg3 == -1412584499 && Static35.aClass1_Sub10_6 == local24)) {
				@Pc(48) int local48;
				if (arg5 == -1) {
					Static27.anIntArray103[Static94.anInt2420] = local24.anInt1344 + arg1;
					Static99.anIntArray180[Static94.anInt2420] = local24.anInt1388 + arg8;
					Static2.anIntArray16[Static94.anInt2420] = local24.anInt1367;
					Static13.anIntArray76[Static94.anInt2420] = local24.anInt1345;
					local48 = Static94.anInt2420++;
				} else {
					local48 = arg5;
				}
				local24.anInt1352 = Static22.anInt636;
				local24.anInt1387 = local48;
				if (!local24.aBoolean54 || !Static35.method639(local24)) {
					if (local24.anInt1329 > 0) {
						Static49.method1058(local24);
					}
					@Pc(102) int local102 = local24.anInt1350;
					@Pc(107) int local107 = local24.anInt1388 + arg8;
					@Pc(112) int local112 = arg1 + local24.anInt1344;
					@Pc(137) int local137;
					@Pc(139) int local139;
					if (Static35.aClass1_Sub10_6 == local24) {
						if (arg3 != -1412584499 && !local24.aBoolean57) {
							Static25.aClass1_Sub10Array1 = arg6;
							Static95.anInt2444 = arg8;
							Static34.anInt102 = arg1;
							continue;
						}
						if (Static19.aBoolean28 && Static4.aBoolean9) {
							local137 = Static50.anInt1542;
							local139 = Static13.anInt462;
							local139 -= Static19.anInt607;
							if (local139 < Static38.anInt2852) {
								local139 = Static38.anInt2852;
							}
							local137 -= Static120.anInt2784;
							if (Static29.aClass1_Sub10_5.anInt1345 + Static38.anInt2852 < local139 - -local24.anInt1345) {
								local139 = Static29.aClass1_Sub10_5.anInt1345 + Static38.anInt2852 - local24.anInt1345;
							}
							if (Static114.anInt2711 > local137) {
								local137 = Static114.anInt2711;
							}
							if (local24.anInt1367 + local137 > Static29.aClass1_Sub10_5.anInt1367 + Static114.anInt2711) {
								local137 = Static29.aClass1_Sub10_5.anInt1367 + Static114.anInt2711 - local24.anInt1367;
							}
							local107 = local139;
							local112 = local137;
						}
						if (!local24.aBoolean57) {
							local102 = 128;
						}
					}
					@Pc(213) int local213;
					@Pc(219) int local219;
					@Pc(245) int local245;
					@Pc(240) int local240;
					@Pc(287) int local287;
					@Pc(315) int local315;
					if (local24.anInt1359 == 2) {
						local213 = arg4;
						local139 = arg0;
						local137 = arg7;
						local219 = arg2;
					} else if (local24.anInt1359 == 9) {
						local245 = local112;
						local287 = local24.anInt1367 + local112;
						local240 = local107;
						if (local287 < local112) {
							local245 = local287;
							local287 = local112;
						}
						local287++;
						local213 = arg4 > local287 ? local287 : arg4;
						local315 = local107 + local24.anInt1345;
						if (local315 < local107) {
							local240 = local315;
							local315 = local107;
						}
						local139 = arg0 < local240 ? local240 : arg0;
						local137 = arg7 < local245 ? local245 : arg7;
						local315++;
						local219 = arg2 > local315 ? local315 : arg2;
					} else {
						local139 = local107 > arg0 ? local107 : arg0;
						local240 = local107 + local24.anInt1345;
						local245 = local24.anInt1367 + local112;
						local219 = local240 >= arg2 ? arg2 : local240;
						local213 = local245 >= arg4 ? arg4 : local245;
						local137 = arg7 >= local112 ? arg7 : local112;
					}
					if (!local24.aBoolean54 || local137 < local213 && local139 < local219) {
						if (local24.anInt1329 != 0) {
							if (local24.anInt1329 == 1337) {
								Static96.anInt2457 = local112;
								Static60.anInt1848 = local107;
								Static124.method2010(local112, local24.anInt1345, local107, local24.anInt1367);
								Static115.method1659(arg7, arg0, arg4, arg2);
								continue;
							}
							if (local24.anInt1329 == 1338) {
								Static74.method1423(local107, local112, local48);
								Static115.method1659(arg7, arg0, arg4, arg2);
								continue;
							}
						}
						local245 = Static50.anInt1542;
						local240 = Static13.anInt462;
						if (!Static112.aBoolean113 && local137 <= local245 && local240 >= local139 && local245 < local213 && local219 > local240) {
							Static4.method139(local24, local245 - local112, local240 + -local107);
						}
						if (local24.anInt1359 == 0) {
							if (!local24.aBoolean54 && Static35.method639(local24) && Static51.aClass1_Sub10_9 != local24) {
								continue;
							}
							if (!local24.aBoolean54) {
								if (local24.anInt1354 - local24.anInt1345 < local24.anInt1396) {
									local24.anInt1396 = local24.anInt1354 - local24.anInt1345;
								}
								if (local24.anInt1396 < 0) {
									local24.anInt1396 = 0;
								}
							}
							method2053(local139, local112 - local24.anInt1369, local219, local24.anInt1348, local213, local48, arg6, local137, local107 - local24.anInt1396);
							if (local24.aClass1_Sub10Array2 != null) {
								method2053(local139, local112 - local24.anInt1369, local219, local24.anInt1348, local213, local48, local24.aClass1_Sub10Array2, local137, local107 - local24.anInt1396);
							}
							@Pc(543) Class1_Sub22 local543 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local24.anInt1348);
							if (local543 != null) {
								if (local543.anInt2782 == 0 && local137 <= Static50.anInt1542 && Static13.anInt462 >= local139 && local213 > Static50.anInt1542 && local219 > Static13.anInt462 && !Static112.aBoolean113 && !Static3.aBoolean2) {
									Static98.anIntArray419[0] = 1007;
									Static97.aClass66Array21[0] = Static102.aClass66_1421;
									Static84.aClass66Array18[0] = Static13.aClass66_284;
									Static5.anInt228 = 1;
								}
								Static47.method1049(local543.anInt2781, local107, local139, local219, local137, local112, local48, local213);
							}
							Static115.method1659(arg7, arg0, arg4, arg2);
							Static91.method1689();
						}
						if (Static9.aBooleanArray3[local48] || Static71.anInt2010 > 1) {
							if (local24.anInt1359 == 0 && !local24.aBoolean54 && local24.anInt1345 < local24.anInt1354) {
								Static125.method2013(local24.anInt1345, local24.anInt1396, local24.anInt1367 + local112, local107, local24.anInt1354);
							}
							if (local24.anInt1359 != 1) {
								@Pc(662) int local662;
								@Pc(673) int local673;
								@Pc(817) int local817;
								@Pc(717) int local717;
								@Pc(881) int local881;
								@Pc(682) int local682;
								@Pc(800) int local800;
								if (local24.anInt1359 == 2) {
									local287 = 0;
									for (local315 = 0; local315 < local24.anInt1345; local315++) {
										for (local662 = 0; local662 < local24.anInt1367; local662++) {
											local673 = local112 + local662 * (local24.anInt1333 + 32);
											local682 = local315 * (local24.anInt1363 + 32) + local107;
											if (local287 < 20) {
												local682 += local24.anIntArray199[local287];
												local673 += local24.anIntArray203[local287];
											}
											if (local24.anIntArray201[local287] > 0) {
												local717 = local24.anIntArray201[local287] - 1;
												if (arg7 < local673 + 32 && local673 < arg4 && arg0 < local682 + 32 && arg2 > local682 || Static92.aClass1_Sub10_11 == local24 && local287 == Static66.anInt538) {
													@Pc(770) Class1_Sub1_Sub2_Sub1 local770;
													if (Static84.anInt2224 == 1 && local287 == Static3.anInt117 && local24.anInt1348 == Static47.anInt1476) {
														local770 = Static127.method2027(local717, local24.anIntArray206[local287], false, 2, 0);
													} else {
														local770 = Static127.method2027(local717, local24.anIntArray206[local287], false, 1, 3153952);
													}
													if (local770 == null) {
														Static70.method537(local24);
													} else if (local24 == Static92.aClass1_Sub10_11 && Static66.anInt538 == local287) {
														local800 = Static50.anInt1542 - Static82.anInt2193;
														if (local800 < 5 && local800 > -5) {
															local800 = 0;
														}
														local817 = Static13.anInt462 - Static2.anInt87;
														if (local817 < 5 && local817 > -5) {
															local817 = 0;
														}
														if (Static104.anInt2555 < 5) {
															local817 = 0;
															local800 = 0;
														}
														local770.method247(local673 + local800, local817 + local682, 128);
														if (arg3 != -1) {
															@Pc(855) Class1_Sub10 local855 = arg6[arg3 & 0xFFFF];
															if (Static115.anInt2367 > local682 + local817 && local855.anInt1396 > 0) {
																local881 = (Static115.anInt2367 - local817 - local682) * Static130.anInt2924 / 3;
																if (Static130.anInt2924 * 10 < local881) {
																	local881 = Static130.anInt2924 * 10;
																}
																if (local855.anInt1396 < local881) {
																	local881 = local855.anInt1396;
																}
																Static2.anInt87 += local881;
																local855.anInt1396 -= local881;
																Static70.method537(local855);
															}
															if (Static115.anInt2368 < local682 + local817 + 32 && local855.anInt1396 < local855.anInt1354 - local855.anInt1345) {
																local881 = (local682 + local817 + 32 - Static115.anInt2368) * Static130.anInt2924 / 3;
																if (local881 > Static130.anInt2924 * 10) {
																	local881 = Static130.anInt2924 * 10;
																}
																if (local881 > local855.anInt1354 - local855.anInt1396 - local855.anInt1345) {
																	local881 = local855.anInt1354 - local855.anInt1345 - local855.anInt1396;
																}
																local855.anInt1396 += local881;
																Static2.anInt87 -= local881;
																Static70.method537(local855);
															}
														}
													} else if (Static28.aClass1_Sub10_4 == local24 && Static86.anInt2292 == local287) {
														local770.method247(local673, local682, 128);
													} else {
														local770.method250(local673, local682);
													}
												}
											} else if (local24.anIntArray204 != null && local287 < 20) {
												@Pc(1036) Class1_Sub1_Sub2_Sub1 local1036 = local24.method954(local287);
												if (local1036 != null) {
													local1036.method250(local673, local682);
												} else if (Static39.aBoolean39) {
													Static70.method537(local24);
												}
											}
											local287++;
										}
									}
								} else if (local24.anInt1359 == 3) {
									if (Static125.method2012(local24)) {
										local287 = local24.anInt1384;
										if (Static51.aClass1_Sub10_9 == local24 && local24.anInt1361 != 0) {
											local287 = local24.anInt1361;
										}
									} else {
										local287 = local24.anInt1331;
										if (Static51.aClass1_Sub10_9 == local24 && local24.anInt1386 != 0) {
											local287 = local24.anInt1386;
										}
									}
									if (local102 == 0) {
										if (local24.aBoolean50) {
											Static115.method1670(local112, local107, local24.anInt1367, local24.anInt1345, local287);
										} else {
											Static115.method1662(local112, local107, local24.anInt1367, local24.anInt1345, local287);
										}
									} else if (local24.aBoolean50) {
										Static115.method1660(local112, local107, local24.anInt1367, local24.anInt1345, local287, 256 - (local102 & 0xFF));
									} else {
										Static115.method1669(local112, local107, local24.anInt1367, local24.anInt1345, local287, 256 - (local102 & 0xFF));
									}
								} else {
									@Pc(1177) Class1_Sub1_Sub2_Sub2_Sub1 local1177;
									if (local24.anInt1359 == 4) {
										local1177 = local24.method958();
										if (local1177 != null) {
											@Pc(1189) Class66 local1189 = local24.aClass66_732;
											if (Static125.method2012(local24)) {
												local315 = local24.anInt1384;
												if (Static51.aClass1_Sub10_9 == local24 && local24.anInt1361 != 0) {
													local315 = local24.anInt1361;
												}
												if (local24.aClass66_727.method1847() > 0) {
													local1189 = local24.aClass66_727;
												}
											} else {
												local315 = local24.anInt1331;
												if (Static51.aClass1_Sub10_9 == local24 && local24.anInt1386 != 0) {
													local315 = local24.anInt1386;
												}
											}
											if (local24.aBoolean54 && local24.anInt1399 != -1) {
												@Pc(1242) Class1_Sub1_Sub6 local1242 = Static20.method496(local24.anInt1399);
												local1189 = local1242.aClass66_847;
												if (local1189 == null) {
													local1189 = Static52.aClass66_862;
												}
												if ((local1242.anInt1543 == 1 || local24.anInt1390 != 1) && local24.anInt1390 != -1) {
													local1189 = Static41.method897(new Class66[] { Static68.aClass66_1060, local1189, Static49.aClass66_817, Static109.method1858(local24.anInt1390) });
												}
											}
											if (local24 == Static87.aClass1_Sub10_10) {
												local315 = local24.anInt1331;
												local1189 = Static27.aClass66_456;
											}
											if (!local24.aBoolean54) {
												local1189 = Static86.method1607(local24, local1189);
											}
											local1177.method773(local1189, local112, local107, local24.anInt1367, local24.anInt1345, local315, local24.aBoolean56 ? 0 : -1, local24.anInt1385, local24.anInt1377, local24.anInt1358);
										} else if (Static39.aBoolean39) {
											Static70.method537(local24);
										}
									} else if (local24.anInt1359 == 5) {
										@Pc(1352) Class1_Sub1_Sub2_Sub1 local1352;
										if (local24.aBoolean54) {
											if (local24.anInt1399 == -1) {
												local1352 = local24.method960(false);
											} else {
												local1352 = Static127.method2027(local24.anInt1399, local24.anInt1390, false, local24.anInt1395, local24.anInt1364);
											}
											if (local1352 != null) {
												local662 = local1352.anInt288;
												local315 = local1352.anInt284;
												if (local24.aBoolean49) {
													Static115.method1661(local112, local107, local112 + local24.anInt1367, local24.anInt1345 + local107);
													local682 = (local662 + local24.anInt1345 - 1) / local662;
													local673 = (local315 + local24.anInt1367 - 1) / local315;
													for (local800 = 0; local800 < local673; local800++) {
														for (local817 = 0; local817 < local682; local817++) {
															if (local24.anInt1353 != 0) {
																local1352.method238(local800 * local315 + local112 + local315 / 2, local662 / 2 + local662 * local817 + local107, local24.anInt1353, 4096);
															} else if (local102 == 0) {
																local1352.method250(local112 + local315 * local800, local817 * local662 + local107);
															} else {
																local1352.method247(local112 + local315 * local800, local107 + local662 * local817, 256 - (local102 & 0xFF));
															}
														}
													}
													Static115.method1659(arg7, arg0, arg4, arg2);
												} else {
													local673 = local24.anInt1367 * 4096 / local315;
													if (local24.anInt1353 != 0) {
														local1352.method238(local112 + local24.anInt1367 / 2, local24.anInt1345 / 2 + local107, local24.anInt1353, local673);
													} else if (local102 != 0) {
														local1352.method249(local112, local107, local24.anInt1367, local24.anInt1345, 256 - (local102 & 0xFF));
													} else if (local315 == local24.anInt1367 && local662 == local24.anInt1345) {
														local1352.method250(local112, local107);
													} else {
														local1352.method244(local112, local107, local24.anInt1367, local24.anInt1345);
													}
												}
											} else if (Static39.aBoolean39) {
												Static70.method537(local24);
											}
										} else {
											local1352 = local24.method960(Static125.method2012(local24));
											if (local1352 != null) {
												local1352.method250(local112, local107);
											} else if (Static39.aBoolean39) {
												Static70.method537(local24);
											}
										}
									} else {
										@Pc(1696) Class1_Sub1_Sub6 local1696;
										if (local24.anInt1359 == 6) {
											@Pc(1607) boolean local1607 = Static125.method2012(local24);
											local673 = 0;
											@Pc(1611) Class1_Sub1_Sub1_Sub6 local1611 = null;
											if (local1607) {
												local315 = local24.anInt1328;
											} else {
												local315 = local24.anInt1360;
											}
											if (local24.anInt1399 != -1) {
												local1696 = Static20.method496(local24.anInt1399);
												if (local1696 != null) {
													local1696 = local1696.method1080(local24.anInt1390);
													local1611 = local1696.method1085(1);
													if (local1611 == null) {
														Static70.method537(local24);
													} else {
														local1611.method1338();
														local673 = local1611.anInt2699 / 2;
													}
												}
											} else if (local24.anInt1376 == 5) {
												if (local24.anInt1337 == 0) {
													local1611 = Static112.aClass38_2.method1264(null, null, -1, -1);
												} else {
													local1611 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.method1897();
												}
											} else if (local315 == -1) {
												local1611 = local24.method949(local1607, -1, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1, null);
												if (local1611 == null && Static39.aBoolean39) {
													Static70.method537(local24);
												}
											} else {
												@Pc(1656) Class1_Sub1_Sub15 local1656 = Static56.method1247(local315);
												local1611 = local24.method949(local1607, local24.anInt1379, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1, local1656);
												if (local1611 == null && Static39.aBoolean39) {
													Static70.method537(local24);
												}
											}
											Static91.method1681(local112 + local24.anInt1367 / 2, local107 + local24.anInt1345 / 2);
											local682 = local24.anInt1374 * Class1_Sub1_Sub2_Sub4.anIntArray399[local24.anInt1402] >> 16;
											local800 = local24.anInt1374 * Class1_Sub1_Sub2_Sub4.anIntArray397[local24.anInt1402] >> 16;
											if (local1611 != null) {
												if (local24.aBoolean54) {
													local1611.method1338();
													if (local24.aBoolean55) {
														local1611.method1343(local24.anInt1355, local24.anInt1382, local24.anInt1402, local24.anInt1368, local673 + local682 + local24.anInt1370, local24.anInt1370 + local800, local24.anInt1374);
													} else {
														local1611.method1344(local24.anInt1355, local24.anInt1382, local24.anInt1402, local24.anInt1368, local673 + local682 + local24.anInt1370, local800 + local24.anInt1370);
													}
												} else {
													local1611.method1344(local24.anInt1355, 0, local24.anInt1402, 0, local682, local800);
												}
											}
											Static91.method1685();
										} else {
											if (local24.anInt1359 == 7) {
												local1177 = local24.method958();
												if (local1177 == null) {
													if (Static39.aBoolean39) {
														Static70.method537(local24);
													}
													continue;
												}
												local315 = 0;
												for (local662 = 0; local662 < local24.anInt1345; local662++) {
													for (local673 = 0; local673 < local24.anInt1367; local673++) {
														if (local24.anIntArray201[local315] > 0) {
															local1696 = Static20.method496(local24.anIntArray201[local315] - 1);
															@Pc(1902) Class66 local1902;
															if (local1696.anInt1543 != 1 && local24.anIntArray206[local315] == 1) {
																local1902 = Static41.method897(new Class66[] { Static68.aClass66_1060, local1696.aClass66_847, Static44.aClass66_736 });
															} else {
																local1902 = Static41.method897(new Class66[] { Static68.aClass66_1060, local1696.aClass66_847, Static49.aClass66_817, Static109.method1858(local24.anIntArray206[local315]) });
															}
															local817 = local112 + (local24.anInt1333 + 115) * local673;
															local717 = local662 * (local24.anInt1363 + 12) + local107;
															if (local24.anInt1385 == 0) {
																local1177.method790(local1902, local817, local717, local24.anInt1331, local24.aBoolean56 ? 0 : -1);
															} else if (local24.anInt1385 == 1) {
																local1177.method781(local1902, local817 + local24.anInt1367 / 2, local717, local24.anInt1331, local24.aBoolean56 ? 0 : -1);
															} else {
																local1177.method776(local1902, local24.anInt1367 + local817 - 1, local717, local24.anInt1331, local24.aBoolean56 ? 0 : -1);
															}
														}
														local315++;
													}
												}
											}
											@Pc(2200) int local2200;
											if (local24.anInt1359 == 8 && Static45.aClass1_Sub10_8 == local24 && Static86.anInt2287 == Static22.anInt638) {
												local287 = 0;
												local315 = 0;
												@Pc(2043) Class1_Sub1_Sub2_Sub2_Sub1 local2043 = Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4;
												@Pc(2046) Class66 local2046 = local24.aClass66_732;
												local2046 = Static86.method1607(local24, local2046);
												@Pc(2068) Class66 local2068;
												while (local2046.method1847() > 0) {
													local800 = local2046.method1819(Static85.aClass66_1222);
													if (local800 == -1) {
														local2068 = local2046;
														local2046 = Static13.aClass66_284;
													} else {
														local2068 = local2046.method1807(0, local800);
														local2046 = local2046.method1831(local800 + 4);
													}
													local817 = local2043.method791(local2068);
													local315 += local2043.anInt968 + 1;
													if (local287 < local817) {
														local287 = local817;
													}
												}
												local287 += 6;
												local800 = local24.anInt1367 + local112 - local287 - 5;
												if (local800 < local112 + 5) {
													local800 = local112 + 5;
												}
												local315 += 7;
												local817 = local107 + local24.anInt1345 + 5;
												if (local315 + local817 > arg2) {
													local817 = arg2 - local315;
												}
												if (local287 + local800 > arg4) {
													local800 = arg4 - local287;
												}
												Static115.method1670(local800, local817, local287, local315, 16777120);
												Static115.method1662(local800, local817, local287, local315, 0);
												local717 = local817 + local2043.anInt968 + 2;
												local2046 = local24.aClass66_732;
												local2046 = Static86.method1607(local24, local2046);
												while (local2046.method1847() > 0) {
													local2200 = local2046.method1819(Static85.aClass66_1222);
													if (local2200 == -1) {
														local2068 = local2046;
														local2046 = Static13.aClass66_284;
													} else {
														local2068 = local2046.method1807(0, local2200);
														local2046 = local2046.method1831(local2200 + 4);
													}
													local2043.method790(local2068, local800 + 3, local717, 0, -1);
													local717 += local2043.anInt968 + 1;
												}
											}
											if (local24.anInt1359 == 9) {
												if (local24.anInt1356 == 1) {
													Static115.method1665(local112, local107, local112 + local24.anInt1367, local24.anInt1345 + local107, local24.anInt1331);
												} else {
													local287 = local24.anInt1367 >= 0 ? local24.anInt1367 : -local24.anInt1367;
													local662 = local287;
													local315 = local24.anInt1345 >= 0 ? local24.anInt1345 : -local24.anInt1345;
													if (local315 > local287) {
														local662 = local315;
													}
													if (local662 != 0) {
														local673 = (local24.anInt1367 << 16) / local662;
														local682 = (local24.anInt1345 << 16) / local662;
														if (local682 <= local673) {
															local673 = -local673;
														} else {
															local682 = -local682;
														}
														local817 = local682 * local24.anInt1356 + 1 >> 17;
														local800 = local682 * local24.anInt1356 >> 17;
														local717 = local24.anInt1356 * local673 >> 17;
														local2200 = local24.anInt1356 * local673 + 1 >> 17;
														@Pc(2358) int local2358 = local800 + local112;
														local881 = local112 - local817;
														@Pc(2371) int local2371 = local112 + local24.anInt1367 - local817;
														@Pc(2379) int local2379 = local24.anInt1367 + local112 + local800;
														@Pc(2383) int local2383 = local717 + local107;
														@Pc(2387) int local2387 = local107 - local2200;
														@Pc(2395) int local2395 = local717 + local107 + local24.anInt1345;
														@Pc(2403) int local2403 = local24.anInt1345 + local107 - local2200;
														Static91.method1693(local2358, local881, local2371);
														Static91.method1696(local2383, local2387, local2403, local2358, local881, local2371, local24.anInt1331);
														Static91.method1693(local2358, local2371, local2379);
														Static91.method1696(local2383, local2403, local2395, local2358, local2371, local2379, local24.anInt1331);
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

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([BII)I")
	public static int method2054(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static77.method1473(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public static void method2055() {
		aClass66_1756 = null;
		aClass66_1764 = null;
		aClass66_1758 = null;
		aClass66_1760 = null;
		aClass1_Sub1_Sub2_Sub1Array71 = null;
		aClass66_1766 = null;
		aClass66_1762 = null;
		aClass66_1759 = null;
		aClass66_1763 = null;
		aClass66_1765 = null;
		anIntArray503 = null;
		aClass66_1761 = null;
		aClass66_1757 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method2056(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local6 = local11.aString5 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local28);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local28.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local6 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local6 = local6 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local6 = local6 + local64 + ' ';
			}
		}
	}
}
