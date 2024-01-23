import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "Lclient!nc;")
	public static Class2_Sub3_Sub7 aClass2_Sub3_Sub7_1;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
	public static volatile int anInt1617 = 0;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "[I")
	public static int[] anIntArray276 = new int[100];

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
	public static int anInt1622 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZZZIZII)Lclient!gd;")
	public static Class2_Sub3_Sub8 method1250(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(9) Class2_Sub3_Sub23 local9 = Static32.method3209(arg3);
		if (arg0 > 1 && local9.anIntArray572 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg0 >= local9.anIntArray573[local21] && local9.anIntArray573[local21] != 0) {
					local19 = local9.anIntArray572[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static32.method3209(local19);
			}
		}
		@Pc(58) Class5_Sub3_Sub1 local58 = local9.method2735();
		if (local58 == null) {
			return null;
		}
		@Pc(64) Class2_Sub3_Sub8_Sub1 local64 = null;
		if (local9.anInt3495 != -1) {
			local64 = (Class2_Sub3_Sub8_Sub1) method1250(10, false, true, local9.anInt3476, 0, 1);
			if (local64 == null) {
				return null;
			}
		} else if (local9.anInt3510 != -1) {
			local64 = (Class2_Sub3_Sub8_Sub1) method1250(arg0, false, false, local9.anInt3529, arg4, arg5);
			if (local64 == null) {
				return null;
			}
		}
		@Pc(107) int[] local107 = Static217.anIntArray752;
		@Pc(109) int local109 = Static217.anInt4732;
		@Pc(111) int local111 = Static217.anInt4733;
		@Pc(114) int[] local114 = new int[4];
		Static217.method3755(local114);
		@Pc(122) Class2_Sub3_Sub8_Sub1 local122 = new Class2_Sub3_Sub8_Sub1(36, 32);
		Static217.method3765(local122.anIntArray470, 36, 32);
		Static163.method2944();
		Static163.method2939(16, 16);
		@Pc(134) int local134 = local9.anInt3518;
		Static163.aBoolean161 = false;
		if (arg2) {
			local134 = (int) ((double) local134 * 1.5D);
		} else if (arg5 == 2) {
			local134 = (int) ((double) local134 * 1.04D);
		}
		@Pc(164) int local164 = local134 * Class77.anIntArray631[local9.anInt3483] >> 16;
		@Pc(173) int local173 = Class77.anIntArray632[local9.anInt3483] * local134 >> 16;
		local58.method1415(local9.anInt3492, local9.anInt3514, local9.anInt3483, local9.anInt3511, local164 + local9.anInt3494 - local58.method3773() / 2, local9.anInt3494 + local173);
		if (arg5 >= 1) {
			local122.method2277(1);
			if (arg5 >= 2) {
				local122.method2277(16777215);
			}
			Static217.method3765(local122.anIntArray470, 36, 32);
		}
		if (arg4 != 0) {
			local122.method2270(arg4);
		}
		if (local9.anInt3495 != -1) {
			local64.method2262(0, 0);
		} else if (local9.anInt3510 != -1) {
			Static217.method3765(local64.anIntArray470, 36, 32);
			local122.method2262(0, 0);
			local122 = local64;
		}
		if (arg1 && (local9.anInt3505 == 1 || arg0 != 1) && arg0 != -1) {
			Static216.aClass2_Sub3_Sub7_Sub1_Sub1_4.method904(Static53.method1332(arg0), 0, 9, 16776960, 1);
		}
		Static217.method3765(local107, local109, local111);
		Static217.method3752(local114);
		Static163.method2944();
		Static163.aBoolean161 = true;
		return local122;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Lclient!vd;")
	public static Class106 method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass106_1 == null ? null : local7.aClass106_1;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Z")
	public static boolean method1252(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILclient!qf;IJIIII)Z")
	public static boolean method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static44.method588(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
	public static void method1257() {
		@Pc(5) int local5 = aClass2_Sub3_Sub7_1.method883(Static80.aClass78_386);
		@Pc(21) int local21;
		for (@Pc(11) int local11 = 0; local11 < Static138.anInt3182; local11++) {
			local21 = aClass2_Sub3_Sub7_1.method883(Static18.method263(local11));
			if (local21 > local5) {
				local5 = local21;
			}
		}
		Static202.aBoolean194 = true;
		local5 += 8;
		Static224.anInt4847 = local5;
		local21 = Static138.anInt3182 * 15 + 21;
		Static207.anInt4608 = Static138.anInt3182 * 15 + 22;
		@Pc(58) int local58 = Static205.anInt740 - local5 / 2;
		if (Static134.anInt3131 < local5 + local58) {
			local58 = Static134.anInt3131 - local5;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(74) int local74 = Static55.anInt981;
		if (Static30.anInt546 < local21 + local74) {
			local74 = Static30.anInt546 - local21;
		}
		Static100.anInt2201 = local58;
		if (local74 < 0) {
			local74 = 0;
		}
		Static189.anInt4406 = local74;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!bk;IIIIIIZ)V")
	public static void method1258(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray63.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray63[local5] - Static181.anInt4199;
			local20 = arg0.anIntArray67[local5] - Static53.anInt1723;
			local27 = arg0.anIntArray54[local5] - Static59.anInt1039;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray55 != null) {
				Static24.anIntArray65[local5] = local37;
				Static24.anIntArray57[local5] = local59;
				Static24.anIntArray60[local5] = local69;
			}
			Static24.anIntArray62[local5] = Static163.anInt3760 + (local37 << 9) / local69;
			Static24.anIntArray58[local5] = Static163.anInt3759 + (local59 << 9) / local69;
		}
		Static163.anInt3758 = 0;
		local3 = arg0.anIntArray68.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray68[local13];
			local27 = arg0.anIntArray64[local13];
			local37 = arg0.anIntArray61[local13];
			@Pc(142) int local142 = Static24.anIntArray62[local20];
			@Pc(146) int local146 = Static24.anIntArray62[local27];
			@Pc(150) int local150 = Static24.anIntArray62[local37];
			@Pc(154) int local154 = Static24.anIntArray58[local20];
			@Pc(158) int local158 = Static24.anIntArray58[local27];
			@Pc(162) int local162 = Static24.anIntArray58[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static194.aBoolean191 && Static195.method3538(Static113.anInt2494 + Static163.anInt3760, Static225.anInt4883 + Static163.anInt3759, local154, local158, local162, local142, local146, local150)) {
					Static219.anInt4760 = arg5;
					Static84.anInt1809 = arg6;
				}
				if (!arg7) {
					Static163.aBoolean165 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static163.anInt3756 || local146 > Static163.anInt3756 || local150 > Static163.anInt3756) {
						Static163.aBoolean165 = true;
					}
					if (arg0.anIntArray55 == null || arg0.anIntArray55[local13] == -1) {
						if (arg0.anIntArray56[local13] != 12345678) {
							Static163.method2943(local154, local158, local162, local142, local146, local150, arg0.anIntArray56[local13], arg0.anIntArray59[local13], arg0.anIntArray66[local13]);
						}
					} else if (!Static175.aBoolean175) {
						@Pc(369) int local369 = Static163.anInterface4_1.method759(arg0.anIntArray55[local13]);
						Static163.method2943(local154, local158, local162, local142, local146, local150, Static188.method3480(local369, arg0.anIntArray56[local13]), Static188.method3480(local369, arg0.anIntArray59[local13]), Static188.method3480(local369, arg0.anIntArray66[local13]));
					} else if (arg0.aBoolean14) {
						Static163.method2947(local154, local158, local162, local142, local146, local150, arg0.anIntArray56[local13], arg0.anIntArray59[local13], arg0.anIntArray66[local13], Static24.anIntArray65[0], Static24.anIntArray65[1], Static24.anIntArray65[3], Static24.anIntArray57[0], Static24.anIntArray57[1], Static24.anIntArray57[3], Static24.anIntArray60[0], Static24.anIntArray60[1], Static24.anIntArray60[3], arg0.anIntArray55[local13]);
					} else {
						Static163.method2947(local154, local158, local162, local142, local146, local150, arg0.anIntArray56[local13], arg0.anIntArray59[local13], arg0.anIntArray66[local13], Static24.anIntArray65[local20], Static24.anIntArray65[local27], Static24.anIntArray65[local37], Static24.anIntArray57[local20], Static24.anIntArray57[local27], Static24.anIntArray57[local37], Static24.anIntArray60[local20], Static24.anIntArray60[local27], Static24.anIntArray60[local37], arg0.anIntArray55[local13]);
					}
				}
			}
		}
	}
}
