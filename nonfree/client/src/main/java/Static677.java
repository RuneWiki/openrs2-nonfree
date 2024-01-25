import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "[B")
	public static byte[] aByteArray109;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Z")
	public static boolean aBoolean804 = false;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Lclient!de;")
	public static final Class60 aClass60_12 = new Class60("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII)V")
	public static void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static143.method2495(arg2);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg2 - arg5;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg1 >= Static73.anInt1542 && Static527.anInt8177 >= arg1) {
			@Pc(52) int[] local52 = Static172.anIntArrayArray17[arg1];
			local61 = Static385.method4989(Static472.anInt7503, arg0 - arg2, Static257.anInt4172);
			local69 = Static385.method4989(Static472.anInt7503, arg0 + arg2, Static257.anInt4172);
			local78 = Static385.method4989(Static472.anInt7503, arg0 - local17, Static257.anInt4172);
			local87 = Static385.method4989(Static472.anInt7503, arg0 + local17, Static257.anInt4172);
			Static559.method7424(arg4, local52, local78, local61);
			Static559.method7424(arg3, local52, local87, local78);
			Static559.method7424(arg4, local52, local69, local87);
		}
		while (local26 > local12) {
			local38 += 2;
			local36 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				local34 -= local31 << 1;
				Static141.anIntArray185[local31] = local12;
			}
			local12++;
			@Pc(243) int local243;
			@Pc(252) int local252;
			@Pc(259) int[] local259;
			@Pc(154) int local154;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local154 = arg1 - local26;
				local61 = arg1 + local26;
				if (local61 >= Static73.anInt1542 && local154 <= Static527.anInt8177) {
					if (local26 >= local17) {
						local69 = Static385.method4989(Static472.anInt7503, local12 + arg0, Static257.anInt4172);
						local78 = Static385.method4989(Static472.anInt7503, arg0 - local12, Static257.anInt4172);
						if (Static527.anInt8177 >= local61) {
							Static559.method7424(arg4, Static172.anIntArrayArray17[local61], local69, local78);
						}
						if (local154 >= Static73.anInt1542) {
							Static559.method7424(arg4, Static172.anIntArrayArray17[local154], local69, local78);
						}
					} else {
						local69 = Static141.anIntArray185[local26];
						local78 = Static385.method4989(Static472.anInt7503, local12 + arg0, Static257.anInt4172);
						local87 = Static385.method4989(Static472.anInt7503, arg0 - local12, Static257.anInt4172);
						local243 = Static385.method4989(Static472.anInt7503, local69 + arg0, Static257.anInt4172);
						local252 = Static385.method4989(Static472.anInt7503, arg0 - local69, Static257.anInt4172);
						if (Static527.anInt8177 >= local61) {
							local259 = Static172.anIntArrayArray17[local61];
							Static559.method7424(arg4, local259, local252, local87);
							Static559.method7424(arg3, local259, local243, local252);
							Static559.method7424(arg4, local259, local78, local243);
						}
						if (Static73.anInt1542 <= local154) {
							local259 = Static172.anIntArrayArray17[local154];
							Static559.method7424(arg4, local259, local252, local87);
							Static559.method7424(arg3, local259, local243, local252);
							Static559.method7424(arg4, local259, local78, local243);
						}
					}
				}
			}
			local154 = arg1 - local12;
			local61 = arg1 + local12;
			if (local61 >= Static73.anInt1542 && local154 <= Static527.anInt8177) {
				local69 = local26 + arg0;
				local78 = arg0 - local26;
				if (Static472.anInt7503 <= local69 && local78 <= Static257.anInt4172) {
					local69 = Static385.method4989(Static472.anInt7503, local69, Static257.anInt4172);
					local78 = Static385.method4989(Static472.anInt7503, local78, Static257.anInt4172);
					if (local12 >= local17) {
						if (local61 <= Static527.anInt8177) {
							Static559.method7424(arg4, Static172.anIntArrayArray17[local61], local69, local78);
						}
						if (Static73.anInt1542 <= local154) {
							Static559.method7424(arg4, Static172.anIntArrayArray17[local154], local69, local78);
						}
					} else {
						local87 = local12 > local31 ? Static141.anIntArray185[local12] : local31;
						local243 = Static385.method4989(Static472.anInt7503, arg0 + local87, Static257.anInt4172);
						local252 = Static385.method4989(Static472.anInt7503, arg0 - local87, Static257.anInt4172);
						if (local61 <= Static527.anInt8177) {
							local259 = Static172.anIntArrayArray17[local61];
							Static559.method7424(arg4, local259, local252, local78);
							Static559.method7424(arg3, local259, local243, local252);
							Static559.method7424(arg4, local259, local69, local243);
						}
						if (Static73.anInt1542 <= local154) {
							local259 = Static172.anIntArrayArray17[local154];
							Static559.method7424(arg4, local259, local252, local78);
							Static559.method7424(arg3, local259, local243, local252);
							Static559.method7424(arg4, local259, local69, local243);
						}
					}
				}
			}
		}
	}
}
