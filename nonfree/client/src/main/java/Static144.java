import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!er", name = "m", descriptor = "I")
	public static int anInt2756;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_13 = new Class262();

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class14_Sub29 local17 = new Class14_Sub29(arg2);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method5887();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(100) Class203 local100;
				do {
					@Pc(70) int local70;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method5895();
										if (local42 == 0) {
											continue label70;
										}
										local17.method5866();
									}
									local42 = local17.method5895();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local17.method5866() >> 2;
									local70 = local60 + arg0;
									local75 = local54 + arg1;
								} while (local70 <= 0);
							} while (local75 <= 0);
						} while (arg4 - 1 <= local70);
					} while (arg3 - 1 <= local75);
					local100 = Static511.aClass13_2.method86(local19);
				} while (local66 == 22 && Static56.aClass14_Sub22_5.aClass21_Sub27_1.method8612() == 0 && local100.anInt6045 == 0 && local100.anInt6016 != 1 && !local100.aBoolean417);
				if (!local100.method5011()) {
					Static55.anInt1383++;
					local7 = false;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
	public static void method2296() {
		for (@Pc(7) int local7 = 0; local7 < Static553.aByteArrayArrayArray18.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static553.aByteArrayArrayArray18[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static553.aByteArrayArrayArray18[0][0].length; local15++) {
					Static553.aByteArrayArrayArray18[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)Z")
	public static boolean method2298() throws IOException {
		if (Static258.aClass97_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static156.aClass44_62 == null) {
			if (Static100.aBoolean177) {
				if (!Static258.aClass97_2.method2290(1)) {
					return false;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				Static487.anInt9463 = 0;
				Static100.aBoolean177 = false;
				Static458.anInt9690++;
			}
			Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
			if (Static481.aClass14_Sub29_Sub1_2.method4287()) {
				if (!Static258.aClass97_2.method2290(1)) {
					return false;
				}
				Static258.aClass97_2.method2294(1, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				Static487.anInt9463 = 0;
				Static458.anInt9690++;
			}
			Static100.aBoolean177 = true;
			@Pc(69) Class44[] local69 = Static97.method1774();
			local73 = Static481.aClass14_Sub29_Sub1_2.method4288();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static481.aClass14_Sub29_Sub1_2.anInt7264);
			}
			Static156.aClass44_62 = local69[local73];
			Static638.anInt10676 = Static156.aClass44_62.anInt1386;
		}
		if (Static638.anInt10676 == -1) {
			if (!Static258.aClass97_2.method2290(1)) {
				return false;
			}
			Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
			Static458.anInt9690++;
			Static487.anInt9463 = 0;
			Static638.anInt10676 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
		}
		if (Static638.anInt10676 == -2) {
			if (!Static258.aClass97_2.method2290(2)) {
				return false;
			}
			Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 2);
			Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
			Static638.anInt10676 = Static481.aClass14_Sub29_Sub1_2.method5900();
			Static487.anInt9463 = 0;
			Static458.anInt9690 += 2;
		}
		if (Static638.anInt10676 > 0) {
			if (!Static258.aClass97_2.method2290(Static638.anInt10676)) {
				return false;
			}
			Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
			Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, Static638.anInt10676);
			Static458.anInt9690 += Static638.anInt10676;
			Static487.anInt9463 = 0;
		}
		Static349.aClass44_113 = Static264.aClass44_88;
		Static264.aClass44_88 = Static96.aClass44_46;
		Static96.aClass44_46 = Static156.aClass44_62;
		if (Static156.aClass44_62 == Static37.aClass44_22) {
			Static15.method140(Static421.aClass395_12);
			Static156.aClass44_62 = null;
			return true;
		}
		@Pc(221) int local221;
		@Pc(244) Class14_Sub32 local244;
		if (Static372.aClass44_118 == Static156.aClass44_62) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5901();
			local73 = Static481.aClass14_Sub29_Sub1_2.method5864();
			Static31.method717();
			@Pc(237) Class14_Sub32 local237 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local73);
			local244 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local221);
			if (local244 != null) {
				Static446.method6502(local244, local237 == null || local244.anInt6351 != local237.anInt6351, false);
			}
			if (local237 != null) {
				local237.method9315();
				Static547.aClass187_69.method4077((long) local221, local237);
			}
			@Pc(275) Class230 local275 = Static655.method9094(local73);
			if (local275 != null) {
				Static634.method8860(local275);
			}
			local275 = Static655.method9094(local221);
			if (local275 != null) {
				Static634.method8860(local275);
				Static163.method2629(local275, true);
			}
			if (Static563.anInt9769 != -1) {
				Static233.method3542(Static563.anInt9769, 1);
			}
			Static156.aClass44_62 = null;
			return true;
		}
		@Pc(316) String local316;
		if (Static156.aClass44_62 == Static14.aClass44_6) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5840();
			local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
			Static31.method717();
			Static661.method9140(local221, local316);
			Static156.aClass44_62 = null;
			return true;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		@Pc(372) int local372;
		@Pc(346) int local346;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(368) int local368;
		if (Static156.aClass44_62 == Static281.aClass44_94) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
			local73 = local221 >> 28 & 0x3;
			local346 = local221 >> 14 & 0x3FFF;
			local350 = local221 & 0x3FFF;
			local356 = Static481.aClass14_Sub29_Sub1_2.method5888();
			local360 = local356 >> 2;
			local364 = local356 & 0x3;
			local368 = Static55.anIntArray93[local360];
			local372 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local350 -= Static202.anInt3755;
			local346 -= Static329.anInt6225;
			if (local372 == 65535) {
				local372 = -1;
			}
			Static490.method7253(local346, local350, local360, local368, local73, local364, local372);
			Static156.aClass44_62 = null;
			return true;
		}
		@Pc(450) String local450;
		@Pc(419) String local419;
		@Pc(417) String local417;
		if (Static156.aClass44_62 == Static539.aClass44_162) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5895();
			local73 = Static481.aClass14_Sub29_Sub1_2.method5878();
			local346 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local417 = "";
			local419 = local417;
			if ((local346 & 0x1) != 0) {
				local417 = Static481.aClass14_Sub29_Sub1_2.method5898();
				if ((local346 & 0x2) == 0) {
					local419 = local417;
				} else {
					local419 = Static481.aClass14_Sub29_Sub1_2.method5898();
				}
			}
			local450 = Static481.aClass14_Sub29_Sub1_2.method5898();
			if (local221 == 99) {
				Static466.method6830(local450);
			} else if (local419.equals("") || !Static239.method3588(local419)) {
				Static149.method5512(local419, local417, local450, local221, local73, local417);
			} else {
				Static156.aClass44_62 = null;
				return true;
			}
			Static156.aClass44_62 = null;
			return true;
		} else if (Static441.aClass44_143 == Static156.aClass44_62) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
			Static31.method717();
			if (local221 == -1) {
				Static667.anInt11097 = -1;
				Static115.anInt2304 = -1;
			} else {
				local73 = local221 >> 14 & 0x3FFF;
				local346 = local221 & 0x3FFF;
				local73 -= Static329.anInt6225;
				local346 -= Static202.anInt3755;
				if (local73 < 0) {
					local73 = 0;
				} else if (Static26.anInt462 <= local73) {
					local73 = Static26.anInt462;
				}
				Static667.anInt11097 = (local73 << 9) + 256;
				if (local346 < 0) {
					local346 = 0;
				} else if (local346 >= Static445.anInt6140) {
					local346 = Static445.anInt6140;
				}
				Static115.anInt2304 = (local346 << 9) + 256;
			}
			Static156.aClass44_62 = null;
			return true;
		} else if (Static112.aClass44_51 == Static156.aClass44_62) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5876();
			local73 = Static481.aClass14_Sub29_Sub1_2.method5843();
			Static31.method717();
			Static29.method661(local73, local221);
			Static156.aClass44_62 = null;
			return true;
		} else if (Static176.aClass44_67 == Static156.aClass44_62) {
			Static443.method6485();
			Static156.aClass44_62 = null;
			return false;
		} else if (Static156.aClass44_62 == Static409.aClass44_136) {
			local221 = Static481.aClass14_Sub29_Sub1_2.method5866();
			Static31.method717();
			Static156.aClass44_62 = null;
			Static291.anInt5168 = local221;
			return true;
		} else if (Static386.aClass44_129 == Static156.aClass44_62) {
			Static15.method140(Static214.aClass395_6);
			Static156.aClass44_62 = null;
			return true;
		} else {
			@Pc(646) boolean local646;
			@Pc(660) long local660;
			@Pc(671) long local671;
			@Pc(689) int local689;
			@Pc(655) long local655;
			@Pc(751) String local751;
			@Pc(757) int local757;
			if (Static474.aClass44_50 == Static156.aClass44_62) {
				local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
				local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
				local655 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
				local660 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
				local364 = Static481.aClass14_Sub29_Sub1_2.method5866();
				local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				@Pc(681) Class14_Sub25 local681 = local646 ? Static323.aClass14_Sub25_2 : Static64.aClass14_Sub25_1;
				if (local681 == null) {
					local673 = true;
				} else {
					label2117: {
						for (local689 = 0; local689 < 100; local689++) {
							if (Static299.aLongArray7[local689] == local671) {
								local673 = true;
								break label2117;
							}
						}
						if (local364 <= 1) {
							if (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234) {
								local673 = true;
							} else if (Static239.method3588(local316)) {
								local673 = true;
							}
						}
					}
				}
				if (!local673 && Static325.anInt6165 == 0) {
					Static299.aLongArray7[Static302.anInt10116] = local671;
					Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
					local751 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
					local757 = local646 ? 41 : 44;
					if (local364 == 2 || local364 == 3) {
						Static198.method3031(0, local751, local757, "<img=1>" + local316, local681.aString48, local316, "<img=1>" + local316, -1);
					} else if (local364 == 1) {
						Static198.method3031(0, local751, local757, "<img=0>" + local316, local681.aString48, local316, "<img=0>" + local316, -1);
					} else {
						Static198.method3031(0, local751, local757, local316, local681.aString48, local316, local316, -1);
					}
				}
				Static156.aClass44_62 = null;
				return true;
			} else if (Static156.aClass44_62 == Static527.aClass44_159) {
				Static537.anInt9244 = Static481.aClass14_Sub29_Sub1_2.method5858();
				Static13.aBoolean12 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
				Static156.aClass44_62 = null;
				return true;
			} else {
				@Pc(923) int local923;
				@Pc(929) int local929;
				@Pc(1253) boolean local1253;
				@Pc(1417) int local1417;
				@Pc(1037) boolean local1037;
				@Pc(956) int local956;
				if (Static391.aClass44_132 == Static156.aClass44_62) {
					local221 = Static481.aClass14_Sub29_Sub1_2.method5884();
					local73 = Static481.aClass14_Sub29_Sub1_2.method5840();
					local346 = Static481.aClass14_Sub29_Sub1_2.method5846();
					local350 = Static481.aClass14_Sub29_Sub1_2.method5842();
					local356 = Static481.aClass14_Sub29_Sub1_2.method5878();
					local360 = Static481.aClass14_Sub29_Sub1_2.method5884();
					local364 = local350 & 0x7;
					local368 = local350 >> 3 & 0xF;
					if (local368 == 15) {
						local368 = -1;
					}
					if (local356 >> 30 == 0) {
						@Pc(1116) Class275 local1116;
						@Pc(1122) Class275 local1122;
						@Pc(1102) Class60 local1102;
						if (local356 >> 29 != 0) {
							local372 = local356 & 0xFFFF;
							@Pc(1234) Class14_Sub44 local1234 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local372);
							if (local1234 != null) {
								@Pc(1239) Class12_Sub2_Sub2_Sub1_Sub1 local1239 = local1234.aClass12_Sub2_Sub2_Sub1_Sub1_2;
								if (local73 == 65535) {
									local73 = -1;
								}
								@Pc(1251) Class84 local1251 = local1239.aClass84Array3[local346];
								local1253 = true;
								local956 = local1251.anInt2468;
								if (local73 != -1 && local956 != -1) {
									if (local73 == local956) {
										local1102 = Static556.aClass216_2.method5268(local73);
										if (local1102.aBoolean127 && local1102.anInt1664 != -1) {
											local1116 = Static501.aClass191_2.method4322(local1102.anInt1664);
											@Pc(1293) int local1293 = local1116.anInt7920;
											if (local1293 == 0 || local1293 == 2) {
												local1253 = false;
											} else if (local1293 == 1) {
												local1253 = true;
											}
										}
									} else {
										local1102 = Static556.aClass216_2.method5268(local73);
										@Pc(1326) Class60 local1326 = Static556.aClass216_2.method5268(local956);
										if (local1102.anInt1664 != -1 && local1326.anInt1664 != -1) {
											local1122 = Static501.aClass191_2.method4322(local1102.anInt1664);
											@Pc(1348) Class275 local1348 = Static501.aClass191_2.method4322(local1326.anInt1664);
											if (local1122.anInt7930 < local1348.anInt7930) {
												local1253 = false;
											}
										}
									}
								}
								if (local1253) {
									local1251.anInt2468 = local73;
									local1251.anInt2470 = local368;
									local1251.anInt2465 = 0;
									local1251.anInt2466 = 0;
									local1251.anInt2475 = local221 + Static87.anInt1951;
									local1251.anInt2473 = 1;
									local1251.anInt2471 = local364;
									local1251.anInt2474 = local360;
									if (local1251.anInt2468 == 65535) {
										local1251.anInt2468 = -1;
									}
									if (local1251.anInt2475 > Static87.anInt1951) {
										local1251.anInt2466 = -1;
									}
									if (local1251.anInt2468 != -1 && local1251.anInt2475 == Static87.anInt1951) {
										local1417 = Static556.aClass216_2.method5268(local1251.anInt2468).anInt1664;
										if (local1417 != -1) {
											local1116 = Static501.aClass191_2.method4322(local1417);
											if (local1116 != null && local1116.anIntArray598 != null && !local1239.aBoolean221) {
												Static51.method1064(local1239, local1116, 0);
											}
										}
									}
								}
							}
						} else if (local356 >> 28 != 0) {
							local372 = local356 & 0xFFFF;
							@Pc(1019) Class12_Sub2_Sub2_Sub1_Sub2 local1019;
							if (local372 == Static568.anInt9800) {
								local1019 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2;
							} else {
								local1019 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local372];
							}
							if (local1019 != null) {
								@Pc(1030) Class84 local1030 = local1019.aClass84Array3[local346];
								if (local73 == 65535) {
									local73 = -1;
								}
								local1037 = true;
								local757 = local1030.anInt2468;
								@Pc(1069) Class275 local1069;
								if (local73 != -1 && local757 != -1) {
									@Pc(1056) Class60 local1056;
									if (local757 == local73) {
										local1056 = Static556.aClass216_2.method5268(local73);
										if (local1056.aBoolean127 && local1056.anInt1664 != -1) {
											local1069 = Static501.aClass191_2.method4322(local1056.anInt1664);
											@Pc(1072) int local1072 = local1069.anInt7920;
											if (local1072 == 0 || local1072 == 2) {
												local1037 = false;
											} else if (local1072 == 1) {
												local1037 = true;
											}
										}
									} else {
										local1056 = Static556.aClass216_2.method5268(local73);
										local1102 = Static556.aClass216_2.method5268(local757);
										if (local1056.anInt1664 != -1 && local1102.anInt1664 != -1) {
											local1116 = Static501.aClass191_2.method4322(local1056.anInt1664);
											local1122 = Static501.aClass191_2.method4322(local1102.anInt1664);
											if (local1122.anInt7930 > local1116.anInt7930) {
												local1037 = false;
											}
										}
									}
								}
								if (local1037) {
									local1030.anInt2475 = Static87.anInt1951 + local221;
									local1030.anInt2471 = local364;
									local1030.anInt2466 = 0;
									local1030.anInt2468 = local73;
									local1030.anInt2465 = 0;
									local1030.anInt2473 = 1;
									local1030.anInt2474 = local360;
									local1030.anInt2470 = local368;
									if (local1030.anInt2468 == 65535) {
										local1030.anInt2468 = -1;
									}
									if (local1030.anInt2475 > Static87.anInt1951) {
										local1030.anInt2466 = -1;
									}
									if (local1030.anInt2468 != -1 && local1030.anInt2475 == Static87.anInt1951) {
										local956 = Static556.aClass216_2.method5268(local1030.anInt2468).anInt1664;
										if (local956 != -1) {
											local1069 = Static501.aClass191_2.method4322(local956);
											if (local1069 != null && local1069.anIntArray598 != null && !local1019.aBoolean221) {
												Static51.method1064(local1019, local1069, 0);
											}
										}
									}
								}
							}
						}
					} else {
						local372 = local356 >> 28 & 0x3;
						local923 = (local356 >> 14 & 0x3FFF) - Static329.anInt6225;
						local929 = (local356 & 0x3FFF) - Static202.anInt3755;
						if (local923 >= 0 && local929 >= 0 && Static26.anInt462 > local923 && local929 < Static445.anInt6140) {
							local689 = local923 * 512 + 256;
							local757 = local929 * 512 + 256;
							local956 = local372;
							if (local372 < 3 && Static329.method5158(local929, local923)) {
								local956 = local372 + 1;
							}
							@Pc(991) Class12_Sub2_Sub2_Sub5 local991 = new Class12_Sub2_Sub2_Sub5(local73, local221, Static87.anInt1951, local372, local956, local689, Static152.method2434(local689, local372, local757) - local360, local757, local923, local923, local929, local929, local364);
							Static551.aClass262_40.method6314(new Class14_Sub3_Sub4(local991));
						}
					}
					Static156.aClass44_62 = null;
					return true;
				} else if (Static156.aClass44_62 == Static528.aClass44_160) {
					local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
					if (local221 == 65535) {
						local221 = -1;
					}
					local73 = Static481.aClass14_Sub29_Sub1_2.method5843();
					Static31.method717();
					Static662.method9183(local221, local73);
					Static156.aClass44_62 = null;
					return true;
				} else if (Static156.aClass44_62 == Static191.aClass44_69) {
					local221 = Static481.aClass14_Sub29_Sub1_2.method5843();
					Static31.method717();
					Static142.method2221(local221, Static568.anInt9800, 5, 0);
					Static156.aClass44_62 = null;
					return true;
				} else if (Static156.aClass44_62 == Static204.aClass44_165) {
					Static15.method140(Static636.aClass395_17);
					Static156.aClass44_62 = null;
					return true;
				} else {
					@Pc(1512) byte local1512;
					if (Static156.aClass44_62 == Static26.aClass44_12) {
						local221 = Static481.aClass14_Sub29_Sub1_2.method5876();
						local1512 = Static481.aClass14_Sub29_Sub1_2.method5845();
						Static595.aClass241_1.method5816(local221, local1512);
						Static156.aClass44_62 = null;
						return true;
					} else if (Static277.aClass44_93 == Static156.aClass44_62) {
						local221 = Static481.aClass14_Sub29_Sub1_2.method5840();
						local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
						Static31.method717();
						Static661.method9140(local221, local316);
						Static156.aClass44_62 = null;
						return true;
					} else if (Static156.aClass44_62 == Static607.aClass44_76) {
						Static218.anInt4113 = Static441.anInt7833;
						local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
						@Pc(1564) Class161 local1564 = new Class161(Static481.aClass14_Sub29_Sub1_2);
						@Pc(1568) Class229 local1568;
						if (local646) {
							local1568 = Static128.aClass229_1;
						} else {
							local1568 = Static432.aClass229_2;
						}
						local1564.method3626(local1568);
						Static156.aClass44_62 = null;
						return true;
					} else {
						@Pc(1597) byte[] local1597;
						if (Static195.aClass44_71 == Static156.aClass44_62) {
							if (Static628.aFrame3 != null) {
								Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
							}
							local1597 = new byte[Static638.anInt10676];
							Static481.aClass14_Sub29_Sub1_2.method4282(local1597, Static638.anInt10676);
							local316 = Static541.method8227(local1597, 0, Static638.anInt10676);
							Static120.method7603(true, Static234.aClass333_5, local316, Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 1);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static156.aClass44_62 == Static282.aClass44_95) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
							local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
							Static31.method717();
							Static159.method6778(local221, local316);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static28.aClass44_13 == Static156.aClass44_62) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
							if (local221 == 65535) {
								local221 = -1;
							}
							local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
							local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
							local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
							local356 = Static481.aClass14_Sub29_Sub1_2.method5900();
							Static143.method2260(local350, local346, local73, local221, local356);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static25.aClass44_11 == Static156.aClass44_62) {
							Static15.method140(Static209.aClass395_5);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static156.aClass44_62 == Static359.aClass44_116) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5884();
							if (local221 == 65535) {
								local221 = -1;
							}
							local73 = Static481.aClass14_Sub29_Sub1_2.method5901();
							Static31.method717();
							Static142.method2221(local73, local221, 1, -1);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static156.aClass44_62 == Static602.aClass44_171) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
							if (local221 == 65535) {
								local221 = -1;
							}
							local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
							local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
							local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
							local356 = Static481.aClass14_Sub29_Sub1_2.method5900();
							Static503.method7357(local356, local350, local346, false, local221, local73);
							Static156.aClass44_62 = null;
							return true;
						} else if (Static32.aClass44_164 == Static156.aClass44_62) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5888();
							local73 = Static481.aClass14_Sub29_Sub1_2.method5900();
							Static31.method717();
							if (local221 == 2) {
								Static503.method7355();
							}
							Static563.anInt9769 = local73;
							Static6.method37(local73);
							Static552.method7778(false);
							Static632.method8837(Static563.anInt9769);
							for (local346 = 0; local346 < 100; local346++) {
								Static446.aBooleanArray18[local346] = true;
							}
							Static156.aClass44_62 = null;
							return true;
						} else if (Static243.aClass44_83 == Static156.aClass44_62) {
							local221 = Static481.aClass14_Sub29_Sub1_2.method5843();
							if (Static583.anInt10018 != local221) {
								Static583.anInt10018 = local221;
								Static632.method8833(Static177.aClass276_8, -1, -1);
							}
							Static156.aClass44_62 = null;
							return true;
						} else {
							@Pc(1881) String local1881;
							if (Static156.aClass44_62 == Static56.aClass44_32) {
								if (Static628.aFrame3 != null) {
									Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
								}
								local1597 = new byte[Static638.anInt10676];
								Static481.aClass14_Sub29_Sub1_2.method4282(local1597, Static638.anInt10676);
								local316 = Static541.method8227(local1597, 0, Static638.anInt10676);
								local1881 = "opensn";
								if (!Static116.aBoolean192 || Static209.method3279(Static234.aClass333_5, local1881, local316, 1).anInt4247 == 2) {
									Static630.method8817(true, local1881, Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 1, Static234.aClass333_5, local316);
								}
								Static156.aClass44_62 = null;
								return true;
							} else if (Static396.aClass44_134 == Static156.aClass44_62) {
								Static156.aClass44_62 = null;
								return false;
							} else if (Static156.aClass44_62 == Static262.aClass44_87) {
								local221 = Static481.aClass14_Sub29_Sub1_2.method5866();
								@Pc(1936) boolean local1936 = (local221 & 0x1) == 1;
								local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
								local417 = Static481.aClass14_Sub29_Sub1_2.method5898();
								if (local417.equals("")) {
									local417 = local1881;
								}
								local419 = Static481.aClass14_Sub29_Sub1_2.method5898();
								local450 = Static481.aClass14_Sub29_Sub1_2.method5898();
								if (local450.equals("")) {
									local450 = local419;
								}
								if (local1936) {
									for (local364 = 0; local364 < Static641.anInt10703; local364++) {
										if (Static411.aStringArray27[local364].equals(local450)) {
											Static304.aStringArray17[local364] = local1881;
											Static411.aStringArray27[local364] = local417;
											Static543.aStringArray34[local364] = local419;
											Static228.aStringArray11[local364] = local450;
											break;
										}
									}
								} else {
									Static304.aStringArray17[Static641.anInt10703] = local1881;
									Static411.aStringArray27[Static641.anInt10703] = local417;
									Static543.aStringArray34[Static641.anInt10703] = local419;
									Static228.aStringArray11[Static641.anInt10703] = local450;
									Static535.aBooleanArray21[Static641.anInt10703] = (local221 & 0x2) == 2;
									Static641.anInt10703++;
								}
								Static619.anInt10403 = Static441.anInt7833;
								Static156.aClass44_62 = null;
								return true;
							} else if (Static465.aClass44_146 == Static156.aClass44_62) {
								Static180.method2867();
								Static156.aClass44_62 = null;
								return true;
							} else if (Static156.aClass44_62 == Static421.aClass44_138) {
								Static485.aBoolean535 = Static481.aClass14_Sub29_Sub1_2.method5888() == 1;
								Static156.aClass44_62 = null;
								return true;
							} else {
								@Pc(2101) long local2101;
								@Pc(2106) long local2106;
								@Pc(2116) long local2116;
								@Pc(2118) boolean local2118;
								if (Static156.aClass44_62 == Static54.aClass44_31) {
									local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
									local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
									local1881 = local316;
									if (local646) {
										local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
									}
									local2101 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
									local2106 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
									local368 = Static481.aClass14_Sub29_Sub1_2.method5866();
									local2116 = local2106 + (local2101 << 32);
									local2118 = false;
									local689 = 0;
									while (true) {
										if (local689 >= 100) {
											if (local368 <= 1) {
												if (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234) {
													local2118 = true;
												} else if (Static239.method3588(local1881)) {
													local2118 = true;
												}
											}
											break;
										}
										if (Static299.aLongArray7[local689] == local2116) {
											local2118 = true;
											break;
										}
										local689++;
									}
									if (!local2118 && Static325.anInt6165 == 0) {
										Static299.aLongArray7[Static302.anInt10116] = local2116;
										Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
										local751 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
										if (local368 == 2) {
											Static198.method3031(0, local751, 7, "<img=1>" + local1881, (String) null, local316, "<img=1>" + local316, -1);
										} else if (local368 == 1) {
											Static198.method3031(0, local751, 7, "<img=0>" + local1881, (String) null, local316, "<img=0>" + local316, -1);
										} else {
											Static198.method3031(0, local751, 3, local1881, (String) null, local316, local316, -1);
										}
									}
									Static156.aClass44_62 = null;
									return true;
								} else if (Static25.aClass44_10 == Static156.aClass44_62) {
									Static444.anInt7851 = Static441.anInt7833;
									local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
									if (Static638.anInt10676 != 1) {
										if (local646) {
											Static323.aClass14_Sub25_2 = new Class14_Sub25(Static481.aClass14_Sub29_Sub1_2);
										} else {
											Static64.aClass14_Sub25_1 = new Class14_Sub25(Static481.aClass14_Sub29_Sub1_2);
										}
										Static156.aClass44_62 = null;
										return true;
									}
									Static156.aClass44_62 = null;
									if (local646) {
										Static323.aClass14_Sub25_2 = null;
									} else {
										Static64.aClass14_Sub25_1 = null;
									}
									return true;
								} else if (Static156.aClass44_62 == Static31.aClass44_19) {
									local221 = Static481.aClass14_Sub29_Sub1_2.method5878();
									local73 = Static481.aClass14_Sub29_Sub1_2.method5900();
									Static31.method717();
									Static615.method8631(local73, local221);
									Static156.aClass44_62 = null;
									return true;
								} else if (Static156.aClass44_62 == Static679.aClass44_191) {
									local221 = Static481.aClass14_Sub29_Sub1_2.method5866();
									local73 = local221 >> 5;
									local346 = local221 & 0x1F;
									if (local346 == 0) {
										Static590.aClass390Array1[local73] = null;
										Static156.aClass44_62 = null;
										return true;
									}
									@Pc(2355) Class390 local2355 = new Class390();
									local2355.anInt11100 = local346;
									local2355.anInt11098 = Static481.aClass14_Sub29_Sub1_2.method5866();
									if (local2355.anInt11098 >= 0 && local2355.anInt11098 < Static399.aClass20Array10.length) {
										if (local2355.anInt11100 == 1 || local2355.anInt11100 == 10) {
											local2355.anInt11103 = Static481.aClass14_Sub29_Sub1_2.method5900();
											Static481.aClass14_Sub29_Sub1_2.anInt7264 += 6;
										} else if (local2355.anInt11100 >= 2 && local2355.anInt11100 <= 6) {
											if (local2355.anInt11100 == 2) {
												local2355.anInt11107 = 256;
												local2355.anInt11105 = 256;
											}
											if (local2355.anInt11100 == 3) {
												local2355.anInt11107 = 0;
												local2355.anInt11105 = 256;
											}
											if (local2355.anInt11100 == 4) {
												local2355.anInt11107 = 512;
												local2355.anInt11105 = 256;
											}
											if (local2355.anInt11100 == 5) {
												local2355.anInt11105 = 0;
												local2355.anInt11107 = 256;
											}
											if (local2355.anInt11100 == 6) {
												local2355.anInt11107 = 256;
												local2355.anInt11105 = 512;
											}
											local2355.anInt11100 = 2;
											local2355.anInt11102 = Static481.aClass14_Sub29_Sub1_2.method5866();
											local2355.anInt11107 += Static481.aClass14_Sub29_Sub1_2.method5900() - Static329.anInt6225 << 9;
											local2355.anInt11105 += Static481.aClass14_Sub29_Sub1_2.method5900() - Static202.anInt3755 << 9;
											local2355.anInt11109 = Static481.aClass14_Sub29_Sub1_2.method5866() << 2;
											local2355.anInt11099 = Static481.aClass14_Sub29_Sub1_2.method5900();
										}
										local2355.anInt11110 = Static481.aClass14_Sub29_Sub1_2.method5900();
										if (local2355.anInt11110 == 65535) {
											local2355.anInt11110 = -1;
										}
										Static590.aClass390Array1[local73] = local2355;
									}
									Static156.aClass44_62 = null;
									return true;
								} else if (Static513.aClass44_155 == Static156.aClass44_62) {
									local221 = Static481.aClass14_Sub29_Sub1_2.method5901();
									local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
									Static595.aClass241_1.method5816(local73, local221);
									Static156.aClass44_62 = null;
									return true;
								} else if (Static156.aClass44_62 == Static12.aClass44_4) {
									local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
									local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
									Static31.method717();
									Static400.method5987(local221, local73);
									Static156.aClass44_62 = null;
									return true;
								} else if (Static156.aClass44_62 == Static84.aClass44_43) {
									local221 = Static481.aClass14_Sub29_Sub1_2.method5878();
									Static31.method717();
									@Pc(2592) Class14_Sub32 local2592 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local221);
									if (local2592 != null) {
										Static446.method6502(local2592, true, false);
									}
									if (Static354.aClass230_5 != null) {
										Static634.method8860(Static354.aClass230_5);
										Static354.aClass230_5 = null;
									}
									Static156.aClass44_62 = null;
									return true;
								} else {
									@Pc(2632) boolean local2632;
									if (Static156.aClass44_62 == Static268.aClass44_91) {
										local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
										local73 = Static481.aClass14_Sub29_Sub1_2.method5888();
										local2632 = (local73 & 0x1) == 1;
										Static394.method5913(local221, local2632);
										Static34.anIntArray71[Static497.anInt10442++ & 0x1F] = local221;
										Static156.aClass44_62 = null;
										return true;
									} else if (Static571.aClass44_169 == Static156.aClass44_62) {
										Static664.method9224(Static481.aClass14_Sub29_Sub1_2.method5898());
										Static156.aClass44_62 = null;
										return true;
									} else {
										@Pc(2864) Class111 local2864;
										@Pc(2840) boolean local2840;
										if (Static156.aClass44_62 == Static319.aClass44_104) {
											Static233.anInt4277 = Static441.anInt7833;
											if (Static638.anInt10676 == 0) {
												Static3.anInt23 = 0;
												Static521.aString86 = null;
												Static156.aClass44_62 = null;
												Static437.aString79 = null;
												Static678.aClass111Array1 = null;
												return true;
											}
											Static437.aString79 = Static481.aClass14_Sub29_Sub1_2.method5898();
											local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
											if (local646) {
												Static481.aClass14_Sub29_Sub1_2.method5898();
											}
											@Pc(2709) long local2709 = Static481.aClass14_Sub29_Sub1_2.method5907();
											Static521.aString86 = Static627.method8803(local2709);
											Static467.aByte120 = Static481.aClass14_Sub29_Sub1_2.method5845();
											local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
											if (local350 == 255) {
												Static156.aClass44_62 = null;
												return true;
											}
											Static3.anInt23 = local350;
											@Pc(2733) Class111[] local2733 = new Class111[100];
											for (local360 = 0; local360 < Static3.anInt23; local360++) {
												local2733[local360] = new Class111();
												local2733[local360].aString42 = Static481.aClass14_Sub29_Sub1_2.method5898();
												local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
												if (local646) {
													local2733[local360].aString39 = Static481.aClass14_Sub29_Sub1_2.method5898();
												} else {
													local2733[local360].aString39 = local2733[local360].aString42;
												}
												local2733[local360].aString41 = Static566.method8154(local2733[local360].aString39);
												local2733[local360].anInt3251 = Static481.aClass14_Sub29_Sub1_2.method5900();
												local2733[local360].aByte68 = Static481.aClass14_Sub29_Sub1_2.method5845();
												local2733[local360].aString40 = Static481.aClass14_Sub29_Sub1_2.method5898();
												if (local2733[local360].aString39.equals(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35)) {
													Static75.aByte38 = local2733[local360].aByte68;
												}
											}
											local372 = Static3.anInt23;
											while (local372 > 0) {
												local2840 = true;
												local372--;
												for (local923 = 0; local923 < local372; local923++) {
													if (local2733[local923].aString41.compareTo(local2733[local923 + 1].aString41) > 0) {
														local2864 = local2733[local923];
														local2733[local923] = local2733[local923 + 1];
														local2733[local923 + 1] = local2864;
														local2840 = false;
													}
												}
												if (local2840) {
													break;
												}
											}
											Static156.aClass44_62 = null;
											Static678.aClass111Array1 = local2733;
											return true;
										}
										@Pc(2936) boolean local2936;
										@Pc(2959) String local2959;
										if (Static672.aClass44_189 == Static156.aClass44_62) {
											local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
											local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
											local1881 = local316;
											if (local646) {
												local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
											}
											local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
											local356 = Static481.aClass14_Sub29_Sub1_2.method5900();
											local2936 = false;
											if (local350 <= 1 && Static239.method3588(local1881)) {
												local2936 = true;
											}
											if (!local2936 && Static325.anInt6165 == 0) {
												local2959 = Static526.aClass266_1.method6436(local356).method8788(Static481.aClass14_Sub29_Sub1_2);
												if (local350 == 2) {
													Static198.method3031(0, local2959, 25, "<img=1>" + local1881, (String) null, local316, "<img=1>" + local316, local356);
												} else if (local350 == 1) {
													Static198.method3031(0, local2959, 25, "<img=0>" + local1881, (String) null, local316, "<img=0>" + local316, local356);
												} else {
													Static198.method3031(0, local2959, 25, local1881, (String) null, local316, local316, local356);
												}
											}
											Static156.aClass44_62 = null;
											return true;
										} else if (Static156.aClass44_62 == Static388.aClass44_130) {
											local221 = Static481.aClass14_Sub29_Sub1_2.method5901();
											local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
											if (local73 == 65535) {
												local73 = -1;
											}
											local346 = Static481.aClass14_Sub29_Sub1_2.method5878();
											Static31.method717();
											Static313.method7479(local221, local346, local73);
											@Pc(3070) Class27 local3070 = Static175.aClass247_2.method5962(local73);
											Static279.method4046(local3070.anInt961, local346, local3070.anInt935, local3070.anInt948);
											Static78.method1479(local346, local3070.anInt911, local3070.anInt930, local3070.anInt939);
											Static156.aClass44_62 = null;
											return true;
										} else if (Static156.aClass44_62 == Static408.aClass44_128) {
											Static595.aClass241_1.method5818();
											Static156.aClass44_62 = null;
											Static665.anInt4337 += 32;
											return true;
										} else {
											@Pc(3113) String local3113;
											if (Static156.aClass44_62 == Static390.aClass44_131) {
												local3113 = Static481.aClass14_Sub29_Sub1_2.method5898();
												local316 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
												Static149.method5512(local3113, local3113, local316, 6, 0, local3113);
												Static156.aClass44_62 = null;
												return true;
											} else if (Static156.aClass44_62 == Static616.aClass44_174) {
												Static474.anInt2217 = Static481.aClass14_Sub29_Sub1_2.method5888();
												Static53.anInt1297 = Static481.aClass14_Sub29_Sub1_2.method5880() << 3;
												Static405.anInt7422 = Static481.aClass14_Sub29_Sub1_2.method5906() << 3;
												Static156.aClass44_62 = null;
												return true;
											} else if (Static267.aClass44_89 == Static156.aClass44_62) {
												Static15.method140(Static360.aClass395_10);
												Static156.aClass44_62 = null;
												return true;
											} else if (Static156.aClass44_62 == Static164.aClass44_64) {
												Static53.anInt1297 = Static481.aClass14_Sub29_Sub1_2.method5906() << 3;
												Static405.anInt7422 = Static481.aClass14_Sub29_Sub1_2.method5877() << 3;
												Static474.anInt2217 = Static481.aClass14_Sub29_Sub1_2.method5842();
												for (@Pc(3190) Class14_Sub42 local3190 = (Class14_Sub42) Static568.aClass187_71.method4079(); local3190 != null; local3190 = (Class14_Sub42) Static568.aClass187_71.method4084()) {
													local73 = (int) (local3190.aLong305 >> 28 & 0x3L);
													local346 = (int) (local3190.aLong305 & 0x3FFFL);
													local350 = local346 - Static329.anInt6225;
													local356 = (int) (local3190.aLong305 >> 14 & 0x3FFFL);
													local360 = local356 - Static202.anInt3755;
													if (Static474.anInt2217 == local73 && local350 >= Static405.anInt7422 && Static405.anInt7422 + 8 > local350 && local360 >= Static53.anInt1297 && Static53.anInt1297 + 8 > local360) {
														local3190.method9315();
														if (local350 >= 0 && local360 >= 0 && local350 < Static26.anInt462 && local360 < Static445.anInt6140) {
															Static236.method3563(local350, Static474.anInt2217, local360);
														}
													}
												}
												@Pc(3290) Class14_Sub9 local3290;
												for (local3290 = (Class14_Sub9) Static605.aClass262_69.method6318(); local3290 != null; local3290 = (Class14_Sub9) Static605.aClass262_69.method6311()) {
													if (Static405.anInt7422 <= local3290.anInt1584 && Static405.anInt7422 + 8 > local3290.anInt1584 && Static53.anInt1297 <= local3290.anInt1586 && Static53.anInt1297 + 8 > local3290.anInt1586 && Static474.anInt2217 == local3290.anInt1592) {
														local3290.aBoolean122 = true;
													}
												}
												for (local3290 = (Class14_Sub9) Static659.aClass262_74.method6318(); local3290 != null; local3290 = (Class14_Sub9) Static659.aClass262_74.method6311()) {
													if (Static405.anInt7422 <= local3290.anInt1584 && Static405.anInt7422 + 8 > local3290.anInt1584 && Static53.anInt1297 <= local3290.anInt1586 && local3290.anInt1586 < Static53.anInt1297 + 8 && local3290.anInt1592 == Static474.anInt2217) {
														local3290.aBoolean122 = true;
													}
												}
												Static156.aClass44_62 = null;
												return true;
											} else if (Static672.aClass44_188 == Static156.aClass44_62) {
												local3113 = Static481.aClass14_Sub29_Sub1_2.method5898();
												@Pc(3398) Object[] local3398 = new Object[local3113.length() + 1];
												for (local346 = local3113.length() - 1; local346 >= 0; local346--) {
													if (local3113.charAt(local346) == 's') {
														local3398[local346 + 1] = Static481.aClass14_Sub29_Sub1_2.method5898();
													} else {
														local3398[local346 + 1] = Integer.valueOf(Static481.aClass14_Sub29_Sub1_2.method5878());
													}
												}
												local3398[0] = Integer.valueOf(Static481.aClass14_Sub29_Sub1_2.method5878());
												Static31.method717();
												@Pc(3455) Class14_Sub55 local3455 = new Class14_Sub55();
												local3455.anObjectArray33 = local3398;
												Static632.method8830(local3455);
												Static156.aClass44_62 = null;
												return true;
											} else if (Static156.aClass44_62 == Static59.aClass44_33) {
												Static218.anInt4113 = Static441.anInt7833;
												local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
												if (Static638.anInt10676 != 1) {
													if (local646) {
														Static128.aClass229_1 = new Class229(Static481.aClass14_Sub29_Sub1_2);
													} else {
														Static432.aClass229_2 = new Class229(Static481.aClass14_Sub29_Sub1_2);
													}
													Static156.aClass44_62 = null;
													return true;
												}
												if (local646) {
													Static128.aClass229_1 = null;
												} else {
													Static432.aClass229_2 = null;
												}
												Static156.aClass44_62 = null;
												return true;
											} else if (Static156.aClass44_62 == Static434.aClass44_141) {
												local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
												local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
												local346 = Static481.aClass14_Sub29_Sub1_2.method5884();
												Static31.method717();
												Static150.method2366(local346 + (local73 << 16), local221);
												Static156.aClass44_62 = null;
												return true;
											} else if (Static478.aClass44_150 == Static156.aClass44_62) {
												Static88.aClass372_11 = Static30.method691(Static481.aClass14_Sub29_Sub1_2.method5866());
												Static156.aClass44_62 = null;
												return true;
											} else if (Static126.aClass44_55 == Static156.aClass44_62) {
												local221 = Static481.aClass14_Sub29_Sub1_2.method5884() << 2;
												local73 = Static481.aClass14_Sub29_Sub1_2.method5888();
												local346 = Static481.aClass14_Sub29_Sub1_2.method5846();
												local350 = Static481.aClass14_Sub29_Sub1_2.method5846();
												local356 = Static481.aClass14_Sub29_Sub1_2.method5888();
												Static31.method717();
												Static176.method2829(local73, local221, local346, local356, local350);
												Static156.aClass44_62 = null;
												return true;
											} else {
												@Pc(3697) String local3697;
												if (Static232.aClass44_80 == Static156.aClass44_62) {
													local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
													local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
													local1881 = local316;
													if (local646) {
														local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
													}
													local2101 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
													local2106 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
													local368 = Static481.aClass14_Sub29_Sub1_2.method5866();
													local372 = Static481.aClass14_Sub29_Sub1_2.method5900();
													@Pc(3646) long local3646 = (local2101 << 32) + local2106;
													local1037 = false;
													local757 = 0;
													while (true) {
														if (local757 >= 100) {
															if (local368 <= 1 && Static239.method3588(local1881)) {
																local1037 = true;
															}
															break;
														}
														if (local3646 == Static299.aLongArray7[local757]) {
															local1037 = true;
															break;
														}
														local757++;
													}
													if (!local1037 && Static325.anInt6165 == 0) {
														Static299.aLongArray7[Static302.anInt10116] = local3646;
														Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
														local3697 = Static526.aClass266_1.method6436(local372).method8788(Static481.aClass14_Sub29_Sub1_2);
														if (local368 == 2) {
															Static198.method3031(0, local3697, 18, "<img=1>" + local1881, (String) null, local316, "<img=1>" + local316, local372);
														} else if (local368 == 1) {
															Static198.method3031(0, local3697, 18, "<img=0>" + local1881, (String) null, local316, "<img=0>" + local316, local372);
														} else {
															Static198.method3031(0, local3697, 18, local1881, (String) null, local316, local316, local372);
														}
													}
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static373.aClass44_119) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
													local346 = Static481.aClass14_Sub29_Sub1_2.method5888();
													Static240.anIntArray339[local346] = local221;
													Static94.anIntArray154[local346] = local73;
													Static311.anIntArray433[local346] = 1;
													local350 = Static630.anIntArray782[local346] - 1;
													for (local356 = 0; local356 < local350; local356++) {
														if (Class53_Sub1.anIntArray117[local356] <= local221) {
															Static311.anIntArray433[local346] = local356 + 2;
														}
													}
													Static285.anIntArray394[Static286.anInt4884++ & 0x1F] = local346;
													Static156.aClass44_62 = null;
													return true;
												} else if (Static677.aClass44_190 == Static156.aClass44_62) {
													Static15.method140(Static603.aClass395_16);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static634.aClass44_181) {
													@Pc(3934) boolean local3934;
													while (Static481.aClass14_Sub29_Sub1_2.anInt7264 < Static638.anInt10676) {
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local356 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local450 = "";
														local2840 = false;
														if (local350 > 0) {
															local450 = Static481.aClass14_Sub29_Sub1_2.method5898();
															local2840 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														}
														for (local368 = 0; local368 < Static592.anInt1870; local368++) {
															if (local646) {
																if (local1881.equals(Static369.aStringArray24[local368])) {
																	Static369.aStringArray24[local368] = local316;
																	local316 = null;
																	Static570.aStringArray37[local368] = local1881;
																	break;
																}
															} else if (local316.equals(Static369.aStringArray24[local368])) {
																if (Static620.anIntArray765[local368] != local350) {
																	local3934 = true;
																	for (@Pc(3939) Class12_Sub7_Sub1 local3939 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9008(); local3939 != null; local3939 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9014()) {
																		if (local3939.aString66.equals(local316)) {
																			if (local350 != 0 && local3939.aShort69 == 0) {
																				local3934 = false;
																				local3939.method9143();
																			} else if (local350 == 0 && local3939.aShort69 != 0) {
																				local3939.method9143();
																				local3934 = false;
																			}
																		}
																	}
																	if (local3934) {
																		Static548.aClass376_9.method9011(new Class12_Sub7_Sub1(local316, local350));
																	}
																	Static620.anIntArray765[local368] = local350;
																}
																Static570.aStringArray37[local368] = local1881;
																Static674.aStringArray47[local368] = local450;
																Static555.anIntArray694[local368] = local356;
																local316 = null;
																Static267.aBooleanArray14[local368] = local2840;
																break;
															}
														}
														if (local316 != null && Static592.anInt1870 < 200) {
															Static369.aStringArray24[Static592.anInt1870] = local316;
															Static570.aStringArray37[Static592.anInt1870] = local1881;
															Static620.anIntArray765[Static592.anInt1870] = local350;
															Static674.aStringArray47[Static592.anInt1870] = local450;
															Static555.anIntArray694[Static592.anInt1870] = local356;
															Static267.aBooleanArray14[Static592.anInt1870] = local2840;
															Static592.anInt1870++;
														}
													}
													Static491.anInt8761 = 2;
													Static619.anInt10403 = Static441.anInt7833;
													local73 = Static592.anInt1870;
													while (local73 > 0) {
														local73--;
														local646 = true;
														for (local346 = 0; local346 < local73; local346++) {
															if (Static92.aClass337_1.anInt9843 != Static620.anIntArray765[local346] && Static92.aClass337_1.anInt9843 == Static620.anIntArray765[local346 + 1] || Static620.anIntArray765[local346] == 0 && Static620.anIntArray765[local346 + 1] != 0) {
																local350 = Static620.anIntArray765[local346];
																Static620.anIntArray765[local346] = Static620.anIntArray765[local346 + 1];
																Static620.anIntArray765[local346 + 1] = local350;
																local419 = Static674.aStringArray47[local346];
																Static674.aStringArray47[local346] = Static674.aStringArray47[local346 + 1];
																Static674.aStringArray47[local346 + 1] = local419;
																local450 = Static369.aStringArray24[local346];
																Static369.aStringArray24[local346] = Static369.aStringArray24[local346 + 1];
																Static369.aStringArray24[local346 + 1] = local450;
																local2959 = Static570.aStringArray37[local346];
																Static570.aStringArray37[local346] = Static570.aStringArray37[local346 + 1];
																Static570.aStringArray37[local346 + 1] = local2959;
																local368 = Static555.anIntArray694[local346];
																Static555.anIntArray694[local346] = Static555.anIntArray694[local346 + 1];
																Static555.anIntArray694[local346 + 1] = local368;
																local3934 = Static267.aBooleanArray14[local346];
																Static267.aBooleanArray14[local346] = Static267.aBooleanArray14[local346 + 1];
																local646 = false;
																Static267.aBooleanArray14[local346 + 1] = local3934;
															}
														}
														if (local646) {
															break;
														}
													}
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static359.aClass44_115) {
													Static31.method717();
													Static306.method4487();
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static629.aClass44_180) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5840();
													local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
													local350 = Static481.aClass14_Sub29_Sub1_2.method5864();
													Static31.method717();
													Static279.method4046(local221, local350, local346, local73);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static319.aClass44_105) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5840();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5840();
													Static31.method717();
													Static542.method7658(local221, local73);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static267.aClass44_90 == Static156.aClass44_62) {
													Static312.aByte88 = Static481.aClass14_Sub29_Sub1_2.method5906();
													if (Static312.aByte88 == 0 || Static312.aByte88 == 1) {
														Static573.aBoolean698 = true;
													}
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static569.aClass44_168) {
													local3113 = Static481.aClass14_Sub29_Sub1_2.method5898();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5846();
													local346 = Static481.aClass14_Sub29_Sub1_2.method5884();
													if (local346 == 65535) {
														local346 = -1;
													}
													local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
													if (local73 >= 1 && local73 <= 8) {
														if (local3113.equalsIgnoreCase("null")) {
															local3113 = null;
														}
														Static244.aStringArray12[local73 - 1] = local3113;
														Static371.anIntArray496[local73 - 1] = local346;
														Static253.aBooleanArray13[local73 - 1] = local350 == 0;
													}
													Static156.aClass44_62 = null;
													return true;
												} else if (Static82.aClass44_41 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
													if (local221 == 65535) {
														local221 = -1;
													}
													local73 = Static481.aClass14_Sub29_Sub1_2.method5864();
													Static31.method717();
													Static142.method2221(local73, local221, 2, -1);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static484.aClass44_152 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5866();
													if (Static481.aClass14_Sub29_Sub1_2.method5866() == 0) {
														Static294.aClass272Array1[local221] = new Class272();
													} else {
														Static481.aClass14_Sub29_Sub1_2.anInt7264--;
														Static294.aClass272Array1[local221] = new Class272(Static481.aClass14_Sub29_Sub1_2);
													}
													Static156.aClass44_62 = null;
													Static308.anInt5374 = Static441.anInt7833;
													return true;
												} else if (Static156.aClass44_62 == Static20.aClass44_187) {
													Static15.method140(Static428.aClass395_13);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static77.aClass44_38 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5878();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5876();
													local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
													local350 = Static481.aClass14_Sub29_Sub1_2.method5900();
													Static31.method717();
													Static142.method2221(local221, local346 << 16 | local350, 7, local73);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static423.aClass44_139) {
													Static107.anInt2234 = Static481.aClass14_Sub29_Sub1_2.method5888();
													Static545.anInt9311 = Static481.aClass14_Sub29_Sub1_2.method5888();
													Static156.aClass44_62 = null;
													return true;
												} else if (Static200.aClass44_73 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5901();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5856();
													Static31.method717();
													Static645.method9003(local221, local73);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static646.aClass44_184 == Static156.aClass44_62) {
													Static15.method140(Static134.aClass395_8);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static135.aClass44_57) {
													Static175.method2825();
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static479.aClass44_151) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5846();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5876();
													Static595.aClass241_1.method5815(local73, local221);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static429.aClass44_86 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5842();
													local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
													local346 = Static481.aClass14_Sub29_Sub1_2.method5840();
													local350 = Static481.aClass14_Sub29_Sub1_2.method5901();
													Static31.method717();
													Static180.method2865(local73, local350, local221, local346);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static156.aClass44_62 == Static215.aClass44_77) {
													Static128.method2105(Static47.aBoolean98);
													Static156.aClass44_62 = null;
													return false;
												} else if (Static324.aClass44_107 == Static156.aClass44_62) {
													Static579.method8269(Static638.anInt10676, Static481.aClass14_Sub29_Sub1_2);
													Static156.aClass44_62 = null;
													return true;
												} else if (Static440.aClass44_142 == Static156.aClass44_62) {
													local221 = Static481.aClass14_Sub29_Sub1_2.method5878();
													Static651.aClass150_11 = Static234.aClass333_5.method8132(local221);
													Static156.aClass44_62 = null;
													return true;
												} else {
													@Pc(4700) boolean local4700;
													if (Static239.aClass44_81 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
														@Pc(4674) Class12_Sub2_Sub2_Sub1_Sub2 local4674;
														if (Static568.anInt9800 == local221) {
															local4674 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2;
														} else {
															local4674 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local221];
														}
														if (local4674 == null) {
															Static156.aClass44_62 = null;
															return true;
														}
														local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local4700 = (local346 & 0x8000) != 0;
														if (local4674.aString35 != null && local4674.aClass325_1 != null) {
															local2936 = false;
															if (local350 <= 1) {
																if (!local4700 && (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234)) {
																	local2936 = true;
																} else if (Static239.method3588(local4674.aString35)) {
																	local2936 = true;
																}
															}
															if (!local2936 && Static325.anInt6165 == 0) {
																local368 = -1;
																if (local4700) {
																	local346 &= 0x7FFF;
																	@Pc(4750) Class207 local4750 = Static179.method2849(Static481.aClass14_Sub29_Sub1_2);
																	local368 = local4750.anInt6123;
																	local2959 = local4750.aClass14_Sub3_Sub20_1.method8788(Static481.aClass14_Sub29_Sub1_2);
																} else {
																	local2959 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
																}
																local4674.aString33 = local2959.trim();
																local4674.anInt2922 = local346 & 0xFF;
																local4674.anInt2910 = 150;
																local4674.anInt2944 = local346 >> 8;
																if (local350 == 1 || local350 == 2) {
																	local372 = local4700 ? 17 : 1;
																} else {
																	local372 = local4700 ? 17 : 2;
																}
																if (local350 == 2) {
																	Static198.method3031(0, local2959, local372, "<img=1>" + local4674.method2443(), (String) null, local4674.aString34, "<img=1>" + local4674.method2440(), local368);
																} else if (local350 == 1) {
																	Static198.method3031(0, local2959, local372, "<img=0>" + local4674.method2443(), (String) null, local4674.aString34, "<img=0>" + local4674.method2440(), local368);
																} else {
																	Static198.method3031(0, local2959, local372, local4674.method2443(), (String) null, local4674.aString34, local4674.method2440(), local368);
																}
															}
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static46.aClass44_24 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5846();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5878();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5876();
														Static31.method717();
														local244 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local73);
														if (local244 != null) {
															Static446.method6502(local244, local244.anInt6351 != local346, false);
														}
														Static403.method5994(false, local73, local346, local221);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static397.aClass44_135 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5840();
														Static31.method717();
														Static181.method2292(local221, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static124.aClass44_54) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
														Static31.method717();
														if (Static559.aClass230ArrayArray2[local221] != null) {
															for (local350 = local73; local350 < local346; local350++) {
																local356 = Static481.aClass14_Sub29_Sub1_2.method5862();
																if (Static559.aClass230ArrayArray2[local221].length > local350 && Static559.aClass230ArrayArray2[local221][local350] != null) {
																	Static559.aClass230ArrayArray2[local221][local350].anInt6718 = local356;
																}
															}
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static250.aClass44_84) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5888();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5840();
														local356 = Static481.aClass14_Sub29_Sub1_2.method5846();
														Static31.method717();
														Static569.aBooleanArray26[local221] = true;
														Static432.anIntArray569[local221] = local356;
														Static111.anIntArray174[local221] = local346;
														Static469.anIntArray827[local221] = local73;
														Static417.anIntArray788[local221] = local350;
														Static156.aClass44_62 = null;
														return true;
													} else if (Static380.aClass44_123 == Static156.aClass44_62) {
														Static38.anInt996 = Static481.aClass14_Sub29_Sub1_2.method5890();
														Static514.anInt9026 = Static441.anInt7833;
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static380.aClass44_121) {
														Static474.anInt2217 = Static481.aClass14_Sub29_Sub1_2.method5842();
														Static53.anInt1297 = Static481.aClass14_Sub29_Sub1_2.method5880() << 3;
														Static405.anInt7422 = Static481.aClass14_Sub29_Sub1_2.method5880() << 3;
														while (Static481.aClass14_Sub29_Sub1_2.anInt7264 < Static638.anInt10676) {
															@Pc(5140) Class395 local5140 = Static234.method3546()[Static481.aClass14_Sub29_Sub1_2.method5866()];
															Static15.method140(local5140);
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static1.aClass44_173 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5876();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5901();
														Static31.method717();
														Static142.method2221(local221, local73, 5, local346);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static380.aClass44_122 == Static156.aClass44_62) {
														Static15.method140(Static32.aClass395_15);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static333.aClass44_111) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5846();
														local1512 = Static481.aClass14_Sub29_Sub1_2.method5906();
														Static31.method717();
														Static518.method8575(local1512, local221);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static391.aClass44_133) {
														Static313.anInt9043 = Static481.aClass14_Sub29_Sub1_2.method5866();
														Static156.aClass44_62 = null;
														Static514.anInt9026 = Static441.anInt7833;
														return true;
													} else if (Static525.aClass44_158 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local2632 = (local73 & 0x1) == 1;
														Static11.method435(local221, local2632);
														local350 = Static481.aClass14_Sub29_Sub1_2.method5900();
														for (local356 = 0; local356 < local350; local356++) {
															local360 = Static481.aClass14_Sub29_Sub1_2.method5840();
															local364 = Static481.aClass14_Sub29_Sub1_2.method5842();
															if (local364 == 255) {
																local364 = Static481.aClass14_Sub29_Sub1_2.method5864();
															}
															Static270.method3947(local356, local360 - 1, local364, local2632, local221);
														}
														Static34.anIntArray71[Static497.anInt10442++ & 0x1F] = local221;
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static599.aClass44_108) {
														Static128.method2105(false);
														Static156.aClass44_62 = null;
														return false;
													} else if (Static425.aClass44_140 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
														Static31.method717();
														Static142.method2221(local221, -1, 3, -1);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static202.aClass44_74 == Static156.aClass44_62) {
														Static15.method140(Static216.aClass395_7);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static100.aClass44_47) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5842();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5900() << 2;
														local346 = Static481.aClass14_Sub29_Sub1_2.method5846();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5842();
														local356 = Static481.aClass14_Sub29_Sub1_2.method5888();
														Static31.method717();
														Static27.method614(local350, true, local346, local356, local221, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static592.aClass44_45 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5840();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5846();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5878();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5876();
														Static31.method717();
														Static187.method2944(local346, local73, local221, local350);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static647.aClass44_185) {
														Static481.aClass14_Sub29_Sub1_2.anInt7264 += 28;
														if (Static481.aClass14_Sub29_Sub1_2.method5850()) {
															Static388.method5808(Static481.aClass14_Sub29_Sub1_2.anInt7264 - 28, Static481.aClass14_Sub29_Sub1_2);
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static536.aClass44_161 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5888();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5840();
														Static31.method717();
														Static384.method5714(local73, local221, true);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static79.aClass44_39) {
														Static444.anInt7851 = Static441.anInt7833;
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														@Pc(5496) Class219 local5496 = new Class219(Static481.aClass14_Sub29_Sub1_2);
														@Pc(5500) Class14_Sub25 local5500;
														if (local646) {
															local5500 = Static323.aClass14_Sub25_2;
														} else {
															local5500 = Static64.aClass14_Sub25_1;
														}
														local5496.method5285(local5500);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static242.aClass44_82 == Static156.aClass44_62) {
														Static15.method140(Static42.aClass395_3);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static465.aClass44_147) {
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local655 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
														local660 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
														local364 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local368 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local2116 = (local655 << 32) + local660;
														local2118 = false;
														@Pc(5574) Class14_Sub25 local5574 = local646 ? Static323.aClass14_Sub25_2 : Static64.aClass14_Sub25_1;
														if (local5574 == null) {
															local2118 = true;
														} else {
															label2177: {
																for (local757 = 0; local757 < 100; local757++) {
																	if (Static299.aLongArray7[local757] == local2116) {
																		local2118 = true;
																		break label2177;
																	}
																}
																if (local364 <= 1 && Static239.method3588(local316)) {
																	local2118 = true;
																}
															}
														}
														if (!local2118 && Static325.anInt6165 == 0) {
															Static299.aLongArray7[Static302.anInt10116] = local2116;
															Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
															local3697 = Static526.aClass266_1.method6436(local368).method8788(Static481.aClass14_Sub29_Sub1_2);
															local956 = local646 ? 42 : 45;
															if (local364 == 2 || local364 == 3) {
																Static198.method3031(0, local3697, local956, "<img=1>" + local316, local5574.aString48, local316, "<img=1>" + local316, local368);
															} else if (local364 == 1) {
																Static198.method3031(0, local3697, local956, "<img=0>" + local316, local5574.aString48, local316, "<img=0>" + local316, local368);
															} else {
																Static198.method3031(0, local3697, local956, local316, local5574.aString48, local316, local316, local368);
															}
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static12.aClass44_3) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local2632 = (local73 & 0x1) == 1;
														while (Static638.anInt10676 > Static481.aClass14_Sub29_Sub1_2.anInt7264) {
															local350 = Static481.aClass14_Sub29_Sub1_2.method5895();
															local356 = Static481.aClass14_Sub29_Sub1_2.method5900();
															local360 = 0;
															if (local356 != 0) {
																local360 = Static481.aClass14_Sub29_Sub1_2.method5866();
																if (local360 == 255) {
																	local360 = Static481.aClass14_Sub29_Sub1_2.method5878();
																}
															}
															Static270.method3947(local350, local356 - 1, local360, local2632, local221);
														}
														Static34.anIntArray71[Static497.anInt10442++ & 0x1F] = local221;
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static652.aClass44_186) {
														if (Static25.method478(Static430.anInt7691)) {
															Static192.anInt3587 = (int) ((float) Static481.aClass14_Sub29_Sub1_2.method5900() * 2.5F);
														} else {
															Static192.anInt3587 = Static481.aClass14_Sub29_Sub1_2.method5900() * 30;
														}
														Static156.aClass44_62 = null;
														Static514.anInt9026 = Static441.anInt7833;
														return true;
													} else if (Static156.aClass44_62 == Static184.aClass44_68) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5846();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5864();
														Static31.method717();
														Static129.method5679(local73, local221);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static154.aClass44_61) {
														local3113 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local1881 = Static526.aClass266_1.method6436(local73).method8788(Static481.aClass14_Sub29_Sub1_2);
														Static198.method3031(0, local1881, 19, local3113, (String) null, local3113, local3113, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static567.aClass44_167) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5876();
														Static31.method717();
														Static297.method4371(local221);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static524.aClass44_157 == Static156.aClass44_62) {
														@Pc(5909) byte local5909 = Static481.aClass14_Sub29_Sub1_2.method5845();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5884();
														Static31.method717();
														Static400.method5987(local5909, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static47.aClass44_25 == Static156.aClass44_62) {
														Static15.method140(Static230.aClass395_9);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static324.aClass44_106 == Static156.aClass44_62) {
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														@Pc(5953) byte[] local5953 = new byte[Static638.anInt10676 - 1];
														Static481.aClass14_Sub29_Sub1_2.method5860(local5953, 0, Static638.anInt10676 - 1);
														Static191.method2986(local646, local5953);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static171.aClass44_65 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5884();
														local73 = Static481.aClass14_Sub29_Sub1_2.method5901();
														Static31.method717();
														Static146.method2328(local221, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static318.aClass44_103) {
														if (Static563.anInt9769 != -1) {
															Static233.method3542(Static563.anInt9769, 0);
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static150.aClass44_59) {
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local1881 = local316;
														if (local646) {
															local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
														}
														local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local4700 = false;
														if (local350 <= 1) {
															if (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234) {
																local4700 = true;
															} else if (local350 <= 1 && Static239.method3588(local1881)) {
																local4700 = true;
															}
														}
														if (!local4700 && Static325.anInt6165 == 0) {
															local450 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
															if (local350 == 2) {
																Static198.method3031(0, local450, 24, "<img=1>" + local1881, (String) null, local316, "<img=1>" + local316, -1);
															} else if (local350 == 1) {
																Static198.method3031(0, local450, 24, "<img=0>" + local1881, (String) null, local316, "<img=0>" + local316, -1);
															} else {
																Static198.method3031(0, local450, 24, local1881, (String) null, local316, local316, -1);
															}
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static153.aClass44_60 == Static156.aClass44_62) {
														Static156.aClass44_62 = null;
														Static491.anInt8761 = 1;
														Static619.anInt10403 = Static441.anInt7833;
														return true;
													} else if (Static10.aClass44_2 == Static156.aClass44_62) {
														Static15.method140(Static419.aClass395_11);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static216.aClass44_78 == Static156.aClass44_62) {
														for (local221 = 0; local221 < Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1.length; local221++) {
															if (Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local221] != null) {
																Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local221].anIntArray234 = null;
																Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local221].anInt2921 = -1;
															}
														}
														for (local73 = 0; local73 < Static570.anInt9823; local73++) {
															Static151.aClass14_Sub44Array1[local73].aClass12_Sub2_Sub2_Sub1_Sub1_2.anIntArray234 = null;
															Static151.aClass14_Sub44Array1[local73].aClass12_Sub2_Sub2_Sub1_Sub1_2.anInt2921 = -1;
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static346.aClass44_112 == Static156.aClass44_62) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5876();
														Static31.method717();
														Static107.method1894(local221);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static196.aClass44_72) {
														local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
														local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
														local1881 = local316;
														if (local646) {
															local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
														}
														local2101 = Static481.aClass14_Sub29_Sub1_2.method5907();
														local2106 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
														local671 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
														local923 = Static481.aClass14_Sub29_Sub1_2.method5866();
														@Pc(6291) long local6291 = (local2106 << 32) + local671;
														local1253 = false;
														local956 = 0;
														while (true) {
															if (local956 >= 100) {
																if (local923 <= 1) {
																	if (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234) {
																		local1253 = true;
																	} else if (Static239.method3588(local1881)) {
																		local1253 = true;
																	}
																}
																break;
															}
															if (Static299.aLongArray7[local956] == local6291) {
																local1253 = true;
																break;
															}
															local956++;
														}
														if (!local1253 && Static325.anInt6165 == 0) {
															Static299.aLongArray7[Static302.anInt10116] = local6291;
															Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
															@Pc(6355) String local6355 = Static383.method5698(Static629.method8813(Static481.aClass14_Sub29_Sub1_2));
															if (local923 == 2 || local923 == 3) {
																Static198.method3031(0, local6355, 9, "<img=1>" + local1881, Static479.method7116(local2101), local316, "<img=1>" + local316, -1);
															} else if (local923 == 1) {
																Static198.method3031(0, local6355, 9, "<img=0>" + local1881, Static479.method7116(local2101), local316, "<img=0>" + local316, -1);
															} else {
																Static198.method3031(0, local6355, 9, local1881, Static479.method7116(local2101), local316, local316, -1);
															}
														}
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static13.aClass44_5) {
														local221 = Static481.aClass14_Sub29_Sub1_2.method5900();
														if (local221 == 65535) {
															local221 = -1;
														}
														local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
														local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
														local350 = Static481.aClass14_Sub29_Sub1_2.method5866();
														Static503.method7357(256, local350, local346, true, local221, local73);
														Static156.aClass44_62 = null;
														return true;
													} else if (Static30.aClass44_16 == Static156.aClass44_62) {
														Static31.method717();
														Static14.method133();
														Static156.aClass44_62 = null;
														return true;
													} else if (Static156.aClass44_62 == Static285.aClass44_96) {
														Static15.method140(Static21.aClass395_1);
														Static156.aClass44_62 = null;
														return true;
													} else {
														@Pc(6561) Class14_Sub33 local6561;
														@Pc(6552) Class14_Sub33 local6552;
														if (Static156.aClass44_62 == Static620.aClass44_176) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5876();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5878();
															local346 = Static481.aClass14_Sub29_Sub1_2.method5840();
															if (local346 == 65535) {
																local346 = -1;
															}
															local350 = Static481.aClass14_Sub29_Sub1_2.method5884();
															if (local350 == 65535) {
																local350 = -1;
															}
															Static31.method717();
															for (local356 = local346; local356 <= local350; local356++) {
																local2106 = (long) local356 + ((long) local73 << 32);
																local6552 = (Class14_Sub33) Static476.aClass187_59.method4078(local2106);
																if (local6552 != null) {
																	local6561 = new Class14_Sub33(local6552.anInt6586, local221);
																	local6552.method9315();
																} else if (local356 == -1) {
																	local6561 = new Class14_Sub33(Static655.method9094(local73).aClass14_Sub33_2.anInt6586, local221);
																} else {
																	local6561 = new Class14_Sub33(0, local221);
																}
																Static476.aClass187_59.method4077(local2106, local6561);
															}
															Static156.aClass44_62 = null;
															return true;
														} else if (Static156.aClass44_62 == Static66.aClass44_36) {
															local646 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
															local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
															local1881 = local316;
															if (local646) {
																local1881 = Static481.aClass14_Sub29_Sub1_2.method5898();
															}
															local2101 = Static481.aClass14_Sub29_Sub1_2.method5907();
															local2106 = (long) Static481.aClass14_Sub29_Sub1_2.method5900();
															local671 = (long) Static481.aClass14_Sub29_Sub1_2.method5862();
															local923 = Static481.aClass14_Sub29_Sub1_2.method5866();
															local929 = Static481.aClass14_Sub29_Sub1_2.method5900();
															@Pc(6658) long local6658 = local671 + (local2106 << 32);
															@Pc(6660) boolean local6660 = false;
															local1417 = 0;
															while (true) {
																if (local1417 >= 100) {
																	if (local923 <= 1 && Static239.method3588(local1881)) {
																		local6660 = true;
																	}
																	break;
																}
																if (Static299.aLongArray7[local1417] == local6658) {
																	local6660 = true;
																	break;
																}
																local1417++;
															}
															if (!local6660 && Static325.anInt6165 == 0) {
																Static299.aLongArray7[Static302.anInt10116] = local6658;
																Static302.anInt10116 = (Static302.anInt10116 + 1) % 100;
																@Pc(6717) String local6717 = Static526.aClass266_1.method6436(local929).method8788(Static481.aClass14_Sub29_Sub1_2);
																if (local923 == 2) {
																	Static198.method3031(0, local6717, 20, "<img=1>" + local1881, Static479.method7116(local2101), local316, "<img=1>" + local316, local929);
																} else if (local923 == 1) {
																	Static198.method3031(0, local6717, 20, "<img=0>" + local1881, Static479.method7116(local2101), local316, "<img=0>" + local316, local929);
																} else {
																	Static198.method3031(0, local6717, 20, local1881, Static479.method7116(local2101), local316, local316, local929);
																}
															}
															Static156.aClass44_62 = null;
															return true;
														} else if (Static156.aClass44_62 == Static45.aClass44_23) {
															Static641.anInt10703 = Static481.aClass14_Sub29_Sub1_2.method5866();
															for (local221 = 0; local221 < Static641.anInt10703; local221++) {
																Static304.aStringArray17[local221] = Static481.aClass14_Sub29_Sub1_2.method5898();
																Static411.aStringArray27[local221] = Static481.aClass14_Sub29_Sub1_2.method5898();
																if (Static411.aStringArray27[local221].equals("")) {
																	Static411.aStringArray27[local221] = Static304.aStringArray17[local221];
																}
																Static543.aStringArray34[local221] = Static481.aClass14_Sub29_Sub1_2.method5898();
																Static228.aStringArray11[local221] = Static481.aClass14_Sub29_Sub1_2.method5898();
																if (Static228.aStringArray11[local221].equals("")) {
																	Static228.aStringArray11[local221] = Static543.aStringArray34[local221];
																}
																Static535.aBooleanArray21[local221] = false;
															}
															Static156.aClass44_62 = null;
															Static619.anInt10403 = Static441.anInt7833;
															return true;
														} else if (Static156.aClass44_62 == Static357.aClass44_114) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5888();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5846();
															if (local221 == 255) {
																local73 = -1;
																local221 = -1;
															}
															Static668.method9244(local221, local73);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static193.aClass44_70 == Static156.aClass44_62) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5856();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5869();
															local346 = Static481.aClass14_Sub29_Sub1_2.method5878();
															Static31.method717();
															Static342.method5282(local346, local73, local221);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static36.aClass44_21 == Static156.aClass44_62) {
															Static639.method8914();
															Static156.aClass44_62 = null;
															return false;
														} else if (Static128.aClass44_56 == Static156.aClass44_62) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5884();
															if (local221 == 65535) {
																local221 = -1;
															}
															local73 = Static481.aClass14_Sub29_Sub1_2.method5866();
															local346 = Static481.aClass14_Sub29_Sub1_2.method5846();
															Static425.method6284(local221, local346, local73);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static156.aClass44_62 == Static639.aClass44_183) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5846();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5848();
															local346 = Static481.aClass14_Sub29_Sub1_2.method5876();
															if (local346 == 65535) {
																local346 = -1;
															}
															Static202.method3077(local346, local73, local221);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static61.aClass44_34 == Static156.aClass44_62) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5864();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5876();
															if (local73 == 65535) {
																local73 = -1;
															}
															local346 = Static481.aClass14_Sub29_Sub1_2.method5900();
															if (local346 == 65535) {
																local346 = -1;
															}
															local350 = Static481.aClass14_Sub29_Sub1_2.method5843();
															Static31.method717();
															for (local356 = local73; local356 <= local346; local356++) {
																local2106 = (long) local356 + ((long) local221 << 32);
																local6552 = (Class14_Sub33) Static476.aClass187_59.method4078(local2106);
																if (local6552 != null) {
																	local6561 = new Class14_Sub33(local350, local6552.anInt6587);
																	local6552.method9315();
																} else if (local356 == -1) {
																	local6561 = new Class14_Sub33(local350, Static655.method9094(local221).aClass14_Sub33_2.anInt6587);
																} else {
																	local6561 = new Class14_Sub33(local350, -1);
																}
																Static476.aClass187_59.method4077(local2106, local6561);
															}
															Static156.aClass44_62 = null;
															return true;
														} else if (Static156.aClass44_62 == Static637.aClass44_182) {
															Static51.anInt1226 = Static481.aClass14_Sub29_Sub1_2.method5866();
															Static156.aClass44_62 = null;
															return true;
														} else if (Static521.aClass44_156 == Static156.aClass44_62) {
															@Pc(7119) int[] local7119 = new int[4];
															for (local73 = 0; local73 < 4; local73++) {
																local7119[local73] = Static481.aClass14_Sub29_Sub1_2.method5840();
															}
															local346 = Static481.aClass14_Sub29_Sub1_2.method5888();
															local350 = Static481.aClass14_Sub29_Sub1_2.method5900();
															@Pc(7152) Class14_Sub44 local7152 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local350);
															if (local7152 != null) {
																Static348.method5324(local7152.aClass12_Sub2_Sub2_Sub1_Sub1_2, local346, local7119);
															}
															Static156.aClass44_62 = null;
															return true;
														} else if (Static563.aClass44_166 == Static156.aClass44_62) {
															Static15.method140(Static530.aClass395_14);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static294.aClass44_97 == Static156.aClass44_62) {
															local221 = Static481.aClass14_Sub29_Sub1_2.method5843();
															local73 = Static481.aClass14_Sub29_Sub1_2.method5876();
															Static595.aClass241_1.method5815(local73, local221);
															Static156.aClass44_62 = null;
															return true;
														} else if (Static491.aClass44_153 == Static156.aClass44_62) {
															local646 = Static481.aClass14_Sub29_Sub1_2.method5842() == 1;
															Static31.method717();
															Static156.aClass44_62 = null;
															Static434.aBoolean524 = local646;
															return true;
														} else if (Static156.aClass44_62 == Static619.aClass44_175) {
															Static181.aString32 = Static638.anInt10676 <= 2 ? Static514.aClass303_28.method7473(Static232.anInt4258) : Static481.aClass14_Sub29_Sub1_2.method5898();
															Static167.anInt3248 = Static638.anInt10676 > 0 ? Static481.aClass14_Sub29_Sub1_2.method5900() : -1;
															if (Static167.anInt3248 == 65535) {
																Static167.anInt3248 = -1;
															}
															Static156.aClass44_62 = null;
															return true;
														} else if (Static54.aClass44_30 == Static156.aClass44_62) {
															local3113 = Static481.aClass14_Sub29_Sub1_2.method5898();
															local2632 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
															if (local2632) {
																local316 = Static481.aClass14_Sub29_Sub1_2.method5898();
															} else {
																local316 = local3113;
															}
															local350 = Static481.aClass14_Sub29_Sub1_2.method5900();
															@Pc(7287) byte local7287 = Static481.aClass14_Sub29_Sub1_2.method5845();
															local2936 = false;
															if (local7287 == -128) {
																local2936 = true;
															}
															if (local2936) {
																if (Static3.anInt23 == 0) {
																	Static156.aClass44_62 = null;
																	return true;
																}
																for (local364 = 0; local364 < Static3.anInt23 && (!Static678.aClass111Array1[local364].aString39.equals(local316) || local350 != Static678.aClass111Array1[local364].anInt3251); local364++) {
																}
																if (Static3.anInt23 > local364) {
																	while (local364 < Static3.anInt23 - 1) {
																		Static678.aClass111Array1[local364] = Static678.aClass111Array1[local364 + 1];
																		local364++;
																	}
																	Static3.anInt23--;
																	Static678.aClass111Array1[Static3.anInt23] = null;
																}
															} else {
																local2959 = Static481.aClass14_Sub29_Sub1_2.method5898();
																local2864 = new Class111();
																local2864.aString39 = local316;
																local2864.aString42 = local3113;
																local2864.aString41 = Static566.method8154(local2864.aString39);
																local2864.aString40 = local2959;
																local2864.aByte68 = local7287;
																local2864.anInt3251 = local350;
																for (local372 = Static3.anInt23 - 1; local372 >= 0; local372--) {
																	local923 = Static678.aClass111Array1[local372].aString41.compareTo(local2864.aString41);
																	if (local923 == 0) {
																		Static678.aClass111Array1[local372].anInt3251 = local350;
																		Static678.aClass111Array1[local372].aByte68 = local7287;
																		Static678.aClass111Array1[local372].aString40 = local2959;
																		if (local316.equals(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35)) {
																			Static75.aByte38 = local7287;
																		}
																		Static233.anInt4277 = Static441.anInt7833;
																		Static156.aClass44_62 = null;
																		return true;
																	}
																	if (local923 < 0) {
																		break;
																	}
																}
																if (Static678.aClass111Array1.length <= Static3.anInt23) {
																	Static156.aClass44_62 = null;
																	return true;
																}
																for (local923 = Static3.anInt23 - 1; local923 > local372; local923--) {
																	Static678.aClass111Array1[local923 + 1] = Static678.aClass111Array1[local923];
																}
																if (Static3.anInt23 == 0) {
																	Static678.aClass111Array1 = new Class111[100];
																}
																Static678.aClass111Array1[local372 + 1] = local2864;
																Static3.anInt23++;
																if (local316.equals(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35)) {
																	Static75.aByte38 = local7287;
																}
															}
															Static156.aClass44_62 = null;
															Static233.anInt4277 = Static441.anInt7833;
															return true;
														} else if (Static81.aClass44_40 == Static156.aClass44_62) {
															Static164.method2650(Static234.aClass333_5, Static638.anInt10676, Static481.aClass14_Sub29_Sub1_2);
															Static156.aClass44_62 = null;
															return true;
														} else {
															Static524.method7532("T1 - " + (Static156.aClass44_62 == null ? -1 : Static156.aClass44_62.method1191()) + "," + (Static264.aClass44_88 == null ? -1 : Static264.aClass44_88.method1191()) + "," + (Static349.aClass44_113 == null ? -1 : Static349.aClass44_113.method1191()) + " - " + Static638.anInt10676, (Throwable) null);
															Static128.method2105(false);
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
