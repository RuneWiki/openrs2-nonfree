import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!bc;")
	public static Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!le;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
	public static int[] anIntArray92 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_308 = Static41.method597("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ge;IIIIILclient!le;III)V")
	public static void method477(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class4_Sub3_Sub3 local9 = Static76.method1244(arg6);
		@Pc(31) int local31;
		@Pc(28) int local28;
		if (arg4 == 1 || arg4 == 3) {
			local28 = local9.anInt760;
			local31 = local9.anInt750;
		} else {
			local31 = local9.anInt760;
			local28 = local9.anInt750;
		}
		@Pc(50) int local50;
		@Pc(58) int local58;
		if (local28 + arg2 <= 104) {
			local50 = arg2 + (local28 >> 1);
			local58 = (local28 + 1 >> 1) + arg2;
		} else {
			local50 = arg2;
			local58 = arg2 + 1;
		}
		@Pc(70) int[][] local70 = Static16.anIntArrayArrayArray1[arg1];
		@Pc(90) int local90;
		@Pc(84) int local84;
		if (local31 + arg3 <= 104) {
			local84 = arg3 + (local31 + 1 >> 1);
			local90 = arg3 + (local31 >> 1);
		} else {
			local90 = arg3;
			local84 = arg3 + 1;
		}
		@Pc(124) int local124 = local70[local84][local58] + local70[local90][local58] + local70[local84][local50] + local70[local90][local50] >> 2;
		@Pc(132) int local132 = (local28 << 6) + (arg2 << 7);
		@Pc(140) int local140 = (local31 << 6) + (arg3 << 7);
		@Pc(153) int local153 = (arg6 << 14) + (arg3 + (arg2 << 7)) + 1073741824;
		@Pc(160) int local160 = (arg4 << 6) + arg7;
		if (local9.anInt745 == 1) {
			local160 += 256;
		}
		if (local9.anInt738 == 0) {
			local153 += Integer.MIN_VALUE;
		}
		@Pc(194) Class4_Sub3_Sub1 local194;
		if (arg7 == 22) {
			if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
				local194 = local9.method397(22, local124, local70, local140, local132, arg4);
			} else {
				local194 = new Class4_Sub3_Sub1_Sub6(arg6, 22, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
			}
			arg5.method1011(arg8, arg3, arg2, local124, local194, local153, local160);
			if (local9.anInt732 == 1) {
				arg0.method605(arg2, arg3);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
				local194 = local9.method397(10, local124, local70, local140, local132, arg4);
			} else {
				local194 = new Class4_Sub3_Sub1_Sub6(arg6, 10, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
			}
			if (local194 != null) {
				arg5.method1006(arg8, arg3, arg2, local124, local31, local28, local194, arg7 == 11 ? 256 : 0, local153, local160);
			}
			if (local9.anInt732 != 0) {
				arg0.method609(arg2, local28, arg3, local31, local9.aBoolean28);
			}
		} else if (arg7 >= 12) {
			if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
				local194 = local9.method397(arg7, local124, local70, local140, local132, arg4);
			} else {
				local194 = new Class4_Sub3_Sub1_Sub6(arg6, arg7, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
			}
			arg5.method1006(arg8, arg3, arg2, local124, 1, 1, local194, 0, local153, local160);
			if (local9.anInt732 != 0) {
				arg0.method609(arg2, local28, arg3, local31, local9.aBoolean28);
			}
		} else if (arg7 == 0) {
			if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
				local194 = local9.method397(0, local124, local70, local140, local132, arg4);
			} else {
				local194 = new Class4_Sub3_Sub1_Sub6(arg6, 0, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
			}
			arg5.method1012(arg8, arg3, arg2, local124, local194, null, Static80.anIntArray220[arg4], 0, local153, local160);
			if (local9.anInt732 != 0) {
				arg0.method613(local9.aBoolean28, arg4, arg7, arg3, arg2);
			}
		} else if (arg7 == 1) {
			if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
				local194 = local9.method397(1, local124, local70, local140, local132, arg4);
			} else {
				local194 = new Class4_Sub3_Sub1_Sub6(arg6, 1, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
			}
			arg5.method1012(arg8, arg3, arg2, local124, local194, null, Static119.anIntArray338[arg4], 0, local153, local160);
			if (local9.anInt732 != 0) {
				arg0.method613(local9.aBoolean28, arg4, arg7, arg3, arg2);
			}
		} else {
			@Pc(539) Class4_Sub3_Sub1 local539;
			@Pc(510) int local510;
			if (arg7 == 2) {
				local510 = arg4 + 1 & 0x3;
				@Pc(529) Class4_Sub3_Sub1 local529;
				if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
					local529 = local9.method397(2, local124, local70, local140, local132, arg4 + 4);
					local539 = local9.method397(2, local124, local70, local140, local132, local510);
				} else {
					local529 = new Class4_Sub3_Sub1_Sub6(arg6, 2, arg4 + 4, arg1, arg3, arg2, local9.anInt753, true, null);
					local539 = new Class4_Sub3_Sub1_Sub6(arg6, 2, local510, arg1, arg3, arg2, local9.anInt753, true, null);
				}
				arg5.method1012(arg8, arg3, arg2, local124, local529, local539, Static80.anIntArray220[arg4], Static80.anIntArray220[local510], local153, local160);
				if (local9.anInt732 != 0) {
					arg0.method613(local9.aBoolean28, arg4, arg7, arg3, arg2);
				}
			} else if (arg7 == 3) {
				if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
					local194 = local9.method397(3, local124, local70, local140, local132, arg4);
				} else {
					local194 = new Class4_Sub3_Sub1_Sub6(arg6, 3, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
				}
				arg5.method1012(arg8, arg3, arg2, local124, local194, null, Static119.anIntArray338[arg4], 0, local153, local160);
				if (local9.anInt732 != 0) {
					arg0.method613(local9.aBoolean28, arg4, arg7, arg3, arg2);
				}
			} else if (arg7 == 9) {
				if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
					local194 = local9.method397(arg7, local124, local70, local140, local132, arg4);
				} else {
					local194 = new Class4_Sub3_Sub1_Sub6(arg6, arg7, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
				}
				arg5.method1006(arg8, arg3, arg2, local124, 1, 1, local194, 0, local153, local160);
				if (local9.anInt732 != 0) {
					arg0.method609(arg2, local28, arg3, local31, local9.aBoolean28);
				}
			} else if (arg7 == 4) {
				if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
					local194 = local9.method397(4, local124, local70, local140, local132, arg4);
				} else {
					local194 = new Class4_Sub3_Sub1_Sub6(arg6, 4, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
				}
				arg5.method1035(arg8, arg3, arg2, local124, local194, null, Static80.anIntArray220[arg4], 0, 0, 0, local153, local160);
			} else {
				@Pc(803) int local803;
				if (arg7 == 5) {
					local510 = 16;
					local803 = arg5.method1015(arg8, arg3, arg2);
					if (local803 != 0) {
						local510 = Static76.method1244(local803 >> 14 & 0x7FFF).anInt764;
					}
					if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
						local539 = local9.method397(4, local124, local70, local140, local132, arg4);
					} else {
						local539 = new Class4_Sub3_Sub1_Sub6(arg6, 4, arg4, arg1, arg3, arg2, local9.anInt753, true, null);
					}
					arg5.method1035(arg8, arg3, arg2, local124, local539, null, Static80.anIntArray220[arg4], 0, Static19.anIntArray77[arg4] * local510, Static70.anIntArray195[arg4] * local510, local153, local160);
				} else if (arg7 == 6) {
					local510 = 8;
					local803 = arg5.method1015(arg8, arg3, arg2);
					if (local803 != 0) {
						local510 = Static76.method1244(local803 >> 14 & 0x7FFF).anInt764 / 2;
					}
					if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
						local539 = local9.method397(4, local124, local70, local140, local132, arg4 + 4);
					} else {
						local539 = new Class4_Sub3_Sub1_Sub6(arg6, 4, arg4 + 4, arg1, arg3, arg2, local9.anInt753, true, null);
					}
					arg5.method1035(arg8, arg3, arg2, local124, local539, null, 256, arg4, local510 * Static59.anIntArray172[arg4], local510 * Static77.anIntArray217[arg4], local153, local160);
				} else if (arg7 == 7) {
					local803 = arg4 + 2 & 0x3;
					if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
						local194 = local9.method397(4, local124, local70, local140, local132, local803 + 4);
					} else {
						local194 = new Class4_Sub3_Sub1_Sub6(arg6, 4, local803 + 4, arg1, arg3, arg2, local9.anInt753, true, null);
					}
					arg5.method1035(arg8, arg3, arg2, local124, local194, null, 256, local803, 0, 0, local153, local160);
				} else if (arg7 == 8) {
					local803 = arg5.method1015(arg8, arg3, arg2);
					local510 = 8;
					if (local803 != 0) {
						local510 = Static76.method1244(local803 >> 14 & 0x7FFF).anInt764 / 2;
					}
					@Pc(1053) int local1053 = arg4 + 2 & 0x3;
					@Pc(1092) Class4_Sub3_Sub1 local1092;
					if (local9.anInt753 == -1 && local9.anIntArray81 == null) {
						local539 = local9.method397(4, local124, local70, local140, local132, arg4 + 4);
						local1092 = local9.method397(4, local124, local70, local140, local132, local1053 + 4);
					} else {
						local539 = new Class4_Sub3_Sub1_Sub6(arg6, 4, arg4 + 4, arg1, arg3, arg2, local9.anInt753, true, null);
						local1092 = new Class4_Sub3_Sub1_Sub6(arg6, 4, local1053 + 4, arg1, arg3, arg2, local9.anInt753, true, null);
					}
					arg5.method1035(arg8, arg3, arg2, local124, local539, local1092, 256, arg4, Static59.anIntArray172[arg4] * local510, local510 * Static77.anIntArray217[arg4], local153, local160);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method479() {
		aClass48_1 = null;
		anIntArray92 = null;
		aClass60_308 = null;
		aClass4_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method480() {
		Static72.anInt1827 = 2;
		Static9.anInt112 = 1;
		Static44.anInt2165 = -1;
		Static82.aClass10_22 = null;
		Static118.anInt2733 = 0;
		Static133.aBoolean128 = false;
		Static130.anInt2874 = -1;
	}
}
