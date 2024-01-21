import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_8;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1841 = Static118.method2249("Untersuchen");

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	public static int anInt3309 = 100;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1842 = Static118.method2249("underlay)3dat");

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
	public static final short[] aShortArray51 = new short[] { 50, 38, 5, 48, 36, 30, 32, 31 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIILclient!wg;IJ)Z")
	public static boolean method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static191.method3153(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZ)I")
	public static int method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method2535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static71.anInt1744 <= arg7 && arg7 <= Static23.anInt685 && arg2 >= Static71.anInt1744 && arg2 <= Static23.anInt685 && arg5 >= Static71.anInt1744 && arg5 <= Static23.anInt685 && Static71.anInt1744 <= arg1 && Static23.anInt685 >= arg1 && arg8 >= Static206.anInt4385 && anInt3309 >= arg8 && arg0 >= Static206.anInt4385 && arg0 <= anInt3309 && Static206.anInt4385 <= arg3 && anInt3309 >= arg3 && Static206.anInt4385 <= arg4 && arg4 <= anInt3309) {
			Static145.method2624(arg6, arg8, arg1, arg2, arg4, arg0, arg5, arg7, arg3);
		} else {
			Static28.method562(arg1, arg0, arg8, arg6, arg7, arg3, arg5, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIILclient!wg;IJZ)Z")
	public static boolean method2536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static191.method3153(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
