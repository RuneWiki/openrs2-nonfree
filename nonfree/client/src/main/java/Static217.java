import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "[Lclient!je;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lclient!wd;")
	public static Class1_Sub24_Sub4 aClass1_Sub24_Sub4_3;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
	public static int[] anIntArray341 = new int[14];

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "[I")
	public static int[] anIntArray342 = new int[100];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!rj;I)[Lclient!je;")
	public static Class83[] method3413(@OriginalArg(0) Class154 arg0) {
		if (!arg0.method3896()) {
			return new Class83[0];
		}
		@Pc(16) Class185 local16 = arg0.method3883();
		while (local16.anInt5276 == 0) {
			Static282.method4345(10L);
		}
		if (local16.anInt5276 == 2) {
			return new Class83[0];
		}
		@Pc(39) int[] local39 = (int[]) local16.anObject6;
		@Pc(45) Class83[] local45 = new Class83[local39.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local45.length; local52++) {
			@Pc(60) Class83 local60 = new Class83();
			local45[local52] = local60;
			local60.anInt2590 = local39[local52 << 2];
			local60.anInt2586 = local39[(local52 << 2) + 1];
			local60.anInt2584 = local39[(local52 << 2) + 2];
			local60.anInt2588 = local39[(local52 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ia;IIIIIIII)V")
	public static void method3414(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg6 & 0x3;
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (local9 == 1 || local9 == 3) {
			local18 = arg0.anInt2385;
			local21 = arg0.anInt2377;
		} else {
			local18 = arg0.anInt2377;
			local21 = arg0.anInt2385;
		}
		@Pc(41) int local41;
		@Pc(49) int local49;
		if (arg1 + local18 <= 104) {
			local41 = arg1 + (local18 >> 1);
			local49 = arg1 + (local18 + 1 >> 1);
		} else {
			local41 = arg1;
			local49 = arg1 + 1;
		}
		@Pc(65) int local65 = (arg4 << 7) + (local21 << 6);
		@Pc(73) int local73 = 0;
		@Pc(77) int[][] local77 = Static24.anIntArrayArrayArray2[arg5];
		@Pc(85) int local85 = (arg1 << 7) + (local18 << 6);
		@Pc(97) int local97;
		@Pc(106) int local106;
		if (arg4 + local21 <= 104) {
			local97 = arg4 + (local21 >> 1);
			local106 = arg4 + (local21 + 1 >> 1);
		} else {
			local106 = arg4 + 1;
			local97 = arg4;
		}
		@Pc(141) int local141 = local77[local49][local97] + local77[local41][local97] + local77[local41][local106] + local77[local49][local106] >> 2;
		@Pc(151) int[][] local151;
		if (arg5 != 0) {
			local151 = Static24.anIntArrayArrayArray2[0];
			local73 = local141 - (local151[local49][local106] + local151[local41][local106] + local151[local49][local97] + local151[local41][local97] >> 2);
		}
		local151 = null;
		if (arg5 < 3) {
			local151 = Static24.anIntArrayArrayArray2[arg5 + 1];
		}
		@Pc(207) Class177 local207 = arg0.method2037(false, arg7, arg6, null, true, local65, local77, local141, local85, local151);
		Static150.method2531(local207.aClass23_Sub1_4, local85 - arg3, local73, local65 - arg2);
	}
}
