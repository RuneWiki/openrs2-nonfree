import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_19;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt2037 = -1;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_957 = Static14.method2017(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_958 = null;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public static int anInt2039 = 255;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_959 = Static14.method2017("Okay");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!kc;")
	private static Class36 aClass36_961 = Static14.method2017("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_960 = aClass36_961;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_962 = Static14.method2017("@or2@");

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1477(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static90.anInt2347 > 0) {
			local26 = Static48.aByteArrayArray20[--Static90.anInt2347];
			Static48.aByteArrayArray20[Static90.anInt2347] = null;
			return local26;
		} else if (arg0 == 5000 && Static62.anInt1618 > 0) {
			local26 = Static14.aByteArrayArray41[--Static62.anInt1618];
			Static14.aByteArrayArray41[Static62.anInt1618] = null;
			return local26;
		} else if (arg0 == 30000 && Static52.anInt1431 > 0) {
			local26 = Static56.aByteArrayArray23[--Static52.anInt1431];
			Static56.aByteArrayArray23[Static52.anInt1431] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1478() {
		anIntArray244 = null;
		aClass36_962 = null;
		aClass36_959 = null;
		aClass36_958 = null;
		aClass36_960 = null;
		aClass36_961 = null;
		aClass2_Sub1_Sub1_Sub1_19 = null;
		aClass36_957 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	private static void method1479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class2_Sub9 local12 = (Class2_Sub9) Static20.aClass8_1.method175(); local12 != null; local12 = (Class2_Sub9) Static20.aClass8_1.method173()) {
			if (local12.anInt1150 != -1 || local12.anIntArray160 != null) {
				@Pc(24) int local24 = 0;
				if (arg2 > local12.anInt1135) {
					local24 = arg2 - local12.anInt1135;
				} else if (arg2 < local12.anInt1144) {
					local24 = local12.anInt1144 - arg2;
				}
				if (arg0 > local12.anInt1153) {
					local24 += arg0 - local12.anInt1153;
				} else if (local12.anInt1137 > arg0) {
					local24 += local12.anInt1137 - arg0;
				}
				if (local24 - 64 > local12.anInt1149 || Static42.anInt1116 == 0 || arg3 != local12.anInt1139) {
					if (local12.aClass2_Sub3_Sub1_2 != null) {
						Static100.aClass2_Sub3_Sub2_1.method2061(local12.aClass2_Sub3_Sub1_2);
						local12.aClass2_Sub3_Sub1_2 = null;
					}
					if (local12.aClass2_Sub3_Sub1_1 != null) {
						Static100.aClass2_Sub3_Sub2_1.method2061(local12.aClass2_Sub3_Sub1_1);
						local12.aClass2_Sub3_Sub1_1 = null;
					}
				} else {
					local24 -= 64;
					if (local24 < 0) {
						local24 = 0;
					}
					@Pc(149) int local149 = Static42.anInt1116 * (local12.anInt1149 - local24) / local12.anInt1149;
					if (local12.aClass2_Sub3_Sub1_2 != null) {
						local12.aClass2_Sub3_Sub1_2.method414(local149);
					} else if (local12.anInt1150 >= 0) {
						@Pc(164) Class7 local164 = Static120.method150(Static57.aClass3_Sub1_6, local12.anInt1150);
						if (local164 != null) {
							@Pc(171) Class2_Sub2_Sub1 local171 = local164.method152().method255(Static17.aClass54_1);
							@Pc(176) Class2_Sub3_Sub1 local176 = Static121.method407(local171, local149);
							local176.method405(-1);
							Static100.aClass2_Sub3_Sub2_1.method2065(local176);
							local12.aClass2_Sub3_Sub1_2 = local176;
						}
					}
					if (local12.aClass2_Sub3_Sub1_1 != null) {
						local12.aClass2_Sub3_Sub1_1.method414(local149);
						if (!local12.aClass2_Sub3_Sub1_1.method418()) {
							local12.aClass2_Sub3_Sub1_1 = null;
						}
					} else if (local12.anIntArray160 != null && (local12.anInt1138 -= arg1) <= 0) {
						@Pc(213) int local213 = (int) ((double) local12.anIntArray160.length * Math.random());
						@Pc(221) Class7 local221 = Static120.method150(Static57.aClass3_Sub1_6, local12.anIntArray160[local213]);
						if (local221 != null) {
							@Pc(228) Class2_Sub2_Sub1 local228 = local221.method152().method255(Static17.aClass54_1);
							@Pc(233) Class2_Sub3_Sub1 local233 = Static121.method407(local228, local149);
							local233.method405(0);
							Static100.aClass2_Sub3_Sub2_1.method2065(local233);
							local12.anInt1138 = (int) ((double) (local12.anInt1154 - local12.anInt1142) * Math.random()) + local12.anInt1142;
							local12.aClass2_Sub3_Sub1_1 = local233;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method1480() {
		if (Static108.aBoolean131) {
			Static108.aBoolean131 = false;
			Static107.method1939();
			aBoolean85 = true;
			Static46.aBoolean63 = true;
			Static100.aBoolean118 = true;
			Static115.aBoolean77 = true;
		}
		Static67.method1162();
		if (Static73.aBoolean82 && Static24.anInt620 == 1) {
			Static100.aBoolean118 = true;
		}
		@Pc(37) boolean local37;
		if (Static94.anInt2471 != -1) {
			local37 = Static65.method1151(Static94.anInt2471);
			if (local37) {
				Static100.aBoolean118 = true;
			}
		}
		if (Static20.anInt498 == 2) {
			Static100.aBoolean118 = true;
		}
		if (Static60.anInt1597 == 2) {
			Static100.aBoolean118 = true;
		}
		if (Static100.aBoolean118) {
			Static100.aBoolean118 = false;
			Static111.method2000();
		}
		@Pc(105) int local105;
		if (Static49.anInt1312 == -1) {
			Static83.aClass2_Sub1_Sub6_5.anInt716 = Static86.anInt2234 - Static92.anInt2407 - 77;
			if (Static115.anInt1789 > 17 && Static115.anInt1789 < 560 && Static64.anInt1640 > 332) {
				Static111.method2002(Static64.anInt1640 - 357, Static115.anInt1789 - 17, 463, -1, Static83.aClass2_Sub1_Sub6_5, 77, Static86.anInt2234, 0);
			}
			local105 = Static86.anInt2234 - Static83.aClass2_Sub1_Sub6_5.anInt716 - 77;
			if (local105 < 0) {
				local105 = 0;
			}
			if (Static86.anInt2234 - 77 < local105) {
				local105 = Static86.anInt2234 - 77;
			}
			if (local105 != Static92.anInt2407) {
				Static92.anInt2407 = local105;
				Static115.aBoolean77 = true;
			}
		}
		if (Static49.anInt1312 == -1 && Static32.anInt910 == 3) {
			Static83.aClass2_Sub1_Sub6_5.anInt716 = Static105.anInt2727;
			local105 = Static118.anInt2997 * 14 + 7;
			if (Static115.anInt1789 > 17 && Static115.anInt1789 < 560 && Static64.anInt1640 > 332) {
				Static111.method2002(Static64.anInt1640 - 357, Static115.anInt1789 + -17, 463, -1, Static83.aClass2_Sub1_Sub6_5, 77, local105, 0);
			}
			@Pc(178) int local178 = Static83.aClass2_Sub1_Sub6_5.anInt716;
			if (local178 < 0) {
				local178 = 0;
			}
			if (local105 - 77 < local178) {
				local178 = local105 - 77;
			}
			if (local178 != Static105.anInt2727) {
				Static115.aBoolean77 = true;
				Static105.anInt2727 = local178;
			}
		}
		if (Static49.anInt1312 != -1) {
			local37 = Static65.method1151(Static49.anInt1312);
			if (local37) {
				Static115.aBoolean77 = true;
			}
		}
		if (Static20.anInt498 == 3) {
			Static115.aBoolean77 = true;
		}
		if (Static60.anInt1597 == 3) {
			Static115.aBoolean77 = true;
		}
		if (Static90.aClass36_1092 != null) {
			Static115.aBoolean77 = true;
		}
		if (Static73.aBoolean82 && Static24.anInt620 == 2) {
			Static115.aBoolean77 = true;
		}
		if (Static115.aBoolean77) {
			Static115.aBoolean77 = false;
			Static114.method2075();
		}
		Static13.method269();
		if (Static38.anInt968 != -1) {
			aBoolean85 = true;
		}
		if (aBoolean85) {
			if (Static38.anInt968 != -1 && Static109.anInt2825 == Static38.anInt968) {
				Static38.anInt968 = -1;
				Static42.aClass2_Sub12_Sub1_1.method1422(34);
				Static42.aClass2_Sub12_Sub1_1.method1409(Static109.anInt2825);
			}
			aBoolean85 = false;
			Static91.aBoolean105 = true;
			Static84.method1518(Static113.anInt2952 % 20 >= 10 ? Static38.anInt968 : -1, Static94.anInt2471 == -1, Static101.anIntArray323, Static109.anInt2825);
		}
		if (Static46.aBoolean63) {
			Static91.aBoolean105 = true;
			Static46.aBoolean63 = false;
			Static51.method1834(Static45.anInt1225, Static11.aClass2_Sub1_Sub1_Sub2_1, Static15.anInt316, Static3.anInt1302);
		}
		method1479(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149, Static100.anInt2609, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204, Static92.anInt2412);
		Static100.anInt2609 = 0;
	}
}
