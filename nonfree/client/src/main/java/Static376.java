import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!cba;")
	public static Class45 aClass45_154;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_77 = new Class73();

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	public static int anInt9581 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!tl;I)Z")
	public static boolean method7934(@OriginalArg(0) Class285 arg0) {
		return Static497.aClass285_6 == arg0 || Class12_Sub13_Sub2.lb == arg0 || Static66.aClass285_1 == arg0 || arg0 == Static401.aClass285_5;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
	public static void method7936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static291.method4732(arg1)) {
			Static201.method3806(arg0, Static71.aClass198ArrayArray1[arg1]);
		}
	}
}
