import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!oi;")
	public static Class185 aClass185_114;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "Lclient!ja;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
	public static int anInt6854 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!gh;)V")
	public static void method5448(@OriginalArg(0) Class93 arg0) {
		if (Static395.anInt6364 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub29 local6 = arg0.aClass1_Sub29_2;
		Static203.aClass93Array1[Static395.anInt6364] = arg0;
		Static192.aBooleanArray75[Static395.anInt6364] = false;
		Static395.anInt6364++;
		@Pc(21) int local21 = arg0.anInt2079;
		if (arg0.aBoolean222) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2079;
		if (arg0.aBoolean223) {
			local29 = Static112.anInt1710 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5838() + Static324.anInt5325 - local6.method5840() >> Static41.anInt612;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5838() + local6.method5840() - Static324.anInt5325 >> Static41.anInt612;
			if (local73 >= Static325.anInt5351) {
				local73 = Static325.anInt5351 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray29[local41++];
				@Pc(105) int local105 = (local6.method5837() + Static324.anInt5325 - local6.method5840() >> Static41.anInt612) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static174.anInt2873) {
					local113 = Static174.anInt2873 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static404.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static404.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static395.anInt6364;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static404.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static395.anInt6364 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static404.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static395.anInt6364 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static404.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static395.anInt6364 << 48;
					}
				}
			}
		}
	}
}
