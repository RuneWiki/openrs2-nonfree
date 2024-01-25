import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!bc;")
	public static final Class22 aClass22_8 = new Class22();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZIII)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static97.method1633(arg1, Static272.anInt4750, Static26.anInt345);
		@Pc(17) int local17 = Static97.method1633(arg0, Static272.anInt4750, Static26.anInt345);
		@Pc(23) int local23 = Static97.method1633(arg2, Static365.anInt6140, Static221.anInt3917);
		@Pc(29) int local29 = Static97.method1633(arg4, Static365.anInt6140, Static221.anInt3917);
		@Pc(37) int local37 = Static97.method1633(arg1 + arg3, Static272.anInt4750, Static26.anInt345);
		@Pc(46) int local46 = Static97.method1633(arg0 - arg3, Static272.anInt4750, Static26.anInt345);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static349.method5265(local23, local29, arg5, Static325.anIntArrayArray50[local48]);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static349.method5265(local23, local29, arg5, Static325.anIntArrayArray50[local68]);
		}
		@Pc(99) int local99 = Static97.method1633(arg3 + arg2, Static365.anInt6140, Static221.anInt3917);
		@Pc(108) int local108 = Static97.method1633(arg4 - arg3, Static365.anInt6140, Static221.anInt3917);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static325.anIntArrayArray50[local110];
			Static349.method5265(local23, local99, arg5, local116);
			Static349.method5265(local99, local108, arg6, local116);
			Static349.method5265(local108, local29, arg5, local116);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZII)Z")
	public static boolean method5237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static13.aByteArrayArrayArray17[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static13.aByteArrayArrayArray17[arg2][arg3][arg1] & 0x10) == 0) {
			return Static300.method4642(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}
}
