import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dn", name = "T", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array6;

	@OriginalMember(owner = "client!dn", name = "ab", descriptor = "Lclient!wg;")
	public static Class4_Sub3_Sub22 aClass4_Sub3_Sub22_1;

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "Z")
	public static boolean aBoolean66 = true;

	@OriginalMember(owner = "client!dn", name = "Z", descriptor = "I")
	public static int anInt1161 = 0;

	@OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
	public static int anInt1165 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZIZLclient!qk;IIIZ)Lclient!uj;")
	public static Class4_Sub3_Sub14 method965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class147 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) Class165 local9 = Static287.method4398(arg6);
		if (arg2 > 1 && local9.anIntArray552 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (local9.anIntArray551[local21] <= arg2 && local9.anIntArray551[local21] != 0) {
					local19 = local9.anIntArray552[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static287.method4398(local19);
			}
		}
		@Pc(61) Class53_Sub4_Sub1 local61 = local9.method4172(arg4);
		if (local61 == null) {
			return null;
		}
		@Pc(68) Class4_Sub3_Sub14_Sub1 local68 = null;
		if (local9.anInt5090 != -1) {
			local68 = (Class4_Sub3_Sub14_Sub1) method965(1, false, 10, true, arg4, 0, local9.anInt5101, true);
			if (local68 == null) {
				return null;
			}
		} else if (local9.anInt5078 != -1) {
			local68 = (Class4_Sub3_Sub14_Sub1) method965(arg0, false, arg2, false, arg4, arg5, local9.anInt5068, true);
			if (local68 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static270.anIntArray561;
		@Pc(118) int local118 = Static270.anInt5185;
		@Pc(121) int[] local121 = new int[4];
		@Pc(123) int local123 = Static270.anInt5189;
		Static270.method4260(local121);
		@Pc(131) Class4_Sub3_Sub14_Sub1 local131 = new Class4_Sub3_Sub14_Sub1(36, 32);
		Static270.method4261(local131.anIntArray241, 36, 32);
		Static158.method2574();
		Static158.method2569(16, 16);
		Static158.aBoolean216 = false;
		@Pc(145) int local145 = local9.anInt5058;
		if (arg3) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg0 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(174) int local174 = local145 * Class111.anIntArray298[local9.anInt5081] >> 16;
		@Pc(191) int local191 = Class111.anIntArray299[local9.anInt5081] * local145 >> 16;
		local61.method3859(local9.anInt5096, local9.anInt5063, local9.anInt5081, local9.anInt5066, local191 + local9.anInt5099 - local61.method3850() / 2, local9.anInt5099 + local174, -1L);
		if (arg0 >= 1) {
			local131.method2175(1);
			if (arg0 >= 2) {
				local131.method2175(16777215);
			}
			Static270.method4261(local131.anIntArray241, 36, 32);
		}
		if (arg5 != 0) {
			local131.method2169(arg5);
		}
		if (local9.anInt5090 != -1) {
			local68.method4543(0, 0);
		} else if (local9.anInt5078 != -1) {
			Static270.method4261(local68.anIntArray241, 36, 32);
			local131.method4543(0, 0);
			local131 = local68;
		}
		if (arg1 && (local9.anInt5076 == 1 || arg2 != 1) && arg2 != -1) {
			Static18.aClass4_Sub3_Sub5_Sub2_1.method2266(Static54.method892(arg2), 0, 9, 16776960, 1);
		}
		Static270.method4261(local116, local123, local118);
		Static270.method4263(local121);
		Static158.method2574();
		Static158.aBoolean216 = true;
		return Static94.aBoolean138 && !arg7 ? new Class4_Sub3_Sub14_Sub2(local131) : local131;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	public static void method966(@OriginalArg(0) int arg0) {
		if (!Static61.aBoolean69) {
			arg0 = -1;
		}
		if (Static282.anInt5346 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class135 local23 = Static149.method2397(arg0);
			@Pc(27) Class4_Sub3_Sub14_Sub1 local27 = local23.method3414();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static276.aClass139_4.method3510(new Point(local23.anInt4119, local23.anInt4111), local27.anInt5613, local27.method2171(), local27.anInt5603, Static188.aCanvas115);
				Static282.anInt5346 = arg0;
			}
		}
		if (arg0 == -1 && Static282.anInt5346 != -1) {
			Static276.aClass139_4.method3510(new Point(), -1, null, -1, Static188.aCanvas115);
			Static282.anInt5346 = -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) Class4_Sub30 local3 = new Class4_Sub30();
		local3.anInt4995 = arg6;
		local3.anInt4998 = arg3;
		local3.anInt5008 = arg10;
		local3.anInt5011 = arg11;
		local3.anInt4999 = arg4;
		local3.anInt5009 = arg5;
		local3.anInt5005 = arg7;
		local3.anInt4996 = arg0;
		local3.anInt5000 = arg2;
		local3.anInt4994 = arg9;
		local3.anInt4993 = arg1;
		local3.anInt5004 = arg8;
		Static221.aClass114_27.method2625(local3);
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void method968() {
		Static119.method1856();
		Static254.anInterface2Array1 = new Interface2[8];
		Static254.anInterface2Array1[1] = new Class82();
		Static254.anInterface2Array1[2] = new Class70();
		Static254.anInterface2Array1[3] = new Class21();
		Static254.anInterface2Array1[4] = new Class16();
		Static254.anInterface2Array1[5] = new Class23();
		Static254.anInterface2Array1[6] = new Class142();
		Static254.anInterface2Array1[7] = new Class6();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IIIIII)V")
	public static void method970(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class145 local13 = local7.aClass145_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4295;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class169 local58 = local7.aClass169_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt5225;
		@Pc(67) int local67 = local58.anInt5227;
		@Pc(70) int local70 = local58.anInt5228;
		@Pc(73) int local73 = local58.anInt5226;
		@Pc(77) int[] local77 = Static177.anIntArrayArray28[local23];
		@Pc(81) int[] local81 = Static233.anIntArrayArray25[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
	public static void method971() {
		Static310.anInt6026 = -1;
		Static107.anInt5398 = 2;
		Static85.aClass58_42 = null;
		Static227.anInt4358 = 1;
		Static63.anInt1244 = -1;
		Static242.aBoolean322 = false;
		Static287.anInt5392 = 0;
	}
}
