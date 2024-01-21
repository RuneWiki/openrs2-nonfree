import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!i;")
	public static Class29 aClass29_29 = new Class29(260);

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "[I")
	public static int[] anIntArray121 = new int[500];

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!va;")
	private static Class61 aClass61_448 = Static88.method1421("Choose Option");

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lclient!va;")
	public static Class61 aClass61_449 = aClass61_448;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][13][13];

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
	public static final boolean aBoolean50 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public static void method630() {
		Static65.method949(false, 10, 0, null);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method632() {
		Static55.aClass10_Sub10_Sub1_4.method1162();
		@Pc(15) int local15 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = Static55.aClass10_Sub10_Sub1_4.method1171(2);
		if (local23 == 0) {
			Static12.anIntArray46[Static76.anInt2030++] = 2047;
			return;
		}
		@Pc(44) int local44;
		@Pc(54) int local54;
		if (local23 == 1) {
			local44 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
			Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.method920(local44, false);
			local54 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			if (local54 == 1) {
				Static12.anIntArray46[Static76.anInt2030++] = 2047;
			}
			return;
		}
		@Pc(100) int local100;
		if (local23 == 2) {
			local44 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
			Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.method920(local44, true);
			local54 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
			Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.method920(local54, true);
			local100 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			if (local100 == 1) {
				Static12.anIntArray46[Static76.anInt2030++] = 2047;
			}
		} else if (local23 == 3) {
			local44 = Static55.aClass10_Sub10_Sub1_4.method1171(7);
			local54 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			if (local54 == 1) {
				Static12.anIntArray46[Static76.anInt2030++] = 2047;
			}
			local100 = Static55.aClass10_Sub10_Sub1_4.method1171(7);
			@Pc(152) int local152 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			Static101.anInt2582 = Static55.aClass10_Sub10_Sub1_4.method1171(2);
			Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.method928(local100, local152 == 1, local44);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BB)I")
	public static int method633(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static78.method1233(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ed;IB)V")
	public static void method634(@OriginalArg(0) Class10_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static50.method784(arg1, arg0.anInt1649, arg0.anInt1654);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)Z")
	public static boolean method635(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static29.anIntArray96[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 17;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIBII)Z")
	public static boolean method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static25.method491(arg5)) {
			return false;
		}
		Static45.method1530(arg4, arg7, arg1, arg6);
		@Pc(23) boolean local23 = true;
		@Pc(27) Class10_Sub1_Sub4[] local27 = Static104.aClass10_Sub1_Sub4ArrayArray1[arg5];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Class10_Sub1_Sub4 local35 = local27[local29];
			if (local35 != null && arg2 == local35.anInt553) {
				if (local35.anInt600 > 0) {
					Static30.method553(local35);
				}
				@Pc(54) int local54 = local35.anInt594 + arg4;
				@Pc(63) int local63 = local35.anInt592 + arg7 - arg0;
				if (local35.anInt577 == 0) {
					if (local35.aBoolean29 && !Static50.method781(local29, arg3)) {
						continue;
					}
					if (local35.anInt575 - local35.anInt557 < local35.anInt579) {
						local35.anInt579 = local35.anInt575 - local35.anInt557;
					}
					if (local35.anInt579 < 0) {
						local35.anInt579 = 0;
					}
					local23 &= method636(local35.anInt579, local54 + local35.anInt564, local29, arg3, local54, arg5, local63 + local35.anInt557, local63);
					Static45.method1530(arg4, arg7, arg1, arg6);
					if (local35.anInt557 < local35.anInt575) {
						Static51.method788(local63, local35.anInt575, local35.anInt557, local35.anInt579, local54 + local35.anInt564);
					}
				}
				if (local35.anInt577 != 1) {
					@Pc(161) int local161;
					@Pc(165) int local165;
					@Pc(188) int local188;
					@Pc(244) int local244;
					@Pc(251) int local251;
					@Pc(289) int local289;
					@Pc(159) int local159;
					@Pc(242) int local242;
					if (local35.anInt577 == 2) {
						local159 = 0;
						for (local161 = 0; local161 < local35.anInt557; local161++) {
							for (local165 = 0; local165 < local35.anInt564; local165++) {
								@Pc(178) int local178 = local63 + (local35.anInt572 + 32) * local161;
								local188 = local54 + (local35.anInt583 + 32) * local165;
								if (local159 < 20) {
									local188 += local35.anIntArray68[local159];
									local178 += local35.anIntArray69[local159];
								}
								if (local35.anIntArray63[local159] > 0) {
									local242 = 0;
									local244 = 0;
									local251 = local35.anIntArray63[local159] - 1;
									if (local188 > Static45.anInt2474 - 32 && Static45.anInt2472 > local188 && local178 > Static45.anInt2473 - 32 && local178 < Static45.anInt2470 || Static74.anInt1876 != 0 && Static48.anInt1330 == local159) {
										local289 = 0;
										if (Static94.anInt2408 == 1 && local159 == Static23.anInt761 && Static11.anInt323 == local29 + (arg5 << 16)) {
											local289 = 16777215;
										}
										@Pc(315) Class10_Sub1_Sub1_Sub1 local315 = Static39.method229(local35.anIntArray65[local159], local289, local251);
										if (local315 == null) {
											local23 = false;
										} else {
											if (Static74.anInt1876 != 0 && local159 == Static48.anInt1330 && Static103.anInt993 == (arg5 << 16) + local29) {
												local244 = Static17.anInt597 - Static105.anInt2626;
												if (local244 < 5 && local244 > -5) {
													local244 = 0;
												}
												local242 = Static28.anInt889 - Static37.anInt1052;
												if (local242 < 5 && local242 > -5) {
													local242 = 0;
												}
												if (Static64.anInt1734 < 5) {
													local242 = 0;
													local244 = 0;
												}
												local315.method150(local242 + local188, local244 + local178);
												if (arg2 != -1) {
													@Pc(424) Class10_Sub1_Sub4 local424 = local27[arg2];
													@Pc(449) int local449;
													if (Static45.anInt2473 > local178 + local244 && local424.anInt579 > 0) {
														local449 = Static106.anInt2692 * (Static45.anInt2473 - local244 - local178) / 3;
														if (local449 > Static106.anInt2692 * 10) {
															local449 = Static106.anInt2692 * 10;
														}
														if (local424.anInt579 < local449) {
															local449 = local424.anInt579;
														}
														local424.anInt579 -= local449;
														Static105.anInt2626 += local449;
													}
													if (local244 + local178 + 32 > Static45.anInt2470 && local424.anInt575 - local424.anInt557 > local424.anInt579) {
														local449 = Static106.anInt2692 * (local244 + local178 + 32 - Static45.anInt2470) / 3;
														if (local449 > Static106.anInt2692 * 10) {
															local449 = Static106.anInt2692 * 10;
														}
														if (local449 > local424.anInt575 - local424.anInt557 - local424.anInt579) {
															local449 = local424.anInt575 - local424.anInt579 - local424.anInt557;
														}
														Static105.anInt2626 -= local449;
														local424.anInt579 += local449;
													}
												}
											} else if (Static104.anInt2625 != 0 && local159 == Static55.anInt1491 && local29 + (arg5 << 16) == Static62.anInt1710) {
												local315.method150(local188, local178);
											} else {
												local315.method142(local188, local178);
											}
											if (local315.anInt174 == 33 || local35.anIntArray65[local159] != 1) {
												@Pc(573) int local573 = local35.anIntArray65[local159];
												Static8.aClass10_Sub1_Sub1_Sub4_1.method1548(Static54.method805(local573), local242 + local188 + 1, local244 + 10 + local178, 0);
												Static8.aClass10_Sub1_Sub1_Sub4_1.method1548(Static54.method805(local573), local188 + local242, local244 + local178 + 9, 16776960);
											}
										}
									}
								} else if (local35.anIntArray64 != null && local159 < 20) {
									@Pc(226) Class10_Sub1_Sub1_Sub1 local226 = local35.method401(local159);
									if (local226 != null) {
										local226.method142(local188, local178);
									} else if (Static12.aBoolean13) {
										local23 = false;
									}
								}
								local159++;
							}
						}
					} else if (local35.anInt577 == 3) {
						if (Static40.method641(local35)) {
							local159 = local35.anInt593;
							if (Static50.method781(local29, arg3) && local35.anInt591 != 0) {
								local159 = local35.anInt591;
							}
						} else {
							local159 = local35.anInt605;
							if (Static50.method781(local29, arg3) && local35.anInt574 != 0) {
								local159 = local35.anInt574;
							}
						}
						if (local35.anInt563 == 0) {
							if (local35.aBoolean31) {
								Static45.method1531(local54, local63, local35.anInt564, local35.anInt557, local159);
							} else {
								Static45.method1523(local54, local63, local35.anInt564, local35.anInt557, local159);
							}
						} else if (local35.aBoolean31) {
							Static45.method1534(local54, local63, local35.anInt564, local35.anInt557, local159, 256 - (local35.anInt563 & 0xFF));
						} else {
							Static45.method1524(local54, local63, local35.anInt564, local35.anInt557, local159, 256 - (local35.anInt563 & 0xFF));
						}
					} else {
						@Pc(742) Class10_Sub1_Sub1_Sub4 local742;
						if (local35.anInt577 == 4) {
							local742 = Static107.aClass10_Sub1_Sub1_Sub4Array5[local35.anInt588];
							@Pc(745) Class61 local745 = local35.aClass61_192;
							if (Static40.method641(local35)) {
								local161 = local35.anInt593;
								if (Static50.method781(local29, arg3) && local35.anInt591 != 0) {
									local161 = local35.anInt591;
								}
								if (local35.aClass61_195.method1596() > 0) {
									local745 = local35.aClass61_195;
								}
							} else {
								local161 = local35.anInt605;
								if (Static50.method781(local29, arg3) && local35.anInt574 != 0) {
									local161 = local35.anInt574;
								}
							}
							if (local35.anInt581 == 6 && Static104.aBoolean120) {
								local161 = local35.anInt605;
								local745 = Static104.aClass61_1061;
							}
							if (Static45.anInt2475 == 479) {
								if (local161 == 16776960) {
									local161 = 255;
								}
								if (local161 == 49152) {
									local161 = 16777215;
								}
							}
							local745 = Static99.method1576(local35, local745);
							local742.method1546(local745, local54, local63, local35.anInt564, local35.anInt557, local161, local35.aBoolean26, local35.anInt565, local35.anInt601, local35.anInt561);
						} else if (local35.anInt577 == 5) {
							@Pc(860) Class10_Sub1_Sub1_Sub1 local860 = local35.method395(Static40.method641(local35));
							if (local860 != null) {
								local860.method142(local54, local63);
							} else if (Static12.aBoolean13) {
								local23 = false;
							}
						} else if (local35.anInt577 == 6) {
							Static68.method994(local35.anInt564 / 2 + local54, local35.anInt557 / 2 + local63);
							local159 = local35.anInt576 * Class10_Sub1_Sub1_Sub3.anIntArray201[local35.anInt582] >> 16;
							local161 = local35.anInt576 * Class10_Sub1_Sub1_Sub3.anIntArray203[local35.anInt582] >> 16;
							@Pc(917) boolean local917 = Static40.method641(local35);
							if (local917) {
								local188 = local35.anInt570;
							} else {
								local188 = local35.anInt578;
							}
							@Pc(941) Class10_Sub1_Sub5_Sub4 local941;
							if (local35.anInt560 == 5) {
								local941 = Static80.aClass44_2.method960(-1, null, null, -1);
							} else if (local188 == -1) {
								local941 = local35.method397(local917, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass44_1, -1, null);
								if (local941 == null && Static12.aBoolean13) {
									local23 = false;
								}
							} else {
								@Pc(952) Class10_Sub1_Sub6 local952 = Static5.method33(local188);
								local941 = local35.method397(local917, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass44_1, local35.anInt571, local952);
								if (local941 == null && Static12.aBoolean13) {
									local23 = false;
								}
							}
							if (local941 != null) {
								local941.method1331(local35.anInt566, 0, local35.anInt582, 0, local159, local161);
							}
							Static68.method1006();
						} else {
							if (local35.anInt577 == 7) {
								local742 = Static107.aClass10_Sub1_Sub1_Sub4Array5[local35.anInt588];
								local161 = 0;
								for (local165 = 0; local165 < local35.anInt557; local165++) {
									for (local188 = 0; local188 < local35.anInt564; local188++) {
										if (local35.anIntArray63[local161] > 0) {
											@Pc(1038) Class10_Sub1_Sub15 local1038 = Static94.method1491(local35.anIntArray63[local161] - 1);
											@Pc(1041) Class61 local1041 = local1038.aClass61_1029;
											if (local1041 == null) {
												local1041 = Static71.aClass61_761;
											}
											if (local1038.aBoolean116 || local35.anIntArray65[local161] != 1) {
												local1041 = Static93.method1156(new Class61[] { local1041, Static76.aClass61_813, Static42.method1468(local35.anIntArray65[local161]) });
											}
											local244 = local54 + (local35.anInt583 + 115) * local188;
											local251 = local63 + (local35.anInt572 + 12) * local165;
											if (local35.anInt565 == 0) {
												local742.method1543(local1041, local244 + local35.anInt564 / 2, local251, local35.anInt605, local35.aBoolean26);
											} else {
												local742.method1554(local1041, local244, local251, local35.anInt605, local35.aBoolean26);
											}
										}
										local161++;
									}
								}
							}
							if (local35.anInt577 == 8 && Static5.method34(local29, arg3) && Static51.anInt1421 == Static66.anInt1755) {
								local159 = 0;
								local161 = 0;
								@Pc(1167) Class10_Sub1_Sub1_Sub4 local1167 = Static99.aClass10_Sub1_Sub1_Sub4_4;
								@Pc(1170) Class61 local1170 = local35.aClass61_192;
								local1170 = Static99.method1576(local35, local1170);
								@Pc(1193) Class61 local1193;
								while (local1170.method1596() > 0) {
									local242 = local1170.method1604(Static12.aClass61_90);
									if (local242 == -1) {
										local1193 = local1170;
										local1170 = Static15.aClass61_166;
									} else {
										local1193 = local1170.method1611(local242, 0);
										local1170 = local1170.method1619(local242 + 2);
									}
									local244 = local1167.method1541(local1193);
									local161 += local1167.anInt2476 + 1;
									if (local159 < local244) {
										local159 = local244;
									}
								}
								local161 += 7;
								local159 += 6;
								local244 = local63 + local35.anInt557 + 5;
								local242 = local35.anInt564 + local54 - local159 - 5;
								if (local54 + 5 > local242) {
									local242 = local54 + 5;
								}
								if (local244 + local161 > arg6) {
									local244 = arg6 - local161;
								}
								if (arg1 < local159 + local242) {
									local242 = arg1 - local159;
								}
								Static45.method1531(local242, local244, local159, local161, 16777120);
								Static45.method1523(local242, local244, local159, local161, 0);
								local1170 = local35.aClass61_192;
								local251 = local1167.anInt2476 + local244 + 2;
								local1170 = Static99.method1576(local35, local1170);
								while (local1170.method1596() > 0) {
									local289 = local1170.method1604(Static12.aClass61_90);
									if (local289 == -1) {
										local1193 = local1170;
										local1170 = Static15.aClass61_166;
									} else {
										local1193 = local1170.method1611(local289, 0);
										local1170 = local1170.method1619(local289 + 2);
									}
									local1167.method1554(local1193, local242 + 3, local251, 0, false);
									local251 += local1167.anInt2476 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZLclient!s;I)Z")
	public static boolean method637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class55 arg1) {
		return Static49.method769(arg0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	public static void method638() {
		@Pc(7) int local7 = (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 >> 7) + Static107.anInt2431;
		@Pc(18) int local18 = Static7.anInt80 + (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 >> 7);
		Static18.anInt606 = 0;
		if (local7 >= 3053 && local7 <= 3156 && local18 >= 3056 && local18 <= 3136) {
			Static18.anInt606 = 1;
		}
		if (local7 >= 3072 && local7 <= 3118 && local18 >= 9492 && local18 <= 9535) {
			Static18.anInt606 = 1;
		}
		if (Static18.anInt606 == 1 && local7 >= 3139 && local7 <= 3199 && local18 >= 3008 && local18 <= 3062) {
			Static18.anInt606 = 0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
	public static void method639() {
		aClass61_449 = null;
		aCanvas1 = null;
		anIntArrayArrayArray2 = null;
		anIntArray121 = null;
		aClass29_29 = null;
		aClass61_448 = null;
	}
}
