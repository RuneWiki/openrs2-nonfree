import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Lclient!sc;")
	public static Class13_Sub6 method3995() {
		@Pc(13) Class13_Sub6 local13 = (Class13_Sub6) Static250.aClass227_2.method4829();
		if (local13 == null) {
			return new Class13_Sub6();
		} else {
			Static105.anInt1827--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method3996(@OriginalArg(1) Class113 arg0) {
		Static260.anInt5793 = arg0.method2269("titlebg");
		Static334.anInt5485 = arg0.method2269("logo");
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)I")
	public static int method3997(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(53) char local53;
			if (local17 == '\u0000') {
				local53 = arg2.charAt(local13++);
			} else {
				local53 = local17;
			}
			@Pc(69) char local69;
			if (local19 == '\u0000') {
				local69 = arg1.charAt(local15++);
			} else {
				local69 = local19;
			}
			local17 = Static33.method580(local53);
			local19 = Static33.method580(local69);
			local53 = Static271.method3448(arg0, local53);
			local69 = Static271.method3448(arg0, local69);
			if (local53 != local69 && Character.toUpperCase(local53) != Character.toUpperCase(local69)) {
				local53 = Character.toLowerCase(local53);
				local69 = Character.toLowerCase(local69);
				if (local53 != local69) {
					return Static78.method1217(arg0, local53) - Static78.method1217(arg0, local69);
				}
			}
		}
		@Pc(132) int local132 = Math.min(local8, local11);
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			if (arg0 == 2) {
				local15 = local11 - local134 - 1;
				local13 = local8 - local134 - 1;
			} else {
				local15 = local134;
				local13 = local134;
			}
			@Pc(163) char local163 = arg2.charAt(local13);
			@Pc(167) char local167 = arg1.charAt(local15);
			if (local167 != local163 && Character.toUpperCase(local163) != Character.toUpperCase(local167)) {
				local163 = Character.toLowerCase(local163);
				local167 = Character.toLowerCase(local167);
				if (local167 != local163) {
					return Static78.method1217(arg0, local163) - Static78.method1217(arg0, local167);
				}
			}
		}
		@Pc(212) int local212 = local8 - local11;
		if (local212 != 0) {
			return local212;
		}
		for (@Pc(218) int local218 = 0; local218 < local132; local218++) {
			@Pc(224) char local224 = arg2.charAt(local218);
			@Pc(228) char local228 = arg1.charAt(local218);
			if (local228 != local224) {
				return Static78.method1217(arg0, local224) - Static78.method1217(arg0, local228);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method3998() {
		for (@Pc(6) Class13_Sub6 local6 = (Class13_Sub6) Static397.aClass227_6.method4829(); local6 != null; local6 = (Class13_Sub6) Static397.aClass227_6.method4829()) {
			Static433.method5434(local6);
		}
		@Pc(33) int local33;
		@Pc(31) int local31;
		if (Static336.aClass106_Sub1_1.method4438(Static410.anInt6680)) {
			local31 = 3;
			local33 = 0;
		} else {
			local31 = Static257.anInt6933;
			local33 = Static257.anInt6933;
		}
		Static52.method800();
		for (@Pc(42) int local42 = local33; local42 <= local31; local42++) {
			Static52.method805();
			Static52.method798(local42);
			Static52.method799(local42);
		}
		Static52.method810();
		Static52.method801();
	}
}
