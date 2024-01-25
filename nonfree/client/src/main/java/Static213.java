import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "Lclient!ga;")
	public static Class111 aClass111_47;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "Lclient!ga;")
	public static Class111 aClass111_48;

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "[I")
	public static final int[] anIntArray243 = new int[13];

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)Z")
	public static boolean method3549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIII)V")
	public static void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class20_Sub2_Sub1 local13 = local7.aClass20_Sub2_Sub1_1;
		@Pc(16) Class20_Sub2_Sub1 local16 = local7.aClass20_Sub2_Sub1_2;
		if (local13 != null) {
			local13.aShort70 = (short) (local13.aShort70 * arg3 / (0x10 << Static378.anInt6665 - 7));
			local13.aShort71 = (short) (local13.aShort71 * arg3 / (0x10 << Static378.anInt6665 - 7));
		}
		if (local16 != null) {
			local16.aShort70 = (short) (local16.aShort70 * arg3 / (0x10 << Static378.anInt6665 - 7));
			local16.aShort71 = (short) (local16.aShort71 * arg3 / (0x10 << Static378.anInt6665 - 7));
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(JJ)J")
	public static long method3551(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(IIII)V")
	public static void method3552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 + Static376.anInt6631;
		@Pc(13) int local13 = Static24.anInt674 + arg1;
		if (Static118.aClass293ArrayArrayArray14 == null || arg0 < 0 || arg1 < 0 || arg0 >= Static500.anInt6888 || Static573.anInt9325 <= arg1 || !Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) && arg2 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116) {
			return;
		}
		@Pc(63) long local63 = (long) (arg2 << 28 | local13 << 14 | local9);
		@Pc(69) Class1_Sub37 local69 = (Class1_Sub37) Static186.aClass356_13.method7796(local63);
		if (local69 == null) {
			Static227.method3759(arg2, arg0, arg1);
			return;
		}
		@Pc(83) Class1_Sub34 local83 = (Class1_Sub34) local69.aClass361_66.method7854();
		if (local83 == null) {
			Static227.method3759(arg2, arg0, arg1);
			return;
		}
		@Pc(97) Class20_Sub2_Sub5_Sub1 local97 = (Class20_Sub2_Sub5_Sub1) Static227.method3759(arg2, arg0, arg1);
		if (local97 == null) {
			local97 = new Class20_Sub2_Sub5_Sub1(arg0 << 9, Static20.aClass17Array1[arg2].method6642(arg0, arg1), arg1 << 9, arg2, arg2);
		} else {
			local97.anInt3938 = local97.anInt3951 = -1;
		}
		local97.anInt3936 = local83.anInt6204;
		local97.anInt3934 = local83.anInt6203;
		label56: while (true) {
			@Pc(140) Class1_Sub34 local140 = (Class1_Sub34) local69.aClass361_66.method7853();
			if (local140 == null) {
				break;
			}
			if (local97.anInt3934 != local140.anInt6203) {
				local97.anInt3938 = local140.anInt6203;
				local97.anInt3941 = local140.anInt6204;
				while (true) {
					@Pc(165) Class1_Sub34 local165 = (Class1_Sub34) local69.aClass361_66.method7853();
					if (local165 == null) {
						break label56;
					}
					if (local97.anInt3934 != local165.anInt6203 && local97.anInt3938 != local165.anInt6203) {
						local97.anInt3951 = local165.anInt6203;
						local97.anInt3935 = local165.anInt6204;
					}
				}
			}
		}
		@Pc(205) int local205 = Static122.method2103(arg2, (arg0 << 9) + 256, (arg1 << 9) + 256);
		local97.aByte116 = (byte) arg2;
		local97.anInt8795 = arg1 << 9;
		local97.anInt8796 = arg0 << 9;
		local97.anInt8790 = local205;
		local97.aByte117 = (byte) arg2;
		if (Static70.method1506(arg1, arg0)) {
			local97.aByte117++;
		}
		Static347.method7778(arg2, arg0, arg1, local205, local97);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
	public static void method3553() {
		Static406.aClass326_38.method7230();
	}
}
