import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!r;")
	public static Class197 aClass197_86;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!hc;IIIII)V", line = 64)
	public static void method5537(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7100 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static48.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class2_Sub26_Sub1 local35 = Static283.aClass2_Sub26_Sub1Array2[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7100; local37++) {
							if (arg0.aClass2_Sub26_Sub1Array3[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub26_Sub1Array3[arg0.anInt7100++] = local35;
						if (arg0.anInt7100 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7100; local7 < 4; local7++) {
			arg0.aClass2_Sub26_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)[Lclient!s;", line = 320)
	public static Class210[] method5540() {
		return new Class210[] { Class2_Sub18.aClass210_7, Class2_Sub3_Sub25.lb, Class78_Sub1.aClass210_4, Class79.aClass210_5, Class58.aClass210_3, OutputStream_Sub1.aClass210_10, Class16.aClass210_1, Class140.aClass210_9, Class2_Sub3_Sub17.aClass210_8, Class242.aClass210_15, Class221.aClass210_16, Class24.aClass210_2, Class191.aClass210_11, Class98.aClass210_6, Class11_Sub5_Sub5.aClass210_13 };
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I", line = 333)
	public static int method5541(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIBI)V", line = 346)
	public static void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 128 || arg1 < 128 || (Class241.anInt7020 - 2) * 128 < arg5 || (OutputStream_Sub1.anInt4442 - 2) * 128 < arg1) {
			Class153.anIntArray231[0] = Class153.anIntArray231[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static360.method6033(arg5, arg1, arg2) - arg0;
		Static72.aClass14_3.method3937(arg3, 0, 0);
		Static177.aClass19_8.method2898(Static72.aClass14_3);
		Static177.aClass19_8.method2904(arg5, local49, arg1, Class153.anIntArray231);
		Static72.aClass14_3.method3937(-arg3, 0, 0);
		Static177.aClass19_8.method2898(Static72.aClass14_3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!nh;I)V", line = 374)
	public static void method5543(@OriginalArg(0) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(19) Class2_Sub19 local19 = (Class2_Sub19) Class160.aClass4_86.method90((long) arg0.anInt4610);
		if (local19 == null) {
			Static197.method3725(null, arg0.anIntArray317[0], 0, arg0, null, arg0.anIntArray316[0], arg0.aByte78);
		} else {
			local19.method2942();
		}
	}
}
