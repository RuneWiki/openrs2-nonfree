import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mj", name = "mb", descriptor = "Lclient!kha;")
	public static Class181 aClass181_64;

	@OriginalMember(owner = "client!mj", name = "ib", descriptor = "Z")
	public static boolean aBoolean590 = false;

	@OriginalMember(owner = "client!mj", name = "kb", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_8 = new Class229("", 12);

	@OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
	public static int anInt6850 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!rj;Lclient!mb;I)V")
	public static void method5726(@OriginalArg(0) int arg0, @OriginalArg(1) Class290 arg1, @OriginalArg(2) Class2_Sub3 arg2) {
		if (Static224.anInt5125 >= 50 || (arg1 == null || arg1.anIntArrayArray87 == null || arg0 >= arg1.anIntArrayArray87.length || arg1.anIntArrayArray87[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray87[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray87[arg0].length > 1) {
			local65 = (int) (Math.random() * (double) arg1.anIntArrayArray87[arg0].length);
			if (local65 > 0) {
				local38 = arg1.anIntArrayArray87[arg0][local65];
			}
		}
		local65 = 256;
		if (arg1.anIntArray544 != null && arg1.anIntArray549 != null) {
			local65 = arg1.anIntArray544[arg0] + (int) (Math.random() * (double) (arg1.anIntArray549[arg0] - arg1.anIntArray544[arg0]));
		}
		@Pc(111) int local111 = arg1.anIntArray545 == null ? 255 : arg1.anIntArray545[arg0];
		if (local48 == 0) {
			if (arg2 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2) {
				if (arg1.aBoolean736) {
					Static474.method7012(0, local111, local38, local65, false, local44);
					return;
				}
				Static167.method3515(local111, local38, local65, local44, 0);
			}
		} else if (Static552.aClass3_Sub48_30.aClass23_Sub8_3.method3378() != 0) {
			@Pc(157) int local157 = arg2.anInt10428 - 256 >> 9;
			@Pc(164) int local164 = arg2.anInt10424 - 256 >> 9;
			@Pc(186) int local186 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == arg2 ? 0 : local48 + (arg2.aByte128 << 24) - (-(local157 << 16) - (local164 << 8));
			Static620.aClass208Array1[Static224.anInt5125++] = new Class208((byte) (arg1.aBoolean736 ? 2 : 1), local38, local44, 0, local111, local186, local65, arg2);
		}
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
	public static void method5727() {
		Static401.aClass112_45.method3643();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 8 - 1) / 8);
		@Pc(44) int local44 = -((arg1 + 8 - 1) / 8);
		for (@Pc(46) int local46 = local29; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local44; local50 < 0; local50++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local13;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public static void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class106 local28 = Static170.aClass106ArrayArrayArray1[local9][arg0][arg1] = Static170.aClass106ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class243 local33 = local28.aClass243_1; local33 != null; local33 = local33.aClass243_3) {
					@Pc(37) Class2_Sub3_Sub1 local37 = local33.aClass2_Sub3_Sub1_1;
					if (local37.aShort121 == arg0 && local37.aShort124 == arg1) {
						local37.aByte128--;
					}
				}
				if (local28.aClass2_Sub3_Sub5_1 != null) {
					local28.aClass2_Sub3_Sub5_1.aByte128--;
				}
				if (local28.aClass2_Sub3_Sub2_2 != null) {
					local28.aClass2_Sub3_Sub2_2.aByte128--;
				}
				if (local28.aClass2_Sub3_Sub2_1 != null) {
					local28.aClass2_Sub3_Sub2_1.aByte128--;
				}
				if (local28.aClass2_Sub3_Sub3_1 != null) {
					local28.aClass2_Sub3_Sub3_1.aByte128--;
				}
				if (local28.aClass2_Sub3_Sub3_2 != null) {
					local28.aClass2_Sub3_Sub3_2.aByte128--;
				}
			}
		}
		if (Static170.aClass106ArrayArrayArray1[0][arg0][arg1] == null) {
			Static170.aClass106ArrayArrayArray1[0][arg0][arg1] = new Class106(0);
			Static170.aClass106ArrayArrayArray1[0][arg0][arg1].aByte46 = 1;
		}
		Static170.aClass106ArrayArrayArray1[0][arg0][arg1].aClass106_1 = local7;
		Static170.aClass106ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method5731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class108 local8 = Static526.method6818(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray21 != null) {
			@Pc(18) Class3_Sub51 local18 = new Class3_Sub51();
			local18.aClass108_13 = local8;
			local18.aString113 = arg2;
			local18.anInt10308 = arg1;
			local18.anObjectArray33 = local8.anObjectArray21;
			Static84.method2222(local18);
		}
		if (Static581.anInt9720 != 10 || !Static71.method1836(local8).method1188(arg1 - 1)) {
			return;
		}
		@Pc(62) Class3_Sub26 local62;
		if (arg1 == 1) {
			local62 = Static640.method8636(Static566.aClass344_117, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local62, arg0, arg3);
			Static472.method5189(local62);
		}
		if (arg1 == 2) {
			local62 = Static640.method8636(Static523.aClass344_111, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local62, arg0, arg3);
			Static472.method5189(local62);
		}
		@Pc(118) Class3_Sub26 local118;
		if (arg1 == 3) {
			local118 = Static640.method8636(Static276.aClass344_69, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 4) {
			local118 = Static640.method8636(Static199.aClass344_48, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 5) {
			local118 = Static640.method8636(Static471.aClass344_98, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 6) {
			local118 = Static640.method8636(Static189.aClass344_46, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 7) {
			local118 = Static640.method8636(Static29.aClass344_9, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 8) {
			local118 = Static640.method8636(Static630.aClass344_127, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 9) {
			local118 = Static640.method8636(Static403.aClass344_42, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
		if (arg1 == 10) {
			local118 = Static640.method8636(Static348.aClass344_27, Static403.aClass294_3);
			Static280.method4952(local8.anInt4059, local118, arg0, arg3);
			Static472.method5189(local118);
		}
	}
}
