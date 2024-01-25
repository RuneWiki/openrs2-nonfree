import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!np;)V")
	public static void method4492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static4.anInt109 == 0 || Static268.anInt4728 == 0) {
			return;
		}
		arg2.method4880(Static108.anInt2137, Static76.anInt1619, Static4.anInt109, Static268.anInt4728);
		arg2.method4867(Static110.anInt2157, Static103.anInt2048, Static4.anInt109, Static268.anInt4728);
		@Pc(38) Class118 local38 = arg2.method4950();
		local38.method2663(Static226.anInt3991, Static383.anInt6417, Static162.anInt2897, Static175.anInt3064, Static50.anInt1079, Static170.anInt2978);
		arg2.method4904(local38);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static89.aClass7Array4 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(58) int local58 = arg2.method4868();
			local67 = local58 * (arg1 - Static108.anInt2137) / Static4.anInt109;
			local76 = local58 * (arg0 - Static76.anInt1619) / Static268.anInt4728;
			local79 = arg2.method4932();
			local88 = (arg1 - Static108.anInt2137) * local79 / Static4.anInt109;
			local97 = (arg0 - Static76.anInt1619) * local79 / Static268.anInt4728;
			local112 = new int[] { local67, local76, local58 };
			local38.method2667(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local38.method2667(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			@Pc(162) int local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(175) int local175 = (int) (local135 * (float) local144 + (float) local112[0]);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local112[2] + (float) local162 * local135);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && Static12.anInt161 > local179 && local194 < Static44.anInt787) {
					@Pc(211) int local211 = Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73;
					if (local211 < 3 && (Static13.aByteArrayArrayArray17[1][local179][local194] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static89.aClass7Array4[local211].method5638(local175, local190) < (float) local153 * local135 + (float) local112[1]) {
						local53 = (Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() - 1) * 64 + local175 >> 7;
						local55 = Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() * 64 + local190 - 64 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static68.aBoolean81 && (Static122.anInt2309 & 0x40) != 0) {
					@Pc(303) Class62 local303 = Static80.method1338(Static242.anInt4268, Static127.anInt2413);
					if (local303 == null) {
						Static203.method3169();
					} else {
						Static90.method1499(48, -1, local53, local55, 0L, " ->", true, Static208.aString38, false, Static158.anInt2845);
					}
				} else {
					if (Static121.aClass63_2 == Static340.aClass63_3) {
						Static90.method1499(44, -1, local53, local55, 0L, "", true, Static35.aClass57_17.method1122(Static66.anInt1307), false, -1);
					}
					Static90.method1499(47, -1, local53, local55, 0L, "", true, Static32.aString10, false, -1);
				}
			}
		}
		@Pc(361) Class22 local361 = Static2.aClass22_1;
		for (@Pc(374) Class12_Sub7 local374 = (Class12_Sub7) local361.method291(); local374 != null; local374 = (Class12_Sub7) local361.method292()) {
			if (Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 == local374.anInt4980 && local374.method4491(arg1, arg2, arg0)) {
				@Pc(496) int local496;
				if (local374.aClass28_1 instanceof Class28_Sub1_Sub1_Sub2) {
					@Pc(396) Class28_Sub1_Sub1_Sub2 local396 = (Class28_Sub1_Sub1_Sub2) local374.aClass28_1;
					local67 = local396.method4009();
					if ((local67 & 0x1) == 0 && (local396.anInt5774 & 0x7F) == 0 && (local396.anInt5766 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local396.anInt5774 & 0x7F) == 64 && (local396.anInt5766 & 0x7F) == 64) {
						local76 = local396.anInt5774 - (local396.method4009() - 1) * 64;
						local79 = local396.anInt5766 + 64 - local396.method4009() * 64;
						@Pc(508) int local508;
						for (local88 = 0; local88 < Static23.anInt305; local88++) {
							@Pc(470) Class28_Sub1_Sub1_Sub1 local470 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local88]];
							if (local470 != null && Static76.anInt1617 != local470.anInt4337 && local470.aBoolean339) {
								local496 = local470.anInt5774 - (local470.aClass61_1.anInt1467 - 1) * 64;
								local508 = local470.anInt5766 - (local470.aClass61_1.anInt1467 - 1) * 64;
								if (local496 >= local76 && local470.aClass61_1.anInt1467 <= local396.method4009() - (local496 - local76 >> 7) && local79 <= local508 && local470.aClass61_1.anInt1467 <= local396.method4009() - (local508 - local79 >> 7)) {
									Static308.method4745(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 != local374.anInt4980, local470);
									local470.anInt4337 = Static76.anInt1617;
								}
							}
						}
						local97 = Static366.anInt4870;
						local112 = Static3.anIntArray9;
						for (local508 = 0; local508 < local97; local508++) {
							@Pc(578) Class28_Sub1_Sub1_Sub2 local578 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local112[local508]];
							if (local578 != null && Static76.anInt1617 != local578.anInt4337 && local578 != local396 && local578.aBoolean339) {
								local144 = local578.anInt5774 - (local578.method4009() - 1) * 64;
								local153 = local578.anInt5766 + 64 - local578.method4009() * 64;
								if (local144 >= local76 && local578.method4009() <= local396.method4009() - (local144 - local76 >> 7) && local153 >= local79 && local578.method4009() <= local396.method4009() - (local153 - local79 >> 7)) {
									Static59.method1065(local374.anInt4980 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local578);
									local578.anInt4337 = Static76.anInt1617;
								}
							}
						}
					}
					if (local396.anInt4337 == Static76.anInt1617) {
						continue;
					}
					Static59.method1065(local374.anInt4980 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local396);
					local396.anInt4337 = Static76.anInt1617;
				}
				if (local374.aClass28_1 instanceof Class28_Sub1_Sub1_Sub1) {
					@Pc(712) Class28_Sub1_Sub1_Sub1 local712 = (Class28_Sub1_Sub1_Sub1) local374.aClass28_1;
					if (local712.aClass61_1 != null) {
						if ((local712.aClass61_1.anInt1467 & 0x1) == 0 && (local712.anInt5774 & 0x7F) == 0 && (local712.anInt5766 & 0x7F) == 0 || (local712.aClass61_1.anInt1467 & 0x1) == 1 && (local712.anInt5774 & 0x7F) == 64 && (local712.anInt5766 & 0x7F) == 64) {
							local67 = local712.anInt5774 - (local712.aClass61_1.anInt1467 - 1) * 64;
							local76 = local712.anInt5766 - (local712.aClass61_1.anInt1467 - 1) * 64;
							for (local79 = 0; local79 < Static23.anInt305; local79++) {
								@Pc(792) Class28_Sub1_Sub1_Sub1 local792 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local79]];
								if (local792 != null && local792.anInt4337 != Static76.anInt1617 && local712 != local792 && local792.aBoolean339) {
									local97 = local792.anInt5774 + 64 - local792.aClass61_1.anInt1467 * 64;
									local496 = local792.anInt5766 - (local792.aClass61_1.anInt1467 - 1) * 64;
									if (local97 >= local67 && local792.aClass61_1.anInt1467 <= local712.aClass61_1.anInt1467 - (local97 - local67 >> 7) && local496 >= local76 && local712.aClass61_1.anInt1467 - (local496 - local76 >> 7) >= local792.aClass61_1.anInt1467) {
										Static308.method4745(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 != local374.anInt4980, local792);
										local792.anInt4337 = Static76.anInt1617;
									}
								}
							}
							local88 = Static366.anInt4870;
							@Pc(896) int[] local896 = Static3.anIntArray9;
							for (local496 = 0; local496 < local88; local496++) {
								@Pc(906) Class28_Sub1_Sub1_Sub2 local906 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local896[local496]];
								if (local906 != null && Static76.anInt1617 != local906.anInt4337 && local906.aBoolean339) {
									@Pc(933) int local933 = local906.anInt5774 + 64 - local906.method4009() * 64;
									local144 = local906.anInt5766 + 64 - local906.method4009() * 64;
									if (local933 >= local67 && local906.method4009() <= local712.aClass61_1.anInt1467 - (local933 - local67 >> 7) && local144 >= local76 && local906.method4009() <= local712.aClass61_1.anInt1467 - (local144 - local76 >> 7)) {
										Static59.method1065(local374.anInt4980 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local906);
										local906.anInt4337 = Static76.anInt1617;
									}
								}
							}
						}
						if (local712.anInt4337 == Static76.anInt1617) {
							continue;
						}
						Static308.method4745(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 != local374.anInt4980, local712);
						local712.anInt4337 = Static76.anInt1617;
					}
				}
				if (local374.aClass28_1 instanceof Class28_Sub5_Sub1) {
					@Pc(1059) Class3_Sub16 local1059 = (Class3_Sub16) Static384.aClass44_39.method942((long) (local374.anInt4979 | local374.anInt4981 << 14 | local374.anInt4980 << 28));
					if (local1059 != null) {
						for (@Pc(1067) Class3_Sub40 local1067 = (Class3_Sub40) local1059.aClass138_15.method3055(); local1067 != null; local1067 = (Class3_Sub40) local1059.aClass138_15.method3057()) {
							@Pc(1075) Class51 local1075 = Static176.aClass78_3.method1641(local1067.anInt6017);
							if (!Static68.aBoolean81) {
								if (local374.anInt4980 == Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73) {
									@Pc(1089) String[] local1089 = local1075.aStringArray5;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1089 != null && local1089[local88] != null) {
											@Pc(1101) byte local1101 = 0;
											local496 = Static30.anInt546;
											if (local88 == 0) {
												local1101 = 57;
											}
											if (local88 == 1) {
												local1101 = 17;
											}
											if (local88 == 2) {
												local1101 = 50;
											}
											if (local88 == 3) {
												local1101 = 51;
											}
											if (local88 == 4) {
												local1101 = 13;
											}
											if (local88 == local1075.anInt1194) {
												local496 = local1075.anInt1188;
											}
											if (local1075.anInt1153 == local88) {
												local496 = local1075.anInt1190;
											}
											Static90.method1499(local1101, -1, local374.anInt4979, local374.anInt4981, (long) local1067.anInt6017, "<col=ff9040>" + local1075.aString13, true, local1089[local88], false, local496);
										}
									}
								}
								Static90.method1499(1008, -1, local374.anInt4979, local374.anInt4981, (long) local1067.anInt6017, "<col=ff9040>" + local1075.aString13, true, Static279.aClass57_90.method1122(Static66.anInt1307), local374.anInt4980 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, Static185.anInt3278);
							} else if (local374.anInt4980 == Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73) {
								@Pc(1243) Class104 local1243 = Static13.anInt5215 == -1 ? null : Static255.aClass187_2.method4279(Static13.anInt5215);
								if ((Static122.anInt2309 & 0x1) != 0 && (local1243 == null || local1075.method1017(Static13.anInt5215, local1243.anInt2631) != local1243.anInt2631)) {
									Static90.method1499(5, -1, local374.anInt4979, local374.anInt4981, (long) local1067.anInt6017, Static356.aString8 + " -> <col=ff9040>" + local1075.aString13, true, Static208.aString38, false, Static158.anInt2845);
								}
							}
						}
					}
				}
				if (local374.aClass28_1 instanceof Interface3) {
					@Pc(1311) Interface3 local1311 = (Interface3) local374.aClass28_1;
					@Pc(1318) Class60 local1318 = Static97.aClass217_4.method5007(local1311.method5420());
					if (local1318.anIntArray134 != null) {
						local1318 = local1318.method1191(Static331.aClass115_1);
					}
					if (local1318 != null) {
						if (!Static68.aBoolean81) {
							if (local374.anInt4980 == Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73) {
								@Pc(1342) String[] local1342 = local1318.aStringArray8;
								if (local1342 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1342[local79] != null) {
											@Pc(1354) short local1354 = 0;
											local97 = Static30.anInt546;
											if (local79 == 0) {
												local1354 = 60;
											}
											if (local79 == 1) {
												local1354 = 19;
											}
											if (local79 == 2) {
												local1354 = 21;
											}
											if (local79 == 3) {
												local1354 = 25;
											}
											if (local79 == 4) {
												local1354 = 1003;
											}
											if (local1318.anInt1409 == local79) {
												local97 = local1318.anInt1416;
											}
											if (local79 == local1318.anInt1410) {
												local97 = local1318.anInt1423;
											}
											Static90.method1499(local1354, -1, local374.anInt4979, local374.anInt4981, Static335.method5116(local374.anInt4981, local1311, local374.anInt4979), "<col=00ffff>" + local1318.aString16, true, local1342[local79], false, local97);
										}
									}
								}
							}
							Static90.method1499(1007, -1, local374.anInt4979, local374.anInt4981, (long) local1318.anInt1402, "<col=00ffff>" + local1318.aString16, true, Static279.aClass57_90.method1122(Static66.anInt1307), local374.anInt4980 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, Static185.anInt3278);
						} else if (Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 == local374.anInt4980) {
							@Pc(1493) Class104 local1493 = Static13.anInt5215 == -1 ? null : Static255.aClass187_2.method4279(Static13.anInt5215);
							if ((Static122.anInt2309 & 0x4) != 0 && (local1493 == null || local1318.method1193(local1493.anInt2631, Static13.anInt5215) != local1493.anInt2631)) {
								Static90.method1499(49, -1, local374.anInt4979, local374.anInt4981, Static335.method5116(local374.anInt4981, local1311, local374.anInt4979), Static356.aString8 + " -> <col=00ffff>" + local1318.aString16, true, Static208.aString38, false, Static158.anInt2845);
							}
						}
					}
				}
			}
		}
	}
}
