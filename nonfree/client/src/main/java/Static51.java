import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!bg;")
	public static Class11 aClass11_47;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!da;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!nd;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_584 = Static32.method683("p12_full");

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_586 = Static32.method683("jolt");

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_587 = Static32.method683(":duelfriend:");

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_588 = Static32.method683("Konfig geladen)3");

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!lf;")
	private static Class49 aClass49_590 = Static32.method683("Examine");

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_589 = aClass49_590;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZI)Lclient!fi;")
	public static Class2_Sub8 method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub8 local12 = new Class2_Sub8();
		local12.anInt1204 = arg0;
		local12.anInt1201 = arg2;
		Static100.aClass25_7.method838((long) arg1, local12);
		Static180.method2982(arg2);
		Static13.method198(arg2);
		@Pc(34) Class85 local34 = Static140.method2337(arg1);
		if (local34 != null) {
			Static102.method1756(local34);
		}
		if (Static141.aClass85_12 != null) {
			Static102.method1756(Static141.aClass85_12);
			Static141.aClass85_12 = null;
		}
		Static47.aBoolean40 = false;
		Static133.anInt3713 = 0;
		Static170.method2828(Static113.anInt2340, Static93.anInt1968, Static92.anInt1938, Static98.anInt2077);
		if (Static3.anInt57 != -1) {
			Static24.method455(1, Static3.anInt57);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	public static boolean method905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static134.anIntArrayArray30[local3][local7] = 0;
				Static85.anIntArrayArray18[local3][local7] = 99999999;
			}
		}
		Static134.anIntArrayArray30[arg6][arg5] = 99;
		local7 = arg6;
		Static85.anIntArrayArray18[arg6][arg5] = 0;
		@Pc(49) int local49 = arg5;
		@Pc(51) byte local51 = 0;
		Static163.anIntArray56[0] = arg6;
		@Pc(58) int local58 = local51 + 1;
		Static20.anIntArray42[0] = arg5;
		@Pc(62) int local62 = 0;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = Static163.anIntArray56.length;
		@Pc(72) int[][] local72 = Static148.aClass48Array1[Static66.anInt1396].anIntArrayArray21;
		@Pc(186) int local186;
		while (local58 != local62) {
			local7 = Static163.anIntArray56[local62];
			local49 = Static20.anIntArray42[local62];
			local62 = (local62 + 1) % local67;
			if (local7 == arg2 && local49 == arg8) {
				local64 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static148.aClass48Array1[Static66.anInt1396].method1602(local7, arg8, arg9 - 1, arg2, local49, arg3)) {
					local64 = true;
					break;
				}
				if (arg9 < 10 && Static148.aClass48Array1[Static66.anInt1396].method1588(local7, arg8, arg9 - 1, arg2, local49, arg3)) {
					local64 = true;
					break;
				}
			}
			if (arg0 != 0 && arg1 != 0 && Static148.aClass48Array1[Static66.anInt1396].method1600(arg0, arg2, local49, arg10, arg1, arg8, local7)) {
				local64 = true;
				break;
			}
			local186 = Static85.anIntArrayArray18[local7][local49] + 1;
			if (local7 > 0 && Static134.anIntArrayArray30[local7 - 1][local49] == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0) {
				Static163.anIntArray56[local58] = local7 - 1;
				Static20.anIntArray42[local58] = local49;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 - 1][local49] = 2;
				Static85.anIntArrayArray18[local7 - 1][local49] = local186;
			}
			if (local7 < 103 && Static134.anIntArrayArray30[local7 + 1][local49] == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0) {
				Static163.anIntArray56[local58] = local7 + 1;
				Static20.anIntArray42[local58] = local49;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 + 1][local49] = 8;
				Static85.anIntArrayArray18[local7 + 1][local49] = local186;
			}
			if (local49 > 0 && Static134.anIntArrayArray30[local7][local49 - 1] == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static163.anIntArray56[local58] = local7;
				Static20.anIntArray42[local58] = local49 - 1;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7][local49 - 1] = 1;
				Static85.anIntArrayArray18[local7][local49 - 1] = local186;
			}
			if (local49 < 103 && Static134.anIntArrayArray30[local7][local49 + 1] == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static163.anIntArray56[local58] = local7;
				Static20.anIntArray42[local58] = local49 + 1;
				Static134.anIntArrayArray30[local7][local49 + 1] = 4;
				Static85.anIntArrayArray18[local7][local49 + 1] = local186;
				local58 = (local58 + 1) % local67;
			}
			if (local7 > 0 && local49 > 0 && Static134.anIntArrayArray30[local7 - 1][local49 - 1] == 0 && (local72[local7 - 1][local49 - 1] & 0x12C010E) == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static163.anIntArray56[local58] = local7 - 1;
				Static20.anIntArray42[local58] = local49 - 1;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 - 1][local49 - 1] = 3;
				Static85.anIntArrayArray18[local7 - 1][local49 - 1] = local186;
			}
			if (local7 < 103 && local49 > 0 && Static134.anIntArrayArray30[local7 + 1][local49 - 1] == 0 && (local72[local7 + 1][local49 - 1] & 0x12C0183) == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static163.anIntArray56[local58] = local7 + 1;
				Static20.anIntArray42[local58] = local49 - 1;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 + 1][local49 - 1] = 9;
				Static85.anIntArrayArray18[local7 + 1][local49 - 1] = local186;
			}
			if (local7 > 0 && local49 < 103 && Static134.anIntArrayArray30[local7 - 1][local49 + 1] == 0 && (local72[local7 - 1][local49 + 1] & 0x12C0138) == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static163.anIntArray56[local58] = local7 - 1;
				Static20.anIntArray42[local58] = local49 + 1;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 - 1][local49 + 1] = 6;
				Static85.anIntArrayArray18[local7 - 1][local49 + 1] = local186;
			}
			if (local7 < 103 && local49 < 103 && Static134.anIntArrayArray30[local7 + 1][local49 + 1] == 0 && (local72[local7 + 1][local49 + 1] & 0x12C01E0) == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static163.anIntArray56[local58] = local7 + 1;
				Static20.anIntArray42[local58] = local49 + 1;
				local58 = (local58 + 1) % local67;
				Static134.anIntArrayArray30[local7 + 1][local49 + 1] = 12;
				Static85.anIntArrayArray18[local7 + 1][local49 + 1] = local186;
			}
		}
		Static76.anInt1563 = 0;
		@Pc(818) int local818;
		@Pc(823) int local823;
		@Pc(830) int local830;
		if (!local64) {
			if (!arg7) {
				return false;
			}
			local186 = 1000;
			local818 = 100;
			for (local823 = arg2 - 10; local823 <= arg2 + 10; local823++) {
				for (local830 = arg8 - 10; local830 <= arg8 + 10; local830++) {
					if (local823 >= 0 && local830 >= 0 && local823 < 104 && local830 < 104 && Static85.anIntArrayArray18[local823][local830] < 100) {
						@Pc(863) int local863 = 0;
						@Pc(865) int local865 = 0;
						if (arg2 > local823) {
							local865 = arg2 - local823;
						} else if (arg0 + arg2 - 1 < local823) {
							local865 = local823 + 1 - arg2 - arg0;
						}
						if (local830 < arg8) {
							local863 = arg8 - local830;
						} else if (local830 > arg1 + arg8 - 1) {
							local863 = local830 + 1 - arg8 - arg1;
						}
						@Pc(932) int local932 = local863 * local863 + local865 * local865;
						if (local186 > local932 || local932 == local186 && Static85.anIntArrayArray18[local823][local830] < local818) {
							local186 = local932;
							local49 = local830;
							local818 = Static85.anIntArrayArray18[local823][local830];
							local7 = local823;
						}
					}
				}
			}
			if (local186 == 1000) {
				return false;
			}
			if (arg6 == local7 && local49 == arg5) {
				return false;
			}
			Static76.anInt1563 = 1;
		}
		@Pc(1009) byte local1009 = 0;
		Static163.anIntArray56[0] = local7;
		local62 = local1009 + 1;
		Static20.anIntArray42[0] = local49;
		local186 = local818 = Static134.anIntArrayArray30[local7][local49];
		while (local7 != arg6 || local49 != arg5) {
			if (local818 != local186) {
				local818 = local186;
				Static163.anIntArray56[local62] = local7;
				Static20.anIntArray42[local62++] = local49;
			}
			if ((local186 & 0x2) != 0) {
				local7++;
			} else if ((local186 & 0x8) != 0) {
				local7--;
			}
			if ((local186 & 0x1) != 0) {
				local49++;
			} else if ((local186 & 0x4) != 0) {
				local49--;
			}
			local186 = Static134.anIntArrayArray30[local7][local49];
		}
		if (local62 > 0) {
			local67 = local62;
			if (local62 > 25) {
				local67 = 25;
			}
			local62--;
			@Pc(1098) int local1098 = Static163.anIntArray56[local62];
			local823 = Static20.anIntArray42[local62];
			if (arg4 == 0) {
				Static176.aClass2_Sub13_Sub1_14.method2976(146);
				Static176.aClass2_Sub13_Sub1_14.method2932(local67 + local67 + 3);
			}
			if (arg4 == 1) {
				Static176.aClass2_Sub13_Sub1_14.method2976(96);
				Static176.aClass2_Sub13_Sub1_14.method2932(local67 + local67 + 14 + 3);
			}
			if (arg4 == 2) {
				Static176.aClass2_Sub13_Sub1_14.method2976(175);
				Static176.aClass2_Sub13_Sub1_14.method2932(local67 + local67 + 3);
			}
			Static86.anInt3522 = Static20.anIntArray42[0];
			Static37.anInt934 = Static163.anIntArray56[0];
			for (local830 = 1; local830 < local67; local830++) {
				local62--;
				Static176.aClass2_Sub13_Sub1_14.method2932(Static163.anIntArray56[local62] - local1098);
				Static176.aClass2_Sub13_Sub1_14.method2932(Static20.anIntArray42[local62] - local823);
			}
			Static176.aClass2_Sub13_Sub1_14.method2916(Static68.aBooleanArray10[82] ? 1 : 0);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static49.anInt1133 + local1098);
			Static176.aClass2_Sub13_Sub1_14.method2938(local823 + Static38.anInt944);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lclient!cg;")
	public static Class2_Sub2_Sub5 method906(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub5 local6 = (Class2_Sub2_Sub5) Static168.aClass74_89.method2345((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static134.aClass11_105.method2049(arg0, 4);
		local6 = new Class2_Sub2_Sub5();
		if (local20 != null) {
			local6.method479(arg0, new Class2_Sub13(local20));
		}
		Static168.aClass74_89.method2341((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method907() {
		aClass49_586 = null;
		aClass57_3 = null;
		aClass49_588 = null;
		aClass49_587 = null;
		aClass49_589 = null;
		aClass16_3 = null;
		aClass11_47 = null;
		aClass49_584 = null;
		aClass49_590 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public static int method908() {
		@Pc(3) int local3 = 3;
		if (Static66.anInt1389 < 310) {
			@Pc(19) int local19 = Static35.anInt894 >> 7;
			@Pc(23) int local23 = Static101.anInt2150 >> 7;
			if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][local19][local23] & 0x4) != 0) {
				local3 = Static66.anInt1396;
			}
			@Pc(43) int local43 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7;
			@Pc(48) int local48 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7;
			@Pc(59) int local59;
			if (local19 >= local43) {
				local59 = local19 - local43;
			} else {
				local59 = local43 - local19;
			}
			@Pc(73) int local73;
			if (local48 <= local23) {
				local73 = local23 - local48;
			} else {
				local73 = local48 - local23;
			}
			@Pc(89) int local89;
			@Pc(91) int local91;
			if (local59 <= local73) {
				local89 = local59 * 65536 / local73;
				local91 = 32768;
				while (local23 != local48) {
					if (local48 > local23) {
						local23++;
					} else if (local23 > local48) {
						local23--;
					}
					if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][local19][local23] & 0x4) != 0) {
						local3 = Static66.anInt1396;
					}
					local91 += local89;
					if (local91 >= 65536) {
						if (local19 < local43) {
							local19++;
						} else if (local43 < local19) {
							local19--;
						}
						if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][local19][local23] & 0x4) != 0) {
							local3 = Static66.anInt1396;
						}
						local91 -= 65536;
					}
				}
			} else {
				local89 = local73 * 65536 / local59;
				local91 = 32768;
				while (local43 != local19) {
					if (local19 < local43) {
						local19++;
					} else if (local43 < local19) {
						local19--;
					}
					if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][local19][local23] & 0x4) != 0) {
						local3 = Static66.anInt1396;
					}
					local91 += local89;
					if (local91 >= 65536) {
						if (local48 > local23) {
							local23++;
						} else if (local23 > local48) {
							local23--;
						}
						if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][local19][local23] & 0x4) != 0) {
							local3 = Static66.anInt1396;
						}
						local91 -= 65536;
					}
				}
			}
		}
		if ((Static81.aByteArrayArrayArray2[Static66.anInt1396][Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7][Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7] & 0x4) != 0) {
			local3 = Static66.anInt1396;
		}
		return local3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!vg;IB)V")
	public static void method909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) int arg3) {
		Static167.method2773();
		Static10.method1856(arg1, arg3, arg1 + arg2.anInt3858, arg2.anInt3867 + arg3);
		if (Static36.anInt924 == 2 || Static36.anInt924 == 5) {
			Static10.method1862(arg1, arg3, arg2.anIntArray348, arg2.anIntArray354);
		} else {
			@Pc(41) int local41 = Static43.anInt1034 + Static63.anInt1356 & 0x7FF;
			@Pc(49) int local49 = 464 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
			@Pc(57) int local57 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32 + 48;
			Static120.aClass2_Sub2_Sub2_Sub3_5.method1526(arg1, arg3, arg2.anInt3858, arg2.anInt3867, local57, local49, local41, Static128.anInt2774 + 256, arg2.anIntArray348, arg2.anIntArray354);
			@Pc(107) int local107;
			@Pc(93) int local93;
			for (@Pc(77) int local77 = 0; local77 < Static145.anInt3085; local77++) {
				local93 = Static7.anIntArray9[local77] * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
				local107 = Static91.anIntArray194[local77] * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
				Static75.method1223(local107, arg1, local93, arg3, Static105.aClass2_Sub2_Sub2_Sub3Array4[local77], arg2);
			}
			@Pc(155) int local155;
			@Pc(167) int local167;
			for (local107 = 0; local107 < 104; local107++) {
				for (local93 = 0; local93 < 104; local93++) {
					@Pc(141) Class81 local141 = Static177.aClass81ArrayArrayArray1[Static66.anInt1396][local107][local93];
					if (local141 != null) {
						local155 = local107 * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
						local167 = local93 * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
						Static75.method1223(local155, arg1, local167, arg3, Static13.aClass2_Sub2_Sub2_Sub3Array1[0], arg2);
					}
				}
			}
			@Pc(243) int local243;
			for (local93 = 0; local93 < Static1.anInt2; local93++) {
				@Pc(195) Class2_Sub2_Sub3_Sub7_Sub1 local195 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static1.anIntArray1[local93]];
				if (local195 != null && local195.method2733()) {
					@Pc(204) Class2_Sub2_Sub15 local204 = local195.aClass2_Sub2_Sub15_1;
					if (local204 != null && local204.anIntArray288 != null) {
						local204 = local204.method2469();
					}
					if (local204 != null && local204.aBoolean135 && local204.aBoolean137) {
						local167 = local195.anInt3529 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
						local243 = local195.anInt3578 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
						Static75.method1223(local167, arg1, local243, arg3, Static13.aClass2_Sub2_Sub2_Sub3Array1[1], arg2);
					}
				}
			}
			@Pc(271) Class2_Sub2_Sub3_Sub7_Sub2 local271;
			for (@Pc(263) int local263 = 0; local263 < Static139.anInt2969; local263++) {
				local271 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local263]];
				if (local271 != null && local271.method2733()) {
					local167 = local271.anInt3529 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
					local243 = local271.anInt3578 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
					@Pc(300) boolean local300 = false;
					@Pc(305) long local305 = local271.aClass49_1606.method1651();
					for (@Pc(307) int local307 = 0; local307 < Static175.anInt3799; local307++) {
						if (Static96.aLongArray12[local307] == local305 && Static85.anIntArray188[local307] != 0) {
							local300 = true;
							break;
						}
					}
					@Pc(337) boolean local337 = false;
					if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3592 != 0 && local271.anInt3592 != 0 && Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3592 == local271.anInt3592) {
						local337 = true;
					}
					if (local300) {
						Static75.method1223(local167, arg1, local243, arg3, Static13.aClass2_Sub2_Sub2_Sub3Array1[3], arg2);
					} else if (local337) {
						Static75.method1223(local167, arg1, local243, arg3, Static13.aClass2_Sub2_Sub2_Sub3Array1[4], arg2);
					} else {
						Static75.method1223(local167, arg1, local243, arg3, Static13.aClass2_Sub2_Sub2_Sub3Array1[2], arg2);
					}
				}
			}
			if (Static70.anInt1438 != 0 && Static127.anInt2757 % 20 < 10) {
				if (Static70.anInt1438 == 1 && Static23.anInt509 >= 0 && Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1.length > Static23.anInt509) {
					@Pc(418) Class2_Sub2_Sub3_Sub7_Sub1 local418 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static23.anInt509];
					if (local418 != null) {
						local167 = local418.anInt3529 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
						local243 = local418.anInt3578 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
						Static73.method1209(local167, arg2, arg1, Static85.aClass2_Sub2_Sub2_Sub3Array3[1], arg3, local243);
					}
				}
				if (Static70.anInt1438 == 2) {
					local167 = (Static171.anInt3745 - Static38.anInt944) * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
					local155 = (Static124.anInt2747 - Static49.anInt1133) * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
					Static73.method1209(local155, arg2, arg1, Static85.aClass2_Sub2_Sub2_Sub3Array3[1], arg3, local167);
				}
				if (Static70.anInt1438 == 10 && Static93.anInt1969 >= 0 && Static93.anInt1969 < Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1.length) {
					local271 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static93.anInt1969];
					if (local271 != null) {
						local243 = local271.anInt3578 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
						local167 = local271.anInt3529 / 32 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
						Static73.method1209(local167, arg2, arg1, Static85.aClass2_Sub2_Sub2_Sub3Array3[1], arg3, local243);
					}
				}
			}
			if (Static37.anInt934 != 0) {
				local167 = Static86.anInt3522 * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 / 32;
				local155 = Static37.anInt934 * 4 + 2 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 / 32;
				Static75.method1223(local155, arg1, local167, arg3, Static85.aClass2_Sub2_Sub2_Sub3Array3[0], arg2);
			}
			Static10.method1861(arg2.anInt3858 / 2 + arg1 - 1, arg2.anInt3867 / 2 + arg3 + -1, 3, 3, 16777215);
		}
		Static164.aBooleanArray17[arg0] = true;
	}
}
