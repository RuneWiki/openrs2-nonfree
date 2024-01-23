import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!mj;")
	public static Class64 aClass64_8;

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Lclient!ui;")
	public static Class103 aClass103_16 = new Class103(4096);

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "[I")
	public static int[] anIntArray455 = new int[] { 5, 0, 0, 6, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 0, -2, -2, 7, 0, 5, 4, 7, 0, 0, 1, -2, 0, 0, 0, 1, -1, 6, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 5, 2, -1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 24, 0, 0, -1, 0, -1, 0, 14, 0, 0, 6, 0, 0, 0, 4, 0, 6, 0, -2, 0, 0, 3, -2, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 10, 0, 1, 8, 0, 10, 0, 2, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 6, -1, 7, 0, 0, 0, 4, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 5, 0, -1, -2, 0, -1, 0, 0, -2, 12, 0, 4, 6, -2, 5, -2, 0, 0, 15, -2, 6, -2, 0, 3, 0, 0, 0, -1, 0, 8, 0, 0, 7, 6, 6, 6, 0, 8, 0, 6, 0, 0, 0, 20, 0, 4, 4, 0, 0, 6, 0, 3, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 8, 0, 2, 0, 0, 0, 2, 4, 0, 0, 6, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 8, -1, 0, -1, 1, -2, -2, 4, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZBIIILclient!c;)V")
	public static void method2181(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub3_Sub3 arg4) {
		if (Static143.anInt3258 >= 50 || (arg4.anIntArrayArray10 == null || arg4.anIntArrayArray10.length <= arg1 || arg4.anIntArrayArray10[arg1] == null)) {
			return;
		}
		@Pc(28) int local28 = arg4.anIntArrayArray10[arg1][0];
		@Pc(32) int local32 = local28 >> 8;
		@Pc(49) int local49;
		if (arg4.anIntArrayArray10[arg1].length > 1) {
			local49 = (int) ((double) arg4.anIntArrayArray10[arg1].length * Math.random());
			if (local49 > 0) {
				local32 = arg4.anIntArrayArray10[arg1][local49];
			}
		}
		@Pc(65) int local65 = local28 & 0xF;
		@Pc(71) int local71 = local28 >> 4 & 0x7;
		if (local65 == 0) {
			if (arg0) {
				Static39.method531(local71, 0, local32);
			}
		} else if (Static110.anInt2433 != 0) {
			Static126.anIntArray474[Static143.anInt3258] = local32;
			@Pc(94) int local94 = (arg3 - 64) / 128;
			local49 = (arg2 - 64) / 128;
			Static201.anIntArray726[Static143.anInt3258] = local71;
			Static116.anIntArray449[Static143.anInt3258] = 0;
			Static215.aClass66Array1[Static143.anInt3258] = null;
			Static25.anIntArray75[Static143.anInt3258] = (local49 << 16) + (local94 << 8) + local65;
			Static143.anInt3258++;
		}
	}
}
