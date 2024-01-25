import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "[I")
	public static final int[] anIntArray143 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z")
	public static boolean method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BLclient!dc;IB)Lclient!mi;")
	public static Class225 method860(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class66_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local16);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static130.anIntArray290, 0);
		if (Static130.anIntArray290[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class225(arg1, 34336, local16);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
	public static int method861(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(169) int local169 = (int) (local62 * 256.0D);
		@Pc(174) int local174 = (int) (local68 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local174 < 0) {
			local174 = 0;
		} else if (local174 > 255) {
			local174 = 255;
		}
		if (local174 > 243) {
			local169 >>= 0x4;
		} else if (local174 > 217) {
			local169 >>= 0x3;
		} else if (local174 > 192) {
			local169 >>= 0x2;
		} else if (local174 > 179) {
			local169 >>= 0x1;
		}
		return (local174 >> 1) + (((local156 & 0xFF) >> 2 << 10) + (local169 >> 5 << 7));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method862() {
		if (Static81.anInt9842 == 0 || Static81.anInt9842 == 6) {
			return;
		}
		try {
			if (++Static574.anInt6915 > 2000) {
				if (Static235.aClass45_1 != null) {
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
				}
				if (Static101.anInt2479 >= 2) {
					Static81.anInt9842 = 0;
					Static112.method2333(-5);
					return;
				}
				if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
					Static238.aClass300_10.method6607();
				} else {
					Static549.aClass300_11.method6607();
				}
				Static574.anInt6915 = 0;
				Static101.anInt2479++;
				Static81.anInt9842 = 1;
			}
			if (Static81.anInt9842 == 1) {
				if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
					Static151.aClass299_1 = Static238.aClass300_10.method6606(Static147.aClass161_4);
				} else {
					Static151.aClass299_1 = Static549.aClass300_11.method6606(Static147.aClass161_4);
				}
				Static81.anInt9842 = 2;
			}
			if (Static81.anInt9842 == 2) {
				if (Static151.aClass299_1.anInt7985 == 2) {
					throw new IOException();
				}
				if (Static151.aClass299_1.anInt7985 != 1) {
					return;
				}
				Static235.aClass45_1 = Static516.method2306((Socket) Static151.aClass299_1.anObject41);
				Static151.aClass299_1 = null;
				@Pc(119) long local119 = Static456.aLong231 = Static551.method7610(Static39.aString11);
				Static107.method6136();
				@Pc(128) int local128 = (int) (local119 >> 16 & 0x1FL);
				@Pc(131) Class4_Sub41 local131 = Static212.method3682();
				local131.aClass4_Sub9_Sub1_3.method5961(-345277664, Static581.aClass118_1.anInt3562);
				local131.aClass4_Sub9_Sub1_3.method5961(-345277664, local128);
				Static551.method7603(local131);
				Static315.method4803();
				Static81.anInt9842 = 3;
			}
			@Pc(175) int local175;
			if (Static81.anInt9842 == 3) {
				if (!Static235.aClass45_1.method841(1)) {
					return;
				}
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				local175 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
				if (local175 != 0) {
					Static81.anInt9842 = 0;
					Static112.method2333(local175);
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					Static363.method5454();
					return;
				}
				Static81.anInt9842 = 4;
			}
			if (Static81.anInt9842 == 4) {
				if (!Static235.aClass45_1.method841(8)) {
					return;
				}
				Static235.aClass45_1.method838(8, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
				Static531.aLong274 = Static487.aClass4_Sub9_Sub1_2.method5997();
				@Pc(225) Class4_Sub9 local225 = new Class4_Sub9(518);
				@Pc(228) int[] local228 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static531.aLong274 >> 32), (int) Static531.aLong274 };
				local225.method5961(-345277664, 10);
				local225.method5963(local228[0]);
				local225.method5963(local228[1]);
				local225.method5963(local228[2]);
				local225.method5963(local228[3]);
				local225.method6008(Static551.method7610(Static39.aString11));
				local225.method6000(Static321.aString71);
				local225.method6008(Static290.aLong151);
				local225.method6008(Static35.aLong27);
				local225.method5975(Static204.aBigInteger4, Static574.aBigInteger8);
				Static107.method6136();
				@Pc(314) Class4_Sub41 local314 = Static212.method3682();
				@Pc(317) Class4_Sub9_Sub1 local317 = local314.aClass4_Sub9_Sub1_3;
				@Pc(347) int local347;
				if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
					if (Static598.anInt9831 == 13) {
						local317.method5961(-345277664, Static581.aClass118_5.anInt3562);
					} else {
						local317.method5961(-345277664, Static581.aClass118_3.anInt3562);
					}
					local317.method6012(0);
					local347 = local317.anInt7219;
					local317.method5963(617);
					local317.method5961(-345277664, Static64.anInt1206);
					local317.method5961(-345277664, Static420.method6044());
					local317.method6012(Static2.anInt29);
					local317.method6012(Static19.anInt390);
					local317.method5961(-345277664, Static189.aClass4_Sub2_Sub1_1.anInt9297);
					Static28.method519(local317);
					local317.method6000(Static71.aString16);
					local317.method5963(Static431.anInt7395);
					@Pc(394) Class4_Sub9 local394 = new Class4_Sub9(Static12.method272());
					Static189.aClass4_Sub2_Sub1_1.method7639(local394);
					local317.method5961(-345277664, local394.anInt7219);
					local317.method5985(local394.aByteArray97, local394.anInt7219);
					Static47.aBoolean78 = true;
					@Pc(421) Class4_Sub9 local421 = new Class4_Sub9(Static105.method2290());
					(new Class4_Sub8(true, Static147.aClass161_4)).method698(local421);
					local317.method5985(local421.aByteArray97, local421.aByteArray97.length);
					local317.method6012(Static102.anInt2529);
					local317.method6008(Static316.aLong165);
					local317.method5961(-345277664, Static248.aString60 == null ? 0 : 1);
					if (Static248.aString60 != null) {
						local317.method6000(Static248.aString60);
					}
					Static432.method6135(local317);
					local317.method5985(local225.aByteArray97, local225.anInt7219);
					local317.method5996(local317.anInt7219 - local347);
				} else {
					local317.method5961(-345277664, Static581.aClass118_6.anInt3562);
					local317.method6012(0);
					local347 = local317.anInt7219;
					local317.method5963(617);
					local317.method5961(-345277664, Static538.aClass263_5.anInt6964);
					local317.method5961(-345277664, Static56.anInt953);
					Static28.method519(local317);
					local317.method6000(Static71.aString16);
					local317.method5963(Static431.anInt7395);
					Static432.method6135(local317);
					local317.method5985(local225.aByteArray97, local225.anInt7219);
					local317.method5996(local317.anInt7219 - local347);
				}
				Static551.method7603(local314);
				Static315.method4803();
				Class16_Sub3.lb = new Class309(local228);
				for (local347 = 0; local347 < 4; local347++) {
					local228[local347] += 50;
				}
				Static487.aClass4_Sub9_Sub1_2.method1049(local228);
				Static81.anInt9842 = 5;
			}
			if (Static81.anInt9842 == 5) {
				if (!Static235.aClass45_1.method841(1)) {
					return;
				}
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				local175 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
				if (local175 == 21) {
					Static81.anInt9842 = 8;
				} else if (local175 == 29) {
					Static81.anInt9842 = 14;
				} else if (local175 == 1) {
					Static81.anInt9842 = 6;
					Static112.method2333(local175);
					return;
				} else if (local175 == 2) {
					Static81.anInt9842 = 9;
				} else if (local175 == 15) {
					Static81.anInt9842 = 15;
					Static474.anInt4412 = -2;
				} else if (local175 == 23 && Static101.anInt2479 < 2) {
					Static81.anInt9842 = 1;
					Static101.anInt2479++;
					Static574.anInt6915 = 0;
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					return;
				} else {
					Static81.anInt9842 = 0;
					Static112.method2333(local175);
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					Static363.method5454();
					return;
				}
			}
			if (Static81.anInt9842 == 7) {
				Static107.method6136();
				@Pc(685) Class4_Sub41 local685 = Static212.method3682();
				@Pc(688) Class4_Sub9_Sub1 local688 = local685.aClass4_Sub9_Sub1_3;
				local688.method1048(Class16_Sub3.lb);
				local688.method1038(Static581.aClass118_13.anInt3562);
				Static551.method7603(local685);
				Static315.method4803();
				Static81.anInt9842 = 5;
			} else if (Static81.anInt9842 == 8) {
				if (Static235.aClass45_1.method841(1)) {
					Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
					local175 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
					Static158.anInt3479 = (local175 + 3) * 60;
					Static81.anInt9842 = 0;
					Static112.method2333(21);
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					Static363.method5454();
				}
			} else if (Static81.anInt9842 == 14) {
				if (Static235.aClass45_1.method841(1)) {
					Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
					Static81.anInt9842 = 0;
					Static497.anInt8608 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
					Static112.method2333(29);
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					Static363.method5454();
				}
			} else if (Static81.anInt9842 != 9) {
				@Pc(842) Class4_Sub9_Sub1 local842;
				if (Static81.anInt9842 == 10) {
					if (Static140.anInt3152 == 3) {
						Static208.aBoolean323 = true;
					} else {
						Static208.aBoolean323 = false;
					}
					local842 = Static487.aClass4_Sub9_Sub1_2;
					if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
						if (!Static235.aClass45_1.method841(Static238.anInt8691)) {
							return;
						}
						Static235.aClass45_1.method838(Static238.anInt8691, 0, local842.aByteArray97);
						local842.anInt7219 = 0;
						Static540.anInt9129 = local842.method6015();
						Static248.anInt4941 = local842.method6015();
						Static448.aBoolean537 = local842.method6015() == 1;
						Static251.aBoolean372 = local842.method6015() == 1;
						Static241.aBoolean360 = local842.method6015() == 1;
						Static266.aBoolean387 = local842.method6015() == 1;
						Static416.anInt7186 = local842.method5982();
						Static268.aBoolean388 = local842.method6015() == 1;
						Static393.anInt9509 = local842.method5974();
						Static148.aBoolean511 = local842.method6015() == 1;
						if (Static140.anInt3152 == 3) {
							@Pc(1159) boolean local1159 = local842.method6015() == 1;
							if (local1159) {
								@Pc(1165) long local1165 = local842.method5997();
								@Pc(1169) String local1169 = Static446.method6284(local1165);
								@Pc(1173) int local1173 = local842.method6015();
								@Pc(1176) byte[] local1176 = new byte[local1173];
								local842.method1044(local1173, local1176);
								@Pc(1186) String local1186 = Static188.method3456(local1176);
								@Pc(1188) Class23 local1188 = null;
								try {
									@Pc(1194) Class299 local1194 = Static147.aClass161_4.method3815("3", false);
									while (local1194.anInt7985 == 0) {
										Static55.method845(1L);
									}
									if (local1194.anInt7985 == 1) {
										local1188 = (Class23) local1194.anObject41;
										@Pc(1226) int local1226 = local1169.length() + local1186.length() + 11 + 2 + 2 + 5;
										if (Static248.aString60 != null) {
											local1226 += Static248.aString60.length() + 2;
										}
										if (local1226 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1251) Class4_Sub9 local1251 = new Class4_Sub9(local1226 + 1);
										local1251.method5961(-345277664, local1226);
										local1251.method5961(-345277664, 3);
										local1251.method6029(local1169);
										local1251.method6029(local1186);
										local1251.method6012(Static431.anInt7395);
										local1251.method6008(Static316.aLong165);
										local1251.method5961(-345277664, Static248.aString60 == null ? 0 : 1);
										if (Static248.aString60 != null) {
											local1251.method6029(Static248.aString60);
										}
										local1251.method5967();
										local1188.method496(0, local1251.aByteArray97, local1251.anInt7219);
									}
								} catch (@Pc(1307) Exception local1307) {
								}
								try {
									if (local1188 != null) {
										local1188.method495();
									}
								} catch (@Pc(1314) Exception local1314) {
								}
								try {
									Static611.method6758("demoaccountcreated", Static55.anApplet1);
								} catch (@Pc(1321) Throwable local1321) {
								}
							}
						}
						Static553.aClass288_4.method6427(Static148.aBoolean511);
						Static195.aClass99_1.method2789(Static148.aBoolean511);
						Static401.aClass345_2.method7605(Static148.aBoolean511);
					} else if (Static235.aClass45_1.method841(Static238.anInt8691)) {
						Static235.aClass45_1.method838(Static238.anInt8691, 0, local842.aByteArray97);
						local842.anInt7219 = 0;
						Static540.anInt9129 = local842.method6015();
						Static248.anInt4941 = local842.method6015();
						Static448.aBoolean537 = local842.method6015() == 1;
						Static251.aBoolean372 = local842.method6015() == 1;
						Static241.aBoolean360 = local842.method6015() == 1;
						Static18.anInt1593 = local842.method6003();
						Static268.aBoolean388 = Static18.anInt1593 > 0;
						Static216.anInt4415 = local842.method5982();
						Static139.anInt3140 = local842.method5982();
						Static375.anInt6701 = local842.method5982();
						Static8.anInt9307 = local842.method6026();
						Static370.aClass299_6 = Static147.aClass161_4.method3832(Static8.anInt9307);
						Static294.anInt5440 = local842.method6015();
						Static12.anInt231 = local842.method5982();
						Static153.anInt3367 = local842.method5982();
						Static283.aBoolean402 = local842.method6015() == 1;
						Static129.aClass10_Sub1_Sub2_Sub2_1.aString93 = Static129.aClass10_Sub1_Sub2_Sub2_1.aString92 = local842.method5968();
						Static287.anInt5342 = local842.method6015();
						Static74.anInt1566 = local842.method6026();
						Static132.aClass300_2 = new Class300();
						Static132.aClass300_2.anInt7993 = local842.method5982();
						if (Static132.aClass300_2.anInt7993 == 65535) {
							Static132.aClass300_2.anInt7993 = -1;
						}
						Static132.aClass300_2.aString89 = local842.method5968();
						if (Static106.aClass315_4 != Static327.aClass315_8) {
							Static132.aClass300_2.anInt7994 = Static132.aClass300_2.anInt7993 + 50000;
							Static132.aClass300_2.anInt7995 = Static132.aClass300_2.anInt7993 + 40000;
						}
						if (Static573.aClass315_9 != Static327.aClass315_8 && (Static238.aClass300_10.method6605(Static27.aClass300_1) || Static238.aClass300_10.method6605(Static191.aClass300_9))) {
							Static22.method426();
						}
					} else {
						return;
					}
					if (Static448.aBoolean537 && !Static241.aBoolean360 || Static268.aBoolean388) {
						try {
							Static611.method6758("zap", Static55.anApplet1);
						} catch (@Pc(1347) Throwable local1347) {
							if (Static350.aBoolean456) {
								try {
									Static55.anApplet1.getAppletContext().showDocument(new URL(Static55.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1361) Exception local1361) {
								}
							}
						}
					} else {
						try {
							Static611.method6758("unzap", Static55.anApplet1);
						} catch (@Pc(1370) Throwable local1370) {
						}
					}
					if (Static106.aClass315_4 == Static327.aClass315_8) {
						try {
							Static611.method6758("loggedin", Static55.anApplet1);
						} catch (@Pc(1381) Throwable local1381) {
						}
					}
					if (Static140.anInt3152 != 2 && Static140.anInt3152 != 3) {
						Static81.anInt9842 = 0;
						Static112.method2333(2);
						Static225.method3889();
						Static33.method600(7);
						Static491.aClass64_424 = null;
						return;
					}
					Static81.anInt9842 = 12;
				}
				if (Static81.anInt9842 == 12) {
					if (!Static235.aClass45_1.method841(3)) {
						return;
					}
					Static235.aClass45_1.method838(3, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
					Static81.anInt9842 = 13;
				}
				if (Static81.anInt9842 == 13) {
					local842 = Static487.aClass4_Sub9_Sub1_2;
					local842.anInt7219 = 0;
					if (local842.method1037()) {
						if (!Static235.aClass45_1.method841(1)) {
							return;
						}
						Static235.aClass45_1.method838(1, 3, local842.aByteArray97);
					}
					Static491.aClass64_424 = Static476.method6627()[local842.method1042()];
					Static474.anInt4412 = local842.method5982();
					Static81.anInt9842 = 11;
				}
				if (Static81.anInt9842 == 11) {
					if (Static235.aClass45_1.method841(Static474.anInt4412)) {
						Static235.aClass45_1.method838(Static474.anInt4412, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
						Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
						local175 = Static474.anInt4412;
						Static81.anInt9842 = 0;
						Static112.method2333(2);
						Static534.method7428();
						Static540.method7506(Static487.aClass4_Sub9_Sub1_2);
						Static304.anInt5549 = -1;
						if (Static34.aClass64_459 == Static491.aClass64_424) {
							Static399.method5795();
						} else {
							Static92.method2115();
						}
						if (local175 != Static487.aClass4_Sub9_Sub1_2.anInt7219) {
							throw new RuntimeException("lswp pos:" + Static487.aClass4_Sub9_Sub1_2.anInt7219 + " psize:" + local175);
						}
						Static491.aClass64_424 = null;
					}
				} else if (Static81.anInt9842 == 15) {
					if (Static474.anInt4412 == -2) {
						if (!Static235.aClass45_1.method841(2)) {
							return;
						}
						Static235.aClass45_1.method838(2, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
						Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
						Static474.anInt4412 = Static487.aClass4_Sub9_Sub1_2.method5982();
					}
					if (Static235.aClass45_1.method841(Static474.anInt4412)) {
						Static235.aClass45_1.method838(Static474.anInt4412, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
						Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
						local175 = Static474.anInt4412;
						Static81.anInt9842 = 0;
						Static112.method2333(15);
						Static155.method3096();
						Static540.method7506(Static487.aClass4_Sub9_Sub1_2);
						if (Static487.aClass4_Sub9_Sub1_2.anInt7219 != local175) {
							throw new RuntimeException("lswpr pos:" + Static487.aClass4_Sub9_Sub1_2.anInt7219 + " psize:" + local175);
						}
						Static491.aClass64_424 = null;
					}
				}
			} else if (Static235.aClass45_1.method841(1)) {
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				Static238.anInt8691 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
				Static81.anInt9842 = 10;
			}
		} catch (@Pc(1619) IOException local1619) {
			if (Static235.aClass45_1 != null) {
				Static235.aClass45_1.method839();
				Static235.aClass45_1 = null;
			}
			if (Static101.anInt2479 >= 2) {
				Static81.anInt9842 = 0;
				Static112.method2333(-4);
				Static363.method5454();
			} else {
				if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
					Static238.aClass300_10.method6607();
				} else {
					Static549.aClass300_11.method6607();
				}
				Static101.anInt2479++;
				Static81.anInt9842 = 1;
				Static574.anInt6915 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!daa;Lclient!daa;)V")
	public static void method864(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg1.aClass4_Sub7_61 != null) {
			arg1.method7963();
		}
		arg1.aClass4_Sub7_61 = arg0;
		arg1.aClass4_Sub7_62 = arg0.aClass4_Sub7_62;
		arg1.aClass4_Sub7_61.aClass4_Sub7_62 = arg1;
		arg1.aClass4_Sub7_62.aClass4_Sub7_61 = arg1;
	}
}
