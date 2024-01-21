import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	public static int anInt3740 = 0;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "[Lclient!ee;")
	public static Class19[] aClass19Array1 = new Class19[6];

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1595 = Static51.method932("Enter your username (V password)3");

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1594 = aClass10_1595;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public static void method2658() {
		aClass10_1594 = null;
		aClass10_1595 = null;
		aClass19Array1 = null;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public static void method2661() {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static158.aClass12_13.method384(); local10 != null; local10 = (Class2_Sub19) Static158.aClass12_13.method381()) {
			if (local10.anInt2994 == -1) {
				local10.anInt2990 = 0;
				Static106.method1722(local10);
			} else {
				local10.method2705();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(III)V")
	public static void method2678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		@Pc(13) int local13 = 1;
		local8[0] = arg1;
		local11[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static151.anIntArray343[local23]) {
				local8[local13] = Static151.anIntArray343[local23];
				local11[local13] = Static167.anIntArray221[local23];
				local13++;
			}
		}
		Static167.anIntArray221 = local11;
		Static151.anIntArray343 = local8;
		Static178.method2701(Static151.anIntArray343, Static167.anIntArray221, Static141.aClass8Array1, 0, Static141.aClass8Array1.length - 1);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!fh;IILclient!ob;IZIIII)V")
	public static void method2693(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class2_Sub1_Sub10 local9 = Static62.method1106(arg7);
		@Pc(25) int local25;
		@Pc(22) int local22;
		if (arg6 == 1 || arg6 == 3) {
			local22 = local9.anInt2225;
			local25 = local9.anInt2210;
		} else {
			local25 = local9.anInt2225;
			local22 = local9.anInt2210;
		}
		@Pc(46) int local46;
		@Pc(54) int local54;
		if (local25 + arg2 <= 104) {
			local46 = (local25 >> 1) + arg2;
			local54 = arg2 + (local25 + 1 >> 1);
		} else {
			local46 = arg2;
			local54 = arg2 + 1;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (arg5 + local22 > 104) {
			local72 = arg5;
			local76 = arg5 + 1;
		} else {
			local72 = (local22 >> 1) + arg5;
			local76 = arg5 + (local22 + 1 >> 1);
		}
		@Pc(96) int[][] local96 = Static162.anIntArrayArrayArray8[arg4];
		@Pc(122) int local122 = local96[local54][local76] + local96[local46][local76] + local96[local54][local72] + local96[local46][local72] >> 2;
		@Pc(130) int local130 = (local25 << 6) + (arg2 << 7);
		@Pc(142) int local142 = (arg5 << 7) + arg2 + (arg7 << 14) + 1073741824;
		@Pc(148) int local148 = arg8 + (arg6 << 6);
		@Pc(156) int local156 = (local22 << 6) + (arg5 << 7);
		if (local9.anInt2247 == 1) {
			local148 += 256;
		}
		if (local9.anInt2212 == 0) {
			local142 += Integer.MIN_VALUE;
		}
		@Pc(195) Class2_Sub1_Sub3 local195;
		if (arg8 == 22) {
			if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
				local195 = local9.method1574(local122, local130, local156, 22, local96, arg6);
			} else {
				local195 = new Class2_Sub1_Sub3_Sub6(arg7, 22, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
			}
			arg3.method1823(arg1, arg2, arg5, local122, local195, local142, local148);
			if (local9.anInt2220 == 1) {
				arg0.method940(arg5, arg2);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
				local195 = local9.method1574(local122, local130, local156, 10, local96, arg6);
			} else {
				local195 = new Class2_Sub1_Sub3_Sub6(arg7, 10, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
			}
			if (local195 != null) {
				arg3.method1801(arg1, arg2, arg5, local122, local25, local22, local195, arg8 == 11 ? 256 : 0, local142, local148);
			}
			if (local9.anInt2220 != 0) {
				arg0.method944(local22, arg2, arg5, local25, local9.aBoolean94);
			}
		} else if (arg8 >= 12) {
			if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
				local195 = local9.method1574(local122, local130, local156, arg8, local96, arg6);
			} else {
				local195 = new Class2_Sub1_Sub3_Sub6(arg7, arg8, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
			}
			arg3.method1801(arg1, arg2, arg5, local122, 1, 1, local195, 0, local142, local148);
			if (local9.anInt2220 != 0) {
				arg0.method944(local22, arg2, arg5, local25, local9.aBoolean94);
			}
		} else if (arg8 == 0) {
			if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
				local195 = local9.method1574(local122, local130, local156, 0, local96, arg6);
			} else {
				local195 = new Class2_Sub1_Sub3_Sub6(arg7, 0, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
			}
			arg3.method1825(arg1, arg2, arg5, local122, local195, null, Static142.anIntArray335[arg6], 0, local142, local148);
			if (local9.anInt2220 != 0) {
				arg0.method941(arg8, arg2, local9.aBoolean94, arg5, arg6);
			}
		} else if (arg8 == 1) {
			if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
				local195 = local9.method1574(local122, local130, local156, 1, local96, arg6);
			} else {
				local195 = new Class2_Sub1_Sub3_Sub6(arg7, 1, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
			}
			arg3.method1825(arg1, arg2, arg5, local122, local195, null, Static6.anIntArray13[arg6], 0, local142, local148);
			if (local9.anInt2220 != 0) {
				arg0.method941(arg8, arg2, local9.aBoolean94, arg5, arg6);
			}
		} else {
			@Pc(547) Class2_Sub1_Sub3 local547;
			@Pc(510) int local510;
			if (arg8 == 2) {
				local510 = arg6 + 1 & 0x3;
				@Pc(533) Class2_Sub1_Sub3 local533;
				if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
					local533 = local9.method1574(local122, local130, local156, 2, local96, arg6 + 4);
					local547 = local9.method1574(local122, local130, local156, 2, local96, local510);
				} else {
					local533 = new Class2_Sub1_Sub3_Sub6(arg7, 2, arg6 + 4, arg4, arg2, arg5, local9.anInt2231, true, null);
					local547 = new Class2_Sub1_Sub3_Sub6(arg7, 2, local510, arg4, arg2, arg5, local9.anInt2231, true, null);
				}
				arg3.method1825(arg1, arg2, arg5, local122, local533, local547, Static142.anIntArray335[arg6], Static142.anIntArray335[local510], local142, local148);
				if (local9.anInt2220 != 0) {
					arg0.method941(arg8, arg2, local9.aBoolean94, arg5, arg6);
				}
			} else if (arg8 == 3) {
				if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
					local195 = local9.method1574(local122, local130, local156, 3, local96, arg6);
				} else {
					local195 = new Class2_Sub1_Sub3_Sub6(arg7, 3, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
				}
				arg3.method1825(arg1, arg2, arg5, local122, local195, null, Static6.anIntArray13[arg6], 0, local142, local148);
				if (local9.anInt2220 != 0) {
					arg0.method941(arg8, arg2, local9.aBoolean94, arg5, arg6);
				}
			} else if (arg8 == 9) {
				if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
					local195 = local9.method1574(local122, local130, local156, arg8, local96, arg6);
				} else {
					local195 = new Class2_Sub1_Sub3_Sub6(arg7, arg8, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
				}
				arg3.method1801(arg1, arg2, arg5, local122, 1, 1, local195, 0, local142, local148);
				if (local9.anInt2220 != 0) {
					arg0.method944(local22, arg2, arg5, local25, local9.aBoolean94);
				}
			} else if (arg8 == 4) {
				if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
					local195 = local9.method1574(local122, local130, local156, 4, local96, arg6);
				} else {
					local195 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
				}
				arg3.method1794(arg1, arg2, arg5, local122, local195, null, Static142.anIntArray335[arg6], 0, 0, 0, local142, local148);
			} else {
				@Pc(801) int local801;
				if (arg8 == 5) {
					local510 = 16;
					local801 = arg3.method1785(arg1, arg2, arg5);
					if (local801 != 0) {
						local510 = Static62.method1106(local801 >> 14 & 0x7FFF).anInt2240;
					}
					if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
						local547 = local9.method1574(local122, local130, local156, 4, local96, arg6);
					} else {
						local547 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg6, arg4, arg2, arg5, local9.anInt2231, true, null);
					}
					arg3.method1794(arg1, arg2, arg5, local122, local547, null, Static142.anIntArray335[arg6], 0, Static50.anIntArray141[arg6] * local510, Static51.anIntArray142[arg6] * local510, local142, local148);
				} else if (arg8 == 6) {
					local801 = arg3.method1785(arg1, arg2, arg5);
					local510 = 8;
					if (local801 != 0) {
						local510 = Static62.method1106(local801 >> 14 & 0x7FFF).anInt2240 / 2;
					}
					if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
						local547 = local9.method1574(local122, local130, local156, 4, local96, arg6 + 4);
					} else {
						local547 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg6 + 4, arg4, arg2, arg5, local9.anInt2231, true, null);
					}
					arg3.method1794(arg1, arg2, arg5, local122, local547, null, 256, arg6, local510 * Static85.anIntArray212[arg6], Static87.anIntArray223[arg6] * local510, local142, local148);
				} else if (arg8 == 7) {
					local801 = arg6 + 2 & 0x3;
					if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
						local195 = local9.method1574(local122, local130, local156, 4, local96, local801 + 4);
					} else {
						local195 = new Class2_Sub1_Sub3_Sub6(arg7, 4, local801 + 4, arg4, arg2, arg5, local9.anInt2231, true, null);
					}
					arg3.method1794(arg1, arg2, arg5, local122, local195, null, 256, local801, 0, 0, local142, local148);
				} else if (arg8 == 8) {
					local801 = arg3.method1785(arg1, arg2, arg5);
					local510 = 8;
					if (local801 != 0) {
						local510 = Static62.method1106(local801 >> 14 & 0x7FFF).anInt2240 / 2;
					}
					@Pc(1062) int local1062 = arg6 + 2 & 0x3;
					@Pc(1094) Class2_Sub1_Sub3 local1094;
					if (local9.anInt2231 == -1 && local9.anIntArray234 == null) {
						local547 = local9.method1574(local122, local130, local156, 4, local96, arg6 + 4);
						local1094 = local9.method1574(local122, local130, local156, 4, local96, local1062 + 4);
					} else {
						local547 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg6 + 4, arg4, arg2, arg5, local9.anInt2231, true, null);
						local1094 = new Class2_Sub1_Sub3_Sub6(arg7, 4, local1062 + 4, arg4, arg2, arg5, local9.anInt2231, true, null);
					}
					arg3.method1794(arg1, arg2, arg5, local122, local547, local1094, 256, arg6, Static85.anIntArray212[arg6] * local510, Static87.anIntArray223[arg6] * local510, local142, local148);
				}
			}
		}
	}
}
