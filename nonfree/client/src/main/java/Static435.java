import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "[S")
	public static short[] aShortArray105;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ni;)V")
	public static void method5886(@OriginalArg(0) Class168 arg0) {
		if (Static149.anInt2847 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub7 local6 = arg0.aClass2_Sub7_2;
		Static77.aClass168Array9[Static149.anInt2847] = arg0;
		Static448.aBooleanArray54[Static149.anInt2847] = false;
		Static149.anInt2847++;
		@Pc(21) int local21 = arg0.anInt4872;
		if (arg0.aBoolean418) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4872;
		if (arg0.aBoolean417) {
			local29 = Static58.anInt1578 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method2997() + Static176.anInt3421 - local6.method2992() >> Static250.anInt4056;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method2997() + local6.method2992() - Static176.anInt3421 >> Static250.anInt4056;
			if (local73 >= Static360.anInt6340) {
				local73 = Static360.anInt6340 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray54[local41++];
				@Pc(105) int local105 = (local6.method2991() + Static176.anInt3421 - local6.method2992() >> Static250.anInt4056) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static86.anInt2009) {
					local113 = Static86.anInt2009 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static427.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static427.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static149.anInt2847;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static427.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static149.anInt2847 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static427.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static149.anInt2847 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static427.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static149.anInt2847 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!pc;)V")
	public static void method5888(@OriginalArg(1) Class188 arg0) {
		Static92.aClass188_30 = arg0;
	}
}
