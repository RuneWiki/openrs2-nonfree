import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt3772;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_106 = new Class12(92, 12);

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_107 = new Class12(33, 20);

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!jk;")
	public static Class124 aClass124_4 = null;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_150 = new Class103(53, 7);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[BBI)Z")
	public static boolean method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub28 local17 = new Class1_Sub28(arg3);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method5354();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method5392();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method5337() >> 2;
					@Pc(85) int local85 = arg0 + local75;
					@Pc(90) int local90 = local69 + arg1;
					if (local85 > 0 && local90 > 0 && arg4 - 1 > local85 && local90 < arg2 - 1) {
						@Pc(109) Class68 local109 = Static341.aClass75_4.method1616(local19);
						if (local81 != 22 || Static453.aClass136_Sub1_1.aBoolean512 || local109.anInt1821 != 0 || local109.anInt1831 == 1 || local109.aBoolean210) {
							if (!local109.method1549()) {
								local12 = false;
								Static368.anInt6205++;
							}
							local36 = true;
						}
					}
				}
				local42 = local17.method5392();
				if (local42 == 0) {
					break;
				}
				local17.method5337();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
	public static int method3092(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public static void method3094() {
		if (Static58.anInt1166 == 0 || Static58.anInt1166 == 5) {
			return;
		}
		try {
			if (++Static223.anInt5841 > 2000) {
				if (Static395.aClass131_3 != null) {
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
				}
				if (Static271.anInt7119 >= 1) {
					Static58.anInt1166 = 0;
					Static30.method393(-5);
					return;
				}
				Static271.anInt7119++;
				Static223.anInt5841 = 0;
				if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
					Static259.aClass156_4.aBoolean517 = !Static259.aClass156_4.aBoolean517;
				} else {
					Static95.aClass156_2.aBoolean517 = !Static95.aClass156_2.aBoolean517;
				}
				Static58.anInt1166 = 1;
			}
			if (Static58.anInt1166 == 1) {
				if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
					Static379.aClass232_7 = Static183.aClass83_2.method1856(Static259.aClass156_4.method3552(), Static259.aClass156_4.aString53);
				} else {
					Static379.aClass232_7 = Static183.aClass83_2.method1856(Static95.aClass156_2.method3552(), Static95.aClass156_2.aString53);
				}
				Static58.anInt1166 = 2;
			}
			if (Static58.anInt1166 == 2) {
				if (Static379.aClass232_7.anInt6402 == 2) {
					throw new IOException();
				}
				if (Static379.aClass232_7.anInt6402 != 1) {
					return;
				}
				Static395.aClass131_3 = new Class131((Socket) Static379.aClass232_7.anObject8, Static183.aClass83_2);
				Static379.aClass232_7 = null;
				@Pc(140) long local140 = Static7.aLong5 = Static415.method5404(Static109.aString58);
				Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
				@Pc(150) int local150 = (int) (local140 >> 16 & 0x1FL);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static180.aClass99_1.anInt2588);
				Static18.aClass1_Sub28_Sub1_1.method5398(local150);
				Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, 2);
				Static226.method3261();
				@Pc(172) int local172 = Static395.aClass131_3.method2934();
				Static226.method3261();
				if (local172 != 0) {
					Static58.anInt1166 = 0;
					Static30.method393(local172);
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					Static125.method1992();
					return;
				}
				Static58.anInt1166 = 3;
			}
			if (Static58.anInt1166 == 3) {
				if (Static395.aClass131_3.method2932() < 8) {
					return;
				}
				Static395.aClass131_3.method2929(0, 8, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
				Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
				Static126.aLong69 = Static336.aClass1_Sub28_Sub1_2.method5340();
				@Pc(232) Class1_Sub28 local232 = new Class1_Sub28(70);
				@Pc(235) int[] local235 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static126.aLong69 >> 32), (int) Static126.aLong69 };
				local232.method5398(10);
				local232.method5347(local235[0]);
				local232.method5347(local235[1]);
				local232.method5347(local235[2]);
				local232.method5347(local235[3]);
				local232.method5371(Static415.method5404(Static109.aString58));
				local232.method5364(Static47.aString8);
				local232.method5373(Static125.aBigInteger1, Static139.aBigInteger2);
				@Pc(306) Class1_Sub28_Sub1 local306 = Static18.aClass1_Sub28_Sub1_1;
				local306.anInt6812 = 0;
				@Pc(337) int local337;
				if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
					if (Static312.anInt5414 == 12) {
						local306.method5398(Static180.aClass99_5.anInt2588);
					} else {
						local306.method5398(Static180.aClass99_3.anInt2588);
					}
					local306.method5393(0);
					local337 = local306.anInt6812;
					local306.method5347(596);
					local306.method5398(Static333.anInt5694);
					local306.method5398(Static101.method1560());
					local306.method5393(Static69.anInt1304);
					local306.method5393(Static338.anInt5777);
					local306.method5398(Static453.aClass136_Sub1_1.anInt4443);
					Static368.method4890(local306);
					local306.method5364(Static87.aString74);
					local306.method5347(Static83.anInt1575);
					@Pc(378) Class1_Sub28 local378 = Static453.aClass136_Sub1_1.method3525();
					local306.method5398(local378.anInt6812);
					local306.method5387(local378.aByteArray86, local378.anInt6812);
					Static303.aBoolean816 = true;
					local306.method5393(Static8.anInt128);
					Static97.method1505();
					local306.method5387(local232.aByteArray86, local232.anInt6812);
					local306.method5386(local306.anInt6812 - local337);
				} else {
					local306.method5398(Static180.aClass99_6.anInt2588);
					local306.method5393(0);
					local337 = local306.anInt6812;
					local306.method5347(596);
					local306.method5398(Static183.aClass48_3.anInt1229);
					local306.method5398(Static394.anInt6582);
					Static368.method4890(local306);
					local306.method5364(Static87.aString74);
					local306.method5347(Static83.anInt1575);
					Static97.method1505();
					local306.method5387(local232.aByteArray86, local232.anInt6812);
					local306.method5386(local306.anInt6812 - local337);
				}
				Static395.aClass131_3.method2928(local306.aByteArray86, local306.anInt6812);
				local306.method3082(local235);
				for (local337 = 0; local337 < 4; local337++) {
					local235[local337] += 50;
				}
				Static336.aClass1_Sub28_Sub1_2.method3082(local235);
				Static58.anInt1166 = 4;
			}
			@Pc(521) int local521;
			if (Static58.anInt1166 == 4) {
				if (Static395.aClass131_3.method2932() < 1) {
					return;
				}
				local521 = Static395.aClass131_3.method2934();
				if (local521 == 21) {
					Static58.anInt1166 = 7;
				} else if (local521 == 29) {
					Static58.anInt1166 = 13;
				} else if (local521 == 1) {
					Static58.anInt1166 = 5;
					Static30.method393(local521);
					return;
				} else if (local521 == 2) {
					Static58.anInt1166 = 8;
				} else if (local521 == 15) {
					Static58.anInt1166 = 14;
					Static245.anInt4432 = -2;
				} else if (local521 == 23 && Static271.anInt7119 < 1) {
					Static271.anInt7119++;
					Static223.anInt5841 = 0;
					Static58.anInt1166 = 1;
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					return;
				} else {
					Static58.anInt1166 = 0;
					Static30.method393(local521);
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					Static125.method1992();
					return;
				}
			}
			if (Static58.anInt1166 == 6) {
				Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
				Static18.aClass1_Sub28_Sub1_1.method3078(Static180.aClass99_4.anInt2588);
				Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, Static18.aClass1_Sub28_Sub1_1.anInt6812);
				Static58.anInt1166 = 4;
			} else if (Static58.anInt1166 == 7) {
				if (Static395.aClass131_3.method2932() >= 1) {
					Static283.anInt4985 = (Static395.aClass131_3.method2934() + 3) * 60;
					Static58.anInt1166 = 0;
					Static30.method393(21);
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					Static125.method1992();
				}
			} else if (Static58.anInt1166 == 13) {
				if (Static395.aClass131_3.method2932() >= 1) {
					Static41.anInt714 = Static395.aClass131_3.method2934();
					Static58.anInt1166 = 0;
					Static30.method393(29);
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					Static125.method1992();
				}
			} else if (Static58.anInt1166 != 8) {
				@Pc(715) Class1_Sub28_Sub1 local715;
				if (Static58.anInt1166 == 9) {
					if (Static337.anInt5743 == 3) {
						Static13.aBoolean28 = true;
					} else {
						Static13.aBoolean28 = false;
					}
					local715 = Static336.aClass1_Sub28_Sub1_2;
					if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
						if (Static395.aClass131_3.method2932() < Static425.anInt7177) {
							return;
						}
						Static395.aClass131_3.method2929(0, Static425.anInt7177, local715.aByteArray86);
						local715.anInt6812 = 0;
						Static154.anInt2601 = local715.method5337();
						Static63.anInt1205 = local715.method5337();
						Static361.aBoolean690 = local715.method5337() == 1;
						Static241.aBoolean491 = local715.method5337() == 1;
						Static213.aBoolean26 = local715.method5337() == 1;
						Static336.aBoolean652 = local715.method5337() == 1;
						Static296.anInt5181 = local715.method5335();
						Static334.aBoolean649 = local715.method5337() == 1;
						Static93.anInt1674 = local715.method5389();
						Static337.aBoolean654 = local715.method5337() == 1;
						if (Static337.anInt5743 == 3) {
							@Pc(1002) boolean local1002 = local715.method5337() == 1;
							if (local1002) {
								@Pc(1008) long local1008 = local715.method5340();
								@Pc(1012) String local1012 = Static444.method5831(local1008);
								@Pc(1016) int local1016 = local715.method5337();
								@Pc(1019) byte[] local1019 = new byte[local1016];
								local715.method3087(local1019, local1016);
								@Pc(1029) String local1029 = Static164.method2371(local1019);
								@Pc(1031) Class98 local1031 = null;
								try {
									@Pc(1037) Class232 local1037 = Static183.aClass83_2.method1877("3", false);
									while (local1037.anInt6402 == 0) {
										Static223.method4582(1L);
									}
									if (local1037.anInt6402 == 1) {
										local1031 = (Class98) local1037.anObject8;
										@Pc(1068) int local1068 = local1012.length() + local1029.length() + 2 + 3 + 4;
										if (local1068 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1086) Class1_Sub28 local1086 = new Class1_Sub28(local1068 + 1);
										local1086.method5398(local1068);
										local1086.method5398(0);
										local1086.method5351(local1012);
										local1086.method5351(local1029);
										local1086.method5362();
										local1031.method2221(0, local1086.anInt6812, local1086.aByteArray86);
									}
								} catch (@Pc(1116) Exception local1116) {
								}
								try {
									if (local1031 != null) {
										local1031.method2224();
									}
								} catch (@Pc(1123) Exception local1123) {
								}
							}
						}
						Static341.aClass75_4.method1617(Static337.aBoolean654);
						Static342.aClass155_2.method3536(Static337.aBoolean654);
						Static161.aClass231_2.method5021(Static337.aBoolean654);
					} else if (Static395.aClass131_3.method2932() >= Static425.anInt7177) {
						Static395.aClass131_3.method2929(0, Static425.anInt7177, local715.aByteArray86);
						local715.anInt6812 = 0;
						Static154.anInt2601 = local715.method5337();
						Static63.anInt1205 = local715.method5337();
						Static361.aBoolean690 = local715.method5337() == 1;
						Static241.aBoolean491 = local715.method5337() == 1;
						Static213.aBoolean26 = local715.method5337() == 1;
						Static190.anInt3295 = local715.method5335();
						Static334.aBoolean649 = Static190.anInt3295 > 0;
						Static357.anInt6118 = local715.method5335();
						Static58.anInt1165 = local715.method5335();
						Static346.anInt5939 = local715.method5335();
						Static189.anInt3267 = local715.method5355();
						Static8.aClass232_1 = Static183.aClass83_2.method1880(Static189.anInt3267);
						Static151.anInt2589 = local715.method5337();
						Static399.anInt6635 = local715.method5335();
						Static330.anInt5624 = local715.method5335();
						Static79.aBoolean166 = local715.method5337() == 1;
						Static447.aClass25_Sub5_Sub1_Sub2_4.aString51 = Static447.aClass25_Sub5_Sub1_Sub2_4.aString52 = local715.method5369();
						Static89.aClass156_1 = new Class156();
						Static89.aClass156_1.anInt4501 = local715.method5335();
						if (Static89.aClass156_1.anInt4501 == 65535) {
							Static89.aClass156_1.anInt4501 = -1;
						}
						Static89.aClass156_1.aString53 = local715.method5369();
						if (Static459.aClass30_13 != Static328.aClass30_10) {
							Static89.aClass156_1.anInt4508 = Static89.aClass156_1.anInt4501 + 40000;
							Static89.aClass156_1.anInt4505 = Static89.aClass156_1.anInt4501 + 50000;
						}
						if (Static38.aClass30_1 != Static328.aClass30_10 && (Static259.aClass156_4.method3553(Static437.aClass156_5) || Static259.aClass156_4.method3553(Static217.aClass156_3))) {
							Static259.aClass156_4 = Static89.aClass156_1;
						}
					} else {
						return;
					}
					if (Static361.aBoolean690 && !Static213.aBoolean26 || Static334.aBoolean649) {
						try {
							Static461.method3101(Static183.aClass83_2.anApplet1, "zap");
						} catch (@Pc(1150) Throwable local1150) {
							if (Static260.aBoolean257) {
								try {
									Static183.aClass83_2.anApplet1.getAppletContext().showDocument(new URL(Static183.aClass83_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1166) Exception local1166) {
								}
							}
						}
					} else {
						try {
							Static461.method3101(Static183.aClass83_2.anApplet1, "unzap");
						} catch (@Pc(1176) Throwable local1176) {
						}
					}
					if (Static328.aClass30_10 == Static459.aClass30_13) {
						try {
							Static461.method3101(Static183.aClass83_2.anApplet1, "loggedin");
						} catch (@Pc(1188) Throwable local1188) {
						}
					}
					if (Static337.anInt5743 != 2 && Static337.anInt5743 != 3) {
						Static58.anInt1166 = 0;
						Static30.method393(2);
						Static47.method632();
						Static203.method4783(6);
						Static371.aClass12_160 = null;
						return;
					}
					Static58.anInt1166 = 11;
				}
				if (Static58.anInt1166 == 11) {
					if (Static395.aClass131_3.method2932() < 3) {
						return;
					}
					Static395.aClass131_3.method2929(0, 3, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
					Static58.anInt1166 = 12;
				}
				if (Static58.anInt1166 == 12) {
					local715 = Static336.aClass1_Sub28_Sub1_2;
					local715.anInt6812 = 0;
					if (local715.method3085()) {
						if (Static395.aClass131_3.method2932() < 1) {
							return;
						}
						Static395.aClass131_3.method2929(3, 1, local715.aByteArray86);
					}
					Static371.aClass12_160 = Static355.method4785()[local715.method3079()];
					Static245.anInt4432 = local715.method5335();
					Static58.anInt1166 = 10;
				}
				if (Static58.anInt1166 == 10) {
					if (Static395.aClass131_3.method2932() >= Static245.anInt4432) {
						Static395.aClass131_3.method2929(0, Static245.anInt4432, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
						Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
						local521 = Static245.anInt4432;
						Static58.anInt1166 = 0;
						Static30.method393(2);
						Static273.method3809();
						Static358.method1352(Static336.aClass1_Sub28_Sub1_2);
						Static432.anInt7295 = -1;
						Static390.method5105();
						if (local521 != Static336.aClass1_Sub28_Sub1_2.anInt6812) {
							throw new RuntimeException("lswp pos:" + Static336.aClass1_Sub28_Sub1_2.anInt6812 + " psize:" + local521);
						}
						Static371.aClass12_160 = null;
					}
				} else if (Static58.anInt1166 == 14) {
					if (Static245.anInt4432 == -2) {
						if (Static395.aClass131_3.method2932() < 2) {
							return;
						}
						Static395.aClass131_3.method2929(0, 2, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
						Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
						Static245.anInt4432 = Static336.aClass1_Sub28_Sub1_2.method5335();
					}
					if (Static395.aClass131_3.method2932() >= Static245.anInt4432) {
						Static395.aClass131_3.method2929(0, Static245.anInt4432, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
						Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
						local521 = Static245.anInt4432;
						Static58.anInt1166 = 0;
						Static30.method393(15);
						Static71.method1145();
						Static358.method1352(Static336.aClass1_Sub28_Sub1_2);
						if (local521 != Static336.aClass1_Sub28_Sub1_2.anInt6812) {
							throw new RuntimeException("lswpr pos:" + Static336.aClass1_Sub28_Sub1_2.anInt6812 + " psize:" + local521);
						}
						Static371.aClass12_160 = null;
					}
				}
			} else if (Static395.aClass131_3.method2932() >= 1) {
				Static425.anInt7177 = Static395.aClass131_3.method2934();
				Static58.anInt1166 = 9;
			}
		} catch (@Pc(1424) IOException local1424) {
			if (Static395.aClass131_3 != null) {
				Static395.aClass131_3.method2933();
				Static395.aClass131_3 = null;
			}
			if (Static271.anInt7119 < 1) {
				Static58.anInt1166 = 1;
				Static223.anInt5841 = 0;
				Static271.anInt7119++;
				if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
					Static259.aClass156_4.aBoolean517 = !Static259.aClass156_4.aBoolean517;
				} else {
					Static95.aClass156_2.aBoolean517 = !Static95.aClass156_2.aBoolean517;
				}
			} else {
				Static58.anInt1166 = 0;
				Static30.method393(-4);
				Static125.method1992();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)I")
	public static int method3095(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
