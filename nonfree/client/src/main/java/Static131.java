import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ji", name = "Nb", descriptor = "I")
	public static volatile int anInt3039 = 0;

	@OriginalMember(owner = "client!ji", name = "Tb", descriptor = "I")
	public static int anInt3045 = 0;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)V")
	public static void method2254() {
		Static226.aClass89_36.method2265();
		Static95.aClass89_12.method2265();
		Static22.aClass89_4.method2265();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBLclient!th;I)Z")
	public static boolean method2257(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg1.method4058(arg0, arg2);
		if (local14 == null) {
			return false;
		} else {
			Static251.method4179(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)I")
	public static int method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 < arg2 ? arg2 : arg0 >= arg1 ? arg1 : arg0;
	}
}
