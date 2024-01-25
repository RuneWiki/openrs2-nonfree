import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!gu;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	public static final int[] anIntArray105 = new int[8];

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
	public static int anInt682 = 0;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public static int anInt684 = 0;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[I")
	public static final int[] anIntArray106 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dq;)V")
	public static void method724(@OriginalArg(1) Class53 arg0) {
		@Pc(7) Class202 local7 = null;
		try {
			@Pc(16) Class1 local16 = arg0.method1170();
			while (local16.anInt2 == 0) {
				Static185.method3004(1L);
			}
			if (local16.anInt2 == 1) {
				local7 = (Class202) local16.anObject1;
				@Pc(35) Class2_Sub13 local35 = Static249.method3988();
				local7.method4944(0, local35.aByteArray77, local35.anInt4788);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method4940();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
	public static boolean method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static231.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static284.anInt5039) {
			return false;
		} else if (local7 == Static284.anInt5039) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static315.anInt5584;
			@Pc(26) int local26 = arg2 << Static315.anInt5584;
			if (Static286.method4398(local22 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg2), local26 + 1) && Static286.method4398(local22 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg2), local26 + 1) && Static286.method4398(local22 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg2 + 1), local26 + Static292.anInt5158 - 1) && Static286.method4398(local22 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg2 + 1), local26 + Static292.anInt5158 - 1)) {
				Static231.anIntArrayArrayArray9[arg0][arg1][arg2] = Static284.anInt5039;
				return true;
			} else {
				Static231.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static284.anInt5039;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
	public static void method726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class242 local3 = new Class242();
		local3.anInt6523 = arg1 >> Static315.anInt5584;
		local3.anInt6505 = arg2 >> Static315.anInt5584;
		local3.anInt6504 = arg3 >> Static315.anInt5584;
		local3.anInt6509 = arg4 >> Static315.anInt5584;
		local3.anInt6521 = arg0;
		local3.anInt6517 = arg1;
		local3.anInt6506 = arg2;
		local3.anInt6516 = arg3;
		local3.anInt6503 = arg4;
		local3.anInt6510 = arg5;
		local3.anInt6512 = arg6;
		Static196.aClass242Array1[Static224.anInt2647++] = local3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!lk;)V")
	public static void method727(@OriginalArg(1) Class2_Sub13 arg0) {
		if (arg0.aByteArray77.length - arg0.anInt4788 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4240();
		if (local19 < 0 || local19 > 15) {
			return;
		}
		@Pc(46) byte local46;
		if (local19 == 15) {
			local46 = 37;
		} else if (local19 == 14) {
			local46 = 36;
		} else if (local19 == 13) {
			local46 = 35;
		} else if (local19 == 12) {
			local46 = 34;
		} else if (local19 == 11) {
			local46 = 33;
		} else if (local19 == 10) {
			local46 = 32;
		} else if (local19 == 9) {
			local46 = 31;
		} else if (local19 == 8) {
			local46 = 30;
		} else if (local19 == 7) {
			local46 = 29;
		} else if (local19 == 6) {
			local46 = 28;
		} else if (local19 == 5) {
			local46 = 28;
		} else if (local19 == 4) {
			local46 = 24;
		} else if (local19 == 3) {
			local46 = 23;
		} else if (local19 == 2) {
			local46 = 22;
		} else if (local19 == 1) {
			local46 = 23;
		} else {
			local46 = 19;
		}
		if (arg0.aByteArray77.length - arg0.anInt4788 < local46) {
			return;
		}
		Static146.anInt2670 = arg0.method4240();
		if (Static146.anInt2670 < 1) {
			Static146.anInt2670 = 1;
		} else if (Static146.anInt2670 > 4) {
			Static146.anInt2670 = 4;
		}
		Static276.method4295(arg0.method4240() == 1);
		Static136.aBoolean194 = arg0.method4240() == 1;
		Static364.aBoolean378 = arg0.method4240() == 1;
		Static264.aBoolean341 = arg0.method4240() == 1;
		Static235.anInt4315 = arg0.method4240() == 1 ? 1 : 0;
		Static364.aBoolean379 = arg0.method4240() == 1;
		Static158.aBoolean211 = arg0.method4240() == 1;
		Static80.aBoolean128 = arg0.method4240() == 1;
		Static193.anInt6663 = arg0.method4240();
		if (Static193.anInt6663 > 2) {
			Static193.anInt6663 = 2;
		}
		if (local19 >= 2) {
			Static37.aBoolean52 = arg0.method4240() == 1;
		} else {
			Static37.aBoolean52 = arg0.method4240() == 1;
			arg0.method4240();
		}
		Static194.aBoolean254 = arg0.method4240() == 1;
		Static116.aBoolean177 = arg0.method4240() == 1;
		Static1.anInt41 = arg0.method4240();
		if (Static1.anInt41 > 2) {
			Static1.anInt41 = 2;
		}
		Static34.anInt734 = Static1.anInt41;
		Static265.aBoolean343 = arg0.method4240() == 1;
		Static107.anInt2129 = arg0.method4240();
		if (Static107.anInt2129 > 127) {
			Static107.anInt2129 = 127;
		}
		Static193.anInt6666 = arg0.method4240();
		Static16.anInt400 = arg0.method4240();
		if (Static16.anInt400 > 127) {
			Static16.anInt400 = 127;
		}
		if (local19 >= 1) {
			Static123.anInt2360 = arg0.method4245();
			Static11.anInt3910 = arg0.method4245();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method4240();
		}
		@Pc(381) int local381;
		if (local19 >= 4) {
			local381 = arg0.method4240();
			if (local381 < 0 || local381 > 2) {
				local381 = 0;
			}
			if (Static314.anInt5576 < 96) {
				local381 = 0;
			}
			Static346.method5275(local381);
		}
		if (local19 >= 5) {
			Static37.anInt767 = arg0.method4239();
		}
		local381 = 0;
		if (local19 >= 6) {
			Static365.anInt2296 = local381 = arg0.method4240();
		}
		if (Static365.anInt2296 != 1 && Static365.anInt2296 != 2) {
			Static365.anInt2296 = 2;
		}
		if (local19 >= 7) {
			Static117.aBoolean178 = arg0.method4240() == 1;
		}
		if (local19 >= 8) {
			Static223.aBoolean308 = arg0.method4240() == 1;
		}
		if (local19 >= 9) {
			Static301.anInt5429 = arg0.method4240();
		}
		if (Static301.anInt5429 < 0 || Static301.anInt5429 > Static45.method2429(Static314.anInt5576)) {
			Static301.anInt5429 = 0;
		}
		if (local19 >= 10) {
			Static168.aBoolean222 = arg0.method4240() != 0;
		}
		if (local19 >= 11) {
			Static180.aBoolean232 = arg0.method4240() != 0;
		}
		if (local19 >= 12) {
			Static235.anInt4315 = arg0.method4240();
		}
		if (Static235.anInt4315 < 0 || Static235.anInt4315 > 2) {
			Static235.anInt4315 = 1;
		}
		if (local19 >= 13) {
			Static265.aBoolean344 = arg0.method4240() == 1;
		}
		if (local19 >= 14) {
			Static193.anInt6668 = arg0.method4240();
		} else if (local381 == 0) {
			Static193.anInt6668 = 2;
		} else {
			Static193.anInt6668 = 1;
		}
		if (Static193.anInt6668 < 0 || Static193.anInt6668 > 3) {
			Static193.anInt6668 = 2;
		}
		if (local19 >= 15) {
			Static244.anInt1013 = arg0.method4240();
			if (Static244.anInt1013 < 0 || Static244.anInt1013 > 4) {
				Static244.anInt1013 = Static78.anInt1502 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!km;)V")
	public static void method729(@OriginalArg(1) Class82 arg0) {
		if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != Static345.anInt6062 && (Static297.aClass227ArrayArrayArray7 != null && Static158.method2639(arg0, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74))) {
			Static345.anInt6062 = Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIII)V")
	public static void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static118.anInt2269 = arg2;
		Static226.anInt4222 = arg3;
		Static32.anInt6040 = arg4;
		Static125.anInt2370 = arg5;
		Static193.anInt6660 = arg0;
		Static2.anInt3794 = arg1;
	}
}
