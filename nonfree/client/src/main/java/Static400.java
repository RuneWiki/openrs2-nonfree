import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public static int anInt7179;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt7182;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!vl;")
	public static Class351 aClass351_1;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
	public static final int[] anIntArray422 = new int[3];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
	public static boolean method5772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static579.method7769(arg0, arg1) | (arg1 & 0x70000) != 0 || Static324.method4819(arg0, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	public static void method5773() {
		if (Static517.anInt8881 == 0 || Static517.anInt8881 == 6) {
			return;
		}
		try {
			if (++Static178.anInt3319 > 2000) {
				if (Static485.aClass43_1 != null) {
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
				}
				if (Static73.anInt1421 >= 2) {
					Static517.anInt8881 = 0;
					Static501.method7054(-5);
					return;
				}
				if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
					Static221.aClass261_3.method5585();
				} else {
					Static467.aClass261_6.method5585();
				}
				Static517.anInt8881 = 1;
				Static73.anInt1421++;
				Static178.anInt3319 = 0;
			}
			if (Static517.anInt8881 == 1) {
				if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
					Static304.aClass191_12 = Static221.aClass261_3.method5582(Static361.aClass198_3);
				} else {
					Static304.aClass191_12 = Static467.aClass261_6.method5582(Static361.aClass198_3);
				}
				Static517.anInt8881 = 2;
			}
			if (Static517.anInt8881 == 2) {
				if (Static304.aClass191_12.anInt5014 == 2) {
					throw new IOException();
				}
				if (Static304.aClass191_12.anInt5014 != 1) {
					return;
				}
				Static485.aClass43_1 = Static133.method2325((Socket) Static304.aClass191_12.anObject11);
				Static304.aClass191_12 = null;
				@Pc(124) long local124 = Static67.aLong38 = Static309.method4632(Static251.aString51);
				@Pc(131) int local131 = (int) (local124 >> 16 & 0x1FL);
				Static498.method710();
				@Pc(136) Class1_Sub9 local136 = Static266.method3886();
				local136.aClass1_Sub3_Sub1_1.method7917(Static122.aClass325_1.anInt8863);
				local136.aClass1_Sub3_Sub1_1.method7917(local131);
				Static42.method746(local136);
				Static54.method938();
				Static517.anInt8881 = 3;
			}
			@Pc(180) int local180;
			if (Static517.anInt8881 == 3) {
				if (!Static485.aClass43_1.method1049(1)) {
					return;
				}
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				local180 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
				if (local180 != 0) {
					Static517.anInt8881 = 0;
					Static501.method7054(local180);
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					Static259.method3769();
					return;
				}
				Static517.anInt8881 = 4;
			}
			if (Static517.anInt8881 == 4) {
				if (!Static485.aClass43_1.method1049(8)) {
					return;
				}
				Static485.aClass43_1.method1048(8, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
				Static187.aLong92 = Static158.aClass1_Sub3_Sub1_2.method7949();
				@Pc(226) Class1_Sub3 local226 = new Class1_Sub3(518);
				@Pc(229) int[] local229 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static187.aLong92 >> 32), (int) Static187.aLong92 };
				local226.method7917(10);
				local226.method7936(local229[0]);
				local226.method7936(local229[1]);
				local226.method7936(local229[2]);
				local226.method7936(local229[3]);
				local226.method7934(Static309.method4632(Static251.aString51));
				local226.method7920(Static130.aString22);
				local226.method7934(Static73.aLong42);
				local226.method7934(Static229.aLong107);
				local226.method7924(Static498.aBigInteger4, Static404.aBigInteger7);
				Static498.method710();
				@Pc(311) Class1_Sub9 local311 = Static266.method3886();
				@Pc(314) Class1_Sub3_Sub1 local314 = local311.aClass1_Sub3_Sub1_1;
				@Pc(336) int local336;
				if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
					if (Static55.anInt1068 == 13) {
						local314.method7917(Static122.aClass325_5.anInt8863);
					} else {
						local314.method7917(Static122.aClass325_3.anInt8863);
					}
					local314.method7937(0);
					local336 = local314.anInt9802;
					local314.method7936(626);
					local314.method7917(Static307.anInt7603);
					local314.method7917(Static470.method2475());
					local314.method7937(Static349.anInt6422);
					local314.method7937(Static594.anInt9806);
					local314.method7917(Static86.aClass1_Sub30_Sub1_1.anInt6186);
					Static341.method5098(local314);
					local314.method7920(Static9.aString2);
					local314.method7936(Static547.anInt9149);
					@Pc(448) Class1_Sub3 local448 = new Class1_Sub3(Static5.method84());
					Static86.aClass1_Sub30_Sub1_1.method5021(local448);
					local314.method7917(local448.anInt9802);
					local314.method7973(local448.anInt9802, local448.aByteArray104);
					Static518.aBoolean696 = true;
					@Pc(474) Class1_Sub3 local474 = new Class1_Sub3(Static170.aClass1_Sub23_1.method2525());
					Static170.aClass1_Sub23_1.method2528(local474);
					local314.method7973(local474.aByteArray104.length, local474.aByteArray104);
					local314.method7937(Static218.anInt3983);
					local314.method7934(Static495.aLong230);
					local314.method7917(Static388.aString82 == null ? 0 : 1);
					if (Static388.aString82 != null) {
						local314.method7920(Static388.aString82);
					}
					Static322.method4786(local314);
					local314.method7973(local226.anInt9802, local226.aByteArray104);
					local314.method7965(local314.anInt9802 - local336);
				} else {
					local314.method7917(Static122.aClass325_6.anInt8863);
					local314.method7937(0);
					local336 = local314.anInt9802;
					local314.method7936(626);
					local314.method7917(Static101.aClass42_1.anInt1150);
					local314.method7917(Static161.anInt3095);
					Static341.method5098(local314);
					local314.method7920(Static9.aString2);
					local314.method7936(Static547.anInt9149);
					Static322.method4786(local314);
					local314.method7973(local226.anInt9802, local226.aByteArray104);
					local314.method7965(local314.anInt9802 - local336);
				}
				Static42.method746(local311);
				Static54.method938();
				Static469.aClass235_2 = new Class235(local229);
				for (local336 = 0; local336 < 4; local336++) {
					local229[local336] += 50;
				}
				Static158.aClass1_Sub3_Sub1_2.method4998(local229);
				Static517.anInt8881 = 5;
			}
			if (Static517.anInt8881 == 5) {
				if (!Static485.aClass43_1.method1049(1)) {
					return;
				}
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				local180 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
				if (local180 == 21) {
					Static517.anInt8881 = 8;
				} else if (local180 == 29) {
					Static517.anInt8881 = 14;
				} else if (local180 == 1) {
					Static517.anInt8881 = 6;
					Static501.method7054(local180);
					return;
				} else if (local180 == 2) {
					Static517.anInt8881 = 9;
				} else if (local180 == 15) {
					Static464.anInt8696 = -2;
					Static517.anInt8881 = 15;
				} else if (local180 == 23 && Static73.anInt1421 < 2) {
					Static178.anInt3319 = 0;
					Static517.anInt8881 = 1;
					Static73.anInt1421++;
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					return;
				} else {
					Static517.anInt8881 = 0;
					Static501.method7054(local180);
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					Static259.method3769();
					return;
				}
			}
			if (Static517.anInt8881 == 7) {
				Static498.method710();
				@Pc(677) Class1_Sub9 local677 = Static266.method3886();
				@Pc(680) Class1_Sub3_Sub1 local680 = local677.aClass1_Sub3_Sub1_1;
				local680.method4991(Static469.aClass235_2);
				local680.method4990(Static122.aClass325_13.anInt8863);
				Static42.method746(local677);
				Static54.method938();
				Static517.anInt8881 = 5;
			} else if (Static517.anInt8881 == 8) {
				if (Static485.aClass43_1.method1049(1)) {
					Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
					local180 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
					Static517.anInt8881 = 0;
					Static83.anInt1568 = local180 * 60 + 180;
					Static501.method7054(21);
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					Static259.method3769();
				}
			} else if (Static517.anInt8881 == 14) {
				if (Static485.aClass43_1.method1049(1)) {
					Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
					Static397.anInt7112 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
					Static517.anInt8881 = 0;
					Static501.method7054(29);
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					Static259.method3769();
				}
			} else if (Static517.anInt8881 != 9) {
				@Pc(820) Class1_Sub3_Sub1 local820;
				if (Static517.anInt8881 == 10) {
					local820 = Static158.aClass1_Sub3_Sub1_2;
					if (Static133.anInt2648 == 3) {
						Static437.aBoolean586 = true;
					} else {
						Static437.aBoolean586 = false;
					}
					if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
						if (!Static485.aClass43_1.method1049(Static594.anInt9813)) {
							return;
						}
						Static485.aClass43_1.method1048(Static594.anInt9813, 0, local820.aByteArray104);
						local820.anInt9802 = 0;
						Static203.anInt3822 = local820.method7974();
						Static335.anInt6141 = local820.method7974();
						Static381.aBoolean523 = local820.method7974() == 1;
						Static81.aBoolean101 = local820.method7974() == 1;
						Static25.aBoolean42 = local820.method7974() == 1;
						Static52.aBoolean594 = local820.method7974() == 1;
						Static310.anInt5693 = local820.method7945();
						Static111.aBoolean123 = local820.method7974() == 1;
						Static76.anInt6368 = local820.method7966();
						Static431.aBoolean583 = local820.method7974() == 1;
						if (Static133.anInt2648 == 3) {
							@Pc(950) boolean local950 = local820.method7974() == 1;
							if (local950) {
								@Pc(956) long local956 = local820.method7949();
								@Pc(960) String local960 = Static56.method961(local956);
								@Pc(964) int local964 = local820.method7974();
								@Pc(967) byte[] local967 = new byte[local964];
								local820.method4999(local964, local967);
								@Pc(977) String local977 = Static130.method2282(local967);
								@Pc(979) Class268 local979 = null;
								try {
									@Pc(985) Class191 local985 = Static361.aClass198_3.method4291(false, "3");
									while (local985.anInt5014 == 0) {
										Static408.method5841(1L);
									}
									if (local985.anInt5014 == 1) {
										local979 = (Class268) local985.anObject11;
										@Pc(1019) int local1019 = local960.length() + local977.length() + 5 + 8 + 3 + 2 + 2;
										if (Static388.aString82 != null) {
											local1019 += Static388.aString82.length() + 2;
										}
										if (local1019 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1045) Class1_Sub3 local1045 = new Class1_Sub3(local1019 + 1);
										local1045.method7917(local1019);
										local1045.method7917(3);
										local1045.method7921(local960);
										local1045.method7921(local977);
										local1045.method7937(Static547.anInt9149);
										local1045.method7934(Static495.aLong230);
										local1045.method7917(Static388.aString82 == null ? 0 : 1);
										if (Static388.aString82 != null) {
											local1045.method7921(Static388.aString82);
										}
										local1045.method7972();
										local979.method5810(local1045.aByteArray104, local1045.anInt9802, 0);
									}
								} catch (@Pc(1097) Exception local1097) {
								}
								try {
									if (local979 != null) {
										local979.method5816();
									}
								} catch (@Pc(1104) Exception local1104) {
								}
								try {
									Static597.method645(Static433.anApplet2, "demoaccountcreated");
								} catch (@Pc(1111) Throwable local1111) {
								}
							}
						}
						Static347.aClass122_4.method2771(Static431.aBoolean583);
						Static230.aClass225_1.method4866(Static431.aBoolean583);
						Static84.aClass242_1.method5279(Static431.aBoolean583);
					} else if (Static485.aClass43_1.method1049(Static594.anInt9813)) {
						Static485.aClass43_1.method1048(Static594.anInt9813, 0, local820.aByteArray104);
						local820.anInt9802 = 0;
						Static203.anInt3822 = local820.method7974();
						Static335.anInt6141 = local820.method7974();
						Static381.aBoolean523 = local820.method7974() == 1;
						Static81.aBoolean101 = local820.method7974() == 1;
						Static25.aBoolean42 = local820.method7974() == 1;
						Static195.anInt6509 = local820.method7975();
						Static111.aBoolean123 = Static195.anInt6509 > 0;
						Static69.anInt1340 = local820.method7945();
						Static262.anInt4770 = local820.method7945();
						Static429.anInt7680 = local820.method7945();
						Static7.anInt237 = local820.method7940();
						Static439.aClass191_14 = Static361.aClass198_3.method4292(Static7.anInt237);
						Static165.anInt3164 = local820.method7974();
						Static241.anInt4479 = local820.method7945();
						Static341.anInt6292 = local820.method7945();
						Static145.aBoolean208 = local820.method7974() == 1;
						Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString34 = local820.method7939();
						Static495.anInt8375 = local820.method7974();
						Static435.anInt7762 = local820.method7940();
						Static187.aClass261_1 = new Class261();
						Static187.aClass261_1.anInt6921 = local820.method7945();
						if (Static187.aClass261_1.anInt6921 == 65535) {
							Static187.aClass261_1.anInt6921 = -1;
						}
						Static187.aClass261_1.aString81 = local820.method7939();
						if (Static405.aClass93_6 != Static76.aClass93_3) {
							Static187.aClass261_1.anInt6913 = Static187.aClass261_1.anInt6921 + 40000;
							Static187.aClass261_1.anInt6923 = Static187.aClass261_1.anInt6921 + 50000;
						}
						if (Static385.aClass93_4 != Static405.aClass93_6 && (Static221.aClass261_3.method5579(Static211.aClass261_2) || Static221.aClass261_3.method5579(Static293.aClass261_4))) {
							Static338.method5037();
						}
					} else {
						return;
					}
					if (Static381.aBoolean523 && !Static25.aBoolean42 || Static111.aBoolean123) {
						try {
							Static597.method645(Static433.anApplet2, "zap");
						} catch (@Pc(1328) Throwable local1328) {
							if (Static578.aBoolean710) {
								try {
									Static433.anApplet2.getAppletContext().showDocument(new URL(Static433.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1342) Exception local1342) {
								}
							}
						}
					} else {
						try {
							Static597.method645(Static433.anApplet2, "unzap");
						} catch (@Pc(1319) Throwable local1319) {
						}
					}
					if (Static76.aClass93_3 == Static405.aClass93_6) {
						try {
							Static597.method645(Static433.anApplet2, "loggedin");
						} catch (@Pc(1353) Throwable local1353) {
						}
					}
					if (Static133.anInt2648 != 2 && Static133.anInt2648 != 3) {
						Static517.anInt8881 = 0;
						Static501.method7054(2);
						Static206.method3169();
						Static318.method4726(7);
						Static284.aClass83_193 = null;
						return;
					}
					Static517.anInt8881 = 12;
				}
				if (Static517.anInt8881 == 12) {
					if (!Static485.aClass43_1.method1049(3)) {
						return;
					}
					Static485.aClass43_1.method1048(3, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
					Static517.anInt8881 = 13;
				}
				if (Static517.anInt8881 == 13) {
					local820 = Static158.aClass1_Sub3_Sub1_2;
					local820.anInt9802 = 0;
					if (local820.method4989()) {
						if (!Static485.aClass43_1.method1049(1)) {
							return;
						}
						Static485.aClass43_1.method1048(1, 3, local820.aByteArray104);
					}
					Static284.aClass83_193 = Static318.method4728()[local820.method4993()];
					Static464.anInt8696 = local820.method7945();
					Static517.anInt8881 = 11;
				}
				if (Static517.anInt8881 == 11) {
					if (Static485.aClass43_1.method1049(Static464.anInt8696)) {
						Static485.aClass43_1.method1048(Static464.anInt8696, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
						Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
						Static517.anInt8881 = 0;
						local180 = Static464.anInt8696;
						Static501.method7054(2);
						Static108.method1511();
						Static105.method6465(Static158.aClass1_Sub3_Sub1_2);
						Static276.anInt5046 = -1;
						if (Static284.aClass83_193 == Static135.aClass83_58) {
							Static340.method5075();
						} else {
							Static236.method7225();
						}
						if (Static158.aClass1_Sub3_Sub1_2.anInt9802 != local180) {
							throw new RuntimeException("lswp pos:" + Static158.aClass1_Sub3_Sub1_2.anInt9802 + " psize:" + local180);
						}
						Static284.aClass83_193 = null;
					}
				} else if (Static517.anInt8881 == 15) {
					if (Static464.anInt8696 == -2) {
						if (!Static485.aClass43_1.method1049(2)) {
							return;
						}
						Static485.aClass43_1.method1048(2, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
						Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
						Static464.anInt8696 = Static158.aClass1_Sub3_Sub1_2.method7945();
					}
					if (Static485.aClass43_1.method1049(Static464.anInt8696)) {
						Static485.aClass43_1.method1048(Static464.anInt8696, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
						Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
						Static517.anInt8881 = 0;
						local180 = Static464.anInt8696;
						Static501.method7054(15);
						Static262.method3791();
						Static105.method6465(Static158.aClass1_Sub3_Sub1_2);
						if (Static158.aClass1_Sub3_Sub1_2.anInt9802 != local180) {
							throw new RuntimeException("lswpr pos:" + Static158.aClass1_Sub3_Sub1_2.anInt9802 + " psize:" + local180);
						}
						Static284.aClass83_193 = null;
					}
				}
			} else if (Static485.aClass43_1.method1049(1)) {
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				Static594.anInt9813 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
				Static517.anInt8881 = 10;
			}
		} catch (@Pc(1589) IOException local1589) {
			if (Static485.aClass43_1 != null) {
				Static485.aClass43_1.method1044();
				Static485.aClass43_1 = null;
			}
			if (Static73.anInt1421 >= 2) {
				Static517.anInt8881 = 0;
				Static501.method7054(-4);
				Static259.method3769();
			} else {
				if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
					Static221.aClass261_3.method5585();
				} else {
					Static467.aClass261_6.method5585();
				}
				Static73.anInt1421++;
				Static178.anInt3319 = 0;
				Static517.anInt8881 = 1;
			}
		}
	}
}
