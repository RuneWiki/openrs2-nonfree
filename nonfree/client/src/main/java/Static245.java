import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static int anInt4510 = 1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3860(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			try {
				Static320.method2266("loggedout", Static222.aClass176_3.anApplet1);
			} catch (@Pc(60) Throwable local60) {
			}
			try {
				Static295.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static295.anApplet_Sub1_1.getCodeBase(), arg1), "_top");
			} catch (@Pc(72) Exception local72) {
			}
			return;
		}
		if (Static71.aBoolean165 && Static179.aBoolean301) {
			try {
				Static320.method2267(new Object[] { (new URL(Static295.anApplet_Sub1_1.getCodeBase(), arg1)).toString() }, "openjs", Static222.aClass176_3.anApplet1);
				return;
			} catch (@Pc(38) Throwable local38) {
			}
		}
		try {
			Static295.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static295.anApplet_Sub1_1.getCodeBase(), arg1), "_blank");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	public static void method3861(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1 local8 = Static94.aClass86_12.method2134(); local8 != null; local8 = Static94.aClass86_12.method2141()) {
			if ((long) arg0 == (local8.aLong210 >> 48 & 0xFFFFL)) {
				local8.method4573();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
	public static void method3862(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(7) int local7 = arg1;
		@Pc(13) int local13 = (arg3 + arg1) / 2;
		@Pc(17) long local17 = arg2[local13];
		arg2[local13] = arg2[arg3];
		arg2[arg3] = local17;
		@Pc(31) Object local31 = arg0[local13];
		arg0[local13] = arg0[arg3];
		arg0[arg3] = local31;
		for (@Pc(43) int local43 = arg1; local43 < arg3; local43++) {
			if ((long) (local43 & 0x1) + local17 > arg2[local43]) {
				@Pc(66) long local66 = arg2[local43];
				arg2[local43] = arg2[local7];
				arg2[local7] = local66;
				@Pc(80) Object local80 = arg0[local43];
				arg0[local43] = arg0[local7];
				arg0[local7++] = local80;
			}
		}
		arg2[arg3] = arg2[local7];
		arg2[local7] = local17;
		arg0[arg3] = arg0[local7];
		arg0[local7] = local31;
		method3862(arg0, arg1, arg2, local7 - 1);
		method3862(arg0, local7 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public static void method3863() {
		if (Static213.anInt5512 > 0) {
			Static213.anInt5512--;
		}
		if (Static263.anInt4869 > 1) {
			Static243.anInt4497 = Static149.anInt950;
			Static263.anInt4869--;
		}
		if (Static55.aBoolean119) {
			Static55.aBoolean119 = false;
			Static269.method4149();
			return;
		}
		@Pc(33) int local33;
		for (local33 = 0; local33 < 100 && Static168.method2835(); local33++) {
		}
		if (Static97.anInt2087 != 30) {
			return;
		}
		Static268.method4135(Static116.aClass1_Sub13_Sub1_48);
		@Pc(57) Object local57 = Static299.aClass30_1.anObject1;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(113) int local113;
		@Pc(108) int local108;
		@Pc(189) int local189;
		@Pc(182) int local182;
		synchronized (Static299.aClass30_1.anObject1) {
			if (!Static248.aBoolean423) {
				Static299.aClass30_1.anInt1042 = 0;
			} else if (Static235.anInt4408 != 0 || Static299.aClass30_1.anInt1042 >= 40) {
				Static116.aClass1_Sub13_Sub1_48.method1887(110);
				Static116.aClass1_Sub13_Sub1_48.method1822(0);
				local76 = 0;
				@Pc(83) int local83 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
				for (local85 = 0; local85 < Static299.aClass30_1.anInt1042 && Static116.aClass1_Sub13_Sub1_48.anInt2018 - local83 < 240; local85++) {
					local76++;
					@Pc(103) boolean local103 = false;
					local108 = Static299.aClass30_1.anIntArray81[local85];
					local113 = Static299.aClass30_1.anIntArray80[local85];
					if (local108 < 0) {
						local108 = 0;
					} else if (local108 > 65534) {
						local108 = 65534;
					}
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 65534) {
						local113 = 65534;
					}
					if (Static299.aClass30_1.anIntArray80[local85] == -1 && Static299.aClass30_1.anIntArray81[local85] == -1) {
						local103 = true;
						local113 = -1;
						local108 = -1;
					}
					if (Static49.anInt1087 != local108 || local113 != Static253.anInt4651) {
						local182 = local113 - Static253.anInt4651;
						Static253.anInt4651 = local113;
						local189 = local108 - Static49.anInt1087;
						Static49.anInt1087 = local108;
						if (Static51.anInt1111 < 8 && local189 >= -32 && local189 <= 31 && local182 >= -32 && local182 <= 31) {
							local189 += 32;
							local182 += 32;
							Static116.aClass1_Sub13_Sub1_48.method1835((Static51.anInt1111 << 12) + (local189 << 6) + local182);
							Static51.anInt1111 = 0;
						} else if (Static51.anInt1111 < 32 && local189 >= -128 && local189 <= 127 && local182 >= -128 && local182 <= 127) {
							local182 += 128;
							local189 += 128;
							Static116.aClass1_Sub13_Sub1_48.method1822(Static51.anInt1111 + 128);
							Static116.aClass1_Sub13_Sub1_48.method1835((local189 << 8) + local182);
							Static51.anInt1111 = 0;
						} else if (Static51.anInt1111 < 32) {
							Static116.aClass1_Sub13_Sub1_48.method1822(Static51.anInt1111 + 192);
							if (local103) {
								Static116.aClass1_Sub13_Sub1_48.method1851(Integer.MIN_VALUE);
							} else {
								Static116.aClass1_Sub13_Sub1_48.method1851(local113 << 16 | local108);
							}
							Static51.anInt1111 = 0;
						} else {
							Static116.aClass1_Sub13_Sub1_48.method1835(Static51.anInt1111 + 57344);
							if (local103) {
								Static116.aClass1_Sub13_Sub1_48.method1851(Integer.MIN_VALUE);
							} else {
								Static116.aClass1_Sub13_Sub1_48.method1851(local113 << 16 | local108);
							}
							Static51.anInt1111 = 0;
						}
					} else if (Static51.anInt1111 < 2047) {
						Static51.anInt1111++;
					}
				}
				Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local83);
				if (Static299.aClass30_1.anInt1042 > local76) {
					Static299.aClass30_1.anInt1042 -= local76;
					for (local85 = 0; local85 < Static299.aClass30_1.anInt1042; local85++) {
						Static299.aClass30_1.anIntArray81[local85] = Static299.aClass30_1.anIntArray81[local76 + local85];
						Static299.aClass30_1.anIntArray80[local85] = Static299.aClass30_1.anIntArray80[local76 + local85];
					}
				} else {
					Static299.aClass30_1.anInt1042 = 0;
				}
			}
		}
		if (Static235.anInt4408 != 0) {
			@Pc(414) long local414 = (Static279.aLong196 - Static305.aLong208) / 50L;
			Static305.aLong208 = Static279.aLong196;
			local76 = Static45.anInt1043;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 65535) {
				local76 = 65535;
			}
			local85 = Static186.anInt3549;
			if (local414 > 32767L) {
				local414 = 32767L;
			}
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 65535) {
				local85 = 65535;
			}
			@Pc(457) byte local457 = 0;
			if (Static235.anInt4408 == 2) {
				local457 = 1;
			}
			Static116.aClass1_Sub13_Sub1_48.method1887(194);
			local108 = (int) local414;
			Static116.aClass1_Sub13_Sub1_48.method1862(local457 << 15 | local108);
			Static116.aClass1_Sub13_Sub1_48.method1858(local85 | local76 << 16);
		}
		if (Static222.anInt4183 > 0) {
			Static222.anInt4183--;
		}
		if (Static167.aBoolean68 && Static222.anInt4183 <= 0) {
			Static167.aBoolean68 = false;
			Static222.anInt4183 = 20;
			Static116.aClass1_Sub13_Sub1_48.method1887(190);
			Static116.aClass1_Sub13_Sub1_48.method1818((int) Static148.aFloat64);
			Static116.aClass1_Sub13_Sub1_48.method1835((int) Static8.aFloat4);
		}
		if (Static295.aBoolean500 && !Static10.aBoolean519) {
			Static10.aBoolean519 = true;
			Static116.aClass1_Sub13_Sub1_48.method1887(144);
			Static116.aClass1_Sub13_Sub1_48.method1822(1);
		}
		if (!Static295.aBoolean500 && Static10.aBoolean519) {
			Static10.aBoolean519 = false;
			Static116.aClass1_Sub13_Sub1_48.method1887(144);
			Static116.aClass1_Sub13_Sub1_48.method1822(0);
		}
		if (!Static164.aBoolean283) {
			Static116.aClass1_Sub13_Sub1_48.method1887(88);
			Static116.aClass1_Sub13_Sub1_48.method1858(Static148.method2590());
			Static164.aBoolean283 = true;
		}
		if (Static54.aBoolean118) {
			Static54.aBoolean118 = false;
		} else {
			Static241.aFloat81 /= 2.0F;
		}
		if (Static28.aBoolean56) {
			Static28.aBoolean56 = false;
		} else {
			Static273.aFloat91 /= 2.0F;
		}
		Static298.method4470();
		if (Static97.anInt2087 != 30) {
			return;
		}
		Static117.method2129();
		Static29.method521();
		Static132.method2305();
		Static87.anInt1876++;
		if (Static87.anInt1876 > 750) {
			Static269.method4149();
			return;
		}
		Static37.method639();
		Static296.method719();
		Static120.method2195();
		for (local33 = Static214.method1167(true); local33 != -1; local33 = Static214.method1167(false)) {
			Static167.method597(local33);
			Static179.anIntArray358[Static263.anInt4858++ & 0x1F] = local33;
		}
		@Pc(1031) int local1031;
		for (@Pc(673) Class1_Sub5_Sub21 local673 = Static261.method4037(); local673 != null; local673 = Static261.method4037()) {
			local76 = local673.method4060();
			local85 = local673.method4061();
			if (local76 == 1) {
				Static126.anIntArray124[local85] = local673.anInt4863;
				Static205.anIntArray417[Static5.anInt206++ & 0x1F] = local85;
			} else if (local76 == 2) {
				Static78.aStringArray10[local85] = local673.aString185;
				Static293.anIntArray582[Static35.anInt658++ & 0x1F] = local85;
			} else {
				@Pc(714) Class157 local714;
				if (local76 == 3) {
					local714 = Static206.method3444(local85);
					if (!local673.aString185.equals(local714.aString169)) {
						local714.aString169 = local673.aString185;
						Static224.method3621(local714);
					}
				} else if (local76 == 4) {
					local714 = Static206.method3444(local85);
					local189 = local673.anInt4864;
					local108 = local673.anInt4863;
					local1031 = local673.anInt4862;
					if (local714.anInt4669 != local108 || local714.anInt4668 != local1031 || local714.anInt4743 != local189) {
						local714.anInt4743 = local189;
						local714.anInt4668 = local1031;
						local714.anInt4669 = local108;
						Static224.method3621(local714);
					}
				} else if (local76 == 5) {
					local714 = Static206.method3444(local85);
					if (local714.anInt4721 != local673.anInt4863 || local673.anInt4863 == -1) {
						local714.anInt4724 = 1;
						local714.anInt4721 = local673.anInt4863;
						local714.anInt4714 = 0;
						local714.anInt4732 = 0;
						Static224.method3621(local714);
					}
				} else if (local76 == 6) {
					local113 = local673.anInt4863;
					local108 = local113 >> 10 & 0x1F;
					local189 = local113 & 0x1F;
					local1031 = local113 >> 5 & 0x1F;
					@Pc(1035) Class157 local1035 = Static206.method3444(local85);
					local182 = (local189 << 3) + (local108 << 19) + (local1031 << 11);
					if (local182 != local1035.anInt4703) {
						local1035.anInt4703 = local182;
						Static224.method3621(local1035);
					}
				} else if (local76 == 7) {
					local714 = Static206.method3444(local85);
					@Pc(722) boolean local722 = local673.anInt4863 == 1;
					if (local722 != local714.aBoolean435) {
						local714.aBoolean435 = local722;
						Static224.method3621(local714);
					}
				} else if (local76 == 8) {
					local714 = Static206.method3444(local85);
					if (local673.anInt4863 != local714.anInt4666 || local714.anInt4745 != local673.anInt4862 || local673.anInt4864 != local714.anInt4706) {
						local714.anInt4666 = local673.anInt4863;
						local714.anInt4745 = local673.anInt4862;
						local714.anInt4706 = local673.anInt4864;
						if (local714.anInt4720 != -1) {
							if (local714.anInt4718 > 0) {
								local714.anInt4706 = local714.anInt4706 * 32 / local714.anInt4718;
							} else if (local714.anInt4665 > 0) {
								local714.anInt4706 = local714.anInt4706 * 32 / local714.anInt4665;
							}
						}
						Static224.method3621(local714);
					}
				} else if (local76 == 9) {
					local714 = Static206.method3444(local85);
					if (local714.anInt4720 != local673.anInt4863 || local673.anInt4862 != local714.anInt4735) {
						local714.anInt4720 = local673.anInt4863;
						local714.anInt4735 = local673.anInt4862;
						Static224.method3621(local714);
					}
				} else if (local76 == 10) {
					local714 = Static206.method3444(local85);
					if (local673.anInt4863 != local714.anInt4696 || local673.anInt4862 != local714.anInt4736 || local673.anInt4864 != local714.anInt4722) {
						local714.anInt4696 = local673.anInt4863;
						local714.anInt4736 = local673.anInt4862;
						local714.anInt4722 = local673.anInt4864;
						Static224.method3621(local714);
					}
				} else if (local76 == 11) {
					local714 = Static206.method3444(local85);
					local714.anInt4729 = local714.anInt4738 = local673.anInt4863;
					local714.aByte15 = 0;
					local714.anInt4715 = local714.anInt4744 = local673.anInt4862;
					local714.aByte16 = 0;
					Static224.method3621(local714);
				} else if (local76 == 12) {
					local714 = Static206.method3444(local85);
					local108 = local673.anInt4863;
					if (local714 != null && local714.anInt4748 == 0) {
						if (local108 > local714.anInt4683 - local714.anInt4689) {
							local108 = local714.anInt4683 - local714.anInt4689;
						}
						if (local108 < 0) {
							local108 = 0;
						}
						if (local108 != local714.anInt4693) {
							local714.anInt4693 = local108;
							Static224.method3621(local714);
						}
					}
				} else if (local76 == 13) {
					local714 = Static206.method3444(local85);
					local714.anInt4753 = local673.anInt4863;
				}
			}
		}
		if (Static224.anInt4209 != 0) {
			Static194.anInt3870 += 20;
			if (Static194.anInt3870 >= 400) {
				Static224.anInt4209 = 0;
			}
		}
		Static38.anInt722++;
		if (Static160.aClass157_12 != null) {
			Static226.anInt4228++;
			if (Static226.anInt4228 >= 15) {
				Static224.method3621(Static160.aClass157_12);
				Static160.aClass157_12 = null;
			}
		}
		@Pc(1295) Class157 local1295;
		if (Static126.aClass157_7 != null) {
			Static224.method3621(Static126.aClass157_7);
			Static225.anInt4216++;
			if (Static89.anInt1899 > Static89.anInt1902 + 5 || Static89.anInt1899 < Static89.anInt1902 - 5 || Static58.anInt1235 + 5 < Static14.anInt309 || Static58.anInt1235 - 5 > Static14.anInt309) {
				Static66.aBoolean135 = true;
			}
			if (Static3.anInt114 == 0) {
				if (Static66.aBoolean135 && Static225.anInt4216 >= 5) {
					if (Static134.aClass157_11 == Static126.aClass157_7 && Static207.anInt5395 != Static279.anInt5131) {
						@Pc(1293) byte local1293 = 0;
						local1295 = Static126.aClass157_7;
						if (Static231.anInt4323 == 1 && local1295.anInt4686 == 206) {
							local1293 = 1;
						}
						if (local1295.anIntArray538[Static279.anInt5131] <= 0) {
							local1293 = 0;
						}
						if (Static42.method777(local1295).method1124()) {
							local113 = Static207.anInt5395;
							local108 = Static279.anInt5131;
							local1295.anIntArray538[local108] = local1295.anIntArray538[local113];
							local1295.anIntArray537[local108] = local1295.anIntArray537[local113];
							local1295.anIntArray538[local113] = -1;
							local1295.anIntArray537[local113] = 0;
						} else if (local1293 == 1) {
							local113 = Static207.anInt5395;
							local108 = Static279.anInt5131;
							while (local108 != local113) {
								if (local113 > local108) {
									local1295.method3975(local113, local113 - 1);
									local113--;
								} else if (local113 < local108) {
									local1295.method3975(local113, local113 + 1);
									local113++;
								}
							}
						} else {
							local1295.method3975(Static207.anInt5395, Static279.anInt5131);
						}
						Static116.aClass1_Sub13_Sub1_48.method1887(238);
						Static116.aClass1_Sub13_Sub1_48.method1858(Static126.aClass157_7.anInt4672);
						Static116.aClass1_Sub13_Sub1_48.method1825(local1293);
						Static116.aClass1_Sub13_Sub1_48.method1818(Static207.anInt5395);
						Static116.aClass1_Sub13_Sub1_48.method1835(Static279.anInt5131);
					}
				} else if ((Static239.anInt4459 == 1 || Static310.method4599(Static241.anInt4470 - 1)) && Static241.anInt4470 > 2) {
					Static138.method3843();
				} else if (Static241.anInt4470 > 0) {
					Static8.method142();
				}
				Static235.anInt4408 = 0;
				Static126.aClass157_7 = null;
				Static226.anInt4228 = 10;
			}
		}
		Static4.aClass157_1 = null;
		Static64.aBoolean131 = false;
		Static23.anInt483 = 0;
		Static143.aBoolean244 = false;
		@Pc(1470) Class157 local1470 = Static115.aClass157_10;
		local1295 = Static271.aClass157_17;
		Static271.aClass157_17 = null;
		Static115.aClass157_10 = null;
		while (Static115.method2107() && Static23.anInt483 < 128) {
			Static293.anIntArray583[Static23.anInt483] = Static100.anInt5565;
			Static254.anIntArray536[Static23.anInt483] = Static264.aChar4;
			Static23.anInt483++;
		}
		Static73.aClass157_8 = null;
		if (Static315.anInt5636 != -1) {
			Static23.method462(Static315.anInt5636, 0, Static288.anInt5232, Static194.anInt3876, 0, 0, 0);
		}
		Static149.anInt950++;
		if (Static73.aClass157_8 != null) {
			Static284.method4289();
		}
		while (true) {
			@Pc(1542) Class157 local1542;
			@Pc(1531) Class157 local1531;
			@Pc(1526) Class1_Sub29 local1526;
			do {
				local1526 = (Class1_Sub29) Static128.aClass96_7.method2339();
				if (local1526 == null) {
					while (true) {
						do {
							local1526 = (Class1_Sub29) Static76.aClass96_23.method2339();
							if (local1526 == null) {
								while (true) {
									do {
										local1526 = (Class1_Sub29) Static145.aClass96_8.method2339();
										if (local1526 == null) {
											if (Static73.aClass157_8 == null) {
												Static226.anInt4234 = 0;
											}
											if (Static64.aClass157_5 != null) {
												Static79.method1636();
											}
											if (Static142.anInt2785 > 0 && Static1.aBooleanArray1[82] && Static1.aBooleanArray1[81] && Static205.anInt3960 != 0) {
												local113 = Static132.anInt2608 - Static205.anInt3960;
												if (local113 < 0) {
													local113 = 0;
												} else if (local113 > 3) {
													local113 = 3;
												}
												Static44.method871(Static135.anInt2659 + Static138.aClass11_Sub4_Sub1_3.anIntArray406[0], local113, Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] + Static38.anInt714);
											}
											if (Static142.anInt2785 > 0 && Static1.aBooleanArray1[82] && Static1.aBooleanArray1[81]) {
												if (Static289.anInt5260 != -1) {
													Static44.method871(Static135.anInt2659 + Static289.anInt5251, Static132.anInt2608, Static289.anInt5260 + Static38.anInt714);
												}
												Static239.anInt4464 = 0;
												Static173.anInt3381 = 0;
											} else if (Static173.anInt3381 == 2) {
												if (Static289.anInt5260 != -1) {
													Static116.aClass1_Sub13_Sub1_48.method1887(173);
													Static116.aClass1_Sub13_Sub1_48.method1835(Static289.anInt5260 + Static38.anInt714);
													Static116.aClass1_Sub13_Sub1_48.method1835(Static75.anInt1991);
													Static116.aClass1_Sub13_Sub1_48.method1865(Static289.anInt5251 + Static135.anInt2659);
													Static116.aClass1_Sub13_Sub1_48.method1836(Static315.anInt5631);
													Static194.anInt3870 = 0;
													Static224.anInt4209 = 1;
													Static228.anInt4273 = Static45.anInt1043;
													Static25.anInt4802 = Static186.anInt3549;
												}
												Static173.anInt3381 = 0;
											} else if (Static239.anInt4464 == 2) {
												if (Static289.anInt5260 != -1) {
													Static116.aClass1_Sub13_Sub1_48.method1887(81);
													Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + Static289.anInt5260);
													Static116.aClass1_Sub13_Sub1_48.method1835(Static289.anInt5251 + Static135.anInt2659);
													Static194.anInt3870 = 0;
													Static224.anInt4209 = 1;
													Static228.anInt4273 = Static45.anInt1043;
													Static25.anInt4802 = Static186.anInt3549;
												}
												Static239.anInt4464 = 0;
											} else if (Static289.anInt5260 != -1 && Static173.anInt3381 == 0 && Static239.anInt4464 == 0) {
												Static146.method2585((Static289.anInt5260 << 1) + 1 - Static138.aClass11_Sub4_Sub1_3.method3347() >> 1, (Static289.anInt5251 << 1) + 1 - Static138.aClass11_Sub4_Sub1_3.method3347() >> 1, 0);
												Static224.anInt4209 = 1;
												Static228.anInt4273 = Static45.anInt1043;
												Static25.anInt4802 = Static186.anInt3549;
												Static194.anInt3870 = 0;
											}
											Static289.anInt5260 = -1;
											Static281.method99();
											if (Static271.aClass157_17 != local1295) {
												if (local1295 != null) {
													Static224.method3621(local1295);
												}
												if (Static271.aClass157_17 != null) {
													Static224.method3621(Static271.aClass157_17);
												}
											}
											if (Static115.aClass157_10 != local1470 && Static253.anInt4654 == Static6.anInt4958) {
												if (local1470 != null) {
													Static224.method3621(local1470);
												}
												if (Static115.aClass157_10 != null) {
													Static224.method3621(Static115.aClass157_10);
												}
											}
											if (Static115.aClass157_10 == null) {
												if (Static6.anInt4958 > 0) {
													Static6.anInt4958--;
												}
											} else if (Static253.anInt4654 > Static6.anInt4958) {
												Static6.anInt4958++;
												if (Static253.anInt4654 == Static6.anInt4958) {
													Static224.method3621(Static115.aClass157_10);
												}
											}
											for (local113 = 0; local113 < 5; local113++) {
												@Pc(1970) int local1970 = Static217.anIntArray457[local113]++;
											}
											local113 = Static59.method1044();
											local108 = Static304.method4552();
											if (local113 > 15000 && local108 > 15000) {
												Static213.anInt5512 = 250;
												Static107.method2020(14500);
												Static116.aClass1_Sub13_Sub1_48.method1887(127);
											}
											if (Static44.aClass153_3 != null && Static44.aClass153_3.anInt4614 == 1) {
												if (Static44.aClass153_3.anObject6 != null) {
													method3860(Static284.aBoolean487, Static37.aString31);
												}
												Static284.aBoolean487 = false;
												Static37.aString31 = null;
												Static44.aClass153_3 = null;
											}
											Static168.anInt3290++;
											Static223.anInt4191++;
											if (Static168.anInt3290 > 500) {
												Static168.anInt3290 = 0;
												local1031 = (int) (Math.random() * 8.0D);
												if ((local1031 & 0x2) == 2) {
													Static1.anInt50 += Static106.anInt3747;
												}
												if ((local1031 & 0x4) == 4) {
													Static132.anInt2613 += Static84.anInt1856;
												}
												if ((local1031 & 0x1) == 1) {
													Static310.anInt5536 += Static254.anInt4691;
												}
											}
											if (Static132.anInt2613 < -40) {
												Static84.anInt1856 = 1;
											}
											if (Static132.anInt2613 > 40) {
												Static84.anInt1856 = -1;
											}
											if (Static223.anInt4191 > 500) {
												Static223.anInt4191 = 0;
												local1031 = (int) (Math.random() * 8.0D);
												if ((local1031 & 0x1) == 1) {
													Static69.anInt1492 += Static22.anInt456;
												}
												if ((local1031 & 0x2) == 2) {
													Static289.anInt5250 += Static47.anInt1067;
												}
											}
											if (Static1.anInt50 < -55) {
												Static106.anInt3747 = 2;
											}
											if (Static310.anInt5536 < -50) {
												Static254.anInt4691 = 2;
											}
											Static122.anInt2478++;
											if (Static289.anInt5250 < -20) {
												Static47.anInt1067 = 1;
											}
											if (Static69.anInt1492 < -60) {
												Static22.anInt456 = 2;
											}
											if (Static69.anInt1492 > 60) {
												Static22.anInt456 = -2;
											}
											if (Static289.anInt5250 > 10) {
												Static47.anInt1067 = -1;
											}
											if (Static1.anInt50 > 55) {
												Static106.anInt3747 = -2;
											}
											if (Static310.anInt5536 > 50) {
												Static254.anInt4691 = -2;
											}
											if (Static122.anInt2478 > 50) {
												Static116.aClass1_Sub13_Sub1_48.method1887(71);
											}
											if (Static121.aBoolean215) {
												Static313.method4666();
												Static121.aBoolean215 = false;
											}
											try {
												if (Static97.aClass49_2 != null && Static116.aClass1_Sub13_Sub1_48.anInt2018 > 0) {
													Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
													Static122.anInt2478 = 0;
													Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
												}
											} catch (@Pc(2226) IOException local2226) {
												Static269.method4149();
											}
											return;
										}
										local1531 = local1526.aClass157_13;
										if (local1531.anInt4692 < 0) {
											break;
										}
										local1542 = Static206.method3444(local1531.anInt4671);
									} while (local1542 == null || local1542.aClass157Array2 == null || local1531.anInt4692 >= local1542.aClass157Array2.length || local1542.aClass157Array2[local1531.anInt4692] != local1531);
									Static5.method104(local1526);
								}
							}
							local1531 = local1526.aClass157_13;
							if (local1531.anInt4692 < 0) {
								break;
							}
							local1542 = Static206.method3444(local1531.anInt4671);
						} while (local1542 == null || local1542.aClass157Array2 == null || local1542.aClass157Array2.length <= local1531.anInt4692 || local1542.aClass157Array2[local1531.anInt4692] != local1531);
						Static5.method104(local1526);
					}
				}
				local1531 = local1526.aClass157_13;
				if (local1531.anInt4692 < 0) {
					break;
				}
				local1542 = Static206.method3444(local1531.anInt4671);
			} while (local1542 == null || local1542.aClass157Array2 == null || local1542.aClass157Array2.length <= local1531.anInt4692 || local1531 != local1542.aClass157Array2[local1531.anInt4692]);
			Static5.method104(local1526);
		}
	}
}
