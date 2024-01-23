import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "Lclient!gd;")
	public static Class2_Sub3_Sub8 aClass2_Sub3_Sub8_5;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!oe;")
	public static Class72 aClass72_149;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!nh;")
	public static Class2_Sub23 aClass2_Sub23_5;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
	public static int anInt2348;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
	public static int anInt2351;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_506 = Static199.method3560("Abbrechen");

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)I")
	public static int method1847() {
		return Static75.anInt1617;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIZIIBI)Z")
	public static boolean method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (Static31.aClass5_Sub2_Sub2_1.anInt1832 == 2) {
			return Static26.method347(arg2, arg10, arg1, arg3, arg9, arg5, arg6, arg7, arg4, arg8, arg0);
		} else if (Static31.aClass5_Sub2_Sub2_1.anInt1832 > 2) {
			return Static108.method1876(arg7, arg4, arg0, Static31.aClass5_Sub2_Sub2_1.anInt1832, arg8, arg1, arg2, arg10, arg3, arg6, arg5, arg9);
		} else {
			return Static46.method623(arg0, arg10, arg4, arg1, arg2, arg5, arg3, arg6, arg7, arg9, arg8);
		}
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public static void method1851() {
		Static70.aClass53_11.method1797();
	}
}
