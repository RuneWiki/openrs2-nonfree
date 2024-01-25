import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIILclient!ha;I)V")
	public static void method2243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) int arg4) {
		arg3.KA(arg1, arg4, arg1 + arg0, arg4 + arg2);
		arg3.method6252(arg4, arg1, -16777216, arg2, arg0);
		if (Static8.anInt166 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static407.anInt6536 / (float) Static407.anInt6541;
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg2;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg0);
		} else {
			local36 = (int) ((float) arg2 / local34);
		}
		@Pc(63) int local63 = arg1 + (arg0 - local36) / 2;
		@Pc(72) int local72 = arg4 + (arg2 - local38) / 2;
		if (Static188.aClass59_6 == null || Static188.aClass59_6.method8049() != arg0 || arg2 != Static188.aClass59_6.method8061()) {
			Static407.method5509(Static407.anInt6543, Static407.anInt6539 + Static407.anInt6536, Static407.anInt6541 + Static407.anInt6543, Static407.anInt6539, local63, local72, local63 + local36, local38 + local72);
			Static407.method5504(arg3);
			Static188.aClass59_6 = arg3.method6265(local63, local72, local36, local38, false);
		}
		Static188.aClass59_6.method8057(local63, local72);
		@Pc(125) int local125 = Static376.anInt6560 * local36 / Static407.anInt6541;
		@Pc(131) int local131 = local38 * Static573.anInt9368 / Static407.anInt6536;
		@Pc(140) int local140 = local63 + local36 * Static366.anInt6510 / Static407.anInt6541;
		@Pc(155) int local155 = local72 + local38 - local131 - local38 * Static322.anInt5884 / Static407.anInt6536;
		@Pc(157) int local157 = -1996554240;
		if (Static478.aClass174_6 == Static591.aClass174_7) {
			local157 = -1996488705;
		}
		arg3.aa(local140, local155, local125, local131, local157, 1);
		arg3.method6229(local140, local155, local125, local131, local157, 0);
		if (Static588.anInt9639 <= 0) {
			return;
		}
		@Pc(192) int local192;
		if (Static452.anInt7898 <= 50) {
			local192 = Static452.anInt7898 * 5;
		} else {
			local192 = (100 - Static452.anInt7898) * 5;
		}
		for (@Pc(205) Class5_Sub40 local205 = (Class5_Sub40) Static407.aClass124_66.method2572(); local205 != null; local205 = (Class5_Sub40) Static407.aClass124_66.method2569()) {
			@Pc(212) Class262 local212 = Static407.aClass218_3.method5163(local205.anInt7515);
			if (Static180.method2644(local212)) {
				@Pc(229) int local229;
				@Pc(241) int local241;
				if (Static21.anInt152 == local205.anInt7515) {
					local229 = local205.anInt7521 * local36 / Static407.anInt6541 + local63;
					local241 = (Static407.anInt6536 - local205.anInt7516) * local38 / Static407.anInt6536 + local72;
					arg3.method6252(local241 - 2, local229 + -2, local192 << 24 | 0xFFFF00, 4, 4);
				} else if (Static143.anInt2376 != -1 && local212.anInt7615 == Static143.anInt2376) {
					local229 = local63 + local36 * local205.anInt7521 / Static407.anInt6541;
					local241 = local38 * (Static407.anInt6536 - local205.anInt7516) / Static407.anInt6536 + local72;
					arg3.method6252(local241 - 2, local229 + -2, local192 << 24 | 0xFFFF00, 4, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(BI)Z")
	public static boolean method2244(@OriginalArg(1) int arg0) {
		if (arg0 == 47 || arg0 == 5 || arg0 == 9 || arg0 == 46 || arg0 == 17) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 1002;
		}
	}
}
