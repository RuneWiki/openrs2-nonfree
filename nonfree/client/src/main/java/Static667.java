import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!uu", name = "D", descriptor = "Ljava/lang/Class;")
	public static Class aClass29;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "[I")
	public static final int[] anIntArray749 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
	public static int anInt10219 = 0;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "[I")
	public static final int[] anIntArray750 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ee;IIIII)V")
	public static void method8690(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static169.anInt2992) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static128.anInt2531) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static448.anInt6835 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class364 local77 = Static448.aClass364ArrayArrayArray2[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static477.aClass259Array3[local17].method9295(local35, local23) + Static477.aClass259Array3[local17].method9295(local35, local23 + 1) + Static477.aClass259Array3[local17].method9295(local35 + 1, local23) + Static477.aClass259Array3[local17].method9295(local35 + 1, local23 + 1)) / 4 - (Static477.aClass259Array3[arg1].method9295(arg3, arg2) + Static477.aClass259Array3[arg1].method9295(arg3, arg2 + 1) + Static477.aClass259Array3[arg1].method9295(arg3 + 1, arg2) + Static477.aClass259Array3[arg1].method9295(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class9_Sub1_Sub2 local166 = local77.aClass9_Sub1_Sub2_2;
									@Pc(169) Class9_Sub1_Sub2 local169 = local77.aClass9_Sub1_Sub2_1;
									if (local166 != null && local166.method9077()) {
										arg0.method9091(local166, Static404.aClass22_6, local163, local1, (local23 - arg2) * Static308.anInt4969 + (1 - arg4) * Static434.anInt10639, (local35 - arg3) * Static308.anInt4969 + (1 - arg5) * Static434.anInt10639);
									}
									if (local169 != null && local169.method9077()) {
										arg0.method9091(local169, Static404.aClass22_6, local163, local1, (local23 - arg2) * Static308.anInt4969 + (1 - arg4) * Static434.anInt10639, (local35 - arg3) * Static308.anInt4969 + (1 - arg5) * Static434.anInt10639);
									}
									for (@Pc(250) Class181 local250 = local77.aClass181_3; local250 != null; local250 = local250.aClass181_2) {
										@Pc(254) Class9_Sub1_Sub1 local254 = local250.aClass9_Sub1_Sub1_1;
										if (local254 != null && local254.method9077() && (local23 == local254.aShort123 || local23 == local3) && (local35 == local254.aShort120 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort122 + 1 - local254.aShort123;
											@Pc(302) int local302 = local254.aShort121 + 1 - local254.aShort120;
											arg0.method9091(local254, Static404.aClass22_6, local163, local1, (local254.aShort123 - arg2) * Static308.anInt4969 + (local294 - arg4) * Static434.anInt10639, (local254.aShort120 - arg3) * Static308.anInt4969 + (local302 - arg5) * Static434.anInt10639);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
