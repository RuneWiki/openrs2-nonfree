import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_727 = Static6.method100("l");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!he;")
	private static Class26 aClass26_730 = Static6.method100("Error loading your profile)3");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_728 = aClass26_730;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_729 = Static6.method100("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!se;")
	public static Class65 aClass65_33 = new Class65();

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!se;")
	public static Class65 aClass65_34 = new Class65();

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array10 = new Class26[100];

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!he;")
	public static Class26 aClass26_731 = Static6.method100("welle2:");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZI)V")
	public static void method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static65.method1267();
		Static77.method2218(arg0, arg2, Static4.aClass3_Sub1_Sub4_Sub1_1.anInt509 + arg0, arg2 + Static4.aClass3_Sub1_Sub4_Sub1_1.anInt511);
		if (Static63.anInt1934 == 2 || Static63.anInt1934 == 5) {
			Static77.method2215(arg0 + 25, arg2 - -5, Static131.anIntArray410, Static78.anIntArray207);
		} else {
			@Pc(32) int local32 = Static52.anInt1614 + Static78.anInt2107 & 0x7FF;
			@Pc(39) int local39 = 464 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
			@Pc(47) int local47 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32 + 48;
			Static6.aClass3_Sub1_Sub4_Sub3_1.method1761(arg0 + 25, arg2 - -5, 146, 151, local47, local39, local32, Static33.anInt1081 + 256, Static131.anIntArray410, Static78.anIntArray207);
			@Pc(83) int local83;
			@Pc(97) int local97;
			for (@Pc(67) int local67 = 0; local67 < Static46.anInt1411; local67++) {
				local83 = Static11.anIntArray33[local67] * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
				local97 = Static41.anIntArray138[local67] * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
				Static63.method1247(local83, local97, Static13.aClass3_Sub1_Sub4_Sub3Array2[local67], arg2, arg0);
			}
			@Pc(144) int local144;
			@Pc(155) int local155;
			for (local83 = 0; local83 < 104; local83++) {
				for (local97 = 0; local97 < 104; local97++) {
					@Pc(130) Class65 local130 = Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local83][local97];
					if (local130 != null) {
						local144 = local83 * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
						local155 = local97 * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
						Static63.method1247(local144, local155, Static57.aClass3_Sub1_Sub4_Sub3Array8[0], arg2, arg0);
					}
				}
			}
			@Pc(231) int local231;
			for (local97 = 0; local97 < Static133.anInt560; local97++) {
				@Pc(184) Class3_Sub1_Sub5_Sub1_Sub2 local184 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[Static48.anIntArray151[local97]];
				if (local184 != null && local184.method1880()) {
					@Pc(193) Class3_Sub1_Sub3 local193 = local184.aClass3_Sub1_Sub3_1;
					if (local193 != null && local193.anIntArray27 != null) {
						local193 = local193.method140();
					}
					if (local193 != null && local193.aBoolean19 && local193.aBoolean21) {
						local155 = local184.anInt2733 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
						local231 = local184.anInt2731 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
						Static63.method1247(local155, local231, Static57.aClass3_Sub1_Sub4_Sub3Array8[1], arg2, arg0);
					}
				}
			}
			@Pc(254) Class3_Sub1_Sub5_Sub1_Sub1 local254;
			for (@Pc(246) int local246 = 0; local246 < Static62.anInt1885; local246++) {
				local254 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[Static117.anIntArray370[local246]];
				if (local254 != null && local254.method1880()) {
					local155 = local254.anInt2733 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
					@Pc(273) boolean local273 = false;
					local231 = local254.anInt2731 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
					@Pc(289) long local289 = local254.aClass26_393.method820();
					for (@Pc(291) int local291 = 0; local291 < Static133.anInt568; local291++) {
						if (Static105.aLongArray8[local291] == local289 && Static80.anIntArray221[local291] != 0) {
							local273 = true;
							break;
						}
					}
					@Pc(316) boolean local316 = false;
					if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt828 != 0 && local254.anInt828 != 0 && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt828 == local254.anInt828) {
						local316 = true;
					}
					if (local273) {
						Static63.method1247(local155, local231, Static57.aClass3_Sub1_Sub4_Sub3Array8[3], arg2, arg0);
					} else if (local316) {
						Static63.method1247(local155, local231, Static57.aClass3_Sub1_Sub4_Sub3Array8[4], arg2, arg0);
					} else {
						Static63.method1247(local155, local231, Static57.aClass3_Sub1_Sub4_Sub3Array8[2], arg2, arg0);
					}
				}
			}
			if (Static93.anInt2529 != 0 && Static4.anInt136 % 20 < 10) {
				if (Static93.anInt2529 == 1 && Static16.anInt420 >= 0 && Static16.anInt420 < Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1.length) {
					@Pc(397) Class3_Sub1_Sub5_Sub1_Sub2 local397 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[Static16.anInt420];
					if (local397 != null) {
						local155 = local397.anInt2733 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
						local231 = local397.anInt2731 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
						Static100.method2213(Static60.aClass3_Sub1_Sub4_Sub3Array9[1], arg2, local231, arg0, local155);
					}
				}
				if (Static93.anInt2529 == 2) {
					local155 = (-Static56.anInt1700 + Static124.anInt3189) * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
					local144 = (Static124.anInt3202 - Static10.anInt286) * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
					Static100.method2213(Static60.aClass3_Sub1_Sub4_Sub3Array9[1], arg2, local155, arg0, local144);
				}
				if (Static93.anInt2529 == 10 && Static28.anInt981 >= 0 && Static28.anInt981 < Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1.length) {
					local254 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[Static28.anInt981];
					if (local254 != null) {
						local155 = local254.anInt2733 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
						local231 = local254.anInt2731 / 32 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
						Static100.method2213(Static60.aClass3_Sub1_Sub4_Sub3Array9[1], arg2, local231, arg0, local155);
					}
				}
			}
			if (Static1.anInt8 != 0) {
				local144 = Static1.anInt8 * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 / 32;
				local155 = Static110.anInt2946 * 4 + 2 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 / 32;
				Static63.method1247(local144, local155, Static60.aClass3_Sub1_Sub4_Sub3Array9[0], arg2, arg0);
			}
			Static77.method2214(arg0 + 97, arg2 - -82 + -4, 3, 3, 16777215);
		}
		if (Static63.anInt1934 >= 3) {
			Static77.method2215(arg0, arg2, Static102.anIntArray336, Static131.anIntArray409);
		} else {
			Static59.aClass3_Sub1_Sub4_Sub3_3.method1761(arg0, arg2, 33, 33, 25, 25, Static78.anInt2107, 256, Static102.anIntArray336, Static131.anIntArray409);
		}
		if (Static36.aBooleanArray12[arg1]) {
			Static4.aClass3_Sub1_Sub4_Sub1_1.method345(arg0, arg2);
		}
		Static28.aBooleanArray9[arg1] = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method875() {
		Static86.aByteArrayArrayArray6 = null;
		Static24.aByteArrayArrayArray1 = null;
		Static15.anIntArrayArrayArray1 = null;
		Static58.anIntArrayArray14 = null;
		Static117.anIntArray368 = null;
		Static98.aByteArrayArrayArray7 = null;
		Static106.anIntArray342 = null;
		Static74.anIntArray200 = null;
		Static71.aByteArrayArrayArray3 = null;
		Static108.anIntArray346 = null;
		Static44.anIntArray142 = null;
		Static71.aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method876() {
		if (Static6.aClass3_Sub14_1 != null || Static109.aClass3_Sub14_15 != null) {
			return;
		}
		@Pc(13) int local13 = Static102.anInt2770;
		@Pc(29) int local29;
		@Pc(95) int local95;
		@Pc(89) int local89;
		if (Static109.aBoolean162) {
			if (local13 != 1) {
				local29 = Static59.anInt1807;
				local95 = Static7.anInt187;
				if (Static118.anInt3105 - 10 > local29 || Static103.anInt2776 + Static118.anInt3105 + 10 < local29 || Static7.anInt188 - 10 > local95 || local95 > Static7.anInt188 + Static69.anInt2516 + 10) {
					Static109.aBoolean162 = false;
					Static118.method2126(Static7.anInt188, Static103.anInt2776, Static118.anInt3105, Static69.anInt2516);
				}
			}
			if (local13 == 1) {
				local29 = Static118.anInt3105;
				local95 = Static7.anInt188;
				local89 = Static103.anInt2776;
				@Pc(247) int local247 = Static59.anInt1803;
				@Pc(249) int local249 = Static19.anInt514;
				@Pc(251) int local251 = -1;
				for (@Pc(253) int local253 = 0; local253 < Static56.anInt1695; local253++) {
					@Pc(268) int local268 = (Static56.anInt1695 - local253 - 1) * 15 + local95 + 31;
					if (local29 < local247 && local89 + local29 > local247 && local249 > local268 - 13 && local249 < local268 + 3) {
						local251 = local253;
					}
				}
				if (local251 != -1) {
					Static70.method986(local251);
				}
				Static109.aBoolean162 = false;
				Static118.method2126(Static7.anInt188, Static103.anInt2776, Static118.anInt3105, Static69.anInt2516);
			}
			return;
		}
		if (local13 == 1 && Static56.anInt1695 > 0) {
			local29 = Static132.anIntArray411[Static56.anInt1695 - 1];
			if (local29 == 29 || local29 == 39 || local29 == 20 || local29 == 21 || local29 == 31 || local29 == 37 || local29 == 28 || local29 == 4 || local29 == 41 || local29 == 45 || local29 == 50 || local29 == 1002) {
				local89 = Static64.anIntArray178[Static56.anInt1695 - 1];
				local95 = Static67.anIntArray338[Static56.anInt1695 - 1];
				@Pc(99) Class3_Sub14 local99 = Static100.method2212(local89);
				if (Static2.method12(Static89.method1641(local99)) || Static116.method2089(Static89.method1641(local99))) {
					Static117.aBoolean168 = false;
					Static5.anInt3225 = 0;
					if (Static6.aClass3_Sub14_1 != null) {
						Static110.method2004(Static6.aClass3_Sub14_1);
					}
					Static6.aClass3_Sub14_1 = Static100.method2212(local89);
					Static96.anInt2604 = Static19.anInt514;
					Static113.anInt3014 = Static59.anInt1803;
					Static90.anInt2490 = local95;
					Static110.method2004(Static6.aClass3_Sub14_1);
					return;
				}
			}
		}
		if (local13 == 1 && (Static131.anInt3266 == 1 && Static56.anInt1695 > 2 || Static66.method1634(Static56.anInt1695 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static56.anInt1695 > 0) {
			Static70.method986(Static56.anInt1695 - 1);
		}
		if (local13 == 2 && Static56.anInt1695 > 0) {
			Static15.method263();
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public static void method877() {
		aClass65_34 = null;
		aClass26_728 = null;
		aClass26_730 = null;
		aClass26_727 = null;
		aClass26_731 = null;
		aClass65_33 = null;
		aClass26_729 = null;
		aClass26Array10 = null;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public static void method878() {
		Static131.anInt3269 = 0;
		@Pc(8) int local8 = Static10.anInt286 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7);
		@Pc(27) int local27 = Static56.anInt1700 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7);
		if (local8 >= 3053 && local8 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static131.anInt3269 = 1;
		}
		if (local8 >= 3072 && local8 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static131.anInt3269 = 1;
		}
		if (Static131.anInt3269 == 1 && local8 >= 3139 && local8 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static131.anInt3269 = 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
	public static int method879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static56.anInt1695 < 2 && Static3.anInt89 == 0 && !Static117.aBoolean169) {
			return;
		}
		@Pc(55) Class26 local55;
		if (Static3.anInt89 == 1 && Static56.anInt1695 < 2) {
			local55 = Static119.method2136(new Class26[] { Static93.aClass26_1343, Static74.aClass26_1059, Static102.aClass26_1505, Static64.aClass26_959 });
		} else if (Static117.aBoolean169 && Static56.anInt1695 < 2) {
			local55 = Static119.method2136(new Class26[] { Static132.aClass26_1815, Static74.aClass26_1059, Static8.aClass26_114, Static64.aClass26_959 });
		} else {
			local55 = Static91.method1672(Static56.anInt1695 - 1);
		}
		if (Static56.anInt1695 > 2) {
			local55 = Static119.method2136(new Class26[] { local55, Static30.aClass26_465, Static122.method2170(Static56.anInt1695 - 2), Static106.aClass26_1545 });
		}
		Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4.method1615(local55, arg1 + 4, arg0 + 15, Static4.anInt136 / 1000);
	}
}
