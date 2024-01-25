import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!q;")
	public static Class255 aClass255_6;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!pe;ZLclient!pe;Lclient!pe;Lclient!pe;)V")
	public static void method3378(@OriginalArg(0) Class254 arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) Class254 arg3) {
		Static388.aClass254_102 = arg0;
		Static259.aClass254_77 = arg3;
		Static543.aClass254_130 = arg1;
		Static108.aClass305ArrayArray1 = new Class305[Static543.aClass254_130.method6421()][];
		Static318.aBooleanArray27 = new boolean[Static543.aClass254_130.method6421()];
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZIIII)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg0; local3++) {
			Static426.method6794(arg4, Static333.anIntArrayArray56[local3], arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBIIILclient!ji;)Lclient!ch;")
	public static Class11_Sub2_Sub1 method3381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15_Sub3 arg4) {
		if (arg4.aBoolean457 || Static282.method4863(arg0) && Static282.method4863(arg1)) {
			return new Class11_Sub2_Sub1(arg4, 3553, arg3, arg2, arg0, arg1, true);
		} else if (arg4.aBoolean446) {
			return new Class11_Sub2_Sub1(arg4, 34037, arg3, arg2, arg0, arg1, true);
		} else {
			return new Class11_Sub2_Sub1(arg4, arg3, arg2, arg0, arg1, Static178.method3152(arg0), Static178.method3152(arg1), true);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
