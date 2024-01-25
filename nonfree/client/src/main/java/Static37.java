import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public static int anInt1023;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public static int anInt1026 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!dl;)V")
	public static void method887(@OriginalArg(0) Class54 arg0) {
		if (Static298.anInt5454 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub23 local6 = arg0.aClass3_Sub23_1;
		Static303.aClass54Array1[Static298.anInt5454] = arg0;
		Static35.aBooleanArray19[Static298.anInt5454] = false;
		Static298.anInt5454++;
		@Pc(21) int local21 = arg0.anInt1656;
		if (arg0.aBoolean134) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt1656;
		if (arg0.aBoolean133) {
			local29 = Static281.anInt5169 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3678() + Static340.anInt6290 - local6.method3670() >> Static287.anInt5248;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3678() + local6.method3670() - Static340.anInt6290 >> Static287.anInt5248;
			if (local73 >= Static57.anInt1411) {
				local73 = Static57.anInt1411 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray19[local41++];
				@Pc(105) int local105 = (local6.method3679() + Static340.anInt6290 - local6.method3670() >> Static287.anInt5248) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static177.anInt3621) {
					local113 = Static177.anInt3621 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static341.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static341.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static298.anInt5454;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static341.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static298.anInt5454 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static341.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static298.anInt5454 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static341.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static298.anInt5454 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZI)I")
	public static int method888(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && local8.anIntArray360.length > arg2) {
			return local8.anIntArray360[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)I")
	public static int method889(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
