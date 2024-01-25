import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public static int anInt3919;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[Lclient!gm;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array12 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt3920 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3495(@OriginalArg(0) String arg0) {
		if (Static83.aClass169Array1 != null) {
			Static444.method6416(Static287.aClass186_81);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg0));
			Static192.aClass1_Sub13_Sub2_1.method3061(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method3497(@OriginalArg(1) Class9 arg0) {
		for (@Pc(4) Class2_Sub3 local4 = (Class2_Sub3) Static14.aClass145_2.method3919(); local4 != null; local4 = (Class2_Sub3) Static14.aClass145_2.method3926()) {
			local4.method2073(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!qa;ZIIILclient!ra;I)V")
	public static void method3498(@OriginalArg(0) Class9 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class27 arg5) {
		if (arg1) {
			Static530.aClass12_22.method7191((Static290.anInt6867 - Static530.aClass12_22.EA()) / 2, (Static90.anInt2326 - Static530.aClass12_22.ma()) / 2);
			Static505.aClass12_21.method7191((Static290.anInt6867 - Static505.aClass12_21.EA()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static152.aClass37_1 == Static538.aClass37_4) {
			local31 = Static271.aClass114_33.method3330(Static315.anInt5993);
		} else if (Static538.aClass37_4 == Static452.aClass37_3) {
			local31 = Static51.aClass114_150.method3330(Static315.anInt5993);
		}
		arg5.method7824(Static90.anInt2326 / 2 - 26, local31, arg4, Static290.anInt6867 / 2, -1);
		@Pc(69) int local69 = Static90.anInt2326 / 2 - 18;
		arg0.method7568(Static290.anInt6867 / 2 - 152, local69, 304, 34, arg3, 0);
		arg0.method7568(Static290.anInt6867 / 2 - 151, local69 + 1, 302, 32, 0, 0);
		arg0.f(Static290.anInt6867 / 2 - 150, local69 + 2, Static262.anInt5137 * 3, 30, arg2, 0);
		arg0.f(Static262.anInt5137 * 3 + Static290.anInt6867 / 2 - 150, local69 + 2, 300 - Static262.anInt5137 * 3, 30, 0, 0);
		arg5.method7824(Static90.anInt2326 / 2 + 4, Static68.aString10, arg4, Static290.anInt6867 / 2, -1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method3499(@OriginalArg(1) Class9 arg0) {
		@Pc(7) int local7 = Static504.anInt8565;
		@Pc(9) int local9 = Static380.anInt6684;
		@Pc(11) int local11 = Static85.anInt2199;
		@Pc(15) int local15 = Static186.anInt3939 - 3;
		if (Static361.aClass12_15 == null || Static399.aClass12_16 == null) {
			if (Static390.aClass160_80.method4213(Static362.anInt6506) && Static390.aClass160_80.method4213(Static162.anInt7993)) {
				Static361.aClass12_15 = arg0.method7625(Static559.method5942(Static390.aClass160_80, Static362.anInt6506, 0));
				@Pc(61) Class242 local61 = Static559.method5942(Static390.aClass160_80, Static162.anInt7993, 0);
				Static399.aClass12_16 = arg0.method7625(local61);
				local61.method5937();
				Static341.aClass12_13 = arg0.method7625(local61);
			} else {
				arg0.f(local7, local9, local11, 20, Static448.anInt7534 | 255 - Static296.anInt5736 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static361.aClass12_15 != null && Static399.aClass12_16 != null) {
			local87 = (local11 - Static399.aClass12_16.c() * 2) / Static361.aClass12_15.c();
			for (local89 = 0; local89 < local87; local89++) {
				Static361.aClass12_15.method7191(local7 + Static399.aClass12_16.c() + local89 * Static361.aClass12_15.c(), local9);
			}
			Static399.aClass12_16.method7191(local7, local9);
			Static341.aClass12_13.method7191(local11 + local7 - Static341.aClass12_13.c(), local9);
		}
		Static106.aClass27_3.method7816(local7 + 3, Static514.aClass114_164.method3330(Static315.anInt5993), -1, -16777216 | Static507.anInt8623, local9 + 14);
		arg0.f(local7, local9 + 20, local11, local15 - 20, Static448.anInt7534 | 255 - Static296.anInt5736 << 24, 1);
		local87 = Static42.aClass191_1.method5138();
		local89 = Static42.aClass191_1.method5141();
		@Pc(171) int local171 = 0;
		@Pc(193) int local193;
		for (@Pc(176) Class1_Sub50 local176 = (Class1_Sub50) Static475.aClass38_69.method1419(); local176 != null; local176 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			local193 = (Static267.anInt5167 - local171 - 1) * 16 + local9 + 13 + 20;
			if (local7 < local87 && local87 < local7 + local11 && local193 - 13 < local89 && local89 < local193 + 4 && local176.aBoolean620) {
				arg0.f(local7, local193 - 12, local11, 16, 255 - Static165.anInt3643 << 24 | Static50.anInt9142, 1);
			}
			local171++;
		}
		if ((Static297.aClass12_11 == null || Static359.aClass12_14 == null || Static155.aClass12_6 == null) && Static390.aClass160_80.method4213(Static182.anInt3918) && Static390.aClass160_80.method4213(Static82.anInt2171) && Static390.aClass160_80.method4213(Static148.anInt3343)) {
			@Pc(269) Class242 local269 = Static559.method5942(Static390.aClass160_80, Static82.anInt2171, 0);
			Static359.aClass12_14 = arg0.method7625(local269);
			local269.method5937();
			Static301.aClass12_12 = arg0.method7625(local269);
			Static297.aClass12_11 = arg0.method7625(Static559.method5942(Static390.aClass160_80, Static182.anInt3918, 0));
			@Pc(294) Class242 local294 = Static559.method5942(Static390.aClass160_80, Static148.anInt3343, 0);
			Static155.aClass12_6 = arg0.method7625(local294);
			local294.method5937();
			Static134.aClass12_3 = arg0.method7625(local294);
		}
		@Pc(366) int local366;
		@Pc(325) int local325;
		if (Static297.aClass12_11 != null && Static359.aClass12_14 != null && Static155.aClass12_6 != null) {
			local193 = (local11 - Static155.aClass12_6.c() * 2) / Static297.aClass12_11.c();
			for (local325 = 0; local325 < local193; local325++) {
				Static297.aClass12_11.method7191(Static155.aClass12_6.c() + local7 + local325 * Static297.aClass12_11.c(), -Static297.aClass12_11.la() + (local9 - -local15));
			}
			local366 = (local15 - Static155.aClass12_6.la() - 20) / Static359.aClass12_14.la();
			for (@Pc(368) int local368 = 0; local368 < local366; local368++) {
				Static359.aClass12_14.method7191(local7, Static359.aClass12_14.la() * local368 + local9 + 20);
				Static301.aClass12_12.method7191(local11 + local7 - Static301.aClass12_12.c(), local9 + 20 + Static359.aClass12_14.la() * local368);
			}
			Static155.aClass12_6.method7191(local7, local15 + local9 - Static155.aClass12_6.la());
			Static134.aClass12_3.method7191(local11 + local7 - Static155.aClass12_6.c(), -Static155.aClass12_6.la() + local15 + local9);
		}
		local171 = 0;
		for (@Pc(439) Class1_Sub50 local439 = (Class1_Sub50) Static475.aClass38_69.method1419(); local439 != null; local439 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			local325 = local9 + (Static267.anInt5167 - local171 - 1) * 16 + 13 + 20;
			local366 = Static507.anInt8623 | 0xFF000000;
			if (local7 < local87 && local11 + local7 > local87 && local325 - 13 < local89 && local89 < local325 + 4 && local439.aBoolean620) {
				local366 = Static141.anInt3291 | 0xFF000000;
			}
			@Pc(496) int[] local496 = null;
			if (Static34.method1308(local439.anInt8983)) {
				local496 = Static454.aClass153_2.method4007((int) local439.aLong236).anIntArray410;
			} else if (local439.anInt8980 != -1) {
				local496 = Static454.aClass153_2.method4007(local439.anInt8980).anIntArray410;
			} else if (Static270.method4524(local439.anInt8983)) {
				@Pc(527) Class1_Sub10 local527 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local439.aLong236);
				if (local527 != null) {
					@Pc(532) Class47_Sub2_Sub3_Sub1 local532 = local527.aClass47_Sub2_Sub3_Sub1_2;
					@Pc(535) Class238 local535 = local532.aClass238_1;
					if (local535.anIntArray511 != null) {
						local535 = local535.method5866(Static343.aClass286_1);
					}
					if (local535 != null) {
						local496 = local535.anIntArray509;
					}
				}
			} else if (Static460.method6777(local439.anInt8983)) {
				@Pc(571) Class288 local571;
				if (local439.anInt8983 == 1012) {
					local571 = Static365.aClass194_6.method5084((int) local439.aLong236);
				} else {
					local571 = Static365.aClass194_6.method5084((int) (local439.aLong236 >>> 32 & 0x7FFFFFFFL));
				}
				if (local571.anIntArray650 != null) {
					local571 = local571.method7065(Static343.aClass286_1);
				}
				if (local571 != null) {
					local496 = local571.anIntArray649;
				}
			}
			@Pc(611) String local611 = Static255.method4303(local439);
			if (local496 != null) {
				local611 = local611 + Static300.method5019(local496);
			}
			Static106.aClass27_3.method7822(local325, local366, Static274.aClass12Array17, local611, Static420.anIntArray577, local7 + 3);
			if (local439.aBoolean621) {
				Static125.aClass12_2.method7191(local7 + Static159.aClass177_3.method4664(local611) + 5, local325 + -12);
			}
			local171++;
		}
		Static413.method6160(Static504.anInt8565, Static85.anInt2199, Static186.anInt3939, Static380.anInt6684);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)Z")
	public static boolean method3500(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
