import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lclient!kc;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!ce", name = "tb", descriptor = "Lclient!ue;")
	public static Class74 aClass74_3;

	@OriginalMember(owner = "client!ce", name = "Ib", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_16;

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ce", name = "vb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_254 = Static2.method59(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ce", name = "wb", descriptor = "[Lclient!ce;")
	public static Class11_Sub1[] aClass11_Sub1Array1 = new Class11_Sub1[256];

	@OriginalMember(owner = "client!ce", name = "xb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_255 = Static2.method59("Fallen lassen");

	@OriginalMember(owner = "client!ce", name = "Cb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_256 = Static2.method59(" ");

	@OriginalMember(owner = "client!ce", name = "Db", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ce", name = "Ob", descriptor = "Lclient!wd;")
	private static Class80 aClass80_259 = Static2.method59("Connecting to friendserver");

	@OriginalMember(owner = "client!ce", name = "Gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_257 = aClass80_259;

	@OriginalMember(owner = "client!ce", name = "Lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_258 = Static2.method59("sl_button");

	@OriginalMember(owner = "client!ce", name = "Qb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_260 = Static2.method59(" )2> @whi@");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
	public static void method400() {
		@Pc(3) Class80 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < Static103.anInt2679; local5++) {
			if (Static2.aClass80Array1[local5].method2025(Static50.aClass80_551) != -1) {
				local3 = Static2.aClass80Array1[local5].method2021(Static2.aClass80Array1[local5].method2025(Static50.aClass80_551));
				break;
			}
		}
		if (local3 == null) {
			Static112.method1848();
			return;
		}
		@Pc(43) int local43 = Static51.anInt1545;
		@Pc(45) int local45 = Static107.anInt2869;
		@Pc(47) int local47 = Static82.anInt3081;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(56) int local56 = Static11.anInt305;
		if (local56 > 190) {
			local56 = 190;
		}
		Static99.method1894(local45, local43, local56, local47, 6116423);
		Static99.method1894(local45 + 1, local43 + 1, local56 - 2, 16, 0);
		Static99.method1888(local45 + 1, local43 + 18, local56 - 2, local47 + -19, 0);
		Static111.aClass2_Sub1_Sub9_Sub4_34.method1919(local3, local45 + 3, local43 + 14, 6116423, false);
		@Pc(114) int local114 = Static95.anInt2430;
		@Pc(116) int local116 = Static93.anInt2398;
		if (Static11.anInt315 == 0) {
			local116 -= 4;
			local114 -= 4;
		}
		if (Static11.anInt315 == 1) {
			local114 -= 205;
			local116 -= 553;
		}
		if (Static11.anInt315 == 2) {
			local116 -= 17;
			local114 -= 357;
		}
		for (@Pc(136) int local136 = 0; local136 < Static103.anInt2679; local136++) {
			@Pc(151) int local151 = local43 + (-local136 + (Static103.anInt2679 - 1)) * 15 + 31;
			@Pc(155) Class80 local155 = Static2.aClass80Array1[local136];
			@Pc(157) int local157 = 16777215;
			if (local155.method2014(local3)) {
				local155 = local155.method2027(0, local155.method1999() - local3.method1999());
				if (local155.method2014(Static45.aClass80_832)) {
					local155 = local155.method2027(0, local155.method1999() - Static45.aClass80_832.method1999());
				}
			}
			if (local45 < local116 && local56 + local45 > local116 && local151 - 13 < local114 && local114 < local151 + 3) {
				local157 = 16776960;
			}
			Static111.aClass2_Sub1_Sub9_Sub4_34.method1919(local155, local45 + 3, local151, local157, true);
		}
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)V")
	public static void method402() {
		aClass80_256 = null;
		aClass80_257 = null;
		aClass11_Sub1Array1 = null;
		aClass2_Sub1_Sub9_Sub3_16 = null;
		aClass80_255 = null;
		aClass80_260 = null;
		aClass80_254 = null;
		aClass74_3 = null;
		aClass80_258 = null;
		aClass80_259 = null;
		aClass22_3 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)Lclient!ie;")
	public static Class2_Sub1_Sub10 method404(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub1_Sub10 local11 = (Class2_Sub1_Sub10) Static115.aClass32_52.method887((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static122.aClass11_44.method383(arg0, 6);
		local11 = new Class2_Sub1_Sub10();
		local11.anInt1638 = arg0;
		if (local25 != null) {
			local11.method957(new Class2_Sub17(local25));
		}
		local11.method961();
		if (local11.aBoolean108) {
			local11.anInt1641 = 0;
			local11.aBoolean111 = false;
		}
		Static115.aClass32_52.method880(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII[Lclient!va;IIIIII)V")
	public static void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub17[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg6 > arg8 || arg0 < arg3 || arg8 >= arg10 || arg0 >= arg7) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < arg5.length; local24++) {
			@Pc(30) Class2_Sub1_Sub17 local30 = arg5[local24];
			if (local30 != null && local30.anInt3008 == arg4 && (!local30.aBoolean232 || !Static68.method1116(local30))) {
				@Pc(57) int local57 = arg3 + local30.anInt3037 - arg2;
				@Pc(65) int local65 = arg6 + local30.anInt3012 - arg1;
				if ((local30.anInt3071 >= 0 || local30.anInt3004 != 0) && local65 <= arg8 && local57 <= arg0 && local30.anInt3020 + local65 > arg8 && local57 + local30.anInt3024 > arg0) {
					if (local30.anInt3071 < 0) {
						Static31.anInt1085 = local24;
					} else {
						Static31.anInt1085 = local30.anInt3071;
					}
				}
				if (local30.anInt3038 == 8 && arg8 >= local65 && arg0 >= local57 && local65 + local30.anInt3020 > arg8 && arg0 < local30.anInt3024 + local57) {
					Static111.anInt3000 = local24;
				}
				if (local30.anInt3038 == 0) {
					if (!local30.aBoolean232 && Static68.method1116(local30) && !Static33.method604(local24, arg9)) {
						continue;
					}
					method407(arg0, local30.anInt3055, local30.anInt3015, local57, local30.anInt3022, arg5, local65, local57 + local30.anInt3024, arg8, arg9, local30.anInt3020 + local65);
					if (local30.aClass2_Sub1_Sub17Array2 != null) {
						method407(arg0, local30.anInt3055, local30.anInt3015, local57, local30.anInt3022, local30.aClass2_Sub1_Sub17Array2, local65, local30.anInt3024 + local57, arg8, arg9, local30.anInt3020 + local65);
					}
					if (local30.anInt3050 > local30.anInt3024 && !local30.aBoolean232) {
						Static74.method1167(local57, arg9, arg8, local30.anInt3024, arg0, local30, local30.anInt3020 + local65, local30.anInt3050);
					}
					if (!local30.aBoolean232) {
						continue;
					}
				}
				if (local30.anInt3061 == 1 && local65 <= arg8 && arg0 >= local57 && local65 + local30.anInt3020 > arg8 && arg0 < local30.anInt3024 + local57) {
					@Pc(280) boolean local280 = false;
					if (local30.anInt3030 != 0) {
						local280 = Static119.method996(local30);
					}
					if (!local280) {
						Static59.method1043(0, 46, local30.aClass80_1157, 0, Static40.aClass80_446, local30.anInt3022);
					}
				}
				if (local30.anInt3061 == 2 && !Static76.aBoolean141 && arg8 >= local65 && local57 <= arg0 && arg8 < local65 + local30.anInt3020 && arg0 < local30.anInt3024 + local57) {
					@Pc(343) Class80 local343 = Static87.method1402(local30);
					if (local343 != null) {
						Static59.method1043(0, 38, local343, -1, Static93.method1444(new Class80[] { Static84.aClass80_824, local30.aClass80_1162 }), local30.anInt3022);
					}
				}
				if (local30.anInt3061 == 3 && arg8 >= local65 && local57 <= arg0 && local30.anInt3020 + local65 > arg8 && arg0 < local30.anInt3024 + local57) {
					@Pc(409) byte local409;
					if (arg9 == 3) {
						local409 = 4;
					} else {
						local409 = 42;
					}
					Static59.method1043(0, local409, Static22.aClass80_308, 0, Static40.aClass80_446, local30.anInt3022);
				}
				if (local30.anInt3061 == 4 && local65 <= arg8 && arg0 >= local57 && local65 + local30.anInt3020 > arg8 && local57 + local30.anInt3024 > arg0) {
					Static59.method1043(0, 20, local30.aClass80_1157, 0, Static40.aClass80_446, local30.anInt3022);
				}
				if (local30.anInt3061 == 5 && local65 <= arg8 && arg0 >= local57 && arg8 < local65 + local30.anInt3020 && local57 + local30.anInt3024 > arg0) {
					Static59.method1043(0, 16, local30.aClass80_1157, 0, Static40.aClass80_446, local30.anInt3022);
				}
				if (local30.anInt3061 == 6 && Static124.anInt3134 == -1 && local65 <= arg8 && local57 <= arg0 && arg8 < local65 + local30.anInt3020 && local30.anInt3024 + local57 > arg0) {
					Static59.method1043(0, 52, local30.aClass80_1157, -1, Static40.aClass80_446, local30.anInt3022);
				}
				@Pc(571) int local571;
				@Pc(565) int local565;
				if (local30.anInt3038 == 2) {
					local565 = 0;
					for (@Pc(567) int local567 = 0; local567 < local30.anInt3024; local567++) {
						for (local571 = 0; local571 < local30.anInt3020; local571++) {
							@Pc(582) int local582 = local571 * (local30.anInt3065 + 32) + local65;
							@Pc(592) int local592 = local57 + local567 * (local30.anInt3045 + 32);
							if (local565 < 20) {
								local582 += local30.anIntArray400[local565];
								local592 += local30.anIntArray399[local565];
							}
							if (local582 <= arg8 && local592 <= arg0 && arg8 < local582 + 32 && arg0 < local592 + 32) {
								Static55.anInt1304 = local565;
								Static90.anInt2212 = local30.anInt3022;
								if (local30.anIntArray397[local565] > 0) {
									@Pc(652) Class2_Sub1_Sub5 local652 = Static4.method95(local30.anIntArray397[local565] - 1);
									if (Static107.anInt2862 == 1 && Static81.method1247(Static102.method1660(local30))) {
										if (local30.anInt3022 != Static39.anInt707 || local565 != Static44.anInt1348) {
											Static59.method1043(local652.anInt815, 57, Static8.aClass80_109, local565, Static93.method1444(new Class80[] { Static67.aClass80_712, Static53.aClass80_571, local652.aClass80_271 }), local30.anInt3022);
										}
									} else if (!Static76.aBoolean141 || !Static81.method1247(Static102.method1660(local30))) {
										@Pc(715) Class80[] local715 = local652.aClass80Array4;
										if (Static24.aBoolean64) {
											local715 = Static33.method603(local715);
										}
										@Pc(731) int local731;
										@Pc(781) byte local781;
										if (Static81.method1247(Static102.method1660(local30))) {
											for (local731 = 4; local731 >= 3; local731--) {
												if (local715 != null && local715[local731] != null) {
													if (local731 == 3) {
														local781 = 29;
													} else {
														local781 = 54;
													}
													Static59.method1043(local652.anInt815, local781, local715[local731], local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
												} else if (local731 == 4) {
													Static59.method1043(local652.anInt815, 54, Static24.aClass80_314, local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
												}
											}
										}
										if (Static120.method1955(Static102.method1660(local30))) {
											Static59.method1043(local652.anInt815, 48, Static8.aClass80_109, local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
										}
										if (Static81.method1247(Static102.method1660(local30)) && local715 != null) {
											for (local731 = 2; local731 >= 0; local731--) {
												if (local715[local731] != null) {
													local781 = 0;
													if (local731 == 0) {
														local781 = 7;
													}
													if (local731 == 1) {
														local781 = 15;
													}
													if (local731 == 2) {
														local781 = 51;
													}
													Static59.method1043(local652.anInt815, local781, local715[local731], local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
												}
											}
										}
										local715 = local30.aClass80Array19;
										if (Static24.aBoolean64) {
											local715 = Static33.method603(local715);
										}
										if (local715 != null) {
											for (local731 = 4; local731 >= 0; local731--) {
												if (local715[local731] != null) {
													local781 = 0;
													if (local731 == 0) {
														local781 = 31;
													}
													if (local731 == 1) {
														local781 = 56;
													}
													if (local731 == 2) {
														local781 = 10;
													}
													if (local731 == 3) {
														local781 = 17;
													}
													if (local731 == 4) {
														local781 = 6;
													}
													Static59.method1043(local652.anInt815, local781, local715[local731], local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
												}
											}
										}
										Static59.method1043(local652.anInt815, 1002, Static51.aClass80_558, local565, Static93.method1444(new Class80[] { Static50.aClass80_551, local652.aClass80_271 }), local30.anInt3022);
									} else if ((Static50.anInt1524 & 0x10) == 16) {
										Static59.method1043(local652.anInt815, 22, Static68.aClass80_721, local565, Static93.method1444(new Class80[] { Static59.aClass80_631, Static53.aClass80_571, local652.aClass80_271 }), local30.anInt3022);
									}
								}
							}
							local565++;
						}
					}
				}
				if (local30.aBoolean232) {
					if (Static76.aBoolean141) {
						if (Static85.method1260(Static102.method1660(local30)) && (Static50.anInt1524 & 0x20) == 32 && arg8 >= local65 && local57 <= arg0 && local65 + local30.anInt3020 > arg8 && local57 + local30.anInt3024 > arg0) {
							Static59.method1043(0, 47, Static68.aClass80_721, local30.anInt3021, Static93.method1444(new Class80[] { Static59.aClass80_631, Static110.aClass80_1093, local30.aClass80_1164 }), local30.anInt3022);
						}
					} else if (arg8 >= local65 && local57 <= arg0 && arg8 < local65 + local30.anInt3020 && arg0 < local57 + local30.anInt3024) {
						@Pc(1189) Class80 local1189;
						for (local565 = 9; local565 >= 5; local565--) {
							local1189 = Static42.method680(local30, local565);
							if (local1189 != null) {
								Static59.method1043(local565 + 1, 39, local1189, local30.anInt3021, local30.aClass80_1164, local30.anInt3022);
							}
						}
						local1189 = Static87.method1402(local30);
						if (local1189 != null) {
							Static59.method1043(0, 38, local1189, local30.anInt3021, local30.aClass80_1164, local30.anInt3022);
						}
						for (local571 = 4; local571 >= 0; local571--) {
							@Pc(1246) Class80 local1246 = Static42.method680(local30, local571);
							if (local1246 != null) {
								Static59.method1043(local571 + 1, 39, local1246, local30.anInt3021, local30.aClass80_1164, local30.anInt3022);
							}
						}
						if (Static66.method1110(Static102.method1660(local30))) {
							Static59.method1043(0, 52, local30.aClass80_1157, local30.anInt3021, Static40.aClass80_446, local30.anInt3022);
						}
					}
				}
			}
		}
	}
}
