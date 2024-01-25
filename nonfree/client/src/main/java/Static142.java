import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!ba;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method2610(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static147.anInt3063 = 2;
		Static67.anInt1640 = arg0;
		Static430.method5922(arg2, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII)I")
	public static int method2611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static163.method6312(local7, local17);
		@Pc(35) int local35 = Static163.method6312(local7 + 1, local17);
		@Pc(42) int local42 = Static163.method6312(local7, local17 + 1);
		@Pc(51) int local51 = Static163.method6312(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static411.method5298(local13, local35, local28, arg0);
		@Pc(70) int local70 = Static411.method5298(local13, local51, local42, arg0);
		return Static411.method5298(local23, local70, local58, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method2614() {
		if (Static97.anInt2096 < 0) {
			Static113.anInt2426 = -1;
			Static245.anInt4781 = -1;
			Static97.anInt2096 = 0;
		}
		if (Static425.anInt3659 < Static97.anInt2096) {
			Static113.anInt2426 = -1;
			Static97.anInt2096 = Static425.anInt3659;
			Static245.anInt4781 = -1;
		}
		if (Static241.anInt4715 < 0) {
			Static245.anInt4781 = -1;
			Static241.anInt4715 = 0;
			Static113.anInt2426 = -1;
		}
		if (Static241.anInt4715 > Static425.anInt3667) {
			Static241.anInt4715 = Static425.anInt3667;
			Static245.anInt4781 = -1;
			Static113.anInt2426 = -1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILclient!tf;I)V")
	public static void method2616(@OriginalArg(1) int arg0, @OriginalArg(2) Class240 arg1, @OriginalArg(3) int arg2) {
		if (Static449.aBoolean564) {
			@Pc(181) Class176 local181 = Static352.anInt6231 == -1 ? null : Static203.aClass202_1.method4864(Static352.anInt6231);
			if (!Static50.method1146(arg1).method5911() || (Static353.anInt6237 & 0x20) == 0) {
				return;
			}
			if (local181 == null || arg1.method5529(local181.anInt5158, Static352.anInt6231) != local181.anInt5158) {
				Static12.method4708(3, 0L, arg1.anInt6885, false, true, Static281.anInt5275, Static168.aString24 + " -> " + arg1.aString59, Static198.aString26, arg1.anInt6876, arg1.anInt6909);
			}
			return;
		}
		@Pc(21) String local21;
		for (@Pc(14) int local14 = 9; local14 >= 5; local14--) {
			local21 = Static52.method1154(local14, arg1);
			if (local21 != null) {
				Static12.method4708(1008, (long) (local14 + 1), arg1.anInt6885, false, true, Static441.method6052(local14, arg1), arg1.aString59, local21, arg1.anInt6876, arg1.anInt6909);
			}
		}
		local21 = Static26.method401(arg1);
		if (local21 != null) {
			Static12.method4708(51, 0L, arg1.anInt6885, false, true, arg1.anInt6859, arg1.aString59, local21, arg1.anInt6876, arg1.anInt6909);
		}
		for (@Pc(84) int local84 = 4; local84 >= 0; local84--) {
			@Pc(91) String local91 = Static52.method1154(local84, arg1);
			if (local91 != null) {
				Static12.method4708(6, (long) (local84 + 1), arg1.anInt6885, false, true, Static441.method6052(local84, arg1), arg1.aString59, local91, arg1.anInt6876, arg1.anInt6909);
			}
		}
		if (!Static50.method1146(arg1).method5908()) {
			return;
		}
		if (arg1.aString63 == null) {
			Static12.method4708(11, 0L, arg1.anInt6885, false, true, -1, "", Static353.aClass21_101.method362(Static168.anInt3290), arg1.anInt6876, arg1.anInt6909);
			return;
		}
		Static12.method4708(11, 0L, arg1.anInt6885, false, true, -1, "", arg1.aString63, arg1.anInt6876, arg1.anInt6909);
		return;
	}
}
