import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_1 = new Class306("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method244(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(35) String local35;
		if (Static234.anInt4709 >= 200 && !Static39.aBoolean38 || Static234.anInt4709 >= 200) {
			Static324.method5022(Static194.aClass306_43.method7165(Static179.anInt3168));
			local35 = Static153.aClass306_36.method7165(Static179.anInt3168);
			if (local35 != null) {
				Static324.method5022(local35);
			}
			return;
		}
		local35 = Static142.method2303(arg0);
		if (local35 == null) {
			return;
		}
		@Pc(88) String local88;
		for (@Pc(50) int local50 = 0; local50 < Static234.anInt4709; local50++) {
			@Pc(58) String local58 = Static142.method2303(Static528.aStringArray43[local50]);
			if (local58 != null && local58.equals(local35)) {
				Static324.method5022(arg0 + Static463.aClass306_117.method7165(Static179.anInt3168));
				return;
			}
			if (Static373.aStringArray7[local50] != null) {
				local88 = Static142.method2303(Static373.aStringArray7[local50]);
				if (local88 != null && local88.equals(local35)) {
					Static324.method5022(arg0 + Static463.aClass306_117.method7165(Static179.anInt3168));
					return;
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < Static40.anInt856; local114++) {
			local88 = Static142.method2303(Static354.aStringArray32[local114]);
			if (local88 != null && local88.equals(local35)) {
				Static324.method5022(Static368.aClass306_85.method7165(Static179.anInt3168) + arg0 + Static135.aClass306_32.method7165(Static179.anInt3168));
				return;
			}
			if (Static17.aStringArray1[local114] != null) {
				@Pc(157) String local157 = Static142.method2303(Static17.aStringArray1[local114]);
				if (local157 != null && local157.equals(local35)) {
					Static324.method5022(Static368.aClass306_85.method7165(Static179.anInt3168) + arg0 + Static135.aClass306_32.method7165(Static179.anInt3168));
					return;
				}
			}
		}
		if (Static142.method2303(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16).equals(local35)) {
			Static324.method5022(Static208.aClass306_46.method7165(Static179.anInt3168));
		} else {
			Static144.method2331(Static98.aClass296_354);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg0));
			Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg5 && arg3 == arg7 && arg8 == arg6 && arg0 == arg2) {
			Static24.method570(arg1, arg8, arg4, arg0, arg3);
			return;
		}
		@Pc(28) int local28 = arg4;
		@Pc(30) int local30 = arg3;
		@Pc(34) int local34 = arg4 * 3;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(63) int local63 = local42 + arg8 - local50 - arg4;
		@Pc(74) int local74 = arg0 + local46 - arg3 - local54;
		@Pc(84) int local84 = local34 + local50 - local42 - local42;
		@Pc(94) int local94 = local38 + local54 - local46 - local46;
		@Pc(99) int local99 = local42 - local34;
		@Pc(103) int local103 = local46 - local38;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local105 * local113 >> 12;
			@Pc(123) int local123 = local63 * local119;
			@Pc(127) int local127 = local119 * local74;
			@Pc(131) int local131 = local84 * local113;
			@Pc(135) int local135 = local94 * local113;
			@Pc(139) int local139 = local99 * local105;
			@Pc(143) int local143 = local105 * local103;
			@Pc(154) int local154 = arg4 + (local123 + local131 + local139 >> 12);
			@Pc(165) int local165 = arg3 + (local135 + local127 + local143 >> 12);
			Static24.method570(arg1, local154, local28, local165, local30);
			local28 = local154;
			local30 = local165;
		}
	}
}
