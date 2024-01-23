import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Lclient!tk;")
	public static Class159 aClass159_17;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!pk;")
	public static Class132 aClass132_84;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "Lclient!sj;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "[Lclient!oi;")
	public static Interface5[] anInterface5Array1;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString172 = "Connecting to update server";

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
	public static int anInt4896 = -1;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class21 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class21(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub27(local14, arg1, arg2);
				}
			}
			Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass21_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class21(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub27(local14, arg1, arg2);
				}
			}
			Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass21_1 = local12;
		} else {
			@Pc(134) Class14 local134 = new Class14(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static178.aClass8_Sub27ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub27(local14, arg1, arg2);
				}
			}
			Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass14_1 = local134;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method3670() {
		@Pc(9) int local9 = Static229.aClass8_Sub1_Sub5_3.method2014(Static183.aString127);
		@Pc(11) int local11;
		@Pc(20) int local20;
		for (local11 = 0; local11 < Static185.anInt3679; local11++) {
			local20 = Static229.aClass8_Sub1_Sub5_3.method2014(Static105.method1704(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		local9 += 8;
		local11 = Static185.anInt3679 * 15 + 21;
		local20 = Static127.anInt2559 - local9 / 2;
		if (Static250.anInt4959 < local9 + local20) {
			local20 = Static250.anInt4959 - local9;
		}
		@Pc(60) int local60 = Static229.anInt4666;
		if (local60 + local11 > Static13.anInt356) {
			local60 = Static13.anInt356 - local11;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		if (Static211.anInt4338 == 1) {
			if (Static99.anInt2070 == Static127.anInt2559 && Static229.anInt4666 == Static232.anInt4701) {
				Static202.anInt4178 = Static185.anInt3679 * 15 + (Static225.aBoolean372 ? 26 : 22);
				Static111.anInt2293 = local20;
				Static17.anInt485 = local9;
				Static147.aBoolean246 = true;
				Static215.anInt4426 = local60;
				Static211.anInt4338 = 0;
			}
		} else if (Static127.anInt2559 == Static59.anInt1292 && Static229.anInt4666 == Static89.anInt1907) {
			Static215.anInt4426 = local60;
			Static147.aBoolean246 = true;
			Static202.anInt4178 = Static185.anInt3679 * 15 + (Static225.aBoolean372 ? 26 : 22);
			Static17.anInt485 = local9;
			Static211.anInt4338 = 0;
			Static111.anInt2293 = local20;
		} else {
			Static232.anInt4701 = Static89.anInt1907;
			Static99.anInt2070 = Static59.anInt1292;
			Static211.anInt4338 = 1;
		}
	}
}
