import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_20 = new Class73(34, 4);

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_21 = new Class73(69, 6);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
	public static boolean method1120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static421.method6084(arg1, arg0) | (arg0 & 0x60000) != 0 || Static414.method5967(arg1, arg0);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public static void method1121() {
		Static253.aBoolean348 = true;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
	public static void method1123() {
		Static421.anInt7365 = 0;
		Static182.aClass361_23.method7842();
		Static587.aBoolean734 = false;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public static void method1124() {
		Static231.anInt4727 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static439.aClass6_Sub21Array1[local9] = null;
			Static308.aByteArray66[local9] = 1;
			Static412.aClass302Array1[local9] = null;
		}
	}
}
