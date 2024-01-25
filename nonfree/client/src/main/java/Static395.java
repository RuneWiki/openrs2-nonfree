import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!pl;")
	public static Class259 aClass259_127;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_194 = new Class363(17, 5);

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!nw;")
	public static final Class236 aClass236_3 = new Class236();

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	public static int anInt6895 = 0;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Z")
	public static final boolean aBoolean533 = false;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	public static int anInt6896 = -1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII)V")
	public static void method5767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) Class346 local24 = Static389.aClass346ArrayArrayArray2[arg4][arg3][arg2];
		if (local24 == null) {
			local24 = new Class346(arg4);
		}
		if (arg0 == 1) {
			local24.aShort111 = (short) arg5;
			local24.aShort113 = (short) arg1;
		} else if (arg0 == 2) {
			local24.aShort110 = (short) arg5;
			local24.aShort112 = (short) arg1;
		}
		if (Static260.aBoolean387) {
			Static211.method6710();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBZ)I")
	public static int method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(16) Class2_Sub23 local16 = Static124.method1801(arg2, arg0);
		if (local16 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local16.anIntArray233.length) {
			return local16.anIntArray233[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public static void method5770() {
		if (Static199.anInt3950 == 0 || Static199.anInt3950 == 6) {
			return;
		}
		try {
			if (++Static472.anInt8066 > 2000) {
				if (Static57.aClass116_1 != null) {
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
				}
				if (Static283.anInt5058 >= 2) {
					Static199.anInt3950 = 0;
					Static139.method2346(-5);
					return;
				}
				if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
					Static176.aClass170_3.method3783();
				} else {
					Static59.aClass170_1.method3783();
				}
				Static199.anInt3950 = 1;
				Static283.anInt5058++;
				Static472.anInt8066 = 0;
			}
			if (Static199.anInt3950 == 1) {
				if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
					Static321.aClass347_2 = Static176.aClass170_3.method3780(Static356.aClass287_5);
				} else {
					Static321.aClass347_2 = Static59.aClass170_1.method3780(Static356.aClass287_5);
				}
				Static199.anInt3950 = 2;
			}
			if (Static199.anInt3950 == 2) {
				if (Static321.aClass347_2.anInt9172 == 2) {
					throw new IOException();
				}
				if (Static321.aClass347_2.anInt9172 != 1) {
					return;
				}
				Static57.aClass116_1 = Static30.method547((Socket) Static321.aClass347_2.anObject49);
				Static321.aClass347_2 = null;
				@Pc(124) long local124 = Static430.aLong205 = Static3.method14(Static392.aString61);
				@Pc(131) int local131 = (int) (local124 >> 16 & 0x1FL);
				Static393.method5764();
				@Pc(136) Class2_Sub42 local136 = Static180.method3103();
				local136.aClass2_Sub15_Sub2_2.method4333(Static193.aClass180_1.anInt4831);
				local136.aClass2_Sub15_Sub2_2.method4333(local131);
				Static531.method7296(local136);
				Static550.method7463();
				Static199.anInt3950 = 3;
			}
			@Pc(180) int local180;
			if (Static199.anInt3950 == 3) {
				if (!Static57.aClass116_1.method2480(1)) {
					return;
				}
				Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
				local180 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
				if (local180 != 0) {
					Static199.anInt3950 = 0;
					Static139.method2346(local180);
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
					Static60.method963();
					return;
				}
				Static199.anInt3950 = 4;
			}
			if (Static199.anInt3950 == 4) {
				if (!Static57.aClass116_1.method2480(8)) {
					return;
				}
				Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 8);
				Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
				Static35.aLong31 = Static133.aClass2_Sub15_Sub2_1.method4351();
				@Pc(231) Class2_Sub15 local231 = new Class2_Sub15(518);
				@Pc(234) int[] local234 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static35.aLong31 >> 32), (int) Static35.aLong31 };
				local231.method4333(10);
				local231.method4288(local234[0]);
				local231.method4288(local234[1]);
				local231.method4288(local234[2]);
				local231.method4288(local234[3]);
				local231.method4318(Static3.method14(Static392.aString61));
				local231.method4313(Static286.aString44);
				local231.method4318(Static27.aLong23);
				local231.method4318(Static351.aLong159);
				local231.method4301(Static357.aBigInteger6, Static534.aBigInteger9);
				Static393.method5764();
				@Pc(316) Class2_Sub42 local316 = Static180.method3103();
				@Pc(319) Class2_Sub15_Sub2 local319 = local316.aClass2_Sub15_Sub2_2;
				@Pc(337) int local337;
				if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
					if (Static201.anInt3963 == 13) {
						local319.method4333(Static193.aClass180_5.anInt4831);
					} else {
						local319.method4333(Static193.aClass180_3.anInt4831);
					}
					local319.method4350(0);
					local337 = local319.anInt5241;
					local319.method4288(621);
					local319.method4333(Static402.anInt7015);
					local319.method4333(Static212.method3434());
					local319.method4350(Static140.anInt2937);
					local319.method4350(Static120.anInt2371);
					local319.method4333(Static72.aClass2_Sub12_Sub1_1.anInt1927);
					Static568.method7712(local319);
					local319.method4313(Static397.aString62);
					local319.method4288(Static200.anInt3958);
					@Pc(449) Class2_Sub15 local449 = new Class2_Sub15(Static514.method237());
					Static72.aClass2_Sub12_Sub1_1.method1406(local449);
					local319.method4333(local449.anInt5241);
					local319.method4299(local449.anInt5241, local449.aByteArray62);
					Static335.aBoolean491 = true;
					@Pc(474) Class2_Sub15 local474 = new Class2_Sub15(Static282.method4202());
					(new Class2_Sub28(true, Static356.aClass287_5)).method4574(local474);
					local319.method4299(local474.aByteArray62.length, local474.aByteArray62);
					local319.method4350(Static444.anInt7770);
					local319.method4318(Static15.aLong12);
					local319.method4333(Static46.aString8 == null ? 0 : 1);
					if (Static46.aString8 != null) {
						local319.method4313(Static46.aString8);
					}
					Static82.method1280(local319);
					local319.method4299(local231.anInt5241, local231.aByteArray62);
					local319.method4305(local319.anInt5241 - local337);
				} else {
					local319.method4333(Static193.aClass180_6.anInt4831);
					local319.method4350(0);
					local337 = local319.anInt5241;
					local319.method4288(621);
					local319.method4333(Static328.aClass284_2.anInt7923);
					local319.method4333(Static52.anInt1264);
					Static568.method7712(local319);
					local319.method4313(Static397.aString62);
					local319.method4288(Static200.anInt3958);
					Static82.method1280(local319);
					local319.method4299(local231.anInt5241, local231.aByteArray62);
					local319.method4305(local319.anInt5241 - local337);
				}
				Static531.method7296(local316);
				Static550.method7463();
				Static400.aClass145_2 = new Class145(local234);
				for (local337 = 0; local337 < 4; local337++) {
					local234[local337] += 50;
				}
				Static133.aClass2_Sub15_Sub2_1.method4363(local234);
				Static199.anInt3950 = 5;
			}
			if (Static199.anInt3950 == 5) {
				if (!Static57.aClass116_1.method2480(1)) {
					return;
				}
				Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
				local180 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
				if (local180 == 21) {
					Static199.anInt3950 = 8;
				} else if (local180 == 29) {
					Static199.anInt3950 = 14;
				} else if (local180 == 1) {
					Static199.anInt3950 = 6;
					Static139.method2346(local180);
					return;
				} else if (local180 == 2) {
					Static199.anInt3950 = 9;
				} else if (local180 == 15) {
					Static65.anInt1500 = -2;
					Static199.anInt3950 = 15;
				} else if (local180 == 23 && Static283.anInt5058 < 2) {
					Static199.anInt3950 = 1;
					Static283.anInt5058++;
					Static472.anInt8066 = 0;
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
					return;
				} else {
					Static199.anInt3950 = 0;
					Static139.method2346(local180);
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
					Static60.method963();
					return;
				}
			}
			if (Static199.anInt3950 == 7) {
				Static393.method5764();
				@Pc(687) Class2_Sub42 local687 = Static180.method3103();
				@Pc(690) Class2_Sub15_Sub2 local690 = local687.aClass2_Sub15_Sub2_2;
				local690.method4353(Static400.aClass145_2);
				local690.method4352(Static193.aClass180_13.anInt4831);
				Static531.method7296(local687);
				Static550.method7463();
				Static199.anInt3950 = 5;
			} else {
				@Pc(731) int local731;
				if (Static199.anInt3950 == 8) {
					if (Static57.aClass116_1.method2480(1)) {
						Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
						local731 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
						Static199.anInt3950 = 0;
						Static354.anInt4540 = (local731 + 3) * 60;
						Static139.method2346(21);
						Static57.aClass116_1.method2483();
						Static57.aClass116_1 = null;
						Static60.method963();
					}
				} else if (Static199.anInt3950 == 14) {
					if (Static57.aClass116_1.method2480(1)) {
						Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
						Static229.anInt4299 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
						Static199.anInt3950 = 0;
						Static139.method2346(29);
						Static57.aClass116_1.method2483();
						Static57.aClass116_1 = null;
						Static60.method963();
					}
				} else if (Static199.anInt3950 != 9) {
					@Pc(823) Class2_Sub15_Sub2 local823;
					if (Static199.anInt3950 == 10) {
						local823 = Static133.aClass2_Sub15_Sub2_1;
						if (Static253.anInt4705 == 3) {
							Static546.aBoolean686 = true;
						} else {
							Static546.aBoolean686 = false;
						}
						if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
							if (!Static57.aClass116_1.method2480(Static475.anInt8150)) {
								return;
							}
							Static57.aClass116_1.method2476(0, local823.aByteArray62, Static475.anInt8150);
							local823.anInt5241 = 0;
							Static210.anInt4045 = local823.method4325();
							Static422.anInt7237 = local823.method4325();
							Static216.aBoolean339 = local823.method4325() == 1;
							Static500.aBoolean652 = local823.method4325() == 1;
							Static372.aBoolean513 = local823.method4325() == 1;
							Static532.aBoolean675 = local823.method4325() == 1;
							Static222.anInt4184 = local823.method4294();
							Static161.aBoolean284 = local823.method4325() == 1;
							Static290.anInt5293 = local823.method4348();
							Static451.aBoolean23 = local823.method4325() == 1;
							if (Static253.anInt4705 == 3) {
								@Pc(1127) boolean local1127 = local823.method4325() == 1;
								if (local1127) {
									@Pc(1133) long local1133 = local823.method4351();
									@Pc(1137) String local1137 = Static268.method7982(local1133);
									@Pc(1141) int local1141 = local823.method4325();
									@Pc(1144) byte[] local1144 = new byte[local1141];
									local823.method4360(local1141, local1144);
									@Pc(1154) String local1154 = Static369.method5495(local1144);
									@Pc(1156) Class63 local1156 = null;
									try {
										@Pc(1162) Class347 local1162 = Static356.aClass287_5.method6548("3", false);
										while (local1162.anInt9172 == 0) {
											Static459.method6498(1L);
										}
										if (local1162.anInt9172 == 1) {
											local1156 = (Class63) local1162.anObject49;
											@Pc(1192) int local1192 = local1137.length() + local1154.length() + 17 + 2 + 1;
											if (Static46.aString8 != null) {
												local1192 += Static46.aString8.length() + 2;
											}
											if (local1192 > 120) {
												throw new RuntimeException(">120");
											}
											@Pc(1218) Class2_Sub15 local1218 = new Class2_Sub15(local1192 + 1);
											local1218.method4333(local1192);
											local1218.method4333(3);
											local1218.method4300(local1137);
											local1218.method4300(local1154);
											local1218.method4350(Static200.anInt3958);
											local1218.method4318(Static15.aLong12);
											local1218.method4333(Static46.aString8 == null ? 0 : 1);
											if (Static46.aString8 != null) {
												local1218.method4300(Static46.aString8);
											}
											local1218.method4293();
											local1156.method1176(0, local1218.anInt5241, local1218.aByteArray62);
										}
									} catch (@Pc(1270) Exception local1270) {
									}
									try {
										if (local1156 != null) {
											local1156.method1174();
										}
									} catch (@Pc(1277) Exception local1277) {
									}
									try {
										Static602.method6577("demoaccountcreated", Static562.anApplet2);
									} catch (@Pc(1284) Throwable local1284) {
									}
								}
							}
							Static541.aClass97_4.method1799(Static451.aBoolean23);
							Static296.aClass218_1.method5064(Static451.aBoolean23);
							Static254.aClass202_2.method4491(Static451.aBoolean23);
						} else if (Static57.aClass116_1.method2480(Static475.anInt8150)) {
							Static57.aClass116_1.method2476(0, local823.aByteArray62, Static475.anInt8150);
							local823.anInt5241 = 0;
							Static210.anInt4045 = local823.method4325();
							Static422.anInt7237 = local823.method4325();
							Static216.aBoolean339 = local823.method4325() == 1;
							Static500.aBoolean652 = local823.method4325() == 1;
							Static372.aBoolean513 = local823.method4325() == 1;
							Static457.anInt7912 = local823.method4334();
							Static161.aBoolean284 = Static457.anInt7912 > 0;
							Static62.anInt1432 = local823.method4294();
							Static521.anInt8610 = local823.method4294();
							Static479.anInt8197 = local823.method4294();
							Static135.anInt2837 = local823.method4307();
							Static474.aClass347_8 = Static356.aClass287_5.method6535(Static135.anInt2837);
							Static121.anInt2374 = local823.method4325();
							Static420.anInt7199 = local823.method4294();
							Static41.anInt1019 = local823.method4294();
							Static396.aBoolean385 = local823.method4325() == 1;
							Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString66 = local823.method4321();
							Static456.anInt7889 = local823.method4325();
							Static193.anInt3880 = local823.method4307();
							Static267.aClass170_4 = new Class170();
							Static267.aClass170_4.anInt4548 = local823.method4294();
							if (Static267.aClass170_4.anInt4548 == 65535) {
								Static267.aClass170_4.anInt4548 = -1;
							}
							Static267.aClass170_4.aString35 = local823.method4321();
							if (Static375.aClass258_6 != Static207.aClass258_3) {
								Static267.aClass170_4.anInt4550 = Static267.aClass170_4.anInt4548 + 40000;
								Static267.aClass170_4.anInt4549 = Static267.aClass170_4.anInt4548 + 50000;
							}
							if (Static207.aClass258_3 != Static558.aClass258_7 && (Static176.aClass170_3.method3782(Static275.aClass170_5) || Static176.aClass170_3.method3782(Static109.aClass170_2))) {
								Static556.method7587();
							}
						} else {
							return;
						}
						if (Static216.aBoolean339 && !Static372.aBoolean513 || Static161.aBoolean284) {
							try {
								Static602.method6577("zap", Static562.anApplet2);
							} catch (@Pc(1310) Throwable local1310) {
								if (Static594.aBoolean733) {
									try {
										Static562.anApplet2.getAppletContext().showDocument(new URL(Static562.anApplet2.getCodeBase(), "blank.ws"), "tbi");
									} catch (@Pc(1324) Exception local1324) {
									}
								}
							}
						} else {
							try {
								Static602.method6577("unzap", Static562.anApplet2);
							} catch (@Pc(1333) Throwable local1333) {
							}
						}
						if (Static207.aClass258_3 == Static375.aClass258_6) {
							try {
								Static602.method6577("loggedin", Static562.anApplet2);
							} catch (@Pc(1344) Throwable local1344) {
							}
						}
						if (Static253.anInt4705 != 2 && Static253.anInt4705 != 3) {
							Static199.anInt3950 = 0;
							Static139.method2346(2);
							Static359.method5305();
							Static121.method1780(7);
							Static497.aClass363_245 = null;
							return;
						}
						Static199.anInt3950 = 12;
					}
					if (Static199.anInt3950 == 12) {
						if (!Static57.aClass116_1.method2480(3)) {
							return;
						}
						Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 3);
						Static199.anInt3950 = 13;
					}
					if (Static199.anInt3950 == 13) {
						local823 = Static133.aClass2_Sub15_Sub2_1;
						local823.anInt5241 = 0;
						if (local823.method4359()) {
							if (!Static57.aClass116_1.method2480(1)) {
								return;
							}
							Static57.aClass116_1.method2476(3, local823.aByteArray62, 1);
						}
						Static497.aClass363_245 = Static106.method5544()[local823.method4354()];
						Static65.anInt1500 = local823.method4294();
						Static199.anInt3950 = 11;
					}
					if (Static199.anInt3950 == 11) {
						if (Static57.aClass116_1.method2480(Static65.anInt1500)) {
							Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, Static65.anInt1500);
							Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
							Static199.anInt3950 = 0;
							local731 = Static65.anInt1500;
							Static139.method2346(2);
							Static517.method7143();
							Static310.method4647(Static133.aClass2_Sub15_Sub2_1);
							Static584.anInt9529 = -1;
							if (Static291.aClass363_142 == Static497.aClass363_245) {
								Static250.method3918();
							} else {
								Static356.method5273();
							}
							if (Static133.aClass2_Sub15_Sub2_1.anInt5241 != local731) {
								throw new RuntimeException("lswp pos:" + Static133.aClass2_Sub15_Sub2_1.anInt5241 + " psize:" + local731);
							}
							Static497.aClass363_245 = null;
						}
					} else if (Static199.anInt3950 == 15) {
						if (Static65.anInt1500 == -2) {
							if (!Static57.aClass116_1.method2480(2)) {
								return;
							}
							Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 2);
							Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
							Static65.anInt1500 = Static133.aClass2_Sub15_Sub2_1.method4294();
						}
						if (Static57.aClass116_1.method2480(Static65.anInt1500)) {
							Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, Static65.anInt1500);
							Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
							Static199.anInt3950 = 0;
							local731 = Static65.anInt1500;
							Static139.method2346(15);
							Static324.method5011();
							Static310.method4647(Static133.aClass2_Sub15_Sub2_1);
							if (local731 != Static133.aClass2_Sub15_Sub2_1.anInt5241) {
								throw new RuntimeException("lswpr pos:" + Static133.aClass2_Sub15_Sub2_1.anInt5241 + " psize:" + local731);
							}
							Static497.aClass363_245 = null;
						}
					}
				} else if (Static57.aClass116_1.method2480(1)) {
					Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
					Static475.anInt8150 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
					Static199.anInt3950 = 10;
				}
			}
		} catch (@Pc(1576) IOException local1576) {
			if (Static57.aClass116_1 != null) {
				Static57.aClass116_1.method2483();
				Static57.aClass116_1 = null;
			}
			if (Static283.anInt5058 >= 2) {
				Static199.anInt3950 = 0;
				Static139.method2346(-4);
				Static60.method963();
			} else {
				if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
					Static176.aClass170_3.method3783();
				} else {
					Static59.aClass170_1.method3783();
				}
				Static472.anInt8066 = 0;
				Static283.anInt5058++;
				Static199.anInt3950 = 1;
			}
		}
	}
}
