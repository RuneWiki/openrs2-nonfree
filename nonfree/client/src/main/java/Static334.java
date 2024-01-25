import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "Lclient!ac;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "[I")
	public static int[] anIntArray810;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "Lclient!rk;")
	public static Class180 aClass180_95;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!rk;Lclient!rk;I)I")
	public static int method5304(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method4562(Static199.anInt3921)) {
			local5++;
		}
		if (arg1.method4562(Static49.anInt1349)) {
			local5++;
		}
		if (arg1.method4562(Static233.anInt4630)) {
			local5++;
		}
		if (arg0.method4562(Static199.anInt3921)) {
			local5++;
		}
		if (arg0.method4562(Static49.anInt1349)) {
			local5++;
		}
		if (arg0.method4562(Static233.anInt4630)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	public static void method5305(@OriginalArg(1) int arg0) {
		@Pc(14) Class7_Sub1_Sub15 local14 = Static315.method5104(2, arg0);
		local14.method4788();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class7_Sub29 local10 = null;
		for (@Pc(15) Class7_Sub29 local15 = (Class7_Sub29) Static79.aClass74_9.method1793(); local15 != null; local15 = (Class7_Sub29) Static79.aClass74_9.method1798()) {
			if (arg2 == local15.anInt4632 && local15.anInt4647 == arg5 && arg6 == local15.anInt4639 && arg1 == local15.anInt4641) {
				local10 = local15;
				break;
			}
		}
		if (local10 == null) {
			local10 = new Class7_Sub29();
			local10.anInt4632 = arg2;
			local10.anInt4647 = arg5;
			local10.anInt4639 = arg6;
			local10.anInt4641 = arg1;
			Static253.method4301(local10);
			Static79.aClass74_9.method1802(local10);
		}
		local10.anInt4640 = arg8;
		local10.anInt4629 = arg3;
		local10.anInt4643 = arg0;
		local10.anInt4631 = arg4;
		local10.anInt4635 = arg7;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)I")
	public static int method5307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}
}
