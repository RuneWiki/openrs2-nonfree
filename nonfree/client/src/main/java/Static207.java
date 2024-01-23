import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!di;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1508 = Static200.method3116("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1509 = null;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public static void method3209() {
		Static148.anImage44 = null;
		Static54.aFontMetrics1 = null;
		Static177.aFont1 = null;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
	public static void method3210() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static153.aBooleanArray19[local3] = true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)I")
	public static int method3211(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BIIIII[Lclient!ab;IZII)V")
	public static void method3213(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3[] arg6, @OriginalArg(7) int arg7, @OriginalArg(10) int arg8) {
		@Pc(21) int local21;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (local21 = 0; local21 < 8; local21++) {
				if (arg3 + local17 > 0 && arg3 + local17 < 103 && arg5 + local21 > 0 && arg5 + local21 < 103) {
					arg6[arg4].anIntArrayArray1[local17 + arg3][local21 + arg5] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(90) Class1_Sub9 local90 = new Class1_Sub9(arg0);
		for (local21 = 0; local21 < 4; local21++) {
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
					if (local21 == arg7 && local96 >= arg1 && arg1 + 8 > local96 && arg2 <= local100 && local100 < arg2 + 8) {
						Static44.method762(local90, arg8, 0, arg4, 0, arg5 + Static95.method2548(local100 & 0x7, local96 & 0x7, arg8), arg3 - -Static26.method429(local100 & 0x7, local96 & 0x7, arg8));
					} else {
						Static44.method762(local90, 0, 0, 0, 0, -1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[Lclient!ab;Z)V")
	public static void method3214(@OriginalArg(1) Class3[] arg0) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		for (local13 = 0; local13 < 4; local13++) {
			for (local17 = 0; local17 < 104; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 104; local21++) {
					if ((Static209.aByteArrayArrayArray13[local13][local17][local21] & 0x1) == 1) {
						@Pc(36) int local36 = local13;
						if ((Static209.aByteArrayArrayArray13[1][local17][local21] & 0x2) == 2) {
							local36 = local13 - 1;
						}
						if (local36 >= 0) {
							arg0[local36].method41(local17, local21);
						}
					}
				}
			}
		}
		Static142.anInt3199 += (int) (Math.random() * 5.0D) - 2;
		if (Static142.anInt3199 < -8) {
			Static142.anInt3199 = -8;
		}
		if (Static142.anInt3199 > 8) {
			Static142.anInt3199 = 8;
		}
		Static19.anInt473 += (int) (Math.random() * 5.0D) - 2;
		if (Static19.anInt473 < -16) {
			Static19.anInt473 = -16;
		}
		if (Static19.anInt473 > 16) {
			Static19.anInt473 = 16;
		}
		local13 = Static142.anInt3199 >> 2 << 10;
		local17 = Static19.anInt473 >> 1;
		@Pc(127) int[][] local127 = new int[104][104];
		@Pc(131) int[][] local131 = new int[104][104];
		@Pc(147) int local147;
		@Pc(153) int local153;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(250) int local250;
		@Pc(184) int local184;
		@Pc(205) int local205;
		@Pc(218) int local218;
		@Pc(230) int local230;
		@Pc(234) int local234;
		@Pc(224) int local224;
		@Pc(298) int local298;
		@Pc(519) int local519;
		@Pc(515) int local515;
		@Pc(857) int local857;
		for (@Pc(133) int local133 = 0; local133 < 4; local133++) {
			@Pc(139) byte[][] local139 = Static201.aByteArrayArrayArray12[local133];
			local147 = (int) Math.sqrt(5100.0D);
			local153 = local147 * 768 >> 8;
			for (local155 = 1; local155 < 103; local155++) {
				for (local159 = 1; local159 < 103; local159++) {
					local184 = Static138.anIntArrayArrayArray17[local133][local159 + 1][local155] - Static138.anIntArrayArrayArray17[local133][local159 - 1][local155];
					local205 = Static138.anIntArrayArrayArray17[local133][local159][local155 + 1] - Static138.anIntArrayArrayArray17[local133][local159][local155 - 1];
					local218 = (int) Math.sqrt((double) (local205 * local205 + local184 * local184 + 65536));
					local224 = (local205 << 8) / local218;
					local230 = (local184 << 8) / local218;
					local234 = -65536 / local218;
					local250 = (local224 * -50 + local234 * -10 + local230 * -50) / local153 + 74;
					local298 = (local139[local159][local155] >> 1) + (local139[local159][local155 + 1] >> 3) + (local139[local159][local155 + -1] >> 2) + (local139[local159 - -1][local155] >> 3) + (local139[local159 - 1][local155] >> 2);
					local127[local159][local155] = local250 - local298;
				}
			}
			for (local159 = 0; local159 < 104; local159++) {
				Static80.anIntArray222[local159] = 0;
				Static148.anIntArray653[local159] = 0;
				Static163.anIntArray464[local159] = 0;
				Static160.anIntArray459[local159] = 0;
				Static125.anIntArray357[local159] = 0;
			}
			for (local250 = -5; local250 < 104; local250++) {
				for (local184 = 0; local184 < 104; local184++) {
					local205 = local250 + 5;
					@Pc(419) int local419;
					if (local205 < 104) {
						local218 = Static173.aByteArrayArrayArray8[local133][local205][local184] & 0xFF;
						if (local218 > 0) {
							@Pc(383) Class1_Sub1_Sub24 local383 = Static171.method2785(local218 - 1);
							Static80.anIntArray222[local184] += local383.anInt4119;
							Static148.anIntArray653[local184] += local383.anInt4122;
							Static163.anIntArray464[local184] += local383.anInt4120;
							Static160.anIntArray459[local184] += local383.anInt4117;
							local419 = Static125.anIntArray357[local184]++;
						}
					}
					local218 = local250 - 5;
					if (local218 >= 0) {
						local230 = Static173.aByteArrayArrayArray8[local133][local218][local184] & 0xFF;
						if (local230 > 0) {
							@Pc(449) Class1_Sub1_Sub24 local449 = Static171.method2785(local230 - 1);
							Static80.anIntArray222[local184] -= local449.anInt4119;
							Static148.anIntArray653[local184] -= local449.anInt4122;
							Static163.anIntArray464[local184] -= local449.anInt4120;
							Static160.anIntArray459[local184] -= local449.anInt4117;
							local419 = Static125.anIntArray357[local184]--;
						}
					}
				}
				if (local250 >= 0) {
					local205 = 0;
					local218 = 0;
					local230 = 0;
					local234 = 0;
					local224 = 0;
					for (local298 = -5; local298 < 104; local298++) {
						local515 = local298 - 5;
						local519 = local298 + 5;
						if (local519 < 104) {
							local230 += Static163.anIntArray464[local519];
							local224 += Static125.anIntArray357[local519];
							local234 += Static160.anIntArray459[local519];
							local205 += Static80.anIntArray222[local519];
							local218 += Static148.anIntArray653[local519];
						}
						if (local515 >= 0) {
							local234 -= Static160.anIntArray459[local515];
							local205 -= Static80.anIntArray222[local515];
							local224 -= Static125.anIntArray357[local515];
							local230 -= Static163.anIntArray464[local515];
							local218 -= Static148.anIntArray653[local515];
						}
						if (local298 >= 0 && local224 > 0) {
							local131[local250][local298] = Static115.method1973(local218 / local224, local205 * 256 / local234, local230 / local224);
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local205 = 1; local205 < 103; local205++) {
					if (!Static148.aBoolean266 || (Static209.aByteArrayArrayArray13[0][local184][local205] & 0x2) != 0 || (Static209.aByteArrayArrayArray13[local133][local184][local205] & 0x10) == 0 && Static38.method662(local205, local133, local184) == Static204.anInt4327) {
						if (Static30.anInt722 > local133) {
							Static30.anInt722 = local133;
						}
						local230 = Static66.aByteArrayArrayArray1[local133][local184][local205] & 0xFF;
						local218 = Static173.aByteArrayArrayArray8[local133][local184][local205] & 0xFF;
						if (local218 > 0 || local230 > 0) {
							local234 = Static138.anIntArrayArrayArray17[local133][local184][local205];
							local224 = Static138.anIntArrayArrayArray17[local133][local184 + 1][local205];
							local298 = Static138.anIntArrayArrayArray17[local133][local184 + 1][local205 + 1];
							local519 = Static138.anIntArrayArrayArray17[local133][local184][local205 + 1];
							if (local133 > 0) {
								@Pc(751) boolean local751 = true;
								if (local218 == 0 && Static108.aByteArrayArrayArray4[local133][local184][local205] != 0) {
									local751 = false;
								}
								if (local230 > 0 && !Static129.method887(local230 - 1).aBoolean150) {
									local751 = false;
								}
								if (local751 && local224 == local234 && local298 == local234 && local519 == local234) {
									Static36.anIntArrayArrayArray22[local133][local184][local205] |= 0x924;
								}
							}
							@Pc(824) int local824;
							@Pc(850) int local850;
							if (local218 > 0) {
								local515 = local131[local184][local205];
								local824 = local17 + (local515 & 0x7F);
								if (local824 < 0) {
									local824 = 0;
								} else if (local824 > 127) {
									local824 = 127;
								}
								local850 = local824 + (local515 & 0x380) + (local515 - -local13 & 0xFC00);
								local857 = Static81.anIntArray227[Static184.method2916(local850, 96)];
							} else {
								local857 = 0;
								local515 = -1;
							}
							local824 = local127[local184][local205];
							@Pc(879) int local879 = local127[local184 + 1][local205 + 1];
							local850 = local127[local184 + 1][local205];
							@Pc(895) int local895 = local127[local184][local205 + 1];
							if (local230 == 0) {
								Static202.method3127(local133, local184, local205, 0, 0, -1, local234, local224, local298, local519, Static184.method2916(local515, local824), Static184.method2916(local515, local850), Static184.method2916(local515, local879), Static184.method2916(local515, local895), 0, 0, 0, 0, local857, 0);
							} else {
								@Pc(942) int local942 = Static108.aByteArrayArrayArray4[local133][local184][local205] + 1;
								@Pc(950) byte local950 = Static100.aByteArrayArrayArray3[local133][local184][local205];
								@Pc(956) Class1_Sub1_Sub13 local956 = Static129.method887(local230 - 1);
								if (Static54.anIntArrayArray20 != null && local133 == 0) {
									Static54.anIntArrayArray20[local184][local205] = (local956.anInt2685 << 24) + local956.anInt2682;
								}
								@Pc(977) int local977 = local956.anInt2683;
								if (local977 >= 0 && !Static81.anInterface1_1.method1246(local977)) {
									local977 = -1;
								}
								@Pc(1003) int local1003;
								@Pc(1001) int local1001;
								@Pc(1018) int local1018;
								@Pc(1042) int local1042;
								if (local977 >= 0) {
									local1001 = Static81.anIntArray227[Static159.method2684(Static81.anInterface1_1.method1250(local977), 96)];
									local1003 = -1;
								} else if (local956.anInt2687 == -1) {
									local1001 = 0;
									local1003 = -2;
								} else {
									local1003 = local956.anInt2687;
									local1018 = local17 + (local1003 & 0x7F);
									if (local1018 < 0) {
										local1018 = 0;
									} else if (local1018 > 127) {
										local1018 = 127;
									}
									local1042 = (local1003 & 0x380) + (local13 + local1003 & 0xFC00) + local1018;
									local1001 = Static81.anIntArray227[Static159.method2684(local1042, 96)];
								}
								if (local956.anInt2688 >= 0) {
									local1018 = local956.anInt2688;
									local1042 = local17 + (local1018 & 0x7F);
									if (local1042 < 0) {
										local1042 = 0;
									} else if (local1042 > 127) {
										local1042 = 127;
									}
									@Pc(1091) int local1091 = (local13 + local1018 & 0xFC00) - (-(local1018 & 0x380) - local1042);
									local1001 = Static81.anIntArray227[Static159.method2684(local1091, 96)];
								}
								Static202.method3127(local133, local184, local205, local942, local950, local977, local234, local224, local298, local519, Static184.method2916(local515, local824), Static184.method2916(local515, local850), Static184.method2916(local515, local879), Static184.method2916(local515, local895), Static159.method2684(local1003, local824), Static159.method2684(local1003, local850), Static159.method2684(local1003, local879), Static159.method2684(local1003, local895), local857, local1001);
							}
						}
					}
				}
			}
			for (local205 = 1; local205 < 103; local205++) {
				for (local218 = 1; local218 < 103; local218++) {
					Static203.method3160(local133, local218, local205, Static38.method662(local205, local133, local218));
				}
			}
			Static173.aByteArrayArrayArray8[local133] = null;
			Static66.aByteArrayArrayArray1[local133] = null;
			Static108.aByteArrayArrayArray4[local133] = null;
			Static100.aByteArrayArrayArray3[local133] = null;
			Static201.aByteArrayArrayArray12[local133] = null;
		}
		Static214.method3355();
		@Pc(1223) int local1223;
		for (@Pc(1219) int local1219 = 0; local1219 < 104; local1219++) {
			for (local1223 = 0; local1223 < 104; local1223++) {
				if ((Static209.aByteArrayArrayArray13[1][local1219][local1223] & 0x2) == 2) {
					Static1.method28(local1219, local1223);
				}
			}
		}
		@Pc(1251) int local1251 = 2;
		local147 = 4;
		local1223 = 1;
		for (local153 = 0; local153 < 4; local153++) {
			if (local153 > 0) {
				local1251 <<= 0x3;
				local147 <<= 0x3;
				local1223 <<= 0x3;
			}
			for (local155 = 0; local155 <= local153; local155++) {
				for (local159 = 0; local159 <= 104; local159++) {
					for (local250 = 0; local250 <= 104; local250++) {
						if ((local1223 & Static36.anIntArrayArrayArray22[local155][local250][local159]) != 0) {
							local184 = local159;
							local205 = local159;
							while (local184 > 0 && (local1223 & Static36.anIntArrayArrayArray22[local155][local250][local184 - 1]) != 0) {
								local184--;
							}
							while (local205 < 104 && (Static36.anIntArrayArrayArray22[local155][local250][local205 + 1] & local1223) != 0) {
								local205++;
							}
							local230 = local155;
							label356: for (local218 = local155; local218 > 0; local218--) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static36.anIntArrayArrayArray22[local218 - 1][local250][local234] & local1223) == 0) {
										break label356;
									}
								}
							}
							label345: while (local153 > local230) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static36.anIntArrayArrayArray22[local230 + 1][local250][local234] & local1223) == 0) {
										break label345;
									}
								}
								local230++;
							}
							local234 = (local205 + 1 - local184) * (local230 + 1 - local218);
							if (local234 >= 8) {
								local519 = Static138.anIntArrayArrayArray17[local218][local250][local184];
								local298 = Static138.anIntArrayArrayArray17[local230][local250][local184] - 240;
								Static63.method1147(local153, 1, local250 * 128, local250 * 128, local184 * 128, local205 * 128 + 128, local298, local519);
								for (local515 = local218; local515 <= local230; local515++) {
									for (local857 = local184; local857 <= local205; local857++) {
										Static36.anIntArrayArrayArray22[local515][local250][local857] &= ~local1223;
									}
								}
							}
						}
						if ((Static36.anIntArrayArrayArray22[local155][local250][local159] & local1251) != 0) {
							for (local184 = local250; local184 > 0 && (local1251 & Static36.anIntArrayArrayArray22[local155][local184 - 1][local159]) != 0; local184--) {
							}
							local205 = local250;
							local218 = local155;
							local230 = local155;
							while (local205 < 104 && (Static36.anIntArrayArrayArray22[local155][local205 + 1][local159] & local1251) != 0) {
								local205++;
							}
							label410: while (local218 > 0) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static36.anIntArrayArrayArray22[local218 - 1][local234][local159] & local1251) == 0) {
										break label410;
									}
								}
								local218--;
							}
							label399: while (local153 > local230) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((local1251 & Static36.anIntArrayArrayArray22[local230 + 1][local234][local159]) == 0) {
										break label399;
									}
								}
								local230++;
							}
							local234 = (local205 + 1 - local184) * (local230 + 1 - local218);
							if (local234 >= 8) {
								local298 = Static138.anIntArrayArrayArray17[local230][local184][local159] - 240;
								local519 = Static138.anIntArrayArrayArray17[local218][local184][local159];
								Static63.method1147(local153, 2, local184 * 128, local205 * 128 + 128, local159 * 128, local159 * 128, local298, local519);
								for (local515 = local218; local515 <= local230; local515++) {
									for (local857 = local184; local857 <= local205; local857++) {
										Static36.anIntArrayArrayArray22[local515][local857][local159] &= ~local1251;
									}
								}
							}
						}
						if ((Static36.anIntArrayArrayArray22[local155][local250][local159] & local147) != 0) {
							local184 = local250;
							for (local218 = local159; local218 > 0 && (local147 & Static36.anIntArrayArrayArray22[local155][local250][local218 - 1]) != 0; local218--) {
							}
							local205 = local250;
							for (local230 = local159; local230 < 104 && (Static36.anIntArrayArrayArray22[local155][local250][local230 + 1] & local147) != 0; local230++) {
							}
							label464: while (local184 > 0) {
								for (local234 = local218; local234 <= local230; local234++) {
									if ((local147 & Static36.anIntArrayArrayArray22[local155][local184 - 1][local234]) == 0) {
										break label464;
									}
								}
								local184--;
							}
							label453: while (local205 < 104) {
								for (local234 = local218; local234 <= local230; local234++) {
									if ((local147 & Static36.anIntArrayArrayArray22[local155][local205 + 1][local234]) == 0) {
										break label453;
									}
								}
								local205++;
							}
							if ((local205 + 1 - local184) * (local230 + -local218 + 1) >= 4) {
								local234 = Static138.anIntArrayArrayArray17[local155][local184][local218];
								Static63.method1147(local153, 4, local184 * 128, local205 * 128 + 128, local218 * 128, local230 * 128 + 128, local234, local234);
								for (local224 = local184; local224 <= local205; local224++) {
									for (local298 = local218; local298 <= local230; local298++) {
										Static36.anIntArrayArrayArray22[local155][local224][local298] &= ~local147;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method3215() {
		Static23.aBoolean144 = true;
		Static148.aBoolean266 = true;
	}
}
