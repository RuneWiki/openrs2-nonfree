import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_24 = new Class44(64);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2815(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(33) int local33 = arg1 + arg2;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = arg2; local37 < local33; local37++) {
				@Pc(43) String local43 = arg0[local37];
				if (local43 == null) {
					local35 += 4;
				} else {
					local35 += local43.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local35);
			for (@Pc(64) int local64 = arg2; local64 < local33; local64++) {
				@Pc(70) String local70 = arg0[local64];
				if (local70 == null) {
					local62.append("null");
				} else {
					local62.append(local70);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBLclient!eq;I)V")
	public static void method2817(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static303.anInt5375 == 0 || Static308.anInt5415 == 0) {
			return;
		}
		arg1.method5003(Static268.anInt4864, client.lb, Static303.anInt5375, Static308.anInt5415);
		arg1.method5044(Static233.anInt4271, Static61.anInt1696, Static303.anInt5375, Static308.anInt5415);
		@Pc(38) Class5 local38 = arg1.method5057();
		local38.method3833(Static413.anInt7421, Static286.anInt5115, Static59.anInt1662, Static329.anInt5678, Static350.anInt6300, Static255.anInt4644);
		arg1.method5071(local38);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static87.aClass86Array2 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(58) int local58 = arg1.method4991();
			local67 = local58 * (arg0 - Static268.anInt4864) / Static303.anInt5375;
			local76 = local58 * (arg2 - client.lb) / Static308.anInt5415;
			local79 = arg1.method4986();
			local88 = (arg0 - Static268.anInt4864) * local79 / Static303.anInt5375;
			local97 = (arg2 - client.lb) * local79 / Static308.anInt5415;
			local112 = new int[] { local67, local76, local58 };
			local38.method3840(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local38.method3840(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			@Pc(162) int local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local162 * local135 + (float) local112[2]);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && local179 < Static181.anInt3574 && local194 < Static117.anInt2450) {
					@Pc(214) int local214 = Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103;
					if (local214 < 3 && (Static203.aByteArrayArrayArray11[1][local179][local194] & 0x2) != 0) {
						local214++;
					}
					if ((float) Static87.aClass86Array2[local214].method6590(local175, local190) < (float) local112[1] + (float) local153 * local135) {
						local53 = (Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() - 1 << 6) + local175 >> 7;
						local55 = (Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() - 1 << 6) + local190 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static174.aBoolean224 && (Static405.anInt7261 & 0x40) != 0) {
					@Pc(304) Class239 local304 = Static251.method5357(Static190.anInt653, Static363.anInt6463);
					if (local304 == null) {
						Static54.method1224();
					} else {
						Static114.method4751(true, 0L, 50, Static104.aString16, local53, -1, " ->", local55, false, Static67.anInt1750);
					}
				} else {
					if (Static24.aClass36_2 == Static4.aClass36_5) {
						Static114.method4751(true, 0L, 19, Static405.aClass267_98.method6581(Static161.anInt3239), local53, -1, "", local55, false, -1);
					}
					Static114.method4751(true, 0L, 58, Static214.aString30, local53, -1, "", local55, false, Static297.anInt5269);
				}
			}
		}
		@Pc(362) Class111 local362 = Static385.aClass111_8;
		for (@Pc(367) Class57_Sub2 local367 = (Class57_Sub2) local362.method2688(); local367 != null; local367 = (Class57_Sub2) local362.method2690()) {
			if (Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 == local367.anInt2817 && local367.method2361(arg2, arg0, arg1)) {
				@Pc(494) int local494;
				if (local367.aClass3_1 instanceof Class3_Sub2_Sub1_Sub2) {
					@Pc(389) Class3_Sub2_Sub1_Sub2 local389 = (Class3_Sub2_Sub1_Sub2) local367.aClass3_1;
					local67 = local389.method5521();
					if ((local67 & 0x1) == 0 && (local389.anInt7202 & 0x7F) == 0 && (local389.anInt7207 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local389.anInt7202 & 0x7F) == 64 && (local389.anInt7207 & 0x7F) == 64) {
						local76 = local389.anInt7202 - (local389.method5521() - 1 << 6);
						local79 = local389.anInt7207 - (local389.method5521() - 1 << 6);
						@Pc(506) int local506;
						for (local88 = 0; local88 < Static136.anInt2887; local88++) {
							@Pc(467) Class3_Sub2_Sub1_Sub1 local467 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local88]];
							if (local467 != null && Static66.anInt1741 != local467.anInt6552 && local467.aBoolean417) {
								local494 = local467.anInt7202 - (local467.aClass48_1.anInt1752 - 1 << 6);
								local506 = local467.anInt7207 - (local467.aClass48_1.anInt1752 - 1 << 6);
								if (local76 <= local494 && local467.aClass48_1.anInt1752 <= local389.method5521() - (local494 - local76 >> 7) && local506 >= local79 && local467.aClass48_1.anInt1752 <= local389.method5521() - (local506 - local79 >> 7)) {
									Static173.method2866(local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, local467);
									local467.anInt6552 = Static66.anInt1741;
								}
							}
						}
						local97 = Static95.anInt2186;
						local112 = Static178.anIntArray542;
						for (local506 = 0; local506 < local97; local506++) {
							@Pc(578) Class3_Sub2_Sub1_Sub2 local578 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local112[local506]];
							if (local578 != null && Static66.anInt1741 != local578.anInt6552 && local578 != local389 && local578.aBoolean417) {
								local144 = local578.anInt7202 - (local578.method5521() - 1 << 6);
								local153 = local578.anInt7207 - (local578.method5521() - 1 << 6);
								if (local144 >= local76 && local578.method5521() <= local389.method5521() - (local144 - local76 >> 7) && local79 <= local153 && local578.method5521() <= local389.method5521() - (local153 - local79 >> 7)) {
									Static178.method6352(local578, local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103);
									local578.anInt6552 = Static66.anInt1741;
								}
							}
						}
					}
					if (Static66.anInt1741 == local389.anInt6552) {
						continue;
					}
					Static178.method6352(local389, local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103);
					local389.anInt6552 = Static66.anInt1741;
				}
				if (local367.aClass3_1 instanceof Class3_Sub2_Sub1_Sub1) {
					@Pc(722) Class3_Sub2_Sub1_Sub1 local722 = (Class3_Sub2_Sub1_Sub1) local367.aClass3_1;
					if (local722.aClass48_1 != null) {
						if ((local722.aClass48_1.anInt1752 & 0x1) == 0 && (local722.anInt7202 & 0x7F) == 0 && (local722.anInt7207 & 0x7F) == 0 || (local722.aClass48_1.anInt1752 & 0x1) == 1 && (local722.anInt7202 & 0x7F) == 64 && (local722.anInt7207 & 0x7F) == 64) {
							local67 = local722.anInt7202 - (local722.aClass48_1.anInt1752 - 1 << 6);
							local76 = local722.anInt7207 - (local722.aClass48_1.anInt1752 - 1 << 6);
							for (local79 = 0; local79 < Static136.anInt2887; local79++) {
								@Pc(806) Class3_Sub2_Sub1_Sub1 local806 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local79]];
								if (local806 != null && local806.anInt6552 != Static66.anInt1741 && local806 != local722 && local806.aBoolean417) {
									local97 = local806.anInt7202 - (local806.aClass48_1.anInt1752 - 1 << 6);
									local494 = local806.anInt7207 - (local806.aClass48_1.anInt1752 - 1 << 6);
									if (local97 >= local67 && local806.aClass48_1.anInt1752 <= local722.aClass48_1.anInt1752 - (local97 - local67 >> 7) && local76 <= local494 && local806.aClass48_1.anInt1752 <= local722.aClass48_1.anInt1752 - (local494 - local76 >> 7)) {
										Static173.method2866(local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, local806);
										local806.anInt6552 = Static66.anInt1741;
									}
								}
							}
							local88 = Static95.anInt2186;
							@Pc(913) int[] local913 = Static178.anIntArray542;
							for (local494 = 0; local494 < local88; local494++) {
								@Pc(923) Class3_Sub2_Sub1_Sub2 local923 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local913[local494]];
								if (local923 != null && local923.anInt6552 != Static66.anInt1741 && local923.aBoolean417) {
									@Pc(946) int local946 = local923.anInt7202 - (local923.method5521() - 1 << 6);
									local144 = local923.anInt7207 - (local923.method5521() - 1 << 6);
									if (local946 >= local67 && local923.method5521() <= local722.aClass48_1.anInt1752 - (local946 - local67 >> 7) && local144 >= local76 && local923.method5521() <= local722.aClass48_1.anInt1752 - (local144 - local76 >> 7)) {
										Static178.method6352(local923, local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103);
										local923.anInt6552 = Static66.anInt1741;
									}
								}
							}
						}
						if (Static66.anInt1741 == local722.anInt6552) {
							continue;
						}
						Static173.method2866(local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, local722);
						local722.anInt6552 = Static66.anInt1741;
					}
				}
				if (local367.aClass3_1 instanceof Class3_Sub4_Sub1) {
					@Pc(1069) Class6_Sub22 local1069 = (Class6_Sub22) Static165.aClass74_15.method1883((long) (local367.anInt2817 << 28 | local367.anInt2816 << 14 | local367.anInt2815));
					if (local1069 != null) {
						for (@Pc(1079) Class6_Sub43 local1079 = (Class6_Sub43) local1069.aClass244_20.method5974(); local1079 != null; local1079 = (Class6_Sub43) local1069.aClass244_20.method5978()) {
							@Pc(1087) Class4 local1087 = Static380.aClass231_2.method5648(local1079.anInt7502);
							if (!Static174.aBoolean224) {
								if (local367.anInt2817 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
									@Pc(1169) String[] local1169 = local1087.aStringArray1;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1169 != null && local1169[local88] != null) {
											@Pc(1181) byte local1181 = 0;
											if (local88 == 0) {
												local1181 = 6;
											}
											local494 = Static256.anInt4669;
											if (local88 == 1) {
												local1181 = 15;
											}
											if (local88 == 2) {
												local1181 = 11;
											}
											if (local88 == 3) {
												local1181 = 16;
											}
											if (local1087.anInt88 == local88) {
												local494 = local1087.anInt111;
											}
											if (local88 == 4) {
												local1181 = 25;
											}
											if (local88 == local1087.anInt101) {
												local494 = local1087.anInt93;
											}
											Static114.method4751(true, (long) local1079.anInt7502, local1181, local1169[local88], local367.anInt2815, -1, "<col=ff9040>" + local1087.aString1, local367.anInt2816, false, local494);
										}
									}
								}
								Static114.method4751(true, (long) local1079.anInt7502, 1004, Static200.aClass267_52.method6581(Static161.anInt3239), local367.anInt2815, -1, "<col=ff9040>" + local1087.aString1, local367.anInt2816, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 != local367.anInt2817, Static90.anInt2075);
							} else if (local367.anInt2817 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
								@Pc(1108) Class171 local1108 = Static327.anInt5631 == -1 ? null : Static80.aClass181_1.method4294(Static327.anInt5631);
								if ((Static405.anInt7261 & 0x1) != 0 && (local1108 == null || local1087.method63(Static327.anInt5631, local1108.anInt4865) != local1108.anInt4865)) {
									Static114.method4751(true, (long) local1079.anInt7502, 45, Static104.aString16, local367.anInt2815, -1, Static289.aString36 + " -> <col=ff9040>" + local1087.aString1, local367.anInt2816, false, Static67.anInt1750);
								}
							}
						}
					}
				}
				if (local367.aClass3_1 instanceof Interface10) {
					@Pc(1316) Interface10 local1316 = (Interface10) local367.aClass3_1;
					@Pc(1323) Class106 local1323 = Static448.aClass104_4.method2616(local1316.method5325());
					if (local1323.anIntArray188 != null) {
						local1323 = local1323.method2625(Static393.aClass207_1);
					}
					if (local1323 != null) {
						if (!Static174.aBoolean224) {
							if (local367.anInt2817 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
								@Pc(1347) String[] local1347 = local1323.aStringArray17;
								if (local1347 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1347[local79] != null) {
											@Pc(1359) short local1359 = 0;
											local97 = Static256.anInt4669;
											if (local79 == 0) {
												local1359 = 3;
											}
											if (local79 == 1) {
												local1359 = 17;
											}
											if (local79 == 2) {
												local1359 = 12;
											}
											if (local79 == 3) {
												local1359 = 49;
											}
											if (local79 == local1323.anInt3182) {
												local97 = local1323.anInt3166;
											}
											if (local79 == 4) {
												local1359 = 1010;
											}
											if (local79 == local1323.anInt3195) {
												local97 = local1323.anInt3174;
											}
											Static114.method4751(true, Static174.method2881(local1316, local367.anInt2816, local367.anInt2815), local1359, local1347[local79], local367.anInt2815, -1, "<col=00ffff>" + local1323.aString22, local367.anInt2816, false, local97);
										}
									}
								}
							}
							Static114.method4751(true, (long) local1323.anInt3167, 1002, Static200.aClass267_52.method6581(Static161.anInt3239), local367.anInt2815, -1, "<col=00ffff>" + local1323.aString22, local367.anInt2816, local367.anInt2817 != Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, Static90.anInt2075);
						} else if (local367.anInt2817 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
							@Pc(1496) Class171 local1496 = Static327.anInt5631 == -1 ? null : Static80.aClass181_1.method4294(Static327.anInt5631);
							if ((Static405.anInt7261 & 0x4) != 0 && (local1496 == null || local1323.method2624(local1496.anInt4865, Static327.anInt5631) != local1496.anInt4865)) {
								Static114.method4751(true, Static174.method2881(local1316, local367.anInt2816, local367.anInt2815), 23, Static104.aString16, local367.anInt2815, -1, Static289.aString36 + " -> <col=00ffff>" + local1323.aString22, local367.anInt2816, false, Static67.anInt1750);
							}
						}
					}
				}
			}
		}
	}
}
