import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_112 = new Class40("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[I")
	public static final int[] anIntArray557 = new int[2048];

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	public static void method5815() {
		if (Static118.anInt2542 == 0 || Static118.anInt2542 == 6) {
			return;
		}
		try {
			if (++Static276.anInt5394 > 2000) {
				if (client.lb != null) {
					client.lb.method4920();
					client.lb = null;
				}
				if (Static418.anInt7412 >= 1) {
					Static118.anInt2542 = 0;
					Static75.method1357(-5);
					return;
				}
				Static276.anInt5394 = 0;
				if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
					Static212.aClass43_2.aBoolean60 = !Static212.aClass43_2.aBoolean60;
				} else {
					Static453.aClass43_4.aBoolean60 = !Static453.aClass43_4.aBoolean60;
				}
				Static418.anInt7412++;
				Static118.anInt2542 = 1;
			}
			if (Static118.anInt2542 == 1) {
				if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
					Static301.aClass83_7 = Static159.aClass9_10.method276(Static212.aClass43_2.aString27, Static212.aClass43_2.method1116());
				} else {
					Static301.aClass83_7 = Static159.aClass9_10.method276(Static453.aClass43_4.aString27, Static453.aClass43_4.method1116());
				}
				Static118.anInt2542 = 2;
			}
			if (Static118.anInt2542 == 2) {
				if (Static301.aClass83_7.anInt2495 == 2) {
					throw new IOException();
				}
				if (Static301.aClass83_7.anInt2495 != 1) {
					return;
				}
				client.lb = Static147.method2756((Socket) Static301.aClass83_7.anObject8);
				Static301.aClass83_7 = null;
				@Pc(136) long local136 = Static510.aLong242 = Static525.method7179(Static17.aString14);
				Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
				@Pc(146) int local146 = (int) (local136 >> 16 & 0x1FL);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static357.aClass243_1.anInt7052);
				Static164.aClass5_Sub3_Sub1_2.method4192(local146);
				client.lb.method4910(2, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
				Static118.anInt2542 = 3;
			}
			@Pc(190) int local190;
			if (Static118.anInt2542 == 3) {
				if (!client.lb.method4916(1)) {
					return;
				}
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				local190 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
				if (local190 != 0) {
					Static118.anInt2542 = 0;
					Static75.method1357(local190);
					client.lb.method4920();
					client.lb = null;
					Static522.method7166();
					return;
				}
				Static118.anInt2542 = 4;
			}
			if (Static118.anInt2542 == 4) {
				if (!client.lb.method4916(8)) {
					return;
				}
				client.lb.method4918(0, 8, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
				Static156.aLong107 = Static131.aClass5_Sub3_Sub1_1.method4172();
				@Pc(238) Class5_Sub3 local238 = new Class5_Sub3(518);
				@Pc(241) int[] local241 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static156.aLong107 >> 32), (int) Static156.aLong107 };
				local238.method4192(10);
				local238.method4184(local241[0]);
				local238.method4184(local241[1]);
				local238.method4184(local241[2]);
				local238.method4184(local241[3]);
				local238.method4203(Static525.method7179(Static17.aString14));
				local238.method4208(Static469.aString73);
				local238.method4203(Static386.aLong114);
				local238.method4203(Static323.aLong173);
				local238.method4209(Static154.aBigInteger5, Static111.aBigInteger2);
				@Pc(320) Class5_Sub3_Sub1 local320 = Static164.aClass5_Sub3_Sub1_2;
				local320.anInt4960 = 0;
				@Pc(345) int local345;
				if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
					if (Static389.anInt7024 == 12) {
						local320.method4192(Static357.aClass243_5.anInt7052);
					} else {
						local320.method4192(Static357.aClass243_3.anInt7052);
					}
					local320.method4181(0);
					local345 = local320.anInt4960;
					local320.method4184(608);
					local320.method4192(Static523.anInt8857);
					local320.method4192(Static503.method6935());
					local320.method4181(Static383.anInt6994);
					local320.method4181(Static456.anInt7874);
					local320.method4192(Static300.aClass5_Sub28_Sub1_1.anInt4872);
					Static255.method4327(local320);
					local320.method4208(Static466.aString72);
					local320.method4184(Static433.anInt7630);
					@Pc(454) Class5_Sub3 local454 = new Class5_Sub3(Static430.method6133());
					Static300.aClass5_Sub28_Sub1_1.method4114(local454);
					local320.method4192(local454.anInt4960);
					local320.method4207(local454.anInt4960, local454.aByteArray66);
					Static495.aBoolean612 = true;
					@Pc(479) Class5_Sub3 local479 = new Class5_Sub3(Static167.method2959());
					(new Class5_Sub49(true, Static159.aClass9_10)).method6988(local479);
					local320.method4207(local479.aByteArray66.length, local479.aByteArray66);
					local320.method4181(Static39.anInt914);
					Static445.method6298();
					local320.method4207(local238.anInt4960, local238.aByteArray66);
					local320.method4179(local320.anInt4960 - local345);
				} else {
					local320.method4192(Static357.aClass243_6.anInt7052);
					local320.method4181(0);
					local345 = local320.anInt4960;
					local320.method4184(608);
					local320.method4192(Static525.aClass155_4.anInt4200);
					local320.method4192(Static194.anInt3737);
					Static255.method4327(local320);
					local320.method4208(Static466.aString72);
					local320.method4184(Static433.anInt7630);
					Static445.method6298();
					local320.method4207(local238.anInt4960, local238.aByteArray66);
					local320.method4179(local320.anInt4960 - local345);
				}
				client.lb.method4910(local320.anInt4960, local320.aByteArray66);
				local320.method520(local241);
				for (local345 = 0; local345 < 4; local345++) {
					local241[local345] += 50;
				}
				Static131.aClass5_Sub3_Sub1_1.method520(local241);
				Static118.anInt2542 = 5;
			}
			if (Static118.anInt2542 == 5) {
				if (!client.lb.method4916(1)) {
					return;
				}
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				local190 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
				if (local190 == 21) {
					Static118.anInt2542 = 8;
				} else if (local190 == 29) {
					Static118.anInt2542 = 14;
				} else if (local190 == 1) {
					Static118.anInt2542 = 6;
					Static75.method1357(local190);
					return;
				} else if (local190 == 2) {
					Static118.anInt2542 = 9;
				} else if (local190 == 15) {
					Static118.anInt2542 = 15;
					Static319.anInt6170 = -2;
				} else if (local190 == 23 && Static418.anInt7412 < 1) {
					Static118.anInt2542 = 1;
					Static276.anInt5394 = 0;
					Static418.anInt7412++;
					client.lb.method4920();
					client.lb = null;
					return;
				} else {
					Static118.anInt2542 = 0;
					Static75.method1357(local190);
					client.lb.method4920();
					client.lb = null;
					Static522.method7166();
					return;
				}
			}
			if (Static118.anInt2542 == 7) {
				Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
				Static164.aClass5_Sub3_Sub1_2.method527(Static357.aClass243_13.anInt7052);
				client.lb.method4910(Static164.aClass5_Sub3_Sub1_2.anInt4960, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
				Static118.anInt2542 = 5;
			} else if (Static118.anInt2542 == 8) {
				if (client.lb.method4916(1)) {
					client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
					local190 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
					Static148.anInt3092 = local190 * 60 + 180;
					Static118.anInt2542 = 0;
					Static75.method1357(21);
					client.lb.method4920();
					client.lb = null;
					Static522.method7166();
				}
			} else if (Static118.anInt2542 == 14) {
				if (client.lb.method4916(1)) {
					client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
					Static118.anInt2542 = 0;
					Static37.anInt891 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
					Static75.method1357(29);
					client.lb.method4920();
					client.lb = null;
					Static522.method7166();
				}
			} else if (Static118.anInt2542 != 9) {
				@Pc(795) Class5_Sub3_Sub1 local795;
				if (Static118.anInt2542 == 10) {
					local795 = Static131.aClass5_Sub3_Sub1_1;
					if (Static239.anInt4818 == 3) {
						Static379.aBoolean490 = true;
					} else {
						Static379.aBoolean490 = false;
					}
					if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
						if (!client.lb.method4916(Static61.anInt1223)) {
							return;
						}
						client.lb.method4918(0, Static61.anInt1223, local795.aByteArray66);
						local795.anInt4960 = 0;
						Static137.anInt1383 = local795.method4220();
						Static127.anInt2678 = local795.method4220();
						Static260.aBoolean605 = local795.method4220() == 1;
						Static143.aBoolean200 = local795.method4220() == 1;
						Static482.aBoolean602 = local795.method4220() == 1;
						Static411.aBoolean519 = local795.method4220() == 1;
						Static510.anInt8653 = local795.method4227();
						Static153.aBoolean206 = local795.method4220() == 1;
						Static364.anInt6810 = local795.method4218();
						Static433.aBoolean542 = local795.method4220() == 1;
						if (Static239.anInt4818 == 3) {
							@Pc(1097) boolean local1097 = local795.method4220() == 1;
							if (local1097) {
								@Pc(1103) long local1103 = local795.method4172();
								@Pc(1107) String local1107 = Static193.method3234(local1103);
								@Pc(1111) int local1111 = local795.method4220();
								@Pc(1114) byte[] local1114 = new byte[local1111];
								local795.method526(local1114, local1111);
								@Pc(1124) String local1124 = Static409.method5945(local1114);
								@Pc(1126) Class97 local1126 = null;
								try {
									@Pc(1132) Class83 local1132 = Static159.aClass9_10.method293(false, "3");
									while (local1132.anInt2495 == 0) {
										Static213.method3465(1L);
									}
									if (local1132.anInt2495 == 1) {
										local1126 = (Class97) local1132.anObject8;
										@Pc(1166) int local1166 = local1107.length() + local1124.length() + 2 + 2 + 3 + 4;
										if (local1166 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1181) Class5_Sub3 local1181 = new Class5_Sub3(local1166 + 1);
										local1181.method4192(local1166);
										local1181.method4192(1);
										local1181.method4214(local1107);
										local1181.method4214(local1124);
										local1181.method4181(Static433.anInt7630);
										local1181.method4228();
										local1126.method2497(local1181.aByteArray66, 0, local1181.anInt4960);
									}
								} catch (@Pc(1215) Exception local1215) {
								}
								try {
									if (local1126 != null) {
										local1126.method2499();
									}
								} catch (@Pc(1222) Exception local1222) {
								}
								try {
									Static555.method5217(Static159.aClass9_10.anApplet1, "demoaccountcreated");
								} catch (@Pc(1230) Throwable local1230) {
								}
							}
						}
						Static453.aClass88_3.method2287(Static433.aBoolean542);
						Static451.aClass67_2.method2013(Static433.aBoolean542);
						Static204.aClass282_1.method6597(Static433.aBoolean542);
					} else if (client.lb.method4916(Static61.anInt1223)) {
						client.lb.method4918(0, Static61.anInt1223, local795.aByteArray66);
						local795.anInt4960 = 0;
						Static137.anInt1383 = local795.method4220();
						Static127.anInt2678 = local795.method4220();
						Static260.aBoolean605 = local795.method4220() == 1;
						Static143.aBoolean200 = local795.method4220() == 1;
						Static482.aBoolean602 = local795.method4220() == 1;
						Static52.anInt1136 = local795.method4227();
						Static153.aBoolean206 = Static52.anInt1136 > 0;
						Static194.anInt3739 = local795.method4227();
						Static273.anInt5366 = local795.method4227();
						Static192.anInt3699 = local795.method4227();
						Static515.anInt3208 = local795.method4230();
						Static10.aClass83_3 = Static159.aClass9_10.method283(Static515.anInt3208);
						Static291.anInt5878 = local795.method4220();
						Static7.anInt139 = local795.method4227();
						Static275.anInt5377 = local795.method4227();
						Static186.aBoolean219 = local795.method4220() == 1;
						Static35.aClass15_Sub2_Sub1_Sub1_1.aString18 = Static35.aClass15_Sub2_Sub1_Sub1_1.aString19 = local795.method4211();
						Static409.aClass43_3 = new Class43();
						Static409.aClass43_3.anInt1149 = local795.method4227();
						if (Static409.aClass43_3.anInt1149 == 65535) {
							Static409.aClass43_3.anInt1149 = -1;
						}
						Static409.aClass43_3.aString27 = local795.method4211();
						if (Static134.aClass199_4 != Static124.aClass199_3) {
							Static409.aClass43_3.anInt1154 = Static409.aClass43_3.anInt1149 + 40000;
							Static409.aClass43_3.anInt1152 = Static409.aClass43_3.anInt1149 + 50000;
						}
						if (Static134.aClass199_4 != Static357.aClass199_7 && (Static212.aClass43_2.method1117(Static532.aClass43_5) || Static212.aClass43_2.method1117(Static68.aClass43_1))) {
							Static199.method3284();
						}
					} else {
						return;
					}
					if (Static260.aBoolean605 && !Static482.aBoolean602 || Static153.aBoolean206) {
						try {
							Static555.method5217(Static159.aClass9_10.anApplet1, "zap");
						} catch (@Pc(1257) Throwable local1257) {
							if (Static424.aBoolean533) {
								try {
									Static159.aClass9_10.anApplet1.getAppletContext().showDocument(new URL(Static159.aClass9_10.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1273) Exception local1273) {
								}
							}
						}
					} else {
						try {
							Static555.method5217(Static159.aClass9_10.anApplet1, "unzap");
						} catch (@Pc(1283) Throwable local1283) {
						}
					}
					if (Static124.aClass199_3 == Static134.aClass199_4) {
						try {
							Static555.method5217(Static159.aClass9_10.anApplet1, "loggedin");
						} catch (@Pc(1295) Throwable local1295) {
						}
					}
					if (Static239.anInt4818 != 2 && Static239.anInt4818 != 3) {
						Static118.anInt2542 = 0;
						Static75.method1357(2);
						Static154.method2824();
						Static287.method4831(6);
						Static13.aClass150_11 = null;
						return;
					}
					Static118.anInt2542 = 12;
				}
				if (Static118.anInt2542 == 12) {
					if (!client.lb.method4916(3)) {
						return;
					}
					client.lb.method4918(0, 3, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
					Static118.anInt2542 = 13;
				}
				if (Static118.anInt2542 == 13) {
					local795 = Static131.aClass5_Sub3_Sub1_1;
					local795.anInt4960 = 0;
					if (local795.method522()) {
						if (!client.lb.method4916(1)) {
							return;
						}
						client.lb.method4918(3, 1, local795.aByteArray66);
					}
					Static13.aClass150_11 = Static365.method5577()[local795.method531()];
					Static319.anInt6170 = local795.method4227();
					Static118.anInt2542 = 11;
				}
				if (Static118.anInt2542 == 11) {
					if (client.lb.method4916(Static319.anInt6170)) {
						client.lb.method4918(0, Static319.anInt6170, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
						Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
						local190 = Static319.anInt6170;
						Static118.anInt2542 = 0;
						Static75.method1357(2);
						Static142.method2682();
						Static384.method6007(Static131.aClass5_Sub3_Sub1_1);
						Static381.anInt6974 = -1;
						Static155.method2831();
						if (Static131.aClass5_Sub3_Sub1_1.anInt4960 != local190) {
							throw new RuntimeException("lswp pos:" + Static131.aClass5_Sub3_Sub1_1.anInt4960 + " psize:" + local190);
						}
						Static13.aClass150_11 = null;
					}
				} else if (Static118.anInt2542 == 15) {
					if (Static319.anInt6170 == -2) {
						if (!client.lb.method4916(2)) {
							return;
						}
						client.lb.method4918(0, 2, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
						Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
						Static319.anInt6170 = Static131.aClass5_Sub3_Sub1_1.method4227();
					}
					if (client.lb.method4916(Static319.anInt6170)) {
						client.lb.method4918(0, Static319.anInt6170, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
						Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
						Static118.anInt2542 = 0;
						local190 = Static319.anInt6170;
						Static75.method1357(15);
						Static152.method2796();
						Static384.method6007(Static131.aClass5_Sub3_Sub1_1);
						if (local190 != Static131.aClass5_Sub3_Sub1_1.anInt4960) {
							throw new RuntimeException("lswpr pos:" + Static131.aClass5_Sub3_Sub1_1.anInt4960 + " psize:" + local190);
						}
						Static13.aClass150_11 = null;
					}
				}
			} else if (client.lb.method4916(1)) {
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				Static61.anInt1223 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
				Static118.anInt2542 = 10;
			}
		} catch (@Pc(1543) IOException local1543) {
			if (client.lb != null) {
				client.lb.method4920();
				client.lb = null;
			}
			if (Static418.anInt7412 < 1) {
				Static418.anInt7412++;
				Static118.anInt2542 = 1;
				Static276.anInt5394 = 0;
				if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
					Static212.aClass43_2.aBoolean60 = !Static212.aClass43_2.aBoolean60;
				} else {
					Static453.aClass43_4.aBoolean60 = !Static453.aClass43_4.aBoolean60;
				}
			} else {
				Static118.anInt2542 = 0;
				Static75.method1357(-4);
				Static522.method7166();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBIII)I")
	public static int method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static248.aClass131Array4 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(22) int local22 = arg4 >> 7;
			@Pc(26) int local26 = arg0 >> 7;
			if (arg2 < 0 || arg3 < 0 || Static460.anInt7894 - 1 < arg2 || arg3 > Static235.anInt4493 - 1) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && local22 <= Static460.anInt7894 - 1 && Static235.anInt4493 - 1 >= local26) {
				@Pc(94) boolean local94 = (Static429.aByteArrayArrayArray17[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(122) boolean local122;
				@Pc(138) boolean local138;
				if ((arg4 & 0x7F) == 0) {
					local122 = (Static429.aByteArrayArrayArray17[1][local22 - 1][arg0 >> 7] & 0x2) != 0;
					local138 = (Static429.aByteArrayArrayArray17[1][local22][arg0 >> 7] & 0x2) != 0;
					if (local138 != local122) {
						local94 = (Static429.aByteArrayArrayArray17[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local122 = (Static429.aByteArrayArrayArray17[1][arg4 >> 7][local26 - 1] & 0x2) != 0;
					local138 = (Static429.aByteArrayArrayArray17[1][arg4 >> 7][local26] & 0x2) != 0;
					if (local122 != local138) {
						local94 = (Static429.aByteArrayArrayArray17[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if (local94) {
					arg1++;
				}
				return Static248.aClass131Array4[arg1].aa(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static248.aClass131Array4[arg1].aa(arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!gp;)V")
	public static void method5818(@OriginalArg(1) Class117 arg0) {
		Static33.anInt859 = arg0.method2982("titlebg");
		Static397.anInt7134 = arg0.method2982("logo");
	}
}
