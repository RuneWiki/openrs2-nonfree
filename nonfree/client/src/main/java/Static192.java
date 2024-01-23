import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString132 = "K";

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public static void method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class57 local7 = Static193.method3145(arg1);
		@Pc(10) int local10 = local7.anInt1481;
		@Pc(13) int local13 = local7.anInt1480;
		@Pc(16) int local16 = local7.anInt1479;
		@Pc(33) int local33 = Class191.anIntArray530[local13 - local16];
		if (arg0 < 0 || arg0 > local33) {
			arg0 = 0;
		}
		local33 <<= local16;
		Static290.method4289(Static264.anIntArray457[local10] & ~local33 | arg0 << local16 & local33, local10);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[[[I[Lclient!o;Z)V")
	public static void method3143(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) Class122[] arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10;
		@Pc(17) int local17;
		if (!arg2) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local17 = 0; local17 < 104; local17++) {
					for (@Pc(22) int local22 = 0; local22 < 104; local22++) {
						if ((Static94.aByteArrayArrayArray9[local10][local17][local22] & 0x1) == 1) {
							@Pc(39) int local39 = local10;
							if ((Static94.aByteArrayArrayArray9[1][local17][local22] & 0x2) == 2) {
								local39 = local10 - 1;
							}
							if (local39 >= 0) {
								arg1[local39].method3132(local17, local22);
							}
						}
					}
				}
			}
			Static185.anInt3729 += (int) (Math.random() * 5.0D) - 2;
			Static288.anInt5487 += (int) (Math.random() * 5.0D) - 2;
			if (Static288.anInt5487 < -8) {
				Static288.anInt5487 = -8;
			}
			if (Static288.anInt5487 > 8) {
				Static288.anInt5487 = 8;
			}
			if (Static185.anInt3729 < -16) {
				Static185.anInt3729 = -16;
			}
			if (Static185.anInt3729 > 16) {
				Static185.anInt3729 = 16;
			}
		}
		@Pc(123) byte local123;
		if (arg2) {
			local123 = 1;
		} else {
			local123 = 4;
		}
		local10 = Static288.anInt5487 >> 2 << 10;
		local17 = Static185.anInt3729 >> 1;
		@Pc(141) int[][] local141 = new int[104][104];
		@Pc(145) int[][] local145 = new int[104][104];
		@Pc(147) int local147;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(172) int local172;
		@Pc(179) int local179;
		@Pc(275) int local275;
		@Pc(228) int local228;
		@Pc(207) int local207;
		@Pc(241) int local241;
		@Pc(251) int local251;
		@Pc(245) int local245;
		@Pc(257) int local257;
		for (local147 = 0; local147 < local123; local147++) {
			@Pc(158) byte[][] local158 = Static301.aByteArrayArrayArray21[local147];
			@Pc(324) int local324;
			@Pc(541) int local541;
			@Pc(537) int local537;
			@Pc(607) int local607;
			if (!Static291.aBoolean404) {
				local164 = (int) Math.sqrt(5100.0D);
				local170 = local164 * 768 >> 8;
				for (local172 = 1; local172 < 103; local172++) {
					for (local179 = 1; local179 < 103; local179++) {
						local207 = Static208.anIntArrayArrayArray11[local147][local179][local172 + 1] - Static208.anIntArrayArrayArray11[local147][local179][local172 - 1];
						local228 = Static208.anIntArrayArrayArray11[local147][local179 + 1][local172] - Static208.anIntArrayArrayArray11[local147][local179 - 1][local172];
						local241 = (int) Math.sqrt((double) (local207 * local207 + local228 * local228 + 65536));
						local245 = -65536 / local241;
						local251 = (local228 << 8) / local241;
						local257 = (local207 << 8) / local241;
						local275 = (local251 * -50 + local245 * -10 + local257 * -50) / local170 + 74;
						local324 = (local158[local179][local172] >> 1) + (local158[local179 - 1][local172] >> 2) + (local158[local179 - -1][local172] >> 3) + (local158[local179][local172 - 1] >> 2) + (local158[local179][local172 + 1] >> 3);
						local145[local179][local172] = local275 - local324;
					}
				}
			} else if (Static302.aBoolean419) {
				for (local164 = 1; local164 < 103; local164++) {
					for (local170 = 1; local170 < 103; local170++) {
						local179 = (local158[local170][local164] >> 1) + (local158[local170][local164 + 1] >> 3) + (local158[local170 + -1][local164] >> 2) - (-(local158[local170 + 1][local164] >> 3) - (local158[local170][local164 - 1] >> 2));
						local145[local170][local164] = 74 - local179;
					}
				}
			} else {
				local170 = (int) Static96.aFloatArray13[1];
				local164 = (int) Static96.aFloatArray13[0];
				local172 = (int) Static96.aFloatArray13[2];
				local179 = (int) Math.sqrt((double) (local172 * local172 + local170 * local170 + local164 * local164));
				local275 = local179 * 1024 >> 8;
				for (local228 = 1; local228 < 103; local228++) {
					for (local207 = 1; local207 < 103; local207++) {
						local251 = Static208.anIntArrayArrayArray11[local147][local207 + 1][local228] - Static208.anIntArrayArrayArray11[local147][local207 - 1][local228];
						local245 = Static208.anIntArrayArrayArray11[local147][local207][local228 + 1] - Static208.anIntArrayArrayArray11[local147][local207][local228 - 1];
						local257 = (int) Math.sqrt((double) (local251 * local251 + local245 * local245 + 65536));
						local324 = (local251 << 8) / local257;
						local537 = (local245 << 8) / local257;
						local541 = -65536 / local257;
						local241 = (local537 * local172 + local324 * local164 + local541 * local170) / local275 + 96;
						local607 = (local158[local207][local228] >> 1) + (local158[local207][local228 + 1] >> 3) + (local158[local207 + -1][local228] >> 2) + (local158[local207 - -1][local228] >> 3) + (local158[local207][local228 - 1] >> 2);
						local145[local207][local228] = local241 - (int) ((float) local607 * 1.7F);
					}
				}
			}
			for (local164 = 0; local164 < 104; local164++) {
				Static136.anIntArray221[local164] = 0;
				Static128.anIntArray203[local164] = 0;
				Static289.anIntArray501[local164] = 0;
				Static238.anIntArray434[local164] = 0;
				Static94.anIntArray145[local164] = 0;
			}
			for (local164 = -5; local164 < 104; local164++) {
				for (local170 = 0; local170 < 104; local170++) {
					local172 = local164 + 5;
					@Pc(729) int local729;
					if (local172 < 104) {
						local179 = Static245.aByteArrayArrayArray11[local147][local172][local170] & 0xFF;
						if (local179 > 0) {
							@Pc(693) Class54 local693 = Static300.method4497(local179 - 1);
							Static136.anIntArray221[local170] += local693.anInt1440;
							Static128.anIntArray203[local170] += local693.anInt1428;
							Static289.anIntArray501[local170] += local693.anInt1442;
							Static238.anIntArray434[local170] += local693.anInt1431;
							local729 = Static94.anIntArray145[local170]++;
						}
					}
					local179 = local164 - 5;
					if (local179 >= 0) {
						local275 = Static245.aByteArrayArrayArray11[local147][local179][local170] & 0xFF;
						if (local275 > 0) {
							@Pc(758) Class54 local758 = Static300.method4497(local275 - 1);
							Static136.anIntArray221[local170] -= local758.anInt1440;
							Static128.anIntArray203[local170] -= local758.anInt1428;
							Static289.anIntArray501[local170] -= local758.anInt1442;
							Static238.anIntArray434[local170] -= local758.anInt1431;
							local729 = Static94.anIntArray145[local170]--;
						}
					}
				}
				if (local164 >= 0) {
					local170 = 0;
					local172 = 0;
					local275 = 0;
					local179 = 0;
					local228 = 0;
					for (local207 = -5; local207 < 104; local207++) {
						local241 = local207 + 5;
						local251 = local207 - 5;
						if (local241 < 104) {
							local172 += Static128.anIntArray203[local241];
							local228 += Static94.anIntArray145[local241];
							local275 += Static238.anIntArray434[local241];
							local179 += Static289.anIntArray501[local241];
							local170 += Static136.anIntArray221[local241];
						}
						if (local251 >= 0) {
							local228 -= Static94.anIntArray145[local251];
							local275 -= Static238.anIntArray434[local251];
							local172 -= Static128.anIntArray203[local251];
							local170 -= Static136.anIntArray221[local251];
							local179 -= Static289.anIntArray501[local251];
						}
						if (local207 >= 0 && local228 > 0) {
							local141[local164][local207] = Static5.method57(local179 / local228, local170 * 256 / local275, local172 / local228);
						}
					}
				}
			}
			for (local164 = 1; local164 < 103; local164++) {
				label763: for (local170 = 1; local170 < 103; local170++) {
					if (arg2 || Static62.method1046() || (Static94.aByteArrayArrayArray9[0][local164][local170] & 0x2) != 0 || (Static94.aByteArrayArrayArray9[local147][local164][local170] & 0x10) == 0 && Static243.method4467(local170, local164, local147) == Static277.anInt5275) {
						if (Static7.anInt134 > local147) {
							Static7.anInt134 = local147;
						}
						local172 = Static245.aByteArrayArrayArray11[local147][local164][local170] & 0xFF;
						local179 = Static59.aByteArrayArrayArray8[local147][local164][local170] & 0xFF;
						if (local172 > 0 || local179 > 0) {
							local275 = Static208.anIntArrayArrayArray11[local147][local164][local170];
							local228 = Static208.anIntArrayArrayArray11[local147][local164 + 1][local170];
							local207 = Static208.anIntArrayArrayArray11[local147][local164 + 1][local170 + 1];
							local241 = Static208.anIntArrayArrayArray11[local147][local164][local170 + 1];
							if (local147 > 0) {
								@Pc(1068) boolean local1068 = true;
								if (local172 == 0 && Static265.aByteArrayArrayArray19[local147][local164][local170] != 0) {
									local1068 = false;
								}
								if (local179 > 0 && !Static229.method3600(local179 - 1).aBoolean120) {
									local1068 = false;
								}
								if (local1068 && local275 == local228 && local207 == local275 && local241 == local275) {
									Static231.anIntArrayArrayArray12[local147][local164][local170] |= 0x4;
								}
							}
							if (local172 > 0) {
								local251 = local141[local164][local170];
								local257 = local17 + (local251 & 0x7F);
								if (local257 < 0) {
									local257 = 0;
								} else if (local257 > 127) {
									local257 = 127;
								}
								local324 = local257 + (local251 & 0x380) + (local10 + local251 & 0xFC00);
								local245 = Static18.anIntArray26[Static276.method2806(96, local324)];
							} else {
								local245 = 0;
								local251 = -1;
							}
							local257 = local145[local164][local170];
							local324 = local145[local164 + 1][local170];
							local537 = local145[local164][local170 + 1];
							local541 = local145[local164 + 1][local170 + 1];
							if (local179 == 0) {
								Static79.method1218(local147, local164, local170, 0, 0, -1, local275, local228, local207, local241, Static276.method2806(local257, local251), Static276.method2806(local324, local251), Static276.method2806(local541, local251), Static276.method2806(local537, local251), 0, 0, 0, 0, local245, 0);
								if (Static291.aBoolean404 && local147 > 0 && local251 != -1 && Static300.method4497(local172 - 1).aBoolean117) {
									Static174.method2904(0, 0, true, false, local164, local170, local275 - Static208.anIntArrayArrayArray11[0][local164][local170], -Static208.anIntArrayArrayArray11[0][local164 - -1][local170] + local228, local207 - Static208.anIntArrayArrayArray11[0][local164 + 1][local170 + 1], local241 + -Static208.anIntArrayArrayArray11[0][local164][local170 + 1]);
								}
								if (Static291.aBoolean404 && !arg2 && Static300.anIntArrayArray47 != null && local147 == 0) {
									for (local607 = local164 - 1; local607 <= local164 + 1; local607++) {
										for (@Pc(1360) int local1360 = local170 - 1; local1360 <= local170 + 1; local1360++) {
											if ((local607 != local164 || local1360 != local170) && local607 >= 0 && local607 < 104 && local1360 >= 0 && local1360 < 104) {
												@Pc(1403) int local1403 = Static59.aByteArrayArrayArray8[local147][local607][local1360] & 0xFF;
												if (local1403 != 0) {
													@Pc(1416) Class59 local1416 = Static229.method3600(local1403 - 1);
													if (local1416.anInt1514 != -1 && Static143.method2283(Static18.anInterface1_1.method1626(local1416.anInt1514))) {
														Static300.anIntArrayArray47[local164][local170] = local1416.anInt1512 + (local1416.anInt1515 << 24);
														continue label763;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1460) byte local1460 = Static208.aByteArrayArrayArray18[local147][local164][local170];
								local607 = Static265.aByteArrayArrayArray19[local147][local164][local170] + 1;
								@Pc(1476) Class59 local1476 = Static229.method3600(local179 - 1);
								@Pc(1522) int local1522;
								@Pc(1535) int local1535;
								@Pc(1583) int local1583;
								if (Static291.aBoolean404 && !arg2 && Static300.anIntArrayArray47 != null && local147 == 0) {
									if (local1476.anInt1514 != -1 && Static143.method2283(Static18.anInterface1_1.method1626(local1476.anInt1514))) {
										Static300.anIntArrayArray47[local164][local170] = (local1476.anInt1515 << 24) + local1476.anInt1512;
									} else {
										label744: for (local1522 = local164 - 1; local1522 <= local164 + 1; local1522++) {
											for (local1535 = local170 - 1; local1535 <= local170 + 1; local1535++) {
												if ((local1522 != local164 || local170 != local1535) && local1522 >= 0 && local1522 < 104 && local1535 >= 0 && local1535 < 104) {
													local1583 = Static59.aByteArrayArrayArray8[local147][local1522][local1535] & 0xFF;
													if (local1583 != 0) {
														@Pc(1592) Class59 local1592 = Static229.method3600(local1583 - 1);
														if (local1592.anInt1514 != -1 && Static143.method2283(Static18.anInterface1_1.method1626(local1592.anInt1514))) {
															Static300.anIntArrayArray47[local164][local170] = local1592.anInt1512 + (local1592.anInt1515 << 24);
															break label744;
														}
													}
												}
											}
										}
									}
								}
								local1522 = local1476.anInt1514;
								if (local1522 >= 0 && !Static18.anInterface1_1.method1629(local1522)) {
									local1522 = -1;
								}
								@Pc(1694) int local1694;
								@Pc(1667) int local1667;
								if (local1522 >= 0) {
									local1583 = Static18.anIntArray26[Static48.method851(96, Static18.anInterface1_1.method1625(local1522))];
									local1535 = -1;
								} else if (local1476.anInt1520 == -1) {
									local1535 = -2;
									local1583 = 0;
								} else {
									local1535 = local1476.anInt1520;
									local1667 = (local1535 & 0x7F) + local17;
									if (local1667 < 0) {
										local1667 = 0;
									} else if (local1667 > 127) {
										local1667 = 127;
									}
									local1694 = local1667 + (local10 + local1535 & 0xFC00) + (local1535 & 0x380);
									local1583 = Static18.anIntArray26[Static48.method851(96, local1694)];
								}
								if (local1476.anInt1510 >= 0) {
									local1667 = local1476.anInt1510;
									local1694 = (local1667 & 0x7F) + local17;
									if (local1694 < 0) {
										local1694 = 0;
									} else if (local1694 > 127) {
										local1694 = 127;
									}
									@Pc(1763) int local1763 = (local1667 + local10 & 0xFC00) + (local1667 & 0x380) + local1694;
									local1583 = Static18.anIntArray26[Static48.method851(96, local1763)];
								}
								Static79.method1218(local147, local164, local170, local607, local1460, local1522, local275, local228, local207, local241, Static276.method2806(local257, local251), Static276.method2806(local324, local251), Static276.method2806(local541, local251), Static276.method2806(local537, local251), Static48.method851(local257, local1535), Static48.method851(local324, local1535), Static48.method851(local541, local1535), Static48.method851(local537, local1535), local245, local1583);
								if (Static291.aBoolean404 && local147 > 0) {
									Static174.method2904(local607, local1460, local1535 == -2 || !local1476.aBoolean118, local251 == -1 || !Static300.method4497(local172 - 1).aBoolean117, local164, local170, local275 - Static208.anIntArrayArrayArray11[0][local164][local170], local228 - Static208.anIntArrayArrayArray11[0][local164 + 1][local170], local207 - Static208.anIntArrayArrayArray11[0][local164 + 1][local170 + 1], local241 - Static208.anIntArrayArrayArray11[0][local164][local170 + 1]);
								}
							}
						}
					}
				}
			}
			if (Static291.aBoolean404) {
				@Pc(1909) float[][] local1909 = new float[105][105];
				@Pc(1913) float[][] local1913 = new float[105][105];
				@Pc(1917) int[][] local1917 = Static208.anIntArrayArrayArray11[local147];
				@Pc(1921) float[][] local1921 = new float[105][105];
				local275 = 1;
				while (true) {
					if (local275 > 103) {
						@Pc(2048) Class1_Sub20[] local2048;
						if (arg2) {
							local2048 = Static316.method4670(Static208.aByteArrayArrayArray18[local147], Static59.aByteArrayArrayArray8[local147], Static89.anIntArrayArrayArray6[0], arg0, local147, Static208.anIntArrayArrayArray11[local147], local1909, Static94.aByteArrayArrayArray9, Static265.aByteArrayArrayArray19[local147], local1921, Static245.aByteArrayArrayArray11[local147], local145, local141, local1913, Static300.anIntArrayArray47);
							Static53.method907(local147, local2048);
							break;
						}
						local2048 = Static316.method4670(Static208.aByteArrayArrayArray18[local147], Static59.aByteArrayArrayArray8[local147], null, arg0, local147, Static208.anIntArrayArrayArray11[local147], local1909, Static94.aByteArrayArrayArray9, Static265.aByteArrayArrayArray19[local147], local1921, Static245.aByteArrayArrayArray11[local147], local145, local141, local1913, null);
						@Pc(2106) Class1_Sub20[] local2106 = Static279.method4131(Static208.anIntArrayArrayArray11[local147], Static265.aByteArrayArrayArray19[local147], local1909, Static208.aByteArrayArrayArray18[local147], Static59.aByteArrayArrayArray8[local147], Static245.aByteArrayArrayArray11[local147], local1913, local1921, local145, Static94.aByteArrayArrayArray9, local147);
						@Pc(2114) Class1_Sub20[] local2114 = new Class1_Sub20[local2048.length + local2106.length];
						for (local241 = 0; local241 < local2048.length; local241++) {
							local2114[local241] = local2048[local241];
						}
						for (local241 = 0; local241 < local2106.length; local241++) {
							local2114[local241 + local2048.length] = local2106[local241];
						}
						Static53.method907(local147, local2114);
						Static202.method3245(Static245.aByteArrayArrayArray11[local147], Static59.aByteArrayArrayArray8[local147], Static265.aByteArrayArrayArray19[local147], Static208.aByteArrayArrayArray18[local147], local1921, local147, Static208.anIntArrayArrayArray11[local147], Static294.aClass170Array1, Static294.anInt5542, local1909, local1913);
						break;
					}
					for (local228 = 1; local228 <= 103; local228++) {
						local241 = local1917[local228][local275 + 1] - local1917[local228][local275 - 1];
						local207 = local1917[local228 + 1][local275] - local1917[local228 - 1][local275];
						@Pc(1982) float local1982 = (float) Math.sqrt((double) (local207 * local207 + local241 * local241 + 65536));
						local1913[local228][local275] = (float) local207 / local1982;
						local1909[local228][local275] = -256.0F / local1982;
						local1921[local228][local275] = (float) local241 / local1982;
					}
					local275++;
				}
			}
			Static245.aByteArrayArrayArray11[local147] = null;
			Static59.aByteArrayArrayArray8[local147] = null;
			Static265.aByteArrayArrayArray19[local147] = null;
			Static208.aByteArrayArrayArray18[local147] = null;
			Static301.aByteArrayArrayArray21[local147] = null;
		}
		Static268.method4668();
		if (arg2) {
			return;
		}
		@Pc(2223) int local2223;
		for (local147 = 0; local147 < 104; local147++) {
			for (local2223 = 0; local2223 < 104; local2223++) {
				if ((Static94.aByteArrayArrayArray9[1][local147][local2223] & 0x2) == 2) {
					Static177.method1741(local147, local2223);
				}
			}
		}
		for (local147 = 0; local147 < 4; local147++) {
			for (local2223 = 0; local2223 <= 104; local2223++) {
				for (local164 = 0; local164 <= 104; local164++) {
					if ((Static231.anIntArrayArrayArray12[local147][local164][local2223] & 0x1) != 0) {
						local170 = local2223;
						local172 = local2223;
						local179 = local147;
						while (local172 < 104 && (Static231.anIntArrayArrayArray12[local147][local164][local172 + 1] & 0x1) != 0) {
							local172++;
						}
						while (local170 > 0 && (Static231.anIntArrayArrayArray12[local147][local164][local170 - 1] & 0x1) != 0) {
							local170--;
						}
						label447: while (local179 > 0) {
							for (local228 = local170; local228 <= local172; local228++) {
								if ((Static231.anIntArrayArrayArray12[local179 - 1][local164][local228] & 0x1) == 0) {
									break label447;
								}
							}
							local179--;
						}
						label435: for (local275 = local147; local275 < 3; local275++) {
							for (local228 = local170; local228 <= local172; local228++) {
								if ((Static231.anIntArrayArrayArray12[local275 + 1][local164][local228] & 0x1) == 0) {
									break label435;
								}
							}
						}
						local228 = (local172 + 1 - local170) * (-local179 + local275 + 1);
						if (local228 >= 8) {
							local251 = Static208.anIntArrayArrayArray11[local179][local164][local170];
							local241 = Static208.anIntArrayArrayArray11[local275][local164][local170] - 240;
							Static128.method2022(1, local164 * 128, local164 * 128, local170 * 128, local172 * 128 + 128, local241, local251);
							for (local245 = local179; local245 <= local275; local245++) {
								for (local257 = local170; local257 <= local172; local257++) {
									Static231.anIntArrayArrayArray12[local245][local164][local257] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static231.anIntArrayArrayArray12[local147][local164][local2223] & 0x2) != 0) {
						local172 = local164;
						local179 = local147;
						local170 = local164;
						while (local172 < 104 && (Static231.anIntArrayArrayArray12[local147][local172 + 1][local2223] & 0x2) != 0) {
							local172++;
						}
						local275 = local147;
						while (local170 > 0 && (Static231.anIntArrayArrayArray12[local147][local170 - 1][local2223] & 0x2) != 0) {
							local170--;
						}
						label500: while (local179 > 0) {
							for (local228 = local170; local228 <= local172; local228++) {
								if ((Static231.anIntArrayArrayArray12[local179 - 1][local228][local2223] & 0x2) == 0) {
									break label500;
								}
							}
							local179--;
						}
						label489: while (local275 < 3) {
							for (local228 = local170; local228 <= local172; local228++) {
								if ((Static231.anIntArrayArrayArray12[local275 + 1][local228][local2223] & 0x2) == 0) {
									break label489;
								}
							}
							local275++;
						}
						local228 = (local275 + 1 - local179) * (local172 + -local170 + 1);
						if (local228 >= 8) {
							local251 = Static208.anIntArrayArrayArray11[local179][local170][local2223];
							local241 = Static208.anIntArrayArrayArray11[local275][local170][local2223] - 240;
							Static128.method2022(2, local170 * 128, local172 * 128 + 128, local2223 * 128, local2223 * 128, local241, local251);
							for (local245 = local179; local245 <= local275; local245++) {
								for (local257 = local170; local257 <= local172; local257++) {
									Static231.anIntArrayArrayArray12[local245][local257][local2223] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static231.anIntArrayArrayArray12[local147][local164][local2223] & 0x4) != 0) {
						local170 = local164;
						local172 = local164;
						for (local275 = local2223; local275 < 104 && (Static231.anIntArrayArrayArray12[local147][local164][local275 + 1] & 0x4) != 0; local275++) {
						}
						for (local179 = local2223; local179 > 0 && (Static231.anIntArrayArrayArray12[local147][local164][local179 - 1] & 0x4) != 0; local179--) {
						}
						label554: while (local170 > 0) {
							for (local228 = local179; local228 <= local275; local228++) {
								if ((Static231.anIntArrayArrayArray12[local147][local170 - 1][local228] & 0x4) == 0) {
									break label554;
								}
							}
							local170--;
						}
						label543: while (local172 < 104) {
							for (local228 = local179; local228 <= local275; local228++) {
								if ((Static231.anIntArrayArrayArray12[local147][local172 + 1][local228] & 0x4) == 0) {
									break label543;
								}
							}
							local172++;
						}
						if ((local275 + 1 - local179) * (-local170 + (local172 - -1)) >= 4) {
							local228 = Static208.anIntArrayArrayArray11[local147][local170][local179];
							Static128.method2022(4, local170 * 128, local172 * 128 + 128, local179 * 128, local275 * 128 + 128, local228, local228);
							for (local207 = local170; local207 <= local172; local207++) {
								for (local241 = local179; local241 <= local275; local241++) {
									Static231.anIntArrayArrayArray12[local147][local207][local241] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
