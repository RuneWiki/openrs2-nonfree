import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public static int anInt5092;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public static final int anInt5089 = 328;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt5096 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method4429() {
		if (Static407.anInt7011 == 0 || Static407.anInt7011 == 6) {
			return;
		}
		try {
			if (++Static113.anInt2215 > 2000) {
				if (Static324.aClass165_2 != null) {
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
				}
				if (Static584.anInt9416 >= 2) {
					Static407.anInt7011 = 0;
					Static526.method7023(-5);
					return;
				}
				if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
					Static221.aClass51_1.method1489();
				} else {
					Static512.aClass51_5.method1489();
				}
				Static584.anInt9416++;
				Static113.anInt2215 = 0;
				Static407.anInt7011 = 1;
			}
			if (Static407.anInt7011 == 1) {
				if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
					Static570.aClass39_7 = Static221.aClass51_1.method1491(Static237.aClass258_3);
				} else {
					Static570.aClass39_7 = Static512.aClass51_5.method1491(Static237.aClass258_3);
				}
				Static407.anInt7011 = 2;
			}
			if (Static407.anInt7011 == 2) {
				if (Static570.aClass39_7.anInt894 == 2) {
					throw new IOException();
				}
				if (Static570.aClass39_7.anInt894 != 1) {
					return;
				}
				Static324.aClass165_2 = Static143.method2770((Socket) Static570.aClass39_7.anObject2);
				Static570.aClass39_7 = null;
				@Pc(127) long local127 = Static515.aLong77 = Static554.method7335(Static196.aString85);
				Static121.method2498();
				@Pc(136) int local136 = (int) (local127 >> 16 & 0x1FL);
				@Pc(139) Class3_Sub42 local139 = Static366.method5366();
				local139.aClass3_Sub11_Sub1_1.method5213(Static546.aClass224_1.anInt6213);
				local139.aClass3_Sub11_Sub1_1.method5213(local136);
				Static511.method6885(local139);
				Static84.method1672();
				Static407.anInt7011 = 3;
			}
			@Pc(185) int local185;
			if (Static407.anInt7011 == 3) {
				if (!Static324.aClass165_2.method3982(1)) {
					return;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				local185 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
				if (local185 != 0) {
					Static407.anInt7011 = 0;
					Static526.method7023(local185);
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					Static119.method2465();
					return;
				}
				Static407.anInt7011 = 4;
			}
			if (Static407.anInt7011 == 4) {
				if (!Static324.aClass165_2.method3982(8)) {
					return;
				}
				Static324.aClass165_2.method3976(8, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
				Static393.aLong185 = Static532.aClass3_Sub11_Sub1_2.method5226();
				@Pc(236) Class3_Sub11 local236 = new Class3_Sub11(518);
				@Pc(239) int[] local239 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static393.aLong185 >> 32), (int) Static393.aLong185 };
				local236.method5213(10);
				local236.method5215(local239[0]);
				local236.method5215(local239[1]);
				local236.method5215(local239[2]);
				local236.method5215(local239[3]);
				local236.method5225(Static554.method7335(Static196.aString85));
				local236.method5227(Static173.aString18);
				local236.method5225(Static576.aLong269);
				local236.method5225(Static200.aLong111);
				local236.method5189(Static134.aBigInteger1, Static384.aBigInteger2);
				Static121.method2498();
				@Pc(325) Class3_Sub42 local325 = Static366.method5366();
				@Pc(328) Class3_Sub11_Sub1 local328 = local325.aClass3_Sub11_Sub1_1;
				@Pc(350) int local350;
				if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
					if (Static32.anInt602 == 13) {
						local328.method5213(Static546.aClass224_5.anInt6213);
					} else {
						local328.method5213(Static546.aClass224_3.anInt6213);
					}
					local328.method5200(0);
					local350 = local328.anInt6128;
					local328.method5215(622);
					local328.method5213(Static61.anInt1462);
					local328.method5213(Static38.method626());
					local328.method5200(Static40.anInt758);
					local328.method5200(Static308.anInt5171);
					local328.method5213(Static405.aClass3_Sub3_Sub1_1.anInt7557);
					Static514.method6920(local328);
					local328.method5227(Static568.aString87);
					local328.method5215(Static535.anInt8570);
					@Pc(461) Class3_Sub11 local461 = new Class3_Sub11(Static134.method2624());
					Static405.aClass3_Sub3_Sub1_1.method6302(local461);
					local328.method5213(local461.anInt6128);
					local328.method5184(local461.aByteArray62, local461.anInt6128);
					Static206.aBoolean283 = true;
					@Pc(488) Class3_Sub11 local488 = new Class3_Sub11(Static419.method5970());
					(new Class3_Sub37(true, Static237.aClass258_3)).method5283(local488);
					local328.method5184(local488.aByteArray62, local488.aByteArray62.length);
					local328.method5200(Static106.anInt2143);
					local328.method5225(Static149.aLong80);
					local328.method5213(Static286.aString34 == null ? 0 : 1);
					if (Static286.aString34 != null) {
						local328.method5227(Static286.aString34);
					}
					Static83.method1671(local328);
					local328.method5184(local236.aByteArray62, local236.anInt6128);
					local328.method5214(local328.anInt6128 - local350);
				} else {
					local328.method5213(Static546.aClass224_6.anInt6213);
					local328.method5200(0);
					local350 = local328.anInt6128;
					local328.method5215(622);
					local328.method5213(Static121.aClass274_1.anInt7264);
					local328.method5213(Static256.anInt4535);
					Static514.method6920(local328);
					local328.method5227(Static568.aString87);
					local328.method5215(Static535.anInt8570);
					Static83.method1671(local328);
					local328.method5184(local236.aByteArray62, local236.anInt6128);
					local328.method5214(local328.anInt6128 - local350);
				}
				Static511.method6885(local325);
				Static84.method1672();
				Static9.aClass199_3 = new Class199(local239);
				for (local350 = 0; local350 < 4; local350++) {
					local239[local350] += 50;
				}
				Static532.aClass3_Sub11_Sub1_2.method1385(local239);
				Static407.anInt7011 = 5;
			}
			if (Static407.anInt7011 == 5) {
				if (!Static324.aClass165_2.method3982(1)) {
					return;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				local185 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
				if (local185 == 21) {
					Static407.anInt7011 = 8;
				} else if (local185 == 29) {
					Static407.anInt7011 = 14;
				} else if (local185 == 1) {
					Static407.anInt7011 = 6;
					Static526.method7023(local185);
					return;
				} else if (local185 == 2) {
					Static407.anInt7011 = 9;
				} else if (local185 == 15) {
					Static292.anInt4974 = -2;
					Static407.anInt7011 = 15;
				} else if (local185 == 23 && Static584.anInt9416 < 2) {
					Static584.anInt9416++;
					Static113.anInt2215 = 0;
					Static407.anInt7011 = 1;
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					return;
				} else {
					Static407.anInt7011 = 0;
					Static526.method7023(local185);
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					Static119.method2465();
					return;
				}
			}
			if (Static407.anInt7011 == 7) {
				Static121.method2498();
				@Pc(693) Class3_Sub42 local693 = Static366.method5366();
				@Pc(696) Class3_Sub11_Sub1 local696 = local693.aClass3_Sub11_Sub1_1;
				local696.method1387(Static9.aClass199_3);
				local696.method1388(Static546.aClass224_13.anInt6213);
				Static511.method6885(local693);
				Static84.method1672();
				Static407.anInt7011 = 5;
			} else if (Static407.anInt7011 == 8) {
				if (Static324.aClass165_2.method3982(1)) {
					Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
					local185 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
					Static337.anInt5633 = (local185 + 3) * 60;
					Static407.anInt7011 = 0;
					Static526.method7023(21);
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					Static119.method2465();
				}
			} else if (Static407.anInt7011 == 14) {
				if (Static324.aClass165_2.method3982(1)) {
					Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
					Static407.anInt7011 = 0;
					Static120.anInt2777 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
					Static526.method7023(29);
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					Static119.method2465();
				}
			} else if (Static407.anInt7011 != 9) {
				@Pc(842) Class3_Sub11_Sub1 local842;
				if (Static407.anInt7011 == 10) {
					if (Static570.anInt9273 == 3) {
						Static270.aBoolean348 = true;
					} else {
						Static270.aBoolean348 = false;
					}
					local842 = Static532.aClass3_Sub11_Sub1_2;
					if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
						if (!Static324.aClass165_2.method3982(Static339.anInt5951)) {
							return;
						}
						Static324.aClass165_2.method3976(Static339.anInt5951, local842.aByteArray62, 0);
						local842.anInt6128 = 0;
						Static500.anInt8114 = local842.method5175();
						Static54.anInt1039 = local842.method5175();
						Static297.aBoolean376 = local842.method5175() == 1;
						Static559.aBoolean709 = local842.method5175() == 1;
						Static28.aBoolean48 = local842.method5175() == 1;
						Static450.aBoolean734 = local842.method5175() == 1;
						Static166.anInt3327 = local842.method5198();
						Static65.aBoolean118 = local842.method5175() == 1;
						Static423.anInt7194 = local842.method5192();
						Static191.aBoolean273 = local842.method5175() == 1;
						if (Static570.anInt9273 == 3) {
							@Pc(961) boolean local961 = local842.method5175() == 1;
							if (local961) {
								@Pc(967) long local967 = local842.method5226();
								@Pc(971) String local971 = Static596.method7952(local967);
								@Pc(975) int local975 = local842.method5175();
								@Pc(978) byte[] local978 = new byte[local975];
								local842.method1386(local978, local975);
								@Pc(988) String local988 = Static153.method2895(local978);
								@Pc(990) Class204 local990 = null;
								try {
									@Pc(996) Class39 local996 = Static237.aClass258_3.method5895("3", false);
									while (local996.anInt894 == 0) {
										Static589.method7892(1L);
									}
									if (local996.anInt894 == 1) {
										local990 = (Class204) local996.anObject2;
										@Pc(1031) int local1031 = local971.length() + local988.length() + 11 + 2 + 3 + 4;
										if (Static286.aString34 != null) {
											local1031 += Static286.aString34.length() + 2;
										}
										if (local1031 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1057) Class3_Sub11 local1057 = new Class3_Sub11(local1031 + 1);
										local1057.method5213(local1031);
										local1057.method5213(3);
										local1057.method5208(local971);
										local1057.method5208(local988);
										local1057.method5200(Static535.anInt8570);
										local1057.method5225(Static149.aLong80);
										local1057.method5213(Static286.aString34 == null ? 0 : 1);
										if (Static286.aString34 != null) {
											local1057.method5208(Static286.aString34);
										}
										local1057.method5209();
										local990.method4678(local1057.anInt6128, 0, local1057.aByteArray62);
									}
								} catch (@Pc(1111) Exception local1111) {
								}
								try {
									if (local990 != null) {
										local990.method4677();
									}
								} catch (@Pc(1118) Exception local1118) {
								}
								try {
									Static600.method2617("demoaccountcreated", Static31.anApplet1);
								} catch (@Pc(1125) Throwable local1125) {
								}
							}
						}
						Static478.aClass212_3.method4791(Static191.aBoolean273);
						Static6.aClass92_1.method2675(Static191.aBoolean273);
						Static361.aClass229_13.method5389(Static191.aBoolean273);
					} else if (Static324.aClass165_2.method3982(Static339.anInt5951)) {
						Static324.aClass165_2.method3976(Static339.anInt5951, local842.aByteArray62, 0);
						local842.anInt6128 = 0;
						Static500.anInt8114 = local842.method5175();
						Static54.anInt1039 = local842.method5175();
						Static297.aBoolean376 = local842.method5175() == 1;
						Static559.aBoolean709 = local842.method5175() == 1;
						Static28.aBoolean48 = local842.method5175() == 1;
						Static550.anInt8759 = local842.method5231();
						Static65.aBoolean118 = Static550.anInt8759 > 0;
						Static37.anInt1628 = local842.method5198();
						Static463.anInt7727 = local842.method5198();
						Static136.anInt2960 = local842.method5198();
						Static579.anInt9371 = local842.method5186();
						Static446.aClass39_5 = Static237.aClass258_3.method5893(Static579.anInt9371);
						Static269.anInt4733 = local842.method5175();
						Static65.anInt1510 = local842.method5198();
						Static591.anInt9676 = local842.method5198();
						Static365.aBoolean456 = local842.method5175() == 1;
						Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString96 = local842.method5210();
						Static269.anInt4731 = local842.method5175();
						Static472.anInt7818 = local842.method5186();
						Static229.aClass51_2 = new Class51();
						Static229.aClass51_2.anInt1589 = local842.method5198();
						if (Static229.aClass51_2.anInt1589 == 65535) {
							Static229.aClass51_2.anInt1589 = -1;
						}
						Static229.aClass51_2.aString8 = local842.method5210();
						if (Static516.aClass272_11 != Static478.aClass272_10) {
							Static229.aClass51_2.anInt1585 = Static229.aClass51_2.anInt1589 + 50000;
							Static229.aClass51_2.anInt1587 = Static229.aClass51_2.anInt1589 + 40000;
						}
						if (Static516.aClass272_11 != Static27.aClass272_7 && (Static221.aClass51_1.method1492(Static318.aClass51_3) || Static221.aClass51_1.method1492(Static399.aClass51_4))) {
							Static34.method545();
						}
					} else {
						return;
					}
					if (Static297.aBoolean376 && !Static28.aBoolean48 || Static65.aBoolean118) {
						try {
							Static600.method2617("zap", Static31.anApplet1);
						} catch (@Pc(1340) Throwable local1340) {
							if (Static592.aBoolean765) {
								try {
									Static31.anApplet1.getAppletContext().showDocument(new URL(Static31.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1354) Exception local1354) {
								}
							}
						}
					} else {
						try {
							Static600.method2617("unzap", Static31.anApplet1);
						} catch (@Pc(1363) Throwable local1363) {
						}
					}
					if (Static516.aClass272_11 == Static478.aClass272_10) {
						try {
							Static600.method2617("loggedin", Static31.anApplet1);
						} catch (@Pc(1376) Throwable local1376) {
						}
					}
					if (Static570.anInt9273 != 2 && Static570.anInt9273 != 3) {
						Static407.anInt7011 = 0;
						Static526.method7023(2);
						Static439.method6147();
						Static25.method439(7);
						Static355.aClass56_123 = null;
						return;
					}
					Static407.anInt7011 = 12;
				}
				if (Static407.anInt7011 == 12) {
					if (!Static324.aClass165_2.method3982(3)) {
						return;
					}
					Static324.aClass165_2.method3976(3, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
					Static407.anInt7011 = 13;
				}
				if (Static407.anInt7011 == 13) {
					local842 = Static532.aClass3_Sub11_Sub1_2;
					local842.anInt6128 = 0;
					if (local842.method1391()) {
						if (!Static324.aClass165_2.method3982(1)) {
							return;
						}
						Static324.aClass165_2.method3976(1, local842.aByteArray62, 3);
					}
					Static355.aClass56_123 = Static587.method7875()[local842.method1389()];
					Static292.anInt4974 = local842.method5198();
					Static407.anInt7011 = 11;
				}
				if (Static407.anInt7011 == 11) {
					if (Static324.aClass165_2.method3982(Static292.anInt4974)) {
						Static324.aClass165_2.method3976(Static292.anInt4974, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
						Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
						Static407.anInt7011 = 0;
						local185 = Static292.anInt4974;
						Static526.method7023(2);
						Static58.method1204();
						Static292.method4374(Static532.aClass3_Sub11_Sub1_2);
						Static110.anInt2172 = -1;
						if (Static355.aClass56_123 == Static130.aClass56_140) {
							Static510.method6880();
						} else {
							Static253.method3899();
						}
						if (local185 != Static532.aClass3_Sub11_Sub1_2.anInt6128) {
							throw new RuntimeException("lswp pos:" + Static532.aClass3_Sub11_Sub1_2.anInt6128 + " psize:" + local185);
						}
						Static355.aClass56_123 = null;
					}
				} else if (Static407.anInt7011 == 15) {
					if (Static292.anInt4974 == -2) {
						if (!Static324.aClass165_2.method3982(2)) {
							return;
						}
						Static324.aClass165_2.method3976(2, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
						Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
						Static292.anInt4974 = Static532.aClass3_Sub11_Sub1_2.method5198();
					}
					if (Static324.aClass165_2.method3982(Static292.anInt4974)) {
						Static324.aClass165_2.method3976(Static292.anInt4974, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
						Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
						local185 = Static292.anInt4974;
						Static407.anInt7011 = 0;
						Static526.method7023(15);
						Static188.method6383();
						Static292.method4374(Static532.aClass3_Sub11_Sub1_2);
						if (local185 != Static532.aClass3_Sub11_Sub1_2.anInt6128) {
							throw new RuntimeException("lswpr pos:" + Static532.aClass3_Sub11_Sub1_2.anInt6128 + " psize:" + local185);
						}
						Static355.aClass56_123 = null;
					}
				}
			} else if (Static324.aClass165_2.method3982(1)) {
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				Static339.anInt5951 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
				Static407.anInt7011 = 10;
			}
		} catch (@Pc(1616) IOException local1616) {
			if (Static324.aClass165_2 != null) {
				Static324.aClass165_2.method3977();
				Static324.aClass165_2 = null;
			}
			if (Static584.anInt9416 >= 2) {
				Static407.anInt7011 = 0;
				Static526.method7023(-4);
				Static119.method2465();
			} else {
				if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
					Static221.aClass51_1.method1489();
				} else {
					Static512.aClass51_5.method1489();
				}
				Static113.anInt2215 = 0;
				Static584.anInt9416++;
				Static407.anInt7011 = 1;
			}
		}
	}
}
