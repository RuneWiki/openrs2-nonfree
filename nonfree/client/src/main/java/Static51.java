import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bu", name = "C", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "[Lclient!ln;")
	public static final Class204[] aClass204Array1 = new Class204[35];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!pg;)V")
	public static void method841(@OriginalArg(0) Class258 arg0) {
		if (Static218.anInt4299 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub22 local6 = arg0.aClass3_Sub22_2;
		Static569.aClass258Array1[Static218.anInt4299] = arg0;
		Static302.aBooleanArray31[Static218.anInt4299] = false;
		Static218.anInt4299++;
		@Pc(21) int local21 = arg0.anInt6859;
		if (arg0.aBoolean552) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6859;
		if (arg0.aBoolean553) {
			local29 = Static499.anInt7950 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6725() + Static122.anInt2780 - local6.method6729() >> Static458.anInt7508;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6725() + local6.method6729() - Static122.anInt2780 >> Static458.anInt7508;
			if (local73 >= Static157.anInt3168) {
				local73 = Static157.anInt3168 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray224[local41++];
				@Pc(105) int local105 = (local6.method6731() + Static122.anInt2780 - local6.method6729() >> Static458.anInt7508) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static411.anInt6927) {
					local113 = Static411.anInt6927 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static548.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static548.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static218.anInt4299;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static548.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static218.anInt4299 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static548.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static218.anInt4299 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static548.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static218.anInt4299 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZII)Z")
	public static boolean method844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static321.method5001(arg0, arg1) || Static330.method5099(arg0, arg1);
	}
}
