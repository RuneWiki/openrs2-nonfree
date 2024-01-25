import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!he", name = "z", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "J")
	public static long aLong95;

	@OriginalMember(owner = "client!he", name = "zb", descriptor = "Lclient!xa;")
	public static Class58 aClass58_22;

	@OriginalMember(owner = "client!he", name = "vb", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_23 = new Class361();

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method3299() {
		if (Static384.anInt6751 == 0 || Static384.anInt6751 == 6) {
			return;
		}
		try {
			if (++Static10.anInt296 > 2000) {
				if (Static563.aClass127_2 != null) {
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
				}
				if (Static492.anInt8281 >= 2) {
					Static384.anInt6751 = 0;
					Static305.method1149(-5);
					return;
				}
				if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
					Static316.aClass105_5.method2908();
				} else {
					Static188.aClass105_3.method2908();
				}
				Static384.anInt6751 = 1;
				Static492.anInt8281++;
				Static10.anInt296 = 0;
			}
			if (Static384.anInt6751 == 1) {
				if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
					Static75.aClass331_3 = Static316.aClass105_5.method2907(Static352.aClass272_2);
				} else {
					Static75.aClass331_3 = Static188.aClass105_3.method2907(Static352.aClass272_2);
				}
				Static384.anInt6751 = 2;
			}
			if (Static384.anInt6751 == 2) {
				if (Static75.aClass331_3.anInt8818 == 2) {
					throw new IOException();
				}
				if (Static75.aClass331_3.anInt8818 != 1) {
					return;
				}
				Static563.aClass127_2 = Static231.method4069((Socket) Static75.aClass331_3.anObject18);
				Static75.aClass331_3 = null;
				@Pc(122) long local122 = Static228.aLong125 = Static568.method7610(Static216.aString30);
				@Pc(129) int local129 = (int) (local122 >> 16 & 0x1FL);
				Static499.method6761();
				@Pc(134) Class6_Sub31 local134 = Static313.method4898();
				local134.aClass6_Sub21_Sub2_2.method6062(Static530.aClass46_1.anInt1234);
				local134.aClass6_Sub21_Sub2_2.method6062(local129);
				Static534.method7251(local134);
				Static278.method4563();
				Static384.anInt6751 = 3;
			}
			@Pc(178) int local178;
			if (Static384.anInt6751 == 3) {
				if (!Static563.aClass127_2.method6308(1)) {
					return;
				}
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				local178 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
				if (local178 != 0) {
					Static384.anInt6751 = 0;
					Static305.method1149(local178);
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					Static582.method7725();
					return;
				}
				Static384.anInt6751 = 4;
			}
			if (Static384.anInt6751 == 4) {
				if (!Static563.aClass127_2.method6308(8)) {
					return;
				}
				Static563.aClass127_2.method6307(8, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
				Static526.aLong237 = Static282.aClass6_Sub21_Sub2_1.method6018();
				@Pc(227) Class6_Sub21 local227 = new Class6_Sub21(518);
				@Pc(230) int[] local230 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static526.aLong237 >> 32), (int) Static526.aLong237 };
				local227.method6062(10);
				local227.method6033(local230[0]);
				local227.method6033(local230[1]);
				local227.method6033(local230[2]);
				local227.method6033(local230[3]);
				local227.method6019(Static568.method7610(Static216.aString30));
				local227.method6022(Static528.aString99);
				local227.method6019(Static583.aLong261);
				local227.method6019(Static236.aLong129);
				local227.method6070(Static228.aBigInteger3, Static289.aBigInteger9);
				Static499.method6761();
				@Pc(312) Class6_Sub31 local312 = Static313.method4898();
				@Pc(315) Class6_Sub21_Sub2 local315 = local312.aClass6_Sub21_Sub2_2;
				@Pc(335) int local335;
				if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
					if (Static557.anInt9206 == 13) {
						local315.method6062(Static530.aClass46_5.anInt1234);
					} else {
						local315.method6062(Static530.aClass46_3.anInt1234);
					}
					local315.method6052(0);
					local335 = local315.anInt7338;
					local315.method6033(616);
					local315.method6062(Static193.anInt9352);
					local315.method6062(Static74.method1450());
					local315.method6052(Static240.anInt4852);
					local315.method6052(Static196.anInt4059);
					local315.method6062(Static140.aClass6_Sub48_Sub1_1.anInt9013);
					Static443.method6302(local315);
					local315.method6022(Static110.aString17);
					local315.method6033(Static488.anInt5164);
					@Pc(445) Class6_Sub21 local445 = new Class6_Sub21(Static333.method5194());
					Static140.aClass6_Sub48_Sub1_1.method7372(local445);
					local315.method6062(local445.anInt7338);
					local315.method6063(local445.aByteArray93, local445.anInt7338);
					Static408.aBoolean501 = true;
					@Pc(470) Class6_Sub21 local470 = new Class6_Sub21(Static507.method7062());
					(new Class6_Sub14(true, Static352.aClass272_2)).method1682(local470);
					local315.method6063(local470.aByteArray93, local470.aByteArray93.length);
					local315.method6052(Static30.anInt863);
					local315.method6019(Static358.aLong177);
					Static424.method6101(local315);
					local315.method6063(local227.aByteArray93, local227.anInt7338);
					local315.method6014(local315.anInt7338 - local335);
				} else {
					local315.method6062(Static530.aClass46_6.anInt1234);
					local315.method6052(0);
					local335 = local315.anInt7338;
					local315.method6033(616);
					local315.method6062(Static317.aClass37_3.anInt1063);
					local315.method6062(Static25.anInt769);
					Static443.method6302(local315);
					local315.method6022(Static110.aString17);
					local315.method6033(Static488.anInt5164);
					Static424.method6101(local315);
					local315.method6063(local227.aByteArray93, local227.anInt7338);
					local315.method6014(local315.anInt7338 - local335);
				}
				Static534.method7251(local312);
				Static278.method4563();
				Static337.aClass324_1 = new Class324(local230);
				for (local335 = 0; local335 < 4; local335++) {
					local230[local335] += 50;
				}
				Static282.aClass6_Sub21_Sub2_1.method6075(local230);
				Static384.anInt6751 = 5;
			}
			if (Static384.anInt6751 == 5) {
				if (!Static563.aClass127_2.method6308(1)) {
					return;
				}
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				local178 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
				if (local178 == 21) {
					Static384.anInt6751 = 8;
				} else if (local178 == 29) {
					Static384.anInt6751 = 14;
				} else if (local178 == 1) {
					Static384.anInt6751 = 6;
					Static305.method1149(local178);
					return;
				} else if (local178 == 2) {
					Static384.anInt6751 = 9;
				} else if (local178 == 15) {
					Static177.anInt3710 = -2;
					Static384.anInt6751 = 15;
				} else if (local178 == 23 && Static492.anInt8281 < 2) {
					Static492.anInt8281++;
					Static384.anInt6751 = 1;
					Static10.anInt296 = 0;
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					return;
				} else {
					Static384.anInt6751 = 0;
					Static305.method1149(local178);
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					Static582.method7725();
					return;
				}
			}
			@Pc(650) Class6_Sub21_Sub2 local650;
			if (Static384.anInt6751 == 7) {
				Static499.method6761();
				@Pc(647) Class6_Sub31 local647 = Static313.method4898();
				local650 = local647.aClass6_Sub21_Sub2_2;
				local650.method6072(Static337.aClass324_1);
				local650.method6080(Static530.aClass46_13.anInt1234);
				Static534.method7251(local647);
				Static278.method4563();
				Static384.anInt6751 = 5;
			} else if (Static384.anInt6751 == 8) {
				if (Static563.aClass127_2.method6308(1)) {
					Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
					local178 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
					Static384.anInt6751 = 0;
					Static365.anInt6397 = local178 * 60 + 180;
					Static305.method1149(21);
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					Static582.method7725();
				}
			} else if (Static384.anInt6751 == 14) {
				if (Static563.aClass127_2.method6308(1)) {
					Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
					Static384.anInt6751 = 0;
					Static2.anInt25 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
					Static305.method1149(29);
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					Static582.method7725();
				}
			} else if (Static384.anInt6751 != 9) {
				if (Static384.anInt6751 == 10) {
					local650 = Static282.aClass6_Sub21_Sub2_1;
					if (Static560.anInt9247 == 3) {
						Static139.aBoolean227 = true;
					} else {
						Static139.aBoolean227 = false;
					}
					if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
						if (!Static563.aClass127_2.method6308(Static102.anInt1957)) {
							return;
						}
						Static563.aClass127_2.method6307(Static102.anInt1957, 0, local650.aByteArray93);
						local650.anInt7338 = 0;
						Static582.anInt9457 = local650.method6069();
						Static509.anInt9475 = local650.method6069();
						Static181.aBoolean255 = local650.method6069() == 1;
						Static132.aBoolean214 = local650.method6069() == 1;
						Static458.aBoolean554 = local650.method6069() == 1;
						Static82.aBoolean121 = local650.method6069() == 1;
						Static272.anInt5214 = local650.method6003();
						Static318.aBoolean406 = local650.method6069() == 1;
						Static424.anInt7399 = local650.method6043();
						Static448.aBoolean544 = local650.method6069() == 1;
						if (Static560.anInt9247 == 3) {
							@Pc(915) boolean local915 = local650.method6069() == 1;
							if (local915) {
								@Pc(921) long local921 = local650.method6018();
								@Pc(925) String local925 = Static404.method5929(local921);
								@Pc(929) int local929 = local650.method6069();
								@Pc(932) byte[] local932 = new byte[local929];
								local650.method6077(local932, local929);
								@Pc(942) String local942 = Static598.method5910(local932);
								@Pc(944) Class31 local944 = null;
								try {
									@Pc(950) Class331 local950 = Static352.aClass272_2.method6125(false, "3");
									while (local950.anInt8818 == 0) {
										Static318.method4952(1L);
									}
									if (local950.anInt8818 == 1) {
										local944 = (Class31) local950.anObject18;
										@Pc(985) int local985 = local925.length() + local942.length() + 5 + 8 + 2 + 4;
										if (local985 > 60) {
											throw new RuntimeException(">60");
										}
										@Pc(1002) Class6_Sub21 local1002 = new Class6_Sub21(local985 + 1);
										local1002.method6062(local985);
										local1002.method6062(2);
										local1002.method6011(local925);
										local1002.method6011(local942);
										local1002.method6052(Static488.anInt5164);
										local1002.method6019(Static358.aLong177);
										local1002.method6017();
										local944.method1005(local1002.aByteArray93, local1002.anInt7338, 0);
									}
								} catch (@Pc(1040) Exception local1040) {
								}
								try {
									if (local944 != null) {
										local944.method1007();
									}
								} catch (@Pc(1047) Exception local1047) {
								}
								try {
									Static608.method4639(Static249.anApplet1, "demoaccountcreated");
								} catch (@Pc(1054) Throwable local1054) {
								}
							}
						}
						Static412.aClass307_4.method6639(Static448.aBoolean544);
						Static444.aClass322_2.method7134(Static448.aBoolean544);
						Static577.aClass125_2.method3230(Static448.aBoolean544);
					} else if (Static563.aClass127_2.method6308(Static102.anInt1957)) {
						Static563.aClass127_2.method6307(Static102.anInt1957, 0, local650.aByteArray93);
						local650.anInt7338 = 0;
						Static582.anInt9457 = local650.method6069();
						Static509.anInt9475 = local650.method6069();
						Static181.aBoolean255 = local650.method6069() == 1;
						Static132.aBoolean214 = local650.method6069() == 1;
						Static458.aBoolean554 = local650.method6069() == 1;
						Static266.anInt5192 = local650.method6003();
						Static318.aBoolean406 = Static266.anInt5192 > 0;
						Static45.anInt1056 = local650.method6003();
						Static49.anInt1850 = local650.method6003();
						Static276.anInt5250 = local650.method6003();
						Static478.anInt8128 = local650.method6036();
						Static84.aClass331_4 = Static352.aClass272_2.method6124(Static478.anInt8128);
						Static580.anInt9454 = local650.method6069();
						Static255.anInt4963 = local650.method6003();
						Static230.anInt4711 = local650.method6003();
						Static27.aBoolean48 = local650.method6069() == 1;
						Static328.aClass4_Sub1_Sub1_Sub2_2.aString63 = Static328.aClass4_Sub1_Sub1_Sub2_2.aString64 = local650.method6029();
						Static52.anInt1135 = local650.method6069();
						Static505.anInt8389 = local650.method6036();
						Static171.aClass105_2 = new Class105();
						Static171.aClass105_2.anInt3307 = local650.method6003();
						if (Static171.aClass105_2.anInt3307 == 65535) {
							Static171.aClass105_2.anInt3307 = -1;
						}
						Static171.aClass105_2.aString26 = local650.method6029();
						if (Static580.aClass194_7 != Static542.aClass194_5) {
							Static171.aClass105_2.anInt3312 = Static171.aClass105_2.anInt3307 + 50000;
							Static171.aClass105_2.anInt3308 = Static171.aClass105_2.anInt3307 + 40000;
						}
						if (Static542.aClass194_5 != Static5.aClass194_1 && (Static316.aClass105_5.method2910(Static226.aClass105_4) || Static316.aClass105_5.method2910(Static40.aClass105_1))) {
							Static154.method2913();
						}
					} else {
						return;
					}
					if (Static181.aBoolean255 && !Static458.aBoolean554 || Static318.aBoolean406) {
						try {
							Static608.method4639(Static249.anApplet1, "zap");
						} catch (@Pc(1258) Throwable local1258) {
							if (Static346.aBoolean440) {
								try {
									Static249.anApplet1.getAppletContext().showDocument(new URL(Static249.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1272) Exception local1272) {
								}
							}
						}
					} else {
						try {
							Static608.method4639(Static249.anApplet1, "unzap");
						} catch (@Pc(1281) Throwable local1281) {
						}
					}
					if (Static542.aClass194_5 == Static580.aClass194_7) {
						try {
							Static608.method4639(Static249.anApplet1, "loggedin");
						} catch (@Pc(1292) Throwable local1292) {
						}
					}
					if (Static560.anInt9247 != 2 && Static560.anInt9247 != 3) {
						Static384.anInt6751 = 0;
						Static305.method1149(2);
						Static415.method7755();
						Static449.method6350(7);
						Static385.aClass73_128 = null;
						return;
					}
					Static384.anInt6751 = 12;
				}
				if (Static384.anInt6751 == 12) {
					if (!Static563.aClass127_2.method6308(3)) {
						return;
					}
					Static563.aClass127_2.method6307(3, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
					Static384.anInt6751 = 13;
				}
				if (Static384.anInt6751 == 13) {
					local650 = Static282.aClass6_Sub21_Sub2_1;
					local650.anInt7338 = 0;
					if (local650.method6086()) {
						if (!Static563.aClass127_2.method6308(1)) {
							return;
						}
						Static563.aClass127_2.method6307(1, 3, local650.aByteArray93);
					}
					Static385.aClass73_128 = Static517.method7149()[local650.method6074()];
					Static177.anInt3710 = local650.method6003();
					Static384.anInt6751 = 11;
				}
				@Pc(1402) int local1402;
				if (Static384.anInt6751 == 11) {
					if (Static563.aClass127_2.method6308(Static177.anInt3710)) {
						Static563.aClass127_2.method6307(Static177.anInt3710, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
						Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
						local1402 = Static177.anInt3710;
						Static384.anInt6751 = 0;
						Static305.method1149(2);
						Static198.method3581();
						Static438.method6238(Static282.aClass6_Sub21_Sub2_1);
						Static447.anInt7737 = -1;
						if (Static385.aClass73_128 == Static375.aClass73_121) {
							Static501.method6777();
						} else {
							Static587.method7796();
						}
						if (local1402 != Static282.aClass6_Sub21_Sub2_1.anInt7338) {
							throw new RuntimeException("lswp pos:" + Static282.aClass6_Sub21_Sub2_1.anInt7338 + " psize:" + local1402);
						}
						Static385.aClass73_128 = null;
					}
				} else if (Static384.anInt6751 == 15) {
					if (Static177.anInt3710 == -2) {
						if (!Static563.aClass127_2.method6308(2)) {
							return;
						}
						Static563.aClass127_2.method6307(2, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
						Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
						Static177.anInt3710 = Static282.aClass6_Sub21_Sub2_1.method6003();
					}
					if (Static563.aClass127_2.method6308(Static177.anInt3710)) {
						Static563.aClass127_2.method6307(Static177.anInt3710, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
						Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
						local1402 = Static177.anInt3710;
						Static384.anInt6751 = 0;
						Static305.method1149(15);
						Static33.method931();
						Static438.method6238(Static282.aClass6_Sub21_Sub2_1);
						if (Static282.aClass6_Sub21_Sub2_1.anInt7338 != local1402) {
							throw new RuntimeException("lswpr pos:" + Static282.aClass6_Sub21_Sub2_1.anInt7338 + " psize:" + local1402);
						}
						Static385.aClass73_128 = null;
					}
				}
			} else if (Static563.aClass127_2.method6308(1)) {
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				Static384.anInt6751 = 10;
				Static102.anInt1957 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
			}
		} catch (@Pc(1530) IOException local1530) {
			if (Static563.aClass127_2 != null) {
				Static563.aClass127_2.method6305();
				Static563.aClass127_2 = null;
			}
			if (Static492.anInt8281 >= 2) {
				Static384.anInt6751 = 0;
				Static305.method1149(-4);
				Static582.method7725();
			} else {
				if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
					Static316.aClass105_5.method2908();
				} else {
					Static188.aClass105_3.method2908();
				}
				Static492.anInt8281++;
				Static384.anInt6751 = 1;
				Static10.anInt296 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class292 local12 = Static391.method5747(arg3, arg0);
		if (local12 == null) {
			return;
		}
		if (local12.anObjectArray6 != null) {
			@Pc(22) Class6_Sub43 local22 = new Class6_Sub43();
			local22.aClass292_12 = local12;
			local22.aString88 = arg1;
			local22.anInt8286 = arg2;
			local22.anObjectArray34 = local12.anObjectArray6;
			Static446.method6319(local22);
		}
		if (Static557.anInt9206 != 10 || !Static67.method1354(local12).method244(arg2 - 1)) {
			return;
		}
		@Pc(64) Class6_Sub31 local64;
		if (arg2 == 1) {
			local64 = Static114.method2007(Static11.aClass47_8, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 2) {
			local64 = Static114.method2007(Static145.aClass47_51, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 3) {
			local64 = Static114.method2007(Static159.aClass47_156, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 4) {
			local64 = Static114.method2007(Static301.aClass47_89, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 5) {
			local64 = Static114.method2007(Static320.aClass47_96, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 6) {
			local64 = Static114.method2007(Static578.aClass47_148, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 7) {
			local64 = Static114.method2007(Static536.aClass47_140, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 8) {
			local64 = Static114.method2007(Static581.aClass47_153, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 9) {
			local64 = Static114.method2007(Static236.aClass47_75, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
		if (arg2 == 10) {
			local64 = Static114.method2007(Static116.aClass47_37, Static337.aClass324_1);
			Static597.method7852(arg3, arg0, local64, local12.anInt7933);
			Static534.method7251(local64);
		}
	}
}
