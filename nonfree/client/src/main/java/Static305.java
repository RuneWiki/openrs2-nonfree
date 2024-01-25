import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lclient!uq;")
	public static Class362 aClass362_61;

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
	public static int anInt5136;

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lclient!nq;")
	public static final Class255 aClass255_3 = new Class255(false);

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "Lclient!nq;")
	public static Class255 aClass255_2 = aClass255_3;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	public static void method4419() {
		Static386.aClass295_42.method6464();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!fq;Lclient!mu;II)V")
	public static void method4420(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(3) int arg2) {
		if (Static217.anInt10315 >= 50 || (arg1 == null || arg1.anIntArrayArray40 == null || arg1.anIntArrayArray40.length <= arg2 || arg1.anIntArrayArray40[arg2] == null)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArrayArray40[arg2][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray40[arg2].length > 1) {
			local59 = (int) ((double) arg1.anIntArrayArray40[arg2].length * Math.random());
			if (local59 > 0) {
				local34 = arg1.anIntArrayArray40[arg2][local59];
			}
		}
		@Pc(75) int local75 = local30 & 0x1F;
		local59 = 256;
		if (arg1.anIntArray336 != null && arg1.anIntArray338 != null) {
			local59 = arg1.anIntArray336[arg2] + (int) ((double) (arg1.anIntArray338[arg2] - arg1.anIntArray336[arg2]) * Math.random());
		}
		@Pc(112) int local112 = arg1.anIntArray335 == null ? 255 : arg1.anIntArray335[arg2];
		if (local75 == 0) {
			if (arg0 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1) {
				if (!arg1.aBoolean448) {
					Static248.method4092(local34, 0, local112, local59, local40);
					return;
				}
				Static224.method3294(local59, local40, local34, local112, false, 0);
			}
		} else if (Static336.aClass3_Sub41_18.aClass14_Sub9_2.method2998() != 0) {
			@Pc(153) int local153 = arg0.anInt9614 - 256 >> 9;
			@Pc(160) int local160 = arg0.anInt9619 - 256 >> 9;
			@Pc(180) int local180 = arg0 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 ? 0 : local75 + (local160 << 8) + (arg0.aByte132 << 24) + (local153 << 16);
			Static2.aClass51Array1[Static217.anInt10315++] = new Class51((byte) (arg1.aBoolean448 ? 2 : 1), local34, local40, 0, local112, local180, local59, arg0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([IIII[I)V")
	public static void method4422(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg2; local63++) {
			if (local28 + (local63 & local61) > arg3[local63]) {
				@Pc(78) int local78 = arg3[local63];
				arg3[local63] = arg3[local24];
				arg3[local24] = local78;
				@Pc(92) int local92 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24++] = local92;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method4422(arg0, arg1, local24 - 1, arg3);
		method4422(arg0, local24 + 1, arg2, arg3);
	}
}
