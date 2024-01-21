import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_5;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt1070 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BB)V")
	public static void method717(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(26) int local26 = (arg0[local7++] & 0xFF) * 64 - Static150.anInt3065;
				@Pc(38) int local38 = (arg0[local7++] & 0xFF) * 64 - Static52.anInt1305;
				@Pc(71) byte local71;
				@Pc(64) int local64;
				if (local26 > 0 && local38 > 0 && Static90.anInt1950 > local26 + 64 && Static35.anInt988 > local38 + 64) {
					local64 = local26 >> 6;
					@Pc(97) int local97 = Static35.anInt988 - local38 - 1 >> 6;
					for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
						for (@Pc(103) int local103 = -64; local103 < 0; local103++) {
							local71 = arg0[local7++];
							if (local71 != 0) {
								if (Static158.aByteArrayArrayArray37[local64][local97] == null) {
									Static158.aByteArrayArrayArray37[local64][local97] = new byte[4096];
								}
								Static158.aByteArrayArrayArray37[local64][local97][(-(local103 + 1) << 6) + local99] = local71;
								@Pc(148) byte local148 = arg0[local7++];
								if (Static119.aByteArrayArrayArray28[local64][local97] == null) {
									Static119.aByteArrayArrayArray28[local64][local97] = new byte[4096];
								}
								Static119.aByteArrayArrayArray28[local64][local97][(-(local103 + 1) << 6) + local99] = local148;
							}
						}
					}
				} else {
					for (local64 = -4096; local64 < 0; local64++) {
						local71 = arg0[local7++];
						if (local71 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class64 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class64(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class64(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local12;
		} else {
			@Pc(134) Class31 local134 = new Class31(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static179.aClass1_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local134;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ka;B)Lclient!kh;")
	public static Class33_Sub3 method719(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class33_Sub3(arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3049(), arg0.method3010());
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public static void method720() {
		Static16.aClass1_Sub12_Sub3_2.method2231();
		Static52.anInt1299 = 1;
		Static37.aClass3_5 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
	public static void method721() {
		Static208.aClass47_8.method1276();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
	public static void method722() {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(90) int local90;
		if (Static177.anInt3812 == 73) {
			local16 = Static18.aClass1_Sub14_Sub1_2.method3028();
			local24 = Static97.anInt2043 + (local16 >> 4 & 0x7);
			local31 = Static208.anInt1132 + (local16 & 0x7);
			local35 = Static18.aClass1_Sub14_Sub1_2.method3023();
			local39 = Static18.aClass1_Sub14_Sub1_2.method3053();
			if (local35 == 65535) {
				local35 = -1;
			}
			local50 = local39 >> 2;
			local54 = local39 & 0x3;
			local58 = Static64.anIntArray120[local50];
			if (local24 >= 0 && local31 >= 0 && local24 < 103 && local31 < 103) {
				if (local58 == 0) {
					@Pc(80) Class48 local80 = Static160.method2508(Static192.anInt4180, local24, local31);
					if (local80 != null) {
						local90 = (int) (local80.aLong94 >>> 32) & Integer.MAX_VALUE;
						if (local50 == 2) {
							local80.aClass8_4 = new Class8_Sub6(local90, 2, local54 + 4, Static192.anInt4180, local24, local31, local35, false, local80.aClass8_4);
							local80.aClass8_5 = new Class8_Sub6(local90, 2, local54 + 1 & 0x3, Static192.anInt4180, local24, local31, local35, false, local80.aClass8_5);
						} else {
							local80.aClass8_4 = new Class8_Sub6(local90, local50, local54, Static192.anInt4180, local24, local31, local35, false, local80.aClass8_4);
						}
					}
				}
				if (local58 == 1) {
					@Pc(156) Class85 local156 = Static25.method470(Static192.anInt4180, local24, local31);
					if (local156 != null) {
						local90 = (int) (local156.aLong208 >>> 32) & Integer.MAX_VALUE;
						if (local50 == 4 || local50 == 5) {
							local156.aClass8_7 = new Class8_Sub6(local90, 4, local54, Static192.anInt4180, local24, local31, local35, false, local156.aClass8_7);
						} else if (local50 == 6) {
							local156.aClass8_7 = new Class8_Sub6(local90, 4, local54 + 4, Static192.anInt4180, local24, local31, local35, false, local156.aClass8_7);
						} else if (local50 == 7) {
							local156.aClass8_7 = new Class8_Sub6(local90, 4, (local54 + 2 & 0x3) + 4, Static192.anInt4180, local24, local31, local35, false, local156.aClass8_7);
						} else if (local50 == 8) {
							local156.aClass8_7 = new Class8_Sub6(local90, 4, local54 + 4, Static192.anInt4180, local24, local31, local35, false, local156.aClass8_7);
							local156.aClass8_6 = new Class8_Sub6(local90, 4, (local54 + 2 & 0x3) + 4, Static192.anInt4180, local24, local31, local35, false, local156.aClass8_6);
						}
					}
				}
				if (local58 == 2) {
					@Pc(292) Class16 local292 = Static133.method1974(Static192.anInt4180, local24, local31);
					if (local50 == 11) {
						local50 = 10;
					}
					if (local292 != null) {
						local292.aClass8_2 = new Class8_Sub6(Integer.MAX_VALUE & (int) (local292.aLong30 >>> 32), local50, local54, Static192.anInt4180, local24, local31, local35, false, local292.aClass8_2);
					}
				}
				if (local58 == 3) {
					@Pc(330) Class5 local330 = Static58.method967(Static192.anInt4180, local24, local31);
					if (local330 != null) {
						local330.aClass8_1 = new Class8_Sub6(Integer.MAX_VALUE & (int) (local330.aLong7 >>> 32), 22, local54, Static192.anInt4180, local24, local31, local35, false, local330.aClass8_1);
					}
				}
			}
		} else if (Static177.anInt3812 == 91) {
			local16 = Static18.aClass1_Sub14_Sub1_2.method3053();
			local24 = (local16 >> 4 & 0x7) + Static97.anInt2043;
			local31 = (local16 & 0x7) + Static208.anInt1132;
			local35 = Static18.aClass1_Sub14_Sub1_2.method3053();
			local39 = local35 >> 2;
			local54 = Static64.anIntArray120[local39];
			local50 = local35 & 0x3;
			local58 = Static18.aClass1_Sub14_Sub1_2.method3023();
			if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
				Static45.method813(local39, local50, local31, Static192.anInt4180, local58, local54, local24, -1, 0);
			}
		} else if (Static177.anInt3812 == 33) {
			local16 = Static18.aClass1_Sub14_Sub1_2.method3034();
			local24 = Static18.aClass1_Sub14_Sub1_2.method3027();
			local31 = Static18.aClass1_Sub14_Sub1_2.method3036();
			local39 = Static208.anInt1132 + (local31 & 0x7);
			local35 = Static97.anInt2043 + (local31 >> 4 & 0x7);
			local50 = Static18.aClass1_Sub14_Sub1_2.method3023();
			if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local50 != Static32.anInt769) {
				@Pc(485) Class8_Sub4 local485 = new Class8_Sub4();
				local485.anInt1071 = local16;
				local485.anInt1080 = local24;
				if (Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local35][local39] == null) {
					Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local35][local39] = new Class20();
				}
				Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local35][local39].method466(new Class1_Sub3_Sub2(local485));
				Static162.method2557(local39, local35);
			}
		} else if (Static177.anInt3812 == 137) {
			local16 = Static18.aClass1_Sub14_Sub1_2.method3010();
			local24 = (local16 >> 4 & 0x7) + Static97.anInt2043;
			local31 = Static208.anInt1132 + (local16 & 0x7);
			local35 = Static18.aClass1_Sub14_Sub1_2.method3023();
			local39 = Static18.aClass1_Sub14_Sub1_2.method3023();
			local50 = Static18.aClass1_Sub14_Sub1_2.method3023();
			if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
				@Pc(582) Class20 local582 = Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31];
				if (local582 != null) {
					for (@Pc(589) Class1_Sub3_Sub2 local589 = (Class1_Sub3_Sub2) local582.method467(); local589 != null; local589 = (Class1_Sub3_Sub2) local582.method468()) {
						@Pc(594) Class8_Sub4 local594 = local589.aClass8_Sub4_1;
						if (local594.anInt1080 == (local35 & 0x7FFF) && local594.anInt1071 == local39) {
							local594.anInt1071 = local50;
							break;
						}
					}
					Static162.method2557(local31, local24);
				}
			}
		} else {
			@Pc(696) int local696;
			if (Static177.anInt3812 == 93) {
				local16 = Static18.aClass1_Sub14_Sub1_2.method3010();
				local24 = Static97.anInt2043 + (local16 >> 4 & 0x7);
				local31 = (local16 & 0x7) + Static208.anInt1132;
				local35 = Static18.aClass1_Sub14_Sub1_2.method3023();
				if (local35 == 65535) {
					local35 = -1;
				}
				local39 = Static18.aClass1_Sub14_Sub1_2.method3010();
				local50 = local39 >> 4 & 0xF;
				local54 = local39 & 0x7;
				local58 = Static18.aClass1_Sub14_Sub1_2.method3010();
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					local696 = local50 + 1;
					if (local24 - local696 <= Static15.aClass8_Sub3_Sub1_1.anIntArray309[0] && local24 + local696 >= Static15.aClass8_Sub3_Sub1_1.anIntArray309[0] && local31 - local696 <= Static15.aClass8_Sub3_Sub1_1.anIntArray312[0] && local696 + local31 >= Static15.aClass8_Sub3_Sub1_1.anIntArray312[0] && Static185.anInt3997 != 0 && local54 > 0 && Static45.anInt1163 < 50 && local35 != -1) {
						Static110.anIntArray177[Static45.anInt1163] = local35;
						Static105.anIntArray172[Static45.anInt1163] = local54;
						Static87.anIntArray158[Static45.anInt1163] = local58;
						Static82.aClass4Array1[Static45.anInt1163] = null;
						Static63.anIntArray307[Static45.anInt1163] = (local24 << 16) + (local31 << 8) + local50;
						Static45.anInt1163++;
					}
				}
			}
			if (Static177.anInt3812 == 184) {
				local16 = Static18.aClass1_Sub14_Sub1_2.method3053();
				local31 = (local16 & 0x7) + Static208.anInt1132;
				local24 = (local16 >> 4 & 0x7) + Static97.anInt2043;
				local35 = Static18.aClass1_Sub14_Sub1_2.method3010();
				local50 = local35 & 0x3;
				local39 = local35 >> 2;
				local54 = Static64.anIntArray120[local39];
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					Static45.method813(local39, local50, local31, Static192.anInt4180, -1, local54, local24, -1, 0);
				}
			} else if (Static177.anInt3812 == 154) {
				local16 = Static18.aClass1_Sub14_Sub1_2.method3010();
				local24 = (local16 >> 4 & 0x7) + Static97.anInt2043;
				local31 = (local16 & 0x7) + Static208.anInt1132;
				local35 = Static18.aClass1_Sub14_Sub1_2.method3027();
				local39 = Static18.aClass1_Sub14_Sub1_2.method3023();
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					@Pc(899) Class8_Sub4 local899 = new Class8_Sub4();
					local899.anInt1080 = local35;
					local899.anInt1071 = local39;
					if (Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31] == null) {
						Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31] = new Class20();
					}
					Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31].method466(new Class1_Sub3_Sub2(local899));
					Static162.method2557(local31, local24);
				}
			} else {
				@Pc(999) int local999;
				@Pc(995) int local995;
				@Pc(1003) int local1003;
				if (Static177.anInt3812 == 80) {
					local16 = Static18.aClass1_Sub14_Sub1_2.method3039();
					local24 = Static18.aClass1_Sub14_Sub1_2.method3034();
					@Pc(956) byte local956 = Static18.aClass1_Sub14_Sub1_2.method3031();
					@Pc(960) byte local960 = Static18.aClass1_Sub14_Sub1_2.method3055();
					@Pc(964) byte local964 = Static18.aClass1_Sub14_Sub1_2.method3055();
					local50 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local54 = Static97.anInt2043 + (local50 >> 4 & 0x7);
					local58 = (local50 & 0x7) + Static208.anInt1132;
					local696 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local90 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local995 = local90 & 0x3;
					local999 = local90 >> 2;
					local1003 = Static64.anIntArray120[local999];
					@Pc(1007) byte local1007 = Static18.aClass1_Sub14_Sub1_2.method3009();
					@Pc(1011) int local1011 = Static18.aClass1_Sub14_Sub1_2.method3034();
					@Pc(1022) Class8_Sub3_Sub1 local1022;
					if (local696 == Static32.anInt769) {
						local1022 = Static15.aClass8_Sub3_Sub1_1;
					} else {
						local1022 = Static47.aClass8_Sub3_Sub1Array1[local696];
					}
					if (local1022 != null) {
						@Pc(1032) Class1_Sub3_Sub5 local1032 = Static154.method2362(local16);
						@Pc(1043) int local1043;
						@Pc(1046) int local1046;
						if (local995 == 1 || local995 == 3) {
							local1043 = local1032.anInt1408;
							local1046 = local1032.anInt1399;
						} else {
							local1043 = local1032.anInt1399;
							local1046 = local1032.anInt1408;
						}
						@Pc(1060) int local1060 = (local1043 >> 1) + local54;
						@Pc(1068) int local1068 = (local1043 + 1 >> 1) + local54;
						@Pc(1075) int local1075 = local58 + (local1046 >> 1);
						@Pc(1084) int local1084 = local58 + (local1046 + 1 >> 1);
						@Pc(1088) int[][] local1088 = Static156.anIntArrayArrayArray6[Static192.anInt4180];
						@Pc(1115) int local1115 = local1088[local1068][local1084] + local1088[local1060][local1075] + local1088[local1068][local1075] + local1088[local1060][local1084] >> 2;
						@Pc(1123) int local1123 = (local54 << 7) + (local1043 << 6);
						@Pc(1131) int local1131 = (local1046 << 6) + (local58 << 7);
						@Pc(1142) Class1_Sub3_Sub25 local1142 = local1032.method966(local1115, local1123, false, local999, local1088, local1131, local995);
						if (local1142 != null) {
							@Pc(1149) byte local1149;
							if (local964 < local956) {
								local1149 = local956;
								local956 = local964;
								local964 = local1149;
							}
							Static45.method813(0, 0, local58, Static192.anInt4180, -1, local1003, local54, local24 + 1, local1011 + 1);
							local1022.anInt977 = local58 * 128 + local1046 * 64;
							local1022.aClass8_Sub5_1 = (Class8_Sub5) local1142.aClass8_11;
							local1022.anInt990 = local1115;
							local1022.anInt979 = Static155.anInt2981 + local1011;
							local1022.anInt981 = local54 + local956;
							local1022.anInt985 = local1043 * 64 + local54 * 128;
							local1022.anInt974 = local24 + Static155.anInt2981;
							if (local1007 > local960) {
								local1149 = local1007;
								local1007 = local960;
								local960 = local1149;
							}
							local1022.anInt983 = local1007 + local58;
							local1022.anInt971 = local54 + local964;
							local1022.anInt984 = local960 + local58;
						}
					}
				}
				if (Static177.anInt3812 == 195) {
					local16 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local31 = Static208.anInt1132 + (local16 & 0x7);
					local24 = (local16 >> 4 & 0x7) + Static97.anInt2043;
					local35 = Static18.aClass1_Sub14_Sub1_2.method3009() + local24;
					local39 = local31 + Static18.aClass1_Sub14_Sub1_2.method3009();
					local50 = Static18.aClass1_Sub14_Sub1_2.method3048();
					local54 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local58 = Static18.aClass1_Sub14_Sub1_2.method3010() * 4;
					local696 = Static18.aClass1_Sub14_Sub1_2.method3010() * 4;
					local90 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local999 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local995 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local1003 = Static18.aClass1_Sub14_Sub1_2.method3010();
					if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local54 != 65535) {
						local39 = local39 * 128 + 64;
						local24 = local24 * 128 + 64;
						local35 = local35 * 128 + 64;
						local31 = local31 * 128 + 64;
						@Pc(1407) Class8_Sub2 local1407 = new Class8_Sub2(local54, Static192.anInt4180, local24, local31, Static64.method1027(local31, local24, Static192.anInt4180) - local58, local90 - -Static155.anInt2981, local999 + Static155.anInt2981, local995, local1003, local50, local696);
						local1407.method613(local90 + Static155.anInt2981, local35, local39, Static64.method1027(local39, local35, Static192.anInt4180) - local696);
						Static69.aClass20_5.method466(new Class1_Sub3_Sub18(local1407));
					}
				} else if (Static177.anInt3812 == 127) {
					local16 = Static18.aClass1_Sub14_Sub1_2.method3036();
					local31 = Static208.anInt1132 + (local16 & 0x7);
					local24 = Static97.anInt2043 + (local16 >> 4 & 0x7);
					local35 = Static18.aClass1_Sub14_Sub1_2.method3023();
					if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
						@Pc(1475) Class20 local1475 = Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31];
						if (local1475 != null) {
							for (@Pc(1482) Class1_Sub3_Sub2 local1482 = (Class1_Sub3_Sub2) local1475.method467(); local1482 != null; local1482 = (Class1_Sub3_Sub2) local1475.method468()) {
								if (local1482.aClass8_Sub4_1.anInt1080 == (local35 & 0x7FFF)) {
									local1482.method3414();
									break;
								}
							}
							if (local1475.method467() == null) {
								Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local24][local31] = null;
							}
							Static162.method2557(local31, local24);
						}
					}
				} else if (Static177.anInt3812 == 235) {
					local16 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local31 = (local16 & 0x7) + Static208.anInt1132;
					local24 = Static97.anInt2043 + (local16 >> 4 & 0x7);
					local35 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local39 = Static18.aClass1_Sub14_Sub1_2.method3010();
					local50 = Static18.aClass1_Sub14_Sub1_2.method3023();
					if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
						local24 = local24 * 128 + 64;
						local31 = local31 * 128 + 64;
						@Pc(1603) Class8_Sub1 local1603 = new Class8_Sub1(local35, Static192.anInt4180, local24, local31, Static64.method1027(local31, local24, Static192.anInt4180) - local39, local50, Static155.anInt2981);
						Static89.aClass20_9.method466(new Class1_Sub3_Sub6(local1603));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLclient!r;Lclient!r;)V")
	public static void method723(@OriginalArg(1) Class1_Sub3_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) Class1_Sub3_Sub1_Sub3_Sub1 arg1) {
		if (Static4.aClass1_Sub3_Sub1_Sub1Array1 == null) {
			Static4.aClass1_Sub3_Sub1_Sub1Array1 = Static183.method2955(Static71.aClass3_Sub1_8, 0, Static114.anInt2459);
		}
		if (Static165.aClass1_Sub3_Sub1_Sub5Array8 == null) {
			Static165.aClass1_Sub3_Sub1_Sub5Array8 = Static185.method2996(Static176.anInt3804, Static71.aClass3_Sub1_8, 0);
		}
		if (Static89.aClass1_Sub3_Sub1_Sub5Array4 == null) {
			Static89.aClass1_Sub3_Sub1_Sub5Array4 = Static185.method2996(Static160.anInt3331, Static71.aClass3_Sub1_8, 0);
		}
		if (Static202.aClass1_Sub3_Sub1_Sub5Array10 == null) {
			Static202.aClass1_Sub3_Sub1_Sub5Array10 = Static185.method2996(Static28.anInt642, Static71.aClass3_Sub1_8, 0);
		}
		Static46.method3173(0, 23, 765, 480, 0);
		Static46.method3171(0, 0, 138, 23, 12425273, 9135624);
		Static46.method3171(138, 0, 640, 23, 5197647, 2697513);
		arg1.method2451(Static199.aClass92_1990, 69, 15, 0, -1);
		if (Static202.aClass1_Sub3_Sub1_Sub5Array10 != null) {
			Static202.aClass1_Sub3_Sub1_Sub5Array10[1].method3183(140, 1);
			arg0.method2443(Static19.aClass92_208, 152, 10, 16777215, -1);
			Static202.aClass1_Sub3_Sub1_Sub5Array10[0].method3183(140, 12);
			arg0.method2443(Static158.aClass92_1597, 152, 21, 16777215, -1);
		}
		if (Static89.aClass1_Sub3_Sub1_Sub5Array4 != null) {
			if (Static38.anIntArray78[0] == 0 && Static201.anIntArray357[0] == 0) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[2].method3183(280, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[0].method3183(280, 4);
			}
			if (Static38.anIntArray78[0] == 0 && Static201.anIntArray357[0] == 1) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[3].method3183(295, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[1].method3183(295, 4);
			}
			arg1.method2443(Static120.aClass92_1185, 312, 17, 16777215, -1);
			if (Static38.anIntArray78[0] == 1 && Static201.anIntArray357[0] == 0) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[2].method3183(390, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[0].method3183(390, 4);
			}
			if (Static38.anIntArray78[0] == 1 && Static201.anIntArray357[0] == 1) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[3].method3183(405, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[1].method3183(405, 4);
			}
			arg1.method2443(Static61.aClass92_597, 422, 17, 16777215, -1);
			if (Static38.anIntArray78[0] == 2 && Static201.anIntArray357[0] == 0) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[2].method3183(500, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[0].method3183(500, 4);
			}
			if (Static38.anIntArray78[0] == 2 && Static201.anIntArray357[0] == 1) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[3].method3183(515, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[1].method3183(515, 4);
			}
			arg1.method2443(Static121.aClass92_2060, 532, 17, 16777215, -1);
			if (Static38.anIntArray78[0] == 3 && Static201.anIntArray357[0] == 0) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[2].method3183(610, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[0].method3183(610, 4);
			}
			if (Static38.anIntArray78[0] == 3 && Static201.anIntArray357[0] == 1) {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[3].method3183(625, 4);
			} else {
				Static89.aClass1_Sub3_Sub1_Sub5Array4[1].method3183(625, 4);
			}
			arg1.method2443(Static173.aClass92_1762, 642, 17, 16777215, -1);
		}
		Static46.method3173(700, 4, 58, 16, 0);
		arg0.method2451(Static71.aClass92_663, 729, 16, 16777215, -1);
		Static94.anInt1982 = -1;
		if (Static4.aClass1_Sub3_Sub1_Sub1Array1 == null) {
			return;
		}
		@Pc(409) int local409 = 8;
		@Pc(415) int local415 = 24;
		@Pc(419) int local419;
		@Pc(417) int local417;
		do {
			local417 = local409;
			local419 = local415;
			if (Static176.anInt3790 <= (local409 - 1) * local415) {
				local409--;
			}
			if (Static176.anInt3790 <= local409 * (local415 - 1)) {
				local415--;
			}
			if ((local415 - 1) * local409 >= Static176.anInt3790) {
				local415--;
			}
		} while (local419 != local415 || local409 != local417);
		local419 = (765 - local409 * 88) / (local409 + 1);
		local417 = (480 - local415 * 19) / (local415 + 1);
		if (local417 > 5) {
			local417 = 5;
		}
		if (local419 > 5) {
			local419 = 5;
		}
		@Pc(513) int local513 = (765 - (local409 - 1) * local419 - local409 * 88) / 2;
		@Pc(528) int local528 = (480 - local415 * 19 - (local415 + -1) * local417) / 2;
		@Pc(532) int local532 = local528 + 23;
		@Pc(534) int local534 = local513;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < Static176.anInt3790; local538++) {
			@Pc(544) Class70 local544 = Static90.aClass70Array1[local538];
			@Pc(546) boolean local546 = true;
			@Pc(551) Class92 local551 = Static49.method872(local544.anInt2792);
			if (local544.anInt2792 == -1) {
				local546 = false;
				local551 = Static52.aClass92_555;
			} else if (local544.anInt2792 > 1980) {
				local546 = false;
				local551 = Static113.aClass92_1096;
			}
			if (local534 <= Static85.anInt1855 && Static126.anInt2633 >= local532 && local534 + 88 > Static85.anInt1855 && local532 + 19 > Static126.anInt2633 && local546) {
				Static94.anInt1982 = local538;
				Static4.aClass1_Sub3_Sub1_Sub1Array1[local544.aBoolean165 ? 1 : 0].method361(local534, local532);
			} else {
				Static4.aClass1_Sub3_Sub1_Sub1Array1[local544.aBoolean165 ? 1 : 0].method367(local534, local532);
			}
			if (Static165.aClass1_Sub3_Sub1_Sub5Array8 != null) {
				Static165.aClass1_Sub3_Sub1_Sub5Array8[(local544.aBoolean165 ? 8 : 0) + local544.anInt2799].method3183(local534 + 29, local532);
			}
			arg1.method2451(Static49.method872(local544.anInt2796), local534 + 15, local532 + 5 + 9, 0, -1);
			arg0.method2451(local551, local534 + 60, local532 + 14, 268435455, -1);
			local532 += local417 + 19;
			@Pc(694) int local694 = ~local415;
			local536++;
			if (local694 >= ~local536) {
				local534 += local419 + 88;
				local532 = local528 + 23;
				local536 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ab;Lclient!ab;ILclient!ab;)V")
	public static void method725(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) Class3 arg2) {
		Static17.anInt3467 = arg2.method3246(Static210.aClass92_2068);
		Static187.anInt4097 = arg0.method3246(Static179.aClass92_1847);
		Static85.anInt1856 = arg0.method3246(Static18.aClass92_192);
		Static155.anInt2985 = arg0.method3246(Static26.aClass92_267);
		Static195.anInt4229 = arg0.method3246(Static195.aClass92_1981);
		Static73.anInt1643 = arg0.method3246(Static93.aClass92_871);
		Static114.anInt2459 = arg0.method3246(Static117.aClass92_1160);
		Static176.anInt3804 = arg0.method3246(Static40.aClass92_1715);
		Static160.anInt3331 = arg0.method3246(Static3.aClass92_1986);
		Static28.anInt642 = arg0.method3246(Static143.aClass92_1376);
		Static31.anInt759 = arg0.method3246(Static28.aClass92_291);
		Static32.anInt770 = arg1.method3246(Static166.aClass92_1673);
	}
}
