import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!ip;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!mu;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	public static int anInt1776 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
	public static void method1444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static216.aClass1_Sub1_1.anInt4509 * arg1 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static124.method1752(arg0, local10, Static183.aClass243_101);
			Static180.aBoolean201 = true;
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)I")
	public static int method1450(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(31) int local31 = (local13 & 0x33333333) + (local13 >>> 2 & 0xB3333333);
		@Pc(39) int local39 = local31 + (local31 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIBII)V")
	public static void method1455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg1;
		@Pc(18) int local18 = arg5 - arg6;
		for (@Pc(20) int local20 = arg1; local20 < local9; local20++) {
			Static291.method3606(arg3, Static133.anIntArrayArray15[local20], arg0, arg4);
		}
		@Pc(42) int local42 = arg4 + arg6;
		for (@Pc(44) int local44 = arg5; local44 > local18; local44--) {
			Static291.method3606(arg3, Static133.anIntArrayArray15[local44], arg0, arg4);
		}
		@Pc(63) int local63 = arg3 - arg6;
		for (@Pc(65) int local65 = local9; local65 <= local18; local65++) {
			@Pc(71) int[] local71 = Static133.anIntArrayArray15[local65];
			Static291.method3606(local42, local71, arg0, arg4);
			Static291.method3606(local63, local71, arg2, local42);
			Static291.method3606(arg3, local71, arg0, local63);
		}
	}
}
