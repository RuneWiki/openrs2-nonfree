import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!jh;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[Lclient!pg;")
	public static Class64[] aClass64Array7;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!jd;")
	public static Class61 aClass61_72 = new Class61(200);

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII)V")
	public static void method3041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static23.method417(arg0);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg0;
		@Pc(17) int local17 = arg0 - arg5;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(27) int local27 = -arg0;
		@Pc(30) int local30 = -local17;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = local17;
		@Pc(36) int local36 = -1;
		@Pc(40) int local40 = local17 + arg3;
		@Pc(45) int local45 = arg3 - local17;
		@Pc(49) int[] local49 = Static231.anIntArrayArray44[arg4];
		Static162.method2605(local49, arg3 - arg0, arg2, local45);
		Static162.method2605(local49, local45, arg1, local40);
		Static162.method2605(local49, local40, arg2, arg0 + arg3);
		while (local10 < local12) {
			local32 += 2;
			local36 += 2;
			local27 += local36;
			local30 += local32;
			if (local30 >= 0 && local34 >= 1) {
				Static92.anIntArray204[local34] = local10;
				local34--;
				local30 -= local34 << 1;
			}
			local10++;
			@Pc(133) int[] local133;
			@Pc(127) int[] local127;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(150) int local150;
			@Pc(145) int local145;
			@Pc(155) int local155;
			if (local27 >= 0) {
				local12--;
				local27 -= local12 << 1;
				if (local12 < local17) {
					local127 = Static231.anIntArrayArray44[arg4 - local12];
					local133 = Static231.anIntArrayArray44[arg4 + local12];
					local137 = Static92.anIntArray204[local12];
					local141 = local10 + arg3;
					local145 = local137 + arg3;
					local150 = arg3 - local10;
					local155 = arg3 - local137;
					Static162.method2605(local133, local150, arg2, local155);
					Static162.method2605(local133, local155, arg1, local145);
					Static162.method2605(local133, local145, arg2, local141);
					Static162.method2605(local127, local150, arg2, local155);
					Static162.method2605(local127, local155, arg1, local145);
					Static162.method2605(local127, local145, arg2, local141);
				} else {
					local127 = Static231.anIntArrayArray44[arg4 - local12];
					local133 = Static231.anIntArrayArray44[local12 + arg4];
					local137 = local10 + arg3;
					local141 = arg3 - local10;
					Static162.method2605(local133, local141, arg2, local137);
					Static162.method2605(local127, local141, arg2, local137);
				}
			}
			local133 = Static231.anIntArrayArray44[local10 + arg4];
			local137 = local12 + arg3;
			local127 = Static231.anIntArrayArray44[arg4 - local10];
			local141 = arg3 - local12;
			if (local10 >= local17) {
				Static162.method2605(local133, local141, arg2, local137);
				Static162.method2605(local127, local141, arg2, local137);
			} else {
				local150 = local34 >= local10 ? local34 : Static92.anIntArray204[local10];
				local155 = arg3 - local150;
				local145 = arg3 + local150;
				Static162.method2605(local133, local141, arg2, local155);
				Static162.method2605(local133, local155, arg1, local145);
				Static162.method2605(local133, local145, arg2, local137);
				Static162.method2605(local127, local141, arg2, local155);
				Static162.method2605(local127, local155, arg1, local145);
				Static162.method2605(local127, local145, arg2, local137);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIZLclient!o;)V")
	public static void method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class86 arg3) {
		Static30.method587();
		Static205.method3251(arg2, arg1, arg3.anInt3280 + arg2, arg1 + arg3.anInt3270);
		if (Static25.anInt490 == 2 || Static25.anInt490 == 5 || Static218.aClass1_Sub2_Sub2_98 == null) {
			Static205.method3247(arg2, arg1, arg3.anIntArray280, arg3.anIntArray283);
		} else {
			@Pc(46) int local46 = 464 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
			@Pc(52) int local52 = Static123.anInt2690 + Static79.anInt1741 & 0x7FF;
			@Pc(60) int local60 = Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32 + 48;
			((Class1_Sub2_Sub2_Sub1) Static218.aClass1_Sub2_Sub2_98).method197(arg2, arg1, arg3.anInt3280, arg3.anInt3270, local60, local46, local52, Static174.anInt3796 + 256, arg3.anIntArray280, arg3.anIntArray283);
			@Pc(127) int local127;
			@Pc(107) int local107;
			@Pc(111) int local111;
			@Pc(131) int local131;
			@Pc(175) int local175;
			@Pc(193) int local193;
			@Pc(183) int local183;
			@Pc(229) int local229;
			if (Static59.aClass119_1 != null) {
				for (@Pc(83) int local83 = 0; local83 < Static59.aClass119_1.anInt4555; local83++) {
					if (Static59.aClass119_1.method3411(local83)) {
						local107 = (Static59.aClass119_1.aShortArray51[local83] - Static152.anInt3377) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
						local111 = Class45.anIntArray159[local52];
						local127 = (Static59.aClass119_1.aShortArray52[local83] - Static36.anInt764) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
						local131 = Class45.anIntArray156[local52];
						@Pc(133) Class1_Sub2_Sub15 local133 = Static64.aClass1_Sub2_Sub15_2;
						@Pc(141) int local141 = local131 * 256 / (Static174.anInt3796 + 256);
						@Pc(149) int local149 = local111 * 256 / (Static174.anInt3796 + 256);
						if (Static59.aClass119_1.method3412(local83) == 1) {
							local133 = Static23.aClass1_Sub2_Sub15_1;
						}
						if (Static59.aClass119_1.method3412(local83) == 2) {
							local133 = Static175.aClass1_Sub2_Sub15_3;
						}
						local175 = local149 * local107 + local127 * local141 >> 16;
						local183 = local133.method3349(Static59.aClass119_1.aClass107Array29[local83], 100);
						local193 = local107 * local141 - local127 * local149 >> 16;
						@Pc(199) int local199 = local175 - local183 / 2;
						if (local199 >= -arg3.anInt3280 && local199 <= arg3.anInt3280 && -arg3.anInt3270 <= local193 && local193 <= arg3.anInt3270) {
							local229 = 16777215;
							if (Static59.aClass119_1.anIntArray367[local83] != -1) {
								local229 = Static59.aClass119_1.anIntArray367[local83];
							}
							Static205.method3254(arg3.anIntArray280, arg3.anIntArray283);
							local133.method3336(Static59.aClass119_1.aClass107Array29[local83], arg3.anInt3280 / 2 + arg2 + local199, arg1 - -(arg3.anInt3270 / 2) - local193, local183, 50, local229, 0, 1, 0, 0);
							Static205.method3248();
						}
					}
				}
			}
			for (local127 = 0; local127 < Static86.anInt1908; local127++) {
				local107 = Static73.anIntArray154[local127] * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
				local111 = Static8.anIntArray19[local127] * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
				@Pc(324) Class101 local324 = Static170.method2725(Static125.anIntArray243[local127]);
				if (local324.anIntArray338 != null) {
					local324 = local324.method2851();
					if (local324 == null || local324.anInt3917 == -1) {
						continue;
					}
				}
				Static200.method2573(arg1, Static23.aClass1_Sub2_Sub2Array3[local324.anInt3917], local107, local111, arg3, arg2);
			}
			for (local107 = 0; local107 < 104; local107++) {
				for (local111 = 0; local111 < 104; local111++) {
					@Pc(370) Class120 local370 = Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local107][local111];
					if (local370 != null) {
						local175 = local107 * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
						local193 = local111 * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
						Static200.method2573(arg1, Static77.aClass1_Sub2_Sub2Array5[0], local175, local193, arg3, arg2);
					}
				}
			}
			@Pc(470) int local470;
			for (local111 = 0; local111 < Static189.anInt4168; local111++) {
				@Pc(422) Class5_Sub5_Sub2 local422 = Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local111]];
				if (local422 != null && local422.method2308()) {
					@Pc(431) Class30 local431 = local422.aClass30_1;
					if (local431 != null && local431.anIntArray102 != null) {
						local431 = local431.method870();
					}
					if (local431 != null && local431.aBoolean92 && local431.aBoolean94) {
						local193 = local422.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
						local470 = local422.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
						Static200.method2573(arg1, Static77.aClass1_Sub2_Sub2Array5[1], local193, local470, arg3, arg2);
					}
				}
			}
			for (local131 = 0; local131 < Static10.anInt285; local131++) {
				@Pc(498) Class5_Sub5_Sub1 local498 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local131]];
				if (local498 != null && local498.method2308()) {
					local193 = local498.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
					local470 = local498.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
					@Pc(531) long local531 = local498.aClass107_351.method3066();
					@Pc(533) boolean local533 = false;
					for (@Pc(535) int local535 = 0; local535 < Static231.anInt4994; local535++) {
						if (local531 == Static18.aLongArray1[local535] && Static196.anIntArray351[local535] != 0) {
							local533 = true;
							break;
						}
					}
					@Pc(564) boolean local564 = false;
					if (Static204.aClass5_Sub5_Sub1_2.anInt1287 != 0 && local498.anInt1287 != 0 && local498.anInt1287 == Static204.aClass5_Sub5_Sub1_2.anInt1287) {
						local564 = true;
					}
					if (local533) {
						Static200.method2573(arg1, Static77.aClass1_Sub2_Sub2Array5[3], local193, local470, arg3, arg2);
					} else if (local564) {
						Static200.method2573(arg1, Static77.aClass1_Sub2_Sub2Array5[4], local193, local470, arg3, arg2);
					} else {
						Static200.method2573(arg1, Static77.aClass1_Sub2_Sub2Array5[2], local193, local470, arg3, arg2);
					}
				}
			}
			@Pc(628) Class68[] local628 = Static76.aClass68Array1;
			for (local193 = 0; local193 < local628.length; local193++) {
				@Pc(636) Class68 local636 = local628[local193];
				if (local636 != null && local636.anInt2519 != 0 && Static128.anInt2802 % 20 < 10) {
					@Pc(687) int local687;
					if (local636.anInt2519 == 1 && local636.anInt2515 >= 0 && local636.anInt2515 < Static33.aClass5_Sub5_Sub2Array1.length) {
						@Pc(674) Class5_Sub5_Sub2 local674 = Static33.aClass5_Sub5_Sub2Array1[local636.anInt2515];
						if (local674 != null) {
							local687 = local674.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
							local229 = local674.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
							Static217.method3556(local687, local229, arg3, local636.anInt2508, arg1, arg2);
						}
					}
					if (local636.anInt2519 == 2) {
						local183 = (local636.anInt2514 - Static36.anInt764) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
						local229 = (local636.anInt2506 - Static152.anInt3377) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
						Static217.method3556(local229, local183, arg3, local636.anInt2508, arg1, arg2);
					}
					if (local636.anInt2519 == 10 && local636.anInt2515 >= 0 && local636.anInt2515 < Static198.aClass5_Sub5_Sub1Array1.length) {
						@Pc(772) Class5_Sub5_Sub1 local772 = Static198.aClass5_Sub5_Sub1Array1[local636.anInt2515];
						if (local772 != null) {
							local229 = local772.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
							local687 = local772.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
							Static217.method3556(local687, local229, arg3, local636.anInt2508, arg1, arg2);
						}
					}
				}
			}
			if (Static184.anInt4144 != 0) {
				local470 = Static184.anInt4144 * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
				local183 = Static95.anInt2072 * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
				Static200.method2573(arg1, Static180.aClass1_Sub2_Sub2_104, local470, local183, arg3, arg2);
			}
			Static205.method3250(arg2 + arg3.anInt3280 / 2 - 1, arg3.anInt3270 / 2 + arg1 + -1, 3, 3, 16777215);
		}
		Static175.aBooleanArray24[arg0] = true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	public static void method3043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub19 local13 = Static166.method3214(arg0, 1);
		local13.method3691();
		local13.anInt4916 = arg1;
	}
}
