import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lclient!sf;")
	public static Class5 aClass5_61;

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lclient!ga;")
	public static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lclient!sf;")
	public static Class5 aClass5_62;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "[I")
	public static int[] anIntArray331 = new int[5];

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "Z")
	public static boolean aBoolean80 = true;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lclient!sb;")
	public static Class65 aClass65_26 = new Class65(32);

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1101 = Static106.method1849("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1102 = Static106.method1849("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!nc", name = "kb", descriptor = "[Lclient!cb;")
	public static Class11[] aClass11Array1 = new Class11[50];

	@OriginalMember(owner = "client!nc", name = "ub", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1106 = Static106.method1849("Ok");

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1103 = aClass66_1106;

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1104 = Static106.method1849("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "I")
	public static int anInt2039 = 99;

	@OriginalMember(owner = "client!nc", name = "zb", descriptor = "[I")
	public static int[] anIntArray334 = new int[5];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBLclient!tb;)V")
	public static void method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub1_Sub15 arg3) {
		if (Static44.anInt1408 >= 50 || Static119.anInt2780 == 0 || (arg3.anIntArray454 == null || arg3.anIntArray454.length <= arg2)) {
			return;
		}
		@Pc(25) int local25 = arg3.anIntArray454[arg2];
		if (local25 == 0) {
			return;
		}
		@Pc(35) int local35 = local25 >> 8;
		Static120.anIntArray482[Static44.anInt1408] = local35;
		@Pc(53) int local53 = local25 >> 4 & 0x7;
		Static47.anIntArray225[Static44.anInt1408] = local53;
		Static50.anIntArray237[Static44.anInt1408] = 0;
		@Pc(67) int local67 = (arg0 - 64) / 128;
		aClass11Array1[Static44.anInt1408] = null;
		@Pc(75) int local75 = local25 & 0xF;
		@Pc(81) int local81 = (arg1 - 64) / 128;
		Static87.anIntArray388[Static44.anInt1408] = (local67 << 16) + ((local81 << 8) + local75);
		Static44.anInt1408++;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1421() {
		aClass66_1102 = null;
		aClass66_1104 = null;
		aClass65_26 = null;
		anIntArray334 = null;
		aClass66_1106 = null;
		aClass66_1101 = null;
		aClass66_1103 = null;
		anIntArray331 = null;
		aClass5_62 = null;
		aClass11Array1 = null;
		aClass1_Sub1_Sub4_1 = null;
		aClass5_61 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	public static void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static5.method159();
		Static115.method1659(arg1, arg0, arg1 + Static92.aClass1_Sub1_Sub2_Sub3_3.anInt1432, arg0 + Static92.aClass1_Sub1_Sub2_Sub3_3.anInt1429);
		if (Static125.anInt2869 == 2 || Static125.anInt2869 == 5) {
			Static115.method1673(arg1 + 25, arg0 - -5, Static48.anIntArray226, Static42.anIntArray193);
		} else {
			@Pc(46) int local46 = Static38.anInt2851 + Static75.anInt2076 & 0x7FF;
			@Pc(53) int local53 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32 + 48;
			@Pc(61) int local61 = 464 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
			Static131.aClass1_Sub1_Sub2_Sub1_14.method237(arg1 + 25, arg0 + 5, 146, 151, local53, local61, local46, Static70.anInt712 + 256, Static48.anIntArray226, Static42.anIntArray193);
			@Pc(111) int local111;
			@Pc(97) int local97;
			for (@Pc(81) int local81 = 0; local81 < Static26.anInt700; local81++) {
				local97 = Static117.anIntArray473[local81] * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
				local111 = Static26.anIntArray102[local81] * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
				Static75.method1438(local97, arg0, local111, arg1, Static80.aClass1_Sub1_Sub2_Sub1Array46[local81]);
			}
			@Pc(154) int local154;
			@Pc(165) int local165;
			for (local111 = 0; local111 < 104; local111++) {
				for (local97 = 0; local97 < 104; local97++) {
					@Pc(140) Class61 local140 = Static101.aClass61ArrayArrayArray1[Static22.anInt635][local111][local97];
					if (local140 != null) {
						local154 = local111 * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
						local165 = local97 * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
						Static75.method1438(local165, arg0, local154, arg1, Static16.aClass1_Sub1_Sub2_Sub1Array14[0]);
					}
				}
			}
			@Pc(246) int local246;
			for (local97 = 0; local97 < Static33.anInt854; local97++) {
				@Pc(196) Class1_Sub1_Sub1_Sub5_Sub1 local196 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local97]];
				if (local196 != null && local196.method931()) {
					@Pc(207) Class1_Sub1_Sub5 local207 = local196.aClass1_Sub1_Sub5_1;
					if (local207 != null && local207.anIntArray222 != null) {
						local207 = local207.method1040();
					}
					if (local207 != null && local207.aBoolean60 && local207.aBoolean59) {
						local165 = local196.anInt1261 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
						local246 = local196.anInt1271 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
						Static75.method1438(local246, arg0, local165, arg1, Static16.aClass1_Sub1_Sub2_Sub1Array14[1]);
					}
				}
			}
			@Pc(269) Class1_Sub1_Sub1_Sub5_Sub2 local269;
			for (@Pc(261) int local261 = 0; local261 < Static111.anInt2653; local261++) {
				local269 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local261]];
				if (local269 != null && local269.method931()) {
					local165 = local269.anInt1261 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
					local246 = local269.anInt1271 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
					@Pc(299) boolean local299 = false;
					@Pc(304) long local304 = local269.aClass66_707.method1806();
					for (@Pc(306) int local306 = 0; local306 < Static27.anInt730; local306++) {
						if (Static43.aLongArray5[local306] == local304 && Static9.anIntArray56[local306] != 0) {
							local299 = true;
							break;
						}
					}
					@Pc(336) boolean local336 = false;
					if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1312 != 0 && local269.anInt1312 != 0 && Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1312 == local269.anInt1312) {
						local336 = true;
					}
					if (local299) {
						Static75.method1438(local246, arg0, local165, arg1, Static16.aClass1_Sub1_Sub2_Sub1Array14[3]);
					} else if (local336) {
						Static75.method1438(local246, arg0, local165, arg1, Static16.aClass1_Sub1_Sub2_Sub1Array14[4]);
					} else {
						Static75.method1438(local246, arg0, local165, arg1, Static16.aClass1_Sub1_Sub2_Sub1Array14[2]);
					}
				}
			}
			if (Static28.anInt734 != 0 && Static22.anInt636 % 20 < 10) {
				if (Static28.anInt734 == 1 && Static134.anInt2955 >= 0 && Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3.length > Static134.anInt2955) {
					@Pc(426) Class1_Sub1_Sub1_Sub5_Sub1 local426 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static134.anInt2955];
					if (local426 != null) {
						local246 = local426.anInt1271 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
						local165 = local426.anInt1261 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
						Static35.method634(arg0, Static84.aClass1_Sub1_Sub2_Sub1Array50[1], arg1, local165, local246);
					}
				}
				if (Static28.anInt734 == 2) {
					local165 = (Static90.anInt1841 - Static52.anInt1603) * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
					local154 = (Static4.anInt192 - Static48.anInt1496) * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
					Static35.method634(arg0, Static84.aClass1_Sub1_Sub2_Sub1Array50[1], arg1, local154, local165);
				}
				if (Static28.anInt734 == 10 && Static77.anInt2146 >= 0 && Static77.anInt2146 < Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1.length) {
					local269 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static77.anInt2146];
					if (local269 != null) {
						local246 = local269.anInt1271 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
						local165 = local269.anInt1261 / 32 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
						Static35.method634(arg0, Static84.aClass1_Sub1_Sub2_Sub1Array50[1], arg1, local165, local246);
					}
				}
			}
			if (Static52.anInt1607 != 0) {
				local154 = Static52.anInt1607 * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 / 32;
				local165 = Static13.anInt451 * 4 + 2 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 / 32;
				Static75.method1438(local165, arg0, local154, arg1, Static84.aClass1_Sub1_Sub2_Sub1Array50[0]);
			}
			Static115.method1670(arg1 + 97, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (Static125.anInt2869 < 3) {
			Static99.aClass1_Sub1_Sub2_Sub1_11.method237(arg1, arg0, 33, 33, 25, 25, Static75.anInt2076, 256, Static95.anIntArray414, Static15.anIntArray499);
		} else {
			Static115.method1673(arg1, arg0, Static95.anIntArray414, Static15.anIntArray499);
		}
		if (Static9.aBooleanArray3[arg2]) {
			Static92.aClass1_Sub1_Sub2_Sub3_3.method997(arg1, arg0);
		}
		Static5.aBooleanArray2[arg2] = true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 1 || arg3 < 1 || arg4 > 102 || arg3 > 102) {
			return;
		}
		if (Static87.aBoolean96 && arg5 != Static22.anInt635) {
			return;
		}
		@Pc(31) int local31 = 0;
		if (arg1 == 0) {
			local31 = Static129.aClass9_1.method337(arg5, arg4, arg3);
		}
		if (arg1 == 1) {
			local31 = Static129.aClass9_1.method306(arg5, arg4, arg3);
		}
		if (arg1 == 2) {
			local31 = Static129.aClass9_1.method323(arg5, arg4, arg3);
		}
		if (arg1 == 3) {
			local31 = Static129.aClass9_1.method352(arg5, arg4, arg3);
		}
		@Pc(95) int local95;
		if (local31 != 0) {
			@Pc(88) int local88 = local31 >> 14 & 0x7FFF;
			local95 = Static129.aClass9_1.method311(arg5, arg4, arg3, local31);
			@Pc(101) int local101 = local95 >> 6 & 0x3;
			@Pc(105) int local105 = local95 & 0x1F;
			@Pc(119) Class1_Sub1_Sub9 local119;
			if (arg1 == 0) {
				Static129.aClass9_1.method309(arg5, arg4, arg3);
				local119 = Static122.method1995(local88);
				if (local119.anInt2084 != 0) {
					Static83.aClass13Array1[arg5].method467(arg4, local105, local119.aBoolean85, local101, arg3);
				}
			}
			if (arg1 == 1) {
				Static129.aClass9_1.method341(arg5, arg4, arg3);
			}
			if (arg1 == 2) {
				Static129.aClass9_1.method332(arg5, arg4, arg3);
				local119 = Static122.method1995(local88);
				if (local119.anInt2065 + arg4 > 103 || local119.anInt2065 + arg3 > 103 || local119.anInt2083 + arg4 > 103 || arg3 + local119.anInt2083 > 103) {
					return;
				}
				if (local119.anInt2084 != 0) {
					Static83.aClass13Array1[arg5].method477(local119.aBoolean85, arg4, local119.anInt2083, arg3, local119.anInt2065, local101);
				}
			}
			if (arg1 == 3) {
				Static129.aClass9_1.method343(arg5, arg4, arg3);
				local119 = Static122.method1995(local88);
				if (local119.anInt2084 == 1) {
					Static83.aClass13Array1[arg5].method466(arg3, arg4);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local95 = arg5;
		if (arg5 < 3 && (Static87.aByteArrayArrayArray15[1][arg4][arg3] & 0x2) == 2) {
			local95 = arg5 + 1;
		}
		Static18.method465(arg5, local95, arg4, arg2, arg6, Static129.aClass9_1, arg3, Static83.aClass13Array1[arg5], arg0);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lclient!sc;")
	public static Class66 method1425(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static88.method1632(arg0) : Static117.aClass66_1573;
	}
}
