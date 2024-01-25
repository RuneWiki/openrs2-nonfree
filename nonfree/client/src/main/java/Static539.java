import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	public static void method6914() {
		Static239.aStringArray27 = new String[500];
		Static91.anInt1853 = Static513.aClass91_12.anInt2205 + Static513.aClass91_12.anInt2198 + 2;
		Static285.anInt4849 = Static281.aClass91_7.anInt2198 + Static281.aClass91_7.anInt2205 + 2;
		for (@Pc(41) int local41 = 0; local41 < Static239.aStringArray27.length; local41++) {
			Static239.aStringArray27[local41] = "";
		}
		Static85.method1345(Static114.aClass84_1.method1729(Static654.anInt10668));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ec;I)[Lclient!re;")
	public static Class304[] method6915(@OriginalArg(0) Class92 arg0) {
		if (!arg0.method1869()) {
			return new Class304[0];
		}
		@Pc(21) Class338 local21 = arg0.method1877();
		while (local21.anInt9321 == 0) {
			Static26.method592(10L);
		}
		if (local21.anInt9321 == 2) {
			return new Class304[0];
		}
		@Pc(45) int[] local45 = (int[]) local21.anObject18;
		@Pc(51) Class304[] local51 = new Class304[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class304 local59 = new Class304();
			local51[local53] = local59;
			local59.anInt8105 = local45[local53 << 2];
			local59.anInt8107 = local45[(local53 << 2) + 1];
			local59.anInt8110 = local45[(local53 << 2) + 2];
			local59.anInt8109 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIZIIZ)Z")
	public static boolean method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0];
		@Pc(13) int local13 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0];
		if (local8 < 0 || Static98.anInt361 <= local8 || local13 < 0 || local13 >= Static438.anInt7120) {
			return false;
		} else if (arg1 >= 0 && arg1 < Static98.anInt361 && arg7 >= 0 && arg7 < Static438.anInt7120) {
			@Pc(85) int local85 = Static597.method7883(arg0, arg1, Static152.anIntArray554, arg7, arg5, arg4, local13, local8, Static609.aClass110Array1[Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132], arg3, arg6, Static211.anIntArray203, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866(), arg2);
			if (local85 < 1) {
				return false;
			}
			Static622.anInt10293 = Static152.anIntArray554[local85 - 1];
			Static643.anInt10566 = Static211.anIntArray203[local85 - 1];
			Static280.aBoolean314 = false;
			Static113.method1728();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method6917(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg1.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg0.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static577.method7591(local60);
			local19 = Static577.method7591(local76);
			local60 = Static263.method1778(arg2, local60);
			local76 = Static263.method1778(arg2, local76);
			if (local60 != local76 && Character.toUpperCase(local60) != Character.toUpperCase(local76)) {
				local60 = Character.toLowerCase(local60);
				local76 = Character.toLowerCase(local76);
				if (local76 != local60) {
					return Static405.method5597(arg2, local60) - Static405.method5597(arg2, local76);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local138; local145++) {
			if (arg2 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(175) char local175 = arg1.charAt(local13);
			@Pc(179) char local179 = arg0.charAt(local15);
			if (local179 != local175 && Character.toUpperCase(local175) != Character.toUpperCase(local179)) {
				local175 = Character.toLowerCase(local175);
				local179 = Character.toLowerCase(local179);
				if (local175 != local179) {
					return Static405.method5597(arg2, local175) - Static405.method5597(arg2, local179);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(233) int local233 = 0; local233 < local138; local233++) {
			@Pc(239) char local239 = arg1.charAt(local233);
			@Pc(243) char local243 = arg0.charAt(local233);
			if (local243 != local239) {
				return Static405.method5597(arg2, local239) - Static405.method5597(arg2, local243);
			}
		}
		return 0;
	}
}
