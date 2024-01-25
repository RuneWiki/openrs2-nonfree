import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!nga;")
	public static final Class220 aClass220_6 = new Class220();

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == arg3 && arg8 == arg0 && arg6 == arg7 && arg1 == arg2) {
			Static164.method3158(arg5, arg0, arg2, arg7, arg4);
			return;
		}
		@Pc(24) int local24 = arg4;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg4 * 3;
		@Pc(34) int local34 = arg0 * 3;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(59) int local59 = local38 + arg7 - local46 - arg4;
		@Pc(68) int local68 = arg2 + local42 - arg0 - local50;
		@Pc(77) int local77 = local46 + local30 - local38 - local38;
		@Pc(87) int local87 = local34 + local50 - local42 - local42;
		@Pc(92) int local92 = local38 - local30;
		@Pc(96) int local96 = local42 - local34;
		for (@Pc(98) int local98 = 128; local98 <= 4096; local98 += 128) {
			@Pc(106) int local106 = local98 * local98 >> 12;
			@Pc(112) int local112 = local106 * local98 >> 12;
			@Pc(116) int local116 = local59 * local112;
			@Pc(120) int local120 = local68 * local112;
			@Pc(124) int local124 = local77 * local106;
			@Pc(128) int local128 = local87 * local106;
			@Pc(132) int local132 = local98 * local92;
			@Pc(136) int local136 = local96 * local98;
			@Pc(148) int local148 = arg4 + (local116 + local124 + local132 >> 12);
			@Pc(158) int local158 = arg0 + (local128 + local120 + local136 >> 12);
			Static164.method3158(arg5, local26, local158, local148, local24);
			local24 = local148;
			local26 = local158;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5537(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static544.anInt9412 >= 200 && !Static393.aBoolean579 || Static544.anInt9412 >= 200) {
			Static238.method4329(Static536.aClass316_12.method7577(Static638.anInt10709));
			local30 = Static536.aClass316_13.method7577(Static638.anInt10709);
			if (local30 != null) {
				Static238.method4329(local30);
			}
			return;
		}
		local30 = Static604.method8337(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(91) String local91;
		for (@Pc(50) int local50 = 0; local50 < Static544.anInt9412; local50++) {
			@Pc(58) String local58 = Static604.method8337(Static277.aStringArray16[local50]);
			if (local58 != null && local58.equals(local30)) {
				Static238.method4329(arg0 + Static536.aClass316_40.method7577(Static638.anInt10709));
				return;
			}
			if (Static545.aStringArray34[local50] != null) {
				local91 = Static604.method8337(Static545.aStringArray34[local50]);
				if (local91 != null && local91.equals(local30)) {
					Static238.method4329(arg0 + Static536.aClass316_40.method7577(Static638.anInt10709));
					return;
				}
			}
		}
		for (@Pc(122) int local122 = 0; local122 < Static437.anInt7955; local122++) {
			local91 = Static604.method8337(Static241.aStringArray14[local122]);
			if (local91 != null && local91.equals(local30)) {
				Static238.method4329(Static536.aClass316_45.method7577(Static638.anInt10709) + arg0 + Static536.aClass316_46.method7577(Static638.anInt10709));
				return;
			}
			if (Static548.aStringArray35[local122] != null) {
				@Pc(168) String local168 = Static604.method8337(Static548.aStringArray35[local122]);
				if (local168 != null && local168.equals(local30)) {
					Static238.method4329(Static536.aClass316_45.method7577(Static638.anInt10709) + arg0 + Static536.aClass316_46.method7577(Static638.anInt10709));
					return;
				}
			}
		}
		if (Static604.method8337(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46).equals(local30)) {
			Static238.method4329(Static536.aClass316_43.method7577(Static638.anInt10709));
		} else {
			@Pc(222) Class6_Sub17 local222 = Static330.method7824(Static413.aClass185_85, Static569.aClass134_2);
			local222.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0));
			local222.aClass6_Sub8_Sub1_2.method8205(arg0);
			Static452.method6867(local222);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public static void method5539() {
		Static188.aClass4Array3 = null;
		Static532.aClass4Array14 = null;
		Static603.aClass4Array19 = null;
		Static530.aClass4Array13 = null;
		Static572.aClass4_31 = null;
		Static381.aClass4Array9 = null;
		Static588.aClass34_14 = null;
		Static333.aClass4Array8 = null;
		Static537.aClass34_12 = null;
		Static447.aClass4Array12 = null;
		Static393.aClass4Array11 = null;
		Static279.aClass4Array6 = null;
		Static295.aClass4_14 = null;
		Static359.aClass34_7 = null;
		Static579.aClass4Array17 = null;
		Static296.aClass4Array7 = null;
		Static6.aClass4Array1 = null;
		Static166.aClass4Array18 = null;
	}
}
