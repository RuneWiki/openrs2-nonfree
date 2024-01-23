import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!nh;")
	public static Class2_Sub23 aClass2_Sub23_1 = new Class2_Sub23(8);

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!qe;")
	public static Class78 aClass78_90 = Static199.method3560("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_91 = Static199.method3560("underlay)3dat");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILclient!rd;)V")
	public static void method343(@OriginalArg(1) int arg0, @OriginalArg(2) Class72_Sub1 arg1) {
		if (Static107.aClass2_Sub23_5 == null) {
			Static181.method3308(255, (byte) 0, 255, null, true, 0);
			Static103.aClass72_Sub1Array1[arg0] = arg1;
		} else {
			Static107.aClass2_Sub23_5.anInt2703 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static107.aClass2_Sub23_5.method2133();
			@Pc(20) int local20 = Static107.aClass2_Sub23_5.method2133();
			arg1.method3198(local16, local20);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBIII)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		Static62.method1006(arg2);
		@Pc(15) int local15 = arg2 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(37) int local37 = local15;
		@Pc(39) int local39 = -1;
		@Pc(42) int local42 = -local15;
		@Pc(46) int[] local46 = Static183.anIntArrayArray40[arg4];
		@Pc(48) int local48 = -1;
		@Pc(53) int local53 = arg3 - local15;
		Static221.method3893(arg1, arg3 - arg2, local46, local53);
		@Pc(67) int local67 = arg3 + local15;
		Static221.method3893(arg0, local53, local46, local67);
		Static221.method3893(arg1, local67, local46, arg3 + arg2);
		while (local32 > local7) {
			local39 += 2;
			local48 += 2;
			local42 += local48;
			local35 += local39;
			if (local42 >= 0 && local37 >= 1) {
				Static51.anIntArray147[local37] = local7;
				local37--;
				local42 -= local37 << 1;
			}
			local7++;
			@Pc(135) int[] local135;
			@Pc(146) int[] local146;
			@Pc(140) int local140;
			@Pc(151) int local151;
			@Pc(186) int local186;
			@Pc(194) int local194;
			@Pc(198) int local198;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				if (local15 <= local32) {
					local135 = Static183.anIntArrayArray40[local32 + arg4];
					local140 = arg3 + local7;
					local146 = Static183.anIntArrayArray40[arg4 - local32];
					local151 = arg3 - local7;
					Static221.method3893(arg1, local151, local135, local140);
					Static221.method3893(arg1, local151, local146, local140);
				} else {
					local135 = Static183.anIntArrayArray40[local32 + arg4];
					local146 = Static183.anIntArrayArray40[arg4 - local32];
					local140 = Static51.anIntArray147[local32];
					local186 = arg3 - local7;
					local151 = local7 + arg3;
					local194 = arg3 + local140;
					local198 = arg3 - local140;
					Static221.method3893(arg1, local186, local135, local198);
					Static221.method3893(arg0, local198, local135, local194);
					Static221.method3893(arg1, local194, local135, local151);
					Static221.method3893(arg1, local186, local146, local198);
					Static221.method3893(arg0, local198, local146, local194);
					Static221.method3893(arg1, local194, local146, local151);
				}
			}
			local135 = Static183.anIntArrayArray40[arg4 + local7];
			local151 = arg3 - local32;
			local146 = Static183.anIntArrayArray40[arg4 - local7];
			local140 = local32 + arg3;
			if (local7 < local15) {
				local186 = local7 <= local37 ? local37 : Static51.anIntArray147[local7];
				local194 = arg3 + local186;
				local198 = arg3 - local186;
				Static221.method3893(arg1, local151, local135, local198);
				Static221.method3893(arg0, local198, local135, local194);
				Static221.method3893(arg1, local194, local135, local140);
				Static221.method3893(arg1, local151, local146, local198);
				Static221.method3893(arg0, local198, local146, local194);
				Static221.method3893(arg1, local194, local146, local140);
			} else {
				Static221.method3893(arg1, local151, local135, local140);
				Static221.method3893(arg1, local151, local146, local140);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIILclient!kb;)V")
	public static void method345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub3_Sub17 arg3) {
		for (@Pc(15) Class2_Sub14 local15 = (Class2_Sub14) Static10.aClass44_5.method1359(); local15 != null; local15 = (Class2_Sub14) Static10.aClass44_5.method1356()) {
			if (arg2 == local15.anInt887 && arg1 * 128 == local15.anInt894 && local15.anInt891 == arg0 * 128 && arg3.anInt2402 == local15.aClass2_Sub3_Sub17_1.anInt2402) {
				if (local15.aClass2_Sub21_Sub4_2 != null) {
					Static23.aClass2_Sub21_Sub3_1.method3390(local15.aClass2_Sub21_Sub4_2);
					local15.aClass2_Sub21_Sub4_2 = null;
				}
				if (local15.aClass2_Sub21_Sub4_1 != null) {
					Static23.aClass2_Sub21_Sub3_1.method3390(local15.aClass2_Sub21_Sub4_1);
					local15.aClass2_Sub21_Sub4_1 = null;
				}
				local15.method3986();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public static void method346() {
		Static64.anInt1246++;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIBIIZIII)Z")
	public static boolean method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		for (@Pc(10) int local10 = 0; local10 < 104; local10++) {
			for (local13 = 0; local13 < 104; local13++) {
				Static3.anIntArrayArray1[local10][local13] = 0;
				Static122.anIntArrayArray20[local10][local13] = 99999999;
			}
		}
		Static3.anIntArrayArray1[arg6][arg9] = 99;
		local13 = arg6;
		Static122.anIntArrayArray20[arg6][arg9] = 0;
		@Pc(50) int local50 = arg9;
		@Pc(52) int local52 = 0;
		@Pc(54) byte local54 = 0;
		Static86.anIntArray341[0] = arg6;
		@Pc(61) int local61 = local54 + 1;
		Static110.anIntArray419[0] = arg9;
		@Pc(68) int[][] local68 = Static202.aClass90Array1[Static137.anInt3136].anIntArrayArray41;
		@Pc(70) boolean local70 = false;
		@Pc(173) int local173;
		while (local61 != local52) {
			local50 = Static110.anIntArray419[local52];
			local13 = Static86.anIntArray341[local52];
			local52 = local52 + 1 & 0xFFF;
			if (arg0 == local13 && arg4 == local50) {
				local70 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static202.aClass90Array1[Static137.anInt3136].method3512(local13, arg4, arg8 - 1, local50, arg3, arg0, 2)) {
					local70 = true;
					break;
				}
				if (arg8 < 10 && Static202.aClass90Array1[Static137.anInt3136].method3519(local13, 2, arg0, arg4, arg3, arg8 - 1, local50)) {
					local70 = true;
					break;
				}
			}
			if (arg5 != 0 && arg1 != 0 && Static202.aClass90Array1[Static137.anInt3136].method3526(arg1, local50, arg4, arg5, local13, arg0, arg2, 2)) {
				local70 = true;
				break;
			}
			local173 = Static122.anIntArrayArray20[local13][local50] + 1;
			if (local13 > 0 && Static3.anIntArrayArray1[local13 - 1][local50] == 0 && (local68[local13 - 1][local50] & 0x12C010E) == 0 && (local68[local13 - 1][local50 + 1] & 0x12C0138) == 0) {
				Static86.anIntArray341[local61] = local13 - 1;
				Static110.anIntArray419[local61] = local50;
				Static3.anIntArrayArray1[local13 - 1][local50] = 2;
				Static122.anIntArrayArray20[local13 - 1][local50] = local173;
				local61 = local61 + 1 & 0xFFF;
			}
			if (local13 < 102 && Static3.anIntArrayArray1[local13 + 1][local50] == 0 && (local68[local13 + 2][local50] & 0x12C0183) == 0 && (local68[local13 + 2][local50 + 1] & 0x12C01E0) == 0) {
				Static86.anIntArray341[local61] = local13 + 1;
				Static110.anIntArray419[local61] = local50;
				local61 = local61 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local13 + 1][local50] = 8;
				Static122.anIntArrayArray20[local13 + 1][local50] = local173;
			}
			if (local50 > 0 && Static3.anIntArrayArray1[local13][local50 - 1] == 0 && (local68[local13][local50 - 1] & 0x12C010E) == 0 && (local68[local13 + 1][local50 - 1] & 0x12C0183) == 0) {
				Static86.anIntArray341[local61] = local13;
				Static110.anIntArray419[local61] = local50 - 1;
				Static3.anIntArrayArray1[local13][local50 - 1] = 1;
				Static122.anIntArrayArray20[local13][local50 - 1] = local173;
				local61 = local61 + 1 & 0xFFF;
			}
			if (local50 < 102 && Static3.anIntArrayArray1[local13][local50 + 1] == 0 && (local68[local13][local50 + 2] & 0x12C0138) == 0 && (local68[local13 + 1][local50 + 2] & 0x12C01E0) == 0) {
				Static86.anIntArray341[local61] = local13;
				Static110.anIntArray419[local61] = local50 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local13][local50 + 1] = 4;
				Static122.anIntArrayArray20[local13][local50 + 1] = local173;
			}
			if (local13 > 0 && local50 > 0 && Static3.anIntArrayArray1[local13 - 1][local50 - 1] == 0 && (local68[local13 - 1][local50] & 0x12C0138) == 0 && (local68[local13 - 1][local50 - 1] & 0x12C010E) == 0 && (local68[local13][local50 - 1] & 0x12C0183) == 0) {
				Static86.anIntArray341[local61] = local13 - 1;
				Static110.anIntArray419[local61] = local50 - 1;
				Static3.anIntArrayArray1[local13 - 1][local50 - 1] = 3;
				Static122.anIntArrayArray20[local13 - 1][local50 - 1] = local173;
				local61 = local61 + 1 & 0xFFF;
			}
			if (local13 < 102 && local50 > 0 && Static3.anIntArrayArray1[local13 + 1][local50 - 1] == 0 && (local68[local13 + 1][local50 - 1] & 0x12C010E) == 0 && (local68[local13 + 2][local50 - 1] & 0x12C0183) == 0 && (local68[local13 + 2][local50] & 0x12C01E0) == 0) {
				Static86.anIntArray341[local61] = local13 + 1;
				Static110.anIntArray419[local61] = local50 - 1;
				local61 = local61 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local13 + 1][local50 - 1] = 9;
				Static122.anIntArrayArray20[local13 + 1][local50 - 1] = local173;
			}
			if (local13 > 0 && local50 < 102 && Static3.anIntArrayArray1[local13 - 1][local50 + 1] == 0 && (local68[local13 - 1][local50 + 1] & 0x12C010E) == 0 && (local68[local13 - 1][local50 + 2] & 0x12C0138) == 0 && (local68[local13][local50 + 2] & 0x12C01E0) == 0) {
				Static86.anIntArray341[local61] = local13 - 1;
				Static110.anIntArray419[local61] = local50 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local13 - 1][local50 + 1] = 6;
				Static122.anIntArrayArray20[local13 - 1][local50 + 1] = local173;
			}
			if (local13 < 102 && local50 < 102 && Static3.anIntArrayArray1[local13 + 1][local50 + 1] == 0 && (local68[local13 + 1][local50 + 2] & 0x12C0138) == 0 && (local68[local13 + 2][local50 + 2] & 0x12C01E0) == 0 && (local68[local13 + 2][local50 + 1] & 0x12C0183) == 0) {
				Static86.anIntArray341[local61] = local13 + 1;
				Static110.anIntArray419[local61] = local50 + 1;
				Static3.anIntArrayArray1[local13 + 1][local50 + 1] = 12;
				local61 = local61 + 1 & 0xFFF;
				Static122.anIntArrayArray20[local13 + 1][local50 + 1] = local173;
			}
		}
		Static194.anInt4453 = 0;
		@Pc(835) int local835;
		if (!local70) {
			if (!arg7) {
				return false;
			}
			local173 = 1000;
			local835 = 100;
			for (@Pc(841) int local841 = arg0 - 10; local841 <= arg0 + 10; local841++) {
				for (@Pc(847) int local847 = arg4 - 10; local847 <= arg4 + 10; local847++) {
					if (local841 >= 0 && local847 >= 0 && local841 < 104 && local847 < 104 && Static122.anIntArrayArray20[local841][local847] < 100) {
						@Pc(873) int local873 = 0;
						@Pc(875) int local875 = 0;
						if (arg0 > local841) {
							local873 = arg0 - local841;
						} else if (arg5 + arg0 - 1 < local841) {
							local873 = local841 + 1 - arg5 - arg0;
						}
						if (arg4 > local847) {
							local875 = arg4 - local847;
						} else if (local847 > arg4 + arg1 - 1) {
							local875 = local847 + 1 - arg4 - arg1;
						}
						@Pc(943) int local943 = local873 * local873 + local875 * local875;
						if (local943 < local173 || local173 == local943 && local835 > Static122.anIntArrayArray20[local841][local847]) {
							local50 = local847;
							local835 = Static122.anIntArrayArray20[local841][local847];
							local173 = local943;
							local13 = local841;
						}
					}
				}
			}
			if (local173 == 1000) {
				return false;
			}
			if (arg6 == local13 && arg9 == local50) {
				return false;
			}
			Static194.anInt4453 = 1;
		}
		@Pc(1012) byte local1012 = 0;
		Static86.anIntArray341[0] = local13;
		local52 = local1012 + 1;
		Static110.anIntArray419[0] = local50;
		local173 = local835 = Static3.anIntArrayArray1[local13][local50];
		while (arg6 != local13 || arg9 != local50) {
			if (local835 != local173) {
				local835 = local173;
				Static86.anIntArray341[local52] = local13;
				Static110.anIntArray419[local52++] = local50;
			}
			if ((local173 & 0x1) != 0) {
				local50++;
			} else if ((local173 & 0x4) != 0) {
				local50--;
			}
			if ((local173 & 0x2) != 0) {
				local13++;
			} else if ((local173 & 0x8) != 0) {
				local13--;
			}
			local173 = Static3.anIntArrayArray1[local13][local50];
		}
		if (local52 > 0) {
			Static128.method2312(arg10, local52);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)I")
	public static int method349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}
}
