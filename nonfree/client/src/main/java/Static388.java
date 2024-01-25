import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
	public static final int[] anIntArray380 = new int[2];

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
	public static final int[] anIntArray381 = new int[2048];

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public static int anInt6737 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!cb;I)V")
	public static void method5674(@OriginalArg(0) Class50 arg0) {
		Static551.anInt9039 = arg0.method900("p11_full");
		Static90.anInt1505 = arg0.method900("p12_full");
		Static6.anInt137 = arg0.method900("b12_full");
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vfa;)V")
	public static void method5678(@OriginalArg(0) Class371 arg0) {
		if (Static111.anInt10678 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = arg0.aClass5_Sub3_3;
		Static602.aClass371Array5[Static111.anInt10678] = arg0;
		Static334.aBooleanArray15[Static111.anInt10678] = false;
		Static111.anInt10678++;
		@Pc(21) int local21 = arg0.anInt10052;
		if (arg0.aBoolean733) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt10052;
		if (arg0.aBoolean734) {
			local29 = Static202.anInt3256 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8323() + Static143.anInt2383 - local6.method8319() >> Static138.anInt2287;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8323() + local6.method8319() - Static143.anInt2383 >> Static138.anInt2287;
			if (local73 >= Static92.anInt1526) {
				local73 = Static92.anInt1526 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray128[local41++];
				@Pc(105) int local105 = (local6.method8317() + Static143.anInt2383 - local6.method8319() >> Static138.anInt2287) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static665.anInt7330) {
					local113 = Static665.anInt7330 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static98.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static98.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static111.anInt10678;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static98.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static111.anInt10678 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static98.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static111.anInt10678 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static98.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static111.anInt10678 << 48;
					}
				}
			}
		}
	}
}
