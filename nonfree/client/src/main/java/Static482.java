import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "[I")
	public static final int[] anIntArray416 = new int[14];

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
	public static void method6364() {
		@Pc(7) int local7 = Static439.anInt7133;
		@Pc(9) int[] local9 = Static294.anIntArray593;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class34_Sub1_Sub1_Sub2_Sub1 local19 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt9661 > 0) {
				local19.anInt9661--;
				if (local19.anInt9661 == 0) {
					local19.aString108 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static52.anInt1140; local54++) {
			@Pc(61) long local61 = (long) Static603.anIntArray537[local54];
			@Pc(67) Class3_Sub52 local67 = (Class3_Sub52) Static105.aClass333_11.method7489(local61);
			if (local67 != null) {
				@Pc(72) Class34_Sub1_Sub1_Sub2_Sub2 local72 = local67.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				if (local72.anInt9661 > 0) {
					local72.anInt9661--;
					if (local72.anInt9661 == 0) {
						local72.aString108 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZIII)V")
	public static void method6365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(17) int local17 = -arg1;
		Static578.method7640(arg2, arg3 - arg1, arg1 + arg3, Static276.anIntArrayArray32[arg0]);
		@Pc(31) int local31 = -1;
		while (local14 > local12) {
			local31 += 2;
			local12++;
			local17 += local31;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(57) int[] local57 = Static276.anIntArrayArray32[arg0 + local14];
				@Pc(63) int[] local63 = Static276.anIntArrayArray32[arg0 - local14];
				@Pc(67) int local67 = local12 + arg3;
				@Pc(71) int local71 = arg3 - local12;
				Static578.method7640(arg2, local71, local67, local57);
				Static578.method7640(arg2, local71, local67, local63);
			}
			@Pc(87) int local87 = local14 + arg3;
			@Pc(91) int local91 = arg3 - local14;
			@Pc(98) int[] local98 = Static276.anIntArrayArray32[arg0 + local12];
			@Pc(105) int[] local105 = Static276.anIntArrayArray32[arg0 - local12];
			Static578.method7640(arg2, local91, local87, local98);
			Static578.method7640(arg2, local91, local87, local105);
		}
	}
}
