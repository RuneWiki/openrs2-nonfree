import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qj", name = "F", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	public static int anInt5003 = -1;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)Z")
	public static boolean method4342() {
		return Static151.anInt3239 != 0 || Static244.anInt4842 >= 2;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(ZI)V")
	public static void method4343(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static248.aByteArrayArray16;
			local9 = 1;
		} else {
			local9 = 4;
			local11 = Static75.aByteArrayArray7;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(40) int local40;
		@Pc(53) int local53;
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(30) int[] local30 = null;
			@Pc(34) byte[] local34 = local11[local26];
			local40 = Static94.anIntArray311[local26] >> 8;
			@Pc(46) int local46 = Static94.anIntArray311[local26] & 0xFF;
			local53 = local40 * 64 - Static350.anInt6609;
			@Pc(59) int local59 = local46 * 64 - Static237.anInt4696;
			if (local34 != null) {
				Static263.method4429();
				local30 = Static248.method4270(local53, local9, Static237.anInt4696, Static128.aClass89_3, local59, local34, arg0, Static327.aClass149Array1, Static350.anInt6609);
			}
			if (!arg0 && local40 == Static101.anInt2445 / 8 && local46 == Static237.anInt4697 / 8) {
				if (local30 == null) {
					Static62.aClass46_1 = null;
				} else {
					Static62.aClass46_1 = Static251.method5278(local30[2], local30[1], local30[0], local30[3]);
					Static263.anInt5170 = local30[4];
				}
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local20; local118++) {
			@Pc(131) int local131 = (Static94.anIntArray311[local118] >> 8) * 64 - Static350.anInt6609;
			local40 = (Static94.anIntArray311[local118] & 0xFF) * 64 - Static237.anInt4696;
			@Pc(146) byte[] local146 = local11[local118];
			if (local146 == null && Static237.anInt4697 < 800) {
				Static263.method4429();
				for (local53 = 0; local53 < local9; local53++) {
					Static342.method5550(local53, 64, 64, local131, local40);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
	public static void method4344() {
		if (Static193.aClass61_1 != null) {
			Static193.aClass61_1.method1376();
			Static193.aClass61_1 = null;
		}
		Static143.method3641();
		Static126.method2605();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static327.aClass149Array1[local15].method3954();
		}
		Static319.method5154(false);
		System.gc();
		Static203.method3600();
		Static149.anInt3231 = -1;
		Static85.aBoolean152 = false;
		Static163.method3111(true);
		Static350.anInt6609 = 0;
		Static336.aBoolean324 = false;
		Static237.anInt4696 = 0;
		Static101.anInt2445 = 0;
		Static237.anInt4697 = 0;
		for (@Pc(59) int local59 = 0; local59 < Static174.aClass50Array1.length; local59++) {
			Static174.aClass50Array1[local59] = null;
		}
		Static11.anInt3203 = 0;
		Static223.anInt4466 = 0;
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static157.aClass22_Sub2_Sub1_Sub1Array1[local75] = null;
			Static74.aClass7_Sub3Array1[local75] = null;
		}
		for (@Pc(92) int local92 = 0; local92 < 32768; local92++) {
			Static69.aClass22_Sub2_Sub1_Sub2Array1[local92] = null;
		}
		Static185.aClass10_33.method156();
		Static82.method1754();
		Static168.anInt3502 = 0;
		Static78.method5357();
		Static280.method4175();
		Static131.method2644();
		Static280.method4170(true);
		try {
			Static362.method3353("loggedout", Static116.aClass21_4.anApplet1);
		} catch (@Pc(125) Throwable local125) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(CB)Z")
	public static boolean method4345(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method4347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static264.method4436(arg0)) {
			Static77.method1575(arg2, arg7, arg4, arg1, Static298.aClass26ArrayArray1[arg0], arg6, arg3, arg5, -1);
		} else if (arg4 == -1) {
			for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
				Static276.aBooleanArray27[local26] = true;
			}
		} else {
			Static276.aBooleanArray27[arg4] = true;
		}
	}
}
