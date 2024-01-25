import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!qaa;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Lclient!fia;")
	public static Class45 aClass45_15;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public static int anInt4871;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "[Lclient!jc;")
	public static final Class14_Sub21[] aClass14_Sub21Array1 = new Class14_Sub21[2048];

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_137 = new Class160(74, 6);

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt4868 = -1;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
	public static boolean method4351(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 12 || arg0 == 10;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ka;IIII)Lclient!th;")
	public static Class348 method4352(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class348(arg3, arg2, arg1, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}
}
