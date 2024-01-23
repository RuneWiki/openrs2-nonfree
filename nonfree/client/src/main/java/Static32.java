import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
	public static int[] anIntArray89 = new int[100];

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt809 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public static int anInt822 = -1;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	public static int anInt823 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIBII)V")
	public static void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = local7 * (Static82.aShort11 - Static138.aShort12) / 100 + Static138.aShort12;
		@Pc(37) int local37 = local31 * arg3 >> 8;
		@Pc(44) int local44 = 2048 - arg4 & 0x7FF;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = local37;
		@Pc(57) int local57;
		@Pc(68) int local68;
		if (local44 != 0) {
			local57 = Class91.anIntArray319[local44];
			local48 = local57 * -local37 >> 16;
			local68 = Class91.anIntArray320[local44];
			local50 = local37 * local68 >> 16;
		}
		@Pc(85) int local85 = 2048 - arg0 & 0x7FF;
		if (local85 != 0) {
			local57 = Class91.anIntArray319[local85];
			local46 = local57 * local50 >> 16;
			local68 = Class91.anIntArray320[local85];
			local50 = local50 * local68 >> 16;
		}
		Static157.anInt3612 = arg6 - local50;
		Static38.anInt1151 = arg4;
		Static229.anInt5072 = arg1 - local46;
		Static48.anInt1350 = arg2 - local48;
		Static97.anInt6055 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
	public static void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg2 * (arg2 - 32) / arg0;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(31) int local31 = arg3 * (arg2 - local11 - 32) / (arg0 - arg2);
		Static119.aClass7Array1[0].method4259(arg1, arg4);
		Static119.aClass7Array1[1].method4259(arg1, arg2 + arg4 - 16);
		if (!Static296.aBoolean335) {
			Static203.method3592(arg1, arg4 + 16, 16, arg2 - 32, Static1.anInt78);
			Static203.method3592(arg1, local31 + arg4 + 16, 16, local11, Static270.anInt5841);
			Static203.method3608(arg1, local31 + arg4 + 16, local11, Static258.anInt5645);
			Static203.method3608(arg1 + 1, local31 + arg4 - -16, local11, Static258.anInt5645);
			Static203.method3606(arg1, arg4 + local31 + 16, 16, Static258.anInt5645);
			Static203.method3606(arg1, local31 + arg4 + 17, 16, Static258.anInt5645);
			Static203.method3608(arg1 + 15, arg4 + (16 - -local31), local11, Static117.anInt2575);
			Static203.method3608(arg1 + 14, local31 + arg4 - -17, local11 - 1, Static117.anInt2575);
			Static203.method3606(arg1, local31 + arg4 + local11 + 15, 16, Static117.anInt2575);
			Static203.method3606(arg1 + 1, arg4 - (-14 - local31) + local11, 15, Static117.anInt2575);
			return;
		}
		Static288.method4713(arg1, arg4 + 16, 16, arg2 - 32, Static1.anInt78);
		Static288.method4713(arg1, local31 + arg4 + 16, 16, local11, Static270.anInt5841);
		Static288.method4712(arg1, local31 + arg4 + 16, local11, Static258.anInt5645);
		Static288.method4712(arg1 + 1, local31 + arg4 + 16, local11, Static258.anInt5645);
		Static288.method4711(arg1, local31 + arg4 + 16, 16, Static258.anInt5645);
		Static288.method4711(arg1, arg4 + local31 + 17, 16, Static258.anInt5645);
		Static288.method4712(arg1 + 15, arg4 + 16 - -local31, local11, Static117.anInt2575);
		Static288.method4712(arg1 + 14, local31 + arg4 - -17, local11 - 1, Static117.anInt2575);
		Static288.method4711(arg1, local11 + arg4 + local31 + 15, 16, Static117.anInt2575);
		Static288.method4711(arg1 + 1, local11 + local31 + 14 + arg4, 15, Static117.anInt2575);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class94 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class94(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub14(local14, arg1, arg2);
				}
			}
			Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass94_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class94(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub14(local14, arg1, arg2);
				}
			}
			Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass94_1 = local12;
		} else {
			@Pc(134) Class20 local134 = new Class20(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static132.aClass1_Sub14ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub14(local14, arg1, arg2);
				}
			}
			Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass20_1 = local134;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method665() {
		Static81.aClass1_Sub16_Sub1_1.method2676(127);
		for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static147.aClass117_12.method3441(); local18 != null; local18 = (Class1_Sub12) Static147.aClass117_12.method3444()) {
			if (local18.anInt2229 == 0) {
				Static271.method4538(local18, true);
			}
		}
		if (Static2.aClass116_16 != null) {
			Static189.method3378(Static2.aClass116_16);
			Static2.aClass116_16 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZIIIIII)V")
	public static void method666(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg0 && Static238.anInt5219 == arg4 && Static222.anInt4928 == arg6 && (Static228.anInt5022 == arg5 || Static40.method1450())) {
			return;
		}
		Static238.anInt5219 = arg4;
		Static222.anInt4928 = arg6;
		Static228.anInt5022 = arg5;
		if (Static40.method1450()) {
			Static228.anInt5022 = 0;
		}
		if (arg1) {
			Static140.method2511(28);
		} else {
			Static140.method2511(25);
		}
		Static242.method4171(true, Static19.aString12);
		@Pc(54) int local54 = Static82.anInt1972;
		Static82.anInt1972 = arg4 * 8 - 48;
		@Pc(62) int local62 = Static266.anInt5790;
		Static266.anInt5790 = arg6 * 8 - 48;
		Static45.aClass1_Sub2_Sub9_1 = Static65.method332(Static238.anInt5219 * 8, Static222.anInt4928 * 8);
		Static25.aClass78_1 = null;
		@Pc(84) int local84 = Static82.anInt1972 - local54;
		@Pc(91) int local91 = Static266.anInt5790 - local62;
		@Pc(97) int local97;
		@Pc(104) Class25_Sub1_Sub2 local104;
		@Pc(109) int local109;
		if (arg1) {
			Static147.anInt3493 = 0;
			for (local97 = 0; local97 < 32768; local97++) {
				local104 = Static27.aClass25_Sub1_Sub2Array1[local97];
				if (local104 != null) {
					local104.anInt1604 -= local91 * 128;
					local104.anInt1635 -= local84 * 128;
					if (local104.anInt1635 >= 0 && local104.anInt1635 <= 13184 && local104.anInt1604 >= 0 && local104.anInt1604 <= 13184) {
						for (local109 = 0; local109 < 10; local109++) {
							local104.anIntArray172[local109] -= local84;
							local104.anIntArray173[local109] -= local91;
						}
						Static65.anIntArray25[Static147.anInt3493++] = local97;
					} else {
						Static27.aClass25_Sub1_Sub2Array1[local97].method1250(null);
						Static27.aClass25_Sub1_Sub2Array1[local97] = null;
					}
				}
			}
		} else {
			for (local97 = 0; local97 < 32768; local97++) {
				local104 = Static27.aClass25_Sub1_Sub2Array1[local97];
				if (local104 != null) {
					for (local109 = 0; local109 < 10; local109++) {
						local104.anIntArray172[local109] -= local84;
						local104.anIntArray173[local109] -= local91;
					}
					local104.anInt1604 -= local91 * 128;
					local104.anInt1635 -= local84 * 128;
				}
			}
		}
		for (local97 = 0; local97 < 2048; local97++) {
			@Pc(262) Class25_Sub1_Sub1 local262 = Static271.aClass25_Sub1_Sub1Array1[local97];
			if (local262 != null) {
				for (local109 = 0; local109 < 10; local109++) {
					local262.anIntArray172[local109] -= local84;
					local262.anIntArray173[local109] -= local91;
				}
				local262.anInt1604 -= local91 * 128;
				local262.anInt1635 -= local84 * 128;
			}
		}
		@Pc(312) byte local312 = 0;
		Static145.anInt3477 = arg5;
		Static239.aClass25_Sub1_Sub1_2.method494(arg3, arg2, false);
		@Pc(324) byte local324 = 104;
		@Pc(326) byte local326 = 1;
		if (local84 < 0) {
			local312 = 103;
			local326 = -1;
			local324 = -1;
		}
		@Pc(338) byte local338 = 0;
		@Pc(340) byte local340 = 104;
		@Pc(342) byte local342 = 1;
		if (local91 < 0) {
			local342 = -1;
			local340 = -1;
			local338 = 103;
		}
		for (@Pc(354) int local354 = local312; local354 != local324; local354 += local326) {
			for (@Pc(359) int local359 = local338; local359 != local340; local359 += local342) {
				@Pc(370) int local370 = local84 + local354;
				@Pc(374) int local374 = local91 + local359;
				for (@Pc(376) int local376 = 0; local376 < 4; local376++) {
					if (local370 >= 0 && local374 >= 0 && local370 < 104 && local374 < 104) {
						Static240.aClass131ArrayArrayArray1[local376][local354][local359] = Static240.aClass131ArrayArrayArray1[local376][local370][local374];
					} else {
						Static240.aClass131ArrayArrayArray1[local376][local354][local359] = null;
					}
				}
			}
		}
		for (@Pc(441) Class1_Sub9 local441 = (Class1_Sub9) Static236.aClass131_17.method3791(); local441 != null; local441 = (Class1_Sub9) Static236.aClass131_17.method3792()) {
			local441.anInt1476 -= local84;
			local441.anInt1483 -= local91;
			if (local441.anInt1476 < 0 || local441.anInt1483 < 0 || local441.anInt1476 >= 104 || local441.anInt1483 >= 104) {
				local441.method4742();
			}
		}
		Static111.anInt2392 = 0;
		if (Static4.anInt139 != 0) {
			Static4.anInt139 -= local84;
			Static52.anInt1401 -= local91;
		}
		if (arg1) {
			Static158.anInt3653 -= local91;
			Static251.anInt5457 -= local84;
			Static295.anInt3204 -= local91;
			Static180.anInt4076 -= local84;
			Static157.anInt3612 -= local91 * 128;
			Static229.anInt5072 -= local84 * 128;
		} else {
			Static280.anInt5999 = 1;
		}
		if (Static296.aBoolean335 && arg1 && (Math.abs(local84) > 104 || Math.abs(local91) > 104)) {
			Static94.method4775();
		}
		Static33.anInt870 = -1;
		Static244.aClass131_24.method3795();
		Static293.aClass131_28.method3795();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public static void method669() {
		Static97.aClass155_45.method4364(5);
		Static131.aClass155_27.method4364(5);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
	public static void method671(@OriginalArg(0) boolean arg0) {
		Static96.method1648();
		if (Static279.anInt5968 != 30 && Static279.anInt5968 != 25) {
			return;
		}
		Static136.anInt3082++;
		if (Static136.anInt3082 < 50 && !arg0) {
			return;
		}
		Static136.anInt3082 = 0;
		if (!Static208.aBoolean245 && Static22.aClass41_1 != null) {
			Static81.aClass1_Sub16_Sub1_1.method2676(251);
			try {
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
				Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
			} catch (@Pc(58) IOException local58) {
				Static208.aBoolean245 = true;
			}
		}
		Static96.method1648();
	}
}
