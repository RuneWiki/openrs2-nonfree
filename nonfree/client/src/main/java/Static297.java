import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_281 = new Class123(97, -1);

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method6883() {
		if (Static340.anInt6133 == 0 || Static340.anInt6133 == 6) {
			return;
		}
		try {
			if (++Static439.anInt7792 > 2000) {
				if (Static451.aClass223_6 != null) {
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
				}
				if (Static144.anInt3369 >= 2) {
					Static340.anInt6133 = 0;
					Static483.method6567(-5);
					return;
				}
				if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
					Static104.aClass212_1.method4973();
				} else {
					Static234.aClass212_10.method4973();
				}
				Static144.anInt3369++;
				Static340.anInt6133 = 1;
				Static439.anInt7792 = 0;
			}
			if (Static340.anInt6133 == 1) {
				if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
					Static86.aClass309_1 = Static104.aClass212_1.method4971(Static467.aClass168_12);
				} else {
					Static86.aClass309_1 = Static234.aClass212_10.method4971(Static467.aClass168_12);
				}
				Static340.anInt6133 = 2;
			}
			if (Static340.anInt6133 == 2) {
				if (Static86.aClass309_1.anInt8650 == 2) {
					throw new IOException();
				}
				if (Static86.aClass309_1.anInt8650 != 1) {
					return;
				}
				Static451.aClass223_6 = Static177.method3159((Socket) Static86.aClass309_1.anObject15);
				Static86.aClass309_1 = null;
				@Pc(119) long local119 = Static226.aLong108 = Static68.method1648(Static422.aString202);
				Static20.method211();
				@Pc(128) int local128 = (int) (local119 >> 16 & 0x1FL);
				@Pc(131) Class3_Sub10 local131 = Static271.method4111();
				local131.aClass3_Sub26_Sub1_1.method6809(Static556.aClass126_29.anInt4274);
				local131.aClass3_Sub26_Sub1_1.method6809(local128);
				Static193.method3398(local131);
				Static411.method5773();
				Static340.anInt6133 = 3;
			}
			@Pc(175) int local175;
			if (Static340.anInt6133 == 3) {
				if (!Static451.aClass223_6.method5110(1)) {
					return;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				local175 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
				if (local175 != 0) {
					Static340.anInt6133 = 0;
					Static483.method6567(local175);
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					Static225.method3708();
					return;
				}
				Static340.anInt6133 = 4;
			}
			if (Static340.anInt6133 == 4) {
				if (!Static451.aClass223_6.method5110(8)) {
					return;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 8, 0);
				Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
				Static160.aLong78 = Static455.aClass3_Sub26_Sub1_2.method6813();
				@Pc(226) Class3_Sub26 local226 = new Class3_Sub26(518);
				@Pc(229) int[] local229 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static160.aLong78 >> 32), (int) Static160.aLong78 };
				local226.method6809(10);
				local226.method6826(local229[0]);
				local226.method6826(local229[1]);
				local226.method6826(local229[2]);
				local226.method6826(local229[3]);
				local226.method6782(Static68.method1648(Static422.aString202));
				local226.method6772(Static525.aString237);
				local226.method6782(Static284.aLong140);
				local226.method6782(Static317.aLong159);
				local226.method6835(Static128.aBigInteger5, Static422.aBigInteger8);
				Static20.method211();
				@Pc(315) Class3_Sub10 local315 = Static271.method4111();
				@Pc(318) Class3_Sub26_Sub1 local318 = local315.aClass3_Sub26_Sub1_1;
				@Pc(338) int local338;
				if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
					if (Static409.anInt1461 == 13) {
						local318.method6809(Static556.aClass126_33.anInt4274);
					} else {
						local318.method6809(Static556.aClass126_31.anInt4274);
					}
					local318.method6769(0);
					local338 = local318.anInt8703;
					local318.method6826(625);
					local318.method6809(Static314.anInt5779);
					local318.method6809(Static534.method7318());
					local318.method6769(Static34.anInt3201);
					local318.method6769(Static492.anInt8445);
					local318.method6809(Static348.aClass3_Sub51_Sub1_5.anInt9941);
					Static278.method4207(local318);
					local318.method6772(Static44.aString268);
					local318.method6826(Static501.anInt8649);
					@Pc(454) Class3_Sub26 local454 = new Class3_Sub26(Static271.method4112());
					Static348.aClass3_Sub51_Sub1_5.method7827(local454);
					local318.method6809(local454.anInt8703);
					local318.method6824(local454.aByteArray213, local454.anInt8703);
					Static67.aBoolean133 = true;
					@Pc(480) Class3_Sub26 local480 = new Class3_Sub26(Static315.aClass3_Sub18_2.method2834());
					Static315.aClass3_Sub18_2.method2837(local480);
					local318.method6824(local480.aByteArray213, local480.aByteArray213.length);
					local318.method6769(Static538.anInt9387);
					local318.method6782(Static182.aLong91);
					local318.method6809(Static303.aString152 == null ? 0 : 1);
					if (Static303.aString152 != null) {
						local318.method6772(Static303.aString152);
					}
					Static486.method6591(local318);
					local318.method6824(local226.aByteArray213, local226.anInt8703);
					local318.method6828(local318.anInt8703 - local338);
				} else {
					local318.method6809(Static556.aClass126_34.anInt4274);
					local318.method6769(0);
					local338 = local318.anInt8703;
					local318.method6826(625);
					local318.method6809(Static31.aClass89_1.anInt2860);
					local318.method6809(Static201.anInt4321);
					Static278.method4207(local318);
					local318.method6772(Static44.aString268);
					local318.method6826(Static501.anInt8649);
					Static486.method6591(local318);
					local318.method6824(local226.aByteArray213, local226.anInt8703);
					local318.method6828(local318.anInt8703 - local338);
				}
				Static193.method3398(local315);
				Static411.method5773();
				Static452.aClass353_2 = new Class353(local229);
				for (local338 = 0; local338 < 4; local338++) {
					local229[local338] += 50;
				}
				Static455.aClass3_Sub26_Sub1_2.method5556(local229);
				Static340.anInt6133 = 5;
			}
			if (Static340.anInt6133 == 5) {
				if (!Static451.aClass223_6.method5110(1)) {
					return;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				local175 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
				if (local175 == 21) {
					Static340.anInt6133 = 8;
				} else if (local175 == 29) {
					Static340.anInt6133 = 14;
				} else if (local175 == 1) {
					Static340.anInt6133 = 6;
					Static483.method6567(local175);
					return;
				} else if (local175 == 2) {
					Static340.anInt6133 = 9;
				} else if (local175 == 15) {
					Static42.anInt1159 = -2;
					Static340.anInt6133 = 15;
				} else if (local175 == 23 && Static144.anInt3369 < 2) {
					Static144.anInt3369++;
					Static439.anInt7792 = 0;
					Static340.anInt6133 = 1;
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					return;
				} else {
					Static340.anInt6133 = 0;
					Static483.method6567(local175);
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					Static225.method3708();
					return;
				}
			}
			if (Static340.anInt6133 == 7) {
				Static20.method211();
				@Pc(686) Class3_Sub10 local686 = Static271.method4111();
				@Pc(689) Class3_Sub26_Sub1 local689 = local686.aClass3_Sub26_Sub1_1;
				local689.method5550(Static452.aClass353_2);
				local689.method5558(Static556.aClass126_41.anInt4274);
				Static193.method3398(local686);
				Static411.method5773();
				Static340.anInt6133 = 5;
			} else if (Static340.anInt6133 == 8) {
				if (Static451.aClass223_6.method5110(1)) {
					Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
					local175 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
					Static536.anInt9351 = local175 * 60 + 180;
					Static340.anInt6133 = 0;
					Static483.method6567(21);
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					Static225.method3708();
				}
			} else if (Static340.anInt6133 == 14) {
				if (Static451.aClass223_6.method5110(1)) {
					Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
					Static348.anInt3837 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
					Static340.anInt6133 = 0;
					Static483.method6567(29);
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					Static225.method3708();
				}
			} else if (Static340.anInt6133 != 9) {
				@Pc(820) Class3_Sub26_Sub1 local820;
				if (Static340.anInt6133 == 10) {
					local820 = Static455.aClass3_Sub26_Sub1_2;
					if (Static403.anInt7291 == 3) {
						Static174.aBoolean594 = true;
					} else {
						Static174.aBoolean594 = false;
					}
					if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
						if (!Static451.aClass223_6.method5110(Static465.anInt8092)) {
							return;
						}
						Static451.aClass223_6.method5106(local820.aByteArray213, Static465.anInt8092, 0);
						local820.anInt8703 = 0;
						Static212.anInt5852 = local820.method6814();
						Static462.anInt8080 = local820.method6814();
						Static402.aBoolean498 = local820.method6814() == 1;
						Static226.aBoolean296 = local820.method6814() == 1;
						Static143.aBoolean241 = local820.method6814() == 1;
						Static416.aBoolean520 = local820.method6814() == 1;
						Static147.anInt3433 = local820.method6811();
						Static577.aBoolean689 = local820.method6814() == 1;
						Static456.anInt7972 = local820.method6776();
						Static150.aBoolean247 = local820.method6814() == 1;
						if (Static403.anInt7291 == 3) {
							@Pc(1124) boolean local1124 = local820.method6814() == 1;
							if (local1124) {
								@Pc(1130) long local1130 = local820.method6813();
								@Pc(1134) String local1134 = Static517.method6954(local1130);
								@Pc(1138) int local1138 = local820.method6814();
								@Pc(1141) byte[] local1141 = new byte[local1138];
								local820.method5555(local1141, local1138);
								@Pc(1151) String local1151 = Static74.method1790(local1141);
								@Pc(1153) Class272 local1153 = null;
								try {
									@Pc(1159) Class309 local1159 = Static467.aClass168_12.method4080("3", false);
									while (local1159.anInt8650 == 0) {
										Static373.method5240(1L);
									}
									if (local1159.anInt8650 == 1) {
										local1153 = (Class272) local1159.anObject15;
										@Pc(1188) int local1188 = local1134.length() + local1151.length() + 3 + 8 + 9;
										if (Static303.aString152 != null) {
											local1188 += Static303.aString152.length() + 2;
										}
										if (local1188 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1212) Class3_Sub26 local1212 = new Class3_Sub26(local1188 + 1);
										local1212.method6809(local1188);
										local1212.method6809(3);
										local1212.method6823(local1134);
										local1212.method6823(local1151);
										local1212.method6769(Static501.anInt8649);
										local1212.method6782(Static182.aLong91);
										local1212.method6809(Static303.aString152 == null ? 0 : 1);
										if (Static303.aString152 != null) {
											local1212.method6823(Static303.aString152);
										}
										local1212.method6833();
										local1153.method6170(local1212.aByteArray213, 0, local1212.anInt8703);
									}
								} catch (@Pc(1264) Exception local1264) {
								}
								try {
									if (local1153 != null) {
										local1153.method6172();
									}
								} catch (@Pc(1271) Exception local1271) {
								}
								try {
									Static600.method2906("demoaccountcreated", Static304.anApplet1);
								} catch (@Pc(1278) Throwable local1278) {
								}
							}
						}
						Static536.aClass146_4.method3723(Static150.aBoolean247);
						Static272.aClass121_2.method3317(Static150.aBoolean247);
						Static181.aClass60_1.method1799(Static150.aBoolean247);
					} else if (Static451.aClass223_6.method5110(Static465.anInt8092)) {
						Static451.aClass223_6.method5106(local820.aByteArray213, Static465.anInt8092, 0);
						local820.anInt8703 = 0;
						Static212.anInt5852 = local820.method6814();
						Static462.anInt8080 = local820.method6814();
						Static402.aBoolean498 = local820.method6814() == 1;
						Static226.aBoolean296 = local820.method6814() == 1;
						Static143.aBoolean241 = local820.method6814() == 1;
						Static566.anInt9803 = local820.method6789();
						Static577.aBoolean689 = Static566.anInt9803 > 0;
						Static341.anInt6146 = local820.method6811();
						Static167.anInt6675 = local820.method6811();
						Static546.anInt9536 = local820.method6811();
						Static227.anInt4642 = local820.method6816();
						Static400.aClass309_8 = Static467.aClass168_12.method4094(Static227.anInt4642);
						Static229.anInt4660 = local820.method6814();
						Static577.anInt9986 = local820.method6811();
						Static96.anInt2369 = local820.method6811();
						Static567.aBoolean375 = local820.method6814() == 1;
						Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString182 = local820.method6797();
						Static128.anInt2909 = local820.method6814();
						Static280.anInt5294 = local820.method6816();
						Static122.aClass212_2 = new Class212();
						Static122.aClass212_2.anInt6145 = local820.method6811();
						if (Static122.aClass212_2.anInt6145 == 65535) {
							Static122.aClass212_2.anInt6145 = -1;
						}
						Static122.aClass212_2.aString157 = local820.method6797();
						if (Static332.aClass5_3 != Static412.aClass5_7) {
							Static122.aClass212_2.anInt6142 = Static122.aClass212_2.anInt6145 + 50000;
							Static122.aClass212_2.anInt6137 = Static122.aClass212_2.anInt6145 + 40000;
						}
						if (Static512.aClass5_9 != Static332.aClass5_3 && (Static104.aClass212_1.method4974(Static338.aClass212_8) || Static104.aClass212_1.method4974(Static563.aClass212_9))) {
							Static458.method6306();
						}
					} else {
						return;
					}
					if (Static402.aBoolean498 && !Static143.aBoolean241 || Static577.aBoolean689) {
						try {
							Static600.method2906("zap", Static304.anApplet1);
						} catch (@Pc(1304) Throwable local1304) {
							if (Static178.aBoolean271) {
								try {
									Static304.anApplet1.getAppletContext().showDocument(new URL(Static304.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1318) Exception local1318) {
								}
							}
						}
					} else {
						try {
							Static600.method2906("unzap", Static304.anApplet1);
						} catch (@Pc(1327) Throwable local1327) {
						}
					}
					if (Static332.aClass5_3 == Static412.aClass5_7) {
						try {
							Static600.method2906("loggedin", Static304.anApplet1);
						} catch (@Pc(1338) Throwable local1338) {
						}
					}
					if (Static403.anInt7291 != 2 && Static403.anInt7291 != 3) {
						Static340.anInt6133 = 0;
						Static483.method6567(2);
						Static1.method4();
						Static27.method293(7);
						Static170.aClass123_284 = null;
						return;
					}
					Static340.anInt6133 = 12;
				}
				if (Static340.anInt6133 == 12) {
					if (!Static451.aClass223_6.method5110(3)) {
						return;
					}
					Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 3, 0);
					Static340.anInt6133 = 13;
				}
				if (Static340.anInt6133 == 13) {
					local820 = Static455.aClass3_Sub26_Sub1_2;
					local820.anInt8703 = 0;
					if (local820.method5557()) {
						if (!Static451.aClass223_6.method5110(1)) {
							return;
						}
						Static451.aClass223_6.method5106(local820.aByteArray213, 1, 3);
					}
					Static170.aClass123_284 = Static284.method4276()[local820.method5548()];
					Static42.anInt1159 = local820.method6811();
					Static340.anInt6133 = 11;
				}
				if (Static340.anInt6133 == 11) {
					if (Static451.aClass223_6.method5110(Static42.anInt1159)) {
						Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, Static42.anInt1159, 0);
						Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
						local175 = Static42.anInt1159;
						Static340.anInt6133 = 0;
						Static483.method6567(2);
						Static219.method3676();
						Static508.method6862(Static455.aClass3_Sub26_Sub1_2);
						Static347.anInt6235 = -1;
						if (Static170.aClass123_284 == Static101.aClass123_85) {
							Static564.method7681();
						} else {
							Static496.method6695();
						}
						if (local175 != Static455.aClass3_Sub26_Sub1_2.anInt8703) {
							throw new RuntimeException("lswp pos:" + Static455.aClass3_Sub26_Sub1_2.anInt8703 + " psize:" + local175);
						}
						Static170.aClass123_284 = null;
					}
				} else if (Static340.anInt6133 == 15) {
					if (Static42.anInt1159 == -2) {
						if (!Static451.aClass223_6.method5110(2)) {
							return;
						}
						Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 2, 0);
						Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
						Static42.anInt1159 = Static455.aClass3_Sub26_Sub1_2.method6811();
					}
					if (Static451.aClass223_6.method5110(Static42.anInt1159)) {
						Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, Static42.anInt1159, 0);
						Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
						local175 = Static42.anInt1159;
						Static340.anInt6133 = 0;
						Static483.method6567(15);
						Static389.method6671();
						Static508.method6862(Static455.aClass3_Sub26_Sub1_2);
						if (local175 != Static455.aClass3_Sub26_Sub1_2.anInt8703) {
							throw new RuntimeException("lswpr pos:" + Static455.aClass3_Sub26_Sub1_2.anInt8703 + " psize:" + local175);
						}
						Static170.aClass123_284 = null;
					}
				}
			} else if (Static451.aClass223_6.method5110(1)) {
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				Static340.anInt6133 = 10;
				Static465.anInt8092 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
			}
		} catch (@Pc(1592) IOException local1592) {
			if (Static451.aClass223_6 != null) {
				Static451.aClass223_6.method5105();
				Static451.aClass223_6 = null;
			}
			if (Static144.anInt3369 >= 2) {
				Static340.anInt6133 = 0;
				Static483.method6567(-4);
				Static225.method3708();
			} else {
				if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
					Static104.aClass212_1.method4973();
				} else {
					Static234.aClass212_10.method4973();
				}
				Static340.anInt6133 = 1;
				Static144.anInt3369++;
				Static439.anInt7792 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6893(@OriginalArg(0) Class31 arg0) {
		if (Static249.anInt8899 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 && (Static189.aClass333ArrayArrayArray1 != null && Static323.method4781(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, arg0))) {
			Static249.anInt8899 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ua;IIIZLclient!pca;ILclient!f;)V")
	public static void method6895(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class251 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class73 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static188.anInt4080 == 4) {
			local17 = (int) Static209.aFloat229 & 0x3FFF;
		} else {
			local17 = (int) Static209.aFloat229 + Static270.anInt5118 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg4.anInt7285 / 2, arg4.anInt7215 / 2) + 10;
		@Pc(44) int local44 = arg5 * arg5 + arg1 * arg1;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(58) int local58 = Class3_Sub28.anIntArray232[local17];
		@Pc(62) int local62 = Class3_Sub28.anIntArray231[local17];
		if (Static188.anInt4080 != 4) {
			local62 = local62 * 256 / (Static350.anInt6241 + 256);
			local58 = local58 * 256 / (Static350.anInt6241 + 256);
		}
		@Pc(93) int local93 = local58 * arg5 + local62 * arg1 >> 14;
		@Pc(104) int local104 = arg5 * local62 - arg1 * local58 >> 14;
		arg6.method7952(arg2 + arg4.anInt7285 / 2 + local93 - arg6.A() / 2, -local104 + arg4.anInt7215 / 2 + arg3 + -(arg6.ca() / 2), arg0, arg2, arg3);
	}
}
