import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array60;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!fu;)V")
	public static void method5840(@OriginalArg(0) Class108 arg0) {
		if (Static5.anInt146 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub5 local6 = arg0.aClass1_Sub5_1;
		Static102.aClass108Array1[Static5.anInt146] = arg0;
		Static179.aBooleanArray11[Static5.anInt146] = false;
		Static5.anInt146++;
		@Pc(21) int local21 = arg0.anInt2842;
		if (arg0.aBoolean241) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2842;
		if (arg0.aBoolean242) {
			local29 = Static63.anInt1587 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4314() + Static270.anInt5197 - local6.method4311() >> Static275.anInt5260;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4314() + local6.method4311() - Static270.anInt5197 >> Static275.anInt5260;
			if (local73 >= Static420.anInt7323) {
				local73 = Static420.anInt7323 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray62[local41++];
				@Pc(105) int local105 = (local6.method4306() + Static270.anInt5197 - local6.method4311() >> Static275.anInt5260) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static501.anInt9458) {
					local113 = Static501.anInt9458 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static8.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static8.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static5.anInt146;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static8.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static5.anInt146 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static8.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static5.anInt146 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static8.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static5.anInt146 << 48;
					}
				}
			}
		}
	}
}
