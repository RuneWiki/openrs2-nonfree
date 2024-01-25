import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!e", name = "q", descriptor = "[Lclient!i;")
	public static Class127[] aClass127Array5;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!oaa;)V")
	public static void method4747(@OriginalArg(0) Class235 arg0) {
		if (Static346.anInt6230 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub9 local6 = arg0.aClass3_Sub9_2;
		Static196.aClass235Array1[Static346.anInt6230] = arg0;
		Static561.aBooleanArray34[Static346.anInt6230] = false;
		Static346.anInt6230++;
		@Pc(21) int local21 = arg0.anInt6525;
		if (arg0.aBoolean461) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6525;
		if (arg0.aBoolean462) {
			local29 = Static590.anInt10277 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5999() + Static211.anInt8485 - local6.method6000() >> Static385.anInt6657;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5999() + local6.method6000() - Static211.anInt8485 >> Static385.anInt6657;
			if (local73 >= Static414.anInt7451) {
				local73 = Static414.anInt7451 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray97[local41++];
				@Pc(105) int local105 = (local6.method5997() + Static211.anInt8485 - local6.method6000() >> Static385.anInt6657) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static349.anInt6237) {
					local113 = Static349.anInt6237 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static31.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static31.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static346.anInt6230;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static31.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static346.anInt6230 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static31.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static346.anInt6230 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static31.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static346.anInt6230 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public static void method4749(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub19 local12 = Static73.method5992(2, arg0);
		local12.method7364();
	}
}
