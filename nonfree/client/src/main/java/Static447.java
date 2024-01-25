import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray99;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[Lclient!dda;")
	public static Class62[] aClass62Array1;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[S")
	public static final short[] aShortArray125 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
	public static boolean method6376() throws IOException {
		if (Static402.aClass56_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static193.aClass140_112 == null) {
			if (Static245.aBoolean343) {
				if (!Static402.aClass56_2.method1313(1)) {
					return false;
				}
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				Static245.aBoolean343 = false;
				Static419.anInt7363++;
				Static36.anInt791 = 0;
			}
			Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
			if (Static97.aClass1_Sub6_Sub2_1.method3975()) {
				if (!Static402.aClass56_2.method1313(1)) {
					return false;
				}
				Static402.aClass56_2.method1316(1, 1, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				Static419.anInt7363++;
				Static36.anInt791 = 0;
			}
			Static245.aBoolean343 = true;
			@Pc(69) Class140[] local69 = Static298.method4744();
			local73 = Static97.aClass1_Sub6_Sub2_1.method3979();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static97.aClass1_Sub6_Sub2_1.anInt4555);
			}
			Static193.aClass140_112 = local69[local73];
			Static405.anInt9105 = Static193.aClass140_112.anInt4070;
		}
		if (Static405.anInt9105 == -1) {
			if (!Static402.aClass56_2.method1313(1)) {
				return false;
			}
			Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
			Static405.anInt9105 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
			Static419.anInt7363++;
			Static36.anInt791 = 0;
		}
		if (Static405.anInt9105 == -2) {
			if (!Static402.aClass56_2.method1313(2)) {
				return false;
			}
			Static402.aClass56_2.method1316(2, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
			Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
			Static405.anInt9105 = Static97.aClass1_Sub6_Sub2_1.method3967();
			Static419.anInt7363 += 2;
			Static36.anInt791 = 0;
		}
		if (Static405.anInt9105 > 0) {
			if (!Static402.aClass56_2.method1313(Static405.anInt9105)) {
				return false;
			}
			Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
			Static402.aClass56_2.method1316(Static405.anInt9105, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
			Static419.anInt7363 += Static405.anInt9105;
			Static36.anInt791 = 0;
		}
		Static320.aClass140_86 = Static544.aClass140_152;
		Static544.aClass140_152 = Static91.aClass140_30;
		Static91.aClass140_30 = Static193.aClass140_112;
		if (Static193.aClass140_112 == Static505.aClass140_139) {
			Static489.anInt8146 = 1;
			Static223.anInt4462 = Static164.anInt2967;
			Static193.aClass140_112 = null;
			return true;
		}
		@Pc(227) int local227;
		@Pc(219) int local219;
		@Pc(223) String local223;
		if (Static193.aClass140_112 == Static471.aClass140_128) {
			local219 = Static97.aClass1_Sub6_Sub2_1.method3914();
			local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
			local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
			if (Static539.method7503(local219)) {
				Static400.method6035(local227, local223);
			}
			Static193.aClass140_112 = null;
			return true;
		} else if (Static193.aClass140_112 == Static509.aClass140_141) {
			local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local73 = Static97.aClass1_Sub6_Sub2_1.method3925();
			if (Static539.method7503(local219)) {
				@Pc(261) Class1_Sub35 local261 = (Class1_Sub35) Static468.aClass17_36.method738((long) local73);
				if (local261 != null) {
					Static217.method7162(false, local261, true);
				}
				if (Static64.aClass156_3 != null) {
					Static473.method6593(Static64.aClass156_3);
					Static64.aClass156_3 = null;
				}
			}
			Static193.aClass140_112 = null;
			return true;
		} else if (Static193.aClass140_112 == Static106.aClass140_37) {
			local219 = Static97.aClass1_Sub6_Sub2_1.method3955();
			local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
			Static251.aClass119_1.method2646(local219, local73);
			Static193.aClass140_112 = null;
			return true;
		} else if (Static395.aClass140_110 == Static193.aClass140_112) {
			if (Static82.method3792(Static268.anInt5100)) {
				Static531.anInt8934 = (int) ((float) Static97.aClass1_Sub6_Sub2_1.method3967() * 2.5F);
			} else {
				Static531.anInt8934 = Static97.aClass1_Sub6_Sub2_1.method3967() * 30;
			}
			Static193.aClass140_112 = null;
			Static51.anInt1019 = Static164.anInt2967;
			return true;
		} else {
			@Pc(347) int local347;
			@Pc(372) int local372;
			@Pc(376) int local376;
			@Pc(351) int local351;
			@Pc(360) int local360;
			@Pc(366) int local366;
			if (Static193.aClass140_112 == Static173.aClass140_57) {
				local219 = Static97.aClass1_Sub6_Sub2_1.method3922();
				local73 = local219 >> 2;
				local227 = local219 & 0x3;
				local347 = Static280.anIntArray530[local73];
				local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
				if (local351 == 65535) {
					local351 = -1;
				}
				local360 = Static97.aClass1_Sub6_Sub2_1.method3934();
				local366 = local360 >> 28 & 0x3;
				local372 = local360 >> 14 & 0x3FFF;
				local376 = local360 & 0x3FFF;
				local372 -= Static470.anInt7897;
				local376 -= Static534.anInt9007;
				Static497.method6755(local372, local351, local376, local227, local366, local73, local347);
				Static193.aClass140_112 = null;
				return true;
			} else if (Static364.aClass140_99 == Static193.aClass140_112) {
				Static485.aString75 = Static405.anInt9105 > 2 ? Static97.aClass1_Sub6_Sub2_1.method3954() : Static384.aClass306_95.method7165(Static179.anInt3168);
				Static460.anInt7804 = Static405.anInt9105 <= 0 ? -1 : Static97.aClass1_Sub6_Sub2_1.method3967();
				Static193.aClass140_112 = null;
				if (Static460.anInt7804 == 65535) {
					Static460.anInt7804 = -1;
				}
				return true;
			} else {
				@Pc(486) String local486;
				@Pc(443) boolean local443;
				@Pc(449) String local449;
				@Pc(465) boolean local465;
				if (Static98.aClass140_136 == Static193.aClass140_112) {
					local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
					local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
					local449 = local223;
					if (local443) {
						local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
					}
					local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
					local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
					local465 = false;
					if (local347 <= 1 && Static367.method5687(local449)) {
						local465 = true;
					}
					if (!local465 && Static158.anInt2905 == 0) {
						local486 = Static480.aClass32_2.method922(local351).method4428(Static97.aClass1_Sub6_Sub2_1);
						if (local347 == 2) {
							Static272.method4464("<img=1>" + local449, 25, local486, "<img=1>" + local223, null, local351, 0);
						} else if (local347 == 1) {
							Static272.method4464("<img=0>" + local449, 25, local486, "<img=0>" + local223, null, local351, 0);
						} else {
							Static272.method4464(local449, 25, local486, local223, null, local351, 0);
						}
					}
					Static193.aClass140_112 = null;
					return true;
				} else if (Static302.aClass140_81 == Static193.aClass140_112) {
					local219 = Static97.aClass1_Sub6_Sub2_1.method3941();
					local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
					local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
					if (local227 == 65535) {
						local227 = -1;
					}
					Static129.method2164(local73, local219, local227);
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static437.aClass140_119) {
					local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
					if (local219 == 65535) {
						local219 = -1;
					}
					local73 = Static97.aClass1_Sub6_Sub2_1.method3965();
					local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
					Static320.method4981(local227, local219, local73);
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static537.aClass140_150) {
					local219 = Static97.aClass1_Sub6_Sub2_1.method3912();
					local73 = Static97.aClass1_Sub6_Sub2_1.method3918();
					if (local219 == 255) {
						local73 = -1;
						local219 = -1;
					}
					Static320.method4983(local219, local73);
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static429.aClass140_137) {
					local219 = Static97.aClass1_Sub6_Sub2_1.method3916();
					local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
					local227 = Static97.aClass1_Sub6_Sub2_1.method3934();
					if (Static539.method7503(local219)) {
						Static106.method1797(local227, local73);
					}
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static62.aClass140_21) {
					Static74.method1285(Static123.aClass229_6);
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static240.aClass140_71) {
					Static32.anInt747 = Static97.aClass1_Sub6_Sub2_1.method3912();
					Static192.anInt3402 = Static97.aClass1_Sub6_Sub2_1.method3911() << 3;
					Static535.anInt9012 = Static97.aClass1_Sub6_Sub2_1.method3911() << 3;
					while (Static97.aClass1_Sub6_Sub2_1.anInt4555 < Static405.anInt9105) {
						@Pc(706) Class229 local706 = Static460.method6494()[Static97.aClass1_Sub6_Sub2_1.method3922()];
						Static74.method1285(local706);
					}
					Static193.aClass140_112 = null;
					return true;
				} else if (Static193.aClass140_112 == Static329.aClass140_92) {
					Static74.method1285(Static267.aClass229_14);
					Static193.aClass140_112 = null;
					return true;
				} else {
					@Pc(761) Class1_Sub35 local761;
					if (Static533.aClass140_146 == Static193.aClass140_112) {
						local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
						local73 = Static97.aClass1_Sub6_Sub2_1.method3925();
						local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
						local347 = Static97.aClass1_Sub6_Sub2_1.method3943();
						if (Static539.method7503(local347)) {
							local761 = (Class1_Sub35) Static468.aClass17_36.method738((long) local73);
							if (local761 != null) {
								Static217.method7162(false, local761, local761.anInt6103 != local219);
							}
							Static252.method4236(local227, local219, false, local73);
						}
						Static193.aClass140_112 = null;
						return true;
					} else if (Static193.aClass140_112 == Static185.aClass140_59) {
						local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
						if (Static539.method7503(local219)) {
							Static164.method2530();
						}
						Static193.aClass140_112 = null;
						return true;
					} else {
						@Pc(870) String local870;
						@Pc(836) boolean local836;
						if (Static193.aClass140_112 == Static422.aClass140_116) {
							local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
							local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
							local449 = local223;
							if (local443) {
								local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
							}
							local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
							local836 = false;
							if (local347 <= 1) {
								if (Static264.aBoolean360 && !Static397.aBoolean514 || Static164.aBoolean185) {
									local836 = true;
								} else if (local347 <= 1 && Static367.method5687(local449)) {
									local836 = true;
								}
							}
							if (!local836 && Static158.anInt2905 == 0) {
								local870 = Static337.method5134(Static449.method6407(Static97.aClass1_Sub6_Sub2_1));
								if (local347 == 2) {
									Static272.method4464("<img=1>" + local449, 24, local870, "<img=1>" + local223, null, -1, 0);
								} else if (local347 == 1) {
									Static272.method4464("<img=0>" + local449, 24, local870, "<img=0>" + local223, null, -1, 0);
								} else {
									Static272.method4464(local449, 24, local870, local223, null, -1, 0);
								}
							}
							Static193.aClass140_112 = null;
							return true;
						} else if (Static402.aClass140_113 == Static193.aClass140_112) {
							Static74.method1285(Static544.aClass229_31);
							Static193.aClass140_112 = null;
							return true;
						} else {
							@Pc(964) String local964;
							@Pc(962) String local962;
							if (Static27.aClass140_13 == Static193.aClass140_112) {
								local219 = Static97.aClass1_Sub6_Sub2_1.method3936();
								local73 = Static97.aClass1_Sub6_Sub2_1.method3925();
								local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
								local962 = "";
								local964 = local962;
								if ((local227 & 0x1) != 0) {
									local962 = Static97.aClass1_Sub6_Sub2_1.method3954();
									if ((local227 & 0x2) == 0) {
										local964 = local962;
									} else {
										local964 = Static97.aClass1_Sub6_Sub2_1.method3954();
									}
								}
								local870 = Static97.aClass1_Sub6_Sub2_1.method3954();
								if (local219 == 99) {
									Static508.method7026(local870);
								} else if (local964.equals("") || !Static367.method5687(local964)) {
									Static363.method5419(local870, local73, local962, local219, local964);
								} else {
									Static193.aClass140_112 = null;
									return true;
								}
								Static193.aClass140_112 = null;
								return true;
							} else if (Static193.aClass140_112 == Static360.aClass140_98) {
								local219 = Static97.aClass1_Sub6_Sub2_1.method3929();
								local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
								local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
								local347 = Static97.aClass1_Sub6_Sub2_1.method3914();
								if (Static539.method7503(local347)) {
									Static187.method2927(local73 + (local227 << 16), local219);
								}
								Static193.aClass140_112 = null;
								return true;
							} else if (Static193.aClass140_112 == Static536.aClass140_148) {
								Static74.method1285(Static300.aClass229_15);
								Static193.aClass140_112 = null;
								return true;
							} else {
								@Pc(1129) Class1_Sub15 local1129;
								@Pc(1123) long local1123;
								if (Static25.aClass140_12 == Static193.aClass140_112) {
									local219 = Static97.aClass1_Sub6_Sub2_1.method3929();
									local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
									local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
									if (local227 == 65535) {
										local227 = -1;
									}
									local347 = Static97.aClass1_Sub6_Sub2_1.method3967();
									if (local347 == 65535) {
										local347 = -1;
									}
									local351 = Static97.aClass1_Sub6_Sub2_1.method3929();
									if (Static539.method7503(local73)) {
										for (local360 = local227; local360 <= local347; local360++) {
											local1123 = (long) local360 + ((long) local351 << 32);
											local1129 = (Class1_Sub15) Static528.aClass17_40.method738(local1123);
											@Pc(1141) Class1_Sub15 local1141;
											if (local1129 != null) {
												local1141 = new Class1_Sub15(local219, local1129.anInt2504);
												local1129.method7525();
											} else if (local360 == -1) {
												local1141 = new Class1_Sub15(local219, Static182.method2888(local351).aClass1_Sub15_1.anInt2504);
											} else {
												local1141 = new Class1_Sub15(local219, -1);
											}
											Static528.aClass17_40.method737(local1141, local1123);
										}
									}
									Static193.aClass140_112 = null;
									return true;
								} else if (Static193.aClass140_112 == Static373.aClass140_26) {
									Static123.method2107(false);
									Static193.aClass140_112 = null;
									return false;
								} else if (Static193.aClass140_112 == Static66.aClass140_22) {
									Static74.method1285(Static429.aClass229_28);
									Static193.aClass140_112 = null;
									return true;
								} else if (Static31.aClass140_14 == Static193.aClass140_112) {
									local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
									local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
									local227 = Static97.aClass1_Sub6_Sub2_1.method3955();
									if (Static539.method7503(local73)) {
										Static32.method759(local219, local227);
									}
									Static193.aClass140_112 = null;
									return true;
								} else {
									@Pc(1279) int local1279;
									@Pc(1277) boolean local1277;
									@Pc(1265) long local1265;
									@Pc(1260) long local1260;
									if (Static193.aClass140_112 == Static388.aClass140_109) {
										local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
										local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
										local449 = local223;
										if (local443) {
											local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
										}
										local1260 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local1265 = Static97.aClass1_Sub6_Sub2_1.method3920();
										local372 = Static97.aClass1_Sub6_Sub2_1.method3922();
										@Pc(1275) long local1275 = (local1260 << 32) + local1265;
										local1277 = false;
										local1279 = 0;
										while (true) {
											if (local1279 >= 100) {
												if (local372 <= 1) {
													if (Static264.aBoolean360 && !Static397.aBoolean514 || Static164.aBoolean185) {
														local1277 = true;
													} else if (Static367.method5687(local449)) {
														local1277 = true;
													}
												}
												break;
											}
											if (local1275 == Static156.aLongArray11[local1279]) {
												local1277 = true;
												break;
											}
											local1279++;
										}
										if (!local1277 && Static158.anInt2905 == 0) {
											Static156.aLongArray11[Static105.anInt2117] = local1275;
											Static105.anInt2117 = (Static105.anInt2117 + 1) % 100;
											@Pc(1339) String local1339 = Static337.method5134(Static449.method6407(Static97.aClass1_Sub6_Sub2_1));
											if (local372 == 2) {
												Static272.method4464("<img=1>" + local449, 7, local1339, "<img=1>" + local223, null, -1, 0);
											} else if (local372 == 1) {
												Static272.method4464("<img=0>" + local449, 7, local1339, "<img=0>" + local223, null, -1, 0);
											} else {
												Static272.method4464(local449, 3, local1339, local223, null, -1, 0);
											}
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static241.aClass140_72 == Static193.aClass140_112) {
										@Pc(1413) String local1413 = Static97.aClass1_Sub6_Sub2_1.method3954();
										local223 = Static337.method5134(Static449.method6407(Static97.aClass1_Sub6_Sub2_1));
										Static363.method5419(local223, 0, local1413, 6, local1413);
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static397.aClass140_111) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local347 = Static97.aClass1_Sub6_Sub2_1.method3967();
										if (Static539.method7503(local219) && Static396.aClass156ArrayArray1[local73] != null) {
											for (local351 = local227; local351 < local347; local351++) {
												local360 = Static97.aClass1_Sub6_Sub2_1.method3920();
												if (local351 < Static396.aClass156ArrayArray1[local73].length && Static396.aClass156ArrayArray1[local73][local351] != null) {
													Static396.aClass156ArrayArray1[local73][local351].anInt4700 = local360;
												}
											}
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static51.aClass140_19 == Static193.aClass140_112) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3929();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3939();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
										local347 = Static97.aClass1_Sub6_Sub2_1.method3964();
										if (Static539.method7503(local227)) {
											Static291.method4699(local73, local219, local347);
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static124.aClass140_45) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3914();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local347 = Static97.aClass1_Sub6_Sub2_1.method3929();
										if (Static539.method7503(local219)) {
											Static323.method5017(local227, local347, 5, local73);
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static96.aClass140_32) {
										Static74.method1285(Static158.aClass229_7);
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static384.aClass140_105) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3918();
										if (Static539.method7503(local219)) {
											Static16.anInt422 = local73;
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static111.aClass140_40) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
										if (local219 == 65535) {
											local219 = -1;
										}
										local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
										local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
										Static187.method2925(local219, local347, local227, local73);
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static20.aClass140_8) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3922();
										local73 = local219 >> 5;
										local227 = local219 & 0x1F;
										if (local227 == 0) {
											Static384.aClass268Array1[local73] = null;
											Static193.aClass140_112 = null;
											return true;
										}
										@Pc(1662) Class268 local1662 = new Class268();
										local1662.anInt7597 = local227;
										local1662.anInt7594 = Static97.aClass1_Sub6_Sub2_1.method3922();
										if (local1662.anInt7594 >= 0 && Static374.aClass2Array10.length > local1662.anInt7594) {
											if (local1662.anInt7597 == 1 || local1662.anInt7597 == 10) {
												local1662.anInt7595 = Static97.aClass1_Sub6_Sub2_1.method3967();
												Static97.aClass1_Sub6_Sub2_1.anInt4555 += 6;
											} else if (local1662.anInt7597 >= 2 && local1662.anInt7597 <= 6) {
												if (local1662.anInt7597 == 2) {
													local1662.anInt7596 = 256;
													local1662.anInt7591 = 256;
												}
												if (local1662.anInt7597 == 3) {
													local1662.anInt7591 = 0;
													local1662.anInt7596 = 256;
												}
												if (local1662.anInt7597 == 4) {
													local1662.anInt7591 = 512;
													local1662.anInt7596 = 256;
												}
												if (local1662.anInt7597 == 5) {
													local1662.anInt7591 = 256;
													local1662.anInt7596 = 0;
												}
												if (local1662.anInt7597 == 6) {
													local1662.anInt7591 = 256;
													local1662.anInt7596 = 512;
												}
												local1662.anInt7597 = 2;
												local1662.anInt7593 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local1662.anInt7591 += Static97.aClass1_Sub6_Sub2_1.method3967() - Static470.anInt7897 << 9;
												local1662.anInt7596 += Static97.aClass1_Sub6_Sub2_1.method3967() - Static534.anInt9007 << 9;
												local1662.anInt7598 = Static97.aClass1_Sub6_Sub2_1.method3922() << 2;
												local1662.anInt7590 = Static97.aClass1_Sub6_Sub2_1.method3967();
											}
											local1662.anInt7589 = Static97.aClass1_Sub6_Sub2_1.method3967();
											if (local1662.anInt7589 == 65535) {
												local1662.anInt7589 = -1;
											}
											Static384.aClass268Array1[local73] = local1662;
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static368.aClass140_101) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3914();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3934();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3934();
										if (Static539.method7503(local219)) {
											@Pc(1861) Class1_Sub35 local1861 = (Class1_Sub35) Static468.aClass17_36.method738((long) local73);
											local761 = (Class1_Sub35) Static468.aClass17_36.method738((long) local227);
											if (local761 != null) {
												Static217.method7162(false, local761, local1861 == null || local761.anInt6103 != local1861.anInt6103);
											}
											if (local1861 != null) {
												local1861.method7525();
												Static468.aClass17_36.method737(local1861, (long) local227);
											}
											@Pc(1903) Class156 local1903 = Static182.method2888(local73);
											if (local1903 != null) {
												Static473.method6593(local1903);
											}
											local1903 = Static182.method2888(local227);
											if (local1903 != null) {
												Static473.method6593(local1903);
												Static193.method6045(local1903, true);
											}
											if (Static170.anInt3050 != -1) {
												Static168.method4650(1, Static170.anInt3050);
											}
										}
										Static193.aClass140_112 = null;
										return true;
									} else if (Static497.aClass140_138 == Static193.aClass140_112) {
										Static533.method7382(false);
										Static193.aClass140_112 = null;
										return true;
									} else if (Static538.aClass140_151 == Static193.aClass140_112) {
										if (Static193.aFrame8 != null) {
											Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
										}
										@Pc(1958) byte[] local1958 = new byte[Static405.anInt9105];
										Static97.aClass1_Sub6_Sub2_1.method3974(Static405.anInt9105, local1958);
										local223 = Static524.method7187(Static405.anInt9105, local1958, 0);
										Static324.method5019(local223, Static374.anInt6861 == 1, true, Static466.aClass102_4);
										Static193.aClass140_112 = null;
										return true;
									} else if (Static193.aClass140_112 == Static329.aClass140_90) {
										Static342.method5176();
										Static193.aClass140_112 = null;
										return true;
									} else if (Static248.aClass140_42 == Static193.aClass140_112) {
										local219 = Static97.aClass1_Sub6_Sub2_1.method3918();
										local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
										local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
										@Pc(2018) Class1_Sub17 local2018 = (Class1_Sub17) Static380.aClass17_29.method738((long) local73);
										if (local2018 != null) {
											Static341.method5169(local219, local227, local2018.aClass49_Sub2_Sub2_Sub2_2);
										}
										Static193.aClass140_112 = null;
										return true;
									} else {
										@Pc(2074) int local2074;
										@Pc(2070) long local2070;
										@Pc(2078) int local2078;
										@Pc(2088) int local2088;
										if (Static467.aClass140_126 == Static193.aClass140_112) {
											local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
											local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
											local449 = local223;
											if (local443) {
												local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
											}
											local1260 = Static97.aClass1_Sub6_Sub2_1.method3949();
											local1265 = Static97.aClass1_Sub6_Sub2_1.method3967();
											local2070 = Static97.aClass1_Sub6_Sub2_1.method3920();
											local2074 = Static97.aClass1_Sub6_Sub2_1.method3922();
											local2078 = Static97.aClass1_Sub6_Sub2_1.method3967();
											@Pc(2084) long local2084 = local2070 + (local1265 << 32);
											@Pc(2086) boolean local2086 = false;
											local2088 = 0;
											while (true) {
												if (local2088 >= 100) {
													if (local2074 <= 1 && Static367.method5687(local449)) {
														local2086 = true;
													}
													break;
												}
												if (local2084 == Static156.aLongArray11[local2088]) {
													local2086 = true;
													break;
												}
												local2088++;
											}
											if (!local2086 && Static158.anInt2905 == 0) {
												Static156.aLongArray11[Static105.anInt2117] = local2084;
												Static105.anInt2117 = (Static105.anInt2117 + 1) % 100;
												@Pc(2142) String local2142 = Static480.aClass32_2.method922(local2078).method4428(Static97.aClass1_Sub6_Sub2_1);
												if (local2074 == 2) {
													Static272.method4464("<img=1>" + local449, 20, local2142, "<img=1>" + local223, Static132.method2208(local1260), local2078, 0);
												} else if (local2074 == 1) {
													Static272.method4464("<img=0>" + local449, 20, local2142, "<img=0>" + local223, Static132.method2208(local1260), local2078, 0);
												} else {
													Static272.method4464(local449, 20, local2142, local223, Static132.method2208(local1260), local2078, 0);
												}
											}
											Static193.aClass140_112 = null;
											return true;
										} else if (Static329.aClass140_91 == Static193.aClass140_112) {
											Static74.method1285(Static357.aClass229_22);
											Static193.aClass140_112 = null;
											return true;
										} else if (Static530.aClass140_145 == Static193.aClass140_112) {
											local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
											@Pc(2246) byte[] local2246 = new byte[Static405.anInt9105 - 1];
											Static97.aClass1_Sub6_Sub2_1.method3963(local2246, Static405.anInt9105 - 1);
											Static102.method1743(local443, local2246);
											Static193.aClass140_112 = null;
											return true;
										} else {
											@Pc(2314) boolean local2314;
											@Pc(2316) int local2316;
											@Pc(2312) long local2312;
											@Pc(2379) String local2379;
											if (Static292.aClass140_143 == Static193.aClass140_112) {
												local443 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
												local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
												local449 = local223;
												if (local443) {
													local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
												}
												local1260 = Static97.aClass1_Sub6_Sub2_1.method3949();
												local1265 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local2070 = Static97.aClass1_Sub6_Sub2_1.method3920();
												local2074 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local2312 = (local1265 << 32) + local2070;
												local2314 = false;
												local2316 = 0;
												while (true) {
													if (local2316 >= 100) {
														if (local2074 <= 1) {
															if (Static264.aBoolean360 && !Static397.aBoolean514 || Static164.aBoolean185) {
																local2314 = true;
															} else if (Static367.method5687(local449)) {
																local2314 = true;
															}
														}
														break;
													}
													if (Static156.aLongArray11[local2316] == local2312) {
														local2314 = true;
														break;
													}
													local2316++;
												}
												if (!local2314 && Static158.anInt2905 == 0) {
													Static156.aLongArray11[Static105.anInt2117] = local2312;
													Static105.anInt2117 = (Static105.anInt2117 + 1) % 100;
													local2379 = Static337.method5134(Static449.method6407(Static97.aClass1_Sub6_Sub2_1));
													if (local2074 == 2 || local2074 == 3) {
														Static272.method4464("<img=1>" + local449, 9, local2379, "<img=1>" + local223, Static132.method2208(local1260), -1, 0);
													} else if (local2074 == 1) {
														Static272.method4464("<img=0>" + local449, 9, local2379, "<img=0>" + local223, Static132.method2208(local1260), -1, 0);
													} else {
														Static272.method4464(local449, 9, local2379, local223, Static132.method2208(local1260), -1, 0);
													}
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static141.aClass140_46) {
												Static251.aClass119_1.method2649();
												Static193.aClass140_112 = null;
												Static7.anInt161 += 32;
												return true;
											} else if (Static193.aClass140_112 == Static144.aClass140_49) {
												Static533.method7382(true);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static474.aClass140_130) {
												Static123.method2107(Static111.aBoolean140);
												Static193.aClass140_112 = null;
												return false;
											} else if (Static343.aClass140_96 == Static193.aClass140_112) {
												Static74.method1285(Static322.aClass229_17);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static285.aClass140_79 == Static193.aClass140_112) {
												Static74.method1285(Static74.aClass229_5);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static40.aClass140_17 == Static193.aClass140_112) {
												local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3916();
												if (Static539.method7503(local227)) {
													Static87.method1482(local73, local219);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static328.aClass140_89) {
												local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
												@Pc(2555) Class49_Sub2_Sub2_Sub1 local2555;
												if (local219 == Static198.anInt3873) {
													local2555 = Static63.aClass49_Sub2_Sub2_Sub1_1;
												} else {
													local2555 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local219];
												}
												if (local2555 == null) {
													Static193.aClass140_112 = null;
													return true;
												}
												local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local836 = (local227 & 0x8000) != 0;
												if (local2555.aString16 != null && local2555.aClass206_1 != null) {
													local465 = false;
													if (local347 <= 1) {
														if (!local836 && (Static264.aBoolean360 && !Static397.aBoolean514 || Static164.aBoolean185)) {
															local465 = true;
														} else if (Static367.method5687(local2555.aString16)) {
															local465 = true;
														}
													}
													if (!local465 && Static158.anInt2905 == 0) {
														local372 = -1;
														if (local836) {
															local227 &= 0x7FFF;
															@Pc(2631) Class300 local2631 = Static510.method6249(Static97.aClass1_Sub6_Sub2_1);
															local372 = local2631.anInt8615;
															local486 = local2631.aClass1_Sub1_Sub10_1.method4428(Static97.aClass1_Sub6_Sub2_1);
														} else {
															local486 = Static337.method5134(Static449.method6407(Static97.aClass1_Sub6_Sub2_1));
														}
														local2555.aString40 = local486.trim();
														local2555.anInt4332 = 150;
														local2555.anInt4335 = local227 >> 8;
														local2555.anInt4269 = local227 & 0xFF;
														if (local347 == 1 || local347 == 2) {
															local376 = local836 ? 17 : 1;
														} else {
															local376 = local836 ? 17 : 2;
														}
														if (local347 == 2) {
															Static272.method4464("<img=1>" + local2555.method1531(), local376, local486, "<img=1>" + local2555.method1535(), null, local372, 0);
														} else if (local347 == 1) {
															Static272.method4464("<img=0>" + local2555.method1531(), local376, local486, "<img=0>" + local2555.method1535(), null, local372, 0);
														} else {
															Static272.method4464(local2555.method1531(), local376, local486, local2555.method1535(), null, local372, 0);
														}
													}
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static330.aClass140_93) {
												local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
												local347 = Static97.aClass1_Sub6_Sub2_1.method3929();
												local351 = Static97.aClass1_Sub6_Sub2_1.method3916();
												if (Static539.method7503(local351)) {
													Static323.method5017(local227 << 16 | local219, local73, 7, local347);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static146.aClass140_50 == Static193.aClass140_112) {
												if (Static170.anInt3050 != -1) {
													Static168.method4650(0, Static170.anInt3050);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static318.aClass140_83 == Static193.aClass140_112) {
												Static74.method1285(Static339.aClass229_20);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static420.aClass140_115) {
												local219 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local347 = Static97.aClass1_Sub6_Sub2_1.method3967() << 2;
												local351 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local360 = Static97.aClass1_Sub6_Sub2_1.method3922();
												if (Static539.method7503(local219)) {
													Static265.method4395(local360, local227, true, local347, local73, local351);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static369.aClass140_102) {
												local219 = Static97.aClass1_Sub6_Sub2_1.method3925();
												local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
												if (Static539.method7503(local73)) {
													Static323.method5017(Static198.anInt3873, 0, 5, local219);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static236.aClass140_70) {
												@Pc(2916) byte local2916 = Static97.aClass1_Sub6_Sub2_1.method3911();
												local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
												Static251.aClass119_1.method2650(local73, local2916);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static448.aClass140_122) {
												Static74.method1285(Static345.aClass229_21);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static185.aClass140_60) {
												@Pc(2954) byte local2954 = Static97.aClass1_Sub6_Sub2_1.method3928();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3916();
												local347 = Static97.aClass1_Sub6_Sub2_1.method3967();
												if (Static539.method7503(local227)) {
													Static120.method2016(local347, local2954);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static507.aClass140_140 == Static193.aClass140_112) {
												local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3916();
												Static251.aClass119_1.method2650(local227, local73);
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static149.aClass140_51) {
												local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
												local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local351 = Static97.aClass1_Sub6_Sub2_1.method3967() << 2;
												local360 = Static97.aClass1_Sub6_Sub2_1.method3922();
												local366 = Static97.aClass1_Sub6_Sub2_1.method3922();
												if (Static539.method7503(local73)) {
													Static336.method5113(local360, local366, local347, local227, local351);
												}
												Static193.aClass140_112 = null;
												return true;
											} else if (Static193.aClass140_112 == Static211.aClass140_67) {
												Static510.method6250();
												Static193.aClass140_112 = null;
												return false;
											} else if (Static193.aClass140_112 == Static454.aClass140_124) {
												Static125.method2133();
												Static193.aClass140_112 = null;
												return false;
											} else {
												@Pc(3076) boolean local3076;
												if (Static104.aClass140_36 == Static193.aClass140_112) {
													local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
													local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
													local3076 = (local227 & 0x1) == 1;
													Static111.method1902(local73, local3076);
													local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
													for (local360 = 0; local360 < local351; local360++) {
														local366 = Static97.aClass1_Sub6_Sub2_1.method3967();
														local372 = Static97.aClass1_Sub6_Sub2_1.method3922();
														if (local372 == 255) {
															local372 = Static97.aClass1_Sub6_Sub2_1.method3955();
														}
														Static88.method1529(local366 - 1, local3076, local73, local360, local372);
													}
													Static366.anIntArray657[Static68.anInt1315++ & 0x1F] = local73;
													Static193.aClass140_112 = null;
													return true;
												} else if (Static193.aClass140_112 == Static24.aClass140_11) {
													Static210.anInt4092 = Static97.aClass1_Sub6_Sub2_1.method3964();
													Static193.aClass140_112 = null;
													Static51.anInt1019 = Static164.anInt2967;
													return true;
												} else if (Static88.aClass140_29 == Static193.aClass140_112) {
													local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
													if (local73 == 65535) {
														local73 = -1;
													}
													local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
													local347 = Static97.aClass1_Sub6_Sub2_1.method3929();
													if (Static539.method7503(local227)) {
														Static323.method5017(local73, -1, 2, local347);
													}
													Static193.aClass140_112 = null;
													return true;
												} else if (Static108.aClass140_39 == Static193.aClass140_112) {
													local73 = Static97.aClass1_Sub6_Sub2_1.method3925();
													Static528.aClass157_9 = Static466.aClass102_4.method2382(local73);
													Static193.aClass140_112 = null;
													return true;
												} else if (Static193.aClass140_112 == Static57.aClass140_20) {
													local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
													local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
													local347 = Static97.aClass1_Sub6_Sub2_1.method3967();
													if (Static539.method7503(local347)) {
														Static288.method4642(local73, local449);
													}
													Static193.aClass140_112 = null;
													return true;
												} else {
													@Pc(3576) boolean local3576;
													@Pc(3253) boolean local3253;
													if (Static193.aClass140_112 == Static488.aClass140_135) {
														local73 = Static97.aClass1_Sub6_Sub2_1.method3918();
														local227 = Static97.aClass1_Sub6_Sub2_1.method3955();
														local347 = Static97.aClass1_Sub6_Sub2_1.method3914();
														local351 = Static97.aClass1_Sub6_Sub2_1.method3943();
														local360 = Static97.aClass1_Sub6_Sub2_1.method3943();
														local3253 = (local73 & 0x80) != 0;
														@Pc(3448) int local3448;
														if (local227 >> 30 == 0) {
															@Pc(3376) Class199 local3376;
															@Pc(3314) Class52 local3314;
															@Pc(3328) Class199 local3328;
															if (local227 >> 29 != 0) {
																local372 = local227 & 0xFFFF;
																@Pc(3278) Class1_Sub17 local3278 = (Class1_Sub17) Static380.aClass17_29.method738((long) local372);
																if (local3278 != null) {
																	if (local360 == 65535) {
																		local360 = -1;
																	}
																	@Pc(3288) Class49_Sub2_Sub2_Sub2 local3288 = local3278.aClass49_Sub2_Sub2_Sub2_2;
																	local1277 = true;
																	local1279 = local3253 ? local3288.anInt4289 : local3288.anInt4307;
																	if (local360 != -1 && local1279 != -1) {
																		if (local360 == local1279) {
																			local3314 = Static489.aClass194_2.method4810(local360);
																			if (local3314.aBoolean84 && local3314.anInt1342 != -1) {
																				local3328 = Static182.aClass218_1.method5221(local3314.anInt1342);
																				local2088 = local3328.anInt5744;
																				if (local2088 == 0 || local2088 == 2) {
																					local1277 = false;
																				} else if (local2088 == 1) {
																					local1277 = true;
																				}
																			}
																		} else {
																			local3314 = Static489.aClass194_2.method4810(local360);
																			@Pc(3361) Class52 local3361 = Static489.aClass194_2.method4810(local1279);
																			if (local3314.anInt1342 != -1 && local3361.anInt1342 != -1) {
																				local3376 = Static182.aClass218_1.method5221(local3314.anInt1342);
																				@Pc(3382) Class199 local3382 = Static182.aClass218_1.method5221(local3361.anInt1342);
																				if (local3382.anInt5750 > local3376.anInt5750) {
																					local1277 = false;
																				}
																			}
																		}
																	}
																	if (local1277) {
																		if (local3253) {
																			local3288.anInt4290 = 0;
																			local3288.anInt4289 = local360;
																			local3288.anInt4284 = 0;
																			local3288.anInt4266 = local73 & 0x7;
																			local3288.anInt4304 = local347 + Static436.anInt6850;
																			local3288.anInt4327 = 1;
																			local3288.anInt4259 = local351;
																			if (Static436.anInt6850 < local3288.anInt4304) {
																				local3288.anInt4284 = -1;
																			}
																			if (local3288.anInt4289 != -1 && Static436.anInt6850 == local3288.anInt4304) {
																				local3448 = Static489.aClass194_2.method4810(local3288.anInt4289).anInt1342;
																				if (local3448 != -1) {
																					local3328 = Static182.aClass218_1.method5221(local3448);
																					if (local3328 != null && local3328.anIntArray574 != null) {
																						Static381.method5839(local3288.anInt7141, false, local3328, 0, local3288.aByte98, local3288.anInt7137);
																					}
																				}
																			}
																		} else {
																			local3288.anInt4307 = local360;
																			local3288.anInt4298 = Static436.anInt6850 + local347;
																			local3288.anInt4313 = 1;
																			local3288.anInt4334 = 0;
																			local3288.anInt4302 = local351;
																			local3288.anInt4262 = 0;
																			local3288.anInt4281 = local73 & 0x7;
																			if (local3288.anInt4298 > Static436.anInt6850) {
																				local3288.anInt4334 = -1;
																			}
																			if (local3288.anInt4307 != -1 && Static436.anInt6850 == local3288.anInt4298) {
																				local3448 = Static489.aClass194_2.method4810(local3288.anInt4307).anInt1342;
																				if (local3448 != -1) {
																					local3328 = Static182.aClass218_1.method5221(local3448);
																					if (local3328 != null && local3328.anIntArray574 != null) {
																						Static381.method5839(local3288.anInt7141, false, local3328, 0, local3288.aByte98, local3288.anInt7137);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local227 >> 28 != 0) {
																local372 = local227 & 0xFFFF;
																@Pc(3561) Class49_Sub2_Sub2_Sub1 local3561;
																if (local372 == Static198.anInt3873) {
																	local3561 = Static63.aClass49_Sub2_Sub2_Sub1_1;
																} else {
																	local3561 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local372];
																}
																if (local3561 != null) {
																	if (local360 == 65535) {
																		local360 = -1;
																	}
																	local3576 = true;
																	local2078 = local3253 ? local3561.anInt4289 : local3561.anInt4307;
																	@Pc(3653) Class199 local3653;
																	if (local360 != -1 && local2078 != -1) {
																		@Pc(3598) Class52 local3598;
																		if (local360 == local2078) {
																			local3598 = Static489.aClass194_2.method4810(local360);
																			if (local3598.aBoolean84 && local3598.anInt1342 != -1) {
																				local3653 = Static182.aClass218_1.method5221(local3598.anInt1342);
																				local2316 = local3653.anInt5744;
																				if (local2316 == 0 || local2316 == 2) {
																					local3576 = false;
																				} else if (local2316 == 1) {
																					local3576 = true;
																				}
																			}
																		} else {
																			local3598 = Static489.aClass194_2.method4810(local360);
																			local3314 = Static489.aClass194_2.method4810(local2078);
																			if (local3598.anInt1342 != -1 && local3314.anInt1342 != -1) {
																				local3328 = Static182.aClass218_1.method5221(local3598.anInt1342);
																				local3376 = Static182.aClass218_1.method5221(local3314.anInt1342);
																				if (local3328.anInt5750 < local3376.anInt5750) {
																					local3576 = false;
																				}
																			}
																		}
																	}
																	if (local3576) {
																		if (local3253) {
																			local3561.anInt4259 = local351;
																			local3561.anInt4327 = 1;
																			local3561.anInt4304 = local347 + Static436.anInt6850;
																			local3561.anInt4284 = 0;
																			local3561.anInt4289 = local360;
																			local3561.anInt4290 = 0;
																			local3561.anInt4266 = local73 & 0x7;
																			if (Static436.anInt6850 < local3561.anInt4304) {
																				local3561.anInt4284 = -1;
																			}
																			if (local3561.anInt4289 == 65535) {
																				local3561.anInt4289 = -1;
																			}
																			if (local3561.anInt4289 != -1 && local3561.anInt4304 == Static436.anInt6850) {
																				local1279 = Static489.aClass194_2.method4810(local3561.anInt4289).anInt1342;
																				if (local1279 != -1) {
																					local3653 = Static182.aClass218_1.method5221(local1279);
																					if (local3653 != null && local3653.anIntArray574 != null) {
																						Static381.method5839(local3561.anInt7141, local3561 == Static63.aClass49_Sub2_Sub2_Sub1_1, local3653, 0, local3561.aByte98, local3561.anInt7137);
																					}
																				}
																			}
																		} else {
																			local3561.anInt4298 = Static436.anInt6850 + local347;
																			local3561.anInt4262 = 0;
																			local3561.anInt4281 = local73 & 0x7;
																			local3561.anInt4334 = 0;
																			local3561.anInt4313 = 1;
																			local3561.anInt4302 = local351;
																			local3561.anInt4307 = local360;
																			if (local3561.anInt4307 == 65535) {
																				local3561.anInt4307 = -1;
																			}
																			if (Static436.anInt6850 < local3561.anInt4298) {
																				local3561.anInt4334 = -1;
																			}
																			if (local3561.anInt4307 != -1 && local3561.anInt4298 == Static436.anInt6850) {
																				local1279 = Static489.aClass194_2.method4810(local3561.anInt4307).anInt1342;
																				if (local1279 != -1) {
																					local3653 = Static182.aClass218_1.method5221(local1279);
																					if (local3653 != null && local3653.anIntArray574 != null) {
																						Static381.method5839(local3561.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == local3561, local3653, 0, local3561.aByte98, local3561.anInt7137);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local372 = local227 >> 28 & 0x3;
															local376 = (local227 >> 14 & 0x3FFF) - Static470.anInt7897;
															local2074 = (local227 & 0x3FFF) - Static534.anInt9007;
															if (local376 >= 0 && local2074 >= 0 && Static459.anInt7799 > local376 && Static482.anInt7990 > local2074) {
																local2078 = local376 * 512 + 256;
																local1279 = local2074 * 512 + 256;
																local3448 = local372;
																if (local372 < 3 && Static505.method7002(local2074, local376)) {
																	local3448 = local372 + 1;
																}
																@Pc(3947) Class49_Sub2_Sub5 local3947 = new Class49_Sub2_Sub5(local360, 0, Static436.anInt6850, local372, local3448, local2078, Static38.method884(local372, local2078, local1279) - local351, local1279, local376, local376, local2074, local2074, local73 & 0x7);
																Static266.aClass37_105.method970(new Class1_Sub1_Sub12(local3947));
															}
														}
														Static193.aClass140_112 = null;
														return true;
													} else if (Static193.aClass140_112 == Static194.aClass140_63) {
														Static97.aClass1_Sub6_Sub2_1.anInt4555 += 28;
														if (Static97.aClass1_Sub6_Sub2_1.method3947()) {
															Static103.method1752(Static97.aClass1_Sub6_Sub2_1, Static97.aClass1_Sub6_Sub2_1.anInt4555 - 28);
														}
														Static193.aClass140_112 = null;
														return true;
													} else if (Static537.aClass140_149 == Static193.aClass140_112) {
														local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
														local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
														local347 = Static97.aClass1_Sub6_Sub2_1.method3916();
														if (Static539.method7503(local347)) {
															Static209.method3562(local227, local73);
														}
														Static193.aClass140_112 = null;
														return true;
													} else if (Static193.aClass140_112 == Static385.aClass140_106) {
														Static193.aClass140_112 = null;
														return false;
													} else if (Static193.aClass140_112 == Static252.aClass140_73) {
														for (local73 = 0; local73 < Static349.aClass49_Sub2_Sub2_Sub1Array1.length; local73++) {
															if (Static349.aClass49_Sub2_Sub2_Sub1Array1[local73] != null) {
																Static349.aClass49_Sub2_Sub2_Sub1Array1[local73].anInt4297 = -1;
															}
														}
														for (local227 = 0; local227 < Static350.anInt6254; local227++) {
															Static177.aClass1_Sub17Array3[local227].aClass49_Sub2_Sub2_Sub2_2.anInt4297 = -1;
														}
														Static193.aClass140_112 = null;
														return true;
													} else if (Static193.aClass140_112 == Static320.aClass140_84) {
														Static40.anInt856 = Static97.aClass1_Sub6_Sub2_1.method3922();
														for (local73 = 0; local73 < Static40.anInt856; local73++) {
															Static354.aStringArray32[local73] = Static97.aClass1_Sub6_Sub2_1.method3954();
															Static170.aStringArray15[local73] = Static97.aClass1_Sub6_Sub2_1.method3954();
															if (Static170.aStringArray15[local73].equals("")) {
																Static170.aStringArray15[local73] = Static354.aStringArray32[local73];
															}
															Static17.aStringArray1[local73] = Static97.aClass1_Sub6_Sub2_1.method3954();
															Static89.aStringArray8[local73] = Static97.aClass1_Sub6_Sub2_1.method3954();
															if (Static89.aStringArray8[local73].equals("")) {
																Static89.aStringArray8[local73] = Static17.aStringArray1[local73];
															}
															Static175.aBooleanArray19[local73] = false;
														}
														Static223.anInt4462 = Static164.anInt2967;
														Static193.aClass140_112 = null;
														return true;
													} else if (Static193.aClass140_112 == Static189.aClass140_61) {
														local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
														local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
														local3076 = (local227 & 0x1) == 1;
														while (Static405.anInt9105 > Static97.aClass1_Sub6_Sub2_1.anInt4555) {
															local351 = Static97.aClass1_Sub6_Sub2_1.method3936();
															local360 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local366 = 0;
															if (local360 != 0) {
																local366 = Static97.aClass1_Sub6_Sub2_1.method3922();
																if (local366 == 255) {
																	local366 = Static97.aClass1_Sub6_Sub2_1.method3925();
																}
															}
															Static88.method1529(local360 - 1, local3076, local73, local351, local366);
														}
														Static366.anIntArray657[Static68.anInt1315++ & 0x1F] = local73;
														Static193.aClass140_112 = null;
														return true;
													} else if (Static193.aClass140_112 == Static320.aClass140_85) {
														Static74.method1285(Static314.aClass229_16);
														Static193.aClass140_112 = null;
														return true;
													} else if (Static487.aClass140_134 == Static193.aClass140_112) {
														Static289.method4670(Static97.aClass1_Sub6_Sub2_1, Static466.aClass102_4, Static405.anInt9105);
														Static193.aClass140_112 = null;
														return true;
													} else if (Static316.aClass140_82 == Static193.aClass140_112) {
														Static192.anInt3402 = Static97.aClass1_Sub6_Sub2_1.method3910() << 3;
														Static535.anInt9012 = Static97.aClass1_Sub6_Sub2_1.method3910() << 3;
														Static32.anInt747 = Static97.aClass1_Sub6_Sub2_1.method3941();
														Static193.aClass140_112 = null;
														return true;
													} else {
														@Pc(4263) boolean local4263;
														if (Static484.aClass140_132 == Static193.aClass140_112) {
															local4263 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
															local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
															local962 = local449;
															if (local4263) {
																local962 = Static97.aClass1_Sub6_Sub2_1.method3954();
															}
															@Pc(4280) long local4280 = (long) Static97.aClass1_Sub6_Sub2_1.method3967();
															local1123 = Static97.aClass1_Sub6_Sub2_1.method3920();
															local376 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local2074 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local2312 = (local4280 << 32) + local1123;
															local2314 = false;
															local2316 = 0;
															while (true) {
																if (local2316 >= 100) {
																	if (local376 <= 1 && Static367.method5687(local962)) {
																		local2314 = true;
																	}
																	break;
																}
																if (Static156.aLongArray11[local2316] == local2312) {
																	local2314 = true;
																	break;
																}
																local2316++;
															}
															if (!local2314 && Static158.anInt2905 == 0) {
																Static156.aLongArray11[Static105.anInt2117] = local2312;
																Static105.anInt2117 = (Static105.anInt2117 + 1) % 100;
																local2379 = Static480.aClass32_2.method922(local2074).method4428(Static97.aClass1_Sub6_Sub2_1);
																if (local376 == 2) {
																	Static272.method4464("<img=1>" + local962, 18, local2379, "<img=1>" + local449, null, local2074, 0);
																} else if (local376 == 1) {
																	Static272.method4464("<img=0>" + local962, 18, local2379, "<img=0>" + local449, null, local2074, 0);
																} else {
																	Static272.method4464(local962, 18, local2379, local449, null, local2074, 0);
																}
															}
															Static193.aClass140_112 = null;
															return true;
														} else if (Static95.aClass140_31 == Static193.aClass140_112) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
															local227 = Static97.aClass1_Sub6_Sub2_1.method3912();
															local347 = Static97.aClass1_Sub6_Sub2_1.method3914();
															if (Static539.method7503(local347)) {
																if (local227 == 2) {
																	Static222.method3844();
																}
																Static170.anInt3050 = local73;
																Static475.method5209(local73);
																Static465.method6533(false);
																Static180.method2684(Static170.anInt3050);
																for (local351 = 0; local351 < 100; local351++) {
																	Static3.aBooleanArray1[local351] = true;
																}
															}
															Static193.aClass140_112 = null;
															return true;
														} else if (Static7.aClass140_1 == Static193.aClass140_112) {
															Static66.aClass256_2 = Static3.method209(Static97.aClass1_Sub6_Sub2_1.method3922());
															Static193.aClass140_112 = null;
															return true;
														} else if (Static473.aClass140_129 == Static193.aClass140_112) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
															if (local73 == 65535) {
																local73 = -1;
															}
															local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local347 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local351 = Static97.aClass1_Sub6_Sub2_1.method3922();
															Static161.method2496(local227, local351, local347, local73);
															Static193.aClass140_112 = null;
															return true;
														} else if (Static529.aClass140_144 == Static193.aClass140_112) {
															Static314.anInt5789 = Static97.aClass1_Sub6_Sub2_1.method3922();
															Static193.aClass140_112 = null;
															Static51.anInt1019 = Static164.anInt2967;
															return true;
														} else if (Static80.aClass140_28 == Static193.aClass140_112) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
															@Pc(4553) Object[] local4553 = new Object[local449.length() + 1];
															for (local351 = local449.length() - 1; local351 >= 0; local351--) {
																if (local449.charAt(local351) == 's') {
																	local4553[local351 + 1] = Static97.aClass1_Sub6_Sub2_1.method3954();
																} else {
																	local4553[local351 + 1] = Integer.valueOf(Static97.aClass1_Sub6_Sub2_1.method3925());
																}
															}
															local4553[0] = Integer.valueOf(Static97.aClass1_Sub6_Sub2_1.method3925());
															if (Static539.method7503(local73)) {
																@Pc(4608) Class1_Sub30 local4608 = new Class1_Sub30();
																local4608.anObjectArray36 = local4553;
																Static180.method2683(local4608);
															}
															Static193.aClass140_112 = null;
															return true;
														} else if (Static193.aClass140_112 == Static283.aClass140_78) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local227 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local347 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local351 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local360 = Static97.aClass1_Sub6_Sub2_1.method3922();
															local366 = Static97.aClass1_Sub6_Sub2_1.method3967();
															if (Static539.method7503(local73)) {
																Static170.aBooleanArray18[local227] = true;
																Static302.anIntArray556[local227] = local347;
																Static379.anIntArray822[local227] = local351;
																Static260.anIntArray518[local227] = local360;
																Static541.anIntArray841[local227] = local366;
															}
															Static193.aClass140_112 = null;
															return true;
														} else if (Static368.aClass140_100 == Static193.aClass140_112) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
															if (local73 == 65535) {
																local73 = -1;
															}
															local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
															local347 = Static97.aClass1_Sub6_Sub2_1.method3955();
															if (Static539.method7503(local227)) {
																Static323.method5017(local73, -1, 1, local347);
															}
															Static193.aClass140_112 = null;
															return true;
														} else if (Static369.aClass140_103 == Static193.aClass140_112) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
															if (Static97.aClass1_Sub6_Sub2_1.method3922() == 0) {
																Static313.aClass142Array1[local73] = new Class142();
															} else {
																Static97.aClass1_Sub6_Sub2_1.anInt4555--;
																Static313.aClass142Array1[local73] = new Class142(Static97.aClass1_Sub6_Sub2_1);
															}
															Static104.anInt2086 = Static164.anInt2967;
															Static193.aClass140_112 = null;
															return true;
														} else if (Static193.aClass140_112 == Static189.aClass140_62) {
															local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
															local227 = Static97.aClass1_Sub6_Sub2_1.method3955();
															local347 = Static97.aClass1_Sub6_Sub2_1.method3925();
															local351 = Static97.aClass1_Sub6_Sub2_1.method3914();
															if (local351 == 65535) {
																local351 = -1;
															}
															if (Static539.method7503(local73)) {
																Static286.method4635(local351, local227, local347);
																@Pc(4789) Class133 local4789 = Static342.aClass250_2.method5980(local351);
																Static468.method6560(local4789.anInt3904, local347, local4789.anInt3893, local4789.anInt3945);
																Static376.method5762(local4789.anInt3911, local347, local4789.lb, local4789.anInt3908);
															}
															Static193.aClass140_112 = null;
															return true;
														} else {
															@Pc(4980) boolean local4980;
															@Pc(5001) Class249 local5001;
															if (Static193.aClass140_112 == Static484.aClass140_133) {
																Static509.anInt8616 = Static164.anInt2967;
																if (Static405.anInt9105 == 0) {
																	Static3.aString1 = null;
																	Static218.anInt7241 = 0;
																	Static419.aClass249Array1 = null;
																	Static83.aString14 = null;
																	Static193.aClass140_112 = null;
																	return true;
																}
																Static83.aString14 = Static97.aClass1_Sub6_Sub2_1.method3954();
																local4263 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																if (local4263) {
																	Static97.aClass1_Sub6_Sub2_1.method3954();
																}
																@Pc(4853) long local4853 = Static97.aClass1_Sub6_Sub2_1.method3949();
																Static3.aString1 = Static545.method7543(local4853);
																Static230.aByte12 = Static97.aClass1_Sub6_Sub2_1.method3928();
																local351 = Static97.aClass1_Sub6_Sub2_1.method3922();
																if (local351 == 255) {
																	Static193.aClass140_112 = null;
																	return true;
																}
																Static218.anInt7241 = local351;
																@Pc(4877) Class249[] local4877 = new Class249[100];
																for (local366 = 0; local366 < Static218.anInt7241; local366++) {
																	local4877[local366] = new Class249();
																	local4877[local366].aString67 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	local4263 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																	if (local4263) {
																		local4877[local366].aString65 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	} else {
																		local4877[local366].aString65 = local4877[local366].aString67;
																	}
																	local4877[local366].aString68 = Static142.method2303(local4877[local366].aString65);
																	local4877[local366].anInt7111 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	local4877[local366].aByte96 = Static97.aClass1_Sub6_Sub2_1.method3928();
																	local4877[local366].aString66 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	if (local4877[local366].aString65.equals(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16)) {
																		Static524.aByte110 = local4877[local366].aByte96;
																	}
																}
																local2074 = Static218.anInt7241;
																while (local2074 > 0) {
																	local4980 = true;
																	local2074--;
																	for (local2078 = 0; local2078 < local2074; local2078++) {
																		if (local4877[local2078].aString68.compareTo(local4877[local2078 + 1].aString68) > 0) {
																			local5001 = local4877[local2078];
																			local4877[local2078] = local4877[local2078 + 1];
																			local4877[local2078 + 1] = local5001;
																			local4980 = false;
																		}
																	}
																	if (local4980) {
																		break;
																	}
																}
																Static193.aClass140_112 = null;
																Static419.aClass249Array1 = local4877;
																return true;
															} else if (Static274.aClass140_76 == Static193.aClass140_112) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
																local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
																local347 = Static97.aClass1_Sub6_Sub2_1.method3914();
																if (Static539.method7503(local227)) {
																	Static120.method2016(local347, local73);
																}
																Static193.aClass140_112 = null;
																return true;
															} else if (Static193.aClass140_112 == Static37.aClass140_16) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
																local227 = Static97.aClass1_Sub6_Sub2_1.method3918();
																local3076 = (local227 & 0x1) == 1;
																Static191.method2966(local73, local3076);
																Static366.anIntArray657[Static68.anInt1315++ & 0x1F] = local73;
																Static193.aClass140_112 = null;
																return true;
															} else if (Static193.aClass140_112 == Static104.aClass140_35) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
																local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
																local347 = Static97.aClass1_Sub6_Sub2_1.method3918();
																local351 = Static97.aClass1_Sub6_Sub2_1.method3943();
																if (local351 == 65535) {
																	local351 = -1;
																}
																if (local73 >= 1 && local73 <= 8) {
																	if (local449.equalsIgnoreCase("null")) {
																		local449 = null;
																	}
																	Static457.aStringArray41[local73 - 1] = local449;
																	Static108.anIntArray216[local73 - 1] = local351;
																	Static284.aBooleanArray35[local73 - 1] = local347 == 0;
																}
																Static193.aClass140_112 = null;
																return true;
															} else if (Static193.aClass140_112 == Static351.aClass140_97) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
																local227 = Static97.aClass1_Sub6_Sub2_1.method3914();
																local962 = Static97.aClass1_Sub6_Sub2_1.method3954();
																if (Static539.method7503(local227)) {
																	Static400.method6035(local73, local962);
																}
																Static193.aClass140_112 = null;
																return true;
															} else if (Static193.aClass140_112 == Static339.aClass140_94) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3943();
																if (local73 == 65535) {
																	local73 = -1;
																}
																local227 = Static97.aClass1_Sub6_Sub2_1.method3943();
																local347 = Static97.aClass1_Sub6_Sub2_1.method3925();
																if (Static539.method7503(local227)) {
																	Static438.method6423(local73, local347);
																}
																Static193.aClass140_112 = null;
																return true;
															} else if (Static193.aClass140_112 == Static10.aClass140_5) {
																local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
																local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
																local962 = Static480.aClass32_2.method922(local227).method4428(Static97.aClass1_Sub6_Sub2_1);
																Static272.method4464(local223, 19, local962, local223, null, local227, 0);
																Static193.aClass140_112 = null;
																return true;
															} else if (Static80.aClass140_27 == Static193.aClass140_112) {
																local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
																local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
																if (local227 == 65535) {
																	local227 = -1;
																}
																local347 = Static97.aClass1_Sub6_Sub2_1.method3943();
																local351 = Static97.aClass1_Sub6_Sub2_1.method3934();
																local360 = Static97.aClass1_Sub6_Sub2_1.method3914();
																if (local360 == 65535) {
																	local360 = -1;
																}
																if (Static539.method7503(local347)) {
																	for (local366 = local360; local366 <= local227; local366++) {
																		local2070 = ((long) local351 << 32) + ((long) local366);
																		@Pc(5316) Class1_Sub15 local5316 = (Class1_Sub15) Static528.aClass17_40.method738(local2070);
																		if (local5316 != null) {
																			local1129 = new Class1_Sub15(local5316.anInt2505, local73);
																			local5316.method7525();
																		} else if (local366 == -1) {
																			local1129 = new Class1_Sub15(Static182.method2888(local351).aClass1_Sub15_1.anInt2505, local73);
																		} else {
																			local1129 = new Class1_Sub15(0, local73);
																		}
																		Static528.aClass17_40.method737(local1129, local2070);
																	}
																}
																Static193.aClass140_112 = null;
																return true;
															} else if (Static545.aClass140_153 == Static193.aClass140_112) {
																Static192.anInt3402 = Static97.aClass1_Sub6_Sub2_1.method3911() << 3;
																Static32.anInt747 = Static97.aClass1_Sub6_Sub2_1.method3922();
																Static535.anInt9012 = Static97.aClass1_Sub6_Sub2_1.method3910() << 3;
																for (@Pc(5393) Class1_Sub26 local5393 = (Class1_Sub26) Static255.aClass17_20.method735(); local5393 != null; local5393 = (Class1_Sub26) Static255.aClass17_20.method740()) {
																	local227 = (int) (local5393.aLong392 >> 28 & 0x3L);
																	local347 = (int) (local5393.aLong392 & 0x3FFFL);
																	local351 = local347 - Static470.anInt7897;
																	local360 = (int) (local5393.aLong392 >> 14 & 0x3FFFL);
																	local366 = local360 - Static534.anInt9007;
																	if (Static32.anInt747 == local227 && Static535.anInt9012 <= local351 && Static535.anInt9012 + 8 > local351 && Static192.anInt3402 <= local366 && local366 < Static192.anInt3402 + 8) {
																		local5393.method7525();
																		if (local351 >= 0 && local366 >= 0 && local351 < Static459.anInt7799 && local366 < Static482.anInt7990) {
																			Static424.method6219(local351, local366, Static32.anInt747);
																		}
																	}
																}
																for (@Pc(5487) Class1_Sub36 local5487 = (Class1_Sub36) Static191.aClass37_41.method977(); local5487 != null; local5487 = (Class1_Sub36) Static191.aClass37_41.method971()) {
																	if (local5487.anInt6239 >= Static535.anInt9012 && Static535.anInt9012 + 8 > local5487.anInt6239 && local5487.anInt6235 >= Static192.anInt3402 && local5487.anInt6235 < Static192.anInt3402 + 8 && local5487.anInt6243 == Static32.anInt747) {
																		local5487.anInt6238 = 0;
																	}
																}
																Static193.aClass140_112 = null;
																return true;
															} else {
																@Pc(5588) String local5588;
																if (Static193.aClass140_112 == Static166.aClass140_55) {
																	local223 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	local3076 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																	if (local3076) {
																		local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	} else {
																		local449 = local223;
																	}
																	local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	@Pc(5575) byte local5575 = Static97.aClass1_Sub6_Sub2_1.method3928();
																	local3253 = false;
																	if (local5575 == -128) {
																		local3253 = true;
																	}
																	if (local3253) {
																		if (Static218.anInt7241 == 0) {
																			Static193.aClass140_112 = null;
																			return true;
																		}
																		for (local372 = 0; Static218.anInt7241 > local372 && (!Static419.aClass249Array1[local372].aString65.equals(local449) || Static419.aClass249Array1[local372].anInt7111 != local351); local372++) {
																		}
																		if (local372 < Static218.anInt7241) {
																			while (local372 < Static218.anInt7241 - 1) {
																				Static419.aClass249Array1[local372] = Static419.aClass249Array1[local372 + 1];
																				local372++;
																			}
																			Static218.anInt7241--;
																			Static419.aClass249Array1[Static218.anInt7241] = null;
																		}
																	} else {
																		local5588 = Static97.aClass1_Sub6_Sub2_1.method3954();
																		local5001 = new Class249();
																		local5001.aString65 = local449;
																		local5001.aString67 = local223;
																		local5001.aString68 = Static142.method2303(local5001.aString65);
																		local5001.anInt7111 = local351;
																		local5001.aByte96 = local5575;
																		local5001.aString66 = local5588;
																		for (local2074 = Static218.anInt7241 - 1; local2074 >= 0; local2074--) {
																			local2078 = Static419.aClass249Array1[local2074].aString68.compareTo(local5001.aString68);
																			if (local2078 == 0) {
																				Static419.aClass249Array1[local2074].anInt7111 = local351;
																				Static419.aClass249Array1[local2074].aByte96 = local5575;
																				Static419.aClass249Array1[local2074].aString66 = local5588;
																				if (local449.equals(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16)) {
																					Static524.aByte110 = local5575;
																				}
																				Static509.anInt8616 = Static164.anInt2967;
																				Static193.aClass140_112 = null;
																				return true;
																			}
																			if (local2078 < 0) {
																				break;
																			}
																		}
																		if (Static218.anInt7241 >= Static419.aClass249Array1.length) {
																			Static193.aClass140_112 = null;
																			return true;
																		}
																		for (local2078 = Static218.anInt7241 - 1; local2078 > local2074; local2078--) {
																			Static419.aClass249Array1[local2078 + 1] = Static419.aClass249Array1[local2078];
																		}
																		if (Static218.anInt7241 == 0) {
																			Static419.aClass249Array1 = new Class249[100];
																		}
																		Static419.aClass249Array1[local2074 + 1] = local5001;
																		Static218.anInt7241++;
																		if (local449.equals(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16)) {
																			Static524.aByte110 = local5575;
																		}
																	}
																	Static509.anInt8616 = Static164.anInt2967;
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static181.aClass140_58) {
																	Static281.method4562(Static97.aClass1_Sub6_Sub2_1, Static405.anInt9105);
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static449.aClass140_123 == Static193.aClass140_112) {
																	Static329.anInt5977 = Static97.aClass1_Sub6_Sub2_1.method3922();
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static258.aClass140_74 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3941();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3941();
																	local347 = Static97.aClass1_Sub6_Sub2_1.method3934();
																	Static533.anIntArray830[local227] = local347;
																	Static532.anIntArray828[local227] = local73;
																	Static3.anIntArray16[local227] = 1;
																	local351 = Static378.anIntArray676[local227] - 1;
																	for (local360 = 0; local360 < local351; local360++) {
																		if (Class1_Sub3_Sub17.anIntArray343[local360] <= local347) {
																			Static3.anIntArray16[local227] = local360 + 2;
																		}
																	}
																	Static217.anIntArray788[Static219.anInt7871++ & 0x1F] = local227;
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static108.aClass140_38) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3964();
																	local347 = Static97.aClass1_Sub6_Sub2_1.method3929();
																	if (Static539.method7503(local73)) {
																		Static10.method368(local347, local227);
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static34.aClass140_15 == Static193.aClass140_112) {
																	Static74.method1285(Static250.aClass229_13);
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static16.aClass140_7) {
																	Static157.anInt4565 = Static97.aClass1_Sub6_Sub2_1.method3968();
																	Static264.aBoolean360 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static373.aClass140_25 == Static193.aClass140_112) {
																	Static32.method755(Static97.aClass1_Sub6_Sub2_1.method3954());
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static436.aClass140_104) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3914();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3916();
																	local347 = Static97.aClass1_Sub6_Sub2_1.method3914();
																	local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	local360 = Static97.aClass1_Sub6_Sub2_1.method3929();
																	if (Static539.method7503(local347)) {
																		Static468.method6560(local227, local360, local351, local73);
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static196.aClass140_64 == Static193.aClass140_112) {
																	Static74.method1285(Static177.aClass229_10);
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static16.aClass140_6) {
																	Static74.method1285(Static379.aClass229_30);
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static219.aClass140_125 == Static193.aClass140_112) {
																	while (Static405.anInt9105 > Static97.aClass1_Sub6_Sub2_1.anInt4555) {
																		local4263 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																		local449 = Static97.aClass1_Sub6_Sub2_1.method3954();
																		local962 = Static97.aClass1_Sub6_Sub2_1.method3954();
																		local351 = Static97.aClass1_Sub6_Sub2_1.method3967();
																		local360 = Static97.aClass1_Sub6_Sub2_1.method3922();
																		local486 = "";
																		local4980 = false;
																		if (local351 > 0) {
																			local486 = Static97.aClass1_Sub6_Sub2_1.method3954();
																			local4980 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
																		}
																		for (local376 = 0; local376 < Static234.anInt4709; local376++) {
																			if (local4263) {
																				if (local962.equals(Static528.aStringArray43[local376])) {
																					Static528.aStringArray43[local376] = local449;
																					local449 = null;
																					Static373.aStringArray7[local376] = local962;
																					break;
																				}
																			} else if (local449.equals(Static528.aStringArray43[local376])) {
																				if (local351 != Static122.anIntArray240[local376]) {
																					local3576 = true;
																					for (@Pc(6090) Class72_Sub1_Sub2 local6090 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7030(); local6090 != null; local6090 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7031()) {
																						if (local6090.aString76.equals(local449)) {
																							if (local351 != 0 && local6090.aShort130 == 0) {
																								local3576 = false;
																								local6090.method6719();
																							} else if (local351 == 0 && local6090.aShort130 != 0) {
																								local6090.method6719();
																								local3576 = false;
																							}
																						}
																					}
																					if (local3576) {
																						Static516.aClass299_9.method7027(new Class72_Sub1_Sub2(local449, local351));
																					}
																					Static122.anIntArray240[local376] = local351;
																				}
																				Static373.aStringArray7[local376] = local962;
																				Static384.aStringArray37[local376] = local486;
																				Static217.anIntArray787[local376] = local360;
																				local449 = null;
																				Static326.aBooleanArray41[local376] = local4980;
																				break;
																			}
																		}
																		if (local449 != null && Static234.anInt4709 < 200) {
																			Static528.aStringArray43[Static234.anInt4709] = local449;
																			Static373.aStringArray7[Static234.anInt4709] = local962;
																			Static122.anIntArray240[Static234.anInt4709] = local351;
																			Static384.aStringArray37[Static234.anInt4709] = local486;
																			Static217.anIntArray787[Static234.anInt4709] = local360;
																			Static326.aBooleanArray41[Static234.anInt4709] = local4980;
																			Static234.anInt4709++;
																		}
																	}
																	Static489.anInt8146 = 2;
																	Static223.anInt4462 = Static164.anInt2967;
																	local227 = Static234.anInt4709;
																	while (local227 > 0) {
																		local4263 = true;
																		local227--;
																		for (local347 = 0; local347 < local227; local347++) {
																			if (Static122.anIntArray240[local347] != Static52.aClass4_1.anInt111 && Static52.aClass4_1.anInt111 == Static122.anIntArray240[local347 + 1] || Static122.anIntArray240[local347] == 0 && Static122.anIntArray240[local347 + 1] != 0) {
																				local351 = Static122.anIntArray240[local347];
																				Static122.anIntArray240[local347] = Static122.anIntArray240[local347 + 1];
																				Static122.anIntArray240[local347 + 1] = local351;
																				local870 = Static384.aStringArray37[local347];
																				Static384.aStringArray37[local347] = Static384.aStringArray37[local347 + 1];
																				Static384.aStringArray37[local347 + 1] = local870;
																				local486 = Static528.aStringArray43[local347];
																				Static528.aStringArray43[local347] = Static528.aStringArray43[local347 + 1];
																				Static528.aStringArray43[local347 + 1] = local486;
																				local5588 = Static373.aStringArray7[local347];
																				Static373.aStringArray7[local347] = Static373.aStringArray7[local347 + 1];
																				Static373.aStringArray7[local347 + 1] = local5588;
																				local376 = Static217.anIntArray787[local347];
																				Static217.anIntArray787[local347] = Static217.anIntArray787[local347 + 1];
																				Static217.anIntArray787[local347 + 1] = local376;
																				local3576 = Static326.aBooleanArray41[local347];
																				Static326.aBooleanArray41[local347] = Static326.aBooleanArray41[local347 + 1];
																				Static326.aBooleanArray41[local347 + 1] = local3576;
																				local4263 = false;
																			}
																		}
																		if (local4263) {
																			break;
																		}
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static51.aClass140_18 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3929();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	if (Static539.method7503(local227)) {
																		Static323.method5017(-1, -1, 3, local73);
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static193.aClass140_112 == Static171.aClass140_56) {
																	Static358.anInt8903 = Static97.aClass1_Sub6_Sub2_1.method3941();
																	Static88.anInt1783 = Static97.aClass1_Sub6_Sub2_1.method3922();
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static446.aClass140_121 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3922();
																	@Pc(6463) boolean local6463 = (local73 & 0x1) == 1;
																	local962 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	local964 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	if (local964.equals("")) {
																		local964 = local962;
																	}
																	local870 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	local486 = Static97.aClass1_Sub6_Sub2_1.method3954();
																	if (local486.equals("")) {
																		local486 = local870;
																	}
																	if (local6463) {
																		for (local372 = 0; local372 < Static40.anInt856; local372++) {
																			if (Static170.aStringArray15[local372].equals(local486)) {
																				Static354.aStringArray32[local372] = local962;
																				Static170.aStringArray15[local372] = local964;
																				Static17.aStringArray1[local372] = local870;
																				Static89.aStringArray8[local372] = local486;
																				break;
																			}
																		}
																	} else {
																		Static354.aStringArray32[Static40.anInt856] = local962;
																		Static170.aStringArray15[Static40.anInt856] = local964;
																		Static17.aStringArray1[Static40.anInt856] = local870;
																		Static89.aStringArray8[Static40.anInt856] = local486;
																		Static175.aBooleanArray19[Static40.anInt856] = (local73 & 0x2) == 2;
																		Static40.anInt856++;
																	}
																	Static223.anInt4462 = Static164.anInt2967;
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static203.aClass140_66 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3916();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3955();
																	local347 = Static97.aClass1_Sub6_Sub2_1.method3918();
																	if (Static539.method7503(local73)) {
																		Static194.method2973(local227, local347);
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static467.aClass140_127 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	if (Static539.method7503(local73)) {
																		Static241.method4170();
																	}
																	Static193.aClass140_112 = null;
																	return true;
																} else if (Static276.aClass140_147 == Static193.aClass140_112) {
																	local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
																	local227 = Static97.aClass1_Sub6_Sub2_1.method3912();
																	Static251.aClass119_1.method2646(local227, local73);
																	Static193.aClass140_112 = null;
																	return true;
																} else {
																	Static234.method4051(null, "T1 - " + (Static193.aClass140_112 == null ? -1 : Static193.aClass140_112.method3563()) + "," + (Static544.aClass140_152 == null ? -1 : Static544.aClass140_152.method3563()) + "," + (Static320.aClass140_86 == null ? -1 : Static320.aClass140_86.method3563()) + " - " + Static405.anInt9105);
																	Static123.method2107(false);
																	return true;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
