import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_270 = new Class56(67, 4);

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_59 = new Class137(50);

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
	public static int anInt7608 = 0;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Z")
	public static boolean method6024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method6025(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub9 local12 = new Class4_Sub9(arg0);
		@Pc(25) int local25 = -1;
		label70: while (true) {
			@Pc(29) int local29 = local12.method4995();
			if (local29 == 0) {
				return local7;
			}
			local25 += local29;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(107) Class114 local107;
				do {
					@Pc(77) int local77;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local12.method5033();
										if (local45 == 0) {
											continue label70;
										}
										local12.method5007();
									}
									local45 = local12.method5033();
									if (local45 == 0) {
										continue label70;
									}
									local37 += local45 - 1;
									@Pc(60) int local60 = local37 & 0x3F;
									@Pc(66) int local66 = local37 >> 6 & 0x3F;
									local72 = local12.method5007() >> 2;
									local77 = local66 + arg2;
									local81 = arg1 + local60;
								} while (local77 <= 0);
							} while (local81 <= 0);
						} while (local77 >= arg4 - 1);
					} while (arg3 - 1 <= local81);
					local107 = Static51.aClass151_1.method2917(local25);
				} while (local72 == 22 && !Static413.aClass49_Sub1_1.aBoolean233 && local107.anInt2871 == 0 && local107.anInt2833 != 1 && !local107.aBoolean209);
				if (!local107.method2188()) {
					local7 = false;
					Static294.anInt4838++;
				}
				local39 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(III)V")
	public static void method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static292.aFloat73 > Static292.aFloat74) {
			Static292.aFloat74 = (float) ((double) Static292.aFloat74 + (double) Static292.aFloat74 / 30.0D);
			if (Static292.aFloat73 < Static292.aFloat74) {
				Static292.aFloat74 = Static292.aFloat73;
			}
			Static447.method5934();
			Static292.anInt6140 = (int) Static292.aFloat74 >> 1;
			Static292.aByteArrayArrayArray16 = Static88.method1371(Static292.anInt6140);
		} else if (Static292.aFloat73 < Static292.aFloat74) {
			Static292.aFloat74 = (float) ((double) Static292.aFloat74 - (double) Static292.aFloat74 / 30.0D);
			if (Static292.aFloat74 < Static292.aFloat73) {
				Static292.aFloat74 = Static292.aFloat73;
			}
			Static447.method5934();
			Static292.anInt6140 = (int) Static292.aFloat74 >> 1;
			Static292.aByteArrayArrayArray16 = Static88.method1371(Static292.anInt6140);
		}
		if (Static107.anInt2008 != -1 && Static202.anInt3606 != -1) {
			@Pc(84) int local84 = Static107.anInt2008 - Static54.anInt860;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(103) int local103 = Static202.anInt3606 - Static458.anInt6588;
			Static54.anInt860 += local84;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			if (local84 == 0 && local103 == 0) {
				Static107.anInt2008 = -1;
				Static202.anInt3606 = -1;
			}
			Static458.anInt6588 -= -local103;
			Static447.method5934();
		}
		if (Static90.anInt1730 <= 0) {
			Static276.anInt4603 = -1;
			Static325.anInt5269 = -1;
		} else {
			Static373.anInt6112--;
			if (Static373.anInt6112 == 0) {
				Static373.anInt6112 = 100;
				Static90.anInt1730--;
			}
		}
		if (!Static238.aBoolean297 || Static100.aClass244_9 == null) {
			return;
		}
		for (@Pc(169) Class4_Sub32 local169 = (Class4_Sub32) Static100.aClass244_9.method5263(); local169 != null; local169 = (Class4_Sub32) Static100.aClass244_9.method5271()) {
			@Pc(178) Class100 local178 = Static292.aClass235_4.method4957(local169.aClass4_Sub12_1.anInt1566);
			if (local169.method3725(arg0, arg1)) {
				if (local178.aStringArray22 != null) {
					if (local178.aStringArray22[4] != null) {
						Static391.method5158((long) local169.aClass4_Sub12_1.anInt1566, -1, 0, local178.anInt2488, -1, local178.aString14, 1009, false, local178.aStringArray22[4], true);
					}
					if (local178.aStringArray22[3] != null) {
						Static391.method5158((long) local169.aClass4_Sub12_1.anInt1566, -1, 0, local178.anInt2488, -1, local178.aString14, 1010, false, local178.aStringArray22[3], true);
					}
					if (local178.aStringArray22[2] != null) {
						Static391.method5158((long) local169.aClass4_Sub12_1.anInt1566, -1, 0, local178.anInt2488, -1, local178.aString14, 1011, false, local178.aStringArray22[2], true);
					}
					if (local178.aStringArray22[1] != null) {
						Static391.method5158((long) local169.aClass4_Sub12_1.anInt1566, -1, 0, local178.anInt2488, -1, local178.aString14, 1006, false, local178.aStringArray22[1], true);
					}
					if (local178.aStringArray22[0] != null) {
						Static391.method5158((long) local169.aClass4_Sub12_1.anInt1566, -1, 0, local178.anInt2488, -1, local178.aString14, 1007, false, local178.aStringArray22[0], true);
					}
				}
				if (!local169.aClass4_Sub12_1.aBoolean104) {
					local169.aClass4_Sub12_1.aBoolean104 = true;
					Static80.method1290(Static127.aClass43_7, local169.aClass4_Sub12_1.anInt1566, local178.anInt2488);
				}
				if (local169.aClass4_Sub12_1.aBoolean104) {
					Static80.method1290(Static291.aClass43_13, local169.aClass4_Sub12_1.anInt1566, local178.anInt2488);
				}
			} else if (local169.aClass4_Sub12_1.aBoolean104) {
				local169.aClass4_Sub12_1.aBoolean104 = false;
				Static80.method1290(Static139.aClass43_9, local169.aClass4_Sub12_1.anInt1566, local178.anInt2488);
			}
		}
	}
}
