import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Loaded config";

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	public static int anInt4240 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method3950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(21) int local21 = arg1 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local57 - 3) * local45;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local61 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local101 * (arg1 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local21 - 1) * local113;
		@Pc(157) int[] local157 = Static327.anIntArrayArray63[arg5];
		Static97.method1784(arg0 - arg6, local157, arg4, arg0 - local16);
		Static97.method1784(arg0 - local16, local157, arg2, local16 + arg0);
		Static97.method1784(local16 + arg0, local157, arg4, arg0 + arg6);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local139;
					local70 += local121;
					local121 += local109;
					local139 += local109;
					local7++;
				}
			}
			if (local199) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local131;
						local97 += local147;
						local11++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local97 < 0) {
					local88 += local131;
					local97 += local147;
					local131 += local117;
					local11++;
					local147 += local117;
				}
				local88 += -local153;
				local97 += -local137;
				local137 -= local113;
				local153 -= local113;
			}
			if (local79 < 0) {
				local70 += local121;
				local79 += local139;
				local7++;
				local121 += local109;
				local139 += local109;
			}
			local79 += -local127;
			local70 += -local145;
			local9--;
			local145 -= local101;
			local127 -= local101;
			@Pc(339) int local339 = arg5 - local9;
			@Pc(343) int local343 = local9 + arg5;
			@Pc(347) int local347 = local7 + arg0;
			@Pc(352) int local352 = arg0 - local7;
			if (local199) {
				@Pc(359) int local359 = arg0 + local11;
				@Pc(363) int local363 = arg0 - local11;
				Static97.method1784(local352, Static327.anIntArrayArray63[local339], arg4, local363);
				Static97.method1784(local363, Static327.anIntArrayArray63[local339], arg2, local359);
				Static97.method1784(local359, Static327.anIntArrayArray63[local339], arg4, local347);
				Static97.method1784(local352, Static327.anIntArrayArray63[local343], arg4, local363);
				Static97.method1784(local363, Static327.anIntArrayArray63[local343], arg2, local359);
				Static97.method1784(local359, Static327.anIntArrayArray63[local343], arg4, local347);
			} else {
				Static97.method1784(local352, Static327.anIntArrayArray63[local339], arg4, local347);
				Static97.method1784(local352, Static327.anIntArrayArray63[local343], arg4, local347);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method3951(@OriginalArg(1) Class5_Sub3_Sub3_Sub1 arg0) {
		if (Static277.anInt6207 >= 400 || Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0) {
			return;
		}
		@Pc(144) String local144;
		@Pc(70) int local70;
		if (arg0.anInt3312 == 0) {
			@Pc(28) boolean local28 = true;
			if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3325 != -1 && arg0.anInt3325 != -1) {
				@Pc(49) int local49 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330 <= arg0.anInt3330 ? arg0.anInt3330 : Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330;
				@Pc(60) int local60 = arg0.anInt3325 <= Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3325 ? arg0.anInt3325 : Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3325;
				local70 = local60 + local49 * 10 / 100 + 5;
				@Pc(76) int local76 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330 - arg0.anInt3330;
				if (local76 < 0) {
					local76 = -local76;
				}
				if (local76 > local70) {
					local28 = false;
				}
			}
			@Pc(100) String local100 = Static341.anInt2259 == 1 ? Static1.aString2 : Static62.aString53;
			if (arg0.anInt3330 < arg0.anInt3317) {
				local144 = arg0.method3064() + (local28 ? Static262.method4605(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330, arg0.anInt3330) : "<col=ffffff>") + " (" + local100 + arg0.anInt3330 + "+" + (arg0.anInt3317 - arg0.anInt3330) + ")";
			} else {
				local144 = arg0.method3064() + (local28 ? Static262.method4605(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330, arg0.anInt3330) : "<col=ffffff>") + " (" + local100 + arg0.anInt3330 + ")";
			}
		} else {
			local144 = arg0.method3064() + " (" + Static16.aString9 + arg0.anInt3312 + ")";
		}
		if (Static243.anInt4739 == 1) {
			Static164.method3162(Static320.anInt6136, 0, Static285.aString222 + " -> <col=ffffff>" + local144, (long) arg0.anInt4920, 38, 0, Static313.aString241);
		} else if (!Static89.aBoolean156) {
			for (@Pc(232) int local232 = 7; local232 >= 0; local232--) {
				if (Static235.aStringArray32[local232] != null) {
					@Pc(240) short local240 = 0;
					if (Static341.anInt2259 == 0 && Static235.aStringArray32[local232].equalsIgnoreCase(Static302.aString192)) {
						if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330 < arg0.anInt3330) {
							local240 = 2000;
						}
						if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3316 != 0 && arg0.anInt3316 != 0) {
							if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3316 == arg0.anInt3316) {
								local240 = 2000;
							} else {
								local240 = 0;
							}
						}
					} else if (Static306.aBooleanArray29[local232]) {
						local240 = 2000;
					}
					@Pc(297) short local297 = (short) (Static232.aShortArray110[local232] + local240);
					local70 = Static192.anIntArray811[local232] == -1 ? Static57.anInt1269 : Static192.anIntArray811[local232];
					Static164.method3162(local70, 0, "<col=ffffff>" + local144, (long) arg0.anInt4920, local297, 0, Static235.aStringArray32[local232]);
				}
			}
		} else if ((Static95.anInt1903 & 0x8) != 0) {
			Static164.method3162(Static181.anInt3761, 0, Static144.aString113 + " -> <col=ffffff>" + local144, (long) arg0.anInt4920, 18, 0, Static21.aString15);
		}
		for (@Pc(376) Class1_Sub41 local376 = (Class1_Sub41) Static175.aClass195_36.method5029(); local376 != null; local376 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			if (local376.anInt6339 == 11) {
				local376.aString253 = "<col=ffffff>" + local144;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!qj;ILclient!qj;Lclient!aa;)V")
	public static void method3953(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) Class2 arg2) {
		Static95.aClass38_3 = Static179.method3492(arg1, Static195.anInt3974);
		Static105.aClass13_4 = arg2.method3306(Static95.aClass38_3, Static363.method3773(arg0, Static195.anInt3974));
		Static273.aClass38_8 = Static179.method3492(arg1, Static186.anInt3864);
		Static9.aClass13_1 = arg2.method3306(Static273.aClass38_8, Static363.method3773(arg0, Static186.anInt3864));
		Static180.aClass38_5 = Static179.method3492(arg1, Static135.anInt2701);
		Static302.aClass13_7 = arg2.method3306(Static180.aClass38_5, Static363.method3773(arg0, Static135.anInt2701));
	}
}
