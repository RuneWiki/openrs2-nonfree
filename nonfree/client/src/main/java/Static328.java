import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_13 = new Class165(0, 2, 2, 1);

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "Lclient!dv;")
	public static final Class63 aClass63_6 = new Class63();

	@OriginalMember(owner = "client!ps", name = "G", descriptor = "Lclient!am;")
	public static final Class14 aClass14_38 = new Class14();

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
	public static void method4316() {
		for (@Pc(7) int local7 = 0; local7 < Static369.aClass160ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static369.aClass160ArrayArray1[local7].length; local11++) {
				Static369.aClass160ArrayArray1[local7][local11] = Static147.aClass160_1;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZC)Z")
	public static boolean method4317(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public static void method4318(@OriginalArg(1) int arg0) {
		Static172.anInt2847 = arg0;
		Static40.aClass77_8.method1395();
	}
}
