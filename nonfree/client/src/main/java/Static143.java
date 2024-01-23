import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
	public static int anInt2824;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "[Lclient!wi;")
	public static Class103_Sub2[] aClass103_Sub2Array1;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString98 = "Choose Option";

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
	public static int anInt2823 = 2;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
	public static int anInt2828 = 0;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
	public static boolean method2283(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)J")
	public static long method2284() {
		return Static109.aClass37_1.method2929();
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
	public static void method2285() {
		Static199.aClass169_111.method4014();
		Static215.aClass169_118.method4014();
		Static62.aClass169_45.method4014();
		Static146.aClass169_83.method4014();
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Z")
	public static boolean method2286() throws IOException {
		if (Static81.aClass7_2 == null) {
			return false;
		}
		@Pc(15) int local15 = Static81.aClass7_2.method104();
		if (local15 == 0) {
			return false;
		}
		if (Static117.anInt2306 == -1) {
			Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, 1);
			local15--;
			Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
			Static117.anInt2306 = Static237.aClass1_Sub14_Sub1_7.method2654();
			Static127.anInt2543 = Static295.anIntArray507[Static117.anInt2306];
		}
		if (Static127.anInt2543 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, 1);
			Static127.anInt2543 = Static237.aClass1_Sub14_Sub1_7.aByteArray34[0] & 0xFF;
			local15--;
		}
		if (Static127.anInt2543 == -2) {
			if (local15 <= 1) {
				return false;
			}
			local15 -= 2;
			Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, 2);
			Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
			Static127.anInt2543 = Static237.aClass1_Sub14_Sub1_7.method2593();
		}
		if (local15 < Static127.anInt2543) {
			return false;
		}
		Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
		Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, Static127.anInt2543);
		Static258.anInt5017 = Static251.anInt4928;
		Static52.anInt1095 = 0;
		Static251.anInt4928 = Static265.anInt5098;
		Static265.anInt5098 = Static117.anInt2306;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(147) int local147;
		if (Static117.anInt2306 == 45) {
			local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
			local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
			if (Static114.method1832(local140)) {
				local147 = 0;
				if (Static229.aClass22_Sub3_Sub2_2.aClass119_2 != null) {
					local147 = Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3024();
				}
				Static108.method1780(local147, local136, 3, -1);
			}
			Static117.anInt2306 = -1;
			return true;
		}
		@Pc(183) String local183;
		@Pc(176) String local176;
		if (Static117.anInt2306 == 96) {
			local176 = Static237.aClass1_Sub14_Sub1_7.method2605();
			local183 = Static139.method4431(Static298.method4460(Static212.method3330(Static237.aClass1_Sub14_Sub1_7)));
			Static232.method2984(local176, local176, 6, 0, local183);
			Static117.anInt2306 = -1;
			return true;
		} else if (Static117.anInt2306 == 172) {
			Static218.method3440();
			Static117.anInt2306 = -1;
			return true;
		} else {
			@Pc(231) int local231;
			if (Static117.anInt2306 == 89) {
				local136 = Static237.aClass1_Sub14_Sub1_7.method2647();
				local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
				local147 = Static237.aClass1_Sub14_Sub1_7.method2638();
				if (local147 == 65535) {
					local147 = -1;
				}
				local231 = Static237.aClass1_Sub14_Sub1_7.method2647();
				if (Static114.method1832(local140)) {
					@Pc(239) Class146 local239 = Static259.method3908(local231);
					@Pc(251) Class149 local251;
					if (local239.aBoolean299) {
						Static40.method723(local136, local231, local147);
						local251 = Static271.method4006(local147);
						Static240.method1122(local251.anInt4812, local231, local251.anInt4767, local251.anInt4778);
						Static279.method4128(local251.anInt4820, local231, local251.anInt4774, local251.anInt4795);
					} else if (local147 == -1) {
						local239.anInt4409 = 0;
						Static117.anInt2306 = -1;
						return true;
					} else {
						local251 = Static271.method4006(local147);
						local239.anInt4400 = local251.anInt4812;
						local239.anInt4409 = 4;
						local239.anInt4351 = local251.anInt4778;
						local239.anInt4366 = local251.anInt4767 * 100 / local136;
						local239.anInt4389 = local147;
						Static237.method2927(local239);
					}
				}
				Static117.anInt2306 = -1;
				return true;
			} else if (Static117.anInt2306 == 12) {
				Static312.method4591();
				Static224.anInt4401 = Static237.aClass1_Sub14_Sub1_7.method2623();
				Static220.anInt5820 = Static314.anInt5908;
				Static117.anInt2306 = -1;
				return true;
			} else if (Static117.anInt2306 == 136) {
				Static233.method3680();
				Static312.method4591();
				Static117.anInt2306 = -1;
				Static250.anInt3291 += 32;
				return true;
			} else if (Static117.anInt2306 == 174) {
				local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
				local140 = Static237.aClass1_Sub14_Sub1_7.method2641();
				if (Static114.method1832(local136)) {
					Static108.method1780(2047, local140, 5, 0);
				}
				Static117.anInt2306 = -1;
				return true;
			} else {
				@Pc(399) int local399;
				@Pc(403) int local403;
				if (Static117.anInt2306 == 199) {
					local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local140 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local147 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local399 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local403 = Static237.aClass1_Sub14_Sub1_7.method2595();
					if (Static114.method1832(local136)) {
						Static27.method483(local147, local403, local231, true, local399, local140);
					}
					Static117.anInt2306 = -1;
					return true;
				} else if (Static117.anInt2306 == 223) {
					local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
					if (local136 == 65535) {
						local136 = -1;
					}
					local140 = Static237.aClass1_Sub14_Sub1_7.method2620();
					local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
					if (Static114.method1832(local147)) {
						Static108.method1780(local136, local140, 2, -1);
					}
					Static117.anInt2306 = -1;
					return true;
				} else if (Static117.anInt2306 == 236) {
					local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local140 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local147 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local399 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local403 = Static237.aClass1_Sub14_Sub1_7.method2595();
					if (Static114.method1832(local136)) {
						Static216.method3401(local399, local231, local403, local140, local147);
					}
					Static117.anInt2306 = -1;
					return true;
				} else if (Static117.anInt2306 == 192) {
					local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
					if (local136 == 65535) {
						local136 = -1;
					}
					local140 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local231 = Static237.aClass1_Sub14_Sub1_7.method2595();
					Static81.method1230(local136, local147, local231, local140);
					Static117.anInt2306 = -1;
					return true;
				} else if (Static117.anInt2306 == 152) {
					local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
					if (Static114.method1832(local140)) {
						Static91.anInt1742 = local136;
					}
					Static117.anInt2306 = -1;
					return true;
				} else {
					@Pc(592) Class146 local592;
					if (Static117.anInt2306 == 198) {
						local136 = Static237.aClass1_Sub14_Sub1_7.method2647();
						local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
						if (local136 < -70000) {
							local140 += 32768;
						}
						if (local136 >= 0) {
							local592 = Static259.method3908(local136);
						} else {
							local592 = null;
						}
						while (Static237.aClass1_Sub14_Sub1_7.anInt3290 < Static127.anInt2543) {
							local231 = Static237.aClass1_Sub14_Sub1_7.method2648();
							local403 = 0;
							local399 = Static237.aClass1_Sub14_Sub1_7.method2593();
							if (local399 != 0) {
								local403 = Static237.aClass1_Sub14_Sub1_7.method2595();
								if (local403 == 255) {
									local403 = Static237.aClass1_Sub14_Sub1_7.method2647();
								}
							}
							if (local592 != null && local231 >= 0 && local231 < local592.anIntArray358.length) {
								local592.anIntArray358[local231] = local399;
								local592.anIntArray353[local231] = local403;
							}
							Static218.method3439(local140, local231, local399 - 1, local403);
						}
						if (local592 != null) {
							Static237.method2927(local592);
						}
						Static312.method4591();
						Static51.anIntArray84[Static92.anInt1760++ & 0x1F] = local140 & 0x7FFF;
						Static117.anInt2306 = -1;
						return true;
					} else if (Static117.anInt2306 == 190) {
						local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
						local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
						local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
						if (Static114.method1832(local140)) {
							Static200.method4449(local147, local136);
						}
						Static117.anInt2306 = -1;
						return true;
					} else if (Static117.anInt2306 == 38) {
						local136 = Static237.aClass1_Sub14_Sub1_7.method2638();
						local140 = Static237.aClass1_Sub14_Sub1_7.method2620();
						Static290.method4289(local140, local136);
						Static117.anInt2306 = -1;
						return true;
					} else if (Static117.anInt2306 == 168) {
						local136 = Static237.aClass1_Sub14_Sub1_7.method2620();
						local140 = Static237.aClass1_Sub14_Sub1_7.method2615();
						local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
						local231 = Static237.aClass1_Sub14_Sub1_7.method2621();
						if (Static114.method1832(local147)) {
							Static165.method2792(local136, local140, local231);
						}
						Static117.anInt2306 = -1;
						return true;
					} else {
						@Pc(788) boolean local788;
						@Pc(796) String local796;
						@Pc(966) int local966;
						@Pc(973) int local973;
						@Pc(1012) int local1012;
						@Pc(1084) int local1084;
						@Pc(830) int local830;
						@Pc(806) boolean local806;
						@Pc(808) String local808;
						@Pc(1048) String local1048;
						@Pc(1030) String local1030;
						@Pc(1066) String local1066;
						if (Static117.anInt2306 == 144) {
							local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
							local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
							local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
							local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
							local399 = Static237.aClass1_Sub14_Sub1_7.method2595();
							local806 = false;
							local808 = "";
							if (local231 > 0) {
								local808 = Static237.aClass1_Sub14_Sub1_7.method2605();
								local806 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
							}
							for (local830 = 0; local830 < Static175.anInt3635; local830++) {
								if (local788) {
									if (local796.equals(Static279.aStringArray44[local830])) {
										Static279.aStringArray44[local830] = local183;
										local183 = null;
										Static263.aStringArray43[local830] = local796;
										break;
									}
								} else if (local183.equals(Static279.aStringArray44[local830])) {
									if (local231 != Static112.anIntArray187[local830]) {
										Static112.anIntArray187[local830] = local231;
										if (local231 > 0) {
											Static232.method2984("", "", 5, 0, local183 + Static66.aString39);
										}
										if (local231 == 0) {
											Static232.method2984("", "", 5, 0, local183 + Static152.aString102);
										}
									}
									local183 = null;
									Static263.aStringArray43[local830] = local796;
									Static313.aStringArray47[local830] = local808;
									Static82.anIntArray124[local830] = local399;
									Static67.aBooleanArray11[local830] = local806;
									break;
								}
							}
							if (local183 != null && Static175.anInt3635 < 200) {
								Static279.aStringArray44[Static175.anInt3635] = local183;
								Static263.aStringArray43[Static175.anInt3635] = local796;
								Static112.anIntArray187[Static175.anInt3635] = local231;
								Static313.aStringArray47[Static175.anInt3635] = local808;
								Static82.anIntArray124[Static175.anInt3635] = local399;
								Static67.aBooleanArray11[Static175.anInt3635] = local806;
								Static175.anInt3635++;
							}
							Static214.anInt4214 = Static314.anInt5908;
							local966 = Static175.anInt3635;
							while (local966 > 0) {
								@Pc(970) boolean local970 = true;
								local966--;
								for (local973 = 0; local973 < local966; local973++) {
									if (Static108.anInt2138 != Static112.anIntArray187[local973] && Static108.anInt2138 == Static112.anIntArray187[local973 + 1] || Static112.anIntArray187[local973] == 0 && Static112.anIntArray187[local973 + 1] != 0) {
										local970 = false;
										local1012 = Static112.anIntArray187[local973];
										Static112.anIntArray187[local973] = Static112.anIntArray187[local973 + 1];
										Static112.anIntArray187[local973 + 1] = local1012;
										local1030 = Static313.aStringArray47[local973];
										Static313.aStringArray47[local973] = Static313.aStringArray47[local973 + 1];
										Static313.aStringArray47[local973 + 1] = local1030;
										local1048 = Static279.aStringArray44[local973];
										Static279.aStringArray44[local973] = Static279.aStringArray44[local973 + 1];
										Static279.aStringArray44[local973 + 1] = local1048;
										local1066 = Static263.aStringArray43[local973];
										Static263.aStringArray43[local973] = Static263.aStringArray43[local973 + 1];
										Static263.aStringArray43[local973 + 1] = local1066;
										local1084 = Static82.anIntArray124[local973];
										Static82.anIntArray124[local973] = Static82.anIntArray124[local973 + 1];
										Static82.anIntArray124[local973 + 1] = local1084;
										@Pc(1102) boolean local1102 = Static67.aBooleanArray11[local973];
										Static67.aBooleanArray11[local973] = Static67.aBooleanArray11[local973 + 1];
										Static67.aBooleanArray11[local973 + 1] = local1102;
									}
								}
								if (local970) {
									break;
								}
							}
							Static117.anInt2306 = -1;
							return true;
						} else if (Static117.anInt2306 == 27) {
							Static84.anInt1525 = Static237.aClass1_Sub14_Sub1_7.method2595();
							Static214.anInt4214 = Static314.anInt5908;
							Static117.anInt2306 = -1;
							return true;
						} else if (Static117.anInt2306 == 225) {
							local136 = Static237.aClass1_Sub14_Sub1_7.method2596();
							local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
							local147 = Static237.aClass1_Sub14_Sub1_7.method2635();
							if (Static114.method1832(local140)) {
								Static128.method2020(local136, local147);
							}
							Static117.anInt2306 = -1;
							return true;
						} else if (Static117.anInt2306 == 24) {
							Static122.method1957();
							Static117.anInt2306 = -1;
							return false;
						} else {
							@Pc(1192) byte local1192;
							if (Static117.anInt2306 == 95) {
								local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
								local1192 = Static237.aClass1_Sub14_Sub1_7.method2607();
								local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
								if (Static114.method1832(local136)) {
									Static25.method463(local147, local1192);
								}
								Static117.anInt2306 = -1;
								return true;
							} else if (Static117.anInt2306 == 84) {
								local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
								local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
								local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
								if (Static114.method1832(local147)) {
									Static264.method3948(local140, local136);
								}
								Static117.anInt2306 = -1;
								return true;
							} else if (Static117.anInt2306 == 148) {
								local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
								local140 = Static237.aClass1_Sub14_Sub1_7.method2595();
								@Pc(1257) byte local1257 = Static237.aClass1_Sub14_Sub1_7.method2598();
								if (Static167.aByte11 != local1257) {
									Static117.anInt2306 = -1;
									return true;
								}
								Static117.anInt2306 = -1;
								if (local136 == 255) {
									Static127.anInt2540 = 0;
									Static263.aBoolean357 = false;
									Static62.anInt1244 = 0;
								} else {
									Static127.anInt2540 = local140;
									Static62.anInt1244 = local136;
									Static263.aBoolean357 = true;
								}
								return true;
							} else if (Static117.anInt2306 == 188) {
								Static281.method4172(false);
								Static117.anInt2306 = -1;
								return true;
							} else {
								@Pc(1335) long local1335;
								@Pc(1340) long local1340;
								@Pc(1345) long local1345;
								if (Static117.anInt2306 == 74) {
									local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
									local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
									local796 = local183;
									if (local788) {
										local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
									}
									@Pc(1331) boolean local1331 = false;
									local1335 = Static237.aClass1_Sub14_Sub1_7.method2587();
									local1340 = Static237.aClass1_Sub14_Sub1_7.method2593();
									local1345 = Static237.aClass1_Sub14_Sub1_7.method2588();
									@Pc(1351) long local1351 = (local1340 << 32) + local1345;
									local973 = Static237.aClass1_Sub14_Sub1_7.method2595();
									local1012 = Static237.aClass1_Sub14_Sub1_7.method2593();
									local1084 = 0;
									while (true) {
										if (local1084 < 100) {
											if (local1351 != Static162.aLongArray69[local1084]) {
												local1084++;
												continue;
											}
											local1331 = true;
											break;
										}
										if (local973 <= 1 && Static15.method209(local796)) {
											local1331 = true;
										}
										break;
									}
									if (!local1331 && Static310.anInt1326 == 0) {
										Static162.aLongArray69[Static14.anInt230] = local1351;
										Static14.anInt230 = (Static14.anInt230 + 1) % 100;
										@Pc(1417) String local1417 = Static57.method981(local1012).method3808(Static237.aClass1_Sub14_Sub1_7);
										if (local973 == 2) {
											Static26.method479(Static46.method815(local1335), local1417, "<img=1>" + local183, local1012, 0, 20, "<img=1>" + local796);
										} else if (local973 == 1) {
											Static26.method479(Static46.method815(local1335), local1417, "<img=0>" + local183, local1012, 0, 20, "<img=0>" + local796);
										} else {
											Static26.method479(Static46.method815(local1335), local1417, local183, local1012, 0, 20, local796);
										}
									}
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 179) {
									Static4.method47(Static127.anInt2543, Static117.aClass117_3, Static237.aClass1_Sub14_Sub1_7);
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 31) {
									local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
									if (local136 == 65535) {
										local136 = -1;
									}
									local140 = Static237.aClass1_Sub14_Sub1_7.method2647();
									local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
									if (Static114.method1832(local147)) {
										Static108.method1780(local136, local140, 1, -1);
									}
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 255) {
									Static146.anInt2885 = Static237.aClass1_Sub14_Sub1_7.method2595();
									Static5.anInt68 = Static237.aClass1_Sub14_Sub1_7.method2596();
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 233) {
									local136 = Static237.aClass1_Sub14_Sub1_7.method2626();
									local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
									local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
									if (Static114.method1832(local140)) {
										Static273.method4041(local796, local136);
									}
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 17) {
									Static128.anInt2551 = Static237.aClass1_Sub14_Sub1_7.method2595();
									Static117.anInt2306 = -1;
									return true;
								} else if (Static117.anInt2306 == 183) {
									local176 = Static237.aClass1_Sub14_Sub1_7.method2605();
									local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
									local796 = Static57.method981(local140).method3808(Static237.aClass1_Sub14_Sub1_7);
									Static26.method479(null, local796, local176, local140, 0, 19, local176);
									Static117.anInt2306 = -1;
									return true;
								} else {
									@Pc(1690) long local1690;
									@Pc(1710) Class1_Sub22 local1710;
									@Pc(1696) Class1_Sub22 local1696;
									if (Static117.anInt2306 == 83) {
										local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
										if (local136 == 65535) {
											local136 = -1;
										}
										local140 = Static237.aClass1_Sub14_Sub1_7.method2641();
										local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
										local231 = Static237.aClass1_Sub14_Sub1_7.method2635();
										if (local147 == 65535) {
											local147 = -1;
										}
										local399 = Static237.aClass1_Sub14_Sub1_7.method2626();
										if (Static114.method1832(local399)) {
											for (local403 = local147; local403 <= local136; local403++) {
												local1690 = ((long) local140 << 32) + ((long) local403);
												local1696 = (Class1_Sub22) Static298.aClass156_29.method3821(local1690);
												if (local1696 != null) {
													local1710 = new Class1_Sub22(local231, local1696.anInt4034);
													local1696.method4616();
												} else if (local403 == -1) {
													local1710 = new Class1_Sub22(local231, Static259.method3908(local140).aClass1_Sub22_1.anInt4034);
												} else {
													local1710 = new Class1_Sub22(local231, -1);
												}
												Static298.aClass156_29.method3816(local1690, local1710);
											}
										}
										Static117.anInt2306 = -1;
										return true;
									} else if (Static117.anInt2306 == 34 || Static117.anInt2306 == 186 || Static117.anInt2306 == 150 || Static117.anInt2306 == 124 || Static117.anInt2306 == 137 || Static117.anInt2306 == 158 || Static117.anInt2306 == 66 || Static117.anInt2306 == 103 || Static117.anInt2306 == 235 || Static117.anInt2306 == 60 || Static117.anInt2306 == 189 || Static117.anInt2306 == 118 || Static117.anInt2306 == 91 || Static117.anInt2306 == 11) {
										Static159.method2690();
										Static117.anInt2306 = -1;
										return true;
									} else if (Static117.anInt2306 == 53) {
										if (Static75.aFrame1 != null) {
											Static214.method3390(-1, false, -1, Static247.anInt4901);
										}
										@Pc(1828) byte[] local1828 = new byte[Static127.anInt2543];
										Static237.aClass1_Sub14_Sub1_7.method2652(local1828, Static127.anInt2543);
										local183 = Static13.method198(Static127.anInt2543, local1828, 0);
										if (Static78.aFrame2 == null && (Static181.anInt3691 == 3 || !Static181.aString120.startsWith("win") || Static280.aBoolean382)) {
											Static183.method3027(local183, true);
										} else {
											Static207.aBoolean281 = true;
											Static68.aString43 = local183;
											Static238.aClass10_10 = Static117.aClass117_3.method2990(local183);
										}
										Static117.anInt2306 = -1;
										return true;
									} else if (Static117.anInt2306 == 132) {
										local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
										local147 = local136 & 0x1F;
										local140 = local136 >> 5;
										if (local147 == 0) {
											Static257.aClass68Array1[local140] = null;
											Static117.anInt2306 = -1;
											return true;
										}
										@Pc(1907) Class68 local1907 = new Class68();
										local1907.anInt1791 = local147;
										local1907.anInt1794 = Static237.aClass1_Sub14_Sub1_7.method2595();
										if (local1907.anInt1794 >= 0 && Static56.aClass1_Sub1_Sub3Array5.length > local1907.anInt1794) {
											if (local1907.anInt1791 == 1 || local1907.anInt1791 == 10) {
												local1907.anInt1785 = Static237.aClass1_Sub14_Sub1_7.method2593();
												Static237.aClass1_Sub14_Sub1_7.anInt3290 += 5;
											} else if (local1907.anInt1791 >= 2 && local1907.anInt1791 <= 6) {
												if (local1907.anInt1791 == 2) {
													local1907.anInt1784 = 64;
													local1907.anInt1796 = 64;
												}
												if (local1907.anInt1791 == 3) {
													local1907.anInt1784 = 0;
													local1907.anInt1796 = 64;
												}
												if (local1907.anInt1791 == 4) {
													local1907.anInt1796 = 64;
													local1907.anInt1784 = 128;
												}
												if (local1907.anInt1791 == 5) {
													local1907.anInt1796 = 0;
													local1907.anInt1784 = 64;
												}
												if (local1907.anInt1791 == 6) {
													local1907.anInt1784 = 64;
													local1907.anInt1796 = 128;
												}
												local1907.anInt1791 = 2;
												local1907.anInt1786 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local1907.anInt1795 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local1907.anInt1792 = Static237.aClass1_Sub14_Sub1_7.method2595();
												local1907.anInt1790 = Static237.aClass1_Sub14_Sub1_7.method2593();
											}
											local1907.anInt1788 = Static237.aClass1_Sub14_Sub1_7.method2593();
											if (local1907.anInt1788 == 65535) {
												local1907.anInt1788 = -1;
											}
											Static257.aClass68Array1[local140] = local1907;
										}
										Static117.anInt2306 = -1;
										return true;
									} else {
										@Pc(2239) boolean local2239;
										if (Static117.anInt2306 == 194) {
											Static73.anInt1409 = Static314.anInt5908;
											if (Static127.anInt2543 == 0) {
												Static117.anInt2306 = -1;
												Static183.anInt3703 = 0;
												Static295.aString189 = null;
												Static208.aClass31Array1 = null;
												Static104.aString70 = null;
												return true;
											}
											Static104.aString70 = Static237.aClass1_Sub14_Sub1_7.method2605();
											local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
											if (local788) {
												Static237.aClass1_Sub14_Sub1_7.method2605();
											}
											@Pc(2118) long local2118 = Static237.aClass1_Sub14_Sub1_7.method2587();
											Static295.aString189 = Static159.method2693(local2118);
											Static210.aByte20 = Static237.aClass1_Sub14_Sub1_7.method2598();
											local231 = Static237.aClass1_Sub14_Sub1_7.method2595();
											if (local231 == 255) {
												Static117.anInt2306 = -1;
												return true;
											}
											Static183.anInt3703 = local231;
											@Pc(2144) Class31[] local2144 = new Class31[100];
											for (local403 = 0; local403 < Static183.anInt3703; local403++) {
												local2144[local403] = new Class31();
												local2144[local403].aString21 = Static237.aClass1_Sub14_Sub1_7.method2605();
												local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
												if (local788) {
													local2144[local403].aString20 = Static237.aClass1_Sub14_Sub1_7.method2605();
												} else {
													local2144[local403].aString20 = local2144[local403].aString21;
												}
												local2144[local403].anInt584 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local2144[local403].aByte1 = Static237.aClass1_Sub14_Sub1_7.method2598();
												local2144[local403].aString19 = Static237.aClass1_Sub14_Sub1_7.method2605();
												if (local2144[local403].aString20.equals(Static229.aClass22_Sub3_Sub2_2.aString153)) {
													Static140.aByte9 = local2144[local403].aByte1;
												}
											}
											local830 = Static183.anInt3703;
											while (local830 > 0) {
												local2239 = true;
												local830--;
												for (local966 = 0; local966 < local830; local966++) {
													if (local2144[local966].aString21.compareTo(local2144[local966 + 1].aString21) > 0) {
														@Pc(2268) Class31 local2268 = local2144[local966];
														local2144[local966] = local2144[local966 + 1];
														local2144[local966 + 1] = local2268;
														local2239 = false;
													}
												}
												if (local2239) {
													break;
												}
											}
											Static208.aClass31Array1 = local2144;
											Static117.anInt2306 = -1;
											return true;
										} else if (Static117.anInt2306 == 69) {
											local136 = Static237.aClass1_Sub14_Sub1_7.method2596();
											local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
											local147 = Static237.aClass1_Sub14_Sub1_7.method2638();
											if (Static114.method1832(local147)) {
												if (local136 == 2) {
													Static303.method4528();
												}
												Static287.anInt5450 = local140;
												Static87.method1295(local140);
												Static118.method1924(false);
												Static55.method966(Static287.anInt5450);
												for (local231 = 0; local231 < 100; local231++) {
													Static132.aBooleanArray25[local231] = true;
												}
											}
											Static117.anInt2306 = -1;
											return true;
										} else if (Static117.anInt2306 == 231) {
											if (Static127.anInt2543 == 0) {
												Static31.aString18 = Static269.aString15;
											} else {
												Static31.aString18 = Static237.aClass1_Sub14_Sub1_7.method2605();
											}
											Static117.anInt2306 = -1;
											return true;
										} else if (Static117.anInt2306 == 216) {
											local136 = Static237.aClass1_Sub14_Sub1_7.method2638();
											local140 = Static237.aClass1_Sub14_Sub1_7.method2627();
											local147 = Static237.aClass1_Sub14_Sub1_7.method2626();
											@Pc(2392) Class22_Sub3_Sub1 local2392 = Static265.aClass22_Sub3_Sub1Array1[local147];
											if (local2392 != null) {
												Static216.method3405(local2392, local136, local140);
											}
											Static117.anInt2306 = -1;
											return true;
										} else {
											@Pc(2488) int local2488;
											if (Static117.anInt2306 == 36) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2647();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
												if (local136 >= 0) {
													local592 = Static259.method3908(local136);
												} else {
													local592 = null;
												}
												if (local592 != null) {
													for (local231 = 0; local231 < local592.anIntArray358.length; local231++) {
														local592.anIntArray358[local231] = 0;
														local592.anIntArray353[local231] = 0;
													}
												}
												if (local136 < -70000) {
													local140 += 32768;
												}
												Static45.method810(local140);
												local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
												for (local399 = 0; local399 < local231; local399++) {
													local403 = Static237.aClass1_Sub14_Sub1_7.method2595();
													if (local403 == 255) {
														local403 = Static237.aClass1_Sub14_Sub1_7.method2620();
													}
													local2488 = Static237.aClass1_Sub14_Sub1_7.method2638();
													if (local592 != null && local592.anIntArray358.length > local399) {
														local592.anIntArray358[local399] = local2488;
														local592.anIntArray353[local399] = local403;
													}
													Static218.method3439(local140, local399, local2488 - 1, local403);
												}
												if (local592 != null) {
													Static237.method2927(local592);
												}
												Static312.method4591();
												Static51.anIntArray84[Static92.anInt1760++ & 0x1F] = local140 & 0x7FFF;
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 240) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
												Static268.aClass10_12 = Static117.aClass117_3.method3006(local136);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 55) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2638();
												if (local136 == 65535) {
													local136 = -1;
												}
												local140 = Static237.aClass1_Sub14_Sub1_7.method2596();
												Static271.method4010(local136, local140);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 125) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
												if (local136 == 65535) {
													local136 = -1;
												}
												local140 = Static237.aClass1_Sub14_Sub1_7.method2646();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2640();
												Static206.method3276(local140, local136, local147);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 228) {
												Static237.aClass1_Sub14_Sub1_7.anInt3290 += 28;
												if (Static237.aClass1_Sub14_Sub1_7.method2586()) {
													Static144.method2294(Static237.aClass1_Sub14_Sub1_7.anInt3290 - 28, Static237.aClass1_Sub14_Sub1_7);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 196) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2646();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2596();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2627();
												Static295.anInt5586 = local147 >> 1;
												Static229.aClass22_Sub3_Sub2_2.method3661(local136, local140, (local147 & 0x1) == 1);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 195) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2626();
												if (Static114.method1832(local140)) {
													Static25.method463(local147, local136);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 23) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2647();
												@Pc(2726) Class146 local2726 = Static259.method3908(local136);
												for (local147 = 0; local147 < local2726.anIntArray358.length; local147++) {
													local2726.anIntArray358[local147] = -1;
													local2726.anIntArray358[local147] = 0;
												}
												Static237.method2927(local2726);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 197) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2635();
												Static192.method3141(local140, local136);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 165) {
												local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
												local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
												local796 = local183;
												if (local788) {
													local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
												}
												@Pc(2804) boolean local2804 = false;
												local1335 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local1340 = Static237.aClass1_Sub14_Sub1_7.method2588();
												local830 = Static237.aClass1_Sub14_Sub1_7.method2595();
												@Pc(2825) long local2825 = (local1335 << 32) + local1340;
												@Pc(2827) int local2827 = 0;
												while (true) {
													if (local2827 >= 100) {
														if (local830 <= 1) {
															if (Static310.aBoolean108 && !Static241.aBoolean346 || Static206.aBoolean280) {
																local2804 = true;
															} else if (Static15.method209(local796)) {
																local2804 = true;
															}
														}
														break;
													}
													if (local2825 == Static162.aLongArray69[local2827]) {
														local2804 = true;
														break;
													}
													local2827++;
												}
												if (!local2804 && Static310.anInt1326 == 0) {
													Static162.aLongArray69[Static14.anInt230] = local2825;
													Static14.anInt230 = (Static14.anInt230 + 1) % 100;
													local1030 = Static139.method4431(Static298.method4460(Static212.method3330(Static237.aClass1_Sub14_Sub1_7)));
													if (local830 == 2) {
														Static26.method479(null, local1030, "<img=1>" + local183, -1, 0, 7, "<img=1>" + local796);
													} else if (local830 == 1) {
														Static26.method479(null, local1030, "<img=0>" + local183, -1, 0, 7, "<img=0>" + local796);
													} else {
														Static26.method479(null, local1030, local183, -1, 0, 3, local796);
													}
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 78) {
												local176 = Static237.aClass1_Sub14_Sub1_7.method2605();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2614();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
												if (Static114.method1832(local140)) {
													Static273.method4041(local176, local147);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 19) {
												Static122.anInt2466 = Static237.aClass1_Sub14_Sub1_7.method2626() * 30;
												Static220.anInt5820 = Static314.anInt5908;
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 159) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
												Static292.method4347(local136);
												Static51.anIntArray84[Static92.anInt1760++ & 0x1F] = local136 & 0x7FFF;
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 163) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2638();
												local231 = Static237.aClass1_Sub14_Sub1_7.method2614();
												local399 = Static237.aClass1_Sub14_Sub1_7.method2620();
												if (Static114.method1832(local231)) {
													Static108.method1780(local136 << 16 | local147, local399, 7, local140);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 121) {
												Static281.method4172(true);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 88) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2615();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2647();
												if (Static114.method1832(local140)) {
													Static296.method4399(local136, local147);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 113) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2620();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
												local147 = Static237.aClass1_Sub14_Sub1_7.method2638();
												local231 = Static237.aClass1_Sub14_Sub1_7.method2638();
												local399 = Static237.aClass1_Sub14_Sub1_7.method2614();
												if (Static114.method1832(local147)) {
													Static240.method1122(local399, local136, local140, local231);
												}
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 142) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2596();
												local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
												Static192.method3141(local136, local140);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 249) {
												local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
												local1192 = Static237.aClass1_Sub14_Sub1_7.method2607();
												Static290.method4289(local1192, local136);
												Static117.anInt2306 = -1;
												return true;
											} else if (Static117.anInt2306 == 138) {
												for (local136 = 0; local136 < Static46.anIntArray78.length; local136++) {
													if (Static264.anIntArray457[local136] != Static46.anIntArray78[local136]) {
														Static46.anIntArray78[local136] = Static264.anIntArray457[local136];
														Static255.method3876(local136);
														Static148.anIntArray241[Static250.anInt3291++ & 0x1F] = local136;
													}
												}
												Static117.anInt2306 = -1;
												return true;
											} else {
												@Pc(3295) Class1_Sub32 local3295;
												if (Static117.anInt2306 == 131) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2620();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2620();
													if (Static114.method1832(local140)) {
														@Pc(3288) Class1_Sub32 local3288 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local147);
														local3295 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local136);
														if (local3295 != null) {
															Static195.method3172(local3295, local3288 == null || local3295.anInt5722 != local3288.anInt5722);
														}
														if (local3288 != null) {
															local3288.method4616();
															Static69.aClass156_6.method3816((long) local136, local3288);
														}
														@Pc(3331) Class146 local3331 = Static259.method3908(local147);
														if (local3331 != null) {
															Static237.method2927(local3331);
														}
														local3331 = Static259.method3908(local136);
														if (local3331 != null) {
															Static237.method2927(local3331);
															Static45.method813(true, local3331);
														}
														if (Static287.anInt5450 != -1) {
															Static86.method1270(1, Static287.anInt5450);
														}
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 28) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2614();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2647();
													if (local136 == 65535) {
														local136 = -1;
													}
													local231 = local140 >> 14 & 0x3FFF;
													local147 = local140 >> 28 & 0x3;
													local399 = local140 & 0x3FFF;
													local403 = Static237.aClass1_Sub14_Sub1_7.method2627();
													local231 -= Static290.anInt5497;
													local399 -= Static118.anInt2409;
													local2488 = local403 >> 2;
													local830 = local403 & 0x3;
													local966 = Static15.anIntArray21[local2488];
													Static250.method2601(local231, local830, local147, local966, local399, local136, local2488);
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 251) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2626();
													if (local140 == 65535) {
														local140 = -1;
													}
													local147 = Static237.aClass1_Sub14_Sub1_7.method2614();
													local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local399 = Static237.aClass1_Sub14_Sub1_7.method2593();
													if (local231 == 65535) {
														local231 = -1;
													}
													if (Static114.method1832(local147)) {
														for (local403 = local231; local403 <= local140; local403++) {
															local1690 = (long) local403 + ((long) local136 << 32);
															local1696 = (Class1_Sub22) Static298.aClass156_29.method3821(local1690);
															if (local1696 != null) {
																local1710 = new Class1_Sub22(local1696.anInt4031, local399);
																local1696.method4616();
															} else if (local403 == -1) {
																local1710 = new Class1_Sub22(Static259.method3908(local136).aClass1_Sub22_1.anInt4031, local399);
															} else {
																local1710 = new Class1_Sub22(0, local399);
															}
															Static298.aClass156_29.method3816(local1690, local1710);
														}
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 86) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2595();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2595();
													local231 = Static237.aClass1_Sub14_Sub1_7.method2595();
													local399 = Static237.aClass1_Sub14_Sub1_7.method2595();
													local403 = Static237.aClass1_Sub14_Sub1_7.method2593();
													if (Static114.method1832(local136)) {
														Static104.aBooleanArray19[local140] = true;
														Static279.anIntArray488[local140] = local147;
														Static221.anIntArray348[local140] = local231;
														Static204.anIntArray331[local140] = local399;
														Static236.anIntArray432[local140] = local403;
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 87) {
													Static5.anInt68 = Static237.aClass1_Sub14_Sub1_7.method2646();
													Static146.anInt2885 = Static237.aClass1_Sub14_Sub1_7.method2596();
													for (local136 = Static146.anInt2885; local136 < Static146.anInt2885 + 8; local136++) {
														for (local140 = Static5.anInt68; local140 < Static5.anInt68 + 8; local140++) {
															if (Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local136][local140] != null) {
																Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local136][local140] = null;
																Static24.method458(local140, local136);
															}
														}
													}
													for (@Pc(3661) Class1_Sub19 local3661 = (Class1_Sub19) Static114.aClass24_16.method460(); local3661 != null; local3661 = (Class1_Sub19) Static114.aClass24_16.method464()) {
														if (Static146.anInt2885 <= local3661.anInt3719 && local3661.anInt3719 < Static146.anInt2885 + 8 && local3661.anInt3725 >= Static5.anInt68 && local3661.anInt3725 < Static5.anInt68 + 8 && Static295.anInt5586 == local3661.anInt3722) {
															local3661.anInt3726 = 0;
														}
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 201) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
													@Pc(3742) Object[] local3742 = new Object[local183.length() + 1];
													for (local231 = local183.length() - 1; local231 >= 0; local231--) {
														if (local183.charAt(local231) == 's') {
															local3742[local231 + 1] = Static237.aClass1_Sub14_Sub1_7.method2605();
														} else {
															local3742[local231 + 1] = Integer.valueOf(Static237.aClass1_Sub14_Sub1_7.method2647());
														}
													}
													local3742[0] = Integer.valueOf(Static237.aClass1_Sub14_Sub1_7.method2647());
													if (Static114.method1832(local136)) {
														@Pc(3797) Class1_Sub29 local3797 = new Class1_Sub29();
														local3797.anObjectArray32 = local3742;
														Static171.method2886(local3797);
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 119) {
													Static24.anInt469 = Static237.aClass1_Sub14_Sub1_7.method2595();
													Static210.anInt4145 = Static237.aClass1_Sub14_Sub1_7.method2595();
													Static188.anInt3772 = Static237.aClass1_Sub14_Sub1_7.method2595();
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 214) {
													Static105.method1696(Static237.aClass1_Sub14_Sub1_7.method2605());
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 64) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2635();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2614();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2626();
													local231 = Static237.aClass1_Sub14_Sub1_7.method2638();
													if (Static114.method1832(local140)) {
														Static217.method3428(local136, local147 + (local231 << 16));
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 81) {
													if (Static287.anInt5450 != -1) {
														Static86.method1270(0, Static287.anInt5450);
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 68) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2626();
													local231 = Static237.aClass1_Sub14_Sub1_7.method2641();
													if (local231 >> 30 == 0) {
														@Pc(3959) Class97 local3959;
														@Pc(3984) Class167 local3984;
														@Pc(3964) Class97 local3964;
														@Pc(3979) Class167 local3979;
														@Pc(4013) Class167 local4013;
														if (local231 >> 29 != 0) {
															local399 = local231 & 0xFFFF;
															@Pc(3929) Class22_Sub3_Sub1 local3929 = Static265.aClass22_Sub3_Sub1Array1[local399];
															if (local3929 != null) {
																local806 = true;
																if (local147 == 65535) {
																	local147 = -1;
																}
																if (local147 != -1 && local3929.anInt4562 != -1) {
																	if (local147 == local3929.anInt4562) {
																		local3959 = Static239.method3759(local147);
																		if (local3959.aBoolean196 && local3959.anInt2712 != -1) {
																			local4013 = Static313.method4648(local3959.anInt2712);
																			local973 = local4013.anInt5131;
																			if (local973 == 1) {
																				local3929.anInt4575 = Static37.anInt757 + local140;
																				local3929.anInt4607 = 1;
																				local806 = false;
																				local3929.anInt4619 = 0;
																				local3929.anInt4596 = 0;
																				local3929.anInt4606 = 0;
																				Static212.method3338(local3929.anInt4601, false, local3929.anInt4619, local4013, local3929.anInt4623);
																			} else if (local973 == 2) {
																				local806 = false;
																				local3929.anInt4567 = 0;
																			}
																		}
																	} else {
																		local3959 = Static239.method3759(local147);
																		local3964 = Static239.method3759(local3929.anInt4562);
																		if (local3959.anInt2712 != -1 && local3964.anInt2712 != -1) {
																			local3979 = Static313.method4648(local3959.anInt2712);
																			local3984 = Static313.method4648(local3964.anInt2712);
																			if (local3984.anInt5114 > local3979.anInt5114) {
																				local806 = false;
																			}
																		}
																	}
																}
																if (local806) {
																	local3929.anInt4569 = local136;
																	local3929.anInt4607 = 1;
																	local3929.anInt4596 = 0;
																	local3929.anInt4575 = Static37.anInt757 + local140;
																	local3929.anInt4619 = 0;
																	local3929.anInt4562 = local147;
																	if (Static37.anInt757 < local3929.anInt4575) {
																		local3929.anInt4619 = -1;
																	}
																	if (local3929.anInt4562 != -1 && local3929.anInt4575 == Static37.anInt757) {
																		local830 = Static239.method3759(local3929.anInt4562).anInt2712;
																		if (local830 != -1) {
																			local4013 = Static313.method4648(local830);
																			if (local4013 != null && local4013.anIntArray461 != null) {
																				Static212.method3338(local3929.anInt4601, false, 0, local4013, local3929.anInt4623);
																			}
																		}
																	}
																}
															}
														} else if (local231 >> 28 != 0) {
															local399 = local231 & 0xFFFF;
															@Pc(4156) Class22_Sub3_Sub2 local4156;
															if (local399 == Static117.anInt2308) {
																local4156 = Static229.aClass22_Sub3_Sub2_2;
															} else {
																local4156 = Static195.aClass22_Sub3_Sub2Array1[local399];
															}
															if (local4156 != null) {
																if (local147 == 65535) {
																	local147 = -1;
																}
																local806 = true;
																if (local147 != -1 && local4156.anInt4562 != -1) {
																	if (local4156.anInt4562 == local147) {
																		local3959 = Static239.method3759(local147);
																		if (local3959.aBoolean196 && local3959.anInt2712 != -1) {
																			local4013 = Static313.method4648(local3959.anInt2712);
																			local973 = local4013.anInt5131;
																			if (local973 == 1) {
																				local806 = false;
																				local4156.anInt4575 = Static37.anInt757 + local140;
																				local4156.anInt4607 = 1;
																				local4156.anInt4619 = 0;
																				local4156.anInt4596 = 0;
																				local4156.anInt4606 = 0;
																				Static212.method3338(local4156.anInt4601, false, local4156.anInt4619, local4013, local4156.anInt4623);
																			} else if (local973 == 2) {
																				local806 = false;
																				local4156.anInt4567 = 0;
																			}
																		}
																	} else {
																		local3959 = Static239.method3759(local147);
																		local3964 = Static239.method3759(local4156.anInt4562);
																		if (local3959.anInt2712 != -1 && local3964.anInt2712 != -1) {
																			local3979 = Static313.method4648(local3959.anInt2712);
																			local3984 = Static313.method4648(local3964.anInt2712);
																			if (local3984.anInt5114 > local3979.anInt5114) {
																				local806 = false;
																			}
																		}
																	}
																}
																if (local806) {
																	local4156.anInt4575 = local140 + Static37.anInt757;
																	local4156.anInt4596 = 0;
																	local4156.anInt4607 = 1;
																	local4156.anInt4569 = local136;
																	local4156.anInt4562 = local147;
																	if (local4156.anInt4562 == 65535) {
																		local4156.anInt4562 = -1;
																	}
																	local4156.anInt4619 = 0;
																	if (Static37.anInt757 < local4156.anInt4575) {
																		local4156.anInt4619 = -1;
																	}
																	if (local4156.anInt4562 != -1 && local4156.anInt4575 == Static37.anInt757) {
																		local830 = Static239.method3759(local4156.anInt4562).anInt2712;
																		if (local830 != -1) {
																			local4013 = Static313.method4648(local830);
																			if (local4013 != null && local4013.anIntArray461 != null) {
																				Static212.method3338(local4156.anInt4601, local4156 == Static229.aClass22_Sub3_Sub2_2, 0, local4013, local4156.anInt4623);
																			}
																		}
																	}
																}
															}
														}
													} else {
														local399 = local231 >> 28 & 0x3;
														local403 = (local231 >> 14 & 0x3FFF) - Static290.anInt5497;
														local2488 = (local231 & 0x3FFF) - Static118.anInt2409;
														if (local403 >= 0 && local2488 >= 0 && local403 < 104 && local2488 < 104) {
															local2488 = local2488 * 128 + 64;
															local403 = local403 * 128 + 64;
															@Pc(4454) Class22_Sub1 local4454 = new Class22_Sub1(local147, local399, local403, local2488, Static104.method1648(local399, local403, local2488) - local136, local140, Static37.anInt757);
															Static185.aClass24_21.method473(new Class1_Sub1_Sub4(local4454));
														}
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 9) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2638();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2620();
													if (Static114.method1832(local140)) {
														Static20.method403(local147, local136);
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 247) {
													local176 = Static237.aClass1_Sub14_Sub1_7.method2605();
													@Pc(4512) boolean local4512 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
													if (local4512) {
														local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
													} else {
														local183 = local176;
													}
													local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local2239 = false;
													@Pc(4532) byte local4532 = Static237.aClass1_Sub14_Sub1_7.method2598();
													if (local4532 == -128) {
														local2239 = true;
													}
													if (local2239) {
														if (Static183.anInt3703 == 0) {
															Static117.anInt2306 = -1;
															return true;
														}
														for (local2488 = 0; local2488 < Static183.anInt3703 && (!Static208.aClass31Array1[local2488].aString20.equals(local183) || Static208.aClass31Array1[local2488].anInt584 != local231); local2488++) {
														}
														if (local2488 < Static183.anInt3703) {
															while (local2488 < Static183.anInt3703 - 1) {
																Static208.aClass31Array1[local2488] = Static208.aClass31Array1[local2488 + 1];
																local2488++;
															}
															Static183.anInt3703--;
															Static208.aClass31Array1[Static183.anInt3703] = null;
														}
													} else {
														@Pc(4615) String local4615 = Static237.aClass1_Sub14_Sub1_7.method2605();
														@Pc(4619) Class31 local4619 = new Class31();
														local4619.aString20 = local183;
														local4619.aString19 = local4615;
														local4619.aByte1 = local4532;
														local4619.anInt584 = local231;
														local4619.aString21 = local176;
														for (local966 = Static183.anInt3703 - 1; local966 >= 0; local966--) {
															local973 = Static208.aClass31Array1[local966].aString20.compareTo(local4619.aString20);
															if (local973 == 0) {
																Static208.aClass31Array1[local966].anInt584 = local231;
																Static208.aClass31Array1[local966].aByte1 = local4532;
																Static208.aClass31Array1[local966].aString19 = local4615;
																if (local183.equals(Static229.aClass22_Sub3_Sub2_2.aString153)) {
																	Static140.aByte9 = local4532;
																}
																Static117.anInt2306 = -1;
																Static73.anInt1409 = Static314.anInt5908;
																return true;
															}
															if (local973 < 0) {
																break;
															}
														}
														if (Static208.aClass31Array1.length <= Static183.anInt3703) {
															Static117.anInt2306 = -1;
															return true;
														}
														for (local973 = Static183.anInt3703 - 1; local973 > local966; local973--) {
															Static208.aClass31Array1[local973 + 1] = Static208.aClass31Array1[local973];
														}
														if (Static183.anInt3703 == 0) {
															Static208.aClass31Array1 = new Class31[100];
														}
														Static208.aClass31Array1[local966 + 1] = local4619;
														Static183.anInt3703++;
														if (local183.equals(Static229.aClass22_Sub3_Sub2_2.aString153)) {
															Static140.aByte9 = local4532;
														}
													}
													Static117.anInt2306 = -1;
													Static73.anInt1409 = Static314.anInt5908;
													return true;
												} else if (Static117.anInt2306 == 110) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2626();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2635();
													local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
													if (Static114.method1832(local136)) {
														Static286.method4252(local140, local796);
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 234) {
													Static268.anInt5931 = Static237.aClass1_Sub14_Sub1_7.method2595();
													for (local136 = 0; local136 < Static268.anInt5931; local136++) {
														Static57.aStringArray8[local136] = Static237.aClass1_Sub14_Sub1_7.method2605();
														Static255.aStringArray42[local136] = Static237.aClass1_Sub14_Sub1_7.method2605();
														if (Static255.aStringArray42[local136].equals("")) {
															Static255.aStringArray42[local136] = Static57.aStringArray8[local136];
														}
														Static172.aStringArray3[local136] = Static237.aClass1_Sub14_Sub1_7.method2605();
														Static250.aStringArray27[local136] = Static237.aClass1_Sub14_Sub1_7.method2605();
														if (Static250.aStringArray27[local136].equals("")) {
															Static250.aStringArray27[local136] = Static172.aStringArray3[local136];
														}
														Static90.aBooleanArray49[local136] = false;
													}
													Static117.anInt2306 = -1;
													Static214.anInt4214 = Static314.anInt5908;
													return true;
												} else if (Static117.anInt2306 == 246) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2638();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2635();
													local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
													if (Static114.method1832(local147)) {
														Static242.method3781(local136, local140);
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 77) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													local140 = Static237.aClass1_Sub14_Sub1_7.method2647();
													if (Static114.method1832(local136)) {
														@Pc(4914) Class1_Sub32 local4914 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local140);
														if (local4914 != null) {
															Static195.method3172(local4914, true);
														}
														if (Static92.aClass146_7 != null) {
															Static237.method2927(Static92.aClass146_7);
															Static92.aClass146_7 = null;
														}
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 70) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													if (Static114.method1832(local136)) {
														Static119.method4630();
													}
													Static117.anInt2306 = -1;
													return true;
												} else if (Static117.anInt2306 == 41) {
													local136 = Static237.aClass1_Sub14_Sub1_7.method2593();
													if (Static114.method1832(local136)) {
														Static156.method2665();
													}
													Static117.anInt2306 = -1;
													return true;
												} else {
													@Pc(4990) String local4990;
													@Pc(4988) String local4988;
													if (Static117.anInt2306 == 109) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2648();
														local140 = Static237.aClass1_Sub14_Sub1_7.method2647();
														local147 = Static237.aClass1_Sub14_Sub1_7.method2595();
														local4988 = "";
														local4990 = local4988;
														if ((local147 & 0x1) != 0) {
															local4988 = Static237.aClass1_Sub14_Sub1_7.method2605();
															if ((local147 & 0x2) == 0) {
																local4990 = local4988;
															} else {
																local4990 = Static237.aClass1_Sub14_Sub1_7.method2605();
															}
														}
														local808 = Static237.aClass1_Sub14_Sub1_7.method2605();
														if (!local4990.equals("") && Static15.method209(local4990)) {
															Static117.anInt2306 = -1;
															return true;
														} else {
															Static232.method2984(local4990, local4988, local136, local140, local808);
															Static117.anInt2306 = -1;
															return true;
														}
													} else if (Static117.anInt2306 == 237) {
														local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
														local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
														local796 = local183;
														if (local788) {
															local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
														}
														local1335 = Static237.aClass1_Sub14_Sub1_7.method2593();
														local1340 = Static237.aClass1_Sub14_Sub1_7.method2588();
														local830 = Static237.aClass1_Sub14_Sub1_7.method2595();
														@Pc(5089) long local5089 = local1340 + (local1335 << 32);
														@Pc(5091) boolean local5091 = false;
														local966 = Static237.aClass1_Sub14_Sub1_7.method2593();
														@Pc(5097) int local5097 = 0;
														while (true) {
															if (local5097 >= 100) {
																if (local830 <= 1 && Static15.method209(local796)) {
																	local5091 = true;
																}
																break;
															}
															if (Static162.aLongArray69[local5097] == local5089) {
																local5091 = true;
																break;
															}
															local5097++;
														}
														if (!local5091 && Static310.anInt1326 == 0) {
															Static162.aLongArray69[Static14.anInt230] = local5089;
															Static14.anInt230 = (Static14.anInt230 + 1) % 100;
															local1048 = Static57.method981(local966).method3808(Static237.aClass1_Sub14_Sub1_7);
															if (local830 == 2) {
																Static26.method479(null, local1048, "<img=1>" + local183, local966, 0, 18, "<img=1>" + local796);
															} else if (local830 == 1) {
																Static26.method479(null, local1048, "<img=0>" + local183, local966, 0, 18, "<img=0>" + local796);
															} else {
																Static26.method479(null, local1048, local183, local966, 0, 18, local796);
															}
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 2) {
														Static230.method3625();
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 254) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2641();
														local140 = Static237.aClass1_Sub14_Sub1_7.method2614();
														local147 = Static237.aClass1_Sub14_Sub1_7.method2647();
														local231 = Static237.aClass1_Sub14_Sub1_7.method2593();
														if (Static114.method1832(local140)) {
															Static108.method1780(local231, local147, 5, local136);
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 29) {
														Static5.anInt68 = Static237.aClass1_Sub14_Sub1_7.method2596();
														Static146.anInt2885 = Static237.aClass1_Sub14_Sub1_7.method2595();
														while (Static237.aClass1_Sub14_Sub1_7.anInt3290 < Static127.anInt2543) {
															Static117.anInt2306 = Static237.aClass1_Sub14_Sub1_7.method2595();
															Static159.method2690();
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 62) {
														local788 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
														local183 = Static237.aClass1_Sub14_Sub1_7.method2605();
														local796 = local183;
														if (local788) {
															local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
														}
														local1335 = Static237.aClass1_Sub14_Sub1_7.method2587();
														local1340 = Static237.aClass1_Sub14_Sub1_7.method2593();
														local1345 = Static237.aClass1_Sub14_Sub1_7.method2588();
														@Pc(5335) long local5335 = local1345 + (local1340 << 32);
														local973 = Static237.aClass1_Sub14_Sub1_7.method2595();
														@Pc(5341) boolean local5341 = false;
														@Pc(5343) int local5343 = 0;
														while (true) {
															if (local5343 >= 100) {
																if (local973 <= 1) {
																	if (Static310.aBoolean108 && !Static241.aBoolean346 || Static206.aBoolean280) {
																		local5341 = true;
																	} else if (Static15.method209(local796)) {
																		local5341 = true;
																	}
																}
																break;
															}
															if (local5335 == Static162.aLongArray69[local5343]) {
																local5341 = true;
																break;
															}
															local5343++;
														}
														if (!local5341 && Static310.anInt1326 == 0) {
															Static162.aLongArray69[Static14.anInt230] = local5335;
															Static14.anInt230 = (Static14.anInt230 + 1) % 100;
															local1066 = Static139.method4431(Static298.method4460(Static212.method3330(Static237.aClass1_Sub14_Sub1_7)));
															if (local973 == 2 || local973 == 3) {
																Static26.method479(Static46.method815(local1335), local1066, "<img=1>" + local183, -1, 0, 9, "<img=1>" + local796);
															} else if (local973 == 1) {
																Static26.method479(Static46.method815(local1335), local1066, "<img=0>" + local183, -1, 0, 9, "<img=0>" + local796);
															} else {
																Static26.method479(Static46.method815(local1335), local1066, local183, -1, 0, 9, local796);
															}
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 94) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
														@Pc(5505) boolean local5505 = (local136 & 0x1) == 1;
														local796 = Static237.aClass1_Sub14_Sub1_7.method2605();
														local4988 = Static237.aClass1_Sub14_Sub1_7.method2605();
														local4990 = Static237.aClass1_Sub14_Sub1_7.method2605();
														local808 = Static237.aClass1_Sub14_Sub1_7.method2605();
														if (local5505) {
															for (local2488 = 0; local2488 < Static268.anInt5931; local2488++) {
																if (Static255.aStringArray42[local2488].equals(local808)) {
																	Static57.aStringArray8[local2488] = local796;
																	if (local4988.equals("")) {
																		Static255.aStringArray42[local2488] = local796;
																	} else {
																		Static255.aStringArray42[local2488] = local4988;
																	}
																	Static172.aStringArray3[local2488] = local4990;
																	if (local808.equals("")) {
																		Static250.aStringArray27[local2488] = local4990;
																	} else {
																		Static250.aStringArray27[local2488] = local808;
																	}
																	break;
																}
															}
														} else {
															Static57.aStringArray8[Static268.anInt5931] = local796;
															if (local4988.equals("")) {
																Static255.aStringArray42[Static268.anInt5931] = local796;
															} else {
																Static255.aStringArray42[Static268.anInt5931] = local4988;
															}
															Static172.aStringArray3[Static268.anInt5931] = local4990;
															if (local808.equals("")) {
																Static250.aStringArray27[Static268.anInt5931] = local4990;
															} else {
																Static250.aStringArray27[Static268.anInt5931] = local808;
															}
															Static90.aBooleanArray49[Static268.anInt5931] = (local136 & 0x2) == 2;
															Static268.anInt5931++;
														}
														Static117.anInt2306 = -1;
														Static214.anInt4214 = Static314.anInt5908;
														return true;
													} else if (Static117.anInt2306 == 209) {
														Static312.method4591();
														local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
														local140 = Static237.aClass1_Sub14_Sub1_7.method2647();
														local147 = Static237.aClass1_Sub14_Sub1_7.method2596();
														Static31.anIntArray48[local147] = local140;
														Static217.anIntArray342[local147] = local136;
														Static97.anIntArray146[local147] = 1;
														for (local231 = 0; local231 < 98; local231++) {
															if (local140 >= Class1_Sub1_Sub23.anIntArray492[local231]) {
																Static97.anIntArray146[local147] = local231 + 2;
															}
														}
														Static212.anIntArray336[Static247.anInt4899++ & 0x1F] = local147;
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 40) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
														local140 = Static237.aClass1_Sub14_Sub1_7.method2614();
														local147 = Static237.aClass1_Sub14_Sub1_7.method2596();
														local4988 = Static237.aClass1_Sub14_Sub1_7.method2605();
														if (local140 == 65535) {
															local140 = -1;
														}
														if (local136 >= 1 && local136 <= 8) {
															if (local4988.equalsIgnoreCase("null")) {
																local4988 = null;
															}
															Static232.aStringArray33[local136 - 1] = local4988;
															Static46.anIntArray77[local136 - 1] = local140;
															Static280.aBooleanArray58[local136 - 1] = local147 == 0;
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 139) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
														if (Static237.aClass1_Sub14_Sub1_7.method2595() == 0) {
															Static122.aClass83Array1[local136] = new Class83();
														} else {
															Static237.aClass1_Sub14_Sub1_7.anInt3290--;
															Static122.aClass83Array1[local136] = new Class83(Static237.aClass1_Sub14_Sub1_7);
														}
														Static117.anInt2306 = -1;
														Static111.anInt2216 = Static314.anInt5908;
														return true;
													} else if (Static117.anInt2306 == 102) {
														for (local136 = 0; local136 < Static195.aClass22_Sub3_Sub2Array1.length; local136++) {
															if (Static195.aClass22_Sub3_Sub2Array1[local136] != null) {
																Static195.aClass22_Sub3_Sub2Array1[local136].anInt4642 = -1;
															}
														}
														for (local136 = 0; local136 < Static265.aClass22_Sub3_Sub1Array1.length; local136++) {
															if (Static265.aClass22_Sub3_Sub1Array1[local136] != null) {
																Static265.aClass22_Sub3_Sub1Array1[local136].anInt4642 = -1;
															}
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 187) {
														local136 = Static237.aClass1_Sub14_Sub1_7.method2595();
														local140 = Static237.aClass1_Sub14_Sub1_7.method2638();
														local147 = Static237.aClass1_Sub14_Sub1_7.method2593();
														local231 = Static237.aClass1_Sub14_Sub1_7.method2641();
														if (Static114.method1832(local140)) {
															local3295 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local231);
															if (local3295 != null) {
																Static195.method3172(local3295, local3295.anInt5722 != local147);
															}
															Static279.method4129(local231, local136, local147);
														}
														Static117.anInt2306 = -1;
														return true;
													} else if (Static117.anInt2306 == 61) {
														Static312.method4591();
														Static54.anInt1049 = Static237.aClass1_Sub14_Sub1_7.method2595();
														Static117.anInt2306 = -1;
														Static220.anInt5820 = Static314.anInt5908;
														return true;
													} else {
														Static195.method3178("T1 - " + Static117.anInt2306 + "," + Static251.anInt4928 + "," + Static258.anInt5017 + " - " + Static127.anInt2543, null);
														Static122.method1957();
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
