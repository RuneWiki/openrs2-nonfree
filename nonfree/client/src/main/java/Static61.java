import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "Lclient!km;")
	public static Class91 aClass91_51;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "Lclient!km;")
	public static Class91 aClass91_52;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	public static int anInt1297;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "[S")
	public static short[] aShortArray23 = new short[500];

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "[I")
	public static int[] anIntArray132 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
	public static int anInt1302 = 0;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
	public static int anInt1305 = 0;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
	public static void method1093() {
		Static71.aClass135_4.method3317();
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V")
	public static void method1094(@OriginalArg(1) int arg0) {
		Static28.method555(Static28.anInt655, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static28.method554(-50.0F, (float) -60, -50.0F);
		Static28.method559(Static28.anInt657, 0, false);
		Static28.method553();
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
	public static void method1095() {
		for (@Pc(18) Class1_Sub2_Sub8 local18 = (Class1_Sub2_Sub8) Static201.aClass61_22.method1835(); local18 != null; local18 = (Class1_Sub2_Sub8) Static201.aClass61_22.method1836()) {
			@Pc(23) Class14_Sub4 local23 = local18.aClass14_Sub4_1;
			if (local23.anInt2242 != Static140.anInt3034 || local23.anInt2266 < Static237.anInt4710) {
				local18.method4441();
			} else if (Static237.anInt4710 >= local23.anInt2256) {
				if (local23.anInt2257 > 0) {
					@Pc(62) Class14_Sub2_Sub2 local62 = Static254.aClass14_Sub2_Sub2Array1[local23.anInt2257 - 1];
					if (local62 != null && local62.anInt4680 >= 0 && local62.anInt4680 < 13312 && local62.anInt4630 >= 0 && local62.anInt4630 < 13312) {
						local23.method1787(Static20.method383(local62.anInt4630, local23.anInt2242, local62.anInt4680) - local23.anInt2267, local62.anInt4630, local62.anInt4680, Static237.anInt4710);
					}
				}
				if (local23.anInt2257 < 0) {
					@Pc(115) int local115 = -local23.anInt2257 - 1;
					@Pc(122) Class14_Sub2_Sub1 local122;
					if (local115 == Static71.anInt1526) {
						local122 = Static197.aClass14_Sub2_Sub1_2;
					} else {
						local122 = Static98.aClass14_Sub2_Sub1Array1[local115];
					}
					if (local122 != null && local122.anInt4680 >= 0 && local122.anInt4680 < 13312 && local122.anInt4630 >= 0 && local122.anInt4630 < 13312) {
						local23.method1787(Static20.method383(local122.anInt4630, local23.anInt2242, local122.anInt4680) - local23.anInt2267, local122.anInt4630, local122.anInt4680, Static237.anInt4710);
					}
				}
				local23.method1785(Static129.anInt2881);
				Static22.method423(Static140.anInt3034, (int) local23.aDouble8, (int) local23.aDouble10, (int) local23.aDouble5, 60, local23, local23.anInt2245, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!cg;Z)V")
	public static void method1098(@OriginalArg(0) Class1_Sub11 arg0) {
		if (arg0.aByteArray47.length - arg0.anInt3264 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2690();
		if (local20 < 0 || local20 > 11) {
			return;
		}
		@Pc(43) byte local43;
		if (local20 == 11) {
			local43 = 33;
		} else if (local20 == 10) {
			local43 = 32;
		} else if (local20 == 9) {
			local43 = 31;
		} else if (local20 == 8) {
			local43 = 30;
		} else if (local20 == 7) {
			local43 = 29;
		} else if (local20 == 6) {
			local43 = 28;
		} else if (local20 == 5) {
			local43 = 28;
		} else if (local20 == 4) {
			local43 = 24;
		} else if (local20 == 3) {
			local43 = 23;
		} else if (local20 == 2) {
			local43 = 22;
		} else if (local20 == 1) {
			local43 = 23;
		} else {
			local43 = 19;
		}
		if (local43 > arg0.aByteArray47.length - arg0.anInt3264) {
			return;
		}
		Static285.anInt5431 = arg0.method2690();
		if (Static285.anInt5431 < 1) {
			Static285.anInt5431 = 1;
		} else if (Static285.anInt5431 > 4) {
			Static285.anInt5431 = 4;
		}
		Static56.method1059(arg0.method2690() == 1);
		Static223.aBoolean343 = arg0.method2690() == 1;
		Static116.aBoolean450 = arg0.method2690() == 1;
		Static276.aBoolean217 = arg0.method2690() == 1;
		Static209.aBoolean321 = arg0.method2690() == 1;
		Static200.aBoolean310 = arg0.method2690() == 1;
		Static23.aBoolean37 = arg0.method2690() == 1;
		Static199.aBoolean308 = arg0.method2690() == 1;
		Static262.anInt5132 = arg0.method2690();
		if (Static262.anInt5132 > 2) {
			Static262.anInt5132 = 2;
		}
		if (local20 < 2) {
			Static188.aBoolean295 = arg0.method2690() == 1;
			arg0.method2690();
		} else {
			Static188.aBoolean295 = arg0.method2690() == 1;
		}
		Static236.aBoolean353 = arg0.method2690() == 1;
		Static129.aBoolean213 = arg0.method2690() == 1;
		Static20.anInt381 = arg0.method2690();
		if (Static20.anInt381 > 2) {
			Static20.anInt381 = 2;
		}
		Static63.anInt1347 = Static20.anInt381;
		Static147.aBoolean236 = arg0.method2690() == 1;
		Static127.anInt2836 = arg0.method2690();
		if (Static127.anInt2836 > 127) {
			Static127.anInt2836 = 127;
		}
		Static184.anInt3815 = arg0.method2690();
		Static119.anInt2761 = arg0.method2690();
		if (Static119.anInt2761 > 127) {
			Static119.anInt2761 = 127;
		}
		if (local20 >= 1) {
			Static75.anInt1605 = arg0.method2691();
			Static146.anInt3171 = arg0.method2691();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method2690();
		}
		if (local20 >= 4) {
			@Pc(374) int local374 = arg0.method2690();
			if (Static177.anInt3741 < 96) {
				local374 = 0;
			}
			Static235.method3619(local374);
		}
		if (local20 >= 5) {
			Static108.anInt2518 = arg0.method2643();
		}
		if (local20 >= 6) {
			Static296.anInt5585 = arg0.method2690();
		}
		if (local20 >= 7) {
			Static219.aBoolean339 = arg0.method2690() == 1;
		}
		if (local20 >= 8) {
			Static19.aBoolean30 = arg0.method2690() == 1;
		}
		if (local20 >= 9) {
			Static214.anInt4259 = arg0.method2690();
		}
		if (local20 >= 10) {
			Static134.aBoolean218 = arg0.method2690() != 0;
		}
		if (local20 >= 11) {
			Static83.aBoolean132 = arg0.method2690() != 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(14) int local14 = arg2 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg6 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local25 << 1;
		@Pc(41) int local41 = local21 * local21;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local41 << 1;
		@Pc(53) int local53 = local21 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(71) int local71 = (1 - local61) * local29 + local37;
		@Pc(80) int local80 = local25 - (local61 - 1) * local45;
		@Pc(84) int local84 = local29 << 2;
		@Pc(92) int local92 = local49 + local33 * (1 - local53);
		@Pc(101) int local101 = local41 - (local53 - 1) * local57;
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(115) int local115 = (local61 - 3) * local45;
		@Pc(119) int local119 = local37 * 3;
		@Pc(125) int local125 = (local53 - 3) * local57;
		@Pc(127) int local127 = local105;
		@Pc(135) int local135 = local41 << 2;
		@Pc(139) int local139 = local49 * 3;
		@Pc(145) int local145 = (arg6 - 1) * local84;
		@Pc(151) int local151 = (local21 - 1) * local109;
		@Pc(153) int local153 = local135;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (arg5 >= Static297.anInt5619 && Static49.anInt1129 >= arg5) {
			@Pc(168) int[] local168 = Static22.anIntArrayArray3[arg5];
			local177 = Static23.method431(arg1 - arg2, Static68.anInt1451, Static224.anInt4436);
			local185 = Static23.method431(arg2 + arg1, Static68.anInt1451, Static224.anInt4436);
			local193 = Static23.method431(arg1 - local14, Static68.anInt1451, Static224.anInt4436);
			local201 = Static23.method431(local14 + arg1, Static68.anInt1451, Static224.anInt4436);
			Static126.method1523(local168, local193, arg4, local177);
			Static126.method1523(local168, local201, arg0, local193);
			Static126.method1523(local168, local185, arg4, local201);
		}
		while (local9 > 0) {
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local127;
					local7++;
					local71 += local119;
					local127 += local105;
					local119 += local105;
				}
			}
			@Pc(259) boolean local259 = local9 <= local21;
			if (local80 < 0) {
				local7++;
				local71 += local119;
				local119 += local105;
				local80 += local127;
				local127 += local105;
			}
			if (local259) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local153;
						local16++;
						local92 += local139;
						local153 += local135;
						local139 += local135;
					}
				}
				if (local101 < 0) {
					local16++;
					local101 += local153;
					local92 += local139;
					local153 += local135;
					local139 += local135;
				}
				local92 += -local151;
				local151 -= local109;
				local101 += -local125;
				local125 -= local109;
			}
			local9--;
			local177 = arg5 - local9;
			local80 += -local115;
			local71 += -local145;
			local145 -= local84;
			local185 = arg5 + local9;
			if (local185 >= Static297.anInt5619 && Static49.anInt1129 >= local177) {
				local193 = Static23.method431(local7 + arg1, Static68.anInt1451, Static224.anInt4436);
				local201 = Static23.method431(arg1 - local7, Static68.anInt1451, Static224.anInt4436);
				if (local259) {
					@Pc(408) int local408 = Static23.method431(local16 + arg1, Static68.anInt1451, Static224.anInt4436);
					@Pc(417) int local417 = Static23.method431(arg1 - local16, Static68.anInt1451, Static224.anInt4436);
					@Pc(428) int[] local428;
					if (local177 >= Static297.anInt5619) {
						local428 = Static22.anIntArrayArray3[local177];
						Static126.method1523(local428, local417, arg4, local201);
						Static126.method1523(local428, local408, arg0, local417);
						Static126.method1523(local428, local193, arg4, local408);
					}
					if (Static49.anInt1129 >= local185) {
						local428 = Static22.anIntArrayArray3[local185];
						Static126.method1523(local428, local417, arg4, local201);
						Static126.method1523(local428, local408, arg0, local417);
						Static126.method1523(local428, local193, arg4, local408);
					}
				} else {
					if (Static297.anInt5619 <= local177) {
						Static126.method1523(Static22.anIntArrayArray3[local177], local193, arg4, local201);
					}
					if (local185 <= Static49.anInt1129) {
						Static126.method1523(Static22.anIntArrayArray3[local185], local193, arg4, local201);
					}
				}
			}
			local115 -= local84;
		}
	}
}
