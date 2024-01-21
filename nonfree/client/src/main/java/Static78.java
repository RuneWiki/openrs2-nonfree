import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!q", name = "N", descriptor = "I")
	public static int anInt2114;

	@OriginalMember(owner = "client!q", name = "O", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array9;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
	public static int anInt2125;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "Lclient!va;")
	public static Class61 aClass61_851 = Static88.method1421("@whi@");

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
	public static int anInt2122 = 0;

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "Lclient!va;")
	public static Class61 aClass61_852 = Static88.method1421("headicons_hint");

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	public static final int anInt2128 = 3353893;

	@OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
	public static int anInt2131 = 128;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BB)I")
	public static int method1233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(13) int local13 = -1;
		for (@Pc(15) int local15 = arg0; local15 < arg1; local15++) {
			local13 = local13 >>> 8 ^ Applet_Sub1.anIntArray57[(local13 ^ arg2[local15]) & 0xFF];
		}
		return ~local13;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lclient!va;")
	public static Class61 method1234(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(47) byte[] local47 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local29--;
				local47[local29] = Static94.aByteArray16[(int) (local51 - arg0 * 37L)];
			}
			@Pc(78) Class61 local78 = new Class61();
			local78.aByteArray18 = local47;
			local78.anInt2559 = local47.length;
			return local78;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class10_Sub3 local12 = null;
		for (@Pc(17) Class10_Sub3 local17 = (Class10_Sub3) Static56.aClass9_6.method72(); local17 != null; local17 = (Class10_Sub3) Static56.aClass9_6.method81()) {
			if (local17.anInt723 == arg5 && arg1 == local17.anInt728 && local17.anInt731 == arg8 && local17.anInt726 == arg0) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class10_Sub3();
			local12.anInt726 = arg0;
			local12.anInt731 = arg8;
			local12.anInt723 = arg5;
			local12.anInt728 = arg1;
			Static19.method412(local12);
			Static56.aClass9_6.method79(local12);
		}
		local12.anInt736 = arg3;
		local12.anInt742 = arg7;
		local12.anInt741 = arg6;
		local12.anInt725 = arg2;
		local12.anInt729 = arg4;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1237() {
		aClass61_851 = null;
		aClass61_852 = null;
		aClass10_Sub1_Sub1_Sub1Array9 = null;
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(B)Lclient!c;")
	public static Class7 method1238() {
		try {
			return (Class7) Class.forName("Class7_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub2();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!va;Lclient!va;Lclient!he;I)Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 method1240(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class11 arg2) {
		@Pc(8) int local8 = arg2.method221(arg1);
		@Pc(14) int local14 = arg2.method227(local8, arg0);
		return Static56.method818(local8, local14, arg2);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)V")
	public static void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class9 local7 = Static11.aClass9ArrayArrayArray1[Static101.anInt2582][arg0][arg1];
		if (local7 == null) {
			Static48.aClass54_1.method1389(Static101.anInt2582, arg0, arg1);
			return;
		}
		@Pc(25) Class10_Sub1_Sub5_Sub1 local25 = null;
		@Pc(27) int local27 = -99999999;
		@Pc(32) Class10_Sub1_Sub5_Sub1 local32;
		for (local32 = (Class10_Sub1_Sub5_Sub1) local7.method72(); local32 != null; local32 = (Class10_Sub1_Sub5_Sub1) local7.method81()) {
			@Pc(38) Class10_Sub1_Sub15 local38 = Static94.method1491(local32.anInt689);
			@Pc(41) int local41 = local38.anInt2529;
			if (local38.aBoolean116) {
				local41 *= local32.anInt686 + 1;
			}
			if (local27 < local41) {
				local25 = local32;
				local27 = local41;
			}
		}
		local7.method78(local25);
		local32 = (Class10_Sub1_Sub5_Sub1) local7.method72();
		@Pc(80) Class10_Sub1_Sub5_Sub1 local80 = null;
		@Pc(82) Class10_Sub1_Sub5_Sub1 local82 = null;
		while (local32 != null) {
			if (local32.anInt689 != local25.anInt689 && local80 == null) {
				local80 = local32;
			}
			if (local25.anInt689 != local32.anInt689 && local32.anInt689 != local80.anInt689 && local82 == null) {
				local82 = local32;
			}
			local32 = (Class10_Sub1_Sub5_Sub1) local7.method81();
		}
		@Pc(125) int local125 = (arg1 << 7) + arg0 + 1610612736;
		Static48.aClass54_1.method1361(Static101.anInt2582, arg0, arg1, Static39.method230(arg0 * 128 + 64, Static101.anInt2582, arg1 * 128 + 64), local25, local125, local80, local82);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IJ)V")
	public static void method1243(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static6.anInt70 >= 100 && Static70.anInt2675 != 1 || Static6.anInt70 >= 200) {
			Static52.method794(Static15.aClass61_166, Static88.aClass61_916, 0);
			return;
		}
		@Pc(37) Class61 local37 = method1234(arg0).method1617();
		for (@Pc(39) int local39 = 0; local39 < Static6.anInt70; local39++) {
			if (Static76.aLongArray6[local39] == arg0) {
				Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { local37, Static4.aClass61_8 }), 0);
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static80.anInt2155; local75++) {
			if (arg0 == Static57.aLongArray4[local75]) {
				Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { Static17.aClass61_191, local37, Static95.aClass61_977 }), 0);
				return;
			}
		}
		if (local37.method1608(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699)) {
			return;
		}
		Static106.aClass61Array15[Static6.anInt70] = local37;
		Static76.aLongArray6[Static6.anInt70] = arg0;
		Static33.anIntArray112[Static6.anInt70] = 0;
		Static6.anInt70++;
		Static80.aBoolean94 = true;
		Static50.aClass10_Sub10_Sub1_3.method1167(85);
		Static50.aClass10_Sub10_Sub1_3.method1125(arg0);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I")
	public static int method1244() {
		return 5;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILclient!cb;IIIILclient!rc;I)V")
	public static void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class54 arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = Static37.anIntArrayArrayArray1[arg2][arg5 + 1][arg0];
		@Pc(23) int local23 = Static37.anIntArrayArrayArray1[arg2][arg5][arg0];
		@Pc(35) int local35 = Static37.anIntArrayArrayArray1[arg2][arg5 + 1][arg0 + 1];
		@Pc(45) int local45 = Static37.anIntArrayArrayArray1[arg2][arg5][arg0 + 1];
		@Pc(56) int local56 = local15 + local23 + local35 + local45 >> 2;
		@Pc(62) int local62 = (arg6 << 6) + arg8;
		@Pc(66) Class10_Sub1_Sub10 local66 = Static18.method405(arg4);
		@Pc(80) int local80 = arg5 + (arg0 << 7) + (arg4 << 14) + 1073741824;
		if (local66.anInt1384 == 1) {
			local62 += 256;
		}
		if (local66.anInt1371 == 0) {
			local80 += Integer.MIN_VALUE;
		}
		@Pc(119) Class10_Sub1_Sub5 local119;
		if (arg8 == 22) {
			if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
				local119 = local66.method776(local23, local45, arg6, 22, local15, local35);
			} else {
				local119 = new Class10_Sub1_Sub5_Sub6(arg4, 22, arg6, local23, local15, local35, local45, local66.anInt1375, true);
			}
			arg7.method1373(arg1, arg5, arg0, local56, local119, local80, local62);
			if (local66.aBoolean56 && local66.anInt1371 == 1) {
				arg3.method263(arg5, arg0);
			}
			return;
		}
		@Pc(224) int local224;
		if (arg8 == 10 || arg8 == 11) {
			if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
				local119 = local66.method776(local23, local45, arg6, 10, local15, local35);
			} else {
				local119 = new Class10_Sub1_Sub5_Sub6(arg4, 10, arg6, local23, local15, local35, local45, local66.anInt1375, true);
			}
			if (local119 != null) {
				@Pc(205) int local205 = 0;
				if (arg8 == 11) {
					local205 += 256;
				}
				@Pc(227) int local227;
				if (arg6 == 1 || arg6 == 3) {
					local224 = local66.anInt1378;
					local227 = local66.anInt1369;
				} else {
					local224 = local66.anInt1369;
					local227 = local66.anInt1378;
				}
				arg7.method1358(arg1, arg5, arg0, local56, local224, local227, local119, local205, local80, local62);
			}
			if (local66.aBoolean56) {
				arg3.method251(arg0, local66.aBoolean57, arg6, arg5, local66.anInt1369, local66.anInt1378);
			}
		} else if (arg8 >= 12) {
			if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
				local119 = local66.method776(local23, local45, arg6, arg8, local15, local35);
			} else {
				local119 = new Class10_Sub1_Sub5_Sub6(arg4, arg8, arg6, local23, local15, local35, local45, local66.anInt1375, true);
			}
			arg7.method1358(arg1, arg5, arg0, local56, 1, 1, local119, 0, local80, local62);
			if (local66.aBoolean56) {
				arg3.method251(arg0, local66.aBoolean57, arg6, arg5, local66.anInt1369, local66.anInt1378);
			}
		} else if (arg8 == 0) {
			if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
				local119 = local66.method776(local23, local45, arg6, 0, local15, local35);
			} else {
				local119 = new Class10_Sub1_Sub5_Sub6(arg4, 0, arg6, local23, local15, local35, local45, local66.anInt1375, true);
			}
			arg7.method1367(arg1, arg5, arg0, local56, local119, null, Static54.anIntArray159[arg6], 0, local80, local62);
			if (local66.aBoolean56) {
				arg3.method264(arg8, arg5, arg0, local66.aBoolean57, arg6);
			}
		} else if (arg8 == 1) {
			if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
				local119 = local66.method776(local23, local45, arg6, 1, local15, local35);
			} else {
				local119 = new Class10_Sub1_Sub5_Sub6(arg4, 1, arg6, local23, local15, local35, local45, local66.anInt1375, true);
			}
			arg7.method1367(arg1, arg5, arg0, local56, local119, null, Static69.anIntArray206[arg6], 0, local80, local62);
			if (local66.aBoolean56) {
				arg3.method264(arg8, arg5, arg0, local66.aBoolean57, arg6);
			}
		} else {
			@Pc(472) int local472;
			@Pc(510) Class10_Sub1_Sub5 local510;
			if (arg8 == 2) {
				local472 = arg6 + 1 & 0x3;
				@Pc(496) Class10_Sub1_Sub5 local496;
				if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
					local496 = local66.method776(local23, local45, arg6 + 4, 2, local15, local35);
					local510 = local66.method776(local23, local45, local472, 2, local15, local35);
				} else {
					local496 = new Class10_Sub1_Sub5_Sub6(arg4, 2, arg6 + 4, local23, local15, local35, local45, local66.anInt1375, true);
					local510 = new Class10_Sub1_Sub5_Sub6(arg4, 2, local472, local23, local15, local35, local45, local66.anInt1375, true);
				}
				arg7.method1367(arg1, arg5, arg0, local56, local496, local510, Static54.anIntArray159[arg6], Static54.anIntArray159[local472], local80, local62);
				if (local66.aBoolean56) {
					arg3.method264(arg8, arg5, arg0, local66.aBoolean57, arg6);
				}
			} else if (arg8 == 3) {
				if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
					local119 = local66.method776(local23, local45, arg6, 3, local15, local35);
				} else {
					local119 = new Class10_Sub1_Sub5_Sub6(arg4, 3, arg6, local23, local15, local35, local45, local66.anInt1375, true);
				}
				arg7.method1367(arg1, arg5, arg0, local56, local119, null, Static69.anIntArray206[arg6], 0, local80, local62);
				if (local66.aBoolean56) {
					arg3.method264(arg8, arg5, arg0, local66.aBoolean57, arg6);
				}
			} else if (arg8 == 9) {
				if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
					local119 = local66.method776(local23, local45, arg6, arg8, local15, local35);
				} else {
					local119 = new Class10_Sub1_Sub5_Sub6(arg4, arg8, arg6, local23, local15, local35, local45, local66.anInt1375, true);
				}
				arg7.method1358(arg1, arg5, arg0, local56, 1, 1, local119, 0, local80, local62);
				if (local66.aBoolean56) {
					arg3.method251(arg0, local66.aBoolean57, arg6, arg5, local66.anInt1369, local66.anInt1378);
				}
			} else {
				if (local66.aBoolean58) {
					if (arg6 == 1) {
						local472 = local45;
						local45 = local35;
						local35 = local15;
						local15 = local23;
						local23 = local472;
					} else if (arg6 == 2) {
						local472 = local45;
						local45 = local15;
						local15 = local472;
						local472 = local35;
						local35 = local23;
						local23 = local472;
					} else if (arg6 == 3) {
						local472 = local45;
						local45 = local23;
						local23 = local15;
						local15 = local35;
						local35 = local472;
					}
				}
				if (arg8 == 4) {
					if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
						local119 = local66.method776(local23, local45, 0, 4, local15, local35);
					} else {
						local119 = new Class10_Sub1_Sub5_Sub6(arg4, 4, 0, local23, local15, local35, local45, local66.anInt1375, true);
					}
					arg7.method1383(arg1, arg5, arg0, local56, local119, Static54.anIntArray159[arg6], arg6 * 512, 0, 0, local80, local62);
				} else if (arg8 == 5) {
					local224 = arg7.method1363(arg1, arg5, arg0);
					local472 = 16;
					if (local224 > 0) {
						local472 = Static18.method405(local224 >> 14 & 0x7FFF).anInt1386;
					}
					if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
						local510 = local66.method776(local23, local45, 0, 4, local15, local35);
					} else {
						local510 = new Class10_Sub1_Sub5_Sub6(arg4, 4, 0, local23, local15, local35, local45, local66.anInt1375, true);
					}
					arg7.method1383(arg1, arg5, arg0, local56, local510, Static54.anIntArray159[arg6], arg6 * 512, Static105.anIntArray335[arg6] * local472, local472 * Static25.anIntArray84[arg6], local80, local62);
				} else if (arg8 == 6) {
					if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
						local119 = local66.method776(local23, local45, 0, 4, local15, local35);
					} else {
						local119 = new Class10_Sub1_Sub5_Sub6(arg4, 4, 0, local23, local15, local35, local45, local66.anInt1375, true);
					}
					arg7.method1383(arg1, arg5, arg0, local56, local119, 256, arg6, 0, 0, local80, local62);
				} else if (arg8 == 7) {
					if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
						local119 = local66.method776(local23, local45, 0, 4, local15, local35);
					} else {
						local119 = new Class10_Sub1_Sub5_Sub6(arg4, 4, 0, local23, local15, local35, local45, local66.anInt1375, true);
					}
					arg7.method1383(arg1, arg5, arg0, local56, local119, 512, arg6, 0, 0, local80, local62);
				} else if (arg8 == 8) {
					if (local66.anInt1375 == -1 && local66.anIntArray146 == null) {
						local119 = local66.method776(local23, local45, 0, 4, local15, local35);
					} else {
						local119 = new Class10_Sub1_Sub5_Sub6(arg4, 4, 0, local23, local15, local35, local45, local66.anInt1375, true);
					}
					arg7.method1383(arg1, arg5, arg0, local56, local119, 768, arg6, 0, 0, local80, local62);
				}
			}
		}
	}
}
