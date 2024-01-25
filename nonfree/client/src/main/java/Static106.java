import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
	public static int anInt2356;

	@OriginalMember(owner = "client!ew", name = "R", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!ew", name = "S", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array7;

	@OriginalMember(owner = "client!ew", name = "cb", descriptor = "Lclient!f;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!ew", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!gf;)V")
	public static void method1821(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static290.anInt5325 == arg0.anInt6108 || arg0.anInt6092 == -1 || arg0.anInt6083 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class96 local26 = Static196.aClass30_2.method942(arg0.anInt6092);
			if (local26.aBoolean258 || local26.anIntArray254[arg0.anInt6082] < arg0.lb + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6108 - arg0.anInt6123;
			@Pc(60) int local60 = Static290.anInt5325 - arg0.anInt6123;
			@Pc(73) int local73 = arg0.anInt6065 * 128 + arg0.method4831() * 64;
			@Pc(84) int local84 = arg0.anInt6061 * 128 + arg0.method4831() * 64;
			@Pc(96) int local96 = arg0.anInt6071 * 128 + arg0.method4831() * 64;
			@Pc(107) int local107 = arg0.anInt6085 * 128 + arg0.method4831() * 64;
			arg0.anInt6055 = (local60 * local107 + local84 * (local54 - local60)) / local54;
			arg0.anInt6053 = (local60 * local96 + local73 * (local54 - local60)) / local54;
		}
		arg0.anInt6134 = 0;
		if (arg0.anInt6089 == 0) {
			arg0.method4833(8192);
		}
		if (arg0.anInt6089 == 1) {
			arg0.method4833(12288);
		}
		if (arg0.anInt6089 == 2) {
			arg0.method4833(0);
		}
		if (arg0.anInt6089 == 3) {
			arg0.method4833(4096);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIFIIIFIFI[FII)V")
	public static void method1822(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg0 - arg6;
		@Pc(14) int local14 = arg8 - arg4;
		@Pc(18) int local18 = arg3 - arg2;
		@Pc(43) float local43 = arg9[0] * (float) local14 + arg9[1] * (float) local5 + arg9[2] * (float) local18;
		@Pc(64) float local64 = arg9[5] * (float) local18 + (float) local5 * arg9[4] + (float) local14 * arg9[3];
		@Pc(85) float local85 = (float) local5 * arg9[7] + arg9[6] * (float) local14 + (float) local18 * arg9[8];
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg11 == 0) {
			local96 = local43 + arg5 + 0.5F;
			local103 = arg7 + 0.5F - local85;
		} else if (arg11 == 1) {
			local103 = local85 + arg7 + 0.5F;
			local96 = arg5 + local43 + 0.5F;
		} else if (arg11 == 2) {
			local96 = arg5 + 0.5F - local43;
			local103 = arg1 + 0.5F - local64;
		} else if (arg11 == 3) {
			local96 = local43 + arg5 + 0.5F;
			local103 = arg1 + 0.5F - local64;
		} else if (arg11 == 4) {
			local96 = local85 + arg7 + 0.5F;
			local103 = arg1 + 0.5F - local64;
		} else {
			local96 = arg7 + 0.5F - local85;
			local103 = arg1 + 0.5F - local64;
		}
		@Pc(216) float local216;
		if (arg10 == 1) {
			local216 = local96;
			local96 = -local103;
			local103 = local216;
		} else if (arg10 == 2) {
			local96 = -local96;
			local103 = -local103;
		} else if (arg10 == 3) {
			local216 = local96;
			local96 = local103;
			local103 = -local216;
		}
		Static99.aFloat22 = local96;
		Static4.aFloat11 = local103;
	}
}
