import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public static int anInt5149;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_9 = new Class316(3, 3);

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!hk;")
	public static final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method4180() {
		@Pc(12) Class1_Sub11 local12 = Static276.method3885(Static43.aClass70_12, Static481.aClass276_2);
		local12.aClass1_Sub35_Sub2_1.method5777(0);
		Static48.method743(local12);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B[I[[B[B[[B[III)I")
	public static int method4181(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4[arg5];
		@Pc(16) int local16 = local9 + arg0[arg5];
		@Pc(20) int local20 = arg4[arg6];
		@Pc(26) int local26 = local20 + arg0[arg6];
		@Pc(28) int local28 = local9;
		if (local20 > local9) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local26 < local16) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg2[arg5] & 0xFF;
		if ((arg2[arg6] & 0xFF) < local50) {
			local50 = arg2[arg6] & 0xFF;
		}
		@Pc(72) byte[] local72 = arg1[arg5];
		@Pc(76) byte[] local76 = arg3[arg6];
		@Pc(81) int local81 = local28 - local9;
		@Pc(85) int local85 = local28 - local20;
		for (@Pc(87) int local87 = local28; local87 < local35; local87++) {
			@Pc(99) int local99 = local72[local81++] + local76[local85++];
			if (local99 < local50) {
				local50 = local99;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	public static void method4184(@OriginalArg(0) boolean arg0) {
		if (Static521.aClass163_1 == null) {
			Static216.method3353();
		}
		if (arg0) {
			Static521.aClass163_1.method3460();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!rga;III)V")
	public static void method4185(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class39 local12;
		if (arg2 < Static27.anInt373) {
			local12 = Static292.aClass39ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass8_Sub3_Sub1_1 != null && local12.aClass8_Sub3_Sub1_1.method7629()) {
				arg0.method7623(0, true, Static402.aClass134_11, local12.aClass8_Sub3_Sub1_1, Static379.anInt6307, 0);
			}
		}
		if (arg3 < Static27.anInt373) {
			local12 = Static292.aClass39ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub3_Sub1_1 != null && local12.aClass8_Sub3_Sub1_1.method7629()) {
				arg0.method7623(0, true, Static402.aClass134_11, local12.aClass8_Sub3_Sub1_1, 0, Static379.anInt6307);
			}
		}
		if (arg2 < Static27.anInt373 && arg3 < Static507.anInt8645) {
			local12 = Static292.aClass39ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub3_Sub1_1 != null && local12.aClass8_Sub3_Sub1_1.method7629()) {
				arg0.method7623(0, true, Static402.aClass134_11, local12.aClass8_Sub3_Sub1_1, Static379.anInt6307, Static379.anInt6307);
			}
		}
		if (arg2 < Static27.anInt373 && arg3 > 0) {
			local12 = Static292.aClass39ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass8_Sub3_Sub1_1 != null && local12.aClass8_Sub3_Sub1_1.method7629()) {
				arg0.method7623(0, true, Static402.aClass134_11, local12.aClass8_Sub3_Sub1_1, Static379.anInt6307, -Static379.anInt6307);
			}
		}
	}
}
