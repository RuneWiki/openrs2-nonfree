import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!kv;Lclient!av;Lclient!fb;IIIII)V")
	public static void method1523(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class12_Sub2_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) Class12_Sub2_Sub2_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class14_Sub31 local7 = new Class14_Sub31();
		local7.anInt5968 = arg4 << 9;
		local7.anInt5970 = arg6;
		local7.anInt5973 = arg3 << 9;
		if (arg0 != null) {
			local7.aClass203_1 = arg0;
			@Pc(32) int local32 = arg0.anInt6065;
			@Pc(35) int local35 = arg0.anInt6028;
			if (arg5 == 1 || arg5 == 3) {
				local32 = arg0.anInt6028;
				local35 = arg0.anInt6065;
			}
			local7.anInt5967 = arg0.anInt6056 << 9;
			local7.anInt5969 = arg3 + local35 << 9;
			local7.aBoolean407 = arg0.aBoolean424;
			local7.anInt5962 = arg0.anInt6033;
			local7.anInt5964 = arg0.anInt6036;
			local7.anInt5958 = arg0.anInt6040;
			local7.aBoolean406 = arg0.aBoolean419;
			local7.anIntArray436 = arg0.anIntArray443;
			local7.anInt5975 = arg0.anInt6044;
			local7.anInt5971 = arg4 + local32 << 9;
			local7.anInt5966 = arg0.anInt6012;
			local7.anInt5974 = arg0.lb;
			local7.anInt5965 = arg0.anInt6055 << 9;
			if (arg0.anIntArray440 != null) {
				local7.aBoolean405 = true;
				local7.method4985();
			}
			if (local7.anIntArray436 != null) {
				local7.anInt5959 = (int) ((double) (local7.anInt5962 - local7.anInt5966) * Math.random()) + local7.anInt5966;
			}
			Static40.aClass262_7.method6314(local7);
		} else if (arg1 != null) {
			local7.aClass12_Sub2_Sub2_Sub1_Sub1_1 = arg1;
			@Pc(155) Class283 local155 = arg1.aClass283_1;
			if (local155.anIntArray638 != null) {
				local7.aBoolean405 = true;
				local155 = local155.method7129(Static595.aClass241_1);
			}
			if (local155 != null) {
				local7.anInt5969 = local155.anInt8617 + arg3 << 9;
				local7.anInt5971 = local155.anInt8617 + arg4 << 9;
				local7.anInt5975 = Static55.method1185(arg1);
				local7.anInt5958 = local155.anInt8623;
				local7.anInt5974 = local155.anInt8611;
				local7.anInt5964 = local155.anInt8636;
				local7.anInt5967 = local155.anInt8612 << 9;
				local7.aBoolean407 = local155.aBoolean614;
				local7.anInt5965 = local155.anInt8624 << 9;
			}
			Static41.aClass262_5.method6314(local7);
		} else if (arg2 != null) {
			local7.aClass12_Sub2_Sub2_Sub1_Sub2_1 = arg2;
			local7.anInt5971 = arg2.method2422() + arg4 << 9;
			local7.anInt5969 = arg3 + arg2.method2422() << 9;
			local7.anInt5975 = Static368.method5530(arg2);
			local7.anInt5964 = 256;
			local7.aBoolean407 = arg2.aBoolean228;
			local7.anInt5965 = 0;
			local7.anInt5967 = arg2.anInt2976 << 9;
			local7.anInt5974 = 256;
			local7.anInt5958 = arg2.anInt2992;
			Static587.aClass187_83.method4077((long) arg2.anInt2945, local7);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III[B[BIIII)V")
	public static void method1528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg1++;
				arg2[local30] += arg3[arg5++];
				@Pc(42) int local42 = arg1++;
				arg2[local42] += arg3[arg5++];
				@Pc(54) int local54 = arg1++;
				arg2[local54] += arg3[arg5++];
				@Pc(66) int local66 = arg1++;
				arg2[local66] += arg3[arg5++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg1++;
				arg2[local30] += arg3[arg5++];
			}
			arg5 += arg4;
			arg1 += arg0;
		}
	}
}
