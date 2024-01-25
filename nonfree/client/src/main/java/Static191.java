import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!gp;")
	public static Class75 aClass75_10;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public static int anInt5852;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt5842 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!bm;Lclient!en;I)V")
	public static void method5160(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class59 arg1) {
		if (Static186.aClass5_Sub9_Sub8_3 == null) {
			return;
		}
		if (Static203.anInt3932 < 10) {
			if (!Static186.aClass170_109.method4549(Static186.aClass5_Sub9_Sub8_3.aString136)) {
				Static203.anInt3932 = Static117.aClass170_52.method4579(Static186.aClass5_Sub9_Sub8_3.aString136) / 10;
				return;
			}
			Static92.method1971();
			Static203.anInt3932 = 10;
		}
		if (Static203.anInt3932 == 10) {
			Static186.anInt6012 = Static186.aClass5_Sub9_Sub8_3.anInt2227 >> 6 << 6;
			Static186.anInt6007 = Static186.aClass5_Sub9_Sub8_3.anInt2228 >> 6 << 6;
			Static186.anInt6011 = (Static186.aClass5_Sub9_Sub8_3.anInt2231 >> 6 << 6) + 64 - Static186.anInt6012;
			Static186.anInt6008 = (Static186.aClass5_Sub9_Sub8_3.anInt2226 >> 6 << 6) + 64 - Static186.anInt6007;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static186.aClass5_Sub9_Sub8_3.method2046(Static156.anInt3123, local75, Static263.anInt5063 + (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7), Static28.anInt773 - -(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7))) {
				local79 = local75[2] - Static186.anInt6012;
				local77 = local75[1] - Static186.anInt6007;
			}
			if (!Static225.aBoolean328 && local77 >= 0 && local77 < Static186.anInt6008 && local79 >= 0 && Static186.anInt6011 > local79) {
				local79 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static9.anInt302 = local79;
				Static180.anInt3602 = local77;
			} else if (Static259.anInt3208 == -1 || Static147.anInt2999 == -1) {
				Static186.aClass5_Sub9_Sub8_3.method2051(local75, Static186.aClass5_Sub9_Sub8_3.anInt2237 & 0x3FFF, Static186.aClass5_Sub9_Sub8_3.anInt2237 >> 14 & 0x3FFF);
				Static9.anInt302 = local75[2] - Static186.anInt6012;
				Static180.anInt3602 = local75[1] - Static186.anInt6007;
			} else {
				Static186.aClass5_Sub9_Sub8_3.method2051(local75, Static147.anInt2999, Static259.anInt3208);
				Static225.aBoolean328 = false;
				if (local75 != null) {
					Static180.anInt3602 = local75[1] - Static186.anInt6007;
					Static9.anInt302 = local75[2] - Static186.anInt6012;
				}
				Static147.anInt2999 = -1;
				Static259.anInt3208 = -1;
			}
			if (Static186.aClass5_Sub9_Sub8_3.anInt2234 == 37) {
				Static186.aFloat98 = 3.0F;
				Static186.aFloat99 = 3.0F;
			} else if (Static186.aClass5_Sub9_Sub8_3.anInt2234 == 50) {
				Static186.aFloat98 = 4.0F;
				Static186.aFloat99 = 4.0F;
			} else if (Static186.aClass5_Sub9_Sub8_3.anInt2234 == 75) {
				Static186.aFloat98 = 6.0F;
				Static186.aFloat99 = 6.0F;
			} else if (Static186.aClass5_Sub9_Sub8_3.anInt2234 == 100) {
				Static186.aFloat98 = 8.0F;
				Static186.aFloat99 = 8.0F;
			} else if (Static186.aClass5_Sub9_Sub8_3.anInt2234 == 200) {
				Static186.aFloat98 = 16.0F;
				Static186.aFloat99 = 16.0F;
			} else {
				Static186.aFloat98 = 8.0F;
				Static186.aFloat99 = 8.0F;
			}
			Static186.anInt6003 = (int) Static186.aFloat98 >> 1;
			Static186.aByteArrayArrayArray28 = Static180.method3328(Static186.anInt6003);
			Static228.method3919();
			Static186.method5346();
			Static99.aClass211_8 = new Class211();
			Static102.aClass191_1 = new Class191();
			Static186.anInt6001 += (int) (Math.random() * 5.0D) - 2;
			if (Static186.anInt6001 < -8) {
				Static186.anInt6001 = -8;
			}
			Static186.anInt6002 += (int) (Math.random() * 5.0D) - 2;
			if (Static186.anInt6001 > 8) {
				Static186.anInt6001 = 8;
			}
			if (Static186.anInt6002 < -16) {
				Static186.anInt6002 = -16;
			}
			if (Static186.anInt6002 > 16) {
				Static186.anInt6002 = 16;
			}
			Static186.method5364(arg0, Static186.anInt6001 >> 2 << 10, Static186.anInt6002 >> 1);
			Static270.method4560(1024, 256);
			Static178.method3306(256, 256);
			Static206.method3685(4096);
			Static117.method2313(256);
			Static203.anInt3932 = 20;
		} else if (Static203.anInt3932 == 20) {
			Static277.method4707(true);
			Static186.method5365(arg1, Static186.anInt6001, Static186.anInt6002);
			Static203.anInt3932 = 60;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 60) {
			if (Static186.aClass170_109.method4565(Static186.aClass5_Sub9_Sub8_3.aString136 + "_staticelements")) {
				if (!Static186.aClass170_109.method4549(Static186.aClass5_Sub9_Sub8_3.aString136 + "_staticelements")) {
					return;
				}
				Static186.aClass194_2 = Static278.method4730(Static186.aClass5_Sub9_Sub8_3.aString136 + "_staticelements", Static186.aClass170_109, Static32.aBoolean63);
			} else {
				Static186.aClass194_2 = new Class194(0);
			}
			Static186.method5350();
			Static203.anInt3932 = 70;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 70) {
			Static172.aClass75_5 = new Class75(arg1, 11, true, Static243.aCanvas3);
			Static203.anInt3932 = 73;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 73) {
			Static188.aClass75_6 = new Class75(arg1, 12, true, Static243.aCanvas3);
			Static203.anInt3932 = 76;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 76) {
			Static228.aClass75_8 = new Class75(arg1, 14, true, Static243.aCanvas3);
			Static203.anInt3932 = 79;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 79) {
			Static225.aClass75_7 = new Class75(arg1, 17, true, Static243.aCanvas3);
			Static203.anInt3932 = 82;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 82) {
			Static161.aClass75_4 = new Class75(arg1, 19, true, Static243.aCanvas3);
			Static203.anInt3932 = 85;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 85) {
			Static106.aClass75_1 = new Class75(arg1, 22, true, Static243.aCanvas3);
			Static203.anInt3932 = 88;
			Static277.method4707(true);
			Static209.method3724();
		} else if (Static203.anInt3932 == 88) {
			Static302.aClass75_9 = new Class75(arg1, 26, true, Static243.aCanvas3);
			Static203.anInt3932 = 91;
			Static277.method4707(true);
			Static209.method3724();
		} else {
			aClass75_10 = new Class75(arg1, 30, true, Static243.aCanvas3);
			Static203.anInt3932 = 100;
			Static277.method4707(true);
			Static209.method3724();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public static void method5163() {
		Static6.aClass5_Sub1_Sub1_1.method178();
		@Pc(11) int local11 = Static6.aClass5_Sub1_Sub1_1.method182(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static6.aClass5_Sub1_Sub1_1.method182(2);
		if (local22 == 0) {
			Static178.anIntArray266[Static47.anInt1211++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local22 == 1) {
			local48 = Static6.aClass5_Sub1_Sub1_1.method182(3);
			Static85.aClass25_Sub1_Sub1_Sub1_1.method4656(1, local48);
			local58 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			if (local58 == 1) {
				Static178.anIntArray266[Static47.anInt1211++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static6.aClass5_Sub1_Sub1_1.method182(1) == 1) {
				local48 = Static6.aClass5_Sub1_Sub1_1.method182(3);
				Static85.aClass25_Sub1_Sub1_Sub1_1.method4656(2, local48);
				local58 = Static6.aClass5_Sub1_Sub1_1.method182(3);
				Static85.aClass25_Sub1_Sub1_Sub1_1.method4656(2, local58);
			} else {
				local48 = Static6.aClass5_Sub1_Sub1_1.method182(3);
				Static85.aClass25_Sub1_Sub1_Sub1_1.method4656(0, local48);
			}
			local48 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			if (local48 == 1) {
				Static178.anIntArray266[Static47.anInt1211++] = 2047;
			}
		} else if (local22 == 3) {
			local48 = Static6.aClass5_Sub1_Sub1_1.method182(7);
			local58 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			if (local58 == 1) {
				Static178.anIntArray266[Static47.anInt1211++] = 2047;
			}
			@Pc(171) int local171 = Static6.aClass5_Sub1_Sub1_1.method182(7);
			Static156.anInt3123 = Static6.aClass5_Sub1_Sub1_1.method182(2);
			@Pc(181) int local181 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			Static85.aClass25_Sub1_Sub1_Sub1_1.method3684(local48, local181 == 1, local171, Static156.anInt3123);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!nj;)V")
	public static void method5167(@OriginalArg(1) Class25_Sub1_Sub1_Sub1 arg0) {
		if (Static27.anInt5324 >= 400 || Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0) {
			return;
		}
		@Pc(39) String local39;
		@Pc(94) int local94;
		if (arg0.anInt4089 == 0) {
			@Pc(43) boolean local43 = true;
			if (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4063 != -1 && arg0.anInt4063 != -1) {
				@Pc(67) int local67 = arg0.anInt4070 >= Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070 ? arg0.anInt4070 : Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070;
				@Pc(82) int local82 = arg0.anInt4063 > Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4063 ? Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4063 : arg0.anInt4063;
				local94 = local67 * 10 / 100 + local82 + 5;
				@Pc(101) int local101 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070 - arg0.anInt4070;
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local94 < local101) {
					local43 = false;
				}
			}
			@Pc(127) String local127 = Static298.anInt5725 == 1 ? Static195.aString226 : Static27.aString306;
			if (arg0.anInt4070 < arg0.anInt4077) {
				local39 = arg0.method3679() + (local43 ? Static44.method3566(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070, arg0.anInt4070) : "<col=ffffff>") + " (" + local127 + arg0.anInt4070 + "+" + (arg0.anInt4077 - arg0.anInt4070) + ")";
			} else {
				local39 = arg0.method3679() + (local43 ? Static44.method3566(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070, arg0.anInt4070) : "<col=ffffff>") + " (" + local127 + arg0.anInt4070 + ")";
			}
		} else {
			local39 = arg0.method3679() + " (" + Static32.aString52 + arg0.anInt4089 + ")";
		}
		if (Static100.anInt2199 == 1) {
			Static345.method5684(58, Static121.aString166, Static332.aString362 + " -> <col=ffffff>" + local39, Static100.anInt2198, 0, 0, (long) arg0.anInt5287);
		} else if (!Static20.aBoolean40) {
			for (@Pc(216) int local216 = 7; local216 >= 0; local216--) {
				if (Static47.aStringArray4[local216] != null) {
					@Pc(224) short local224 = 0;
					if (Static298.anInt5725 == 0 && Static47.aStringArray4[local216].equalsIgnoreCase(Static248.aString284)) {
						if (arg0.anInt4070 > Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070) {
							local224 = 2000;
						}
						if (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4068 != 0 && arg0.anInt4068 != 0) {
							if (arg0.anInt4068 == Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4068) {
								local224 = 2000;
							} else {
								local224 = 0;
							}
						}
					} else if (Static226.aBooleanArray18[local216]) {
						local224 = 2000;
					}
					@Pc(279) short local279 = (short) (local224 + Static160.aShortArray36[local216]);
					local94 = Static297.anIntArray439[local216] == -1 ? Static333.anInt4630 : Static297.anIntArray439[local216];
					Static345.method5684(local279, Static47.aStringArray4[local216], "<col=ffffff>" + local39, local94, 0, 0, (long) arg0.anInt5287);
				}
			}
		} else if ((Static240.anInt4648 & 0x8) != 0) {
			Static345.method5684(31, Static221.aString254, Static111.aString151 + " -> <col=ffffff>" + local39, Static258.anInt5020, 0, 0, (long) arg0.anInt5287);
		}
		for (@Pc(381) Class5_Sub4 local381 = (Class5_Sub4) Static60.aClass211_4.method5608(); local381 != null; local381 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			if (local381.anInt785 == 59) {
				local381.aString48 = "<col=ffffff>" + local39;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public static void method5173() {
		@Pc(1) Class66 local1 = Static37.aClass66_10;
		synchronized (Static37.aClass66_10) {
			Static37.aClass66_10.method1944(5);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V")
	public static void method5178(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static32.aByteArrayArrayArray4 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5193(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static359.method756(arg0, 0, local14, 0, local11);
		return local14;
	}
}
