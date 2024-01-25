import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!fs;")
	public static Class76 aClass76_90;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt6499;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public static int anInt6496 = 0;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
	public static final int[] anIntArray497 = new int[2048];

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "[Lclient!jq;")
	public static final Class122[] aClass122Array1 = new Class122[4];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
	public static void method5094(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) Class4_Sub8 local12 = (Class4_Sub8) Static281.aClass183_34.method4140(); local12 != null; local12 = (Class4_Sub8) Static281.aClass183_34.method4144()) {
			if (local12.aClass4_Sub15_Sub3_2 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(local12.aClass4_Sub15_Sub3_2);
				local12.aClass4_Sub15_Sub3_2 = null;
			}
			if (local12.aClass4_Sub15_Sub3_1 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(local12.aClass4_Sub15_Sub3_1);
				local12.aClass4_Sub15_Sub3_1 = null;
			}
			local12.method5684();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(58) Class4_Sub8 local58 = (Class4_Sub8) Static143.aClass183_20.method4140(); local58 != null; local58 = (Class4_Sub8) Static143.aClass183_20.method4144()) {
			if (local58.aClass4_Sub15_Sub3_2 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(local58.aClass4_Sub15_Sub3_2);
				local58.aClass4_Sub15_Sub3_2 = null;
			}
			local58.method5684();
		}
		for (@Pc(85) Class4_Sub8 local85 = (Class4_Sub8) Static341.aClass102_38.method2705(); local85 != null; local85 = (Class4_Sub8) Static341.aClass102_38.method2704()) {
			if (local85.aClass4_Sub15_Sub3_2 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(local85.aClass4_Sub15_Sub3_2);
				local85.aClass4_Sub15_Sub3_2 = null;
			}
			local85.method5684();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!fd;I[IZII)Lclient!ps;")
	public static Class6_Sub1_Sub1 method5095(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean213 || Static424.method5413(arg3) && Static424.method5413(arg1)) {
			return new Class6_Sub1_Sub1(arg0, 3553, arg3, arg1, false, arg2);
		} else if (arg0.aBoolean207) {
			return new Class6_Sub1_Sub1(arg0, 34037, arg3, arg1, false, arg2);
		} else {
			return new Class6_Sub1_Sub1(arg0, arg3, arg1, Static370.method4949(arg3), Static370.method4949(arg1), arg2);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I")
	public static int method5096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.anInt3429 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(24) int local24 = Integer.MAX_VALUE;
		@Pc(29) int local29 = arg0 - Static148.anInt5732;
		@Pc(34) int local34 = arg1 - Static148.anInt5724;
		for (@Pc(39) Class4_Sub3 local39 = (Class4_Sub3) Static148.aClass183_41.method4140(); local39 != null; local39 = (Class4_Sub3) Static148.aClass183_41.method4144()) {
			if (arg2 == local39.anInt234) {
				@Pc(48) int local48 = local39.anInt233;
				@Pc(51) int local51 = local39.anInt228;
				@Pc(61) int local61 = Static148.anInt5732 + local48 << 14 | Static148.anInt5724 + local51;
				@Pc(80) int local80 = (local34 - local51) * (local34 + -local51) + (local29 - local48) * (-local48 + local29);
				if (local14 < 0 || local24 > local80) {
					local14 = local61;
					local24 = local80;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III[B)[B")
	public static byte[] method5097(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static459.method3330(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBI[I[J)V")
	public static void method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg0 + arg1) / 2;
		@Pc(13) int local13 = arg0;
		@Pc(17) long local17 = arg3[local11];
		arg3[local11] = arg3[arg1];
		arg3[arg1] = local17;
		@Pc(31) int local31 = arg2[local11];
		arg2[local11] = arg2[arg1];
		arg2[arg1] = local31;
		@Pc(49) int local49 = local17 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg0; local51 < arg1; local51++) {
			if (local17 + (long) (local49 & local51) > arg3[local51]) {
				@Pc(72) long local72 = arg3[local51];
				arg3[local51] = arg3[local13];
				arg3[local13] = local72;
				@Pc(86) int local86 = arg2[local51];
				arg2[local51] = arg2[local13];
				arg2[local13++] = local86;
			}
		}
		arg3[arg1] = arg3[local13];
		arg3[local13] = local17;
		arg2[arg1] = arg2[local13];
		arg2[local13] = local31;
		method5098(arg0, local13 - 1, arg2, arg3);
		method5098(local13 + 1, arg1, arg2, arg3);
	}
}
