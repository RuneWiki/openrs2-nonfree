import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!il", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
	public static void method1576() {
		Static98.anInt2009 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static447.anInt6547; local3++) {
			@Pc(8) Class81 local8 = Static82.aClass81Array2[local3];
			@Pc(12) int local12;
			if (Static40.anIntArray61 != null) {
				for (local12 = 0; local12 < Static40.anIntArray61.length; local12++) {
					if (Static40.anIntArray61[local12] != -1000000 && (local8.anInt2397 <= Static40.anIntArray61[local12] || local8.anInt2403 <= Static40.anIntArray61[local12]) && (local8.anInt2393 <= Static81.anIntArray130[local12] || local8.anInt2386 <= Static81.anIntArray130[local12]) && (local8.anInt2393 >= Static101.anIntArray747[local12] || local8.anInt2386 >= Static101.anIntArray747[local12]) && (local8.anInt2385 <= Static277.anIntArray473[local12] || local8.anInt2384 <= Static277.anIntArray473[local12]) && (local8.anInt2385 >= Static144.anIntArray287[local12] || local8.anInt2384 >= Static144.anIntArray287[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt2388 == 1) {
				local12 = local8.anInt2401 + Static451.anInt7524 - Static18.anInt316;
				if (local12 >= 0 && local12 <= Static451.anInt7524 + Static451.anInt7524) {
					local110 = local8.anInt2387 + Static451.anInt7524 - Static265.anInt4683;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static451.anInt7524 + Static451.anInt7524) {
						continue;
					}
					local128 = local8.anInt2402 + Static451.anInt7524 - Static265.anInt4683;
					if (local128 > Static451.anInt7524 + Static451.anInt7524) {
						local128 = Static451.anInt7524 + Static451.anInt7524;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static460.aBooleanArrayArray9[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static401.anInt7402 - local8.anInt2393;
						if (local164 > Static165.anInt6634) {
							local8.anInt2394 = 1;
						} else {
							if (local164 >= -Static165.anInt6634) {
								continue;
							}
							local8.anInt2394 = 2;
							local164 = -local164;
						}
						local8.anInt2399 = (local8.anInt2385 - Static336.anInt5672 << 8) / local164;
						local8.anInt2395 = (local8.anInt2384 - Static336.anInt5672 << 8) / local164;
						local8.anInt2392 = (local8.anInt2397 - Static446.anInt7492 << 8) / local164;
						local8.anInt2400 = (local8.anInt2403 - Static446.anInt7492 << 8) / local164;
						Static44.aClass81Array1[Static98.anInt2009++] = local8;
					}
				}
			} else if (local8.anInt2388 == 2) {
				local12 = local8.anInt2387 + Static451.anInt7524 - Static265.anInt4683;
				if (local12 >= 0 && local12 <= Static451.anInt7524 + Static451.anInt7524) {
					local110 = local8.anInt2401 + Static451.anInt7524 - Static18.anInt316;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static451.anInt7524 + Static451.anInt7524) {
						continue;
					}
					local128 = local8.anInt2398 + Static451.anInt7524 - Static18.anInt316;
					if (local128 > Static451.anInt7524 + Static451.anInt7524) {
						local128 = Static451.anInt7524 + Static451.anInt7524;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static460.aBooleanArrayArray9[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static336.anInt5672 - local8.anInt2385;
						if (local164 > Static165.anInt6634) {
							local8.anInt2394 = 3;
						} else {
							if (local164 >= -Static165.anInt6634) {
								continue;
							}
							local8.anInt2394 = 4;
							local164 = -local164;
						}
						local8.anInt2404 = (local8.anInt2393 - Static401.anInt7402 << 8) / local164;
						local8.anInt2396 = (local8.anInt2386 - Static401.anInt7402 << 8) / local164;
						local8.anInt2392 = (local8.anInt2397 - Static446.anInt7492 << 8) / local164;
						local8.anInt2400 = (local8.anInt2403 - Static446.anInt7492 << 8) / local164;
						Static44.aClass81Array1[Static98.anInt2009++] = local8;
					}
				}
			} else if (local8.anInt2388 == 4) {
				local12 = local8.anInt2397 - Static446.anInt7492;
				if (local12 > Static16.anInt302) {
					local110 = local8.anInt2387 + Static451.anInt7524 - Static265.anInt4683;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static451.anInt7524 + Static451.anInt7524) {
						continue;
					}
					local128 = local8.anInt2402 + Static451.anInt7524 - Static265.anInt4683;
					if (local128 > Static451.anInt7524 + Static451.anInt7524) {
						local128 = Static451.anInt7524 + Static451.anInt7524;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt2401 + Static451.anInt7524 - Static18.anInt316;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static451.anInt7524 + Static451.anInt7524) {
						continue;
					}
					local164 = local8.anInt2398 + Static451.anInt7524 - Static18.anInt316;
					if (local164 > Static451.anInt7524 + Static451.anInt7524) {
						local164 = Static451.anInt7524 + Static451.anInt7524;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static460.aBooleanArrayArray9[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt2394 = 5;
						local8.anInt2404 = (local8.anInt2393 - Static401.anInt7402 << 8) / local12;
						local8.anInt2396 = (local8.anInt2386 - Static401.anInt7402 << 8) / local12;
						local8.anInt2399 = (local8.anInt2385 - Static336.anInt5672 << 8) / local12;
						local8.anInt2395 = (local8.anInt2384 - Static336.anInt5672 << 8) / local12;
						Static44.aClass81Array1[Static98.anInt2009++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!za;Lclient!l;)V")
	public static void method1577(@OriginalArg(1) Class50 arg0, @OriginalArg(2) Interface7 arg1) {
		if (Static143.aClass10_Sub1_Sub2_2 == null) {
			return;
		}
		if (Static264.anInt4667 < 10) {
			if (!Static143.aClass187_56.method4275(Static143.aClass10_Sub1_Sub2_2.aString4)) {
				Static264.anInt4667 = Static251.aClass187_110.method4310(Static143.aClass10_Sub1_Sub2_2.aString4) / 10;
				return;
			}
			Static16.method244();
			Static264.anInt4667 = 10;
		}
		if (Static264.anInt4667 == 10) {
			Static143.anInt2863 = Static143.aClass10_Sub1_Sub2_2.anInt245 >> 6 << 6;
			Static143.anInt2867 = Static143.aClass10_Sub1_Sub2_2.anInt253 >> 6 << 6;
			Static143.anInt2861 = (Static143.aClass10_Sub1_Sub2_2.anInt249 >> 6 << 6) + 64 - Static143.anInt2863;
			Static143.anInt2868 = (Static143.aClass10_Sub1_Sub2_2.anInt240 >> 6 << 6) + 64 - Static143.anInt2867;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static143.aClass10_Sub1_Sub2_2.method201(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, local74, Static72.anInt1488 + (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7), Static168.anInt3353 - -(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7))) {
				local78 = local74[2] - Static143.anInt2863;
				local76 = local74[1] - Static143.anInt2867;
			}
			if (!Static18.aBoolean24 && local76 >= 0 && local76 < Static143.anInt2868 && local78 >= 0 && Static143.anInt2861 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static90.anInt1909 = local76;
				Static55.anInt999 = local78;
			} else if (Static259.anInt6287 == -1 || Static115.anInt2360 == -1) {
				Static143.aClass10_Sub1_Sub2_2.method200(Static143.aClass10_Sub1_Sub2_2.anInt254 & 0x3FFF, Static143.aClass10_Sub1_Sub2_2.anInt254 >> 14 & 0x3FFF, local74);
				Static90.anInt1909 = local74[1] - Static143.anInt2867;
				Static55.anInt999 = local74[2] - Static143.anInt2863;
			} else {
				Static143.aClass10_Sub1_Sub2_2.method200(Static115.anInt2360, Static259.anInt6287, local74);
				Static115.anInt2360 = -1;
				Static259.anInt6287 = -1;
				Static18.aBoolean24 = false;
				if (local74 != null) {
					Static90.anInt1909 = local74[1] - Static143.anInt2867;
					Static55.anInt999 = local74[2] - Static143.anInt2863;
				}
			}
			if (Static143.aClass10_Sub1_Sub2_2.anInt241 == 37) {
				Static143.aFloat50 = 3.0F;
				Static143.aFloat49 = 3.0F;
			} else if (Static143.aClass10_Sub1_Sub2_2.anInt241 == 50) {
				Static143.aFloat50 = 4.0F;
				Static143.aFloat49 = 4.0F;
			} else if (Static143.aClass10_Sub1_Sub2_2.anInt241 == 75) {
				Static143.aFloat50 = 6.0F;
				Static143.aFloat49 = 6.0F;
			} else if (Static143.aClass10_Sub1_Sub2_2.anInt241 == 100) {
				Static143.aFloat50 = 8.0F;
				Static143.aFloat49 = 8.0F;
			} else if (Static143.aClass10_Sub1_Sub2_2.anInt241 == 200) {
				Static143.aFloat50 = 16.0F;
				Static143.aFloat49 = 16.0F;
			} else {
				Static143.aFloat50 = 8.0F;
				Static143.aFloat49 = 8.0F;
			}
			Static143.anInt2855 = (int) Static143.aFloat50 >> 1;
			Static143.aByteArrayArrayArray2 = Static335.method4518(Static143.anInt2855);
			Static14.method198();
			Static143.method2367();
			Static339.aClass163_38 = new Class163();
			Static143.anInt2856 += (int) (Math.random() * 5.0D) - 2;
			if (Static143.anInt2856 < -8) {
				Static143.anInt2856 = -8;
			}
			Static143.anInt2857 += (int) (Math.random() * 5.0D) - 2;
			if (Static143.anInt2856 > 8) {
				Static143.anInt2856 = 8;
			}
			if (Static143.anInt2857 < -16) {
				Static143.anInt2857 = -16;
			}
			if (Static143.anInt2857 > 16) {
				Static143.anInt2857 = 16;
			}
			Static143.method2368(arg1, Static143.anInt2856 >> 2 << 10, Static143.anInt2857 >> 1);
			Static143.aClass88_2.method2270(256, 1024);
			Static143.aClass2_3.method10(256, 256);
			Static143.aClass237_2.method5204(4096);
			Static189.aClass112_1.method2698(256);
			Static264.anInt4667 = 20;
		} else if (Static264.anInt4667 == 20) {
			Static149.method2572(true);
			Static143.method2378(arg0, Static143.anInt2856, Static143.anInt2857);
			Static264.anInt4667 = 60;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 60) {
			if (Static143.aClass187_56.method4280(Static143.aClass10_Sub1_Sub2_2.aString4 + "_staticelements")) {
				if (!Static143.aClass187_56.method4275(Static143.aClass10_Sub1_Sub2_2.aString4 + "_staticelements")) {
					return;
				}
				Static143.aClass125_3 = Static54.method939(Static143.aClass10_Sub1_Sub2_2.aString4 + "_staticelements", Static143.aClass187_56, aBoolean118);
			} else {
				Static143.aClass125_3 = new Class125(0);
			}
			Static143.method2372();
			Static264.anInt4667 = 70;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 70) {
			Static454.aClass262_10 = new Class262(arg0, 11, true, Static412.aCanvas7);
			Static264.anInt4667 = 73;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 73) {
			Static332.aClass262_9 = new Class262(arg0, 12, true, Static412.aCanvas7);
			Static264.anInt4667 = 76;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 76) {
			Static299.aClass262_7 = new Class262(arg0, 14, true, Static412.aCanvas7);
			Static264.anInt4667 = 79;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 79) {
			Static226.aClass262_5 = new Class262(arg0, 17, true, Static412.aCanvas7);
			Static264.anInt4667 = 82;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 82) {
			Static63.aClass262_4 = new Class262(arg0, 19, true, Static412.aCanvas7);
			Static264.anInt4667 = 85;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 85) {
			Static236.aClass262_6 = new Class262(arg0, 22, true, Static412.aCanvas7);
			Static264.anInt4667 = 88;
			Static149.method2572(true);
			Static349.method4739();
		} else if (Static264.anInt4667 == 88) {
			Static287.aClass262_8 = new Class262(arg0, 26, true, Static412.aCanvas7);
			Static264.anInt4667 = 91;
			Static149.method2572(true);
			Static349.method4739();
		} else {
			Static52.aClass262_3 = new Class262(arg0, 30, true, Static412.aCanvas7);
			Static264.anInt4667 = 100;
			Static149.method2572(true);
			Static349.method4739();
			System.gc();
		}
	}
}
