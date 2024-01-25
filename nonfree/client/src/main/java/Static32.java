import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!bea", name = "P", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array2;

	@OriginalMember(owner = "client!bea", name = "Y", descriptor = "I")
	public static int anInt850;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)I")
	public static int method824() {
		return 6;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V")
	public static void method825() {
		if (Static428.anInt7883 == 0 || Static428.anInt7883 == 6) {
			return;
		}
		try {
			if (++Static462.anInt8307 > 2000) {
				if (Static467.aClass41_1 != null) {
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
				}
				if (Static498.anInt8761 >= 2) {
					Static428.anInt7883 = 0;
					Static442.method6681(-5);
					return;
				}
				if (Static312.anInt6059 == 2 || Static312.anInt6059 == 3) {
					Static81.aClass319_5.method7698();
				} else {
					Static93.aClass319_6.method7698();
				}
				Static462.anInt8307 = 0;
				Static498.anInt8761++;
				Static428.anInt7883 = 1;
			}
			if (Static428.anInt7883 == 1) {
				if (Static312.anInt6059 == 2 || Static312.anInt6059 == 3) {
					Static369.aClass212_4 = Static81.aClass319_5.method7699(Static401.aClass285_11);
				} else {
					Static369.aClass212_4 = Static93.aClass319_6.method7699(Static401.aClass285_11);
				}
				Static428.anInt7883 = 2;
			}
			if (Static428.anInt7883 == 2) {
				if (Static369.aClass212_4.anInt6547 == 2) {
					throw new IOException();
				}
				if (Static369.aClass212_4.anInt6547 != 1) {
					return;
				}
				Static467.aClass41_1 = Static533.method5630((Socket) Static369.aClass212_4.anObject13);
				Static369.aClass212_4 = null;
				@Pc(133) long local133 = Static133.aLong81 = Static402.method7158(Static494.aString82);
				Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
				@Pc(143) int local143 = (int) (local133 >> 16 & 0x1FL);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static538.aClass42_1.anInt1132);
				Static515.aClass3_Sub27_Sub1_2.method7576(local143);
				Static467.aClass41_1.method1065(2, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
				Static428.anInt7883 = 3;
			}
			@Pc(187) int local187;
			if (Static428.anInt7883 == 3) {
				if (!Static467.aClass41_1.method1071(1)) {
					return;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				local187 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
				if (local187 != 0) {
					Static428.anInt7883 = 0;
					Static442.method6681(local187);
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					Static407.method6158();
					return;
				}
				Static428.anInt7883 = 4;
			}
			if (Static428.anInt7883 == 4) {
				if (!Static467.aClass41_1.method1071(8)) {
					return;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 8);
				Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
				Static128.aLong80 = Static90.aClass3_Sub27_Sub1_1.method7555();
				@Pc(235) Class3_Sub27 local235 = new Class3_Sub27(518);
				@Pc(238) int[] local238 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static128.aLong80 >> 32), (int) Static128.aLong80 };
				local235.method7576(10);
				local235.method7594(local238[0]);
				local235.method7594(local238[1]);
				local235.method7594(local238[2]);
				local235.method7594(local238[3]);
				local235.method7577(Static402.method7158(Static494.aString82));
				local235.method7608(Static179.aString36);
				local235.method7577(Static209.aLong116);
				local235.method7577(Static159.aLong92);
				local235.method7570(Static2.aBigInteger1, Static403.aBigInteger6);
				@Pc(321) Class3_Sub27_Sub1 local321 = Static515.aClass3_Sub27_Sub1_2;
				local321.anInt9191 = 0;
				@Pc(356) int local356;
				if (Static312.anInt6059 == 2 || Static312.anInt6059 == 3) {
					if (Static512.anInt8932 == 12) {
						local321.method7576(Static538.aClass42_5.anInt1132);
					} else {
						local321.method7576(Static538.aClass42_3.anInt1132);
					}
					local321.method7600(0, 30364);
					local356 = local321.anInt9191;
					local321.method7594(611);
					local321.method7576(Static36.anInt940);
					local321.method7576(Static212.method3885());
					local321.method7600(Static480.anInt8652, 30364);
					local321.method7600(Static412.anInt7547, 30364);
					local321.method7576(Static7.aClass3_Sub15_Sub1_1.anInt8366);
					Static328.method5242(local321);
					local321.method7608(Static281.aString42);
					local321.method7594(Static142.anInt2899);
					@Pc(407) Class3_Sub27 local407 = new Class3_Sub27(Static97.method1905());
					Static7.aClass3_Sub15_Sub1_1.method6947(local407);
					local321.method7576(local407.anInt9191);
					local321.method7569(local407.anInt9191, local407.aByteArray114);
					Static118.aBoolean189 = true;
					@Pc(436) Class3_Sub27 local436 = new Class3_Sub27(Static215.method3976());
					(new Class3_Sub7(true, Static401.aClass285_11)).method793(local436);
					local321.method7569(local436.aByteArray114.length, local436.aByteArray114);
					local321.method7600(Static22.anInt8151, 30364);
					Static178.method3430();
					local321.method7569(local235.anInt9191, local235.aByteArray114);
					local321.method7612(local321.anInt9191 - local356);
				} else {
					local321.method7576(Static538.aClass42_6.anInt1132);
					local321.method7600(0, 30364);
					local356 = local321.anInt9191;
					local321.method7594(611);
					local321.method7576(Static222.aClass44_2.anInt1187);
					local321.method7576(Static193.anInt7803);
					Static328.method5242(local321);
					local321.method7608(Static281.aString42);
					local321.method7594(Static142.anInt2899);
					Static178.method3430();
					local321.method7569(local235.anInt9191, local235.aByteArray114);
					local321.method7612(local321.anInt9191 - local356);
				}
				Static467.aClass41_1.method1065(local321.anInt9191, local321.aByteArray114);
				local321.method4543(local238);
				for (local356 = 0; local356 < 4; local356++) {
					local238[local356] += 50;
				}
				Static90.aClass3_Sub27_Sub1_1.method4543(local238);
				Static428.anInt7883 = 5;
			}
			if (Static428.anInt7883 == 5) {
				if (!Static467.aClass41_1.method1071(1)) {
					return;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				local187 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
				if (local187 == 21) {
					Static428.anInt7883 = 8;
				} else if (local187 == 29) {
					Static428.anInt7883 = 14;
				} else if (local187 == 1) {
					Static428.anInt7883 = 6;
					Static442.method6681(local187);
					return;
				} else if (local187 == 2) {
					Static428.anInt7883 = 9;
				} else if (local187 == 15) {
					Static428.anInt7883 = 15;
					Static35.anInt921 = -2;
				} else if (local187 == 23 && Static498.anInt8761 < 2) {
					Static498.anInt8761++;
					Static462.anInt8307 = 0;
					Static428.anInt7883 = 1;
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					return;
				} else {
					Static428.anInt7883 = 0;
					Static442.method6681(local187);
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					Static407.method6158();
					return;
				}
			}
			if (Static428.anInt7883 == 7) {
				Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
				Static515.aClass3_Sub27_Sub1_2.method4542(Static538.aClass42_13.anInt1132);
				Static467.aClass41_1.method1065(Static515.aClass3_Sub27_Sub1_2.anInt9191, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
				Static428.anInt7883 = 5;
			} else if (Static428.anInt7883 == 8) {
				if (Static467.aClass41_1.method1071(1)) {
					Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
					local187 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
					Static428.anInt7883 = 0;
					Static535.anInt9273 = local187 * 60 + 180;
					Static442.method6681(21);
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					Static407.method6158();
				}
			} else if (Static428.anInt7883 == 14) {
				if (Static467.aClass41_1.method1071(1)) {
					Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
					Static97.anInt2022 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
					Static428.anInt7883 = 0;
					Static442.method6681(29);
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					Static407.method6158();
				}
			} else if (Static428.anInt7883 != 9) {
				@Pc(820) Class3_Sub27_Sub1 local820;
				if (Static428.anInt7883 == 10) {
					if (Static312.anInt6059 == 3) {
						Static521.aBoolean666 = true;
					} else {
						Static521.aBoolean666 = false;
					}
					local820 = Static90.aClass3_Sub27_Sub1_1;
					if (Static312.anInt6059 == 2 || Static312.anInt6059 == 3) {
						if (!Static467.aClass41_1.method1071(Static435.anInt7968)) {
							return;
						}
						Static467.aClass41_1.method1068(0, local820.aByteArray114, Static435.anInt7968);
						local820.anInt9191 = 0;
						Static353.anInt6659 = local820.method7548();
						Static250.anInt5122 = local820.method7548();
						Static350.aBoolean421 = local820.method7548() == 1;
						Static128.aBoolean199 = local820.method7548() == 1;
						Static82.aBoolean92 = local820.method7548() == 1;
						Static307.aBoolean339 = local820.method7548() == 1;
						Static342.anInt6448 = local820.method7591();
						Static107.aBoolean167 = local820.method7548() == 1;
						Static393.anInt7219 = local820.method7554();
						Static56.aBoolean91 = local820.method7548() == 1;
						if (Static312.anInt6059 == 3) {
							@Pc(941) boolean local941 = local820.method7548() == 1;
							if (local941) {
								@Pc(947) long local947 = local820.method7555();
								@Pc(951) String local951 = Static190.method3578(local947);
								@Pc(955) int local955 = local820.method7548();
								@Pc(958) byte[] local958 = new byte[local955];
								local820.method4544(local955, local958);
								@Pc(968) String local968 = Static421.method6483(local958);
								@Pc(970) Class323 local970 = null;
								try {
									@Pc(976) Class212 local976 = Static401.aClass285_11.method7034(false, "3");
									while (local976.anInt6547 == 0) {
										Static327.method5231(1L);
									}
									if (local976.anInt6547 == 1) {
										local970 = (Class323) local976.anObject13;
										@Pc(1007) int local1007 = local951.length() + local968.length() + 6 + 2 + 3;
										if (local1007 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1022) Class3_Sub27 local1022 = new Class3_Sub27(local1007 + 1);
										local1022.method7576(local1007);
										local1022.method7576(1);
										local1022.method7582(local951);
										local1022.method7582(local968);
										local1022.method7600(Static142.anInt2899, 30364);
										local1022.method7583();
										local970.method7795(local1022.anInt9191, local1022.aByteArray114, 0);
									}
								} catch (@Pc(1056) Exception local1056) {
								}
								try {
									if (local970 != null) {
										local970.method7794();
									}
								} catch (@Pc(1063) Exception local1063) {
								}
								try {
									Static562.method7815("demoaccountcreated", Static370.anApplet1);
								} catch (@Pc(1070) Throwable local1070) {
								}
							}
						}
						Static454.aClass298_3.method7182(Static56.aBoolean91);
						Static99.aClass96_7.method2497(Static56.aBoolean91);
						Static345.aClass154_1.method4161(Static56.aBoolean91);
					} else if (Static467.aClass41_1.method1071(Static435.anInt7968)) {
						Static467.aClass41_1.method1068(0, local820.aByteArray114, Static435.anInt7968);
						local820.anInt9191 = 0;
						Static353.anInt6659 = local820.method7548();
						Static250.anInt5122 = local820.method7548();
						Static350.aBoolean421 = local820.method7548() == 1;
						Static128.aBoolean199 = local820.method7548() == 1;
						Static82.aBoolean92 = local820.method7548() == 1;
						Static505.anInt8838 = local820.method7591();
						Static107.aBoolean167 = Static505.anInt8838 > 0;
						Static448.anInt8197 = local820.method7591();
						Static531.anInt9236 = local820.method7591();
						Static224.anInt4840 = local820.method7591();
						Static374.anInt7021 = local820.method7549();
						Static289.aClass212_2 = Static401.aClass285_11.method7042(Static374.anInt7021);
						Static187.anInt4272 = local820.method7548();
						Static359.anInt6717 = local820.method7591();
						Static308.anInt6013 = local820.method7591();
						Static270.aBoolean363 = local820.method7548() == 1;
						Static111.aClass6_Sub1_Sub2_Sub1_3.aString27 = Static111.aClass6_Sub1_Sub2_Sub1_3.aString28 = local820.method7572();
						Static547.aClass319_11 = new Class319();
						Static547.aClass319_11.anInt9320 = local820.method7591();
						if (Static547.aClass319_11.anInt9320 == 65535) {
							Static547.aClass319_11.anInt9320 = -1;
						}
						Static547.aClass319_11.aString85 = local820.method7572();
						if (Static464.aClass253_15 != Static327.aClass253_10) {
							Static547.aClass319_11.anInt9319 = Static547.aClass319_11.anInt9320 + 50000;
							Static547.aClass319_11.anInt9315 = Static547.aClass319_11.anInt9320 + 40000;
						}
						if (Static464.aClass253_15 != Static440.aClass253_13 && (Static81.aClass319_5.method7697(Static426.aClass319_10) || Static81.aClass319_5.method7697(Static112.aClass319_9))) {
							Static375.method5892();
						}
					} else {
						return;
					}
					if (Static350.aBoolean421 && !Static82.aBoolean92 || Static107.aBoolean167) {
						try {
							Static562.method7815("zap", Static370.anApplet1);
						} catch (@Pc(1267) Throwable local1267) {
							if (Static83.aBoolean134) {
								try {
									Static370.anApplet1.getAppletContext().showDocument(new URL(Static370.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1281) Exception local1281) {
								}
							}
						}
					} else {
						try {
							Static562.method7815("unzap", Static370.anApplet1);
						} catch (@Pc(1290) Throwable local1290) {
						}
					}
					if (Static327.aClass253_10 == Static464.aClass253_15) {
						try {
							Static562.method7815("loggedin", Static370.anApplet1);
						} catch (@Pc(1301) Throwable local1301) {
						}
					}
					if (Static312.anInt6059 != 2 && Static312.anInt6059 != 3) {
						Static428.anInt7883 = 0;
						Static442.method6681(2);
						Static378.method5908();
						Static333.method5283(6);
						Static522.aClass133_166 = null;
						return;
					}
					Static428.anInt7883 = 12;
				}
				if (Static428.anInt7883 == 12) {
					if (!Static467.aClass41_1.method1071(3)) {
						return;
					}
					Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 3);
					Static428.anInt7883 = 13;
				}
				if (Static428.anInt7883 == 13) {
					local820 = Static90.aClass3_Sub27_Sub1_1;
					local820.anInt9191 = 0;
					if (local820.method4534()) {
						if (!Static467.aClass41_1.method1071(1)) {
							return;
						}
						Static467.aClass41_1.method1068(3, local820.aByteArray114, 1);
					}
					Static522.aClass133_166 = Static247.method4277()[local820.method4545()];
					Static35.anInt921 = local820.method7591();
					Static428.anInt7883 = 11;
				}
				if (Static428.anInt7883 == 11) {
					if (Static467.aClass41_1.method1071(Static35.anInt921)) {
						Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, Static35.anInt921);
						Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
						local187 = Static35.anInt921;
						Static428.anInt7883 = 0;
						Static442.method6681(2);
						Static132.method2306();
						Static403.method6134(Static90.aClass3_Sub27_Sub1_1);
						Static429.anInt7899 = -1;
						if (Static164.aClass133_70 == Static522.aClass133_166) {
							Static25.method784();
						} else {
							Static224.method4060();
						}
						if (Static90.aClass3_Sub27_Sub1_1.anInt9191 != local187) {
							throw new RuntimeException("lswp pos:" + Static90.aClass3_Sub27_Sub1_1.anInt9191 + " psize:" + local187);
						}
						Static522.aClass133_166 = null;
					}
				} else if (Static428.anInt7883 == 15) {
					if (Static35.anInt921 == -2) {
						if (!Static467.aClass41_1.method1071(2)) {
							return;
						}
						Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 2);
						Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
						Static35.anInt921 = Static90.aClass3_Sub27_Sub1_1.method7591();
					}
					if (Static467.aClass41_1.method1071(Static35.anInt921)) {
						Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, Static35.anInt921);
						Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
						Static428.anInt7883 = 0;
						local187 = Static35.anInt921;
						Static442.method6681(15);
						Static331.method5275();
						Static403.method6134(Static90.aClass3_Sub27_Sub1_1);
						if (Static90.aClass3_Sub27_Sub1_1.anInt9191 != local187) {
							throw new RuntimeException("lswpr pos:" + Static90.aClass3_Sub27_Sub1_1.anInt9191 + " psize:" + local187);
						}
						Static522.aClass133_166 = null;
					}
				}
			} else if (Static467.aClass41_1.method1071(1)) {
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				Static428.anInt7883 = 10;
				Static435.anInt7968 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
			}
		} catch (@Pc(1539) IOException local1539) {
			if (Static467.aClass41_1 != null) {
				Static467.aClass41_1.method1066();
				Static467.aClass41_1 = null;
			}
			if (Static498.anInt8761 >= 2) {
				Static428.anInt7883 = 0;
				Static442.method6681(-4);
				Static407.method6158();
			} else {
				if (Static312.anInt6059 == 2 || Static312.anInt6059 == 3) {
					Static81.aClass319_5.method7698();
				} else {
					Static93.aClass319_6.method7698();
				}
				Static498.anInt8761++;
				Static428.anInt7883 = 1;
				Static462.anInt8307 = 0;
			}
		}
	}
}
