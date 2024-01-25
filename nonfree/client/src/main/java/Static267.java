import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!nd;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method3730(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
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
			@Pc(56) char local56;
			if (local17 == '\u0000') {
				local56 = arg0.charAt(local13++);
			} else {
				local56 = local17;
			}
			@Pc(72) char local72;
			if (local19 == '\u0000') {
				local72 = arg1.charAt(local15++);
			} else {
				local72 = local19;
			}
			local17 = Static121.method1886(local56);
			local19 = Static121.method1886(local72);
			local56 = Static164.method2554(arg2, local56);
			local72 = Static164.method2554(arg2, local72);
			if (local56 != local72 && Character.toUpperCase(local56) != Character.toUpperCase(local72)) {
				local56 = Character.toLowerCase(local56);
				local72 = Character.toLowerCase(local72);
				if (local72 != local56) {
					return Static67.method997(arg2, local56) - Static67.method997(arg2, local72);
				}
			}
		}
		@Pc(132) int local132 = Math.min(local8, local11);
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			if (arg2 == 2) {
				local13 = local8 - local134 - 1;
				local15 = local11 - local134 - 1;
			} else {
				local15 = local134;
				local13 = local134;
			}
			@Pc(162) char local162 = arg0.charAt(local13);
			@Pc(166) char local166 = arg1.charAt(local15);
			if (local166 != local162 && Character.toUpperCase(local162) != Character.toUpperCase(local166)) {
				local162 = Character.toLowerCase(local162);
				local166 = Character.toLowerCase(local166);
				if (local166 != local162) {
					return Static67.method997(arg2, local162) - Static67.method997(arg2, local166);
				}
			}
		}
		@Pc(202) int local202 = local8 - local11;
		if (local202 != 0) {
			return local202;
		}
		for (@Pc(216) int local216 = 0; local216 < local132; local216++) {
			@Pc(222) char local222 = arg0.charAt(local216);
			@Pc(226) char local226 = arg1.charAt(local216);
			if (local226 != local222) {
				return Static67.method997(arg2, local222) - Static67.method997(arg2, local226);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I")
	public static int method3732() {
		if (Static206.aClass229_6 == null) {
			if (!Static378.aBoolean549 && Static119.anInt2296 > 0) {
				if (Static54.aBoolean82 && Static254.aClass10_1.method221(81) && Static119.anInt2296 > 2) {
					return ((Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261.aClass1_261).anInt228;
				}
				return ((Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261).anInt228;
			}
			@Pc(24) int local24 = Static38.aClass32_1.method3517();
			@Pc(28) int local28 = Static38.aClass32_1.method3524();
			@Pc(30) int local30 = Static256.anInt4398;
			@Pc(32) int local32 = Static423.anInt7379;
			@Pc(34) int local34 = Static102.anInt1978;
			if (local30 < local24 && local34 + local30 > local24) {
				@Pc(44) int local44 = -1;
				@Pc(63) int local63;
				for (@Pc(46) int local46 = 0; local46 < Static119.anInt2296; local46++) {
					if (Static264.aBoolean355) {
						local63 = local32 + (Static119.anInt2296 + -1 + -local46) * 16 + 33;
						if (local63 - 13 < local28 && local28 <= local63 + 3) {
							local44 = local46;
						}
					} else {
						local63 = (Static119.anInt2296 - local46 - 1) * 16 + local32 + 31;
						if (local28 > local63 - 13 && local28 <= local63 + 3) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local63 = 0;
					@Pc(132) Class117 local132 = new Class117(Static251.aClass142_26);
					for (@Pc(137) Class1_Sub3 local137 = (Class1_Sub3) local132.method2533(); local137 != null; local137 = (Class1_Sub3) local132.method2532()) {
						if (local44 == local63++) {
							return local137.anInt228;
						}
					}
				}
			}
		}
		return -1;
	}
}
