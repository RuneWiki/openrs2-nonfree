import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fu", name = "T", descriptor = "Lclient!vf;")
	public static Class370 aClass370_3;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(B)V")
	public static void method2862() {
		if (Static413.method5629(Static221.anInt3831) || Static592.method7807(Static221.anInt3831)) {
			Static348.method5049(Static370.anInt6266 >> 12, Static564.anInt9117 >> 12, 5000);
		} else {
			@Pc(27) int local27 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] >> 3;
			@Pc(34) int local34 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] >> 3;
			if (local27 >= 0 && local27 < Static98.anInt361 >> 3 && local34 >= 0 && Static438.anInt7120 >> 3 > local34) {
				Static348.method5049(local27, local34, 5000);
			} else {
				Static348.method5049(Static98.anInt361 >> 4, Static438.anInt7120 >> 4, 0);
			}
		}
		Static672.method8950();
		Static1.method8754();
		Static504.method6585();
		Static26.method595();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method2863(@OriginalArg(1) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static498.aBoolean757) {
			local7 = Static84.method1336();
			local9 = Static614.method8324();
		}
		@Pc(21) int local21 = Static517.anInt8133 + local7;
		@Pc(25) int local25 = Static508.anInt8006 + local9;
		@Pc(27) int local27 = Static532.anInt8336;
		@Pc(31) int local31 = Static204.anInt3590 - 3;
		Static587.method7787(Static114.aClass84_24.method1729(Static654.anInt10668), local7 + Static517.anInt8133, Static204.anInt3590, Static532.anInt8336, Static508.anInt8006 + local9, arg0);
		@Pc(62) int local62 = local7 + Static627.aClass48_1.method7512();
		@Pc(68) int local68 = local9 + Static627.aClass48_1.method7511();
		@Pc(72) int local72;
		@Pc(77) Class3_Sub5_Sub18 local77;
		@Pc(94) int local94;
		@Pc(282) int local282;
		@Pc(163) Class3_Sub5_Sub13 local163;
		@Pc(270) Class3_Sub5_Sub18 local270;
		if (Static599.aBoolean544) {
			local72 = 0;
			for (local163 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local163 != null; local163 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
				local94 = local25 + local72 * 16 + 33;
				local72++;
				if (Static517.anInt8133 + local7 < local62 && local62 < Static517.anInt8133 + local7 + Static532.anInt8336 && local68 > local94 - 13 && local68 < local94 + 4 && (local163.anInt6245 > 1 || ((Class3_Sub5_Sub18) local163.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66).aBoolean640)) {
					arg0.aa(local7 + Static517.anInt8133, local94 - 12, Static532.anInt8336, 16, 255 - Static278.anInt4731 << 24 | Static465.anInt7408, 1);
				}
			}
			if (Static352.aClass3_Sub5_Sub13_1 != null) {
				local72 = 0;
				Static587.method7787(Static352.aClass3_Sub5_Sub13_1.aString79, Static453.anInt7304, Static515.anInt8106, Static473.anInt7547, Static3.anInt15, arg0);
				for (local270 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5459(); local270 != null; local270 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5453()) {
					local282 = Static3.anInt15 + local72 * 16 + 33;
					if (Static453.anInt7304 < local62 && local62 < Static473.anInt7547 + Static453.anInt7304 && local282 - 13 < local68 && local68 < local282 + 4 && local270.aBoolean640) {
						arg0.aa(Static453.anInt7304, local282 - 12, Static473.anInt7547, 16, 255 - Static278.anInt4731 << 24 | Static465.anInt7408, 1);
					}
					local72++;
				}
				Static510.method2856(arg0, Static453.anInt7304, Static473.anInt7547, Static515.anInt8106, Static3.anInt15);
			}
		} else {
			local72 = 0;
			for (local77 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local77 != null; local77 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				local94 = (Static166.anInt3037 - local72 - 1) * 16 + local25 + 13 + 20;
				if (local62 > Static517.anInt8133 + local7 && Static532.anInt8336 + local7 + Static517.anInt8133 > local62 && local68 > local94 - 13 && local68 < local94 + 4 && local77.aBoolean640) {
					arg0.aa(local7 + Static517.anInt8133, local94 + -12, Static532.anInt8336, 16, Static465.anInt7408 | 255 - Static278.anInt4731 << 24, 1);
				}
				local72++;
			}
		}
		Static510.method2856(arg0, Static517.anInt8133 + local7, Static532.anInt8336, Static204.anInt3590, local9 + Static508.anInt8006);
		if (Static599.aBoolean544) {
			local72 = 0;
			for (local163 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local163 != null; local163 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
				local94 = Static508.anInt8006 + local9 + local72 * 16 + 33;
				local72++;
				if (local163.anInt6245 == 1) {
					Static104.method1687(local62, Static147.anInt2708 | 0xFF000000, arg0, Static468.anInt7423 | 0xFF000000, local68, Static517.anInt8133 + local7, Static532.anInt8336, Static204.anInt3590, local94, local9 + Static508.anInt8006, (Class3_Sub5_Sub18) local163.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66);
				} else {
					Static471.method6274(local68, local94, Static517.anInt8133 + local7, local62, arg0, Static468.anInt7423 | 0xFF000000, Static532.anInt8336, Static147.anInt2708 | 0xFF000000, Static204.anInt3590, local9 + Static508.anInt8006, local163);
				}
			}
			if (Static352.aClass3_Sub5_Sub13_1 != null) {
				local72 = 0;
				for (local270 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5459(); local270 != null; local270 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5453()) {
					local282 = Static3.anInt15 + local72 * 16 + 20 + 13;
					Static104.method1687(local62, Static147.anInt2708 | 0xFF000000, arg0, Static468.anInt7423 | 0xFF000000, local68, Static453.anInt7304, Static473.anInt7547, Static515.anInt8106, local282, Static3.anInt15, local270);
					local72++;
				}
				Static387.method5432(Static453.anInt7304, Static515.anInt8106, Static473.anInt7547, Static3.anInt15);
			}
		} else {
			local72 = 0;
			for (local77 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local77 != null; local77 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				local94 = local25 + (-local72 + -1 + Static166.anInt3037) * 16 + 20 + 13;
				Static104.method1687(local62, Static147.anInt2708 | 0xFF000000, arg0, Static468.anInt7423 | 0xFF000000, local68, local21, local27, local31, local94, local25, local77);
				local72++;
			}
		}
		Static387.method5432(local7 + Static517.anInt8133, Static204.anInt3590, Static532.anInt8336, local9 + Static508.anInt8006);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2864(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static31.anInt753 >= 100) {
			Static342.method4988(Static114.aClass84_39.method1729(Static654.anInt10668));
			return;
		}
		@Pc(23) String local23 = Static130.method8168(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static31.anInt753; local28++) {
			@Pc(36) String local36 = Static130.method8168(Static137.aStringArray22[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static342.method4988(arg1 + Static114.aClass84_40.method1729(Static654.anInt10668));
				return;
			}
			if (Static632.aStringArray64[local28] != null) {
				local67 = Static130.method8168(Static632.aStringArray64[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static342.method4988(arg1 + Static114.aClass84_40.method1729(Static654.anInt10668));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static345.anInt5912; local100++) {
			local67 = Static130.method8168(Static651.aStringArray66[local100]);
			if (local67 != null && local67.equals(local23)) {
				Static342.method4988(Static114.aClass84_45.method1729(Static654.anInt10668) + arg1 + Static114.aClass84_46.method1729(Static654.anInt10668));
				return;
			}
			if (Static87.aStringArray15[local100] != null) {
				@Pc(144) String local144 = Static130.method8168(Static87.aStringArray15[local100]);
				if (local144 != null && local144.equals(local23)) {
					Static342.method4988(Static114.aClass84_45.method1729(Static654.anInt10668) + arg1 + Static114.aClass84_46.method1729(Static654.anInt10668));
					return;
				}
			}
		}
		if (Static130.method8168(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25).equals(local23)) {
			Static342.method4988(Static114.aClass84_42.method1729(Static654.anInt10668));
			return;
		}
		@Pc(200) Class3_Sub37 local200 = Static90.method1509(Static609.aClass240_108, Static226.aClass144_2);
		local200.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg1) + 1);
		local200.aClass3_Sub4_Sub1_2.method7901(arg1);
		local200.aClass3_Sub4_Sub1_2.method7948(arg0 ? 1 : 0);
		Static301.method2678(local200);
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
	public static void method2866() {
		Static313.aClass265Array6 = null;
		if (Static498.aBoolean757 && Static241.method3664() != 1) {
			Static162.method2586(Static651.method8741(), 0, 0, Static221.anInt3831 == 3 || Static221.anInt3831 == 7, Static309.method4443());
		}
		@Pc(32) int local32 = 0;
		@Pc(39) int local39 = 0;
		if (Static498.aBoolean757) {
			local32 = Static84.method1336();
			local39 = Static614.method8324();
		}
		Static299.method4366(local39, Static13.anInt306 + local39, local32, local39, local32, -1, local32 + Static531.anInt8327, Static187.anInt3418);
		if (Static313.aClass265Array6 != null) {
			Static167.method2650(true, local39, local32, -1412584499, Static13.anInt306 + local39, Static313.aClass265Array6, Static332.anInt5505, Static478.aClass265_12.anInt7018, Static343.anInt5886, local32 + Static531.anInt8327);
			Static313.aClass265Array6 = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2867(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local17));
		}
		return local10;
	}
}
