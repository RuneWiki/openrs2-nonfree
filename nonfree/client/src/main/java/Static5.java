import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!wf;")
	public static Class87 aClass87_2;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!eh;")
	private static Class28 aClass28_42 = Static170.method3101("Take");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt131 = 0;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_43 = Static170.method3101("Click to switch");

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_44 = aClass28_42;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_45 = aClass28_43;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII[Lclient!gf;IIII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(5) int local5 = 0; local5 < arg4.length; local5++) {
			@Pc(15) Class33 local15 = arg4[local5];
			if (local15 != null && (!local15.aBoolean90 || local15.anInt1522 == 0 || local15.aBoolean82 || Static4.method97(local15) != 0 || Static54.aClass33_8 == local15 || local15.anInt1477 == 1338) && arg5 == local15.anInt1488 && (!local15.aBoolean90 || !Static61.method1440(local15))) {
				@Pc(61) int local61 = arg1 + local15.anInt1492;
				@Pc(66) int local66 = arg3 + local15.anInt1480;
				@Pc(85) int local85;
				@Pc(101) int local101;
				@Pc(112) int local112;
				@Pc(128) int local128;
				@Pc(164) int local164;
				if (local15.anInt1522 == 2) {
					local101 = arg6;
					local112 = arg0;
					local85 = arg2;
					local128 = arg7;
				} else {
					@Pc(90) int local90;
					@Pc(117) int local117;
					if (local15.anInt1522 == 9) {
						local90 = local61;
						local117 = local66;
						@Pc(138) int local138 = local15.anInt1457 + local61;
						if (local138 < local61) {
							local90 = local138;
							local138 = local61;
						}
						local85 = arg2 >= local90 ? arg2 : local90;
						local164 = local66 + local15.anInt1515;
						local138++;
						if (local66 > local164) {
							local117 = local164;
							local164 = local66;
						}
						local164++;
						local128 = local164 >= arg7 ? arg7 : local164;
						local101 = arg6 < local117 ? local117 : arg6;
						local112 = local138 < arg0 ? local138 : arg0;
					} else {
						local85 = local61 <= arg2 ? arg2 : local61;
						local90 = local61 + local15.anInt1457;
						local101 = local66 <= arg6 ? arg6 : local66;
						local112 = arg0 <= local90 ? arg0 : local90;
						local117 = local15.anInt1515 + local66;
						local128 = local117 < arg7 ? local117 : arg7;
					}
				}
				if (local15 == Static22.aClass33_2) {
					Static95.anInt2629 = local66;
					Static121.anInt3119 = local61;
					Static108.aBoolean136 = true;
				}
				if (!local15.aBoolean90 || local85 < local112 && local128 > local101) {
					if (local15.anInt1477 == 1337) {
						Static16.method534(local15);
					} else {
						if (local15.anInt1522 == 0) {
							if (!local15.aBoolean90 && Static61.method1440(local15) && Static57.aClass33_9 != local15) {
								continue;
							}
							method100(local112, local61 - local15.anInt1524, local85, local66 - local15.anInt1490, arg4, local15.anInt1471, local101, local128);
							if (local15.aClass33Array2 != null) {
								method100(local112, local61 - local15.anInt1524, local85, local66 - local15.anInt1490, local15.aClass33Array2, local15.anInt1471, local101, local128);
							}
							@Pc(307) Class3_Sub7 local307 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local15.anInt1471);
							if (local307 != null) {
								Static158.method628(local101, local128, local66, local61, local85, local112, local307.anInt1548);
							}
						}
						if (local15.aBoolean90) {
							@Pc(324) boolean local324 = false;
							@Pc(326) boolean local326 = false;
							if (Static87.anInt2539 == 1 && Static2.anInt80 >= local85 && Static160.anInt3914 >= local101 && local112 > Static2.anInt80 && local128 > Static160.anInt3914) {
								local326 = true;
							}
							@Pc(379) boolean local379;
							if (local85 <= Static73.anInt2181 && Static35.anInt1049 >= local101 && local112 > Static73.anInt2181 && Static35.anInt1049 < local128) {
								local379 = true;
							} else {
								local379 = false;
							}
							if (Static136.anInt3480 == 1 && local379) {
								local324 = true;
							}
							if (local15.anInt1477 == 1338) {
								if (local326) {
									Static7.method217(Static160.anInt3914 - local66, Static2.anInt80 + -local61, local15);
								}
								continue;
							}
							if (local326) {
								Static112.method2248(Static2.anInt80 - local61, -local66 + Static160.anInt3914, local15);
							}
							if (Static22.aClass33_2 != null && local15 != Static22.aClass33_2 && local379 && Static23.method617(Static4.method97(local15))) {
								Static75.aClass33_10 = local15;
							}
							if (Static54.aClass33_8 == local15) {
								Static168.anInt4083 = local61;
								Static176.aBoolean193 = true;
								Static34.anInt1034 = local66;
							}
							if (local15.aBoolean82) {
								@Pc(462) Class3_Sub6 local462;
								if (local379 && Static101.anInt2657 != 0 && local15.anObjectArray27 != null) {
									local462 = new Class3_Sub6();
									local462.aClass33_3 = local15;
									local462.anInt1085 = Static101.anInt2657;
									local462.anObjectArray2 = local15.anObjectArray27;
									Static110.aClass23_12.method850(local462);
								}
								if (Static22.aClass33_2 != null || Static165.aClass33_13 != null || Static69.aBoolean112) {
									local324 = false;
									local379 = false;
									local326 = false;
								}
								if (!local15.aBoolean86 && local326) {
									local15.aBoolean86 = true;
									if (local15.anObjectArray15 != null) {
										local462 = new Class3_Sub6();
										local462.anObjectArray2 = local15.anObjectArray15;
										local462.aClass33_3 = local15;
										local462.anInt1085 = Static160.anInt3914 - local66;
										local462.anInt1084 = Static2.anInt80 - local61;
										Static110.aClass23_12.method850(local462);
									}
								}
								if (local15.aBoolean86 && local324 && local15.anObjectArray10 != null) {
									local462 = new Class3_Sub6();
									local462.anObjectArray2 = local15.anObjectArray10;
									local462.anInt1084 = Static73.anInt2181 - local61;
									local462.aClass33_3 = local15;
									local462.anInt1085 = Static35.anInt1049 - local66;
									Static110.aClass23_12.method850(local462);
								}
								if (local15.aBoolean86 && !local324) {
									local15.aBoolean86 = false;
									if (local15.anObjectArray14 != null) {
										local462 = new Class3_Sub6();
										local462.anObjectArray2 = local15.anObjectArray14;
										local462.anInt1084 = Static73.anInt2181 - local61;
										local462.anInt1085 = Static35.anInt1049 - local66;
										local462.aClass33_3 = local15;
										Static24.aClass23_2.method850(local462);
									}
								}
								if (local324 && local15.anObjectArray12 != null) {
									local462 = new Class3_Sub6();
									local462.anInt1085 = Static35.anInt1049 - local66;
									local462.aClass33_3 = local15;
									local462.anInt1084 = Static73.anInt2181 - local61;
									local462.anObjectArray2 = local15.anObjectArray12;
									Static110.aClass23_12.method850(local462);
								}
								if (!local15.aBoolean87 && local379) {
									local15.aBoolean87 = true;
									if (local15.anObjectArray13 != null) {
										local462 = new Class3_Sub6();
										local462.anInt1085 = Static35.anInt1049 - local66;
										local462.anObjectArray2 = local15.anObjectArray13;
										local462.aClass33_3 = local15;
										local462.anInt1084 = Static73.anInt2181 - local61;
										Static110.aClass23_12.method850(local462);
									}
								}
								if (local15.aBoolean87 && local379 && local15.anObjectArray22 != null) {
									local462 = new Class3_Sub6();
									local462.anObjectArray2 = local15.anObjectArray22;
									local462.anInt1084 = Static73.anInt2181 - local61;
									local462.aClass33_3 = local15;
									local462.anInt1085 = Static35.anInt1049 - local66;
									Static110.aClass23_12.method850(local462);
								}
								if (local15.aBoolean87 && !local379) {
									local15.aBoolean87 = false;
									if (local15.anObjectArray21 != null) {
										local462 = new Class3_Sub6();
										local462.anInt1084 = Static73.anInt2181 - local61;
										local462.aClass33_3 = local15;
										local462.anInt1085 = Static35.anInt1049 - local66;
										local462.anObjectArray2 = local15.anObjectArray21;
										Static24.aClass23_2.method850(local462);
									}
								}
								if (local15.anObjectArray19 != null) {
									local462 = new Class3_Sub6();
									local462.aClass33_3 = local15;
									local462.anObjectArray2 = local15.anObjectArray19;
									Static33.aClass23_5.method850(local462);
								}
								@Pc(788) int local788;
								@Pc(790) int local790;
								@Pc(801) Class3_Sub6 local801;
								if (local15.anObjectArray26 != null && Static85.anInt2509 > local15.anInt1503) {
									if (local15.anIntArray264 == null || Static85.anInt2509 - local15.anInt1503 > 32) {
										local462 = new Class3_Sub6();
										local462.aClass33_3 = local15;
										local462.anObjectArray2 = local15.anObjectArray26;
										Static110.aClass23_12.method850(local462);
									} else {
										label389: for (local164 = local15.anInt1503; local164 < Static85.anInt2509; local164++) {
											local788 = Static127.anIntArray567[local164 & 0x1F];
											for (local790 = 0; local790 < local15.anIntArray264.length; local790++) {
												if (local788 == local15.anIntArray264[local790]) {
													local801 = new Class3_Sub6();
													local801.anObjectArray2 = local15.anObjectArray26;
													local801.aClass33_3 = local15;
													Static110.aClass23_12.method850(local801);
													break label389;
												}
											}
										}
									}
									local15.anInt1503 = Static85.anInt2509;
								}
								if (local15.anObjectArray6 != null && Static32.anInt989 > local15.anInt1452) {
									if (local15.anIntArray255 == null || Static32.anInt989 - local15.anInt1452 > 32) {
										local462 = new Class3_Sub6();
										local462.anObjectArray2 = local15.anObjectArray6;
										local462.aClass33_3 = local15;
										Static110.aClass23_12.method850(local462);
									} else {
										label365: for (local164 = local15.anInt1452; local164 < Static32.anInt989; local164++) {
											local788 = Static112.anIntArray502[local164 & 0x1F];
											for (local790 = 0; local790 < local15.anIntArray255.length; local790++) {
												if (local15.anIntArray255[local790] == local788) {
													local801 = new Class3_Sub6();
													local801.aClass33_3 = local15;
													local801.anObjectArray2 = local15.anObjectArray6;
													Static110.aClass23_12.method850(local801);
													break label365;
												}
											}
										}
									}
									local15.anInt1452 = Static32.anInt989;
								}
								if (local15.anObjectArray24 != null && Static77.anInt2283 > local15.anInt1500) {
									if (local15.anIntArray262 == null || Static77.anInt2283 - local15.anInt1500 > 32) {
										local462 = new Class3_Sub6();
										local462.anObjectArray2 = local15.anObjectArray24;
										local462.aClass33_3 = local15;
										Static110.aClass23_12.method850(local462);
									} else {
										label341: for (local164 = local15.anInt1500; local164 < Static77.anInt2283; local164++) {
											local788 = Static91.anIntArray688[local164 & 0x1F];
											for (local790 = 0; local790 < local15.anIntArray262.length; local790++) {
												if (local15.anIntArray262[local790] == local788) {
													local801 = new Class3_Sub6();
													local801.aClass33_3 = local15;
													local801.anObjectArray2 = local15.anObjectArray24;
													Static110.aClass23_12.method850(local801);
													break label341;
												}
											}
										}
									}
									local15.anInt1500 = Static77.anInt2283;
								}
								if (Static125.anInt3216 > local15.anInt1460 && local15.anObjectArray18 != null) {
									local462 = new Class3_Sub6();
									local462.aClass33_3 = local15;
									local462.anObjectArray2 = local15.anObjectArray18;
									Static110.aClass23_12.method850(local462);
								}
								if (Static31.anInt968 > local15.anInt1460 && local15.anObjectArray7 != null) {
									local462 = new Class3_Sub6();
									local462.anObjectArray2 = local15.anObjectArray7;
									local462.aClass33_3 = local15;
									Static110.aClass23_12.method850(local462);
								}
								if (local15.anInt1460 < Static21.anInt569 && local15.anObjectArray16 != null) {
									local462 = new Class3_Sub6();
									local462.anObjectArray2 = local15.anObjectArray16;
									local462.aClass33_3 = local15;
									Static110.aClass23_12.method850(local462);
								}
								if (local15.anInt1460 < Static124.anInt3186 && local15.anObjectArray29 != null) {
									local462 = new Class3_Sub6();
									local462.anObjectArray2 = local15.anObjectArray29;
									local462.aClass33_3 = local15;
									Static110.aClass23_12.method850(local462);
								}
								if (local15.anInt1460 < Static95.anInt2637 && local15.anObjectArray9 != null) {
									local462 = new Class3_Sub6();
									local462.aClass33_3 = local15;
									local462.anObjectArray2 = local15.anObjectArray9;
									Static110.aClass23_12.method850(local462);
								}
								local15.anInt1460 = Static90.anInt2570;
								if (local15.anObjectArray5 != null) {
									for (local164 = 0; local164 < Static148.anInt1825; local164++) {
										@Pc(1166) Class3_Sub6 local1166 = new Class3_Sub6();
										local1166.aClass33_3 = local15;
										local1166.anInt1080 = Static60.anIntArray304[local164];
										local1166.anInt1081 = Static167.anIntArray681[local164];
										local1166.anObjectArray2 = local15.anObjectArray5;
										Static110.aClass23_12.method850(local1166);
									}
								}
							}
						}
						if (!local15.aBoolean90) {
							if (Static22.aClass33_2 != null || Static165.aClass33_13 != null || Static69.aBoolean112) {
								return;
							}
							if ((local15.anInt1472 >= 0 || local15.anInt1481 != 0) && Static73.anInt2181 >= local85 && Static35.anInt1049 >= local101 && Static73.anInt2181 < local112 && local128 > Static35.anInt1049) {
								if (local15.anInt1472 >= 0) {
									Static57.aClass33_9 = arg4[local15.anInt1472];
								} else {
									Static57.aClass33_9 = local15;
								}
							}
							if (local15.anInt1522 == 8 && Static73.anInt2181 >= local85 && Static35.anInt1049 >= local101 && local112 > Static73.anInt2181 && Static35.anInt1049 < local128) {
								Static51.aClass33_6 = local15;
							}
							if (local15.anInt1458 > local15.anInt1515) {
								Static71.method1653(local15.anInt1458, Static73.anInt2181, local15, local15.anInt1515, local66, local15.anInt1457 + local61, Static35.anInt1049);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method101() {
		Static18.aClass3_Sub8_Sub1_1.method1560();
		@Pc(11) int local11 = Static18.aClass3_Sub8_Sub1_1.method1557(8);
		if (local11 < Static69.anInt2115) {
			for (@Pc(20) int local20 = local11; local20 < Static69.anInt2115; local20++) {
				Static93.anIntArray446[Static80.anInt3606++] = Static117.anIntArray523[local20];
			}
		}
		if (local11 > Static69.anInt2115) {
			throw new RuntimeException("gnpov1");
		}
		Static69.anInt2115 = 0;
		for (@Pc(55) int local55 = 0; local55 < local11; local55++) {
			@Pc(60) int local60 = Static117.anIntArray523[local55];
			@Pc(64) Class3_Sub2_Sub1_Sub2_Sub2 local64 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local60];
			@Pc(69) int local69 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			if (local69 == 0) {
				Static117.anIntArray523[Static69.anInt2115++] = local60;
				local64.anInt1830 = Static14.anInt481;
			} else {
				@Pc(88) int local88 = Static18.aClass3_Sub8_Sub1_1.method1557(2);
				if (local88 == 0) {
					Static117.anIntArray523[Static69.anInt2115++] = local60;
					local64.anInt1830 = Static14.anInt481;
					Static171.anIntArray684[Static81.anInt2370++] = local60;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local88 == 1) {
						Static117.anIntArray523[Static69.anInt2115++] = local60;
						local64.anInt1830 = Static14.anInt481;
						local131 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local64.method1437(local131, false);
						local141 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
						if (local141 == 1) {
							Static171.anIntArray684[Static81.anInt2370++] = local60;
						}
					} else if (local88 == 2) {
						Static117.anIntArray523[Static69.anInt2115++] = local60;
						local64.anInt1830 = Static14.anInt481;
						local131 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local64.method1437(local131, true);
						local141 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local64.method1437(local141, true);
						@Pc(194) int local194 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
						if (local194 == 1) {
							Static171.anIntArray684[Static81.anInt2370++] = local60;
						}
					} else if (local88 == 3) {
						Static93.anIntArray446[Static80.anInt3606++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	public static void method103(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static48.method1149(arg0)) {
			return;
		}
		@Pc(18) Class33[] local18 = Static42.aClass33ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(25) Class33 local25 = local18[local20];
			if (local25.anObjectArray28 != null) {
				@Pc(32) Class3_Sub6 local32 = new Class3_Sub6();
				local32.aClass33_3 = local25;
				local32.anObjectArray2 = local25.anObjectArray28;
				Static52.method1203(local32, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method105() {
		aClass28_44 = null;
		aClass28_42 = null;
		aShortArray1 = null;
		aClass28_45 = null;
		aClass87_2 = null;
		aClass28_43 = null;
	}
}
