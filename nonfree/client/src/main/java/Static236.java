import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	public static int anInt4206;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
	public static final int[] anIntArray447 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[I[I[ILclient!oa;)V")
	public static void method3896(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class28_Sub1_Sub1_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) int local14 = arg0[local3];
			@Pc(18) int local18 = arg2[local3];
			@Pc(22) int local22 = arg1[local3];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg3.aClass81Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg3.aClass81Array3[local24] = null;
					} else {
						@Pc(41) Class177 local41 = Static176.aClass43_2.method930(local14);
						@Pc(44) int local44 = local41.anInt4500;
						@Pc(49) Class81 local49 = arg3.aClass81Array3[local24];
						if (local49 != null) {
							if (local14 == local49.anInt2042) {
								if (local44 == 0) {
									local49 = arg3.aClass81Array3[local24] = null;
								} else if (local44 == 1) {
									local49.anInt2045 = 0;
									local49.anInt2046 = 1;
									local49.anInt2043 = local22;
									local49.anInt2040 = 0;
									local49.anInt2041 = 0;
									Static351.method2911(arg3.aByte73, arg3.anInt5774, 0, local41, arg3.anInt5766, arg3 == Static226.aClass28_Sub1_Sub1_Sub2_2);
								} else if (local44 == 2) {
									local49.anInt2040 = 0;
								}
							} else if (local41.anInt4520 >= Static176.aClass43_2.method930(local49.anInt2042).anInt4520) {
								local49 = arg3.aClass81Array3[local24] = null;
							}
						}
						if (local49 == null) {
							local49 = arg3.aClass81Array3[local24] = new Class81();
							local49.anInt2041 = 0;
							local49.anInt2043 = local22;
							local49.anInt2040 = 0;
							local49.anInt2042 = local14;
							local49.anInt2046 = 1;
							local49.anInt2045 = 0;
							Static351.method2911(arg3.aByte73, arg3.anInt5774, 0, local41, arg3.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg3);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIZ)V")
	public static void method3898(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static78.anInt1627--;
			if (Static78.anInt1627 == 0) {
				Static145.anIntArray290 = null;
			}
		}
		Static329.anInt5571--;
		if (Static329.anInt5571 == 0) {
			Static206.anIntArray393 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
	public static void method3899(@OriginalArg(1) boolean arg0) {
		Static99.aBoolean149 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(36) boolean local36;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (!Static99.aBoolean149) {
			local17 = Static26.aClass3_Sub5_Sub1_2.method2778();
			local21 = Static26.aClass3_Sub5_Sub1_2.method2767();
			local25 = Static26.aClass3_Sub5_Sub1_2.method2735();
			local36 = Static26.aClass3_Sub5_Sub1_2.method2773() == 1;
			Static52.method947(local25);
			local46 = (Static203.anInt3616 - Static26.aClass3_Sub5_Sub1_2.anInt3121) / 16;
			Static191.anIntArrayArray36 = new int[local46][4];
			for (local50 = 0; local50 < local46; local50++) {
				for (local54 = 0; local54 < 4; local54++) {
					Static191.anIntArrayArray36[local50][local54] = Static26.aClass3_Sub5_Sub1_2.method2726();
				}
			}
			Static282.aByteArrayArray18 = null;
			Static44.anIntArray80 = new int[local46];
			Static219.anIntArray421 = null;
			Static146.anIntArray291 = new int[local46];
			Static56.aByteArrayArray5 = new byte[local46][];
			Static185.aByteArrayArray9 = new byte[local46][];
			Static49.aByteArrayArray20 = new byte[local46][];
			Static91.anIntArray351 = new int[local46];
			Static361.aByteArrayArray22 = new byte[local46][];
			Static220.anIntArray422 = new int[local46];
			Static136.anIntArray273 = new int[local46];
			local46 = 0;
			for (local54 = (local21 - (Static12.anInt161 >> 4)) / 8; local54 <= ((Static12.anInt161 >> 4) + local21) / 8; local54++) {
				for (local61 = (local17 - (Static44.anInt787 >> 4)) / 8; local61 <= (local17 + (Static44.anInt787 >> 4)) / 8; local61++) {
					Static136.anIntArray273[local46] = local61 + (local54 << 8);
					Static91.anIntArray351[local46] = Static179.aClass20_44.method230("m" + local54 + "_" + local61);
					Static44.anIntArray80[local46] = Static179.aClass20_44.method230("l" + local54 + "_" + local61);
					Static146.anIntArray291[local46] = Static179.aClass20_44.method230("um" + local54 + "_" + local61);
					Static220.anIntArray422[local46] = Static179.aClass20_44.method230("ul" + local54 + "_" + local61);
					local46++;
				}
			}
			Static279.method5262(local21, false, local17, local36);
			return;
		}
		local17 = Static26.aClass3_Sub5_Sub1_2.method2747();
		local21 = Static26.aClass3_Sub5_Sub1_2.method2773();
		local25 = Static26.aClass3_Sub5_Sub1_2.method2778();
		local36 = Static26.aClass3_Sub5_Sub1_2.method2735() == 1;
		Static52.method947(local21);
		Static26.aClass3_Sub5_Sub1_2.method854();
		for (local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static12.anInt161 >> 3; local50++) {
				for (local54 = 0; local54 < Static44.anInt787 >> 3; local54++) {
					local61 = Static26.aClass3_Sub5_Sub1_2.method859(1);
					if (local61 == 1) {
						Static81.anIntArrayArrayArray9[local46][local50][local54] = Static26.aClass3_Sub5_Sub1_2.method859(26);
					} else {
						Static81.anIntArrayArrayArray9[local46][local50][local54] = -1;
					}
				}
			}
		}
		Static26.aClass3_Sub5_Sub1_2.method860();
		local50 = (Static203.anInt3616 - Static26.aClass3_Sub5_Sub1_2.anInt3121) / 16;
		Static191.anIntArrayArray36 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static191.anIntArrayArray36[local54][local61] = Static26.aClass3_Sub5_Sub1_2.method2726();
			}
		}
		Static185.aByteArrayArray9 = new byte[local50][];
		Static49.aByteArrayArray20 = new byte[local50][];
		Static91.anIntArray351 = new int[local50];
		Static282.aByteArrayArray18 = null;
		Static146.anIntArray291 = new int[local50];
		Static44.anIntArray80 = new int[local50];
		Static220.anIntArray422 = new int[local50];
		Static219.anIntArray421 = null;
		Static136.anIntArray273 = new int[local50];
		Static361.aByteArrayArray22 = new byte[local50][];
		Static56.aByteArrayArray5 = new byte[local50][];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(193) int local193 = 0; local193 < Static12.anInt161 >> 3; local193++) {
				for (@Pc(197) int local197 = 0; local197 < Static44.anInt787 >> 3; local197++) {
					@Pc(207) int local207 = Static81.anIntArrayArrayArray9[local61][local193][local197];
					if (local207 != -1) {
						@Pc(216) int local216 = local207 >> 14 & 0x3FF;
						@Pc(222) int local222 = local207 >> 3 & 0x7FF;
						@Pc(232) int local232 = (local216 / 8 << 8) + local222 / 8;
						for (@Pc(234) int local234 = 0; local234 < local50; local234++) {
							if (local232 == Static136.anIntArray273[local234]) {
								local232 = -1;
								break;
							}
						}
						if (local232 != -1) {
							Static136.anIntArray273[local50] = local232;
							@Pc(266) int local266 = local232 >> 8 & 0xFF;
							@Pc(270) int local270 = local232 & 0xFF;
							Static91.anIntArray351[local50] = Static179.aClass20_44.method230("m" + local266 + "_" + local270);
							Static44.anIntArray80[local50] = Static179.aClass20_44.method230("l" + local266 + "_" + local270);
							Static146.anIntArray291[local50] = Static179.aClass20_44.method230("um" + local266 + "_" + local270);
							Static220.anIntArray422[local50] = Static179.aClass20_44.method230("ul" + local266 + "_" + local270);
							local50++;
						}
					}
				}
			}
		}
		Static279.method5262(local25, false, local17, local36);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIIIIII)V")
	public static void method3900(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static366.anInt4870;
		Static293.anInt5077 = 0;
		@Pc(11) int[] local11 = Static3.anIntArray9;
		@Pc(199) int local199;
		@Pc(224) int local224;
		@Pc(264) int local264;
		@Pc(441) int local441;
		@Pc(560) int local560;
		@Pc(677) int local677;
		@Pc(326) int local326;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static23.anInt305; local13++) {
			@Pc(17) Class61 local17 = null;
			@Pc(33) Class28_Sub1_Sub1 local33;
			if (local7 <= local13) {
				local33 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local13 - local7]];
				local17 = ((Class28_Sub1_Sub1_Sub1) local33).aClass61_1;
				if (local17.anIntArray142 != null) {
					local17 = local17.method1216(Static331.aClass115_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local11[local13]];
			}
			if (local33.anInt4349 >= 0 && (local33.anInt4332 == Static226.anInt3990 || Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 == local33.aByte73)) {
				Static137.method1434(local33.method4012(), arg1 >> 1, arg2 >> 1, local33);
				if (Static267.anIntArray621[0] >= 0) {
					if (local33.aString49 != null && (local13 >= local7 || Static335.anInt5689 == 0 || Static335.anInt5689 == 3 || Static335.anInt5689 == 1 && Static47.method862(((Class28_Sub1_Sub1_Sub2) local33).aString51)) && Static293.anInt5077 < Static253.anInt4577) {
						Static253.anIntArray506[Static293.anInt5077] = Static366.aClass190_7.method4358(local33.aString49) / 2;
						Static253.anIntArray508[Static293.anInt5077] = Static267.anIntArray621[0];
						Static253.anIntArray507[Static293.anInt5077] = Static267.anIntArray621[1];
						Static253.anIntArray504[Static293.anInt5077] = local33.anInt4334;
						Static253.anIntArray509[Static293.anInt5077] = local33.anInt4346;
						Static253.anIntArray505[Static293.anInt5077] = local33.anInt4318;
						Static253.aStringArray30[Static293.anInt5077] = local33.aString49;
						Static293.anInt5077++;
					}
					@Pc(186) Class110 local186 = Static74.aClass110Array2[0];
					local199 = arg0 + Static267.anIntArray621[1] - Math.max(Static366.aClass190_7.anInt4829, local186.method5090());
					@Pc(214) Class110 local214;
					@Pc(314) int local314;
					if (!local33.aBoolean339 && Static76.anInt1617 < local33.anInt4369) {
						local214 = Static74.aClass110Array2[1];
						if (local33 instanceof Class28_Sub1_Sub1_Sub1) {
							local224 = local17.anInt1456;
							if (local224 == -1) {
								local224 = local33.method4014().anInt683;
							}
						} else {
							local224 = local33.method4014().anInt683;
						}
						if (local224 != -1) {
							@Pc(249) Class110[] local249 = (Class110[]) Static390.aClass139_79.method3076((long) local224);
							if (local249 == null) {
								@Pc(256) Class127[] local256 = Static402.method2809(Static77.aClass20_19, local224);
								if (local256 != null) {
									local249 = new Class110[local256.length];
									for (local264 = 0; local264 < local256.length; local264++) {
										local249[local264] = Static347.aClass155_9.method4869(local256[local264]);
									}
									Static390.aClass139_79.method3070(local249, (long) local224);
								}
							}
							if (local249 != null && local249.length == 2) {
								local186 = local249[0];
								local214 = local249[1];
							}
						}
						local314 = Static267.anIntArray621[0] + arg3 - (local186.method5091() >> 1);
						local186.method5094(local314, local199);
						local326 = local186.method5091() * local33.anInt4360 / 255;
						if (local33.anInt4360 > 0 && local326 < 2) {
							local326 = 2;
						}
						Static347.aClass155_9.method4922(local314, local199, local314 + local326, local186.method5090() + local199);
						local214.method5094(local314, local199);
						Static347.aClass155_9.method4867(arg3, arg0, arg3 + arg1, arg2 + arg0);
					}
					local199 -= 2;
					if (!local33.aBoolean339) {
						if (Static76.anInt1617 < local33.anInt4362) {
							local214 = Static377.aClass110Array16[local33.aBoolean338 ? 2 : 0];
							@Pc(393) Class110 local393 = Static377.aClass110Array16[local33.aBoolean338 ? 3 : 1];
							if (local33 instanceof Class28_Sub1_Sub1_Sub1) {
								local314 = local17.anInt1461;
								if (local314 == -1) {
									local314 = local33.method4014().anInt694;
								}
							} else {
								local314 = local33.method4014().anInt694;
							}
							if (local314 != -1) {
								@Pc(426) Class110[] local426 = (Class110[]) Static252.aClass139_51.method3076((long) local314);
								if (local426 == null) {
									@Pc(433) Class127[] local433 = Static402.method2809(Static77.aClass20_19, local314);
									if (local433 != null) {
										local426 = new Class110[local433.length];
										for (local441 = 0; local441 < local433.length; local441++) {
											local426[local441] = Static347.aClass155_9.method4869(local433[local441]);
										}
										Static252.aClass139_51.method3070(local426, (long) local314);
									}
								}
								if (local426 != null && local426.length == 4) {
									local214 = local426[local33.aBoolean338 ? 2 : 0];
									local393 = local426[local33.aBoolean338 ? 3 : 1];
								}
							}
							local326 = local33.anInt4362 - Static76.anInt1617;
							if (local326 <= local33.anInt4323) {
								local264 = local214.method5091();
							} else {
								local326 -= local33.anInt4323;
								local441 = local33.anInt4348 == 0 ? 0 : local33.anInt4348 * ((local33.anInt4330 - local326) / local33.anInt4348);
								local264 = local214.method5091() * local441 / local33.anInt4330;
							}
							local441 = local214.method5090();
							local199 -= local441;
							local560 = arg3 + Static267.anIntArray621[0] - (local214.method5091() >> 1);
							local214.method5094(local560, local199);
							Static347.aClass155_9.method4922(local560, local199, local560 + local264, local441 + local199);
							local393.method5094(local560, local199);
							local199 -= 2;
							Static347.aClass155_9.method4867(arg3, arg0, arg1 + arg3, arg0 + arg2);
						}
						if (local13 < local7) {
							@Pc(631) Class28_Sub1_Sub1_Sub2 local631 = (Class28_Sub1_Sub1_Sub2) local33;
							if (local631.anInt4413 != -1) {
								local199 -= 25;
								Static210.aClass110Array8[local631.anInt4413].method5094(arg3 + Static267.anIntArray621[0] - 12, local199);
								local199 -= 2;
							}
							if (local631.anInt4394 != -1) {
								local199 -= 25;
								Static376.aClass110Array15[local631.anInt4394].method5094(arg3 + Static267.anIntArray621[0] - 12, local199);
								local199 -= 2;
							}
						} else if (local17.anInt1454 >= 0 && local17.anInt1454 < Static376.aClass110Array15.length) {
							local199 -= 25;
							local214 = Static376.aClass110Array15[local17.anInt1454];
							local214.method5094(arg3 + Static267.anIntArray621[0] - (local214.method5091() >> 1), local199);
							local199 -= 2;
						}
					}
					@Pc(679) Class229[] local679;
					@Pc(687) Class229 local687;
					@Pc(713) Class110 local713;
					if (!(local33 instanceof Class28_Sub1_Sub1_Sub2)) {
						local677 = 0;
						local679 = Static323.aClass229Array1;
						for (local314 = 0; local314 < local679.length; local314++) {
							local687 = local679[local314];
							if (local687 != null && local687.anInt5877 == 1 && Static369.anIntArray664[local13 - local7] == local687.anInt5873) {
								local713 = Static161.aClass110Array7[local687.anInt5876];
								if (local713.method5090() > local677) {
									local677 = local713.method5090();
								}
								if (Static76.anInt1617 % 20 < 10) {
									local713.method5094(arg3 + Static267.anIntArray621[0] - 12, -local713.method5090() + local199);
								}
							}
						}
						if (local677 > 0) {
						}
					} else if (local13 >= 0) {
						local677 = 0;
						local679 = Static323.aClass229Array1;
						for (local314 = 0; local314 < local679.length; local314++) {
							local687 = local679[local314];
							if (local687 != null && local687.anInt5877 == 10 && local687.anInt5873 == local11[local13]) {
								local713 = Static161.aClass110Array7[local687.anInt5876];
								if (local677 < local713.method5090()) {
									local677 = local713.method5090();
								}
								local713.method5094(Static267.anIntArray621[0] + arg3 - 12, -local713.method5090() + local199);
							}
						}
						if (local677 > 0) {
						}
					}
					for (local677 = 0; local677 < 4; local677++) {
						if (local33.anIntArray487[local677] > Static76.anInt1617) {
							local224 = local33.method4012() / 2;
							Static137.method1434(local224, arg1 >> 1, arg2 >> 1, local33);
							if (Static267.anIntArray621[0] > -1) {
								if (local677 == 1) {
									Static267.anIntArray621[1] -= 20;
								}
								if (local677 == 2) {
									Static267.anIntArray621[1] -= 10;
									Static267.anIntArray621[0] -= 15;
								}
								if (local677 == 3) {
									Static267.anIntArray621[1] -= 10;
									Static267.anIntArray621[0] += 15;
								}
								Static243.aClass110Array10[local33.anIntArray489[local677]].method5094(arg3 + Static267.anIntArray621[0] - 12, arg0 - -Static267.anIntArray621[1] + -12);
								Static71.aClass150_1.method5728(Integer.toString(local33.anIntArray486[local677]), -1, 0, arg0 + Static267.anIntArray621[1] + 3, Static267.anIntArray621[0] + -1 + arg3);
							}
						}
					}
				}
			}
		}
		@Pc(995) int local995;
		for (@Pc(989) int local989 = 0; local989 < Static393.anInt6481; local989++) {
			local995 = Static52.anIntArray93[local989];
			@Pc(1002) Class28_Sub1_Sub1 local1002;
			if (local995 < 2048) {
				local1002 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local995];
			} else {
				local1002 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local995 - 2048];
			}
			local199 = Static306.anIntArray584[local989];
			@Pc(1023) Class28_Sub1_Sub1 local1023;
			if (local199 < 2048) {
				local1023 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local199];
			} else {
				local1023 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local199 - 2048];
			}
			Static206.method3188(arg2, local1002, arg1, arg3, arg0, --local1002.anInt4350, local1023);
		}
		local995 = Static366.aClass190_7.anInt4834 + Static366.aClass190_7.anInt4829 + 2;
		for (@Pc(1062) int local1062 = 0; local1062 < Static293.anInt5077; local1062++) {
			local199 = Static253.anIntArray508[local1062];
			local677 = Static253.anIntArray507[local1062];
			local224 = Static253.anIntArray506[local1062];
			@Pc(1078) boolean local1078 = true;
			while (local1078) {
				local1078 = false;
				for (local326 = 0; local326 < local1062; local326++) {
					if (Static253.anIntArray507[local326] - local995 < local677 + 2 && Static253.anIntArray507[local326] + 2 > -local995 + local677 && local199 - local224 < Static253.anIntArray508[local326] - -Static253.anIntArray506[local326] && Static253.anIntArray508[local326] - Static253.anIntArray506[local326] < local199 + local224 && Static253.anIntArray507[local326] - local995 < local677) {
						local677 = Static253.anIntArray507[local326] - local995;
						local1078 = true;
					}
				}
			}
			Static253.anIntArray507[local1062] = local677;
			@Pc(1166) String local1166 = Static253.aStringArray30[local1062];
			if (Static375.anInt6251 == 0) {
				local264 = 16776960;
				if (Static253.anIntArray504[local1062] < 6) {
					local264 = Static342.anIntArray627[Static253.anIntArray504[local1062]];
				}
				if (Static253.anIntArray504[local1062] == 6) {
					local264 = Static226.anInt3990 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static253.anIntArray504[local1062] == 7) {
					local264 = Static226.anInt3990 % 20 >= 10 ? 65535 : 255;
				}
				if (Static253.anIntArray504[local1062] == 8) {
					local264 = Static226.anInt3990 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static253.anIntArray504[local1062] == 9) {
					local441 = 150 - Static253.anIntArray505[local1062];
					if (local441 < 50) {
						local264 = local441 * 1280 + 16711680;
					} else if (local441 < 100) {
						local264 = 16776960 - (local441 - 50) * 327680;
					} else if (local441 < 150) {
						local264 = (local441 - 100) * 5 + 65280;
					}
				}
				if (Static253.anIntArray504[local1062] == 10) {
					local441 = 150 - Static253.anIntArray505[local1062];
					if (local441 < 50) {
						local264 = local441 * 5 + 16711680;
					} else if (local441 < 100) {
						local264 = 16384000 + 16711935 - local441 * 327680;
					} else if (local441 < 150) {
						local264 = local441 * 327680 + 255 + 500 - local441 * 5 - 32768000;
					}
				}
				if (Static253.anIntArray504[local1062] == 11) {
					local441 = 150 - Static253.anIntArray505[local1062];
					if (local441 < 50) {
						local264 = 16777215 - local441 * 327685;
					} else if (local441 < 100) {
						local264 = local441 * 327685 + 65280 - 16384250;
					} else if (local441 < 150) {
						local264 = 32768000 + 16777215 - local441 * 327680;
					}
				}
				local441 = local264 | 0xFF000000;
				if (Static253.anIntArray509[local1062] == 0) {
					Static95.aClass150_6.method5728(local1166, local441, -16777216, arg0 + local677, arg3 + local199);
				}
				if (Static253.anIntArray509[local1062] == 1) {
					Static95.aClass150_6.method5727(local199 + arg3, local1166, Static226.anInt3990, arg0 + local677, local441);
				}
				if (Static253.anIntArray509[local1062] == 2) {
					Static95.aClass150_6.method5734(local441, arg3 + local199, local1166, Static226.anInt3990, local677 + arg0);
				}
				if (Static253.anIntArray509[local1062] == 3) {
					Static95.aClass150_6.method5723(150 - Static253.anIntArray505[local1062], local441, arg3 + local199, local677 + arg0, Static226.anInt3990, local1166);
				}
				if (Static253.anIntArray509[local1062] == 4) {
					local560 = (150 - Static253.anIntArray505[local1062]) * (Static366.aClass190_7.method4358(local1166) + 100) / 150;
					Static347.aClass155_9.method4922(local199 + arg3 - 50, arg0, local199 + arg3 + 50, arg2 + arg0);
					Static95.aClass150_6.method5722(local1166, local441, -16777216, local199 + arg3 + 50 - local560, arg0 + local677);
					Static347.aClass155_9.method4867(arg3, arg0, arg1 + arg3, arg0 - -arg2);
				}
				if (Static253.anIntArray509[local1062] == 5) {
					local560 = 150 - Static253.anIntArray505[local1062];
					@Pc(1560) int local1560 = 0;
					if (local560 < 25) {
						local1560 = local560 - 25;
					} else if (local560 > 125) {
						local1560 = local560 - 125;
					}
					@Pc(1585) int local1585 = Static366.aClass190_7.anInt4829 + Static366.aClass190_7.anInt4834;
					Static347.aClass155_9.method4922(arg3, local677 + arg0 - local1585 - 1, arg3 - -arg1, local677 + arg0 + 5);
					Static95.aClass150_6.method5728(local1166, local441, -16777216, local677 + arg0 + local1560, arg3 + local199);
					Static347.aClass155_9.method4867(arg3, arg0, arg3 + arg1, arg0 - -arg2);
				}
			} else {
				Static95.aClass150_6.method5728(local1166, -256, -16777216, arg0 + local677, local199 + arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method3901(@OriginalArg(1) int arg0) {
		if (!Static212.method3305(arg0)) {
			return;
		}
		@Pc(14) Class62[] local14 = Static375.aClass62ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class62 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt1547 = 0;
				local27.anInt1566 = 1;
				local27.anInt1535 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ)I")
	public static int method3902(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub18 local14 = Static214.method3324(arg0, false);
		if (local14 == null) {
			return Static12.aClass142_1.method3104(arg0).anInt4151;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray226.length; local26++) {
			if (local14.anIntArray226[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static12.aClass142_1.method3104(arg0).anInt4151 - local14.anIntArray226.length;
	}
}
