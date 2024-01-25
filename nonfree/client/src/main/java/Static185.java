import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt3759;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!aj;")
	public static Class10 aClass10_33 = new Class10(64);

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
	public static final int[] anIntArray512 = new int[14];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static264.method4436(arg1)) {
			Static45.method1035(Static298.aClass26ArrayArray1[arg1], -1, arg2, arg3, arg6, arg0, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!gd;III)J")
	public static long method3390(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(23) Class122 local23 = Static245.method4227(arg0.method5362());
		@Pc(44) long local44 = (long) ((arg0.method5361() | 0x10000) << 14 | arg1 << 7 | arg2 | arg0.method5360() << 20);
		if (local23.anInt3560 == 0) {
			local44 |= local17;
		}
		if (local23.anInt3524 == 1) {
			local44 |= local13;
		}
		if (local23.aBoolean263) {
			local44 |= local15;
		}
		return local44 | (long) arg0.method5362() << 32;
	}
}
