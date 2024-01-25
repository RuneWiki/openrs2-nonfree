import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!pl;")
	public static Class259 aClass259_159;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
	public static final int[] anIntArray618 = new int[8];

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[Lclient!vt;")
	public static Class351[] aClass351Array1 = new Class351[50];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V")
	public static void method7131() {
		Static418.aClass313_43.method6982(50);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!es;)Lclient!nn;")
	public static Class233 method7133(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(7) String local7 = arg0.method4324();
		@Pc(14) Class62 local14 = Static92.method1451()[arg0.method4325()];
		@Pc(23) Class279 local23 = Static90.method1419()[arg0.method4325()];
		@Pc(27) int local27 = arg0.method4334();
		@Pc(36) int local36 = arg0.method4334();
		@Pc(40) int local40 = arg0.method4325();
		@Pc(44) int local44 = arg0.method4325();
		@Pc(48) int local48 = arg0.method4325();
		@Pc(52) int local52 = arg0.method4294();
		@Pc(56) int local56 = arg0.method4294();
		@Pc(60) int local60 = arg0.method4307();
		@Pc(66) int local66 = arg0.method4307();
		@Pc(70) int local70 = arg0.method4307();
		return new Class233(local7, local14, local23, local27, local36, local40, local44, local48, local52, local56, local60, local66, local70);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!kp;I)V")
	public static void method7134(@OriginalArg(0) Class196 arg0) {
		if (Static470.anInt8027 == arg0.anInt5151) {
			Static295.aBooleanArray36[arg0.anInt5134] = true;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
	public static void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static216.method3478(arg0, arg1, arg2, arg3);
		} else if (Static553.anInt9074 <= arg0 - arg3 && arg0 + arg3 <= Static249.anInt4668 && arg1 - arg4 >= Static326.anInt6028 && arg1 + arg4 <= Static80.anInt1738) {
			Static497.method6946(arg4, arg3, arg2, arg1, arg0);
		} else {
			Static245.method3784(arg2, arg0, arg4, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
	public static int method7136(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public static void method7137() {
		Static82.anImage1 = null;
		Static24.aFont1 = null;
	}
}
