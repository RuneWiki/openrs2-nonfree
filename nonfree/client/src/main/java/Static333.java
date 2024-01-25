import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lha", name = "H", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!lha", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!lha", name = "N", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!lha", name = "O", descriptor = "I")
	public static int anInt6302;

	@OriginalMember(owner = "client!lha", name = "P", descriptor = "I")
	public static int anInt6303;

	@OriginalMember(owner = "client!lha", name = "B", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_111 = new Class44(40, 2);

	@OriginalMember(owner = "client!lha", name = "Q", descriptor = "[Lclient!ak;")
	public static final Class14_Sub3_Sub1[] aClass14_Sub3_Sub1Array3 = new Class14_Sub3_Sub1[14];

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIII)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static248.method3660(arg1);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg1 - arg5;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg1;
		@Pc(29) int local29 = -arg1;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static274.anIntArrayArray34[arg2];
		@Pc(47) int local47 = arg4 - local17;
		Static679.method9323(local42, arg4 - arg1, arg3, local47);
		@Pc(59) int local59 = local17 + arg4;
		Static679.method9323(local42, local47, arg0, local59);
		Static679.method9323(local42, local59, arg3, arg1 + arg4);
		while (local26 > local12) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static404.anIntArray538[local31] = local12;
				local31--;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(120) int[] local120;
			@Pc(127) int[] local127;
			@Pc(131) int local131;
			@Pc(136) int local136;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local17 > local26) {
					local120 = Static274.anIntArrayArray34[local26 + arg2];
					local127 = Static274.anIntArrayArray34[arg2 - local26];
					local131 = Static404.anIntArray538[local26];
					local136 = arg4 + local12;
					local140 = arg4 - local12;
					local144 = local131 + arg4;
					local149 = arg4 - local131;
					Static679.method9323(local120, local140, arg3, local149);
					Static679.method9323(local120, local149, arg0, local144);
					Static679.method9323(local120, local144, arg3, local136);
					Static679.method9323(local127, local140, arg3, local149);
					Static679.method9323(local127, local149, arg0, local144);
					Static679.method9323(local127, local144, arg3, local136);
				} else {
					local120 = Static274.anIntArrayArray34[arg2 + local26];
					local127 = Static274.anIntArrayArray34[arg2 - local26];
					local131 = local12 + arg4;
					local136 = arg4 - local12;
					Static679.method9323(local120, local136, arg3, local131);
					Static679.method9323(local127, local136, arg3, local131);
				}
			}
			local120 = Static274.anIntArrayArray34[local12 + arg2];
			local127 = Static274.anIntArrayArray34[arg2 - local12];
			local131 = local26 + arg4;
			local136 = arg4 - local26;
			if (local12 >= local17) {
				Static679.method9323(local120, local136, arg3, local131);
				Static679.method9323(local127, local136, arg3, local131);
			} else {
				local140 = local31 < local12 ? Static404.anIntArray538[local12] : local31;
				local144 = local140 + arg4;
				local149 = arg4 - local140;
				Static679.method9323(local120, local136, arg3, local149);
				Static679.method9323(local120, local149, arg0, local144);
				Static679.method9323(local120, local144, arg3, local131);
				Static679.method9323(local127, local136, arg3, local149);
				Static679.method9323(local127, local149, arg0, local144);
				Static679.method9323(local127, local144, arg3, local131);
			}
		}
	}
}
