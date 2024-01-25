import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!dh;")
	public static Class2_Sub13 aClass2_Sub13_5;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!db;")
	public static Class2_Sub6_Sub3 aClass2_Sub6_Sub3_1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method2131() {
		if (!Static590.method8718()) {
			return;
		}
		if (Static19.aStringArray1 == null) {
			Static447.method7046();
		}
		Static50.anInt1859 = 0;
		Static127.aBoolean252 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg3 == arg7 && arg6 == arg1 && arg5 == arg8) {
			Static114.method2844(arg2, arg0, arg7, arg8, arg6);
			return;
		}
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg7;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(63) int local63 = local41 + arg6 - arg2 - local49;
		@Pc(74) int local74 = arg8 + local45 - arg7 - local53;
		@Pc(84) int local84 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local37 + local53 - local45 - local45;
		@Pc(98) int local98 = local41 - local33;
		@Pc(103) int local103 = local45 - local37;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local113 * local105 >> 12;
			@Pc(123) int local123 = local63 * local119;
			@Pc(127) int local127 = local74 * local119;
			@Pc(131) int local131 = local84 * local113;
			@Pc(135) int local135 = local113 * local93;
			@Pc(139) int local139 = local105 * local98;
			@Pc(143) int local143 = local103 * local105;
			@Pc(156) int local156 = arg2 + (local123 + local131 + local139 >> 12);
			@Pc(168) int local168 = arg7 + (local135 + local127 + local143 >> 12);
			Static114.method2844(local27, arg0, local29, local168, local156);
			local27 = local156;
			local29 = local168;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!db;)Ljava/lang/String;")
	public static String method2135(@OriginalArg(1) Class2_Sub6_Sub3 arg0) {
		if (arg0.aString20 == null || arg0.aString20.length() == 0) {
			return arg0.aString21 == null || arg0.aString21.length() <= 0 ? arg0.aString19 : arg0.aString19 + Static588.aClass351_34.method8691(Static476.anInt8915) + arg0.aString21;
		} else if (arg0.aString21 == null || arg0.aString21.length() <= 0) {
			return arg0.aString19 + Static588.aClass351_34.method8691(Static476.anInt8915) + arg0.aString20;
		} else {
			return arg0.aString19 + Static588.aClass351_34.method8691(Static476.anInt8915) + arg0.aString21 + Static588.aClass351_34.method8691(Static476.anInt8915) + arg0.aString20;
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public static void method2136() {
		Static205.aClass169_28.method5009();
	}
}
