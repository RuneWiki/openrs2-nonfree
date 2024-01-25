import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lclient!bk;")
	public static final Class5_Sub1[] aClass5_Sub1Array1 = new Class5_Sub1[2048];

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[C")
	public static final char[] aCharArray22 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[I")
	public static final int[] anIntArray319 = new int[1000];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method3913() {
		@Pc(5) Class66 local5 = Static222.aClass66_76;
		synchronized (Static222.aClass66_76) {
			Static222.aClass66_76.method1933();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIZIBIII)Z")
	public static boolean method3914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static345.method5685(arg7, Static85.aClass25_Sub1_Sub1_Sub1_1.method4646(), arg4, arg6, arg2, Static117.aClass49Array1[Static156.anInt3123], arg8, arg9, arg3, arg1, arg5, Static287.anIntArray414, arg0, Static232.anIntArray330);
		if (local24 < 1) {
			return false;
		}
		Static79.anInt1909 = Static287.anIntArray414[local24 - 1];
		Static238.anInt4612 = Static232.anIntArray330[local24 - 1];
		Static301.aBoolean447 = false;
		Static301.method5304();
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIILclient!tc;IILclient!en;)V")
	public static void method3916(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class91 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class59 arg5) {
		if (arg0) {
			Static288.aClass54_16.method5569((Static17.anInt5991 - Static288.aClass54_16.method5560()) / 2, (Static246.anInt4801 - Static288.aClass54_16.method5576()) / 2);
			Static60.aClass54_3.method5569((Static17.anInt5991 - Static60.aClass54_3.method5560()) / 2, 18);
		}
		arg2.method5308(Static246.anInt4801 / 2 - 26, -1, ~Static298.anInt5725 == -2 ? Static341.aString366 : Static35.aString55, arg4, Static17.anInt5991 / 2);
		@Pc(55) int local55 = Static246.anInt4801 / 2 - 18;
		arg5.method4851(Static17.anInt5991 / 2 - 152, local55, 304, 34, arg1, 0);
		arg5.method4851(Static17.anInt5991 / 2 - 151, local55 + 1, 302, 32, 0, 0);
		arg5.method4877(Static17.anInt5991 / 2 - 150, local55 + 2, Static158.anInt3137 * 3, 30, arg3, 0);
		arg5.method4877(Static17.anInt5991 / 2 + Static158.anInt3137 * 3 - 150, local55 + 2, 300 - Static158.anInt3137 * 3, 30, 0, 0);
		arg2.method5308(Static246.anInt4801 / 2 + 4, -1, Static130.aString173, arg4, Static17.anInt5991 / 2);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	public static void method3917(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub9_Sub16 local16 = Static239.method4052(5, arg0);
		local16.method4138();
	}
}
