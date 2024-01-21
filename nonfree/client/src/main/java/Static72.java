import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!kh;")
	public static Class29 aClass29_33;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
	public static int[] anIntArray187 = new int[100];

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	public static int[] anIntArray188 = new int[5];

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public static int anInt1723 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method1223() {
		anIntArray188 = null;
		aClass29_33 = null;
		anIntArray187 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
	public static void method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static155.method2390();
		Static172.method2023(arg1, arg0, Static149.aClass2_Sub1_Sub4_Sub3_7.anInt2635 + arg1, arg0 - -Static149.aClass2_Sub1_Sub4_Sub3_7.anInt2632);
		if (Static111.anInt2519 == 2 || Static111.anInt2519 == 5) {
			Static172.method2020(arg1 + 25, arg0 - -5, Static73.anIntArray189, Static94.anIntArray232);
		} else {
			@Pc(40) int local40 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32 + 48;
			@Pc(46) int local46 = Static45.anInt1123 + Static64.anInt1576 & 0x7FF;
			@Pc(54) int local54 = 464 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
			Static128.aClass2_Sub1_Sub4_Sub2_34.method728(arg1 + 25, arg0 + 5, 146, 151, local40, local54, local46, Static96.anInt3690 + 256, Static73.anIntArray189, Static94.anIntArray232);
			@Pc(90) int local90;
			@Pc(103) int local103;
			for (@Pc(74) int local74 = 0; local74 < Static128.anInt2876; local74++) {
				local90 = Static58.anIntArray167[local74] * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
				local103 = Static156.anIntArray358[local74] * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
				Static96.method2623(local90, local103, Static85.aClass2_Sub1_Sub4_Sub2Array6[local74], arg1, arg0);
			}
			@Pc(146) int local146;
			@Pc(158) int local158;
			for (local90 = 0; local90 < 104; local90++) {
				for (local103 = 0; local103 < 104; local103++) {
					@Pc(132) Class12 local132 = Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local90][local103];
					if (local132 != null) {
						local146 = local90 * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
						local158 = local103 * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
						Static96.method2623(local146, local158, Static96.aClass2_Sub1_Sub4_Sub2Array10[0], arg1, arg0);
					}
				}
			}
			@Pc(234) int local234;
			for (local103 = 0; local103 < Static64.anInt1578; local103++) {
				@Pc(187) Class2_Sub1_Sub3_Sub2_Sub2 local187 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local103]];
				if (local187 != null && local187.method2467()) {
					@Pc(196) Class2_Sub1_Sub2 local196 = local187.aClass2_Sub1_Sub2_1;
					if (local196 != null && local196.anIntArray5 != null) {
						local196 = local196.method57();
					}
					if (local196 != null && local196.aBoolean2 && local196.aBoolean4) {
						local158 = local187.anInt3454 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
						local234 = local187.anInt3499 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
						Static96.method2623(local158, local234, Static96.aClass2_Sub1_Sub4_Sub2Array10[1], arg1, arg0);
					}
				}
			}
			@Pc(257) Class2_Sub1_Sub3_Sub2_Sub1 local257;
			for (@Pc(249) int local249 = 0; local249 < Static54.anInt1354; local249++) {
				local257 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local249]];
				if (local257 != null && local257.method2467()) {
					local158 = local257.anInt3454 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
					local234 = local257.anInt3499 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
					@Pc(290) long local290 = local257.aClass10_598.method363();
					@Pc(292) boolean local292 = false;
					for (@Pc(294) int local294 = 0; local294 < Static76.anInt1789; local294++) {
						if (local290 == Static16.aLongArray2[local294] && Static70.anIntArray181[local294] != 0) {
							local292 = true;
							break;
						}
					}
					@Pc(320) boolean local320 = false;
					if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1344 != 0 && local257.anInt1344 != 0 && Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1344 == local257.anInt1344) {
						local320 = true;
					}
					if (local292) {
						Static96.method2623(local158, local234, Static96.aClass2_Sub1_Sub4_Sub2Array10[3], arg1, arg0);
					} else if (local320) {
						Static96.method2623(local158, local234, Static96.aClass2_Sub1_Sub4_Sub2Array10[4], arg1, arg0);
					} else {
						Static96.method2623(local158, local234, Static96.aClass2_Sub1_Sub4_Sub2Array10[2], arg1, arg0);
					}
				}
			}
			if (Static102.anInt3607 != 0 && Static14.anInt386 % 20 < 10) {
				if (Static102.anInt3607 == 1 && Static53.anInt1254 >= 0 && Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1.length > Static53.anInt1254) {
					@Pc(400) Class2_Sub1_Sub3_Sub2_Sub2 local400 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static53.anInt1254];
					if (local400 != null) {
						local158 = local400.anInt3454 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
						local234 = local400.anInt3499 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
						Static136.method2155(Static95.aClass2_Sub1_Sub4_Sub2Array7[1], local234, local158, arg1, arg0);
					}
				}
				if (Static102.anInt3607 == 2) {
					local146 = (Static65.anInt1597 - Static137.anInt3049) * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
					local158 = (-Static85.anInt1937 + Static28.anInt788) * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
					Static136.method2155(Static95.aClass2_Sub1_Sub4_Sub2Array7[1], local158, local146, arg1, arg0);
				}
				if (Static102.anInt3607 == 10 && Static167.anInt2043 >= 0 && Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1.length > Static167.anInt2043) {
					local257 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static167.anInt2043];
					if (local257 != null) {
						local158 = local257.anInt3454 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
						local234 = local257.anInt3499 / 32 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
						Static136.method2155(Static95.aClass2_Sub1_Sub4_Sub2Array7[1], local234, local158, arg1, arg0);
					}
				}
			}
			if (Static109.anInt2502 != 0) {
				local146 = Static109.anInt2502 * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 / 32;
				local158 = Static40.anInt979 * 4 + 2 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 / 32;
				Static96.method2623(local146, local158, Static95.aClass2_Sub1_Sub4_Sub2Array7[0], arg1, arg0);
			}
			Static172.method2026(arg1 + 93 + 4, arg0 + 82 - 4, 3, 3, 16777215);
		}
		if (Static111.anInt2519 >= 3) {
			Static172.method2020(arg1, arg0, Static33.anIntArray67, Static32.anIntArray65);
		} else {
			Static61.aClass2_Sub1_Sub4_Sub2_43.method728(arg1, arg0, 33, 33, 25, 25, Static45.anInt1123, 256, Static33.anIntArray67, Static32.anIntArray65);
		}
		if (Static179.aBooleanArray20[arg2]) {
			Static149.aClass2_Sub1_Sub4_Sub3_7.method1874(arg1, arg0);
		}
		Static170.aBooleanArray18[arg2] = true;
	}
}
