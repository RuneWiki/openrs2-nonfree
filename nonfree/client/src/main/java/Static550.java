import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString218;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vo;")
	public static Class348 aClass348_125;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	public static int anInt10029 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!eb;)V")
	public static void method7720(@OriginalArg(0) Class85 arg0) {
		if (Static566.anInt10281 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub3 local6 = arg0.aClass4_Sub3_1;
		Static201.aClass85Array1[Static566.anInt10281] = arg0;
		Static516.aBooleanArray25[Static566.anInt10281] = false;
		Static566.anInt10281++;
		@Pc(21) int local21 = arg0.anInt2551;
		if (arg0.aBoolean198) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2551;
		if (arg0.aBoolean197) {
			local29 = Static218.anInt4559 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4949() + Static209.anInt4422 - local6.method4950() >> Static392.anInt3635;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4949() + local6.method4950() - Static209.anInt4422 >> Static392.anInt3635;
			if (local73 >= Static255.anInt5209) {
				local73 = Static255.anInt5209 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray24[local41++];
				@Pc(105) int local105 = (local6.method4954() + Static209.anInt4422 - local6.method4950() >> Static392.anInt3635) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static10.anInt812) {
					local113 = Static10.anInt812 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static358.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static358.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static566.anInt10281;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static358.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static566.anInt10281 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static358.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static566.anInt10281 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static358.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static566.anInt10281 << 48;
					}
				}
			}
		}
	}
}
