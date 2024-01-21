import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!nc;")
	public static Class65 aClass65_7;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 aClass1_Sub3_Sub1_Sub5_2;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
	public static final int[] anIntArray188 = new int[32];

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt2497 = 0;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[Lclient!kg;")
	public static final Class55[] aClass55Array1 = new Class55[4];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1158 = Static187.method3089("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_14 = new Class20();

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	public static int anInt2509 = 0;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1159 = Static187.method3089("<br>");

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1160 = Static187.method3089("sl_back");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1725() {
		@Pc(9) int local9 = Static203.anInt4428 >> 7;
		Static106.anInt2306 &= 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = Static1.anInt57 >> 7;
		if (Static129.anInt2670 < 128) {
			Static129.anInt2670 = 128;
		}
		if (Static129.anInt2670 > 383) {
			Static129.anInt2670 = 383;
		}
		@Pc(45) int local45 = Static64.method1027(Static203.anInt4428, Static1.anInt57, Static192.anInt4180);
		@Pc(65) int local65;
		if (local27 > 3 && local9 > 3 && local27 < 100 && local9 < 100) {
			for (local65 = local27 - 4; local65 <= local27 + 4; local65++) {
				for (@Pc(71) int local71 = local9 - 4; local71 <= local9 + 4; local71++) {
					@Pc(75) int local75 = Static192.anInt4180;
					if (local75 < 3 && (Static146.aByteArrayArrayArray33[1][local65][local71] & 0x2) == 2) {
						local75++;
					}
					@Pc(103) int local103 = local45 - Static156.anIntArrayArrayArray6[local75][local65][local71];
					if (local23 < local103) {
						local23 = local103;
					}
				}
			}
		}
		local65 = local23 * 192;
		if (local65 > 98048) {
			local65 = 98048;
		}
		if (local65 < 32768) {
			local65 = 32768;
		}
		if (Static188.anInt4439 < local65) {
			Static188.anInt4439 += (local65 - Static188.anInt4439) / 24;
		} else if (Static188.anInt4439 > local65) {
			Static188.anInt4439 += (local65 - Static188.anInt4439) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Lclient!ag;I)V")
	public static void method1726(@OriginalArg(0) Class7[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static146.aByteArrayArrayArray33[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static146.aByteArrayArrayArray33[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method127(local11, local15);
						}
					}
				}
			}
		}
		Static61.anInt1464 += (int) (Math.random() * 5.0D) - 2;
		if (Static61.anInt1464 < -16) {
			Static61.anInt1464 = -16;
		}
		Static203.anInt4429 += (int) (Math.random() * 5.0D) - 2;
		@Pc(97) int[][] local97 = new int[104][104];
		if (Static203.anInt4429 < -8) {
			Static203.anInt4429 = -8;
		}
		@Pc(108) int[][] local108 = new int[104][104];
		if (Static61.anInt1464 > 16) {
			Static61.anInt1464 = 16;
		}
		local15 = Static61.anInt1464 >> 1;
		if (Static203.anInt4429 > 8) {
			Static203.anInt4429 = 8;
		}
		local11 = Static203.anInt4429 >> 2 << 10;
		@Pc(146) int local146;
		@Pc(152) int local152;
		@Pc(154) int local154;
		@Pc(158) int local158;
		@Pc(249) int local249;
		@Pc(183) int local183;
		@Pc(204) int local204;
		@Pc(217) int local217;
		@Pc(233) int local233;
		@Pc(221) int local221;
		@Pc(227) int local227;
		@Pc(301) int local301;
		@Pc(519) int local519;
		@Pc(558) int local558;
		@Pc(867) int local867;
		for (@Pc(132) int local132 = 0; local132 < 4; local132++) {
			@Pc(138) byte[][] local138 = Static34.aByteArrayArrayArray8[local132];
			local146 = (int) Math.sqrt(5100.0D);
			local152 = local146 * 768 >> 8;
			for (local154 = 1; local154 < 103; local154++) {
				for (local158 = 1; local158 < 103; local158++) {
					local183 = Static156.anIntArrayArrayArray6[local132][local158 + 1][local154] - Static156.anIntArrayArrayArray6[local132][local158 - 1][local154];
					local204 = Static156.anIntArrayArrayArray6[local132][local158][local154 + 1] - Static156.anIntArrayArrayArray6[local132][local158][local154 - 1];
					local217 = (int) Math.sqrt((double) (local183 * local183 + local204 * local204 + 65536));
					local221 = -65536 / local217;
					local227 = (local204 << 8) / local217;
					local233 = (local183 << 8) / local217;
					local249 = (local227 * -50 + local221 * -10 + local233 * -50) / local152 + 74;
					local301 = (local138[local158 - 1][local154] >> 2) + (local138[local158][local154 + 1] >> 3) + (local138[local158][local154] >> 1) - (-(local138[local158 + 1][local154] >> 3) - (local138[local158][local154 - 1] >> 2));
					local97[local158][local154] = local249 - local301;
				}
			}
			for (local158 = 0; local158 < 104; local158++) {
				Static119.anIntArray191[local158] = 0;
				Static78.anIntArray137[local158] = 0;
				Static55.anIntArray109[local158] = 0;
				Static185.anIntArray328[local158] = 0;
				Static79.anIntArray140[local158] = 0;
			}
			for (local249 = -5; local249 < 104; local249++) {
				for (local183 = 0; local183 < 104; local183++) {
					local204 = local249 + 5;
					@Pc(420) int local420;
					if (local204 < 104) {
						local217 = Static191.aByteArrayArrayArray50[local132][local204][local183] & 0xFF;
						if (local217 > 0) {
							@Pc(384) Class1_Sub3_Sub8 local384 = Static177.method2884(local217 - 1);
							Static119.anIntArray191[local183] += local384.anInt1670;
							Static78.anIntArray137[local183] += local384.anInt1669;
							Static55.anIntArray109[local183] += local384.anInt1677;
							Static185.anIntArray328[local183] += local384.anInt1672;
							local420 = Static79.anIntArray140[local183]++;
						}
					}
					local217 = local249 - 5;
					if (local217 >= 0) {
						local233 = Static191.aByteArrayArrayArray50[local132][local217][local183] & 0xFF;
						if (local233 > 0) {
							@Pc(453) Class1_Sub3_Sub8 local453 = Static177.method2884(local233 - 1);
							Static119.anIntArray191[local183] -= local453.anInt1670;
							Static78.anIntArray137[local183] -= local453.anInt1669;
							Static55.anIntArray109[local183] -= local453.anInt1677;
							Static185.anIntArray328[local183] -= local453.anInt1672;
							local420 = Static79.anIntArray140[local183]--;
						}
					}
				}
				if (local249 >= 0) {
					local204 = 0;
					local217 = 0;
					local233 = 0;
					local221 = 0;
					local227 = 0;
					for (local301 = -5; local301 < 104; local301++) {
						local519 = local301 + 5;
						if (local519 < 104) {
							local204 += Static119.anIntArray191[local519];
							local217 += Static78.anIntArray137[local519];
							local221 += Static185.anIntArray328[local519];
							local227 += Static79.anIntArray140[local519];
							local233 += Static55.anIntArray109[local519];
						}
						local558 = local301 - 5;
						if (local558 >= 0) {
							local233 -= Static55.anIntArray109[local558];
							local221 -= Static185.anIntArray328[local558];
							local204 -= Static119.anIntArray191[local558];
							local217 -= Static78.anIntArray137[local558];
							local227 -= Static79.anIntArray140[local558];
						}
						if (local301 >= 0 && local227 > 0) {
							local108[local249][local301] = Static40.method2670(local204 * 256 / local221, local217 / local227, local233 / local227);
						}
					}
				}
			}
			for (local183 = 1; local183 < 103; local183++) {
				for (local204 = 1; local204 < 103; local204++) {
					if (!Static111.aBoolean141 || (Static146.aByteArrayArrayArray33[0][local183][local204] & 0x2) != 0 || (Static146.aByteArrayArrayArray33[local132][local183][local204] & 0x10) == 0 && Static178.method2911(local183, local204, local132) == Static102.anInt2214) {
						if (local132 < Static31.anInt733) {
							Static31.anInt733 = local132;
						}
						local233 = Static87.aByteArrayArrayArray20[local132][local183][local204] & 0xFF;
						local217 = Static191.aByteArrayArrayArray50[local132][local183][local204] & 0xFF;
						if (local217 > 0 || local233 > 0) {
							local221 = Static156.anIntArrayArrayArray6[local132][local183][local204];
							local227 = Static156.anIntArrayArrayArray6[local132][local183 + 1][local204];
							local301 = Static156.anIntArrayArrayArray6[local132][local183 + 1][local204 + 1];
							local519 = Static156.anIntArrayArrayArray6[local132][local183][local204 + 1];
							if (local132 > 0) {
								@Pc(758) boolean local758 = true;
								if (local217 == 0 && Static183.aByteArrayArrayArray46[local132][local183][local204] != 0) {
									local758 = false;
								}
								if (local233 > 0 && !Static175.method2877(local233 - 1).aBoolean117) {
									local758 = false;
								}
								if (local758 && local221 == local227 && local221 == local301 && local519 == local221) {
									Static12.anIntArrayArrayArray1[local132][local183][local204] |= 0x924;
								}
							}
							@Pc(835) int local835;
							@Pc(860) int local860;
							if (local217 > 0) {
								local558 = local108[local183][local204];
								local835 = (local558 & 0x7F) + local15;
								if (local835 < 0) {
									local835 = 0;
								} else if (local835 > 127) {
									local835 = 127;
								}
								local860 = (local558 & 0x380) + (local11 + local558 & 0xFC00) + local835;
								local867 = Static174.anIntArray319[Static79.method1205(local860, 96)];
							} else {
								local558 = -1;
								local867 = 0;
							}
							local835 = local97[local183][local204];
							local860 = local97[local183 + 1][local204];
							@Pc(897) int local897 = local97[local183 + 1][local204 + 1];
							@Pc(905) int local905 = local97[local183][local204 + 1];
							if (local233 == 0) {
								Static39.method718(local132, local183, local204, 0, 0, -1, local221, local227, local301, local519, Static79.method1205(local558, local835), Static79.method1205(local558, local860), Static79.method1205(local558, local897), Static79.method1205(local558, local905), 0, 0, 0, 0, local867, 0);
							} else {
								@Pc(961) int local961 = Static183.aByteArrayArrayArray46[local132][local183][local204] + 1;
								@Pc(969) byte local969 = Static103.aByteArrayArrayArray26[local132][local183][local204];
								@Pc(975) Class1_Sub3_Sub12 local975 = Static175.method2877(local233 - 1);
								@Pc(978) int local978 = local975.anInt2005;
								if (local978 >= 0 && !Static174.anInterface3_2.method2593(local978)) {
									local978 = -1;
								}
								@Pc(999) int local999;
								@Pc(1039) int local1039;
								@Pc(1005) int local1005;
								@Pc(1032) int local1032;
								if (local978 >= 0) {
									local999 = -1;
									local1039 = Static174.anIntArray319[Static187.method3088(Static174.anInterface3_2.method2592(local978), 96)];
								} else if (local975.anInt2006 == -1) {
									local1039 = 0;
									local999 = -2;
								} else {
									local999 = local975.anInt2006;
									local1005 = local15 + (local999 & 0x7F);
									if (local1005 < 0) {
										local1005 = 0;
									} else if (local1005 > 127) {
										local1005 = 127;
									}
									local1032 = (local999 & 0x380) + ((local999 + local11 & 0xFC00) + local1005);
									local1039 = Static174.anIntArray319[Static187.method3088(local1032, 96)];
								}
								if (local975.anInt2002 >= 0) {
									local1005 = local975.anInt2002;
									local1032 = (local1005 & 0x7F) + local15;
									if (local1032 < 0) {
										local1032 = 0;
									} else if (local1032 > 127) {
										local1032 = 127;
									}
									@Pc(1100) int local1100 = (local1005 & 0x380) + (local1005 + local11 & 0xFC00) + local1032;
									local1039 = Static174.anIntArray319[Static187.method3088(local1100, 96)];
								}
								Static39.method718(local132, local183, local204, local961, local969, local978, local221, local227, local301, local519, Static79.method1205(local558, local835), Static79.method1205(local558, local860), Static79.method1205(local558, local897), Static79.method1205(local558, local905), Static187.method3088(local999, local835), Static187.method3088(local999, local860), Static187.method3088(local999, local897), Static187.method3088(local999, local905), local867, local1039);
							}
						}
					}
				}
			}
			for (local204 = 1; local204 < 103; local204++) {
				for (local217 = 1; local217 < 103; local217++) {
					Static154.method2363(local132, local217, local204, Static178.method2911(local217, local204, local132));
				}
			}
			Static191.aByteArrayArrayArray50[local132] = null;
			Static87.aByteArrayArrayArray20[local132] = null;
			Static183.aByteArrayArrayArray46[local132] = null;
			Static103.aByteArrayArrayArray26[local132] = null;
			Static34.aByteArrayArrayArray8[local132] = null;
		}
		Static120.method1758();
		@Pc(1238) int local1238;
		for (@Pc(1234) int local1234 = 0; local1234 < 104; local1234++) {
			for (local1238 = 0; local1238 < 104; local1238++) {
				if ((Static146.aByteArrayArrayArray33[1][local1234][local1238] & 0x2) == 2) {
					Static128.method1874(local1234, local1238);
				}
			}
		}
		local1238 = 1;
		@Pc(1270) int local1270 = 2;
		local146 = 4;
		for (local152 = 0; local152 < 4; local152++) {
			if (local152 > 0) {
				local146 <<= 0x3;
				local1270 <<= 0x3;
				local1238 <<= 0x3;
			}
			for (local154 = 0; local154 <= local152; local154++) {
				for (local158 = 0; local158 <= 104; local158++) {
					for (local249 = 0; local249 <= 104; local249++) {
						if ((Static12.anIntArrayArrayArray1[local154][local249][local158] & local1238) != 0) {
							for (local183 = local158; local183 > 0 && (local1238 & Static12.anIntArrayArrayArray1[local154][local249][local183 - 1]) != 0; local183--) {
							}
							for (local204 = local158; local204 < 104 && (Static12.anIntArrayArrayArray1[local154][local249][local204 + 1] & local1238) != 0; local204++) {
							}
							local233 = local154;
							label350: for (local217 = local154; local217 > 0; local217--) {
								for (local221 = local183; local221 <= local204; local221++) {
									if ((local1238 & Static12.anIntArrayArrayArray1[local217 - 1][local249][local221]) == 0) {
										break label350;
									}
								}
							}
							label339: while (local233 < local152) {
								for (local221 = local183; local221 <= local204; local221++) {
									if ((local1238 & Static12.anIntArrayArrayArray1[local233 + 1][local249][local221]) == 0) {
										break label339;
									}
								}
								local233++;
							}
							local221 = (local204 + 1 - local183) * (local233 + 1 - local217);
							if (local221 >= 8) {
								local301 = Static156.anIntArrayArrayArray6[local233][local249][local183] - 240;
								local519 = Static156.anIntArrayArrayArray6[local217][local249][local183];
								Static180.method3392(local152, 1, local249 * 128, local249 * 128, local183 * 128, local204 * 128 + 128, local301, local519);
								for (local558 = local217; local558 <= local233; local558++) {
									for (local867 = local183; local867 <= local204; local867++) {
										Static12.anIntArrayArrayArray1[local558][local249][local867] &= ~local1238;
									}
								}
							}
						}
						if ((Static12.anIntArrayArrayArray1[local154][local249][local158] & local1270) != 0) {
							for (local183 = local249; local183 > 0 && (local1270 & Static12.anIntArrayArrayArray1[local154][local183 - 1][local158]) != 0; local183--) {
							}
							local217 = local154;
							local204 = local249;
							local233 = local154;
							while (local204 < 104 && (local1270 & Static12.anIntArrayArrayArray1[local154][local204 + 1][local158]) != 0) {
								local204++;
							}
							label405: while (local217 > 0) {
								for (local221 = local183; local221 <= local204; local221++) {
									if ((local1270 & Static12.anIntArrayArrayArray1[local217 - 1][local221][local158]) == 0) {
										break label405;
									}
								}
								local217--;
							}
							label394: while (local233 < local152) {
								for (local221 = local183; local221 <= local204; local221++) {
									if ((local1270 & Static12.anIntArrayArrayArray1[local233 + 1][local221][local158]) == 0) {
										break label394;
									}
								}
								local233++;
							}
							local221 = (local233 + 1 - local217) * (local204 + 1 - local183);
							if (local221 >= 8) {
								local301 = Static156.anIntArrayArrayArray6[local233][local183][local158] - 240;
								local519 = Static156.anIntArrayArrayArray6[local217][local183][local158];
								Static180.method3392(local152, 2, local183 * 128, local204 * 128 + 128, local158 * 128, local158 * 128, local301, local519);
								for (local558 = local217; local558 <= local233; local558++) {
									for (local867 = local183; local867 <= local204; local867++) {
										Static12.anIntArrayArrayArray1[local558][local867][local158] &= ~local1270;
									}
								}
							}
						}
						if ((Static12.anIntArrayArrayArray1[local154][local249][local158] & local146) != 0) {
							local204 = local249;
							local183 = local249;
							local217 = local158;
							local233 = local158;
							while (local217 > 0 && (Static12.anIntArrayArrayArray1[local154][local249][local217 - 1] & local146) != 0) {
								local217--;
							}
							while (local233 < 104 && (Static12.anIntArrayArrayArray1[local154][local249][local233 + 1] & local146) != 0) {
								local233++;
							}
							label459: while (local183 > 0) {
								for (local221 = local217; local221 <= local233; local221++) {
									if ((local146 & Static12.anIntArrayArrayArray1[local154][local183 - 1][local221]) == 0) {
										break label459;
									}
								}
								local183--;
							}
							label448: while (local204 < 104) {
								for (local221 = local217; local221 <= local233; local221++) {
									if ((local146 & Static12.anIntArrayArrayArray1[local154][local204 + 1][local221]) == 0) {
										break label448;
									}
								}
								local204++;
							}
							if ((local233 + 1 - local217) * (local204 + 1 - local183) >= 4) {
								local221 = Static156.anIntArrayArrayArray6[local154][local183][local217];
								Static180.method3392(local152, 4, local183 * 128, local204 * 128 + 128, local217 * 128, local233 * 128 + 128, local221, local221);
								for (local227 = local183; local227 <= local204; local227++) {
									for (local301 = local217; local301 <= local233; local301++) {
										Static12.anIntArrayArrayArray1[local154][local227][local301] &= ~local146;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
	public static int method1727(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public static void method1729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(15) int[] local15 = new int[4];
		@Pc(17) int local17 = 1;
		local15[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static38.anIntArray78[local23] != arg1) {
				local8[local17] = Static38.anIntArray78[local23];
				local15[local17] = Static201.anIntArray357[local23];
				local17++;
			}
		}
		Static201.anIntArray357 = local15;
		Static38.anIntArray78 = local8;
		Static28.method512(Static90.aClass70Array1, Static38.anIntArray78, Static90.aClass70Array1.length - 1, 0, Static201.anIntArray357);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1730(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static30.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static159.aClass89_1);
		arg0.addFocusListener(Static159.aClass89_1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
	public static void method1731(@OriginalArg(0) boolean arg0) {
		Static83.aBoolean112 = arg0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(155) int local155;
		if (!Static83.aBoolean112) {
			local20 = Static18.aClass1_Sub14_Sub1_2.method3010();
			local26 = Static18.aClass1_Sub14_Sub1_2.method3034();
			local34 = (Static63.anInt3562 - Static18.aClass1_Sub14_Sub1_2.anInt4061) / 16;
			Static111.anIntArrayArray14 = new int[local34][4];
			for (local40 = 0; local40 < local34; local40++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static111.anIntArrayArray14[local40][local44] = Static18.aClass1_Sub14_Sub1_2.method3054();
				}
			}
			@Pc(68) boolean local68 = false;
			local44 = Static18.aClass1_Sub14_Sub1_2.method3023();
			local76 = Static18.aClass1_Sub14_Sub1_2.method3023();
			local80 = Static18.aClass1_Sub14_Sub1_2.method3039();
			if ((local76 / 8 == 48 || local76 / 8 == 49) && local80 / 8 == 48) {
				local68 = true;
			}
			Static176.aByteArrayArray9 = new byte[local34][];
			if (local76 / 8 == 48 && local80 / 8 == 148) {
				local68 = true;
			}
			Static118.aByteArrayArray2 = new byte[local34][];
			Static27.anIntArray54 = new int[local34];
			Static126.anIntArray202 = new int[local34];
			Static155.anIntArray258 = new int[local34];
			local34 = 0;
			for (local138 = (local76 - 6) / 8; local138 <= (local76 + 6) / 8; local138++) {
				for (local146 = (local80 - 6) / 8; local146 <= (local80 + 6) / 8; local146++) {
					local155 = (local138 << 8) + local146;
					if (!local68 || local146 != 49 && local146 != 149 && local146 != 147 && local138 != 50 && (local138 != 49 || local146 != 47)) {
						Static155.anIntArray258[local34] = local155;
						Static27.anIntArray54[local34] = Static99.aClass3_Sub1_24.method3246(Static208.method787(new Class92[] { Static202.aClass92_2017, Static49.method872(local138), Static209.aClass92_2057, Static49.method872(local146) }));
						Static126.anIntArray202[local34] = Static99.aClass3_Sub1_24.method3246(Static208.method787(new Class92[] { Static50.aClass92_1485, Static49.method872(local138), Static209.aClass92_2057, Static49.method872(local146) }));
						local34++;
					}
				}
			}
			Static33.method603(local80, local76, local26, local44, local20);
			return;
		}
		Static18.aClass1_Sub14_Sub1_2.method3063();
		for (local20 = 0; local20 < 4; local20++) {
			for (local26 = 0; local26 < 13; local26++) {
				for (local34 = 0; local34 < 13; local34++) {
					local40 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
					if (local40 == 1) {
						Static181.anIntArrayArrayArray8[local20][local26][local34] = Static18.aClass1_Sub14_Sub1_2.method3070(26);
					} else {
						Static181.anIntArrayArrayArray8[local20][local26][local34] = -1;
					}
				}
			}
		}
		Static18.aClass1_Sub14_Sub1_2.method3072();
		local26 = (Static63.anInt3562 - Static18.aClass1_Sub14_Sub1_2.anInt4061) / 16;
		Static111.anIntArrayArray14 = new int[local26][4];
		for (local34 = 0; local34 < local26; local34++) {
			for (local40 = 0; local40 < 4; local40++) {
				Static111.anIntArrayArray14[local34][local40] = Static18.aClass1_Sub14_Sub1_2.method3052();
			}
		}
		local40 = Static18.aClass1_Sub14_Sub1_2.method3034();
		local44 = Static18.aClass1_Sub14_Sub1_2.method3053();
		local76 = Static18.aClass1_Sub14_Sub1_2.method3034();
		local80 = Static18.aClass1_Sub14_Sub1_2.method3039();
		@Pc(395) int local395 = Static18.aClass1_Sub14_Sub1_2.method3027();
		Static27.anIntArray54 = new int[local26];
		Static176.aByteArrayArray9 = new byte[local26][];
		Static126.anIntArray202 = new int[local26];
		Static118.aByteArrayArray2 = new byte[local26][];
		Static155.anIntArray258 = new int[local26];
		local26 = 0;
		for (local138 = 0; local138 < 4; local138++) {
			for (local146 = 0; local146 < 13; local146++) {
				for (local155 = 0; local155 < 13; local155++) {
					@Pc(432) int local432 = Static181.anIntArrayArrayArray8[local138][local146][local155];
					if (local432 != -1) {
						@Pc(442) int local442 = local432 >> 14 & 0x3FF;
						@Pc(448) int local448 = local432 >> 3 & 0x7FF;
						@Pc(459) int local459 = (local442 / 8 << 8) + (local448 / 8);
						for (@Pc(461) int local461 = 0; local461 < local26; local461++) {
							if (local459 == Static155.anIntArray258[local461]) {
								local459 = -1;
								break;
							}
						}
						if (local459 != -1) {
							Static155.anIntArray258[local26] = local459;
							@Pc(493) int local493 = local459 >> 8 & 0xFF;
							@Pc(497) int local497 = local459 & 0xFF;
							Static27.anIntArray54[local26] = Static99.aClass3_Sub1_24.method3246(Static208.method787(new Class92[] { Static202.aClass92_2017, Static49.method872(local493), Static209.aClass92_2057, Static49.method872(local497) }));
							Static126.anIntArray202[local26] = Static99.aClass3_Sub1_24.method3246(Static208.method787(new Class92[] { Static50.aClass92_1485, Static49.method872(local493), Static209.aClass92_2057, Static49.method872(local497) }));
							local26++;
						}
					}
				}
			}
		}
		Static33.method603(local76, local40, local395, local80, local44);
	}
}
