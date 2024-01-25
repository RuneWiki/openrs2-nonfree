import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method1735() {
		if (Static141.anInt2537 == 0 || Static141.anInt2537 == 6) {
			return;
		}
		try {
			if (++Static182.anInt3207 > 2000) {
				if (Static225.aClass71_1 != null) {
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
				}
				if (Static109.anInt9295 >= 2) {
					Static141.anInt2537 = 0;
					Static348.method7153(-5);
					return;
				}
				if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
					Static271.aClass147_2.method3179();
				} else {
					Static343.aClass147_3.method3179();
				}
				Static182.anInt3207 = 0;
				Static109.anInt9295++;
				Static141.anInt2537 = 1;
			}
			if (Static141.anInt2537 == 1) {
				if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
					Static122.aClass278_5 = Static271.aClass147_2.method3182(Static152.aClass57_4);
				} else {
					Static122.aClass278_5 = Static343.aClass147_3.method3182(Static152.aClass57_4);
				}
				Static141.anInt2537 = 2;
			}
			if (Static141.anInt2537 == 2) {
				if (Static122.aClass278_5.anInt7757 == 2) {
					throw new IOException();
				}
				if (Static122.aClass278_5.anInt7757 != 1) {
					return;
				}
				Static225.aClass71_1 = Static26.method403((Socket) Static122.aClass278_5.anObject24);
				Static122.aClass278_5 = null;
				@Pc(131) long local131 = Static399.aLong183 = Static230.method3382(Static87.aString23);
				Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
				@Pc(141) int local141 = (int) (local131 >> 16 & 0x1FL);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static184.aClass14_1.anInt222);
				Static218.aClass6_Sub14_Sub2_1.method6035(local141);
				Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, 2);
				Static141.anInt2537 = 3;
			}
			@Pc(183) int local183;
			if (Static141.anInt2537 == 3) {
				if (!Static225.aClass71_1.method5964(1)) {
					return;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				local183 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
				if (local183 != 0) {
					Static141.anInt2537 = 0;
					Static348.method7153(local183);
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					Static47.method7642();
					return;
				}
				Static141.anInt2537 = 4;
			}
			if (Static141.anInt2537 == 4) {
				if (!Static225.aClass71_1.method5964(8)) {
					return;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 8, 0);
				Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
				Static345.aLong160 = Static420.aClass6_Sub14_Sub2_2.method6033();
				@Pc(234) Class6_Sub14 local234 = new Class6_Sub14(518);
				@Pc(237) int[] local237 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static345.aLong160 >> 32), (int) Static345.aLong160 };
				local234.method6035(10);
				local234.method5990(local237[0]);
				local234.method5990(local237[1]);
				local234.method5990(local237[2]);
				local234.method5990(local237[3]);
				local234.method6007(Static230.method3382(Static87.aString23));
				local234.method5989(Static442.aString89);
				local234.method6007(Static473.aLong205);
				local234.method6007(Static459.aLong199);
				local234.method6042(Static568.aBigInteger8, Static21.aBigInteger1);
				@Pc(326) Class6_Sub14_Sub2 local326 = Static218.aClass6_Sub14_Sub2_1;
				local326.anInt7244 = 0;
				@Pc(359) int local359;
				if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
					if (Static146.anInt2581 == 13) {
						local326.method6035(Static184.aClass14_5.anInt222);
					} else {
						local326.method6035(Static184.aClass14_3.anInt222);
					}
					local326.method5999(0);
					local359 = local326.anInt7244;
					local326.method5990(613);
					local326.method6035(Static177.anInt3167);
					local326.method6035(Static354.method5293());
					local326.method5999(Static502.anInt8364);
					local326.method5999(Static476.anInt8045);
					local326.method6035(Static480.aClass6_Sub37_Sub1_1.anInt6052);
					Static11.method184(local326);
					local326.method5989(Static492.aString102);
					local326.method5990(Static323.anInt5822);
					@Pc(406) Class6_Sub14 local406 = new Class6_Sub14(Static186.method2766());
					Static480.aClass6_Sub37_Sub1_1.method5146(local406);
					local326.method6035(local406.anInt7244);
					local326.method6039(local406.anInt7244, local406.aByteArray88);
					Static474.aBoolean543 = true;
					@Pc(431) Class6_Sub14 local431 = new Class6_Sub14(Static544.method7515());
					(new Class6_Sub43(true, Static152.aClass57_4)).method6059(local431);
					local326.method6039(local431.aByteArray88.length, local431.aByteArray88);
					local326.method5999(Static138.anInt2445);
					local326.method6007(Static421.aLong191);
					Static521.method7340();
					local326.method6039(local234.anInt7244, local234.aByteArray88);
					local326.method6000(local326.anInt7244 - local359);
				} else {
					local326.method6035(Static184.aClass14_6.anInt222);
					local326.method5999(0);
					local359 = local326.anInt7244;
					local326.method5990(613);
					local326.method6035(Static57.aClass314_1.anInt8647);
					local326.method6035(Static470.anInt7957);
					Static11.method184(local326);
					local326.method5989(Static492.aString102);
					local326.method5990(Static323.anInt5822);
					Static521.method7340();
					local326.method6039(local234.anInt7244, local234.aByteArray88);
					local326.method6000(local326.anInt7244 - local359);
				}
				Static225.aClass71_1.method5968(local326.aByteArray88, local326.anInt7244);
				local326.method6050(local237);
				for (local359 = 0; local359 < 4; local359++) {
					local237[local359] += 50;
				}
				Static420.aClass6_Sub14_Sub2_2.method6050(local237);
				Static141.anInt2537 = 5;
			}
			if (Static141.anInt2537 == 5) {
				if (!Static225.aClass71_1.method5964(1)) {
					return;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				local183 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
				if (local183 == 21) {
					Static141.anInt2537 = 8;
				} else if (local183 == 29) {
					Static141.anInt2537 = 14;
				} else if (local183 == 1) {
					Static141.anInt2537 = 6;
					Static348.method7153(local183);
					return;
				} else if (local183 == 2) {
					Static141.anInt2537 = 9;
				} else if (local183 == 15) {
					Static567.anInt9502 = -2;
					Static141.anInt2537 = 15;
				} else if (local183 == 23 && Static109.anInt9295 < 2) {
					Static182.anInt3207 = 0;
					Static109.anInt9295++;
					Static141.anInt2537 = 1;
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					return;
				} else {
					Static141.anInt2537 = 0;
					Static348.method7153(local183);
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					Static47.method7642();
					return;
				}
			}
			if (Static141.anInt2537 == 7) {
				Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
				Static218.aClass6_Sub14_Sub2_1.method6049(Static184.aClass14_13.anInt222);
				Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, Static218.aClass6_Sub14_Sub2_1.anInt7244);
				Static141.anInt2537 = 5;
			} else if (Static141.anInt2537 == 8) {
				if (Static225.aClass71_1.method5964(1)) {
					Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
					local183 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
					Static141.anInt2537 = 0;
					Static213.anInt472 = local183 * 60 + 180;
					Static348.method7153(21);
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					Static47.method7642();
				}
			} else if (Static141.anInt2537 == 14) {
				if (Static225.aClass71_1.method5964(1)) {
					Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
					Static287.anInt9621 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
					Static141.anInt2537 = 0;
					Static348.method7153(29);
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					Static47.method7642();
				}
			} else if (Static141.anInt2537 != 9) {
				@Pc(805) Class6_Sub14_Sub2 local805;
				if (Static141.anInt2537 == 10) {
					local805 = Static420.aClass6_Sub14_Sub2_2;
					if (Static466.anInt7907 == 3) {
						Static276.aBoolean286 = true;
					} else {
						Static276.aBoolean286 = false;
					}
					if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
						if (!Static225.aClass71_1.method5964(Static382.anInt6588)) {
							return;
						}
						Static225.aClass71_1.method5963(local805.aByteArray88, Static382.anInt6588, 0);
						local805.anInt7244 = 0;
						Static231.anInt3930 = local805.method6041();
						Static431.anInt7548 = local805.method6041();
						Static451.aBoolean532 = local805.method6041() == 1;
						Static558.aBoolean654 = local805.method6041() == 1;
						Static579.aBoolean670 = local805.method6041() == 1;
						Static475.aBoolean548 = local805.method6041() == 1;
						Static44.anInt711 = local805.method6006();
						Static2.aBoolean4 = local805.method6041() == 1;
						Static188.anInt3276 = local805.method5994();
						Static296.aBoolean667 = local805.method6041() == 1;
						if (Static466.anInt7907 == 3) {
							@Pc(1110) boolean local1110 = local805.method6041() == 1;
							if (local1110) {
								@Pc(1116) long local1116 = local805.method6033();
								@Pc(1120) String local1120 = Static88.method1427(local1116);
								@Pc(1124) int local1124 = local805.method6041();
								@Pc(1127) byte[] local1127 = new byte[local1124];
								local805.method6046(local1127, local1124);
								@Pc(1137) String local1137 = Static422.method6197(local1127);
								@Pc(1139) Class133 local1139 = null;
								try {
									@Pc(1145) Class278 local1145 = Static152.aClass57_4.method929(false, "3");
									while (local1145.anInt7757 == 0) {
										Static149.method2211(1L);
									}
									if (local1145.anInt7757 == 1) {
										local1139 = (Class133) local1145.anObject24;
										@Pc(1183) int local1183 = local1120.length() + local1137.length() + 4 + 8 + 2 + 3 + 2;
										if (local1183 > 60) {
											throw new RuntimeException(">60");
										}
										@Pc(1198) Class6_Sub14 local1198 = new Class6_Sub14(local1183 + 1);
										local1198.method6035(local1183);
										local1198.method6035(2);
										local1198.method6036(local1120);
										local1198.method6036(local1137);
										local1198.method5999(Static323.anInt5822);
										local1198.method6007(Static421.aLong191);
										local1198.method6003();
										local1139.method2786(local1198.aByteArray88, 0, local1198.anInt7244);
									}
								} catch (@Pc(1238) Exception local1238) {
								}
								try {
									if (local1139 != null) {
										local1139.method2788();
									}
								} catch (@Pc(1245) Exception local1245) {
								}
								try {
									Static587.method3349(Static189.anApplet4, "demoaccountcreated");
								} catch (@Pc(1254) Throwable local1254) {
								}
							}
						}
						Static260.aClass100_1.method2011(Static296.aBoolean667);
						Static295.aClass256_2.method5923(Static296.aBoolean667);
						Static51.aClass202_1.method4896(Static296.aBoolean667);
					} else if (Static225.aClass71_1.method5964(Static382.anInt6588)) {
						Static225.aClass71_1.method5963(local805.aByteArray88, Static382.anInt6588, 0);
						local805.anInt7244 = 0;
						Static231.anInt3930 = local805.method6041();
						Static431.anInt7548 = local805.method6041();
						Static451.aBoolean532 = local805.method6041() == 1;
						Static558.aBoolean654 = local805.method6041() == 1;
						Static579.aBoolean670 = local805.method6041() == 1;
						Static292.anInt4768 = local805.method6006();
						Static2.aBoolean4 = Static292.anInt4768 > 0;
						Static365.anInt6348 = local805.method6006();
						Static90.anInt1535 = local805.method6006();
						Static482.anInt8091 = local805.method6006();
						Static313.anInt5655 = local805.method6027();
						Static386.aClass278_7 = Static152.aClass57_4.method925(Static313.anInt5655);
						Static420.anInt7418 = local805.method6041();
						Static399.anInt7048 = local805.method6006();
						Static83.anInt1405 = local805.method6006();
						Static402.aBoolean495 = local805.method6041() == 1;
						Static426.aClass29_Sub2_Sub1_Sub2_2.aString108 = Static426.aClass29_Sub2_Sub1_Sub2_2.aString107 = local805.method6023();
						Static334.anInt5964 = local805.method6041();
						Static311.anInt5592 = local805.method6027();
						Static368.aClass147_4 = new Class147();
						Static368.aClass147_4.anInt3691 = local805.method6006();
						if (Static368.aClass147_4.anInt3691 == 65535) {
							Static368.aClass147_4.anInt3691 = -1;
						}
						Static368.aClass147_4.aString55 = local805.method6023();
						if (Static376.aClass287_6 != Static192.aClass287_3) {
							Static368.aClass147_4.anInt3693 = Static368.aClass147_4.anInt3691 + 40000;
							Static368.aClass147_4.anInt3696 = Static368.aClass147_4.anInt3691 + 50000;
						}
						if (Static130.aClass287_1 != Static376.aClass287_6 && (Static271.aClass147_2.method3180(Static95.aClass147_1) || Static271.aClass147_2.method3180(Static453.aClass147_5))) {
							Static468.method6558();
						}
					} else {
						return;
					}
					if (Static451.aBoolean532 && !Static579.aBoolean670 || Static2.aBoolean4) {
						try {
							Static587.method3349(Static189.anApplet4, "zap");
						} catch (@Pc(1282) Throwable local1282) {
							if (Static54.aBoolean35) {
								try {
									Static189.anApplet4.getAppletContext().showDocument(new URL(Static189.anApplet4.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1296) Exception local1296) {
								}
							}
						}
					} else {
						try {
							Static587.method3349(Static189.anApplet4, "unzap");
						} catch (@Pc(1305) Throwable local1305) {
						}
					}
					if (Static376.aClass287_6 == Static192.aClass287_3) {
						try {
							Static587.method3349(Static189.anApplet4, "loggedin");
						} catch (@Pc(1318) Throwable local1318) {
						}
					}
					if (Static466.anInt7907 != 2 && Static466.anInt7907 != 3) {
						Static141.anInt2537 = 0;
						Static348.method7153(2);
						Static376.method5515();
						Static99.method1593(7);
						Static244.aClass40_99 = null;
						return;
					}
					Static141.anInt2537 = 12;
				}
				if (Static141.anInt2537 == 12) {
					if (!Static225.aClass71_1.method5964(3)) {
						return;
					}
					Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 3, 0);
					Static141.anInt2537 = 13;
				}
				if (Static141.anInt2537 == 13) {
					local805 = Static420.aClass6_Sub14_Sub2_2;
					local805.anInt7244 = 0;
					if (local805.method6044()) {
						if (!Static225.aClass71_1.method5964(1)) {
							return;
						}
						Static225.aClass71_1.method5963(local805.aByteArray88, 1, 3);
					}
					Static244.aClass40_99 = Static258.method3635()[local805.method6048()];
					Static567.anInt9502 = local805.method6006();
					Static141.anInt2537 = 11;
				}
				if (Static141.anInt2537 == 11) {
					if (Static225.aClass71_1.method5964(Static567.anInt9502)) {
						Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, Static567.anInt9502, 0);
						Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
						Static141.anInt2537 = 0;
						local183 = Static567.anInt9502;
						Static348.method7153(2);
						Static57.method747();
						Static11.method183(Static420.aClass6_Sub14_Sub2_2);
						Static274.anInt3319 = -1;
						if (Static83.aClass40_35 == Static244.aClass40_99) {
							Static567.method7777();
						} else {
							Static330.method5152();
						}
						if (Static420.aClass6_Sub14_Sub2_2.anInt7244 != local183) {
							throw new RuntimeException("lswp pos:" + Static420.aClass6_Sub14_Sub2_2.anInt7244 + " psize:" + local183);
						}
						Static244.aClass40_99 = null;
					}
				} else if (Static141.anInt2537 == 15) {
					if (Static567.anInt9502 == -2) {
						if (!Static225.aClass71_1.method5964(2)) {
							return;
						}
						Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 2, 0);
						Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
						Static567.anInt9502 = Static420.aClass6_Sub14_Sub2_2.method6006();
					}
					if (Static225.aClass71_1.method5964(Static567.anInt9502)) {
						Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, Static567.anInt9502, 0);
						Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
						local183 = Static567.anInt9502;
						Static141.anInt2537 = 0;
						Static348.method7153(15);
						Static517.method6766();
						Static11.method183(Static420.aClass6_Sub14_Sub2_2);
						if (Static420.aClass6_Sub14_Sub2_2.anInt7244 != local183) {
							throw new RuntimeException("lswpr pos:" + Static420.aClass6_Sub14_Sub2_2.anInt7244 + " psize:" + local183);
						}
						Static244.aClass40_99 = null;
					}
				}
			} else if (Static225.aClass71_1.method5964(1)) {
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				Static382.anInt6588 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
				Static141.anInt2537 = 10;
			}
		} catch (@Pc(1570) IOException local1570) {
			if (Static225.aClass71_1 != null) {
				Static225.aClass71_1.method5970();
				Static225.aClass71_1 = null;
			}
			if (Static109.anInt9295 >= 2) {
				Static141.anInt2537 = 0;
				Static348.method7153(-4);
				Static47.method7642();
			} else {
				if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
					Static271.aClass147_2.method3179();
				} else {
					Static343.aClass147_3.method3179();
				}
				Static141.anInt2537 = 1;
				Static182.anInt3207 = 0;
				Static109.anInt9295++;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1736() {
		Static420.aClass6_Sub14_Sub2_2.method6045();
		@Pc(17) int local17 = Static420.aClass6_Sub14_Sub2_2.method6052(8);
		@Pc(26) int local26;
		if (Static516.anInt8936 > local17) {
			for (local26 = local17; local26 < Static516.anInt8936; local26++) {
				Static13.anIntArray21[Static148.anInt2606++] = Static274.anIntArray385[local26];
			}
		}
		if (local17 > Static516.anInt8936) {
			throw new RuntimeException("gnpov1");
		}
		Static516.anInt8936 = 0;
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(68) int local68 = Static274.anIntArray385[local26];
			@Pc(76) Class29_Sub2_Sub1_Sub1 local76 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) local68)).aClass29_Sub2_Sub1_Sub1_2;
			@Pc(83) int local83 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
			if (local83 == 0) {
				Static274.anIntArray385[Static516.anInt8936++] = local68;
				local76.anInt8511 = Static358.anInt6263;
			} else {
				@Pc(106) int local106 = Static420.aClass6_Sub14_Sub2_2.method6052(2);
				if (local106 == 0) {
					Static274.anIntArray385[Static516.anInt8936++] = local68;
					local76.anInt8511 = Static358.anInt6263;
					Static519.anIntArray669[Static353.anInt6225++] = local68;
				} else {
					@Pc(152) int local152;
					@Pc(162) int local162;
					if (local106 == 1) {
						Static274.anIntArray385[Static516.anInt8936++] = local68;
						local76.anInt8511 = Static358.anInt6263;
						local152 = Static420.aClass6_Sub14_Sub2_2.method6052(3);
						local76.method1592(local152, 1);
						local162 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
						if (local162 == 1) {
							Static519.anIntArray669[Static353.anInt6225++] = local68;
						}
					} else if (local106 == 2) {
						Static274.anIntArray385[Static516.anInt8936++] = local68;
						local76.anInt8511 = Static358.anInt6263;
						if (Static420.aClass6_Sub14_Sub2_2.method6052(1) == 1) {
							local152 = Static420.aClass6_Sub14_Sub2_2.method6052(3);
							local76.method1592(local152, 2);
							local162 = Static420.aClass6_Sub14_Sub2_2.method6052(3);
							local76.method1592(local162, 2);
						} else {
							local152 = Static420.aClass6_Sub14_Sub2_2.method6052(3);
							local76.method1592(local152, 0);
						}
						local152 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
						if (local152 == 1) {
							Static519.anIntArray669[Static353.anInt6225++] = local68;
						}
					} else if (local106 == 3) {
						Static13.anIntArray21[Static148.anInt2606++] = local68;
					}
				}
			}
		}
	}
}
