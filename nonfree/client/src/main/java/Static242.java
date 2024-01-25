import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!er;")
	public static final Class69 aClass69_48 = new Class69(8);

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ap;I)V")
	public static void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub1 arg1) {
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		if (Static175.anInt3261 < arg1.anInt6105) {
			Static190.method2801(arg1);
		} else if (arg1.anInt6087 < Static175.anInt3261) {
			Static302.method4181(false, arg1);
			local15 = Static283.anInt5103;
			local13 = Static415.anInt7049;
		} else {
			Static92.method1506(arg1);
		}
		if (arg1.anInt6062 < 128 || arg1.anInt6061 < 128 || Static126.anInt2569 * 128 - 128 <= arg1.anInt6062 || arg1.anInt6061 >= Static190.anInt3697 * 128 - 128) {
			arg1.anInt6068 = -1;
			arg1.anInt6105 = 0;
			arg1.anInt6084 = -1;
			local15 = 0;
			local13 = -1;
			arg1.anInt6120 = -1;
			arg1.anInt6087 = 0;
			arg1.anInt6062 = arg1.anIntArray536[0] * 128 + arg1.method4763() * 64;
			arg1.anInt6061 = arg1.anIntArray537[0] * 128 + arg1.method4763() * 64;
			arg1.method4760();
		}
		if (arg1 == Static375.aClass6_Sub2_Sub1_Sub1_3 && (arg1.anInt6062 < 1536 || arg1.anInt6061 < 1536 || arg1.anInt6062 >= Static126.anInt2569 * 128 - 1536 || Static190.anInt3697 * 128 - 1536 <= arg1.anInt6061)) {
			local15 = 0;
			arg1.anInt6087 = 0;
			arg1.anInt6105 = 0;
			arg1.anInt6120 = -1;
			arg1.anInt6084 = -1;
			arg1.anInt6068 = -1;
			local13 = -1;
			arg1.anInt6062 = arg1.anIntArray536[0] * 128 + arg1.method4763() * 64;
			arg1.anInt6061 = arg1.anIntArray537[0] * 128 + arg1.method4763() * 64;
			arg1.method4760();
		}
		@Pc(223) int local223 = Static50.method1033(arg1);
		Static202.method2934(local13, local223, arg1, local15);
		Static285.method3979(arg1);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4045(@OriginalArg(0) Class30 arg0) {
		if (Static346.aBoolean427) {
			Static147.method2182(arg0);
		} else {
			Static437.method5650(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!rk;IBILclient!eu;ILclient!bp;I)V")
	public static void method4046(@OriginalArg(0) Class6_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub2_Sub1_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class4_Sub44 local11 = new Class4_Sub44();
		local11.anInt7348 = arg2 << 7;
		local11.anInt7342 = arg1 << 7;
		local11.anInt7344 = arg6;
		if (arg3 != null) {
			local11.aClass71_1 = arg3;
			@Pc(32) int local32 = arg3.anInt2169;
			@Pc(35) int local35 = arg3.anInt2198;
			if (arg4 == 1 || arg4 == 3) {
				local35 = arg3.anInt2169;
				local32 = arg3.anInt2198;
			}
			local11.anInt7346 = arg3.anInt2157;
			local11.anInt7347 = arg3.anInt2204 << 7;
			local11.anInt7341 = arg1 + local32 << 7;
			local11.anInt7339 = arg2 + local35 << 7;
			local11.anInt7338 = arg3.anInt2178;
			local11.anInt7349 = arg3.anInt2185;
			local11.anInt7343 = arg3.anInt2160;
			local11.anIntArray643 = arg3.anIntArray139;
			if (arg3.anIntArray138 != null) {
				local11.aBoolean487 = true;
				local11.method5665();
			}
			if (local11.anIntArray643 != null) {
				local11.anInt7352 = (int) (Math.random() * (double) (local11.anInt7346 - local11.anInt7338)) + local11.anInt7338;
			}
			Static177.aClass258_26.method5526(local11);
		} else if (arg0 != null) {
			local11.aClass6_Sub2_Sub1_Sub2_1 = arg0;
			@Pc(173) Class243 local173 = arg0.aClass243_1;
			if (local173.anIntArray613 != null) {
				local11.aBoolean487 = true;
				local173 = local173.method5337(Static155.aClass149_1);
			}
			if (local173 != null) {
				local11.anInt7339 = local173.anInt6902 + arg2 << 7;
				local11.anInt7341 = local173.anInt6902 + arg1 << 7;
				local11.anInt7349 = Static217.method3084(arg0);
				local11.anInt7343 = local173.anInt6897;
				local11.anInt7347 = local173.anInt6881 << 7;
			}
			Static208.aClass258_31.method5526(local11);
		} else if (arg5 != null) {
			local11.aClass6_Sub2_Sub1_Sub1_4 = arg5;
			local11.anInt7341 = arg5.method4763() + arg1 << 7;
			local11.anInt7339 = arg5.method4763() + arg2 << 7;
			local11.anInt7349 = Static328.method4469(arg5);
			local11.anInt7343 = arg5.anInt982;
			local11.anInt7347 = arg5.anInt978 << 7;
			Static279.aClass196_25.method4474((long) arg5.anInt6078, local11);
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[J[III)V")
	public static void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg0; local59++) {
			if (arg1[local59] < (long) (local59 & local57) + local25) {
				@Pc(80) long local80 = arg1[local59];
				arg1[local59] = arg1[local21];
				arg1[local21] = local80;
				@Pc(94) int local94 = arg2[local59];
				arg2[local59] = arg2[local21];
				arg2[local21++] = local94;
			}
		}
		arg1[arg0] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg0] = arg2[local21];
		arg2[local21] = local39;
		method4047(local21 - 1, arg1, arg2, arg3);
		method4047(arg0, arg1, arg2, local21 + 1);
	}
}
