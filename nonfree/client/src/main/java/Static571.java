import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "Lclient!kc;")
	public static Class202 aClass202_12;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Lclient!gj;")
	public static Class143 aClass143_129;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!fca;)Lclient!hja;")
	public static Class84_Sub1 method7725(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(7) Class84 local7 = Static227.method3653(arg0);
		@Pc(11) int local11 = arg0.method4858();
		@Pc(15) int local15 = arg0.method4858();
		@Pc(27) int local27 = arg0.method4858();
		@Pc(31) int local31 = arg0.method4858();
		@Pc(35) int local35 = arg0.method4858();
		@Pc(39) int local39 = arg0.method4858();
		return new Class84_Sub1(local7.aClass92_13, local7.aClass65_17, local7.anInt10347, local7.anInt10345, local7.anInt10343, local7.anInt10342, local7.anInt10344, local7.anInt10346, local7.anInt10349, local11, local15, local27, local31, local35, local39);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ffa;)V")
	public static void method7726(@OriginalArg(0) Class119 arg0) {
		if (Static379.anInt9747 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub7 local6 = arg0.aClass3_Sub7_1;
		Static135.aClass119Array1[Static379.anInt9747] = arg0;
		Static143.aBooleanArray11[Static379.anInt9747] = false;
		Static379.anInt9747++;
		@Pc(21) int local21 = arg0.anInt2998;
		if (arg0.aBoolean236) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2998;
		if (arg0.aBoolean237) {
			local29 = Static373.anInt6613 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6343() + Static589.anInt9316 - local6.method6349() >> Static436.anInt7634;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6343() + local6.method6349() - Static589.anInt9316 >> Static436.anInt7634;
			if (local73 >= Static315.anInt5894) {
				local73 = Static315.anInt5894 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray58[local41++];
				@Pc(105) int local105 = (local6.method6348() + Static589.anInt9316 - local6.method6349() >> Static436.anInt7634) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static410.anInt6962) {
					local113 = Static410.anInt6962 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static71.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static71.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static379.anInt9747;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static71.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static379.anInt9747 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static71.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static379.anInt9747 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static71.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static379.anInt9747 << 48;
					}
				}
			}
		}
	}
}
