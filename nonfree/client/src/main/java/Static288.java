import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	public static int anInt5624 = 0;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public static int anInt5629 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4853(@OriginalArg(0) Class9 arg0) {
		@Pc(7) int local7 = Static504.anInt8565;
		@Pc(9) int local9 = Static380.anInt6684;
		@Pc(11) int local11 = Static85.anInt2199;
		@Pc(13) int local13 = Static186.anInt3939;
		arg0.method7632(local7, -10660793, local11, local13, local9);
		arg0.method7632(local7 + 1, -16777216, -2 + local11, 16, local9 + 1);
		arg0.method7599(local13 - 19, local11 - 2, -16777216, local7 + 1, local9 + 18);
		Static106.aClass27_3.method7816(local7 + 3, Static514.aClass114_164.method3330(Static315.anInt5993), -1, -10660793, local9 + 14);
		@Pc(78) int local78 = Static42.aClass191_1.method5138();
		@Pc(82) int local82 = Static42.aClass191_1.method5141();
		@Pc(84) int local84 = 0;
		for (@Pc(89) Class1_Sub50 local89 = (Class1_Sub50) Static475.aClass38_69.method1419(); local89 != null; local89 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			@Pc(104) int local104 = local9 + (-local84 + Static267.anInt5167 + -1) * 16 + 31;
			@Pc(106) short local106 = -1;
			if (local7 < local78 && local11 + local7 > local78 && local82 > local104 - 13 && local82 < local104 + 3 && local89.aBoolean620) {
				local106 = -256;
			}
			@Pc(139) int[] local139 = null;
			if (Static34.method1308(local89.anInt8983)) {
				local139 = Static454.aClass153_2.method4007((int) local89.aLong236).anIntArray410;
			} else if (local89.anInt8980 != -1) {
				local139 = Static454.aClass153_2.method4007(local89.anInt8980).anIntArray410;
			} else if (Static270.method4524(local89.anInt8983)) {
				@Pc(208) Class1_Sub10 local208 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local89.aLong236);
				if (local208 != null) {
					@Pc(213) Class47_Sub2_Sub3_Sub1 local213 = local208.aClass47_Sub2_Sub3_Sub1_2;
					@Pc(216) Class238 local216 = local213.aClass238_1;
					if (local216.anIntArray511 != null) {
						local216 = local216.method5866(Static343.aClass286_1);
					}
					if (local216 != null) {
						local139 = local216.anIntArray509;
					}
				}
			} else if (Static460.method6777(local89.anInt8983)) {
				@Pc(173) Class288 local173;
				if (local89.anInt8983 == 1012) {
					local173 = Static365.aClass194_6.method5084((int) local89.aLong236);
				} else {
					local173 = Static365.aClass194_6.method5084((int) (local89.aLong236 >>> 32 & 0x7FFFFFFFL));
				}
				if (local173.anIntArray650 != null) {
					local173 = local173.method7065(Static343.aClass286_1);
				}
				if (local173 != null) {
					local139 = local173.anIntArray649;
				}
			}
			@Pc(250) String local250 = Static255.method4303(local89);
			if (local139 != null) {
				local250 = local250 + Static300.method5019(local139);
			}
			Static106.aClass27_3.method7822(local104, local106, Static274.aClass12Array17, local250, Static420.anIntArray577, local7 + 3);
			if (local89.aBoolean621) {
				Static125.aClass12_2.method7191(local7 + Static159.aClass177_3.method4664(local250) + 5, local104 + -12);
			}
			local84++;
		}
		Static413.method6160(Static504.anInt8565, Static85.anInt2199, Static186.anInt3939, Static380.anInt6684);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method4855() {
		Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
		Static45.anInt1403 = 0;
		Static487.aClass6_129 = null;
		Static388.aClass6_117 = null;
		Static215.anInt4441 = 0;
		Static228.anInt8958 = 0;
		Static136.aClass6_48 = null;
		Static304.aClass6_92 = null;
		Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
		Static241.method2709();
		Static86.method2083();
		for (@Pc(29) int local29 = 0; local29 < 2048; local29++) {
			Static473.aClass47_Sub2_Sub3_Sub2Array1[local29] = null;
		}
		Static16.aClass47_Sub2_Sub3_Sub2_1 = null;
		for (@Pc(42) int local42 = 0; local42 < Static198.anInt4112; local42++) {
			@Pc(48) Class47_Sub2_Sub3_Sub1 local48 = Static395.aClass1_Sub10Array1[local42].aClass47_Sub2_Sub3_Sub1_2;
			if (local48 != null) {
				local48.anInt5061 = -1;
			}
		}
		Static485.method7019();
		Static464.anInt8003 = 1;
		Static265.method4401(9);
		for (@Pc(66) int local66 = 0; local66 < 100; local66++) {
			Static145.aBooleanArray14[local66] = true;
		}
		Static363.method6954();
		Static515.aClass1_Sub36_2 = null;
		Static246.aLong123 = 0L;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!vp;)Ljava/lang/String;")
	public static String method4856(@OriginalArg(1) Class309 arg0) {
		if (Static62.method1740(arg0).method7990() == 0) {
			return null;
		} else if (arg0.aString77 == null || arg0.aString77.trim().length() == 0) {
			return Static192.aBoolean246 ? "Hidden-use" : null;
		} else {
			return arg0.aString77;
		}
	}
}
