import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "Lclient!fg;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg1 == arg5 && arg8 == arg7 && arg4 == arg2) {
			Static371.method5425(arg5, arg6, arg3, arg2, arg8);
			return;
		}
		@Pc(24) int local24 = arg3;
		@Pc(26) int local26 = arg5;
		@Pc(30) int local30 = arg3 * 3;
		@Pc(34) int local34 = arg5 * 3;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(60) int local60 = local38 + arg8 - arg3 - local46;
		@Pc(70) int local70 = arg2 + local42 - arg5 - local50;
		@Pc(79) int local79 = local46 + local30 - local38 - local38;
		@Pc(87) int local87 = local50 + local34 - local42 - local42;
		@Pc(92) int local92 = local38 - local30;
		@Pc(97) int local97 = local42 - local34;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(107) int local107 = local99 * local99 >> 12;
			@Pc(113) int local113 = local107 * local99 >> 12;
			@Pc(117) int local117 = local113 * local60;
			@Pc(121) int local121 = local113 * local70;
			@Pc(125) int local125 = local107 * local79;
			@Pc(129) int local129 = local87 * local107;
			@Pc(133) int local133 = local99 * local92;
			@Pc(137) int local137 = local97 * local99;
			@Pc(147) int local147 = arg3 + (local133 + local125 + local117 >> 12);
			@Pc(159) int local159 = arg5 + (local121 + local129 + local137 >> 12);
			Static371.method5425(local26, arg6, local24, local159, local147);
			local26 = local159;
			local24 = local147;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public static void method1511() {
		Static298.aClass308_106.anInt8167 = 1;
		Static281.method4188();
		Static95.aBoolean112 = true;
		Static13.aBoolean9 = true;
		Static111.method1525();
		for (@Pc(7491) int local7491 = 0; local7491 < Static243.aClass358Array1.length; local7491++) {
			Static243.aClass358Array1[local7491] = null;
		}
		Static563.aBoolean697 = false;
		Static549.method7480();
		Static439.anInt8378 = (int) (Math.random() * 100.0D) - 50;
		Static331.aFloat172 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static570.anInt9433 = (int) (Math.random() * 80.0D) - 40;
		Static267.anInt4887 = (int) (Math.random() * 30.0D) - 20;
		Static272.anInt5007 = (int) (Math.random() * 120.0D) - 60;
		Static324.anInt5952 = (int) (Math.random() * 110.0D) - 55;
		Static479.method6645();
		for (@Pc(7561) int local7561 = 0; local7561 < 2048; local7561++) {
			Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local7561] = null;
		}
		Static547.anInt9151 = 0;
		Static306.anInt4911 = 0;
		Static372.aClass91_30.method2275();
		Static241.aClass111_21.method2555();
		Static297.aClass111_25.method2555();
		Static337.aClass196_5.method4031();
		Static365.aClass91_29.method2275();
		Static64.aClass111_5 = new Class111();
		Static390.aClass353_29.method7621();
		Static552.method5137();
		Static57.anInt1083 = 0;
		Static345.anInt9512 = 0;
		Static123.anInt2518 = 0;
		Static375.anInt6733 = 0;
		Static76.anInt6367 = 0;
		Static269.anInt4922 = 0;
		Static157.anInt2976 = 0;
		Static321.anInt5862 = 0;
		Static506.anInt8778 = 0;
		Static86.anInt1584 = 0;
		for (@Pc(7627) int local7627 = 0; local7627 < Static250.anIntArray251.length; local7627++) {
			if (!Static166.aBooleanArray34[local7627]) {
				Static250.anIntArray251[local7627] = -1;
			}
		}
		if (Static165.anInt3165 != -1) {
			Static257.method3746(Static165.anInt3165);
		}
		for (@Pc(7657) Class1_Sub38 local7657 = (Class1_Sub38) Static148.aClass91_6.method2278(); local7657 != null; local7657 = (Class1_Sub38) Static148.aClass91_6.method2276()) {
			if (!local7657.method7907()) {
				local7657 = (Class1_Sub38) Static148.aClass91_6.method2278();
				if (local7657 == null) {
					break;
				}
			}
			Static336.method5001(true, local7657, false);
		}
		Static165.anInt3165 = -1;
		Static148.aClass91_6 = new Class91(8);
		Static570.method7676();
		Static390.aClass160_43 = null;
		for (@Pc(7699) int local7699 = 0; local7699 < 8; local7699++) {
			Static490.aStringArray33[local7699] = null;
			Static563.aBooleanArray39[local7699] = false;
			Static498.anIntArray38[local7699] = -1;
		}
		Static44.method754();
		Static109.aBoolean121 = true;
		for (@Pc(7725) int local7725 = 0; local7725 < 100; local7725++) {
			Static73.aBooleanArray6[local7725] = true;
		}
		for (@Pc(7739) int local7739 = 0; local7739 < 6; local7739++) {
			Static288.aClass7Array1[local7739] = new Class7();
		}
		for (@Pc(7755) int local7755 = 0; local7755 < 25; local7755++) {
			Static586.anIntArray616[local7755] = 0;
			Static163.anIntArray143[local7755] = 0;
			Static504.anIntArray527[local7755] = 0;
		}
		Static585.method7837();
		Static337.aShortArray50 = Static252.aShortArray37 = Static340.aShortArray60 = Static246.aShortArray36 = new short[256];
		Static539.aBoolean676 = true;
		Static383.aString80 = Static375.aClass253_30.method5453(Static161.anInt3095);
		Static86.aClass1_Sub30_Sub1_1.aBoolean492 = false;
		Static86.aClass1_Sub30_Sub1_1.aBoolean490 = false;
		Static218.anInt3983 = 0;
		Static202.method3101();
		Static368.method5401();
		Static328.aLong147 = 0L;
		Static298.aClass308_106.anInt8167 = 2;
		Static169.aClass1_Sub46_1 = null;
	}
}
