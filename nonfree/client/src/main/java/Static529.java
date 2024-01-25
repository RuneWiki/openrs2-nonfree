import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "[Lclient!pt;")
	public static Class292[] aClass292Array50;

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
	public static int anInt2658 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIZI)I")
	public static int method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg1;
			arg1 = local10;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return 7 + 1 - arg3 - arg1;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(32) int local32;
			for (@Pc(28) int local28 = local10; local28 < 0; local28++) {
				local32 = arg0++;
				arg7[local32] += arg1[arg6++];
				@Pc(44) int local44 = arg0++;
				arg7[local44] += arg1[arg6++];
				@Pc(56) int local56 = arg0++;
				arg7[local56] += arg1[arg6++];
				@Pc(68) int local68 = arg0++;
				arg7[local68] += arg1[arg6++];
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local32 = arg0++;
				arg7[local32] += arg1[arg6++];
			}
			arg0 += arg3;
			arg6 += arg4;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!vk;Z)V")
	public static void method2538(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static611.aClass163_65.method3639(); local10 != null; local10 = (Class4_Sub23) Static611.aClass163_65.method3640()) {
			if (arg0 == local10.aClass3_Sub1_Sub2_Sub2_Sub2_1) {
				if (local10.aClass4_Sub3_Sub3_2 != null) {
					Static162.aClass4_Sub3_Sub5_3.method7723(local10.aClass4_Sub3_Sub3_2);
					local10.aClass4_Sub3_Sub3_2 = null;
				}
				local10.method9000();
				return;
			}
		}
	}
}
