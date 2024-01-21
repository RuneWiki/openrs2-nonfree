import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!k", name = "M", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!a;")
	private static Class1 aClass1_1772 = Static94.method1596(" has logged out)3");

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_1771 = aClass1_1772;

	@OriginalMember(owner = "client!k", name = "J", descriptor = "[I")
	public static int[] anIntArray179 = new int[50];

	@OriginalMember(owner = "client!k", name = "R", descriptor = "Lclient!a;")
	private static Class1 aClass1_1778 = Static94.method1596("Attack");

	@OriginalMember(owner = "client!k", name = "K", descriptor = "Lclient!a;")
	public static Class1 aClass1_1773 = aClass1_1778;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "Lclient!a;")
	public static Class1 aClass1_1774 = null;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!a;")
	private static Class1 aClass1_1775 = Static94.method1596("Loaded sprites");

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Lclient!a;")
	public static Class1 aClass1_1776 = Static94.method1596("b12_full");

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Lclient!a;")
	public static Class1 aClass1_1777 = aClass1_1775;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
	public static int anInt1728 = 0;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public static void method1185() {
		if (Static5.anInt403 == 0) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (Static95.anInt2397 != 0) {
			local13 = 1;
		}
		for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
			if (Static67.aClass1Array29[local19] != null) {
				@Pc(29) int local29 = Static111.anIntArray351[local19];
				@Pc(33) Class1 local33 = Static107.aClass1Array28[local19];
				if (local33 != null && local33.method26(Static85.aClass1_2374)) {
					local33 = local33.method1(5);
				}
				if (local33 != null && local33.method26(Static83.aClass1_2344)) {
					local33 = local33.method1(5);
				}
				if ((local29 == 3 || local29 == 7) && (local29 == 7 || Static6.anInt409 == 0 || Static6.anInt409 == 1 && Static11.method410(local33))) {
					@Pc(93) int local93 = 329 - local13 * 13;
					local13++;
					if (Static22.anInt930 > 4 && local93 - 10 < Static84.anInt2248 + -4 && Static84.anInt2248 - 4 <= local93 + 3) {
						@Pc(150) int local150 = Static88.aClass2_Sub1_Sub2_Sub1_1.method370(Static97.method1655(new Class1[] { Static41.aClass1_1380, Static21.aClass1_845, local33, Static67.aClass1Array29[local19] })) + 25;
						if (local150 > 450) {
							local150 = 450;
						}
						if (Static22.anInt930 < local150 + 4) {
							if (Static32.anInt1240 >= 1) {
								Static29.method758(0, Static33.aClass1_1229, 0, 0, 2028, Static97.method1655(new Class1[] { Static47.aClass1_1511, local33 }));
							}
							Static29.method758(0, Static66.aClass1_2453, 0, 0, 2051, Static97.method1655(new Class1[] { Static47.aClass1_1511, local33 }));
							Static29.method758(0, Static46.aClass1_1502, 0, 0, 2045, Static97.method1655(new Class1[] { Static47.aClass1_1511, local33 }));
						}
					}
					if (local13 >= 5) {
						return;
					}
				}
				if ((local29 == 5 || local29 == 6) && Static6.anInt409 < 2) {
					local13++;
					if (local13 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!lc;IZB)Z")
	public static boolean method1186(@OriginalArg(0) Class34 arg0, @OriginalArg(2) boolean arg1) {
		return Static68.method1348(arg0, arg1);
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
	public static void method1187() {
		if (Static103.anInt2617 != 1) {
			return;
		}
		if (Static93.anInt2360 >= 539 && Static93.anInt2360 <= 573 && Static1.anInt13 >= 169 && Static1.anInt13 < 205 && Static80.anIntArray274[0] != -1) {
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
			Static8.anInt514 = 0;
		}
		if (Static93.anInt2360 >= 569 && Static93.anInt2360 <= 599 && Static1.anInt13 >= 168 && Static1.anInt13 < 205 && Static80.anIntArray274[1] != -1) {
			Static8.anInt514 = 1;
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
		}
		if (Static93.anInt2360 >= 597 && Static93.anInt2360 <= 627 && Static1.anInt13 >= 168 && Static1.anInt13 < 205 && Static80.anIntArray274[2] != -1) {
			Static79.aBoolean115 = true;
			Static8.anInt514 = 2;
			Static34.aBoolean60 = true;
		}
		if (Static93.anInt2360 >= 625 && Static93.anInt2360 <= 669 && Static1.anInt13 >= 168 && Static1.anInt13 < 203 && Static80.anIntArray274[3] != -1) {
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
			Static8.anInt514 = 3;
		}
		if (Static93.anInt2360 >= 666 && Static93.anInt2360 <= 696 && Static1.anInt13 >= 168 && Static1.anInt13 < 205 && Static80.anIntArray274[4] != -1) {
			Static8.anInt514 = 4;
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
		}
		if (Static93.anInt2360 >= 694 && Static93.anInt2360 <= 724 && Static1.anInt13 >= 168 && Static1.anInt13 < 205 && Static80.anIntArray274[5] != -1) {
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
			Static8.anInt514 = 5;
		}
		if (Static93.anInt2360 >= 722 && Static93.anInt2360 <= 756 && Static1.anInt13 >= 169 && Static1.anInt13 < 205 && Static80.anIntArray274[6] != -1) {
			Static34.aBoolean60 = true;
			Static8.anInt514 = 6;
			Static79.aBoolean115 = true;
		}
		if (Static93.anInt2360 >= 540 && Static93.anInt2360 <= 574 && Static1.anInt13 >= 466 && Static1.anInt13 < 502 && Static80.anIntArray274[7] != -1) {
			Static8.anInt514 = 7;
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
		}
		if (Static93.anInt2360 >= 572 && Static93.anInt2360 <= 602 && Static1.anInt13 >= 466 && Static1.anInt13 < 503 && Static80.anIntArray274[8] != -1) {
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
			Static8.anInt514 = 8;
		}
		if (Static93.anInt2360 >= 599 && Static93.anInt2360 <= 629 && Static1.anInt13 >= 466 && Static1.anInt13 < 503 && Static80.anIntArray274[9] != -1) {
			Static79.aBoolean115 = true;
			Static8.anInt514 = 9;
			Static34.aBoolean60 = true;
		}
		if (Static93.anInt2360 >= 627 && Static93.anInt2360 <= 671 && Static1.anInt13 >= 467 && Static1.anInt13 < 502 && Static80.anIntArray274[10] != -1) {
			Static8.anInt514 = 10;
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
		}
		if (Static93.anInt2360 >= 669 && Static93.anInt2360 <= 699 && Static1.anInt13 >= 466 && Static1.anInt13 < 503 && Static80.anIntArray274[11] != -1) {
			Static8.anInt514 = 11;
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
		}
		if (Static93.anInt2360 >= 696 && Static93.anInt2360 <= 726 && Static1.anInt13 >= 466 && Static1.anInt13 < 503 && Static80.anIntArray274[12] != -1) {
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
			Static8.anInt514 = 12;
		}
		if (Static93.anInt2360 >= 724 && Static93.anInt2360 <= 758 && Static1.anInt13 >= 466 && Static1.anInt13 < 502 && Static80.anIntArray274[13] != -1) {
			Static8.anInt514 = 13;
			Static34.aBoolean60 = true;
			Static79.aBoolean115 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIBIZIIIII)Z")
	public static boolean method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static93.anIntArrayArray21[local7][local11] = 0;
				Static84.anIntArrayArray20[local7][local11] = 99999999;
			}
		}
		Static93.anIntArrayArray21[arg2][arg8] = 99;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = arg8;
		@Pc(47) boolean local47 = false;
		@Pc(49) int local49 = 0;
		Static84.anIntArrayArray20[arg2][arg8] = 0;
		local11 = arg2;
		Static45.anIntArray157[0] = arg2;
		@Pc(69) int local69 = local43 + 1;
		Static15.anIntArray67[0] = arg8;
		@Pc(74) int local74 = Static45.anIntArray157.length;
		@Pc(79) int[][] local79 = Static84.aClass5Array1[Static2.anInt287].anIntArrayArray3;
		@Pc(194) int local194;
		while (local69 != local49) {
			local45 = Static15.anIntArray67[local49];
			local11 = Static45.anIntArray157[local49];
			local49 = (local49 + 1) % local74;
			if (arg3 == local11 && arg9 == local45) {
				local47 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && Static84.aClass5Array1[Static2.anInt287].method207(local11, arg4 - 1, arg9, local45, arg6, arg3)) {
					local47 = true;
					break;
				}
				if (arg4 < 10 && Static84.aClass5Array1[Static2.anInt287].method210(arg9, arg6, local45, arg3, local11, arg4 - 1)) {
					local47 = true;
					break;
				}
			}
			if (arg0 != 0 && arg7 != 0 && Static84.aClass5Array1[Static2.anInt287].method205(arg7, arg3, arg0, arg9, arg1, local45, local11)) {
				local47 = true;
				break;
			}
			local194 = Static84.anIntArrayArray20[local11][local45] + 1;
			if (local11 > 0 && Static93.anIntArrayArray21[local11 - 1][local45] == 0 && (local79[local11 - 1][local45] & 0x1280108) == 0) {
				Static45.anIntArray157[local69] = local11 - 1;
				Static15.anIntArray67[local69] = local45;
				local69 = (local69 + 1) % local74;
				Static93.anIntArrayArray21[local11 - 1][local45] = 2;
				Static84.anIntArrayArray20[local11 - 1][local45] = local194;
			}
			if (local11 < 103 && Static93.anIntArrayArray21[local11 + 1][local45] == 0 && (local79[local11 + 1][local45] & 0x1280180) == 0) {
				Static45.anIntArray157[local69] = local11 + 1;
				Static15.anIntArray67[local69] = local45;
				local69 = (local69 + 1) % local74;
				Static93.anIntArrayArray21[local11 + 1][local45] = 8;
				Static84.anIntArrayArray20[local11 + 1][local45] = local194;
			}
			if (local45 > 0 && Static93.anIntArrayArray21[local11][local45 - 1] == 0 && (local79[local11][local45 - 1] & 0x1280102) == 0) {
				Static45.anIntArray157[local69] = local11;
				Static15.anIntArray67[local69] = local45 - 1;
				Static93.anIntArrayArray21[local11][local45 - 1] = 1;
				local69 = (local69 + 1) % local74;
				Static84.anIntArrayArray20[local11][local45 - 1] = local194;
			}
			if (local45 < 103 && Static93.anIntArrayArray21[local11][local45 + 1] == 0 && (local79[local11][local45 + 1] & 0x1280120) == 0) {
				Static45.anIntArray157[local69] = local11;
				Static15.anIntArray67[local69] = local45 + 1;
				Static93.anIntArrayArray21[local11][local45 + 1] = 4;
				Static84.anIntArrayArray20[local11][local45 + 1] = local194;
				local69 = (local69 + 1) % local74;
			}
			if (local11 > 0 && local45 > 0 && Static93.anIntArrayArray21[local11 - 1][local45 - 1] == 0 && (local79[local11 - 1][local45 - 1] & 0x128010E) == 0 && (local79[local11 - 1][local45] & 0x1280108) == 0 && (local79[local11][local45 - 1] & 0x1280102) == 0) {
				Static45.anIntArray157[local69] = local11 - 1;
				Static15.anIntArray67[local69] = local45 - 1;
				local69 = (local69 + 1) % local74;
				Static93.anIntArrayArray21[local11 - 1][local45 - 1] = 3;
				Static84.anIntArrayArray20[local11 - 1][local45 - 1] = local194;
			}
			if (local11 < 103 && local45 > 0 && Static93.anIntArrayArray21[local11 + 1][local45 - 1] == 0 && (local79[local11 + 1][local45 - 1] & 0x1280183) == 0 && (local79[local11 + 1][local45] & 0x1280180) == 0 && (local79[local11][local45 - 1] & 0x1280102) == 0) {
				Static45.anIntArray157[local69] = local11 + 1;
				Static15.anIntArray67[local69] = local45 - 1;
				local69 = (local69 + 1) % local74;
				Static93.anIntArrayArray21[local11 + 1][local45 - 1] = 9;
				Static84.anIntArrayArray20[local11 + 1][local45 - 1] = local194;
			}
			if (local11 > 0 && local45 < 103 && Static93.anIntArrayArray21[local11 - 1][local45 + 1] == 0 && (local79[local11 - 1][local45 + 1] & 0x1280138) == 0 && (local79[local11 - 1][local45] & 0x1280108) == 0 && (local79[local11][local45 + 1] & 0x1280120) == 0) {
				Static45.anIntArray157[local69] = local11 - 1;
				Static15.anIntArray67[local69] = local45 + 1;
				Static93.anIntArrayArray21[local11 - 1][local45 + 1] = 6;
				Static84.anIntArrayArray20[local11 - 1][local45 + 1] = local194;
				local69 = (local69 + 1) % local74;
			}
			if (local11 < 103 && local45 < 103 && Static93.anIntArrayArray21[local11 + 1][local45 + 1] == 0 && (local79[local11 + 1][local45 + 1] & 0x12801E0) == 0 && (local79[local11 + 1][local45] & 0x1280180) == 0 && (local79[local11][local45 + 1] & 0x1280120) == 0) {
				Static45.anIntArray157[local69] = local11 + 1;
				Static15.anIntArray67[local69] = local45 + 1;
				local69 = (local69 + 1) % local74;
				Static93.anIntArrayArray21[local11 + 1][local45 + 1] = 12;
				Static84.anIntArrayArray20[local11 + 1][local45 + 1] = local194;
			}
		}
		Static95.anInt2395 = 0;
		@Pc(825) int local825;
		@Pc(830) int local830;
		@Pc(837) int local837;
		if (!local47) {
			if (!arg5) {
				return false;
			}
			local194 = 1000;
			local825 = 100;
			for (local830 = arg3 - 10; local830 <= arg3 + 10; local830++) {
				for (local837 = arg9 - 10; local837 <= arg9 + 10; local837++) {
					if (local830 >= 0 && local837 >= 0 && local830 < 104 && local837 < 104 && Static84.anIntArrayArray20[local830][local837] < 100) {
						@Pc(864) int local864 = 0;
						@Pc(866) int local866 = 0;
						if (local837 < arg9) {
							local864 = arg9 - local837;
						} else if (local837 > arg9 + arg7 - 1) {
							local864 = local837 + 1 - arg7 - arg9;
						}
						if (local830 < arg3) {
							local866 = arg3 - local830;
						} else if (arg0 + arg3 - 1 < local830) {
							local866 = local830 + 1 - arg0 - arg3;
						}
						@Pc(928) int local928 = local864 * local864 + local866 * local866;
						if (local194 > local928 || local194 == local928 && Static84.anIntArrayArray20[local830][local837] < local825) {
							local45 = local837;
							local194 = local928;
							local11 = local830;
							local825 = Static84.anIntArrayArray20[local830][local837];
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (local11 == arg2 && local45 == arg8) {
				return false;
			}
			Static95.anInt2395 = 1;
		}
		@Pc(1003) byte local1003 = 0;
		Static45.anIntArray157[0] = local11;
		local49 = local1003 + 1;
		Static15.anIntArray67[0] = local45;
		local194 = local825 = Static93.anIntArrayArray21[local11][local45];
		while (local11 != arg2 || arg8 != local45) {
			if (local194 != local825) {
				local825 = local194;
				Static45.anIntArray157[local49] = local11;
				Static15.anIntArray67[local49++] = local45;
			}
			if ((local194 & 0x1) != 0) {
				local45++;
			} else if ((local194 & 0x4) != 0) {
				local45--;
			}
			if ((local194 & 0x2) != 0) {
				local11++;
			} else if ((local194 & 0x8) != 0) {
				local11--;
			}
			local194 = Static93.anIntArrayArray21[local11][local45];
		}
		if (local49 > 0) {
			local74 = local49;
			if (local49 > 25) {
				local74 = 25;
			}
			local49--;
			local830 = Static15.anIntArray67[local49];
			@Pc(1101) int local1101 = Static45.anIntArray157[local49];
			if (arg10 == 0) {
				Static59.aClass2_Sub3_Sub1_2.method841(73);
				Static59.aClass2_Sub3_Sub1_2.method788(local74 + local74 + 3);
			}
			if (arg10 == 1) {
				Static59.aClass2_Sub3_Sub1_2.method841(236);
				Static59.aClass2_Sub3_Sub1_2.method788(local74 + local74 + 14 + 3);
			}
			if (arg10 == 2) {
				Static59.aClass2_Sub3_Sub1_2.method841(89);
				Static59.aClass2_Sub3_Sub1_2.method788(local74 + local74 + 3);
			}
			Static59.aClass2_Sub3_Sub1_2.method809(local830 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method819(Static51.aBooleanArray12[82] ? 1 : 0);
			Static59.aClass2_Sub3_Sub1_2.method809(Static25.anInt1022 + local1101);
			Static30.anInt1133 = Static45.anIntArray157[0];
			Static90.anInt2337 = Static15.anIntArray67[0];
			for (local837 = 1; local837 < local74; local837++) {
				local49--;
				Static59.aClass2_Sub3_Sub1_2.method812(Static45.anIntArray157[local49] - local1101);
				Static59.aClass2_Sub3_Sub1_2.method819(Static15.anIntArray67[local49] - local830);
			}
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public static void method1189() {
		aClass1_1772 = null;
		anIntArray179 = null;
		aClass1_1775 = null;
		aClass1_1774 = null;
		aClass1_1773 = null;
		Class29_Sub1.anIntArray178 = null;
		aClass2_Sub1_Sub2_Sub2_16 = null;
		aClass1_1771 = null;
		aClass1_1777 = null;
		aClass1_1778 = null;
		aClass1_1776 = null;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
	public static void method1190() {
		if (Static2.anInt299 == 2) {
			Static33.method861(Static37.anInt1350 * 2, Static63.anInt1887 + (Static6.anInt406 - Static47.anInt1563 << 7), (Static113.anInt2243 + -Static25.anInt1022 << 7) - -Static84.anInt2249);
			if (Static34.anInt1275 > -1 && Static69.anInt2806 % 20 < 10) {
				Static64.aClass2_Sub1_Sub2_Sub4Array10[0].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -28);
			}
		}
	}
}
