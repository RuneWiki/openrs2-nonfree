import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "Lclient!si;")
	public static Class157 aClass157_12;

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "Lclient!qh;")
	public static Class1_Sub5_Sub18 aClass1_Sub5_Sub18_5;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "Lclient!nm;")
	public static Class119 aClass119_60;

	@OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
	public static int anInt3187;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "[Lclient!ia;")
	public static Class80[] aClass80Array1 = new Class80[8];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(SZ)Z")
	public static boolean method2738(@OriginalArg(0) short arg0) {
		if (arg0 == 7 || arg0 == 34 || arg0 == 17 || arg0 == 24 || arg0 == 22 || arg0 == 46 || arg0 == 50 || arg0 == 5) {
			return true;
		} else if (arg0 == 16 || arg0 == 49 || arg0 == 1002 || arg0 == 1004) {
			return true;
		} else if (arg0 == 18 || arg0 == 26 || arg0 == 13 || arg0 == 41 || arg0 == 39) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 28 || arg0 == 57 || arg0 == 47 || arg0 == 11 || arg0 == 33;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lclient!pl;")
	public static Class136 method2739(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = (Class136) Static89.aClass175_13.method4295((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static40.aClass119_14.method3235(arg0, 36);
		local6 = new Class136();
		local6.anInt4078 = arg0;
		if (local28 != null) {
			local6.method3520(new Class1_Sub13(local28));
		}
		Static89.aClass175_13.method4285(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
	public static void method2740() {
		@Pc(7) int local7 = Static48.anInt1073;
		@Pc(9) int local9 = Static92.anInt1933;
		@Pc(13) int local13 = Static229.anInt4962;
		@Pc(17) int local17 = Static282.anInt5139 - 3;
		if (Static264.aClass1_Sub5_Sub6_10 == null || Static159.aClass1_Sub5_Sub6_6 == null) {
			if (Static45.aClass119_15.method3250(Static43.anInt978) && Static45.aClass119_15.method3250(Static66.anInt1367)) {
				Static264.aClass1_Sub5_Sub6_10 = Static124.method562(Static43.anInt978, Static45.aClass119_15);
				Static159.aClass1_Sub5_Sub6_6 = Static124.method562(Static66.anInt1367, Static45.aClass119_15);
				if (Static71.aBoolean165) {
					if (Static264.aClass1_Sub5_Sub6_10 instanceof Class1_Sub5_Sub6_Sub1_Sub1) {
						Static264.aClass1_Sub5_Sub6_10 = new Class1_Sub5_Sub6_Sub2_Sub1((Class1_Sub5_Sub6_Sub1) Static264.aClass1_Sub5_Sub6_10);
					} else {
						Static264.aClass1_Sub5_Sub6_10 = new Class1_Sub5_Sub6_Sub2((Class1_Sub5_Sub6_Sub1) Static264.aClass1_Sub5_Sub6_10);
					}
					if (Static159.aClass1_Sub5_Sub6_6 instanceof Class1_Sub5_Sub6_Sub1_Sub1) {
						Static159.aClass1_Sub5_Sub6_6 = new Class1_Sub5_Sub6_Sub2_Sub1((Class1_Sub5_Sub6_Sub1) Static159.aClass1_Sub5_Sub6_6);
					} else {
						Static159.aClass1_Sub5_Sub6_6 = new Class1_Sub5_Sub6_Sub2((Class1_Sub5_Sub6_Sub1) Static159.aClass1_Sub5_Sub6_6);
					}
				}
			} else if (Static71.aBoolean165) {
				Static93.method1762(local9, local7, local13, 20, Static296.anInt841, 256 - Static186.anInt3550);
			} else {
				Static77.method1584(local9, local7, local13, 20, Static296.anInt841, 256 - Static186.anInt3550);
			}
		}
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (Static264.aClass1_Sub5_Sub6_10 != null && Static159.aClass1_Sub5_Sub6_6 != null) {
			local123 = (local13 - Static159.aClass1_Sub5_Sub6_6.anInt3617 * 2) / Static264.aClass1_Sub5_Sub6_10.anInt3617;
			for (local125 = 0; local125 < local123; local125++) {
				Static264.aClass1_Sub5_Sub6_10.method3195(Static159.aClass1_Sub5_Sub6_6.anInt3617 + local9 + Static264.aClass1_Sub5_Sub6_10.anInt3617 * local125, local7);
			}
			Static159.aClass1_Sub5_Sub6_6.method3195(local9, local7);
			Static159.aClass1_Sub5_Sub6_6.method3206(local9 + local13 - Static159.aClass1_Sub5_Sub6_6.anInt3617, local7);
		}
		Static19.aClass1_Sub5_Sub9_1.method2878(Static252.aString165, local9 + 3, local7 + 14, Static146.anInt3023, -1);
		if (Static71.aBoolean165) {
			Static93.method1762(local9, local7 + 20, local13, local17 - 20, Static296.anInt841, 256 - Static186.anInt3550);
		} else {
			Static77.method1584(local9, local7 + 20, local13, local17 - 20, Static296.anInt841, 256 - Static186.anInt3550);
		}
		local125 = Static14.anInt309;
		local123 = Static89.anInt1899;
		@Pc(214) int local214;
		@Pc(237) int local237;
		for (local214 = 0; local214 < Static241.anInt4470; local214++) {
			local237 = local7 + (-local214 + (Static241.anInt4470 - 1)) * 15 + 33;
			if (local123 > local9 && local123 < local9 + local13 && local125 > local237 - 13 && local237 + 3 > local125) {
				if (Static71.aBoolean165) {
					Static93.method1762(local9, local237 - 12, local13, 15, Static175.anInt3410, 256 - Static236.anInt4435);
				} else {
					Static77.method1584(local9, local237 - 12, local13, 15, Static175.anInt3410, 256 - Static236.anInt4435);
				}
			}
		}
		if ((Static206.aClass1_Sub5_Sub6_8 == null || Static175.aClass1_Sub5_Sub6_7 == null || Static144.aClass1_Sub5_Sub6_5 == null) && Static45.aClass119_15.method3250(Static184.anInt3539) && Static45.aClass119_15.method3250(Static262.anInt4840) && Static45.aClass119_15.method3250(Static73.anInt1574)) {
			Static206.aClass1_Sub5_Sub6_8 = Static124.method562(Static184.anInt3539, Static45.aClass119_15);
			Static175.aClass1_Sub5_Sub6_7 = Static124.method562(Static262.anInt4840, Static45.aClass119_15);
			Static144.aClass1_Sub5_Sub6_5 = Static124.method562(Static73.anInt1574, Static45.aClass119_15);
			if (Static71.aBoolean165) {
				if (Static206.aClass1_Sub5_Sub6_8 instanceof Class1_Sub5_Sub6_Sub1_Sub1) {
					Static206.aClass1_Sub5_Sub6_8 = new Class1_Sub5_Sub6_Sub2_Sub1((Class1_Sub5_Sub6_Sub1) Static206.aClass1_Sub5_Sub6_8);
				} else {
					Static206.aClass1_Sub5_Sub6_8 = new Class1_Sub5_Sub6_Sub2((Class1_Sub5_Sub6_Sub1) Static206.aClass1_Sub5_Sub6_8);
				}
				if (Static175.aClass1_Sub5_Sub6_7 instanceof Class1_Sub5_Sub6_Sub1_Sub1) {
					Static175.aClass1_Sub5_Sub6_7 = new Class1_Sub5_Sub6_Sub2_Sub1((Class1_Sub5_Sub6_Sub1) Static175.aClass1_Sub5_Sub6_7);
				} else {
					Static175.aClass1_Sub5_Sub6_7 = new Class1_Sub5_Sub6_Sub2((Class1_Sub5_Sub6_Sub1) Static175.aClass1_Sub5_Sub6_7);
				}
				if (Static144.aClass1_Sub5_Sub6_5 instanceof Class1_Sub5_Sub6_Sub1_Sub1) {
					Static144.aClass1_Sub5_Sub6_5 = new Class1_Sub5_Sub6_Sub2_Sub1((Class1_Sub5_Sub6_Sub1) Static144.aClass1_Sub5_Sub6_5);
				} else {
					Static144.aClass1_Sub5_Sub6_5 = new Class1_Sub5_Sub6_Sub2((Class1_Sub5_Sub6_Sub1) Static144.aClass1_Sub5_Sub6_5);
				}
			}
		}
		@Pc(449) int local449;
		if (Static206.aClass1_Sub5_Sub6_8 != null && Static175.aClass1_Sub5_Sub6_7 != null && Static144.aClass1_Sub5_Sub6_5 != null) {
			local214 = (local13 - Static144.aClass1_Sub5_Sub6_5.anInt3617 * 2) / Static206.aClass1_Sub5_Sub6_8.anInt3617;
			for (local237 = 0; local237 < local214; local237++) {
				Static206.aClass1_Sub5_Sub6_8.method3195(local237 * Static206.aClass1_Sub5_Sub6_8.anInt3617 + local9 + Static144.aClass1_Sub5_Sub6_5.anInt3617, local7 + local17 + -Static206.aClass1_Sub5_Sub6_8.anInt3625);
			}
			local237 = (local17 - Static144.aClass1_Sub5_Sub6_5.anInt3625 - 20) / Static175.aClass1_Sub5_Sub6_7.anInt3625;
			for (local449 = 0; local449 < local237; local449++) {
				Static175.aClass1_Sub5_Sub6_7.method3195(local9, local449 * Static175.aClass1_Sub5_Sub6_7.anInt3625 + local7 + 20);
				Static175.aClass1_Sub5_Sub6_7.method3206(local13 + local9 - Static175.aClass1_Sub5_Sub6_7.anInt3617, local7 + 20 + local449 * Static175.aClass1_Sub5_Sub6_7.anInt3625);
			}
			Static144.aClass1_Sub5_Sub6_5.method3195(local9, local17 + local7 - Static144.aClass1_Sub5_Sub6_5.anInt3625);
			Static144.aClass1_Sub5_Sub6_5.method3206(local13 + local9 - Static144.aClass1_Sub5_Sub6_5.anInt3617, local17 + local7 + -Static144.aClass1_Sub5_Sub6_5.anInt3625);
		}
		for (local214 = 0; local214 < Static241.anInt4470; local214++) {
			local237 = local7 + (-local214 + -1 + Static241.anInt4470) * 15 + 13 + 20;
			local449 = Static146.anInt3023;
			if (local123 > local9 && local9 + local13 > local123 && local237 - 13 < local125 && local125 < local237 + 3) {
				local449 = Static120.anInt2453;
			}
			Static19.aClass1_Sub5_Sub9_1.method2878(Static42.method774(local214), local9 + 3, local237, local449, 0);
		}
		Static255.method4002(Static229.anInt4962, Static282.anInt5139, Static48.anInt1073, Static92.anInt1933);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIILclient!km;JZ)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class124 local6 = new Class124();
		local6.aClass11_10 = arg4;
		local6.anInt3885 = arg1 * 128 + 64;
		local6.anInt3886 = arg2 * 128 + 64;
		local6.anInt3882 = arg3;
		local6.aLong143 = arg5;
		local6.aBoolean340 = arg6;
		if (Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub16(arg0, arg1, arg2);
		}
		Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass124_1 = local6;
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(III)I")
	public static int method2743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub18 local20 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg1);
		if (local20 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < local20.anIntArray218.length; local36++) {
				if (local20.anIntArray219[local36] == arg0) {
					local34 += local20.anIntArray218[local36];
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(BI)Lclient!s;")
	public static Class150 method2744(@OriginalArg(1) int arg0) {
		@Pc(10) Class150 local10 = (Class150) Static17.aClass175_3.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static114.aClass119_43.method3235(Static236.method3803(arg0), Static299.method4475(arg0));
		local10 = new Class150();
		local10.anInt4558 = arg0;
		if (local24 != null) {
			local10.method3886(new Class1_Sub13(local24));
		}
		local10.method3893();
		if (!Static256.aBoolean457 && local10.aBoolean422) {
			local10.aStringArray29 = null;
		}
		if (local10.aBoolean412) {
			local10.anInt4560 = 0;
			local10.aBoolean417 = false;
		}
		Static17.aClass175_3.method4285(local10, (long) arg0);
		return local10;
	}
}
